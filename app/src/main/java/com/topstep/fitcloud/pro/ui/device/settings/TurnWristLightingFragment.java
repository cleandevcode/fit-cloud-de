package com.topstep.fitcloud.pro.ui.device.settings;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.h0;
import bi.m0;
import bi.z0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.topstep.fitcloud.pro.databinding.FragmentTurnWristLightingBinding;
import com.topstep.fitcloud.pro.ui.dialog.TimePickerDialogFragment;
import com.topstep.fitcloudpro.R;
import fl.k;
import fm.l;
import fm.p;
import gm.b0;
import jj.l;
import kotlin.Metadata;
import mf.a0;
import mm.h;
import nj.m;
import og.t;
import og.x0;
import pm.e0;
import sm.f;
import sm.g;
import xl.d;
import zl.e;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class TurnWristLightingFragment extends h0 implements CompoundButton.OnCheckedChangeListener, TimePickerDialogFragment.b {

    /* renamed from: v0 */
    public static final /* synthetic */ h<Object>[] f11309v0;

    /* renamed from: r0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11310r0;

    /* renamed from: s0 */
    public t f11311s0;

    /* renamed from: t0 */
    public m f11312t0;

    /* renamed from: u0 */
    public final a f11313u0;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            TurnWristLightingFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            View view2 = view;
            gm.l.f(view2, "view");
            TurnWristLightingFragment turnWristLightingFragment = TurnWristLightingFragment.this;
            h<Object>[] hVarArr = TurnWristLightingFragment.f11309v0;
            if (gm.l.a(view2, turnWristLightingFragment.f1().itemStartTime)) {
                TurnWristLightingFragment turnWristLightingFragment2 = TurnWristLightingFragment.this;
                m mVar = turnWristLightingFragment2.f11312t0;
                if (mVar != null) {
                    m0.F(mVar.g(), turnWristLightingFragment2);
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else if (gm.l.a(view2, TurnWristLightingFragment.this.f1().itemEndTime)) {
                TurnWristLightingFragment turnWristLightingFragment3 = TurnWristLightingFragment.this;
                m mVar2 = turnWristLightingFragment3.f11312t0;
                if (mVar2 != null) {
                    m0.D(mVar2.f(), turnWristLightingFragment3);
                } else {
                    gm.l.l("config");
                    throw null;
                }
            }
            return tl.l.f28297a;
        }
    }

    @e(c = "com.topstep.fitcloud.pro.ui.device.settings.TurnWristLightingFragment$onViewCreated$1", f = "TurnWristLightingFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<e0, d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11315e;

        @e(c = "com.topstep.fitcloud.pro.ui.device.settings.TurnWristLightingFragment$onViewCreated$1$1", f = "TurnWristLightingFragment.kt", l = {45}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i implements p<e0, d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11317e;

            /* renamed from: f */
            public final /* synthetic */ TurnWristLightingFragment f11318f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.TurnWristLightingFragment$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C0190a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ TurnWristLightingFragment f11319a;

                public C0190a(TurnWristLightingFragment turnWristLightingFragment) {
                    this.f11319a = turnWristLightingFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, d dVar) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    TurnWristLightingFragment turnWristLightingFragment = this.f11319a;
                    h<Object>[] hVarArr = TurnWristLightingFragment.f11309v0;
                    LinearLayout linearLayout = turnWristLightingFragment.f1().layoutContent;
                    gm.l.e(linearLayout, "viewBind.layoutContent");
                    qi.h.m(linearLayout, booleanValue);
                    this.f11319a.h1();
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TurnWristLightingFragment turnWristLightingFragment, d<? super a> dVar) {
                super(2, dVar);
                this.f11318f = turnWristLightingFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final d<tl.l> p(Object obj, d<?> dVar) {
                return new a(this.f11318f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11317e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    t tVar = this.f11318f.f11311s0;
                    if (tVar != null) {
                        f<Boolean> a10 = x0.a(tVar);
                        C0190a c0190a = new C0190a(this.f11318f);
                        this.f11317e = 1;
                        if (a10.a(c0190a, this) == aVar) {
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

        @e(c = "com.topstep.fitcloud.pro.ui.device.settings.TurnWristLightingFragment$onViewCreated$1$2", f = "TurnWristLightingFragment.kt", l = {51}, m = "invokeSuspend")
        /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.TurnWristLightingFragment$b$b */
        /* loaded from: classes2.dex */
        public static final class C0191b extends i implements p<e0, d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11320e;

            /* renamed from: f */
            public final /* synthetic */ TurnWristLightingFragment f11321f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.TurnWristLightingFragment$b$b$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ TurnWristLightingFragment f11322a;

                public a(TurnWristLightingFragment turnWristLightingFragment) {
                    this.f11322a = turnWristLightingFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, d dVar) {
                    m mVar = (m) obj;
                    m mVar2 = this.f11322a.f11312t0;
                    if (mVar2 != null) {
                        if (!gm.l.a(mVar2, mVar)) {
                            TurnWristLightingFragment turnWristLightingFragment = this.f11322a;
                            turnWristLightingFragment.f11312t0 = mVar;
                            turnWristLightingFragment.h1();
                        }
                        return tl.l.f28297a;
                    }
                    gm.l.l("config");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0191b(TurnWristLightingFragment turnWristLightingFragment, d<? super C0191b> dVar) {
                super(2, dVar);
                this.f11321f = turnWristLightingFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, d<? super tl.l> dVar) {
                return ((C0191b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final d<tl.l> p(Object obj, d<?> dVar) {
                return new C0191b(this.f11321f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11320e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    t tVar = this.f11321f.f11311s0;
                    if (tVar != null) {
                        jj.l lVar = (jj.l) tVar.D().f23334a;
                        ql.b<Byte> bVar = lVar.f17932f;
                        l.d dVar = new l.d(new jj.t((byte) 45));
                        bVar.getClass();
                        sm.b d10 = qi.h.d(new k(new fl.t(bVar, dVar).u(new l.c(new jj.a0(lVar)))));
                        a aVar2 = new a(this.f11321f);
                        this.f11320e = 1;
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
        public b(d<? super b> dVar) {
            super(2, dVar);
            TurnWristLightingFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final d<tl.l> p(Object obj, d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f11315e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f11315e;
            z0.g(e0Var, null, 0, new a(TurnWristLightingFragment.this, null), 3);
            z0.g(e0Var, null, 0, new C0191b(TurnWristLightingFragment.this, null), 3);
            return tl.l.f28297a;
        }
    }

    static {
        gm.t tVar = new gm.t(TurnWristLightingFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentTurnWristLightingBinding;", 0);
        b0.f15488a.getClass();
        f11309v0 = new h[]{tVar};
    }

    public TurnWristLightingFragment() {
        super(R.layout.fragment_turn_wrist_lighting);
        this.f11310r0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentTurnWristLightingBinding.class, this);
        this.f11313u0 = new a();
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        t tVar = this.f11311s0;
        if (tVar != null) {
            this.f11312t0 = new m(((jj.l) tVar.D().f23334a).f17931e.get((byte) 45));
        } else {
            gm.l.l("deviceManager");
            throw null;
        }
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.TimePickerDialogFragment.b
    public final void H(int i10, String str) {
        if (gm.l.a("start_time", str) || gm.l.a("end_time", str)) {
            m mVar = this.f11312t0;
            if (mVar != null) {
                byte[] a10 = mVar.a();
                if (a10 == null || a10.length != 9) {
                    a10 = new byte[9];
                }
                if (gm.l.a("start_time", str)) {
                    if (i10 < 0) {
                        i10 = 0;
                    } else if (i10 > 1439) {
                        i10 = 1439;
                    }
                    a10[1] = (byte) ((i10 >> 8) & 255);
                    a10[2] = (byte) (i10 & 255);
                } else {
                    if (i10 < 0) {
                        i10 = 0;
                    } else if (i10 > 1439) {
                        i10 = 1439;
                    }
                    a10[3] = (byte) ((i10 >> 8) & 255);
                    a10[4] = (byte) (i10 & 255);
                }
                g1(new m(a10));
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
        p.b.g(f1().itemStartTime, this.f11313u0);
        p.b.g(f1().itemEndTime, this.f11313u0);
    }

    @Override // lh.c
    public final View c1(View view) {
        gm.l.f(view, "view");
        AppBarLayout appBarLayout = f1().appbar;
        gm.l.e(appBarLayout, "viewBind.appbar");
        return appBarLayout;
    }

    public final FragmentTurnWristLightingBinding f1() {
        return (FragmentTurnWristLightingBinding) this.f11310r0.a(this, f11309v0[0]);
    }

    public final void g1(m mVar) {
        t tVar = this.f11311s0;
        if (tVar != null) {
            og.f D = tVar.D();
            D.getClass();
            a0.j(D.f23335b, new og.l(D, mVar, null));
            this.f11312t0 = mVar;
            h1();
            return;
        }
        gm.l.l("deviceManager");
        throw null;
    }

    public final void h1() {
        boolean z10;
        boolean isEnabled = f1().layoutContent.isEnabled();
        SwitchMaterial switchView = f1().itemDetailEnabled.getSwitchView();
        m mVar = this.f11312t0;
        if (mVar != null) {
            byte[] bArr = mVar.f21878b;
            boolean z11 = true;
            boolean z12 = false;
            if (bArr != null && bArr[0] > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            switchView.setChecked(z10);
            if (isEnabled) {
                LinearLayout linearLayout = f1().layoutDetail;
                gm.l.e(linearLayout, "viewBind.layoutDetail");
                m mVar2 = this.f11312t0;
                if (mVar2 != null) {
                    byte[] bArr2 = mVar2.f21878b;
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
            TextView textView = f1().itemStartTime.getTextView();
            m mVar3 = this.f11312t0;
            if (mVar3 != null) {
                textView.setText(m0.y(mVar3.g()));
                TextView textView2 = f1().itemEndTime.getTextView();
                m mVar4 = this.f11312t0;
                if (mVar4 != null) {
                    textView2.setText(m0.y(mVar4.f()));
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
            m mVar = this.f11312t0;
            if (mVar != null) {
                byte[] a10 = mVar.a();
                if (a10 == null || a10.length != 9) {
                    a10 = new byte[9];
                }
                a10[0] = z10 ? (byte) 1 : (byte) 0;
                g1(new m(a10));
                return;
            }
            gm.l.l("config");
            throw null;
        }
    }
}
