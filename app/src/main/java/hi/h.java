package hi;

import com.topstep.fitcloud.pro.ui.policy.PrivacyPolicyFragment;
import fm.p;
import mf.a0;
import pm.e0;
import tl.l;
import yg.m;

@zl.e(c = "com.topstep.fitcloud.pro.ui.policy.PrivacyPolicyFragment$cancelPolicy$1", f = "PrivacyPolicyFragment.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h extends zl.i implements p<e0, xl.d<? super l>, Object> {

    /* renamed from: e */
    public int f16113e;

    /* renamed from: f */
    public /* synthetic */ Object f16114f;

    /* renamed from: g */
    public final /* synthetic */ PrivacyPolicyFragment f16115g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(PrivacyPolicyFragment privacyPolicyFragment, xl.d<? super h> dVar) {
        super(2, dVar);
        this.f16115g = privacyPolicyFragment;
    }

    @Override // fm.p
    public final Object A(e0 e0Var, xl.d<? super l> dVar) {
        return ((h) p(e0Var, dVar)).t(l.f28297a);
    }

    @Override // zl.a
    public final xl.d<l> p(Object obj, xl.d<?> dVar) {
        h hVar = new h(this.f16115g, dVar);
        hVar.f16114f = obj;
        return hVar;
    }

    @Override // zl.a
    public final Object t(Object obj) {
        Object f10;
        PrivacyPolicyFragment privacyPolicyFragment;
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f16113e;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    privacyPolicyFragment = (PrivacyPolicyFragment) this.f16114f;
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                e0 e0Var = (e0) this.f16114f;
                PrivacyPolicyFragment privacyPolicyFragment2 = this.f16115g;
                m mVar = privacyPolicyFragment2.f11730v0;
                if (mVar != null) {
                    this.f16114f = privacyPolicyFragment2;
                    this.f16113e = 1;
                    if (mVar.p(false, this) == aVar) {
                        return aVar;
                    }
                    privacyPolicyFragment = privacyPolicyFragment2;
                } else {
                    gm.l.l("publicStorage");
                    throw null;
                }
            }
            privacyPolicyFragment.T0().finish();
            f10 = l.f28297a;
        } catch (Throwable th2) {
            p000do.a.f13275a.q(th2);
            f10 = a0.f(th2);
        }
        Throwable a10 = tl.g.a(f10);
        if (a10 != null) {
            qi.p.f((d7.e) this.f16115g.f11728t0.getValue(), a10);
        }
        return l.f28297a;
    }
}
