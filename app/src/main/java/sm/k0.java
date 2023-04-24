package sm;

/* loaded from: classes2.dex */
public final class k0 implements f<Object> {

    /* renamed from: a */
    public final /* synthetic */ f f27234a;

    /* renamed from: b */
    public final /* synthetic */ fm.p f27235b;

    /* loaded from: classes2.dex */
    public static final class a<T> implements g {

        /* renamed from: a */
        public final /* synthetic */ g f27236a;

        /* renamed from: b */
        public final /* synthetic */ fm.p f27237b;

        @zl.e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {223, 224}, m = "emit")
        /* renamed from: sm.k0$a$a */
        /* loaded from: classes2.dex */
        public static final class C0489a extends zl.c {

            /* renamed from: d */
            public /* synthetic */ Object f27238d;

            /* renamed from: e */
            public int f27239e;

            /* renamed from: g */
            public Object f27241g;

            /* renamed from: h */
            public g f27242h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0489a(xl.d dVar) {
                super(dVar);
                a.this = r1;
            }

            @Override // zl.a
            public final Object t(Object obj) {
                this.f27238d = obj;
                this.f27239e |= Integer.MIN_VALUE;
                return a.this.n(null, this);
            }
        }

        public a(fm.p pVar, g gVar) {
            this.f27236a = gVar;
            this.f27237b = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x005d A[RETURN] */
        @Override // sm.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object n(T r6, xl.d<? super tl.l> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof sm.k0.a.C0489a
                if (r0 == 0) goto L13
                r0 = r7
                sm.k0$a$a r0 = (sm.k0.a.C0489a) r0
                int r1 = r0.f27239e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f27239e = r1
                goto L18
            L13:
                sm.k0$a$a r0 = new sm.k0$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f27238d
                yl.a r1 = yl.a.COROUTINE_SUSPENDED
                int r2 = r0.f27239e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3a
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                mf.a0.k(r7)
                goto L5e
            L2a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L32:
                sm.g r6 = r0.f27242h
                java.lang.Object r2 = r0.f27241g
                mf.a0.k(r7)
                goto L50
            L3a:
                mf.a0.k(r7)
                sm.g r7 = r5.f27236a
                fm.p r2 = r5.f27237b
                r0.f27241g = r6
                r0.f27242h = r7
                r0.f27239e = r4
                java.lang.Object r2 = r2.A(r6, r0)
                if (r2 != r1) goto L4e
                return r1
            L4e:
                r2 = r6
                r6 = r7
            L50:
                r7 = 0
                r0.f27241g = r7
                r0.f27242h = r7
                r0.f27239e = r3
                java.lang.Object r6 = r6.n(r2, r0)
                if (r6 != r1) goto L5e
                return r1
            L5e:
                tl.l r6 = tl.l.f28297a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: sm.k0.a.n(java.lang.Object, xl.d):java.lang.Object");
        }
    }

    public k0(fm.p pVar, f fVar) {
        this.f27234a = fVar;
        this.f27235b = pVar;
    }

    @Override // sm.f
    public final Object a(g<? super Object> gVar, xl.d dVar) {
        Object a10 = this.f27234a.a(new a(this.f27235b, gVar), dVar);
        return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : tl.l.f28297a;
    }
}
