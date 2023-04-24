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
import com.topstep.fitcloud.pro.model.data.BloodPressureRealtime;
import com.topstep.fitcloudpro.R;
import fm.p;
import gm.l;
import gm.t;
import i2.b0;
import i2.m;
import ih.v;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import mf.a0;
import mm.h;
import ph.g0;
import ph.k0;
import pm.e0;
import sm.g;
import tm.j;
import ul.q;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class BloodPressureFragment extends k0 {
    public static final /* synthetic */ h<Object>[] H0;
    public final SimpleDateFormat A0;
    public DateMonitor B0;
    public boolean C0;
    public boolean D0;
    public final a E0;
    public BloodPressureRealtime F0;
    public final tl.d G0;

    /* renamed from: y0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10439y0;

    /* renamed from: z0 */
    public final qh.c f10440z0;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.g {
        public a() {
            BloodPressureFragment.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            if (BloodPressureFragment.this.f10440z0.e() <= 0) {
                BloodPressureFragment.this.p1().emptyView.setVisibility(0);
                BloodPressureFragment.this.p1().recyclerView.setVisibility(8);
                return;
            }
            BloodPressureFragment.this.p1().emptyView.setVisibility(8);
            BloodPressureFragment.this.p1().recyclerView.setVisibility(0);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements mh.a<vf.c> {
        public b() {
            BloodPressureFragment.this = r1;
        }

        @Override // mh.a
        public final void a(Object obj) {
            vf.c cVar = (vf.c) obj;
            l.f(cVar, "item");
            m f10 = tb.a.f(BloodPressureFragment.this);
            Date date = cVar.f29268a;
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
            BloodPressureFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Button button) {
            l.f(button, "it");
            BloodPressureFragment bloodPressureFragment = BloodPressureFragment.this;
            byte[] bArr = ((jj.l) bloodPressureFragment.i1().D().f23334a).f17931e.get((byte) 48);
            bArr = (bArr == null || bArr.length != 10) ? null : null;
            boolean z10 = false;
            if (bArr != null && bArr[2] > 0) {
                z10 = true;
            }
            bloodPressureFragment.C0 = z10;
            BloodPressureFragment bloodPressureFragment2 = BloodPressureFragment.this;
            bloodPressureFragment2.D0 = bloodPressureFragment2.i1().D().c().g(21);
            BloodPressureFragment bloodPressureFragment3 = BloodPressureFragment.this;
            bloodPressureFragment3.l1(4, !bloodPressureFragment3.D0);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends gm.m implements fm.l<Button, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d() {
            super(1);
            BloodPressureFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Button button) {
            l.f(button, "it");
            BloodPressureFragment bloodPressureFragment = BloodPressureFragment.this;
            bloodPressureFragment.l1(4, !bloodPressureFragment.D0);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.BloodPressureFragment$onViewCreated$4", f = "BloodPressureFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10445e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.data.BloodPressureFragment$onViewCreated$4$1", f = "BloodPressureFragment.kt", l = {90}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10447e;

            /* renamed from: f */
            public final /* synthetic */ BloodPressureFragment f10448f;

            /* renamed from: com.topstep.fitcloud.pro.ui.data.BloodPressureFragment$e$a$a */
            /* loaded from: classes2.dex */
            public static final class C0133a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ BloodPressureFragment f10449a;

                public C0133a(BloodPressureFragment bloodPressureFragment) {
                    this.f10449a = bloodPressureFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    BloodPressureFragment bloodPressureFragment = this.f10449a;
                    h<Object>[] hVarArr = BloodPressureFragment.H0;
                    bloodPressureFragment.q1((BloodPressureRealtime) obj);
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BloodPressureFragment bloodPressureFragment, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f10448f = bloodPressureFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f10448f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10447e;
                if (i10 == 0) {
                    a0.k(obj);
                    j i11 = this.f10448f.h1().i();
                    C0133a c0133a = new C0133a(this.f10448f);
                    this.f10447e = 1;
                    if (i11.a(c0133a, this) == aVar) {
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

        @zl.e(c = "com.topstep.fitcloud.pro.ui.data.BloodPressureFragment$onViewCreated$4$2", f = "BloodPressureFragment.kt", l = {97}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10450e;

            /* renamed from: f */
            public final /* synthetic */ BloodPressureFragment f10451f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements g {

                /* renamed from: a */
                public final /* synthetic */ BloodPressureFragment f10452a;

                public a(BloodPressureFragment bloodPressureFragment) {
                    this.f10452a = bloodPressureFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    List<? extends T> list;
                    List list2 = (List) obj;
                    qh.c cVar = this.f10452a.f10440z0;
                    if (list2 != null) {
                        list = q.S(list2);
                    } else {
                        list = null;
                    }
                    cVar.f24818e = list;
                    this.f10452a.f10440z0.h();
                    return tl.l.f28297a;
                }
            }

            @zl.e(c = "com.topstep.fitcloud.pro.ui.data.BloodPressureFragment$onViewCreated$4$2$invokeSuspend$$inlined$flatMapLatest$1", f = "BloodPressureFragment.kt", l = {190}, m = "invokeSuspend")
            /* renamed from: com.topstep.fitcloud.pro.ui.data.BloodPressureFragment$e$b$b */
            /* loaded from: classes2.dex */
            public static final class C0134b extends i implements fm.q<g<? super List<? extends vf.c>>, sf.j, xl.d<? super tl.l>, Object> {

                /* renamed from: e */
                public int f10453e;

                /* renamed from: f */
                public /* synthetic */ g f10454f;

                /* renamed from: g */
                public /* synthetic */ Object f10455g;

                /* renamed from: h */
                public final /* synthetic */ BloodPressureFragment f10456h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0134b(BloodPressureFragment bloodPressureFragment, xl.d dVar) {
                    super(3, dVar);
                    this.f10456h = bloodPressureFragment;
                }

                @Override // fm.q
                public final Object j(g<? super List<? extends vf.c>> gVar, sf.j jVar, xl.d<? super tl.l> dVar) {
                    C0134b c0134b = new C0134b(this.f10456h, dVar);
                    c0134b.f10454f = gVar;
                    c0134b.f10455g = jVar;
                    return c0134b.t(tl.l.f28297a);
                }

                @Override // zl.a
                public final Object t(Object obj) {
                    yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                    int i10 = this.f10453e;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            a0.k(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        a0.k(obj);
                        g gVar = this.f10454f;
                        sf.j jVar = (sf.j) this.f10455g;
                        j t10 = this.f10456h.h1().t(jVar.f26941b, jVar.f26940a);
                        this.f10453e = 1;
                        if (r.v(this, t10, gVar) == aVar) {
                            return aVar;
                        }
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(BloodPressureFragment bloodPressureFragment, xl.d<? super b> dVar) {
                super(2, dVar);
                this.f10451f = bloodPressureFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new b(this.f10451f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10450e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    BloodPressureFragment bloodPressureFragment = this.f10451f;
                    DateMonitor dateMonitor = bloodPressureFragment.B0;
                    if (dateMonitor != null) {
                        j O = r.O(dateMonitor.f9546c, new C0134b(bloodPressureFragment, null));
                        a aVar2 = new a(this.f10451f);
                        this.f10450e = 1;
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
            BloodPressureFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((e) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f10445e = obj;
            return eVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f10445e;
            z0.g(e0Var, null, 0, new a(BloodPressureFragment.this, null), 3);
            z0.g(e0Var, null, 0, new b(BloodPressureFragment.this, null), 3);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends gm.m implements fm.a<g0> {

        /* renamed from: b */
        public static final f f10457b = new f();

        public f() {
            super(0);
        }

        @Override // fm.a
        public final g0 m() {
            return new g0();
        }
    }

    static {
        t tVar = new t(BloodPressureFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentBaseHealthBinding;", 0);
        gm.b0.f15488a.getClass();
        H0 = new h[]{tVar};
    }

    public BloodPressureFragment() {
        super(R.layout.fragment_base_health);
        this.f10439y0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentBaseHealthBinding.class, this);
        this.f10440z0 = new qh.c();
        this.A0 = m0.n();
        this.E0 = new a();
        this.G0 = fb.e.a(f.f10457b);
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        DateMonitor dateMonitor = this.B0;
        if (dateMonitor != null) {
            sf.j jVar = (sf.j) dateMonitor.f9546c.getValue();
            h1().y(jVar.f26941b, jVar.f26940a);
            return;
        }
        l.l("dateMonitor");
        throw null;
    }

    @Override // androidx.fragment.app.r
    public final void E0() {
        this.E = true;
        qh.c cVar = this.f10440z0;
        cVar.f24819f = null;
        cVar.x(this.E0);
    }

    @Override // ph.y, lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        l.f(view, "view");
        super.O0(view, bundle);
        p1().toolbar.setTitle(R.string.blood_pressure_module);
        p1().layoutContent.imgHealthIcon.setImageResource(R.drawable.ic_blood_pressure_white);
        p1().layoutContent.tvValueUnit.setText(R.string.unit_mmhg);
        qh.c cVar = this.f10440z0;
        cVar.f24819f = new b();
        cVar.u(this.E0);
        RecyclerView recyclerView = p1().recyclerView;
        V0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        p1().recyclerView.g(new oi.a(V0()));
        p1().recyclerView.setAdapter(this.f10440z0);
        p.b.g(p1().layoutContent.btnStart, new c());
        p.b.g(p1().layoutContent.btnStop, new d());
        qi.h.k(qi.h.i(this), new e(null));
    }

    @Override // ph.u
    public final void j1() {
        String str;
        p1().layoutContent.imgHealthIcon.startAnimation(AnimationUtils.loadAnimation(V0(), R.anim.health_icon_beat));
        p1().layoutContent.tvValue.setVisibility(4);
        p1().layoutContent.tvValueDes.setVisibility(4);
        p1().layoutContent.tvValueUnit.setVisibility(4);
        p1().layoutContent.gifImgTest.setVisibility(0);
        TextView textView = p1().layoutContent.tvValueDes;
        if (!this.C0) {
            str = "";
        } else {
            str = "P";
        }
        textView.setText(str);
        p1().layoutContent.tvTime.setText("");
        p1().layoutContent.tvResult.setText("");
        p1().layoutContent.btnStart.setVisibility(8);
        p1().layoutContent.btnStop.setVisibility(0);
        if (!this.D0) {
            p1().layoutContent.btnStop.setText(p0(R.string.healthy_stop_test, 60));
        } else {
            p1().layoutContent.btnStop.setText(R.string.healthy_end_test);
        }
        ((g0) this.G0.getValue()).c();
    }

    @Override // ph.u
    public final void k1() {
        if (((g0) this.G0.getValue()).f24156i > 0) {
            BloodPressureRealtime d10 = ((g0) this.G0.getValue()).d(this.C0, this.D0);
            p000do.a.f13275a.h("App bloodPressure realtime:%s", d10.toString());
            h1().g(d10);
        } else {
            q1(this.F0);
        }
        p1().layoutContent.imgHealthIcon.clearAnimation();
        p1().layoutContent.tvValue.setVisibility(0);
        p1().layoutContent.tvValueDes.setVisibility(0);
        p1().layoutContent.tvValueUnit.setVisibility(0);
        p1().layoutContent.gifImgTest.setVisibility(4);
        p1().layoutContent.btnStart.setVisibility(0);
        p1().layoutContent.btnStop.setVisibility(8);
    }

    @Override // ph.u
    public final void m1(oj.d dVar) {
        l.f(dVar, WiseOpenHianalyticsData.UNION_RESULT);
        int i10 = dVar.f23577d;
        int i11 = dVar.f23576c;
        if (this.D0) {
            if (i10 <= 0) {
                return;
            }
        } else if (i10 <= 0 || i11 <= 0) {
            return;
        }
        if (((g0) this.G0.getValue()).f24156i == 0) {
            p1().layoutContent.tvValue.setVisibility(0);
            p1().layoutContent.tvValueDes.setVisibility(0);
            p1().layoutContent.tvValueUnit.setVisibility(0);
            p1().layoutContent.gifImgTest.setVisibility(4);
        }
        ((g0) this.G0.getValue()).b(i10, i11);
        p1().layoutContent.tvValue.setText(n6.a0.a(i10, i11));
    }

    @Override // ph.u
    public final void n1(int i10) {
        p1().layoutContent.btnStop.setText(p0(R.string.healthy_stop_test, Integer.valueOf(i10)));
    }

    public final FragmentBaseHealthBinding p1() {
        return (FragmentBaseHealthBinding) this.f10439y0.a(this, H0[0]);
    }

    public final void q1(BloodPressureRealtime bloodPressureRealtime) {
        char c10;
        String string;
        String str;
        this.F0 = bloodPressureRealtime;
        String str2 = "";
        if (bloodPressureRealtime == null) {
            p1().layoutContent.tvValue.setText(R.string.realtime_none_sbp_dbp);
            p1().layoutContent.tvValueDes.setText("");
            p1().layoutContent.tvTime.setText("");
            p1().layoutContent.tvResult.setText("");
            return;
        }
        p1().layoutContent.tvValue.setText(n6.a0.a(bloodPressureRealtime.f9570b, bloodPressureRealtime.f9571c));
        TextView textView = p1().layoutContent.tvValueDes;
        if (bloodPressureRealtime.f9572d) {
            str2 = "P";
        }
        textView.setText(str2);
        p1().layoutContent.tvTime.setText(p0(R.string.healthy_previous_time, this.A0.format(bloodPressureRealtime.f9569a)));
        TextView textView2 = p1().layoutContent.tvResult;
        Context V0 = V0();
        int i10 = bloodPressureRealtime.f9570b;
        int i11 = bloodPressureRealtime.f9571c;
        char c11 = 3;
        if (i10 < 110) {
            c10 = 1;
        } else if (i10 <= 135) {
            c10 = 2;
        } else {
            c10 = 3;
        }
        if (i11 < 65) {
            c11 = 1;
        } else if (i11 <= 90) {
            c11 = 2;
        }
        if (c10 > c11) {
            c10 = c11;
        }
        if (c10 != 1) {
            if (c10 != 2) {
                string = V0.getString(R.string.healthy_result_high);
                str = "{\n                contex…esult_high)\n            }";
            } else {
                string = V0.getString(R.string.healthy_result_normal);
                str = "{\n                contex…ult_normal)\n            }";
            }
        } else {
            string = V0.getString(R.string.healthy_result_low);
            str = "{\n                contex…result_low)\n            }";
        }
        l.e(string, str);
        textView2.setText(string);
    }
}
