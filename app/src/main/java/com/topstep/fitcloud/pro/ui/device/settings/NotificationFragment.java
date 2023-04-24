package com.topstep.fitcloud.pro.ui.device.settings;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import bi.b0;
import bi.k0;
import bi.m0;
import bi.z0;
import com.topstep.fitcloud.pro.databinding.FragmentNotificationBinding;
import com.topstep.fitcloudpro.R;
import fm.l;
import fm.p;
import gm.m;
import gm.t;
import gm.z;
import ih.v;
import kotlin.Metadata;
import mf.a0;
import mm.h;
import no.nordicsemi.android.dfu.DfuBaseService;
import og.j1;
import pm.e0;
import qi.k;
import s.i0;
import s.n2;
import s.r0;
import si.f;
import xl.d;
import zl.e;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class NotificationFragment extends b0 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: v0 */
    public static final /* synthetic */ h<Object>[] f11198v0;

    /* renamed from: r0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11199r0;

    /* renamed from: s0 */
    public j1 f11200s0;

    /* renamed from: t0 */
    public final int f11201t0;

    /* renamed from: u0 */
    public final a f11202u0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            NotificationFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            View view2 = view;
            gm.l.f(view2, "view");
            NotificationFragment notificationFragment = NotificationFragment.this;
            h<Object>[] hVarArr = NotificationFragment.f11198v0;
            if (gm.l.a(view2, notificationFragment.i1().imgTelephonySettings)) {
                NotificationFragment notificationFragment2 = NotificationFragment.this;
                f.i(notificationFragment2, new n2(10, notificationFragment2), 2);
            } else if (gm.l.a(view2, NotificationFragment.this.i1().imgSmsSettings)) {
                NotificationFragment notificationFragment3 = NotificationFragment.this;
                f.j(notificationFragment3, new i0(10, notificationFragment3), 2);
            } else if (gm.l.a(view2, NotificationFragment.this.i1().itemOther)) {
                if (!k.a(NotificationFragment.this.V0())) {
                    new bi.h().h1(NotificationFragment.this.h0(), null);
                } else {
                    try {
                        tb.a.f(NotificationFragment.this).l(R.id.toOther, new Bundle(), v.d().a());
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            }
            return tl.l.f28297a;
        }
    }

    @e(c = "com.topstep.fitcloud.pro.ui.device.settings.NotificationFragment$onCheckedChanged$1", f = "NotificationFragment.kt", l = {139}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<e0, d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f11204e;

        /* renamed from: g */
        public final /* synthetic */ boolean f11206g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, d<? super b> dVar) {
            super(2, dVar);
            NotificationFragment.this = r1;
            this.f11206g = z10;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final d<tl.l> p(Object obj, d<?> dVar) {
            return new b(this.f11206g, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f11204e;
            if (i10 == 0) {
                a0.k(obj);
                j1 h12 = NotificationFragment.this.h1();
                boolean z10 = this.f11206g;
                this.f11204e = 1;
                if (h12.a(z10, this) == aVar) {
                    return aVar;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                a0.k(obj);
            }
            return tl.l.f28297a;
        }
    }

    @e(c = "com.topstep.fitcloud.pro.ui.device.settings.NotificationFragment$onCheckedChanged$2", f = "NotificationFragment.kt", l = {165}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends i implements p<e0, d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f11207e;

        /* renamed from: g */
        public final /* synthetic */ int f11209g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, d<? super c> dVar) {
            super(2, dVar);
            NotificationFragment.this = r1;
            this.f11209g = i10;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, d<? super tl.l> dVar) {
            return ((c) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final d<tl.l> p(Object obj, d<?> dVar) {
            return new c(this.f11209g, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f11207e;
            if (i10 == 0) {
                a0.k(obj);
                j1 h12 = NotificationFragment.this.h1();
                int i11 = this.f11209g;
                this.f11207e = 1;
                if (h12.c(i11, this) == aVar) {
                    return aVar;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                a0.k(obj);
            }
            return tl.l.f28297a;
        }
    }

    static {
        t tVar = new t(NotificationFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentNotificationBinding;", 0);
        gm.b0.f15488a.getClass();
        f11198v0 = new h[]{tVar};
    }

    public NotificationFragment() {
        super(R.layout.fragment_notification);
        this.f11199r0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentNotificationBinding.class, this);
        this.f11201t0 = 25279;
        this.f11202u0 = new a();
    }

    @Override // androidx.fragment.app.r
    public final void K0() {
        this.E = true;
        j1(h1().d());
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        i1().toolbar.setOnMenuItemClickListener(new r0(15, this));
        i1().itemScreenOff.getSwitchView().setChecked(h1().b());
        i1().itemScreenOff.getSwitchView().setOnCheckedChangeListener(this);
        i1().itemAll.getSwitchView().setOnCheckedChangeListener(this);
        i1().switchTelephony.setOnCheckedChangeListener(this);
        p.b.g(i1().imgTelephonySettings, this.f11202u0);
        i1().switchSms.setOnCheckedChangeListener(this);
        p.b.g(i1().imgSmsSettings, this.f11202u0);
        i1().itemEmail.getSwitchView().setOnCheckedChangeListener(this);
        i1().layoutApp.itemQq.getSwitchView().setOnCheckedChangeListener(this);
        i1().layoutApp.itemWechat.getSwitchView().setOnCheckedChangeListener(this);
        i1().layoutApp.itemFacebook.getSwitchView().setOnCheckedChangeListener(this);
        i1().layoutApp.itemTwitter.getSwitchView().setOnCheckedChangeListener(this);
        i1().layoutApp.itemWhatsapp.getSwitchView().setOnCheckedChangeListener(this);
        i1().layoutApp.itemSkype.getSwitchView().setOnCheckedChangeListener(this);
        i1().layoutApp.itemInstagram.getSwitchView().setOnCheckedChangeListener(this);
        p.b.g(i1().itemOther, this.f11202u0);
    }

    public final void f1(int i10, boolean z10) {
        int i11;
        int i12;
        z zVar = new z();
        int d10 = h1().d();
        zVar.f15508a = d10;
        int i13 = 1 << i10;
        if (z10) {
            i11 = (~i13) & d10;
            i12 = i13 & i13;
        } else {
            i11 = (~i13) & d10;
            i12 = i13 & 0;
        }
        int i14 = i12 | i11;
        zVar.f15508a = i14;
        j1(i14);
        z0.g(rm.l.g(this), null, 0, new k0(this, zVar, null), 3);
    }

    public final boolean g1(CompoundButton compoundButton) {
        if (k.a(V0())) {
            return true;
        }
        new bi.h().h1(h0(), null);
        compoundButton.setChecked(false);
        return false;
    }

    public final j1 h1() {
        j1 j1Var = this.f11200s0;
        if (j1Var != null) {
            return j1Var;
        }
        gm.l.l("notificationRepository");
        throw null;
    }

    public final FragmentNotificationBinding i1() {
        return (FragmentNotificationBinding) this.f11199r0.a(this, f11198v0[0]);
    }

    public final void j1(int i10) {
        boolean z10 = true;
        i1().switchTelephony.setChecked(m0.w(i10, 1) && f.f27071a.e(V0()));
        i1().switchSms.setChecked(m0.w(i10, 2) && f.f27071a.d(V0()));
        k1();
        boolean a10 = k.a(V0());
        i1().itemEmail.getSwitchView().setChecked(a10 && m0.w(i10, DfuBaseService.ERROR_CONNECTION_MASK));
        i1().layoutApp.itemQq.getSwitchView().setChecked(a10 && m0.w(i10, 4));
        i1().layoutApp.itemWechat.getSwitchView().setChecked(a10 && m0.w(i10, 8));
        i1().layoutApp.itemFacebook.getSwitchView().setChecked(a10 && m0.w(i10, 16));
        i1().layoutApp.itemTwitter.getSwitchView().setChecked(a10 && m0.w(i10, 32));
        i1().layoutApp.itemWhatsapp.getSwitchView().setChecked(a10 && m0.w(i10, DfuBaseService.ERROR_REMOTE_TYPE_SECURE));
        i1().layoutApp.itemSkype.getSwitchView().setChecked(a10 && m0.w(i10, DfuBaseService.ERROR_REMOTE_MASK));
        i1().layoutApp.itemInstagram.getSwitchView().setChecked(a10 && m0.w(i10, 128));
        i1().itemAll.getSwitchView().setChecked((i1().switchTelephony.isChecked() && i1().switchSms.isChecked() && a10 && i10 >= this.f11201t0) ? false : false);
    }

    public final void k1() {
        boolean z10;
        int i10;
        ImageView imageView = i1().imgTelephonySettings;
        gm.l.e(imageView, "viewBind.imgTelephonySettings");
        boolean z11 = true;
        int i11 = 0;
        if (i1().switchTelephony.isChecked() && !f.c(f.f27071a, V0(), f.a())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        ImageView imageView2 = i1().imgSmsSettings;
        gm.l.e(imageView2, "viewBind.imgSmsSettings");
        if (!((!i1().switchSms.isChecked() || f.c(f.f27071a, V0(), h7.a.f("android.permission.RECEIVE_SMS", "android.permission.READ_SMS", "android.permission.READ_CONTACTS"))) ? false : false)) {
            i11 = 8;
        }
        imageView2.setVisibility(i11);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        int i10;
        int i11;
        gm.l.f(compoundButton, "buttonView");
        if (compoundButton.isPressed()) {
            if (gm.l.a(compoundButton, i1().itemScreenOff.getSwitchView())) {
                z0.g(rm.l.g(this), null, 0, new b(z10, null), 3);
            } else if (gm.l.a(compoundButton, i1().itemAll.getSwitchView())) {
                if (z10) {
                    f fVar = f.f27071a;
                    if (!f.c(fVar, V0(), h7.a.q("android.permission.READ_CALL_LOG", "android.permission.READ_PHONE_STATE"))) {
                        compoundButton.setChecked(false);
                        f.j(this, null, 6);
                        return;
                    } else if (!fVar.d(V0())) {
                        compoundButton.setChecked(false);
                        f.i(this, null, 6);
                        return;
                    } else if (!k.a(V0())) {
                        compoundButton.setChecked(false);
                        new bi.h().h1(h0(), null);
                        return;
                    } else {
                        i11 = this.f11201t0;
                    }
                } else {
                    i11 = 0;
                }
                j1(i11);
                z0.g(rm.l.g(this), null, 0, new c(i11, null), 3);
            } else if (gm.l.a(compoundButton, i1().switchTelephony)) {
                if (z10) {
                    f.j(this, new s5.b(this, compoundButton, 2), 2);
                } else {
                    f1(0, false);
                }
            } else if (gm.l.a(compoundButton, i1().switchSms)) {
                if (z10) {
                    f.i(this, new x.d(this, compoundButton, 3), 2);
                } else {
                    f1(1, false);
                }
            } else {
                if (gm.l.a(compoundButton, i1().itemEmail.getSwitchView())) {
                    if (g1(compoundButton)) {
                        i10 = 14;
                    } else {
                        return;
                    }
                } else if (gm.l.a(compoundButton, i1().layoutApp.itemQq.getSwitchView())) {
                    if (g1(compoundButton)) {
                        f1(2, z10);
                        return;
                    }
                    return;
                } else if (gm.l.a(compoundButton, i1().layoutApp.itemWechat.getSwitchView())) {
                    if (g1(compoundButton)) {
                        f1(3, z10);
                        return;
                    }
                    return;
                } else if (gm.l.a(compoundButton, i1().layoutApp.itemFacebook.getSwitchView())) {
                    if (g1(compoundButton)) {
                        i10 = 4;
                    } else {
                        return;
                    }
                } else if (gm.l.a(compoundButton, i1().layoutApp.itemTwitter.getSwitchView())) {
                    if (g1(compoundButton)) {
                        i10 = 5;
                    } else {
                        return;
                    }
                } else if (gm.l.a(compoundButton, i1().layoutApp.itemWhatsapp.getSwitchView())) {
                    if (g1(compoundButton)) {
                        i10 = 9;
                    } else {
                        return;
                    }
                } else if (gm.l.a(compoundButton, i1().layoutApp.itemSkype.getSwitchView())) {
                    if (g1(compoundButton)) {
                        i10 = 13;
                    } else {
                        return;
                    }
                } else if (gm.l.a(compoundButton, i1().layoutApp.itemInstagram.getSwitchView()) && g1(compoundButton)) {
                    i10 = 7;
                } else {
                    return;
                }
                f1(i10, z10);
            }
        }
    }
}
