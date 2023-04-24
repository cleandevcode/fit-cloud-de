package ii;

import com.topstep.fitcloud.pro.ui.settings.SettingsViewModel;

@zl.e(c = "com.topstep.fitcloud.pro.ui.settings.SettingsViewModel$syncData$1", f = "SettingsFragment.kt", l = {245}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class v0 extends zl.i implements fm.l<xl.d<? super Boolean>, Object> {

    /* renamed from: e */
    public int f16993e;

    /* renamed from: f */
    public final /* synthetic */ SettingsViewModel f16994f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(SettingsViewModel settingsViewModel, xl.d<? super v0> dVar) {
        super(1, dVar);
        this.f16994f = settingsViewModel;
    }

    @Override // fm.l
    public final Object k(xl.d<? super Boolean> dVar) {
        return new v0(this.f16994f, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f16993e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            SettingsViewModel settingsViewModel = this.f16994f;
            ch.a aVar2 = settingsViewModel.f11915l;
            long j10 = settingsViewModel.f11913j;
            this.f16993e = 1;
            obj = aVar2.i(j10, true, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
