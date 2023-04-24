package no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v4.media.d;
import androidx.activity.i;
import androidx.appcompat.widget.e2;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.UUID;
import no.nordicsemi.android.dfu.BaseCustomDfuImpl;
import no.nordicsemi.android.dfu.BaseDfuImpl;
import no.nordicsemi.android.dfu.internal.ArchiveInputStream;
import no.nordicsemi.android.dfu.internal.exception.DeviceDisconnectedException;
import no.nordicsemi.android.dfu.internal.exception.RemoteDfuException;
import no.nordicsemi.android.dfu.internal.exception.RemoteDfuExtendedErrorException;
import no.nordicsemi.android.dfu.internal.exception.UnknownResponseException;

/* loaded from: classes2.dex */
public class SecureDfuImpl extends BaseCustomDfuImpl {
    public static final UUID DEFAULT_DFU_CONTROL_POINT_UUID;
    public static final UUID DEFAULT_DFU_PACKET_UUID;
    public static final UUID DEFAULT_DFU_SERVICE_UUID;
    public static UUID DFU_CONTROL_POINT_UUID = null;
    public static UUID DFU_PACKET_UUID = null;
    public static UUID DFU_SERVICE_UUID = null;
    private static final int DFU_STATUS_SUCCESS = 1;
    private static final int MAX_ATTEMPTS = 3;
    private static final int OBJECT_COMMAND = 1;
    private static final int OBJECT_DATA = 2;
    private static final byte[] OP_CODE_CALCULATE_CHECKSUM;
    private static final int OP_CODE_CALCULATE_CHECKSUM_KEY = 3;
    private static final byte[] OP_CODE_CREATE_COMMAND;
    private static final byte[] OP_CODE_CREATE_DATA;
    private static final int OP_CODE_CREATE_KEY = 1;
    private static final byte[] OP_CODE_EXECUTE;
    private static final int OP_CODE_EXECUTE_KEY = 4;
    private static final byte[] OP_CODE_PACKET_RECEIPT_NOTIF_REQ;
    private static final int OP_CODE_PACKET_RECEIPT_NOTIF_REQ_KEY = 2;
    private static final int OP_CODE_RESPONSE_CODE_KEY = 96;
    private static final byte[] OP_CODE_SELECT_OBJECT;
    private static final int OP_CODE_SELECT_OBJECT_KEY = 6;
    private final SecureBluetoothCallback mBluetoothCallback;
    private BluetoothGattCharacteristic mControlPointCharacteristic;
    private BluetoothGattCharacteristic mPacketCharacteristic;
    private long prepareObjectDelay;

    /* loaded from: classes2.dex */
    public static class ObjectChecksum {
        public int CRC32;
        public int offset;

        private ObjectChecksum() {
        }
    }

    /* loaded from: classes2.dex */
    public static class ObjectInfo extends ObjectChecksum {
        public int maxSize;

        private ObjectInfo() {
            super();
        }
    }

    /* loaded from: classes2.dex */
    public class SecureBluetoothCallback extends BaseCustomDfuImpl.BaseCustomBluetoothCallback {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SecureBluetoothCallback() {
            super();
            SecureDfuImpl.this = r1;
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            if (bluetoothGattCharacteristic.getValue() != null && bluetoothGattCharacteristic.getValue().length >= 3) {
                if (bluetoothGattCharacteristic.getIntValue(17, 0).intValue() == 96) {
                    if (bluetoothGattCharacteristic.getIntValue(17, 1).intValue() != 3) {
                        if (!SecureDfuImpl.this.mRemoteErrorOccurred) {
                            if (bluetoothGattCharacteristic.getIntValue(17, 2).intValue() != 1) {
                                SecureDfuImpl.this.mRemoteErrorOccurred = true;
                            }
                            handleNotification(bluetoothGatt, bluetoothGattCharacteristic);
                        }
                    } else {
                        int intValue = bluetoothGattCharacteristic.getIntValue(20, 3).intValue();
                        if (((int) (((ArchiveInputStream) SecureDfuImpl.this.mFirmwareStream).getCrc32() & 4294967295L)) == bluetoothGattCharacteristic.getIntValue(20, 7).intValue()) {
                            SecureDfuImpl.this.mProgressInfo.setBytesReceived(intValue);
                        } else {
                            SecureDfuImpl secureDfuImpl = SecureDfuImpl.this;
                            if (secureDfuImpl.mFirmwareUploadInProgress) {
                                secureDfuImpl.mFirmwareUploadInProgress = false;
                                secureDfuImpl.notifyLock();
                                return;
                            }
                        }
                        handlePacketReceiptNotification(bluetoothGatt, bluetoothGattCharacteristic);
                    }
                } else {
                    SecureDfuImpl secureDfuImpl2 = SecureDfuImpl.this;
                    StringBuilder a10 = d.a("Invalid response: ");
                    a10.append(parse(bluetoothGattCharacteristic));
                    secureDfuImpl2.loge(a10.toString());
                    SecureDfuImpl.this.mError = DfuBaseService.ERROR_INVALID_RESPONSE;
                }
                SecureDfuImpl.this.notifyLock();
                return;
            }
            SecureDfuImpl secureDfuImpl3 = SecureDfuImpl.this;
            StringBuilder a11 = d.a("Empty response: ");
            a11.append(parse(bluetoothGattCharacteristic));
            secureDfuImpl3.loge(a11.toString());
            SecureDfuImpl secureDfuImpl4 = SecureDfuImpl.this;
            secureDfuImpl4.mError = DfuBaseService.ERROR_INVALID_RESPONSE;
            secureDfuImpl4.notifyLock();
        }
    }

