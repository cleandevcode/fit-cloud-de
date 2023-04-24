package s;

import a0.h0;
import android.content.ClipData;
import android.content.Intent;
import android.hardware.camera2.CaptureRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import androidx.camera.core.n;
import ba.f;
import cn.sharesdk.framework.InnerShareParams;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.e;
import com.topstep.fitcloud.pro.model.data.SimpleEcgRecord;
import com.topstep.fitcloud.pro.model.sport.push.SportPacket;
import com.topstep.fitcloud.pro.ui.device.bind.DeviceSpecifyFragment;
import com.topstep.fitcloud.pro.ui.device.contacts.ContactsFragment;
import com.topstep.fitcloud.pro.ui.device.dial.DfuViewModel;
import com.topstep.fitcloud.pro.ui.device.dial.push.custom.DialCustomFragment;
import com.topstep.fitcloud.pro.ui.device.settings.NotificationFragment;
import com.topstep.fitcloud.pro.ui.device.song.push.SongPushFragment;
import com.topstep.fitcloud.pro.ui.device.song.push.SongPushViewModel;
import com.topstep.fitcloud.pro.ui.friend.FriendEcgFragment;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloudpro.R;
import java.util.Collections;
import k1.c;
import p0.c;
import s.k0;
import si.f;
import yh.e;

