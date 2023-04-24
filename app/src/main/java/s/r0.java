package s;

import ai.f;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Surface;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.h;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b9.a;
import com.huawei.hms.hmsscankit.OnLightVisibleCallBack;
import com.topstep.fitcloud.pro.databinding.ActivityDeviceQrCodeBinding;
import com.topstep.fitcloud.pro.ui.MineFragment;
import com.topstep.fitcloud.pro.ui.device.bind.DeviceQrCodeActivity;
import com.topstep.fitcloud.pro.ui.device.bind.DeviceSpecifyFragment;
import com.topstep.fitcloud.pro.ui.device.game.push.GamePushViewModel;
import com.topstep.fitcloud.pro.ui.device.settings.NotificationFragment;
import com.topstep.fitcloud.pro.ui.friend.FriendListFragment;
import com.topstep.fitcloud.pro.ui.friend.FriendViewModel;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloudpro.R;
import n6.p;
import p0.c;
import ph.c;
import s.k0;
import si.f;

/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements c.InterfaceC0425c, h.j.c, o.a, p.c, a.InterfaceC0054a, f.a, LoadingView.a, OnLightVisibleCallBack, SwipeRefreshLayout.f, Toolbar.f {

    /* renamed from: a */
    public final /* synthetic */ int f26164a;

    /* renamed from: b */
    public final /* synthetic */ Object f26165b;

    public /* synthetic */ r0(int i10, Object obj) {
        this.f26164a = i10;
        this.f26165b = obj;
    }

    public final void a(h.i iVar) {
        e0.m mVar = (e0.m) this.f26165b;
        h.C0023h c0023h = androidx.camera.core.h.H;
        if (Build.VERSION.SDK_INT >= 26) {
            int i10 = iVar.f1681b;
            synchronized (mVar.f13312b) {
                mVar.f13313c = i10;
            }
            int i11 = iVar.f1680a;
            synchronized (mVar.f13312b) {
                mVar.f13314d = i11;
            }
        }
    }

    @Override // o.a
    public final Object apply(Object obj) {
        Surface surface = (Surface) obj;
        return ((y.b1) this.f26165b).f30662p;
    }

    @Override // si.f.a
    public final void b(boolean z10) {
        switch (this.f26164a) {
            case 9:
                MineFragment mineFragment = (MineFragment) this.f26165b;
                gm.l.f(mineFragment, "this$0");
                if (z10) {
                    try {
                        tb.a.f(mineFragment).l(R.id.toWhHomePage, new Bundle(), ih.v.d().a());
                        return;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        return;
                    }
                }
                return;
            default:
                lh.h.h1((lh.h) this.f26165b, z10);
                return;
        }
    }

    @Override // com.topstep.fitcloud.pro.ui.widget.LoadingView.a
    public final void d() {
        switch (this.f26164a) {
            case 11:
                ph.b bVar = (ph.b) this.f26165b;
                mm.h<Object>[] hVarArr = ph.b.f24086s0;
                gm.l.f(bVar, "this$0");
                ph.c m12 = bVar.m1();
                c.b bVar2 = (c.b) m12.f24118m.getValue();
                if (bVar2 != null) {
                    T t10 = bVar2.f24127b;
                    pm.z1 z1Var = m12.f24120o;
                    if (z1Var != null) {
                        z1Var.h(null);
                    }
                    m12.f24120o = v6.b.f(m12, new ph.f(m12, t10, null), null, ph.g.f24147b, 3);
                    return;
                }
                return;
            case 14:
                ai.f fVar = (ai.f) this.f26165b;
                f.a aVar = ai.f.f542s0;
                gm.l.f(fVar, "this$0");
                GamePushViewModel gamePushViewModel = (GamePushViewModel) fVar.f546q0.getValue();
                gamePushViewModel.getClass();
                gamePushViewModel.h(new ai.j(gamePushViewModel, null), 0L);
                return;
            default:
                FriendListFragment friendListFragment = (FriendListFragment) this.f26165b;
                mm.h<Object>[] hVarArr2 = FriendListFragment.f11575z0;
                gm.l.f(friendListFragment, "this$0");
                ((FriendViewModel) friendListFragment.f11577u0.getValue()).j();
                return;
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void e() {
        DeviceSpecifyFragment deviceSpecifyFragment = (DeviceSpecifyFragment) this.f26165b;
        mm.h<Object>[] hVarArr = DeviceSpecifyFragment.A0;
        gm.l.f(deviceSpecifyFragment, "this$0");
        deviceSpecifyFragment.i1().j(true);
    }

    @Override // p0.c.InterfaceC0425c
    public final String g(c.a aVar) {
        switch (this.f26164a) {
            case 0:
                ((k0.f) this.f26165b).f26042a.f26145j.a(aVar, true);
                return "TorchOn";
            case 1:
            default:
                a0.m0 m0Var = (a0.m0) this.f26165b;
                synchronized (m0Var.f126a) {
                    m0Var.f129d = aVar;
                }
                return "DeferrableSurface-termination(" + m0Var + ")";
            case 2:
                x.c cVar = (x.c) this.f26165b;
                cVar.f30074d.execute(new t.n(cVar, aVar, 2));
                return "addCaptureRequestOptions";
            case 3:
                y.y yVar = (y.y) this.f26165b;
                synchronized (yVar.f30798h) {
                    yVar.f30801k = aVar;
                }
                return "CaptureProcessorPipeline-close";
        }
    }

    @Override // androidx.appcompat.widget.Toolbar.f
    public final void onMenuItemClick(MenuItem menuItem) {
        NotificationFragment notificationFragment = (NotificationFragment) this.f26165b;
        mm.h<Object>[] hVarArr = NotificationFragment.f11198v0;
        gm.l.f(notificationFragment, "this$0");
        if (menuItem.getItemId() == R.id.menu_help) {
            try {
                tb.a.f(notificationFragment).l(R.id.toHelp, new Bundle(), ih.v.d().a());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // com.huawei.hms.hmsscankit.OnLightVisibleCallBack
    public final void onVisibleChanged(boolean z10) {
        DeviceQrCodeActivity deviceQrCodeActivity = (DeviceQrCodeActivity) this.f26165b;
        int i10 = DeviceQrCodeActivity.A;
        gm.l.f(deviceQrCodeActivity, "this$0");
        if (z10) {
            ActivityDeviceQrCodeBinding activityDeviceQrCodeBinding = deviceQrCodeActivity.f10819x;
            if (activityDeviceQrCodeBinding != null) {
                activityDeviceQrCodeBinding.btnFlush.setVisibility(0);
            } else {
                gm.l.l("viewBind");
                throw null;
            }
        }
    }
}
