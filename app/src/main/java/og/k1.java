package og;

import com.topstep.fitcloud.pro.shared.data.db.AppDatabase;
import java.util.List;
import mg.p3;

/* loaded from: classes2.dex */
public final class k1 implements j1 {

    /* renamed from: a */
    public final yg.j f23392a;

    /* renamed from: b */
    public final yg.u f23393b;

    /* renamed from: c */
    public final AppDatabase f23394c;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.device.NotificationRepositoryImpl", f = "NotificationRepository.kt", l = {69}, m = "isPackageSupport")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f23395d;

        /* renamed from: f */
        public int f23397f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(dVar);
            k1.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f23395d = obj;
            this.f23397f |= Integer.MIN_VALUE;
            return k1.this.e(null, this);
        }
    }

    public k1(yg.b bVar, yg.b0 b0Var, AppDatabase appDatabase) {
        gm.l.f(appDatabase, "appDatabase");
        this.f23392a = bVar;
        this.f23393b = b0Var;
        this.f23394c = appDatabase;
    }

    @Override // og.j1
    public final Object a(boolean z10, xl.d<? super tl.l> dVar) {
        Object a10 = this.f23393b.a(z10, dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }

    @Override // og.j1
    public final boolean b() {
        return this.f23393b.b();
    }

    @Override // og.j1
    public final Object c(int i10, xl.d<? super tl.l> dVar) {
        Object c10 = this.f23393b.c(i10, dVar);
        return c10 == yl.a.COROUTINE_SUSPENDED ? c10 : tl.l.f28297a;
    }

    @Override // og.j1
    public final int d() {
        return this.f23393b.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0056  */
    @Override // og.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r7, xl.d<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof og.k1.a
            if (r0 == 0) goto L13
            r0 = r8
            og.k1$a r0 = (og.k1.a) r0
            int r1 = r0.f23397f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23397f = r1
            goto L18
        L13:
            og.k1$a r0 = new og.k1$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f23395d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f23397f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r8)
            goto L4d
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            mf.a0.k(r8)
            yg.j r8 = r6.f23392a
            java.lang.Long r8 = yg.l.b(r8)
            if (r8 == 0) goto L5c
            long r4 = r8.longValue()
            com.topstep.fitcloud.pro.shared.data.db.AppDatabase r8 = r6.f23394c
            mg.p3 r8 = r8.y()
            r0.f23397f = r3
            java.lang.Object r8 = r8.e(r4, r7, r0)
            if (r8 != r1) goto L4d
            return r1
        L4d:
            java.lang.Number r8 = (java.lang.Number) r8
            int r7 = r8.intValue()
            if (r7 <= 0) goto L56
            goto L57
        L56:
            r3 = 0
        L57:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L5c:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: og.k1.e(java.lang.String, xl.d):java.lang.Object");
    }

    @Override // og.j1
    public final Object f(xl.d<? super List<String>> dVar) {
        Long b10 = yg.l.b(this.f23392a);
        if (b10 != null) {
            return this.f23394c.y().d(b10.longValue(), dVar);
        }
        return ul.s.f28879a;
    }

    @Override // og.j1
    public final Object g(String str, xl.d<? super tl.l> dVar) {
        Long b10 = yg.l.b(this.f23392a);
        if (b10 != null) {
            Object b11 = this.f23394c.y().b(b10.longValue(), str, dVar);
            return b11 == yl.a.COROUTINE_SUSPENDED ? b11 : tl.l.f28297a;
        }
        return tl.l.f28297a;
    }

    @Override // og.j1
    public final Object h(String str, String str2, xl.d<? super tl.l> dVar) {
        Long b10 = yg.l.b(this.f23392a);
        if (b10 != null) {
            long longValue = b10.longValue();
            p3 y10 = this.f23394c.y();
            y10.getClass();
            Object c10 = y10.c(new pg.h(str, longValue, str2), dVar);
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            if (c10 != aVar) {
                c10 = tl.l.f28297a;
            }
            if (c10 == aVar) {
                return c10;
            }
            return tl.l.f28297a;
        }
        return tl.l.f28297a;
    }
}
