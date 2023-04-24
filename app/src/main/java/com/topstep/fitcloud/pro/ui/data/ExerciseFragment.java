package com.topstep.fitcloud.pro.ui.data;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import bi.m0;
import bi.r;
import bi.z0;
import com.github.mikephil.charting.charts.BarChart;
import com.google.android.material.appbar.AppBarLayout;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.topstep.fitcloud.pro.databinding.FragmentExerciseBinding;
import com.topstep.fitcloud.pro.function.DateMonitor;
import com.topstep.fitcloud.pro.ui.data.ExerciseFragment;
import com.topstep.fitcloud.pro.ui.widget.ExerciseCardLayout;
import com.topstep.fitcloudpro.R;
import fm.q;
import gm.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kg.g;
import kotlin.Metadata;
import lg.c;
import mf.a0;
import mm.h;
import ph.b0;
import ph.l0;
import pi.f;
import pm.e0;
import s7.j;
import sf.j;
import sm.g1;
import tl.l;
import uf.b;
import vf.o;
import vf.p;
import xl.d;
import zl.e;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class ExerciseFragment extends l0 {
    public static final /* synthetic */ h<Object>[] D0;
    public DateMonitor A0;
    public p B0;
    public List<p> C0;

    /* renamed from: u0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10458u0;

    /* renamed from: v0 */
    public boolean f10459v0;

    /* renamed from: w0 */
    public int f10460w0;

    /* renamed from: x0 */
    public g f10461x0;

    /* renamed from: y0 */
    public kg.a f10462y0;

    /* renamed from: z0 */
    public c f10463z0;

    @e(c = "com.topstep.fitcloud.pro.ui.data.ExerciseFragment$onViewCreated$2", f = "ExerciseFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements fm.p<e0, d<? super l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10464e;

        @e(c = "com.topstep.fitcloud.pro.ui.data.ExerciseFragment$onViewCreated$2$1", f = "ExerciseFragment.kt", l = {102}, m = "invokeSuspend")
        /* renamed from: com.topstep.fitcloud.pro.ui.data.ExerciseFragment$a$a */
        /* loaded from: classes2.dex */
        public static final class C0135a extends i implements fm.p<e0, d<? super l>, Object> {

            /* renamed from: e */
            public int f10466e;

            /* renamed from: f */
            public final /* synthetic */ ExerciseFragment f10467f;

            /* renamed from: com.topstep.fitcloud.pro.ui.data.ExerciseFragment$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C0136a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ ExerciseFragment f10468a;

                public C0136a(ExerciseFragment exerciseFragment) {
                    this.f10468a = exerciseFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, d dVar) {
                    p pVar = (p) obj;
                    ExerciseFragment exerciseFragment = this.f10468a;
                    h<Object>[] hVarArr = ExerciseFragment.D0;
                    exerciseFragment.getClass();
                    ArrayList arrayList = new ArrayList(24);
                    Calendar calendar = Calendar.getInstance();
                    gm.l.e(calendar, "calendar");
                    Date date = pVar.f29310a;
                    gm.l.f(date, CrashHianalyticsData.TIME);
                    calendar.setTime(date);
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    gm.l.e(calendar.getTime(), "calendar.time");
                    int i10 = 0;
                    for (int i11 = 0; i11 < 24; i11++) {
                        long timeInMillis = calendar.getTimeInMillis();
                        o oVar = null;
                        List<o> list = pVar.f29314e;
                        if (list != null && i10 < list.size() && list.get(i10).f29305a.getTime() == timeInMillis) {
                            oVar = list.get(i10);
                            i10++;
                        }
                        if (oVar == null) {
                            oVar = new o(new Date(timeInMillis), 0, 0.0f, 0.0f);
                        }
                        arrayList.add(oVar);
                        calendar.set(11, calendar.get(11) + 1);
                    }
                    Date date2 = pVar.f29310a;
                    int i12 = pVar.f29311b;
                    float f10 = pVar.f29312c;
                    float f11 = pVar.f29313d;
                    gm.l.f(date2, "date");
                    exerciseFragment.B0 = new p(date2, i12, f10, f11, arrayList);
                    if (this.f10468a.i1().rgData.getCheckedRadioButtonId() == R.id.rb_day) {
                        this.f10468a.j1(R.id.rb_day);
                    }
                    return l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0135a(ExerciseFragment exerciseFragment, d<? super C0135a> dVar) {
                super(2, dVar);
                this.f10467f = exerciseFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, d<? super l> dVar) {
                return ((C0135a) p(e0Var, dVar)).t(l.f28297a);
            }

            @Override // zl.a
            public final d<l> p(Object obj, d<?> dVar) {
                return new C0135a(this.f10467f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10466e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    ExerciseFragment exerciseFragment = this.f10467f;
                    DateMonitor dateMonitor = exerciseFragment.A0;
                    if (dateMonitor != null) {
                        g1 g1Var = dateMonitor.f9546c;
                        C0136a c0136a = new C0136a(exerciseFragment);
                        this.f10466e = 1;
                        Object a10 = g1Var.a(new b0(c0136a, exerciseFragment), this);
                        if (a10 != aVar) {
                            a10 = l.f28297a;
                        }
                        if (a10 == aVar) {
                            return aVar;
                        }
                    } else {
                        gm.l.l("dateMonitor");
                        throw null;
                    }
                }
                return l.f28297a;
            }
        }

        @e(c = "com.topstep.fitcloud.pro.ui.data.ExerciseFragment$onViewCreated$2$2", f = "ExerciseFragment.kt", l = {112}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends i implements fm.p<e0, d<? super l>, Object> {

            /* renamed from: e */
            public int f10469e;

            /* renamed from: f */
            public final /* synthetic */ ExerciseFragment f10470f;

            /* renamed from: com.topstep.fitcloud.pro.ui.data.ExerciseFragment$a$b$a */
            /* loaded from: classes2.dex */
            public static final class C0137a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ ExerciseFragment f10471a;

                public C0137a(ExerciseFragment exerciseFragment) {
                    this.f10471a = exerciseFragment;
                }

                /* JADX WARN: Code restructure failed: missing block: B:43:0x00ba, code lost:
                    if (r1 == com.topstep.fitcloudpro.R.id.rb_month) goto L23;
                 */
                @Override // sm.g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object n(java.lang.Object r19, xl.d r20) {
                    /*
                        r18 = this;
                        r0 = r18
                        r1 = r19
                        java.util.List r1 = (java.util.List) r1
                        com.topstep.fitcloud.pro.ui.data.ExerciseFragment r2 = r0.f10471a
                        mm.h<java.lang.Object>[] r3 = com.topstep.fitcloud.pro.ui.data.ExerciseFragment.D0
                        r2.getClass()
                        java.util.ArrayList r3 = new java.util.ArrayList
                        r4 = 30
                        r3.<init>(r4)
                        java.util.Calendar r5 = java.util.Calendar.getInstance()
                        java.lang.String r6 = "calendar"
                        gm.l.e(r5, r6)
                        java.util.Date r6 = new java.util.Date
                        r6.<init>()
                        r5.setTime(r6)
                        r6 = 11
                        r7 = 0
                        r5.set(r6, r7)
                        r6 = 12
                        r5.set(r6, r7)
                        r6 = 13
                        r5.set(r6, r7)
                        r6 = 14
                        r5.set(r6, r7)
                        r6 = 5
                        int r8 = r5.get(r6)
                        int r8 = r8 + (-29)
                        r5.set(r6, r8)
                        java.util.Date r8 = r5.getTime()
                        java.lang.String r9 = "calendar.time"
                        gm.l.e(r8, r9)
                        r8 = 0
                    L4e:
                        if (r7 >= r4) goto L97
                        long r9 = r5.getTimeInMillis()
                        r11 = 0
                        if (r1 == 0) goto L75
                        int r12 = r1.size()
                        if (r8 >= r12) goto L75
                        java.lang.Object r12 = r1.get(r8)
                        vf.p r12 = (vf.p) r12
                        java.util.Date r12 = r12.f29310a
                        long r12 = r12.getTime()
                        int r14 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
                        if (r14 != 0) goto L75
                        java.lang.Object r11 = r1.get(r8)
                        vf.p r11 = (vf.p) r11
                        int r8 = r8 + 1
                    L75:
                        if (r11 != 0) goto L88
                        vf.p r11 = new vf.p
                        java.util.Date r13 = new java.util.Date
                        r13.<init>(r9)
                        r14 = 0
                        r15 = 0
                        r16 = 0
                        r17 = 30
                        r12 = r11
                        r12.<init>(r13, r14, r15, r16, r17)
                    L88:
                        r3.add(r11)
                        int r9 = r5.get(r6)
                        int r9 = r9 + 1
                        r5.set(r6, r9)
                        int r7 = r7 + 1
                        goto L4e
                    L97:
                        r2.C0 = r3
                        com.topstep.fitcloud.pro.ui.data.ExerciseFragment r1 = r0.f10471a
                        com.topstep.fitcloud.pro.databinding.FragmentExerciseBinding r1 = r1.i1()
                        android.widget.RadioGroup r1 = r1.rgData
                        int r1 = r1.getCheckedRadioButtonId()
                        r2 = 2131362700(0x7f0a038c, float:1.8345188E38)
                        if (r1 != r2) goto Lab
                        goto Lbc
                    Lab:
                        com.topstep.fitcloud.pro.ui.data.ExerciseFragment r1 = r0.f10471a
                        com.topstep.fitcloud.pro.databinding.FragmentExerciseBinding r1 = r1.i1()
                        android.widget.RadioGroup r1 = r1.rgData
                        int r1 = r1.getCheckedRadioButtonId()
                        r2 = 2131362699(0x7f0a038b, float:1.8345186E38)
                        if (r1 != r2) goto Lc1
                    Lbc:
                        com.topstep.fitcloud.pro.ui.data.ExerciseFragment r1 = r0.f10471a
                        r1.j1(r2)
                    Lc1:
                        tl.l r1 = tl.l.f28297a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.data.ExerciseFragment.a.b.C0137a.n(java.lang.Object, xl.d):java.lang.Object");
                }
            }

            @e(c = "com.topstep.fitcloud.pro.ui.data.ExerciseFragment$onViewCreated$2$2$invokeSuspend$$inlined$flatMapLatest$1", f = "ExerciseFragment.kt", l = {190}, m = "invokeSuspend")
            /* renamed from: com.topstep.fitcloud.pro.ui.data.ExerciseFragment$a$b$b */
            /* loaded from: classes2.dex */
            public static final class C0138b extends i implements q<sm.g<? super List<? extends p>>, j, d<? super l>, Object> {

                /* renamed from: e */
                public int f10472e;

                /* renamed from: f */
                public /* synthetic */ sm.g f10473f;

                /* renamed from: g */
                public /* synthetic */ Object f10474g;

                /* renamed from: h */
                public final /* synthetic */ ExerciseFragment f10475h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0138b(ExerciseFragment exerciseFragment, d dVar) {
                    super(3, dVar);
                    this.f10475h = exerciseFragment;
                }

                @Override // fm.q
                public final Object j(sm.g<? super List<? extends p>> gVar, j jVar, d<? super l> dVar) {
                    C0138b c0138b = new C0138b(this.f10475h, dVar);
                    c0138b.f10473f = gVar;
                    c0138b.f10474g = jVar;
                    return c0138b.t(l.f28297a);
                }

                @Override // zl.a
                public final Object t(Object obj) {
                    yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                    int i10 = this.f10472e;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            a0.k(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        a0.k(obj);
                        sm.g gVar = this.f10473f;
                        j jVar = (j) this.f10474g;
                        c cVar = this.f10475h.f10463z0;
                        if (cVar != null) {
                            tm.j K = cVar.K(jVar.f26941b, jVar.f26940a);
                            this.f10472e = 1;
                            if (r.v(this, K, gVar) == aVar) {
                                return aVar;
                            }
                        } else {
                            gm.l.l("dataRepository");
                            throw null;
                        }
                    }
                    return l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ExerciseFragment exerciseFragment, d<? super b> dVar) {
                super(2, dVar);
                this.f10470f = exerciseFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, d<? super l> dVar) {
                return ((b) p(e0Var, dVar)).t(l.f28297a);
            }

            @Override // zl.a
            public final d<l> p(Object obj, d<?> dVar) {
                return new b(this.f10470f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10469e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    ExerciseFragment exerciseFragment = this.f10470f;
                    DateMonitor dateMonitor = exerciseFragment.A0;
                    if (dateMonitor != null) {
                        tm.j O = r.O(dateMonitor.f9546c, new C0138b(exerciseFragment, null));
                        C0137a c0137a = new C0137a(this.f10470f);
                        this.f10469e = 1;
                        if (O.a(c0137a, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        gm.l.l("dateMonitor");
                        throw null;
                    }
                }
                return l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d<? super a> dVar) {
            super(2, dVar);
            ExerciseFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, d<? super l> dVar) {
            return ((a) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final d<l> p(Object obj, d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f10464e = obj;
            return aVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f10464e;
            z0.g(e0Var, null, 0, new C0135a(ExerciseFragment.this, null), 3);
            z0.g(e0Var, null, 0, new b(ExerciseFragment.this, null), 3);
            return l.f28297a;
        }
    }

    static {
        t tVar = new t(ExerciseFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentExerciseBinding;", 0);
        gm.b0.f15488a.getClass();
        D0 = new h[]{tVar};
    }

    public ExerciseFragment() {
        super(R.layout.fragment_exercise);
        this.f10458u0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentExerciseBinding.class, this);
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        DateMonitor dateMonitor = this.A0;
        if (dateMonitor != null) {
            j jVar = (j) dateMonitor.f9546c.getValue();
            c cVar = this.f10463z0;
            if (cVar != null) {
                cVar.o(jVar.f26941b, jVar.f26940a);
                g gVar = this.f10461x0;
                if (gVar != null) {
                    this.f10459v0 = ((b) gVar.a().getValue()).a();
                    kg.a aVar = this.f10462y0;
                    if (aVar != null) {
                        this.f10460w0 = ((uf.a) aVar.a().getValue()).f28704a;
                        return;
                    } else {
                        gm.l.l("exerciseGoalRepository");
                        throw null;
                    }
                }
                gm.l.l("unitConfigRepository");
                throw null;
            }
            gm.l.l("dataRepository");
            throw null;
        }
        gm.l.l("dateMonitor");
        throw null;
    }

    @Override // ph.y, lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        ExerciseCardLayout exerciseCardLayout;
        int i10;
        gm.l.f(view, "view");
        super.O0(view, bundle);
        TypedArray obtainStyledAttributes = V0().getTheme().obtainStyledAttributes(new int[]{R.attr.colorOnPrimary});
        gm.l.e(obtainStyledAttributes, "context.theme.obtainStyl…ributes(intArrayOf(attr))");
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        BarChart barChart = i1().chart;
        barChart.setNoDataText(null);
        barChart.getDescription().f26656a = false;
        barChart.getAxisRight().f26656a = false;
        barChart.getLegend().f26656a = false;
        barChart.setScaleEnabled(false);
        barChart.setXAxisRenderer(new pi.j(barChart.getViewPortHandler(), barChart.getXAxis(), barChart.c(j.a.LEFT)));
        s7.i xAxis = i1().chart.getXAxis();
        xAxis.C = 2;
        xAxis.f26646q = false;
        xAxis.f26645p = false;
        xAxis.f26660e = color;
        s7.j axisLeft = i1().chart.getAxisLeft();
        axisLeft.f26646q = false;
        axisLeft.f26645p = false;
        axisLeft.f(0.0f);
        axisLeft.f26660e = color;
        axisLeft.f26635f = new ph.a0();
        axisLeft.g(5);
        axisLeft.D = 10.0f;
        pi.l lVar = new pi.l(V0());
        lVar.setChartView(i1().chart);
        i1().chart.setMarker(lVar);
        i1().rgData.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: ph.z
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i11) {
                ExerciseFragment exerciseFragment = ExerciseFragment.this;
                mm.h<Object>[] hVarArr = ExerciseFragment.D0;
                gm.l.f(exerciseFragment, "this$0");
                exerciseFragment.j1(i11);
            }
        });
        i1().cardStep.setImgIcon(R.drawable.ic_exercise_step);
        i1().cardStep.setTvUnit(R.string.unit_step);
        i1().cardStep.setTvDes(R.string.exercise_total_step);
        i1().cardDistance.setImgIcon(R.drawable.ic_exercise_distance);
        if (this.f10459v0) {
            exerciseCardLayout = i1().cardDistance;
            i10 = R.string.unit_km;
        } else {
            exerciseCardLayout = i1().cardDistance;
            i10 = R.string.unit_mi;
        }
        exerciseCardLayout.setTvUnit(i10);
        i1().cardDistance.setTvDes(R.string.exercise_total_distance);
        i1().cardCalorie.setImgIcon(R.drawable.ic_exercise_calorie);
        i1().cardCalorie.setTvUnit(R.string.unit_k_calorie);
        i1().cardCalorie.setTvDes(R.string.exercise_total_consumed);
        i1().cardGoal.setImgIcon(R.drawable.ic_exercise_target);
        i1().rgData.check(R.id.rb_day);
        qi.h.k(qi.h.i(this), new a(null));
    }

    @Override // lh.c
    public final View c1(View view) {
        gm.l.f(view, "view");
        AppBarLayout appBarLayout = i1().appbar;
        gm.l.e(appBarLayout, "viewBind.appbar");
        return appBarLayout;
    }

    @Override // ph.y
    public final Integer g1() {
        return Integer.valueOf(i1().toolbar.getHeight() + i1().appbar.getPaddingTop());
    }

    public final FragmentExerciseBinding i1() {
        return (FragmentExerciseBinding) this.f10458u0.a(this, D0[0]);
    }

    public final void j1(int i10) {
        int size;
        u7.c cVar;
        int i11;
        float f10;
        float f11;
        int i12;
        i1().chart.g();
        ArrayList arrayList = new ArrayList();
        int i13 = Integer.MIN_VALUE;
        if (i10 == R.id.rb_day) {
            p pVar = this.B0;
            if (pVar == null) {
                return;
            }
            cVar = new f(pVar.f29314e);
            i1().chart.getXAxis().g(6);
            List<o> list = pVar.f29314e;
            if (list != null) {
                int size2 = list.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    o oVar = list.get(i14);
                    arrayList.add(new t7.c(i14, oVar.f29306b));
                    int i15 = oVar.f29306b;
                    if (i13 < i15) {
                        i13 = i15;
                    }
                }
            }
            i11 = pVar.f29311b;
            f10 = pVar.f29312c;
            f11 = pVar.f29313d;
            ExerciseCardLayout exerciseCardLayout = i1().cardGoal;
            if (pVar.f29311b >= this.f10460w0) {
                i12 = R.string.exercise_target_completed;
            } else {
                i12 = R.string.exercise_target_not_completed;
            }
            exerciseCardLayout.setTvValue(o0(i12));
            i1().cardGoal.setTvUnit(0);
            i1().cardGoal.setTvDes(R.string.exercise_today_goal);
        } else {
            List<p> list2 = this.C0;
            if (list2 == null) {
                return;
            }
            pi.i iVar = new pi.i(V0(), list2);
            i1().chart.getXAxis().g(7);
            if (i10 == R.id.rb_month) {
                size = 0;
            } else {
                size = list2.size() - 7;
            }
            int size3 = list2.size();
            int i16 = 0;
            float f12 = 0.0f;
            float f13 = 0.0f;
            int i17 = 0;
            while (size < size3) {
                p pVar2 = list2.get(size);
                arrayList.add(new t7.c(size, pVar2.f29311b));
                int i18 = pVar2.f29311b;
                if (i13 < i18) {
                    i13 = i18;
                }
                i16 += i18;
                f12 += pVar2.f29312c;
                f13 += pVar2.f29313d;
                if (i18 >= this.f10460w0) {
                    i17++;
                }
                size++;
            }
            ExerciseCardLayout exerciseCardLayout2 = i1().cardGoal;
            Locale locale = m0.f4330a;
            if (locale != null) {
                String format = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i17)}, 1));
                gm.l.e(format, "format(locale, format, *args)");
                exerciseCardLayout2.setTvValue(format);
                i1().cardGoal.setTvUnit(R.string.unit_day_count);
                i1().cardGoal.setTvDes(R.string.exercise_target_days);
                cVar = iVar;
                i11 = i16;
                f10 = f12;
                f11 = f13;
            } else {
                gm.l.l("systemLocale");
                throw null;
            }
        }
        i1().cardStep.setTvValue(n6.a0.o(i11));
        i1().cardDistance.setTvValue(n6.a0.d(f10, this.f10459v0));
        i1().cardCalorie.setTvValue(n6.a0.c(f11));
        int b10 = y0.a.b(V0(), R.color.step_bar_color);
        t7.b bVar = new t7.b(arrayList);
        bVar.f27816j = false;
        bVar.i0(b10);
        bVar.f27800x = (int) (((b10 >> 24) & 255) * 0.8f);
        bVar.f27806t = b10;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(bVar);
        t7.a aVar = new t7.a(arrayList2);
        aVar.f27796j = 0.65f;
        i1().chart.getXAxis().f26635f = cVar;
        if (i13 < 10) {
            i1().chart.getAxisLeft().e(10.0f);
        } else {
            i1().chart.getAxisLeft().f26653x = false;
        }
        i1().chart.setData(aVar);
    }
}
