package oh;

import com.topstep.fitcloud.pro.ui.camera.PermissionFragment;
import com.topstep.fitcloudpro.R;
import fm.p;
import mf.a0;
import pm.e0;

@zl.e(c = "com.topstep.fitcloud.pro.ui.camera.PermissionFragment$navigateToCamera$1", f = "PermissionFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class m extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public final /* synthetic */ PermissionFragment f23555e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(PermissionFragment permissionFragment, xl.d<? super m> dVar) {
        super(2, dVar);
        this.f23555e = permissionFragment;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((m) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new m(this.f23555e, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        a0.k(obj);
        tb.a.f(this.f23555e).n(new i2.a(R.id.toCamera));
        return tl.l.f28297a;
    }
}
