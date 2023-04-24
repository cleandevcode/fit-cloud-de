package com.topstep.fitcloud.pro.ui.device.alarm;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi.z0;
import com.topstep.fitcloud.pro.databinding.FragmentAlarmListBinding;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloud.pro.ui.widget.SwipeItemLayout;
import com.topstep.fitcloudpro.R;
import d2.a;
import fm.p;
import gm.l;
import i2.b0;
import i2.m;
import ih.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import mf.a0;
import pm.e0;
import th.d;
import th.k;
import th.q;
import th.s;
import th.t;
import th.x;
import th.z;
import y3.c1;

@Metadata
/* loaded from: classes2.dex */
public final class AlarmListFragment extends x {

    /* renamed from: x0 */
    public static final /* synthetic */ mm.h<Object>[] f10762x0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10763t0;

    /* renamed from: u0 */
    public final t0 f10764u0;

    /* renamed from: v0 */
    public k f10765v0;

    /* renamed from: w0 */
    public final a f10766w0;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.g {
        public a() {
            AlarmListFragment.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i10, int i11) {
            k kVar = AlarmListFragment.this.f10765v0;
            if (kVar != null) {
                if (kVar.e() <= 0) {
                    AlarmListFragment.this.h1().loadingView.a(R.string.ds_alarm_no_data);
                    return;
                }
                return;
            }
            l.l("adapter");
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends androidx.activity.k {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(true);
            AlarmListFragment.this = r1;
        }

        @Override // androidx.activity.k
        public final void a() {
            AlarmListFragment alarmListFragment = AlarmListFragment.this;
            mm.h<Object>[] hVarArr = AlarmListFragment.f10762x0;
            alarmListFragment.j1();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements k.b {
        public c() {
            AlarmListFragment.this = r1;
        }

        @Override // th.k.b
        public final void a(int i10) {
            AlarmListFragment alarmListFragment = AlarmListFragment.this;
            mm.h<Object>[] hVarArr = AlarmListFragment.f10762x0;
            AlarmViewModel i12 = alarmListFragment.i1();
            i12.getClass();
            z0.g(rm.l.h(i12), null, 0, new s(i12, i10, null), 3);
        }

        @Override // th.k.b
        public final void b(int i10, rj.a aVar) {
            AlarmListFragment alarmListFragment = AlarmListFragment.this;
            mm.h<Object>[] hVarArr = AlarmListFragment.f10762x0;
            AlarmViewModel i12 = alarmListFragment.i1();
            i12.getClass();
            z0.g(rm.l.h(i12), null, 0, new t(i12, i10, aVar, null), 3);
        }

        @Override // th.k.b
        public final void c(int i10, rj.a aVar) {
            m f10 = tb.a.f(AlarmListFragment.this);
            b0 a10 = v.d().a();
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("position", i10);
                f10.l(R.id.toAlarmDetail, bundle, a10);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.alarm.AlarmListFragment$onViewCreated$5$1", f = "AlarmListFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            AlarmListFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((d) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new d(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            int i10;
            a0.k(obj);
            k kVar = AlarmListFragment.this.f10765v0;
            if (kVar != null) {
                List<? extends rj.a> list = kVar.f28204f;
                if (list != null) {
                    i10 = list.size();
                } else {
                    i10 = 0;
                }
                if (i10 >= 5) {
                    d7.e.f(AlarmListFragment.this.f1(), R.string.ds_alarm_limit_count);
                } else {
                    m f10 = tb.a.f(AlarmListFragment.this);
                    b0 a10 = v.d().a();
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putInt("position", -1);
                        f10.l(R.id.toAlarmDetail, bundle, a10);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                return tl.l.f28297a;
            }
            l.l("adapter");
            throw null;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.alarm.AlarmListFragment$onViewCreated$6", f = "AlarmListFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10771e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.alarm.AlarmListFragment$onViewCreated$6$1", f = "AlarmListFragment.kt", l = {87}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10773e;

            /* renamed from: f */
            public final /* synthetic */ AlarmListFragment f10774f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.alarm.AlarmListFragment$e$a$a */
            /* loaded from: classes2.dex */
            public static final class C0154a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ AlarmListFragment f10775a;

                public C0154a(AlarmListFragment alarmListFragment) {
                    this.f10775a = alarmListFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    y3.b<ArrayList<rj.a>> bVar = ((q) obj).f28212a;
                    if (bVar instanceof y3.p) {
                        AlarmListFragment alarmListFragment = this.f10775a;
                        mm.h<Object>[] hVarArr = AlarmListFragment.f10762x0;
                        alarmListFragment.h1().loadingView.c();
                    } else if (bVar instanceof y3.j) {
                        AlarmListFragment alarmListFragment2 = this.f10775a;
                        mm.h<Object>[] hVarArr2 = AlarmListFragment.f10762x0;
                        alarmListFragment2.h1().loadingView.a(R.string.tip_load_error);
                    } else {
                        if (bVar instanceof c1) {
                            ArrayList<rj.a> a10 = bVar.a();
                            if (a10 != null && !a10.isEmpty()) {
                                AlarmListFragment alarmListFragment3 = this.f10775a;
                                mm.h<Object>[] hVarArr3 = AlarmListFragment.f10762x0;
                                alarmListFragment3.h1().loadingView.setVisibility(8);
                            } else {
                                AlarmListFragment alarmListFragment4 = this.f10775a;
                                mm.h<Object>[] hVarArr4 = AlarmListFragment.f10762x0;
                                alarmListFragment4.h1().loadingView.a(R.string.ds_alarm_no_data);
                            }
                            k kVar = this.f10775a.f10765v0;
                            if (kVar != null) {
                                kVar.f28204f = a10;
                                kVar.h();
                                this.f10775a.h1().fabAdd.o(null, true);
                            } else {
                                l.l("adapter");
                                throw null;
                            }
                        }
                        return tl.l.f28297a;
                    }
                    this.f10775a.h1().fabAdd.h();
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AlarmListFragment alarmListFragment, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f10774f = alarmListFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f10774f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10773e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    AlarmListFragment alarmListFragment = this.f10774f;
                    mm.h<Object>[] hVarArr = AlarmListFragment.f10762x0;
                    sm.t0 t0Var = alarmListFragment.i1().f22394e;
                    C0154a c0154a = new C0154a(this.f10774f);
                    this.f10773e = 1;
                    if (t0Var.a(c0154a, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.alarm.AlarmListFragment$onViewCreated$6$2", f = "AlarmListFragment.kt", l = {114}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f10776e;

            /* renamed from: f */
            public final /* synthetic */ AlarmListFragment f10777f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ AlarmListFragment f10778a;

                public a(AlarmListFragment alarmListFragment) {
                    this.f10778a = alarmListFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    th.d dVar2 = (th.d) obj;
                    if (dVar2 instanceof d.e) {
                        AlarmListFragment alarmListFragment = this.f10778a;
                        mm.h<Object>[] hVarArr = AlarmListFragment.f10762x0;
                        qi.p.f(alarmListFragment.f1(), ((d.e) dVar2).f28185a);
                    } else if (dVar2 instanceof d.a) {
                        k kVar = this.f10778a.f10765v0;
                        if (kVar != null) {
                            kVar.f2947a.e(((d.a) dVar2).f28180a, 1);
                        } else {
                            l.l("adapter");
                            throw null;
                        }
                    } else if (dVar2 instanceof d.c) {
                        k kVar2 = this.f10778a.f10765v0;
                        if (kVar2 != null) {
                            kVar2.f2947a.f(((d.c) dVar2).f28183a, 1);
                        } else {
                            l.l("adapter");
                            throw null;
                        }
                    } else if (dVar2 instanceof d.b) {
                        k kVar3 = this.f10778a.f10765v0;
                        if (kVar3 != null) {
                            d.b bVar = (d.b) dVar2;
                            kVar3.i(bVar.f28181a, bVar.f28182b);
                        } else {
                            l.l("adapter");
                            throw null;
                        }
                    } else if (dVar2 instanceof d.C0503d) {
                        AlarmListFragment alarmListFragment2 = this.f10778a;
                        mm.h<Object>[] hVarArr2 = AlarmListFragment.f10762x0;
                        alarmListFragment2.d1();
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AlarmListFragment alarmListFragment, xl.d<? super b> dVar) {
                super(2, dVar);
                this.f10777f = alarmListFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new b(this.f10777f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10776e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    AlarmListFragment alarmListFragment = this.f10777f;
                    mm.h<Object>[] hVarArr = AlarmListFragment.f10762x0;
                    sm.c cVar = alarmListFragment.i1().f22396g;
                    a aVar2 = new a(this.f10777f);
                    this.f10776e = 1;
                    if (cVar.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(2, dVar);
            AlarmListFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((e) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f10771e = obj;
            return eVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f10771e;
            z0.g(e0Var, null, 0, new a(AlarmListFragment.this, null), 3);
            z0.g(e0Var, null, 0, new b(AlarmListFragment.this, null), 3);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends gm.m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f10779b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(j jVar) {
            super(0);
            this.f10779b = jVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f10779b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f10780b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(tl.d dVar) {
            super(0);
            this.f10780b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f10780b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f10781b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(tl.d dVar) {
            super(0);
            this.f10781b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f10781b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f10782b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f10783c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(r rVar, tl.d dVar) {
            super(0);
            this.f10782b = rVar;
            this.f10783c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f10783c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f10782b.r();
            }
            l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends gm.m implements fm.a<y0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j() {
            super(0);
            AlarmListFragment.this = r1;
        }

        @Override // fm.a
        public final y0 m() {
            return AlarmListFragment.this.W0();
        }
    }

    static {
        gm.t tVar = new gm.t(AlarmListFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentAlarmListBinding;", 0);
        gm.b0.f15488a.getClass();
        f10762x0 = new mm.h[]{tVar};
    }

    public AlarmListFragment() {
        super(R.layout.fragment_alarm_list);
        this.f10763t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentAlarmListBinding.class, this);
        tl.d a10 = fb.e.a(new f(new j()));
        this.f10764u0 = ab.b.f(this, gm.b0.a(AlarmViewModel.class), new g(a10), new h(a10), new i(this, a10));
        this.f10766w0 = new a();
    }

    @Override // androidx.fragment.app.r
    public final void E0() {
        this.E = true;
        k kVar = this.f10765v0;
        if (kVar != null) {
            kVar.x(this.f10766w0);
        } else {
            l.l("adapter");
            throw null;
        }
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        l.f(view, "view");
        super.O0(view, bundle);
        h1().toolbar.setNavigationOnClickListener(new n6.e(2, this));
        T0().f705h.a(q0(), new b());
        RecyclerView recyclerView = h1().recyclerView;
        V0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        h1().recyclerView.g(new oi.a(V0()));
        h1().recyclerView.f2897q.add(new SwipeItemLayout.b(V0()));
        k kVar = new k(i1().f10786i);
        this.f10765v0 = kVar;
        kVar.f28203e = new c();
        kVar.u(this.f10766w0);
        RecyclerView recyclerView2 = h1().recyclerView;
        k kVar2 = this.f10765v0;
        if (kVar2 != null) {
            recyclerView2.setAdapter(kVar2);
            h1().loadingView.setListener(new s.i(7, this));
            LoadingView loadingView = h1().loadingView;
            RecyclerView recyclerView3 = h1().recyclerView;
            l.e(recyclerView3, "viewBind.recyclerView");
            loadingView.setAssociateViews(new View[]{recyclerView3});
            h1().fabAdd.setOnClickListener(new th.l(0, this));
            qi.h.k(qi.h.i(this), new e(null));
            return;
        }
        l.l("adapter");
        throw null;
    }

    public final FragmentAlarmListBinding h1() {
        return (FragmentAlarmListBinding) this.f10763t0.a(this, f10762x0[0]);
    }

    public final AlarmViewModel i1() {
        return (AlarmViewModel) this.f10764u0.getValue();
    }

    public final void j1() {
        if (i1().f10787j.c()) {
            d1();
        } else {
            new z().h1(h0(), null);
        }
    }
}
