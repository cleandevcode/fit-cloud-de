package y0;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import f1.g;
import java.io.File;
import java.util.concurrent.Executor;
import s.h1;
import x0.c0;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    public static final Object f30807a = new Object();

    /* renamed from: y0.a$a */
    /* loaded from: classes.dex */
    public static class C0565a {
        public static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        public static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        public static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        public static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i10) {
            return context.getDrawable(i10);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static int a(Context context, int i10) {
            int color;
            color = context.getColor(i10);
            return color;
        }

        public static <T> T b(Context context, Class<T> cls) {
            Object systemService;
            systemService = context.getSystemService(cls);
            return (T) systemService;
        }

        public static String c(Context context, Class<?> cls) {
            String systemServiceName;
            systemServiceName = context.getSystemServiceName(cls);
            return systemServiceName;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
            Intent registerReceiver;
            if ((i10 & 4) != 0 && str == null) {
                Object obj = a.f30807a;
                String str2 = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
                if (h1.j(context, str2) == 0) {
                    return context.registerReceiver(broadcastReceiver, intentFilter, str2, handler);
                }
                throw new RuntimeException(android.support.v4.media.a.a("Permission ", str2, " is required by your application to receive broadcasts, please add it to your manifest"));
            }
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i10 & 1);
            return registerReceiver;
        }

        public static ComponentName b(Context context, Intent intent) {
            ComponentName startForegroundService;
            startForegroundService = context.startForegroundService(intent);
            return startForegroundService;
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public static Executor a(Context context) {
            Executor mainExecutor;
            mainExecutor = context.getMainExecutor();
            return mainExecutor;
        }
    }

    public static int a(Context context, String str) {
        if (str != null) {
            if (!f1.a.b() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (new c0(context).a()) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static int b(Context context, int i10) {
        return Build.VERSION.SDK_INT >= 23 ? d.a(context, i10) : context.getResources().getColor(i10);
    }

    public static Executor c(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? f.a(context) : new g(new Handler(context.getMainLooper()));
    }
}
