package l2;

@zl.e(c = "androidx.paging.PagingDataDiffer$collectFrom$2", f = "PagingDataDiffer.kt", l = {467}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h2 extends zl.i implements fm.l<xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f18951e;

    /* renamed from: f */
    public final /* synthetic */ j2<Object> f18952f;

    /* renamed from: g */
    public final /* synthetic */ b2<Object> f18953g;

    @zl.e(c = "androidx.paging.PagingDataDiffer$collectFrom$2$1$1", f = "PagingDataDiffer.kt", l = {151, 193}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public w1 f18954e;

        /* renamed from: f */
        public gm.x f18955f;

        /* renamed from: g */
        public int f18956g;

        /* renamed from: h */
        public final /* synthetic */ b1<Object> f18957h;

        /* renamed from: i */
        public final /* synthetic */ j2<Object> f18958i;

        /* renamed from: l2.h2$a$a */
        /* loaded from: classes.dex */
        public static final class C0332a extends gm.m implements fm.a<tl.l> {

            /* renamed from: b */
            public final /* synthetic */ j2<Object> f18959b;

            /* renamed from: c */
            public final /* synthetic */ w1<Object> f18960c;

            /* renamed from: d */
            public final /* synthetic */ gm.x f18961d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0332a(j2<Object> j2Var, w1<Object> w1Var, gm.x xVar) {
                super(0);
                this.f18959b = j2Var;
                this.f18960c = w1Var;
                this.f18961d = xVar;
            }

            @Override // fm.a
            public final tl.l m() {
                this.f18959b.f19021c = this.f18960c;
                this.f18961d.f15506a = true;
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b1<Object> b1Var, j2<Object> j2Var, xl.d<? super a> dVar) {
            super(2, dVar);
            this.f18957h = b1Var;
            this.f18958i = j2Var;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new a(this.f18957h, this.f18958i, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:172:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:182:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:191:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:215:0x01c7  */
        /* JADX WARN: Removed duplicated region for block: B:246:0x0288  */
        /* JADX WARN: Removed duplicated region for block: B:249:0x0293  */
        /* JADX WARN: Removed duplicated region for block: B:285:0x030a  */
        @Override // zl.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object t(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 834
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: l2.h2.a.t(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements sm.g<b1<Object>> {

        /* renamed from: a */
        public final /* synthetic */ j2 f18962a;

        public b(j2 j2Var) {
            this.f18962a = j2Var;
        }

        @Override // sm.g
        public final Object n(b1<Object> b1Var, xl.d<? super tl.l> dVar) {
            j2 j2Var = this.f18962a;
            Object s10 = bi.z0.s(dVar, j2Var.f19020b, new a(b1Var, j2Var, null));
            if (s10 == yl.a.COROUTINE_SUSPENDED) {
                return s10;
            }
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(j2<Object> j2Var, b2<Object> b2Var, xl.d<? super h2> dVar) {
        super(1, dVar);
        this.f18952f = j2Var;
        this.f18953g = b2Var;
    }

    @Override // fm.l
    public final Object k(xl.d<? super tl.l> dVar) {
        return new h2(this.f18952f, this.f18953g, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f18951e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            j2<Object> j2Var = this.f18952f;
            b2<Object> b2Var = this.f18953g;
            j2Var.f19022d = b2Var.f18756b;
            sm.f<b1<Object>> fVar = b2Var.f18755a;
            b bVar = new b(j2Var);
            this.f18951e = 1;
            if (fVar.a(bVar, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
