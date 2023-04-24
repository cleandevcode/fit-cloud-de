package u6;

@zl.e(c = "com.github.airbnb.mvrx.CoroutinesStateStore$flushQueuesOnce$2$2", f = "CoroutinesStateStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c extends zl.i implements fm.p<fm.l<o, ? extends tl.l>, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public /* synthetic */ Object f28528e;

    /* renamed from: f */
    public final /* synthetic */ e<o> f28529f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e<o> eVar, xl.d<? super c> dVar) {
        super(2, dVar);
        this.f28529f = eVar;
    }

    @Override // fm.p
    public final Object A(fm.l<o, ? extends tl.l> lVar, xl.d<? super tl.l> dVar) {
        return ((c) p(lVar, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        c cVar = new c(this.f28529f, dVar);
        cVar.f28528e = obj;
        return cVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        mf.a0.k(obj);
        ((fm.l) this.f28528e).k(this.f28529f.f28540f);
        return tl.l.f28297a;
    }
}
