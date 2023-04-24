package com.topstep.fitcloud.pro.ui.device.bind;

import al.j;
import android.bluetooth.BluetoothManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.activity.k;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.n;
import androidx.fragment.app.q;
import androidx.fragment.app.r;
import bi.z0;
import com.github.kilnn.tool.widget.bottomsheet.RatioBottomSheetLayout;
import com.github.kilnn.tool.widget.preference.PreferenceRelativeLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.snackbar.Snackbar;
import com.topstep.fitcloud.pro.databinding.FragmentDeviceBindBinding;
import com.topstep.fitcloud.pro.ui.MainActivity;
import com.topstep.fitcloudpro.R;
import d7.d;
import fm.p;
import gm.b0;
import gm.l;
import gm.m;
import kotlin.Metadata;
import og.t;
import pm.e0;
import sm.f1;
import uh.a0;
import uh.i;
import uh.s;
import uh.y;
import uh.z;

@Metadata
/* loaded from: classes2.dex */
public final class DeviceBindFragment extends s implements d.a, i.a {
    public static final /* synthetic */ mm.h<Object>[] E0;
    public final a0 A0;
    public final tl.i B0;
    public Snackbar C0;
    public final q D0;

    /* renamed from: t0 */
    public final int f10797t0;

    /* renamed from: u0 */
    public final i2.g f10798u0;

    /* renamed from: v0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10799v0;

    /* renamed from: w0 */
    public final tl.d f10800w0;

    /* renamed from: x0 */
    public boolean f10801x0;

    /* renamed from: y0 */
    public t f10802y0;

