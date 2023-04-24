package u6;

import com.github.airbnb.mvrx.FlowExtensionsKt$assertOneActiveSubscription$observer$1;
import java.util.Set;

@zl.e(c = "com.github.airbnb.mvrx.FlowExtensionsKt$assertOneActiveSubscription$1", f = "FlowExtensions.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class h extends zl.i implements fm.q<sm.g<Object>, Throwable, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public final /* synthetic */ Set<String> f28545e;

    /* renamed from: f */
    public final /* synthetic */ String f28546f;

    /* renamed from: g */
    public final /* synthetic */ androidx.lifecycle.u f28547g;

    /* renamed from: h */
    public final /* synthetic */ FlowExtensionsKt$assertOneActiveSubscription$observer$1 f28548h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Set<String> set, String str, androidx.lifecycle.u uVar, FlowExtensionsKt$assertOneActiveSubscription$observer$1 flowExtensionsKt$assertOneActiveSubscription$observer$1, xl.d<? super h> dVar) {
        super(3, dVar);
        this.f28545e = set;
        this.f28546f = str;
        this.f28547g = uVar;
        this.f28548h = flowExtensionsKt$assertOneActiveSubscription$observer$1;
    }

    @Override // fm.q
    public final Object j(sm.g<Object> gVar, Throwable th2, xl.d<? super tl.l> dVar) {
        return new h(this.f28545e, this.f28546f, this.f28547g, this.f28548h, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        mf.a0.k(obj);
        this.f28545e.remove(this.f28546f);
        this.f28547g.a0().c(this.f28548h);
        return tl.l.f28297a;
    }
}
