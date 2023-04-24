package o5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import bi.z0;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import o5.a;
import s.t0;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: c */
    public static Executor f22839c;

    /* renamed from: d */
    public static volatile String f22840d;

    /* renamed from: e */
    public static volatile String f22841e;

    /* renamed from: f */
    public static volatile String f22842f;

    /* renamed from: g */
    public static volatile Boolean f22843g;

    /* renamed from: i */
    public static Context f22845i;

    /* renamed from: l */
    public static String f22848l;

    /* renamed from: m */
    public static boolean f22849m;

    /* renamed from: n */
    public static boolean f22850n;

    /* renamed from: o */
    public static boolean f22851o;

    /* renamed from: p */
    public static final AtomicBoolean f22852p;

    /* renamed from: q */
    public static volatile String f22853q;

    /* renamed from: r */
    public static volatile String f22854r;

    /* renamed from: s */
    public static t0 f22855s;

    /* renamed from: t */
    public static boolean f22856t;

    /* renamed from: a */
    public static final v f22837a = new v();

    /* renamed from: b */
    public static final HashSet<g0> f22838b = z0.e(g0.DEVELOPER_ERRORS);

    /* renamed from: h */
    public static AtomicLong f22844h = new AtomicLong(65536);

    /* renamed from: j */
    public static int f22846j = 64206;

    /* renamed from: k */
    public static final ReentrantLock f22847k = new ReentrantLock();

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    static {
        int i10 = d6.i0.f12694a;
        f22848l = "v14.0";
        f22852p = new AtomicBoolean(false);
        f22853q = "instagram.com";
        f22854r = "facebook.com";
        f22855s = new t0(3);
    }

    public static final Context a() {
        d6.n0.g();
        Context context = f22845i;
        if (context != null) {
            return context;
        }
        gm.l.l("applicationContext");
        throw null;
    }

    public static final String b() {
        d6.n0.g();
        String str = f22840d;
        if (str != null) {
            return str;
        }
        throw new p("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final Executor c() {
        ReentrantLock reentrantLock = f22847k;
        reentrantLock.lock();
        try {
            if (f22839c == null) {
                f22839c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            tl.l lVar = tl.l.f28297a;
            reentrantLock.unlock();
            Executor executor = f22839c;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String d() {
        d6.m0 m0Var = d6.m0.f12709a;
        gm.l.e(String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{f22848l}, 1)), "java.lang.String.format(format, *args)");
        return f22848l;
    }

    public static final String e() {
        String str;
        String str2;
        Date date = o5.a.f22664l;
        o5.a b10 = a.c.b();
        if (b10 != null) {
            str = b10.f22677k;
        } else {
            str = null;
        }
        d6.m0 m0Var = d6.m0.f12709a;
        String str3 = f22854r;
        if (str != null) {
            if (gm.l.a(str, "gaming")) {
                str2 = "fb.gg";
            } else if (gm.l.a(str, "instagram")) {
                str2 = "instagram.com";
            } else {
                return str3;
            }
            return om.h.Y(str3, "facebook.com", str2);
        }
        return str3;
    }

    public static final boolean f(Context context) {
        d6.n0.g();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static final synchronized boolean g() {
        boolean z10;
        synchronized (v.class) {
            z10 = f22856t;
        }
        return z10;
    }

    public static final boolean h() {
        return f22852p.get();
    }

    public static final void i(g0 g0Var) {
        gm.l.f(g0Var, "behavior");
        synchronized (f22838b) {
        }
    }

    public static final void j(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f22840d == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale locale = Locale.ROOT;
                    gm.l.e(locale, "ROOT");
                    String lowerCase = str.toLowerCase(locale);
                    gm.l.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (om.h.a0(lowerCase, "fb", false)) {
                        str = str.substring(2);
                        gm.l.e(str, "(this as java.lang.String).substring(startIndex)");
                    }
                    f22840d = str;
                } else if (obj instanceof Number) {
                    throw new p("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (f22841e == null) {
                f22841e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f22842f == null) {
                f22842f = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (f22846j == 64206) {
                f22846j = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f22843g == null) {
                f22843g = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static final synchronized void k(Context context) {
        synchronized (v.class) {
            gm.l.f(context, "applicationContext");
            l(context);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x011c A[Catch: all -> 0x0132, TryCatch #2 {, blocks: (B:71:0x0003, B:76:0x0013, B:78:0x002c, B:80:0x0034, B:86:0x0040, B:88:0x0044, B:94:0x0050, B:103:0x0071, B:104:0x0073, B:106:0x0077, B:108:0x007b, B:110:0x0081, B:112:0x0087, B:113:0x008f, B:114:0x0094, B:115:0x0095, B:117:0x00a1, B:120:0x0110, B:121:0x0115, B:122:0x0116, B:123:0x011b, B:124:0x011c, B:125:0x0123, B:126:0x0124, B:127:0x012b, B:128:0x012c, B:129:0x0131, B:97:0x005e), top: B:133:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0124 A[Catch: all -> 0x0132, TryCatch #2 {, blocks: (B:71:0x0003, B:76:0x0013, B:78:0x002c, B:80:0x0034, B:86:0x0040, B:88:0x0044, B:94:0x0050, B:103:0x0071, B:104:0x0073, B:106:0x0077, B:108:0x007b, B:110:0x0081, B:112:0x0087, B:113:0x008f, B:114:0x0094, B:115:0x0095, B:117:0x00a1, B:120:0x0110, B:121:0x0115, B:122:0x0116, B:123:0x011b, B:124:0x011c, B:125:0x0123, B:126:0x0124, B:127:0x012b, B:128:0x012c, B:129:0x0131, B:97:0x005e), top: B:133:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0040 A[Catch: all -> 0x0132, TryCatch #2 {, blocks: (B:71:0x0003, B:76:0x0013, B:78:0x002c, B:80:0x0034, B:86:0x0040, B:88:0x0044, B:94:0x0050, B:103:0x0071, B:104:0x0073, B:106:0x0077, B:108:0x007b, B:110:0x0081, B:112:0x0087, B:113:0x008f, B:114:0x0094, B:115:0x0095, B:117:0x00a1, B:120:0x0110, B:121:0x0115, B:122:0x0116, B:123:0x011b, B:124:0x011c, B:125:0x0123, B:126:0x0124, B:127:0x012b, B:128:0x012c, B:129:0x0131, B:97:0x005e), top: B:133:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0050 A[Catch: all -> 0x0132, TRY_LEAVE, TryCatch #2 {, blocks: (B:71:0x0003, B:76:0x0013, B:78:0x002c, B:80:0x0034, B:86:0x0040, B:88:0x0044, B:94:0x0050, B:103:0x0071, B:104:0x0073, B:106:0x0077, B:108:0x007b, B:110:0x0081, B:112:0x0087, B:113:0x008f, B:114:0x0094, B:115:0x0095, B:117:0x00a1, B:120:0x0110, B:121:0x0115, B:122:0x0116, B:123:0x011b, B:124:0x011c, B:125:0x0123, B:126:0x0124, B:127:0x012b, B:128:0x012c, B:129:0x0131, B:97:0x005e), top: B:133:0x0003 }] */
    /* JADX WARN: Type inference failed for: r1v5, types: [o5.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized void l(android.content.Context r6) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.v.l(android.content.Context):void");
    }
}
