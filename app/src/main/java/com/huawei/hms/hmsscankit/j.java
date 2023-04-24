package com.huawei.hms.hmsscankit;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.util.Log;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.hmsscankit.api.IRemoteCreator;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a */
    private static volatile Context f7089a;

    public static void a(Context context) {
        context.getClassLoader().loadClass(ScanUtil.CONTEXT_PATH).getDeclaredMethod(ScanUtil.CONTEXT_METHOD, Context.class).invoke(null, context);
    }

    public static IRemoteCreator b(Context context) {
        String str;
        if (context != null) {
            try {
                Context d10 = d(context);
                if (d10 == null) {
                    return null;
                }
                Object newInstance = d10.getClassLoader().loadClass(ScanUtil.CREATOR_PATH).newInstance();
                if (newInstance instanceof IBinder) {
                    return IRemoteCreator.Stub.asInterface((IBinder) newInstance);
                }
                return null;
            } catch (ClassNotFoundException unused) {
                str = "ClassNotFoundException";
                com.huawei.hms.scankit.util.a.b("exception", str);
                return null;
            } catch (IllegalAccessException unused2) {
                str = "IllegalAccessException";
                com.huawei.hms.scankit.util.a.b("exception", str);
                return null;
            } catch (InstantiationException unused3) {
                str = "InstantiationException";
                com.huawei.hms.scankit.util.a.b("exception", str);
                return null;
            } catch (NoSuchMethodException unused4) {
                str = "NoSuchMethodException";
                com.huawei.hms.scankit.util.a.b("exception", str);
                return null;
            } catch (InvocationTargetException unused5) {
                str = "InvocationTargetException";
                com.huawei.hms.scankit.util.a.b("exception", str);
                return null;
            }
        }
        throw new NullPointerException("The input parameter is null.");
    }

    public static IRemoteCreator c(Context context) {
        String str;
        if (context != null) {
            try {
                Object newInstance = context.getClassLoader().loadClass(ScanUtil.CREATOR_PATH).newInstance();
                if (newInstance instanceof IBinder) {
                    return IRemoteCreator.Stub.asInterface((IBinder) newInstance);
                }
            } catch (ClassNotFoundException unused) {
                str = "ClassNotFoundException";
                com.huawei.hms.scankit.util.a.b("exception", str);
                return null;
            } catch (IllegalAccessException unused2) {
                str = "IllegalAccessException";
                com.huawei.hms.scankit.util.a.b("exception", str);
                return null;
            } catch (InstantiationException unused3) {
                str = "InvocationTargetException";
                com.huawei.hms.scankit.util.a.b("exception", str);
                return null;
            }
            return null;
        }
        throw new NullPointerException("The input parameter is null.");
    }

    public static Context d(Context context) {
        Log.i("ScankitSDK", "ScankitSDK Version: SCANPLUS2.5.0.300");
        a(context);
        if (f7089a != null) {
            Log.i("ScankitSDK", "context has been inited");
            return f7089a;
        }
        try {
            int remoteVersion = DynamicModule.getRemoteVersion(context.getApplicationContext(), ScanUtil.MODULE_SCANKIT);
            int e10 = e(context);
            if (e10 > remoteVersion) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("local Version is Higher");
                sb2.append(e10);
                Log.i("ScankitSDK", sb2.toString());
                a(context);
                return context;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("use remote scankit");
            sb3.append(remoteVersion);
            Log.i("ScankitSDK", sb3.toString());
            f7089a = DynamicModule.load(context.getApplicationContext(), DynamicModule.PREFER_REMOTE, ScanUtil.MODULE_SCANKIT).getModuleContext();
            return f7089a;
        } catch (DynamicModule.LoadingException unused) {
            a(context);
            Log.w("ScankitSDK", "Remote Load exception");
            return context;
        } catch (ClassNotFoundException unused2) {
            Log.e("ScankitSDK", "ClassNotFoundException exception");
            a(context);
            return context;
        } catch (IllegalAccessException unused3) {
            Log.e("ScankitSDK", "IllegalAccessException exception");
            a(context);
            return context;
        } catch (NoSuchMethodException unused4) {
            Log.e("ScankitSDK", "NoSuchMethodException exception");
            a(context);
            return context;
        } catch (RuntimeException unused5) {
            Log.e("ScankitSDK", "other RuntimeException exception");
            a(context);
            return context;
        } catch (InvocationTargetException unused6) {
            Log.e("ScankitSDK", "InvocationTargetException exception");
            a(context);
            return context;
        } catch (Exception unused7) {
            Log.e("ScankitSDK", "Exception exception");
            a(context);
            return context;
        } catch (Throwable unused8) {
            Log.e("ScankitSDK", "Throwable exception");
            a(context);
            return context;
        }
    }

    private static int e(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getInt(ScanUtil.MODULE_SCANKIT_LOCAL, Integer.MAX_VALUE);
        } catch (PackageManager.NameNotFoundException unused) {
            com.huawei.hms.scankit.util.a.b("exception", "NameNotFoundException");
            return Integer.MAX_VALUE;
        }
    }
}
