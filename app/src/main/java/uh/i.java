package uh;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bi.m0;
import bi.z0;
import com.topstep.fitcloud.pro.databinding.DialogDeviceConnectBinding;
import com.topstep.fitcloud.pro.ui.widget.ProgressDotView;
import com.topstep.fitcloudpro.R;
import d6.q0;
import java.util.ArrayList;
import kotlin.Metadata;
import p000do.a;
import pm.g1;
import pm.z1;
import s.h1;
import s.m1;
import sm.f1;
import y3.e1;
import y3.g0;
import y3.k0;

@Metadata
/* loaded from: classes2.dex */
public final class i extends t implements y3.g0 {
    public static final /* synthetic */ mm.h<Object>[] O0;
    public final tl.d G0 = qi.p.d(this);
    public final tl.d H0 = qi.p.c(this);
    public og.t I0;
    public DialogDeviceConnectBinding J0;
    public final tl.d K0;
    public g1 L0;
    public ColorStateList M0;
    public int N0;

    /* loaded from: classes2.dex */
    public interface a {
        void L();

        void d();
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.bind.DeviceConnectDialogFragment$onCreate$1", f = "DeviceConnectDialogFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(2, dVar);
            i.this = r1;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new b(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            si.f fVar = si.f.f27071a;
            i iVar = i.this;
            m1 m1Var = new m1(9, iVar);
            gm.l.f(iVar, "fragment");
            if (Build.VERSION.SDK_INT < 31) {
                m1Var.b(true);
            } else {
                Context V0 = iVar.V0();
                ArrayList f10 = h7.a.f("android.permission.BLUETOOTH_CONNECT");
                String string = V0.getString(R.string.permission_nearby_devices_for_ble);
                gm.l.e(string, "context.getString(R.stri…n_nearby_devices_for_ble)");
                si.f.h(fVar, iVar, f10, h7.a.f(new si.c("android.permission-group.NEARBY_DEVICES", string, null)), m1Var);
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.bind.DeviceConnectDialogFragment$onCreate$3", f = "DeviceConnectDialogFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f28764e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            i.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((d) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f28764e = obj;
            return dVar2;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            qi.p.f((d7.e) i.this.G0.getValue(), (Throwable) this.f28764e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.bind.DeviceConnectDialogFragment$onCreate$4", f = "DeviceConnectDialogFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends zl.i implements fm.p<tl.l, xl.d<? super tl.l>, Object> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(2, dVar);
            i.this = r1;
        }

        @Override // fm.p
        public final Object A(tl.l lVar, xl.d<? super tl.l> dVar) {
            return ((e) p(lVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new e(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            i.this.c1(false, false);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.bind.DeviceConnectDialogFragment$onCreateDialog$1", f = "DeviceConnectDialogFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f28767e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.bind.DeviceConnectDialogFragment$onCreateDialog$1$1", f = "DeviceConnectDialogFragment.kt", l = {83}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f28769e;

            /* renamed from: f */
            public final /* synthetic */ i f28770f;

            /* renamed from: uh.i$f$a$a */
            /* loaded from: classes2.dex */
            public static final class C0518a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ i f28771a;

                public C0518a(i iVar) {
                    this.f28771a = iVar;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    Button button;
                    View.OnClickListener hVar;
                    wf.a aVar = (wf.a) obj;
                    if (aVar != null) {
                        DialogDeviceConnectBinding dialogDeviceConnectBinding = this.f28771a.J0;
                        gm.l.c(dialogDeviceConnectBinding);
                        dialogDeviceConnectBinding.tvName.setText(aVar.f29803b);
                        DialogDeviceConnectBinding dialogDeviceConnectBinding2 = this.f28771a.J0;
                        gm.l.c(dialogDeviceConnectBinding2);
                        dialogDeviceConnectBinding2.tvAddress.setText(aVar.f29802a);
                        this.f28771a.f1(!aVar.f29804c);
                        if (aVar.f29804c) {
                            DialogDeviceConnectBinding dialogDeviceConnectBinding3 = this.f28771a.J0;
                            gm.l.c(dialogDeviceConnectBinding3);
                            dialogDeviceConnectBinding3.btnUnbind.setText(R.string.device_cancel_bind);
                            DialogDeviceConnectBinding dialogDeviceConnectBinding4 = this.f28771a.J0;
                            gm.l.c(dialogDeviceConnectBinding4);
                            button = dialogDeviceConnectBinding4.btnUnbind;
                            hVar = new jh.w(3, this.f28771a);
                        } else {
                            DialogDeviceConnectBinding dialogDeviceConnectBinding5 = this.f28771a.J0;
                            gm.l.c(dialogDeviceConnectBinding5);
                            dialogDeviceConnectBinding5.btnUnbind.setText(R.string.device_unbind);
                            DialogDeviceConnectBinding dialogDeviceConnectBinding6 = this.f28771a.J0;
                            gm.l.c(dialogDeviceConnectBinding6);
                            button = dialogDeviceConnectBinding6.btnUnbind;
                            hVar = new uh.h(this.f28771a, 1);
                        }
                        button.setOnClickListener(hVar);
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f28770f = iVar;
            }

            @Override // fm.p
            public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
                ((a) p(e0Var, dVar)).t(tl.l.f28297a);
                return yl.a.COROUTINE_SUSPENDED;
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f28770f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f28769e;
                if (i10 == 0) {
                    mf.a0.k(obj);
                    f1<wf.a> x10 = this.f28770f.j1().x();
                    C0518a c0518a = new C0518a(this.f28770f);
                    this.f28769e = 1;
                    if (x10.a(c0518a, this) == aVar) {
                        return aVar;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    mf.a0.k(obj);
                }
                throw new u2.b();
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.bind.DeviceConnectDialogFragment$onCreateDialog$1$2", f = "DeviceConnectDialogFragment.kt", l = {105}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f28772e;

            /* renamed from: f */
            public final /* synthetic */ i f28773f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ i f28774a;

                public a(i iVar) {
                    this.f28774a = iVar;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    Button button;
                    View.OnClickListener eVar;
                    TextView textView;
                    int i10;
                    wf.b bVar = (wf.b) obj;
                    g1 g1Var = this.f28774a.L0;
                    if (g1Var != null) {
                        g1Var.h(null);
                    }
                    int ordinal = bVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    if (ordinal != 4) {
                                        if (ordinal == 5) {
                                            DialogDeviceConnectBinding dialogDeviceConnectBinding = this.f28774a.J0;
                                            gm.l.c(dialogDeviceConnectBinding);
                                            dialogDeviceConnectBinding.tvState.setText(R.string.device_state_connected);
                                            DialogDeviceConnectBinding dialogDeviceConnectBinding2 = this.f28774a.J0;
                                            gm.l.c(dialogDeviceConnectBinding2);
                                            ProgressDotView progressDotView = dialogDeviceConnectBinding2.progressDotView;
                                            progressDotView.f12386h = 2;
                                            progressDotView.invalidate();
                                            i iVar = this.f28774a;
                                            DialogDeviceConnectBinding dialogDeviceConnectBinding3 = iVar.J0;
                                            gm.l.c(dialogDeviceConnectBinding3);
                                            LinearLayout linearLayout = dialogDeviceConnectBinding3.layoutConnecting;
                                            gm.l.e(linearLayout, "viewBind.layoutConnecting");
                                            linearLayout.setVisibility(8);
                                            DialogDeviceConnectBinding dialogDeviceConnectBinding4 = iVar.J0;
                                            gm.l.c(dialogDeviceConnectBinding4);
                                            RelativeLayout relativeLayout = dialogDeviceConnectBinding4.layoutAction;
                                            gm.l.e(relativeLayout, "viewBind.layoutAction");
                                            relativeLayout.setVisibility(0);
                                            DialogDeviceConnectBinding dialogDeviceConnectBinding5 = iVar.J0;
                                            gm.l.c(dialogDeviceConnectBinding5);
                                            TextView textView2 = dialogDeviceConnectBinding5.tvExtraMsg;
                                            ColorStateList colorStateList = iVar.M0;
                                            if (colorStateList != null) {
                                                textView2.setTextColor(colorStateList);
                                                DialogDeviceConnectBinding dialogDeviceConnectBinding6 = iVar.J0;
                                                gm.l.c(dialogDeviceConnectBinding6);
                                                dialogDeviceConnectBinding6.tvExtraMsg.setText(R.string.device_connect_bg_run_settings);
                                                DialogDeviceConnectBinding dialogDeviceConnectBinding7 = iVar.J0;
                                                gm.l.c(dialogDeviceConnectBinding7);
                                                dialogDeviceConnectBinding7.btnAction.setText(R.string.action_to_set);
                                                DialogDeviceConnectBinding dialogDeviceConnectBinding8 = iVar.J0;
                                                gm.l.c(dialogDeviceConnectBinding8);
                                                dialogDeviceConnectBinding8.btnAction.setOnClickListener(new rh.k(1, iVar));
                                            } else {
                                                gm.l.l("extraNormalColor");
                                                throw null;
                                            }
                                        }
                                    } else {
                                        DialogDeviceConnectBinding dialogDeviceConnectBinding9 = this.f28774a.J0;
                                        gm.l.c(dialogDeviceConnectBinding9);
                                        dialogDeviceConnectBinding9.tvState.setText(R.string.device_state_connecting);
                                        DialogDeviceConnectBinding dialogDeviceConnectBinding10 = this.f28774a.J0;
                                        gm.l.c(dialogDeviceConnectBinding10);
                                        ProgressDotView progressDotView2 = dialogDeviceConnectBinding10.progressDotView;
                                        progressDotView2.f12386h = 0;
                                        progressDotView2.f12387i = 1;
                                        progressDotView2.invalidate();
                                    }
                                } else {
                                    i iVar2 = this.f28774a;
                                    iVar2.L0 = z0.g(rm.l.g(iVar2), null, 0, new j(this.f28774a, null), 3);
                                    DialogDeviceConnectBinding dialogDeviceConnectBinding11 = this.f28774a.J0;
                                    gm.l.c(dialogDeviceConnectBinding11);
                                    ProgressDotView progressDotView3 = dialogDeviceConnectBinding11.progressDotView;
                                    progressDotView3.f12386h = 1;
                                    progressDotView3.invalidate();
                                }
                                i iVar3 = this.f28774a;
                                DialogDeviceConnectBinding dialogDeviceConnectBinding12 = iVar3.J0;
                                gm.l.c(dialogDeviceConnectBinding12);
                                LinearLayout linearLayout2 = dialogDeviceConnectBinding12.layoutConnecting;
                                gm.l.e(linearLayout2, "viewBind.layoutConnecting");
                                linearLayout2.setVisibility(0);
                                DialogDeviceConnectBinding dialogDeviceConnectBinding13 = iVar3.J0;
                                gm.l.c(dialogDeviceConnectBinding13);
                                RelativeLayout relativeLayout2 = dialogDeviceConnectBinding13.layoutAction;
                                gm.l.e(relativeLayout2, "viewBind.layoutAction");
                                relativeLayout2.setVisibility(8);
                            } else {
                                DialogDeviceConnectBinding dialogDeviceConnectBinding14 = this.f28774a.J0;
                                gm.l.c(dialogDeviceConnectBinding14);
                                dialogDeviceConnectBinding14.tvState.setText(R.string.device_state_disconnected);
                                DialogDeviceConnectBinding dialogDeviceConnectBinding15 = this.f28774a.J0;
                                gm.l.c(dialogDeviceConnectBinding15);
                                ProgressDotView progressDotView4 = dialogDeviceConnectBinding15.progressDotView;
                                progressDotView4.f12386h = 1;
                                progressDotView4.invalidate();
                                i iVar4 = this.f28774a;
                                DialogDeviceConnectBinding dialogDeviceConnectBinding16 = iVar4.J0;
                                gm.l.c(dialogDeviceConnectBinding16);
                                LinearLayout linearLayout3 = dialogDeviceConnectBinding16.layoutConnecting;
                                gm.l.e(linearLayout3, "viewBind.layoutConnecting");
                                linearLayout3.setVisibility(8);
                                DialogDeviceConnectBinding dialogDeviceConnectBinding17 = iVar4.J0;
                                gm.l.c(dialogDeviceConnectBinding17);
                                RelativeLayout relativeLayout3 = dialogDeviceConnectBinding17.layoutAction;
                                gm.l.e(relativeLayout3, "viewBind.layoutAction");
                                relativeLayout3.setVisibility(0);
                                wi.e b10 = iVar4.j1().b();
                                switch (b10.ordinal()) {
                                    case 0:
                                    case 1:
                                        DialogDeviceConnectBinding dialogDeviceConnectBinding18 = iVar4.J0;
                                        gm.l.c(dialogDeviceConnectBinding18);
                                        RelativeLayout relativeLayout4 = dialogDeviceConnectBinding18.layoutAction;
                                        gm.l.e(relativeLayout4, "viewBind.layoutAction");
                                        relativeLayout4.setVisibility(8);
                                        a.b bVar2 = p000do.a.f13275a;
                                        bVar2.t("DeviceConnectDialog");
                                        bVar2.p("Error reason:%s", b10);
                                        break;
                                    case 2:
                                        DialogDeviceConnectBinding dialogDeviceConnectBinding19 = iVar4.J0;
                                        gm.l.c(dialogDeviceConnectBinding19);
                                        RelativeLayout relativeLayout5 = dialogDeviceConnectBinding19.layoutAction;
                                        gm.l.e(relativeLayout5, "viewBind.layoutAction");
                                        relativeLayout5.setVisibility(8);
                                        a.b bVar3 = p000do.a.f13275a;
                                        bVar3.t("DeviceConnectDialog");
                                        bVar3.p("Error reason:%s", b10);
                                        break;
                                    case 3:
                                    case 4:
                                        DialogDeviceConnectBinding dialogDeviceConnectBinding20 = iVar4.J0;
                                        gm.l.c(dialogDeviceConnectBinding20);
                                        dialogDeviceConnectBinding20.tvExtraMsg.setTextColor(iVar4.N0);
                                        DialogDeviceConnectBinding dialogDeviceConnectBinding21 = iVar4.J0;
                                        gm.l.c(dialogDeviceConnectBinding21);
                                        dialogDeviceConnectBinding21.tvExtraMsg.setText(R.string.device_state_disconnected);
                                        DialogDeviceConnectBinding dialogDeviceConnectBinding22 = iVar4.J0;
                                        gm.l.c(dialogDeviceConnectBinding22);
                                        dialogDeviceConnectBinding22.btnAction.setText(R.string.device_reconnect);
                                        DialogDeviceConnectBinding dialogDeviceConnectBinding23 = iVar4.J0;
                                        gm.l.c(dialogDeviceConnectBinding23);
                                        button = dialogDeviceConnectBinding23.btnAction;
                                        eVar = new uh.e(1, iVar4);
                                        button.setOnClickListener(eVar);
                                        break;
                                    case 5:
                                    case 6:
                                        DialogDeviceConnectBinding dialogDeviceConnectBinding24 = iVar4.J0;
                                        gm.l.c(dialogDeviceConnectBinding24);
                                        dialogDeviceConnectBinding24.tvExtraMsg.setTextColor(iVar4.N0);
                                        if (b10 == wi.e.AUTH_LOGIN_FAILED) {
                                            DialogDeviceConnectBinding dialogDeviceConnectBinding25 = iVar4.J0;
                                            gm.l.c(dialogDeviceConnectBinding25);
                                            textView = dialogDeviceConnectBinding25.tvExtraMsg;
                                            i10 = R.string.device_connect_auth_login_failed;
                                        } else {
                                            DialogDeviceConnectBinding dialogDeviceConnectBinding26 = iVar4.J0;
                                            gm.l.c(dialogDeviceConnectBinding26);
                                            textView = dialogDeviceConnectBinding26.tvExtraMsg;
                                            i10 = R.string.device_connect_auth_bind_failed;
                                        }
                                        textView.setText(i10);
                                        DialogDeviceConnectBinding dialogDeviceConnectBinding27 = iVar4.J0;
                                        gm.l.c(dialogDeviceConnectBinding27);
                                        dialogDeviceConnectBinding27.btnAction.setText(R.string.device_rebind);
                                        DialogDeviceConnectBinding dialogDeviceConnectBinding28 = iVar4.J0;
                                        gm.l.c(dialogDeviceConnectBinding28);
                                        button = dialogDeviceConnectBinding28.btnAction;
                                        eVar = new q0(3, iVar4);
                                        button.setOnClickListener(eVar);
                                        break;
                                    case 7:
                                        DialogDeviceConnectBinding dialogDeviceConnectBinding29 = iVar4.J0;
                                        gm.l.c(dialogDeviceConnectBinding29);
                                        dialogDeviceConnectBinding29.tvExtraMsg.setTextColor(iVar4.N0);
                                        DialogDeviceConnectBinding dialogDeviceConnectBinding30 = iVar4.J0;
                                        gm.l.c(dialogDeviceConnectBinding30);
                                        dialogDeviceConnectBinding30.tvExtraMsg.setText("Unknown error");
                                        DialogDeviceConnectBinding dialogDeviceConnectBinding31 = iVar4.J0;
                                        gm.l.c(dialogDeviceConnectBinding31);
                                        dialogDeviceConnectBinding31.btnAction.setText((CharSequence) null);
                                        DialogDeviceConnectBinding dialogDeviceConnectBinding32 = iVar4.J0;
                                        gm.l.c(dialogDeviceConnectBinding32);
                                        dialogDeviceConnectBinding32.btnAction.setOnClickListener(null);
                                        a.b bVar4 = p000do.a.f13275a;
                                        bVar4.t("DeviceConnectDialog");
                                        bVar4.p("Error reason:%s", b10);
                                        break;
                                }
                            }
                        } else {
                            DialogDeviceConnectBinding dialogDeviceConnectBinding33 = this.f28774a.J0;
                            gm.l.c(dialogDeviceConnectBinding33);
                            dialogDeviceConnectBinding33.tvState.setText(R.string.device_state_disconnected);
                            DialogDeviceConnectBinding dialogDeviceConnectBinding34 = this.f28774a.J0;
                            gm.l.c(dialogDeviceConnectBinding34);
                            ProgressDotView progressDotView5 = dialogDeviceConnectBinding34.progressDotView;
                            progressDotView5.f12386h = 1;
                            progressDotView5.invalidate();
                            i iVar5 = this.f28774a;
                            DialogDeviceConnectBinding dialogDeviceConnectBinding35 = iVar5.J0;
                            gm.l.c(dialogDeviceConnectBinding35);
                            LinearLayout linearLayout4 = dialogDeviceConnectBinding35.layoutConnecting;
                            gm.l.e(linearLayout4, "viewBind.layoutConnecting");
                            linearLayout4.setVisibility(8);
                            DialogDeviceConnectBinding dialogDeviceConnectBinding36 = iVar5.J0;
                            gm.l.c(dialogDeviceConnectBinding36);
                            RelativeLayout relativeLayout6 = dialogDeviceConnectBinding36.layoutAction;
                            gm.l.e(relativeLayout6, "viewBind.layoutAction");
                            relativeLayout6.setVisibility(0);
                            DialogDeviceConnectBinding dialogDeviceConnectBinding37 = iVar5.J0;
                            gm.l.c(dialogDeviceConnectBinding37);
                            dialogDeviceConnectBinding37.tvExtraMsg.setTextColor(iVar5.N0);
                            DialogDeviceConnectBinding dialogDeviceConnectBinding38 = iVar5.J0;
                            gm.l.c(dialogDeviceConnectBinding38);
                            dialogDeviceConnectBinding38.tvExtraMsg.setText(R.string.device_state_bt_disabled);
                            DialogDeviceConnectBinding dialogDeviceConnectBinding39 = iVar5.J0;
                            gm.l.c(dialogDeviceConnectBinding39);
                            dialogDeviceConnectBinding39.btnAction.setText(R.string.action_turn_on);
                            DialogDeviceConnectBinding dialogDeviceConnectBinding40 = iVar5.J0;
                            gm.l.c(dialogDeviceConnectBinding40);
                            dialogDeviceConnectBinding40.btnAction.setOnClickListener(new uh.a(2, iVar5));
                        }
                    } else {
                        this.f28774a.c1(false, false);
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(i iVar, xl.d<? super b> dVar) {
                super(2, dVar);
                this.f28773f = iVar;
            }

            @Override // fm.p
            public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
                ((b) p(e0Var, dVar)).t(tl.l.f28297a);
                return yl.a.COROUTINE_SUSPENDED;
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new b(this.f28773f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f28772e;
                if (i10 == 0) {
                    mf.a0.k(obj);
                    f1<wf.b> J = this.f28773f.j1().J();
                    a aVar2 = new a(this.f28773f);
                    this.f28772e = 1;
                    if (J.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    mf.a0.k(obj);
                }
                throw new u2.b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(2, dVar);
            i.this = r1;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((f) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            f fVar = new f(dVar);
            fVar.f28767e = obj;
            return fVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            pm.e0 e0Var = (pm.e0) this.f28767e;
            z0.g(e0Var, null, 0, new a(i.this, null), 3);
            z0.g(e0Var, null, 0, new b(i.this, null), 3);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends gm.m implements fm.l<y3.c0<m, nh.d<tl.l>>, m> {

        /* renamed from: b */
        public final /* synthetic */ mm.b f28775b;

        /* renamed from: c */
        public final /* synthetic */ androidx.fragment.app.r f28776c;

        /* renamed from: d */
        public final /* synthetic */ mm.b f28777d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(androidx.fragment.app.r rVar, gm.e eVar, gm.e eVar2) {
            super(1);
            this.f28775b = eVar;
            this.f28776c = rVar;
            this.f28777d = eVar2;
        }

        /* JADX WARN: Type inference failed for: r8v7, types: [uh.m, y3.k0] */
        @Override // fm.l
        public final m k(y3.c0<m, nh.d<tl.l>> c0Var) {
            y3.c0<m, nh.d<tl.l>> c0Var2 = c0Var;
            gm.l.f(c0Var2, "stateFactory");
            return h1.o(m0.p(this.f28775b), nh.d.class, new y3.o(this.f28776c.T0(), h1.c(this.f28776c), this.f28776c), m0.p(this.f28777d).getName(), false, c0Var2, 16);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends yb.y {

        /* renamed from: c */
        public final /* synthetic */ mm.b f28778c;

        /* renamed from: d */
        public final /* synthetic */ fm.l f28779d;

        /* renamed from: e */
        public final /* synthetic */ mm.b f28780e;

        public h(gm.e eVar, g gVar, gm.e eVar2) {
            this.f28778c = eVar;
            this.f28779d = gVar;
            this.f28780e = eVar2;
        }

        public final tl.d C(Object obj, mm.h hVar) {
            androidx.fragment.app.r rVar = (androidx.fragment.app.r) obj;
            gm.l.f(rVar, "thisRef");
            gm.l.f(hVar, "property");
            return oc.g1.f22980a.b(rVar, hVar, this.f28778c, new k(this.f28780e), gm.b0.a(nh.d.class), false, this.f28779d);
        }
    }

    static {
        gm.t tVar = new gm.t(i.class, "viewModel", "getViewModel()Lcom/topstep/fitcloud/pro/ui/device/bind/DeviceConnectViewMode;", 0);
        gm.b0.f15488a.getClass();
        O0 = new mm.h[]{tVar};
    }

    public i() {
        gm.e a10 = gm.b0.a(m.class);
        this.K0 = new h(a10, new g(this, a10, a10), a10).C(this, O0[0]);
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        rm.l.g(this).b(new b(null));
        g0.a.c(this, (m) this.K0.getValue(), new gm.t() { // from class: uh.i.c
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((nh.d) obj).f22382a;
            }
        }, k1(null), new d(null), new e(null));
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void E0() {
        super.E0();
        this.J0 = null;
    }

    @Override // androidx.fragment.app.o, androidx.fragment.app.r
    public final void N0() {
        super.N0();
        g1 g1Var = this.L0;
        if (g1Var != null) {
            g1Var.h(null);
        }
    }

    @Override // y3.g0
    public final void X() {
        g0.a.g(this);
    }

    @Override // y3.g0
    public final z1 Y(k0 k0Var, gm.t tVar, y3.i iVar, fm.p pVar, fm.p pVar2) {
        return g0.a.c(this, k0Var, tVar, iVar, pVar, pVar2);
    }

    @Override // y3.g0
    public final z1 Z(xh.i iVar, gm.t tVar, y3.i iVar2, fm.p pVar) {
        return g0.a.e(this, iVar, tVar, iVar2, pVar);
    }

    @Override // y3.g0
    public final androidx.lifecycle.u a() {
        return g0.a.b(this);
    }

    @Override // f.q, androidx.fragment.app.o
    public final Dialog d1(Bundle bundle) {
        this.J0 = DialogDeviceConnectBinding.inflate(k0());
        androidx.lifecycle.v vVar = this.Z;
        gm.l.e(vVar, "lifecycle");
        qi.h.k(vVar, new f(null));
        DialogDeviceConnectBinding dialogDeviceConnectBinding = this.J0;
        gm.l.c(dialogDeviceConnectBinding);
        ColorStateList textColors = dialogDeviceConnectBinding.tvExtraMsg.getTextColors();
        gm.l.e(textColors, "viewBind.tvExtraMsg.textColors");
        this.M0 = textColors;
        DialogDeviceConnectBinding dialogDeviceConnectBinding2 = this.J0;
        gm.l.c(dialogDeviceConnectBinding2);
        this.N0 = u9.a.b(dialogDeviceConnectBinding2.getRoot(), R.attr.colorError);
        DialogDeviceConnectBinding dialogDeviceConnectBinding3 = this.J0;
        gm.l.c(dialogDeviceConnectBinding3);
        dialogDeviceConnectBinding3.tvUnableToConnect.setOnClickListener(new uh.h(this, 0));
        v9.b bVar = new v9.b(V0(), 0);
        DialogDeviceConnectBinding dialogDeviceConnectBinding4 = this.J0;
        gm.l.c(dialogDeviceConnectBinding4);
        bVar.m(dialogDeviceConnectBinding4.getRoot());
        return bVar.a();
    }

    @Override // y3.g0
    public final String i() {
        return g0.a.a(this).f30958d;
    }

    @Override // y3.g0
    public final void invalidate() {
        m mVar = (m) this.K0.getValue();
        gm.l.f(mVar, "repository1");
        nh.d dVar = (nh.d) mVar.f30971c.f31078c.d();
        gm.l.f(dVar, "it");
        qi.p.b(dVar.f22382a, (d7.e) this.H0.getValue());
        tl.l lVar = tl.l.f28297a;
    }

    public final og.t j1() {
        og.t tVar = this.I0;
        if (tVar != null) {
            return tVar;
        }
        gm.l.l("deviceManager");
        throw null;
    }

    public final e1 k1(String str) {
        return g0.a.h(this, str);
    }
}
