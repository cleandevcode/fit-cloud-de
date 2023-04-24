package bi;

import com.topstep.fitcloud.pro.ui.device.settings.NotificationFragment;
import og.j1;

@zl.e(c = "com.topstep.fitcloud.pro.ui.device.settings.NotificationFragment$changeCommonFlags$1", f = "NotificationFragment.kt", l = {257}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class k0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f4324e;

    /* renamed from: f */
    public final /* synthetic */ NotificationFragment f4325f;

    /* renamed from: g */
    public final /* synthetic */ gm.z f4326g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(NotificationFragment notificationFragment, gm.z zVar, xl.d<? super k0> dVar) {
        super(2, dVar);
        this.f4325f = notificationFragment;
        this.f4326g = zVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((k0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new k0(this.f4325f, this.f4326g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f4324e;
        if (i10 == 0) {
            mf.a0.k(obj);
            j1 h12 = this.f4325f.h1();
            int i11 = this.f4326g.f15508a;
            this.f4324e = 1;
            if (h12.c(i11, this) == aVar) {
                return aVar;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            mf.a0.k(obj);
        }
        return tl.l.f28297a;
    }
}
