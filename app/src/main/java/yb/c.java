package yb;

import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c */
    public static c f31282c;

    /* renamed from: a */
    public String f31283a;

    /* renamed from: b */
    public String f31284b;

    public static boolean c(String str) {
        m2.f.b("refresh sp aes key");
        if (TextUtils.isEmpty(str)) {
            m2.f.b("refreshLocalKey(): encrypted key is empty");
            return false;
        }
        l.e(y.s(), "Privacy_MY", "PrivacyData", str);
        l.d(y.s(), "flashKeyTime", System.currentTimeMillis());
        return true;
    }

    public static c e() {
        if (f31282c == null) {
            synchronized (c.class) {
                if (f31282c == null) {
                    f31282c = new c();
                }
            }
        }
        return f31282c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0067, code lost:
        if (r3 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a() {
        /*
            r8 = this;
            java.lang.String r0 = r8.f31283a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto La5
            android.content.Context r0 = yb.y.s()
            java.lang.String r1 = "Privacy_MY"
            java.lang.String r2 = "PrivacyData"
            java.lang.String r0 = yb.l.b(r0, r1, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 16
            if (r1 == 0) goto L29
            java.lang.String r0 = cc.b.b(r2)
            java.lang.String r1 = r8.b(r0)
            c(r1)
            goto La3
        L29:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 1
            r4 = 0
            r5 = 23
            if (r1 < r5) goto L33
            r6 = 1
            goto L34
        L33:
            r6 = 0
        L34:
            if (r6 == 0) goto L3d
            java.lang.String r6 = "analytics_keystore"
            java.lang.String r6 = bc.a.b(r6, r0)
            goto L3f
        L3d:
            java.lang.String r6 = ""
        L3f:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto La2
            java.lang.String r6 = "deCrypt work key first"
            m2.f.b(r6)
            java.lang.String r6 = r8.d()
            java.lang.String r0 = yb.e.a(r0, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 == 0) goto L6a
            java.lang.String r0 = cc.b.b(r2)
            java.lang.String r2 = r8.b(r0)
            c(r2)
            if (r1 < r5) goto L66
            goto L67
        L66:
            r3 = 0
        L67:
            if (r3 == 0) goto La3
            goto L77
        L6a:
            if (r1 < r5) goto L6d
            goto L6e
        L6d:
            r3 = 0
        L6e:
            if (r3 == 0) goto La3
            java.lang.String r1 = r8.b(r0)
            c(r1)
        L77:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.Context r2 = yb.y.s()
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r2 = r2.getPath()
            r1.append(r2)
            java.lang.String r2 = "/"
            r1.append(r2)
            java.lang.String r2 = "hms"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            p5.e.l(r2)
            goto La3
        La2:
            r0 = r6
        La3:
            r8.f31283a = r0
        La5:
            java.lang.String r0 = r8.f31283a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yb.c.a():java.lang.String");
    }

    public final String b(String str) {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return bc.a.d("analytics_keystore", str);
        }
        return p.b.d(zb.a.a(str.getBytes(e.f31288a), p.b.r(d())));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:3|(1:5)(2:31|(16:33|7|(1:9)(1:30)|10|(1:12)|13|(1:15)|16|(1:18)|19|(1:21)|22|23|24|25|26))|6|7|(0)(0)|10|(0)|13|(0)|16|(0)|19|(0)|22|23|24|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d2, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d3, code lost:
        r1 = android.support.v4.media.d.a("pbkdf exception : ");
        r1.append(r0.getMessage());
        o8.b.f("PBKDF2", r1.toString());
        r0 = new byte[0];
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a3 A[LOOP:0: B:65:0x00a1->B:66:0x00a3, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String d() {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yb.c.d():java.lang.String");
    }
}
