package no.nordicsemi.android.dfu;

import a.b;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import no.nordicsemi.android.dfu.DfuProgressInfo;
import no.nordicsemi.android.dfu.internal.ArchiveInputStream;
import no.nordicsemi.android.dfu.internal.HexInputStream;
import x0.q;
import x0.s;

@SuppressLint({"MissingPermission"})
/* loaded from: classes2.dex */
public abstract class DfuBaseService extends IntentService implements DfuProgressInfo.ProgressListener {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int ACTION_ABORT = 2;
    public static final int ACTION_PAUSE = 0;
    public static final int ACTION_RESUME = 1;
    public static final String BROADCAST_ACTION = "no.nordicsemi.android.dfu.broadcast.BROADCAST_ACTION";
    public static final String BROADCAST_ERROR = "no.nordicsemi.android.dfu.broadcast.BROADCAST_ERROR";
    public static final String BROADCAST_LOG = "no.nordicsemi.android.dfu.broadcast.BROADCAST_LOG";
    public static final String BROADCAST_PROGRESS = "no.nordicsemi.android.dfu.broadcast.BROADCAST_PROGRESS";
    public static boolean DEBUG = false;
    public static final int ERROR_BLUETOOTH_DISABLED = 4106;
    public static final int ERROR_CONNECTION_MASK = 16384;
    public static final int ERROR_CONNECTION_STATE_MASK = 32768;
    public static final int ERROR_CRC_ERROR = 4109;
    public static final int ERROR_DEVICE_DISCONNECTED = 4096;
    public static final int ERROR_DEVICE_NOT_BONDED = 4110;
    public static final int ERROR_FILE_ERROR = 4098;
    public static final int ERROR_FILE_INVALID = 4099;
    public static final int ERROR_FILE_IO_EXCEPTION = 4100;
    public static final int ERROR_FILE_NOT_FOUND = 4097;
    public static final int ERROR_FILE_SIZE_INVALID = 4108;
    public static final int ERROR_FILE_TYPE_UNSUPPORTED = 4105;
    public static final int ERROR_INIT_PACKET_REQUIRED = 4107;
    public static final int ERROR_INVALID_RESPONSE = 4104;
    public static final int ERROR_MASK = 4096;
    public static final int ERROR_PROGRESS_LOST = 4111;
    public static final int ERROR_REMOTE_MASK = 8192;
    public static final int ERROR_REMOTE_TYPE_LEGACY = 256;
    public static final int ERROR_REMOTE_TYPE_SECURE = 512;
    public static final int ERROR_REMOTE_TYPE_SECURE_BUTTONLESS = 2048;
    public static final int ERROR_REMOTE_TYPE_SECURE_EXTENDED = 1024;
    public static final int ERROR_SERVICE_DISCOVERY_NOT_STARTED = 4101;
    public static final int ERROR_SERVICE_NOT_FOUND = 4102;
    public static final int ERROR_TYPE_COMMUNICATION = 2;
    public static final int ERROR_TYPE_COMMUNICATION_STATE = 1;
    public static final int ERROR_TYPE_DFU_REMOTE = 3;
    public static final int ERROR_TYPE_OTHER = 0;
    public static final String EXTRA_ACTION = "no.nordicsemi.android.dfu.extra.EXTRA_ACTION";
    public static final String EXTRA_AVG_SPEED_B_PER_MS = "no.nordicsemi.android.dfu.extra.EXTRA_AVG_SPEED_B_PER_MS";
    public static final String EXTRA_CURRENT_MTU = "no.nordicsemi.android.dfu.extra.EXTRA_CURRENT_MTU";
    public static final String EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITHOUT_BOND_SHARING = "no.nordicsemi.android.dfu.extra.EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITHOUT_BOND_SHARING";
    public static final String EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITH_BOND_SHARING = "no.nordicsemi.android.dfu.extra.EXTRA_CUSTOM_UUIDS_FOR_BUTTONLESS_DFU_WITH_BOND_SHARING";
    public static final String EXTRA_CUSTOM_UUIDS_FOR_EXPERIMENTAL_BUTTONLESS_DFU = "no.nordicsemi.android.dfu.extra.EXTRA_CUSTOM_UUIDS_FOR_EXPERIMENTAL_BUTTONLESS_DFU";
    public static final String EXTRA_CUSTOM_UUIDS_FOR_LEGACY_DFU = "no.nordicsemi.android.dfu.extra.EXTRA_CUSTOM_UUIDS_FOR_LEGACY_DFU";
    public static final String EXTRA_CUSTOM_UUIDS_FOR_SECURE_DFU = "no.nordicsemi.android.dfu.extra.EXTRA_CUSTOM_UUIDS_FOR_SECURE_DFU";
    public static final String EXTRA_DATA = "no.nordicsemi.android.dfu.extra.EXTRA_DATA";
    public static final String EXTRA_DATA_OBJECT_DELAY = "no.nordicsemi.android.dfu.extra.EXTRA_DATA_OBJECT_DELAY";
    public static final String EXTRA_DEVICE_ADDRESS = "no.nordicsemi.android.dfu.extra.EXTRA_DEVICE_ADDRESS";
    public static final String EXTRA_DEVICE_NAME = "no.nordicsemi.android.dfu.extra.EXTRA_DEVICE_NAME";
    public static final String EXTRA_DFU_ATTEMPT = "no.nordicsemi.android.dfu.extra.EXTRA_DFU_ATTEMPT";
    public static final String EXTRA_DISABLE_NOTIFICATION = "no.nordicsemi.android.dfu.extra.EXTRA_DISABLE_NOTIFICATION";
    public static final String EXTRA_DISABLE_RESUME = "no.nordicsemi.android.dfu.extra.EXTRA_DISABLE_RESUME";
    public static final String EXTRA_ERROR_TYPE = "no.nordicsemi.android.dfu.extra.EXTRA_ERROR_TYPE";
    public static final String EXTRA_FILE_MIME_TYPE = "no.nordicsemi.android.dfu.extra.EXTRA_MIME_TYPE";
    public static final String EXTRA_FILE_PATH = "no.nordicsemi.android.dfu.extra.EXTRA_FILE_PATH";
    public static final String EXTRA_FILE_RES_ID = "no.nordicsemi.android.dfu.extra.EXTRA_FILE_RES_ID";
    public static final String EXTRA_FILE_TYPE = "no.nordicsemi.android.dfu.extra.EXTRA_FILE_TYPE";
    public static final String EXTRA_FILE_URI = "no.nordicsemi.android.dfu.extra.EXTRA_FILE_URI";
    public static final String EXTRA_FORCE_DFU = "no.nordicsemi.android.dfu.extra.EXTRA_FORCE_DFU";
    public static final String EXTRA_FORCE_SCANNING_FOR_BOOTLOADER_IN_LEGACY_DFU = "no.nordicsemi.android.dfu.extra.EXTRA_FORCE_SCANNING_FOR_BOOTLOADER_IN_LEGACY_DFU";
    public static final String EXTRA_FOREGROUND_SERVICE = "no.nordicsemi.android.dfu.extra.EXTRA_FOREGROUND_SERVICE";
    public static final String EXTRA_INIT_FILE_PATH = "no.nordicsemi.android.dfu.extra.EXTRA_INIT_FILE_PATH";
    public static final String EXTRA_INIT_FILE_RES_ID = "no.nordicsemi.android.dfu.extra.EXTRA_INIT_FILE_RES_ID";
    public static final String EXTRA_INIT_FILE_URI = "no.nordicsemi.android.dfu.extra.EXTRA_INIT_FILE_URI";
    public static final String EXTRA_KEEP_BOND = "no.nordicsemi.android.dfu.extra.EXTRA_KEEP_BOND";
    public static final String EXTRA_LOG_LEVEL = "no.nordicsemi.android.dfu.extra.EXTRA_LOG_LEVEL";
    public static final String EXTRA_LOG_MESSAGE = "no.nordicsemi.android.dfu.extra.EXTRA_LOG_INFO";
    public static final String EXTRA_MAX_DFU_ATTEMPTS = "no.nordicsemi.android.dfu.extra.EXTRA_MAX_DFU_ATTEMPTS";
    public static final String EXTRA_MBR_SIZE = "no.nordicsemi.android.dfu.extra.EXTRA_MBR_SIZE";
    public static final String EXTRA_MTU = "no.nordicsemi.android.dfu.extra.EXTRA_MTU";
    public static final String EXTRA_PACKET_RECEIPT_NOTIFICATIONS_ENABLED = "no.nordicsemi.android.dfu.extra.EXTRA_PRN_ENABLED";
    public static final String EXTRA_PACKET_RECEIPT_NOTIFICATIONS_VALUE = "no.nordicsemi.android.dfu.extra.EXTRA_PRN_VALUE";
    public static final String EXTRA_PARTS_TOTAL = "no.nordicsemi.android.dfu.extra.EXTRA_PARTS_TOTAL";
    public static final String EXTRA_PART_CURRENT = "no.nordicsemi.android.dfu.extra.EXTRA_PART_CURRENT";
    public static final String EXTRA_PROGRESS = "no.nordicsemi.android.dfu.extra.EXTRA_PROGRESS";
    private static final String EXTRA_RECONNECTION_ATTEMPT = "no.nordicsemi.android.dfu.extra.EXTRA_RECONNECTION_ATTEMPT";
    public static final String EXTRA_RESTORE_BOND = "no.nordicsemi.android.dfu.extra.EXTRA_RESTORE_BOND";
    public static final String EXTRA_SCAN_DELAY = "no.nordicsemi.android.dfu.extra.EXTRA_SCAN_DELAY";
    public static final String EXTRA_SCAN_TIMEOUT = "no.nordicsemi.android.dfu.extra.EXTRA_SCAN_TIMEOUT";
    public static final String EXTRA_SPEED_B_PER_MS = "no.nordicsemi.android.dfu.extra.EXTRA_SPEED_B_PER_MS";
    public static final String EXTRA_UNSAFE_EXPERIMENTAL_BUTTONLESS_DFU = "no.nordicsemi.android.dfu.extra.EXTRA_UNSAFE_EXPERIMENTAL_BUTTONLESS_DFU";
    public static final int LOG_LEVEL_APPLICATION = 10;
    public static final int LOG_LEVEL_DEBUG = 0;
    public static final int LOG_LEVEL_ERROR = 20;
    public static final int LOG_LEVEL_INFO = 5;
    public static final int LOG_LEVEL_VERBOSE = 1;
    public static final int LOG_LEVEL_WARNING = 15;
    public static final String MIME_TYPE_OCTET_STREAM = "application/octet-stream";
    public static final String MIME_TYPE_ZIP = "application/zip";
    public static final String NOTIFICATION_CHANNEL_DFU = "dfu";
    public static final int NOTIFICATION_ID = 283;
    public static final int PROGRESS_ABORTED = -7;
    public static final int PROGRESS_COMPLETED = -6;
    public static final int PROGRESS_CONNECTING = -1;
    public static final int PROGRESS_DISCONNECTING = -5;
    public static final int PROGRESS_ENABLING_DFU_MODE = -3;
    public static final int PROGRESS_STARTING = -2;
    public static final int PROGRESS_VALIDATING = -4;
    public static final int STATE_CLOSED = -5;
    public static final int STATE_CONNECTED = -2;
    public static final int STATE_CONNECTED_AND_READY = -3;
    public static final int STATE_CONNECTING = -1;
    public static final int STATE_DISCONNECTED = 0;
    public static final int STATE_DISCONNECTING = -4;
    private static final String TAG = "DfuBaseService";
    public static final int TYPE_APPLICATION = 4;
    public static final int TYPE_AUTO = 0;
    public static final int TYPE_BOOTLOADER = 2;
    public static final int TYPE_SOFT_DEVICE = 1;
    private boolean mAborted;
    private BluetoothAdapter mBluetoothAdapter;
    private final BroadcastReceiver mBluetoothStateBroadcastReceiver;
    private final BroadcastReceiver mBondStateBroadcastReceiver;
    public int mConnectionState;
    private final BroadcastReceiver mConnectionStateBroadcastReceiver;
    private String mDeviceAddress;
    private String mDeviceName;
    private final BroadcastReceiver mDfuActionReceiver;
    private DfuCallback mDfuServiceImpl;
    private boolean mDisableNotification;
    private int mError;
    private InputStream mFirmwareInputStream;
    private final BluetoothGattCallback mGattCallback;
    private InputStream mInitFileInputStream;
    private long mLastNotificationTime;
    private int mLastProgress;
    private final Object mLock;
    public DfuProgressInfo mProgressInfo;

