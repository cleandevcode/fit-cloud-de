package com.topstep.fitcloud.pro.ui.data;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import bi.r;
import bi.z0;
import com.github.mikephil.charting.charts.BarChart;
import com.google.android.material.appbar.AppBarLayout;
import com.topstep.fitcloud.pro.databinding.FragmentSleepBinding;
import com.topstep.fitcloud.pro.function.DateMonitor;
import com.topstep.fitcloud.pro.ui.data.SleepFragment;
import com.topstep.fitcloudpro.R;
import fm.p;
import fm.q;
import gm.b0;
import gm.m;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import lg.c;
import mf.a0;
import mm.h;
import og.t;
import og.x0;
import ph.a1;
import ph.s0;
import ph.x;
import pi.k;
import pm.e0;
import s7.j;
import sf.j;
import sm.f;
import sm.f1;
import sm.g;
import sm.o0;
import tl.i;
import tl.l;
import vf.n;
import xl.d;
import zl.e;

@Metadata
/* loaded from: classes2.dex */
public final class SleepFragment extends s0 {
    public static final /* synthetic */ h<Object>[] B0;
    public List<n> A0;

    /* renamed from: u0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10557u0;

    /* renamed from: v0 */
    public final i f10558v0;

    /* renamed from: w0 */
    public t f10559w0;

    /* renamed from: x0 */
    public c f10560x0;

    /* renamed from: y0 */
    public DateMonitor f10561y0;

    /* renamed from: z0 */
    public x f10562z0;

