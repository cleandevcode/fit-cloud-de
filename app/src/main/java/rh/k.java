package rh;

import android.view.View;
import com.topstep.fitcloud.pro.model.version.HardwareUpgradeInfo;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.device.contacts.ContactsFragment;
import com.topstep.fitcloud.pro.ui.device.settings.HardwareUpgradeFragment;
import com.topstep.fitcloudpro.R;
import uh.i;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f25706a;

    /* renamed from: b */
    public final /* synthetic */ Object f25707b;

    public /* synthetic */ k(int i10, Object obj) {
        this.f25706a = i10;
        this.f25707b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i.a aVar;
        switch (this.f25706a) {
            case 0:
                EcgHealthReportActivity ecgHealthReportActivity = (EcgHealthReportActivity) this.f25707b;
                int i10 = EcgHealthReportActivity.F;
                gm.l.f(ecgHealthReportActivity, "this$0");
                ecgHealthReportActivity.finish();
                return;
            case 1:
                uh.i iVar = (uh.i) this.f25707b;
                mm.h<Object>[] hVarArr = uh.i.O0;
                gm.l.f(iVar, "this$0");
                androidx.fragment.app.r rVar = iVar.f2537v;
                if (rVar instanceof i.a) {
                    aVar = (i.a) rVar;
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    aVar.d();
                    return;
                }
                return;
            case 2:
                ContactsFragment contactsFragment = (ContactsFragment) this.f25707b;
                mm.h<Object>[] hVarArr2 = ContactsFragment.f10879y0;
                gm.l.f(contactsFragment, "this$0");
                contactsFragment.j1();
                return;
            default:
                HardwareUpgradeFragment hardwareUpgradeFragment = (HardwareUpgradeFragment) this.f25707b;
                mm.h<Object>[] hVarArr3 = HardwareUpgradeFragment.f11129y0;
                gm.l.f(hardwareUpgradeFragment, "this$0");
                HardwareUpgradeInfo hardwareUpgradeInfo = hardwareUpgradeFragment.f11132v0;
                boolean z10 = true;
                if (((hardwareUpgradeInfo == null || !hardwareUpgradeInfo.isForce()) ? false : false) && !hardwareUpgradeFragment.f11133w0) {
                    d7.e.f(hardwareUpgradeFragment.f1(), R.string.version_hardware_update);
                    return;
                } else {
                    tb.a.f(hardwareUpgradeFragment).o();
                    return;
                }
        }
    }
}
