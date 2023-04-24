package ii;

import com.topstep.fitcloud.pro.ui.settings.SettingsViewModel;

@zl.e(c = "com.topstep.fitcloud.pro.ui.settings.SettingsViewModel$signOut$1", f = "SettingsFragment.kt", l = {253}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class t0 extends zl.i implements fm.l<xl.d<? super tl.l>, Object> {

    /* renamed from: e */
    public int f16989e;

    /* renamed from: f */
    public final /* synthetic */ SettingsViewModel f16990f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(SettingsViewModel settingsViewModel, xl.d<? super t0> dVar) {
        super(1, dVar);
        this.f16990f = settingsViewModel;
    }

    @Override // fm.l
    public final Object k(xl.d<? super tl.l> dVar) {
        return new t0(this.f16990f, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f16989e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            jg.a aVar2 = this.f16990f.f11914k;
            this.f16989e = 1;
            if (aVar2.f(this) == aVar) {
                return aVar;
            }
        }
        return tl.l.f28297a;
    }
}
