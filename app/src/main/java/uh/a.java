package uh;

import android.content.Intent;
import android.view.View;
import com.topstep.fitcloud.pro.ui.device.bind.ConnectHelpFragment;
import com.topstep.fitcloud.pro.ui.device.bind.DeviceBindFragment;
import com.topstep.fitcloud.pro.ui.policy.AskPolicyFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f28737a;

    /* renamed from: b */
    public final /* synthetic */ androidx.fragment.app.r f28738b;

    public /* synthetic */ a(int i10, androidx.fragment.app.r rVar) {
        this.f28737a = i10;
        this.f28738b = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f28737a) {
            case 0:
                ConnectHelpFragment connectHelpFragment = (ConnectHelpFragment) this.f28738b;
                mm.h<Object>[] hVarArr = ConnectHelpFragment.f10792n0;
                gm.l.f(connectHelpFragment, "this$0");
                try {
                    connectHelpFragment.V0().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception e10) {
                    p000do.a.f13275a.q(e10);
                    return;
                }
            case 1:
                DeviceBindFragment deviceBindFragment = (DeviceBindFragment) this.f28738b;
                mm.h<Object>[] hVarArr2 = DeviceBindFragment.E0;
                gm.l.f(deviceBindFragment, "this$0");
                deviceBindFragment.l1();
                return;
            case 2:
                i iVar = (i) this.f28738b;
                mm.h<Object>[] hVarArr3 = i.O0;
                gm.l.f(iVar, "this$0");
                iVar.V0().startActivity(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
                return;
            default:
                AskPolicyFragment askPolicyFragment = (AskPolicyFragment) this.f28738b;
                mm.h<Object>[] hVarArr4 = AskPolicyFragment.f11702u0;
                gm.l.f(askPolicyFragment, "this$0");
                rm.l.g(askPolicyFragment).e(new AskPolicyFragment.d(null));
                return;
        }
    }
}
