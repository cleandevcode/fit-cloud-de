package no.nordicsemi.android.dfu;

import a.b;
import a0.q;
import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import android.support.v4.media.d;
import android.util.Log;
import androidx.activity.e;
import androidx.activity.i;
import androidx.appcompat.widget.u0;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.UUID;
import no.nordicsemi.android.dfu.DfuCallback;
import no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException;
import no.nordicsemi.android.dfu.internal.exception.DfuException;
import no.nordicsemi.android.dfu.internal.exception.UploadAbortedException;
import no.nordicsemi.android.dfu.internal.scanner.BootloaderScannerFactory;
import w1.h;

@SuppressLint({"MissingPermission"})
/* loaded from: classes2.dex */
public abstract class BaseDfuImpl implements DfuService {
    public static final int INDICATIONS = 2;
    private static final int MAX_PACKET_SIZE_DEFAULT = 20;
    public static final int NOTIFICATIONS = 1;
    private static final String TAG = "DfuImpl";
    public boolean mAborted;
    private int mCurrentMtu;
    public int mError;
    public int mFileType;
    public InputStream mFirmwareStream;
    public BluetoothGatt mGatt;
    public int mImageSizeInBytes;
    public int mInitPacketSizeInBytes;
    public InputStream mInitPacketStream;
    public boolean mPaused;
    public DfuProgressInfo mProgressInfo;
    public boolean mRequestCompleted;
    public boolean mResetRequestSent;
    public DfuBaseService mService;
    public static final UUID GENERIC_ATTRIBUTE_SERVICE_UUID = new UUID(26392574038016L, -9223371485494954757L);
    public static final UUID SERVICE_CHANGED_UUID = new UUID(46200963207168L, -9223371485494954757L);
    public static final UUID CLIENT_CHARACTERISTIC_CONFIG = new UUID(45088566677504L, -9223371485494954757L);
    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
    public final Object mLock = new Object();
    public byte[] mReceivedData = null;
    public byte[] mBuffer = new byte[20];
    public boolean mConnected = true;

    /* loaded from: classes2.dex */
    public class BaseBluetoothGattCallback extends DfuCallback.DfuGattCallback {
        public BaseBluetoothGattCallback() {
            BaseDfuImpl.this = r1;
        }

        private String parse(byte[] bArr) {
            int length;
            if (bArr == null || (length = bArr.length) == 0) {
                return "";
            }
            char[] cArr = new char[(length * 3) - 1];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = bArr[i10] & 255;
                int i12 = i10 * 3;
                cArr[i12] = BaseDfuImpl.HEX_ARRAY[i11 >>> 4];
                cArr[i12 + 1] = BaseDfuImpl.HEX_ARRAY[i11 & 15];
                if (i10 != length - 1) {
                    cArr[i12 + 2] = '-';
                }
            }
            return new String(cArr);
        }

