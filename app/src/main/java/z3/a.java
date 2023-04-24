package z3;

import fm.p;
import mf.a0;
import tl.l;
import y3.b0;
import y3.g0;
import zl.i;

@zl.e(c = "com.airbnb.mvrx.navigation.DefaultNavigationViewModelDelegateFactory$createLazyNavigationViewModel$1$1$1", f = "MavericksExtensions.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a extends i implements p<Object, xl.d<? super l>, Object> {

    /* renamed from: e */
    public final /* synthetic */ Object f31944e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Object obj, xl.d<? super a> dVar) {
        super(2, dVar);
        this.f31944e = obj;
    }

    @Override // fm.p
    public final Object A(Object obj, xl.d<? super l> dVar) {
        return ((a) p((b0) obj, dVar)).t(l.f28297a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.r, java.lang.Object] */
    @Override // zl.a
    public final xl.d<l> p(Object obj, xl.d<?> dVar) {
        return new a(this.f31944e, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        a0.k(obj);
        ((g0) this.f31944e).X();
        return l.f28297a;
    }
}
