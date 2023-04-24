package ii;

import com.topstep.fitcloud.pro.model.version.AppUpgradeInfo;
import com.topstep.fitcloud.pro.ui.settings.SettingsViewModel;

@zl.e(c = "com.topstep.fitcloud.pro.ui.settings.SettingsViewModel$getVersion$1", f = "SettingsFragment.kt", l = {261}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class q0 extends zl.i implements fm.l<xl.d<? super AppUpgradeInfo>, Object> {

    /* renamed from: e */
    public int f16980e;

    /* renamed from: f */
    public final /* synthetic */ SettingsViewModel f16981f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(SettingsViewModel settingsViewModel, xl.d<? super q0> dVar) {
        super(1, dVar);
        this.f16981f = settingsViewModel;
    }

    @Override // fm.l
    public final Object k(xl.d<? super AppUpgradeInfo> dVar) {
        return new q0(this.f16981f, dVar).t(tl.l.f28297a);
    }

    @Override // zl.a
    public final Object t(Object obj) {
        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
        int i10 = this.f16980e;
        if (i10 != 0) {
            if (i10 == 1) {
                mf.a0.k(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            mf.a0.k(obj);
            zg.b bVar = this.f16981f.f11917n;
            this.f16980e = 1;
            obj = bVar.a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        eg.b bVar2 = (eg.b) obj;
        if (bVar2 != null) {
            return bVar2.f13617a;
        }
        return null;
    }
}
