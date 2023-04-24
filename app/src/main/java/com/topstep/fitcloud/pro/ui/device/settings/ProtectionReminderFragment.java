package com.topstep.fitcloud.pro.ui.device.settings;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.d0;
import bi.m0;
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
import ih.v;
import jj.l;
import jj.y;
import kotlin.Metadata;
import mf.a0;
import mm.h;
import nj.j;
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
public final class ProtectionReminderFragment extends d0 implements CompoundButton.OnCheckedChangeListener, TimePickerDialogFragment.b, SelectIntDialogFragment.b {

    /* renamed from: v0 */
    public static final /* synthetic */ h<Object>[] f11240v0;

    /* renamed from: r0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11241r0;

    /* renamed from: s0 */
    public t f11242s0;

    /* renamed from: t0 */
    public j f11243t0;

    /* renamed from: u0 */
    public final a f11244u0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            ProtectionReminderFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            View view2 = view;
            gm.l.f(view2, "view");
            ProtectionReminderFragment protectionReminderFragment = ProtectionReminderFragment.this;
            h<Object>[] hVarArr = ProtectionReminderFragment.f11240v0;
            if (gm.l.a(view2, protectionReminderFragment.f1().itemStartTime)) {
                ProtectionReminderFragment protectionReminderFragment2 = ProtectionReminderFragment.this;
                j jVar = protectionReminderFragment2.f11243t0;
                if (jVar != null) {
                    m0.F(jVar.h(), protectionReminderFragment2);
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else if (gm.l.a(view2, ProtectionReminderFragment.this.f1().itemEndTime)) {
                ProtectionReminderFragment protectionReminderFragment3 = ProtectionReminderFragment.this;
                j jVar2 = protectionReminderFragment3.f11243t0;
                if (jVar2 != null) {
                    m0.D(jVar2.f(), protectionReminderFragment3);
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else if (gm.l.a(view2, ProtectionReminderFragment.this.f1().itemInterval)) {
                ProtectionReminderFragment protectionReminderFragment4 = ProtectionReminderFragment.this;
                j jVar3 = protectionReminderFragment4.f11243t0;
                if (jVar3 != null) {
                    m0.C(jVar3.g(), protectionReminderFragment4);
                } else {
                    gm.l.l("config");
                    throw null;
                }
            }
            return tl.l.f28297a;
        }
    }

    @e(c = "com.topstep.fitcloud.pro.ui.device.settings.ProtectionReminderFragment$onViewCreated$1", f = "ProtectionReminderFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<e0, d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11246e;

        @e(c = "com.topstep.fitcloud.pro.ui.device.settings.ProtectionReminderFragment$onViewCreated$1$1", f = "ProtectionReminderFragment.kt", l = {50}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i implements p<e0, d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11248e;

            /* renamed from: f */
            public final /* synthetic */ ProtectionReminderFragment f11249f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.ProtectionReminderFragment$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C0183a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ ProtectionReminderFragment f11250a;

                public C0183a(ProtectionReminderFragment protectionReminderFragment) {
                    this.f11250a = protectionReminderFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, d dVar) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    ProtectionReminderFragment protectionReminderFragment = this.f11250a;
                    h<Object>[] hVarArr = ProtectionReminderFragment.f11240v0;
                    LinearLayout linearLayout = protectionReminderFragment.f1().layoutContent;
                    gm.l.e(linearLayout, "viewBind.layoutContent");
                    qi.h.m(linearLayout, booleanValue);
                    this.f11250a.h1();
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ProtectionReminderFragment protectionReminderFragment, d<? super a> dVar) {
                super(2, dVar);
                this.f11249f = protectionReminderFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final d<tl.l> p(Object obj, d<?> dVar) {
                return new a(this.f11249f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11248e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    t tVar = this.f11249f.f11242s0;
                    if (tVar != null) {
                        f<Boolean> a10 = x0.a(tVar);
                        C0183a c0183a = new C0183a(this.f11249f);
                        this.f11248e = 1;
                        if (a10.a(c0183a, this) == aVar) {
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

        @e(c = "com.topstep.fitcloud.pro.ui.device.settings.ProtectionReminderFragment$onViewCreated$1$2", f = "ProtectionReminderFragment.kt", l = {56}, m = "invokeSuspend")
        /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.ProtectionReminderFragment$b$b */
        /* loaded from: classes2.dex */
        public static final class C0184b extends i implements p<e0, d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11251e;

            /* renamed from: f */
            public final /* synthetic */ ProtectionReminderFragment f11252f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.ProtectionReminderFragment$b$b$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ ProtectionReminderFragment f11253a;

                public a(ProtectionReminderFragment protectionReminderFragment) {
                    this.f11253a = protectionReminderFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, d dVar) {
                    j jVar = (j) obj;
                    j jVar2 = this.f11253a.f11243t0;
                    if (jVar2 != null) {
                        if (!gm.l.a(jVar2, jVar)) {
                            ProtectionReminderFragment protectionReminderFragment = this.f11253a;
                            protectionReminderFragment.f11243t0 = jVar;
                            protectionReminderFragment.h1();
                        }
                        return tl.l.f28297a;
                    }
                    gm.l.l("config");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0184b(ProtectionReminderFragment protectionReminderFragment, d<? super C0184b> dVar) {
                super(2, dVar);
                this.f11252f = protectionReminderFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, d<? super tl.l> dVar) {
                return ((C0184b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final d<tl.l> p(Object obj, d<?> dVar) {
                return new C0184b(this.f11252f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11251e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    t tVar = this.f11252f.f11242s0;
                    if (tVar != null) {
                        jj.l lVar = (jj.l) tVar.D().f23334a;
                        ql.b<Byte> bVar = lVar.f17932f;
                        l.d dVar = new l.d(new jj.t((byte) 92));
                        bVar.getClass();
                        sm.b d10 = qi.h.d(new k(new fl.t(bVar, dVar).u(new l.c(new y(lVar)))));
                        a aVar2 = new a(this.f11252f);
                        this.f11251e = 1;
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
            ProtectionReminderFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final d<tl.l> p(Object obj, d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f11246e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f11246e;
            z0.g(e0Var, null, 0, new a(ProtectionReminderFragment.this, null), 3);
            z0.g(e0Var, null, 0, new C0184b(ProtectionReminderFragment.this, null), 3);
            return tl.l.f28297a;
        }
    }

    static {
        gm.t tVar = new gm.t(ProtectionReminderFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentDrinkWaterBinding;", 0);
        b0.f15488a.getClass();
        f11240v0 = new h[]{tVar};
    }

    public ProtectionReminderFragment() {
        super(R.layout.fragment_drink_water);
        this.f11241r0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentDrinkWaterBinding.class, this);
        this.f11244u0 = new a();
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        t tVar = this.f11242s0;
        if (tVar != null) {
            this.f11243t0 = new j(((jj.l) tVar.D().f23334a).f17931e.get((byte) 92));
        } else {
            gm.l.l("deviceManager");
            throw null;
        }
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.TimePickerDialogFragment.b
    public final void H(int i10, String str) {
        if (gm.l.a("start_time", str) || gm.l.a("end_time", str)) {
            j jVar = this.f11243t0;
            if (jVar != null) {
                j.a x10 = v.x(jVar);
                if (gm.l.a("start_time", str)) {
                    if (i10 < 0) {
                        i10 = 0;
                    } else if (i10 > 1439) {
                        i10 = 1439;
                    }
                    byte[] bArr = x10.f21880b;
                    bArr[3] = (byte) ((i10 >> 8) & 255);
                    bArr[4] = (byte) (i10 & 255);
                } else {
                    if (i10 < 0) {
                        i10 = 0;
                    } else if (i10 > 1439) {
                        i10 = 1439;
                    }
                    byte[] bArr2 = x10.f21880b;
                    bArr2[3] = (byte) ((i10 >> 8) & 255);
                    bArr2[4] = (byte) (i10 & 255);
                }
                g1(new j(x10.f21880b));
                return;
            }
            gm.l.l("config");
            throw null;
        }
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.SelectIntDialogFragment.b
    public final void M(int i10, String str) {
        if (gm.l.a("interval", str)) {
            j jVar = this.f11243t0;
            if (jVar != null) {
                j.a x10 = v.x(jVar);
                if (i10 < 30) {
                    i10 = 30;
                } else if (i10 > 180) {
                    i10 = 180;
                }
                byte[] bArr = x10.f21880b;
                bArr[1] = (byte) ((i10 >> 8) & 255);
                bArr[2] = (byte) (i10 & 255);
                g1(new j(bArr));
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
        f1().toolbar.setTitle(R.string.ds_protection_reminder);
        f1().imgIcon.setImageResource(R.drawable.img_ds_protection_reminder);
        f1().tvTips.setVisibility(8);
        f1().itemDetailEnabled.getTitleView().setText(R.string.ds_protection_reminder);
        qi.h.k(qi.h.i(this), new b(null));
        f1().itemDetailEnabled.getSwitchView().setOnCheckedChangeListener(this);
        p.b.g(f1().itemStartTime, this.f11244u0);
        p.b.g(f1().itemEndTime, this.f11244u0);
        p.b.g(f1().itemInterval, this.f11244u0);
    }

    @Override // lh.c
    public final View c1(View view) {
        gm.l.f(view, "view");
        AppBarLayout appBarLayout = f1().appbar;
        gm.l.e(appBarLayout, "viewBind.appbar");
        return appBarLayout;
    }

    public final FragmentDrinkWaterBinding f1() {
        return (FragmentDrinkWaterBinding) this.f11241r0.a(this, f11240v0[0]);
    }

    public final void g1(j jVar) {
        t tVar = this.f11242s0;
        if (tVar != null) {
            og.f D = tVar.D();
            D.getClass();
            a0.j(D.f23335b, new og.j(D, jVar, null));
            this.f11243t0 = jVar;
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
        j jVar = this.f11243t0;
        if (jVar != null) {
            byte[] bArr = jVar.f21878b;
            if (bArr != null && bArr[0] > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            switchView.setChecked(z10);
            if (isEnabled) {
                LinearLayout linearLayout = f1().layoutDetail;
                gm.l.e(linearLayout, "viewBind.layoutDetail");
                j jVar2 = this.f11243t0;
                if (jVar2 != null) {
                    byte[] bArr2 = jVar2.f21878b;
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
            j jVar3 = this.f11243t0;
            if (jVar3 != null) {
                textView.setText(m0.y(jVar3.h()));
                TextView textView2 = f1().itemEndTime.getTextView();
                j jVar4 = this.f11243t0;
                if (jVar4 != null) {
                    textView2.setText(m0.y(jVar4.f()));
                    TextView textView3 = f1().itemInterval.getTextView();
                    Object[] objArr = new Object[1];
                    j jVar5 = this.f11243t0;
                    if (jVar5 != null) {
                        objArr[0] = Integer.valueOf(jVar5.g());
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
            j jVar = this.f11243t0;
            if (jVar != null) {
                byte[] bArr = v.x(jVar).f21880b;
                bArr[0] = z10 ? (byte) 1 : (byte) 0;
                g1(new j(bArr));
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
