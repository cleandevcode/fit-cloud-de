package com.topstep.fitcloud.pro.ui.device.dial.component;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.r;
import androidx.lifecycle.u;
import androidx.navigation.fragment.NavHostFragment;
import bi.m0;
import com.topstep.fitcloudpro.R;
import gm.b0;
import gm.m;
import gm.t;
import i2.j;
import kotlin.Metadata;
import mf.a0;
import mm.h;
import pm.z1;
import qi.p;
import s.h1;
import tl.l;
import xh.i;
import y3.c0;
import y3.e1;
import y3.g0;
import y3.g1;
import y3.k0;
import y3.o;
import y3.z0;
import yb.y;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class DialComponentFragment extends NavHostFragment implements g0 {

    /* renamed from: u0 */
    public static final /* synthetic */ h<Object>[] f10936u0;

    /* renamed from: r0 */
    public final tl.d f10937r0 = p.d(this);

    /* renamed from: s0 */
    public final tl.d f10938s0 = p.c(this);

    /* renamed from: t0 */
    public final tl.d f10939t0;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.component.DialComponentFragment$onViewCreated$2", f = "DialComponentFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements fm.p<y3.b<? extends l>, xl.d<? super l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10941e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(2, dVar);
            DialComponentFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(y3.b<? extends l> bVar, xl.d<? super l> dVar) {
            return ((b) p(bVar, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f10941e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            p.b((y3.b) this.f10941e, (d7.e) DialComponentFragment.this.f10938s0.getValue());
            return l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.component.DialComponentFragment$onViewCreated$4", f = "DialComponentFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends i implements fm.p<Throwable, xl.d<? super l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10944e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            DialComponentFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super l> dVar) {
            return ((d) p(th2, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f10944e = obj;
            return dVar2;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            p.f((d7.e) DialComponentFragment.this.f10937r0.getValue(), (Throwable) this.f10944e);
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends m implements fm.p<c0<xh.i, i.c>, j, xh.i> {

        /* renamed from: b */
        public final /* synthetic */ mm.b f10946b;

        /* renamed from: c */
        public final /* synthetic */ r f10947c;

        /* renamed from: d */
        public final /* synthetic */ mm.b f10948d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(r rVar, gm.e eVar, gm.e eVar2) {
            super(2);
            this.f10946b = eVar;
            this.f10947c = rVar;
            this.f10948d = eVar2;
        }

        /* JADX WARN: Type inference failed for: r13v9, types: [xh.i, y3.k0] */
        @Override // fm.p
        public final xh.i A(c0<xh.i, i.c> c0Var, j jVar) {
            c0<xh.i, i.c> c0Var2 = c0Var;
            j jVar2 = jVar;
            gm.l.f(c0Var2, "stateFactory");
            gm.l.f(jVar2, "backStackEntry");
            return h1.o(m0.p(this.f10946b), i.c.class, new o(this.f10947c.T0(), h1.c(this.f10947c), this.f10947c, jVar2, jVar2.f16301i.f24512b), m0.p(this.f10948d).getName(), false, c0Var2, 16);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends y {

        /* renamed from: c */
        public final /* synthetic */ mm.b f10949c;

        /* renamed from: d */
        public final /* synthetic */ fm.p f10950d;

        /* renamed from: e */
        public final /* synthetic */ mm.b f10951e;

        public f(gm.e eVar, e eVar2, gm.e eVar3) {
            this.f10949c = eVar;
            this.f10950d = eVar2;
            this.f10951e = eVar3;
        }

        public final tl.d C(Object obj, h hVar) {
            r rVar = (r) obj;
            gm.l.f(rVar, "thisRef");
            gm.l.f(hVar, "property");
            g1 g1Var = oc.g1.f22980a;
            if (g1Var instanceof z3.e) {
                return ((z3.e) g1Var).a(rVar, hVar, this.f10949c, new com.topstep.fitcloud.pro.ui.device.dial.component.b(this.f10951e), b0.a(i.c.class), R.id.dial_component_nav_graph, this.f10950d);
            }
            throw new IllegalStateException("Navigation ViewModels require that Mavericks.viewModelDelegateFactory have an implementation of NavigationViewModelDelegateFactory.\n \n To setup the default factory configuration, you can use the default factory DefaultNavigationViewModelDelegateFactory.\n DefaultNavigationViewModelDelegateFactory also implements DefaultViewModelDelegateFactory by default.\n \n Mavericks.viewModelDelegateFactory = DefaultNavigationViewModelDelegateFactory()");
        }
    }

    static {
        t tVar = new t(DialComponentFragment.class, "viewModel", "getViewModel()Lcom/topstep/fitcloud/pro/ui/device/dial/component/DialComponentViewModel;", 0);
        b0.f15488a.getClass();
        f10936u0 = new h[]{tVar};
    }

    public DialComponentFragment() {
        gm.e a10 = b0.a(xh.i.class);
        this.f10939t0 = new f(a10, new e(this, a10, a10), a10).C(this, f10936u0[0]);
    }

    @Override // androidx.navigation.fragment.NavHostFragment, androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        c1().w(R.navigation.dial_component_nav_graph);
    }

    @Override // androidx.navigation.fragment.NavHostFragment, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        Z((xh.i) this.f10939t0.getValue(), new t() { // from class: com.topstep.fitcloud.pro.ui.device.dial.component.DialComponentFragment.a
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((i.c) obj).f30574b;
            }
        }, z0.f31104a, new b(null));
        g0.a.d(this, (xh.i) this.f10939t0.getValue(), new t() { // from class: com.topstep.fitcloud.pro.ui.device.dial.component.DialComponentFragment.c
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((i.c) obj).f30574b;
            }
        }, d1(null), new d(null), null, 8);
    }

    @Override // y3.g0
    public final void X() {
        g0.a.g(this);
    }

    @Override // y3.g0
    public final z1 Y(k0 k0Var, t tVar, y3.i iVar, fm.p pVar, fm.p pVar2) {
        return g0.a.c(this, k0Var, tVar, iVar, pVar, pVar2);
    }

    @Override // y3.g0
    public final z1 Z(xh.i iVar, t tVar, y3.i iVar2, fm.p pVar) {
        return g0.a.e(this, iVar, tVar, iVar2, pVar);
    }

    @Override // y3.g0
    public final u a() {
        return g0.a.b(this);
    }

    public final e1 d1(String str) {
        return g0.a.h(this, str);
    }

    @Override // y3.g0
    public final String i() {
        return g0.a.a(this).f30958d;
    }

    @Override // y3.g0
    public final void invalidate() {
    }
}
