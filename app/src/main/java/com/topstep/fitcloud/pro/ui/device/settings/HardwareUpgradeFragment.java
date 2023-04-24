package com.topstep.fitcloud.pro.ui.device.settings;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import androidx.activity.k;
import androidx.fragment.app.q;
import androidx.fragment.app.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import bi.x;
import bi.z0;
import com.github.kilnn.tool.widget.preference.PreferenceRelativeLayout;
import com.topstep.fitcloud.pro.databinding.FragmentHardwareUpgradeBinding;
import com.topstep.fitcloud.pro.model.version.HardwareUpgradeInfo;
import com.topstep.fitcloud.pro.ui.device.dial.DfuViewModel;
import com.topstep.fitcloud.pro.ui.widget.UpgradeProgressLayout;
import com.topstep.fitcloudpro.R;
import d2.a;
import fm.l;
import fm.p;
import gm.b0;
import gm.j;
import gm.m;
import gm.t;
import ij.c;
import kotlin.Metadata;
import mf.a0;
import nh.c;
import pm.e0;
import s.c0;
import s.i;
import s.m1;

@Metadata
/* loaded from: classes2.dex */
public final class HardwareUpgradeFragment extends x {

    /* renamed from: y0 */
    public static final /* synthetic */ mm.h<Object>[] f11129y0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11130t0;

    /* renamed from: u0 */
    public final t0 f11131u0;

    /* renamed from: v0 */
    public HardwareUpgradeInfo f11132v0;

    /* renamed from: w0 */
    public boolean f11133w0;

    /* renamed from: x0 */
    public final q f11134x0;

    /* loaded from: classes2.dex */
    public static final class a extends k {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(true);
            HardwareUpgradeFragment.this = r1;
        }

