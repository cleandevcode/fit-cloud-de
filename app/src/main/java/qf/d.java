package qf;

import android.app.Application;
import gm.l;
import ih.v;
import of.h;
import y3.b0;
import y3.f1;
import y3.k0;
import y3.r0;

/* loaded from: classes2.dex */
public final class d<VM extends k0<S>, S extends b0> implements r0<VM, S> {

    /* renamed from: a */
    public final Class<? extends k0<S>> f24815a;

    public d(Class<? extends k0<S>> cls) {
        l.f(cls, "viewModelClass");
        this.f24815a = cls;
    }

    public VM create(f1 f1Var, S s10) {
        l.f(f1Var, "viewModelContext");
        l.f(s10, "state");
        Application application = f1Var.a().getApplication();
        l.d(application, "null cannot be cast to non-null type A of com.airbnb.mvrx.ViewModelContext.app");
        a<?, ?> aVar = ((c) v.f(new h(((b) v.f(application, b.class)).d().f23102a), c.class)).a().get(this.f24815a);
        VM vm2 = null;
        if (aVar == null) {
            aVar = null;
        }
        if (aVar != null) {
            vm2 = (VM) aVar.a(s10);
        }
        l.d(vm2, "null cannot be cast to non-null type VM of com.topstep.fitcloud.pro.di.mavericks.HiltMavericksViewModelFactory");
        return vm2;
    }

    public S initialState(f1 f1Var) {
        l.f(f1Var, "viewModelContext");
        return null;
    }
}
