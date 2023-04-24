package ii;

import com.topstep.fitcloud.pro.ui.settings.SettingsViewModel;

@zl.e(c = "com.topstep.fitcloud.pro.ui.settings.SettingsViewModel$setTheme$1", f = "SettingsFragment.kt", l = {235}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class s0 extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f16983e;

    /* renamed from: f */
    public final /* synthetic */ SettingsViewModel f16984f;

    /* renamed from: g */
    public final /* synthetic */ cg.a f16985g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(SettingsViewModel settingsViewModel, cg.a aVar, xl.d<? super s0> dVar) {
        super(2, dVar);
        this.f16984f = settingsViewModel;
        this.f16985g = aVar;
    }

    @Override // fm.p
    public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
        return ((s0) p(e0Var, dVar)).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
        return new s0(this.f16984f, this.f16985g, dVar);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f16983e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            yg.m mVar = this.f16984f.f11918o;
            cg.a aVar2 = this.f16985g;
            this.f16983e = 1;
            if (mVar.d(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
