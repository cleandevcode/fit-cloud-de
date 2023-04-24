package l2;

@zl.e(c = "androidx.paging.FlowExtKt$simpleScan$1", f = "FlowExt.kt", l = {52, 222}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e0 extends zl.i implements fm.p<sm.g<Object>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public gm.a0 f18853e;

    /* renamed from: f */
    public int f18854f;

    /* renamed from: g */
    public /* synthetic */ Object f18855g;

    /* renamed from: h */
    public final /* synthetic */ Object f18856h;

    /* renamed from: i */
    public final /* synthetic */ sm.f<Object> f18857i;

    /* renamed from: j */
    public final /* synthetic */ fm.q<Object, Object, xl.d<Object>, Object> f18858j;

    /* loaded from: classes.dex */
    public static final class a implements sm.g<Object> {

        /* renamed from: a */
        public final /* synthetic */ gm.a0 f18859a;

        /* renamed from: b */
        public final /* synthetic */ fm.q f18860b;

        /* renamed from: c */
        public final /* synthetic */ sm.g f18861c;

        @zl.e(c = "androidx.paging.FlowExtKt$simpleScan$1$invokeSuspend$$inlined$collect$1", f = "FlowExt.kt", l = {135, 136}, m = "emit")
        /* renamed from: l2.e0$a$a */
        /* loaded from: classes.dex */
        public static final class C0328a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f18862d;

            /* renamed from: e */
            public int f18863e;

            /* renamed from: g */
            public a f18865g;

            /* renamed from: h */
            public gm.a0 f18866h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0328a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f18862d = obj;
                this.f18863e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(gm.a0 a0Var, fm.q qVar, sm.g gVar) {
            this.f18859a = a0Var;
            this.f18860b = qVar;
            this.f18861c = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0069 A[RETURN] */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(java.lang.Object r8, xl.d<? super tl.l> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof l2.e0.a.C0328a
                if (r0 == 0) goto L13
                r0 = r9
                l2.e0$a$a r0 = (l2.e0.a.C0328a) r0
                int r1 = r0.f18863e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f18863e = r1
                goto L18
            L13:
                l2.e0$a$a r0 = new l2.e0$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f18862d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f18863e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3a
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                mf.a0.k(r9)
                goto L6a
            L2a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L32:
                gm.a0 r8 = r0.f18866h
                l2.e0$a r2 = r0.f18865g
                mf.a0.k(r9)
                goto L54
            L3a:
                mf.a0.k(r9)
                gm.a0 r9 = r7.f18859a
                fm.q r2 = r7.f18860b
                T r5 = r9.f15485a
                r0.f18865g = r7
                r0.f18866h = r9
                r0.f18863e = r4
                java.lang.Object r8 = r2.j(r5, r8, r0)
                if (r8 != r1) goto L50
                return r1
            L50:
                r2 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L54:
                r8.f15485a = r9
                sm.g r8 = r2.f18861c
                gm.a0 r9 = r2.f18859a
                T r9 = r9.f15485a
                r2 = 0
                r0.f18865g = r2
                r0.f18866h = r2
                r0.f18863e = r3
                java.lang.Object r8 = r8.n(r9, r0)
                if (r8 != r1) goto L6a
                return r1
            L6a:
                tl.l r8 = tl.l.f28297a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: l2.e0.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e0(Object obj, sm.f<Object> fVar, fm.q<Object, Object, ? super xl.d<Object>, ? extends Object> qVar, xl.d<? super e0> dVar) {
        super(2, dVar);
        this.f18856h = obj;
        this.f18857i = fVar;
        this.f18858j = qVar;
    }

    @Override // fm.p
    public final Object A(sm.g<Object> gVar, xl.d<? super tl.l> dVar) {
        return ((e0) p(gVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        e0 e0Var = new e0(this.f18856h, this.f18857i, this.f18858j, dVar);
        e0Var.f18855g = obj;
        return e0Var;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    @Override // zl.a
    public final Object t(Object obj) {
        gm.a0 a0Var;
        sm.g gVar;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f18854f;
        if (i10 == 0) {
            mf.a0.k(obj);
            sm.g gVar2 = (sm.g) this.f18855g;
            a0Var = new gm.a0();
            ?? r42 = this.f18856h;
            a0Var.f15485a = r42;
            this.f18855g = gVar2;
            this.f18853e = a0Var;
            this.f18854f = 1;
            if (gVar2.n(r42, this) == aVar) {
                return aVar;
            }
            gVar = gVar2;
        } else if (i10 != 1) {
            if (i10 == 2) {
                mf.a0.k(obj);
                return tl.l.f28297a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            a0Var = this.f18853e;
            gVar = (sm.g) this.f18855g;
            mf.a0.k(obj);
        }
        sm.f<Object> fVar = this.f18857i;
        a aVar2 = new a(a0Var, this.f18858j, gVar);
        this.f18855g = null;
        this.f18853e = null;
        this.f18854f = 2;
        if (fVar.a(aVar2, this) == aVar) {
            return aVar;
        }
        return tl.l.f28297a;
    }
}
