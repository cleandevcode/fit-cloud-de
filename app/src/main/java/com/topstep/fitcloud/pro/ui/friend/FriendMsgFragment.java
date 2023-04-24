package com.topstep.fitcloud.pro.ui.friend;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.r;
import androidx.fragment.app.x;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.topstep.fitcloud.pro.databinding.FragmentFriendMsgBinding;
import com.topstep.fitcloud.pro.model.friend.FriendMsg;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import com.topstep.fitcloudpro.R;
import d2.a;
import ei.e0;
import ei.f0;
import ei.g1;
import ei.i0;
import fi.c;
import fm.p;
import gm.b0;
import gm.t;
import java.util.List;
import kotlin.Metadata;
import mf.a0;
import pm.z1;
import u6.z;
import v6.a;

@Metadata
/* loaded from: classes2.dex */
public final class FriendMsgFragment extends g1 implements v6.a {

    /* renamed from: x0 */
    public static final /* synthetic */ mm.h<Object>[] f11598x0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11599t0;

    /* renamed from: u0 */
    public final t0 f11600u0;

    /* renamed from: v0 */
    public final fi.c f11601v0;

    /* renamed from: w0 */
    public final t0 f11602w0;

    /* loaded from: classes2.dex */
    public static final class a implements c.b {
        public a() {
            FriendMsgFragment.this = r1;
        }

        @Override // fi.c.b
        public final void a(int i10, FriendMsg friendMsg) {
            gm.l.f(friendMsg, "item");
            FriendMsgFragment friendMsgFragment = FriendMsgFragment.this;
            mm.h<Object>[] hVarArr = FriendMsgFragment.f11598x0;
            FriendMsgVieModel i12 = friendMsgFragment.i1();
            long j10 = friendMsg.f9675a;
            i12.getClass();
            v6.b.f(i12, new e0(false, i12, j10, null), null, new f0(i10), 3);
        }

