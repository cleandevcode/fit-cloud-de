package no.nordicsemi.android.dfu;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelUuid;
import android.os.Parcelable;
import java.security.InvalidParameterException;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class DfuServiceInitiator {
    public static final int DEFAULT_MBR_SIZE = 4096;
    public static final int DEFAULT_PRN_VALUE = 12;
    public static final long DEFAULT_SCAN_TIMEOUT = 5000;
    public static final int SCOPE_APPLICATION = 2;
    public static final int SCOPE_SYSTEM_COMPONENTS = 1;
    private Parcelable[] buttonlessDfuWithBondSharingUuids;
    private Parcelable[] buttonlessDfuWithoutBondSharingUuids;
    private final String deviceAddress;
    private String deviceName;
    private Parcelable[] experimentalButtonlessDfuUuids;
    private String filePath;
    private int fileResId;
    private Uri fileUri;
    private String initFilePath;
    private int initFileResId;
    private Uri initFileUri;
    private boolean keepBond;
    private Parcelable[] legacyDfuUuids;
    private String mimeType;
    private Boolean packetReceiptNotificationsEnabled;
    private boolean restoreBond;
    private Parcelable[] secureDfuUuids;
    private boolean disableNotification = false;
    private boolean startAsForegroundService = true;
    private int fileType = -1;
    private boolean forceDfu = false;
    private boolean forceScanningForNewAddressInLegacyDfu = false;
    private boolean enableUnsafeExperimentalButtonlessDfu = false;
    private boolean disableResume = false;
    private int numberOfRetries = 0;
    private int mbrSize = 4096;
    private long dataObjectDelay = 0;
    private long rebootTime = 0;
    private long scanTimeout = DEFAULT_SCAN_TIMEOUT;
    private int numberOfPackets = 12;
    private int mtu = 517;
    private int currentMtu = 23;

    public DfuServiceInitiator(String str) {
        this.deviceAddress = str;
    }

    public static void createDfuNotificationChannel(Context context) {
        NotificationChannel notificationChannel = new NotificationChannel(DfuBaseService.NOTIFICATION_CHANNEL_DFU, context.getString(R.string.dfu_channel_name), 2);
        notificationChannel.setDescription(context.getString(R.string.dfu_channel_description));
        notificationChannel.setShowBadge(false);
        notificationChannel.setLockscreenVisibility(1);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    private DfuServiceInitiator init(Uri uri, String str, int i10) {
        if (DfuBaseService.MIME_TYPE_ZIP.equals(this.mimeType)) {
            throw new InvalidParameterException("Init file must be located inside the ZIP");
        }
        this.initFileUri = uri;
        this.initFilePath = str;
        this.initFileResId = i10;
        return this;
    }

    private DfuServiceInitiator init(Uri uri, String str, int i10, int i11, String str2) {
        this.fileUri = uri;
        this.filePath = str;
        this.fileResId = i10;
        this.fileType = i11;
        this.mimeType = str2;
        if (DfuBaseService.MIME_TYPE_ZIP.equals(str2)) {
            this.initFileUri = null;
            this.initFilePath = null;
            this.initFileResId = 0;
        }
        return this;
    }

    public DfuServiceInitiator disableMtuRequest() {
        this.mtu = 0;
        return this;
    }

    public DfuServiceInitiator disableResume() {
        this.disableResume = true;
        return this;
    }

    @Deprecated
    public DfuServiceInitiator setBinOrHex(int i10, int i11) {
        if (i10 != 0) {
            return init(null, null, i11, i10, DfuBaseService.MIME_TYPE_OCTET_STREAM);
        }
        throw new UnsupportedOperationException("You must specify the file type");
    }

    @Deprecated
    public DfuServiceInitiator setBinOrHex(int i10, Uri uri) {
        if (i10 != 0) {
            return init(uri, null, 0, i10, DfuBaseService.MIME_TYPE_OCTET_STREAM);
        }
        throw new UnsupportedOperationException("You must specify the file type");
    }

    @Deprecated
    public DfuServiceInitiator setBinOrHex(int i10, Uri uri, String str) {
        if (i10 != 0) {
            return init(uri, str, 0, i10, DfuBaseService.MIME_TYPE_OCTET_STREAM);
        }
        throw new UnsupportedOperationException("You must specify the file type");
    }

    @Deprecated
    public DfuServiceInitiator setBinOrHex(int i10, String str) {
        if (i10 != 0) {
            return init(null, str, 0, i10, DfuBaseService.MIME_TYPE_OCTET_STREAM);
        }
        throw new UnsupportedOperationException("You must specify the file type");
    }

    public DfuServiceInitiator setCurrentMtu(int i10) {
        this.currentMtu = i10;
        return this;
    }

    public DfuServiceInitiator setCustomUuidsForButtonlessDfuWithBondSharing(UUID uuid, UUID uuid2) {
        ParcelUuid[] parcelUuidArr = new ParcelUuid[2];
        parcelUuidArr[0] = uuid != null ? new ParcelUuid(uuid) : null;
        parcelUuidArr[1] = uuid2 != null ? new ParcelUuid(uuid2) : null;
        this.buttonlessDfuWithBondSharingUuids = parcelUuidArr;
        return this;
    }

    public DfuServiceInitiator setCustomUuidsForButtonlessDfuWithoutBondSharing(UUID uuid, UUID uuid2) {
        ParcelUuid[] parcelUuidArr = new ParcelUuid[2];
        parcelUuidArr[0] = uuid != null ? new ParcelUuid(uuid) : null;
        parcelUuidArr[1] = uuid2 != null ? new ParcelUuid(uuid2) : null;
        this.buttonlessDfuWithoutBondSharingUuids = parcelUuidArr;
        return this;
    }

    public DfuServiceInitiator setCustomUuidsForExperimentalButtonlessDfu(UUID uuid, UUID uuid2) {
        ParcelUuid[] parcelUuidArr = new ParcelUuid[2];
        parcelUuidArr[0] = uuid != null ? new ParcelUuid(uuid) : null;
        parcelUuidArr[1] = uuid2 != null ? new ParcelUuid(uuid2) : null;
        this.experimentalButtonlessDfuUuids = parcelUuidArr;
        return this;
    }

    public DfuServiceInitiator setCustomUuidsForLegacyDfu(UUID uuid, UUID uuid2, UUID uuid3, UUID uuid4) {
        ParcelUuid[] parcelUuidArr = new ParcelUuid[4];
        parcelUuidArr[0] = uuid != null ? new ParcelUuid(uuid) : null;
        parcelUuidArr[1] = uuid2 != null ? new ParcelUuid(uuid2) : null;
        parcelUuidArr[2] = uuid3 != null ? new ParcelUuid(uuid3) : null;
        parcelUuidArr[3] = uuid4 != null ? new ParcelUuid(uuid4) : null;
        this.legacyDfuUuids = parcelUuidArr;
        return this;
    }

    public DfuServiceInitiator setCustomUuidsForSecureDfu(UUID uuid, UUID uuid2, UUID uuid3) {
        ParcelUuid[] parcelUuidArr = new ParcelUuid[3];
        parcelUuidArr[0] = uuid != null ? new ParcelUuid(uuid) : null;
        parcelUuidArr[1] = uuid2 != null ? new ParcelUuid(uuid2) : null;
        parcelUuidArr[2] = uuid3 != null ? new ParcelUuid(uuid3) : null;
        this.secureDfuUuids = parcelUuidArr;
        return this;
    }

    public DfuServiceInitiator setDeviceName(String str) {
        this.deviceName = str;
        return this;
    }

    public DfuServiceInitiator setDisableNotification(boolean z10) {
        this.disableNotification = z10;
        return this;
    }

    public DfuServiceInitiator setForceDfu(boolean z10) {
        this.forceDfu = z10;
        return this;
    }

    public DfuServiceInitiator setForceScanningForNewAddressInLegacyDfu(boolean z10) {
        this.forceScanningForNewAddressInLegacyDfu = z10;
        return this;
    }

    public DfuServiceInitiator setForeground(boolean z10) {
        this.startAsForegroundService = z10;
        return this;
    }

    @Deprecated
    public DfuServiceInitiator setInitFile(int i10) {
        return init(null, null, i10);
    }

    @Deprecated
    public DfuServiceInitiator setInitFile(Uri uri) {
        return init(uri, null, 0);
    }

    @Deprecated
    public DfuServiceInitiator setInitFile(Uri uri, String str) {
        return init(uri, str, 0);
    }

    @Deprecated
    public DfuServiceInitiator setInitFile(String str) {
        return init(null, str, 0);
    }

    public DfuServiceInitiator setKeepBond(boolean z10) {
        this.keepBond = z10;
        return this;
    }

    public DfuServiceInitiator setMbrSize(int i10) {
        this.mbrSize = i10;
        return this;
    }

    public DfuServiceInitiator setMtu(int i10) {
        this.mtu = i10;
        return this;
    }

    public DfuServiceInitiator setNumberOfRetries(int i10) {
        this.numberOfRetries = i10;
        return this;
    }

    public DfuServiceInitiator setPacketsReceiptNotificationsEnabled(boolean z10) {
        this.packetReceiptNotificationsEnabled = Boolean.valueOf(z10);
        return this;
    }

    public DfuServiceInitiator setPacketsReceiptNotificationsValue(int i10) {
        if (i10 <= 0) {
            i10 = 12;
        }
        this.numberOfPackets = i10;
        return this;
    }

    public DfuServiceInitiator setPrepareDataObjectDelay(long j10) {
        this.dataObjectDelay = j10;
        return this;
    }

    public DfuServiceInitiator setRebootTime(long j10) {
        this.rebootTime = j10;
        return this;
    }

    public DfuServiceInitiator setRestoreBond(boolean z10) {
        this.restoreBond = z10;
        return this;
    }

    public DfuServiceInitiator setScanTimeout(long j10) {
        this.scanTimeout = j10;
        return this;
    }

    public DfuServiceInitiator setScope(int i10) {
        int i11;
        if (DfuBaseService.MIME_TYPE_ZIP.equals(this.mimeType)) {
            if (i10 == 2) {
                i11 = 4;
            } else if (i10 == 1) {
                this.fileType = 3;
                return this;
            } else if (i10 != 3) {
                throw new UnsupportedOperationException("Unknown scope");
            } else {
                i11 = 0;
            }
            this.fileType = i11;
            return this;
        }
        throw new UnsupportedOperationException("Scope can be set only for a ZIP file");
    }

    public DfuServiceInitiator setUnsafeExperimentalButtonlessServiceInSecureDfuEnabled(boolean z10) {
        this.enableUnsafeExperimentalButtonlessDfu = z10;
        return this;
    }

    public DfuServiceInitiator setZip(int i10) {
        return init(null, null, i10, 0, DfuBaseService.MIME_TYPE_ZIP);
    }

    public DfuServiceInitiator setZip(Uri uri) {
        return init(uri, null, 0, 0, DfuBaseService.MIME_TYPE_ZIP);
    }

    public DfuServiceInitiator setZip(Uri uri, String str) {
        return init(uri, str, 0, 0, DfuBaseService.MIME_TYPE_ZIP);
    }

    public DfuServiceInitiator setZip(String str) {
        return init(null, str, 0, 0, DfuBaseService.MIME_TYPE_ZIP);
    }

    public DfuServiceController start(Context context, Class<? extends DfuBaseService> cls) {
        if (this.fileType != -1) {
            Intent intent = new Intent(context, cls);
            intent.putExtra(DfuBaseService.EXTRA_DEVICE_ADDRESS, this.deviceAddress);
            intent.putExtra(DfuBaseService.EXTRA_DEVICE_NAME, this.deviceName);
            intent.putExtra(DfuBaseService.EXTRA_DISABLE_NOTIFICATION, this.disableNotification);
            intent.putExtra(DfuBaseService.EXTRA_FOREGROUND_SERVICE, this.startAsForegroundService);
            intent.putExtra(DfuBaseService.EXTRA_FILE_MIME_TYPE, this.mimeType);
            intent.putExtra(DfuBaseService.EXTRA_FILE_TYPE, this.fileType);
            intent.putExtra(DfuBaseService.EXTRA_FILE_URI, this.fileUri);
            intent.putExtra(DfuBaseService.EXTRA_FILE_PATH, this.filePath);
            intent.putExtra(DfuBaseService.EXTRA_FILE_RES_ID, this.fileResId);
            intent.putExtra(DfuBaseService.EXTRA_INIT_FILE_URI, this.initFileUri);
            intent.putExtra(DfuBaseService.EXTRA_INIT_FILE_PATH, this.initFilePath);
            intent.putExtra(DfuBaseService.EXTRA_INIT_FILE_RES_ID, this.initFileResId);
            intent.putExtra(DfuBaseService.EXTRA_KEEP_BOND, this.keepBond);
            intent.putExtra(DfuBaseService.EXTRA_RESTORE_BOND, this.restoreBond);
            intent.putExtra(DfuBaseService.EXTRA_FORCE_DFU, this.forceDfu);
            intent.putExtra(DfuBaseService.EXTRA_FORCE_SCANNING_FOR_BOOTLOADER_IN_LEGACY_DFU, this.forceScanningForNewAddressInLegacyDfu);
            intent.putExtra(DfuBaseService.EXTRA_DISABLE_RESUME, this.disableResume);
            intent.putExtra(DfuBaseService.EXTRA_MAX_DFU_ATTEMPTS, this.numberOfRetries);
            intent.putExtra(DfuBaseService.EXTRA_MBR_SIZE, this.mbrSize);
            intent.putExtra(DfuBaseService.EXTRA_DATA_OBJECT_DELAY, this.dataObjectDelay);
            intent.putExtra(DfuBaseService.EXTRA_SCAN_TIMEOUT, this.scanTimeout);
            intent.putExtra(DfuBaseService.EXTRA_SCAN_DELAY, this.rebootTime);
            int i10 = this.mtu;
            if (i10 > 0) {
                intent.putExtra(DfuBaseService.EXTRA_MTU, i10);
            }
            intent.putExtra(DfuBaseService.EXTRA_CURRENT_MTU, this.currentMtu);
            intent.putExtra(DfuBaseService.EXTRA_UNSAFE_EXPERIMENTAL_BUTTONLESS_DFU, this.enableUnsafeExperimentalButtonlessDfu);
            Boolean bool = this.packetReceiptNotificationsEnabled;
            if (bool != null) {
                intent.putExtra(DfuBaseService.EXTRA_PACKET_RECEIPT_NOTIFICATIONS_ENABLED, bool);
                intent.putExtra(DfuBaseService.EXTRA_PACKET_RECEIPT_NOTIFICATIONS_VALUE, this.numberOfPackets);
            }
            Parcelable[] parcelableArr = this.legacyDfuUuids;
            if (parcelableArr != null) {
                intent.putExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_LEGACY_DFU, parcelableArr);
            }
            Parcelable[] parcelableArr2 = this.secureDfuUuids;
            if (parcelableArr2 != null) {
                intent.putExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_SECURE_DFU, parcelableArr2);
            }
            Parcelable[] parcelableArr3 = this.experimentalButtonlessDfuUuids;
            if (parcelableArr3 != null) {
                intent.putExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_EXPERIMENTAL_BUTTONLESS_DFU, parcelableArr3);
            }
            Parcelable[] parcelableArr4 = this.buttonlessDfuWithoutBondSharingUuids;
            if (parcelableArr4 != null) {
                intent.putExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITHOUT_BOND_SHARING, parcelableArr4);
            }
            Parcelable[] parcelableArr5 = this.buttonlessDfuWithBondSharingUuids;
            if (parcelableArr5 != null) {
                intent.putExtra(DfuBaseService.EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITH_BOND_SHARING, parcelableArr5);
            }
            if (Build.VERSION.SDK_INT < 26 || !this.startAsForegroundService) {
                context.startService(intent);
            } else {
                context.startForegroundService(intent);
            }
            return new DfuServiceController(context);
        }
        throw new UnsupportedOperationException("You must specify the firmware file before starting the service");
    }
}
