package com.topstep.fitcloud.pro.ui.data;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi.m0;
import bi.r;
import bi.z0;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.topstep.fitcloud.pro.databinding.FragmentBaseHealthBinding;
import com.topstep.fitcloud.pro.function.DateMonitor;
import com.topstep.fitcloud.pro.model.data.HeartRateRealtime;
import com.topstep.fitcloudpro.R;
import fm.p;
import gm.l;
import gm.t;
import i2.b0;
import i2.m;
import ih.v;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import mf.a0;
import mm.h;
import ph.g0;
import ph.n0;
import pm.e0;
import sm.g;
import tm.j;
import ul.q;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class HeartRateFragment extends n0 {
    public static final /* synthetic */ h<Object>[] F0;
    public final SimpleDateFormat A0;
    public DateMonitor B0;
    public final a C0;
    public HeartRateRealtime D0;
    public final tl.d E0;

    /* renamed from: y0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10484y0;

    /* renamed from: z0 */
    public final qh.e f10485z0;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.g {
        public a() {
            HeartRateFragment.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            if (HeartRateFragment.this.f10485z0.e() <= 0) {
                HeartRateFragment.this.p1().emptyView.setVisibility(0);
                HeartRateFragment.this.p1().recyclerView.setVisibility(8);
                return;
            }
            HeartRateFragment.this.p1().emptyView.setVisibility(8);
            HeartRateFragment.this.p1().recyclerView.setVisibility(0);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements mh.a<vf.f> {
        public b() {
            HeartRateFragment.this = r1;
        }

        @Override // mh.a
        public final void a(Object obj) {
            vf.f fVar = (vf.f) obj;
            l.f(fVar, "item");
            m f10 = tb.a.f(HeartRateFragment.this);
            Date date = fVar.f29279a;
            l.f(date, "date");
            String a10 = dg.a.a(date);
            b0 a11 = v.d().a();
            try {
                Bundle bundle = new Bundle();
                bundle.putLong("friendId", 0L);
                bundle.putString("defaultDate", a10);
                f10.l(R.id.toDetail, bundle, a11);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gm.m implements fm.l<Button, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(1);
            HeartRateFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Button button) {
            l.f(button, "it");
            HeartRateFragment.this.l1(1, true);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends gm.m implements fm.l<Button, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d() {
            super(1);
            HeartRateFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Button button) {
            l.f(button, "it");
            HeartRateFragment.this.l1(1, true);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.HeartRateFragment$onViewCreated$4", f = "HeartRateFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10490e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.data.HeartRateFragment$onViewCreated$4$1", f = "HeartRateFragment.kt", l = {81}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10492e;

            /* renamed from: f */
            public final /* synthetic */ HeartRateFragment f10493f;

            /* renamed from: com.topstep.fitcloud.pro.ui.data.HeartRateFragment$e$a$a */
            /* loaded from: classes2.dex */
            public static final class C0139a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ HeartRateFragment f10494a;

                public C0139a(HeartRateFragment heartRateFragment) {
                    this.f10494a = heartRateFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    HeartRateFragment heartRateFragment = this.f10494a;
                    h<Object>[] hVarArr = HeartRateFragment.F0;
                    heartRateFragment.q1((HeartRateRealtime) obj);
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HeartRateFragment heartRateFragment, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f10493f = heartRateFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f10493f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10492e;
                if (i10 == 0) {
                    a0.k(obj);
                    j H = this.f10493f.h1().H();
                    C0139a c0139a = new C0139a(this.f10493f);
                    this.f10492e = 1;
                    if (H.a(c0139a, this) == aVar) {
                        return aVar;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    a0.k(obj);
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.data.HeartRateFragment$onViewCreated$4$2", f = "HeartRateFragment.kt", l = {88}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10495e;

            /* renamed from: f */
            public final /* synthetic */ HeartRateFragment f10496f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ HeartRateFragment f10497a;

                public a(HeartRateFragment heartRateFragment) {
                    this.f10497a = heartRateFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    List<? extends T> list;
                    List list2 = (List) obj;
                    qh.e eVar = this.f10497a.f10485z0;
                    if (list2 != null) {
                        list = q.S(list2);
                    } else {
                        list = null;
                    }
                    eVar.f24818e = list;
                    this.f10497a.f10485z0.h();
                    return tl.l.f28297a;
                }
            }

            @zl.e(c = "com.topstep.fitcloud.pro.ui.data.HeartRateFragment$onViewCreated$4$2$invokeSuspend$$inlined$flatMapLatest$1", f = "HeartRateFragment.kt", l = {190}, m = "invokeSuspend")
            /* renamed from: com.topstep.fitcloud.pro.ui.data.HeartRateFragment$e$b$b */
            /* loaded from: classes2.dex */
            public static final class C0140b extends i implements fm.q<g<? super List<? extends vf.f>>, sf.j, xl.d<? super tl.l>, Object> {

                /* renamed from: e */
                public int f10498e;

                /* renamed from: f */
                public /* synthetic */ g f10499f;

                /* renamed from: g */
                public /* synthetic */ Object f10500g;

                /* renamed from: h */
                public final /* synthetic */ HeartRateFragment f10501h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0140b(HeartRateFragment heartRateFragment, xl.d dVar) {
                    super(3, dVar);
                    this.f10501h = heartRateFragment;
                }

                @Override // fm.q
                public final Object j(g<? super List<? extends vf.f>> gVar, sf.j jVar, xl.d<? super tl.l> dVar) {
                    C0140b c0140b = new C0140b(this.f10501h, dVar);
                    c0140b.f10499f = gVar;
                    c0140b.f10500g = jVar;
                    return c0140b.t(tl.l.f28297a);
                }

                @Override // zl.a
                public final Object t(Object obj) {
                    yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                    int i10 = this.f10498e;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            a0.k(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        a0.k(obj);
                        g gVar = this.f10499f;
                        sf.j jVar = (sf.j) this.f10500g;
                        j w10 = this.f10501h.h1().w(jVar.f26941b, jVar.f26940a);
                        this.f10498e = 1;
                        if (r.v(this, w10, gVar) == aVar) {
                            return aVar;
                        }
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(HeartRateFragment heartRateFragment, xl.d<? super b> dVar) {
                super(2, dVar);
                this.f10496f = heartRateFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new b(this.f10496f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10495e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    HeartRateFragment heartRateFragment = this.f10496f;
                    DateMonitor dateMonitor = heartRateFragment.B0;
                    if (dateMonitor != null) {
                        j O = r.O(dateMonitor.f9546c, new C0140b(heartRateFragment, null));
                        a aVar2 = new a(this.f10496f);
                        this.f10495e = 1;
                        if (O.a(aVar2, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        l.l("dateMonitor");
                        throw null;
                    }
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(2, dVar);
            HeartRateFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((e) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f10490e = obj;
            return eVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f10490e;
            z0.g(e0Var, null, 0, new a(HeartRateFragment.this, null), 3);
            z0.g(e0Var, null, 0, new b(HeartRateFragment.this, null), 3);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends gm.m implements fm.a<g0> {

        /* renamed from: b */
        public static final f f10502b = new f();

        public f() {
            super(0);
        }

        @Override // fm.a
        public final g0 m() {
            return new g0();
        }
    }

    static {
        t tVar = new t(HeartRateFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentBaseHealthBinding;", 0);
        gm.b0.f15488a.getClass();
        F0 = new h[]{tVar};
    }

    public HeartRateFragment() {
        super(R.layout.fragment_base_health);
        this.f10484y0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentBaseHealthBinding.class, this);
        this.f10485z0 = new qh.e();
        this.A0 = m0.n();
        this.C0 = new a();
        this.E0 = fb.e.a(f.f10502b);
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        DateMonitor dateMonitor = this.B0;
        if (dateMonitor != null) {
            sf.j jVar = (sf.j) dateMonitor.f9546c.getValue();
            h1().x(jVar.f26941b, jVar.f26940a);
            return;
        }
        l.l("dateMonitor");
        throw null;
    }

    @Override // androidx.fragment.app.r
    public final void E0() {
        this.E = true;
        qh.e eVar = this.f10485z0;
        eVar.f24819f = null;
        eVar.x(this.C0);
    }

    @Override // ph.y, lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        l.f(view, "view");
        super.O0(view, bundle);
        p1().toolbar.setTitle(R.string.heart_rate_module);
        p1().layoutContent.imgHealthIcon.setImageResource(R.drawable.ic_heart_rate_white);
        p1().layoutContent.tvValueUnit.setText(R.string.unit_frequency_per_minute);
        qh.e eVar = this.f10485z0;
        eVar.f24819f = new b();
        eVar.u(this.C0);
        RecyclerView recyclerView = p1().recyclerView;
        V0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        p1().recyclerView.g(new oi.a(V0()));
        p1().recyclerView.setAdapter(this.f10485z0);
        p.b.g(p1().layoutContent.btnStart, new c());
        p.b.g(p1().layoutContent.btnStop, new d());
        qi.h.k(qi.h.i(this), new e(null));
    }

    @Override // ph.u
    public final void j1() {
        p1().layoutContent.imgHealthIcon.startAnimation(AnimationUtils.loadAnimation(V0(), R.anim.health_icon_beat));
        p1().layoutContent.tvValue.setVisibility(4);
        p1().layoutContent.tvValueUnit.setVisibility(4);
        p1().layoutContent.gifImgTest.setVisibility(0);
        p1().layoutContent.tvTime.setText("");
        p1().layoutContent.tvResult.setText("");
        p1().layoutContent.btnStart.setVisibility(8);
        p1().layoutContent.btnStop.setVisibility(0);
        p1().layoutContent.btnStop.setText(p0(R.string.healthy_stop_test, 60));
        ((g0) this.E0.getValue()).c();
    }

    @Override // ph.u
    public final void k1() {
        if (((g0) this.E0.getValue()).f24156i > 0) {
            g0 g0Var = (g0) this.E0.getValue();
            g0Var.getClass();
            HeartRateRealtime heartRateRealtime = new HeartRateRealtime(((int) g0Var.f24150c) / g0Var.f24156i, new Date());
            p000do.a.f13275a.h("App heartRate realtime:%s", heartRateRealtime.toString());
            h1().A(heartRateRealtime);
        } else {
            q1(this.D0);
        }
        p1().layoutContent.imgHealthIcon.clearAnimation();
        p1().layoutContent.tvValue.setVisibility(0);
        p1().layoutContent.tvValueUnit.setVisibility(0);
        p1().layoutContent.gifImgTest.setVisibility(4);
        p1().layoutContent.btnStart.setVisibility(0);
        p1().layoutContent.btnStop.setVisibility(8);
    }

    @Override // ph.u
    public final void m1(oj.d dVar) {
        l.f(dVar, WiseOpenHianalyticsData.UNION_RESULT);
        if (dVar.f23574a <= 0) {
            return;
        }
        if (((g0) this.E0.getValue()).f24156i == 0) {
            p1().layoutContent.tvValue.setVisibility(0);
            p1().layoutContent.tvValueUnit.setVisibility(0);
            p1().layoutContent.gifImgTest.setVisibility(4);
        }
        ((g0) this.E0.getValue()).a(dVar.f23574a);
        TextView textView = p1().layoutContent.tvValue;
        int i10 = dVar.f23574a;
        Locale locale = m0.f4330a;
        if (locale != null) {
            String format = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
            l.e(format, "format(locale, format, *args)");
            textView.setText(format);
            return;
        }
        l.l("systemLocale");
        throw null;
    }

    @Override // ph.u
    public final void n1(int i10) {
        p1().layoutContent.btnStop.setText(p0(R.string.healthy_stop_test, Integer.valueOf(i10)));
    }

    public final FragmentBaseHealthBinding p1() {
        return (FragmentBaseHealthBinding) this.f10484y0.a(this, F0[0]);
    }

    public final void q1(HeartRateRealtime heartRateRealtime) {
        String string;
        String str;
        this.D0 = heartRateRealtime;
        if (heartRateRealtime == null) {
            p1().layoutContent.tvValue.setText(R.string.realtime_none_normal);
            p1().layoutContent.tvTime.setText("");
            p1().layoutContent.tvResult.setText("");
            return;
        }
        TextView textView = p1().layoutContent.tvValue;
        int i10 = heartRateRealtime.f9581b;
        Locale locale = m0.f4330a;
        if (locale != null) {
            String format = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
            l.e(format, "format(locale, format, *args)");
            textView.setText(format);
            p1().layoutContent.tvTime.setText(p0(R.string.healthy_previous_time, this.A0.format(heartRateRealtime.f9580a)));
            TextView textView2 = p1().layoutContent.tvResult;
            Context V0 = V0();
            int i11 = heartRateRealtime.f9581b;
            if (i11 < 60) {
                string = V0.getString(R.string.healthy_result_low);
                str = "{\n            context.ge…thy_result_low)\n        }";
            } else if (i11 <= 100) {
                string = V0.getString(R.string.healthy_result_normal);
                str = "{\n            context.ge…_result_normal)\n        }";
            } else {
                string = V0.getString(R.string.healthy_result_high);
                str = "{\n            context.ge…hy_result_high)\n        }";
            }
            l.e(string, str);
            textView2.setText(string);
            return;
        }
        l.l("systemLocale");
        throw null;
    }
}