/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements c.InterfaceC0425c, n.e, n1.e, f.c, androidx.activity.result.b, f.a, LoadingView.a, e.a {

    /* renamed from: a */
    public final /* synthetic */ int f25997a;

    /* renamed from: b */
    public final /* synthetic */ Object f25998b;

    public /* synthetic */ i0(int i10, Object obj) {
        this.f25997a = i10;
        this.f25998b = obj;
    }

    @Override // androidx.activity.result.b
    public final void a(Object obj) {
        Intent intent;
        boolean z10;
        switch (this.f25997a) {
            case 4:
                jc.u uVar = (jc.u) this.f25998b;
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                int i10 = jc.u.f17601x0;
                gm.l.f(uVar, "this$0");
                uVar.e1(new jc.o(uVar));
                return;
            case 5:
                lh.h.g1((lh.h) this.f25998b, (androidx.activity.result.a) obj);
                return;
            default:
                DeviceSpecifyFragment deviceSpecifyFragment = (DeviceSpecifyFragment) this.f25998b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                mm.h<Object>[] hVarArr = DeviceSpecifyFragment.A0;
                gm.l.f(deviceSpecifyFragment, "this$0");
                if (aVar2.f751a == -1 && (intent = aVar2.f752b) != null) {
                    String stringExtra = intent.getStringExtra(InnerShareParams.ADDRESS);
                    String stringExtra2 = intent.getStringExtra("name");
                    boolean z11 = false;
                    if (stringExtra != null && stringExtra.length() != 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        if (!((stringExtra2 == null || stringExtra2.length() == 0) ? true : true)) {
                            og.t tVar = deviceSpecifyFragment.f10827y0;
                            if (tVar != null) {
                                tVar.A(stringExtra, stringExtra2);
                                new uh.i().h1(deviceSpecifyFragment.h0(), null);
                                return;
                            }
                            gm.l.l("deviceManager");
                            throw null;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // si.f.a
    public final void b(boolean z10) {
        switch (this.f25997a) {
            case 7:
                ContactsFragment contactsFragment = (ContactsFragment) this.f25998b;
                if (z10) {
                    androidx.fragment.app.q qVar = contactsFragment.f10883w0;
                    Intent intent = new Intent("android.intent.action.PICK");
                    intent.setType("vnd.android.cursor.dir/phone_v2");
                    qVar.b(intent);
                    return;
                }
                return;
            case 10:
                NotificationFragment notificationFragment = (NotificationFragment) this.f25998b;
                gm.l.f(notificationFragment, "this$0");
                mm.h<Object>[] hVarArr = NotificationFragment.f11198v0;
                notificationFragment.k1();
                return;
            default:
                di.c cVar = (di.c) this.f25998b;
                gm.l.f(cVar, "this$0");
                if (z10) {
                    DfuViewModel dfuViewModel = (DfuViewModel) cVar.K0.getValue();
                    SportPacket sportPacket = cVar.H0;
                    if (sportPacket != null) {
                        Uri parse = Uri.parse(sportPacket.getBinUrl());
                        gm.l.e(parse, "parse(packet.binUrl)");
                        dfuViewModel.g(4, parse, cVar.I0);
                        return;
                    }
                    gm.l.l("packet");
                    throw null;
                }
                return;
        }
    }

    public final boolean c(n1.f fVar, int i10, Bundle bundle) {
        c.b c0314c;
        View view = (View) this.f25998b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                fVar.f21925a.a();
                InputContentInfo inputContentInfo = (InputContentInfo) fVar.f21925a.e();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        ClipData clipData = new ClipData(fVar.f21925a.d(), new ClipData.Item(fVar.f21925a.b()));
        if (i11 >= 31) {
            c0314c = new c.a(clipData, 2);
        } else {
            c0314c = new c.C0314c(clipData, 2);
        }
        c0314c.a(fVar.f21925a.c());
        c0314c.setExtras(bundle);
        if (k1.o0.l(view, c0314c.build()) != null) {
            return false;
        }
        return true;
    }

    @Override // com.topstep.fitcloud.pro.ui.widget.LoadingView.a
    public final void d() {
        boolean z10;
        switch (this.f25997a) {
            case 8:
                yh.e eVar = (yh.e) this.f25998b;
                e.a aVar = yh.e.A0;
                gm.l.f(eVar, "this$0");
                eVar.i1().i();
                return;
            case 11:
                SongPushFragment songPushFragment = (SongPushFragment) this.f25998b;
                mm.h<Object>[] hVarArr = SongPushFragment.f11348w0;
                gm.l.f(songPushFragment, "this$0");
                SongPushViewModel k12 = songPushFragment.k1();
                String str = (String) k12.f11390r.getValue();
                if (str != null && str.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    int intValue = ((Number) k12.f11391s.getValue()).intValue();
                    if (intValue != 1) {
                        if (intValue == 3) {
                            bi.z0.g(rm.l.h(k12), null, 0, new ci.s0(k12, null), 3);
                            return;
                        }
                        return;
                    }
                    bi.z0.g(rm.l.h(k12), null, 0, new ci.r0(k12, str, null), 3);
                    return;
                }
                return;
            default:
                FriendEcgFragment friendEcgFragment = (FriendEcgFragment) this.f25998b;
                mm.h<Object>[] hVarArr2 = FriendEcgFragment.f11513x0;
                gm.l.f(friendEcgFragment, "this$0");
                SimpleEcgRecord simpleEcgRecord = friendEcgFragment.i1().f11545l;
                if (simpleEcgRecord != null) {
                    friendEcgFragment.i1().j(simpleEcgRecord);
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.material.tabs.e.a
    public final void f(TabLayout.g gVar, int i10) {
        DialCustomFragment dialCustomFragment = (DialCustomFragment) this.f25998b;
        gm.l.f(dialCustomFragment, "this$0");
        zh.h hVar = dialCustomFragment.H0;
        if (hVar != null) {
            boolean z10 = hVar.f32456g;
            int i11 = R.string.ds_dial_position;
            if (z10) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalArgumentException();
                    }
                }
                i11 = R.string.ds_dial_background;
            } else {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalArgumentException();
                        }
                    } else {
                        i11 = R.string.ds_dial_style;
                    }
                }
                i11 = R.string.ds_dial_background;
            }
            gVar.a(dialCustomFragment.o0(i11));
            return;
        }
        gm.l.l("pageAdapter");
        throw null;
    }

    @Override // p0.c.InterfaceC0425c
    public final String g(c.a aVar) {
        k0.a aVar2 = (k0.a) this.f25998b;
        z1 z1Var = aVar2.f26019a.f26143h;
        if (!z1Var.f26266c) {
            aVar.b(new y.i("Camera is not active."));
        } else {
            h0.a aVar3 = new h0.a();
            aVar3.f91c = z1Var.f26267d;
            aVar3.f93e = true;
            a0.j1 B = a0.j1.B();
            B.E(r.a.A(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 1);
            aVar3.c(new r.a(a0.n1.A(B)));
            aVar3.b(new y1(aVar));
            z1Var.f26264a.q(Collections.singletonList(aVar3.d()));
        }
        aVar2.f26020b.f29499b = true;
        return "AePreCapture";
    }
}
