package sh;

import com.topstep.fitcloud.pro.function.DateMonitor;
import gm.l;

/* loaded from: classes2.dex */
public final class c implements sh.b<vf.f> {

    /* renamed from: a */
    public final DateMonitor f27013a;

    /* renamed from: b */
    public final dk.a<lg.c> f27014b;

    /* renamed from: c */
    public final dk.a<tg.a> f27015c;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.source.HeartRateDetailSource", f = "HeartRateDetailSource.kt", l = {31, 33}, m = "requestDetail")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public vf.f f27016d;

        /* renamed from: e */
        public /* synthetic */ Object f27017e;

        /* renamed from: g */
        public int f27019g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(dVar);
            c.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f27017e = obj;
            this.f27019g |= Integer.MIN_VALUE;
            return c.this.a(0L, null, this);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.source.HeartRateDetailSource", f = "HeartRateDetailSource.kt", l = {20, 23, 25}, m = "requestList")
    /* loaded from: classes2.dex */
    public static final class b extends zl.c {

        /* renamed from: d */
        public c f27020d;

        /* renamed from: e */
        public long f27021e;

        /* renamed from: f */
        public /* synthetic */ Object f27022f;

        /* renamed from: h */
        public int f27024h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(dVar);
            c.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f27022f = obj;
            this.f27024h |= Integer.MIN_VALUE;
            return c.this.b(0L, this);
        }
    }

    public c(DateMonitor dateMonitor, dk.a<lg.c> aVar, dk.a<tg.a> aVar2) {
        l.f(dateMonitor, "dateMonitor");
        l.f(aVar, "dataRepository");
        l.f(aVar2, "friendDataRepository");
        this.f27013a = dateMonitor;
        this.f27014b = aVar;
        this.f27015c = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0073  */
    @Override // sh.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(long r8, xl.d<? super java.util.List<? extends vf.f>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof sh.c.b
            if (r0 == 0) goto L13
            r0 = r10
            sh.c$b r0 = (sh.c.b) r0
            int r1 = r0.f27024h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27024h = r1
            goto L18
        L13:
            sh.c$b r0 = new sh.c$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f27022f
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f27024h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            mf.a0.k(r10)
            goto L8e
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            mf.a0.k(r10)
            goto L72
        L39:
            long r8 = r0.f27021e
            sh.c r2 = r0.f27020d
            mf.a0.k(r10)
            goto L56
        L41:
            mf.a0.k(r10)
            com.topstep.fitcloud.pro.function.DateMonitor r10 = r7.f27013a
            sm.g1 r10 = r10.f9546c
            r0.f27020d = r7
            r0.f27021e = r8
            r0.f27024h = r5
            java.lang.Object r10 = bi.r.w(r10, r0)
            if (r10 != r1) goto L55
            return r1
        L55:
            r2 = r7
        L56:
            sf.j r10 = (sf.j) r10
            boolean r5 = hh.b.g(r8)
            r6 = 0
            if (r5 == 0) goto L73
            dk.a<tg.a> r10 = r2.f27015c
            java.lang.Object r10 = r10.get()
            tg.a r10 = (tg.a) r10
            r0.f27020d = r6
            r0.f27024h = r4
            java.lang.Object r10 = r10.h(r8, r0)
            if (r10 != r1) goto L72
            return r1
        L72:
            return r10
        L73:
            dk.a<lg.c> r8 = r2.f27014b
            java.lang.Object r8 = r8.get()
            lg.c r8 = (lg.c) r8
            java.util.Date r9 = r10.f26941b
            java.util.Date r10 = r10.f26940a
            tm.j r8 = r8.w(r9, r10)
            r0.f27020d = r6
            r0.f27024h = r3
            java.lang.Object r10 = bi.r.y(r8, r0)
            if (r10 != r1) goto L8e
            return r1
        L8e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: sh.c.b(long, xl.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // sh.b
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r6, vf.f r8, xl.d<? super vf.f> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof sh.c.a
            if (r0 == 0) goto L13
            r0 = r9
            sh.c$a r0 = (sh.c.a) r0
            int r1 = r0.f27019g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27019g = r1
            goto L18
        L13:
            sh.c$a r0 = new sh.c$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f27017e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f27019g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L2f
            if (r2 != r3) goto L27
            goto L2f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            vf.f r8 = r0.f27016d
            mf.a0.k(r9)
            goto L68
        L35:
            mf.a0.k(r9)
            boolean r9 = hh.b.g(r6)
            if (r9 == 0) goto L53
            dk.a<tg.a> r9 = r5.f27015c
            java.lang.Object r9 = r9.get()
            tg.a r9 = (tg.a) r9
            java.util.Date r2 = r8.f29279a
            r0.f27016d = r8
            r0.f27019g = r4
            java.lang.Object r9 = r9.i(r6, r2, r0)
            if (r9 != r1) goto L68
            return r1
        L53:
            dk.a<lg.c> r6 = r5.f27014b
            java.lang.Object r6 = r6.get()
            lg.c r6 = (lg.c) r6
            java.util.Date r7 = r8.f29279a
            r0.f27016d = r8
            r0.f27019g = r3
            java.lang.Object r9 = r6.s(r7, r0)
            if (r9 != r1) goto L68
            return r1
        L68:
            vf.f r9 = (vf.f) r9
            if (r9 != 0) goto L6d
            goto L6e
        L6d:
            r8 = r9
        L6e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: sh.c.a(long, vf.f, xl.d):java.lang.Object");
    }
}