        @Override // androidx.activity.k
        public final void a() {
            HardwareUpgradeInfo hardwareUpgradeInfo = HardwareUpgradeFragment.this.f11132v0;
            boolean z10 = true;
            if ((hardwareUpgradeInfo == null || !hardwareUpgradeInfo.isForce()) ? false : false) {
                HardwareUpgradeFragment hardwareUpgradeFragment = HardwareUpgradeFragment.this;
                if (!hardwareUpgradeFragment.f11133w0) {
                    d7.e.f(hardwareUpgradeFragment.f1(), R.string.version_hardware_update);
                    return;
                }
            }
            tb.a.f(HardwareUpgradeFragment.this).o();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements l<Button, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(1);
            HardwareUpgradeFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Button button) {
            gm.l.f(button, "it");
            si.f fVar = si.f.f27071a;
            HardwareUpgradeFragment hardwareUpgradeFragment = HardwareUpgradeFragment.this;
            fVar.f(hardwareUpgradeFragment, new i(10, hardwareUpgradeFragment));
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.settings.HardwareUpgradeFragment$onViewCreated$4", f = "HardwareUpgradeFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11137e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.settings.HardwareUpgradeFragment$onViewCreated$4$1", f = "HardwareUpgradeFragment.kt", l = {100}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11139e;

            /* renamed from: f */
            public final /* synthetic */ HardwareUpgradeFragment f11140f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.HardwareUpgradeFragment$c$a$a */
            /* loaded from: classes2.dex */
            public static final class C0175a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ HardwareUpgradeFragment f11141a;

                public C0175a(HardwareUpgradeFragment hardwareUpgradeFragment) {
                    this.f11141a = hardwareUpgradeFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    c.a aVar = (c.a) obj;
                    switch (c0.b(aVar.f17044a)) {
                        case 0:
                            HardwareUpgradeFragment hardwareUpgradeFragment = this.f11141a;
                            mm.h<Object>[] hVarArr = HardwareUpgradeFragment.f11129y0;
                            hardwareUpgradeFragment.h1().btnUpgrade.setEnabled(true);
                            UpgradeProgressLayout upgradeProgressLayout = this.f11141a.h1().layoutUpgradeProgress;
                            upgradeProgressLayout.f12480g.clearAnimation();
                            upgradeProgressLayout.f12481h.setText((CharSequence) null);
                            break;
                        case 1:
                        case 2:
                        case 3:
                            HardwareUpgradeFragment hardwareUpgradeFragment2 = this.f11141a;
                            mm.h<Object>[] hVarArr2 = HardwareUpgradeFragment.f11129y0;
                            hardwareUpgradeFragment2.h1().btnUpgrade.setEnabled(false);
                            UpgradeProgressLayout upgradeProgressLayout2 = this.f11141a.h1().layoutUpgradeProgress;
                            upgradeProgressLayout2.f12479f = 0;
                            upgradeProgressLayout2.f12481h.setText("...");
                            if (upgradeProgressLayout2.f12480g.getAnimation() == null) {
                                upgradeProgressLayout2.f12480g.startAnimation(AnimationUtils.loadAnimation(upgradeProgressLayout2.getContext(), R.anim.upgrade_icon_flip));
                            }
                            upgradeProgressLayout2.invalidate();
                            break;
                        case 4:
                            HardwareUpgradeFragment hardwareUpgradeFragment3 = this.f11141a;
                            mm.h<Object>[] hVarArr3 = HardwareUpgradeFragment.f11129y0;
                            hardwareUpgradeFragment3.h1().btnUpgrade.setEnabled(false);
                            this.f11141a.h1().layoutUpgradeProgress.setStateProgress(aVar.f17045b);
                            break;
                        case 5:
                            HardwareUpgradeFragment hardwareUpgradeFragment4 = this.f11141a;
                            mm.h<Object>[] hVarArr4 = HardwareUpgradeFragment.f11129y0;
                            hardwareUpgradeFragment4.h1().btnUpgrade.setEnabled(true);
                            this.f11141a.h1().layoutUpgradeProgress.setStateStop(true);
                            break;
                        case 6:
                            HardwareUpgradeFragment hardwareUpgradeFragment5 = this.f11141a;
                            mm.h<Object>[] hVarArr5 = HardwareUpgradeFragment.f11129y0;
                            hardwareUpgradeFragment5.h1().btnUpgrade.setEnabled(true);
                            this.f11141a.h1().layoutUpgradeProgress.setStateStop(false);
                            break;
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HardwareUpgradeFragment hardwareUpgradeFragment, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f11140f = hardwareUpgradeFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f11140f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11139e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    HardwareUpgradeFragment hardwareUpgradeFragment = this.f11140f;
                    mm.h<Object>[] hVarArr = HardwareUpgradeFragment.f11129y0;
                    sm.b e10 = ((DfuViewModel) hardwareUpgradeFragment.f11131u0.getValue()).e();
                    C0175a c0175a = new C0175a(this.f11140f);
                    this.f11139e = 1;
                    if (e10.a(c0175a, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.settings.HardwareUpgradeFragment$onViewCreated$4$2", f = "HardwareUpgradeFragment.kt", l = {126}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11142e;

            /* renamed from: f */
            public final /* synthetic */ HardwareUpgradeFragment f11143f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ HardwareUpgradeFragment f11144a;

                public a(HardwareUpgradeFragment hardwareUpgradeFragment) {
                    this.f11144a = hardwareUpgradeFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    nh.c cVar = (nh.c) obj;
                    if (cVar instanceof c.b) {
                        this.f11144a.f11133w0 = true;
                    } else if (cVar instanceof c.a) {
                        HardwareUpgradeFragment hardwareUpgradeFragment = this.f11144a;
                        mm.h<Object>[] hVarArr = HardwareUpgradeFragment.f11129y0;
                        h7.a.v(hardwareUpgradeFragment.f1(), this.f11144a.V0(), ((c.a) cVar).f22380a);
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(HardwareUpgradeFragment hardwareUpgradeFragment, xl.d<? super b> dVar) {
                super(2, dVar);
                this.f11143f = hardwareUpgradeFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new b(this.f11143f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11142e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    HardwareUpgradeFragment hardwareUpgradeFragment = this.f11143f;
                    mm.h<Object>[] hVarArr = HardwareUpgradeFragment.f11129y0;
                    sm.c cVar = ((DfuViewModel) hardwareUpgradeFragment.f11131u0.getValue()).f10912g;
                    a aVar2 = new a(this.f11143f);
                    this.f11142e = 1;
                    if (cVar.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.settings.HardwareUpgradeFragment$onViewCreated$4$3", f = "HardwareUpgradeFragment.kt", l = {139}, m = "invokeSuspend")
        /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.HardwareUpgradeFragment$c$c */
        /* loaded from: classes2.dex */
        public static final class C0176c extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11145e;

            /* renamed from: f */
            public final /* synthetic */ HardwareUpgradeFragment f11146f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.HardwareUpgradeFragment$c$c$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ HardwareUpgradeFragment f11147a;

                public a(HardwareUpgradeFragment hardwareUpgradeFragment) {
                    this.f11147a = hardwareUpgradeFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    int i10;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    HardwareUpgradeFragment hardwareUpgradeFragment = this.f11147a;
                    mm.h<Object>[] hVarArr = HardwareUpgradeFragment.f11129y0;
                    PreferenceRelativeLayout preferenceRelativeLayout = hardwareUpgradeFragment.h1().layoutLocationService;
                    gm.l.e(preferenceRelativeLayout, "viewBind.layoutLocationService");
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
            public C0176c(HardwareUpgradeFragment hardwareUpgradeFragment, xl.d<? super C0176c> dVar) {
                super(2, dVar);
                this.f11146f = hardwareUpgradeFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((C0176c) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new C0176c(this.f11146f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11145e;
                if (i10 == 0) {
                    a0.k(obj);
                    sm.b e10 = qi.h.e(this.f11146f.V0());
                    a aVar2 = new a(this.f11146f);
                    this.f11145e = 1;
                    if (e10.a(aVar2, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(2, dVar);
            HardwareUpgradeFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((c) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f11137e = obj;
            return cVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f11137e;
            z0.g(e0Var, null, 0, new a(HardwareUpgradeFragment.this, null), 3);
            z0.g(e0Var, null, 0, new b(HardwareUpgradeFragment.this, null), 3);
            if (Build.VERSION.SDK_INT < 31) {
                z0.g(e0Var, null, 0, new C0176c(HardwareUpgradeFragment.this, null), 3);
            } else {
                HardwareUpgradeFragment hardwareUpgradeFragment = HardwareUpgradeFragment.this;
                mm.h<Object>[] hVarArr = HardwareUpgradeFragment.f11129y0;
                PreferenceRelativeLayout preferenceRelativeLayout = hardwareUpgradeFragment.h1().layoutLocationService;
                gm.l.e(preferenceRelativeLayout, "viewBind.layoutLocationService");
                preferenceRelativeLayout.setVisibility(8);
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f11148b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(r rVar) {
            super(0);
            this.f11148b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f11148b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f11149b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f11149b = dVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f11149b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11150b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(tl.d dVar) {
            super(0);
            this.f11150b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f11150b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11151b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(tl.d dVar) {
            super(0);
            this.f11151b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f11151b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f11152b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11153c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(r rVar, tl.d dVar) {
            super(0);
            this.f11152b = rVar;
            this.f11153c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f11153c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f11152b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(HardwareUpgradeFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentHardwareUpgradeBinding;", 0);
        b0.f15488a.getClass();
        f11129y0 = new mm.h[]{tVar};
    }

    public HardwareUpgradeFragment() {
        super(R.layout.fragment_hardware_upgrade);
        this.f11130t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentHardwareUpgradeBinding.class, this);
        tl.d a10 = fb.e.a(new e(new d(this)));
        this.f11131u0 = ab.b.f(this, b0.a(DfuViewModel.class), new f(a10), new g(a10), new h(this, a10));
        this.f11134x0 = R0(new m1(12, this), new e.d());
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        HardwareUpgradeInfo hardwareUpgradeInfo;
        super.B0(bundle);
        Bundle g02 = g0();
        if (g02 != null) {
            hardwareUpgradeInfo = (HardwareUpgradeInfo) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) g02.getParcelable("parcelArgs", HardwareUpgradeInfo.class) : g02.getParcelable("parcelArgs"));
        } else {
            hardwareUpgradeInfo = null;
        }
        this.f11132v0 = hardwareUpgradeInfo;
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        T0().f705h.a(q0(), new a());
        h1().toolbar.setNavigationOnClickListener(new rh.k(3, this));
        HardwareUpgradeInfo hardwareUpgradeInfo = this.f11132v0;
        if (hardwareUpgradeInfo == null) {
            h1().btnUpgrade.setText(R.string.version_upgrade);
        } else {
            h1().btnUpgrade.setText(p0(R.string.version_upgrade_param, n6.a0.f(hardwareUpgradeInfo.getSize(), false)));
            h1().tvVersion.setText(j.k(hardwareUpgradeInfo.getHardwareInfo()));
            h1().tvContent.setText(hardwareUpgradeInfo.getRemark());
        }
        p.b.g(h1().btnUpgrade, new b());
        qi.h.k(qi.h.i(this), new c(null));
    }

    public final FragmentHardwareUpgradeBinding h1() {
        return (FragmentHardwareUpgradeBinding) this.f11130t0.a(this, f11129y0[0]);
    }
}
