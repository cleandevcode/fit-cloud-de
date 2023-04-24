package yb;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b */
    public static n f31353b;

    /* renamed from: a */
    public Context f31354a;

    static {
        new HashMap();
    }

    public static n a() {
        n nVar;
        synchronized (n.class) {
            if (f31353b == null) {
                f31353b = new n();
            }
            nVar = f31353b;
        }
        return nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.content.Context r6) {
        /*
            r5 = this;
            r5.f31354a = r6
            java.lang.String r0 = ""
            if (r6 != 0) goto L7
            goto L1f
        L7:
            android.content.pm.PackageManager r1 = r6.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            java.lang.String r2 = r6.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            r3 = 16384(0x4000, float:2.2959E-41)
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            java.lang.String r1 = r1.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L18
            goto L20
        L18:
            java.lang.String r1 = "hmsSdk"
            java.lang.String r2 = "getVersion(): The package name is not correct!"
            m2.f.h(r1, r2)
        L1f:
            r1 = r0
        L20:
            yb.r r2 = yb.r.a()
            yb.z r2 = r2.f31380a
            r2.f31424e = r1
            yb.k0 r2 = yb.k0.f31336c
            boolean r2 = r2.a()
            if (r2 == 0) goto L62
            java.lang.String r2 = "global_v2"
            java.lang.String r3 = "app_ver"
            java.lang.String r4 = yb.l.b(r6, r2, r3)
            yb.l.e(r6, r2, r3, r1)
            yb.r r6 = yb.r.a()
            yb.z r6 = r6.f31380a
            r6.getClass()
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L4d
            java.lang.String r6 = "app ver is first save!"
            goto L64
        L4d:
            boolean r6 = r4.equals(r1)
            if (r6 != 0) goto L67
            java.lang.String r6 = "the appVers are different!"
            m2.f.b(r6)
            yb.n r6 = a()
            java.lang.String r1 = "alltype"
            r6.d(r0, r1, r4)
            goto L67
        L62:
            java.lang.String r6 = "userManager.isUserUnlocked() == false"
        L64:
            m2.f.b(r6)
        L67:
            yb.r r6 = yb.r.a()
            yb.z r6 = r6.f31380a
            java.lang.String r0 = yb.i.b()
            r6.f31420a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yb.n.b(android.content.Context):void");
    }

    public final void c(String str, String str2) {
        boolean z10;
        long j10;
        w r10 = y.r(str, str2);
        boolean z11 = true;
        if (r10 != null) {
            z10 = r10.f31410n;
        } else {
            z10 = true;
        }
        if (z10) {
            w r11 = y.r(str, str2);
            if (r11 != null) {
                j10 = r11.f31413q;
            } else {
                j10 = 0;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j10 > 30000) {
                p0 p0Var = m2.f.f20193a;
                if ((!p0Var.f31373a || 3 < p0Var.f31374b) ? false : false) {
                    p0.a(3, "hmsSdk", "begin to call onReport!");
                }
                w r12 = y.r(str, str2);
                if (r12 != null) {
                    r12.f31413q = currentTimeMillis;
                }
                d(str, str2, r.a().f31380a.f31424e);
                return;
            }
            m2.f.h("hmsSdk", "autoReport timeout. interval < 30s ");
            return;
        }
        m2.f.b("auto report is closed tag:" + str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0082, code lost:
        if (r2.equalsIgnoreCase("CDMA2000") == false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yb.n.d(java.lang.String, java.lang.String, java.lang.String):void");
    }
}
