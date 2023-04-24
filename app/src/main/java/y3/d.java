package y3;

@zl.e(c = "com.airbnb.mvrx.CoroutinesStateStore$flushQueuesOnce$2$2", f = "CoroutinesStateStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d extends zl.i implements fm.p<fm.l<b0, ? extends tl.l>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public /* synthetic */ Object f30938e;

    /* renamed from: f */
    public final /* synthetic */ f<b0> f30939f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f<b0> fVar, xl.d<? super d> dVar) {
        super(2, dVar);
        this.f30939f = fVar;
    }

    @Override // fm.p
    public final Object A(fm.l<b0, ? extends tl.l> lVar, xl.d<? super tl.l> dVar) {
        return ((d) p(lVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        d dVar2 = new d(this.f30939f, dVar);
        dVar2.f30938e = obj;
        return dVar2;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        mf.a0.k(obj);
        ((fm.l) this.f30938e).k(this.f30939f.f30952f);
        return tl.l.f28297a;
    }
}
