package l2;

@zl.e(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1", f = "CachedPagingData.kt", l = {222}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class n extends zl.i implements fm.q<sm.g<? super u0<Object>>, b2<Object>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f19101e;

    /* renamed from: f */
    public /* synthetic */ sm.g f19102f;

    /* renamed from: g */
    public /* synthetic */ Object f19103g;

    /* renamed from: h */
    public final /* synthetic */ pm.e0 f19104h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(xl.d dVar, pm.e0 e0Var) {
        super(3, dVar);
        this.f19104h = e0Var;
    }

    @Override // fm.q
    public final Object j(sm.g<? super u0<Object>> gVar, b2<Object> b2Var, xl.d<? super tl.l> dVar) {
        n nVar = new n(dVar, this.f19104h);
        nVar.f19102f = gVar;
        nVar.f19103g = b2Var;
        return nVar.t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f19101e;
        if (i10 == 0) {
            mf.a0.k(obj);
            sm.g gVar = this.f19102f;
            u0 u0Var = new u0(this.f19104h, (b2) this.f19103g);
            this.f19101e = 1;
            if (gVar.n(u0Var, this) == aVar) {
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
