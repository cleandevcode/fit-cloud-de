package com.topstep.fitcloud.pro.ui.settings;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import bi.z0;
import com.topstep.fitcloud.pro.databinding.FragmentUnitBinding;
import com.topstep.fitcloudpro.R;
import fm.l;
import fm.p;
import gm.b0;
import gm.m;
import ii.g0;
import kotlin.Metadata;
import mf.a0;
import og.t;
import pm.e0;
import sm.t0;

@Metadata
/* loaded from: classes2.dex */
public final class UnitFragment extends g0 {

    /* renamed from: w0 */
    public static final /* synthetic */ mm.h<Object>[] f11922w0;

    /* renamed from: r0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11923r0;

    /* renamed from: s0 */
    public long f11924s0;

    /* renamed from: t0 */
    public kg.g f11925t0;

    /* renamed from: u0 */
    public t f11926u0;

    /* renamed from: v0 */
    public final a f11927v0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            UnitFragment.this = r1;
        }

        /* JADX WARN: Removed duplicated region for block: B:71:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x00b1  */
        @Override // fm.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final tl.l k(android.view.View r8) {
            /*
                r7 = this;
                android.view.View r8 = (android.view.View) r8
                java.lang.String r0 = "view"
                gm.l.f(r8, r0)
                com.topstep.fitcloud.pro.ui.settings.UnitFragment r0 = com.topstep.fitcloud.pro.ui.settings.UnitFragment.this
                kg.g r0 = r0.f11925t0
                java.lang.String r1 = "unitConfigRepository"
                r2 = 0
                if (r0 == 0) goto Lb8
                sm.t0 r0 = r0.a()
                java.lang.Object r0 = r0.getValue()
                uf.b r0 = (uf.b) r0
                com.topstep.fitcloud.pro.ui.settings.UnitFragment r3 = com.topstep.fitcloud.pro.ui.settings.UnitFragment.this
                com.topstep.fitcloud.pro.databinding.FragmentUnitBinding r3 = r3.f1()
                com.github.kilnn.tool.widget.preference.PreferenceTextView r3 = r3.itemLengthMetric
                boolean r3 = gm.l.a(r8, r3)
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L2c
                r4 = 0
                goto L3a
            L2c:
                com.topstep.fitcloud.pro.ui.settings.UnitFragment r3 = com.topstep.fitcloud.pro.ui.settings.UnitFragment.this
                com.topstep.fitcloud.pro.databinding.FragmentUnitBinding r3 = r3.f1()
                com.github.kilnn.tool.widget.preference.PreferenceTextView r3 = r3.itemLengthImperial
                boolean r3 = gm.l.a(r8, r3)
                if (r3 == 0) goto L3f
            L3a:
                r8 = 6
                r5 = r4
                r3 = 0
            L3d:
                r4 = 0
                goto L81
            L3f:
                com.topstep.fitcloud.pro.ui.settings.UnitFragment r3 = com.topstep.fitcloud.pro.ui.settings.UnitFragment.this
                com.topstep.fitcloud.pro.databinding.FragmentUnitBinding r3 = r3.f1()
                com.github.kilnn.tool.widget.preference.PreferenceTextView r3 = r3.itemWeightMetric
                boolean r3 = gm.l.a(r8, r3)
                if (r3 == 0) goto L4f
                r4 = 0
                goto L5d
            L4f:
                com.topstep.fitcloud.pro.ui.settings.UnitFragment r3 = com.topstep.fitcloud.pro.ui.settings.UnitFragment.this
                com.topstep.fitcloud.pro.databinding.FragmentUnitBinding r3 = r3.f1()
                com.github.kilnn.tool.widget.preference.PreferenceTextView r3 = r3.itemWeightImperial
                boolean r3 = gm.l.a(r8, r3)
                if (r3 == 0) goto L60
            L5d:
                r8 = 5
                r3 = 0
                goto L81
            L60:
                com.topstep.fitcloud.pro.ui.settings.UnitFragment r3 = com.topstep.fitcloud.pro.ui.settings.UnitFragment.this
                com.topstep.fitcloud.pro.databinding.FragmentUnitBinding r3 = r3.f1()
                com.github.kilnn.tool.widget.preference.PreferenceTextView r3 = r3.itemTemperatureCentigrade
                boolean r3 = gm.l.a(r8, r3)
                if (r3 == 0) goto L70
                r4 = 0
                goto L7e
            L70:
                com.topstep.fitcloud.pro.ui.settings.UnitFragment r3 = com.topstep.fitcloud.pro.ui.settings.UnitFragment.this
                com.topstep.fitcloud.pro.databinding.FragmentUnitBinding r3 = r3.f1()
                com.github.kilnn.tool.widget.preference.PreferenceTextView r3 = r3.itemTemperatureFahrenheit
                boolean r8 = gm.l.a(r8, r3)
                if (r8 == 0) goto L9c
            L7e:
                r8 = 3
                r3 = r4
                goto L3d
            L81:
                r6 = r8 & 1
                if (r6 == 0) goto L87
                int r5 = r0.f28707a
            L87:
                r6 = r8 & 2
                if (r6 == 0) goto L8d
                int r4 = r0.f28708b
            L8d:
                r8 = r8 & 4
                if (r8 == 0) goto L93
                int r3 = r0.f28709c
            L93:
                r0.getClass()
                uf.b r8 = new uf.b
                r8.<init>(r5, r4, r3)
                goto L9d
            L9c:
                r8 = r2
            L9d:
                if (r8 == 0) goto Lb5
                boolean r0 = gm.l.a(r0, r8)
                if (r0 != 0) goto Lb5
                com.topstep.fitcloud.pro.ui.settings.UnitFragment r0 = com.topstep.fitcloud.pro.ui.settings.UnitFragment.this
                kg.g r3 = r0.f11925t0
                if (r3 == 0) goto Lb1
                long r0 = r0.f11924s0
                r3.j(r0, r8)
                goto Lb5
            Lb1:
                gm.l.l(r1)
                throw r2
            Lb5:
                tl.l r8 = tl.l.f28297a
                return r8
            Lb8:
                gm.l.l(r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.settings.UnitFragment.a.k(java.lang.Object):java.lang.Object");
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.UnitFragment$onViewCreated$1", f = "UnitFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11929e;

        /* renamed from: g */
        public final /* synthetic */ int f11931g;

        /* renamed from: h */
        public final /* synthetic */ ColorStateList f11932h;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.UnitFragment$onViewCreated$1$1", f = "UnitFragment.kt", l = {49}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11933e;

            /* renamed from: f */
            public final /* synthetic */ UnitFragment f11934f;

            /* renamed from: com.topstep.fitcloud.pro.ui.settings.UnitFragment$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C0202a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ UnitFragment f11935a;

                public C0202a(UnitFragment unitFragment) {
                    this.f11935a = unitFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    boolean z10;
                    nj.c cVar = (nj.c) obj;
                    UnitFragment unitFragment = this.f11935a;
                    mm.h<Object>[] hVarArr = UnitFragment.f11922w0;
                    LinearLayout linearLayout = unitFragment.f1().layoutTemperature;
                    gm.l.e(linearLayout, "viewBind.layoutTemperature");
                    int i10 = 0;
                    if (!cVar.g(4) && !cVar.g(10)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        i10 = 8;
                    }
                    linearLayout.setVisibility(i10);
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(UnitFragment unitFragment, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f11934f = unitFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f11934f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11933e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    t tVar = this.f11934f.f11926u0;
                    if (tVar != null) {
                        sm.b a10 = tVar.D().a();
                        C0202a c0202a = new C0202a(this.f11934f);
                        this.f11933e = 1;
                        if (a10.a(c0202a, this) == aVar) {
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

        @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.UnitFragment$onViewCreated$1$2", f = "UnitFragment.kt", l = {54}, m = "invokeSuspend")
        /* renamed from: com.topstep.fitcloud.pro.ui.settings.UnitFragment$b$b */
        /* loaded from: classes2.dex */
        public static final class C0203b extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11936e;

            /* renamed from: f */
            public final /* synthetic */ UnitFragment f11937f;

            /* renamed from: g */
            public final /* synthetic */ int f11938g;

            /* renamed from: h */
            public final /* synthetic */ ColorStateList f11939h;

            /* renamed from: com.topstep.fitcloud.pro.ui.settings.UnitFragment$b$b$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ UnitFragment f11940a;

                /* renamed from: b */
                public final /* synthetic */ int f11941b;

                /* renamed from: c */
                public final /* synthetic */ ColorStateList f11942c;

                public a(UnitFragment unitFragment, int i10, ColorStateList colorStateList) {
                    this.f11940a = unitFragment;
                    this.f11941b = i10;
                    this.f11942c = colorStateList;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    uf.b bVar = (uf.b) obj;
                    if (bVar.a()) {
                        UnitFragment unitFragment = this.f11940a;
                        mm.h<Object>[] hVarArr = UnitFragment.f11922w0;
                        unitFragment.f1().itemLengthMetric.setTextColor(this.f11941b);
                        this.f11940a.f1().itemLengthImperial.setTextColor(this.f11942c);
                    } else {
                        UnitFragment unitFragment2 = this.f11940a;
                        mm.h<Object>[] hVarArr2 = UnitFragment.f11922w0;
                        unitFragment2.f1().itemLengthMetric.setTextColor(this.f11942c);
                        this.f11940a.f1().itemLengthImperial.setTextColor(this.f11941b);
                    }
                    if (bVar.c()) {
                        this.f11940a.f1().itemWeightMetric.setTextColor(this.f11941b);
                        this.f11940a.f1().itemWeightImperial.setTextColor(this.f11942c);
                    } else {
                        this.f11940a.f1().itemWeightMetric.setTextColor(this.f11942c);
                        this.f11940a.f1().itemWeightImperial.setTextColor(this.f11941b);
                    }
                    if (bVar.b()) {
                        this.f11940a.f1().itemTemperatureCentigrade.setTextColor(this.f11941b);
                        this.f11940a.f1().itemTemperatureFahrenheit.setTextColor(this.f11942c);
                    } else {
                        this.f11940a.f1().itemTemperatureCentigrade.setTextColor(this.f11942c);
                        this.f11940a.f1().itemTemperatureFahrenheit.setTextColor(this.f11941b);
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0203b(UnitFragment unitFragment, int i10, ColorStateList colorStateList, xl.d<? super C0203b> dVar) {
                super(2, dVar);
                this.f11937f = unitFragment;
                this.f11938g = i10;
                this.f11939h = colorStateList;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                ((C0203b) p(e0Var, dVar)).t(tl.l.f28297a);
                return yl.a.COROUTINE_SUSPENDED;
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new C0203b(this.f11937f, this.f11938g, this.f11939h, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11936e;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.k(obj);
                } else {
                    a0.k(obj);
                    kg.g gVar = this.f11937f.f11925t0;
                    if (gVar != null) {
                        t0 a10 = gVar.a();
                        a aVar2 = new a(this.f11937f, this.f11938g, this.f11939h);
                        this.f11936e = 1;
                        if (a10.a(aVar2, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        gm.l.l("unitConfigRepository");
                        throw null;
                    }
                }
                throw new u2.b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, ColorStateList colorStateList, xl.d<? super b> dVar) {
            super(2, dVar);
            UnitFragment.this = r1;
            this.f11931g = i10;
            this.f11932h = colorStateList;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            b bVar = new b(this.f11931g, this.f11932h, dVar);
            bVar.f11929e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f11929e;
            z0.g(e0Var, null, 0, new a(UnitFragment.this, null), 3);
            z0.g(e0Var, null, 0, new C0203b(UnitFragment.this, this.f11931g, this.f11932h, null), 3);
            return tl.l.f28297a;
        }
    }

    static {
        gm.t tVar = new gm.t(UnitFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentUnitBinding;", 0);
        b0.f15488a.getClass();
        f11922w0 = new mm.h[]{tVar};
    }

    public UnitFragment() {
        super(R.layout.fragment_unit);
        this.f11923r0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentUnitBinding.class, this);
        this.f11927v0 = new a();
    }

    @Override // androidx.fragment.app.r
    public final void I0() {
        this.E = true;
        kg.g gVar = this.f11925t0;
        if (gVar != null) {
            gVar.l(this.f11924s0);
        } else {
            gm.l.l("unitConfigRepository");
            throw null;
        }
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        qi.h.k(qi.h.i(this), new b(u9.a.b(view, R.attr.colorPrimary), f1().itemLengthMetric.getTextColors(), null));
        p.b.g(f1().itemLengthMetric, this.f11927v0);
        p.b.g(f1().itemLengthImperial, this.f11927v0);
        p.b.g(f1().itemWeightMetric, this.f11927v0);
        p.b.g(f1().itemWeightImperial, this.f11927v0);
        p.b.g(f1().itemTemperatureCentigrade, this.f11927v0);
        p.b.g(f1().itemTemperatureFahrenheit, this.f11927v0);
    }

    public final FragmentUnitBinding f1() {
        return (FragmentUnitBinding) this.f11923r0.a(this, f11922w0[0]);
    }
}
