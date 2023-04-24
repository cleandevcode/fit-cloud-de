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
import com.topstep.fitcloud.pro.model.data.PressureRealtime;
import com.topstep.fitcloudpro.R;
import fm.p;
import gm.l;
import gm.t;
import i2.b0;
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
import ph.r0;
import pm.e0;
import qh.i;
import sm.g;
import tm.j;
import ul.q;
import vf.m;

@Metadata
/* loaded from: classes2.dex */
public final class PressureFragment extends r0 {
    public static final /* synthetic */ h<Object>[] F0;
    public final SimpleDateFormat A0;
    public DateMonitor B0;
    public final a C0;
    public PressureRealtime D0;
    public final tl.d E0;

    /* renamed from: y0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10538y0;

    /* renamed from: z0 */
    public final i f10539z0;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.g {
        public a() {
            PressureFragment.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            if (PressureFragment.this.f10539z0.e() <= 0) {
                PressureFragment.this.p1().emptyView.setVisibility(0);
                PressureFragment.this.p1().recyclerView.setVisibility(8);
                return;
            }
            PressureFragment.this.p1().emptyView.setVisibility(8);
            PressureFragment.this.p1().recyclerView.setVisibility(0);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements mh.a<m> {
        public b() {
            PressureFragment.this = r1;
        }

        @Override // mh.a
        public final void a(Object obj) {
            m mVar = (m) obj;
            l.f(mVar, "item");
            i2.m f10 = tb.a.f(PressureFragment.this);
            Date date = mVar.f29295a;
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
            PressureFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Button button) {
            l.f(button, "it");
            PressureFragment.this.l1(64, true);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends gm.m implements fm.l<Button, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d() {
            super(1);
            PressureFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Button button) {
            l.f(button, "it");
            PressureFragment.this.l1(64, true);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.PressureFragment$onViewCreated$4", f = "PressureFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10544e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.data.PressureFragment$onViewCreated$4$1", f = "PressureFragment.kt", l = {81}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10546e;

            /* renamed from: f */
            public final /* synthetic */ PressureFragment f10547f;

            /* renamed from: com.topstep.fitcloud.pro.ui.data.PressureFragment$e$a$a */
            /* loaded from: classes2.dex */
            public static final class C0143a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ PressureFragment f10548a;

                public C0143a(PressureFragment pressureFragment) {
                    this.f10548a = pressureFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    PressureFragment pressureFragment = this.f10548a;
                    h<Object>[] hVarArr = PressureFragment.F0;
                    pressureFragment.q1((PressureRealtime) obj);
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PressureFragment pressureFragment, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f10547f = pressureFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f10547f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10546e;
                if (i10 == 0) {
                    a0.k(obj);
                    j D = this.f10547f.h1().D();
                    C0143a c0143a = new C0143a(this.f10547f);
                    this.f10546e = 1;
                    if (D.a(c0143a, this) == aVar) {
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

        @zl.e(c = "com.topstep.fitcloud.pro.ui.data.PressureFragment$onViewCreated$4$2", f = "PressureFragment.kt", l = {88}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10549e;

            /* renamed from: f */
            public final /* synthetic */ PressureFragment f10550f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ PressureFragment f10551a;

                public a(PressureFragment pressureFragment) {
                    this.f10551a = pressureFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    List<? extends T> list;
                    List list2 = (List) obj;
                    i iVar = this.f10551a.f10539z0;
                    if (list2 != null) {
                        list = q.S(list2);
                    } else {
                        list = null;
                    }
                    iVar.f24818e = list;
                    this.f10551a.f10539z0.h();
                    return tl.l.f28297a;
                }
            }

            @zl.e(c = "com.topstep.fitcloud.pro.ui.data.PressureFragment$onViewCreated$4$2$invokeSuspend$$inlined$flatMapLatest$1", f = "PressureFragment.kt", l = {190}, m = "invokeSuspend")
            /* renamed from: com.topstep.fitcloud.pro.ui.data.PressureFragment$e$b$b */
            /* loaded from: classes2.dex */
            public static final class C0144b extends zl.i implements fm.q<g<? super List<? extends m>>, sf.j, xl.d<? super tl.l>, Object> {

                /* renamed from: e */
                public int f10552e;

                /* renamed from: f */
                public /* synthetic */ g f10553f;

                /* renamed from: g */
                public /* synthetic */ Object f10554g;

                /* renamed from: h */
                public final /* synthetic */ PressureFragment f10555h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0144b(PressureFragment pressureFragment, xl.d dVar) {
                    super(3, dVar);
                    this.f10555h = pressureFragment;
                }

                @Override // fm.q
                public final Object j(g<? super List<? extends m>> gVar, sf.j jVar, xl.d<? super tl.l> dVar) {
                    C0144b c0144b = new C0144b(this.f10555h, dVar);
                    c0144b.f10553f = gVar;
                    c0144b.f10554g = jVar;
                    return c0144b.t(tl.l.f28297a);
                }

                @Override // zl.a
                public final Object t(Object obj) {
                    yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                    int i10 = this.f10552e;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            a0.k(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        a0.k(obj);
                        g gVar = this.f10553f;
                        sf.j jVar = (sf.j) this.f10554g;
                        j C = this.f10555h.h1().C(jVar.f26941b, jVar.f26940a);
                        this.f10552e = 1;
                        if (r.v(this, C, gVar) == aVar) {
                            return aVar;
                        }
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(PressureFragment pressureFragment, xl.d<? super b> dVar) {
                super(2, dVar);
                this.f10550f = pressureFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new b(this.f10550f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10549e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    PressureFragment pressureFragment = this.f10550f;
                    DateMonitor dateMonitor = pressureFragment.B0;
                    if (dateMonitor != null) {
                        j O = r.O(dateMonitor.f9546c, new C0144b(pressureFragment, null));
                        a aVar2 = new a(this.f10550f);
                        this.f10549e = 1;
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
            PressureFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((e) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f10544e = obj;
            return eVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f10544e;
            z0.g(e0Var, null, 0, new a(PressureFragment.this, null), 3);
            z0.g(e0Var, null, 0, new b(PressureFragment.this, null), 3);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends gm.m implements fm.a<g0> {

        /* renamed from: b */
        public static final f f10556b = new f();

        public f() {
            super(0);
        }

        @Override // fm.a
        public final g0 m() {
            return new g0();
        }
    }

    static {
        t tVar = new t(PressureFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentBaseHealthBinding;", 0);
        gm.b0.f15488a.getClass();
        F0 = new h[]{tVar};
    }

    public PressureFragment() {
        super(R.layout.fragment_base_health);
        this.f10538y0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentBaseHealthBinding.class, this);
        this.f10539z0 = new i();
        this.A0 = m0.n();
        this.C0 = new a();
        this.E0 = fb.e.a(f.f10556b);
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        DateMonitor dateMonitor = this.B0;
        if (dateMonitor != null) {
            sf.j jVar = (sf.j) dateMonitor.f9546c.getValue();
            h1().F(jVar.f26941b, jVar.f26940a);
            return;
        }
        l.l("dateMonitor");
        throw null;
    }

    @Override // androidx.fragment.app.r
    public final void E0() {
        this.E = true;
        i iVar = this.f10539z0;
        iVar.f24819f = null;
        iVar.x(this.C0);
    }

    @Override // ph.y, lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        l.f(view, "view");
        super.O0(view, bundle);
        p1().toolbar.setTitle(R.string.pressure_module);
        p1().layoutContent.imgHealthIcon.setImageResource(R.drawable.ic_pressure_white);
        p1().layoutContent.tvValueUnit.setText((CharSequence) null);
        i iVar = this.f10539z0;
        iVar.f24819f = new b();
        iVar.u(this.C0);
        RecyclerView recyclerView = p1().recyclerView;
        V0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        p1().recyclerView.g(new oi.a(V0()));
        p1().recyclerView.setAdapter(this.f10539z0);
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
            PressureRealtime pressureRealtime = new PressureRealtime(((int) g0Var.f24150c) / g0Var.f24156i, new Date());
            p000do.a.f13275a.h("App pressure realtime:%s", pressureRealtime.toString());
            h1().a(pressureRealtime);
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
        if (dVar.f23581h <= 0) {
            return;
        }
        if (((g0) this.E0.getValue()).f24156i == 0) {
            p1().layoutContent.tvValue.setVisibility(0);
            p1().layoutContent.tvValueUnit.setVisibility(0);
            p1().layoutContent.gifImgTest.setVisibility(4);
        }
        ((g0) this.E0.getValue()).a(dVar.f23581h);
        TextView textView = p1().layoutContent.tvValue;
        int i10 = dVar.f23581h;
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
        return (FragmentBaseHealthBinding) this.f10538y0.a(this, F0[0]);
    }

    public final void q1(PressureRealtime pressureRealtime) {
        String string;
        String str;
        this.D0 = pressureRealtime;
        if (pressureRealtime == null) {
            p1().layoutContent.tvValue.setText(R.string.realtime_none_normal);
            p1().layoutContent.tvTime.setText("");
            p1().layoutContent.tvResult.setText("");
            return;
        }
        p1().layoutContent.tvValue.setText(n6.a0.n(pressureRealtime.f9591b));
        p1().layoutContent.tvTime.setText(p0(R.string.healthy_previous_time, this.A0.format(pressureRealtime.f9590a)));
        TextView textView = p1().layoutContent.tvResult;
        Context V0 = V0();
        int i10 = pressureRealtime.f9591b;
        if (i10 < 30) {
            string = V0.getString(R.string.pressure_result_1);
            str = "{\n            context.ge…ssure_result_1)\n        }";
        } else if (i10 < 60) {
            string = V0.getString(R.string.pressure_result_2);
            str = "{\n            context.ge…ssure_result_2)\n        }";
        } else if (i10 < 80) {
            string = V0.getString(R.string.pressure_result_3);
            str = "{\n            context.ge…ssure_result_3)\n        }";
        } else {
            string = V0.getString(R.string.pressure_result_4);
            str = "{\n            context.ge…ssure_result_4)\n        }";
        }
        l.e(string, str);
        textView.setText(string);
    }
}
