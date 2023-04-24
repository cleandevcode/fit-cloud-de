package yh;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.r;
import androidx.fragment.app.x;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi.z0;
import com.topstep.fitcloud.pro.databinding.FragmentDialPacketListBinding;
import com.topstep.fitcloud.pro.model.dial.DialPacket;
import com.topstep.fitcloud.pro.model.dial.DialPushParams;
import com.topstep.fitcloud.pro.ui.device.dial.DialPushViewModel;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloudpro.R;
import d2.a;
import fm.p;
import gm.b0;
import gm.t;
import ih.v;
import kotlin.Metadata;
import mf.a0;
import nh.c;
import og.x0;
import pm.e0;
import s.h1;
import s.i0;
import y3.c1;
import y3.d1;
import yh.d;
import yh.g;

@Metadata
/* loaded from: classes2.dex */
public final class e extends yh.m {
    public static final a A0;
    public static final /* synthetic */ mm.h<Object>[] B0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f31715t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentDialPacketListBinding.class, this);

    /* renamed from: u0 */
    public final t0 f31716u0;

    /* renamed from: v0 */
    public g.b f31717v0;

    /* renamed from: w0 */
    public final tl.i f31718w0;

    /* renamed from: x0 */
    public final t0 f31719x0;

    /* renamed from: y0 */
    public yh.d f31720y0;

    /* renamed from: z0 */
    public final b f31721z0;

    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.g {
        public b() {
            e.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i10, int i11) {
            yh.d dVar = e.this.f31720y0;
            if (dVar != null) {
                if (dVar.e() <= 0) {
                    e.this.h1().loadingView.a(R.string.tip_current_no_data);
                    return;
                }
                return;
            }
            gm.l.l("adapter");
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gm.m implements fm.a<Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(0);
            e.this = r1;
        }

        @Override // fm.a
        public final Boolean m() {
            return Boolean.valueOf(e.this.U0().getBoolean("is_local"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements d.c {
        public d() {
            e.this = r1;
        }

        @Override // yh.d.c
        public final void a() {
            v.l(tb.a.f(e.this.W0()), new i2.a(R.id.toDialCustom));
        }

        @Override // yh.d.c
        public final void b(DialPacket dialPacket) {
            gm.l.f(dialPacket, "packet");
            DialPushParams dialPushParams = (DialPushParams) ((DialPushViewModel) e.this.f31716u0.getValue()).e().f22382a.a();
            if (dialPushParams != null) {
                yh.g i12 = e.this.i1();
                String projectNum = dialPushParams.getProjectNum();
                int dialNum = dialPacket.getDialNum();
                i12.getClass();
                gm.l.f(projectNum, "projectNum");
                z0.g(rm.l.h(i12), null, 0, new yh.j(i12, projectNum, dialNum, null), 3);
            }
        }

        @Override // yh.d.c
        public final void c(DialPacket dialPacket) {
            gm.l.f(dialPacket, "packet");
            if (x0.b(((DialPushViewModel) e.this.f31716u0.getValue()).f10917h)) {
                DialPushParams dialPushParams = (DialPushParams) ((DialPushViewModel) e.this.f31716u0.getValue()).e().f22382a.a();
                if (dialPushParams != null) {
                    e eVar = e.this;
                    yh.a aVar = new yh.a();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("dial_packet", dialPacket);
                    bundle.putParcelable("push_params", dialPushParams);
                    aVar.Z0(bundle);
                    aVar.h1(eVar.h0(), null);
                    return;
                }
                return;
            }
            d7.e.f(e.this.f1(), R.string.device_state_disconnected);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.DialPacketListFragment$onViewCreated$3", f = "DialPacketListFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: yh.e$e */
    /* loaded from: classes2.dex */
    public static final class C0597e extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f31725e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.DialPacketListFragment$onViewCreated$3$1", f = "DialPacketListFragment.kt", l = {105}, m = "invokeSuspend")
        /* renamed from: yh.e$e$a */
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f31727e;

            /* renamed from: f */
            public final /* synthetic */ e f31728f;

            /* renamed from: yh.e$e$a$a */
            /* loaded from: classes2.dex */
            public static final class C0598a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ e f31729a;

                public C0598a(e eVar) {
                    this.f31729a = eVar;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    boolean z10;
                    boolean isSupportCustom;
                    LoadingView loadingView;
                    int i10;
                    y3.b<T> bVar = ((nh.d) obj).f22382a;
                    if (gm.l.a(bVar, d1.f30940b)) {
                        z10 = true;
                    } else {
                        z10 = bVar instanceof y3.p;
                    }
                    if (z10) {
                        e eVar = this.f31729a;
                        a aVar = e.A0;
                        eVar.h1().loadingView.c();
                        yh.d dVar2 = this.f31729a.f31720y0;
                        if (dVar2 != null) {
                            dVar2.f31706h = null;
                            dVar2.h();
                        } else {
                            gm.l.l("adapter");
                            throw null;
                        }
                    } else {
                        if (bVar instanceof y3.j) {
                            if (((y3.j) bVar).f30961b instanceof ig.e) {
                                e eVar2 = this.f31729a;
                                a aVar2 = e.A0;
                                loadingView = eVar2.h1().loadingView;
                                i10 = R.string.ds_dial_error_shape;
                            } else {
                                e eVar3 = this.f31729a;
                                a aVar3 = e.A0;
                                loadingView = eVar3.h1().loadingView;
                                i10 = R.string.tip_load_error;
                            }
                        } else if (bVar instanceof c1) {
                            o oVar = (o) ((c1) bVar).f30937b;
                            e eVar4 = this.f31729a;
                            yh.d dVar3 = eVar4.f31720y0;
                            if (dVar3 != null) {
                                if (eVar4.j1()) {
                                    isSupportCustom = false;
                                } else {
                                    isSupportCustom = oVar.f31768a.isSupportCustom();
                                }
                                dVar3.f31702d = isSupportCustom;
                                yh.d dVar4 = this.f31729a.f31720y0;
                                if (dVar4 != null) {
                                    sj.e shape = oVar.f31768a.getShape();
                                    gm.l.f(shape, "<set-?>");
                                    dVar4.f31704f = shape;
                                    yh.d dVar5 = this.f31729a.f31720y0;
                                    if (dVar5 != null) {
                                        dVar5.f31706h = oVar.f31769b;
                                        dVar5.h();
                                        yh.d dVar6 = this.f31729a.f31720y0;
                                        if (dVar6 != null) {
                                            if (dVar6.e() <= 0) {
                                                loadingView = this.f31729a.h1().loadingView;
                                                i10 = R.string.tip_current_no_data;
                                            } else {
                                                this.f31729a.h1().loadingView.setVisibility(8);
                                            }
                                        } else {
                                            gm.l.l("adapter");
                                            throw null;
                                        }
                                    } else {
                                        gm.l.l("adapter");
                                        throw null;
                                    }
                                } else {
                                    gm.l.l("adapter");
                                    throw null;
                                }
                            } else {
                                gm.l.l("adapter");
                                throw null;
                            }
                        }
                        loadingView.a(i10);
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f31728f = eVar;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f31728f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f31727e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    e eVar = this.f31728f;
                    a aVar2 = e.A0;
                    sm.t0 t0Var = eVar.i1().f22394e;
                    C0598a c0598a = new C0598a(this.f31728f);
                    this.f31727e = 1;
                    if (t0Var.a(c0598a, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.push.DialPacketListFragment$onViewCreated$3$2", f = "DialPacketListFragment.kt", l = {142}, m = "invokeSuspend")
        /* renamed from: yh.e$e$b */
        /* loaded from: classes2.dex */
        public static final class b extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f31730e;

            /* renamed from: f */
            public final /* synthetic */ e f31731f;

            /* renamed from: yh.e$e$b$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ e f31732a;

                public a(e eVar) {
                    this.f31732a = eVar;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    nh.c cVar = (nh.c) obj;
                    if (cVar instanceof c.a) {
                        e eVar = this.f31732a;
                        a aVar = e.A0;
                        qi.p.f(eVar.f1(), ((c.a) cVar).f22380a);
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(e eVar, xl.d<? super b> dVar) {
                super(2, dVar);
                this.f31731f = eVar;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new b(this.f31731f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f31730e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    e eVar = this.f31731f;
                    a aVar2 = e.A0;
                    sm.c cVar = eVar.i1().f22396g;
                    a aVar3 = new a(this.f31731f);
                    this.f31730e = 1;
                    if (cVar.a(aVar3, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0597e(xl.d<? super C0597e> dVar) {
            super(2, dVar);
            e.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((C0597e) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            C0597e c0597e = new C0597e(dVar);
            c0597e.f31725e = obj;
            return c0597e;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f31725e;
            z0.g(e0Var, null, 0, new a(e.this, null), 3);
            z0.g(e0Var, null, 0, new b(e.this, null), 3);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends gm.m implements fm.a<i2.j> {

        /* renamed from: b */
        public final /* synthetic */ r f31733b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(r rVar) {
            super(0);
            this.f31733b = rVar;
        }

        @Override // fm.a
        public final i2.j m() {
            return tb.a.f(this.f31733b).f(R.id.dial_push_nav_graph);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends gm.m implements fm.a<androidx.lifecycle.x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f31734b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(tl.i iVar) {
            super(0);
            this.f31734b = iVar;
        }

        @Override // fm.a
        public final androidx.lifecycle.x0 m() {
            i2.j jVar = (i2.j) this.f31734b.getValue();
            gm.l.e(jVar, "backStackEntry");
            androidx.lifecycle.x0 z10 = jVar.z();
            gm.l.e(z10, "backStackEntry.viewModelStore");
            return z10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f31735b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f31736c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(r rVar, tl.i iVar) {
            super(0);
            this.f31735b = rVar;
            this.f31736c = iVar;
        }

        @Override // fm.a
        public final v0.b m() {
            x T0 = this.f31735b.T0();
            i2.j jVar = (i2.j) this.f31736c.getValue();
            gm.l.e(jVar, "backStackEntry");
            return p.b.i(T0, jVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends gm.m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f31737b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(r rVar) {
            super(0);
            this.f31737b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f31737b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends gm.m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f31738b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f31738b = iVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f31738b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends gm.m implements fm.a<androidx.lifecycle.x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f31739b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(tl.d dVar) {
            super(0);
            this.f31739b = dVar;
        }

        @Override // fm.a
        public final androidx.lifecycle.x0 m() {
            return ih.b.a(this.f31739b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f31740b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(tl.d dVar) {
            super(0);
            this.f31740b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f31740b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends gm.m implements fm.a<v0.b> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m() {
            super(0);
            e.this = r1;
        }

        @Override // fm.a
        public final v0.b m() {
            e eVar = e.this;
            g.b bVar = eVar.f31717v0;
            if (bVar != null) {
                DialPushViewModel dialPushViewModel = (DialPushViewModel) eVar.f31716u0.getValue();
                boolean j12 = e.this.j1();
                gm.l.f(dialPushViewModel, "dialPushViewModel");
                return new yh.h(bVar, dialPushViewModel, j12);
            }
            gm.l.l("customFactory");
            throw null;
        }
    }

    static {
        t tVar = new t(e.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentDialPacketListBinding;", 0);
        b0.f15488a.getClass();
        B0 = new mm.h[]{tVar};
        A0 = new a();
    }

    public e() {
        tl.i iVar = new tl.i(new f(this));
        this.f31716u0 = ab.b.e(this, b0.a(DialPushViewModel.class), new g(iVar), new h(this, iVar));
        this.f31718w0 = new tl.i(new c());
        m mVar = new m();
        tl.d a10 = fb.e.a(new j(new i(this)));
        this.f31719x0 = ab.b.f(this, b0.a(yh.g.class), new k(a10), new l(a10), mVar);
        this.f31721z0 = new b();
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        this.f31720y0 = new yh.d(!j1(), j1());
    }

    @Override // androidx.fragment.app.r
    public final void E0() {
        this.E = true;
        yh.d dVar = this.f31720y0;
        if (dVar != null) {
            dVar.x(this.f31721z0);
        } else {
            gm.l.l("adapter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.r
    public final void K0() {
        this.E = true;
        if (j1()) {
            i1().i();
        }
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        int p10 = h1.p(V0(), 3);
        RecyclerView recyclerView = h1().recyclerView;
        V0();
        recyclerView.setLayoutManager(new GridLayoutManager(p10));
        h1().recyclerView.g(new oi.b(p10, g7.a.a(V0(), 8.0f)));
        yh.d dVar = this.f31720y0;
        if (dVar != null) {
            dVar.f31705g = new d();
            RecyclerView recyclerView2 = h1().recyclerView;
            yh.d dVar2 = this.f31720y0;
            if (dVar2 != null) {
                recyclerView2.setAdapter(dVar2);
                yh.d dVar3 = this.f31720y0;
                if (dVar3 != null) {
                    dVar3.u(this.f31721z0);
                    h1().loadingView.setListener(new i0(8, this));
                    qi.h.k(qi.h.i(this), new C0597e(null));
                    return;
                }
                gm.l.l("adapter");
                throw null;
            }
            gm.l.l("adapter");
            throw null;
        }
        gm.l.l("adapter");
        throw null;
    }

    public final FragmentDialPacketListBinding h1() {
        return (FragmentDialPacketListBinding) this.f31715t0.a(this, B0[0]);
    }

    public final yh.g i1() {
        return (yh.g) this.f31719x0.getValue();
    }

    public final boolean j1() {
        return ((Boolean) this.f31718w0.getValue()).booleanValue();
    }
}
