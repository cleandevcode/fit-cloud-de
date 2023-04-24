package th;

import android.content.Intent;
import android.view.View;
import com.topstep.fitcloud.pro.ui.device.alarm.AlarmListFragment;
import com.topstep.fitcloud.pro.ui.device.bind.ConnectHelpFragment;
import com.topstep.fitcloud.pro.ui.device.bind.DeviceBindFragment;
import com.topstep.fitcloud.pro.ui.device.bind.DeviceQrCodeActivity;
import com.topstep.fitcloud.pro.ui.device.song.push.SongPushFragment;
import com.topstep.fitcloud.pro.ui.policy.AskPolicyFragment;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f28206a;

    /* renamed from: b */
    public final /* synthetic */ Object f28207b;

    public /* synthetic */ l(int i10, Object obj) {
        this.f28206a = i10;
        this.f28207b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f28206a) {
            case 0:
                AlarmListFragment alarmListFragment = (AlarmListFragment) this.f28207b;
                mm.h<Object>[] hVarArr = AlarmListFragment.f10762x0;
                gm.l.f(alarmListFragment, "this$0");
                qi.h.j(alarmListFragment).b(new AlarmListFragment.d(null));
                return;
            case 1:
                ConnectHelpFragment connectHelpFragment = (ConnectHelpFragment) this.f28207b;
                mm.h<Object>[] hVarArr2 = ConnectHelpFragment.f10792n0;
                gm.l.f(connectHelpFragment, "this$0");
                si.f.f27071a.f(connectHelpFragment, new jc.f(5, connectHelpFragment));
                return;
            case 2:
                DeviceBindFragment deviceBindFragment = (DeviceBindFragment) this.f28207b;
                mm.h<Object>[] hVarArr3 = DeviceBindFragment.E0;
                gm.l.f(deviceBindFragment, "this$0");
                try {
                    deviceBindFragment.V0().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } catch (Exception e10) {
                    p000do.a.f13275a.q(e10);
                    return;
                }
            case 3:
                DeviceQrCodeActivity deviceQrCodeActivity = (DeviceQrCodeActivity) this.f28207b;
                int i10 = DeviceQrCodeActivity.A;
                gm.l.f(deviceQrCodeActivity, "this$0");
                deviceQrCodeActivity.setResult(-1);
                deviceQrCodeActivity.finish();
                return;
            case 4:
                SongPushFragment songPushFragment = (SongPushFragment) this.f28207b;
                mm.h<Object>[] hVarArr4 = SongPushFragment.f11348w0;
                gm.l.f(songPushFragment, "this$0");
                songPushFragment.i1();
                return;
            default:
                AskPolicyFragment askPolicyFragment = (AskPolicyFragment) this.f28207b;
                mm.h<Object>[] hVarArr5 = AskPolicyFragment.f11702u0;
                gm.l.f(askPolicyFragment, "this$0");
                rm.l.g(askPolicyFragment).e(new AskPolicyFragment.c(null));
                return;
        }
    }
}
