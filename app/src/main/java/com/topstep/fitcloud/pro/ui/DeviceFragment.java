package com.topstep.fitcloud.pro.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.o;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import bi.b1;
import bi.g1;
import bi.i0;
import bi.m0;
import bi.r;
import bi.r0;
import bi.z0;
import com.bumptech.glide.n;
import com.github.kilnn.tool.widget.preference.PreferenceRelativeLayout;
import com.topstep.fitcloud.pro.databinding.FragmentDeviceBinding;
import com.topstep.fitcloud.pro.ui.camera.CameraActivity;
import com.topstep.fitcloud.pro.ui.dialog.ChoiceIntDialogFragment;
import com.topstep.fitcloud.pro.ui.widget.BatteryImageView;
import com.topstep.fitcloudpro.R;
import d2.a;
import fm.l;
import fm.p;
import fm.q;
import gm.m;
import i2.b0;
import ih.d;
import ih.v;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import mf.a0;
import nj.e;
import nj.k;
import og.c1;
import og.n1;
import og.t;
import og.y0;
import pm.e0;
import sm.f1;
import uh.i;
import y0.a;
import yg.u;
import z0.f;

@Metadata
/* loaded from: classes2.dex */
public final class DeviceFragment extends ih.i implements i.a, i0.a, ChoiceIntDialogFragment.b, CompoundButton.OnCheckedChangeListener {
    public static final /* synthetic */ mm.h<Object>[] B0;
    public final a A0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10131t0;

    /* renamed from: u0 */
    public final t0 f10132u0;

    /* renamed from: v0 */
    public t f10133v0;

    /* renamed from: w0 */
    public u f10134w0;

    /* renamed from: x0 */
    public n1 f10135x0;

    /* renamed from: y0 */
    public xg.a f10136y0;

