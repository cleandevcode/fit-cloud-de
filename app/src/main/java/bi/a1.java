package bi;

import android.content.DialogInterface;
import com.topstep.fitcloud.pro.ui.DeviceViewModel;
import com.topstep.fitcloud.pro.ui.settings.SettingsViewModel;

/* loaded from: classes2.dex */
public final /* synthetic */ class a1 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f4249a;

    /* renamed from: b */
    public final /* synthetic */ f.q f4250b;

    public /* synthetic */ a1(f.q qVar, int i10) {
        this.f4249a = i10;
        this.f4250b = qVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f4249a) {
            case 0:
                b1 b1Var = (b1) this.f4250b;
                int i11 = b1.C0;
                gm.l.f(b1Var, "this$0");
                DeviceViewModel deviceViewModel = (DeviceViewModel) b1Var.B0.getValue();
                deviceViewModel.getClass();
                z0.g(rm.l.h(deviceViewModel), null, 0, new ih.e(deviceViewModel, null), 3);
                return;
            default:
                ii.x0 x0Var = (ii.x0) this.f4250b;
                int i12 = ii.x0.C0;
                gm.l.f(x0Var, "this$0");
                SettingsViewModel settingsViewModel = (SettingsViewModel) x0Var.B0.getValue();
                settingsViewModel.getClass();
                v6.b.f(settingsViewModel, new ii.t0(settingsViewModel, null), null, ii.u0.f16991b, 3);
                return;
        }
    }
}
