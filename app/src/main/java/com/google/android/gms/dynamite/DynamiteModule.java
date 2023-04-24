package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.huawei.hms.framework.common.ExceptionCode;
import h8.i1;
import i8.n;
import i8.p;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import q8.e;
import q8.f;
import q8.g;

/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: c */
    public static Boolean f6073c = null;

    /* renamed from: d */
    public static String f6074d = null;

    /* renamed from: e */
    public static boolean f6075e = false;

    /* renamed from: f */
    public static int f6076f = -1;

    /* renamed from: g */
    public static Boolean f6077g;

    /* renamed from: k */
    public static f f6081k;

    /* renamed from: l */
    public static g f6082l;

    /* renamed from: a */
    public final Context f6083a;

    /* renamed from: h */
    public static final ThreadLocal f6078h = new ThreadLocal();

    /* renamed from: i */
    public static final i1 f6079i = new i1(1);

    /* renamed from: j */
    public static final b f6080j = new b();

    /* renamed from: b */
    public static final c f6072b = new c();

    @DynamiteApi
    /* loaded from: classes.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* loaded from: classes.dex */
    public static class a extends Exception {
        public /* synthetic */ a(String str) {
            super(str);
        }

        public /* synthetic */ a(String str, Throwable th2) {
            super(str, th2);
        }
    }

    public DynamiteModule(Context context) {
        this.f6083a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (n.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x0249: MOVE  (r4 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]), block:B:339:0x0248 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Class<com.google.android.gms.dynamite.DynamiteModule>] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @ResultIgnorabilityUnspecified
    public static DynamiteModule b(Context context, c cVar, String str) {
        Context context2;
        Throwable th2;
        Context context3;
        Object obj;
        Context context4;
        Context context5;
        p8.b f02;
        DynamiteModule dynamiteModule;
        g gVar;
        boolean z10;
        Boolean valueOf;
        p8.b f03;
        String str2 = str;
        ?? r32 = DynamiteModule.class;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = f6078h;
            e eVar = (e) threadLocal.get();
            e eVar2 = new e(0);
            threadLocal.set(eVar2);
            i1 i1Var = f6079i;
            long longValue = ((Long) i1Var.get()).longValue();
            try {
                i1Var.set(Long.valueOf(SystemClock.elapsedRealtime()));
                q8.a a10 = cVar.a(context, str2, f6080j);
                int i10 = a10.f24636a;
                int i11 = a10.f24637b;
                Log.i("DynamiteModule", "Considering local module " + str2 + ":" + i10 + " and remote module " + str2 + ":" + i11);
                int i12 = a10.f24638c;
                if (i12 != 0) {
                    if (i12 == -1) {
                        if (a10.f24636a != 0) {
                            i12 = -1;
                        }
                    }
                    if (i12 != 1 || a10.f24637b != 0) {
                        if (i12 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(str2));
                            DynamiteModule dynamiteModule2 = new DynamiteModule(applicationContext);
                            if (longValue == 0) {
                                i1Var.remove();
                            } else {
                                i1Var.set(Long.valueOf(longValue));
                            }
                            Cursor cursor = eVar2.f24641a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            threadLocal.set(eVar);
                            return dynamiteModule2;
                        } else if (i12 == 1) {
                            try {
                                try {
                                    int i13 = a10.f24637b;
                                    try {
                                        synchronized (r32) {
                                            try {
                                                if (f(context)) {
                                                    Boolean bool = f6073c;
                                                    try {
                                                        try {
                                                            if (bool != null) {
                                                                if (bool.booleanValue()) {
                                                                    Log.i("DynamiteModule", "Selected remote version of " + str2 + ", version >= " + i13);
                                                                    synchronized (r32) {
                                                                        try {
                                                                            gVar = f6082l;
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            while (true) {
                                                                                try {
                                                                                    break;
                                                                                } catch (Throwable th4) {
                                                                                    th = th4;
                                                                                }
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    if (gVar != null) {
                                                                        e eVar3 = (e) threadLocal.get();
                                                                        if (eVar3 != null && eVar3.f24641a != null) {
                                                                            Context applicationContext2 = context.getApplicationContext();
                                                                            Cursor cursor2 = eVar3.f24641a;
                                                                            context2 = applicationContext;
                                                                            try {
                                                                                new p8.c(null);
                                                                                synchronized (r32) {
                                                                                    if (f6076f >= 2) {
                                                                                        z10 = true;
                                                                                    } else {
                                                                                        z10 = false;
                                                                                    }
                                                                                    valueOf = Boolean.valueOf(z10);
                                                                                }
                                                                                if (valueOf.booleanValue()) {
                                                                                    Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                                                    f03 = gVar.y0(new p8.c(applicationContext2), str2, i13, new p8.c(cursor2));
                                                                                } else {
                                                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                                                    f03 = gVar.f0(new p8.c(applicationContext2), str2, i13, new p8.c(cursor2));
                                                                                }
                                                                                Context context6 = (Context) p8.c.f0(f03);
                                                                                if (context6 != null) {
                                                                                    dynamiteModule = new DynamiteModule(context6);
                                                                                } else {
                                                                                    throw new a("Failed to get module context");
                                                                                }
                                                                            } catch (Throwable th5) {
                                                                                th = th5;
                                                                                th2 = th;
                                                                                r32 = str2;
                                                                                str2 = cVar;
                                                                                try {
                                                                                    p.f(context);
                                                                                } catch (Exception e10) {
                                                                                    try {
                                                                                        Log.e("CrashUtils", "Error adding exception to DropBox!", e10);
                                                                                    } catch (a e11) {
                                                                                        e = e11;
                                                                                        applicationContext = context2;
                                                                                        String message = e.getMessage();
                                                                                        Log.w("DynamiteModule", "Failed to load remote module: " + message);
                                                                                        int i14 = a10.f24636a;
                                                                                        if (i14 != 0) {
                                                                                            str2.getClass();
                                                                                            q8.a aVar = new q8.a();
                                                                                            aVar.f24637b = 0;
                                                                                            aVar.f24636a = i14;
                                                                                            if (i14 != 0) {
                                                                                                aVar.f24638c = -1;
                                                                                            }
                                                                                            if (aVar.f24638c == -1) {
                                                                                                Log.i("DynamiteModule", "Selected local version of ".concat(r32));
                                                                                                return new DynamiteModule(applicationContext);
                                                                                            }
                                                                                        }
                                                                                        throw new a("Remote load failed. No local fallback found.", e);
                                                                                    }
                                                                                }
                                                                                throw new a("Failed to load remote module.", th2);
                                                                            }
                                                                        } else {
                                                                            throw new a("No result cursor");
                                                                        }
                                                                    } else {
                                                                        throw new a("DynamiteLoaderV2 was not cached.");
                                                                    }
                                                                } else {
                                                                    Log.i("DynamiteModule", "Selected remote version of " + str2 + ", version >= " + i13);
                                                                    f g10 = g(context);
                                                                    if (g10 != null) {
                                                                        Parcel k10 = g10.k(g10.a0(), 6);
                                                                        int readInt = k10.readInt();
                                                                        k10.recycle();
                                                                        if (readInt >= 3) {
                                                                            e eVar4 = (e) threadLocal.get();
                                                                            if (eVar4 != null) {
                                                                                f02 = g10.y0(new p8.c(context), str2, i13, new p8.c(eVar4.f24641a));
                                                                            } else {
                                                                                throw new a("No cached result cursor holder");
                                                                            }
                                                                        } else if (readInt == 2) {
                                                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                                            f02 = g10.z0(new p8.c(context), str2, i13);
                                                                        } else {
                                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                                            f02 = g10.f0(new p8.c(context), str2, i13);
                                                                        }
                                                                        Object f04 = p8.c.f0(f02);
                                                                        if (f04 != null) {
                                                                            dynamiteModule = new DynamiteModule((Context) f04);
                                                                        } else {
                                                                            throw new a("Failed to load remote module.");
                                                                        }
                                                                    } else {
                                                                        throw new a("Failed to create IDynamiteLoader.");
                                                                    }
                                                                }
                                                                if (longValue == 0) {
                                                                    i1Var.remove();
                                                                } else {
                                                                    i1Var.set(Long.valueOf(longValue));
                                                                }
                                                                Cursor cursor3 = eVar2.f24641a;
                                                                if (cursor3 != null) {
                                                                    cursor3.close();
                                                                }
                                                                threadLocal.set(eVar);
                                                                return dynamiteModule;
                                                            }
                                                            throw new a("Failed to determine which loading route to use.");
                                                        } catch (RemoteException e12) {
                                                            e = e12;
                                                            throw new a("Failed to load remote module.", e);
                                                        } catch (a e13) {
                                                            e = e13;
                                                            throw e;
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        obj = str2;
                                                        context4 = context5;
                                                        str2 = cVar;
                                                        context2 = context4;
                                                        th2 = th;
                                                        r32 = obj;
                                                        p.f(context);
                                                        throw new a("Failed to load remote module.", th2);
                                                    }
                                                }
                                                context3 = applicationContext;
                                                try {
                                                    throw new a("Remote loading disabled");
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    obj = str2;
                                                    str2 = cVar;
                                                    while (true) {
                                                        try {
                                                            try {
                                                                break;
                                                            } catch (RemoteException e14) {
                                                                e = e14;
                                                                throw new a("Failed to load remote module.", e);
                                                            } catch (a e15) {
                                                                e = e15;
                                                                throw e;
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                context4 = context3;
                                                                context2 = context4;
                                                                th2 = th;
                                                                r32 = obj;
                                                                p.f(context);
                                                                throw new a("Failed to load remote module.", th2);
                                                            }
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th10) {
                                                th = th10;
                                                context3 = applicationContext;
                                            }
                                        }
                                    } catch (RemoteException e16) {
                                        e = e16;
                                    } catch (a e17) {
                                        e = e17;
                                    } catch (Throwable th11) {
                                        th = th11;
                                        context2 = applicationContext;
                                    }
                                } catch (a e18) {
                                    e = e18;
                                    r32 = str2;
                                    applicationContext = applicationContext;
                                    str2 = cVar;
                                }
                            } catch (a e19) {
                                e = e19;
                            }
                        } else {
                            throw new a("VersionPolicy returned invalid code:" + i12);
                        }
                    }
                }
                int i15 = a10.f24636a;
                int i16 = a10.f24637b;
                throw new a("No acceptable module " + str2 + " found. Local version is " + i15 + " and remote version is " + i16 + ".");
            } finally {
                int i17 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                i1 i1Var2 = f6079i;
                if (i17 == 0) {
                    i1Var2.remove();
                } else {
                    i1Var2.set(Long.valueOf(longValue));
                }
                Cursor cursor4 = eVar2.f24641a;
                if (cursor4 != null) {
                    cursor4.close();
                }
                f6078h.set(eVar);
            }
        }
        throw new a("null application Context");
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x0168, code lost:
        if (r3 != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.c(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(boolean r10, boolean r11, java.lang.String r12, android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.d(boolean, boolean, java.lang.String, android.content.Context):int");
    }

    public static void e(ClassLoader classLoader) {
        g gVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                gVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                gVar = queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
            }
            f6082l = gVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new a("Failed to instantiate dynamite loader", e10);
        }
    }

    public static boolean f(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f6077g)) {
            return true;
        }
        boolean z10 = false;
        if (f6077g == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (f8.e.f14182b.b(context, ExceptionCode.CRASH_EXCEPTION) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f6077g = valueOf;
            z10 = valueOf.booleanValue();
            if (z10 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f6075e = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    public static f g(Context context) {
        f fVar;
        synchronized (DynamiteModule.class) {
            f fVar2 = f6081k;
            if (fVar2 != null) {
                return fVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    fVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    fVar = queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
                }
                if (fVar != null) {
                    f6081k = fVar;
                    return fVar;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
            return null;
        }
    }
}
