package com.topstep.fitcloud.pro.ui.device.settings;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.m0;
import bi.y;
import bi.z0;
import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.topstep.fitcloud.pro.databinding.FragmentHealthMonitorBinding;
import com.topstep.fitcloud.pro.ui.dialog.SelectIntDialogFragment;
import com.topstep.fitcloud.pro.ui.dialog.TimePickerDialogFragment;
import com.topstep.fitcloudpro.R;
import fl.k;
import fm.l;
import fm.p;
import gm.b0;
import gm.m;
import ih.v;
import jj.l;
import jj.w;
import kotlin.Metadata;
import mf.a0;
import mm.h;
import nj.f;
import og.t;
import og.x0;
import pm.e0;
import sm.g;
import xl.d;
import zl.e;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class HealthMonitorFragment extends y implements CompoundButton.OnCheckedChangeListener, TimePickerDialogFragment.b, SelectIntDialogFragment.b {

    /* renamed from: v0 */
    public static final /* synthetic */ h<Object>[] f11154v0;

    /* renamed from: r0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11155r0;

    /* renamed from: s0 */
    public t f11156s0;

    /* renamed from: t0 */
    public f f11157t0;

    /* renamed from: u0 */
    public final a f11158u0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            HealthMonitorFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            i2.m f10;
            i2.a aVar;
            View view2 = view;
            gm.l.f(view2, "view");
            HealthMonitorFragment healthMonitorFragment = HealthMonitorFragment.this;
            h<Object>[] hVarArr = HealthMonitorFragment.f11154v0;
            if (gm.l.a(view2, healthMonitorFragment.g1().itemStartTime)) {
                HealthMonitorFragment healthMonitorFragment2 = HealthMonitorFragment.this;
                f fVar = healthMonitorFragment2.f11157t0;
                if (fVar != null) {
                    m0.F(fVar.g(), healthMonitorFragment2);
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else if (gm.l.a(view2, HealthMonitorFragment.this.g1().itemEndTime)) {
                HealthMonitorFragment healthMonitorFragment3 = HealthMonitorFragment.this;
                f fVar2 = healthMonitorFragment3.f11157t0;
                if (fVar2 != null) {
                    m0.D(fVar2.f(), healthMonitorFragment3);
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else {
                if (gm.l.a(view2, HealthMonitorFragment.this.g1().itemHeartRateAlarm)) {
                    f10 = tb.a.f(HealthMonitorFragment.this);
                    aVar = new i2.a(R.id.toHeartRateAlarm);
                } else if (gm.l.a(view2, HealthMonitorFragment.this.g1().itemBloodPressureAlarm)) {
                    f10 = tb.a.f(HealthMonitorFragment.this);
                    aVar = new i2.a(R.id.toBloodPressureAlarm);
                }
                v.l(f10, aVar);
            }
            return tl.l.f28297a;
        }
    }

    @e(c = "com.topstep.fitcloud.pro.ui.device.settings.HealthMonitorFragment$onViewCreated$1", f = "HealthMonitorFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<e0, d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11160e;

        @e(c = "com.topstep.fitcloud.pro.ui.device.settings.HealthMonitorFragment$onViewCreated$1$1", f = "HealthMonitorFragment.kt", l = {49}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i implements p<e0, d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11162e;

            /* renamed from: f */
            public final /* synthetic */ HealthMonitorFragment f11163f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.HealthMonitorFragment$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C0177a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ HealthMonitorFragment f11164a;

                public C0177a(HealthMonitorFragment healthMonitorFragment) {
                    this.f11164a = healthMonitorFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, d dVar) {
                    int i10;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    HealthMonitorFragment healthMonitorFragment = this.f11164a;
                    h<Object>[] hVarArr = HealthMonitorFragment.f11154v0;
                    LinearLayout linearLayout = healthMonitorFragment.g1().layoutContent;
                    gm.l.e(linearLayout, "viewBind.layoutContent");
                    qi.h.m(linearLayout, booleanValue);
                    PreferenceItem preferenceItem = this.f11164a.g1().itemHeartRateAlarm;
                    gm.l.e(preferenceItem, "viewBind.itemHeartRateAlarm");
                    int i11 = 0;
                    if (this.f11164a.f1().D().c().g(260)) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    preferenceItem.setVisibility(i10);
                    PreferenceItem preferenceItem2 = this.f11164a.g1().itemBloodPressureAlarm;
                    gm.l.e(preferenceItem2, "viewBind.itemBloodPressureAlarm");
                    if (!this.f11164a.f1().D().c().g(261)) {
                        i11 = 8;
                    }
                    preferenceItem2.setVisibility(i11);
                    this.f11164a.i1();
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HealthMonitorFragment healthMonitorFragment, d<? super a> dVar) {
                super(2, dVar);
                this.f11163f = healthMonitorFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final d<tl.l> p(Object obj, d<?> dVar) {
                return new a(this.f11163f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11162e;
                if (i10 == 0) {
                    a0.k(obj);
                    sm.f<Boolean> a10 = x0.a(this.f11163f.f1());
                    C0177a c0177a = new C0177a(this.f11163f);
                    this.f11162e = 1;
                    if (a10.a(c0177a, this) == aVar) {
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

        @e(c = "com.topstep.fitcloud.pro.ui.device.settings.HealthMonitorFragment$onViewCreated$1$2", f = "HealthMonitorFragment.kt", l = {57}, m = "invokeSuspend")
        /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.HealthMonitorFragment$b$b */
        /* loaded from: classes2.dex */
        public static final class C0178b extends i implements p<e0, d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11165e;

            /* renamed from: f */
            public final /* synthetic */ HealthMonitorFragment f11166f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.HealthMonitorFragment$b$b$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ HealthMonitorFragment f11167a;

                public a(HealthMonitorFragment healthMonitorFragment) {
                    this.f11167a = healthMonitorFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, d dVar) {
                    f fVar = (f) obj;
                    f fVar2 = this.f11167a.f11157t0;
                    if (fVar2 != null) {
                        if (!gm.l.a(fVar2, fVar)) {
                            HealthMonitorFragment healthMonitorFragment = this.f11167a;
                            healthMonitorFragment.f11157t0 = fVar;
                            healthMonitorFragment.i1();
                        }
                        return tl.l.f28297a;
                    }
                    gm.l.l("config");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0178b(HealthMonitorFragment healthMonitorFragment, d<? super C0178b> dVar) {
                super(2, dVar);
                this.f11166f = healthMonitorFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, d<? super tl.l> dVar) {
                return ((C0178b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final d<tl.l> p(Object obj, d<?> dVar) {
                return new C0178b(this.f11166f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11165e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    jj.l lVar = (jj.l) this.f11166f.f1().D().f23334a;
                    ql.b<Byte> bVar = lVar.f17932f;
                    l.d dVar = new l.d(new jj.t((byte) 36));
                    bVar.getClass();
                    sm.b d10 = qi.h.d(new k(new fl.t(bVar, dVar).u(new l.c(new w(lVar)))));
                    a aVar2 = new a(this.f11166f);
                    this.f11165e = 1;
                    if (d10.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d<? super b> dVar) {
            super(2, dVar);
            HealthMonitorFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final d<tl.l> p(Object obj, d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f11160e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f11160e;
            z0.g(e0Var, null, 0, new a(HealthMonitorFragment.this, null), 3);
            z0.g(e0Var, null, 0, new C0178b(HealthMonitorFragment.this, null), 3);
            return tl.l.f28297a;
        }
    }

    static {
        gm.t tVar = new gm.t(HealthMonitorFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentHealthMonitorBinding;", 0);
        b0.f15488a.getClass();
        f11154v0 = new h[]{tVar};
    }

    public HealthMonitorFragment() {
        super(R.layout.fragment_health_monitor);
        this.f11155r0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentHealthMonitorBinding.class, this);
        this.f11158u0 = new a();
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        this.f11157t0 = new f(((jj.l) f1().D().f23334a).f17931e.get((byte) 36));
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.TimePickerDialogFragment.b
    public final void H(int i10, String str) {
        if (gm.l.a("start_time", str) || gm.l.a("end_time", str)) {
            f fVar = this.f11157t0;
            if (fVar != null) {
                f.a v10 = v.v(fVar);
                if (gm.l.a("start_time", str)) {
                    if (i10 < 0) {
                        i10 = 0;
                    } else if (i10 > 1439) {
                        i10 = 1439;
                    }
                    byte[] bArr = v10.f21880b;
                    bArr[1] = (byte) ((i10 >> 8) & 255);
                    bArr[2] = (byte) (i10 & 255);
                } else {
                    if (i10 < 0) {
                        i10 = 0;
                    } else if (i10 > 1439) {
                        i10 = 1439;
                    }
                    byte[] bArr2 = v10.f21880b;
                    bArr2[3] = (byte) ((i10 >> 8) & 255);
                    bArr2[4] = (byte) (i10 & 255);
                }
                h1(new f(v10.f21880b));
                return;
            }
            gm.l.l("config");
            throw null;
        }
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.SelectIntDialogFragment.b
    public final void M(int i10, String str) {
        if (gm.l.a("interval", str)) {
            f fVar = this.f11157t0;
            if (fVar != null) {
                f.a v10 = v.v(fVar);
                if (i10 < 5) {
                    i10 = 5;
                } else if (i10 > 720) {
                    i10 = 720;
                }
                byte[] bArr = v10.f21880b;
                bArr[5] = (byte) ((i10 >> 8) & 255);
                bArr[6] = (byte) (i10 & 255);
                h1(new f(bArr));
                return;
            }
            gm.l.l("config");
            throw null;
        }
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        qi.h.k(qi.h.i(this), new b(null));
        g1().itemDetailEnabled.getSwitchView().setOnCheckedChangeListener(this);
        p.b.g(g1().itemStartTime, this.f11158u0);
        p.b.g(g1().itemEndTime, this.f11158u0);
        p.b.g(g1().itemHeartRateAlarm, this.f11158u0);
        p.b.g(g1().itemBloodPressureAlarm, this.f11158u0);
    }

    @Override // lh.c
    public final View c1(View view) {
        gm.l.f(view, "view");
        AppBarLayout appBarLayout = g1().appbar;
        gm.l.e(appBarLayout, "viewBind.appbar");
        return appBarLayout;
    }

    public final t f1() {
        t tVar = this.f11156s0;
        if (tVar != null) {
            return tVar;
        }
        gm.l.l("deviceManager");
        throw null;
    }

    public final FragmentHealthMonitorBinding g1() {
        return (FragmentHealthMonitorBinding) this.f11155r0.a(this, f11154v0[0]);
    }

    public final void h1(f fVar) {
        og.f D = f1().D();
        D.getClass();
        a0.j(D.f23335b, new og.g(D, fVar, null));
        this.f11157t0 = fVar;
        i1();
    }

    public final void i1() {
        boolean z10;
        boolean isEnabled = g1().layoutContent.isEnabled();
        SwitchMaterial switchView = g1().itemDetailEnabled.getSwitchView();
        f fVar = this.f11157t0;
        if (fVar != null) {
            byte[] bArr = fVar.f21878b;
            boolean z11 = true;
            boolean z12 = false;
            if (bArr != null && bArr[0] > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            switchView.setChecked(z10);
            if (isEnabled) {
                LinearLayout linearLayout = g1().layoutDetail;
                gm.l.e(linearLayout, "viewBind.layoutDetail");
                f fVar2 = this.f11157t0;
                if (fVar2 != null) {
                    byte[] bArr2 = fVar2.f21878b;
                    if (bArr2 != null) {
                        if (bArr2[0] <= 0) {
                            z11 = false;
                        }
                        z12 = z11;
                    }
                    qi.h.m(linearLayout, z12);
                } else {
                    gm.l.l("config");
                    throw null;
                }
            }
            TextView textView = g1().itemStartTime.getTextView();
            f fVar3 = this.f11157t0;
            if (fVar3 != null) {
                textView.setText(m0.y(fVar3.g()));
                TextView textView2 = g1().itemEndTime.getTextView();
                f fVar4 = this.f11157t0;
                if (fVar4 != null) {
                    textView2.setText(m0.y(fVar4.f()));
                    return;
                } else {
                    gm.l.l("config");
                    throw null;
                }
            }
            gm.l.l("config");
            throw null;
        }
        gm.l.l("config");
        throw null;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        gm.l.f(compoundButton, "buttonView");
        if (compoundButton.isPressed()) {
            f fVar = this.f11157t0;
            if (fVar != null) {
                byte[] bArr = v.v(fVar).f21880b;
                bArr[0] = z10 ? (byte) 1 : (byte) 0;
                h1(new f(bArr));
                return;
            }
            gm.l.l("config");
            throw null;
        }
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.SelectIntDialogFragment.b
    public final String q(int i10, String str) {
        return SelectIntDialogFragment.b.a.a(i10);
    }
}
