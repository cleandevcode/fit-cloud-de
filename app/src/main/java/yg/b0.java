package yg;

import ah.e;
import android.content.Context;
import bi.z0;
import ch.b;
import pm.e0;
import sm.f1;
import tg.i;

/* loaded from: classes2.dex */
public final class b0 implements u {

    /* renamed from: a */
    public final Context f31541a;

    /* renamed from: b */
    public final e0 f31542b;

    /* renamed from: c */
    public final pm.b0 f31543c;

    /* renamed from: d */
    public final f1<o> f31544d;

    @zl.e(c = "com.topstep.fitcloud.pro.shared.data.storage.UserStorageManagerImpl", f = "UserStorageManager.kt", l = {123}, m = "getHourStyle")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public /* synthetic */ Object f31545d;

        /* renamed from: f */
        public int f31547f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(dVar);
            b0.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f31545d = obj;
            this.f31547f |= Integer.MIN_VALUE;
            return b0.this.l(this);
        }
    }

    public b0(Context context, e0 e0Var, wm.b bVar, b bVar2) {
        gm.l.f(e0Var, "applicationScope");
        this.f31541a = context;
        this.f31542b = e0Var;
        this.f31543c = bVar;
        this.f31544d = (f1) z0.n(new z(bVar2, this, null));
    }

    @Override // yg.u
    public final Object a(boolean z10, xl.d<? super tl.l> dVar) {
        Object a10;
        o value = this.f31544d.getValue();
        return (value == null || (a10 = value.a(z10, dVar)) != yl.a.COROUTINE_SUSPENDED) ? tl.l.f28297a : a10;
    }

    @Override // yg.u
    public final boolean b() {
        o value = this.f31544d.getValue();
        if (value != null) {
            return value.b();
        }
        return false;
    }

    @Override // yg.u
    public final Object c(int i10, xl.d<? super tl.l> dVar) {
        Object c10;
        o value = this.f31544d.getValue();
        return (value == null || (c10 = value.c(i10, dVar)) != yl.a.COROUTINE_SUSPENDED) ? tl.l.f28297a : c10;
    }

    @Override // yg.u
    public final int d() {
        o value = this.f31544d.getValue();
        if (value != null) {
            return value.d();
        }
        return 0;
    }

    @Override // yg.u
    public final Object e(int i10, xl.d<? super tl.l> dVar) {
        Object e10;
        o value = this.f31544d.getValue();
        return (value == null || (e10 = value.e(i10, dVar)) != yl.a.COROUTINE_SUSPENDED) ? tl.l.f28297a : e10;
    }

    @Override // yg.u
    public final tm.j f() {
        return bi.r.O(this.f31544d, new x(null));
    }

    @Override // yg.u
    public final tm.j g(long j10) {
        return bi.r.O(this.f31544d, new y(j10, null));
    }

    @Override // yg.u
    public final Object h(long j10, i.c cVar) {
        return x(j10).s(cVar);
    }

    @Override // yg.u
    public final Object i(long j10, n nVar, zl.c cVar) {
        return x(j10).g(nVar, cVar);
    }

    @Override // yg.u
    public final Object j(long j10, e.f fVar) {
        Object h10 = x(j10).h(fVar);
        return h10 == yl.a.COROUTINE_SUSPENDED ? h10 : tl.l.f28297a;
    }

    @Override // yg.u
    public final Object k(long j10, long j11, b.C0072b c0072b) {
        Object l10 = x(j10).l(j11, c0072b);
        return l10 == yl.a.COROUTINE_SUSPENDED ? l10 : tl.l.f28297a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002f  */
    @Override // yg.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(xl.d<? super java.lang.Integer> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof yg.b0.a
            if (r0 == 0) goto L13
            r0 = r5
            yg.b0$a r0 = (yg.b0.a) r0
            int r1 = r0.f31547f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31547f = r1
            goto L18
        L13:
            yg.b0$a r0 = new yg.b0$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f31545d
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f31547f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            mf.a0.k(r5)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            mf.a0.k(r5)
            sm.f1<yg.o> r5 = r4.f31544d
            java.lang.Object r5 = r5.getValue()
            yg.o r5 = (yg.o) r5
            if (r5 == 0) goto L4c
            r0.f31547f = r3
            java.lang.Object r5 = r5.m(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            goto L4d
        L4c:
            r5 = 0
        L4d:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.b0.l(xl.d):java.lang.Object");
    }

    @Override // yg.u
    public final Object m(long j10, int i10, e.C0006e c0006e) {
        Object k10 = x(j10).k(i10, c0006e);
        return k10 == yl.a.COROUTINE_SUSPENDED ? k10 : tl.l.f28297a;
    }

    @Override // yg.u
    public final Object n(Long l10, zl.c cVar) {
        Object s10 = bi.r.s(new v(this, l10, null), cVar);
        return s10 == yl.a.COROUTINE_SUSPENDED ? s10 : tl.l.f28297a;
    }

    @Override // yg.u
    public final Object o(long j10, e.f fVar) {
        Object q10 = x(j10).q(fVar);
        return q10 == yl.a.COROUTINE_SUSPENDED ? q10 : tl.l.f28297a;
    }

    @Override // yg.u
    public final Object p(long j10, long j11, xl.d<? super tl.l> dVar) {
        Object r10 = x(j10).r(j11, dVar);
        return r10 == yl.a.COROUTINE_SUSPENDED ? r10 : tl.l.f28297a;
    }

    @Override // yg.u
    public final Object q(long j10, n nVar, long j11, xl.d<? super tl.l> dVar) {
        Object o10 = x(j10).o(j11, nVar, dVar);
        return o10 == yl.a.COROUTINE_SUSPENDED ? o10 : tl.l.f28297a;
    }

    @Override // yg.u
    public final tm.j r(long j10) {
        return bi.r.O(this.f31544d, new w(j10, null));
    }

    @Override // yg.u
    public final tm.j s(long j10) {
        return bi.r.O(this.f31544d, new a0(j10, null));
    }

    @Override // yg.u
    public final Object t(long j10, int i10, xl.d<? super tl.l> dVar) {
        Object i11 = x(j10).i(i10, dVar);
        return i11 == yl.a.COROUTINE_SUSPENDED ? i11 : tl.l.f28297a;
    }

    @Override // yg.u
    public final Object u(long j10, n nVar, xl.d<? super Long> dVar) {
        return x(j10).w(nVar, dVar);
    }

    @Override // yg.u
    public final Object v(long j10, long j11, i.c cVar) {
        Object u10 = x(j10).u(j11, cVar);
        return u10 == yl.a.COROUTINE_SUSPENDED ? u10 : tl.l.f28297a;
    }

    @Override // yg.u
    public final Object w(long j10, xl.d<? super Long> dVar) {
        return x(j10).p(dVar);
    }

    public final o x(long j10) {
        o value = this.f31544d.getValue();
        if (value == null || value.n() != j10) {
            throw new ig.b();
        }
        return value;
    }
}
