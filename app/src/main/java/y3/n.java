package y3;

import java.util.concurrent.ConcurrentHashMap;

@zl.e(c = "com.airbnb.mvrx.FlowExtensionsKt$collectLatest$flow$2", f = "FlowExtensions.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class n extends zl.i implements fm.p<Object, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public /* synthetic */ Object f30987e;

    /* renamed from: f */
    public final /* synthetic */ ConcurrentHashMap<String, Object> f30988f;

    /* renamed from: g */
    public final /* synthetic */ i f30989g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ConcurrentHashMap<String, Object> concurrentHashMap, i iVar, xl.d<? super n> dVar) {
        super(2, dVar);
        this.f30988f = concurrentHashMap;
        this.f30989g = iVar;
    }

    @Override // fm.p
    public final Object A(Object obj, xl.d<? super tl.l> dVar) {
        return ((n) p(obj, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        n nVar = new n(this.f30988f, this.f30989g, dVar);
        nVar.f30987e = obj;
        return nVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        mf.a0.k(obj);
        this.f30988f.put(this.f30989g.b(), this.f30987e);
        return tl.l.f28297a;
    }
}
