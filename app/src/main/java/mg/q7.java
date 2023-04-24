package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class q7 implements Callable<rg.q> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21381a;

    /* renamed from: b */
    public final /* synthetic */ h7 f21382b;

    public q7(h7 h7Var, m2.y yVar) {
        this.f21382b = h7Var;
        this.f21381a = yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0071 A[Catch: all -> 0x00cc, TryCatch #0 {all -> 0x00cc, blocks: (B:52:0x000a, B:54:0x0029, B:58:0x0035, B:62:0x004a, B:68:0x0063, B:76:0x0089, B:81:0x0097, B:89:0x00bd, B:88:0x00a4, B:79:0x0091, B:75:0x0071, B:65:0x005b, B:61:0x0046, B:57:0x0031), top: B:96:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0091 A[Catch: all -> 0x00cc, TryCatch #0 {all -> 0x00cc, blocks: (B:52:0x000a, B:54:0x0029, B:58:0x0035, B:62:0x004a, B:68:0x0063, B:76:0x0089, B:81:0x0097, B:89:0x00bd, B:88:0x00a4, B:79:0x0091, B:75:0x0071, B:65:0x005b, B:61:0x0046, B:57:0x0031), top: B:96:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00a4 A[Catch: all -> 0x00cc, TryCatch #0 {all -> 0x00cc, blocks: (B:52:0x000a, B:54:0x0029, B:58:0x0035, B:62:0x004a, B:68:0x0063, B:76:0x0089, B:81:0x0097, B:89:0x00bd, B:88:0x00a4, B:79:0x0091, B:75:0x0071, B:65:0x005b, B:61:0x0046, B:57:0x0031), top: B:96:0x000a }] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final rg.q call() {
        /*
            r11 = this;
            mg.h7 r0 = r11.f21382b
            m2.t r0 = r0.f21063a
            m2.y r1 = r11.f21381a
            android.database.Cursor r0 = o8.b.r(r0, r1)
            java.lang.String r1 = "sportId"
            int r1 = p.b.o(r0, r1)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r2 = "time"
            int r2 = p.b.o(r0, r2)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r3 = "latLngs"
            int r3 = p.b.o(r0, r3)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r4 = "heartRates"
            int r4 = p.b.o(r0, r4)     // Catch: java.lang.Throwable -> Lcc
            boolean r5 = r0.moveToFirst()     // Catch: java.lang.Throwable -> Lcc
            r6 = 0
            if (r5 == 0) goto Lc3
            boolean r5 = r0.isNull(r1)     // Catch: java.lang.Throwable -> Lcc
            if (r5 == 0) goto L31
            r1 = r6
            goto L35
        L31:
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Throwable -> Lcc
        L35:
            java.util.UUID r1 = java.util.UUID.fromString(r1)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r5 = "fromString(str)"
            gm.l.e(r1, r5)     // Catch: java.lang.Throwable -> Lcc
            boolean r5 = r0.isNull(r2)     // Catch: java.lang.Throwable -> Lcc
            if (r5 == 0) goto L46
            r2 = r6
            goto L4a
        L46:
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Throwable -> Lcc
        L4a:
            java.lang.String r5 = "str"
            gm.l.f(r2, r5)     // Catch: java.lang.Throwable -> Lcc
            java.util.Date r2 = dg.a.d(r2)     // Catch: java.lang.Throwable -> Lcc
            boolean r5 = r0.isNull(r3)     // Catch: java.lang.Throwable -> Lcc
            if (r5 == 0) goto L5b
            r3 = r6
            goto L5f
        L5b:
            java.lang.String r3 = r0.getString(r3)     // Catch: java.lang.Throwable -> Lcc
        L5f:
            r5 = 1
            r7 = 0
            if (r3 == 0) goto L6c
            int r8 = r3.length()     // Catch: java.lang.Throwable -> Lcc
            if (r8 != 0) goto L6a
            goto L6c
        L6a:
            r8 = 0
            goto L6d
        L6c:
            r8 = 1
        L6d:
            if (r8 == 0) goto L71
            r3 = r6
            goto L89
        L71:
            java.lang.Class<java.util.List> r8 = java.util.List.class
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r5]     // Catch: java.lang.Throwable -> Lcc
            java.lang.Class<com.topstep.fitcloud.pro.model.data.SportLatLng> r10 = com.topstep.fitcloud.pro.model.data.SportLatLng.class
            r9[r7] = r10     // Catch: java.lang.Throwable -> Lcc
            nf.b$b r8 = mf.l0.d(r8, r9)     // Catch: java.lang.Throwable -> Lcc
            mf.h0 r9 = qg.a.f24816a     // Catch: java.lang.Throwable -> Lcc
            mf.t r8 = r9.b(r8)     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object r3 = r8.a(r3)     // Catch: java.lang.Throwable -> Lcc
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> Lcc
        L89:
            boolean r8 = r0.isNull(r4)     // Catch: java.lang.Throwable -> Lcc
            if (r8 == 0) goto L91
            r4 = r6
            goto L95
        L91:
            java.lang.String r4 = r0.getString(r4)     // Catch: java.lang.Throwable -> Lcc
        L95:
            if (r4 == 0) goto La0
            int r8 = r4.length()     // Catch: java.lang.Throwable -> Lcc
            if (r8 != 0) goto L9e
            goto La0
        L9e:
            r8 = 0
            goto La1
        La0:
            r8 = 1
        La1:
            if (r8 == 0) goto La4
            goto Lbd
        La4:
            java.lang.Class<java.util.List> r6 = java.util.List.class
            java.lang.reflect.Type[] r5 = new java.lang.reflect.Type[r5]     // Catch: java.lang.Throwable -> Lcc
            java.lang.Class<com.topstep.fitcloud.pro.model.data.SportHeartRate> r8 = com.topstep.fitcloud.pro.model.data.SportHeartRate.class
            r5[r7] = r8     // Catch: java.lang.Throwable -> Lcc
            nf.b$b r5 = mf.l0.d(r6, r5)     // Catch: java.lang.Throwable -> Lcc
            mf.h0 r6 = qg.a.f24816a     // Catch: java.lang.Throwable -> Lcc
            mf.t r5 = r6.b(r5)     // Catch: java.lang.Throwable -> Lcc
            java.lang.Object r4 = r5.a(r4)     // Catch: java.lang.Throwable -> Lcc
            r6 = r4
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> Lcc
        Lbd:
            rg.q r4 = new rg.q     // Catch: java.lang.Throwable -> Lcc
            r4.<init>(r1, r2, r3, r6)     // Catch: java.lang.Throwable -> Lcc
            r6 = r4
        Lc3:
            r0.close()
            m2.y r0 = r11.f21381a
            r0.j()
            return r6
        Lcc:
            r1 = move-exception
            r0.close()
            m2.y r0 = r11.f21381a
            r0.j()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.q7.call():java.lang.Object");
    }
}
