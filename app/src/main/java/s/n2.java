package s;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import cn.sharesdk.framework.InnerShareParams;
import com.topstep.fitcloud.pro.model.dial.DialPacket;
import com.topstep.fitcloud.pro.model.dial.DialPushParams;
import com.topstep.fitcloud.pro.ui.device.dial.DfuViewModel;
import com.topstep.fitcloud.pro.ui.device.dial.DialPushViewModel;
import com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomFragment;
import com.topstep.fitcloud.pro.ui.device.settings.CollectionCodeFragment;
import com.topstep.fitcloud.pro.ui.device.settings.CollectionCodeViewModel;
import com.topstep.fitcloud.pro.ui.device.settings.NotificationFragment;
import com.topstep.fitcloud.pro.ui.policy.PrivacyPolicyFragment;
import com.topstep.fitcloud.pro.ui.settings.assist.AssistFragment;
import com.topstep.fitcloud.pro.ui.sport.SportDetailActivity;
import com.topstep.fitcloud.pro.ui.sport.SportDetailViewModel;
import com.topstep.fitcloud.pro.ui.sport.SportGoalActivity;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloudpro.R;
import d1.g;
import f1.d;
import p0.c;
import si.f;

/* loaded from: classes.dex */
public final /* synthetic */ class n2 implements c.InterfaceC0425c, d.b, androidx.activity.result.b, f.a, LoadingView.a, Toolbar.f {

    /* renamed from: a */
    public final /* synthetic */ int f26103a;

    /* renamed from: b */
    public final /* synthetic */ Object f26104b;

    public /* synthetic */ n2(int i10, Object obj) {
        this.f26103a = i10;
        this.f26104b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    @Override // androidx.activity.result.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s.n2.a(java.lang.Object):void");
    }

    @Override // si.f.a
    public final void b(boolean z10) {
        byte b10;
        switch (this.f26103a) {
            case 7:
                yh.a aVar = (yh.a) this.f26104b;
                gm.l.f(aVar, "this$0");
                if (z10) {
                    wh.e eVar = aVar.I0;
                    if (eVar != null) {
                        b10 = eVar.f29842d.get(eVar.f29845g).getBinFlag();
                    } else {
                        b10 = 0;
                    }
                    DfuViewModel dfuViewModel = (DfuViewModel) aVar.K0.getValue();
                    DialPacket dialPacket = aVar.G0;
                    if (dialPacket != null) {
                        Uri parse = Uri.parse(dialPacket.getBinUrl());
                        gm.l.e(parse, "parse(dialPacket.binUrl)");
                        dfuViewModel.g(3, parse, b10);
                        return;
                    }
                    gm.l.l("dialPacket");
                    throw null;
                }
                return;
            case 10:
                NotificationFragment notificationFragment = (NotificationFragment) this.f26104b;
                gm.l.f(notificationFragment, "this$0");
                mm.h<Object>[] hVarArr = NotificationFragment.f11198v0;
                notificationFragment.k1();
                return;
            default:
                AssistFragment assistFragment = (AssistFragment) this.f26104b;
                gm.l.f(assistFragment, "this$0");
                if (z10) {
                    try {
                        tb.a.f(assistFragment).l(R.id.toWeather, new Bundle(), ih.v.d().a());
                        return;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        return;
                    }
                }
                return;
        }
    }

    @Override // com.topstep.fitcloud.pro.ui.widget.LoadingView.a
    public final void d() {
        switch (this.f26103a) {
            case 8:
                DialCustomFragment dialCustomFragment = (DialCustomFragment) this.f26104b;
                mm.h<Object>[] hVarArr = DialCustomFragment.M0;
                gm.l.f(dialCustomFragment, "this$0");
                zh.i u12 = dialCustomFragment.u1();
                Object obj = u12.f32458h.e().f22382a;
                if (!(obj instanceof y3.p)) {
                    if (obj instanceof y3.j) {
                        if (!(((y3.j) obj).f30961b instanceof lc.f)) {
                            DialPushViewModel dialPushViewModel = u12.f32458h;
                            dialPushViewModel.getClass();
                            dialPushViewModel.h(new wh.d(dialPushViewModel, null), 0L);
                            return;
                        }
                        return;
                    } else if (obj instanceof y3.c1) {
                        u12.h(new zh.k(u12, (DialPushParams) ((y3.c1) obj).f30937b, null), 1000L);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 9:
                CollectionCodeFragment collectionCodeFragment = (CollectionCodeFragment) this.f26104b;
                mm.h<Object>[] hVarArr2 = CollectionCodeFragment.f11097w0;
                gm.l.f(collectionCodeFragment, "this$0");
                CollectionCodeViewModel collectionCodeViewModel = (CollectionCodeViewModel) collectionCodeFragment.f11099u0.getValue();
                collectionCodeViewModel.getClass();
                v6.b.f(collectionCodeViewModel, new bi.l(collectionCodeViewModel, null), null, bi.m.f4329b, 3);
                return;
            default:
                SportDetailActivity sportDetailActivity = (SportDetailActivity) this.f26104b;
                SportDetailActivity.a aVar = SportDetailActivity.B;
                gm.l.f(sportDetailActivity, "this$0");
                SportDetailViewModel N = sportDetailActivity.N();
                v6.b.f(N, new mi.q(N, N.f12132k, null), null, mi.r.f21861b, 3);
                return;
        }
    }

    @Override // p0.c.InterfaceC0425c
    public final String g(c.a aVar) {
        switch (this.f26103a) {
            case 1:
                ((j0.f) this.f26104b).f17247d = aVar;
                return "SurfaceOutputImpl close future complete";
            default:
                ((androidx.camera.view.f) this.f26104b).f1907k.set(aVar);
                return "textureViewImpl_waitForNextFrame";
        }
    }

    @Override // f1.d.b
    public final void onCancel() {
        g.d dVar = (g.d) this.f26104b;
        synchronized (dVar) {
            if (!dVar.f12607e) {
                dVar.f12607e = true;
                dVar.f12606d = null;
                dVar.f12603a.removeUpdates(dVar);
                m mVar = dVar.f12608f;
                if (mVar != null) {
                    dVar.f12605c.removeCallbacks(mVar);
                    dVar.f12608f = null;
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar.f
    public final void onMenuItemClick(MenuItem menuItem) {
        switch (this.f26103a) {
            case 11:
                PrivacyPolicyFragment privacyPolicyFragment = (PrivacyPolicyFragment) this.f26104b;
                mm.h<Object>[] hVarArr = PrivacyPolicyFragment.f11725w0;
                gm.l.f(privacyPolicyFragment, "this$0");
                int itemId = menuItem.getItemId();
                if (itemId != R.id.menu_cancel) {
                    if (itemId == R.id.menu_open_browser) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        String str = privacyPolicyFragment.f11729u0;
                        if (str != null) {
                            intent.setData(Uri.parse(str));
                            privacyPolicyFragment.b1(intent);
                            return;
                        }
                        gm.l.l(InnerShareParams.URL);
                        throw null;
                    }
                    return;
                }
                rm.l.g(privacyPolicyFragment).e(new hi.h(privacyPolicyFragment, null));
                return;
            default:
                SportGoalActivity sportGoalActivity = (SportGoalActivity) this.f26104b;
                int i10 = SportGoalActivity.D;
                gm.l.f(sportGoalActivity, "this$0");
                if (menuItem.getItemId() == R.id.menu_done) {
                    bi.z0.g(rm.l.g(sportGoalActivity), null, 0, new SportGoalActivity.b(null), 3);
                    return;
                }
                return;
        }
    }
}
