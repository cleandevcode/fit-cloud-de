package sm;

import sm.h0;

/* loaded from: classes2.dex */
public final class c0 implements g<Object> {

    /* renamed from: a */
    public final /* synthetic */ fm.p f27128a;

    /* renamed from: b */
    public final /* synthetic */ gm.a0 f27129b;

    @zl.e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", l = {142}, m = "emit")
    /* loaded from: classes2.dex */
    public static final class a extends zl.c {

        /* renamed from: d */
        public c0 f27130d;

        /* renamed from: e */
        public /* synthetic */ Object f27131e;

        /* renamed from: f */
        public int f27132f;

        /* renamed from: h */
        public Object f27134h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d dVar) {
            super(dVar);
            c0.this = r1;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            this.f27131e = obj;
            this.f27132f |= Integer.MIN_VALUE;
            return c0.this.n(null, this);
        }
    }

    public c0(h0.a aVar, gm.a0 a0Var) {
        this.f27128a = aVar;
        this.f27129b = a0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0058  */
    @Override // sm.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.lang.Object r5, xl.d<? super tl.l> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof sm.c0.a
            if (r0 == 0) goto L13
            r0 = r6
            sm.c0$a r0 = (sm.c0.a) r0
            int r1 = r0.f27132f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27132f = r1
            goto L18
        L13:
            sm.c0$a r0 = new sm.c0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f27131e
            yl.a r1 = yl.a.COROUTINE_SUSPENDED
            int r2 = r0.f27132f
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f27134h
            sm.c0 r0 = r0.f27130d
            mf.a0.k(r6)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            mf.a0.k(r6)
            fm.p r6 = r4.f27128a
            r0.f27130d = r4
            r0.f27134h = r5
            r0.f27132f = r3
            java.lang.Object r6 = r6.A(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L53
            gm.a0 r6 = r0.f27129b
            r6.f15485a = r5
            r3 = 0
        L53:
            if (r3 == 0) goto L58
            tl.l r5 = tl.l.f28297a
            return r5
        L58:
            tm.a r5 = new tm.a
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sm.c0.n(java.lang.Object, xl.d):java.lang.Object");
    }
}