    public DfuBaseService() {
        super(TAG);
        this.mLock = new Object();
        this.mLastProgress = -1;
        this.mDfuActionReceiver = new BroadcastReceiver() { // from class: no.nordicsemi.android.dfu.DfuBaseService.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int intExtra = intent.getIntExtra(DfuBaseService.EXTRA_ACTION, 0);
                DfuBaseService dfuBaseService = DfuBaseService.this;
                dfuBaseService.logi("User action received: " + intExtra);
                if (intExtra == 0) {
                    DfuBaseService.this.sendLogBroadcast(15, "[Broadcast] Pause action received");
                    if (DfuBaseService.this.mDfuServiceImpl != null) {
                        DfuBaseService.this.mDfuServiceImpl.pause();
                    }
                } else if (intExtra == 1) {
                    DfuBaseService.this.sendLogBroadcast(15, "[Broadcast] Resume action received");
                    if (DfuBaseService.this.mDfuServiceImpl != null) {
                        DfuBaseService.this.mDfuServiceImpl.resume();
                    }
                } else if (intExtra != 2) {
                } else {
                    DfuBaseService.this.sendLogBroadcast(15, "[Broadcast] Abort action received");
                    DfuBaseService.this.mAborted = true;
                    if (DfuBaseService.this.mDfuServiceImpl != null) {
                        DfuBaseService.this.mDfuServiceImpl.abort();
                    }
                }
            }
        };
        this.mBluetoothStateBroadcastReceiver = new BroadcastReceiver() { // from class: no.nordicsemi.android.dfu.DfuBaseService.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
                int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", 12);
                DfuBaseService dfuBaseService = DfuBaseService.this;
                dfuBaseService.logw("Action received: android.bluetooth.adapter.action.STATE_CHANGED [state: " + intExtra + ", previous state: " + intExtra2 + "]");
                if (intExtra2 == 12) {
                    if (intExtra == 13 || intExtra == 10) {
                        DfuBaseService.this.sendLogBroadcast(15, "Bluetooth adapter disabled");
                        DfuBaseService dfuBaseService2 = DfuBaseService.this;
                        dfuBaseService2.mConnectionState = 0;
                        if (dfuBaseService2.mDfuServiceImpl != null) {
                            DfuBaseService.this.mDfuServiceImpl.getGattCallback().onDisconnected();
                        }
                        synchronized (DfuBaseService.this.mLock) {
                            DfuBaseService.this.mLock.notifyAll();
                        }
                    }
                }
            }
        };
        this.mBondStateBroadcastReceiver = new BroadcastReceiver() { // from class: no.nordicsemi.android.dfu.DfuBaseService.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int intExtra;
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (bluetoothDevice == null || !bluetoothDevice.getAddress().equals(DfuBaseService.this.mDeviceAddress) || (intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1)) == 11 || DfuBaseService.this.mDfuServiceImpl == null) {
                    return;
                }
                DfuBaseService.this.mDfuServiceImpl.onBondStateChanged(intExtra);
            }
        };
        this.mConnectionStateBroadcastReceiver = new BroadcastReceiver() { // from class: no.nordicsemi.android.dfu.DfuBaseService.4
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (bluetoothDevice == null || !bluetoothDevice.getAddress().equals(DfuBaseService.this.mDeviceAddress)) {
                    return;
                }
                String action = intent.getAction();
                DfuBaseService dfuBaseService = DfuBaseService.this;
                dfuBaseService.logi("Action received: " + action);
                DfuBaseService dfuBaseService2 = DfuBaseService.this;
                dfuBaseService2.sendLogBroadcast(0, "[Broadcast] Action received: " + action);
            }
        };
        this.mGattCallback = new BluetoothGattCallback() { // from class: no.nordicsemi.android.dfu.DfuBaseService.5
            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.getGattCallback().onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.getGattCallback().onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i10);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.getGattCallback().onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i10);
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:62:0x008e, code lost:
                if (r4.mDfuServiceImpl != null) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x00e2, code lost:
                if (r4.mDfuServiceImpl != null) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:75:0x00e4, code lost:
                no.nordicsemi.android.dfu.DfuBaseService.this.mDfuServiceImpl.getGattCallback().onDisconnected();
             */
            @Override // android.bluetooth.BluetoothGattCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onConnectionStateChange(android.bluetooth.BluetoothGatt r4, int r5, int r6) {
                /*
                    Method dump skipped, instructions count: 262
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: no.nordicsemi.android.dfu.DfuBaseService.AnonymousClass5.onConnectionStateChange(android.bluetooth.BluetoothGatt, int, int):void");
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10) {
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.getGattCallback().onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i10);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10) {
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.getGattCallback().onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i10);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            @SuppressLint({"NewApi"})
            public void onMtuChanged(BluetoothGatt bluetoothGatt, int i10, int i11) {
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.getGattCallback().onMtuChanged(bluetoothGatt, i10, i11);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            @SuppressLint({"NewApi"})
            public void onPhyUpdate(BluetoothGatt bluetoothGatt, int i10, int i11, int i12) {
                if (DfuBaseService.this.mDfuServiceImpl != null) {
                    DfuBaseService.this.mDfuServiceImpl.getGattCallback().onPhyUpdate(bluetoothGatt, i10, i11, i12);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i10) {
                DfuBaseService dfuBaseService = DfuBaseService.this;
                if (i10 == 0) {
                    dfuBaseService.logi("Services discovered");
                    DfuBaseService.this.mConnectionState = -3;
                } else {
                    dfuBaseService.loge("Service discovery error: " + i10);
                    DfuBaseService.this.mError = i10 | DfuBaseService.ERROR_CONNECTION_MASK;
                }
                synchronized (DfuBaseService.this.mLock) {
                    DfuBaseService.this.mLock.notifyAll();
                }
            }
        };
    }

    private boolean initialize() {
        String str;
        BluetoothManager bluetoothManager = (BluetoothManager) getSystemService("bluetooth");
        if (bluetoothManager == null) {
            str = "Unable to initialize BluetoothManager.";
        } else {
            BluetoothAdapter adapter = bluetoothManager.getAdapter();
            this.mBluetoothAdapter = adapter;
            if (adapter != null) {
                return true;
            }
            str = "Unable to obtain a BluetoothAdapter.";
        }
        loge(str);
        return false;
    }

    public void loge(String str) {
        Log.e(TAG, str);
    }

    private void loge(String str, Throwable th2) {
        Log.e(TAG, str, th2);
    }

    public void logi(String str) {
        if (DEBUG) {
            Log.i(TAG, str);
        }
    }

    public void logw(String str) {
        if (DEBUG) {
            Log.w(TAG, str);
        }
    }

    private static IntentFilter makeDfuActionIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(BROADCAST_ACTION);
        return intentFilter;
    }

    private InputStream openInputStream(int i10, String str, int i11, int i12) {
        InputStream openRawResource = getResources().openRawResource(i10);
        if (MIME_TYPE_ZIP.equals(str)) {
            return new ArchiveInputStream(openRawResource, i11, i12);
        }
        openRawResource.mark(2);
        int read = openRawResource.read();
        openRawResource.reset();
        return read == 58 ? new HexInputStream(openRawResource, i11) : openRawResource;
    }

    private InputStream openInputStream(Uri uri, String str, int i10, int i11) {
        InputStream open = uri.toString().startsWith("file:///android_asset/") ? getAssets().open(uri.getPath().substring(15)) : getContentResolver().openInputStream(uri);
        if (MIME_TYPE_ZIP.equals(str)) {
            return new ArchiveInputStream(open, i10, i11);
        }
        Cursor query = getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
        if (query != null) {
            try {
                if (query.moveToNext() && query.getString(0).toLowerCase(Locale.US).endsWith("hex")) {
                    HexInputStream hexInputStream = new HexInputStream(open, i10);
                    query.close();
                    return hexInputStream;
                }
            } catch (Throwable th2) {
                try {
                    query.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (query != null) {
            query.close();
        }
        return open;
    }

    private InputStream openInputStream(String str, String str2, int i10, int i11) {
        FileInputStream fileInputStream = new FileInputStream(str);
        return MIME_TYPE_ZIP.equals(str2) ? new ArchiveInputStream(fileInputStream, i10, i11) : str.toLowerCase(Locale.US).endsWith("hex") ? new HexInputStream(fileInputStream, i10) : fileInputStream;
    }

    private void report(int i10) {
        sendErrorBroadcast(i10);
        if (this.mDisableNotification) {
            return;
        }
        String str = this.mDeviceAddress;
        String str2 = this.mDeviceName;
        if (str2 == null) {
            str2 = getString(R.string.dfu_unknown_name);
        }
        s sVar = new s(this, NOTIFICATION_CHANNEL_DFU);
        sVar.f30158t.icon = 17301640;
        sVar.e(8, true);
        sVar.f30155q = -65536;
        sVar.e(2, false);
        sVar.d(getString(R.string.dfu_status_error));
        sVar.f30158t.icon = 17301641;
        sVar.c(getString(R.string.dfu_status_error_msg));
        sVar.e(16, true);
        Intent intent = new Intent(this, getNotificationTarget());
        intent.addFlags(268435456);
        intent.putExtra(EXTRA_DEVICE_ADDRESS, str);
        intent.putExtra(EXTRA_DEVICE_NAME, str2);
        intent.putExtra(EXTRA_PROGRESS, i10);
        int i11 = 134217728;
        if (Build.VERSION.SDK_INT >= 23) {
            i11 = 201326592;
        }
        sVar.f30145g = PendingIntent.getActivity(this, 0, intent, i11);
        updateErrorNotification(sVar);
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.notify(NOTIFICATION_ID, sVar.a());
        }
    }

    private void sendErrorBroadcast(int i10) {
        int i11;
        Intent intent = new Intent(BROADCAST_ERROR);
        if ((i10 & ERROR_CONNECTION_MASK) > 0) {
            intent.putExtra(EXTRA_DATA, i10 & (-16385));
            i11 = 2;
        } else if ((32768 & i10) > 0) {
            intent.putExtra(EXTRA_DATA, i10 & (-32769));
            i11 = 1;
        } else if ((i10 & ERROR_REMOTE_MASK) > 0) {
            intent.putExtra(EXTRA_DATA, i10 & (-8193));
            i11 = 3;
        } else {
            intent.putExtra(EXTRA_DATA, i10);
            i11 = 0;
        }
        intent.putExtra(EXTRA_ERROR_TYPE, i11);
        intent.putExtra(EXTRA_DEVICE_ADDRESS, this.mDeviceAddress);
        g2.a.a(this).c(intent);
    }

    private void sendProgressBroadcast(DfuProgressInfo dfuProgressInfo) {
        Intent intent = new Intent(BROADCAST_PROGRESS);
        intent.putExtra(EXTRA_DATA, dfuProgressInfo.getProgress());
        intent.putExtra(EXTRA_DEVICE_ADDRESS, this.mDeviceAddress);
        intent.putExtra(EXTRA_PART_CURRENT, dfuProgressInfo.getCurrentPart());
        intent.putExtra(EXTRA_PARTS_TOTAL, dfuProgressInfo.getTotalParts());
        intent.putExtra(EXTRA_SPEED_B_PER_MS, dfuProgressInfo.getSpeed());
        intent.putExtra(EXTRA_AVG_SPEED_B_PER_MS, dfuProgressInfo.getAverageSpeed());
        g2.a.a(this).c(intent);
    }

    private void startForeground() {
        s sVar = new s(this, NOTIFICATION_CHANNEL_DFU);
        sVar.f30158t.icon = 17301640;
        sVar.d(getString(R.string.dfu_status_foreground_title));
        sVar.c(getString(R.string.dfu_status_foreground_content));
        sVar.f30155q = -7829368;
        sVar.f30147i = -1;
        sVar.e(2, true);
        Class<? extends Activity> notificationTarget = getNotificationTarget();
        if (notificationTarget != null) {
            Intent intent = new Intent(this, notificationTarget);
            intent.addFlags(268435456);
            intent.putExtra(EXTRA_DEVICE_ADDRESS, this.mDeviceAddress);
            intent.putExtra(EXTRA_DEVICE_NAME, this.mDeviceName);
            int i10 = 134217728;
            if (Build.VERSION.SDK_INT >= 23) {
                i10 = 201326592;
            }
            sVar.f30145g = PendingIntent.getActivity(this, 0, intent, i10);
        } else {
            logw("getNotificationTarget() should not return null if the service is to be started as a foreground service");
        }
        updateForegroundNotification(sVar);
        startForeground(NOTIFICATION_ID, sVar.a());
    }

    public void close(BluetoothGatt bluetoothGatt) {
        logi("Cleaning up...");
        sendLogBroadcast(0, "gatt.disconnect()");
        bluetoothGatt.disconnect();
        sendLogBroadcast(0, "gatt.close()");
        bluetoothGatt.close();
        this.mConnectionState = -5;
    }

    public BluetoothGatt connect(String str) {
        BluetoothGatt connectGatt;
        if (this.mBluetoothAdapter.isEnabled()) {
            this.mConnectionState = -1;
            logi("Connecting to the device...");
            BluetoothDevice remoteDevice = this.mBluetoothAdapter.getRemoteDevice(str);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                sendLogBroadcast(0, "gatt = device.connectGatt(autoConnect = false, TRANSPORT_LE, preferredPhy = LE_1M | LE_2M)");
                connectGatt = remoteDevice.connectGatt(this, false, this.mGattCallback, 2, 3);
            } else if (i10 >= 23) {
                sendLogBroadcast(0, "gatt = device.connectGatt(autoConnect = false, TRANSPORT_LE)");
                connectGatt = remoteDevice.connectGatt(this, false, this.mGattCallback, 2);
            } else {
                sendLogBroadcast(0, "gatt = device.connectGatt(autoConnect = false)");
                connectGatt = remoteDevice.connectGatt(this, false, this.mGattCallback);
            }
            try {
                synchronized (this.mLock) {
                    while (true) {
                        int i11 = this.mConnectionState;
                        if ((i11 == -1 || i11 == -2) && this.mError == 0 && !this.mAborted) {
                            this.mLock.wait();
                        }
                    }
                }
            } catch (InterruptedException e10) {
                loge("Sleeping interrupted", e10);
            }
            return connectGatt;
        }
        return null;
    }

    public void disconnect(BluetoothGatt bluetoothGatt) {
        if (this.mConnectionState == 0) {
            return;
        }
        sendLogBroadcast(1, "Disconnecting...");
        this.mProgressInfo.setProgress(-5);
        this.mConnectionState = -4;
        logi("Disconnecting from the device...");
        sendLogBroadcast(0, "gatt.disconnect()");
        bluetoothGatt.disconnect();
        waitUntilDisconnected();
        sendLogBroadcast(5, "Disconnected");
    }

    public DfuDeviceSelector getDeviceSelector() {
        return new DfuDefaultDeviceSelector();
    }

    public abstract Class<? extends Activity> getNotificationTarget();

    public boolean isDebug() {
        return false;
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        DEBUG = isDebug();
        logi("DFU service created. Version: 2.2.2");
        initialize();
        g2.a a10 = g2.a.a(this);
        IntentFilter makeDfuActionIntentFilter = makeDfuActionIntentFilter();
        a10.b(this.mDfuActionReceiver, makeDfuActionIntentFilter);
        registerReceiver(this.mDfuActionReceiver, makeDfuActionIntentFilter);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        registerReceiver(this.mConnectionStateBroadcastReceiver, intentFilter);
        registerReceiver(this.mBondStateBroadcastReceiver, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"));
        registerReceiver(this.mBluetoothStateBroadcastReceiver, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        DfuCallback dfuCallback = this.mDfuServiceImpl;
        if (dfuCallback != null) {
            dfuCallback.abort();
        }
        g2.a.a(this).d(this.mDfuActionReceiver);
        unregisterReceiver(this.mDfuActionReceiver);
        unregisterReceiver(this.mConnectionStateBroadcastReceiver);
        unregisterReceiver(this.mBondStateBroadcastReceiver);
        unregisterReceiver(this.mBluetoothStateBroadcastReceiver);
        try {
            InputStream inputStream = this.mFirmwareInputStream;
            if (inputStream != null) {
                inputStream.close();
            }
            InputStream inputStream2 = this.mInitFileInputStream;
            if (inputStream2 != null) {
                inputStream2.close();
            }
        } catch (IOException unused) {
        } catch (Throwable th2) {
            this.mFirmwareInputStream = null;
            this.mInitFileInputStream = null;
            throw th2;
        }
        this.mFirmwareInputStream = null;
        this.mInitFileInputStream = null;
        logi("DFU service destroyed");
    }

    /* JADX WARN: Code restructure failed: missing block: B:389:0x010b, code lost:
        if (r4 < 0) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0117, code lost:
        if (r4 < 0) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x04b0, code lost:
        if (r2 == null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x0532, code lost:
        if (r2 == null) goto L192;
     */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0220 A[Catch: all -> 0x0186, Exception -> 0x018a, IOException -> 0x018e, SizeValidationException -> 0x0192, FileNotFoundException -> 0x0196, SecurityException -> 0x019a, TryCatch #6 {FileNotFoundException -> 0x0196, blocks: (B:401:0x0131, B:403:0x013b, B:410:0x0152, B:416:0x0174, B:434:0x01a2, B:436:0x01a8, B:438:0x01ad, B:440:0x01b6, B:442:0x01ba, B:445:0x01c3, B:446:0x01ca, B:447:0x01cb, B:449:0x01cf, B:452:0x01d8, B:453:0x01df, B:454:0x01e0, B:456:0x01e4, B:459:0x01ed, B:460:0x01f4, B:463:0x01f8, B:465:0x01fe, B:474:0x0220, B:476:0x0229, B:477:0x0230, B:466:0x0208, B:468:0x020e, B:439:0x01b2, B:419:0x017e, B:420:0x0185, B:412:0x015d, B:414:0x0167, B:405:0x0142, B:407:0x0149), top: B:637:0x0131, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0248 A[Catch: all -> 0x0186, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0186, blocks: (B:401:0x0131, B:403:0x013b, B:410:0x0152, B:416:0x0174, B:434:0x01a2, B:436:0x01a8, B:438:0x01ad, B:440:0x01b6, B:442:0x01ba, B:445:0x01c3, B:446:0x01ca, B:447:0x01cb, B:449:0x01cf, B:452:0x01d8, B:453:0x01df, B:454:0x01e0, B:456:0x01e4, B:459:0x01ed, B:460:0x01f4, B:463:0x01f8, B:465:0x01fe, B:474:0x0220, B:476:0x0229, B:477:0x0230, B:478:0x023a, B:481:0x0248, B:485:0x025b, B:487:0x0277, B:491:0x028c, B:497:0x029d, B:525:0x03a9, B:531:0x03b9, B:533:0x03bd, B:538:0x03d1, B:540:0x03d5, B:544:0x03ec, B:551:0x041b, B:561:0x043a, B:592:0x0512, B:584:0x04b2, B:606:0x053e, B:607:0x0541, B:466:0x0208, B:468:0x020e, B:439:0x01b2, B:419:0x017e, B:420:0x0185, B:412:0x015d, B:414:0x0167, B:405:0x0142, B:407:0x0149, B:608:0x0542, B:612:0x056a, B:616:0x0592, B:620:0x05a9, B:624:0x05c0), top: B:636:0x012f, inners: #6, #8, #16, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:485:0x025b A[Catch: all -> 0x0186, TRY_ENTER, TryCatch #2 {all -> 0x0186, blocks: (B:401:0x0131, B:403:0x013b, B:410:0x0152, B:416:0x0174, B:434:0x01a2, B:436:0x01a8, B:438:0x01ad, B:440:0x01b6, B:442:0x01ba, B:445:0x01c3, B:446:0x01ca, B:447:0x01cb, B:449:0x01cf, B:452:0x01d8, B:453:0x01df, B:454:0x01e0, B:456:0x01e4, B:459:0x01ed, B:460:0x01f4, B:463:0x01f8, B:465:0x01fe, B:474:0x0220, B:476:0x0229, B:477:0x0230, B:478:0x023a, B:481:0x0248, B:485:0x025b, B:487:0x0277, B:491:0x028c, B:497:0x029d, B:525:0x03a9, B:531:0x03b9, B:533:0x03bd, B:538:0x03d1, B:540:0x03d5, B:544:0x03ec, B:551:0x041b, B:561:0x043a, B:592:0x0512, B:584:0x04b2, B:606:0x053e, B:607:0x0541, B:466:0x0208, B:468:0x020e, B:439:0x01b2, B:419:0x017e, B:420:0x0185, B:412:0x015d, B:414:0x0167, B:405:0x0142, B:407:0x0149, B:608:0x0542, B:612:0x056a, B:616:0x0592, B:620:0x05a9, B:624:0x05c0), top: B:636:0x012f, inners: #6, #8, #16, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:590:0x04db A[Catch: all -> 0x0453, TRY_LEAVE, TryCatch #10 {all -> 0x0453, blocks: (B:546:0x03f7, B:588:0x04bb, B:590:0x04db, B:596:0x051b, B:577:0x0459, B:579:0x0461, B:580:0x0480, B:582:0x04a2, B:581:0x0484, B:599:0x0521), top: B:640:0x03f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:596:0x051b A[Catch: all -> 0x0453, TRY_ENTER, TryCatch #10 {all -> 0x0453, blocks: (B:546:0x03f7, B:588:0x04bb, B:590:0x04db, B:596:0x051b, B:577:0x0459, B:579:0x0461, B:580:0x0480, B:582:0x04a2, B:581:0x0484, B:599:0x0521), top: B:640:0x03f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:660:? A[RETURN, SYNTHETIC] */
    @Override // android.app.IntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onHandleIntent(android.content.Intent r26) {
        /*
            Method dump skipped, instructions count: 1523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: no.nordicsemi.android.dfu.DfuBaseService.onHandleIntent(android.content.Intent):void");
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(NOTIFICATION_ID);
        }
        stopSelf();
    }

    public void refreshDeviceCache(BluetoothGatt bluetoothGatt, boolean z10) {
        if (z10 || bluetoothGatt.getDevice().getBondState() == 10) {
            sendLogBroadcast(0, "gatt.refresh() (hidden)");
            try {
                boolean booleanValue = ((Boolean) bluetoothGatt.getClass().getMethod("refresh", new Class[0]).invoke(bluetoothGatt, new Object[0])).booleanValue();
                logi("Refreshing result: " + booleanValue);
            } catch (Exception e10) {
                loge("An exception occurred while refreshing device", e10);
                sendLogBroadcast(15, "Refreshing failed");
            }
        }
    }

    public void sendLogBroadcast(int i10, String str) {
        String b10 = b.b("[DFU] ", str);
        Intent intent = new Intent(BROADCAST_LOG);
        intent.putExtra(EXTRA_LOG_MESSAGE, b10);
        intent.putExtra(EXTRA_LOG_LEVEL, i10);
        intent.putExtra(EXTRA_DEVICE_ADDRESS, this.mDeviceAddress);
        g2.a.a(this).c(intent);
    }

    public void terminateConnection(BluetoothGatt bluetoothGatt, int i10) {
        if (this.mConnectionState != 0) {
            disconnect(bluetoothGatt);
        }
        refreshDeviceCache(bluetoothGatt, false);
        close(bluetoothGatt);
        waitFor(600L);
        if (i10 != 0) {
            report(i10);
        }
    }

    public void updateErrorNotification(s sVar) {
    }

    public void updateForegroundNotification(s sVar) {
    }

    @Override // no.nordicsemi.android.dfu.DfuProgressInfo.ProgressListener
    public void updateProgressNotification() {
        String string;
        int i10;
        DfuProgressInfo dfuProgressInfo = this.mProgressInfo;
        int progress = dfuProgressInfo.getProgress();
        if (this.mLastProgress == progress) {
            return;
        }
        this.mLastProgress = progress;
        sendProgressBroadcast(dfuProgressInfo);
        if (this.mDisableNotification) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.mLastNotificationTime >= 250 || -6 == progress || -7 == progress) {
            this.mLastNotificationTime = elapsedRealtime;
            String str = this.mDeviceAddress;
            String str2 = this.mDeviceName;
            if (str2 == null) {
                str2 = getString(R.string.dfu_unknown_name);
            }
            s sVar = new s(this, NOTIFICATION_CHANNEL_DFU);
            sVar.f30158t.icon = 17301640;
            sVar.e(8, true);
            sVar.f30155q = -7829368;
            switch (progress) {
                case -7:
                    sVar.e(2, false);
                    sVar.d(getString(R.string.dfu_status_aborted));
                    sVar.f30158t.icon = 17301641;
                    sVar.c(getString(R.string.dfu_status_aborted_msg));
                    sVar.e(16, true);
                    break;
                case -6:
                    sVar.e(2, false);
                    sVar.d(getString(R.string.dfu_status_completed));
                    sVar.f30158t.icon = 17301641;
                    sVar.c(getString(R.string.dfu_status_completed_msg));
                    sVar.e(16, true);
                    sVar.f30155q = -16730086;
                    break;
                case -5:
                    sVar.e(2, true);
                    sVar.d(getString(R.string.dfu_status_disconnecting));
                    string = getString(R.string.dfu_status_disconnecting_msg, str2);
                    sVar.c(string);
                    sVar.f(0, true);
                    break;
                case -4:
                    sVar.e(2, true);
                    sVar.d(getString(R.string.dfu_status_validating));
                    i10 = R.string.dfu_status_validating_msg;
                    string = getString(i10);
                    sVar.c(string);
                    sVar.f(0, true);
                    break;
                case -3:
                    sVar.e(2, true);
                    sVar.d(getString(R.string.dfu_status_switching_to_dfu));
                    i10 = R.string.dfu_status_switching_to_dfu_msg;
                    string = getString(i10);
                    sVar.c(string);
                    sVar.f(0, true);
                    break;
                case -2:
                    sVar.e(2, true);
                    sVar.d(getString(R.string.dfu_status_starting));
                    i10 = R.string.dfu_status_starting_msg;
                    string = getString(i10);
                    sVar.c(string);
                    sVar.f(0, true);
                    break;
                case -1:
                    sVar.e(2, true);
                    sVar.d(getString(R.string.dfu_status_connecting));
                    string = getString(R.string.dfu_status_connecting_msg, str2);
                    sVar.c(string);
                    sVar.f(0, true);
                    break;
                default:
                    String string2 = dfuProgressInfo.getTotalParts() == 1 ? getString(R.string.dfu_status_uploading) : getString(R.string.dfu_status_uploading_part, Integer.valueOf(dfuProgressInfo.getCurrentPart()), Integer.valueOf(dfuProgressInfo.getTotalParts()));
                    String string3 = getString(R.string.dfu_status_uploading_msg, str2);
                    sVar.e(2, true);
                    sVar.d(string2);
                    sVar.c(string3);
                    sVar.f(progress, false);
                    break;
            }
            Intent intent = new Intent(this, getNotificationTarget());
            intent.addFlags(268435456);
            intent.putExtra(EXTRA_DEVICE_ADDRESS, str);
            intent.putExtra(EXTRA_DEVICE_NAME, str2);
            intent.putExtra(EXTRA_PROGRESS, progress);
            sVar.f30145g = PendingIntent.getActivity(this, 0, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
            updateProgressNotification(sVar, progress);
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.notify(NOTIFICATION_ID, sVar.a());
            }
        }
    }

    public void waitFor(long j10) {
        synchronized (this.mLock) {
            try {
                sendLogBroadcast(0, "wait(" + j10 + ")");
                this.mLock.wait(j10);
            } catch (InterruptedException e10) {
                loge("Sleeping interrupted", e10);
            }
        }
    }

    public void waitUntilDisconnected() {
        try {
            synchronized (this.mLock) {
                while (this.mConnectionState != 0 && this.mError == 0) {
                    this.mLock.wait();
                }
            }
        } catch (InterruptedException e10) {
            loge("Sleeping interrupted", e10);
        }
    }

    public void updateProgressNotification(s sVar, int i10) {
        if (i10 == -7 || i10 == -6) {
            return;
        }
        Intent intent = new Intent(BROADCAST_ACTION);
        intent.putExtra(EXTRA_ACTION, 2);
        sVar.f30140b.add(new q(R.drawable.ic_action_notify_cancel, getString(R.string.dfu_action_abort), PendingIntent.getBroadcast(this, 1, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728)));
    }
}