    @e(c = "com.topstep.fitcloud.pro.ui.data.SleepFragment$onViewCreated$2", f = "SleepFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements p<e0, d<? super l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10563e;

        @e(c = "com.topstep.fitcloud.pro.ui.data.SleepFragment$onViewCreated$2$1", f = "SleepFragment.kt", l = {83}, m = "invokeSuspend")
        /* renamed from: com.topstep.fitcloud.pro.ui.data.SleepFragment$a$a */
        /* loaded from: classes2.dex */
        public static final class C0145a extends zl.i implements p<e0, d<? super l>, Object> {

            /* renamed from: e */
            public int f10565e;

            /* renamed from: f */
            public final /* synthetic */ SleepFragment f10566f;

            @e(c = "com.topstep.fitcloud.pro.ui.data.SleepFragment$onViewCreated$2$1$1", f = "SleepFragment.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.topstep.fitcloud.pro.ui.data.SleepFragment$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C0146a extends zl.i implements q<Boolean, n, d<? super x>, Object> {

                /* renamed from: e */
                public /* synthetic */ boolean f10567e;

                /* renamed from: f */
                public /* synthetic */ n f10568f;

                public C0146a(d<? super C0146a> dVar) {
                    super(3, dVar);
                }

                @Override // fm.q
                public final Object j(Boolean bool, n nVar, d<? super x> dVar) {
                    boolean booleanValue = bool.booleanValue();
                    C0146a c0146a = new C0146a(dVar);
                    c0146a.f10567e = booleanValue;
                    c0146a.f10568f = nVar;
                    return c0146a.t(l.f28297a);
                }

                @Override // zl.a
                public final Object t(Object obj) {
                    a0.k(obj);
                    return new x(this.f10567e, this.f10568f);
                }
            }

            /* renamed from: com.topstep.fitcloud.pro.ui.data.SleepFragment$a$a$b */
            /* loaded from: classes2.dex */
            public static final class b<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ SleepFragment f10569a;

                public b(SleepFragment sleepFragment) {
                    this.f10569a = sleepFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, d dVar) {
                    SleepFragment sleepFragment = this.f10569a;
                    sleepFragment.f10562z0 = (x) obj;
                    if (sleepFragment.j1().rgData.getCheckedRadioButtonId() == R.id.rb_day) {
                        this.f10569a.l1();
                    }
                    return l.f28297a;
                }
            }

            /* renamed from: com.topstep.fitcloud.pro.ui.data.SleepFragment$a$a$c */
            /* loaded from: classes2.dex */
            public static final class c implements f<n> {

                /* renamed from: a */
                public final /* synthetic */ f f10570a;

                /* renamed from: b */
                public final /* synthetic */ SleepFragment f10571b;

                /* renamed from: com.topstep.fitcloud.pro.ui.data.SleepFragment$a$a$c$a */
                /* loaded from: classes2.dex */
                public static final class C0147a<T> implements g {

                    /* renamed from: a */
                    public final /* synthetic */ g f10572a;

                    /* renamed from: b */
                    public final /* synthetic */ SleepFragment f10573b;

                    @e(c = "com.topstep.fitcloud.pro.ui.data.SleepFragment$onViewCreated$2$1$invokeSuspend$$inlined$map$1$2", f = "SleepFragment.kt", l = {224, 223}, m = "emit")
                    /* renamed from: com.topstep.fitcloud.pro.ui.data.SleepFragment$a$a$c$a$a */
                    /* loaded from: classes2.dex */
                    public static final class C0148a extends zl.c {

                        /* renamed from: d */
                        public /* synthetic */ Object f10574d;

                        /* renamed from: e */
                        public int f10575e;

                        /* renamed from: f */
                        public g f10576f;

                        /* renamed from: h */
                        public j f10578h;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C0148a(d dVar) {
                            super(dVar);
                            C0147a.this = r1;
                        }

                        @Override // zl.a
                        public final Object t(Object obj) {
                            this.f10574d = obj;
                            this.f10575e |= Integer.MIN_VALUE;
                            return C0147a.this.n(null, this);
                        }
                    }

                    public C0147a(g gVar, SleepFragment sleepFragment) {
                        this.f10572a = gVar;
                        this.f10573b = sleepFragment;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:41:0x0023  */
                    /* JADX WARN: Removed duplicated region for block: B:47:0x003b  */
                    /* JADX WARN: Removed duplicated region for block: B:54:0x005b  */
                    /* JADX WARN: Removed duplicated region for block: B:57:0x0074 A[RETURN] */
                    @Override // sm.g
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object n(java.lang.Object r13, xl.d r14) {
                        /*
                            r12 = this;
                            boolean r0 = r14 instanceof com.topstep.fitcloud.pro.ui.data.SleepFragment.a.C0145a.c.C0147a.C0148a
                            if (r0 == 0) goto L13
                            r0 = r14
                            com.topstep.fitcloud.pro.ui.data.SleepFragment$a$a$c$a$a r0 = (com.topstep.fitcloud.pro.ui.data.SleepFragment.a.C0145a.c.C0147a.C0148a) r0
                            int r1 = r0.f10575e
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.f10575e = r1
                            goto L18
                        L13:
                            com.topstep.fitcloud.pro.ui.data.SleepFragment$a$a$c$a$a r0 = new com.topstep.fitcloud.pro.ui.data.SleepFragment$a$a$c$a$a
                            r0.<init>(r14)
                        L18:
                            java.lang.Object r14 = r0.f10574d
                            yl.a r1 = yl.a.COROUTINE_SUSPENDED
                            int r2 = r0.f10575e
                            r3 = 2
                            r4 = 1
                            r5 = 0
                            if (r2 == 0) goto L3b
                            if (r2 == r4) goto L33
                            if (r2 != r3) goto L2b
                            mf.a0.k(r14)
                            goto L75
                        L2b:
                            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                            r13.<init>(r14)
                            throw r13
                        L33:
                            sf.j r13 = r0.f10578h
                            sm.g r2 = r0.f10576f
                            mf.a0.k(r14)
                            goto L57
                        L3b:
                            mf.a0.k(r14)
                            sm.g r2 = r12.f10572a
                            sf.j r13 = (sf.j) r13
                            com.topstep.fitcloud.pro.ui.data.SleepFragment r14 = r12.f10573b
                            lg.c r14 = r14.f10560x0
                            if (r14 == 0) goto L78
                            java.util.Date r6 = r13.f26940a
                            r0.f10576f = r2
                            r0.f10578h = r13
                            r0.f10575e = r4
                            java.lang.Object r14 = r14.N(r6, r0)
                            if (r14 != r1) goto L57
                            return r1
                        L57:
                            vf.n r14 = (vf.n) r14
                            if (r14 != 0) goto L68
                            vf.n r14 = new vf.n
                            java.util.Date r7 = r13.f26940a
                            r8 = 0
                            r9 = 0
                            r10 = 0
                            r11 = 30
                            r6 = r14
                            r6.<init>(r7, r8, r9, r10, r11)
                        L68:
                            r0.f10576f = r5
                            r0.f10578h = r5
                            r0.f10575e = r3
                            java.lang.Object r13 = r2.n(r14, r0)
                            if (r13 != r1) goto L75
                            return r1
                        L75:
                            tl.l r13 = tl.l.f28297a
                            return r13
                        L78:
                            java.lang.String r13 = "dataRepository"
                            gm.l.l(r13)
                            throw r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.data.SleepFragment.a.C0145a.c.C0147a.n(java.lang.Object, xl.d):java.lang.Object");
                    }
                }

                public c(f1 f1Var, SleepFragment sleepFragment) {
                    this.f10570a = f1Var;
                    this.f10571b = sleepFragment;
                }

                @Override // sm.f
                public final Object a(g<? super n> gVar, d dVar) {
                    Object a10 = this.f10570a.a(new C0147a(gVar, this.f10571b), dVar);
                    return a10 == yl.a.COROUTINE_SUSPENDED ? a10 : l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0145a(SleepFragment sleepFragment, d<? super C0145a> dVar) {
                super(2, dVar);
                this.f10566f = sleepFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, d<? super l> dVar) {
                return ((C0145a) p(e0Var, dVar)).t(l.f28297a);
            }

            @Override // zl.a
            public final d<l> p(Object obj, d<?> dVar) {
                return new C0145a(this.f10566f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                Object obj2 = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10565e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    SleepFragment sleepFragment = this.f10566f;
                    DateMonitor dateMonitor = sleepFragment.f10561y0;
                    if (dateMonitor != null) {
                        c cVar = new c(dateMonitor.f9546c, sleepFragment);
                        t tVar = sleepFragment.f10559w0;
                        if (tVar != null) {
                            f<Boolean> a10 = x0.a(tVar);
                            C0146a c0146a = new C0146a(null);
                            b bVar = new b(this.f10566f);
                            this.f10565e = 1;
                            Object c10 = p001if.d.c(this, new o0(c0146a, null), bVar, new f[]{a10, cVar});
                            if (c10 != obj2) {
                                c10 = l.f28297a;
                            }
                            if (c10 == obj2) {
                                return obj2;
                            }
                        } else {
                            gm.l.l("deviceManager");
                            throw null;
                        }
                    } else {
                        gm.l.l("dateMonitor");
                        throw null;
                    }
                }
                return l.f28297a;
            }
        }

        @e(c = "com.topstep.fitcloud.pro.ui.data.SleepFragment$onViewCreated$2$2", f = "SleepFragment.kt", l = {93}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends zl.i implements p<e0, d<? super l>, Object> {

            /* renamed from: e */
            public int f10579e;

            /* renamed from: f */
            public final /* synthetic */ SleepFragment f10580f;

            /* renamed from: com.topstep.fitcloud.pro.ui.data.SleepFragment$a$b$a */
            /* loaded from: classes2.dex */
            public static final class C0149a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ SleepFragment f10581a;

                public C0149a(SleepFragment sleepFragment) {
                    this.f10581a = sleepFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, d dVar) {
                    List list = (List) obj;
                    SleepFragment sleepFragment = this.f10581a;
                    h<Object>[] hVarArr = SleepFragment.B0;
                    sleepFragment.getClass();
                    ArrayList arrayList = new ArrayList(30);
                    Calendar calendar = Calendar.getInstance();
                    gm.l.e(calendar, "calendar");
                    calendar.setTime(new Date());
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    calendar.set(5, calendar.get(5) - 29);
                    gm.l.e(calendar.getTime(), "calendar.time");
                    int i10 = 0;
                    for (int i11 = 0; i11 < 30; i11++) {
                        long timeInMillis = calendar.getTimeInMillis();
                        n nVar = null;
                        if (list != null && i10 < list.size() && ((n) list.get(i10)).f29299a.getTime() == timeInMillis) {
                            nVar = (n) list.get(i10);
                            i10++;
                        }
                        if (nVar == null) {
                            nVar = new n(new Date(timeInMillis), 0, 0, 0, 30);
                        }
                        arrayList.add(nVar);
                        calendar.set(5, calendar.get(5) + 1);
                    }
                    sleepFragment.A0 = arrayList;
                    if (this.f10581a.j1().rgData.getCheckedRadioButtonId() == R.id.rb_week) {
                        this.f10581a.k1(false);
                    } else if (this.f10581a.j1().rgData.getCheckedRadioButtonId() == R.id.rb_month) {
                        this.f10581a.k1(true);
                    }
                    return l.f28297a;
                }
            }

            @e(c = "com.topstep.fitcloud.pro.ui.data.SleepFragment$onViewCreated$2$2$invokeSuspend$$inlined$flatMapLatest$1", f = "SleepFragment.kt", l = {190}, m = "invokeSuspend")
            /* renamed from: com.topstep.fitcloud.pro.ui.data.SleepFragment$a$b$b */
            /* loaded from: classes2.dex */
            public static final class C0150b extends zl.i implements q<g<? super List<? extends n>>, j, d<? super l>, Object> {

                /* renamed from: e */
                public int f10582e;

                /* renamed from: f */
                public /* synthetic */ g f10583f;

                /* renamed from: g */
                public /* synthetic */ Object f10584g;

                /* renamed from: h */
                public final /* synthetic */ SleepFragment f10585h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0150b(SleepFragment sleepFragment, d dVar) {
                    super(3, dVar);
                    this.f10585h = sleepFragment;
                }

                @Override // fm.q
                public final Object j(g<? super List<? extends n>> gVar, j jVar, d<? super l> dVar) {
                    C0150b c0150b = new C0150b(this.f10585h, dVar);
                    c0150b.f10583f = gVar;
                    c0150b.f10584g = jVar;
                    return c0150b.t(l.f28297a);
                }

                @Override // zl.a
                public final Object t(Object obj) {
                    yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                    int i10 = this.f10582e;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            a0.k(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        a0.k(obj);
                        g gVar = this.f10583f;
                        j jVar = (j) this.f10584g;
                        c cVar = this.f10585h.f10560x0;
                        if (cVar != null) {
                            tm.j z10 = cVar.z(jVar.f26941b, jVar.f26940a);
                            this.f10582e = 1;
                            if (r.v(this, z10, gVar) == aVar) {
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
            public b(SleepFragment sleepFragment, d<? super b> dVar) {
                super(2, dVar);
                this.f10580f = sleepFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, d<? super l> dVar) {
                return ((b) p(e0Var, dVar)).t(l.f28297a);
            }

            @Override // zl.a
            public final d<l> p(Object obj, d<?> dVar) {
                return new b(this.f10580f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10579e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    SleepFragment sleepFragment = this.f10580f;
                    DateMonitor dateMonitor = sleepFragment.f10561y0;
                    if (dateMonitor != null) {
                        tm.j O = r.O(dateMonitor.f9546c, new C0150b(sleepFragment, null));
                        C0149a c0149a = new C0149a(this.f10580f);
                        this.f10579e = 1;
                        if (O.a(c0149a, this) == aVar) {
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
            SleepFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, d<? super l> dVar) {
            return ((a) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final d<l> p(Object obj, d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f10563e = obj;
            return aVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f10563e;
            z0.g(e0Var, null, 0, new C0145a(SleepFragment.this, null), 3);
            z0.g(e0Var, null, 0, new b(SleepFragment.this, null), 3);
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements fm.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(0);
            SleepFragment.this = r1;
        }

        @Override // fm.a
        public final String m() {
            String string = SleepFragment.this.V0().getString(R.string.unit_hour_minute_param, 0, 0);
            gm.l.e(string, "context.getString(R.stri…3600, second % 3600 / 60)");
            return string;
        }
    }

    static {
        gm.t tVar = new gm.t(SleepFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentSleepBinding;", 0);
        b0.f15488a.getClass();
        B0 = new h[]{tVar};
    }

    public SleepFragment() {
        super(R.layout.fragment_sleep);
        this.f10557u0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentSleepBinding.class, this);
        this.f10558v0 = new i(new b());
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        DateMonitor dateMonitor = this.f10561y0;
        if (dateMonitor != null) {
            j jVar = (j) dateMonitor.f9546c.getValue();
            c cVar = this.f10560x0;
            if (cVar != null) {
                cVar.l(jVar.f26941b, jVar.f26940a);
                return;
            } else {
                gm.l.l("dataRepository");
                throw null;
            }
        }
        gm.l.l("dateMonitor");
        throw null;
    }

    @Override // ph.y, lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        TypedArray obtainStyledAttributes = V0().getTheme().obtainStyledAttributes(new int[]{R.attr.colorOnPrimary});
        gm.l.e(obtainStyledAttributes, "context.theme.obtainStyl…ributes(intArrayOf(attr))");
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        BarChart barChart = j1().chart;
        barChart.setNoDataText(null);
        barChart.getDescription().f26656a = false;
        barChart.getAxisRight().f26656a = false;
        barChart.getLegend().f26656a = false;
        barChart.setScaleEnabled(false);
        barChart.setXAxisRenderer(new pi.j(barChart.getViewPortHandler(), barChart.getXAxis(), barChart.c(j.a.LEFT)));
        s7.i xAxis = j1().chart.getXAxis();
        xAxis.C = 2;
        xAxis.f26646q = false;
        xAxis.f26645p = false;
        xAxis.f26660e = color;
        xAxis.g(7);
        s7.j axisLeft = j1().chart.getAxisLeft();
        axisLeft.f26646q = false;
        axisLeft.f26645p = false;
        axisLeft.f(0.0f);
        axisLeft.e(18.0f);
        axisLeft.f26660e = color;
        axisLeft.f26635f = new a1();
        axisLeft.g(6);
        axisLeft.D = 10.0f;
        k kVar = new k(V0());
        kVar.setChartView(j1().chart);
        j1().chart.setMarker(kVar);
        j1().rgData.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: ph.z0
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i10) {
                boolean z10;
                SleepFragment sleepFragment = SleepFragment.this;
                mm.h<Object>[] hVarArr = SleepFragment.B0;
                gm.l.f(sleepFragment, "this$0");
                switch (i10) {
                    case R.id.rb_day /* 2131362698 */:
                        sleepFragment.l1();
                        return;
                    case R.id.rb_month /* 2131362699 */:
                        z10 = true;
                        break;
                    case R.id.rb_week /* 2131362700 */:
                        z10 = false;
                        break;
                    default:
                        return;
                }
                sleepFragment.k1(z10);
            }
        });
        j1().rgData.check(R.id.rb_day);
        qi.h.k(qi.h.i(this), new a(null));
    }

    @Override // lh.c
    public final View c1(View view) {
        gm.l.f(view, "view");
        AppBarLayout appBarLayout = j1().appbar;
        gm.l.e(appBarLayout, "viewBind.appbar");
        return appBarLayout;
    }

    @Override // ph.y
    public final Integer g1() {
        return Integer.valueOf(j1().toolbar.getHeight() + j1().appbar.getPaddingTop());
    }

    public final String i1() {
        return (String) this.f10558v0.getValue();
    }

    public final FragmentSleepBinding j1() {
        return (FragmentSleepBinding) this.f10557u0.a(this, B0[0]);
    }

    public final void k1(boolean z10) {
        TextView textView;
        String i12;
        j1().tvTodayDataDes.setVisibility(8);
        j1().sleepDayView.setVisibility(8);
        j1().chart.setVisibility(0);
        j1().dotSober.setVisibility(8);
        j1().chart.g();
        List<n> list = this.A0;
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = z10 ? 0 : list.size() - 7;
        int size2 = list.size();
        int i10 = 0;
        int i11 = 0;
        int i13 = 0;
        int i14 = 0;
        while (size < size2) {
            n nVar = list.get(size);
            arrayList.add(new t7.c(size, new float[]{nVar.f29300b / 3600.0f, nVar.f29301c / 3600.0f}));
            int i15 = nVar.f29300b;
            int i16 = nVar.f29301c;
            if (i15 + i16 > 0) {
                i10++;
                i11 += i15;
                i13 += i16;
                i14 += nVar.f29302d;
            }
            size++;
        }
        t7.b bVar = new t7.b(arrayList);
        bVar.f27816j = false;
        int[] iArr = {R.color.sleep_chart_color_deep, R.color.sleep_chart_color_light};
        Context V0 = V0();
        if (bVar.f27807a == null) {
            bVar.f27807a = new ArrayList();
        }
        bVar.f27807a.clear();
        for (int i17 = 0; i17 < 2; i17++) {
            bVar.f27807a.add(Integer.valueOf(V0.getResources().getColor(iArr[i17])));
        }
        bVar.f27800x = 255;
        bVar.f27806t = -1;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(bVar);
        t7.a aVar = new t7.a(arrayList2);
        aVar.f27796j = 0.65f;
        j1().chart.getXAxis().f26635f = new pi.i(V0(), list);
        j1().chart.setData(aVar);
        j1().tvSleepTotalDes.setText(R.string.sleep_avg_sleep_time);
        TextView textView2 = j1().tvSleepTotal;
        if (i10 > 0) {
            textView2.setText(n6.a0.i(V0(), (i11 + i13) / i10));
            j1().tvSleepDeep.setText(n6.a0.i(V0(), i11 / i10));
            j1().tvSleepLight.setText(n6.a0.i(V0(), i13 / i10));
            textView = j1().tvSleepSober;
            i12 = n6.a0.i(V0(), i14 / i10);
        } else {
            textView2.setText(i1());
            j1().tvSleepDeep.setText(i1());
            j1().tvSleepLight.setText(i1());
            textView = j1().tvSleepSober;
            i12 = i1();
        }
        textView.setText(i12);
    }

    public final void l1() {
        boolean z10;
        TextView textView;
        int i10;
        x xVar = this.f10562z0;
        if (xVar == null) {
            return;
        }
        n nVar = xVar.f24248b;
        boolean z11 = true;
        if (nVar.f29300b + nVar.f29301c + nVar.f29302d > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            j1().tvTodayDataDes.setVisibility(8);
            j1().sleepDayView.setVisibility(0);
            j1().chart.setVisibility(8);
            j1().dotSober.setVisibility(0);
            j1().tvSleepTotalDes.setText(R.string.sleep_last_night);
            j1().tvSleepTotal.setText(n6.a0.i(V0(), nVar.f29300b + nVar.f29301c));
            j1().tvSleepDeep.setText(n6.a0.i(V0(), nVar.f29300b));
            j1().tvSleepLight.setText(n6.a0.i(V0(), nVar.f29301c));
            j1().tvSleepSober.setText(n6.a0.i(V0(), nVar.f29302d));
            j1().sleepDayView.setSleepDayDatas(nVar);
            return;
        }
        j1().tvTodayDataDes.setVisibility(0);
        j1().sleepDayView.setVisibility(8);
        j1().chart.setVisibility(8);
        j1().dotSober.setVisibility(0);
        j1().tvSleepTotalDes.setText(R.string.sleep_last_night);
        j1().tvSleepTotal.setText(i1());
        j1().tvSleepDeep.setText(i1());
        j1().tvSleepLight.setText(i1());
        j1().tvSleepSober.setText(i1());
        if (xVar.f24247a) {
            Calendar calendar = Calendar.getInstance();
            int i11 = (calendar.get(11) * 60) + calendar.get(12);
            if (i11 <= 1290 && i11 >= 240) {
                z11 = false;
            }
            if (z11) {
                textView = j1().tvTodayDataDes;
                i10 = R.string.sleep_tips_monitor;
                textView.setText(i10);
            }
        }
        textView = j1().tvTodayDataDes;
        i10 = R.string.sleep_tips_no_data;
        textView.setText(i10);
    }
}
