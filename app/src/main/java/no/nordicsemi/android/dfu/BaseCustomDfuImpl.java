package no.nordicsemi.android.dfu;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Intent;
import android.support.v4.media.d;
import androidx.activity.e;
import androidx.appcompat.widget.u0;
import java.io.IOException;
import java.util.UUID;
import java.util.zip.CRC32;
import no.nordicsemi.android.dfu.BaseDfuImpl;
import no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException;
import no.nordicsemi.android.dfu.internal.exception.DfuException;
import no.nordicsemi.android.dfu.internal.exception.HexFileValidationException;
import no.nordicsemi.android.dfu.internal.exception.UploadAbortedException;

@SuppressLint({"MissingPermission"})
/* loaded from: classes2.dex */
public abstract class BaseCustomDfuImpl extends BaseDfuImpl {
    public boolean mFirmwareUploadInProgress;
    private boolean mInitPacketInProgress;
    public int mPacketsBeforeNotification;
    private int mPacketsSentSinceNotification;
    public boolean mRemoteErrorOccurred;

    /* loaded from: classes2.dex */
    public class BaseCustomBluetoothCallback extends BaseDfuImpl.BaseBluetoothGattCallback {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BaseCustomBluetoothCallback() {
            super();
            BaseCustomDfuImpl.this = r1;
        }

        public void handleNotification(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            DfuBaseService dfuBaseService = BaseCustomDfuImpl.this.mService;
            StringBuilder a10 = d.a("Notification received from ");
            a10.append(bluetoothGattCharacteristic.getUuid());
            a10.append(", value (0x): ");
            a10.append(parse(bluetoothGattCharacteristic));
            dfuBaseService.sendLogBroadcast(5, a10.toString());
            BaseCustomDfuImpl.this.mReceivedData = bluetoothGattCharacteristic.getValue();
            BaseCustomDfuImpl.this.mFirmwareUploadInProgress = false;
        }

