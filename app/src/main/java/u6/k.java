package u6;

import java.util.concurrent.ConcurrentHashMap;

@zl.e(c = "com.github.airbnb.mvrx.FlowExtensionsKt$collectLatest$flow$2", f = "FlowExtensions.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class k extends zl.i implements fm.p<Object, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public /* synthetic */ Object f28555e;

    /* renamed from: f */
    public final /* synthetic */ ConcurrentHashMap<String, Object> f28556f;

    /* renamed from: g */
    public final /* synthetic */ f f28557g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ConcurrentHashMap<String, Object> concurrentHashMap, f fVar, xl.d<? super k> dVar) {
        super(2, dVar);
        this.f28556f = concurrentHashMap;
        this.f28557g = fVar;
    }

    @Override // fm.p
    public final Object A(Object obj, xl.d<? super tl.l> dVar) {
        return ((k) p(obj, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        k kVar = new k(this.f28556f, this.f28557g, dVar);
        kVar.f28555e = obj;
        return kVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        mf.a0.k(obj);
        this.f28556f.put(this.f28557g.b(), this.f28555e);
        return tl.l.f28297a;
    }
}
