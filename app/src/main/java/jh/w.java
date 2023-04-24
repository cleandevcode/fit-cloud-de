package jh;

import android.view.View;
import android.widget.ImageView;
import bi.z0;
import com.huawei.hms.hmsscankit.RemoteView;
import com.topstep.fitcloud.pro.databinding.ActivityDeviceQrCodeBinding;
import com.topstep.fitcloud.pro.ui.auth.SignInFragment;
import com.topstep.fitcloud.pro.ui.device.alarm.AlarmViewModel;
import com.topstep.fitcloud.pro.ui.device.bind.DeviceBindFragment;
import com.topstep.fitcloud.pro.ui.device.bind.DeviceQrCodeActivity;
import com.topstep.fitcloud.pro.ui.device.bind.ScannerHelper;
import com.topstep.fitcloud.pro.ui.device.contacts.ContactsFragment;
import com.topstep.fitcloud.pro.ui.policy.PrivacyPolicyFragment;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloudpro.R;
import pm.z1;

/* loaded from: classes2.dex */
public final /* synthetic */ class w implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f17829a;

    /* renamed from: b */
    public final /* synthetic */ Object f17830b;

    public /* synthetic */ w(int i10, Object obj) {
        this.f17829a = i10;
        this.f17830b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LoadingView.a aVar;
        ImageView imageView;
        int i10;
        boolean z10 = false;
        switch (this.f17829a) {
            case 0:
                SignInFragment signInFragment = (SignInFragment) this.f17830b;
                mm.h<Object>[] hVarArr = SignInFragment.f10353s0;
                gm.l.f(signInFragment, "this$0");
                signInFragment.T0().finish();
                return;
            case 1:
                th.z zVar = (th.z) this.f17830b;
                gm.l.f(zVar, "this$0");
                int i11 = th.z.C0;
                AlarmViewModel.a aVar2 = zVar.i1().f10787j;
                z1 z1Var = aVar2.f24879d;
                if (z1Var != null) {
                    z1Var.h(null);
                }
                aVar2.f24879d = z0.g(aVar2.f24876a, null, 0, new qi.r(aVar2, 0L, null), 3);
                return;
            case 2:
                DeviceBindFragment deviceBindFragment = (DeviceBindFragment) this.f17830b;
                mm.h<Object>[] hVarArr2 = DeviceBindFragment.E0;
                gm.l.f(deviceBindFragment, "this$0");
                ScannerHelper scannerHelper = (ScannerHelper) deviceBindFragment.B0.getValue();
                al.j jVar = scannerHelper.f10858e;
                if (jVar != null && !jVar.d()) {
                    z10 = true;
                }
                if (!z10) {
                    scannerHelper.b();
                    return;
                }
                al.j jVar2 = scannerHelper.f10858e;
                if (jVar2 != null) {
                    xk.b.a(jVar2);
                    return;
                }
                return;
            case 3:
                uh.i iVar = (uh.i) this.f17830b;
                gm.l.f(iVar, "this$0");
                iVar.j1().o();
                iVar.c1(false, false);
                return;
            case 4:
                DeviceQrCodeActivity deviceQrCodeActivity = (DeviceQrCodeActivity) this.f17830b;
                int i12 = DeviceQrCodeActivity.A;
                gm.l.f(deviceQrCodeActivity, "this$0");
                RemoteView remoteView = deviceQrCodeActivity.f10820y;
                if (remoteView != null) {
                    remoteView.switchLight();
                    RemoteView remoteView2 = deviceQrCodeActivity.f10820y;
                    if (remoteView2 != null) {
                        boolean lightStatus = remoteView2.getLightStatus();
                        ActivityDeviceQrCodeBinding activityDeviceQrCodeBinding = deviceQrCodeActivity.f10819x;
                        if (lightStatus) {
                            if (activityDeviceQrCodeBinding != null) {
                                imageView = activityDeviceQrCodeBinding.btnFlush;
                                i10 = R.drawable.flashlight_off;
                            } else {
                                gm.l.l("viewBind");
                                throw null;
                            }
                        } else if (activityDeviceQrCodeBinding != null) {
                            imageView = activityDeviceQrCodeBinding.btnFlush;
                            i10 = R.drawable.flashlight_on;
                        } else {
                            gm.l.l("viewBind");
                            throw null;
                        }
                        imageView.setImageResource(i10);
                        return;
                    }
                    gm.l.l("remoteView");
                    throw null;
                }
                gm.l.l("remoteView");
                throw null;
            case 5:
                ContactsFragment contactsFragment = (ContactsFragment) this.f17830b;
                mm.h<Object>[] hVarArr3 = ContactsFragment.f10879y0;
                gm.l.f(contactsFragment, "this$0");
                qi.h.j(contactsFragment).b(new ContactsFragment.d(null));
                return;
            case 6:
                PrivacyPolicyFragment privacyPolicyFragment = (PrivacyPolicyFragment) this.f17830b;
                mm.h<Object>[] hVarArr4 = PrivacyPolicyFragment.f11725w0;
                gm.l.f(privacyPolicyFragment, "this$0");
                rm.l.g(privacyPolicyFragment).e(new hi.h(privacyPolicyFragment, null));
                return;
            default:
                LoadingView loadingView = (LoadingView) this.f17830b;
                int i13 = LoadingView.f12363g;
                gm.l.f(loadingView, "this$0");
                if (loadingView.f12367d == 2 && (aVar = loadingView.f12368e) != null) {
                    aVar.d();
                    return;
                }
                return;
        }
    }
}
