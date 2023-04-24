package y3;

import java.util.concurrent.ConcurrentHashMap;

@zl.e(c = "com.airbnb.mvrx.FlowExtensionsKt$collectLatest$flow$1", f = "FlowExtensions.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class m extends zl.i implements fm.p<Object, xl.d<? super Boolean>, Object> {

    /* renamed from: e */
    public /* synthetic */ Object f30984e;

    /* renamed from: f */
    public final /* synthetic */ ConcurrentHashMap<String, Object> f30985f;

    /* renamed from: g */
    public final /* synthetic */ i f30986g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ConcurrentHashMap<String, Object> concurrentHashMap, i iVar, xl.d<? super m> dVar) {
        super(2, dVar);
        this.f30985f = concurrentHashMap;
        this.f30986g = iVar;
    }

    @Override // fm.p
    public final Object A(Object obj, xl.d<? super Boolean> dVar) {
        return ((m) p(obj, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        m mVar = new m(this.f30985f, this.f30986g, dVar);
        mVar.f30984e = obj;
        return mVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        mf.a0.k(obj);
        return Boolean.valueOf(this.f30985f.containsKey(this.f30986g.b()) && gm.l.a(this.f30984e, this.f30985f.get(this.f30986g.b())));
    }
}
