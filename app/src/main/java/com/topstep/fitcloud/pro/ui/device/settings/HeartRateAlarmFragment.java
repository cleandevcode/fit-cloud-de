package com.topstep.fitcloud.pro.ui.device.settings;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.z;
import bi.z0;
import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.topstep.fitcloud.pro.databinding.FragmentHeartRateAlarmBinding;
import com.topstep.fitcloud.pro.ui.dialog.SelectIntDialogFragment;
import com.topstep.fitcloudpro.R;
import fl.k;
import fm.l;
import fm.p;
import gm.b0;
import gm.m;
import ih.v;
import jj.l;
import jj.x;
import kotlin.Metadata;
import mf.a0;
import mm.h;
import nj.g;
import og.t;
import og.x0;
import pm.e0;
import sm.f;
import xl.d;
import zl.e;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class HeartRateAlarmFragment extends z implements CompoundButton.OnCheckedChangeListener, SelectIntDialogFragment.b {

    /* renamed from: x0 */
    public static final /* synthetic */ h<Object>[] f11168x0;

    /* renamed from: r0 */
    public final int f11169r0;

    /* renamed from: s0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11170s0;

    /* renamed from: t0 */
    public t f11171t0;

    /* renamed from: u0 */
    public g f11172u0;

    /* renamed from: v0 */
    public boolean f11173v0;

    /* renamed from: w0 */
    public final a f11174w0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            HeartRateAlarmFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            int i10;
            int i11;
            View view2 = view;
            gm.l.f(view2, "view");
            HeartRateAlarmFragment heartRateAlarmFragment = HeartRateAlarmFragment.this;
            h<Object>[] hVarArr = HeartRateAlarmFragment.f11168x0;
            if (gm.l.a(view2, heartRateAlarmFragment.f1().itemStaticValue)) {
                HeartRateAlarmFragment heartRateAlarmFragment2 = HeartRateAlarmFragment.this;
                g gVar = heartRateAlarmFragment2.f11172u0;
                if (gVar != null) {
                    byte[] bArr = gVar.f21878b;
                    if (bArr == null) {
                        i11 = 0;
                    } else {
                        i11 = bArr[1] & 255;
                    }
                    int i12 = SelectIntDialogFragment.C0;
                    SelectIntDialogFragment.a.a(10, 15, 10, i11, heartRateAlarmFragment2.o0(R.string.ds_heart_rate_alarm_static), heartRateAlarmFragment2.o0(R.string.unit_frequency_per_minute)).h1(heartRateAlarmFragment2.h0(), "hr_static");
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else if (gm.l.a(view2, HeartRateAlarmFragment.this.f1().itemDynamicValue)) {
                HeartRateAlarmFragment heartRateAlarmFragment3 = HeartRateAlarmFragment.this;
                g gVar2 = heartRateAlarmFragment3.f11172u0;
                if (gVar2 != null) {
                    byte[] bArr2 = gVar2.f21878b;
                    if (bArr2 == null) {
                        i10 = 0;
                    } else {
                        i10 = bArr2[3] & 255;
                    }
                    int i13 = SelectIntDialogFragment.C0;
                    SelectIntDialogFragment.a.a(100, 200, 1, i10, heartRateAlarmFragment3.o0(R.string.ds_heart_rate_alarm_dynamic), heartRateAlarmFragment3.o0(R.string.unit_frequency_per_minute)).h1(heartRateAlarmFragment3.h0(), "hr_dynamic");
                } else {
                    gm.l.l("config");
                    throw null;
                }
            }
            return tl.l.f28297a;
        }
    }

    @e(c = "com.topstep.fitcloud.pro.ui.device.settings.HeartRateAlarmFragment$onViewCreated$1", f = "HeartRateAlarmFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<e0, d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11176e;

        @e(c = "com.topstep.fitcloud.pro.ui.device.settings.HeartRateAlarmFragment$onViewCreated$1$1", f = "HeartRateAlarmFragment.kt", l = {52}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i implements p<e0, d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11178e;

            /* renamed from: f */
            public final /* synthetic */ HeartRateAlarmFragment f11179f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.HeartRateAlarmFragment$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C0179a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ HeartRateAlarmFragment f11180a;

                public C0179a(HeartRateAlarmFragment heartRateAlarmFragment) {
                    this.f11180a = heartRateAlarmFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, d dVar) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    HeartRateAlarmFragment heartRateAlarmFragment = this.f11180a;
                    h<Object>[] hVarArr = HeartRateAlarmFragment.f11168x0;
                    LinearLayout linearLayout = heartRateAlarmFragment.f1().layoutContent;
                    gm.l.e(linearLayout, "viewBind.layoutContent");
                    qi.h.m(linearLayout, booleanValue);
                    this.f11180a.h1();
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HeartRateAlarmFragment heartRateAlarmFragment, d<? super a> dVar) {
                super(2, dVar);
                this.f11179f = heartRateAlarmFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final d<tl.l> p(Object obj, d<?> dVar) {
                return new a(this.f11179f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11178e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    t tVar = this.f11179f.f11171t0;
                    if (tVar != null) {
                        f<Boolean> a10 = x0.a(tVar);
                        C0179a c0179a = new C0179a(this.f11179f);
                        this.f11178e = 1;
                        if (a10.a(c0179a, this) == aVar) {
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

        @e(c = "com.topstep.fitcloud.pro.ui.device.settings.HeartRateAlarmFragment$onViewCreated$1$2", f = "HeartRateAlarmFragment.kt", l = {58}, m = "invokeSuspend")
        /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.HeartRateAlarmFragment$b$b */
        /* loaded from: classes2.dex */
        public static final class C0180b extends i implements p<e0, d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11181e;

            /* renamed from: f */
            public final /* synthetic */ HeartRateAlarmFragment f11182f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.HeartRateAlarmFragment$b$b$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ HeartRateAlarmFragment f11183a;

                public a(HeartRateAlarmFragment heartRateAlarmFragment) {
                    this.f11183a = heartRateAlarmFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, d dVar) {
                    g gVar = (g) obj;
                    g gVar2 = this.f11183a.f11172u0;
                    if (gVar2 != null) {
                        if (!gm.l.a(gVar2, gVar)) {
                            HeartRateAlarmFragment heartRateAlarmFragment = this.f11183a;
                            heartRateAlarmFragment.f11172u0 = gVar;
                            heartRateAlarmFragment.h1();
                        }
                        return tl.l.f28297a;
                    }
                    gm.l.l("config");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0180b(HeartRateAlarmFragment heartRateAlarmFragment, d<? super C0180b> dVar) {
                super(2, dVar);
                this.f11182f = heartRateAlarmFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, d<? super tl.l> dVar) {
                return ((C0180b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final d<tl.l> p(Object obj, d<?> dVar) {
                return new C0180b(this.f11182f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11181e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    t tVar = this.f11182f.f11171t0;
                    if (tVar != null) {
                        jj.l lVar = (jj.l) tVar.D().f23334a;
                        ql.b<Byte> bVar = lVar.f17932f;
                        l.d dVar = new l.d(new jj.t((byte) 72));
                        bVar.getClass();
                        sm.b d10 = qi.h.d(new k(new fl.t(bVar, dVar).u(new l.c(new x(lVar)))));
                        a aVar2 = new a(this.f11182f);
                        this.f11181e = 1;
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
            HeartRateAlarmFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final d<tl.l> p(Object obj, d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f11176e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f11176e;
            z0.g(e0Var, null, 0, new a(HeartRateAlarmFragment.this, null), 3);
            z0.g(e0Var, null, 0, new C0180b(HeartRateAlarmFragment.this, null), 3);
            return tl.l.f28297a;
        }
    }

    static {
        gm.t tVar = new gm.t(HeartRateAlarmFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentHeartRateAlarmBinding;", 0);
        b0.f15488a.getClass();
        f11168x0 = new h[]{tVar};
    }

    public HeartRateAlarmFragment() {
        super(R.layout.fragment_heart_rate_alarm);
        this.f11169r0 = 100;
        this.f11170s0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentHeartRateAlarmBinding.class, this);
        this.f11174w0 = new a();
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        t tVar = this.f11171t0;
        if (tVar != null) {
            this.f11172u0 = new g(((jj.l) tVar.D().f23334a).f17931e.get((byte) 72));
        } else {
            gm.l.l("deviceManager");
            throw null;
        }
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.SelectIntDialogFragment.b
    public final void M(int i10, String str) {
        g.a w10;
        if (gm.l.a("hr_static", str)) {
            g gVar = this.f11172u0;
            if (gVar != null) {
                w10 = v.w(gVar);
                w10.f21880b[1] = (byte) i10;
            } else {
                gm.l.l("config");
                throw null;
            }
        } else if (gm.l.a("hr_dynamic", str)) {
            g gVar2 = this.f11172u0;
            if (gVar2 != null) {
                w10 = v.w(gVar2);
                w10.f21880b[3] = (byte) i10;
            } else {
                gm.l.l("config");
                throw null;
            }
        } else {
            return;
        }
        g1(w10.b());
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        qi.h.k(qi.h.i(this), new b(null));
        f1().itemStaticSwitch.getSwitchView().setOnCheckedChangeListener(this);
        f1().itemDynamicSwitch.getSwitchView().setOnCheckedChangeListener(this);
        p.b.g(f1().itemStaticValue, this.f11174w0);
        p.b.g(f1().itemDynamicValue, this.f11174w0);
    }

    public final FragmentHeartRateAlarmBinding f1() {
        return (FragmentHeartRateAlarmBinding) this.f11170s0.a(this, f11168x0[0]);
    }

    public final void g1(g gVar) {
        t tVar = this.f11171t0;
        if (tVar != null) {
            og.f D = tVar.D();
            D.getClass();
            a0.j(D.f23335b, new og.h(D, gVar, null));
            this.f11172u0 = gVar;
            h1();
            return;
        }
        gm.l.l("deviceManager");
        throw null;
    }

    public final void h1() {
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        boolean z13;
        boolean isEnabled = f1().layoutContent.isEnabled();
        SwitchMaterial switchView = f1().itemStaticSwitch.getSwitchView();
        g gVar = this.f11172u0;
        if (gVar != null) {
            byte[] bArr = gVar.f21878b;
            if (bArr != null && bArr[0] > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            switchView.setChecked(z10);
            if (isEnabled) {
                PreferenceItem preferenceItem = f1().itemStaticValue;
                g gVar2 = this.f11172u0;
                if (gVar2 != null) {
                    byte[] bArr2 = gVar2.f21878b;
                    if (bArr2 != null && bArr2[0] > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    preferenceItem.setEnabled(z13);
                } else {
                    gm.l.l("config");
                    throw null;
                }
            }
            TextView textView = f1().itemStaticValue.getTextView();
            Context V0 = V0();
            g gVar3 = this.f11172u0;
            if (gVar3 != null) {
                byte[] bArr3 = gVar3.f21878b;
                if (bArr3 == null) {
                    i10 = 0;
                } else {
                    i10 = bArr3[1] & 255;
                }
                String string = V0.getString(R.string.unit_frequency_per_minute_param, Integer.valueOf(i10));
                gm.l.e(string, "context.getString(R.stri…_per_minute_param, value)");
                textView.setText(string);
                SwitchMaterial switchView2 = f1().itemDynamicSwitch.getSwitchView();
                g gVar4 = this.f11172u0;
                if (gVar4 != null) {
                    byte[] bArr4 = gVar4.f21878b;
                    if (bArr4 != null && bArr4[2] > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    switchView2.setChecked(z11);
                    if (isEnabled) {
                        PreferenceItem preferenceItem2 = f1().itemDynamicValue;
                        g gVar5 = this.f11172u0;
                        if (gVar5 != null) {
                            byte[] bArr5 = gVar5.f21878b;
                            if (bArr5 != null && bArr5[2] > 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            preferenceItem2.setEnabled(z12);
                        } else {
                            gm.l.l("config");
                            throw null;
                        }
                    }
                    TextView textView2 = f1().itemDynamicValue.getTextView();
                    Context V02 = V0();
                    g gVar6 = this.f11172u0;
                    if (gVar6 != null) {
                        byte[] bArr6 = gVar6.f21878b;
                        if (bArr6 == null) {
                            i11 = 0;
                        } else {
                            i11 = bArr6[3] & 255;
                        }
                        String string2 = V02.getString(R.string.unit_frequency_per_minute_param, Integer.valueOf(i11));
                        gm.l.e(string2, "context.getString(R.stri…_per_minute_param, value)");
                        textView2.setText(string2);
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
        g.a w10;
        gm.l.f(compoundButton, "buttonView");
        if (compoundButton.isPressed()) {
            int i10 = 0;
            if (gm.l.a(compoundButton, f1().itemStaticSwitch.getSwitchView())) {
                g gVar = this.f11172u0;
                if (gVar != null) {
                    w10 = v.w(gVar);
                    byte[] bArr = w10.f21880b;
                    bArr[0] = z10 ? (byte) 1 : (byte) 0;
                    if (z10) {
                        g gVar2 = this.f11172u0;
                        if (gVar2 != null) {
                            byte[] bArr2 = gVar2.f21878b;
                            if (bArr2 != null) {
                                i10 = bArr2[1] & 255;
                            }
                            if (i10 == 0) {
                                bArr[1] = (byte) this.f11169r0;
                            }
                        } else {
                            gm.l.l("config");
                            throw null;
                        }
                    }
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else {
                g gVar3 = this.f11172u0;
                if (gVar3 != null) {
                    w10 = v.w(gVar3);
                    byte[] bArr3 = w10.f21880b;
                    bArr3[2] = z10 ? (byte) 1 : (byte) 0;
                    if (z10) {
                        g gVar4 = this.f11172u0;
                        if (gVar4 != null) {
                            byte[] bArr4 = gVar4.f21878b;
                            if (bArr4 != null) {
                                i10 = bArr4[3] & 255;
                            }
                            if (i10 == 0) {
                                bArr3[3] = (byte) this.f11169r0;
                            }
                        } else {
                            gm.l.l("config");
                            throw null;
                        }
                    }
                } else {
                    gm.l.l("config");
                    throw null;
                }
            }
            g1(w10.b());
            if (z10 && !this.f11173v0) {
                this.f11173v0 = true;
                new bi.p().h1(h0(), null);
            }
        }
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.SelectIntDialogFragment.b
    public final String q(int i10, String str) {
        return SelectIntDialogFragment.b.a.a(i10);
    }
}