        public void handlePacketReceiptNotification(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            BaseCustomDfuImpl baseCustomDfuImpl;
            int i10;
            BaseCustomDfuImpl baseCustomDfuImpl2 = BaseCustomDfuImpl.this;
            if (!baseCustomDfuImpl2.mFirmwareUploadInProgress) {
                handleNotification(bluetoothGatt, bluetoothGattCharacteristic);
                return;
            }
            BluetoothGattCharacteristic characteristic = bluetoothGatt.getService(baseCustomDfuImpl2.getDfuServiceUUID()).getCharacteristic(BaseCustomDfuImpl.this.getPacketCharacteristicUUID());
            try {
                BaseCustomDfuImpl.this.mPacketsSentSinceNotification = 0;
                BaseCustomDfuImpl.this.waitIfPaused();
                BaseCustomDfuImpl baseCustomDfuImpl3 = BaseCustomDfuImpl.this;
                if (!baseCustomDfuImpl3.mAborted && baseCustomDfuImpl3.mError == 0 && !baseCustomDfuImpl3.mRemoteErrorOccurred && !baseCustomDfuImpl3.mResetRequestSent) {
                    boolean isComplete = baseCustomDfuImpl3.mProgressInfo.isComplete();
                    boolean isObjectComplete = BaseCustomDfuImpl.this.mProgressInfo.isObjectComplete();
                    if (!isComplete && !isObjectComplete) {
                        int availableObjectSizeIsBytes = BaseCustomDfuImpl.this.mProgressInfo.getAvailableObjectSizeIsBytes();
                        BaseCustomDfuImpl baseCustomDfuImpl4 = BaseCustomDfuImpl.this;
                        byte[] bArr = baseCustomDfuImpl4.mBuffer;
                        if (availableObjectSizeIsBytes < bArr.length) {
                            bArr = new byte[availableObjectSizeIsBytes];
                        }
                        BaseCustomDfuImpl.this.writePacket(bluetoothGatt, characteristic, bArr, baseCustomDfuImpl4.mFirmwareStream.read(bArr));
                        return;
                    }
                    BaseCustomDfuImpl baseCustomDfuImpl5 = BaseCustomDfuImpl.this;
                    baseCustomDfuImpl5.mFirmwareUploadInProgress = false;
                    baseCustomDfuImpl5.notifyLock();
                    return;
                }
                baseCustomDfuImpl3.mFirmwareUploadInProgress = false;
                baseCustomDfuImpl3.mService.sendLogBroadcast(15, "Upload terminated");
            } catch (HexFileValidationException unused) {
                BaseCustomDfuImpl.this.loge("Invalid HEX file");
                baseCustomDfuImpl = BaseCustomDfuImpl.this;
                i10 = DfuBaseService.ERROR_FILE_INVALID;
                baseCustomDfuImpl.mError = i10;
            } catch (IOException e10) {
                BaseCustomDfuImpl.this.loge("Error while reading the input stream", e10);
                baseCustomDfuImpl = BaseCustomDfuImpl.this;
                i10 = DfuBaseService.ERROR_FILE_IO_EXCEPTION;
                baseCustomDfuImpl.mError = i10;
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
            BaseCustomDfuImpl baseCustomDfuImpl;
            BaseCustomDfuImpl baseCustomDfuImpl2;
            int i11;
            BaseCustomDfuImpl baseCustomDfuImpl3;
            boolean z10 = true;
            if (i10 == 0) {
                if (bluetoothGattCharacteristic.getUuid().equals(BaseCustomDfuImpl.this.getPacketCharacteristicUUID())) {
                    if (BaseCustomDfuImpl.this.mInitPacketInProgress) {
                        DfuBaseService dfuBaseService = BaseCustomDfuImpl.this.mService;
                        StringBuilder a10 = d.a("Data written to ");
                        a10.append(bluetoothGattCharacteristic.getUuid());
                        a10.append(", value (0x): ");
                        a10.append(parse(bluetoothGattCharacteristic));
                        dfuBaseService.sendLogBroadcast(5, a10.toString());
                        BaseCustomDfuImpl.this.mInitPacketInProgress = false;
                    } else {
                        BaseCustomDfuImpl baseCustomDfuImpl4 = BaseCustomDfuImpl.this;
                        if (baseCustomDfuImpl4.mFirmwareUploadInProgress) {
                            baseCustomDfuImpl4.mProgressInfo.addBytesSent(bluetoothGattCharacteristic.getValue().length);
                            BaseCustomDfuImpl.access$108(BaseCustomDfuImpl.this);
                            BaseCustomDfuImpl baseCustomDfuImpl5 = BaseCustomDfuImpl.this;
                            z10 = (baseCustomDfuImpl5.mPacketsBeforeNotification <= 0 || baseCustomDfuImpl5.mPacketsSentSinceNotification < BaseCustomDfuImpl.this.mPacketsBeforeNotification) ? false : false;
                            boolean isComplete = BaseCustomDfuImpl.this.mProgressInfo.isComplete();
                            boolean isObjectComplete = BaseCustomDfuImpl.this.mProgressInfo.isObjectComplete();
                            if (z10) {
                                return;
                            }
                            if (!isComplete && !isObjectComplete) {
                                try {
                                    BaseCustomDfuImpl.this.waitIfPaused();
                                    BaseCustomDfuImpl baseCustomDfuImpl6 = BaseCustomDfuImpl.this;
                                    if (!baseCustomDfuImpl6.mAborted && baseCustomDfuImpl6.mError == 0 && !baseCustomDfuImpl6.mRemoteErrorOccurred && !baseCustomDfuImpl6.mResetRequestSent) {
                                        int availableObjectSizeIsBytes = baseCustomDfuImpl6.mProgressInfo.getAvailableObjectSizeIsBytes();
                                        BaseCustomDfuImpl baseCustomDfuImpl7 = BaseCustomDfuImpl.this;
                                        byte[] bArr = baseCustomDfuImpl7.mBuffer;
                                        if (availableObjectSizeIsBytes < bArr.length) {
                                            bArr = new byte[availableObjectSizeIsBytes];
                                        }
                                        BaseCustomDfuImpl.this.writePacket(bluetoothGatt, bluetoothGattCharacteristic, bArr, baseCustomDfuImpl7.mFirmwareStream.read(bArr));
                                        return;
                                    }
                                    baseCustomDfuImpl6.mFirmwareUploadInProgress = false;
                                    baseCustomDfuImpl6.mService.sendLogBroadcast(15, "Upload terminated");
                                    BaseCustomDfuImpl.this.notifyLock();
                                    return;
                                } catch (HexFileValidationException unused) {
                                    BaseCustomDfuImpl.this.loge("Invalid HEX file");
                                    baseCustomDfuImpl2 = BaseCustomDfuImpl.this;
                                    i11 = DfuBaseService.ERROR_FILE_INVALID;
                                } catch (IOException e10) {
                                    BaseCustomDfuImpl.this.loge("Error while reading the input stream", e10);
                                    baseCustomDfuImpl2 = BaseCustomDfuImpl.this;
                                    i11 = DfuBaseService.ERROR_FILE_IO_EXCEPTION;
                                }
                            } else {
                                baseCustomDfuImpl3 = BaseCustomDfuImpl.this;
                                baseCustomDfuImpl3.mFirmwareUploadInProgress = false;
                                baseCustomDfuImpl3.notifyLock();
                            }
                        } else {
                            onPacketCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i10);
                        }
                    }
                    baseCustomDfuImpl3 = BaseCustomDfuImpl.this;
                    baseCustomDfuImpl3.notifyLock();
                }
                DfuBaseService dfuBaseService2 = BaseCustomDfuImpl.this.mService;
                StringBuilder a11 = d.a("Data written to ");
                a11.append(bluetoothGattCharacteristic.getUuid());
                a11.append(", value (0x): ");
                a11.append(parse(bluetoothGattCharacteristic));
                dfuBaseService2.sendLogBroadcast(5, a11.toString());
                baseCustomDfuImpl = BaseCustomDfuImpl.this;
            } else {
                baseCustomDfuImpl = BaseCustomDfuImpl.this;
                if (!baseCustomDfuImpl.mResetRequestSent) {
                    baseCustomDfuImpl.loge(u0.a("Characteristic write error: ", i10));
                    baseCustomDfuImpl2 = BaseCustomDfuImpl.this;
                    i11 = i10 | DfuBaseService.ERROR_CONNECTION_MASK;
                    baseCustomDfuImpl2.mError = i11;
                    baseCustomDfuImpl3 = BaseCustomDfuImpl.this;
                    baseCustomDfuImpl3.notifyLock();
                }
            }
            baseCustomDfuImpl.mRequestCompleted = true;
            baseCustomDfuImpl3 = BaseCustomDfuImpl.this;
            baseCustomDfuImpl3.notifyLock();
        }