    /* renamed from: z0 */
    public int f10137z0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            DeviceFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            i2.m f10;
            i2.a aVar;
            o b1Var;
            View view2 = view;
            gm.l.f(view2, "view");
            DeviceFragment deviceFragment = DeviceFragment.this;
            mm.h<Object>[] hVarArr = DeviceFragment.B0;
            if (gm.l.a(view2, deviceFragment.j1().itemDeviceInfo)) {
                b1Var = new uh.i();
            } else {
                if (gm.l.a(view2, DeviceFragment.this.j1().itemCollectionCode)) {
                    f10 = tb.a.f(DeviceFragment.this);
                    aVar = new i2.a(R.id.toCollectionCode);
                } else if (gm.l.a(view2, DeviceFragment.this.j1().itemBusinessCard)) {
                    f10 = tb.a.f(DeviceFragment.this);
                    aVar = new i2.a(R.id.toBusinessCard);
                } else {
                    if (gm.l.a(view2, DeviceFragment.this.j1().itemNucleicAcidCode)) {
                        i2.m f11 = tb.a.f(DeviceFragment.this);
                        b0 a10 = v.d().a();
                        try {
                            Bundle bundle = new Bundle();
                            bundle.putInt("type", 128);
                            f11.l(R.id.toQrCodeSettings, bundle, a10);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    } else if (gm.l.a(view2, DeviceFragment.this.j1().itemHealthMonitor)) {
                        f10 = tb.a.f(DeviceFragment.this);
                        aVar = new i2.a(R.id.toHealthMonitor);
                    } else if (gm.l.a(view2, DeviceFragment.this.j1().itemProtectionReminder)) {
                        f10 = tb.a.f(DeviceFragment.this);
                        aVar = new i2.a(R.id.toProtectionReminder);
                    } else if (gm.l.a(view2, DeviceFragment.this.j1().itemTurnWristLighting)) {
                        f10 = tb.a.f(DeviceFragment.this);
                        aVar = new i2.a(R.id.toTurnWristLighting);
                    } else if (gm.l.a(view2, DeviceFragment.this.j1().itemSedentary)) {
                        f10 = tb.a.f(DeviceFragment.this);
                        aVar = new i2.a(R.id.toSedentary);
                    } else if (gm.l.a(view2, DeviceFragment.this.j1().itemDrinkWater)) {
                        f10 = tb.a.f(DeviceFragment.this);
                        aVar = new i2.a(R.id.toDrinkWater);
                    } else if (gm.l.a(view2, DeviceFragment.this.j1().itemFindDevice)) {
                        c1 d10 = DeviceFragment.this.i1().d();
                        a0.j(d10.f23242b, new y0(d10, null));
                    } else if (gm.l.a(view2, DeviceFragment.this.j1().itemWearWay)) {
                        b1Var = new g1();
                    } else if (gm.l.a(view2, DeviceFragment.this.j1().itemHourStyle)) {
                        b1Var = new i0();
                    } else if (gm.l.a(view2, DeviceFragment.this.j1().itemPageConfig)) {
                        b1Var = new r0();
                    } else if (gm.l.a(view2, DeviceFragment.this.j1().itemReset)) {
                        b1Var = new b1();
                    } else if (gm.l.a(view2, DeviceFragment.this.j1().itemVibrate)) {
                        DeviceFragment deviceFragment2 = DeviceFragment.this;
                        ChoiceIntDialogFragment e11 = m0.e(deviceFragment2, new k.d(deviceFragment2.i1().D().e().f21878b, 31, 2), R.string.unit_level_param, 0, R.string.ds_vibration_intensity);
                        if (e11 != null) {
                            e11.h1(deviceFragment2.h0(), "vibrate");
                        }
                    } else if (gm.l.a(view2, DeviceFragment.this.j1().itemNotification)) {
                        f10 = tb.a.f(DeviceFragment.this);
                        aVar = new i2.a(R.id.toNotification);
                    } else if (gm.l.a(view2, DeviceFragment.this.j1().itemAlarm)) {
                        f10 = tb.a.f(DeviceFragment.this);
                        aVar = new i2.a(R.id.toAlarm);
                    } else if (gm.l.a(view2, DeviceFragment.this.j1().itemScreen)) {
                        f10 = tb.a.f(DeviceFragment.this);
                        aVar = new i2.a(R.id.toScreen);
                    } else if (gm.l.a(view2, DeviceFragment.this.j1().itemDialPush)) {
                        f10 = tb.a.f(DeviceFragment.this);
                        aVar = new i2.a(R.id.toDialPush);
                    } else if (gm.l.a(view2, DeviceFragment.this.j1().itemGamePush)) {
                        f10 = tb.a.f(DeviceFragment.this);
                        aVar = new i2.a(R.id.toGamePush);
                    } else if (gm.l.a(view2, DeviceFragment.this.j1().itemDialComponent)) {
                        f10 = tb.a.f(DeviceFragment.this);
                        aVar = new i2.a(R.id.toDialComponent);
                    } else if (gm.l.a(view2, DeviceFragment.this.j1().itemSportPush)) {
                        f10 = tb.a.f(DeviceFragment.this);
                        aVar = new i2.a(R.id.toSportPush);
                    } else if (gm.l.a(view2, DeviceFragment.this.j1().itemContacts)) {
                        f10 = tb.a.f(DeviceFragment.this);
                        aVar = new i2.a(R.id.toContacts);
                    } else if (gm.l.a(view2, DeviceFragment.this.j1().itemVersion)) {
                        DeviceViewModel deviceViewModel = (DeviceViewModel) DeviceFragment.this.f10132u0.getValue();
                        deviceViewModel.getClass();
                        z0.g(rm.l.h(deviceViewModel), null, 0, new ih.f(deviceViewModel, null), 3);
                    } else if (gm.l.a(view2, DeviceFragment.this.j1().itemShakeTakePhotos)) {
                        int i10 = CameraActivity.f10412y;
                        CameraActivity.a.a(DeviceFragment.this.V0(), false);
                    } else if (gm.l.a(view2, DeviceFragment.this.j1().itemSongPush)) {
                        f10 = tb.a.f(DeviceFragment.this);
                        aVar = new i2.a(R.id.toSongPush);
                    }
                    return tl.l.f28297a;
                }
                v.l(f10, aVar);
                return tl.l.f28297a;
            }
            b1Var.h1(DeviceFragment.this.h0(), null);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.DeviceFragment$dialogSetHourStyle$1", f = "DeviceFragment.kt", l = {548}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f10139e;

        /* renamed from: g */
        public final /* synthetic */ int f10141g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, xl.d<? super b> dVar) {
            super(2, dVar);
            DeviceFragment.this = r1;
            this.f10141g = i10;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new b(this.f10141g, dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f10139e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                u uVar = DeviceFragment.this.f10134w0;
                if (uVar != null) {
                    int i11 = this.f10141g;
                    this.f10139e = 1;
                    if (uVar.e(i11, this) == aVar) {
                        return aVar;
                    }
                } else {
                    gm.l.l("userStorageManager");
                    throw null;
                }
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.DeviceFragment$onCreate$1", f = "DeviceFragment.kt", l = {152}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public DeviceFragment f10142e;

        /* renamed from: f */
        public int f10143f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(2, dVar);
            DeviceFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((c) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new c(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            DeviceFragment deviceFragment;
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f10143f;
            if (i10 != 0) {
                if (i10 == 1) {
                    deviceFragment = this.f10142e;
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                DeviceFragment deviceFragment2 = DeviceFragment.this;
                u uVar = deviceFragment2.f10134w0;
                if (uVar != null) {
                    this.f10142e = deviceFragment2;
                    this.f10143f = 1;
                    Object l10 = uVar.l(this);
                    if (l10 == aVar) {
                        return aVar;
                    }
                    deviceFragment = deviceFragment2;
                    obj = l10;
                } else {
                    gm.l.l("userStorageManager");
                    throw null;
                }
            }
            deviceFragment.f10137z0 = ((Number) obj).intValue();
            DeviceFragment.this.k1();
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.DeviceFragment$onViewCreated$1", f = "DeviceFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10145e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.DeviceFragment$onViewCreated$1$1", f = "DeviceFragment.kt", l = {161}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10147e;

            /* renamed from: f */
            public final /* synthetic */ DeviceFragment f10148f;

            /* renamed from: com.topstep.fitcloud.pro.ui.DeviceFragment$d$a$a */
            /* loaded from: classes2.dex */
            public static final class C0123a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ DeviceFragment f10149a;

                public C0123a(DeviceFragment deviceFragment) {
                    this.f10149a = deviceFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    if (((ih.g) obj).f16837a) {
                        DeviceFragment deviceFragment = this.f10149a;
                        mm.h<Object>[] hVarArr = DeviceFragment.B0;
                        d7.e.g(deviceFragment.e1());
                    } else {
                        DeviceFragment deviceFragment2 = this.f10149a;
                        mm.h<Object>[] hVarArr2 = DeviceFragment.B0;
                        deviceFragment2.e1().a();
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DeviceFragment deviceFragment, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f10148f = deviceFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f10148f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10147e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    sm.t0 t0Var = ((DeviceViewModel) this.f10148f.f10132u0.getValue()).f22394e;
                    C0123a c0123a = new C0123a(this.f10148f);
                    this.f10147e = 1;
                    if (t0Var.a(c0123a, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.DeviceFragment$onViewCreated$1$2", f = "DeviceFragment.kt", l = {170}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10150e;

            /* renamed from: f */
            public final /* synthetic */ DeviceFragment f10151f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ DeviceFragment f10152a;

                public a(DeviceFragment deviceFragment) {
                    this.f10152a = deviceFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    ih.d dVar2 = (ih.d) obj;
                    if (dVar2 instanceof d.a) {
                        DeviceFragment deviceFragment = this.f10152a;
                        mm.h<Object>[] hVarArr = DeviceFragment.B0;
                        qi.p.f(deviceFragment.f1(), ((d.a) dVar2).f16827a);
                    } else if (dVar2 instanceof d.b) {
                        d.b bVar = (d.b) dVar2;
                        if (bVar.f16828a == null) {
                            DeviceFragment deviceFragment2 = this.f10152a;
                            mm.h<Object>[] hVarArr2 = DeviceFragment.B0;
                            d7.e.f(deviceFragment2.f1(), R.string.version_is_latest_version);
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("parcelArgs", bVar.f16828a);
                            tb.a.f(this.f10152a).l(R.id.hardwareUpgradeFragment, bundle, v.d().a());
                        }
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(DeviceFragment deviceFragment, xl.d<? super b> dVar) {
                super(2, dVar);
                this.f10151f = deviceFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new b(this.f10151f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10150e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    sm.c cVar = ((DeviceViewModel) this.f10151f.f10132u0.getValue()).f22396g;
                    a aVar2 = new a(this.f10151f);
                    this.f10150e = 1;
                    if (cVar.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.DeviceFragment$onViewCreated$1$3", f = "DeviceFragment.kt", l = {187}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class c extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10153e;

            /* renamed from: f */
            public final /* synthetic */ DeviceFragment f10154f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ DeviceFragment f10155a;

                public a(DeviceFragment deviceFragment) {
                    this.f10155a = deviceFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    wf.a aVar = (wf.a) obj;
                    if (aVar == null) {
                        DeviceFragment deviceFragment = this.f10155a;
                        mm.h<Object>[] hVarArr = DeviceFragment.B0;
                        FrameLayout root = deviceFragment.j1().itemDeviceBind.getRoot();
                        gm.l.e(root, "viewBind.itemDeviceBind.root");
                        root.setVisibility(0);
                        PreferenceRelativeLayout preferenceRelativeLayout = this.f10155a.j1().itemDeviceInfo;
                        gm.l.e(preferenceRelativeLayout, "viewBind.itemDeviceInfo");
                        preferenceRelativeLayout.setVisibility(8);
                    } else {
                        DeviceFragment deviceFragment2 = this.f10155a;
                        mm.h<Object>[] hVarArr2 = DeviceFragment.B0;
                        FrameLayout root2 = deviceFragment2.j1().itemDeviceBind.getRoot();
                        gm.l.e(root2, "viewBind.itemDeviceBind.root");
                        root2.setVisibility(8);
                        PreferenceRelativeLayout preferenceRelativeLayout2 = this.f10155a.j1().itemDeviceInfo;
                        gm.l.e(preferenceRelativeLayout2, "viewBind.itemDeviceInfo");
                        preferenceRelativeLayout2.setVisibility(0);
                        this.f10155a.j1().tvDeviceName.setText(aVar.f29803b);
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(DeviceFragment deviceFragment, xl.d<? super c> dVar) {
                super(2, dVar);
                this.f10154f = deviceFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                ((c) p(e0Var, dVar)).t(tl.l.f28297a);
                return yl.a.COROUTINE_SUSPENDED;
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new c(this.f10154f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10153e;
                if (i10 == 0) {
                    a0.k(obj);
                    f1<wf.a> x10 = this.f10154f.i1().x();
                    a aVar2 = new a(this.f10154f);
                    this.f10153e = 1;
                    if (x10.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    a0.k(obj);
                }
                throw new u2.b();
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.DeviceFragment$onViewCreated$1$4", f = "DeviceFragment.kt", l = {199}, m = "invokeSuspend")
        /* renamed from: com.topstep.fitcloud.pro.ui.DeviceFragment$d$d */
        /* loaded from: classes2.dex */
        public static final class C0124d extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10156e;

            /* renamed from: f */
            public final /* synthetic */ DeviceFragment f10157f;

            /* renamed from: com.topstep.fitcloud.pro.ui.DeviceFragment$d$d$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ DeviceFragment f10158a;

                public a(DeviceFragment deviceFragment) {
                    this.f10158a = deviceFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    int i10;
                    wf.b bVar = (wf.b) obj;
                    DeviceFragment deviceFragment = this.f10158a;
                    mm.h<Object>[] hVarArr = DeviceFragment.B0;
                    TextView textView = deviceFragment.j1().tvDeviceState;
                    gm.l.f(bVar, "<this>");
                    int ordinal = bVar.ordinal();
                    boolean z10 = true;
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2 && ordinal != 3) {
                                if (ordinal != 4) {
                                    if (ordinal == 5) {
                                        i10 = R.string.device_state_connected;
                                    } else {
                                        throw new qa.p();
                                    }
                                } else {
                                    i10 = R.string.device_state_connecting;
                                }
                            } else {
                                i10 = R.string.device_state_disconnected;
                            }
                        } else {
                            i10 = R.string.device_state_bt_disabled;
                        }
                    } else {
                        i10 = R.string.device_state_no_device;
                    }
                    textView.setText(i10);
                    LinearLayout linearLayout = this.f10158a.j1().layoutContent;
                    gm.l.e(linearLayout, "viewBind.layoutContent");
                    if (bVar != wf.b.CONNECTED) {
                        z10 = false;
                    }
                    qi.h.m(linearLayout, z10);
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0124d(DeviceFragment deviceFragment, xl.d<? super C0124d> dVar) {
                super(2, dVar);
                this.f10157f = deviceFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                ((C0124d) p(e0Var, dVar)).t(tl.l.f28297a);
                return yl.a.COROUTINE_SUSPENDED;
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new C0124d(this.f10157f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10156e;
                if (i10 == 0) {
                    a0.k(obj);
                    f1<wf.b> J = this.f10157f.i1().J();
                    a aVar2 = new a(this.f10157f);
                    this.f10156e = 1;
                    if (J.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    a0.k(obj);
                }
                throw new u2.b();
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.DeviceFragment$onViewCreated$1$5", f = "DeviceFragment.kt", l = {205}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class e extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10159e;

            /* renamed from: f */
            public final /* synthetic */ DeviceFragment f10160f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ DeviceFragment f10161a;

                public a(DeviceFragment deviceFragment) {
                    this.f10161a = deviceFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    boolean z10;
                    Drawable c10;
                    rj.b bVar = (rj.b) obj;
                    if (bVar == null) {
                        DeviceFragment deviceFragment = this.f10161a;
                        mm.h<Object>[] hVarArr = DeviceFragment.B0;
                        BatteryImageView batteryImageView = deviceFragment.j1().batteryView;
                        batteryImageView.f12244d = true;
                        batteryImageView.setImageDrawable(batteryImageView.f12247g);
                    } else {
                        int i10 = (bVar.f25768c / 10) * 10;
                        DeviceFragment deviceFragment2 = this.f10161a;
                        mm.h<Object>[] hVarArr2 = DeviceFragment.B0;
                        BatteryImageView batteryImageView2 = deviceFragment2.j1().batteryView;
                        boolean z11 = bVar.f25766a;
                        batteryImageView2.getClass();
                        if (i10 >= 0 && i10 <= 100) {
                            if (batteryImageView2.f12244d || batteryImageView2.f12245e != z11 || batteryImageView2.f12246f != i10) {
                                batteryImageView2.f12244d = false;
                                batteryImageView2.f12245e = z11;
                                batteryImageView2.f12246f = i10;
                                if (z11) {
                                    c10 = batteryImageView2.f12248h;
                                } else {
                                    int max = Math.max(i10, 5);
                                    if (i10 < 10) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        AnimationDrawable animationDrawable = new AnimationDrawable();
                                        Resources resources = batteryImageView2.getResources();
                                        Resources.Theme theme = batteryImageView2.getContext().getTheme();
                                        ThreadLocal<TypedValue> threadLocal = z0.f.f31856a;
                                        animationDrawable.addFrame(f.a.a(resources, R.drawable.ic_battery_zero, theme), 500);
                                        animationDrawable.addFrame(batteryImageView2.c(max, true), 500);
                                        animationDrawable.setBounds(0, 0, animationDrawable.getIntrinsicWidth(), animationDrawable.getIntrinsicHeight());
                                        animationDrawable.start();
                                        c10 = animationDrawable;
                                    } else {
                                        c10 = batteryImageView2.c(max, false);
                                    }
                                }
                                batteryImageView2.setImageDrawable(c10);
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(DeviceFragment deviceFragment, xl.d<? super e> dVar) {
                super(2, dVar);
                this.f10160f = deviceFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                ((e) p(e0Var, dVar)).t(tl.l.f28297a);
                return yl.a.COROUTINE_SUSPENDED;
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new e(this.f10160f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10159e;
                if (i10 == 0) {
                    a0.k(obj);
                    sm.t0 E = this.f10160f.i1().E();
                    a aVar2 = new a(this.f10160f);
                    this.f10159e = 1;
                    if (E.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    a0.k(obj);
                }
                throw new u2.b();
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.DeviceFragment$onViewCreated$1$6", f = "DeviceFragment.kt", l = {215}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class f extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10162e;

            /* renamed from: f */
            public final /* synthetic */ DeviceFragment f10163f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ DeviceFragment f10164a;

                public a(DeviceFragment deviceFragment) {
                    this.f10164a = deviceFragment;
                }

                /* JADX WARN: Removed duplicated region for block: B:280:0x0227  */
                /* JADX WARN: Removed duplicated region for block: B:281:0x0229  */
                /* JADX WARN: Removed duplicated region for block: B:285:0x0242  */
                /* JADX WARN: Removed duplicated region for block: B:293:0x0263  */
                /* JADX WARN: Removed duplicated region for block: B:294:0x0265  */
                /* JADX WARN: Removed duplicated region for block: B:297:0x027f  */
                /* JADX WARN: Removed duplicated region for block: B:298:0x0281  */
                /* JADX WARN: Removed duplicated region for block: B:301:0x02a8  */
                /* JADX WARN: Removed duplicated region for block: B:306:0x02b1  */
                /* JADX WARN: Removed duplicated region for block: B:312:0x02c5  */
                /* JADX WARN: Removed duplicated region for block: B:320:0x0327  */
                /* JADX WARN: Removed duplicated region for block: B:323:0x0345  */
                /* JADX WARN: Removed duplicated region for block: B:334:0x0371  */
                /* JADX WARN: Removed duplicated region for block: B:335:0x03a0  */
                /* JADX WARN: Removed duplicated region for block: B:339:0x03c8  */
                /* JADX WARN: Removed duplicated region for block: B:340:0x03cc  */
                /* JADX WARN: Removed duplicated region for block: B:343:0x03e7  */
                /* JADX WARN: Removed duplicated region for block: B:344:0x03e9  */
                /* JADX WARN: Removed duplicated region for block: B:347:0x0403  */
                /* JADX WARN: Removed duplicated region for block: B:348:0x0405  */
                /* JADX WARN: Removed duplicated region for block: B:351:0x041f  */
                /* JADX WARN: Removed duplicated region for block: B:352:0x0421  */
                /* JADX WARN: Removed duplicated region for block: B:355:0x042d  */
                /* JADX WARN: Removed duplicated region for block: B:369:0x048b  */
                /* JADX WARN: Removed duplicated region for block: B:372:0x04a8  */
                /* JADX WARN: Removed duplicated region for block: B:373:0x04ab  */
                @Override // sm.g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object n(java.lang.Object r17, xl.d r18) {
                    /*
                        Method dump skipped, instructions count: 1324
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.DeviceFragment.d.f.a.n(java.lang.Object, xl.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(DeviceFragment deviceFragment, xl.d<? super f> dVar) {
                super(2, dVar);
                this.f10163f = deviceFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((f) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new f(this.f10163f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10162e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    final og.f D = this.f10163f.i1().D();
                    D.getClass();
                    sm.b d10 = qi.h.d(new bl.k(1, new wk.g() { // from class: og.b
                        @Override // wk.g
                        public final Object get() {
                            f fVar = f.this;
                            gm.l.f(fVar, "this$0");
                            ql.b<Byte> bVar = ((jj.l) fVar.f23334a).f17932f;
                            gm.l.e(bVar, "refreshTypeSubject");
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            il.b bVar2 = pl.a.f24280b;
                            Objects.requireNonNull(timeUnit, "unit is null");
                            Objects.requireNonNull(bVar2, "scheduler is null");
                            return new fl.h(1000L, bVar, bVar2, timeUnit).x((byte) 0);
                        }
                    }));
                    a aVar2 = new a(this.f10163f);
                    this.f10162e = 1;
                    if (d10.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.DeviceFragment$onViewCreated$1$7", f = "DeviceFragment.kt", l = {331}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class g extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10165e;

            /* renamed from: f */
            public final /* synthetic */ DeviceFragment f10166f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ DeviceFragment f10167a;

                public a(DeviceFragment deviceFragment) {
                    this.f10167a = deviceFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    DeviceFragment deviceFragment = this.f10167a;
                    mm.h<Object>[] hVarArr = DeviceFragment.B0;
                    ImageView imageView = deviceFragment.j1().imgDevice;
                    gm.l.e(imageView, "viewBind.imgDevice");
                    n<Drawable> x10 = com.bumptech.glide.b.e(imageView.getContext()).k((String) obj).x(i5.g.w(R.drawable.ic_device_default));
                    gm.l.e(x10, "with(imageView.context)\n…aceholderOf(placeholder))");
                    x10.A(imageView);
                    return tl.l.f28297a;
                }
            }

            @zl.e(c = "com.topstep.fitcloud.pro.ui.DeviceFragment$onViewCreated$1$7$invokeSuspend$$inlined$flatMapLatest$1", f = "DeviceFragment.kt", l = {190}, m = "invokeSuspend")
            /* loaded from: classes2.dex */
            public static final class b extends zl.i implements q<sm.g<? super String>, nj.c, xl.d<? super tl.l>, Object> {

                /* renamed from: e */
                public int f10168e;

                /* renamed from: f */
                public /* synthetic */ sm.g f10169f;

                /* renamed from: g */
                public /* synthetic */ Object f10170g;

                /* renamed from: h */
                public final /* synthetic */ DeviceFragment f10171h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(DeviceFragment deviceFragment, xl.d dVar) {
                    super(3, dVar);
                    this.f10171h = deviceFragment;
                }

                @Override // fm.q
                public final Object j(sm.g<? super String> gVar, nj.c cVar, xl.d<? super tl.l> dVar) {
                    b bVar = new b(this.f10171h, dVar);
                    bVar.f10169f = gVar;
                    bVar.f10170g = cVar;
                    return bVar.t(tl.l.f28297a);
                }

                @Override // zl.a
                public final Object t(Object obj) {
                    yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                    int i10 = this.f10168e;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            a0.k(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        a0.k(obj);
                        sm.g gVar = this.f10169f;
                        nj.c cVar = (nj.c) this.f10170g;
                        n1 n1Var = this.f10171h.f10135x0;
                        if (n1Var != null) {
                            sm.f<String> a10 = n1Var.a(cVar);
                            this.f10168e = 1;
                            if (r.v(this, a10, gVar) == aVar) {
                                return aVar;
                            }
                        } else {
                            gm.l.l("shellRepository");
                            throw null;
                        }
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(DeviceFragment deviceFragment, xl.d<? super g> dVar) {
                super(2, dVar);
                this.f10166f = deviceFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((g) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new g(this.f10166f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10165e;
                if (i10 == 0) {
                    a0.k(obj);
                    tm.j O = r.O(this.f10166f.i1().D().a(), new b(this.f10166f, null));
                    a aVar2 = new a(this.f10166f);
                    this.f10165e = 1;
                    if (O.a(aVar2, this) == aVar) {
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

        @zl.e(c = "com.topstep.fitcloud.pro.ui.DeviceFragment$onViewCreated$1$8", f = "DeviceFragment.kt", l = {336}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class h extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10172e;

            /* renamed from: f */
            public final /* synthetic */ DeviceFragment f10173f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ DeviceFragment f10174a;

                public a(DeviceFragment deviceFragment) {
                    this.f10174a = deviceFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    ag.a aVar = (ag.a) obj;
                    if (aVar != null && aVar.f463b) {
                        Context V0 = this.f10174a.V0();
                        Object obj2 = y0.a.f30807a;
                        Drawable b10 = a.c.b(V0, R.drawable.shape_badge);
                        gm.l.c(b10);
                        b10.setBounds(0, 0, b10.getIntrinsicWidth(), b10.getIntrinsicHeight());
                        this.f10174a.j1().itemVersion.getTextView().setCompoundDrawables(b10, null, null, null);
                    } else {
                        DeviceFragment deviceFragment = this.f10174a;
                        mm.h<Object>[] hVarArr = DeviceFragment.B0;
                        deviceFragment.j1().itemVersion.getTextView().setCompoundDrawables(null, null, null, null);
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(DeviceFragment deviceFragment, xl.d<? super h> dVar) {
                super(2, dVar);
                this.f10173f = deviceFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                ((h) p(e0Var, dVar)).t(tl.l.f28297a);
                return yl.a.COROUTINE_SUSPENDED;
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new h(this.f10173f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10172e;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.k(obj);
                } else {
                    a0.k(obj);
                    xg.a aVar2 = this.f10173f.f10136y0;
                    if (aVar2 != null) {
                        sm.t0 a10 = aVar2.a();
                        a aVar3 = new a(this.f10173f);
                        this.f10172e = 1;
                        if (a10.a(aVar3, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        gm.l.l("noticeRepository");
                        throw null;
                    }
                }
                throw new u2.b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            DeviceFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((d) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f10145e = obj;
            return dVar2;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f10145e;
            z0.g(e0Var, null, 0, new a(DeviceFragment.this, null), 3);
            z0.g(e0Var, null, 0, new b(DeviceFragment.this, null), 3);
            z0.g(e0Var, null, 0, new c(DeviceFragment.this, null), 3);
            z0.g(e0Var, null, 0, new C0124d(DeviceFragment.this, null), 3);
            z0.g(e0Var, null, 0, new e(DeviceFragment.this, null), 3);
            z0.g(e0Var, null, 0, new f(DeviceFragment.this, null), 3);
            z0.g(e0Var, null, 0, new g(DeviceFragment.this, null), 3);
            z0.g(e0Var, null, 0, new h(DeviceFragment.this, null), 3);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends m implements l<FrameLayout, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e() {
            super(1);
            DeviceFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(FrameLayout frameLayout) {
            gm.l.f(frameLayout, "it");
            i2.m f10 = tb.a.f(DeviceFragment.this);
            b0 a10 = v.d().a();
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean("isAfterFillUser", false);
                bundle.putString("nameSpecify", null);
                f10.l(R.id.toDeviceBind, bundle, a10);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends m implements fm.a<androidx.fragment.app.r> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f10176b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(androidx.fragment.app.r rVar) {
            super(0);
            this.f10176b = rVar;
        }

        @Override // fm.a
        public final androidx.fragment.app.r m() {
            return this.f10176b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends m implements fm.a<androidx.lifecycle.y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f10177b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f10177b = fVar;
        }

        @Override // fm.a
        public final androidx.lifecycle.y0 m() {
            return (androidx.lifecycle.y0) this.f10177b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f10178b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(tl.d dVar) {
            super(0);
            this.f10178b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f10178b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f10179b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(tl.d dVar) {
            super(0);
            this.f10179b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            androidx.lifecycle.y0 b10 = ab.b.b(this.f10179b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ androidx.fragment.app.r f10180b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f10181c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(androidx.fragment.app.r rVar, tl.d dVar) {
            super(0);
            this.f10180b = rVar;
            this.f10181c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            androidx.lifecycle.y0 b10 = ab.b.b(this.f10181c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f10180b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    static {
        gm.t tVar = new gm.t(DeviceFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentDeviceBinding;", 0);
        gm.b0.f15488a.getClass();
        B0 = new mm.h[]{tVar};
    }

    public DeviceFragment() {
        super(R.layout.fragment_device);
        this.f10131t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentDeviceBinding.class, this);
        tl.d a10 = fb.e.a(new g(new f(this)));
        this.f10132u0 = ab.b.f(this, gm.b0.a(DeviceViewModel.class), new h(a10), new i(a10), new j(this, a10));
        this.A0 = new a();
    }

    public static final int h1(DeviceFragment deviceFragment, boolean z10) {
        deviceFragment.getClass();
        return z10 ? R.string.tip_opened : R.string.tip_not_opened;
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        z0.g(rm.l.g(this), null, 0, new c(null), 3);
    }

    @Override // uh.i.a
    public final void L() {
        tb.a.f(this).n(new i2.a(R.id.toConnectHelp));
    }

    @Override // bi.i0.a
    public final void O(int i10) {
        this.f10137z0 = i10;
        k1();
        z0.g(rm.l.g(this), null, 0, new b(i10, null), 3);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        qi.h.k(qi.h.i(this), new d(null));
        k1();
        p.b.g(j1().itemDeviceBind.getRoot(), new e());
        p.b.g(j1().itemDeviceInfo, this.A0);
        p.b.g(j1().itemCollectionCode, this.A0);
        p.b.g(j1().itemBusinessCard, this.A0);
        p.b.g(j1().itemNucleicAcidCode, this.A0);
        p.b.g(j1().itemHealthMonitor, this.A0);
        p.b.g(j1().itemProtectionReminder, this.A0);
        p.b.g(j1().itemTurnWristLighting, this.A0);
        p.b.g(j1().itemSedentary, this.A0);
        p.b.g(j1().itemDrinkWater, this.A0);
        p.b.g(j1().itemFindDevice, this.A0);
        p.b.g(j1().itemWearWay, this.A0);
        p.b.g(j1().itemHourStyle, this.A0);
        p.b.g(j1().itemPageConfig, this.A0);
        p.b.g(j1().itemVibrate, this.A0);
        p.b.g(j1().itemScreen, this.A0);
        p.b.g(j1().itemNotification, this.A0);
        p.b.g(j1().itemAlarm, this.A0);
        p.b.g(j1().itemReset, this.A0);
        p.b.g(j1().itemDialPush, this.A0);
        p.b.g(j1().itemGamePush, this.A0);
        p.b.g(j1().itemDialComponent, this.A0);
        p.b.g(j1().itemSportPush, this.A0);
        p.b.g(j1().itemContacts, this.A0);
        p.b.g(j1().itemVersion, this.A0);
        p.b.g(j1().itemShakeTakePhotos, this.A0);
        p.b.g(j1().itemSongPush, this.A0);
        j1().itemStrengthenTest.getSwitchView().setOnCheckedChangeListener(this);
        j1().itemWeather.getSwitchView().setOnCheckedChangeListener(this);
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.ChoiceIntDialogFragment.b
    public final void T(int i10, String str) {
        if (gm.l.a("vibrate", str)) {
            k.b y10 = v.y(i1().D().e());
            new k.a(y10.f21880b, 31).b(i10);
            i1().D().g(y10.b());
        }
    }

    @Override // bi.i0.a
    public final int b0() {
        return this.f10137z0;
    }

    @Override // uh.i.a
    public final void d() {
        tb.a.f(this).n(new i2.a(R.id.toBgRunSettings));
    }

    public final t i1() {
        t tVar = this.f10133v0;
        if (tVar != null) {
            return tVar;
        }
        gm.l.l("deviceManager");
        throw null;
    }

    public final FragmentDeviceBinding j1() {
        return (FragmentDeviceBinding) this.f10131t0.a(this, B0[0]);
    }

    public final void k1() {
        int i10;
        if (this.H == null) {
            return;
        }
        int i11 = this.f10137z0;
        if (i11 != 0) {
            if (i11 != 1) {
                i10 = R.string.ds_hour_style_24;
            } else {
                i10 = R.string.ds_hour_style_12;
            }
        } else {
            i10 = R.string.ds_flow_system;
        }
        j1().itemHourStyle.getTextView().setText(i10);
    }

    public final void l1(boolean z10) {
        e.a u10 = v.u(i1().D().d());
        u10.a(5, z10);
        i1().D().f(u10.b());
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        boolean z11;
        if (compoundButton != null && compoundButton.isPressed()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return;
        }
        if (gm.l.a(compoundButton, j1().itemStrengthenTest.getSwitchView())) {
            e.a u10 = v.u(i1().D().d());
            u10.a(1, z10);
            i1().D().f(u10.b());
        } else if (gm.l.a(compoundButton, j1().itemWeather.getSwitchView())) {
            if (z10) {
                Object systemService = V0().getSystemService("location");
                if (systemService != null) {
                    if (!d1.g.a((LocationManager) systemService)) {
                        compoundButton.setChecked(false);
                        new com.topstep.fitcloud.pro.ui.dialog.j().h1(h0(), null);
                        return;
                    }
                    si.f.f27071a.k(this, new s5.b(this, compoundButton, 1));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
            }
            l1(false);
        }
    }
}