        private String phyToString(int i10) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return i.a("UNKNOWN (", i10, ")");
                    }
                    return "LE Coded";
                }
                return "LE 2M";
            }
            return "LE 1M";
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
            BaseDfuImpl baseDfuImpl = BaseDfuImpl.this;
            if (i10 == 0) {
                DfuBaseService dfuBaseService = baseDfuImpl.mService;
                StringBuilder a10 = d.a("Read Response received from ");
                a10.append(bluetoothGattCharacteristic.getUuid());
                a10.append(", value (0x): ");
                a10.append(parse(bluetoothGattCharacteristic));
                dfuBaseService.sendLogBroadcast(5, a10.toString());
                BaseDfuImpl.this.mReceivedData = bluetoothGattCharacteristic.getValue();
                BaseDfuImpl.this.mRequestCompleted = true;
            } else {
                baseDfuImpl.loge(u0.a("Characteristic read error: ", i10));
                BaseDfuImpl.this.mError = i10 | DfuBaseService.ERROR_CONNECTION_MASK;
            }
            BaseDfuImpl.this.notifyLock();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10) {
            if (i10 == 0) {
                if (BaseDfuImpl.CLIENT_CHARACTERISTIC_CONFIG.equals(bluetoothGattDescriptor.getUuid())) {
                    DfuBaseService dfuBaseService = BaseDfuImpl.this.mService;
                    StringBuilder a10 = d.a("Read Response received from descr.");
                    a10.append(bluetoothGattDescriptor.getCharacteristic().getUuid());
                    a10.append(", value (0x): ");
                    a10.append(parse(bluetoothGattDescriptor));
                    dfuBaseService.sendLogBroadcast(5, a10.toString());
                    if (BaseDfuImpl.SERVICE_CHANGED_UUID.equals(bluetoothGattDescriptor.getCharacteristic().getUuid())) {
                        BaseDfuImpl.this.mRequestCompleted = true;
                    } else {
                        BaseDfuImpl.this.loge("Unknown descriptor read");
                    }
                }
            } else {
                BaseDfuImpl.this.loge(u0.a("Descriptor read error: ", i10));
                BaseDfuImpl.this.mError = i10 | DfuBaseService.ERROR_CONNECTION_MASK;
            }
            BaseDfuImpl.this.notifyLock();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10) {
            DfuBaseService dfuBaseService;
            StringBuilder sb2;
            String str;
            if (i10 == 0) {
                if (BaseDfuImpl.CLIENT_CHARACTERISTIC_CONFIG.equals(bluetoothGattDescriptor.getUuid())) {
                    DfuBaseService dfuBaseService2 = BaseDfuImpl.this.mService;
                    StringBuilder a10 = d.a("Data written to descr.");
                    a10.append(bluetoothGattDescriptor.getCharacteristic().getUuid());
                    a10.append(", value (0x): ");
                    a10.append(parse(bluetoothGattDescriptor));
                    dfuBaseService2.sendLogBroadcast(5, a10.toString());
                    if (BaseDfuImpl.SERVICE_CHANGED_UUID.equals(bluetoothGattDescriptor.getCharacteristic().getUuid())) {
                        dfuBaseService = BaseDfuImpl.this.mService;
                        sb2 = new StringBuilder();
                        str = "Indications enabled for ";
                    } else {
                        dfuBaseService = BaseDfuImpl.this.mService;
                        sb2 = new StringBuilder();
                        str = "Notifications enabled for ";
                    }
                    sb2.append(str);
                    sb2.append(bluetoothGattDescriptor.getCharacteristic().getUuid());
                    dfuBaseService.sendLogBroadcast(1, sb2.toString());
                }
            } else {
                BaseDfuImpl.this.loge(u0.a("Descriptor write error: ", i10));
                BaseDfuImpl.this.mError = i10 | DfuBaseService.ERROR_CONNECTION_MASK;
            }
            BaseDfuImpl.this.notifyLock();
        }

        @Override // no.nordicsemi.android.dfu.DfuCallback.DfuGattCallback
        public void onDisconnected() {
            BaseDfuImpl baseDfuImpl = BaseDfuImpl.this;
            baseDfuImpl.mConnected = false;
            baseDfuImpl.notifyLock();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i10, int i11) {
            BaseDfuImpl baseDfuImpl = BaseDfuImpl.this;
            if (i11 == 0) {
                baseDfuImpl.mService.sendLogBroadcast(5, "MTU changed to: " + i10);
                int i12 = i10 + (-3);
                BaseDfuImpl baseDfuImpl2 = BaseDfuImpl.this;
                if (i12 > baseDfuImpl2.mBuffer.length) {
                    baseDfuImpl2.mBuffer = new byte[i12];
                }
                baseDfuImpl2.logi(u0.a("MTU changed to: ", i10));
            } else {
                baseDfuImpl.logw("Changing MTU failed: " + i11 + " (mtu: " + i10 + ")");
                if (i11 == 4 && BaseDfuImpl.this.mCurrentMtu > 23) {
                    int i13 = BaseDfuImpl.this.mCurrentMtu - 3;
                    BaseDfuImpl baseDfuImpl3 = BaseDfuImpl.this;
                    if (i13 > baseDfuImpl3.mBuffer.length) {
                        baseDfuImpl3.mBuffer = new byte[baseDfuImpl3.mCurrentMtu - 3];
                        BaseDfuImpl baseDfuImpl4 = BaseDfuImpl.this;
                        StringBuilder a10 = d.a("MTU restored to: ");
                        a10.append(BaseDfuImpl.this.mCurrentMtu);
                        baseDfuImpl4.logi(a10.toString());
                    }
                }
            }
            BaseDfuImpl baseDfuImpl5 = BaseDfuImpl.this;
            baseDfuImpl5.mRequestCompleted = true;
            baseDfuImpl5.notifyLock();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onPhyUpdate(BluetoothGatt bluetoothGatt, int i10, int i11, int i12) {
            if (i12 == 0) {
                DfuBaseService dfuBaseService = BaseDfuImpl.this.mService;
                StringBuilder a10 = d.a("PHY updated (TX: ");
                a10.append(phyToString(i10));
                a10.append(", RX: ");
                a10.append(phyToString(i11));
                a10.append(")");
                dfuBaseService.sendLogBroadcast(5, a10.toString());
                BaseDfuImpl baseDfuImpl = BaseDfuImpl.this;
                StringBuilder a11 = d.a("PHY updated (TX: ");
                a11.append(phyToString(i10));
                a11.append(", RX: ");
                baseDfuImpl.logi(e.b(a11, phyToString(i11), ")"));
                return;
            }
            BaseDfuImpl.this.logw(q.b(h.a("Updating PHY failed: ", i12, " (txPhy: ", i10, ", rxPhy: "), i11, ")"));
        }

        public String parse(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            return parse(bluetoothGattCharacteristic.getValue());
        }

        public String parse(BluetoothGattDescriptor bluetoothGattDescriptor) {
            return parse(bluetoothGattDescriptor.getValue());
        }
    }

    public BaseDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
        this.mService = dfuBaseService;
        this.mProgressInfo = dfuBaseService.mProgressInfo;
    }

    private boolean createBondApi18(BluetoothDevice bluetoothDevice) {
        try {
            Method method = bluetoothDevice.getClass().getMethod("createBond", new Class[0]);
            this.mService.sendLogBroadcast(0, "gatt.getDevice().createBond() (hidden)");
            return ((Boolean) method.invoke(bluetoothDevice, new Object[0])).booleanValue();
        } catch (Exception e10) {
            Log.w(TAG, "An exception occurred while creating bond", e10);
            return false;
        }
    }

    private boolean isServiceChangedCCCDEnabled() {
        BluetoothGattCharacteristic characteristic;
        BluetoothGattDescriptor descriptor;
        if (this.mConnected) {
            if (!this.mAborted) {
                BluetoothGatt bluetoothGatt = this.mGatt;
                BluetoothGattService service = bluetoothGatt.getService(GENERIC_ATTRIBUTE_SERVICE_UUID);
                if (service == null || (characteristic = service.getCharacteristic(SERVICE_CHANGED_UUID)) == null || (descriptor = characteristic.getDescriptor(CLIENT_CHARACTERISTIC_CONFIG)) == null) {
                    return false;
                }
                this.mRequestCompleted = false;
                this.mError = 0;
                logi("Reading Service Changed CCCD value...");
                this.mService.sendLogBroadcast(1, "Reading Service Changed CCCD value...");
                DfuBaseService dfuBaseService = this.mService;
                StringBuilder a10 = d.a("gatt.readDescriptor(");
                a10.append(descriptor.getUuid());
                a10.append(")");
                dfuBaseService.sendLogBroadcast(0, a10.toString());
                bluetoothGatt.readDescriptor(descriptor);
                try {
                    synchronized (this.mLock) {
                        while (true) {
                            if ((this.mRequestCompleted || !this.mConnected || this.mError != 0) && !this.mPaused) {
                                break;
                            }
                            this.mLock.wait();
                        }
                    }
                } catch (InterruptedException e10) {
                    loge("Sleeping interrupted", e10);
                }
                if (this.mConnected) {
                    if (this.mError == 0) {
                        if (descriptor.getValue() == null || descriptor.getValue().length != 2 || descriptor.getValue()[0] != BluetoothGattDescriptor.ENABLE_INDICATION_VALUE[0] || descriptor.getValue()[1] != BluetoothGattDescriptor.ENABLE_INDICATION_VALUE[1]) {
                            return false;
                        }
                        return true;
                    }
                    throw new DfuException("Unable to read Service Changed CCCD", this.mError);
                }
                throw new DeviceDisconnectedException("Unable to read Service Changed CCCD: device disconnected");
            }
            throw new UploadAbortedException();
        }
        throw new DeviceDisconnectedException("Unable to read Service Changed CCCD: device disconnected");
    }

    @Override // no.nordicsemi.android.dfu.DfuController
    public void abort() {
        this.mPaused = false;
        this.mAborted = true;
        notifyLock();
    }

    public boolean createBond() {
        BluetoothDevice device = this.mGatt.getDevice();
        this.mRequestCompleted = false;
        this.mService.sendLogBroadcast(1, "Starting pairing...");
        this.mService.sendLogBroadcast(0, "gatt.getDevice().createBond()");
        boolean createBond = device.createBond();
        try {
            synchronized (this.mLock) {
                while (createBond && !this.mRequestCompleted && !this.mAborted) {
                    this.mLock.wait();
                }
            }
        } catch (InterruptedException e10) {
            loge("Sleeping interrupted", e10);
        }
        return createBond;
    }

    public void enableCCCD(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
        String str;
        boolean z10;
        byte[] bArr;
        String str2;
        BluetoothGatt bluetoothGatt = this.mGatt;
        if (i10 == 1) {
            str = "notifications";
        } else {
            str = "indications";
        }
        if (this.mConnected) {
            if (!this.mAborted) {
                this.mReceivedData = null;
                this.mError = 0;
                BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(CLIENT_CHARACTERISTIC_CONFIG);
                if (descriptor.getValue() != null && descriptor.getValue().length == 2 && descriptor.getValue()[0] > 0 && descriptor.getValue()[1] == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                }
                logi(android.support.v4.media.a.a("Enabling ", str, "..."));
                DfuBaseService dfuBaseService = this.mService;
                StringBuilder a10 = androidx.activity.result.d.a("Enabling ", str, " for ");
                a10.append(bluetoothGattCharacteristic.getUuid());
                dfuBaseService.sendLogBroadcast(1, a10.toString());
                DfuBaseService dfuBaseService2 = this.mService;
                StringBuilder a11 = d.a("gatt.setCharacteristicNotification(");
                a11.append(bluetoothGattCharacteristic.getUuid());
                a11.append(", true)");
                dfuBaseService2.sendLogBroadcast(0, a11.toString());
                bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true);
                if (i10 == 1) {
                    bArr = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
                } else {
                    bArr = BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
                }
                descriptor.setValue(bArr);
                DfuBaseService dfuBaseService3 = this.mService;
                StringBuilder a12 = d.a("gatt.writeDescriptor(");
                a12.append(descriptor.getUuid());
                if (i10 == 1) {
                    str2 = ", value=0x01-00)";
                } else {
                    str2 = ", value=0x02-00)";
                }
                a12.append(str2);
                dfuBaseService3.sendLogBroadcast(0, a12.toString());
                bluetoothGatt.writeDescriptor(descriptor);
                try {
                    synchronized (this.mLock) {
                        while (true) {
                            if ((z10 || !this.mConnected || this.mError != 0) && !this.mPaused) {
                                break;
                            }
                            this.mLock.wait();
                            if (descriptor.getValue() != null && descriptor.getValue().length == 2 && descriptor.getValue()[0] > 0 && descriptor.getValue()[1] == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        }
                    }
                } catch (InterruptedException e10) {
                    loge("Sleeping interrupted", e10);
                }
                if (this.mConnected) {
                    if (this.mError == 0) {
                        return;
                    }
                    throw new DfuException(android.support.v4.media.a.a("Unable to set ", str, " state"), this.mError);
                }
                throw new DeviceDisconnectedException(android.support.v4.media.a.a("Unable to set ", str, " state: device disconnected"));
            }
            throw new UploadAbortedException();
        }
        throw new DeviceDisconnectedException(android.support.v4.media.a.a("Unable to set ", str, " state: device disconnected"));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(1:3)|(1:5)|6|(12:32|33|(1:35)|36|9|10|11|(2:13|(1:15)(1:16))|17|18|(3:24|(1:26)|27)|28)|8|9|10|11|(0)|17|18|(5:20|22|24|(0)|27)|28) */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0062 A[Catch: Exception -> 0x0075, TryCatch #1 {Exception -> 0x0075, blocks: (B:57:0x005c, B:59:0x0062, B:61:0x0066, B:62:0x006d, B:63:0x0070), top: B:80:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009f  */
    @Override // no.nordicsemi.android.dfu.DfuService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean initialize(android.content.Intent r6, android.bluetooth.BluetoothGatt r7, int r8, java.io.InputStream r9, java.io.InputStream r10) {
        /*
            r5 = this;
            r5.mGatt = r7
            r5.mFileType = r8
            r5.mFirmwareStream = r9
            r5.mInitPacketStream = r10
            java.lang.String r0 = "no.nordicsemi.android.dfu.extra.EXTRA_PART_CURRENT"
            r1 = 1
            int r0 = r6.getIntExtra(r0, r1)
            java.lang.String r2 = "no.nordicsemi.android.dfu.extra.EXTRA_PARTS_TOTAL"
            int r2 = r6.getIntExtra(r2, r1)
            java.lang.String r3 = "no.nordicsemi.android.dfu.extra.EXTRA_CURRENT_MTU"
            r4 = 23
            int r6 = r6.getIntExtra(r3, r4)
            r5.mCurrentMtu = r6
            r6 = 15
            r3 = 2
            r4 = 4
            if (r8 <= r4) goto L3f
            java.lang.String r8 = "DFU target does not support (SD/BL)+App update, splitting into 2 parts"
            r5.logw(r8)
            no.nordicsemi.android.dfu.DfuBaseService r8 = r5.mService
            java.lang.String r2 = "Sending system components"
            r8.sendLogBroadcast(r6, r2)
            int r8 = r5.mFileType
            r8 = r8 & (-5)
            r5.mFileType = r8
            java.io.InputStream r2 = r5.mFirmwareStream
            no.nordicsemi.android.dfu.internal.ArchiveInputStream r2 = (no.nordicsemi.android.dfu.internal.ArchiveInputStream) r2
            r2.setContentType(r8)
            r2 = 2
        L3f:
            if (r0 != r3) goto L48
            no.nordicsemi.android.dfu.DfuBaseService r8 = r5.mService
            java.lang.String r4 = "Sending application"
            r8.sendLogBroadcast(r6, r4)
        L48:
            r6 = 0
            if (r10 == 0) goto L59
            boolean r8 = r10.markSupported()     // Catch: java.lang.Exception -> L59
            if (r8 == 0) goto L54
            r10.reset()     // Catch: java.lang.Exception -> L59
        L54:
            int r8 = r10.available()     // Catch: java.lang.Exception -> L59
            goto L5a
        L59:
            r8 = 0
        L5a:
            r5.mInitPacketSizeInBytes = r8
            boolean r8 = r9.markSupported()     // Catch: java.lang.Exception -> L75
            if (r8 == 0) goto L70
            boolean r8 = r9 instanceof no.nordicsemi.android.dfu.internal.ArchiveInputStream     // Catch: java.lang.Exception -> L75
            if (r8 == 0) goto L6d
            r8 = r9
            no.nordicsemi.android.dfu.internal.ArchiveInputStream r8 = (no.nordicsemi.android.dfu.internal.ArchiveInputStream) r8     // Catch: java.lang.Exception -> L75
            r8.fullReset()     // Catch: java.lang.Exception -> L75
            goto L70
        L6d:
            r9.reset()     // Catch: java.lang.Exception -> L75
        L70:
            int r6 = r9.available()     // Catch: java.lang.Exception -> L75
            goto L76
        L75:
        L76:
            r5.mImageSizeInBytes = r6
            no.nordicsemi.android.dfu.DfuProgressInfo r8 = r5.mProgressInfo
            r8.init(r6, r0, r2)
            android.bluetooth.BluetoothDevice r6 = r7.getDevice()
            int r6 = r6.getBondState()
            r8 = 12
            if (r6 != r8) goto Lae
            java.util.UUID r6 = no.nordicsemi.android.dfu.BaseDfuImpl.GENERIC_ATTRIBUTE_SERVICE_UUID
            android.bluetooth.BluetoothGattService r6 = r7.getService(r6)
            if (r6 == 0) goto Lae
            java.util.UUID r7 = no.nordicsemi.android.dfu.BaseDfuImpl.SERVICE_CHANGED_UUID
            android.bluetooth.BluetoothGattCharacteristic r6 = r6.getCharacteristic(r7)
            if (r6 == 0) goto Lae
            boolean r7 = r5.isServiceChangedCCCDEnabled()
            if (r7 != 0) goto La2
            r5.enableCCCD(r6, r3)
        La2:
            java.lang.String r6 = "Service Changed indications enabled"
            r5.logi(r6)
            no.nordicsemi.android.dfu.DfuBaseService r7 = r5.mService
            r8 = 10
            r7.sendLogBroadcast(r8, r6)
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: no.nordicsemi.android.dfu.BaseDfuImpl.initialize(android.content.Intent, android.bluetooth.BluetoothGatt, int, java.io.InputStream, java.io.InputStream):boolean");
    }

    public boolean isBonded() {
        return this.mGatt.getDevice().getBondState() == 12;
    }

    public void loge(String str) {
        Log.e(TAG, str);
    }

    public void loge(String str, Throwable th2) {
        Log.e(TAG, str, th2);
    }

    public void logi(String str) {
        if (DfuBaseService.DEBUG) {
            Log.i(TAG, str);
        }
    }

    public void logw(String str) {
        if (DfuBaseService.DEBUG) {
            Log.w(TAG, str);
        }
    }

    public void notifyLock() {
        synchronized (this.mLock) {
            this.mLock.notifyAll();
        }
    }

    @Override // no.nordicsemi.android.dfu.DfuCallback
    public void onBondStateChanged(int i10) {
        this.mRequestCompleted = true;
        notifyLock();
    }

    public String parse(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return "";
        }
        char[] cArr = new char[(length * 3) - 1];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = bArr[i10] & 255;
            int i12 = i10 * 3;
            char[] cArr2 = HEX_ARRAY;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[i11 & 15];
            if (i10 != length - 1) {
                cArr[i12 + 2] = '-';
            }
        }
        return new String(cArr);
    }

    @Override // no.nordicsemi.android.dfu.DfuController
    public void pause() {
        this.mPaused = true;
    }

    public byte[] readNotificationResponse() {
        try {
            synchronized (this.mLock) {
                while (true) {
                    if ((this.mReceivedData != null || !this.mConnected || this.mError != 0 || this.mAborted) && !this.mPaused) {
                        break;
                    }
                    this.mLock.wait();
                }
            }
        } catch (InterruptedException e10) {
            loge("Sleeping interrupted", e10);
        }
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        if (this.mConnected) {
            if (this.mError == 0) {
                return this.mReceivedData;
            }
            throw new DfuException("Unable to write Op Code", this.mError);
        }
        throw new DeviceDisconnectedException("Unable to write Op Code: device disconnected");
    }

    @Override // no.nordicsemi.android.dfu.DfuService
    public void release() {
        this.mService = null;
    }

    public boolean removeBond() {
        BluetoothDevice device = this.mGatt.getDevice();
        if (device.getBondState() == 10) {
            return true;
        }
        this.mService.sendLogBroadcast(1, "Removing bond information...");
        boolean z10 = false;
        try {
            Method method = device.getClass().getMethod("removeBond", new Class[0]);
            this.mRequestCompleted = false;
            this.mService.sendLogBroadcast(0, "gatt.getDevice().removeBond() (hidden)");
            z10 = ((Boolean) method.invoke(device, new Object[0])).booleanValue();
            try {
                synchronized (this.mLock) {
                    while (!this.mRequestCompleted && !this.mAborted) {
                        this.mLock.wait();
                    }
                }
            } catch (InterruptedException e10) {
                loge("Sleeping interrupted", e10);
            }
        } catch (Exception e11) {
            Log.w(TAG, "An exception occurred while removing bond information", e11);
        }
        return z10;
    }

    public void requestMtu(int i10) {
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        this.mRequestCompleted = false;
        this.mService.sendLogBroadcast(1, "Requesting new MTU...");
        DfuBaseService dfuBaseService = this.mService;
        dfuBaseService.sendLogBroadcast(0, "gatt.requestMtu(" + i10 + ")");
        if (this.mGatt.requestMtu(i10)) {
            try {
                synchronized (this.mLock) {
                    while (true) {
                        if ((this.mRequestCompleted || !this.mConnected || this.mError != 0) && !this.mPaused) {
                            break;
                        }
                        this.mLock.wait();
                    }
                }
            } catch (InterruptedException e10) {
                loge("Sleeping interrupted", e10);
            }
            if (!this.mConnected) {
                throw new DeviceDisconnectedException("Unable to read Service Changed CCCD: device disconnected");
            }
        }
    }

    public void restartService(Intent intent, boolean z10) {
        String str;
        String str2;
        if (z10) {
            long longExtra = intent.getLongExtra(DfuBaseService.EXTRA_SCAN_DELAY, 0L);
            long longExtra2 = intent.getLongExtra(DfuBaseService.EXTRA_SCAN_TIMEOUT, DfuServiceInitiator.DEFAULT_SCAN_TIMEOUT);
            DfuBaseService dfuBaseService = this.mService;
            dfuBaseService.sendLogBroadcast(1, "Scanning for the DFU Bootloader... (timeout " + longExtra2 + " ms)");
            if (longExtra > 0) {
                this.mService.waitFor(longExtra);
            }
            str = BootloaderScannerFactory.getScanner(this.mGatt.getDevice().getAddress()).searchUsing(this.mService.getDeviceSelector(), longExtra2);
            logi(b.b("Scanning for new address finished with: ", str));
            DfuBaseService dfuBaseService2 = this.mService;
            if (str != null) {
                str2 = b.b("DFU Bootloader found with address ", str);
            } else {
                str2 = "DFU Bootloader not found. Trying the same address...";
            }
            dfuBaseService2.sendLogBroadcast(5, str2);
        } else {
            str = null;
        }
        if (str != null) {
            intent.putExtra(DfuBaseService.EXTRA_DEVICE_ADDRESS, str);
        }
        intent.putExtra(DfuBaseService.EXTRA_DFU_ATTEMPT, 0);
        this.mService.startService(intent);
    }

    @Override // no.nordicsemi.android.dfu.DfuController
    public void resume() {
        this.mPaused = false;
        notifyLock();
    }

    public void waitIfPaused() {
        try {
            synchronized (this.mLock) {
                while (this.mPaused) {
                    this.mLock.wait();
                }
            }
        } catch (InterruptedException e10) {
            loge("Sleeping interrupted", e10);
        }
    }

    public void writeOpCode(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, boolean z10) {
        if (!this.mAborted) {
            this.mReceivedData = null;
            this.mError = 0;
            this.mRequestCompleted = false;
            this.mResetRequestSent = z10;
            bluetoothGattCharacteristic.setWriteType(2);
            bluetoothGattCharacteristic.setValue(bArr);
            DfuBaseService dfuBaseService = this.mService;
            StringBuilder a10 = d.a("Writing to characteristic ");
            a10.append(bluetoothGattCharacteristic.getUuid());
            dfuBaseService.sendLogBroadcast(1, a10.toString());
            DfuBaseService dfuBaseService2 = this.mService;
            StringBuilder a11 = d.a("gatt.writeCharacteristic(");
            a11.append(bluetoothGattCharacteristic.getUuid());
            a11.append(")");
            dfuBaseService2.sendLogBroadcast(0, a11.toString());
            this.mGatt.writeCharacteristic(bluetoothGattCharacteristic);
            try {
                synchronized (this.mLock) {
                    while (true) {
                        if ((this.mRequestCompleted || !this.mConnected || this.mError != 0) && !this.mPaused) {
                            break;
                        }
                        this.mLock.wait();
                    }
                }
            } catch (InterruptedException e10) {
                loge("Sleeping interrupted", e10);
            }
            boolean z11 = this.mResetRequestSent;
            if (!z11 && !this.mConnected) {
                throw new DeviceDisconnectedException(q.b(d.a("Unable to write Op Code "), bArr[0], ": device disconnected"));
            }
            if (!z11 && this.mError != 0) {
                StringBuilder a12 = d.a("Unable to write Op Code ");
                a12.append((int) bArr[0]);
                throw new DfuException(a12.toString(), this.mError);
            }
            return;
        }
        throw new UploadAbortedException();
    }
}