    /* renamed from: z0 */
    public final y f10803z0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements fm.a<BluetoothManager> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(0);
            DeviceBindFragment.this = r1;
        }

        @Override // fm.a
        public final BluetoothManager m() {
            Object systemService = DeviceBindFragment.this.V0().getSystemService("bluetooth");
            l.d(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
            return (BluetoothManager) systemService;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends k {
        public b() {
            super(true);
        }

        @Override // androidx.activity.k
        public final void a() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends BottomSheetBehavior.c {
        public c() {
            DeviceBindFragment.this = r1;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void a(View view, float f10) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void b(View view, int i10) {
            if (i10 == 3) {
                DeviceBindFragment.h1(DeviceBindFragment.this, false);
            }
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.bind.DeviceBindFragment$onViewCreated$5", f = "DeviceBindFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10806e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.bind.DeviceBindFragment$onViewCreated$5$1", f = "DeviceBindFragment.kt", l = {266}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10808e;

            /* renamed from: f */
            public final /* synthetic */ DeviceBindFragment f10809f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.bind.DeviceBindFragment$d$a$a */
            /* loaded from: classes2.dex */
            public static final class C0157a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ DeviceBindFragment f10810a;

                public C0157a(DeviceBindFragment deviceBindFragment) {
                    this.f10810a = deviceBindFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    if (((wf.b) obj) == wf.b.CONNECTED) {
                        DeviceBindFragment deviceBindFragment = this.f10810a;
                        mm.h<Object>[] hVarArr = DeviceBindFragment.E0;
                        d7.e.h(deviceBindFragment.f1(), R.string.device_bind_success, true, this.f10810a.f10797t0, 12);
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DeviceBindFragment deviceBindFragment, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f10809f = deviceBindFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                ((a) p(e0Var, dVar)).t(tl.l.f28297a);
                return yl.a.COROUTINE_SUSPENDED;
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f10809f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10808e;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mf.a0.k(obj);
                } else {
                    mf.a0.k(obj);
                    t tVar = this.f10809f.f10802y0;
                    if (tVar != null) {
                        f1<wf.b> J = tVar.J();
                        C0157a c0157a = new C0157a(this.f10809f);
                        this.f10808e = 1;
                        if (J.a(c0157a, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        l.l("deviceManager");
                        throw null;
                    }
                }
                throw new u2.b();
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.bind.DeviceBindFragment$onViewCreated$5$2", f = "DeviceBindFragment.kt", l = {277}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10811e;

            /* renamed from: f */
            public final /* synthetic */ DeviceBindFragment f10812f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ DeviceBindFragment f10813a;

                public a(DeviceBindFragment deviceBindFragment) {
                    this.f10813a = deviceBindFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    int i10;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    DeviceBindFragment deviceBindFragment = this.f10813a;
                    mm.h<Object>[] hVarArr = DeviceBindFragment.E0;
                    PreferenceRelativeLayout preferenceRelativeLayout = deviceBindFragment.k1().layoutLocationService;
                    l.e(preferenceRelativeLayout, "viewBind.layoutLocationService");
                    if (!booleanValue) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    preferenceRelativeLayout.setVisibility(i10);
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(DeviceBindFragment deviceBindFragment, xl.d<? super b> dVar) {
                super(2, dVar);
                this.f10812f = deviceBindFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new b(this.f10812f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10811e;
                if (i10 == 0) {
                    mf.a0.k(obj);
                    sm.b e10 = qi.h.e(this.f10812f.V0());
                    a aVar2 = new a(this.f10812f);
                    this.f10811e = 1;
                    if (e10.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    mf.a0.k(obj);
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            DeviceBindFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((d) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f10806e = obj;
            return dVar2;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            e0 e0Var = (e0) this.f10806e;
            z0.g(e0Var, null, 0, new a(DeviceBindFragment.this, null), 3);
            if (Build.VERSION.SDK_INT < 31) {
                z0.g(e0Var, null, 0, new b(DeviceBindFragment.this, null), 3);
            } else {
                DeviceBindFragment deviceBindFragment = DeviceBindFragment.this;
                mm.h<Object>[] hVarArr = DeviceBindFragment.E0;
                PreferenceRelativeLayout preferenceRelativeLayout = deviceBindFragment.k1().layoutLocationService;
                l.e(preferenceRelativeLayout, "viewBind.layoutLocationService");
                preferenceRelativeLayout.setVisibility(8);
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends m implements fm.l<MaterialToolbar, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e() {
            super(1);
            DeviceBindFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(MaterialToolbar materialToolbar) {
            l.f(materialToolbar, "it");
            DeviceBindFragment deviceBindFragment = DeviceBindFragment.this;
            mm.h<Object>[] hVarArr = DeviceBindFragment.E0;
            deviceBindFragment.l1();
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements y.c {
        public f() {
            DeviceBindFragment.this = r1;
        }

        @Override // uh.y.c
        public final void a(z zVar) {
            DeviceBindFragment deviceBindFragment = DeviceBindFragment.this;
            String str = zVar.f28819a;
            String str2 = zVar.f28820b;
            mm.h<Object>[] hVarArr = DeviceBindFragment.E0;
            deviceBindFragment.m1(str, str2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements a0.b {
        public g() {
            DeviceBindFragment.this = r1;
        }

        @Override // uh.a0.b
        public final void a(z zVar) {
            DeviceBindFragment deviceBindFragment = DeviceBindFragment.this;
            String str = zVar.f28819a;
            String str2 = zVar.f28820b;
            mm.h<Object>[] hVarArr = DeviceBindFragment.E0;
            deviceBindFragment.m1(str, str2);
        }

        @Override // uh.a0.b
        public final void b(int i10, int i11) {
            ViewPropertyAnimator duration;
            float f10;
            DeviceBindFragment deviceBindFragment = DeviceBindFragment.this;
            mm.h<Object>[] hVarArr = DeviceBindFragment.E0;
            ViewPropertyAnimator animate = deviceBindFragment.k1().layoutTips.animate();
            if (i10 == 0 && i11 > 0) {
                animate.cancel();
                duration = animate.setDuration(3000L);
                f10 = 0.1f;
            } else if (i10 > 0 && i11 == 0) {
                animate.cancel();
                duration = animate.setDuration(500L);
                f10 = 0.5f;
            } else {
                return;
            }
            duration.alpha(f10).start();
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends m implements fm.a<ScannerHelper> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h() {
            super(0);
            DeviceBindFragment.this = r1;
        }

        @Override // fm.a
        public final ScannerHelper m() {
            ScannerHelper scannerHelper = new ScannerHelper(DeviceBindFragment.this.V0(), (BluetoothManager) DeviceBindFragment.this.f10800w0.getValue());
            scannerHelper.f10861h = new com.topstep.fitcloud.pro.ui.device.bind.a(DeviceBindFragment.this);
            return scannerHelper;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends m implements fm.a<Bundle> {

        /* renamed from: b */
        public final /* synthetic */ r f10818b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(r rVar) {
            super(0);
            this.f10818b = rVar;
        }

        @Override // fm.a
        public final Bundle m() {
            Bundle bundle = this.f10818b.f2516f;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(n.a(android.support.v4.media.d.a("Fragment "), this.f10818b, " has null arguments"));
        }
    }

    static {
        gm.t tVar = new gm.t(DeviceBindFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentDeviceBindBinding;", 0);
        b0.f15488a.getClass();
        E0 = new mm.h[]{tVar};
    }

    public DeviceBindFragment() {
        super(R.layout.fragment_device_bind);
        this.f10797t0 = 1;
        this.f10798u0 = new i2.g(b0.a(uh.f.class), new i(this));
        this.f10799v0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentDeviceBindBinding.class, this);
        this.f10800w0 = fb.e.a(new a());
        y yVar = new y();
        yVar.f28815h = new f();
        this.f10803z0 = yVar;
        a0 a0Var = new a0();
        a0Var.f28740e = new g();
        this.A0 = a0Var;
        this.B0 = new tl.i(new h());
        this.D0 = R0(new uh.b(this), new e.d());
    }

    public static final void h1(DeviceBindFragment deviceBindFragment, boolean z10) {
        if (z10) {
            if (!si.f.f27071a.b(deviceBindFragment.V0())) {
                return;
            }
        } else {
            deviceBindFragment.getClass();
        }
        si.f.f27071a.f(deviceBindFragment, new uh.b(deviceBindFragment));
    }

    public static BottomSheetBehavior j1(RatioBottomSheetLayout ratioBottomSheetLayout) {
        CoordinatorLayout.c behavior = ratioBottomSheetLayout.getBehavior();
        l.d(behavior, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetBehavior<@[FlexibleNullability] android.view.View?>");
        return (BottomSheetBehavior) behavior;
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        boolean z10;
        super.B0(bundle);
        if (i1().f28750a) {
            String str = i1().f28751b;
            if (str != null && str.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                T0().f705h.a(this, new b());
            }
        }
    }

    @Override // uh.i.a
    public final void L() {
        tb.a.f(this).n(new i2.a(R.id.toConnectHelp));
    }

    @Override // androidx.fragment.app.r
    public final void N0() {
        this.E = true;
        Snackbar snackbar = this.C0;
        if (snackbar != null) {
            snackbar.b(3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0110  */
    @Override // lh.c, androidx.fragment.app.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O0(android.view.View r4, android.os.Bundle r5) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.device.bind.DeviceBindFragment.O0(android.view.View, android.os.Bundle):void");
    }

    @Override // uh.i.a
    public final void d() {
        tb.a.f(this).n(new i2.a(R.id.toBgRunSettings));
    }

    @Override // d7.d.a
    public final void g(int i10) {
        if (i10 == this.f10797t0) {
            if (i1().f28750a) {
                int i11 = MainActivity.E;
                MainActivity.a.a(V0());
                T0().finish();
                return;
            }
            tb.a.f(this).q(R.id.deviceFragment, false);
        }
    }

    public final uh.f i1() {
        return (uh.f) this.f10798u0.getValue();
    }

    public final FragmentDeviceBindBinding k1() {
        return (FragmentDeviceBindBinding) this.f10799v0.a(this, E0[0]);
    }

    public final void l1() {
        RatioBottomSheetLayout ratioBottomSheetLayout = k1().bottomSheetLayout;
        l.e(ratioBottomSheetLayout, "viewBind.bottomSheetLayout");
        BottomSheetBehavior j12 = j1(ratioBottomSheetLayout);
        int i10 = j12.J;
        if (i10 == 4) {
            j12.C(3);
        } else if (i10 == 3) {
            j12.C(4);
        }
    }

    public final void m1(String str, String str2) {
        boolean z10;
        j jVar = ((ScannerHelper) this.B0.getValue()).f10858e;
        if (jVar != null) {
            xk.b.a(jVar);
        }
        t tVar = this.f10802y0;
        if (tVar != null) {
            if (str2 != null && str2.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                str2 = "Unknown";
            }
            tVar.A(str, str2);
            new uh.i().h1(h0(), null);
            return;
        }
        l.l("deviceManager");
        throw null;
    }
}