        @Override // fi.c.b
        public final void b(int i10, FriendMsg friendMsg) {
            gm.l.f(friendMsg, "item");
            FriendMsgFragment friendMsgFragment = FriendMsgFragment.this;
            mm.h<Object>[] hVarArr = FriendMsgFragment.f11598x0;
            FriendMsgVieModel i12 = friendMsgFragment.i1();
            long j10 = friendMsg.f9675a;
            i12.getClass();
            v6.b.f(i12, new e0(true, i12, j10, null), null, new f0(i10), 3);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendMsgFragment$onViewCreated$4", f = "FriendMsgFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11605e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(2, dVar);
            FriendMsgFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((c) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f11605e = obj;
            return cVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            FriendMsgFragment friendMsgFragment = FriendMsgFragment.this;
            mm.h<Object>[] hVarArr = FriendMsgFragment.f11598x0;
            qi.p.f(friendMsgFragment.f1(), (Throwable) this.f11605e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendMsgFragment$onViewCreated$5", f = "FriendMsgFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements p<Boolean, xl.d<? super tl.l>, Object> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            FriendMsgFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Boolean bool, xl.d<? super tl.l> dVar) {
            return ((d) p(Boolean.valueOf(bool.booleanValue()), dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new d(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            ((FriendViewModel) FriendMsgFragment.this.f11602w0.getValue()).j();
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendMsgFragment$onViewCreated$7", f = "FriendMsgFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends zl.i implements p<u6.a<? extends List<? extends FriendMsg>>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11609e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(2, dVar);
            FriendMsgFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(u6.a<? extends List<? extends FriendMsg>> aVar, xl.d<? super tl.l> dVar) {
            return ((f) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            f fVar = new f(dVar);
            fVar.f11609e = obj;
            return fVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            u6.a aVar = (u6.a) this.f11609e;
            if (aVar instanceof u6.l) {
                FriendMsgFragment friendMsgFragment = FriendMsgFragment.this;
                mm.h<Object>[] hVarArr = FriendMsgFragment.f11598x0;
                friendMsgFragment.h1().loadingView.c();
                FriendMsgFragment.this.h1().recyclerView.setVisibility(8);
            } else if (aVar instanceof u6.g) {
                FriendMsgFragment friendMsgFragment2 = FriendMsgFragment.this;
                mm.h<Object>[] hVarArr2 = FriendMsgFragment.f11598x0;
                friendMsgFragment2.h1().loadingView.a(R.string.tip_load_error);
            } else if (aVar instanceof u6.a0) {
                List<FriendMsg> list = (List) aVar.a();
                FriendMsgFragment friendMsgFragment3 = FriendMsgFragment.this;
                mm.h<Object>[] hVarArr3 = FriendMsgFragment.f11598x0;
                friendMsgFragment3.h1().loadingView.setVisibility(8);
                if (list != null && !list.isEmpty()) {
                    FriendMsgFragment.this.h1().recyclerView.setVisibility(0);
                } else {
                    FriendMsgFragment.this.h1().loadingView.b(R.string.tip_current_no_data);
                }
                fi.c cVar = FriendMsgFragment.this.f11601v0;
                cVar.f14285e = list;
                cVar.h();
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendMsgFragment$onViewCreated$8", f = "FriendMsgFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends zl.i implements p<i0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11611e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(xl.d<? super g> dVar) {
            super(2, dVar);
            FriendMsgFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(i0 i0Var, xl.d<? super tl.l> dVar) {
            return ((g) p(i0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            g gVar = new g(dVar);
            gVar.f11611e = obj;
            return gVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            u6.a<Boolean> aVar = ((i0) this.f11611e).f13752b;
            FriendMsgFragment friendMsgFragment = FriendMsgFragment.this;
            mm.h<Object>[] hVarArr = FriendMsgFragment.f11598x0;
            qi.p.a(aVar, friendMsgFragment.e1());
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends gm.m implements fm.a<i2.j> {

        /* renamed from: b */
        public final /* synthetic */ r f11613b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(r rVar) {
            super(0);
            this.f11613b = rVar;
        }

        @Override // fm.a
        public final i2.j m() {
            return tb.a.f(this.f11613b).f(R.id.friend_nav_graph);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11614b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(tl.i iVar) {
            super(0);
            this.f11614b = iVar;
        }

        @Override // fm.a
        public final x0 m() {
            i2.j jVar = (i2.j) this.f11614b.getValue();
            gm.l.e(jVar, "backStackEntry");
            x0 z10 = jVar.z();
            gm.l.e(z10, "backStackEntry.viewModelStore");
            return z10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f11615b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11616c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(r rVar, tl.i iVar) {
            super(0);
            this.f11615b = rVar;
            this.f11616c = iVar;
        }

        @Override // fm.a
        public final v0.b m() {
            x T0 = this.f11615b.T0();
            i2.j jVar = (i2.j) this.f11616c.getValue();
            gm.l.e(jVar, "backStackEntry");
            return p.b.i(T0, jVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends gm.m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f11617b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(r rVar) {
            super(0);
            this.f11617b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f11617b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends gm.m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f11618b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f11618b = kVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f11618b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11619b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(tl.d dVar) {
            super(0);
            this.f11619b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f11619b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11620b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(tl.d dVar) {
            super(0);
            this.f11620b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f11620b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f11621b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11622c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(r rVar, tl.d dVar) {
            super(0);
            this.f11621b = rVar;
            this.f11622c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f11622c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f11621b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(FriendMsgFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentFriendMsgBinding;", 0);
        b0.f15488a.getClass();
        f11598x0 = new mm.h[]{tVar};
    }

    public FriendMsgFragment() {
        super(R.layout.fragment_friend_msg);
        this.f11599t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentFriendMsgBinding.class, this);
        tl.d a10 = fb.e.a(new l(new k(this)));
        this.f11600u0 = ab.b.f(this, b0.a(FriendMsgVieModel.class), new m(a10), new n(a10), new o(this, a10));
        this.f11601v0 = new fi.c();
        tl.i iVar = new tl.i(new h(this));
        this.f11602w0 = ab.b.e(this, b0.a(FriendViewModel.class), new i(iVar), new j(this, iVar));
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        RecyclerView recyclerView = h1().recyclerView;
        V0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        h1().recyclerView.g(new oi.a(V0()));
        h1().recyclerView.setAdapter(this.f11601v0);
        this.f11601v0.f14286f = new a();
        h1().loadingView.setListener(new s.i(13, this));
        a.C0526a.b(this, i1(), new t() { // from class: com.topstep.fitcloud.pro.ui.friend.FriendMsgFragment.b
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((i0) obj).f13752b;
            }
        }, v6.b.i(i1()), new c(null), new d(null));
        e(i1(), new t() { // from class: com.topstep.fitcloud.pro.ui.friend.FriendMsgFragment.e
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((i0) obj).f13751a;
            }
        }, z.f28636a, new f(null));
        G(i1(), z.f28636a, new g(null));
    }

    @Override // v6.a
    public final u a() {
        return a.C0526a.a(this);
    }

    @Override // v6.a
    public final z1 e(v6.b bVar, t tVar, u6.f fVar, p pVar) {
        return a.C0526a.e(this, bVar, tVar, fVar, pVar);
    }

    public final FragmentFriendMsgBinding h1() {
        return (FragmentFriendMsgBinding) this.f11599t0.a(this, f11598x0[0]);
    }

    public final FriendMsgVieModel i1() {
        return (FriendMsgVieModel) this.f11600u0.getValue();
    }

    @Override // v6.a
    public final z1 k(EcgHealthReportViewModel ecgHealthReportViewModel, u6.f fVar, EcgHealthReportActivity.i iVar) {
        return a.C0526a.d(this, ecgHealthReportViewModel, EcgHealthReportActivity.g.f10707g, EcgHealthReportActivity.h.f10708g, fVar, iVar);
    }

    @Override // v6.a
    public final z1 n(v6.b bVar, t tVar, u6.f fVar, p pVar, p pVar2) {
        return a.C0526a.b(this, bVar, tVar, fVar, pVar, pVar2);
    }
}
