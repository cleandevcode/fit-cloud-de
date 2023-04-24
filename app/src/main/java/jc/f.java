package jc;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import bi.z0;
import com.topstep.fitcloud.pro.model.data.SportGoal;
import com.topstep.fitcloud.pro.ui.MainActivity;
import com.topstep.fitcloud.pro.ui.camera.PermissionFragment;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgDetailFragment;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgViewModel;
import com.topstep.fitcloud.pro.ui.device.bind.ConnectHelpFragment;
import com.topstep.fitcloud.pro.ui.device.bind.DeviceQrCodeActivity;
import com.topstep.fitcloud.pro.ui.device.bind.DeviceSpecifyFragment;
import com.topstep.fitcloud.pro.ui.device.game.push.GameDetailFragment;
import com.topstep.fitcloud.pro.ui.device.game.push.GamePushViewModel;
import com.topstep.fitcloud.pro.ui.device.song.push.SongPushFragment;
import com.topstep.fitcloud.pro.ui.device.sport.push.SportPushFragment;
import com.topstep.fitcloud.pro.ui.friend.FriendEcgFragment;
import com.topstep.fitcloud.pro.ui.friend.FriendEcgViewModel;
import com.topstep.fitcloud.pro.ui.settings.wh.WhDetailFragment;
import com.topstep.fitcloud.pro.ui.sport.SportGoalActivity;
import com.topstep.fitcloud.pro.ui.sport.SportingActivity;
import com.topstep.fitcloud.pro.ui.sport.SportingViewMode;
import com.topstep.fitcloud.pro.ui.widget.HealthCalendarView;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloudpro.R;
import java.util.UUID;
import si.f;
import y3.k0;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements androidx.activity.result.b, f.a, HealthCalendarView.a, LoadingView.a, Toolbar.f {

    /* renamed from: a */
    public final /* synthetic */ int f17580a;

    /* renamed from: b */
    public final /* synthetic */ Object f17581b;

    public /* synthetic */ f(int i10, Object obj) {
        this.f17580a = i10;
        this.f17581b = obj;
    }

    @Override // androidx.activity.result.b
    public final void a(Object obj) {
        switch (this.f17580a) {
            case 0:
                u uVar = (u) this.f17581b;
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                int i10 = u.f17601x0;
                gm.l.f(uVar, "this$0");
                uVar.e1(new r(uVar));
                return;
            default:
                lh.h.j1((lh.h) this.f17581b, (androidx.activity.result.a) obj);
                return;
        }
    }

    @Override // si.f.a
    public final void b(boolean z10) {
        switch (this.f17580a) {
            case 2:
                PermissionFragment permissionFragment = (PermissionFragment) this.f17581b;
                if (z10) {
                    int i10 = PermissionFragment.f10429l0;
                    permissionFragment.getClass();
                    rm.l.g(permissionFragment).e(new oh.m(permissionFragment, null));
                    return;
                }
                permissionFragment.T0().finish();
                return;
            case 5:
                ConnectHelpFragment connectHelpFragment = (ConnectHelpFragment) this.f17581b;
                mm.h<Object>[] hVarArr = ConnectHelpFragment.f10792n0;
                gm.l.f(connectHelpFragment, "this$0");
                if (z10) {
                    RelativeLayout relativeLayout = connectHelpFragment.e1().layoutPermission;
                    gm.l.e(relativeLayout, "viewBind.layoutPermission");
                    relativeLayout.setVisibility(8);
                    return;
                }
                return;
            default:
                SongPushFragment songPushFragment = (SongPushFragment) this.f17581b;
                gm.l.f(songPushFragment, "this$0");
                if (z10) {
                    z0.g(rm.l.g(songPushFragment), null, 0, new com.topstep.fitcloud.pro.ui.device.song.push.a(songPushFragment, null), 3);
                    return;
                }
                return;
        }
    }

    @Override // com.topstep.fitcloud.pro.ui.widget.LoadingView.a
    public final void d() {
        switch (this.f17580a) {
            case 4:
                EcgDetailFragment ecgDetailFragment = (EcgDetailFragment) this.f17581b;
                mm.h<Object>[] hVarArr = EcgDetailFragment.f10615y0;
                gm.l.f(ecgDetailFragment, "this$0");
                EcgViewModel i12 = ecgDetailFragment.i1();
                UUID fromString = UUID.fromString(((rh.c) ecgDetailFragment.f10618v0.getValue()).f25671a);
                gm.l.e(fromString, "fromString(args.ecgId)");
                i12.j(fromString);
                return;
            case 7:
                GameDetailFragment gameDetailFragment = (GameDetailFragment) this.f17581b;
                mm.h<Object>[] hVarArr2 = GameDetailFragment.f11034t0;
                gm.l.f(gameDetailFragment, "this$0");
                GamePushViewModel h12 = gameDetailFragment.h1();
                h12.getClass();
                h12.h(new ai.j(h12, null), 0L);
                return;
            case 9:
                SportPushFragment sportPushFragment = (SportPushFragment) this.f17581b;
                mm.h<Object>[] hVarArr3 = SportPushFragment.f11415y0;
                gm.l.f(sportPushFragment, "this$0");
                di.g i13 = sportPushFragment.i1();
                i13.getClass();
                k0.a(i13, new di.h(i13, null), di.i.f13070b);
                return;
            default:
                FriendEcgFragment friendEcgFragment = (FriendEcgFragment) this.f17581b;
                mm.h<Object>[] hVarArr4 = FriendEcgFragment.f11513x0;
                gm.l.f(friendEcgFragment, "this$0");
                FriendEcgViewModel i14 = friendEcgFragment.i1();
                i14.getClass();
                v6.b.f(i14, new ei.s(i14, null), null, ei.t.f13787b, 3);
                return;
        }
    }

    @Override // androidx.appcompat.widget.Toolbar.f
    public final void onMenuItemClick(MenuItem menuItem) {
        switch (this.f17580a) {
            case 6:
                DeviceSpecifyFragment deviceSpecifyFragment = (DeviceSpecifyFragment) this.f17581b;
                mm.h<Object>[] hVarArr = DeviceSpecifyFragment.A0;
                gm.l.f(deviceSpecifyFragment, "this$0");
                if (menuItem.getItemId() == R.id.menu_qr_code_scanner) {
                    deviceSpecifyFragment.f10828z0.b(new Intent(deviceSpecifyFragment.V0(), DeviceQrCodeActivity.class));
                    return;
                } else if (menuItem.getItemId() == R.id.menu_skip) {
                    int i10 = MainActivity.E;
                    MainActivity.a.a(deviceSpecifyFragment.V0());
                    deviceSpecifyFragment.T0().finish();
                    return;
                } else {
                    return;
                }
            case 11:
                WhDetailFragment whDetailFragment = (WhDetailFragment) this.f17581b;
                mm.h<Object>[] hVarArr2 = WhDetailFragment.I0;
                gm.l.f(whDetailFragment, "this$0");
                if (menuItem.getItemId() == R.id.menu_settings) {
                    try {
                        tb.a.f(whDetailFragment).l(R.id.toWhHomePage, new Bundle(), ih.v.d().a());
                        return;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        return;
                    }
                }
                return;
            default:
                SportingActivity sportingActivity = (SportingActivity) this.f17581b;
                SportingActivity.a aVar = SportingActivity.X;
                gm.l.f(sportingActivity, "this$0");
                if (menuItem.getItemId() == R.id.menu_settings) {
                    int i11 = ((SportingViewMode) sportingActivity.M.getValue()).f12192d;
                    SportGoal sportGoal = (SportGoal) ((SportingViewMode) sportingActivity.M.getValue()).f12193e.getValue();
                    Intent intent = new Intent(sportingActivity, SportGoalActivity.class);
                    if (sportGoal == null) {
                        sportGoal = new SportGoal(i11, 0, 0.0f, 0, 14, null);
                    }
                    intent.putExtra("sport_goal", sportGoal);
                    sportingActivity.startActivity(intent);
                    return;
                }
                return;
        }
    }
}
