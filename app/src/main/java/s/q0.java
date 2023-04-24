package s;

import android.net.Uri;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.h;
import androidx.camera.view.PreviewView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.github.kilnn.refreshloadlayout.RefreshLoadLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.e;
import com.topstep.fitcloud.pro.model.game.push.GameSkin;
import com.topstep.fitcloud.pro.ui.device.bind.DeviceSpecifyFragment;
import com.topstep.fitcloud.pro.ui.device.dial.DfuViewModel;
import com.topstep.fitcloud.pro.ui.device.dial.push.DialPacketParentFragment;
import com.topstep.fitcloud.pro.ui.device.settings.BusinessCardFragment;
import com.topstep.fitcloud.pro.ui.device.settings.BusinessCardViewModel;
import com.topstep.fitcloud.pro.ui.friend.FriendListFragment;
import com.topstep.fitcloud.pro.ui.sport.SportHistoryFragment;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloudpro.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l2.h3;
import p0.c;
import s.a1;
import s.k0;
import si.f;
import x5.h;

/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements c.InterfaceC0425c, a1.a, o.a, h.j.b, h.a, RefreshLoadLayout.e, androidx.activity.result.b, LoadingView.a, e.a, f.a, Toolbar.f, SwipeRefreshLayout.f {

    /* renamed from: a */
    public final /* synthetic */ int f26133a;

    /* renamed from: b */
    public final /* synthetic */ Object f26134b;

    public /* synthetic */ q0(int i10, Object obj) {
        this.f26133a = i10;
        this.f26134b = obj;
    }

    @Override // androidx.activity.result.b
    public final void a(Object obj) {
        lh.h.i1((lh.h) this.f26134b, (androidx.activity.result.a) obj);
    }

    @Override // o.a
    public final Object apply(Object obj) {
        boolean z10;
        switch (this.f26133a) {
            case 2:
                g2 g2Var = (g2) this.f26134b;
                Void r11 = (Void) obj;
                n1 n1Var = g2Var.f25964d;
                if (g2Var.f25968h == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                StringBuilder a10 = android.support.v4.media.d.a("Invalid state state:");
                a10.append(g3.j.b(g2Var.f25968h));
                h1.e(a10.toString(), z10);
                List<a0.m0> b10 = g2Var.f25967g.b();
                ArrayList arrayList = new ArrayList();
                for (a0.m0 m0Var : b10) {
                    h1.e("Surface must be SessionProcessorSurface", m0Var instanceof a0.w1);
                    arrayList.add((a0.w1) m0Var);
                }
                new x0(n1Var, arrayList);
                g2Var.getClass();
                g2Var.f25961a.g();
                g2Var.f25968h = 3;
                a0.u1 u1Var = g2Var.f25966f;
                if (u1Var != null) {
                    g2Var.b(u1Var);
                }
                if (g2Var.f25969i != null) {
                    List<a0.h0> asList = Arrays.asList(g2Var.f25969i);
                    g2Var.f25969i = null;
                    g2Var.e(asList);
                }
                return null;
            default:
                Void r112 = (Void) obj;
                ((androidx.camera.view.a) this.f26134b).a(PreviewView.g.STREAMING);
                return null;
        }
    }

    @Override // si.f.a
    public final void b(boolean z10) {
        byte b10;
        ai.b bVar = (ai.b) this.f26134b;
        gm.l.f(bVar, "this$0");
        if (z10) {
            ai.m mVar = bVar.D0;
            if (mVar != null) {
                b10 = mVar.f574d.get(mVar.f576f).getBinFlag();
            } else {
                b10 = 0;
            }
            DfuViewModel dfuViewModel = (DfuViewModel) bVar.F0.getValue();
            GameSkin gameSkin = bVar.C0;
            if (gameSkin != null) {
                Uri parse = Uri.parse(gameSkin.getBinUrl());
                gm.l.e(parse, "parse(skin.binUrl)");
                dfuViewModel.g(5, parse, b10);
                return;
            }
            gm.l.l("skin");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x016e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // x5.h.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.io.File r19) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s.q0.c(java.io.File):void");
    }

    @Override // com.topstep.fitcloud.pro.ui.widget.LoadingView.a
    public final void d() {
        switch (this.f26133a) {
            case 10:
                ph.b bVar = (ph.b) this.f26134b;
                mm.h<Object>[] hVarArr = ph.b.f24086s0;
                gm.l.f(bVar, "this$0");
                ph.c m12 = bVar.m1();
                m12.getClass();
                v6.b.f(m12, new ph.h(m12, null), null, new ph.i(m12), 3);
                return;
            case 11:
                DeviceSpecifyFragment deviceSpecifyFragment = (DeviceSpecifyFragment) this.f26134b;
                mm.h<Object>[] hVarArr2 = DeviceSpecifyFragment.A0;
                gm.l.f(deviceSpecifyFragment, "this$0");
                deviceSpecifyFragment.i1().j(false);
                return;
            default:
                BusinessCardFragment businessCardFragment = (BusinessCardFragment) this.f26134b;
                mm.h<Object>[] hVarArr3 = BusinessCardFragment.f11079w0;
                gm.l.f(businessCardFragment, "this$0");
                BusinessCardViewModel businessCardViewModel = (BusinessCardViewModel) businessCardFragment.f11081u0.getValue();
                businessCardViewModel.getClass();
                v6.b.f(businessCardViewModel, new bi.f(businessCardViewModel, null), null, bi.g.f4298b, 3);
                return;
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void e() {
        SportHistoryFragment sportHistoryFragment = (SportHistoryFragment) this.f26134b;
        mm.h<Object>[] hVarArr = SportHistoryFragment.f12159x0;
        gm.l.f(sportHistoryFragment, "this$0");
        mi.w wVar = sportHistoryFragment.f12162v0;
        if (wVar != null) {
            h3 h3Var = wVar.f18885e.f18892f.f19022d;
            if (h3Var != null) {
                h3Var.c();
                return;
            }
            return;
        }
        gm.l.l("pagingAdapter");
        throw null;
    }

    @Override // com.google.android.material.tabs.e.a
    public final void f(TabLayout.g gVar, int i10) {
        DialPacketParentFragment dialPacketParentFragment = (DialPacketParentFragment) this.f26134b;
        mm.h<Object>[] hVarArr = DialPacketParentFragment.f10988n0;
        gm.l.f(dialPacketParentFragment, "this$0");
        gVar.a(dialPacketParentFragment.o0(i10 == 0 ? R.string.ds_dial_center : R.string.ds_dial_mine));
    }

    @Override // p0.c.InterfaceC0425c
    public final String g(c.a aVar) {
        switch (this.f26133a) {
            case 0:
                ((k0.e) this.f26134b).f26036a = aVar;
                return "waitFor3AResult";
            case 3:
                x.c cVar = (x.c) this.f26134b;
                cVar.f30074d.execute(new q(cVar, aVar, 2));
                return "clearCaptureRequestOptions";
            default:
                ((z.f) this.f26134b).f31828a = aVar;
                return "CaptureCompleteFuture";
        }
    }

    @Override // androidx.appcompat.widget.Toolbar.f
    public final void onMenuItemClick(MenuItem menuItem) {
        i2.m f10;
        i2.a aVar;
        FriendListFragment friendListFragment = (FriendListFragment) this.f26134b;
        mm.h<Object>[] hVarArr = FriendListFragment.f11575z0;
        gm.l.f(friendListFragment, "this$0");
        if (menuItem.getItemId() == R.id.menu_add_friend) {
            f10 = tb.a.f(friendListFragment);
            aVar = new i2.a(R.id.toPreSearch);
        } else if (menuItem.getItemId() == R.id.menu_friend_msg) {
            f10 = tb.a.f(friendListFragment);
            aVar = new i2.a(R.id.toMsg);
        } else {
            return;
        }
        ih.v.l(f10, aVar);
    }
}
