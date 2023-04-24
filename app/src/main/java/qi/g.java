package qi;

import androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3;
import androidx.lifecycle.k;
import mf.a0;
import pm.e0;

@zl.e(c = "com.topstep.fitcloud.pro.utils.ExtensionsKt$launchRepeatOnStarted$1", f = "Extensions.kt", l = {73}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f24859e;

    /* renamed from: f */
    public final /* synthetic */ androidx.lifecycle.k f24860f;

    /* renamed from: g */
    public final /* synthetic */ fm.p<e0, xl.d<? super tl.l>, Object> f24861g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(androidx.lifecycle.k kVar, fm.p<? super e0, ? super xl.d<? super tl.l>, ? extends Object> pVar, xl.d<? super g> dVar) {
        super(2, dVar);
        this.f24860f = kVar;
        this.f24861g = pVar;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((g) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new g(this.f24860f, this.f24861g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        Object s10;
        Object obj2 = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f24859e;
        if (i10 != 0) {
            if (i10 == 1) {
                a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            a0.k(obj);
            androidx.lifecycle.k kVar = this.f24860f;
            k.c cVar = k.c.STARTED;
            fm.p<e0, xl.d<? super tl.l>, Object> pVar = this.f24861g;
            this.f24859e = 1;
            if (kVar.b() == k.c.DESTROYED || (s10 = bi.r.s(new RepeatOnLifecycleKt$repeatOnLifecycle$3(kVar, cVar, pVar, null), this)) != obj2) {
                s10 = tl.l.f28297a;
            }
            if (s10 == obj2) {
                return obj2;
            }
        }
        return tl.l.f28297a;
    }
}