        public void onPacketCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x002a, code lost:
        if (r9 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x002d, code lost:
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0057, code lost:
        if (r9 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BaseCustomDfuImpl(android.content.Intent r8, no.nordicsemi.android.dfu.DfuBaseService r9) {
        /*
            r7 = this;
            r7.<init>(r8, r9)
            java.lang.String r0 = "no.nordicsemi.android.dfu.extra.EXTRA_PRN_ENABLED"
            boolean r1 = r8.hasExtra(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 1
            r4 = 23
            r5 = 0
            r6 = 12
            if (r1 == 0) goto L31
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 >= r4) goto L19
            goto L1a
        L19:
            r3 = 0
        L1a:
            boolean r9 = r8.getBooleanExtra(r0, r3)
            java.lang.String r0 = "no.nordicsemi.android.dfu.extra.EXTRA_PRN_VALUE"
            int r8 = r8.getIntExtra(r0, r6)
            if (r8 < 0) goto L2a
            if (r8 <= r2) goto L29
            goto L2a
        L29:
            r6 = r8
        L2a:
            if (r9 != 0) goto L2d
            goto L2e
        L2d:
            r5 = r6
        L2e:
            r7.mPacketsBeforeNotification = r5
            goto L5a
        L31:
            android.content.SharedPreferences r8 = android.preference.PreferenceManager.getDefaultSharedPreferences(r9)
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 >= r4) goto L3a
            goto L3b
        L3a:
            r3 = 0
        L3b:
            java.lang.String r9 = "settings_packet_receipt_notification_enabled"
            boolean r9 = r8.getBoolean(r9, r3)
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "settings_number_of_packets"
            java.lang.String r8 = r8.getString(r1, r0)
            int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.NumberFormatException -> L56
            if (r8 < 0) goto L57
            if (r8 <= r2) goto L54
            goto L57
        L54:
            r6 = r8
            goto L57
        L56:
        L57:
            if (r9 != 0) goto L2d
            goto L2e
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: no.nordicsemi.android.dfu.BaseCustomDfuImpl.<init>(android.content.Intent, no.nordicsemi.android.dfu.DfuBaseService):void");
    }

    public static /* synthetic */ int access$108(BaseCustomDfuImpl baseCustomDfuImpl) {
        int i10 = baseCustomDfuImpl.mPacketsSentSinceNotification;
        baseCustomDfuImpl.mPacketsSentSinceNotification = i10 + 1;
        return i10;
    }

    private void writeInitPacket(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i10) {
        if (!this.mAborted) {
            if (bArr.length != i10) {
                byte[] bArr2 = new byte[i10];
                System.arraycopy(bArr, 0, bArr2, 0, i10);
                bArr = bArr2;
            }
            this.mReceivedData = null;
            this.mError = 0;
            this.mInitPacketInProgress = true;
            bluetoothGattCharacteristic.setWriteType(1);
            bluetoothGattCharacteristic.setValue(bArr);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Sending init packet (Value = ");
            logi(e.b(sb2, parse(bArr), ")"));
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
                        if ((!this.mInitPacketInProgress || !this.mConnected || this.mError != 0) && !this.mPaused) {
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
                    return;
                }
                throw new DfuException("Unable to write Init DFU Parameters", this.mError);
            }
            throw new DeviceDisconnectedException("Unable to write Init DFU Parameters: device disconnected");
        }
        throw new UploadAbortedException();
    }

    public void writePacket(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i10) {
        if (i10 <= 0) {
            return;
        }
        if (bArr.length != i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, i10);
            bArr = bArr2;
        }
        bluetoothGattCharacteristic.setWriteType(1);
        bluetoothGattCharacteristic.setValue(bArr);
        bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
    }

    public void finalize(Intent intent, boolean z10) {
        boolean booleanExtra = intent.getBooleanExtra(DfuBaseService.EXTRA_KEEP_BOND, false);
        this.mService.refreshDeviceCache(this.mGatt, z10 || !booleanExtra);
        this.mService.close(this.mGatt);
        if (this.mGatt.getDevice().getBondState() == 12) {
            boolean booleanExtra2 = intent.getBooleanExtra(DfuBaseService.EXTRA_RESTORE_BOND, false);
            if (booleanExtra2 || !booleanExtra) {
                removeBond();
                this.mService.waitFor(2000L);
            }
            if (booleanExtra2 && (this.mFileType & 4) > 0 && !createBond()) {
                logw("Creating bond failed");
            }
        }
        if (this.mProgressInfo.isLastPart()) {
            this.mProgressInfo.setProgress(-6);
            return;
        }
        logi("Starting service that will upload application");
        Intent intent2 = new Intent();
        intent2.fillIn(intent, 24);
        intent2.putExtra(DfuBaseService.EXTRA_FILE_MIME_TYPE, DfuBaseService.MIME_TYPE_ZIP);
        intent2.putExtra(DfuBaseService.EXTRA_FILE_TYPE, 4);
        intent2.putExtra(DfuBaseService.EXTRA_PART_CURRENT, this.mProgressInfo.getCurrentPart() + 1);
        intent2.putExtra(DfuBaseService.EXTRA_PARTS_TOTAL, this.mProgressInfo.getTotalParts());
        restartService(intent2, true);
    }

    public abstract UUID getControlPointCharacteristicUUID();

    public abstract UUID getDfuServiceUUID();

    public abstract UUID getPacketCharacteristicUUID();

    public void uploadFirmwareImage(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (this.mAborted) {
            throw new UploadAbortedException();
        }
        this.mReceivedData = null;
        this.mError = 0;
        this.mFirmwareUploadInProgress = true;
        this.mPacketsSentSinceNotification = 0;
        try {
            int availableObjectSizeIsBytes = this.mProgressInfo.getAvailableObjectSizeIsBytes();
            byte[] bArr = this.mBuffer;
            if (availableObjectSizeIsBytes < bArr.length) {
                bArr = new byte[availableObjectSizeIsBytes];
            }
            int read = this.mFirmwareStream.read(bArr);
            DfuBaseService dfuBaseService = this.mService;
            dfuBaseService.sendLogBroadcast(1, "Sending firmware to characteristic " + bluetoothGattCharacteristic.getUuid() + "...");
            writePacket(this.mGatt, bluetoothGattCharacteristic, bArr, read);
            try {
                synchronized (this.mLock) {
                    while (true) {
                        if ((!this.mFirmwareUploadInProgress || this.mReceivedData != null || !this.mConnected || this.mError != 0) && !this.mPaused) {
                            break;
                        }
                        this.mLock.wait();
                    }
                }
            } catch (InterruptedException e10) {
                loge("Sleeping interrupted", e10);
            }
            if (!this.mConnected) {
                throw new DeviceDisconnectedException("Uploading Firmware Image failed: device disconnected");
            }
            if (this.mError != 0) {
                throw new DfuException("Uploading Firmware Image failed", this.mError);
            }
        } catch (HexFileValidationException unused) {
            throw new DfuException("HEX file not valid", DfuBaseService.ERROR_FILE_INVALID);
        } catch (IOException unused2) {
            throw new DfuException("Error while reading file", DfuBaseService.ERROR_FILE_IO_EXCEPTION);
        }
    }

    public void writeInitData(BluetoothGattCharacteristic bluetoothGattCharacteristic, CRC32 crc32) {
        try {
            byte[] bArr = this.mBuffer;
            while (true) {
                int read = this.mInitPacketStream.read(bArr, 0, bArr.length);
                if (read == -1) {
                    return;
                }
                writeInitPacket(bluetoothGattCharacteristic, bArr, read);
                if (crc32 != null) {
                    crc32.update(bArr, 0, read);
                }
            }
        } catch (IOException e10) {
            loge("Error while reading Init packet file", e10);
            throw new DfuException("Error while reading Init packet file", DfuBaseService.ERROR_FILE_ERROR);
        }
    }
}
