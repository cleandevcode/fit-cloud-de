package no.nordicsemi.android.dfu;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import bi.z0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import no.nordicsemi.android.dfu.internal.scanner.BootloaderScannerFactory;

/* loaded from: classes2.dex */
public class DfuServiceListenerHelper {
    private static LogBroadcastReceiver mLogBroadcastReceiver;
    private static ProgressBroadcastsReceiver mProgressBroadcastReceiver;

    /* loaded from: classes2.dex */
    public static class LogBroadcastReceiver extends BroadcastReceiver {
        private DfuLogListener mGlobalLogListener;
        private final Map<String, DfuLogListener> mListeners;

        private LogBroadcastReceiver() {
            this.mListeners = new HashMap();
        }

        public boolean removeLogListener(DfuLogListener dfuLogListener) {
            if (this.mGlobalLogListener == dfuLogListener) {
                this.mGlobalLogListener = null;
            }
            Iterator<Map.Entry<String, DfuLogListener>> it = this.mListeners.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, DfuLogListener> next = it.next();
                if (next.getValue() == dfuLogListener) {
                    this.mListeners.remove(next.getKey());
                    break;
                }
            }
            Iterator<Map.Entry<String, DfuLogListener>> it2 = this.mListeners.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<String, DfuLogListener> next2 = it2.next();
                if (next2.getValue() == dfuLogListener) {
                    this.mListeners.remove(next2.getKey());
                    break;
                }
            }
            return this.mGlobalLogListener == null && this.mListeners.isEmpty();
        }

        public void setLogListener(String str, DfuLogListener dfuLogListener) {
            this.mListeners.put(str, dfuLogListener);
            this.mListeners.put(BootloaderScannerFactory.getIncrementedAddress(str), dfuLogListener);
        }

        public void setLogListener(DfuLogListener dfuLogListener) {
            this.mGlobalLogListener = dfuLogListener;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String stringExtra = intent.getStringExtra(DfuBaseService.EXTRA_DEVICE_ADDRESS);
            DfuLogListener dfuLogListener = this.mGlobalLogListener;
            DfuLogListener dfuLogListener2 = this.mListeners.get(stringExtra);
            if (dfuLogListener == null && dfuLogListener2 == null) {
                return;
            }
            int intExtra = intent.getIntExtra(DfuBaseService.EXTRA_LOG_LEVEL, 0);
            String stringExtra2 = intent.getStringExtra(DfuBaseService.EXTRA_LOG_MESSAGE);
            if (dfuLogListener != null) {
                dfuLogListener.onLogEvent(stringExtra, intExtra, stringExtra2);
            }
            if (dfuLogListener2 != null) {
                dfuLogListener2.onLogEvent(stringExtra, intExtra, stringExtra2);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class ProgressBroadcastsReceiver extends BroadcastReceiver {
        private DfuProgressListener mGlobalProgressListener;
        private final Map<String, DfuProgressListener> mListeners;

        private ProgressBroadcastsReceiver() {
            this.mListeners = new HashMap();
        }

        public boolean removeProgressListener(DfuProgressListener dfuProgressListener) {
            if (this.mGlobalProgressListener == dfuProgressListener) {
                this.mGlobalProgressListener = null;
            }
            Iterator<Map.Entry<String, DfuProgressListener>> it = this.mListeners.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, DfuProgressListener> next = it.next();
                if (next.getValue() == dfuProgressListener) {
                    this.mListeners.remove(next.getKey());
                    break;
                }
            }
            Iterator<Map.Entry<String, DfuProgressListener>> it2 = this.mListeners.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<String, DfuProgressListener> next2 = it2.next();
                if (next2.getValue() == dfuProgressListener) {
                    this.mListeners.remove(next2.getKey());
                    break;
                }
            }
            return this.mGlobalProgressListener == null && this.mListeners.isEmpty();
        }

        public void setProgressListener(String str, DfuProgressListener dfuProgressListener) {
            this.mListeners.put(str, dfuProgressListener);
            this.mListeners.put(BootloaderScannerFactory.getIncrementedAddress(str), dfuProgressListener);
        }

        public void setProgressListener(DfuProgressListener dfuProgressListener) {
            this.mGlobalProgressListener = dfuProgressListener;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            String i10;
            String stringExtra = intent.getStringExtra(DfuBaseService.EXTRA_DEVICE_ADDRESS);
            if (stringExtra == null) {
                return;
            }
            DfuProgressListener dfuProgressListener = this.mGlobalProgressListener;
            DfuProgressListener dfuProgressListener2 = this.mListeners.get(stringExtra);
            if ((dfuProgressListener == null && dfuProgressListener2 == null) || (action = intent.getAction()) == null) {
                return;
            }
            if (!action.equals(DfuBaseService.BROADCAST_PROGRESS)) {
                if (action.equals(DfuBaseService.BROADCAST_ERROR)) {
                    int intExtra = intent.getIntExtra(DfuBaseService.EXTRA_DATA, 0);
                    int intExtra2 = intent.getIntExtra(DfuBaseService.EXTRA_ERROR_TYPE, 0);
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onDeviceDisconnected(stringExtra);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onDeviceDisconnected(stringExtra);
                    }
                    if (intExtra2 == 1) {
                        if (dfuProgressListener != null) {
                            dfuProgressListener.onError(stringExtra, intExtra, intExtra2, z0.i(intExtra));
                        }
                        if (dfuProgressListener2 == null) {
                            return;
                        }
                        i10 = z0.i(intExtra);
                    } else if (intExtra2 != 3) {
                        if (dfuProgressListener != null) {
                            dfuProgressListener.onError(stringExtra, intExtra, intExtra2, z0.h(intExtra));
                        }
                        if (dfuProgressListener2 == null) {
                            return;
                        }
                        i10 = z0.h(intExtra);
                    } else {
                        if (dfuProgressListener != null) {
                            dfuProgressListener.onError(stringExtra, intExtra, intExtra2, z0.j(intExtra));
                        }
                        if (dfuProgressListener2 == null) {
                            return;
                        }
                        i10 = z0.j(intExtra);
                    }
                    dfuProgressListener2.onError(stringExtra, intExtra, intExtra2, i10);
                    return;
                }
                return;
            }
            int intExtra3 = intent.getIntExtra(DfuBaseService.EXTRA_DATA, 0);
            float floatExtra = intent.getFloatExtra(DfuBaseService.EXTRA_SPEED_B_PER_MS, 0.0f);
            float floatExtra2 = intent.getFloatExtra(DfuBaseService.EXTRA_AVG_SPEED_B_PER_MS, 0.0f);
            int intExtra4 = intent.getIntExtra(DfuBaseService.EXTRA_PART_CURRENT, 0);
            int intExtra5 = intent.getIntExtra(DfuBaseService.EXTRA_PARTS_TOTAL, 0);
            switch (intExtra3) {
                case -7:
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onDeviceDisconnected(stringExtra);
                        dfuProgressListener.onDfuAborted(stringExtra);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onDeviceDisconnected(stringExtra);
                        dfuProgressListener2.onDfuAborted(stringExtra);
                        return;
                    }
                    return;
                case -6:
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onDeviceDisconnected(stringExtra);
                        dfuProgressListener.onDfuCompleted(stringExtra);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onDeviceDisconnected(stringExtra);
                        dfuProgressListener2.onDfuCompleted(stringExtra);
                        return;
                    }
                    return;
                case -5:
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onDeviceDisconnecting(stringExtra);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onDeviceDisconnecting(stringExtra);
                        return;
                    }
                    return;
                case -4:
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onFirmwareValidating(stringExtra);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onFirmwareValidating(stringExtra);
                        return;
                    }
                    return;
                case -3:
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onEnablingDfuMode(stringExtra);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onEnablingDfuMode(stringExtra);
                        return;
                    }
                    return;
                case -2:
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onDeviceConnected(stringExtra);
                        dfuProgressListener.onDfuProcessStarting(stringExtra);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onDeviceConnected(stringExtra);
                        dfuProgressListener2.onDfuProcessStarting(stringExtra);
                        return;
                    }
                    return;
                case -1:
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onDeviceConnecting(stringExtra);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onDeviceConnecting(stringExtra);
                        return;
                    }
                    return;
                default:
                    if (intExtra3 == 0) {
                        if (dfuProgressListener != null) {
                            dfuProgressListener.onDfuProcessStarted(stringExtra);
                        }
                        if (dfuProgressListener2 != null) {
                            dfuProgressListener2.onDfuProcessStarted(stringExtra);
                        }
                    }
                    if (dfuProgressListener != null) {
                        dfuProgressListener.onProgressChanged(stringExtra, intExtra3, floatExtra, floatExtra2, intExtra4, intExtra5);
                    }
                    if (dfuProgressListener2 != null) {
                        dfuProgressListener2.onProgressChanged(stringExtra, intExtra3, floatExtra, floatExtra2, intExtra4, intExtra5);
                        return;
                    }
                    return;
            }
        }
    }

    public static void registerLogListener(Context context, DfuLogListener dfuLogListener) {
        if (mLogBroadcastReceiver == null) {
            mLogBroadcastReceiver = new LogBroadcastReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(DfuBaseService.BROADCAST_LOG);
            g2.a.a(context).b(mLogBroadcastReceiver, intentFilter);
        }
        mLogBroadcastReceiver.setLogListener(dfuLogListener);
    }

    public static void registerLogListener(Context context, DfuLogListener dfuLogListener, String str) {
        if (mLogBroadcastReceiver == null) {
            mLogBroadcastReceiver = new LogBroadcastReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(DfuBaseService.BROADCAST_LOG);
            g2.a.a(context).b(mLogBroadcastReceiver, intentFilter);
        }
        mLogBroadcastReceiver.setLogListener(str, dfuLogListener);
    }

    public static void registerProgressListener(Context context, DfuProgressListener dfuProgressListener) {
        if (mProgressBroadcastReceiver == null) {
            mProgressBroadcastReceiver = new ProgressBroadcastsReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(DfuBaseService.BROADCAST_PROGRESS);
            intentFilter.addAction(DfuBaseService.BROADCAST_ERROR);
            g2.a.a(context).b(mProgressBroadcastReceiver, intentFilter);
        }
        mProgressBroadcastReceiver.setProgressListener(dfuProgressListener);
    }

    public static void registerProgressListener(Context context, DfuProgressListener dfuProgressListener, String str) {
        if (mProgressBroadcastReceiver == null) {
            mProgressBroadcastReceiver = new ProgressBroadcastsReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(DfuBaseService.BROADCAST_PROGRESS);
            intentFilter.addAction(DfuBaseService.BROADCAST_ERROR);
            g2.a.a(context).b(mProgressBroadcastReceiver, intentFilter);
        }
        mProgressBroadcastReceiver.setProgressListener(str, dfuProgressListener);
    }

    public static void unregisterLogListener(Context context, DfuLogListener dfuLogListener) {
        LogBroadcastReceiver logBroadcastReceiver = mLogBroadcastReceiver;
        if (logBroadcastReceiver == null || !logBroadcastReceiver.removeLogListener(dfuLogListener)) {
            return;
        }
        g2.a.a(context).d(mLogBroadcastReceiver);
        mLogBroadcastReceiver = null;
    }

    public static void unregisterProgressListener(Context context, DfuProgressListener dfuProgressListener) {
        ProgressBroadcastsReceiver progressBroadcastsReceiver = mProgressBroadcastReceiver;
        if (progressBroadcastsReceiver == null || !progressBroadcastsReceiver.removeProgressListener(dfuProgressListener)) {
            return;
        }
        g2.a.a(context).d(mProgressBroadcastReceiver);
        mProgressBroadcastReceiver = null;
    }
}
