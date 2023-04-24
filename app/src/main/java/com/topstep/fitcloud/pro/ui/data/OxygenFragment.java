package com.topstep.fitcloud.pro.ui.data;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.topstep.fitcloud.pro.model.data.OxygenRealtime;
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
import ph.p0;
import pm.e0;
import qh.g;
import tm.j;
import ul.q;
import vf.k;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class OxygenFragment extends p0 {
    public static final /* synthetic */ h<Object>[] F0;
    public final SimpleDateFormat A0;
    public DateMonitor B0;
    public final a C0;
    public OxygenRealtime D0;
    public final tl.d E0;

    /* renamed from: y0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10511y0;

    /* renamed from: z0 */
    public final g f10512z0;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.g {
        public a() {
            OxygenFragment.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            if (OxygenFragment.this.f10512z0.e() <= 0) {
                OxygenFragment.this.p1().emptyView.setVisibility(0);
                OxygenFragment.this.p1().recyclerView.setVisibility(8);
                return;
            }
            OxygenFragment.this.p1().emptyView.setVisibility(8);
            OxygenFragment.this.p1().recyclerView.setVisibility(0);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements mh.a<k> {
        public b() {
            OxygenFragment.this = r1;
        }

        @Override // mh.a
        public final void a(Object obj) {
            k kVar = (k) obj;
            l.f(kVar, "item");
            m f10 = tb.a.f(OxygenFragment.this);
            Date date = kVar.f29287a;
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
            OxygenFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Button button) {
            l.f(button, "it");
            OxygenFragment.this.l1(2, true);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends gm.m implements fm.l<Button, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d() {
            super(1);
            OxygenFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Button button) {
            l.f(button, "it");
            OxygenFragment.this.l1(2, true);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.OxygenFragment$onViewCreated$4", f = "OxygenFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10517e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.data.OxygenFragment$onViewCreated$4$1", f = "OxygenFragment.kt", l = {87}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10519e;

            /* renamed from: f */
            public final /* synthetic */ OxygenFragment f10520f;

            /* renamed from: com.topstep.fitcloud.pro.ui.data.OxygenFragment$e$a$a */
            /* loaded from: classes2.dex */
            public static final class C0141a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ OxygenFragment f10521a;

                public C0141a(OxygenFragment oxygenFragment) {
                    this.f10521a = oxygenFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    OxygenFragment oxygenFragment = this.f10521a;
                    h<Object>[] hVarArr = OxygenFragment.F0;
                    oxygenFragment.q1((OxygenRealtime) obj);
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OxygenFragment oxygenFragment, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f10520f = oxygenFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f10520f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10519e;
                if (i10 == 0) {
                    a0.k(obj);
                    j c10 = this.f10520f.h1().c();
                    C0141a c0141a = new C0141a(this.f10520f);
                    this.f10519e = 1;
                    if (c10.a(c0141a, this) == aVar) {
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

        @zl.e(c = "com.topstep.fitcloud.pro.ui.data.OxygenFragment$onViewCreated$4$2", f = "OxygenFragment.kt", l = {94}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10522e;

            /* renamed from: f */
            public final /* synthetic */ OxygenFragment f10523f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ OxygenFragment f10524a;

                public a(OxygenFragment oxygenFragment) {
                    this.f10524a = oxygenFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    List<? extends T> list;
                    List list2 = (List) obj;
                    g gVar = this.f10524a.f10512z0;
                    if (list2 != null) {
                        list = q.S(list2);
                    } else {
                        list = null;
                    }
                    gVar.f24818e = list;
                    this.f10524a.f10512z0.h();
                    return tl.l.f28297a;
                }
            }

            @zl.e(c = "com.topstep.fitcloud.pro.ui.data.OxygenFragment$onViewCreated$4$2$invokeSuspend$$inlined$flatMapLatest$1", f = "OxygenFragment.kt", l = {190}, m = "invokeSuspend")
            /* renamed from: com.topstep.fitcloud.pro.ui.data.OxygenFragment$e$b$b */
            /* loaded from: classes2.dex */
            public static final class C0142b extends i implements fm.q<sm.g<? super List<? extends k>>, sf.j, xl.d<? super tl.l>, Object> {

                /* renamed from: e */
                public int f10525e;

                /* renamed from: f */
                public /* synthetic */ sm.g f10526f;

                /* renamed from: g */
                public /* synthetic */ Object f10527g;

                /* renamed from: h */
                public final /* synthetic */ OxygenFragment f10528h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0142b(OxygenFragment oxygenFragment, xl.d dVar) {
                    super(3, dVar);
                    this.f10528h = oxygenFragment;
                }

                @Override // fm.q
                public final Object j(sm.g<? super List<? extends k>> gVar, sf.j jVar, xl.d<? super tl.l> dVar) {
                    C0142b c0142b = new C0142b(this.f10528h, dVar);
                    c0142b.f10526f = gVar;
                    c0142b.f10527g = jVar;
                    return c0142b.t(tl.l.f28297a);
                }

                @Override // zl.a
                public final Object t(Object obj) {
                    yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                    int i10 = this.f10525e;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            a0.k(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        a0.k(obj);
                        sm.g gVar = this.f10526f;
                        sf.j jVar = (sf.j) this.f10527g;
                        j G = this.f10528h.h1().G(jVar.f26941b, jVar.f26940a);
                        this.f10525e = 1;
                        if (r.v(this, G, gVar) == aVar) {
                            return aVar;
                        }
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(OxygenFragment oxygenFragment, xl.d<? super b> dVar) {
                super(2, dVar);
                this.f10523f = oxygenFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new b(this.f10523f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10522e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    OxygenFragment oxygenFragment = this.f10523f;
                    DateMonitor dateMonitor = oxygenFragment.B0;
                    if (dateMonitor != null) {
                        j O = r.O(dateMonitor.f9546c, new C0142b(oxygenFragment, null));
                        a aVar2 = new a(this.f10523f);
                        this.f10522e = 1;
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
            OxygenFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((e) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f10517e = obj;
            return eVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f10517e;
            z0.g(e0Var, null, 0, new a(OxygenFragment.this, null), 3);
            z0.g(e0Var, null, 0, new b(OxygenFragment.this, null), 3);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends gm.m implements fm.a<g0> {

        /* renamed from: b */
        public static final f f10529b = new f();

        public f() {
            super(0);
        }

        @Override // fm.a
        public final g0 m() {
            return new g0();
        }
    }

    static {
        t tVar = new t(OxygenFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentBaseHealthBinding;", 0);
        gm.b0.f15488a.getClass();
        F0 = new h[]{tVar};
    }

    public OxygenFragment() {
        super(R.layout.fragment_base_health);
        this.f10511y0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentBaseHealthBinding.class, this);
        this.f10512z0 = new g();
        this.A0 = m0.n();
        this.C0 = new a();
        this.E0 = fb.e.a(f.f10529b);
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        DateMonitor dateMonitor = this.B0;
        if (dateMonitor != null) {
            sf.j jVar = (sf.j) dateMonitor.f9546c.getValue();
            h1().B(jVar.f26941b, jVar.f26940a);
            return;
        }
        l.l("dateMonitor");
        throw null;
    }

    @Override // androidx.fragment.app.r
    public final void E0() {
        this.E = true;
        g gVar = this.f10512z0;
        gVar.f24819f = null;
        gVar.x(this.C0);
    }

    @Override // ph.y, lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        l.f(view, "view");
        super.O0(view, bundle);
        p1().layoutContainer.addView(LayoutInflater.from(V0()).inflate(R.layout.layout_oxygen_des, (ViewGroup) null), 1);
        p1().toolbar.setTitle(R.string.oxygen_module);
        p1().layoutContent.imgHealthIcon.setImageResource(R.drawable.ic_oxygen_white);
        p1().layoutContent.tvValueUnit.setText(R.string.percent);
        g gVar = this.f10512z0;
        gVar.f24819f = new b();
        gVar.u(this.C0);
        RecyclerView recyclerView = p1().recyclerView;
        V0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        p1().recyclerView.g(new oi.a(V0()));
        p1().recyclerView.setAdapter(this.f10512z0);
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
            OxygenRealtime oxygenRealtime = new OxygenRealtime(((int) g0Var.f24150c) / g0Var.f24156i, new Date());
            p000do.a.f13275a.h("App oxygen realtime:%s", oxygenRealtime.toString());
            h1().v(oxygenRealtime);
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
        if (dVar.f23575b <= 0) {
            return;
        }
        if (((g0) this.E0.getValue()).f24156i == 0) {
            p1().layoutContent.tvValue.setVisibility(0);
            p1().layoutContent.tvValueUnit.setVisibility(0);
            p1().layoutContent.gifImgTest.setVisibility(4);
        }
        ((g0) this.E0.getValue()).a(dVar.f23575b);
        TextView textView = p1().layoutContent.tvValue;
        int i10 = dVar.f23575b;
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
        return (FragmentBaseHealthBinding) this.f10511y0.a(this, F0[0]);
    }

    public final void q1(OxygenRealtime oxygenRealtime) {
        String string;
        String str;
        this.D0 = oxygenRealtime;
        if (oxygenRealtime == null) {
            p1().layoutContent.tvValue.setText(R.string.realtime_none_normal);
            p1().layoutContent.tvTime.setText("");
            p1().layoutContent.tvResult.setText("");
            return;
        }
        TextView textView = p1().layoutContent.tvValue;
        int i10 = oxygenRealtime.f9586b;
        Locale locale = m0.f4330a;
        if (locale != null) {
            String format = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
            l.e(format, "format(locale, format, *args)");
            textView.setText(format);
            p1().layoutContent.tvTime.setText(p0(R.string.healthy_previous_time, this.A0.format(oxygenRealtime.f9585a)));
            TextView textView2 = p1().layoutContent.tvResult;
            Context V0 = V0();
            int i11 = oxygenRealtime.f9586b;
            if (i11 < 90) {
                string = V0.getString(R.string.oxygen_des1);
                str = "{\n            context.ge…ng.oxygen_des1)\n        }";
            } else if (i11 <= 93) {
                string = V0.getString(R.string.oxygen_des2);
                str = "{\n            context.ge…ng.oxygen_des2)\n        }";
            } else {
                string = V0.getString(R.string.oxygen_des3);
                str = "{\n            context.ge…ng.oxygen_des3)\n        }";
            }
            l.e(string, str);
            textView2.setText(string);
            return;
        }
        l.l("systemLocale");
        throw null;
    }
}
