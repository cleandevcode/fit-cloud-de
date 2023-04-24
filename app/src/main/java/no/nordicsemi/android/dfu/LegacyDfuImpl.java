package no.nordicsemi.android.dfu;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import android.support.v4.media.d;
import java.util.UUID;
import no.nordicsemi.android.dfu.BaseCustomDfuImpl;
import no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException;
import no.nordicsemi.android.dfu.internal.exception.DfuException;
import no.nordicsemi.android.dfu.internal.exception.UnknownResponseException;
import no.nordicsemi.android.dfu.internal.exception.UploadAbortedException;

@SuppressLint({"MissingPermission"})
/* loaded from: classes2.dex */
public class LegacyDfuImpl extends BaseCustomDfuImpl {
    public static final UUID DEFAULT_DFU_CONTROL_POINT_UUID;
    public static final UUID DEFAULT_DFU_PACKET_UUID;
    public static final UUID DEFAULT_DFU_SERVICE_UUID;
    public static final UUID DEFAULT_DFU_VERSION_UUID;
    public static UUID DFU_CONTROL_POINT_UUID = null;
    public static UUID DFU_PACKET_UUID = null;
    public static UUID DFU_SERVICE_UUID = null;
    private static final int DFU_STATUS_SUCCESS = 1;
    public static UUID DFU_VERSION_UUID = null;
    private static final byte[] OP_CODE_ACTIVATE_AND_RESET;
    private static final int OP_CODE_ACTIVATE_AND_RESET_KEY = 5;
    private static final byte[] OP_CODE_INIT_DFU_PARAMS;
    private static final byte[] OP_CODE_INIT_DFU_PARAMS_COMPLETE;
    private static final int OP_CODE_INIT_DFU_PARAMS_KEY = 2;
    private static final byte[] OP_CODE_INIT_DFU_PARAMS_START;
    private static final int OP_CODE_PACKET_RECEIPT_NOTIF_KEY = 17;
    private static final byte[] OP_CODE_PACKET_RECEIPT_NOTIF_REQ;
    private static final int OP_CODE_PACKET_RECEIPT_NOTIF_REQ_KEY = 8;
    private static final byte[] OP_CODE_RECEIVE_FIRMWARE_IMAGE;
    private static final int OP_CODE_RECEIVE_FIRMWARE_IMAGE_KEY = 3;
    private static final byte[] OP_CODE_RESET;
    private static final int OP_CODE_RESET_KEY = 6;
    private static final int OP_CODE_RESPONSE_CODE_KEY = 16;
    private static final byte[] OP_CODE_START_DFU;
    private static final int OP_CODE_START_DFU_KEY = 1;
    private static final byte[] OP_CODE_START_DFU_V1;
    private static final byte[] OP_CODE_VALIDATE;
    private static final int OP_CODE_VALIDATE_KEY = 4;
    private final LegacyBluetoothCallback mBluetoothCallback;
    private BluetoothGattCharacteristic mControlPointCharacteristic;
    private boolean mImageSizeInProgress;
    private BluetoothGattCharacteristic mPacketCharacteristic;

    /* loaded from: classes2.dex */
    public class LegacyBluetoothCallback extends BaseCustomDfuImpl.BaseCustomBluetoothCallback {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LegacyBluetoothCallback() {
            super();
            LegacyDfuImpl.this = r1;
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            if (bluetoothGattCharacteristic.getIntValue(17, 0).intValue() == 17) {
                LegacyDfuImpl.this.mProgressInfo.setBytesReceived(bluetoothGattCharacteristic.getIntValue(20, 1).intValue());
                handlePacketReceiptNotification(bluetoothGatt, bluetoothGattCharacteristic);
            } else if (!LegacyDfuImpl.this.mRemoteErrorOccurred) {
                if (bluetoothGattCharacteristic.getIntValue(17, 2).intValue() != 1) {
                    LegacyDfuImpl.this.mRemoteErrorOccurred = true;
                }
                handleNotification(bluetoothGatt, bluetoothGattCharacteristic);
            }
            LegacyDfuImpl.this.notifyLock();
        }

