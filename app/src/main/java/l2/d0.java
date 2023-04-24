package l2;

@zl.e(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", f = "FlowExt.kt", l = {222}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d0 extends zl.i implements fm.p<sm.g<Object>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f18790e;

    /* renamed from: f */
    public /* synthetic */ Object f18791f;

    /* renamed from: g */
    public final /* synthetic */ sm.f<Object> f18792g;

    /* renamed from: h */
    public final /* synthetic */ fm.q<Object, Object, xl.d<Object>, Object> f18793h;

    /* loaded from: classes.dex */
    public static final class a implements sm.g<Object> {

        /* renamed from: a */
        public final /* synthetic */ gm.a0 f18794a;

        /* renamed from: b */
        public final /* synthetic */ fm.q f18795b;

        /* renamed from: c */
        public final /* synthetic */ sm.g f18796c;

        @zl.e(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1$invokeSuspend$$inlined$collect$1", f = "FlowExt.kt", l = {139, 142}, m = "emit")
        /* renamed from: l2.d0$a$a */
        /* loaded from: classes.dex */
        public static final class C0326a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f18797d;

            /* renamed from: e */
            public int f18798e;

            /* renamed from: g */
            public a f18800g;

            /* renamed from: h */
            public gm.a0 f18801h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0326a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f18797d = obj;
                this.f18798e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(gm.a0 a0Var, fm.q qVar, sm.g gVar) {
            this.f18794a = a0Var;
            this.f18795b = qVar;
            this.f18796c = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x006e A[RETURN] */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r8, xl.d<? super tl.l> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof l2.d0.a.C0326a
                if (r0 == 0) goto L13
                r0 = r9
                l2.d0$a$a r0 = (l2.d0.a.C0326a) r0
                int r1 = r0.f18798e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f18798e = r1
                goto L18
            L13:
                l2.d0$a$a r0 = new l2.d0$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f18797d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f18798e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3a
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                mf.a0.k(r9)
                goto L6f
            L2a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L32:
                gm.a0 r8 = r0.f18801h
                l2.d0$a r2 = r0.f18800g
                mf.a0.k(r9)
                goto L59
            L3a:
                mf.a0.k(r9)
                gm.a0 r9 = r7.f18794a
                T r2 = r9.f15485a
                java.lang.Object r5 = l2.f0.f18875a
                if (r2 != r5) goto L46
                goto L55
            L46:
                fm.q r5 = r7.f18795b
                r0.f18800g = r7
                r0.f18801h = r9
                r0.f18798e = r4
                java.lang.Object r8 = r5.j(r2, r8, r0)
                if (r8 != r1) goto L55
                return r1
            L55:
                r2 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L59:
                r8.f15485a = r9
                sm.g r8 = r2.f18796c
                gm.a0 r9 = r2.f18794a
                T r9 = r9.f15485a
                r2 = 0
                r0.f18800g = r2
                r0.f18801h = r2
                r0.f18798e = r3
                java.lang.Object r8 = r8.n(r9, r0)
                if (r8 != r1) goto L6f
                return r1
            L6f:
                tl.l r8 = tl.l.f28297a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: l2.d0.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(sm.f<Object> fVar, fm.q<Object, Object, ? super xl.d<Object>, ? extends Object> qVar, xl.d<? super d0> dVar) {
        super(2, dVar);
        this.f18792g = fVar;
        this.f18793h = qVar;
    }

    @Override // fm.p
    public final Object A(sm.g<Object> gVar, xl.d<? super tl.l> dVar) {
        return ((d0) p(gVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        d0 d0Var = new d0(this.f18792g, this.f18793h, dVar);
        d0Var.f18791f = obj;
        return d0Var;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f18790e;
        if (i10 == 0) {
            mf.a0.k(obj);
            gm.a0 a0Var = new gm.a0();
            a0Var.f15485a = f0.f18875a;
            sm.f<Object> fVar = this.f18792g;
            a aVar2 = new a(a0Var, this.f18793h, (sm.g) this.f18791f);
            this.f18790e = 1;
            if (fVar.a(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            mf.a0.k(obj);
        }
        return tl.l.f28297a;
    }
}
