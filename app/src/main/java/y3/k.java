package y3;

import com.airbnb.mvrx.FlowExtensionsKt$assertOneActiveSubscription$observer$1;
import java.util.Set;

@zl.e(c = "com.airbnb.mvrx.FlowExtensionsKt$assertOneActiveSubscription$1", f = "FlowExtensions.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class k extends zl.i implements fm.q<sm.g<Object>, Throwable, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public final /* synthetic */ Set<String> f30965e;

    /* renamed from: f */
    public final /* synthetic */ String f30966f;

    /* renamed from: g */
    public final /* synthetic */ androidx.lifecycle.u f30967g;

    /* renamed from: h */
    public final /* synthetic */ FlowExtensionsKt$assertOneActiveSubscription$observer$1 f30968h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Set<String> set, String str, androidx.lifecycle.u uVar, FlowExtensionsKt$assertOneActiveSubscription$observer$1 flowExtensionsKt$assertOneActiveSubscription$observer$1, xl.d<? super k> dVar) {
        super(3, dVar);
        this.f30965e = set;
        this.f30966f = str;
        this.f30967g = uVar;
        this.f30968h = flowExtensionsKt$assertOneActiveSubscription$observer$1;
    }

    @Override // fm.q
    public final Object j(sm.g<Object> gVar, Throwable th2, xl.d<? super tl.l> dVar) {
        return new k(this.f30965e, this.f30966f, this.f30967g, this.f30968h, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        mf.a0.k(obj);
        this.f30965e.remove(this.f30966f);
        this.f30967g.a0().c(this.f30968h);
        return tl.l.f28297a;
    }
}