        @Override // no.nordicsemi.android.dfu.BaseCustomDfuImpl.BaseCustomBluetoothCallback
        public void onPacketCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
            if (LegacyDfuImpl.this.mImageSizeInProgress) {
                DfuBaseService dfuBaseService = LegacyDfuImpl.this.mService;
                StringBuilder a10 = d.a("Data written to ");
                a10.append(bluetoothGattCharacteristic.getUuid());
                a10.append(", value (0x): ");
                a10.append(parse(bluetoothGattCharacteristic));
                dfuBaseService.sendLogBroadcast(5, a10.toString());
                LegacyDfuImpl.this.mImageSizeInProgress = false;
            }
        }
    }

    static {
        UUID uuid = new UUID(23296205844446L, 1523193452336828707L);
        DEFAULT_DFU_SERVICE_UUID = uuid;
        UUID uuid2 = new UUID(23300500811742L, 1523193452336828707L);
        DEFAULT_DFU_CONTROL_POINT_UUID = uuid2;
        UUID uuid3 = new UUID(23304795779038L, 1523193452336828707L);
        DEFAULT_DFU_PACKET_UUID = uuid3;
        UUID uuid4 = new UUID(23313385713630L, 1523193452336828707L);
        DEFAULT_DFU_VERSION_UUID = uuid4;
        DFU_SERVICE_UUID = uuid;
        DFU_CONTROL_POINT_UUID = uuid2;
        DFU_PACKET_UUID = uuid3;
        DFU_VERSION_UUID = uuid4;
        OP_CODE_START_DFU = new byte[]{1, 0};
        OP_CODE_START_DFU_V1 = new byte[]{1};
        OP_CODE_INIT_DFU_PARAMS = new byte[]{2};
        OP_CODE_INIT_DFU_PARAMS_START = new byte[]{2, 0};
        OP_CODE_INIT_DFU_PARAMS_COMPLETE = new byte[]{2, 1};
        OP_CODE_RECEIVE_FIRMWARE_IMAGE = new byte[]{3};
        OP_CODE_VALIDATE = new byte[]{4};
        OP_CODE_ACTIVATE_AND_RESET = new byte[]{5};
        OP_CODE_RESET = new byte[]{6};
        OP_CODE_PACKET_RECEIPT_NOTIF_REQ = new byte[]{8, 0, 0};
    }

    public LegacyDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
        this.mBluetoothCallback = new LegacyBluetoothCallback();
    }

    private int getStatusCode(byte[] bArr, int i10) {
        byte b10;
        if (bArr == null || bArr.length != 3 || bArr[0] != 16 || bArr[1] != i10 || (b10 = bArr[2]) < 1 || b10 > 6) {
            throw new UnknownResponseException("Invalid response received", bArr, 16, i10);
        }
        return b10;
    }

    private int readVersion(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic != null) {
            return bluetoothGattCharacteristic.getIntValue(18, 0).intValue();
        }
        return 0;
    }

    private void resetAndRestart(BluetoothGatt bluetoothGatt, Intent intent) {
        this.mService.sendLogBroadcast(15, "Last upload interrupted. Restarting device...");
        this.mProgressInfo.setProgress(-5);
        logi("Sending Reset command (Op Code = 6)");
        writeOpCode(this.mControlPointCharacteristic, OP_CODE_RESET);
        this.mService.sendLogBroadcast(10, "Reset request sent");
        this.mService.waitUntilDisconnected();
        this.mService.sendLogBroadcast(5, "Disconnected by the remote device");
        BluetoothGattService service = bluetoothGatt.getService(BaseDfuImpl.GENERIC_ATTRIBUTE_SERVICE_UUID);
        this.mService.refreshDeviceCache(bluetoothGatt, !((service == null || service.getCharacteristic(BaseDfuImpl.SERVICE_CHANGED_UUID) == null) ? false : true));
        this.mService.close(bluetoothGatt);
        logi("Restarting the service");
        Intent intent2 = new Intent();
        intent2.fillIn(intent, 24);
        restartService(intent2, false);
    }

    private void setNumberOfPackets(byte[] bArr, int i10) {
        bArr[1] = (byte) (i10 & 255);
        bArr[2] = (byte) ((i10 >> 8) & 255);
    }

    private void writeImageSize(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
        this.mReceivedData = null;
        this.mError = 0;
        this.mImageSizeInProgress = true;
        bluetoothGattCharacteristic.setWriteType(1);
        bluetoothGattCharacteristic.setValue(new byte[4]);
        bluetoothGattCharacteristic.setValue(i10, 20, 0);
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
                    if ((!this.mImageSizeInProgress || !this.mConnected || this.mError != 0 || this.mAborted) && !this.mPaused) {
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
        if (!this.mConnected) {
            throw new DeviceDisconnectedException("Unable to write Image Size: device disconnected");
        }
        if (this.mError != 0) {
            throw new DfuException("Unable to write Image Size", this.mError);
        }
    }

    private void writeOpCode(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        boolean z10 = false;
        byte b10 = bArr[0];
        writeOpCode(bluetoothGattCharacteristic, bArr, (b10 == 6 || b10 == 5) ? true : true);
    }

    @Override // no.nordicsemi.android.dfu.BaseCustomDfuImpl
    public UUID getControlPointCharacteristicUUID() {
        return DFU_CONTROL_POINT_UUID;
    }

    @Override // no.nordicsemi.android.dfu.BaseCustomDfuImpl
    public UUID getDfuServiceUUID() {
        return DFU_SERVICE_UUID;
    }

    @Override // no.nordicsemi.android.dfu.DfuCallback
    public BaseCustomDfuImpl.BaseCustomBluetoothCallback getGattCallback() {
        return this.mBluetoothCallback;
    }

    @Override // no.nordicsemi.android.dfu.BaseCustomDfuImpl
    public UUID getPacketCharacteristicUUID() {
        return DFU_PACKET_UUID;
    }

    @Override // no.nordicsemi.android.dfu.DfuService
    public boolean isClientCompatible(Intent intent, BluetoothGatt bluetoothGatt) {
        BluetoothGattCharacteristic characteristic;
        BluetoothGattService service = bluetoothGatt.getService(DFU_SERVICE_UUID);
        if (service == null || (characteristic = service.getCharacteristic(DFU_CONTROL_POINT_UUID)) == null || characteristic.getDescriptor(BaseDfuImpl.CLIENT_CHARACTERISTIC_CONFIG) == null) {
            return false;
        }
        this.mControlPointCharacteristic = characteristic;
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(DFU_PACKET_UUID);
        this.mPacketCharacteristic = characteristic2;
        return characteristic2 != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:260:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x030c A[Catch: UnknownResponseException -> 0x01f8, UploadAbortedException -> 0x01fb, RemoteDfuException -> 0x030d, TRY_LEAVE, TryCatch #15 {RemoteDfuException -> 0x030d, blocks: (B:258:0x0204, B:261:0x020d, B:263:0x0211, B:265:0x02f8, B:270:0x0305, B:271:0x030a, B:272:0x030b, B:273:0x030c), top: B:365:0x0204 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03c2 A[Catch: UnknownResponseException -> 0x01f8, UploadAbortedException -> 0x01fb, RemoteDfuException -> 0x065c, TryCatch #7 {RemoteDfuException -> 0x065c, blocks: (B:287:0x03be, B:289:0x03c2, B:291:0x03cd, B:293:0x043d, B:296:0x046c, B:297:0x0473, B:292:0x0410, B:299:0x0476, B:307:0x0486, B:308:0x04c4, B:309:0x04e3, B:310:0x04f6, B:312:0x0554, B:314:0x0608, B:318:0x0637, B:319:0x063c, B:320:0x0643, B:321:0x0644, B:322:0x064b, B:324:0x064d, B:325:0x0653, B:305:0x0482, B:276:0x030f, B:280:0x0319, B:282:0x03b6, B:326:0x0654, B:327:0x0659, B:328:0x065a, B:329:0x065b), top: B:356:0x030f }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0486 A[Catch: UnknownResponseException -> 0x01f8, UploadAbortedException -> 0x01fb, RemoteDfuException -> 0x065c, TryCatch #7 {RemoteDfuException -> 0x065c, blocks: (B:287:0x03be, B:289:0x03c2, B:291:0x03cd, B:293:0x043d, B:296:0x046c, B:297:0x0473, B:292:0x0410, B:299:0x0476, B:307:0x0486, B:308:0x04c4, B:309:0x04e3, B:310:0x04f6, B:312:0x0554, B:314:0x0608, B:318:0x0637, B:319:0x063c, B:320:0x0643, B:321:0x0644, B:322:0x064b, B:324:0x064d, B:325:0x0653, B:305:0x0482, B:276:0x030f, B:280:0x0319, B:282:0x03b6, B:326:0x0654, B:327:0x0659, B:328:0x065a, B:329:0x065b), top: B:356:0x030f }] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0554 A[Catch: UnknownResponseException -> 0x01f8, UploadAbortedException -> 0x01fb, RemoteDfuException -> 0x065c, TryCatch #7 {RemoteDfuException -> 0x065c, blocks: (B:287:0x03be, B:289:0x03c2, B:291:0x03cd, B:293:0x043d, B:296:0x046c, B:297:0x0473, B:292:0x0410, B:299:0x0476, B:307:0x0486, B:308:0x04c4, B:309:0x04e3, B:310:0x04f6, B:312:0x0554, B:314:0x0608, B:318:0x0637, B:319:0x063c, B:320:0x0643, B:321:0x0644, B:322:0x064b, B:324:0x064d, B:325:0x0653, B:305:0x0482, B:276:0x030f, B:280:0x0319, B:282:0x03b6, B:326:0x0654, B:327:0x0659, B:328:0x065a, B:329:0x065b), top: B:356:0x030f }] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0644 A[Catch: UnknownResponseException -> 0x01f8, UploadAbortedException -> 0x01fb, RemoteDfuException -> 0x065c, TryCatch #7 {RemoteDfuException -> 0x065c, blocks: (B:287:0x03be, B:289:0x03c2, B:291:0x03cd, B:293:0x043d, B:296:0x046c, B:297:0x0473, B:292:0x0410, B:299:0x0476, B:307:0x0486, B:308:0x04c4, B:309:0x04e3, B:310:0x04f6, B:312:0x0554, B:314:0x0608, B:318:0x0637, B:319:0x063c, B:320:0x0643, B:321:0x0644, B:322:0x064b, B:324:0x064d, B:325:0x0653, B:305:0x0482, B:276:0x030f, B:280:0x0319, B:282:0x03b6, B:326:0x0654, B:327:0x0659, B:328:0x065a, B:329:0x065b), top: B:356:0x030f }] */
    @Override // no.nordicsemi.android.dfu.DfuService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void performDfu(android.content.Intent r27) {
        /*
            Method dump skipped, instructions count: 1823
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: no.nordicsemi.android.dfu.LegacyDfuImpl.performDfu(android.content.Intent):void");
    }

    private void writeImageSize(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10, int i11, int i12) {
        this.mReceivedData = null;
        this.mError = 0;
        this.mImageSizeInProgress = true;
        bluetoothGattCharacteristic.setWriteType(1);
        bluetoothGattCharacteristic.setValue(new byte[12]);
        bluetoothGattCharacteristic.setValue(i10, 20, 0);
        bluetoothGattCharacteristic.setValue(i11, 20, 4);
        bluetoothGattCharacteristic.setValue(i12, 20, 8);
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
                    if ((!this.mImageSizeInProgress || !this.mConnected || this.mError != 0 || this.mAborted) && !this.mPaused) {
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
        if (!this.mConnected) {
            throw new DeviceDisconnectedException("Unable to write Image Sizes: device disconnected");
        }
        if (this.mError != 0) {
            throw new DfuException("Unable to write Image Sizes", this.mError);
        }
    }
}
