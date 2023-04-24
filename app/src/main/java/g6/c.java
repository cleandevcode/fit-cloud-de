package g6;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public static final AtomicBoolean f15013a;

    static {
        new c();
        f15013a = new AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0021, code lost:
        if (r1 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a() {
        /*
            java.lang.Class<g6.c> r0 = g6.c.class
            boolean r1 = i6.a.b(r0)
            if (r1 == 0) goto L9
            return
        L9:
            boolean r1 = d6.m0.y()     // Catch: java.lang.Throwable -> L9c
            if (r1 == 0) goto L10
            return
        L10:
            java.io.File r1 = f6.f.b()     // Catch: java.lang.Throwable -> L9c
            r2 = 0
            if (r1 != 0) goto L18
            goto L23
        L18:
            f6.e r3 = new f6.e     // Catch: java.lang.Throwable -> L9c
            r3.<init>()     // Catch: java.lang.Throwable -> L9c
            java.io.File[] r1 = r1.listFiles(r3)     // Catch: java.lang.Throwable -> L9c
            if (r1 != 0) goto L25
        L23:
            java.io.File[] r1 = new java.io.File[r2]     // Catch: java.lang.Throwable -> L9c
        L25:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9c
            int r4 = r1.length     // Catch: java.lang.Throwable -> L9c
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L9c
            int r4 = r1.length     // Catch: java.lang.Throwable -> L9c
            r5 = 0
        L2d:
            if (r5 >= r4) goto L41
            r6 = r1[r5]     // Catch: java.lang.Throwable -> L9c
            java.lang.String r7 = "file"
            gm.l.f(r6, r7)     // Catch: java.lang.Throwable -> L9c
            f6.b r7 = new f6.b     // Catch: java.lang.Throwable -> L9c
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L9c
            r3.add(r7)     // Catch: java.lang.Throwable -> L9c
            int r5 = r5 + 1
            goto L2d
        L41:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9c
            r1.<init>()     // Catch: java.lang.Throwable -> L9c
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L9c
        L4a:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L9c
            if (r4 == 0) goto L61
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L9c
            r5 = r4
            f6.b r5 = (f6.b) r5     // Catch: java.lang.Throwable -> L9c
            boolean r5 = r5.b()     // Catch: java.lang.Throwable -> L9c
            if (r5 == 0) goto L4a
            r1.add(r4)     // Catch: java.lang.Throwable -> L9c
            goto L4a
        L61:
            g6.b r3 = new g6.b     // Catch: java.lang.Throwable -> L9c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L9c
            java.util.List r1 = ul.q.U(r1, r3)     // Catch: java.lang.Throwable -> L9c
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L9c
            r3.<init>()     // Catch: java.lang.Throwable -> L9c
            int r4 = r1.size()     // Catch: java.lang.Throwable -> L9c
            r5 = 5
            int r4 = java.lang.Math.min(r4, r5)     // Catch: java.lang.Throwable -> L9c
            lm.j r2 = h7.a.A(r2, r4)     // Catch: java.lang.Throwable -> L9c
            lm.i r2 = r2.iterator()     // Catch: java.lang.Throwable -> L9c
        L80:
            boolean r4 = r2.f20076c     // Catch: java.lang.Throwable -> L9c
            if (r4 == 0) goto L90
            int r4 = r2.nextInt()     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L9c
            r3.put(r4)     // Catch: java.lang.Throwable -> L9c
            goto L80
        L90:
            java.lang.String r2 = "anr_reports"
            o5.d r4 = new o5.d     // Catch: java.lang.Throwable -> L9c
            r5 = 1
            r4.<init>(r5, r1)     // Catch: java.lang.Throwable -> L9c
            f6.f.e(r2, r3, r4)     // Catch: java.lang.Throwable -> L9c
            return
        L9c:
            r1 = move-exception
            i6.a.a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.c.a():void");
    }
}
