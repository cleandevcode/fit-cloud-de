package mg;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class t6 implements Callable<List<rg.o>> {

    /* renamed from: a */
    public final /* synthetic */ m2.y f21474a;

    /* renamed from: b */
    public final /* synthetic */ c7 f21475b;

    public t6(c7 c7Var, m2.y yVar) {
        this.f21475b = c7Var;
        this.f21474a = yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x009d A[Catch: all -> 0x00d1, TryCatch #0 {all -> 0x00d1, blocks: (B:37:0x000c, B:38:0x004b, B:40:0x0052, B:44:0x0062, B:50:0x008c, B:58:0x00b6, B:57:0x009d, B:47:0x0083, B:43:0x005e), top: B:65:0x000c }] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<rg.o> call() {
        /*
            r26 = this;
            r1 = r26
            mg.c7 r0 = r1.f21475b
            m2.t r0 = r0.f20797b
            m2.y r2 = r1.f21474a
            android.database.Cursor r2 = o8.b.r(r0, r2)
            java.lang.String r0 = "userId"
            int r0 = p.b.o(r2, r0)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r3 = "time"
            int r3 = p.b.o(r2, r3)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r4 = "deepSleep"
            int r4 = p.b.o(r2, r4)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r5 = "lightSleep"
            int r5 = p.b.o(r2, r5)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r6 = "soberSleep"
            int r6 = p.b.o(r2, r6)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r7 = "lastModifyTime"
            int r7 = p.b.o(r2, r7)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r8 = "detail"
            int r8 = p.b.o(r2, r8)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r9 = "uploadFlag"
            int r9 = p.b.o(r2, r9)     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r10 = "uploadAttempts"
            int r10 = p.b.o(r2, r10)     // Catch: java.lang.Throwable -> Ld1
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld1
            int r12 = r2.getCount()     // Catch: java.lang.Throwable -> Ld1
            r11.<init>(r12)     // Catch: java.lang.Throwable -> Ld1
        L4b:
            r12 = 0
            boolean r13 = r2.moveToNext()     // Catch: java.lang.Throwable -> Ld1
            if (r13 == 0) goto Lc8
            long r15 = r2.getLong(r0)     // Catch: java.lang.Throwable -> Ld1
            boolean r13 = r2.isNull(r3)     // Catch: java.lang.Throwable -> Ld1
            if (r13 == 0) goto L5e
            r13 = r12
            goto L62
        L5e:
            java.lang.String r13 = r2.getString(r3)     // Catch: java.lang.Throwable -> Ld1
        L62:
            java.lang.String r14 = "str"
            gm.l.f(r13, r14)     // Catch: java.lang.Throwable -> Ld1
            java.util.Date r17 = dg.a.d(r13)     // Catch: java.lang.Throwable -> Ld1
            int r18 = r2.getInt(r4)     // Catch: java.lang.Throwable -> Ld1
            int r19 = r2.getInt(r5)     // Catch: java.lang.Throwable -> Ld1
            int r20 = r2.getInt(r6)     // Catch: java.lang.Throwable -> Ld1
            long r21 = r2.getLong(r7)     // Catch: java.lang.Throwable -> Ld1
            boolean r13 = r2.isNull(r8)     // Catch: java.lang.Throwable -> Ld1
            if (r13 == 0) goto L83
            r13 = r12
            goto L87
        L83:
            java.lang.String r13 = r2.getString(r8)     // Catch: java.lang.Throwable -> Ld1
        L87:
            r14 = 1
            r23 = 0
            if (r13 == 0) goto L96
            int r24 = r13.length()     // Catch: java.lang.Throwable -> Ld1
            if (r24 != 0) goto L93
            goto L96
        L93:
            r24 = 0
            goto L98
        L96:
            r24 = 1
        L98:
            if (r24 == 0) goto L9d
        L9a:
            r23 = r12
            goto Lb6
        L9d:
            java.lang.Class<java.util.List> r12 = java.util.List.class
            java.lang.reflect.Type[] r14 = new java.lang.reflect.Type[r14]     // Catch: java.lang.Throwable -> Ld1
            java.lang.Class<com.topstep.fitcloud.pro.model.data.SleepItem> r24 = com.topstep.fitcloud.pro.model.data.SleepItem.class
            r14[r23] = r24     // Catch: java.lang.Throwable -> Ld1
            nf.b$b r12 = mf.l0.d(r12, r14)     // Catch: java.lang.Throwable -> Ld1
            mf.h0 r14 = qg.a.f24816a     // Catch: java.lang.Throwable -> Ld1
            mf.t r12 = r14.b(r12)     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object r12 = r12.a(r13)     // Catch: java.lang.Throwable -> Ld1
            java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Throwable -> Ld1
            goto L9a
        Lb6:
            int r24 = r2.getInt(r9)     // Catch: java.lang.Throwable -> Ld1
            int r25 = r2.getInt(r10)     // Catch: java.lang.Throwable -> Ld1
            rg.o r12 = new rg.o     // Catch: java.lang.Throwable -> Ld1
            r14 = r12
            r14.<init>(r15, r17, r18, r19, r20, r21, r23, r24, r25)     // Catch: java.lang.Throwable -> Ld1
            r11.add(r12)     // Catch: java.lang.Throwable -> Ld1
            goto L4b
        Lc8:
            r2.close()
            m2.y r0 = r1.f21474a
            r0.j()
            return r11
        Ld1:
            r0 = move-exception
            r2.close()
            m2.y r2 = r1.f21474a
            r2.j()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.t6.call():java.lang.Object");
    }
}
