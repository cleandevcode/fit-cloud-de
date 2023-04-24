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
import bi.z0;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.topstep.fitcloud.pro.databinding.FragmentTemperatureBinding;
import com.topstep.fitcloud.pro.function.DateMonitor;
import com.topstep.fitcloud.pro.model.data.TemperatureRealtime;
import com.topstep.fitcloudpro.R;
import fm.p;
import gm.l;
import gm.m;
import gm.t;
import i2.b0;
import ih.v;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import mf.a0;
import mm.h;
import ph.g0;
import ph.u0;
import pm.e0;
import qh.j;
import ul.q;
import vf.r;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class TemperatureFragment extends u0 {
    public static final /* synthetic */ h<Object>[] I0;
    public final SimpleDateFormat A0;
    public DateMonitor B0;
    public kg.g C0;
    public boolean D0;
    public final tl.d E0;
    public final a F0;
    public TemperatureRealtime G0;
    public final tl.d H0;

    /* renamed from: y0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10595y0;

    /* renamed from: z0 */
    public j f10596z0;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.g {
        public a() {
            TemperatureFragment.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            j jVar = TemperatureFragment.this.f10596z0;
            if (jVar != null) {
                if (jVar.e() <= 0) {
                    TemperatureFragment.this.p1().emptyView.setVisibility(0);
                    TemperatureFragment.this.p1().recyclerView.setVisibility(8);
                    return;
                }
                TemperatureFragment.this.p1().emptyView.setVisibility(8);
                TemperatureFragment.this.p1().recyclerView.setVisibility(0);
                return;
            }
            l.l("adapter");
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements fm.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(0);
            TemperatureFragment.this = r1;
        }

        @Override // fm.a
        public final String m() {
            String string;
            String str;
            Context V0 = TemperatureFragment.this.V0();
            boolean z10 = TemperatureFragment.this.D0;
            String string2 = V0.getString(R.string.realtime_none_temperature);
            l.e(string2, "context.getString(R.stri…ealtime_none_temperature)");
            if (z10) {
                string = V0.getString(R.string.unit_centigrade_param, string2);
                str = "{\n            context.ge…de_param, none)\n        }";
            } else {
                string = V0.getString(R.string.unit_fahrenheit_param, string2);
                str = "{\n            context.ge…it_param, none)\n        }";
            }
            l.e(string, str);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements mh.a<r> {
        public c() {
            TemperatureFragment.this = r1;
        }

        @Override // mh.a
        public final void a(Object obj) {
            r rVar = (r) obj;
            l.f(rVar, "item");
            i2.m f10 = tb.a.f(TemperatureFragment.this);
            Date date = rVar.f29322a;
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
    public static final class d extends m implements fm.l<Button, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d() {
            super(1);
            TemperatureFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Button button) {
            l.f(button, "it");
            TemperatureFragment.this.l1(32, true);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends m implements fm.l<Button, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e() {
            super(1);
            TemperatureFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Button button) {
            l.f(button, "it");
            TemperatureFragment.this.l1(32, true);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.TemperatureFragment$onViewCreated$4", f = "TemperatureFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10602e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.data.TemperatureFragment$onViewCreated$4$1", f = "TemperatureFragment.kt", l = {91}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10604e;

            /* renamed from: f */
            public final /* synthetic */ TemperatureFragment f10605f;

            /* renamed from: com.topstep.fitcloud.pro.ui.data.TemperatureFragment$f$a$a */
            /* loaded from: classes2.dex */
            public static final class C0151a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ TemperatureFragment f10606a;

                public C0151a(TemperatureFragment temperatureFragment) {
                    this.f10606a = temperatureFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    TemperatureFragment temperatureFragment = this.f10606a;
                    h<Object>[] hVarArr = TemperatureFragment.I0;
                    temperatureFragment.q1((TemperatureRealtime) obj);
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TemperatureFragment temperatureFragment, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f10605f = temperatureFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f10605f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10604e;
                if (i10 == 0) {
                    a0.k(obj);
                    tm.j k10 = this.f10605f.h1().k();
                    C0151a c0151a = new C0151a(this.f10605f);
                    this.f10604e = 1;
                    if (k10.a(c0151a, this) == aVar) {
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

        @zl.e(c = "com.topstep.fitcloud.pro.ui.data.TemperatureFragment$onViewCreated$4$2", f = "TemperatureFragment.kt", l = {98}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10607e;

            /* renamed from: f */
            public final /* synthetic */ TemperatureFragment f10608f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ TemperatureFragment f10609a;

                public a(TemperatureFragment temperatureFragment) {
                    this.f10609a = temperatureFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    List<r> list;
                    List list2 = (List) obj;
                    j jVar = this.f10609a.f10596z0;
                    if (jVar != null) {
                        if (list2 != null) {
                            list = q.S(list2);
                        } else {
                            list = null;
                        }
                        jVar.f24835f = list;
                        j jVar2 = this.f10609a.f10596z0;
                        if (jVar2 != null) {
                            jVar2.h();
                            return tl.l.f28297a;
                        }
                        l.l("adapter");
                        throw null;
                    }
                    l.l("adapter");
                    throw null;
                }
            }

            @zl.e(c = "com.topstep.fitcloud.pro.ui.data.TemperatureFragment$onViewCreated$4$2$invokeSuspend$$inlined$flatMapLatest$1", f = "TemperatureFragment.kt", l = {190}, m = "invokeSuspend")
            /* renamed from: com.topstep.fitcloud.pro.ui.data.TemperatureFragment$f$b$b */
            /* loaded from: classes2.dex */
            public static final class C0152b extends i implements fm.q<sm.g<? super List<? extends r>>, sf.j, xl.d<? super tl.l>, Object> {

                /* renamed from: e */
                public int f10610e;

                /* renamed from: f */
                public /* synthetic */ sm.g f10611f;

                /* renamed from: g */
                public /* synthetic */ Object f10612g;

                /* renamed from: h */
                public final /* synthetic */ TemperatureFragment f10613h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0152b(TemperatureFragment temperatureFragment, xl.d dVar) {
                    super(3, dVar);
                    this.f10613h = temperatureFragment;
                }

                @Override // fm.q
                public final Object j(sm.g<? super List<? extends r>> gVar, sf.j jVar, xl.d<? super tl.l> dVar) {
                    C0152b c0152b = new C0152b(this.f10613h, dVar);
                    c0152b.f10611f = gVar;
                    c0152b.f10612g = jVar;
                    return c0152b.t(tl.l.f28297a);
                }

                @Override // zl.a
                public final Object t(Object obj) {
                    yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                    int i10 = this.f10610e;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            a0.k(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        a0.k(obj);
                        sm.g gVar = this.f10611f;
                        sf.j jVar = (sf.j) this.f10612g;
                        tm.j j10 = this.f10613h.h1().j(jVar.f26941b, jVar.f26940a);
                        this.f10610e = 1;
                        if (bi.r.v(this, j10, gVar) == aVar) {
                            return aVar;
                        }
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(TemperatureFragment temperatureFragment, xl.d<? super b> dVar) {
                super(2, dVar);
                this.f10608f = temperatureFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new b(this.f10608f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10607e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    TemperatureFragment temperatureFragment = this.f10608f;
                    DateMonitor dateMonitor = temperatureFragment.B0;
                    if (dateMonitor != null) {
                        tm.j O = bi.r.O(dateMonitor.f9546c, new C0152b(temperatureFragment, null));
                        a aVar2 = new a(this.f10608f);
                        this.f10607e = 1;
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
        public f(xl.d<? super f> dVar) {
            super(2, dVar);
            TemperatureFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((f) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            f fVar = new f(dVar);
            fVar.f10602e = obj;
            return fVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f10602e;
            z0.g(e0Var, null, 0, new a(TemperatureFragment.this, null), 3);
            z0.g(e0Var, null, 0, new b(TemperatureFragment.this, null), 3);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends m implements fm.a<g0> {

        /* renamed from: b */
        public static final g f10614b = new g();

        public g() {
            super(0);
        }

        @Override // fm.a
        public final g0 m() {
            return new g0();
        }
    }

    static {
        t tVar = new t(TemperatureFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentTemperatureBinding;", 0);
        gm.b0.f15488a.getClass();
        I0 = new h[]{tVar};
    }

    public TemperatureFragment() {
        super(R.layout.fragment_temperature);
        this.f10595y0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentTemperatureBinding.class, this);
        this.A0 = m0.n();
        this.E0 = fb.e.a(new b());
        this.F0 = new a();
        this.H0 = fb.e.a(g.f10614b);
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        DateMonitor dateMonitor = this.B0;
        if (dateMonitor != null) {
            sf.j jVar = (sf.j) dateMonitor.f9546c.getValue();
            h1().M(jVar.f26941b, jVar.f26940a);
            kg.g gVar = this.C0;
            if (gVar != null) {
                boolean b10 = ((uf.b) gVar.a().getValue()).b();
                this.D0 = b10;
                this.f10596z0 = new j(b10);
                return;
            }
            l.l("unitConfigRepository");
            throw null;
        }
        l.l("dateMonitor");
        throw null;
    }

    @Override // androidx.fragment.app.r
    public final void E0() {
        this.E = true;
        j jVar = this.f10596z0;
        if (jVar != null) {
            jVar.f24836g = null;
            jVar.x(this.F0);
            return;
        }
        l.l("adapter");
        throw null;
    }

    @Override // ph.y, lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        l.f(view, "view");
        super.O0(view, bundle);
        p1().toolbar.setTitle(R.string.temperature_module);
        p1().layoutContent.imgHealthIcon.setImageResource(R.drawable.ic_temperature_white);
        j jVar = this.f10596z0;
        if (jVar != null) {
            jVar.f24836g = new c();
            jVar.u(this.F0);
            RecyclerView recyclerView = p1().recyclerView;
            V0();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            p1().recyclerView.g(new oi.a(V0()));
            RecyclerView recyclerView2 = p1().recyclerView;
            j jVar2 = this.f10596z0;
            if (jVar2 != null) {
                recyclerView2.setAdapter(jVar2);
                p.b.g(p1().layoutContent.btnStart, new d());
                p.b.g(p1().layoutContent.btnStop, new e());
                qi.h.k(qi.h.i(this), new f(null));
                return;
            }
            l.l("adapter");
            throw null;
        }
        l.l("adapter");
        throw null;
    }

    @Override // ph.u
    public final void j1() {
        p1().layoutContent.imgHealthIcon.startAnimation(AnimationUtils.loadAnimation(V0(), R.anim.health_icon_beat));
        p1().layoutContent.tvBodyValue.setVisibility(4);
        p1().layoutContent.tvWristValue.setVisibility(4);
        p1().layoutContent.gifImgTest.setVisibility(0);
        p1().layoutContent.tvTime.setText("");
        p1().layoutContent.btnStart.setVisibility(8);
        p1().layoutContent.btnStop.setVisibility(0);
        p1().layoutContent.btnStop.setText(p0(R.string.healthy_stop_test, 60));
        ((g0) this.H0.getValue()).c();
    }

    @Override // ph.u
    public final void k1() {
        if (((g0) this.H0.getValue()).f24156i > 0) {
            TemperatureRealtime e10 = ((g0) this.H0.getValue()).e();
            p000do.a.f13275a.h("App temperature realtime:%s", e10.toString());
            h1().u(e10);
        } else {
            q1(this.G0);
        }
        p1().layoutContent.imgHealthIcon.clearAnimation();
        p1().layoutContent.tvBodyValue.setVisibility(0);
        p1().layoutContent.tvWristValue.setVisibility(0);
        p1().layoutContent.gifImgTest.setVisibility(4);
        p1().layoutContent.btnStart.setVisibility(0);
        p1().layoutContent.btnStop.setVisibility(8);
    }

    @Override // ph.u
    public final void m1(oj.d dVar) {
        boolean z10;
        int i10;
        int i11;
        l.f(dVar, WiseOpenHianalyticsData.UNION_RESULT);
        float f10 = dVar.f23580g;
        float f11 = dVar.f23579f;
        if (f11 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        if (((g0) this.H0.getValue()).f24156i == 0) {
            p1().layoutContent.tvBodyValue.setVisibility(0);
            p1().layoutContent.tvWristValue.setVisibility(0);
            p1().layoutContent.gifImgTest.setVisibility(4);
        }
        ((g0) this.H0.getValue()).b(f10, f11);
        if (f10 <= 0.0f) {
            p1().layoutContent.tvBodyValue.setText((String) this.E0.getValue());
        } else {
            TextView textView = p1().layoutContent.tvBodyValue;
            Context V0 = V0();
            if (this.D0) {
                i10 = R.string.unit_centigrade_param;
            } else {
                f10 = hh.b.e(f10);
                i10 = R.string.unit_fahrenheit_param;
            }
            Object[] objArr = new Object[1];
            DecimalFormat decimalFormat = m0.f4332c;
            if (decimalFormat != null) {
                String format = decimalFormat.format(Double.parseDouble(String.valueOf(f10)));
                l.e(format, "DECIMAL_2_FORMAT.format(…ue.toString().toDouble())");
                objArr[0] = format;
                String string = V0.getString(i10, objArr);
                l.e(string, "context.getString(strRes…Util.decimal2Str(result))");
                textView.setText(string);
            } else {
                l.l("DECIMAL_2_FORMAT");
                throw null;
            }
        }
        TextView textView2 = p1().layoutContent.tvWristValue;
        Context V02 = V0();
        if (this.D0) {
            i11 = R.string.unit_centigrade_param;
        } else {
            f11 = hh.b.e(f11);
            i11 = R.string.unit_fahrenheit_param;
        }
        Object[] objArr2 = new Object[1];
        DecimalFormat decimalFormat2 = m0.f4332c;
        if (decimalFormat2 != null) {
            String format2 = decimalFormat2.format(Double.parseDouble(String.valueOf(f11)));
            l.e(format2, "DECIMAL_2_FORMAT.format(…ue.toString().toDouble())");
            objArr2[0] = format2;
            String string2 = V02.getString(i11, objArr2);
            l.e(string2, "context.getString(strRes…Util.decimal2Str(result))");
            textView2.setText(string2);
            return;
        }
        l.l("DECIMAL_2_FORMAT");
        throw null;
    }

    @Override // ph.u
    public final void n1(int i10) {
        p1().layoutContent.btnStop.setText(p0(R.string.healthy_stop_test, Integer.valueOf(i10)));
    }

    public final FragmentTemperatureBinding p1() {
        return (FragmentTemperatureBinding) this.f10595y0.a(this, I0[0]);
    }

    public final void q1(TemperatureRealtime temperatureRealtime) {
        TextView textView;
        int i10;
        String string;
        int i11;
        this.G0 = temperatureRealtime;
        if (temperatureRealtime == null) {
            p1().layoutContent.tvBodyValue.setText((String) this.E0.getValue());
            p1().layoutContent.tvWristValue.setText((String) this.E0.getValue());
            p1().layoutContent.tvTime.setText("");
            return;
        }
        if (temperatureRealtime.f9653b <= 0.0f) {
            textView = p1().layoutContent.tvBodyValue;
            string = (String) this.E0.getValue();
        } else {
            textView = p1().layoutContent.tvBodyValue;
            Context V0 = V0();
            float f10 = temperatureRealtime.f9653b;
            if (this.D0) {
                i10 = R.string.unit_centigrade_param;
            } else {
                f10 = hh.b.e(f10);
                i10 = R.string.unit_fahrenheit_param;
            }
            Object[] objArr = new Object[1];
            DecimalFormat decimalFormat = m0.f4332c;
            if (decimalFormat != null) {
                String format = decimalFormat.format(Double.parseDouble(String.valueOf(f10)));
                l.e(format, "DECIMAL_2_FORMAT.format(…ue.toString().toDouble())");
                objArr[0] = format;
                string = V0.getString(i10, objArr);
                l.e(string, "context.getString(strRes…Util.decimal2Str(result))");
            } else {
                l.l("DECIMAL_2_FORMAT");
                throw null;
            }
        }
        textView.setText(string);
        TextView textView2 = p1().layoutContent.tvWristValue;
        Context V02 = V0();
        float f11 = temperatureRealtime.f9654c;
        if (this.D0) {
            i11 = R.string.unit_centigrade_param;
        } else {
            f11 = hh.b.e(f11);
            i11 = R.string.unit_fahrenheit_param;
        }
        Object[] objArr2 = new Object[1];
        DecimalFormat decimalFormat2 = m0.f4332c;
        if (decimalFormat2 != null) {
            String format2 = decimalFormat2.format(Double.parseDouble(String.valueOf(f11)));
            l.e(format2, "DECIMAL_2_FORMAT.format(…ue.toString().toDouble())");
            objArr2[0] = format2;
            String string2 = V02.getString(i11, objArr2);
            l.e(string2, "context.getString(strRes…Util.decimal2Str(result))");
            textView2.setText(string2);
            p1().layoutContent.tvTime.setText(p0(R.string.healthy_previous_time, this.A0.format(temperatureRealtime.f9652a)));
            return;
        }
        l.l("DECIMAL_2_FORMAT");
        throw null;
    }
}