    static {
        UUID uuid = new UUID(279658205548544L, -9223371485494954757L);
        DEFAULT_DFU_SERVICE_UUID = uuid;
        UUID uuid2 = new UUID(-8157989241631715488L, -6937650605005804976L);
        DEFAULT_DFU_CONTROL_POINT_UUID = uuid2;
        UUID uuid3 = new UUID(-8157989237336748192L, -6937650605005804976L);
        DEFAULT_DFU_PACKET_UUID = uuid3;
        DFU_SERVICE_UUID = uuid;
        DFU_CONTROL_POINT_UUID = uuid2;
        DFU_PACKET_UUID = uuid3;
        OP_CODE_CREATE_COMMAND = new byte[]{1, 1, 0, 0, 0, 0};
        OP_CODE_CREATE_DATA = new byte[]{1, 2, 0, 0, 0, 0};
        OP_CODE_PACKET_RECEIPT_NOTIF_REQ = new byte[]{2, 0, 0};
        OP_CODE_CALCULATE_CHECKSUM = new byte[]{3};
        OP_CODE_EXECUTE = new byte[]{4};
        OP_CODE_SELECT_OBJECT = new byte[]{6, 0};
    }

    public SecureDfuImpl(Intent intent, DfuBaseService dfuBaseService) {
        super(intent, dfuBaseService);
        this.mBluetoothCallback = new SecureBluetoothCallback();
    }

    private int getStatusCode(byte[] bArr, int i10) {
        byte b10;
        if (bArr != null && bArr.length >= 3 && bArr[0] == 96 && bArr[1] == i10 && ((b10 = bArr[2]) == 1 || b10 == 2 || b10 == 3 || b10 == 4 || b10 == 5 || b10 == 7 || b10 == 8 || b10 == 10 || b10 == 11)) {
            return b10;
        }
        throw new UnknownResponseException("Invalid response received", bArr, 96, i10);
    }

    private ObjectChecksum readChecksum() {
        if (this.mConnected) {
            writeOpCode(this.mControlPointCharacteristic, OP_CODE_CALCULATE_CHECKSUM);
            byte[] readNotificationResponse = readNotificationResponse();
            int statusCode = getStatusCode(readNotificationResponse, 3);
            if (statusCode != 11) {
                if (statusCode == 1) {
                    ObjectChecksum objectChecksum = new ObjectChecksum();
                    objectChecksum.offset = unsignedBytesToInt(readNotificationResponse, 3);
                    objectChecksum.CRC32 = unsignedBytesToInt(readNotificationResponse, 7);
                    return objectChecksum;
                }
                throw new RemoteDfuException("Receiving Checksum failed", statusCode);
            }
            throw new RemoteDfuExtendedErrorException("Receiving Checksum failed", readNotificationResponse[3]);
        }
        throw new DeviceDisconnectedException("Unable to read Checksum: device disconnected");
    }

