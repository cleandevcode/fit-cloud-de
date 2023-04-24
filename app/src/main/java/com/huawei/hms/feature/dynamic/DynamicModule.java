package com.huawei.hms.feature.dynamic;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.huawei.hms.feature.dynamic.IDynamicInstall;
import com.huawei.hms.feature.dynamic.IDynamicLoader;
import com.huawei.hms.feature.dynamic.a.d;
import com.huawei.hms.feature.dynamic.a.e;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public class DynamicModule {

    /* renamed from: b */
    private static final int f6964b = 256;

    /* renamed from: c */
    private static final int f6965c = -100;

    /* renamed from: h */
    private static int f6969h = 0;

    /* renamed from: i */
    private static final int f6970i = 1;

    /* renamed from: j */
    private static final int f6971j = 2;

    /* renamed from: g */
    private Context f6972g;
    public static final VersionPolicy PREFER_REMOTE = new e();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new com.huawei.hms.feature.dynamic.a.c();
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new d();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new e();

    /* renamed from: a */
    private static final String f6963a = "DynamicModule";

    /* renamed from: d */
    private static final ThreadLocal<HashMap<String, Boolean>> f6966d = new ThreadLocal<>();

    /* renamed from: e */
    private static final ThreadLocal<HashMap<String, String>> f6967e = new ThreadLocal<>();

    /* renamed from: f */
    private static final ThreadLocal<HashMap<String, IDynamicLoader>> f6968f = new ThreadLocal<>();

    /* loaded from: classes.dex */
    public static class DynamicLoaderClassLoader {

        /* renamed from: a */
        private static HashMap<String, ClassLoader> f6978a = new HashMap<>();

        public static ClassLoader getsClassLoader(String str) {
            return f6978a.get(str);
        }

        public static void setsClassLoader(String str, ClassLoader classLoader) {
            f6978a.put(str, classLoader);
        }
    }

    /* loaded from: classes.dex */
    public static class LoadingException extends Exception {

        /* renamed from: a */
        private Bundle f6979a;

        private LoadingException(String str) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, byte b10) {
            this(str);
        }

        private LoadingException(String str, Bundle bundle) {
            super(str);
            this.f6979a = bundle;
        }

        public /* synthetic */ LoadingException(String str, Bundle bundle, byte b10) {
            this(str, bundle);
        }

        public Bundle getBundle() {
            return this.f6979a;
        }
    }

    /* loaded from: classes.dex */
    public interface VersionPolicy {
        Bundle getModuleInfo(Context context, String str);
    }

    /* loaded from: classes.dex */
    public static class a extends Exception {
        private a(String str) {
            super(str);
        }

        public /* synthetic */ a(String str, byte b10) {
            this(str);
        }
    }

    private DynamicModule(Context context) {
        this.f6972g = context;
    }

    public static Set<String> GetInstalledModuleInfo() {
        return c.a().f7025a;
    }

    private static Context a(Context context, String str, Bundle bundle, IDynamicLoader iDynamicLoader) {
        try {
            IObjectWrapper load = iDynamicLoader.load(ObjectWrapper.wrap(context), str, bundle.getInt(b.f7009j), ObjectWrapper.wrap(bundle));
            if (ObjectWrapper.unwrap(load) == null) {
                ob.a.d(5, f6963a, "Get remote context is null.");
                return null;
            } else if (ObjectWrapper.unwrap(load) instanceof Context) {
                ob.a.d(4, f6963a, "Get context success.");
                return (Context) ObjectWrapper.unwrap(load);
            } else if (ObjectWrapper.unwrap(load).getClass().getName().equals(LoadingException.class.getName())) {
                ob.a.d(5, f6963a, "Successfully get the bundle in exception.");
                throw new LoadingException("Failed to load, please check the bundle in exception.", (Bundle) ObjectWrapper.unwrap(load).getClass().getDeclaredMethod("getBundle", new Class[0]).invoke(ObjectWrapper.unwrap(load), new Object[0]), (byte) 0);
            } else {
                return null;
            }
        } catch (LoadingException e10) {
            throw e10;
        } catch (Exception e11) {
            ob.a.e(f6963a, "Failed to get remote module context.", e11);
            return null;
        }
    }

    private static DynamicModule a(Context context, String str, Bundle bundle) {
        Boolean bool;
        IDynamicLoader iDynamicLoader;
        try {
            synchronized (DynamicModule.class) {
                HashMap<String, Boolean> hashMap = f6966d.get();
                Objects.requireNonNull(hashMap);
                bool = hashMap.get(str);
                HashMap<String, IDynamicLoader> hashMap2 = f6968f.get();
                Objects.requireNonNull(hashMap2);
                iDynamicLoader = hashMap2.get(str);
            }
            if (bool == null || iDynamicLoader == null) {
                throw new LoadingException("The loader for " + str + " was not prepared.", (byte) 0);
            }
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Context a10 = a(context, str, bundle, iDynamicLoader);
            if (a10 != null) {
                return new DynamicModule(a10);
            }
            throw new LoadingException("Failed to get remote module context: null", (byte) 0);
        } catch (LoadingException e10) {
            throw e10;
        } catch (Exception unused) {
            throw new LoadingException("Load Module Error.", (byte) 0);
        }
    }

    private static IDynamicInstall a(String str) {
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return IDynamicInstall.Stub.asInterface((IBinder) new com.huawei.hms.feature.dynamic.a.a(str, ClassLoader.getSystemClassLoader()).loadClass(b.f7005f).getConstructor(new Class[0]).newInstance(new Object[0]));
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
                throw new LoadingException("getHMSDynamicInstaller: failed to instantiate dynamic loader:" + e10.getMessage(), (byte) 0);
            }
        }
        throw new LoadingException("Failed to get dynamicLoader path.", (byte) 0);
    }

    private static void a(String str, ClassLoader classLoader) {
        try {
            f6968f.set(new HashMap<String, IDynamicLoader>(str, (IBinder) classLoader.loadClass(b.f7004e).getConstructor(new Class[0]).newInstance(new Object[0])) { // from class: com.huawei.hms.feature.dynamic.DynamicModule.3

                /* renamed from: a */
                public final /* synthetic */ String f6976a;

                /* renamed from: b */
                public final /* synthetic */ IBinder f6977b;

                {
                    this.f6976a = str;
                    this.f6977b = r2;
                    put(str, IDynamicLoader.Stub.asInterface(r2));
                }
            });
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new LoadingException("Failed to get loader interface:" + e10.getMessage(), (byte) 0);
        }
    }

    private static Bundle b(Context context, String str) {
        Context applicationContext;
        boolean z10 = false;
        try {
            try {
                if (context.getApplicationContext() == null) {
                    applicationContext = context;
                } else {
                    applicationContext = context.getApplicationContext();
                }
                Class<?> loadClass = applicationContext.getClassLoader().loadClass(DynamicLoaderClassLoader.class.getName());
                Method declaredMethod = loadClass.getDeclaredMethod("getsClassLoader", String.class);
                Method declaredMethod2 = loadClass.getDeclaredMethod("setsClassLoader", String.class, ClassLoader.class);
                ClassLoader classLoader = (ClassLoader) declaredMethod.invoke(null, str);
                if (classLoader != null) {
                    if (classLoader != ClassLoader.getSystemClassLoader()) {
                        ob.a.d(4, f6963a, "Cached loader is available, ready to use it.");
                        try {
                            a(str, classLoader);
                        } catch (LoadingException e10) {
                            ob.a.e(f6963a, "Get loader interface failed.", e10);
                        }
                        z10 = true;
                    }
                } else {
                    try {
                        ob.a.d(4, f6963a, "No available cached loader, query remote.");
                        Bundle c10 = c(context, str);
                        synchronized (DynamicModule.class) {
                            HashMap<String, String> hashMap = f6967e.get();
                            Objects.requireNonNull(hashMap);
                            String str2 = hashMap.get(str);
                            if (TextUtils.isEmpty(str2)) {
                                return c10;
                            }
                            com.huawei.hms.feature.dynamic.a.a aVar = new com.huawei.hms.feature.dynamic.a.a(str2, ClassLoader.getSystemClassLoader());
                            a(str, aVar);
                            declaredMethod2.invoke(null, str, aVar);
                            f6966d.set(new HashMap<String, Boolean>(str) { // from class: com.huawei.hms.feature.dynamic.DynamicModule.1

                                /* renamed from: a */
                                public final /* synthetic */ String f6973a;

                                {
                                    this.f6973a = str;
                                    put(str, Boolean.TRUE);
                                }
                            });
                            return c10;
                        }
                    } catch (a unused) {
                    }
                }
            } catch (LoadingException e11) {
                throw e11;
            }
        } catch (Exception e12) {
            ob.a.e(f6963a, "failed to load.", e12);
        }
        HashMap<String, Boolean> hashMap2 = new HashMap<>();
        hashMap2.put(str, Boolean.valueOf(z10));
        f6966d.set(hashMap2);
        return new Bundle();
    }

    private static IDynamicInstall b(Context context) {
        try {
            return (IDynamicInstall) context.getClassLoader().loadClass(b.f7005f).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new LoadingException("getLocalLoaderFallback: failed to instantiate dynamic loader: " + e10.getMessage(), (byte) 0);
        }
    }

    private static Bundle c(Context context, String str) {
        try {
            Bundle d10 = d(context, str);
            String string = d10.getString(b.f7015p);
            if (!TextUtils.isEmpty(string) && new File(string).exists()) {
                f6967e.set(new HashMap<String, String>(str, string) { // from class: com.huawei.hms.feature.dynamic.DynamicModule.2

                    /* renamed from: a */
                    public final /* synthetic */ String f6974a;

                    /* renamed from: b */
                    public final /* synthetic */ String f6975b;

                    {
                        this.f6974a = str;
                        this.f6975b = string;
                        put(str, string);
                    }
                });
                String str2 = f6963a;
                ob.a.d(4, str2, "Query remote version by module name:" + str + " success.");
                return d10;
            }
            String str3 = f6963a;
            ob.a.d(5, str3, "The loader_path:" + string + " in query bundle is not available,change the module version to:-100");
            d10.putInt(b.f7009j, f6965c);
            return d10;
        } catch (LoadingException e10) {
            throw e10;
        } catch (Exception unused) {
            throw new a("failed to Query remote version.", (byte) 0);
        }
    }

    private static Bundle d(Context context, String str) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver != null) {
                Bundle call = contentResolver.call(Uri.parse(b.f7000a), str, (String) null, (Bundle) null);
                if (call != null) {
                    int i10 = call.getInt(b.f7006g);
                    String string = call.getString(b.f7015p);
                    String str2 = f6963a;
                    ob.a.d(4, str2, "bundle info: errorCode:" + i10 + ", moduleVersion:" + call.getInt(b.f7009j) + ", modulePath:" + call.getString(b.f7011l) + ", loader_version:" + call.getInt(b.f7014o) + ", loaderPath:" + string + ", armeabiType:" + call.getInt(b.f7016q));
                    if (i10 == 0) {
                        return call;
                    }
                    ob.a.d(5, str2, "Failed to get " + str + " bundle info, errcode:" + i10);
                    throw new LoadingException("Query " + str + " unavailable, errorCode:" + i10, call, (byte) 0);
                }
                ob.a.d(5, f6963a, "Failed to get bundle info:null.");
                throw new a("Query remote version failed: null bundle info.", (byte) 0);
            }
            throw new a("Query remote version failed: null contentResolver.", (byte) 0);
        } catch (LoadingException e10) {
            throw e10;
        } catch (Exception unused) {
            throw new a("failed to get :" + str + " info.", (byte) 0);
        }
    }

    public static Bundle getLocalModuleInfo(Context context, String str) {
        int localVersion = getLocalVersion(context, str);
        Bundle bundle = new Bundle();
        bundle.putString(b.f7008i, str);
        bundle.putInt(b.f7010k, localVersion);
        return bundle;
    }

    public static int getLocalVersion(Context context, String str) {
        if (context != null && str.length() != 0 && str.length() <= 256) {
            try {
                String str2 = "com.huawei.hms.feature.dynamic.descriptors." + str + ".ModuleDescriptor";
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                return context.getClassLoader().loadClass(str2).getDeclaredField("MODULE_VERSION").getInt(null);
            } catch (ClassNotFoundException unused) {
                ob.a.d(5, f6963a, "Cannot find the class of module descriptor for ".concat(str));
                return 0;
            } catch (Exception e10) {
                ob.a.e(f6963a, "Get local module info failed.", e10);
                return 0;
            }
        }
        ob.a.d(6, f6963a, "Invalid context or moduleName.");
        return 0;
    }

    public static Bundle getRemoteModuleInfo(Context context, String str) {
        try {
        } catch (LoadingException e10) {
            throw e10;
        } catch (Exception e11) {
            String str2 = f6963a;
            ob.a.e(str2, "Get remote module info for " + str + " failed.", e11);
        }
        synchronized (DynamicModule.class) {
            ThreadLocal<HashMap<String, Boolean>> threadLocal = f6966d;
            if (threadLocal.get() == null || threadLocal.get().get(str) == null || !threadLocal.get().get(str).booleanValue()) {
                Bundle b10 = b(context, str);
                if (b10.getInt(b.f7009j) > 0) {
                    return b10;
                }
            }
            if (threadLocal.get().get(str).booleanValue()) {
                try {
                    return c(context, str);
                } catch (a e12) {
                    ob.a.e(f6963a, "Query remote module info in HMS failed.", e12);
                }
            }
            return new Bundle();
        }
    }

    public static int getRemoteVersion(Context context, String str) {
        try {
            Bundle c10 = c(context, str);
            if (c10 != null && !c10.isEmpty()) {
                return c10.getInt(b.f7009j);
            }
            String str2 = f6963a;
            ob.a.d(5, str2, "Query remote module:" + str + " info failed.");
            throw new LoadingException("Query remote module info failed: null or empty.", (byte) 0);
        } catch (a e10) {
            String str3 = f6963a;
            ob.a.d(5, str3, "Query remote module:" + str + " exception:" + e10);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void install(android.content.Context r5) {
        /*
            if (r5 != 0) goto Lb
            java.lang.String r5 = com.huawei.hms.feature.dynamic.DynamicModule.f6963a
            r0 = 6
            java.lang.String r1 = "The input context is null."
            ob.a.d(r0, r5, r1)
            return
        Lb:
            r0 = 0
            r1 = 4
            com.huawei.hms.feature.dynamic.IDynamicInstall r2 = a(r5)     // Catch: java.lang.NullPointerException -> L31 android.os.RemoteException -> L33 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L35
            if (r2 == 0) goto L3f
            com.huawei.hms.feature.dynamic.IObjectWrapper r3 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r5)     // Catch: java.lang.NullPointerException -> L31 android.os.RemoteException -> L33 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L35
            android.os.Bundle r4 = new android.os.Bundle     // Catch: java.lang.NullPointerException -> L31 android.os.RemoteException -> L33 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L35
            r4.<init>()     // Catch: java.lang.NullPointerException -> L31 android.os.RemoteException -> L33 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L35
            android.os.Bundle r2 = r2.install(r3, r4)     // Catch: java.lang.NullPointerException -> L31 android.os.RemoteException -> L33 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L35
            if (r2 == 0) goto L37
            com.huawei.hms.feature.dynamic.c r3 = com.huawei.hms.feature.dynamic.c.a()     // Catch: java.lang.NullPointerException -> L31 android.os.RemoteException -> L33 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L35
            r3.a(r2)     // Catch: java.lang.NullPointerException -> L31 android.os.RemoteException -> L33 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L35
            java.lang.String r2 = com.huawei.hms.feature.dynamic.DynamicModule.f6963a     // Catch: java.lang.NullPointerException -> L31 android.os.RemoteException -> L33 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L35
            java.lang.String r3 = "Install module success."
            ob.a.d(r1, r2, r3)     // Catch: java.lang.NullPointerException -> L31 android.os.RemoteException -> L33 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L35
            return
        L31:
            r2 = move-exception
            goto L47
        L33:
            r2 = move-exception
            goto L47
        L35:
            r2 = move-exception
            goto L47
        L37:
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r2 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException     // Catch: java.lang.NullPointerException -> L31 android.os.RemoteException -> L33 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L35
            java.lang.String r3 = "Get install info failed: moduleBundle is null."
            r2.<init>(r3, r0)     // Catch: java.lang.NullPointerException -> L31 android.os.RemoteException -> L33 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L35
            throw r2     // Catch: java.lang.NullPointerException -> L31 android.os.RemoteException -> L33 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L35
        L3f:
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r2 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException     // Catch: java.lang.NullPointerException -> L31 android.os.RemoteException -> L33 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L35
            java.lang.String r3 = "Get dynamicInstaller failed."
            r2.<init>(r3, r0)     // Catch: java.lang.NullPointerException -> L31 android.os.RemoteException -> L33 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L35
            throw r2     // Catch: java.lang.NullPointerException -> L31 android.os.RemoteException -> L33 com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L35
        L47:
            int r3 = com.huawei.hms.feature.dynamic.DynamicModule.f6969h
            r4 = 2
            if (r3 == r4) goto L91
            java.lang.String r3 = "huawei_module_dynamicloader"
            int r3 = getLocalVersion(r5, r3)
            if (r3 <= 0) goto L91
            java.lang.String r2 = com.huawei.hms.feature.dynamic.DynamicModule.f6963a
            java.lang.String r3 = "Ready to use local loader-fallback to retry:"
            ob.a.d(r1, r2, r3)
            com.huawei.hms.feature.dynamic.IDynamicInstall r3 = b(r5)     // Catch: java.lang.NullPointerException -> L7b android.os.RemoteException -> L7d com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L7f
            com.huawei.hms.feature.dynamic.IObjectWrapper r5 = com.huawei.hms.feature.dynamic.ObjectWrapper.wrap(r5)     // Catch: java.lang.NullPointerException -> L7b android.os.RemoteException -> L7d com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L7f
            android.os.Bundle r4 = new android.os.Bundle     // Catch: java.lang.NullPointerException -> L7b android.os.RemoteException -> L7d com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L7f
            r4.<init>()     // Catch: java.lang.NullPointerException -> L7b android.os.RemoteException -> L7d com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L7f
            android.os.Bundle r5 = r3.install(r5, r4)     // Catch: java.lang.NullPointerException -> L7b android.os.RemoteException -> L7d com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L7f
            if (r5 == 0) goto L81
            com.huawei.hms.feature.dynamic.c r0 = com.huawei.hms.feature.dynamic.c.a()     // Catch: java.lang.NullPointerException -> L7b android.os.RemoteException -> L7d com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L7f
            r0.a(r5)     // Catch: java.lang.NullPointerException -> L7b android.os.RemoteException -> L7d com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L7f
            java.lang.String r5 = "Retry install module with local loader-fallback success."
            ob.a.d(r1, r2, r5)     // Catch: java.lang.NullPointerException -> L7b android.os.RemoteException -> L7d com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L7f
            return
        L7b:
            r5 = move-exception
            goto L89
        L7d:
            r5 = move-exception
            goto L89
        L7f:
            r5 = move-exception
            goto L89
        L81:
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r5 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException     // Catch: java.lang.NullPointerException -> L7b android.os.RemoteException -> L7d com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L7f
            java.lang.String r1 = "Retry: get install info failed: moduleBundle is null."
            r5.<init>(r1, r0)     // Catch: java.lang.NullPointerException -> L7b android.os.RemoteException -> L7d com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L7f
            throw r5     // Catch: java.lang.NullPointerException -> L7b android.os.RemoteException -> L7d com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L7f
        L89:
            java.lang.String r0 = com.huawei.hms.feature.dynamic.DynamicModule.f6963a
            java.lang.String r1 = "Retry failed with local loader-fallback."
            ob.a.e(r0, r1, r5)
            return
        L91:
            java.lang.String r5 = com.huawei.hms.feature.dynamic.DynamicModule.f6963a
            java.lang.String r0 = "Install module failed."
            ob.a.e(r5, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.feature.dynamic.DynamicModule.install(android.content.Context):void");
    }

    public static DynamicModule load(Context context, VersionPolicy versionPolicy, String str) {
        if (context != null && versionPolicy != null && str != null && str.length() != 0 && str.length() <= 256) {
            try {
                try {
                    Bundle moduleInfo = versionPolicy.getModuleInfo(context, str);
                    if (moduleInfo.getInt(b.f7009j) > 0) {
                        try {
                            return a(context, str, moduleInfo);
                        } catch (LoadingException e10) {
                            ob.a.e(f6963a, "Failed to load remote module.", e10);
                            if (getLocalVersion(context, str) <= 0) {
                                return null;
                            }
                            ob.a.d(3, f6963a, "Local module version is valid, use local fallback.");
                            return new DynamicModule(context.getApplicationContext());
                        }
                    } else if (moduleInfo.getInt(b.f7010k) > 0) {
                        ob.a.d(4, f6963a, "Remote version is invalid, use local context.");
                        return new DynamicModule(context.getApplicationContext());
                    } else {
                        throw new LoadingException("Query remote version and local version failed.", (byte) 0);
                    }
                } catch (LoadingException e11) {
                    throw e11;
                }
            } catch (Exception e12) {
                ob.a.d(6, f6963a, "Other exception:".concat(String.valueOf(e12)));
                throw new LoadingException("Load failed.", (byte) 0);
            }
        }
        throw new LoadingException("Null param, please check it.", (byte) 0);
    }

    public final Context getModuleContext() {
        return this.f6972g;
    }

    private static Bundle a(Context context, String str) {
        try {
            Bundle d10 = d(context, str);
            String string = d10.getString(b.f7015p);
            if (!TextUtils.isEmpty(string) && new File(string).exists()) {
                String str2 = f6963a;
                ob.a.d(4, str2, "Query HMS module:" + str + " info success.");
                return d10;
            }
            String str3 = f6963a;
            ob.a.d(5, str3, "The loader_path:" + string + " is not available.");
            throw new LoadingException("The loader_path in queryBundle is empty or not exist.", (byte) 0);
        } catch (LoadingException e10) {
            throw e10;
        } catch (Exception unused) {
            throw new a("failed to get :" + str + " info.", (byte) 0);
        }
    }

    private static IDynamicInstall a(Context context) {
        int i10;
        int i11;
        String str = null;
        try {
            Bundle a10 = a(context, b.f7003d);
            str = a10.getString(b.f7015p);
            i10 = a10.getInt(b.f7014o);
        } catch (Exception e10) {
            ob.a.e(f6963a, "Cannot get remote HMS dynamicLoader.", e10);
            i10 = 0;
        }
        try {
            i11 = getLocalVersion(context, b.f7003d);
        } catch (Exception e11) {
            ob.a.e(f6963a, "Cannot find local dynamicLoader fallback.", e11);
            i11 = 0;
        }
        String str2 = f6963a;
        ob.a.d(4, str2, "DynamicLoader remoteHMSVersion:" + i10 + ", hmsLoaderPath:" + str + ", localLoaderVersion:" + i11);
        int i12 = i10 > i11 ? i10 : i11;
        if (i12 > 10009300) {
            if (i10 > i11) {
                ob.a.d(4, str2, "Choose hms dynamicLoader: ".concat(String.valueOf(str)));
                f6969h = 1;
                return a(str);
            }
            ob.a.d(4, str2, "Choose local dynamicLoader fallback: ");
            f6969h = 2;
            return b(context);
        }
        ob.a.d(5, str2, "The current version:" + i12 + " is too low.");
        throw new LoadingException("The loader version:" + i12 + " is too low to support HFF.", (byte) 0);
    }
}
