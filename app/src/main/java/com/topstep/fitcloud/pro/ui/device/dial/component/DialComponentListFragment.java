package com.topstep.fitcloud.pro.ui.device.dial.component;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi.m0;
import com.topstep.fitcloud.pro.databinding.FragmentDialComponentListBinding;
import com.topstep.fitcloud.pro.model.dial.DialPushParams;
import com.topstep.fitcloud.pro.model.dial.DialSpacePacket;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloudpro.R;
import fm.p;
import gm.t;
import i2.b0;
import i2.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import lh.i;
import mf.a0;
import mm.h;
import pm.e0;
import pm.r;
import pm.z1;
import s.h1;
import tl.l;
import ul.q;
import xh.c;
import xh.i;
import xh.j;
import xh.n;
import y3.c0;
import y3.c1;
import y3.d1;
import y3.e1;
import y3.g0;
import y3.g1;
import y3.k0;
import y3.o;
import y3.v;
import y3.z0;
import yb.y;

@Metadata
/* loaded from: classes2.dex */
public final class DialComponentListFragment extends i implements g0 {

    /* renamed from: r0 */
    public static final /* synthetic */ h<Object>[] f10952r0;

    /* renamed from: o0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10953o0;

    /* renamed from: p0 */
    public final tl.d f10954p0;

    /* renamed from: q0 */
    public xh.c f10955q0;

    /* loaded from: classes2.dex */
    public static final class a implements c.b {

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.component.DialComponentListFragment$onViewCreated$2$onEditClick$1", f = "DialComponentListFragment.kt", l = {52}, m = "invokeSuspend")
        /* renamed from: com.topstep.fitcloud.pro.ui.device.dial.component.DialComponentListFragment$a$a */
        /* loaded from: classes2.dex */
        public static final class C0162a extends zl.i implements p<e0, xl.d<? super l>, Object> {

            /* renamed from: e */
            public int f10957e;

            /* renamed from: f */
            public final /* synthetic */ DialComponentListFragment f10958f;

            /* renamed from: g */
            public final /* synthetic */ int f10959g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0162a(DialComponentListFragment dialComponentListFragment, int i10, xl.d<? super C0162a> dVar) {
                super(2, dVar);
                this.f10958f = dialComponentListFragment;
                this.f10959g = i10;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super l> dVar) {
                return ((C0162a) p(e0Var, dVar)).t(l.f28297a);
            }

            @Override // zl.a
            public final xl.d<l> p(Object obj, xl.d<?> dVar) {
                return new C0162a(this.f10958f, this.f10959g, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f10957e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    DialComponentListFragment dialComponentListFragment = this.f10958f;
                    h<Object>[] hVarArr = DialComponentListFragment.f10952r0;
                    xh.i h12 = dialComponentListFragment.h1();
                    this.f10957e = 1;
                    j jVar = j.f30575b;
                    k0<S>.b bVar = h12.f30971c;
                    bVar.getClass();
                    bVar.a(jVar);
                    k0<S>.b bVar2 = h12.f30971c;
                    bVar2.getClass();
                    r a10 = m0.a();
                    bVar2.f31078c.b(new v(a10));
                    Object x02 = a10.x0(this);
                    if (x02 != aVar) {
                        x02 = l.f28297a;
                    }
                    if (x02 == aVar) {
                        return aVar;
                    }
                }
                m f10 = tb.a.f(this.f10958f);
                int i11 = this.f10959g;
                b0 a11 = ih.v.d().a();
                try {
                    Bundle bundle = new Bundle();
                    bundle.putInt("position", i11);
                    f10.l(R.id.toEdit, bundle, a11);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                return l.f28297a;
            }
        }

        public a() {
            DialComponentListFragment.this = r1;
        }

        @Override // xh.c.b
        public final void a(int i10, DialSpacePacket dialSpacePacket) {
            gm.l.f(dialSpacePacket, "item");
            qi.h.j(DialComponentListFragment.this).e(new C0162a(DialComponentListFragment.this, i10, null));
        }

