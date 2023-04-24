package com.topstep.fitcloud.pro.ui.sport;

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
import com.topstep.fitcloud.pro.databinding.FragmentSportHistoryBinding;
import com.topstep.fitcloudpro.R;
import d2.a;
import fm.p;
import gm.b0;
import gm.m;
import gm.t;
import kg.g;
import kotlin.Metadata;
import l2.b2;
import l2.e2;
import l2.h2;
import l2.n0;
import l2.u;
import mf.a0;
import mi.k;
import mi.w;
import mi.x;
import mm.h;
import pm.e0;
import s.q0;
import sm.j0;
import sm.s0;
import tl.l;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class SportHistoryFragment extends k {

    /* renamed from: x0 */
    public static final /* synthetic */ h<Object>[] f12159x0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f12160t0;

    /* renamed from: u0 */
    public final t0 f12161u0;

    /* renamed from: v0 */
    public w f12162v0;

    /* renamed from: w0 */
    public g f12163w0;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.sport.SportHistoryFragment$onViewCreated$1", f = "SportHistoryFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f12164e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.sport.SportHistoryFragment$onViewCreated$1$1", f = "SportHistoryFragment.kt", l = {51}, m = "invokeSuspend")
        /* renamed from: com.topstep.fitcloud.pro.ui.sport.SportHistoryFragment$a$a */
        /* loaded from: classes2.dex */
        public static final class C0206a extends i implements p<e0, xl.d<? super l>, Object> {

            /* renamed from: e */
            public int f12166e;

            /* renamed from: f */
            public final /* synthetic */ SportHistoryFragment f12167f;

            /* renamed from: com.topstep.fitcloud.pro.ui.sport.SportHistoryFragment$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C0207a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ SportHistoryFragment f12168a;

                public C0207a(SportHistoryFragment sportHistoryFragment) {
                    this.f12168a = sportHistoryFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    b2 b2Var = (b2) obj;
                    w wVar = this.f12168a.f12162v0;
                    if (wVar != null) {
                        l2.g<T> gVar = wVar.f18885e;
                        gVar.f18893g.incrementAndGet();
                        l2.e eVar = gVar.f18892f;
                        Object a10 = eVar.f19025g.a(0, new h2(eVar, b2Var, null), dVar);
                        yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                        if (a10 != aVar) {
                            a10 = l.f28297a;
                        }
                        if (a10 != aVar) {
                            a10 = l.f28297a;
                        }
                        if (a10 != aVar) {
                            a10 = l.f28297a;
                        }
                        if (a10 != aVar) {
                            return l.f28297a;
                        }
                        return a10;
                    }
                    gm.l.l("pagingAdapter");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0206a(SportHistoryFragment sportHistoryFragment, xl.d<? super C0206a> dVar) {
                super(2, dVar);
                this.f12167f = sportHistoryFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super l> dVar) {
                return ((C0206a) p(e0Var, dVar)).t(l.f28297a);
            }

            @Override // zl.a
            public final xl.d<l> p(Object obj, xl.d<?> dVar) {
                return new C0206a(this.f12167f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f12166e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    s0 s0Var = ((SportHistoryViewModel) this.f12167f.f12161u0.getValue()).f12179e;
                    C0207a c0207a = new C0207a(this.f12167f);
                    this.f12166e = 1;
                    if (s0Var.a(c0207a, this) == aVar) {
                        return aVar;
                    }
                }
                return l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.sport.SportHistoryFragment$onViewCreated$1$2", f = "SportHistoryFragment.kt", l = {56}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends i implements p<e0, xl.d<? super l>, Object> {

            /* renamed from: e */
            public int f12169e;

            /* renamed from: f */
            public final /* synthetic */ SportHistoryFragment f12170f;

            /* renamed from: com.topstep.fitcloud.pro.ui.sport.SportHistoryFragment$a$b$a */
            /* loaded from: classes2.dex */
            public static final class C0208a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ SportHistoryFragment f12171a;

                public C0208a(SportHistoryFragment sportHistoryFragment) {
                    this.f12171a = sportHistoryFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    n0 n0Var = ((u) obj).f19269a;
                    SportHistoryFragment sportHistoryFragment = this.f12171a;
                    h<Object>[] hVarArr = SportHistoryFragment.f12159x0;
                    sportHistoryFragment.h1().refreshLayout.setRefreshing(n0Var instanceof n0.b);
                    if (n0Var instanceof n0.a) {
                        Throwable th2 = ((n0.a) n0Var).f19106b;
                        if (!gm.l.a(th2, ((SportHistoryViewModel) this.f12171a.f12161u0.getValue()).f12180f)) {
                            ((SportHistoryViewModel) this.f12171a.f12161u0.getValue()).f12180f = th2;
                            qi.p.f(this.f12171a.f1(), th2);
                        }
                    }
                    return l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SportHistoryFragment sportHistoryFragment, xl.d<? super b> dVar) {
                super(2, dVar);
                this.f12170f = sportHistoryFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super l> dVar) {
                return ((b) p(e0Var, dVar)).t(l.f28297a);
            }

            @Override // zl.a
            public final xl.d<l> p(Object obj, xl.d<?> dVar) {
                return new b(this.f12170f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f12169e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    SportHistoryFragment sportHistoryFragment = this.f12170f;
                    w wVar = sportHistoryFragment.f12162v0;
                    if (wVar != null) {
                        j0 j0Var = wVar.f18886f;
                        C0208a c0208a = new C0208a(sportHistoryFragment);
                        this.f12169e = 1;
                        if (j0Var.a(c0208a, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        gm.l.l("pagingAdapter");
                        throw null;
                    }
                }
                return l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(2, dVar);
            SportHistoryFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            return ((a) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f12164e = obj;
            return aVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f12164e;
            z0.g(e0Var, null, 0, new C0206a(SportHistoryFragment.this, null), 3);
            z0.g(e0Var, null, 0, new b(SportHistoryFragment.this, null), 3);
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f12172b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r rVar) {
            super(0);
            this.f12172b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f12172b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f12173b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.f12173b = bVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f12173b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f12174b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(tl.d dVar) {
            super(0);
            this.f12174b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f12174b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f12175b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(tl.d dVar) {
            super(0);
            this.f12175b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f12175b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f12176b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f12177c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(r rVar, tl.d dVar) {
            super(0);
            this.f12176b = rVar;
            this.f12177c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f12177c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f12176b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(SportHistoryFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentSportHistoryBinding;", 0);
        b0.f15488a.getClass();
        f12159x0 = new h[]{tVar};
    }

    public SportHistoryFragment() {
        super(R.layout.fragment_sport_history);
        this.f12160t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentSportHistoryBinding.class, this);
        tl.d a10 = fb.e.a(new c(new b(this)));
        this.f12161u0 = ab.b.f(this, b0.a(SportHistoryViewModel.class), new d(a10), new e(a10), new f(this, a10));
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        x xVar = new x();
        g gVar = this.f12163w0;
        if (gVar != null) {
            this.f12162v0 = new w(xVar, ((uf.b) gVar.a().getValue()).a());
            RecyclerView recyclerView = h1().recyclerView;
            V0();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            RecyclerView recyclerView2 = h1().recyclerView;
            w wVar = this.f12162v0;
            if (wVar != null) {
                ri.b bVar = new ri.b(wVar);
                wVar.z(new e2(bVar));
                recyclerView2.setAdapter(new androidx.recyclerview.widget.f(wVar, bVar));
                qi.h.k(qi.h.i(this), new a(null));
                h1().refreshLayout.setOnRefreshListener(new q0(16, this));
                return;
            }
            gm.l.l("pagingAdapter");
            throw null;
        }
        gm.l.l("unitConfigRepository");
        throw null;
    }

    public final FragmentSportHistoryBinding h1() {
        return (FragmentSportHistoryBinding) this.f12160t0.a(this, f12159x0[0]);
    }
}
