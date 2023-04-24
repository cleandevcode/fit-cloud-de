package com.topstep.fitcloud.pro.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bi.r;
import bi.z0;
import com.google.android.material.appbar.AppBarLayout;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.topstep.fitcloud.pro.databinding.FragmentHomePageBinding;
import com.topstep.fitcloud.pro.function.DateMonitor;
import com.topstep.fitcloud.pro.model.data.BloodPressureRealtime;
import com.topstep.fitcloud.pro.model.data.HeartRateRealtime;
import com.topstep.fitcloud.pro.model.data.OxygenRealtime;
import com.topstep.fitcloud.pro.model.data.PressureRealtime;
import com.topstep.fitcloud.pro.model.data.TemperatureRealtime;
import com.topstep.fitcloud.pro.ui.HomePageFragment;
import com.topstep.fitcloud.pro.ui.widget.HomePageStepInfoLayout;
import com.topstep.fitcloud.pro.ui.widget.module.Text1ModuleItemView;
import com.topstep.fitcloud.pro.ui.widget.module.Text2ModuleItemView;
import com.topstep.fitcloudpro.R;
import fm.l;
import fm.p;
import fm.q;
import gm.b0;
import gm.m;
import gm.t;
import ih.j;
import ih.v;
import java.util.Calendar;
import java.util.Date;
import kg.g;
import kotlin.Metadata;
import lg.u;
import lg.y;
import mm.h;
import n6.a0;
import og.x0;
import ph.g0;
import ph.x;
import pm.e0;
import s.q0;
import si.f;
import sm.o0;
import sm.t0;
import vf.n;
import x.d;
import zl.e;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class HomePageFragment extends j {
    public static final /* synthetic */ h<Object>[] G0;
    public g A0;
    public ah.a B0;
    public DateMonitor C0;
    public final a D0;
    public int E0;
    public ih.h F0;

    /* renamed from: y0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10184y0;

    /* renamed from: z0 */
    public kg.a f10185z0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            HomePageFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            i2.m f10;
            i2.a aVar;
            View view2 = view;
            gm.l.f(view2, "view");
            HomePageFragment homePageFragment = HomePageFragment.this;
            h<Object>[] hVarArr = HomePageFragment.G0;
            if (gm.l.a(view2, homePageFragment.r1().layoutStepInfo)) {
                f10 = tb.a.f(HomePageFragment.this);
                aVar = new i2.a(R.id.toExercise);
            } else if (gm.l.a(view2, HomePageFragment.this.r1().layoutSleep)) {
                f10 = tb.a.f(HomePageFragment.this);
                aVar = new i2.a(R.id.toSleep);
            } else if (gm.l.a(view2, HomePageFragment.this.r1().layoutHeartRate)) {
                f10 = tb.a.f(HomePageFragment.this);
                aVar = new i2.a(R.id.toHeartRate);
            } else if (gm.l.a(view2, HomePageFragment.this.r1().layoutOxygen)) {
                f10 = tb.a.f(HomePageFragment.this);
                aVar = new i2.a(R.id.toOxygen);
            } else if (gm.l.a(view2, HomePageFragment.this.r1().layoutBloodPressure)) {
                f10 = tb.a.f(HomePageFragment.this);
                aVar = new i2.a(R.id.toBloodPressure);
            } else if (gm.l.a(view2, HomePageFragment.this.r1().layoutTemperature)) {
                f10 = tb.a.f(HomePageFragment.this);
                aVar = new i2.a(R.id.toTemperature);
            } else if (gm.l.a(view2, HomePageFragment.this.r1().layoutPressure)) {
                f10 = tb.a.f(HomePageFragment.this);
                aVar = new i2.a(R.id.toPressure);
            } else if (gm.l.a(view2, HomePageFragment.this.r1().layoutEcg)) {
                f10 = tb.a.f(HomePageFragment.this);
                aVar = new i2.a(R.id.toEcg);
            } else {
                if (gm.l.a(view2, HomePageFragment.this.r1().btnHealthTest)) {
                    HomePageFragment homePageFragment2 = HomePageFragment.this;
                    homePageFragment2.l1(homePageFragment2.E0, false);
                } else if (gm.l.a(view2, HomePageFragment.this.r1().layoutWh)) {
                    ah.a aVar2 = HomePageFragment.this.B0;
                    Integer num = null;
                    if (aVar2 != null) {
                        gg.b bVar = (gg.b) aVar2.a().getValue();
                        if (bVar != null) {
                            num = Integer.valueOf(bVar.f15335a);
                        }
                        if (num != null) {
                            f fVar = f.f27071a;
                            HomePageFragment homePageFragment3 = HomePageFragment.this;
                            fVar.g(homePageFragment3, new d(homePageFragment3, num, 2));
                        }
                    } else {
                        gm.l.l("womenHealthRepository");
                        throw null;
                    }
                }
                return tl.l.f28297a;
            }
            v.l(f10, aVar);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.HomePageFragment$onViewCreated$3", f = "HomePageFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10187e;

        /* renamed from: g */
        public final /* synthetic */ oi.c f10189g;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.HomePageFragment$onViewCreated$3$1", f = "HomePageFragment.kt", l = {96}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10190e;

            /* renamed from: f */
            public final /* synthetic */ HomePageFragment f10191f;

            /* renamed from: com.topstep.fitcloud.pro.ui.HomePageFragment$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C0125a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ HomePageFragment f10192a;

                public C0125a(HomePageFragment homePageFragment) {
                    this.f10192a = homePageFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    float f10;
                    int i10;
                    float f11;
                    int i11;
                    vf.p pVar = (vf.p) obj;
                    kg.a aVar = this.f10192a.f10185z0;
                    if (aVar != null) {
                        int i12 = ((uf.a) aVar.a().getValue()).f28704a;
                        g gVar = this.f10192a.A0;
                        if (gVar != null) {
                            boolean a10 = ((uf.b) gVar.a().getValue()).a();
                            HomePageStepInfoLayout homePageStepInfoLayout = this.f10192a.r1().layoutStepInfo;
                            float f12 = 0.0f;
                            if (pVar != null) {
                                homePageStepInfoLayout.getClass();
                                i10 = pVar.f29311b;
                                if (i12 != 0) {
                                    f12 = i10 / i12;
                                }
                                f11 = pVar.f29313d;
                                f10 = pVar.f29312c;
                            } else {
                                f10 = 0.0f;
                                i10 = 0;
                                f11 = 0.0f;
                            }
                            homePageStepInfoLayout.f12360b.tvCurrentStepCount.setText(a0.o(i10));
                            homePageStepInfoLayout.f12360b.stepProgressView.setProgress(f12);
                            homePageStepInfoLayout.f12360b.tvGoalPercent.setText(homePageStepInfoLayout.getResources().getString(R.string.exercise_goal_percent, Integer.valueOf((int) (f12 * 100.0f))));
                            homePageStepInfoLayout.f12360b.tvTotalConsumedValue.setText(a0.c(f11));
                            homePageStepInfoLayout.f12360b.tvTotalDistanceValue.setText(a0.d(f10, a10));
                            TextView textView = homePageStepInfoLayout.f12360b.tvTotalDistanceUnit;
                            if (a10) {
                                i11 = R.string.unit_km;
                            } else {
                                i11 = R.string.unit_mi;
                            }
                            textView.setText(i11);
                            homePageStepInfoLayout.f12360b.tvTodayGoalValue.setText(a0.o(i12));
                            return tl.l.f28297a;
                        }
                        gm.l.l("unitConfigRepository");
                        throw null;
                    }
                    gm.l.l("exerciseGoalRepository");
                    throw null;
                }
            }

            @zl.e(c = "com.topstep.fitcloud.pro.ui.HomePageFragment$onViewCreated$3$1$invokeSuspend$$inlined$flatMapLatest$1", f = "HomePageFragment.kt", l = {190}, m = "invokeSuspend")
            /* renamed from: com.topstep.fitcloud.pro.ui.HomePageFragment$b$a$b */
            /* loaded from: classes2.dex */
            public static final class C0126b extends i implements q<sm.g<? super vf.p>, sf.j, xl.d<? super tl.l>, Object> {

                /* renamed from: e */
                public int f10193e;

                /* renamed from: f */
                public /* synthetic */ sm.g f10194f;

                /* renamed from: g */
                public /* synthetic */ Object f10195g;

                /* renamed from: h */
                public final /* synthetic */ HomePageFragment f10196h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0126b(HomePageFragment homePageFragment, xl.d dVar) {
                    super(3, dVar);
                    this.f10196h = homePageFragment;
                }

                @Override // fm.q
                public final Object j(sm.g<? super vf.p> gVar, sf.j jVar, xl.d<? super tl.l> dVar) {
                    C0126b c0126b = new C0126b(this.f10196h, dVar);
                    c0126b.f10194f = gVar;
                    c0126b.f10195g = jVar;
                    return c0126b.t(tl.l.f28297a);
                }

                @Override // zl.a
                public final Object t(Object obj) {
                    yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                    int i10 = this.f10193e;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            mf.a0.k(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        mf.a0.k(obj);
                        sm.g gVar = this.f10194f;
                        y J = this.f10196h.h1().J(((sf.j) this.f10195g).f26940a);
                        this.f10193e = 1;
                        if (r.v(this, J, gVar) == aVar) {
                            return aVar;
                        }
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HomePageFragment homePageFragment, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f10191f = homePageFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f10191f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10190e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        mf.a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    mf.a0.k(obj);
                    HomePageFragment homePageFragment = this.f10191f;
                    DateMonitor dateMonitor = homePageFragment.C0;
                    if (dateMonitor != null) {
                        tm.j O = r.O(dateMonitor.f9546c, new C0126b(homePageFragment, null));
                        C0125a c0125a = new C0125a(this.f10191f);
                        this.f10190e = 1;
                        if (O.a(c0125a, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        gm.l.l("dateMonitor");
                        throw null;
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.HomePageFragment$onViewCreated$3$2", f = "HomePageFragment.kt", l = {103}, m = "invokeSuspend")
        /* renamed from: com.topstep.fitcloud.pro.ui.HomePageFragment$b$b */
        /* loaded from: classes2.dex */
        public static final class C0127b extends i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10197e;

            /* renamed from: f */
            public final /* synthetic */ HomePageFragment f10198f;

            /* renamed from: com.topstep.fitcloud.pro.ui.HomePageFragment$b$b$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ HomePageFragment f10199a;

                public a(HomePageFragment homePageFragment) {
                    this.f10199a = homePageFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    int i10;
                    nj.c cVar = (nj.c) obj;
                    this.f10199a.E0 = 0;
                    boolean z10 = true;
                    if (cVar.g(0)) {
                        this.f10199a.r1().layoutHeartRate.setVisibility(0);
                        Text1ModuleItemView text1ModuleItemView = this.f10199a.r1().layoutHeartRate;
                        text1ModuleItemView.f12482h.tvTitle.setText(R.string.heart_rate_module);
                        text1ModuleItemView.f12482h.imgIcon.setImageResource(R.drawable.ic_main_module_heart_rate);
                        this.f10199a.E0 |= 1;
                    } else {
                        this.f10199a.r1().layoutHeartRate.setVisibility(8);
                    }
                    if (cVar.g(1)) {
                        this.f10199a.r1().layoutOxygen.setVisibility(0);
                        Text1ModuleItemView text1ModuleItemView2 = this.f10199a.r1().layoutOxygen;
                        text1ModuleItemView2.f12482h.tvTitle.setText(R.string.oxygen_module);
                        text1ModuleItemView2.f12482h.imgIcon.setImageResource(R.drawable.ic_main_module_oxygen);
                        this.f10199a.E0 |= 2;
                    } else {
                        this.f10199a.r1().layoutOxygen.setVisibility(8);
                    }
                    if (cVar.g(2)) {
                        this.f10199a.r1().layoutBloodPressure.setVisibility(0);
                        Text1ModuleItemView text1ModuleItemView3 = this.f10199a.r1().layoutBloodPressure;
                        text1ModuleItemView3.f12482h.tvTitle.setText(R.string.blood_pressure_module);
                        text1ModuleItemView3.f12482h.imgIcon.setImageResource(R.drawable.ic_main_module_blood_pressure);
                        this.f10199a.E0 |= 4;
                    } else {
                        this.f10199a.r1().layoutBloodPressure.setVisibility(8);
                    }
                    if (cVar.g(10)) {
                        this.f10199a.r1().layoutTemperature.setVisibility(0);
                        Text2ModuleItemView text2ModuleItemView = this.f10199a.r1().layoutTemperature;
                        text2ModuleItemView.f12483h.tvTitle.setText(R.string.temperature_module);
                        text2ModuleItemView.f12483h.imgIcon.setImageResource(R.drawable.ic_main_module_temperature);
                        this.f10199a.E0 |= 32;
                    } else {
                        this.f10199a.r1().layoutTemperature.setVisibility(8);
                    }
                    if (cVar.g(13)) {
                        this.f10199a.r1().layoutPressure.setVisibility(0);
                        Text1ModuleItemView text1ModuleItemView4 = this.f10199a.r1().layoutPressure;
                        text1ModuleItemView4.f12482h.tvTitle.setText(R.string.pressure_module);
                        text1ModuleItemView4.f12482h.imgIcon.setImageResource(R.drawable.ic_main_module_pressure);
                        this.f10199a.E0 |= 64;
                    } else {
                        this.f10199a.r1().layoutPressure.setVisibility(8);
                    }
                    Button button = this.f10199a.r1().btnHealthTest;
                    gm.l.e(button, "viewBind.btnHealthTest");
                    if (this.f10199a.E0 == 0) {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    button.setVisibility(i10);
                    if (cVar.g(5)) {
                        this.f10199a.r1().layoutEcg.setVisibility(0);
                        Text1ModuleItemView text1ModuleItemView5 = this.f10199a.r1().layoutEcg;
                        text1ModuleItemView5.f12482h.tvTitle.setText(R.string.ecg_module);
                        text1ModuleItemView5.f12482h.imgIcon.setImageResource(R.drawable.ic_main_module_ecg);
                    } else {
                        this.f10199a.r1().layoutEcg.setVisibility(8);
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0127b(HomePageFragment homePageFragment, xl.d<? super C0127b> dVar) {
                super(2, dVar);
                this.f10198f = homePageFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((C0127b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new C0127b(this.f10198f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10197e;
                if (i10 == 0) {
                    mf.a0.k(obj);
                    sm.b a10 = this.f10198f.i1().D().a();
                    a aVar2 = new a(this.f10198f);
                    this.f10197e = 1;
                    if (a10.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    mf.a0.k(obj);
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.HomePageFragment$onViewCreated$3$3", f = "HomePageFragment.kt", l = {154}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class c extends i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10200e;

            /* renamed from: f */
            public final /* synthetic */ HomePageFragment f10201f;

            /* renamed from: g */
            public final /* synthetic */ oi.c f10202g;

            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ HomePageFragment f10203a;

                /* renamed from: b */
                public final /* synthetic */ oi.c f10204b;

                public a(HomePageFragment homePageFragment, oi.c cVar) {
                    this.f10203a = homePageFragment;
                    this.f10204b = cVar;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    Integer num = (Integer) obj;
                    if (num == null) {
                        HomePageFragment homePageFragment = this.f10203a;
                        h<Object>[] hVarArr = HomePageFragment.G0;
                        homePageFragment.r1().layoutRefreshLoad.i(0, true);
                    } else if (num.intValue() < 0) {
                        HomePageFragment homePageFragment2 = this.f10203a;
                        h<Object>[] hVarArr2 = HomePageFragment.G0;
                        homePageFragment2.r1().layoutRefreshLoad.i(1000, false);
                    } else if (num.intValue() == 127) {
                        HomePageFragment homePageFragment3 = this.f10203a;
                        h<Object>[] hVarArr3 = HomePageFragment.G0;
                        homePageFragment3.r1().layoutRefreshLoad.i(1000, true);
                    } else {
                        HomePageFragment homePageFragment4 = this.f10203a;
                        h<Object>[] hVarArr4 = HomePageFragment.G0;
                        homePageFragment4.r1().layoutRefreshLoad.setRefreshing(true);
                        this.f10204b.setProgress(num.intValue());
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(HomePageFragment homePageFragment, oi.c cVar, xl.d<? super c> dVar) {
                super(2, dVar);
                this.f10201f = homePageFragment;
                this.f10202g = cVar;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                ((c) p(e0Var, dVar)).t(tl.l.f28297a);
                return yl.a.COROUTINE_SUSPENDED;
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new c(this.f10201f, this.f10202g, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10200e;
                if (i10 == 0) {
                    mf.a0.k(obj);
                    t0 G = this.f10201f.i1().G();
                    a aVar2 = new a(this.f10201f, this.f10202g);
                    this.f10200e = 1;
                    if (G.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    mf.a0.k(obj);
                }
                throw new u2.b();
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.HomePageFragment$onViewCreated$3$4", f = "HomePageFragment.kt", l = {168}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class d extends i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10205e;

            /* renamed from: f */
            public final /* synthetic */ HomePageFragment f10206f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ HomePageFragment f10207a;

                public a(HomePageFragment homePageFragment) {
                    this.f10207a = homePageFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    HomePageFragment.p1(this.f10207a, (vf.a) obj);
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(HomePageFragment homePageFragment, xl.d<? super d> dVar) {
                super(2, dVar);
                this.f10206f = homePageFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((d) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new d(this.f10206f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10205e;
                if (i10 == 0) {
                    mf.a0.k(obj);
                    tm.j m10 = this.f10206f.h1().m();
                    a aVar2 = new a(this.f10206f);
                    this.f10205e = 1;
                    if (m10.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    mf.a0.k(obj);
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.HomePageFragment$onViewCreated$3$5", f = "HomePageFragment.kt", l = {178}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class e extends i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10208e;

            /* renamed from: f */
            public final /* synthetic */ HomePageFragment f10209f;

            @zl.e(c = "com.topstep.fitcloud.pro.ui.HomePageFragment$onViewCreated$3$5$1", f = "HomePageFragment.kt", l = {}, m = "invokeSuspend")
            /* loaded from: classes2.dex */
            public static final class a extends i implements q<Boolean, n, xl.d<? super x>, Object> {

                /* renamed from: e */
                public /* synthetic */ boolean f10210e;

                /* renamed from: f */
                public /* synthetic */ n f10211f;

                public a(xl.d<? super a> dVar) {
                    super(3, dVar);
                }

                @Override // fm.q
                public final Object j(Boolean bool, n nVar, xl.d<? super x> dVar) {
                    boolean booleanValue = bool.booleanValue();
                    a aVar = new a(dVar);
                    aVar.f10210e = booleanValue;
                    aVar.f10211f = nVar;
                    return aVar.t(tl.l.f28297a);
                }

                @Override // zl.a
                public final Object t(Object obj) {
                    mf.a0.k(obj);
                    return new x(this.f10210e, this.f10211f);
                }
            }

            /* renamed from: com.topstep.fitcloud.pro.ui.HomePageFragment$b$e$b */
            /* loaded from: classes2.dex */
            public static final class C0128b<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ HomePageFragment f10212a;

                public C0128b(HomePageFragment homePageFragment) {
                    this.f10212a = homePageFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    boolean z10;
                    Text1ModuleItemView text1ModuleItemView;
                    int i10;
                    x xVar = (x) obj;
                    n nVar = xVar.f24248b;
                    int i11 = nVar.f29300b + nVar.f29301c + nVar.f29302d;
                    boolean z11 = true;
                    if (i11 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        HomePageFragment homePageFragment = this.f10212a;
                        h<Object>[] hVarArr = HomePageFragment.G0;
                        Text1ModuleItemView text1ModuleItemView2 = homePageFragment.r1().layoutSleep;
                        n nVar2 = xVar.f24248b;
                        int i12 = nVar2.f29300b + nVar2.f29301c;
                        text1ModuleItemView2.f12482h.tvTitle.setText(R.string.sleep_last_night);
                        TextView textView = text1ModuleItemView2.f12482h.tvText1;
                        Context context = text1ModuleItemView2.getContext();
                        gm.l.e(context, "context");
                        String string = context.getString(R.string.unit_hour_minute_param, Integer.valueOf(i12 / 3600), Integer.valueOf((i12 % 3600) / 60));
                        gm.l.e(string, "context.getString(R.stri…3600, second % 3600 / 60)");
                        textView.setText(string);
                    } else {
                        if (xVar.f24247a) {
                            Calendar calendar = Calendar.getInstance();
                            int i13 = (calendar.get(11) * 60) + calendar.get(12);
                            if (i13 <= 1290 && i13 >= 240) {
                                z11 = false;
                            }
                            if (z11) {
                                HomePageFragment homePageFragment2 = this.f10212a;
                                h<Object>[] hVarArr2 = HomePageFragment.G0;
                                text1ModuleItemView = homePageFragment2.r1().layoutSleep;
                                i10 = R.string.sleep_tips_monitor;
                                text1ModuleItemView.f12482h.tvTitle.setText(R.string.sleep_module);
                                text1ModuleItemView.f12482h.tvText1.setText(i10);
                            }
                        }
                        HomePageFragment homePageFragment3 = this.f10212a;
                        h<Object>[] hVarArr3 = HomePageFragment.G0;
                        text1ModuleItemView = homePageFragment3.r1().layoutSleep;
                        i10 = R.string.sleep_tips_no_data;
                        text1ModuleItemView.f12482h.tvTitle.setText(R.string.sleep_module);
                        text1ModuleItemView.f12482h.tvText1.setText(i10);
                    }
                    return tl.l.f28297a;
                }
            }

            @zl.e(c = "com.topstep.fitcloud.pro.ui.HomePageFragment$onViewCreated$3$5$invokeSuspend$$inlined$flatMapLatest$1", f = "HomePageFragment.kt", l = {190}, m = "invokeSuspend")
            /* loaded from: classes2.dex */
            public static final class c extends i implements q<sm.g<? super n>, sf.j, xl.d<? super tl.l>, Object> {

                /* renamed from: e */
                public int f10213e;

                /* renamed from: f */
                public /* synthetic */ sm.g f10214f;

                /* renamed from: g */
                public /* synthetic */ Object f10215g;

                /* renamed from: h */
                public final /* synthetic */ HomePageFragment f10216h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(HomePageFragment homePageFragment, xl.d dVar) {
                    super(3, dVar);
                    this.f10216h = homePageFragment;
                }

                @Override // fm.q
                public final Object j(sm.g<? super n> gVar, sf.j jVar, xl.d<? super tl.l> dVar) {
                    c cVar = new c(this.f10216h, dVar);
                    cVar.f10214f = gVar;
                    cVar.f10215g = jVar;
                    return cVar.t(tl.l.f28297a);
                }

                @Override // zl.a
                public final Object t(Object obj) {
                    yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                    int i10 = this.f10213e;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            mf.a0.k(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        mf.a0.k(obj);
                        sm.g gVar = this.f10214f;
                        u f10 = this.f10216h.h1().f(((sf.j) this.f10215g).f26940a);
                        this.f10213e = 1;
                        if (r.v(this, f10, gVar) == aVar) {
                            return aVar;
                        }
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(HomePageFragment homePageFragment, xl.d<? super e> dVar) {
                super(2, dVar);
                this.f10209f = homePageFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((e) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new e(this.f10209f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                Object obj2 = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10208e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        mf.a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    mf.a0.k(obj);
                    HomePageFragment homePageFragment = this.f10209f;
                    DateMonitor dateMonitor = homePageFragment.C0;
                    if (dateMonitor != null) {
                        tm.j O = r.O(dateMonitor.f9546c, new c(homePageFragment, null));
                        sm.f<Boolean> a10 = x0.a(this.f10209f.i1());
                        a aVar = new a(null);
                        C0128b c0128b = new C0128b(this.f10209f);
                        this.f10208e = 1;
                        Object c10 = p001if.d.c(this, new o0(aVar, null), c0128b, new sm.f[]{a10, O});
                        if (c10 != obj2) {
                            c10 = tl.l.f28297a;
                        }
                        if (c10 == obj2) {
                            return obj2;
                        }
                    } else {
                        gm.l.l("dateMonitor");
                        throw null;
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.HomePageFragment$onViewCreated$3$6", f = "HomePageFragment.kt", l = {193}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class f extends i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10217e;

            /* renamed from: f */
            public final /* synthetic */ HomePageFragment f10218f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ HomePageFragment f10219a;

                public a(HomePageFragment homePageFragment) {
                    this.f10219a = homePageFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    Object q12 = HomePageFragment.q1(this.f10219a, (gg.b) obj, dVar);
                    return q12 == yl.a.COROUTINE_SUSPENDED ? q12 : tl.l.f28297a;
                }
            }

            @zl.e(c = "com.topstep.fitcloud.pro.ui.HomePageFragment$onViewCreated$3$6$invokeSuspend$$inlined$flatMapLatest$1", f = "HomePageFragment.kt", l = {190}, m = "invokeSuspend")
            /* renamed from: com.topstep.fitcloud.pro.ui.HomePageFragment$b$f$b */
            /* loaded from: classes2.dex */
            public static final class C0129b extends i implements q<sm.g<? super gg.b>, sf.j, xl.d<? super tl.l>, Object> {

                /* renamed from: e */
                public int f10220e;

                /* renamed from: f */
                public /* synthetic */ sm.g f10221f;

                /* renamed from: g */
                public /* synthetic */ Object f10222g;

                /* renamed from: h */
                public final /* synthetic */ HomePageFragment f10223h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0129b(HomePageFragment homePageFragment, xl.d dVar) {
                    super(3, dVar);
                    this.f10223h = homePageFragment;
                }

                @Override // fm.q
                public final Object j(sm.g<? super gg.b> gVar, sf.j jVar, xl.d<? super tl.l> dVar) {
                    C0129b c0129b = new C0129b(this.f10223h, dVar);
                    c0129b.f10221f = gVar;
                    c0129b.f10222g = jVar;
                    return c0129b.t(tl.l.f28297a);
                }

                @Override // zl.a
                public final Object t(Object obj) {
                    yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                    int i10 = this.f10220e;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            mf.a0.k(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        mf.a0.k(obj);
                        sm.g gVar = this.f10221f;
                        sf.j jVar = (sf.j) this.f10222g;
                        ah.a aVar2 = this.f10223h.B0;
                        if (aVar2 != null) {
                            t0 a10 = aVar2.a();
                            this.f10220e = 1;
                            if (r.v(this, a10, gVar) == aVar) {
                                return aVar;
                            }
                        } else {
                            gm.l.l("womenHealthRepository");
                            throw null;
                        }
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(HomePageFragment homePageFragment, xl.d<? super f> dVar) {
                super(2, dVar);
                this.f10218f = homePageFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((f) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new f(this.f10218f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10217e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        mf.a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    mf.a0.k(obj);
                    HomePageFragment homePageFragment = this.f10218f;
                    DateMonitor dateMonitor = homePageFragment.C0;
                    if (dateMonitor != null) {
                        tm.j O = r.O(dateMonitor.f9546c, new C0129b(homePageFragment, null));
                        a aVar2 = new a(this.f10218f);
                        this.f10217e = 1;
                        if (O.a(aVar2, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        gm.l.l("dateMonitor");
                        throw null;
                    }
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(oi.c cVar, xl.d<? super b> dVar) {
            super(2, dVar);
            HomePageFragment.this = r1;
            this.f10189g = cVar;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            b bVar = new b(this.f10189g, dVar);
            bVar.f10187e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            e0 e0Var = (e0) this.f10187e;
            z0.g(e0Var, null, 0, new a(HomePageFragment.this, null), 3);
            z0.g(e0Var, null, 0, new C0127b(HomePageFragment.this, null), 3);
            z0.g(e0Var, null, 0, new c(HomePageFragment.this, this.f10189g, null), 3);
            z0.g(e0Var, null, 0, new d(HomePageFragment.this, null), 3);
            z0.g(e0Var, null, 0, new e(HomePageFragment.this, null), 3);
            z0.g(e0Var, null, 0, new f(HomePageFragment.this, null), 3);
            return tl.l.f28297a;
        }
    }

    @e(c = "com.topstep.fitcloud.pro.ui.HomePageFragment$stopTesting$1", f = "HomePageFragment.kt", l = {333}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public HomePageFragment f10224e;

        /* renamed from: f */
        public int f10225f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(2, dVar);
            HomePageFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((c) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new c(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            HomePageFragment homePageFragment;
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f10225f;
            if (i10 == 0) {
                mf.a0.k(obj);
                HomePageFragment homePageFragment2 = HomePageFragment.this;
                tm.j m10 = homePageFragment2.h1().m();
                this.f10224e = homePageFragment2;
                this.f10225f = 1;
                Object w10 = r.w(m10, this);
                if (w10 == aVar) {
                    return aVar;
                }
                homePageFragment = homePageFragment2;
                obj = w10;
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                homePageFragment = this.f10224e;
                mf.a0.k(obj);
            }
            HomePageFragment.p1(homePageFragment, (vf.a) obj);
            return tl.l.f28297a;
        }
    }

    static {
        t tVar = new t(HomePageFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentHomePageBinding;", 0);
        b0.f15488a.getClass();
        G0 = new h[]{tVar};
    }

    public HomePageFragment() {
        super(R.layout.fragment_home_page);
        this.f10184y0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentHomePageBinding.class, this);
        this.D0 = new a();
    }

    public static final void p1(HomePageFragment homePageFragment, vf.a aVar) {
        HeartRateRealtime heartRateRealtime;
        OxygenRealtime oxygenRealtime;
        BloodPressureRealtime bloodPressureRealtime;
        TemperatureRealtime temperatureRealtime;
        Text1ModuleItemView text1ModuleItemView = homePageFragment.r1().layoutHeartRate;
        PressureRealtime pressureRealtime = null;
        if (aVar != null) {
            heartRateRealtime = aVar.f29257a;
        } else {
            heartRateRealtime = null;
        }
        if (heartRateRealtime == null) {
            text1ModuleItemView.f12482h.tvText1.setText(R.string.healthy_not_test_data);
        } else {
            text1ModuleItemView.getClass();
            text1ModuleItemView.g(heartRateRealtime.f9581b);
        }
        Text1ModuleItemView text1ModuleItemView2 = homePageFragment.r1().layoutOxygen;
        if (aVar != null) {
            oxygenRealtime = aVar.f29258b;
        } else {
            oxygenRealtime = null;
        }
        if (oxygenRealtime == null) {
            text1ModuleItemView2.f12482h.tvText1.setText(R.string.healthy_not_test_data);
        } else {
            text1ModuleItemView2.getClass();
            text1ModuleItemView2.h(oxygenRealtime.f9586b);
        }
        Text1ModuleItemView text1ModuleItemView3 = homePageFragment.r1().layoutBloodPressure;
        if (aVar != null) {
            bloodPressureRealtime = aVar.f29259c;
        } else {
            bloodPressureRealtime = null;
        }
        if (bloodPressureRealtime == null) {
            text1ModuleItemView3.f12482h.tvText1.setText(R.string.healthy_not_test_data);
        } else {
            text1ModuleItemView3.getClass();
            text1ModuleItemView3.f(bloodPressureRealtime.f9570b, bloodPressureRealtime.f9571c);
        }
        Text2ModuleItemView text2ModuleItemView = homePageFragment.r1().layoutTemperature;
        if (aVar != null) {
            temperatureRealtime = aVar.f29260d;
        } else {
            temperatureRealtime = null;
        }
        g gVar = homePageFragment.A0;
        if (gVar != null) {
            boolean b10 = ((uf.b) gVar.a().getValue()).b();
            if (temperatureRealtime == null) {
                text2ModuleItemView.f12483h.tvText1.setText(R.string.healthy_not_test_data);
                text2ModuleItemView.f12483h.tvText2.setText((CharSequence) null);
            } else {
                text2ModuleItemView.getClass();
                text2ModuleItemView.g(temperatureRealtime.f9653b, temperatureRealtime.f9654c, b10);
            }
            Text1ModuleItemView text1ModuleItemView4 = homePageFragment.r1().layoutPressure;
            if (aVar != null) {
                pressureRealtime = aVar.f29261e;
            }
            if (pressureRealtime == null) {
                text1ModuleItemView4.f12482h.tvText1.setText(R.string.healthy_not_test_data);
                return;
            }
            text1ModuleItemView4.getClass();
            text1ModuleItemView4.i(pressureRealtime.f9591b);
            return;
        }
        gm.l.l("unitConfigRepository");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object q1(com.topstep.fitcloud.pro.ui.HomePageFragment r11, gg.b r12, xl.d r13) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.HomePageFragment.q1(com.topstep.fitcloud.pro.ui.HomePageFragment, gg.b, xl.d):java.lang.Object");
    }

    @Override // ph.y, lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        MainActivity mainActivity;
        boolean z10;
        gm.l.f(view, "view");
        super.O0(view, bundle);
        androidx.fragment.app.x f02 = f0();
        if (f02 instanceof MainActivity) {
            mainActivity = (MainActivity) f02;
        } else {
            mainActivity = null;
        }
        if (mainActivity != null) {
            z10 = mainActivity.N();
        } else {
            z10 = false;
        }
        if (z10) {
            r1().toolbar.setNavigationIcon((Drawable) null);
        } else {
            r1().toolbar.setNavigationIcon(R.drawable.ic_menu_sport);
            r1().toolbar.setNavigationOnClickListener(new n6.e(1, this));
        }
        r1().toolbar.getViewTreeObserver().addOnGlobalLayoutListener(new ih.q(this));
        oi.c cVar = new oi.c(V0());
        r1().layoutRefreshLoad.setRefreshView(cVar);
        r1().layoutRefreshLoad.setOnRefreshListener(new q0(8, this));
        r1().appBarLayout.a(new AppBarLayout.f() { // from class: ih.p
            @Override // com.google.android.material.appbar.AppBarLayout.a
            public final void a(int i10) {
                HomePageFragment homePageFragment = HomePageFragment.this;
                mm.h<Object>[] hVarArr = HomePageFragment.G0;
                gm.l.f(homePageFragment, "this$0");
                homePageFragment.r1().layoutRefreshLoad.g(i10 >= 0);
            }
        });
        Text1ModuleItemView text1ModuleItemView = r1().layoutSleep;
        text1ModuleItemView.f12482h.tvTitle.setText(R.string.sleep_last_night);
        text1ModuleItemView.f12482h.imgIcon.setImageResource(R.drawable.ic_main_module_sleep);
        p.b.g(r1().layoutStepInfo, this.D0);
        p.b.g(r1().layoutSleep, this.D0);
        p.b.g(r1().layoutHeartRate, this.D0);
        p.b.g(r1().layoutOxygen, this.D0);
        p.b.g(r1().layoutBloodPressure, this.D0);
        p.b.g(r1().layoutTemperature, this.D0);
        p.b.g(r1().layoutPressure, this.D0);
        p.b.g(r1().layoutEcg, this.D0);
        p.b.g(r1().btnHealthTest, this.D0);
        p.b.g(r1().layoutWh, this.D0);
        qi.h.k(qi.h.i(this), new b(cVar, null));
    }

    @Override // ph.u
    public final void j1() {
        og.t i12 = i1();
        g gVar = this.A0;
        if (gVar != null) {
            ih.h hVar = new ih.h(i12, gVar, this.E0);
            r1().layoutHeartRate.g(0);
            r1().layoutOxygen.h(0);
            r1().layoutBloodPressure.f(0, 0);
            r1().layoutTemperature.f(hVar.f16840c);
            r1().layoutPressure.i(0);
            r1().btnHealthTest.setText(R.string.healthy_end_test);
            this.F0 = hVar;
            return;
        }
        gm.l.l("unitConfigRepository");
        throw null;
    }

    @Override // ph.u
    public final void k1() {
        HeartRateRealtime heartRateRealtime;
        int i10;
        OxygenRealtime oxygenRealtime;
        BloodPressureRealtime bloodPressureRealtime;
        TemperatureRealtime temperatureRealtime;
        PressureRealtime pressureRealtime;
        ih.h hVar = this.F0;
        if (hVar == null) {
            return;
        }
        g0 g0Var = hVar.f16841d;
        if (g0Var != null && g0Var.f24156i > 0) {
            HeartRateRealtime heartRateRealtime2 = new HeartRateRealtime(((int) g0Var.f24150c) / g0Var.f24156i, new Date());
            p000do.a.f13275a.h("App heartRate realtime:%s", heartRateRealtime2.toString());
            heartRateRealtime = heartRateRealtime2;
            i10 = 1;
        } else {
            heartRateRealtime = null;
            i10 = 0;
        }
        g0 g0Var2 = hVar.f16842e;
        if (g0Var2 != null && g0Var2.f24156i > 0) {
            OxygenRealtime oxygenRealtime2 = new OxygenRealtime(((int) g0Var2.f24150c) / g0Var2.f24156i, new Date());
            p000do.a.f13275a.h("App oxygen realtime:%s", oxygenRealtime2.toString());
            i10++;
            oxygenRealtime = oxygenRealtime2;
        } else {
            oxygenRealtime = null;
        }
        g0 g0Var3 = hVar.f16843f;
        if (g0Var3 != null && g0Var3.f24156i > 0) {
            BloodPressureRealtime d10 = g0Var3.d(hVar.f16838a, hVar.f16839b);
            p000do.a.f13275a.h("App bloodPressure realtime:%s", d10.toString());
            i10++;
            bloodPressureRealtime = d10;
        } else {
            bloodPressureRealtime = null;
        }
        g0 g0Var4 = hVar.f16844g;
        if (g0Var4 != null && g0Var4.f24156i > 0) {
            TemperatureRealtime e10 = g0Var4.e();
            p000do.a.f13275a.h("App temperature realtime:%s", e10.toString());
            i10++;
            temperatureRealtime = e10;
        } else {
            temperatureRealtime = null;
        }
        g0 g0Var5 = hVar.f16845h;
        if (g0Var5 != null && g0Var5.f24156i > 0) {
            PressureRealtime pressureRealtime2 = new PressureRealtime(((int) g0Var5.f24150c) / g0Var5.f24156i, new Date());
            p000do.a.f13275a.h("App pressure realtime:%s", pressureRealtime2.toString());
            i10++;
            pressureRealtime = pressureRealtime2;
        } else {
            pressureRealtime = null;
        }
        if (i10 == 0) {
            z0.n(new c(null));
        } else {
            h1().p(new vf.a(heartRateRealtime, oxygenRealtime, bloodPressureRealtime, temperatureRealtime, pressureRealtime));
        }
        r1().btnHealthTest.setText(R.string.healthy_start_test);
        this.F0 = null;
    }

    @Override // ph.u
    public final void m1(oj.d dVar) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        gm.l.f(dVar, WiseOpenHianalyticsData.UNION_RESULT);
        ih.h hVar = this.F0;
        if (hVar == null) {
            return;
        }
        g0 g0Var = hVar.f16841d;
        if (g0Var != null && (i12 = dVar.f23574a) > 0) {
            g0Var.a(i12);
            r1().layoutHeartRate.g(i12);
        }
        g0 g0Var2 = hVar.f16842e;
        if (g0Var2 != null && (i11 = dVar.f23575b) > 0) {
            g0Var2.a(i11);
            r1().layoutOxygen.h(i11);
        }
        g0 g0Var3 = hVar.f16843f;
        if (g0Var3 != null) {
            int i13 = dVar.f23577d;
            int i14 = dVar.f23576c;
            if (i13 > 0 && (hVar.f16839b || i14 > 0)) {
                g0Var3.b(i13, i14);
                r1().layoutBloodPressure.f(i13, i14);
            }
        }
        g0 g0Var4 = hVar.f16844g;
        if (g0Var4 != null) {
            float f10 = dVar.f23580g;
            float f11 = dVar.f23579f;
            if (f11 == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                g0Var4.b(f10, f11);
                r1().layoutTemperature.g(f10, f11, hVar.f16840c);
            }
        }
        g0 g0Var5 = hVar.f16845h;
        if (g0Var5 != null && (i10 = dVar.f23581h) > 0) {
            g0Var5.a(i10);
            r1().layoutPressure.i(i10);
        }
    }

    @Override // ph.u
    public final void n1(int i10) {
    }

    public final FragmentHomePageBinding r1() {
        return (FragmentHomePageBinding) this.f10184y0.a(this, G0[0]);
    }
}