        @Override // xh.c.b
        public final void b(int i10, DialSpacePacket dialSpacePacket) {
            gm.l.f(dialSpacePacket, "item");
            DialComponentListFragment dialComponentListFragment = DialComponentListFragment.this;
            h<Object>[] hVarArr = DialComponentListFragment.f10952r0;
            xh.i h12 = dialComponentListFragment.h1();
            h12.getClass();
            k0.a(h12, new xh.m(null, h12, i10, null), new n(i10, null));
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.component.DialComponentListFragment$onViewCreated$5", f = "DialComponentListFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements p<Throwable, xl.d<? super l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10961e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(2, dVar);
            DialComponentListFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super l> dVar) {
            return ((c) p(th2, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f10961e = obj;
            return cVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            DialComponentListFragment dialComponentListFragment = DialComponentListFragment.this;
            h<Object>[] hVarArr = DialComponentListFragment.f10952r0;
            qi.p.f(dialComponentListFragment.f1(), (Throwable) this.f10961e);
            return l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.component.DialComponentListFragment$onViewCreated$7", f = "DialComponentListFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends zl.i implements p<y3.b<? extends DialPushParams>, xl.d<? super l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10964e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(2, dVar);
            DialComponentListFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(y3.b<? extends DialPushParams> bVar, xl.d<? super l> dVar) {
            return ((e) p(bVar, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f10964e = obj;
            return eVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            boolean z10;
            ArrayList arrayList;
            LoadingView loadingView;
            int i10;
            a0.k(obj);
            y3.b bVar = (y3.b) this.f10964e;
            if (gm.l.a(bVar, d1.f30940b)) {
                z10 = true;
            } else {
                z10 = bVar instanceof y3.p;
            }
            if (z10) {
                DialComponentListFragment dialComponentListFragment = DialComponentListFragment.this;
                h<Object>[] hVarArr = DialComponentListFragment.f10952r0;
                dialComponentListFragment.g1().loadingView.c();
                xh.c cVar = DialComponentListFragment.this.f10955q0;
                if (cVar != null) {
                    cVar.f30550e = null;
                    cVar.h();
                } else {
                    gm.l.l("adapter");
                    throw null;
                }
            } else if (bVar instanceof y3.j) {
                if (((y3.j) bVar).f30961b instanceof ig.e) {
                    DialComponentListFragment dialComponentListFragment2 = DialComponentListFragment.this;
                    h<Object>[] hVarArr2 = DialComponentListFragment.f10952r0;
                    loadingView = dialComponentListFragment2.g1().loadingView;
                    i10 = R.string.ds_dial_error_shape;
                } else {
                    DialComponentListFragment dialComponentListFragment3 = DialComponentListFragment.this;
                    h<Object>[] hVarArr3 = DialComponentListFragment.f10952r0;
                    loadingView = dialComponentListFragment3.g1().loadingView;
                    i10 = R.string.tip_load_error;
                }
                loadingView.a(i10);
            } else if (bVar instanceof c1) {
                DialPushParams dialPushParams = (DialPushParams) ((c1) bVar).f30937b;
                xh.c cVar2 = DialComponentListFragment.this.f10955q0;
                if (cVar2 != null) {
                    sj.e shape = dialPushParams.getShape();
                    gm.l.f(shape, "<set-?>");
                    cVar2.f30549d = shape;
                    xh.c cVar3 = DialComponentListFragment.this.f10955q0;
                    if (cVar3 != null) {
                        List<DialSpacePacket> dialSpacePackets = dialPushParams.getDialSpacePackets();
                        if (dialSpacePackets != null) {
                            arrayList = q.Z(dialSpacePackets);
                        } else {
                            arrayList = null;
                        }
                        cVar3.f30550e = arrayList;
                        xh.c cVar4 = DialComponentListFragment.this.f10955q0;
                        if (cVar4 != null) {
                            cVar4.f30552g = dialPushParams.getCurrentPosition();
                            xh.c cVar5 = DialComponentListFragment.this.f10955q0;
                            if (cVar5 != null) {
                                cVar5.h();
                                xh.c cVar6 = DialComponentListFragment.this.f10955q0;
                                if (cVar6 != null) {
                                    if (cVar6.e() <= 0) {
                                        DialComponentListFragment.this.g1().loadingView.b(R.string.tip_current_no_data);
                                    } else {
                                        DialComponentListFragment.this.g1().loadingView.setVisibility(8);
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
                } else {
                    gm.l.l("adapter");
                    throw null;
                }
            }
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends gm.m implements p<c0<xh.i, i.c>, i2.j, xh.i> {

        /* renamed from: b */
        public final /* synthetic */ mm.b f10966b;

        /* renamed from: c */
        public final /* synthetic */ androidx.fragment.app.r f10967c;

        /* renamed from: d */
        public final /* synthetic */ mm.b f10968d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(androidx.fragment.app.r rVar, gm.e eVar, gm.e eVar2) {
            super(2);
            this.f10966b = eVar;
            this.f10967c = rVar;
            this.f10968d = eVar2;
        }

        /* JADX WARN: Type inference failed for: r13v9, types: [xh.i, y3.k0] */
        @Override // fm.p
        public final xh.i A(c0<xh.i, i.c> c0Var, i2.j jVar) {
            c0<xh.i, i.c> c0Var2 = c0Var;
            i2.j jVar2 = jVar;
            gm.l.f(c0Var2, "stateFactory");
            gm.l.f(jVar2, "backStackEntry");
            return h1.o(m0.p(this.f10966b), i.c.class, new o(this.f10967c.T0(), h1.c(this.f10967c), this.f10967c, jVar2, jVar2.f16301i.f24512b), m0.p(this.f10968d).getName(), false, c0Var2, 16);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends y {

        /* renamed from: c */
        public final /* synthetic */ mm.b f10969c;

        /* renamed from: d */
        public final /* synthetic */ p f10970d;

        /* renamed from: e */
        public final /* synthetic */ mm.b f10971e;

        public g(gm.e eVar, f fVar, gm.e eVar2) {
            this.f10969c = eVar;
            this.f10970d = fVar;
            this.f10971e = eVar2;
        }

        public final tl.d C(Object obj, h hVar) {
            androidx.fragment.app.r rVar = (androidx.fragment.app.r) obj;
            gm.l.f(rVar, "thisRef");
            gm.l.f(hVar, "property");
            g1 g1Var = oc.g1.f22980a;
            if (g1Var instanceof z3.e) {
                return ((z3.e) g1Var).a(rVar, hVar, this.f10969c, new com.topstep.fitcloud.pro.ui.device.dial.component.c(this.f10971e), gm.b0.a(i.c.class), R.id.dial_component_nav_graph, this.f10970d);
            }
            throw new IllegalStateException("Navigation ViewModels require that Mavericks.viewModelDelegateFactory have an implementation of NavigationViewModelDelegateFactory.\n \n To setup the default factory configuration, you can use the default factory DefaultNavigationViewModelDelegateFactory.\n DefaultNavigationViewModelDelegateFactory also implements DefaultViewModelDelegateFactory by default.\n \n Mavericks.viewModelDelegateFactory = DefaultNavigationViewModelDelegateFactory()");
        }
    }

    static {
        t tVar = new t(DialComponentListFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentDialComponentListBinding;", 0);
        gm.c0 c0Var = gm.b0.f15488a;
        c0Var.getClass();
        t tVar2 = new t(DialComponentListFragment.class, "viewModel", "getViewModel()Lcom/topstep/fitcloud/pro/ui/device/dial/component/DialComponentViewModel;", 0);
        c0Var.getClass();
        f10952r0 = new h[]{tVar, tVar2};
    }

    public DialComponentListFragment() {
        super(R.layout.fragment_dial_component_list);
        this.f10953o0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentDialComponentListBinding.class, this);
        gm.e a10 = gm.b0.a(xh.i.class);
        this.f10954p0 = new g(a10, new f(this, a10, a10), a10).C(this, f10952r0[1]);
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        this.f10955q0 = new xh.c();
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        g1().toolbar.setNavigationOnClickListener(new n6.e(4, this));
        int p10 = h1.p(V0(), 3);
        RecyclerView recyclerView = g1().recyclerView;
        V0();
        recyclerView.setLayoutManager(new GridLayoutManager(p10));
        g1().recyclerView.g(new oi.b(p10, g7.a.a(V0(), 8.0f)));
        xh.c cVar = this.f10955q0;
        if (cVar != null) {
            cVar.f30551f = new a();
            RecyclerView recyclerView2 = g1().recyclerView;
            xh.c cVar2 = this.f10955q0;
            if (cVar2 != null) {
                recyclerView2.setAdapter(cVar2);
                g1().loadingView.setListener(new s.i(8, this));
                g0.a.d(this, h1(), new t() { // from class: com.topstep.fitcloud.pro.ui.device.dial.component.DialComponentListFragment.b
                    @Override // gm.t, mm.f
                    public final Object get(Object obj) {
                        return ((i.c) obj).f30573a;
                    }
                }, i1(null), new c(null), null, 8);
                Z(h1(), new t() { // from class: com.topstep.fitcloud.pro.ui.device.dial.component.DialComponentListFragment.d
                    @Override // gm.t, mm.f
                    public final Object get(Object obj) {
                        return ((i.c) obj).f30573a;
                    }
                }, z0.f31104a, new e(null));
                return;
            }
            gm.l.l("adapter");
            throw null;
        }
        gm.l.l("adapter");
        throw null;
    }

    @Override // y3.g0
    public final void X() {
        g0.a.g(this);
    }

    @Override // y3.g0
    public final z1 Y(k0 k0Var, t tVar, y3.i iVar, p pVar, p pVar2) {
        return g0.a.c(this, k0Var, tVar, iVar, pVar, pVar2);
    }

    @Override // y3.g0
    public final z1 Z(xh.i iVar, t tVar, y3.i iVar2, p pVar) {
        return g0.a.e(this, iVar, tVar, iVar2, pVar);
    }

    @Override // y3.g0
    public final u a() {
        return g0.a.b(this);
    }

    public final FragmentDialComponentListBinding g1() {
        return (FragmentDialComponentListBinding) this.f10953o0.a(this, f10952r0[0]);
    }

    public final xh.i h1() {
        return (xh.i) this.f10954p0.getValue();
    }

    @Override // y3.g0
    public final String i() {
        return g0.a.a(this).f30958d;
    }

    public final e1 i1(String str) {
        return g0.a.h(this, str);
    }

    @Override // y3.g0
    public final void invalidate() {
    }
}
