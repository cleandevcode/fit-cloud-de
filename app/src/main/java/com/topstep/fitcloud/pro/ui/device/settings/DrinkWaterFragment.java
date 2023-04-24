package com.topstep.fitcloud.pro.ui.device.settings;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.m0;
import bi.w;
import bi.z0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.topstep.fitcloud.pro.databinding.FragmentDrinkWaterBinding;
import com.topstep.fitcloud.pro.ui.dialog.SelectIntDialogFragment;
import com.topstep.fitcloud.pro.ui.dialog.TimePickerDialogFragment;
import com.topstep.fitcloudpro.R;
import fl.k;
import fm.l;
import fm.p;
import gm.b0;
import gm.m;
import jj.l;
import jj.v;
import kotlin.Metadata;
import mf.a0;
import mm.h;
import nj.d;
import og.t;
import og.x0;
import pm.e0;
import sm.f;
import sm.g;
import zl.e;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class DrinkWaterFragment extends w implements CompoundButton.OnCheckedChangeListener, TimePickerDialogFragment.b, SelectIntDialogFragment.b {

    /* renamed from: v0 */
    public static final /* synthetic */ h<Object>[] f11115v0;

    /* renamed from: r0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11116r0;

    /* renamed from: s0 */
    public t f11117s0;

    /* renamed from: t0 */
    public d f11118t0;

    /* renamed from: u0 */
    public final a f11119u0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            DrinkWaterFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            View view2 = view;
            gm.l.f(view2, "view");
            DrinkWaterFragment drinkWaterFragment = DrinkWaterFragment.this;
            h<Object>[] hVarArr = DrinkWaterFragment.f11115v0;
            if (gm.l.a(view2, drinkWaterFragment.f1().itemStartTime)) {
                DrinkWaterFragment drinkWaterFragment2 = DrinkWaterFragment.this;
                d dVar = drinkWaterFragment2.f11118t0;
                if (dVar != null) {
                    m0.F(dVar.h(), drinkWaterFragment2);
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else if (gm.l.a(view2, DrinkWaterFragment.this.f1().itemEndTime)) {
                DrinkWaterFragment drinkWaterFragment3 = DrinkWaterFragment.this;
                d dVar2 = drinkWaterFragment3.f11118t0;
                if (dVar2 != null) {
                    m0.D(dVar2.f(), drinkWaterFragment3);
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else if (gm.l.a(view2, DrinkWaterFragment.this.f1().itemInterval)) {
                DrinkWaterFragment drinkWaterFragment4 = DrinkWaterFragment.this;
                d dVar3 = drinkWaterFragment4.f11118t0;
                if (dVar3 != null) {
                    m0.C(dVar3.g(), drinkWaterFragment4);
                } else {
                    gm.l.l("config");
                    throw null;
                }
            }
            return tl.l.f28297a;
        }
    }

    @e(c = "com.topstep.fitcloud.pro.ui.device.settings.DrinkWaterFragment$onViewCreated$1", f = "DrinkWaterFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11121e;

        @e(c = "com.topstep.fitcloud.pro.ui.device.settings.DrinkWaterFragment$onViewCreated$1$1", f = "DrinkWaterFragment.kt", l = {45}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11123e;

            /* renamed from: f */
            public final /* synthetic */ DrinkWaterFragment f11124f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.DrinkWaterFragment$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C0173a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ DrinkWaterFragment f11125a;

                public C0173a(DrinkWaterFragment drinkWaterFragment) {
                    this.f11125a = drinkWaterFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    DrinkWaterFragment drinkWaterFragment = this.f11125a;
                    h<Object>[] hVarArr = DrinkWaterFragment.f11115v0;
                    LinearLayout linearLayout = drinkWaterFragment.f1().layoutContent;
                    gm.l.e(linearLayout, "viewBind.layoutContent");
                    qi.h.m(linearLayout, booleanValue);
                    this.f11125a.h1();
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DrinkWaterFragment drinkWaterFragment, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f11124f = drinkWaterFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f11124f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11123e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    t tVar = this.f11124f.f11117s0;
                    if (tVar != null) {
                        f<Boolean> a10 = x0.a(tVar);
                        C0173a c0173a = new C0173a(this.f11124f);
                        this.f11123e = 1;
                        if (a10.a(c0173a, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        gm.l.l("deviceManager");
                        throw null;
                    }
                }
                return tl.l.f28297a;
            }
        }

        @e(c = "com.topstep.fitcloud.pro.ui.device.settings.DrinkWaterFragment$onViewCreated$1$2", f = "DrinkWaterFragment.kt", l = {51}, m = "invokeSuspend")
        /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.DrinkWaterFragment$b$b */
        /* loaded from: classes2.dex */
        public static final class C0174b extends i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11126e;

            /* renamed from: f */
            public final /* synthetic */ DrinkWaterFragment f11127f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.DrinkWaterFragment$b$b$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ DrinkWaterFragment f11128a;

                public a(DrinkWaterFragment drinkWaterFragment) {
                    this.f11128a = drinkWaterFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    d dVar2 = (d) obj;
                    d dVar3 = this.f11128a.f11118t0;
                    if (dVar3 != null) {
                        if (!gm.l.a(dVar3, dVar2)) {
                            DrinkWaterFragment drinkWaterFragment = this.f11128a;
                            drinkWaterFragment.f11118t0 = dVar2;
                            drinkWaterFragment.h1();
                        }
                        return tl.l.f28297a;
                    }
                    gm.l.l("config");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0174b(DrinkWaterFragment drinkWaterFragment, xl.d<? super C0174b> dVar) {
                super(2, dVar);
                this.f11127f = drinkWaterFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((C0174b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new C0174b(this.f11127f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11126e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    t tVar = this.f11127f.f11117s0;
                    if (tVar != null) {
                        jj.l lVar = (jj.l) tVar.D().f23334a;
                        ql.b<Byte> bVar = lVar.f17932f;
                        l.d dVar = new l.d(new jj.t((byte) 42));
                        bVar.getClass();
                        sm.b d10 = qi.h.d(new k(new fl.t(bVar, dVar).u(new l.c(new v(lVar)))));
                        a aVar2 = new a(this.f11127f);
                        this.f11126e = 1;
                        if (d10.a(aVar2, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        gm.l.l("deviceManager");
                        throw null;
                    }
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(2, dVar);
            DrinkWaterFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f11121e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f11121e;
            z0.g(e0Var, null, 0, new a(DrinkWaterFragment.this, null), 3);
            z0.g(e0Var, null, 0, new C0174b(DrinkWaterFragment.this, null), 3);
            return tl.l.f28297a;
        }
    }

    static {
        gm.t tVar = new gm.t(DrinkWaterFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentDrinkWaterBinding;", 0);
        b0.f15488a.getClass();
        f11115v0 = new h[]{tVar};
    }

    public DrinkWaterFragment() {
        super(R.layout.fragment_drink_water);
        this.f11116r0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentDrinkWaterBinding.class, this);
        this.f11119u0 = new a();
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        t tVar = this.f11117s0;
        if (tVar != null) {
            this.f11118t0 = new d(((jj.l) tVar.D().f23334a).f17931e.get((byte) 42));
        } else {
            gm.l.l("deviceManager");
            throw null;
        }
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.TimePickerDialogFragment.b
    public final void H(int i10, String str) {
        if (gm.l.a("start_time", str) || gm.l.a("end_time", str)) {
            d dVar = this.f11118t0;
            if (dVar != null) {
                d.a t10 = ih.v.t(dVar);
                if (gm.l.a("start_time", str)) {
                    if (i10 < 0) {
                        i10 = 0;
                    } else if (i10 > 1439) {
                        i10 = 1439;
                    }
                    byte[] bArr = t10.f21880b;
                    bArr[3] = (byte) ((i10 >> 8) & 255);
                    bArr[4] = (byte) (i10 & 255);
                } else {
                    if (i10 < 0) {
                        i10 = 0;
                    } else if (i10 > 1439) {
                        i10 = 1439;
                    }
                    byte[] bArr2 = t10.f21880b;
                    bArr2[5] = (byte) ((i10 >> 8) & 255);
                    bArr2[6] = (byte) (i10 & 255);
                }
                g1(new d(t10.f21880b));
                return;
            }
            gm.l.l("config");
            throw null;
        }
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.SelectIntDialogFragment.b
    public final void M(int i10, String str) {
        if (gm.l.a("interval", str)) {
            d dVar = this.f11118t0;
            if (dVar != null) {
                d.a t10 = ih.v.t(dVar);
                if (i10 < 30) {
                    i10 = 30;
                } else if (i10 > 180) {
                    i10 = 180;
                }
                byte[] bArr = t10.f21880b;
                bArr[1] = (byte) ((i10 >> 8) & 255);
                bArr[2] = (byte) (i10 & 255);
                g1(new d(bArr));
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
        f1().itemDetailEnabled.getSwitchView().setOnCheckedChangeListener(this);
        p.b.g(f1().itemStartTime, this.f11119u0);
        p.b.g(f1().itemEndTime, this.f11119u0);
        p.b.g(f1().itemInterval, this.f11119u0);
    }

    @Override // lh.c
    public final View c1(View view) {
        gm.l.f(view, "view");
        AppBarLayout appBarLayout = f1().appbar;
        gm.l.e(appBarLayout, "viewBind.appbar");
        return appBarLayout;
    }

    public final FragmentDrinkWaterBinding f1() {
        return (FragmentDrinkWaterBinding) this.f11116r0.a(this, f11115v0[0]);
    }

    public final void g1(d dVar) {
        t tVar = this.f11117s0;
        if (tVar != null) {
            og.f D = tVar.D();
            D.getClass();
            a0.j(D.f23335b, new og.e(D, dVar, null));
            this.f11118t0 = dVar;
            h1();
            return;
        }
        gm.l.l("deviceManager");
        throw null;
    }

    public final void h1() {
        boolean z10;
        boolean z11;
        boolean isEnabled = f1().layoutContent.isEnabled();
        SwitchMaterial switchView = f1().itemDetailEnabled.getSwitchView();
        d dVar = this.f11118t0;
        if (dVar != null) {
            byte[] bArr = dVar.f21878b;
            if (bArr != null && bArr[0] > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            switchView.setChecked(z10);
            if (isEnabled) {
                LinearLayout linearLayout = f1().layoutDetail;
                gm.l.e(linearLayout, "viewBind.layoutDetail");
                d dVar2 = this.f11118t0;
                if (dVar2 != null) {
                    byte[] bArr2 = dVar2.f21878b;
                    if (bArr2 != null && bArr2[0] > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    qi.h.m(linearLayout, z11);
                } else {
                    gm.l.l("config");
                    throw null;
                }
            }
            TextView textView = f1().itemStartTime.getTextView();
            d dVar3 = this.f11118t0;
            if (dVar3 != null) {
                textView.setText(m0.y(dVar3.h()));
                TextView textView2 = f1().itemEndTime.getTextView();
                d dVar4 = this.f11118t0;
                if (dVar4 != null) {
                    textView2.setText(m0.y(dVar4.f()));
                    TextView textView3 = f1().itemInterval.getTextView();
                    Object[] objArr = new Object[1];
                    d dVar5 = this.f11118t0;
                    if (dVar5 != null) {
                        objArr[0] = Integer.valueOf(dVar5.g());
                        textView3.setText(p0(R.string.unit_minute_param, objArr));
                        return;
                    }
                    gm.l.l("config");
                    throw null;
                }
                gm.l.l("config");
                throw null;
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
            d dVar = this.f11118t0;
            if (dVar != null) {
                byte[] bArr = ih.v.t(dVar).f21880b;
                bArr[0] = z10 ? (byte) 1 : (byte) 0;
                g1(new d(bArr));
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
