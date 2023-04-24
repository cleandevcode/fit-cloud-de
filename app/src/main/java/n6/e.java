package n6;

import android.view.View;
import bi.z0;
import com.topstep.fitcloud.pro.ui.HomePageFragment;
import com.topstep.fitcloud.pro.ui.device.alarm.AlarmListFragment;
import com.topstep.fitcloud.pro.ui.device.contacts.ContactsViewModel;
import com.topstep.fitcloud.pro.ui.device.dial.component.DialComponentListFragment;
import com.topstep.fitcloud.pro.ui.device.game.push.GamePacketParentFragment;
import com.topstep.fitcloud.pro.ui.sport.SportDetailActivity;
import com.topstep.fitcloudpro.R;
import pm.z1;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f22073a;

    /* renamed from: b */
    public final /* synthetic */ Object f22074b;

    public /* synthetic */ e(int i10, Object obj) {
        this.f22073a = i10;
        this.f22074b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f22073a) {
            case 0:
                h hVar = (h) this.f22074b;
                int i10 = h.M0;
                gm.l.f(hVar, "this$0");
                hVar.l1();
                return;
            case 1:
                HomePageFragment homePageFragment = (HomePageFragment) this.f22074b;
                mm.h<Object>[] hVarArr = HomePageFragment.G0;
                gm.l.f(homePageFragment, "this$0");
                tb.a.f(homePageFragment).l(R.id.sportFragment, null, ih.v.d().a());
                return;
            case 2:
                AlarmListFragment alarmListFragment = (AlarmListFragment) this.f22074b;
                mm.h<Object>[] hVarArr2 = AlarmListFragment.f10762x0;
                gm.l.f(alarmListFragment, "this$0");
                alarmListFragment.j1();
                return;
            case 3:
                vh.m mVar = (vh.m) this.f22074b;
                gm.l.f(mVar, "this$0");
                int i11 = vh.m.C0;
                ContactsViewModel.a aVar = mVar.i1().f10904i;
                z1 z1Var = aVar.f24879d;
                if (z1Var != null) {
                    z1Var.h(null);
                }
                aVar.f24879d = z0.g(aVar.f24876a, null, 0, new qi.r(aVar, 0L, null), 3);
                return;
            case 4:
                DialComponentListFragment dialComponentListFragment = (DialComponentListFragment) this.f22074b;
                mm.h<Object>[] hVarArr3 = DialComponentListFragment.f10952r0;
                gm.l.f(dialComponentListFragment, "this$0");
                dialComponentListFragment.d1();
                return;
            case 5:
                GamePacketParentFragment gamePacketParentFragment = (GamePacketParentFragment) this.f22074b;
                mm.h<Object>[] hVarArr4 = GamePacketParentFragment.f11057n0;
                gm.l.f(gamePacketParentFragment, "this$0");
                gamePacketParentFragment.d1();
                return;
            default:
                SportDetailActivity sportDetailActivity = (SportDetailActivity) this.f22074b;
                SportDetailActivity.a aVar2 = SportDetailActivity.B;
                gm.l.f(sportDetailActivity, "this$0");
                sportDetailActivity.M();
                return;
        }
    }
}
