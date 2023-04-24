package l2;

@zl.e(c = "androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1", f = "CancelableChannelFlow.kt", l = {30}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r extends zl.i implements fm.p<z2<Object>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19225e;

    /* renamed from: f */
    public /* synthetic */ Object f19226f;

    /* renamed from: g */
    public final /* synthetic */ pm.g1 f19227g;

    /* renamed from: h */
    public final /* synthetic */ fm.p<z2<Object>, xl.d<? super tl.l>, Object> f19228h;

    /* loaded from: classes.dex */
    public static final class a extends gm.m implements fm.l<Throwable, tl.l> {

        /* renamed from: b */
        public final /* synthetic */ z2<Object> f19229b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(z2<Object> z2Var) {
            super(1);
            this.f19229b = z2Var;
        }

        @Override // fm.l
        public final tl.l k(Throwable th2) {
            this.f19229b.o(null);
            return tl.l.f28297a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(pm.g1 g1Var, fm.p<? super z2<Object>, ? super xl.d<? super tl.l>, ? extends Object> pVar, xl.d<? super r> dVar) {
        super(2, dVar);
        this.f19227g = g1Var;
        this.f19228h = pVar;
    }

    @Override // fm.p
    public final Object A(z2<Object> z2Var, xl.d<? super tl.l> dVar) {
        return ((r) p(z2Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        r rVar = new r(this.f19227g, this.f19228h, dVar);
        rVar.f19226f = obj;
        return rVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19225e;
        if (i10 == 0) {
            mf.a0.k(obj);
            z2<Object> z2Var = (z2) this.f19226f;
            this.f19227g.k(new a(z2Var));
            fm.p<z2<Object>, xl.d<? super tl.l>, Object> pVar = this.f19228h;
            this.f19225e = 1;
            if (pVar.A(z2Var, this) == aVar) {
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
