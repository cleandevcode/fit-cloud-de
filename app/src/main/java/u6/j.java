package u6;

import java.util.concurrent.ConcurrentHashMap;

@zl.e(c = "com.github.airbnb.mvrx.FlowExtensionsKt$collectLatest$flow$1", f = "FlowExtensions.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class j extends zl.i implements fm.p<Object, xl.d<? super Boolean>, Object> {

    /* renamed from: e */
    public /* synthetic */ Object f28552e;

    /* renamed from: f */
    public final /* synthetic */ ConcurrentHashMap<String, Object> f28553f;

    /* renamed from: g */
    public final /* synthetic */ f f28554g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ConcurrentHashMap<String, Object> concurrentHashMap, f fVar, xl.d<? super j> dVar) {
        super(2, dVar);
        this.f28553f = concurrentHashMap;
        this.f28554g = fVar;
    }

    @Override // fm.p
    public final Object A(Object obj, xl.d<? super Boolean> dVar) {
        return ((j) p(obj, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        j jVar = new j(this.f28553f, this.f28554g, dVar);
        jVar.f28552e = obj;
        return jVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        mf.a0.k(obj);
        return Boolean.valueOf(this.f28553f.containsKey(this.f28554g.b()) && gm.l.a(this.f28552e, this.f28553f.get(this.f28554g.b())));
    }
}
