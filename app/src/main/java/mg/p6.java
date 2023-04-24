package mg;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class p6 implements Callable<rg.o> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21356a;

    /* renamed from: b */
    public final /* synthetic */ c7 f21357b;

    public p6(c7 c7Var, m2.y yVar) {
        this.f21357b = c7Var;
        this.f21356a = yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0091 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:34:0x000c, B:36:0x0049, B:40:0x0059, B:46:0x0082, B:54:0x00ab, B:53:0x0091, B:43:0x007a, B:39:0x0055), top: B:60:0x000c }] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final rg.o call() {
        /*
            r25 = this;
            r1 = r25
            mg.c7 r0 = r1.f21357b
            m2.t r0 = r0.f20797b
            m2.y r2 = r1.f21356a
            android.database.Cursor r2 = o8.b.r(r0, r2)
            java.lang.String r0 = "userId"
            int r0 = p.b.o(r2, r0)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r3 = "time"
            int r3 = p.b.o(r2, r3)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r4 = "deepSleep"
            int r4 = p.b.o(r2, r4)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r5 = "lightSleep"
            int r5 = p.b.o(r2, r5)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r6 = "soberSleep"
            int r6 = p.b.o(r2, r6)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r7 = "lastModifyTime"
            int r7 = p.b.o(r2, r7)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r8 = "detail"
            int r8 = p.b.o(r2, r8)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r9 = "uploadFlag"
            int r9 = p.b.o(r2, r9)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r10 = "uploadAttempts"
            int r10 = p.b.o(r2, r10)     // Catch: java.lang.Throwable -> Lc2
            boolean r11 = r2.moveToFirst()     // Catch: java.lang.Throwable -> Lc2
            r12 = 0
            if (r11 == 0) goto Lb9
            long r14 = r2.getLong(r0)     // Catch: java.lang.Throwable -> Lc2
            boolean r0 = r2.isNull(r3)     // Catch: java.lang.Throwable -> Lc2
            if (r0 == 0) goto L55
            r0 = r12
            goto L59
        L55:
            java.lang.String r0 = r2.getString(r3)     // Catch: java.lang.Throwable -> Lc2
        L59:
            java.lang.String r3 = "str"
            gm.l.f(r0, r3)     // Catch: java.lang.Throwable -> Lc2
            java.util.Date r16 = dg.a.d(r0)     // Catch: java.lang.Throwable -> Lc2
            int r17 = r2.getInt(r4)     // Catch: java.lang.Throwable -> Lc2
            int r18 = r2.getInt(r5)     // Catch: java.lang.Throwable -> Lc2
            int r19 = r2.getInt(r6)     // Catch: java.lang.Throwable -> Lc2
            long r20 = r2.getLong(r7)     // Catch: java.lang.Throwable -> Lc2
            boolean r0 = r2.isNull(r8)     // Catch: java.lang.Throwable -> Lc2
            if (r0 == 0) goto L7a
            r0 = r12
            goto L7e
        L7a:
            java.lang.String r0 = r2.getString(r8)     // Catch: java.lang.Throwable -> Lc2
        L7e:
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L8b
            int r5 = r0.length()     // Catch: java.lang.Throwable -> Lc2
            if (r5 != 0) goto L89
            goto L8b
        L89:
            r5 = 0
            goto L8c
        L8b:
            r5 = 1
        L8c:
            if (r5 == 0) goto L91
        L8e:
            r22 = r12
            goto Lab
        L91:
            java.lang.Class<java.util.List> r5 = java.util.List.class
            java.lang.reflect.Type[] r3 = new java.lang.reflect.Type[r3]     // Catch: java.lang.Throwable -> Lc2
            java.lang.Class<com.topstep.fitcloud.pro.model.data.SleepItem> r6 = com.topstep.fitcloud.pro.model.data.SleepItem.class
            r3[r4] = r6     // Catch: java.lang.Throwable -> Lc2
            nf.b$b r3 = mf.l0.d(r5, r3)     // Catch: java.lang.Throwable -> Lc2
            mf.h0 r4 = qg.a.f24816a     // Catch: java.lang.Throwable -> Lc2
            mf.t r3 = r4.b(r3)     // Catch: java.lang.Throwable -> Lc2
            java.lang.Object r0 = r3.a(r0)     // Catch: java.lang.Throwable -> Lc2
            r12 = r0
            java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Throwable -> Lc2
            goto L8e
        Lab:
            int r23 = r2.getInt(r9)     // Catch: java.lang.Throwable -> Lc2
            int r24 = r2.getInt(r10)     // Catch: java.lang.Throwable -> Lc2
            rg.o r12 = new rg.o     // Catch: java.lang.Throwable -> Lc2
            r13 = r12
            r13.<init>(r14, r16, r17, r18, r19, r20, r22, r23, r24)     // Catch: java.lang.Throwable -> Lc2
        Lb9:
            r2.close()
            m2.y r0 = r1.f21356a
            r0.j()
            return r12
        Lc2:
            r0 = move-exception
            r2.close()
            m2.y r2 = r1.f21356a
            r2.j()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.p6.call():java.lang.Object");
    }
}
