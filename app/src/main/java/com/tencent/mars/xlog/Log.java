package com.tencent.mars.xlog;

import a0.q;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.widget.Toast;
import java.util.HashMap;
import java.util.Map;
import p.a;

/* loaded from: classes.dex */
public class Log {
    public static final int LEVEL_DEBUG = 1;
    public static final int LEVEL_ERROR = 4;
    public static final int LEVEL_FATAL = 5;
    public static final int LEVEL_INFO = 2;
    public static final int LEVEL_NONE = 6;
    public static final int LEVEL_VERBOSE = 0;
    public static final int LEVEL_WARNING = 3;
    private static final String SYS_INFO;
    private static final String TAG = "mars.xlog.log";
    private static LogImp debugLog = null;
    private static int level = 6;
    private static LogImp logImp;
    private static Map<String, LogInstance> sLogInstanceMap;
    public static Context toastSupportContext;

    /* loaded from: classes.dex */
    public interface LogImp {
        void appenderClose();

        void appenderFlush(long j10, boolean z10);

        void appenderOpen(int i10, int i11, String str, String str2, String str3, int i12);

        int getLogLevel(long j10);

        long getXlogInstance(String str);

        void logD(long j10, String str, String str2, String str3, int i10, int i11, long j11, long j12, String str4);

        void logE(long j10, String str, String str2, String str3, int i10, int i11, long j11, long j12, String str4);

        void logF(long j10, String str, String str2, String str3, int i10, int i11, long j11, long j12, String str4);

        void logI(long j10, String str, String str2, String str3, int i10, int i11, long j11, long j12, String str4);

        void logV(long j10, String str, String str2, String str3, int i10, int i11, long j11, long j12, String str4);

        void logW(long j10, String str, String str2, String str3, int i10, int i11, long j11, long j12, String str4);

        long openLogInstance(int i10, int i11, String str, String str2, String str3, int i12);

        void releaseXlogInstance(String str);

        void setAppenderMode(long j10, int i10);

        void setConsoleLogOpen(long j10, boolean z10);

        void setMaxAliveTime(long j10, long j11);

        void setMaxFileSize(long j10, long j11);
    }

    /* loaded from: classes.dex */
    public static class LogInstance {
        private long mLogInstancePtr;
        private String mPrefix;

        private LogInstance(int i10, int i11, String str, String str2, String str3, int i12) {
            this.mLogInstancePtr = -1L;
            this.mPrefix = null;
            if (Log.logImp != null) {
                this.mLogInstancePtr = Log.logImp.openLogInstance(i10, i11, str, str2, str3, i12);
                this.mPrefix = str3;
            }
        }

        public void appenderFlush() {
            if (Log.logImp == null || this.mLogInstancePtr == -1) {
                return;
            }
            Log.logImp.appenderFlush(this.mLogInstancePtr, false);
        }

        public void appenderFlushSync() {
            if (Log.logImp == null || this.mLogInstancePtr == -1) {
                return;
            }
            Log.logImp.appenderFlush(this.mLogInstancePtr, true);
        }

        public void d(String str, String str2, Object... objArr) {
            String format;
            if (Log.logImp != null && getLogLevel() <= 1 && this.mLogInstancePtr != -1) {
                if (objArr == null) {
                    format = str2;
                } else {
                    format = String.format(str2, objArr);
                }
                if (format == null) {
                    format = "";
                }
                Log.logImp.logD(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), q.a(), format);
            }
        }

