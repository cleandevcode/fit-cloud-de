package com.topstep.fitcloud.pro.ui.device.settings;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import bi.f0;
import bi.m0;
import bi.z0;
import com.topstep.fitcloud.pro.databinding.FragmentScreenBinding;
import com.topstep.fitcloud.pro.ui.dialog.ChoiceIntDialogFragment;
import com.topstep.fitcloudpro.R;
import fm.l;
import fm.p;
import gm.b0;
import gm.m;
import ih.v;
import kotlin.Metadata;
import mf.a0;
import mm.h;
import nj.k;
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
public final class ScreenFragment extends f0 implements CompoundButton.OnCheckedChangeListener, ChoiceIntDialogFragment.b {

    /* renamed from: v0 */
    public static final /* synthetic */ h<Object>[] f11281v0;

    /* renamed from: r0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11282r0;

    /* renamed from: s0 */
    public t f11283s0;

    /* renamed from: t0 */
    public k f11284t0;

    /* renamed from: u0 */
    public final a f11285u0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            ScreenFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            View view2 = view;
            gm.l.f(view2, "view");
            ScreenFragment screenFragment = ScreenFragment.this;
            h<Object>[] hVarArr = ScreenFragment.f11281v0;
            if (gm.l.a(view2, screenFragment.f1().itemBrightness)) {
                ScreenFragment screenFragment2 = ScreenFragment.this;
                k kVar = screenFragment2.f11284t0;
                if (kVar != null) {
                    ChoiceIntDialogFragment e10 = m0.e(screenFragment2, new k.d(kVar.f21878b, 24, 2), R.string.unit_level_param, 1, R.string.ds_screen_brightness);
                    if (e10 != null) {
                        e10.h1(screenFragment2.h0(), "brightness");
                    }
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else if (gm.l.a(view2, ScreenFragment.this.f1().itemBrightDuration)) {
                ScreenFragment screenFragment3 = ScreenFragment.this;
                k kVar2 = screenFragment3.f11284t0;
                if (kVar2 != null) {
                    ChoiceIntDialogFragment e11 = m0.e(screenFragment3, new k.d(kVar2.f21878b, 0, 2), R.string.unit_second_param, 2, R.string.ds_screen_bright_duration);
                    if (e11 != null) {
                        e11.h1(screenFragment3.h0(), "bt_dur");
                    }
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else if (gm.l.a(view2, ScreenFragment.this.f1().itemTurnWristBrightDuration)) {
                ScreenFragment screenFragment4 = ScreenFragment.this;
                k kVar3 = screenFragment4.f11284t0;
                if (kVar3 != null) {
                    ChoiceIntDialogFragment e12 = m0.e(screenFragment4, new k.d(kVar3.f21878b, 7, 2), R.string.unit_second_param, 2, R.string.ds_screen_turn_wrist_bright_duration);
                    if (e12 != null) {
                        e12.h1(screenFragment4.h0(), "tw_bt_dur");
                    }
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else if (gm.l.a(view2, ScreenFragment.this.f1().itemLongTimeBrightDuration)) {
                try {
                    tb.a.f(ScreenFragment.this).l(R.id.toLongTime, new Bundle(), v.d().a());
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            }
            return tl.l.f28297a;
        }
    }

    @e(c = "com.topstep.fitcloud.pro.ui.device.settings.ScreenFragment$onViewCreated$1", f = "ScreenFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<e0, d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11287e;

        @e(c = "com.topstep.fitcloud.pro.ui.device.settings.ScreenFragment$onViewCreated$1$1", f = "ScreenFragment.kt", l = {47}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i implements p<e0, d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11289e;

            /* renamed from: f */
            public final /* synthetic */ ScreenFragment f11290f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.ScreenFragment$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C0186a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ ScreenFragment f11291a;

                public C0186a(ScreenFragment screenFragment) {
                    this.f11291a = screenFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, d dVar) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    ScreenFragment screenFragment = this.f11291a;
                    h<Object>[] hVarArr = ScreenFragment.f11281v0;
                    LinearLayout linearLayout = screenFragment.f1().layoutContent;
                    gm.l.e(linearLayout, "viewBind.layoutContent");
                    qi.h.m(linearLayout, booleanValue);
                    this.f11291a.h1();
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ScreenFragment screenFragment, d<? super a> dVar) {
                super(2, dVar);
                this.f11290f = screenFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final d<tl.l> p(Object obj, d<?> dVar) {
                return new a(this.f11290f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11289e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    t tVar = this.f11290f.f11283s0;
                    if (tVar != null) {
                        f<Boolean> a10 = x0.a(tVar);
                        C0186a c0186a = new C0186a(this.f11290f);
                        this.f11289e = 1;
                        if (a10.a(c0186a, this) == aVar) {
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

        @e(c = "com.topstep.fitcloud.pro.ui.device.settings.ScreenFragment$onViewCreated$1$2", f = "ScreenFragment.kt", l = {53}, m = "invokeSuspend")
        /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.ScreenFragment$b$b */
        /* loaded from: classes2.dex */
        public static final class C0187b extends i implements p<e0, d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11292e;

            /* renamed from: f */
            public final /* synthetic */ ScreenFragment f11293f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.ScreenFragment$b$b$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ ScreenFragment f11294a;

                public a(ScreenFragment screenFragment) {
                    this.f11294a = screenFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, d dVar) {
                    k kVar = (k) obj;
                    k kVar2 = this.f11294a.f11284t0;
                    if (kVar2 != null) {
                        if (!gm.l.a(kVar2, kVar)) {
                            ScreenFragment screenFragment = this.f11294a;
                            screenFragment.f11284t0 = kVar;
                            screenFragment.h1();
                        }
                        return tl.l.f28297a;
                    }
                    gm.l.l("config");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0187b(ScreenFragment screenFragment, d<? super C0187b> dVar) {
                super(2, dVar);
                this.f11293f = screenFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, d<? super tl.l> dVar) {
                return ((C0187b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final d<tl.l> p(Object obj, d<?> dVar) {
                return new C0187b(this.f11293f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11292e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    t tVar = this.f11293f.f11283s0;
                    if (tVar != null) {
                        sm.b b10 = tVar.D().b();
                        a aVar2 = new a(this.f11293f);
                        this.f11292e = 1;
                        if (b10.a(aVar2, this) == aVar) {
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
            ScreenFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final d<tl.l> p(Object obj, d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f11287e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f11287e;
            z0.g(e0Var, null, 0, new a(ScreenFragment.this, null), 3);
            z0.g(e0Var, null, 0, new C0187b(ScreenFragment.this, null), 3);
            return tl.l.f28297a;
        }
    }

    static {
        gm.t tVar = new gm.t(ScreenFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentScreenBinding;", 0);
        b0.f15488a.getClass();
        f11281v0 = new h[]{tVar};
    }

    public ScreenFragment() {
        super(R.layout.fragment_screen);
        this.f11282r0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentScreenBinding.class, this);
        this.f11285u0 = new a();
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        t tVar = this.f11283s0;
        if (tVar != null) {
            this.f11284t0 = tVar.D().e();
        } else {
            gm.l.l("deviceManager");
            throw null;
        }
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        qi.h.k(qi.h.i(this), new b(null));
        p.b.g(f1().itemBrightness, this.f11285u0);
        p.b.g(f1().itemBrightDuration, this.f11285u0);
        p.b.g(f1().itemTurnWristBrightDuration, this.f11285u0);
        p.b.g(f1().itemLongTimeBrightDuration, this.f11285u0);
        f1().itemAlwaysBright.getSwitchView().setOnCheckedChangeListener(this);
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.ChoiceIntDialogFragment.b
    public final void T(int i10, String str) {
        k.b y10;
        k.a aVar;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1379252076) {
                if (hashCode != -941068848) {
                    if (hashCode == 648162385 && str.equals("brightness")) {
                        k kVar = this.f11284t0;
                        if (kVar != null) {
                            y10 = v.y(kVar);
                            aVar = new k.a(y10.f21880b, 24);
                        } else {
                            gm.l.l("config");
                            throw null;
                        }
                    } else {
                        return;
                    }
                } else if (str.equals("tw_bt_dur")) {
                    k kVar2 = this.f11284t0;
                    if (kVar2 != null) {
                        y10 = v.y(kVar2);
                        aVar = new k.a(y10.f21880b, 7);
                    } else {
                        gm.l.l("config");
                        throw null;
                    }
                } else {
                    return;
                }
            } else if (str.equals("bt_dur")) {
                k kVar3 = this.f11284t0;
                if (kVar3 != null) {
                    y10 = v.y(kVar3);
                    aVar = new k.a(y10.f21880b, 0);
                } else {
                    gm.l.l("config");
                    throw null;
                }
            } else {
                return;
            }
            aVar.b(i10);
            g1(y10.b());
        }
    }

    public final FragmentScreenBinding f1() {
        return (FragmentScreenBinding) this.f11282r0.a(this, f11281v0[0]);
    }

    public final void g1(k kVar) {
        t tVar = this.f11283s0;
        if (tVar != null) {
            tVar.D().g(kVar);
            this.f11284t0 = kVar;
            h1();
            return;
        }
        gm.l.l("deviceManager");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h1() {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.device.settings.ScreenFragment.h1():void");
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        gm.l.f(compoundButton, "buttonView");
        if (compoundButton.isPressed()) {
            k kVar = this.f11284t0;
            if (kVar != null) {
                k.b y10 = v.y(kVar);
                byte[] bArr = y10.f21880b;
                if (bArr != null) {
                    bArr[23] = z10 ? (byte) 1 : (byte) 0;
                }
                g1(y10.b());
                return;
            }
            gm.l.l("config");
            throw null;
        }
    }
}
