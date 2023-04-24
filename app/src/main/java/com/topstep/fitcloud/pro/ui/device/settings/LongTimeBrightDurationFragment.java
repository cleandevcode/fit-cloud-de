package com.topstep.fitcloud.pro.ui.device.settings;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.a0;
import bi.m0;
import bi.z0;
import com.topstep.fitcloud.pro.databinding.FragmentLongTimeBrightDurationBinding;
import com.topstep.fitcloud.pro.ui.dialog.ChoiceIntDialogFragment;
import com.topstep.fitcloudpro.R;
import fm.l;
import fm.p;
import gm.b0;
import gm.m;
import ih.v;
import kotlin.Metadata;
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
public final class LongTimeBrightDurationFragment extends a0 implements CompoundButton.OnCheckedChangeListener, ChoiceIntDialogFragment.b {

    /* renamed from: v0 */
    public static final /* synthetic */ h<Object>[] f11184v0;

    /* renamed from: r0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11185r0;

    /* renamed from: s0 */
    public t f11186s0;

    /* renamed from: t0 */
    public k f11187t0;

    /* renamed from: u0 */
    public final a f11188u0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            LongTimeBrightDurationFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            View view2 = view;
            gm.l.f(view2, "view");
            LongTimeBrightDurationFragment longTimeBrightDurationFragment = LongTimeBrightDurationFragment.this;
            h<Object>[] hVarArr = LongTimeBrightDurationFragment.f11184v0;
            if (gm.l.a(view2, longTimeBrightDurationFragment.f1().itemDuration)) {
                LongTimeBrightDurationFragment longTimeBrightDurationFragment2 = LongTimeBrightDurationFragment.this;
                k kVar = longTimeBrightDurationFragment2.f11187t0;
                if (kVar != null) {
                    ChoiceIntDialogFragment e10 = m0.e(longTimeBrightDurationFragment2, new k.e(kVar.f21878b), R.string.unit_minute_param, 2, R.string.ds_screen_long_time_bright_duration);
                    if (e10 != null) {
                        e10.h1(longTimeBrightDurationFragment2.h0(), "lt_bt_dur");
                    }
                } else {
                    gm.l.l("config");
                    throw null;
                }
            }
            return tl.l.f28297a;
        }
    }

    @e(c = "com.topstep.fitcloud.pro.ui.device.settings.LongTimeBrightDurationFragment$onViewCreated$1", f = "LongTimeBrightDurationFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<e0, d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11190e;

        @e(c = "com.topstep.fitcloud.pro.ui.device.settings.LongTimeBrightDurationFragment$onViewCreated$1$1", f = "LongTimeBrightDurationFragment.kt", l = {46}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i implements p<e0, d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11192e;

            /* renamed from: f */
            public final /* synthetic */ LongTimeBrightDurationFragment f11193f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.LongTimeBrightDurationFragment$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C0181a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ LongTimeBrightDurationFragment f11194a;

                public C0181a(LongTimeBrightDurationFragment longTimeBrightDurationFragment) {
                    this.f11194a = longTimeBrightDurationFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, d dVar) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    LongTimeBrightDurationFragment longTimeBrightDurationFragment = this.f11194a;
                    h<Object>[] hVarArr = LongTimeBrightDurationFragment.f11184v0;
                    LinearLayout linearLayout = longTimeBrightDurationFragment.f1().layoutContent;
                    gm.l.e(linearLayout, "viewBind.layoutContent");
                    qi.h.m(linearLayout, booleanValue);
                    this.f11194a.g1();
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LongTimeBrightDurationFragment longTimeBrightDurationFragment, d<? super a> dVar) {
                super(2, dVar);
                this.f11193f = longTimeBrightDurationFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final d<tl.l> p(Object obj, d<?> dVar) {
                return new a(this.f11193f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11192e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        mf.a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    mf.a0.k(obj);
                    t tVar = this.f11193f.f11186s0;
                    if (tVar != null) {
                        f<Boolean> a10 = x0.a(tVar);
                        C0181a c0181a = new C0181a(this.f11193f);
                        this.f11192e = 1;
                        if (a10.a(c0181a, this) == aVar) {
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

        @e(c = "com.topstep.fitcloud.pro.ui.device.settings.LongTimeBrightDurationFragment$onViewCreated$1$2", f = "LongTimeBrightDurationFragment.kt", l = {52}, m = "invokeSuspend")
        /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.LongTimeBrightDurationFragment$b$b */
        /* loaded from: classes2.dex */
        public static final class C0182b extends i implements p<e0, d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11195e;

            /* renamed from: f */
            public final /* synthetic */ LongTimeBrightDurationFragment f11196f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.settings.LongTimeBrightDurationFragment$b$b$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ LongTimeBrightDurationFragment f11197a;

                public a(LongTimeBrightDurationFragment longTimeBrightDurationFragment) {
                    this.f11197a = longTimeBrightDurationFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, d dVar) {
                    k kVar = (k) obj;
                    k kVar2 = this.f11197a.f11187t0;
                    if (kVar2 != null) {
                        if (!gm.l.a(kVar2, kVar)) {
                            LongTimeBrightDurationFragment longTimeBrightDurationFragment = this.f11197a;
                            longTimeBrightDurationFragment.f11187t0 = kVar;
                            longTimeBrightDurationFragment.g1();
                        }
                        return tl.l.f28297a;
                    }
                    gm.l.l("config");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0182b(LongTimeBrightDurationFragment longTimeBrightDurationFragment, d<? super C0182b> dVar) {
                super(2, dVar);
                this.f11196f = longTimeBrightDurationFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, d<? super tl.l> dVar) {
                return ((C0182b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final d<tl.l> p(Object obj, d<?> dVar) {
                return new C0182b(this.f11196f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11195e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        mf.a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    mf.a0.k(obj);
                    t tVar = this.f11196f.f11186s0;
                    if (tVar != null) {
                        sm.b b10 = tVar.D().b();
                        a aVar2 = new a(this.f11196f);
                        this.f11195e = 1;
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
            LongTimeBrightDurationFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final d<tl.l> p(Object obj, d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f11190e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            e0 e0Var = (e0) this.f11190e;
            z0.g(e0Var, null, 0, new a(LongTimeBrightDurationFragment.this, null), 3);
            z0.g(e0Var, null, 0, new C0182b(LongTimeBrightDurationFragment.this, null), 3);
            return tl.l.f28297a;
        }
    }

    static {
        gm.t tVar = new gm.t(LongTimeBrightDurationFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentLongTimeBrightDurationBinding;", 0);
        b0.f15488a.getClass();
        f11184v0 = new h[]{tVar};
    }

    public LongTimeBrightDurationFragment() {
        super(R.layout.fragment_long_time_bright_duration);
        this.f11185r0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentLongTimeBrightDurationBinding.class, this);
        this.f11188u0 = new a();
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        t tVar = this.f11186s0;
        if (tVar != null) {
            this.f11187t0 = tVar.D().e();
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
        p.b.g(f1().itemDuration, this.f11188u0);
        f1().itemEnabled.getSwitchView().setOnCheckedChangeListener(this);
    }

    @Override // com.topstep.fitcloud.pro.ui.dialog.ChoiceIntDialogFragment.b
    public final void T(int i10, String str) {
        if (gm.l.a("lt_bt_dur", str)) {
            k kVar = this.f11187t0;
            if (kVar != null) {
                k.b y10 = v.y(kVar);
                new k.c(y10.f21880b).b(i10);
                k b10 = y10.b();
                t tVar = this.f11186s0;
                if (tVar != null) {
                    tVar.D().g(b10);
                    this.f11187t0 = b10;
                    g1();
                    return;
                }
                gm.l.l("deviceManager");
                throw null;
            }
            gm.l.l("config");
            throw null;
        }
    }

    public final FragmentLongTimeBrightDurationBinding f1() {
        return (FragmentLongTimeBrightDurationBinding) this.f11185r0.a(this, f11184v0[0]);
    }

    public final void g1() {
        int i10;
        boolean isEnabled = f1().layoutContent.isEnabled();
        k kVar = this.f11187t0;
        if (kVar != null) {
            k.e eVar = new k.e(kVar.f21878b);
            f1().itemEnabled.getSwitchView().setChecked(eVar.f22451e);
            if (isEnabled) {
                f1().itemDuration.setEnabled(eVar.f22451e);
            }
            TextView textView = f1().itemDuration.getTextView();
            Object[] objArr = new Object[1];
            int[] a10 = eVar.a();
            if (a10 != null) {
                i10 = a10[eVar.f22450d];
            } else {
                i10 = 0;
            }
            objArr[0] = Integer.valueOf(i10);
            textView.setText(p0(R.string.unit_minute_param, objArr));
            return;
        }
        gm.l.l("config");
        throw null;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        gm.l.f(compoundButton, "buttonView");
        if (compoundButton.isPressed()) {
            k kVar = this.f11187t0;
            if (kVar != null) {
                k.b y10 = v.y(kVar);
                byte[] bArr = y10.f21880b;
                new k.c(bArr).f22451e = z10;
                if (bArr != null) {
                    bArr[16] = z10 ? (byte) 1 : (byte) 0;
                }
                k b10 = y10.b();
                t tVar = this.f11186s0;
                if (tVar != null) {
                    tVar.D().g(b10);
                    this.f11187t0 = b10;
                    g1();
                    return;
                }
                gm.l.l("deviceManager");
                throw null;
            }
            gm.l.l("config");
            throw null;
        }
    }
}