        public void e(String str, String str2, Object... objArr) {
            String format;
            if (Log.logImp != null && getLogLevel() <= 4 && this.mLogInstancePtr != -1) {
                if (objArr == null) {
                    format = str2;
                } else {
                    format = String.format(str2, objArr);
                }
                if (format == null) {
                    format = "";
                }
                Log.logImp.logE(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), q.a(), format);
            }
        }

        public void f(String str, String str2, Object... objArr) {
            String format;
            if (Log.logImp != null && getLogLevel() <= 5 && this.mLogInstancePtr != -1) {
                if (objArr == null) {
                    format = str2;
                } else {
                    format = String.format(str2, objArr);
                }
                Log.logImp.logF(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), q.a(), format);
            }
        }

        public int getLogLevel() {
            if (Log.logImp == null || this.mLogInstancePtr == -1) {
                return 6;
            }
            return Log.logImp.getLogLevel(this.mLogInstancePtr);
        }

        public void i(String str, String str2, Object... objArr) {
            String format;
            if (Log.logImp != null && getLogLevel() <= 2 && this.mLogInstancePtr != -1) {
                if (objArr == null) {
                    format = str2;
                } else {
                    format = String.format(str2, objArr);
                }
                if (format == null) {
                    format = "";
                }
                Log.logImp.logI(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), q.a(), format);
            }
        }

        public void printErrStackTrace(String str, Throwable th2, String str2, Object... objArr) {
            String format;
            if (Log.logImp != null && getLogLevel() <= 4 && this.mLogInstancePtr != -1) {
                if (objArr == null) {
                    format = str2;
                } else {
                    format = String.format(str2, objArr);
                }
                if (format == null) {
                    format = "";
                }
                StringBuilder a10 = a.a(format, "  ");
                a10.append(android.util.Log.getStackTraceString(th2));
                Log.logImp.logE(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), q.a(), a10.toString());
            }
        }

        public void setConsoleLogOpen(boolean z10) {
            if (Log.logImp == null || this.mLogInstancePtr == -1) {
                return;
            }
            Log.logImp.setConsoleLogOpen(this.mLogInstancePtr, z10);
        }

        public void v(String str, String str2, Object... objArr) {
            String format;
            if (Log.logImp != null && getLogLevel() <= 0 && this.mLogInstancePtr != -1) {
                if (objArr == null) {
                    format = str2;
                } else {
                    format = String.format(str2, objArr);
                }
                if (format == null) {
                    format = "";
                }
                Log.logImp.logV(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), q.a(), format);
            }
        }

        public void w(String str, String str2, Object... objArr) {
            String format;
            if (Log.logImp != null && getLogLevel() <= 3 && this.mLogInstancePtr != -1) {
                if (objArr == null) {
                    format = str2;
                } else {
                    format = String.format(str2, objArr);
                }
                if (format == null) {
                    format = "";
                }
                Log.logImp.logW(this.mLogInstancePtr, str, "", "", Process.myTid(), Process.myPid(), Thread.currentThread().getId(), q.a(), format);
            }
        }
    }

    static {
        LogImp logImp2 = new LogImp() { // from class: com.tencent.mars.xlog.Log.1
            private Handler handler = new Handler(Looper.getMainLooper());

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void appenderClose() {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void appenderFlush(long j10, boolean z10) {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void appenderOpen(int i10, int i11, String str, String str2, String str3, int i12) {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public int getLogLevel(long j10) {
                return Log.level;
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public long getXlogInstance(String str) {
                return 0L;
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logD(long j10, String str, String str2, String str3, int i10, int i11, long j11, long j12, String str4) {
                if (Log.level <= 1) {
                    android.util.Log.d(str, str4);
                }
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logE(long j10, String str, String str2, String str3, int i10, int i11, long j11, long j12, String str4) {
                if (Log.level <= 4) {
                    android.util.Log.e(str, str4);
                }
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logF(long j10, String str, String str2, String str3, int i10, int i11, long j11, long j12, final String str4) {
                if (Log.level > 5) {
                    return;
                }
                android.util.Log.e(str, str4);
                if (Log.toastSupportContext != null) {
                    this.handler.post(new Runnable() { // from class: com.tencent.mars.xlog.Log.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Toast.makeText(Log.toastSupportContext, str4, 1).show();
                        }
                    });
                }
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logI(long j10, String str, String str2, String str3, int i10, int i11, long j11, long j12, String str4) {
                if (Log.level <= 2) {
                    android.util.Log.i(str, str4);
                }
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logV(long j10, String str, String str2, String str3, int i10, int i11, long j11, long j12, String str4) {
                if (Log.level <= 0) {
                    android.util.Log.v(str, str4);
                }
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void logW(long j10, String str, String str2, String str3, int i10, int i11, long j11, long j12, String str4) {
                if (Log.level <= 3) {
                    android.util.Log.w(str, str4);
                }
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public long openLogInstance(int i10, int i11, String str, String str2, String str3, int i12) {
                return 0L;
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void releaseXlogInstance(String str) {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void setAppenderMode(long j10, int i10) {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void setConsoleLogOpen(long j10, boolean z10) {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void setMaxAliveTime(long j10, long j11) {
            }

            @Override // com.tencent.mars.xlog.Log.LogImp
            public void setMaxFileSize(long j10, long j11) {
            }
        };
        debugLog = logImp2;
        logImp = logImp2;
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append("VERSION.RELEASE:[" + Build.VERSION.RELEASE);
            sb2.append("] VERSION.CODENAME:[" + Build.VERSION.CODENAME);
            sb2.append("] VERSION.INCREMENTAL:[" + Build.VERSION.INCREMENTAL);
            sb2.append("] BOARD:[" + Build.BOARD);
            sb2.append("] DEVICE:[" + Build.DEVICE);
            sb2.append("] DISPLAY:[" + Build.DISPLAY);
            sb2.append("] FINGERPRINT:[" + Build.FINGERPRINT);
            sb2.append("] HOST:[" + Build.HOST);
            sb2.append("] MANUFACTURER:[" + Build.MANUFACTURER);
            sb2.append("] MODEL:[" + Build.MODEL);
            sb2.append("] PRODUCT:[" + Build.PRODUCT);
            sb2.append("] TAGS:[" + Build.TAGS);
            sb2.append("] TYPE:[" + Build.TYPE);
            sb2.append("] USER:[" + Build.USER + "]");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        SYS_INFO = sb2.toString();
        sLogInstanceMap = new HashMap();
    }

    public static void appenderClose() {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderClose();
            for (Map.Entry<String, LogInstance> entry : sLogInstanceMap.entrySet()) {
                closeLogInstance(entry.getKey());
            }
        }
    }

    public static void appenderFlush() {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderFlush(0L, false);
            for (Map.Entry<String, LogInstance> entry : sLogInstanceMap.entrySet()) {
                entry.getValue().appenderFlush();
            }
        }
    }

    public static void appenderFlushSync(boolean z10) {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderFlush(0L, z10);
        }
    }

    public static void appenderOpen(int i10, int i11, String str, String str2, String str3, int i12) {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.appenderOpen(i10, i11, str, str2, str3, i12);
        }
    }

    public static void closeLogInstance(String str) {
        synchronized (sLogInstanceMap) {
            if (logImp != null && sLogInstanceMap.containsKey(str)) {
                logImp.releaseXlogInstance(str);
                sLogInstanceMap.remove(str).mLogInstancePtr = -1L;
            }
        }
    }

    public static void d(String str, String str2) {
        d(str, str2, null);
    }

    public static void d(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 != null && logImp2.getLogLevel(0L) <= 1) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            logImp.logD(0L, str, "", "", 0, Process.myPid(), Thread.currentThread().getId(), q.a(), str2);
        }
    }

    public static void e(String str, String str2) {
        e(str, str2, null);
    }

    public static void e(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 != null && logImp2.getLogLevel(0L) <= 4) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            logImp.logE(0L, str, "", "", 0, Process.myPid(), Thread.currentThread().getId(), q.a(), str2);
        }
    }

    public static void f(String str, String str2) {
        f(str, str2, null);
    }

    public static void f(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 != null && logImp2.getLogLevel(0L) <= 5) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            logImp.logF(0L, str, "", "", 0, Process.myPid(), Thread.currentThread().getId(), q.a(), str2);
        }
    }

    public static LogImp getImpl() {
        return logImp;
    }

    public static LogInstance getLogInstance(String str) {
        synchronized (sLogInstanceMap) {
            if (sLogInstanceMap.containsKey(str)) {
                return sLogInstanceMap.get(str);
            }
            return null;
        }
    }

    public static int getLogLevel() {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            return logImp2.getLogLevel(0L);
        }
        return 6;
    }

    public static String getSysInfo() {
        return SYS_INFO;
    }

    public static void i(String str, String str2) {
        i(str, str2, null);
    }

    public static void i(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 != null && logImp2.getLogLevel(0L) <= 2) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            logImp.logI(0L, str, "", "", 0, Process.myPid(), Thread.currentThread().getId(), q.a(), str2);
        }
    }

    public static LogInstance openLogInstance(int i10, int i11, String str, String str2, String str3, int i12) {
        synchronized (sLogInstanceMap) {
            if (sLogInstanceMap.containsKey(str3)) {
                return sLogInstanceMap.get(str3);
            }
            LogInstance logInstance = new LogInstance(i10, i11, str, str2, str3, i12);
            sLogInstanceMap.put(str3, logInstance);
            return logInstance;
        }
    }

    public static void printErrStackTrace(String str, Throwable th2, String str2, Object... objArr) {
        String format;
        LogImp logImp2 = logImp;
        if (logImp2 != null && logImp2.getLogLevel(0L) <= 4) {
            if (objArr == null) {
                format = str2;
            } else {
                format = String.format(str2, objArr);
            }
            if (format == null) {
                format = "";
            }
            StringBuilder a10 = a.a(format, "  ");
            a10.append(android.util.Log.getStackTraceString(th2));
            logImp.logE(0L, str, "", "", 0, Process.myPid(), Thread.currentThread().getId(), q.a(), a10.toString());
        }
    }

    public static void setConsoleLogOpen(boolean z10) {
        LogImp logImp2 = logImp;
        if (logImp2 != null) {
            logImp2.setConsoleLogOpen(0L, z10);
        }
    }

    public static void setLevel(int i10, boolean z10) {
        level = i10;
        android.util.Log.w(TAG, "new log level: " + i10);
        if (z10) {
            android.util.Log.e(TAG, "no jni log level support");
        }
    }

    public static void setLogImp(LogImp logImp2) {
        logImp = logImp2;
    }

    public static void v(String str, String str2) {
        v(str, str2, null);
    }

    public static void v(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 != null && logImp2.getLogLevel(0L) <= 0) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            logImp.logV(0L, str, "", "", 0, Process.myPid(), Thread.currentThread().getId(), q.a(), str2);
        }
    }

    public static void w(String str, String str2) {
        w(str, str2, null);
    }

    public static void w(String str, String str2, Object... objArr) {
        LogImp logImp2 = logImp;
        if (logImp2 != null && logImp2.getLogLevel(0L) <= 3) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            if (str2 == null) {
                str2 = "";
            }
            logImp.logW(0L, str, "", "", 0, Process.myPid(), Thread.currentThread().getId(), q.a(), str2);
        }
    }
}
