package s;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.e;
import com.topstep.fitcloud.pro.model.version.HardwareUpgradeInfo;
import com.topstep.fitcloud.pro.ui.device.alarm.AlarmListFragment;
import com.topstep.fitcloud.pro.ui.device.alarm.AlarmViewModel;
import com.topstep.fitcloud.pro.ui.device.dial.DfuViewModel;
import com.topstep.fitcloud.pro.ui.device.dial.component.DialComponentListFragment;
import com.topstep.fitcloud.pro.ui.device.game.push.GamePacketParentFragment;
import com.topstep.fitcloud.pro.ui.device.settings.HardwareUpgradeFragment;
import com.topstep.fitcloud.pro.ui.friend.FriendDataFragment;
import com.topstep.fitcloud.pro.ui.friend.FriendDataViewModel;
import com.topstep.fitcloud.pro.ui.friend.FriendMsgFragment;
import com.topstep.fitcloud.pro.ui.friend.FriendMsgVieModel;
import com.topstep.fitcloud.pro.ui.sport.SportDetailActivity;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloudpro.R;
import p0.c;
import si.f;
import w.s;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements c.InterfaceC0425c, s.b, o.a, androidx.activity.result.b, LoadingView.a, e.a, f.a, Toolbar.f {

    /* renamed from: a */
    public final /* synthetic */ int f25995a;

    /* renamed from: b */
    public final /* synthetic */ Object f25996b;

    public /* synthetic */ i(int i10, Object obj) {
        this.f25995a = i10;
        this.f25996b = obj;
    }

    @Override // androidx.activity.result.b
    public final void a(Object obj) {
        switch (this.f25995a) {
            case 5:
                jc.u uVar = (jc.u) this.f25996b;
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                int i10 = jc.u.f17601x0;
                gm.l.f(uVar, "this$0");
                uVar.e1(new jc.t(uVar));
                return;
            default:
                lh.h.j1((lh.h) this.f25996b, (androidx.activity.result.a) obj);
                return;
        }
    }

    @Override // o.a
    public final Object apply(Object obj) {
        androidx.camera.lifecycle.e eVar = androidx.camera.lifecycle.e.f1841f;
        eVar.f1846e = (y.u) obj;
        b0.g.a((Context) this.f25996b);
        eVar.getClass();
        return eVar;
    }

    @Override // si.f.a
    public final void b(boolean z10) {
        HardwareUpgradeFragment hardwareUpgradeFragment = (HardwareUpgradeFragment) this.f25996b;
        gm.l.f(hardwareUpgradeFragment, "this$0");
        if (z10) {
            HardwareUpgradeInfo hardwareUpgradeInfo = hardwareUpgradeFragment.f11132v0;
            if (hardwareUpgradeInfo == null) {
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.setType("*/*");
                intent.addCategory("android.intent.category.OPENABLE");
                try {
                    hardwareUpgradeFragment.f11134x0.b(intent);
                } catch (Exception e10) {
                    p000do.a.f13275a.q(e10);
                    d7.e.e(hardwareUpgradeFragment.f1(), "Select file error!");
                }
            } else if (hardwareUpgradeInfo.getType() == eg.a.f13612d) {
                d7.e.d(hardwareUpgradeFragment.f1(), R.string.dfu_unsupport_flash, null, 0, 30);
            } else {
                Uri parse = Uri.parse(hardwareUpgradeInfo.getUrl());
                gm.l.e(parse, "parse(info.url)");
                ((DfuViewModel) hardwareUpgradeFragment.f11131u0.getValue()).g(1, parse, (byte) 0);
            }
        }
    }

    @Override // com.topstep.fitcloud.pro.ui.widget.LoadingView.a
    public final void d() {
        switch (this.f25995a) {
            case 7:
                AlarmListFragment alarmListFragment = (AlarmListFragment) this.f25996b;
                mm.h<Object>[] hVarArr = AlarmListFragment.f10762x0;
                gm.l.f(alarmListFragment, "this$0");
                AlarmViewModel i12 = alarmListFragment.i1();
                i12.getClass();
                bi.z0.g(rm.l.h(i12), null, 0, new th.u(i12, null), 3);
                return;
            case 8:
                DialComponentListFragment dialComponentListFragment = (DialComponentListFragment) this.f25996b;
                mm.h<Object>[] hVarArr2 = DialComponentListFragment.f10952r0;
                gm.l.f(dialComponentListFragment, "this$0");
                xh.i h12 = dialComponentListFragment.h1();
                h12.getClass();
                y3.k0.a(h12, new xh.k(h12, null), xh.l.f30578b);
                return;
            case 12:
                FriendDataFragment friendDataFragment = (FriendDataFragment) this.f25996b;
                mm.h<Object>[] hVarArr3 = FriendDataFragment.f11482z0;
                gm.l.f(friendDataFragment, "this$0");
                FriendDataViewModel j12 = friendDataFragment.j1();
                long userId = friendDataFragment.h1().f13742a.getUserId();
                j12.getClass();
                v6.b.f(j12, new ei.n(j12, userId, null), null, ei.o.f13773b, 3);
                return;
            default:
                FriendMsgFragment friendMsgFragment = (FriendMsgFragment) this.f25996b;
                mm.h<Object>[] hVarArr4 = FriendMsgFragment.f11598x0;
                gm.l.f(friendMsgFragment, "this$0");
                FriendMsgVieModel i13 = friendMsgFragment.i1();
                i13.getClass();
                v6.b.f(i13, new ei.g0(i13, null), null, ei.h0.f13743b, 3);
                return;
        }
    }

    @Override // com.google.android.material.tabs.e.a
    public final void f(TabLayout.g gVar, int i10) {
        GamePacketParentFragment gamePacketParentFragment = (GamePacketParentFragment) this.f25996b;
        mm.h<Object>[] hVarArr = GamePacketParentFragment.f11057n0;
        gm.l.f(gamePacketParentFragment, "this$0");
        gVar.a(gamePacketParentFragment.o0(i10 == 0 ? R.string.ds_game_center : R.string.ds_game_mine));
    }

    @Override // p0.c.InterfaceC0425c
    public final String g(c.a aVar) {
        switch (this.f25995a) {
            case 0:
                r rVar = (r) this.f25996b;
                rVar.f26138c.execute(new o(rVar, aVar, 0));
                return "updateSessionConfigAsync";
            case 1:
            default:
                e0.m mVar = (e0.m) this.f25996b;
                synchronized (mVar.f13312b) {
                    mVar.f13319i = aVar;
                }
                return "YuvToJpegProcessor-close";
            case 2:
                w.s sVar = (w.s) this.f25996b;
                sVar.f29514d = aVar;
                return "WaitForRepeatingRequestStart[" + sVar + "]";
        }
    }

    @Override // androidx.appcompat.widget.Toolbar.f
    public final void onMenuItemClick(MenuItem menuItem) {
        SportDetailActivity sportDetailActivity = (SportDetailActivity) this.f25996b;
        SportDetailActivity.a aVar = SportDetailActivity.B;
        gm.l.f(sportDetailActivity, "this$0");
        if (menuItem.getItemId() == R.id.menu_share) {
            rm.l.g(sportDetailActivity).e(new SportDetailActivity.b(null));
        }
    }
}