    private ObjectInfo selectObject(int i10) {
        if (this.mConnected) {
            byte[] bArr = OP_CODE_SELECT_OBJECT;
            bArr[1] = (byte) i10;
            writeOpCode(this.mControlPointCharacteristic, bArr);
            byte[] readNotificationResponse = readNotificationResponse();
            int statusCode = getStatusCode(readNotificationResponse, 6);
            if (statusCode != 11) {
                if (statusCode == 1) {
                    ObjectInfo objectInfo = new ObjectInfo();
                    objectInfo.maxSize = unsignedBytesToInt(readNotificationResponse, 3);
                    objectInfo.offset = unsignedBytesToInt(readNotificationResponse, 7);
                    objectInfo.CRC32 = unsignedBytesToInt(readNotificationResponse, 11);
                    return objectInfo;
                }
                throw new RemoteDfuException("Selecting object failed", statusCode);
            }
            throw new RemoteDfuExtendedErrorException("Selecting object failed", readNotificationResponse[3]);
        }
        throw new DeviceDisconnectedException("Unable to read object info: device disconnected");
    }

    private void sendFirmware(BluetoothGatt bluetoothGatt) {
        int i10;
        int i11;
        String str;
        boolean z10;
        String str2;
        boolean z11;
        int i12 = this.mPacketsBeforeNotification;
        if (i12 > 0) {
            setPacketReceiptNotifications(i12);
            DfuBaseService dfuBaseService = this.mService;
            dfuBaseService.sendLogBroadcast(10, "Packet Receipt Notif Req (Op Code = 2) sent (Value = " + i12 + ")");
        }
        logi("Setting object to Data (Op Code = 6, Type = 2)");
        ObjectInfo selectObject = selectObject(2);
        Locale locale = Locale.US;
        logi(String.format(locale, "Data object info received (Max size = %d, Offset = %d, CRC = %08X)", Integer.valueOf(selectObject.maxSize), Integer.valueOf(selectObject.offset), Integer.valueOf(selectObject.CRC32)));
        this.mService.sendLogBroadcast(10, String.format(locale, "Data object info received (Max size = %d, Offset = %d, CRC = %08X)", Integer.valueOf(selectObject.maxSize), Integer.valueOf(selectObject.offset), Integer.valueOf(selectObject.CRC32)));
        this.mProgressInfo.setMaxObjectSizeInBytes(selectObject.maxSize);
        int i13 = this.mImageSizeInBytes;
        int i14 = selectObject.maxSize;
        int i15 = ((i13 + i14) - 1) / i14;
        int i16 = selectObject.offset;
        if (i16 > 0) {
            try {
                int i17 = i16 / i14;
                int i18 = i14 * i17;
                int i19 = i16 - i18;
                if (i19 == 0) {
                    i18 -= i14;
                } else {
                    i14 = i19;
                }
                if (i18 > 0) {
                    i10 = i17;
                    this.mFirmwareStream.read(new byte[i18]);
                    this.mFirmwareStream.mark(selectObject.maxSize);
                } else {
                    i10 = i17;
                }
                this.mFirmwareStream.read(new byte[i14]);
                i11 = i15;
                str = ")";
                if (((int) (((ArchiveInputStream) this.mFirmwareStream).getCrc32() & 4294967295L)) == selectObject.CRC32) {
                    logi(selectObject.offset + " bytes of data sent before, CRC match");
                    DfuBaseService dfuBaseService2 = this.mService;
                    dfuBaseService2.sendLogBroadcast(10, selectObject.offset + " bytes of data sent before, CRC match");
                    this.mProgressInfo.setBytesSent(selectObject.offset);
                    this.mProgressInfo.setBytesReceived(selectObject.offset);
                    if (i14 == selectObject.maxSize && selectObject.offset < this.mImageSizeInBytes) {
                        logi("Executing data object (Op Code = 4)");
                        try {
                            writeExecute();
                            this.mService.sendLogBroadcast(10, "Data object executed");
                        } catch (RemoteDfuException e10) {
                            if (e10.getErrorNumber() == 8) {
                                this.mService.sendLogBroadcast(10, "Data object already executed");
                                this.mRemoteErrorOccurred = false;
                            } else {
                                throw e10;
                            }
                        }
                    } else {
                        z10 = true;
                    }
                } else {
                    logi(selectObject.offset + " bytes sent before, CRC does not match");
                    DfuBaseService dfuBaseService3 = this.mService;
                    dfuBaseService3.sendLogBroadcast(15, selectObject.offset + " bytes sent before, CRC does not match");
                    this.mProgressInfo.setBytesSent(i18);
                    this.mProgressInfo.setBytesReceived(i18);
                    selectObject.offset = selectObject.offset - i14;
                    selectObject.CRC32 = 0;
                    this.mFirmwareStream.reset();
                    logi("Resuming from byte " + selectObject.offset + "...");
                    DfuBaseService dfuBaseService4 = this.mService;
                    dfuBaseService4.sendLogBroadcast(10, "Resuming from byte " + selectObject.offset + "...");
                }
                z10 = false;
            } catch (IOException e11) {
                loge("Error while reading firmware stream", e11);
                this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_FILE_IO_EXCEPTION);
                return;
            }
        } else {
            i11 = i15;
            str = ")";
            this.mProgressInfo.setBytesSent(0);
            z10 = false;
            i10 = 0;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (selectObject.offset < this.mImageSizeInBytes) {
            int i20 = 1;
            while (this.mProgressInfo.getAvailableObjectSizeIsBytes() > 0) {
                if (!z10) {
                    int availableObjectSizeIsBytes = this.mProgressInfo.getAvailableObjectSizeIsBytes();
                    StringBuilder a10 = e2.a("Creating Data object (Op Code = 1, Type = 2, Size = ", availableObjectSizeIsBytes, ") (");
                    int i21 = i10 + 1;
                    a10.append(i21);
                    boolean z12 = z10;
                    a10.append("/");
                    a10.append(i11);
                    a10.append(str);
                    logi(a10.toString());
                    writeCreateRequest(2, availableObjectSizeIsBytes);
                    DfuBaseService dfuBaseService5 = this.mService;
                    StringBuilder sb2 = new StringBuilder();
                    str2 = str;
                    sb2.append("Data object (");
                    sb2.append(i21);
                    sb2.append("/");
                    sb2.append(i11);
                    sb2.append(") created");
                    dfuBaseService5.sendLogBroadcast(10, sb2.toString());
                    long j10 = this.prepareObjectDelay;
                    if (j10 > 0 || i11 == 0) {
                        DfuBaseService dfuBaseService6 = this.mService;
                        if (j10 <= 0) {
                            j10 = 400;
                        }
                        dfuBaseService6.waitFor(j10);
                    }
                    this.mService.sendLogBroadcast(10, "Uploading firmware...");
                    z11 = z12;
                } else {
                    str2 = str;
                    this.mService.sendLogBroadcast(10, "Resuming uploading firmware...");
                    z11 = false;
                }
                try {
                    logi("Uploading firmware...");
                    uploadFirmwareImage(this.mPacketCharacteristic);
                    logi("Sending Calculate Checksum command (Op Code = 3)");
                    ObjectChecksum readChecksum = readChecksum();
                    Locale locale2 = Locale.US;
                    logi(String.format(locale2, "Checksum received (Offset = %d, CRC = %08X)", Integer.valueOf(readChecksum.offset), Integer.valueOf(readChecksum.CRC32)));
                    boolean z13 = z11;
                    this.mService.sendLogBroadcast(10, String.format(locale2, "Checksum received (Offset = %d, CRC = %08X)", Integer.valueOf(readChecksum.offset), Integer.valueOf(readChecksum.CRC32)));
                    int bytesSent = this.mProgressInfo.getBytesSent() - readChecksum.offset;
                    if (bytesSent > 0) {
                        logw(bytesSent + " bytes were lost!");
                        DfuBaseService dfuBaseService7 = this.mService;
                        dfuBaseService7.sendLogBroadcast(15, bytesSent + " bytes were lost");
                        try {
                            this.mFirmwareStream.reset();
                            this.mFirmwareStream.read(new byte[selectObject.maxSize - bytesSent]);
                            this.mProgressInfo.setBytesSent(readChecksum.offset);
                            int i22 = this.mPacketsBeforeNotification;
                            if (i22 == 0 || i22 > 1) {
                                this.mPacketsBeforeNotification = 1;
                                setPacketReceiptNotifications(1);
                                this.mService.sendLogBroadcast(10, "Packet Receipt Notif Req (Op Code = 2) sent (Value = 1)");
                            }
                        } catch (IOException e12) {
                            loge("Error while reading firmware stream", e12);
                            this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_FILE_IO_EXCEPTION);
                            return;
                        } catch (Throwable th2) {
                            StringBuilder a11 = d.a("Progress lost. Bytes sent: ");
                            a11.append(this.mProgressInfo.getBytesSent());
                            loge(a11.toString(), th2);
                            this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_PROGRESS_LOST);
                            return;
                        }
                    }
                    int crc32 = (int) (((ArchiveInputStream) this.mFirmwareStream).getCrc32() & 4294967295L);
                    if (crc32 == readChecksum.CRC32) {
                        if (bytesSent > 0) {
                            z10 = true;
                            str = str2;
                        } else {
                            logi("Executing data object (Op Code = 4)");
                            writeExecute(this.mProgressInfo.isComplete());
                            this.mService.sendLogBroadcast(10, "Data object executed");
                            i10++;
                            this.mFirmwareStream.mark(0);
                            i20 = 1;
                        }
                    } else {
                        String format = String.format(locale2, "CRC does not match! Expected %08X but found %08X.", Integer.valueOf(crc32), Integer.valueOf(readChecksum.CRC32));
                        if (i20 < 3) {
                            i20++;
                            StringBuilder a12 = d.a(format);
                            a12.append(String.format(locale2, " Retrying...(%d/%d)", Integer.valueOf(i20), 3));
                            String sb3 = a12.toString();
                            logi(sb3);
                            this.mService.sendLogBroadcast(15, sb3);
                            try {
                                this.mFirmwareStream.reset();
                                this.mProgressInfo.setBytesSent(((ArchiveInputStream) this.mFirmwareStream).getBytesRead());
                            } catch (IOException e13) {
                                loge("Error while resetting the firmware stream", e13);
                                this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_FILE_IO_EXCEPTION);
                                return;
                            }
                        } else {
                            loge(format);
                            this.mService.sendLogBroadcast(20, format);
                            this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_CRC_ERROR);
                            return;
                        }
                    }
                    str = str2;
                    z10 = z13;
                } catch (DeviceDisconnectedException e14) {
                    loge("Disconnected while sending data");
                    throw e14;
                }
            }
        } else {
            logi("Executing data object (Op Code = 4)");
            writeExecute(true);
            this.mService.sendLogBroadcast(10, "Data object executed");
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        StringBuilder a13 = d.a("Transfer of ");
        a13.append(this.mProgressInfo.getBytesSent() - selectObject.offset);
        a13.append(" bytes has taken ");
        long j11 = elapsedRealtime2 - elapsedRealtime;
        a13.append(j11);
        a13.append(" ms");
        logi(a13.toString());
        DfuBaseService dfuBaseService8 = this.mService;
        dfuBaseService8.sendLogBroadcast(10, "Upload completed in " + j11 + " ms");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void sendInitPacket(android.bluetooth.BluetoothGatt r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: no.nordicsemi.android.dfu.SecureDfuImpl.sendInitPacket(android.bluetooth.BluetoothGatt, boolean):void");
    }

    private void setNumberOfPackets(byte[] bArr, int i10) {
        bArr[1] = (byte) (i10 & 255);
        bArr[2] = (byte) ((i10 >> 8) & 255);
    }

    private void setObjectSize(byte[] bArr, int i10) {
        bArr[2] = (byte) (i10 & 255);
        bArr[3] = (byte) ((i10 >> 8) & 255);
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 24) & 255);
    }

    private void setPacketReceiptNotifications(int i10) {
        if (this.mConnected) {
            logi(i.a("Sending the number of packets before notifications (Op Code = 2, Value = ", i10, ")"));
            byte[] bArr = OP_CODE_PACKET_RECEIPT_NOTIF_REQ;
            setNumberOfPackets(bArr, i10);
            writeOpCode(this.mControlPointCharacteristic, bArr);
            byte[] readNotificationResponse = readNotificationResponse();
            int statusCode = getStatusCode(readNotificationResponse, 2);
            if (statusCode != 11) {
                if (statusCode == 1) {
                    return;
                }
                throw new RemoteDfuException("Sending the number of packets failed", statusCode);
            }
            throw new RemoteDfuExtendedErrorException("Sending the number of packets failed", readNotificationResponse[3]);
        }
        throw new DeviceDisconnectedException("Unable to read Checksum: device disconnected");
    }

    private int unsignedBytesToInt(byte[] bArr, int i10) {
        return (bArr[i10] & 255) + ((bArr[i10 + 1] & 255) << 8) + ((bArr[i10 + 2] & 255) << 16) + ((bArr[i10 + 3] & 255) << 24);
    }

    private void writeCreateRequest(int i10, int i11) {
        if (!this.mConnected) {
            throw new DeviceDisconnectedException("Unable to create object: device disconnected");
        }
        byte[] bArr = i10 == 1 ? OP_CODE_CREATE_COMMAND : OP_CODE_CREATE_DATA;
        setObjectSize(bArr, i11);
        writeOpCode(this.mControlPointCharacteristic, bArr);
        byte[] readNotificationResponse = readNotificationResponse();
        int statusCode = getStatusCode(readNotificationResponse, 1);
        if (statusCode == 11) {
            throw new RemoteDfuExtendedErrorException("Creating Command object failed", readNotificationResponse[3]);
        }
        if (statusCode != 1) {
            throw new RemoteDfuException("Creating Command object failed", statusCode);
        }
    }

    private void writeExecute() {
        if (!this.mConnected) {
            throw new DeviceDisconnectedException("Unable to read Checksum: device disconnected");
        }
        writeOpCode(this.mControlPointCharacteristic, OP_CODE_EXECUTE);
        byte[] readNotificationResponse = readNotificationResponse();
        int statusCode = getStatusCode(readNotificationResponse, 4);
        if (statusCode == 11) {
            throw new RemoteDfuExtendedErrorException("Executing object failed", readNotificationResponse[3]);
        }
        if (statusCode != 1) {
            throw new RemoteDfuException("Executing object failed", statusCode);
        }
    }

    private void writeExecute(boolean z10) {
        try {
            writeExecute();
        } catch (RemoteDfuException e10) {
            if (!z10 || e10.getErrorNumber() != 5) {
                throw e10;
            }
            logw(e10.getMessage() + ": " + hb.d.g(517));
            if (this.mFileType == 1) {
                logw("Are you sure your new SoftDevice is API compatible with the updated one? If not, update the bootloader as well");
            }
            this.mService.sendLogBroadcast(15, String.format(Locale.US, "Remote DFU error: %s. SD busy? Retrying...", hb.d.g(517)));
            logi("SD busy? Retrying...");
            logi("Executing data object (Op Code = 4)");
            writeExecute();
        }
    }

    private void writeOpCode(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        writeOpCode(bluetoothGattCharacteristic, bArr, false);
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
    public BaseDfuImpl.BaseBluetoothGattCallback getGattCallback() {
        return this.mBluetoothCallback;
    }

    @Override // no.nordicsemi.android.dfu.BaseCustomDfuImpl
    public UUID getPacketCharacteristicUUID() {
        return DFU_PACKET_UUID;
    }

    @Override // no.nordicsemi.android.dfu.BaseDfuImpl, no.nordicsemi.android.dfu.DfuService
    public boolean initialize(Intent intent, BluetoothGatt bluetoothGatt, int i10, InputStream inputStream, InputStream inputStream2) {
        if (inputStream2 == null) {
            this.mService.sendLogBroadcast(20, "The Init packet is required by this version DFU Bootloader");
            this.mService.terminateConnection(bluetoothGatt, DfuBaseService.ERROR_INIT_PACKET_REQUIRED);
            return false;
        }
        return super.initialize(intent, bluetoothGatt, i10, inputStream, inputStream2);
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

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(1:3)|4|5|6|(6:11|(1:13)|14|15|16|17)|25|(0)|14|15|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0067, code lost:
        if (r8.mProgressInfo.isLastPart() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0069, code lost:
        r8.mRemoteErrorOccurred = false;
        logw("Sending SD+BL failed. Trying to send App only");
        r8.mService.sendLogBroadcast(15, "Invalid system components. Trying to send application");
        r8.mFileType = 4;
        r5 = (no.nordicsemi.android.dfu.internal.ArchiveInputStream) r8.mFirmwareStream;
        r5.setContentType(4);
        r0 = r5.getApplicationInit();
        r8.mInitPacketStream = new java.io.ByteArrayInputStream(r0);
        r8.mInitPacketSizeInBytes = r0.length;
        r0 = r5.applicationImageSize();
        r8.mImageSizeInBytes = r0;
        r8.mProgressInfo.init(r0, 2, 2);
        sendInitPacket(r1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00bb, code lost:
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0057 A[Catch: RemoteDfuException -> 0x00bc, UnknownResponseException -> 0x0143, UploadAbortedException -> 0x015c, TRY_LEAVE, TryCatch #2 {RemoteDfuException -> 0x00bc, blocks: (B:44:0x0037, B:46:0x004b, B:52:0x0057, B:56:0x0061, B:58:0x0069, B:60:0x00bb, B:59:0x00a0), top: B:74:0x0037 }] */
    @Override // no.nordicsemi.android.dfu.DfuService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void performDfu(android.content.Intent r9) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: no.nordicsemi.android.dfu.SecureDfuImpl.performDfu(android.content.Intent):void");
    }
}
