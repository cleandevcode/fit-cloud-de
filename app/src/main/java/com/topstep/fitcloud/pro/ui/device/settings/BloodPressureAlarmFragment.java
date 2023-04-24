package com.topstep.fitcloud.pro.ui.device.settings;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.t;
import bi.z0;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.topstep.fitcloud.pro.databinding.FragmentBloodPressureAlarmBinding;
import com.topstep.fitcloud.pro.ui.dialog.SelectIntDialogFragment;
import com.topstep.fitcloudpro.R;
import fl.k;
import fm.l;
import fm.p;
import gm.b0;
import gm.m;
import ih.v;
import jj.l;
import jj.r;
import kotlin.Metadata;
import mf.a0;
import mm.h;
import nj.a;
import og.c;
import og.x0;
import pm.e0;
import sm.f;
import sm.g;
import xl.d;
import zl.e;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class BloodPressureAlarmFragment extends t implements CompoundButton.OnCheckedChangeListener, SelectIntDialogFragment.b {
    public static final /* synthetic */ h<Object>[] B0;
    public final a A0;

    /* renamed from: r0 */
    public final int f11061r0;

    /* renamed from: s0 */
    public final int f11062s0;

    /* renamed from: t0 */
    public final int f11063t0;

    /* renamed from: u0 */
    public final int f11064u0;

    /* renamed from: v0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11065v0;

    /* renamed from: w0 */
    public og.t f11066w0;

    /* renamed from: x0 */
    public nj.a f11067x0;

    /* renamed from: y0 */
    public nj.b f11068y0;

    /* renamed from: z0 */
    public boolean f11069z0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            BloodPressureAlarmFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            View view2 = view;
            gm.l.f(view2, "view");
            BloodPressureAlarmFragment bloodPressureAlarmFragment = BloodPressureAlarmFragment.this;
            h<Object>[] hVarArr = BloodPressureAlarmFragment.B0;
            if (gm.l.a(view2, bloodPressureAlarmFragment.g1().itemSbpUpper)) {
                BloodPressureAlarmFragment bloodPressureAlarmFragment2 = BloodPressureAlarmFragment.this;
                nj.a aVar = bloodPressureAlarmFragment2.f11067x0;
                if (aVar != null) {
                    int i10 = aVar.i();
                    int i11 = SelectIntDialogFragment.C0;
                    SelectIntDialogFragment.a.a(90, 180, 1, i10, bloodPressureAlarmFragment2.o0(R.string.ds_blood_pressure_alarm_sbp_upper), bloodPressureAlarmFragment2.o0(R.string.unit_mmhg)).h1(bloodPressureAlarmFragment2.h0(), "sbp_upper");
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else if (gm.l.a(view2, BloodPressureAlarmFragment.this.g1().itemSbpLower)) {
                BloodPressureAlarmFragment bloodPressureAlarmFragment3 = BloodPressureAlarmFragment.this;
                nj.a aVar2 = bloodPressureAlarmFragment3.f11067x0;
                if (aVar2 != null) {
                    int h10 = aVar2.h();
                    int i12 = SelectIntDialogFragment.C0;
                    SelectIntDialogFragment.a.a(60, 120, 1, h10, bloodPressureAlarmFragment3.o0(R.string.ds_blood_pressure_alarm_sbp_lower), bloodPressureAlarmFragment3.o0(R.string.unit_mmhg)).h1(bloodPressureAlarmFragment3.h0(), "sbp_lower");
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else if (gm.l.a(view2, BloodPressureAlarmFragment.this.g1().itemDbpUpper)) {
                BloodPressureAlarmFragment bloodPressureAlarmFragment4 = BloodPressureAlarmFragment.this;
                nj.a aVar3 = bloodPressureAlarmFragment4.f11067x0;
                if (aVar3 != null) {
                    int g10 = aVar3.g();
                    int i13 = SelectIntDialogFragment.C0;
                    SelectIntDialogFragment.a.a(60, 120, 1, g10, bloodPressureAlarmFragment4.o0(R.string.ds_blood_pressure_alarm_dbp_upper), bloodPressureAlarmFragment4.o0(R.string.unit_mmhg)).h1(bloodPressureAlarmFragment4.h0(), "dbp_upper");
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else if (gm.l.a(view2, BloodPressureAlarmFragment.this.g1().itemDbpLower)) {
                BloodPressureAlarmFragment bloodPressureAlarmFragment5 = BloodPressureAlarmFragment.this;
                nj.a aVar4 = bloodPressureAlarmFragment5.f11067x0;
                if (aVar4 != null) {
                    int f10 = aVar4.f();
                    int i14 = SelectIntDialogFragment.C0;
                    SelectIntDialogFragment.a.a(40, 100, 1, f10, bloodPressureAlarmFragment5.o0(R.string.ds_blood_pressure_alarm_dbp_lower), bloodPressureAlarmFragment5.o0(R.string.unit_mmhg)).h1(bloodPressureAlarmFragment5.h0(), "dbp_lower");
                } else {
                    gm.l.l("config");
                    throw null;
                }
            }
            return tl.l.f28297a;
        }
    }

    @e(c = "com.topstep.fitcloud.pro.ui.device.settings.BloodPressureAlarmFragment$onViewCreated$1", f = "BloodPressureAlarmFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<e0, d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11071e;

        @e(c = "com.topstep.fitcloud.pro.ui.device.settings.BloodPressureAlarmFragment$onViewCreated$1$1", f = "BloodPressureAlarmFragment.kt", l = {58}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i implements p<e0, d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11073e;

            /* renamed from: f */
            public final /* synthetic */ BloodPressureAlarmFragment f11074f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.BloodPressureAlarmFragment$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C0171a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ BloodPressureAlarmFragment f11075a;

                public C0171a(BloodPressureAlarmFragment bloodPressureAlarmFragment) {
                    this.f11075a = bloodPressureAlarmFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, d dVar) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    BloodPressureAlarmFragment bloodPressureAlarmFragment = this.f11075a;
                    h<Object>[] hVarArr = BloodPressureAlarmFragment.B0;
                    LinearLayout linearLayout = bloodPressureAlarmFragment.g1().layoutContent;
                    gm.l.e(linearLayout, "viewBind.layoutContent");
                    qi.h.m(linearLayout, booleanValue);
                    this.f11075a.i1();
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BloodPressureAlarmFragment bloodPressureAlarmFragment, d<? super a> dVar) {
                super(2, dVar);
                this.f11074f = bloodPressureAlarmFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final d<tl.l> p(Object obj, d<?> dVar) {
                return new a(this.f11074f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11073e;
                if (i10 == 0) {
                    a0.k(obj);
                    f<Boolean> a10 = x0.a(this.f11074f.f1());
                    C0171a c0171a = new C0171a(this.f11074f);
                    this.f11073e = 1;
                    if (a10.a(c0171a, this) == aVar) {
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

        @e(c = "com.topstep.fitcloud.pro.ui.device.settings.BloodPressureAlarmFragment$onViewCreated$1$2", f = "BloodPressureAlarmFragment.kt", l = {64}, m = "invokeSuspend")
        /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.BloodPressureAlarmFragment$b$b */
        /* loaded from: classes2.dex */
        public static final class C0172b extends i implements p<e0, d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11076e;

            /* renamed from: f */
            public final /* synthetic */ BloodPressureAlarmFragment f11077f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.BloodPressureAlarmFragment$b$b$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ BloodPressureAlarmFragment f11078a;

                public a(BloodPressureAlarmFragment bloodPressureAlarmFragment) {
                    this.f11078a = bloodPressureAlarmFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, d dVar) {
                    nj.a aVar = (nj.a) obj;
                    nj.a aVar2 = this.f11078a.f11067x0;
                    if (aVar2 != null) {
                        if (!gm.l.a(aVar2, aVar)) {
                            BloodPressureAlarmFragment bloodPressureAlarmFragment = this.f11078a;
                            bloodPressureAlarmFragment.f11067x0 = aVar;
                            bloodPressureAlarmFragment.i1();
                        }
                        return tl.l.f28297a;
                    }
                    gm.l.l("config");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0172b(BloodPressureAlarmFragment bloodPressureAlarmFragment, d<? super C0172b> dVar) {
                super(2, dVar);
                this.f11077f = bloodPressureAlarmFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, d<? super tl.l> dVar) {
                return ((C0172b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final d<tl.l> p(Object obj, d<?> dVar) {
                return new C0172b(this.f11077f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11076e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    jj.l lVar = (jj.l) this.f11077f.f1().D().f23334a;
                    ql.b<Byte> bVar = lVar.f17932f;
                    l.d dVar = new l.d(new jj.t((byte) 75));
                    bVar.getClass();
                    sm.b d10 = qi.h.d(new k(new fl.t(bVar, dVar).u(new l.c(new r(lVar)))));
                    a aVar2 = new a(this.f11077f);
                    this.f11076e = 1;
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
            BloodPressureAlarmFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final d<tl.l> p(Object obj, d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f11071e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f11071e;
            z0.g(e0Var, null, 0, new a(BloodPressureAlarmFragment.this, null), 3);
            z0.g(e0Var, null, 0, new C0172b(BloodPressureAlarmFragment.this, null), 3);
            return tl.l.f28297a;
        }
    }

    static {
        gm.t tVar = new gm.t(BloodPressureAlarmFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentBloodPressureAlarmBinding;", 0);
        b0.f15488a.getClass();
        B0 = new h[]{tVar};
    }

    public BloodPressureAlarmFragment() {
        super(R.layout.fragment_blood_pressure_alarm);
        this.f11061r0 = 140;
        this.f11062s0 = 90;
        this.f11063t0 = 90;
        this.f11064u0 = 60;
        this.f11065v0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentBloodPressureAlarmBinding.class, this);
        this.A0 = new a();
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        this.f11067x0 = new nj.a(((jj.l) f1().D().f23334a).f17931e.get((byte) 75));
        this.f11068y0 = new nj.b(((jj.l) f1().D().f23334a).f17931e.get((byte) 48));
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.SelectIntDialogFragment.b
    public final void M(int i10, String str) {
        nj.a aVar;
        bi.b bVar;
        if (!gm.l.a("sbp_upper", str) && !gm.l.a("sbp_lower", str)) {
            if (gm.l.a("dbp_upper", str) || gm.l.a("dbp_lower", str)) {
                nj.a aVar2 = this.f11067x0;
                if (aVar2 != null) {
                    a.C0404a r10 = v.r(aVar2);
                    if (gm.l.a("dbp_upper", str)) {
                        byte b10 = (byte) i10;
                        r10.f21880b[3] = b10;
                        nj.a aVar3 = this.f11067x0;
                        if (aVar3 != null) {
                            if (i10 < aVar3.f()) {
                                r10.f21880b[4] = b10;
                            }
                        } else {
                            gm.l.l("config");
                            throw null;
                        }
                    } else {
                        byte b11 = (byte) i10;
                        r10.f21880b[4] = b11;
                        nj.a aVar4 = this.f11067x0;
                        if (aVar4 != null) {
                            if (i10 > aVar4.g()) {
                                r10.f21880b[3] = b11;
                            }
                        } else {
                            gm.l.l("config");
                            throw null;
                        }
                    }
                    aVar = new nj.a(r10.f21880b);
                    nj.b bVar2 = this.f11068y0;
                    if (bVar2 != null) {
                        if (bVar2.h()) {
                            nj.b bVar3 = this.f11068y0;
                            if (bVar3 != null) {
                                float f10 = bVar3.f();
                                if (aVar.g() <= 1.1f * f10 || aVar.f() >= f10 * 0.9f) {
                                    bVar = new bi.b();
                                    bVar.h1(h0(), null);
                                }
                            } else {
                                gm.l.l("bloodPressureConfig");
                                throw null;
                            }
                        }
                        h1(aVar);
                        return;
                    }
                    gm.l.l("bloodPressureConfig");
                    throw null;
                }
                gm.l.l("config");
                throw null;
            }
            return;
        }
        nj.a aVar5 = this.f11067x0;
        if (aVar5 != null) {
            a.C0404a r11 = v.r(aVar5);
            if (gm.l.a("sbp_upper", str)) {
                byte b12 = (byte) i10;
                r11.f21880b[1] = b12;
                nj.a aVar6 = this.f11067x0;
                if (aVar6 != null) {
                    if (i10 < aVar6.h()) {
                        r11.f21880b[2] = b12;
                    }
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else {
                byte b13 = (byte) i10;
                r11.f21880b[2] = b13;
                nj.a aVar7 = this.f11067x0;
                if (aVar7 != null) {
                    if (i10 > aVar7.i()) {
                        r11.f21880b[1] = b13;
                    }
                } else {
                    gm.l.l("config");
                    throw null;
                }
            }
            aVar = new nj.a(r11.f21880b);
            nj.b bVar4 = this.f11068y0;
            if (bVar4 != null) {
                if (bVar4.h()) {
                    nj.b bVar5 = this.f11068y0;
                    if (bVar5 != null) {
                        float g10 = bVar5.g();
                        if (aVar.i() <= 1.1f * g10 || aVar.h() >= g10 * 0.9f) {
                            bVar = new bi.b();
                            bVar.h1(h0(), null);
                        }
                    } else {
                        gm.l.l("bloodPressureConfig");
                        throw null;
                    }
                }
                h1(aVar);
                return;
            }
            gm.l.l("bloodPressureConfig");
            throw null;
        }
        gm.l.l("config");
        throw null;
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        qi.h.k(qi.h.i(this), new b(null));
        g1().itemDetailEnabled.getSwitchView().setOnCheckedChangeListener(this);
        p.b.g(g1().itemSbpUpper, this.A0);
        p.b.g(g1().itemSbpLower, this.A0);
        p.b.g(g1().itemDbpUpper, this.A0);
        p.b.g(g1().itemDbpLower, this.A0);
    }

    public final og.t f1() {
        og.t tVar = this.f11066w0;
        if (tVar != null) {
            return tVar;
        }
        gm.l.l("deviceManager");
        throw null;
    }

    public final FragmentBloodPressureAlarmBinding g1() {
        return (FragmentBloodPressureAlarmBinding) this.f11065v0.a(this, B0[0]);
    }

    public final void h1(nj.a aVar) {
        og.f D = f1().D();
        D.getClass();
        a0.j(D.f23335b, new c(D, aVar, null));
        this.f11067x0 = aVar;
        i1();
    }

    public final void i1() {
        boolean isEnabled = g1().layoutContent.isEnabled();
        SwitchMaterial switchView = g1().itemDetailEnabled.getSwitchView();
        nj.a aVar = this.f11067x0;
        if (aVar == null) {
            gm.l.l("config");
            throw null;
        }
        switchView.setChecked(aVar.j());
        if (isEnabled) {
            LinearLayout linearLayout = g1().layoutSbp;
            gm.l.e(linearLayout, "viewBind.layoutSbp");
            nj.a aVar2 = this.f11067x0;
            if (aVar2 == null) {
                gm.l.l("config");
                throw null;
            }
            qi.h.m(linearLayout, aVar2.j());
            LinearLayout linearLayout2 = g1().layoutDbp;
            gm.l.e(linearLayout2, "viewBind.layoutDbp");
            nj.a aVar3 = this.f11067x0;
            if (aVar3 == null) {
                gm.l.l("config");
                throw null;
            }
            qi.h.m(linearLayout2, aVar3.j());
        }
        TextView textView = g1().itemSbpUpper.getTextView();
        Context V0 = V0();
        nj.a aVar4 = this.f11067x0;
        if (aVar4 == null) {
            gm.l.l("config");
            throw null;
        }
        textView.setText(n6.a0.b(V0, aVar4.i()));
        TextView textView2 = g1().itemSbpLower.getTextView();
        Context V02 = V0();
        nj.a aVar5 = this.f11067x0;
        if (aVar5 == null) {
            gm.l.l("config");
            throw null;
        }
        textView2.setText(n6.a0.b(V02, aVar5.h()));
        TextView textView3 = g1().itemDbpUpper.getTextView();
        Context V03 = V0();
        nj.a aVar6 = this.f11067x0;
        if (aVar6 == null) {
            gm.l.l("config");
            throw null;
        }
        textView3.setText(n6.a0.b(V03, aVar6.g()));
        TextView textView4 = g1().itemDbpLower.getTextView();
        Context V04 = V0();
        nj.a aVar7 = this.f11067x0;
        if (aVar7 != null) {
            textView4.setText(n6.a0.b(V04, aVar7.f()));
        } else {
            gm.l.l("config");
            throw null;
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        gm.l.f(compoundButton, "buttonView");
        if (compoundButton.isPressed()) {
            nj.a aVar = this.f11067x0;
            if (aVar != null) {
                a.C0404a r10 = v.r(aVar);
                r10.f21880b[0] = z10 ? (byte) 1 : (byte) 0;
                if (z10) {
                    nj.a aVar2 = this.f11067x0;
                    if (aVar2 != null) {
                        if (aVar2.i() == 0) {
                            r10.f21880b[1] = (byte) this.f11061r0;
                        }
                        nj.a aVar3 = this.f11067x0;
                        if (aVar3 != null) {
                            if (aVar3.h() == 0) {
                                r10.f21880b[2] = (byte) this.f11062s0;
                            }
                            nj.a aVar4 = this.f11067x0;
                            if (aVar4 != null) {
                                if (aVar4.g() == 0) {
                                    r10.f21880b[3] = (byte) this.f11063t0;
                                }
                                nj.a aVar5 = this.f11067x0;
                                if (aVar5 != null) {
                                    if (aVar5.f() == 0) {
                                        r10.f21880b[4] = (byte) this.f11064u0;
                                    }
                                } else {
                                    gm.l.l("config");
                                    throw null;
                                }
                            } else {
                                gm.l.l("config");
                                throw null;
                            }
                        } else {
                            gm.l.l("config");
                            throw null;
                        }
                    } else {
                        gm.l.l("config");
                        throw null;
                    }
                }
                h1(new nj.a(r10.f21880b));
                if (z10 && !this.f11069z0) {
                    this.f11069z0 = true;
                    new bi.p().h1(h0(), null);
                    return;
                }
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
