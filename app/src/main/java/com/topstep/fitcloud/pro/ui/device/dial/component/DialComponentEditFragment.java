package com.topstep.fitcloud.pro.ui.device.dial.component;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.r;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi.m0;
import com.bumptech.glide.n;
import com.topstep.fitcloud.pro.databinding.FragmentDialComponentEditBinding;
import com.topstep.fitcloud.pro.databinding.LayoutDialComponentStyleBinding;
import com.topstep.fitcloud.pro.model.dial.DialComponent;
import com.topstep.fitcloud.pro.model.dial.DialPushParams;
import com.topstep.fitcloud.pro.model.dial.DialSpacePacket;
import com.topstep.fitcloudpro.R;
import fm.p;
import gm.b0;
import gm.m;
import gm.t;
import i2.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import mf.a0;
import pm.z1;
import s.h1;
import tl.l;
import ul.q;
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
public final class DialComponentEditFragment extends lh.c implements g0 {

    /* renamed from: p0 */
    public static final /* synthetic */ mm.h<Object>[] f10919p0;

    /* renamed from: m0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10920m0;

    /* renamed from: n0 */
    public final tl.d f10921n0;

    /* renamed from: o0 */
    public final i2.g f10922o0;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.component.DialComponentEditFragment$onViewCreated$2", f = "DialComponentEditFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<y3.b<? extends DialPushParams>, xl.d<? super l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10924e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(2, dVar);
            DialComponentEditFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(y3.b<? extends DialPushParams> bVar, xl.d<? super l> dVar) {
            return ((b) p(bVar, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f10924e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            List<DialSpacePacket> list;
            int i10;
            boolean z10;
            boolean z11;
            LayoutDialComponentStyleBinding inflate;
            xh.f fVar;
            a0.k(obj);
            DialPushParams dialPushParams = (DialPushParams) ((y3.b) this.f10924e).a();
            if (dialPushParams != null) {
                list = dialPushParams.getDialSpacePackets();
            } else {
                list = null;
            }
            if (list != null) {
                i10 = list.size();
            } else {
                i10 = 0;
            }
            if (dialPushParams != null && list != null) {
                int i11 = ((xh.b) DialComponentEditFragment.this.f10922o0.getValue()).f30548a;
                if (i11 >= 0 && i11 < i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    DialSpacePacket dialSpacePacket = list.get(((xh.b) DialComponentEditFragment.this.f10922o0.getValue()).f30548a);
                    List<DialComponent> components = dialSpacePacket.getComponents();
                    if (components != null) {
                        ArrayList Z = q.Z(components);
                        DialComponentEditFragment dialComponentEditFragment = DialComponentEditFragment.this;
                        DialComponentView dialComponentView = dialComponentEditFragment.e1().componentView;
                        sj.e shape = dialPushParams.getShape();
                        String previewImgUrl = dialSpacePacket.getPreviewImgUrl();
                        dialComponentView.getClass();
                        gm.l.f(shape, "shape");
                        dialComponentView.f10974c = shape;
                        dialComponentView.f10975d = Z;
                        dialComponentView.f10977f = new Bitmap[Z.size()];
                        if (previewImgUrl != null && previewImgUrl.length() != 0) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (!z11) {
                            n<Bitmap> C = com.bumptech.glide.b.e(dialComponentView.getContext()).i().C(previewImgUrl);
                            C.B(new xh.h(dialComponentView), C);
                        }
                        int size = Z.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            dialComponentView.a(i12);
                        }
                        dialComponentView.requestLayout();
                        if (dialComponentEditFragment.e1().layoutContent.getChildCount() - Z.size() > 0) {
                            int childCount = dialComponentEditFragment.e1().layoutContent.getChildCount();
                            for (int size2 = Z.size(); size2 < childCount; size2++) {
                                dialComponentEditFragment.e1().layoutContent.removeViewAt(size2);
                            }
                        }
                        int size3 = Z.size();
                        for (int i13 = 0; i13 < size3; i13++) {
                            View childAt = dialComponentEditFragment.e1().layoutContent.getChildAt(i13);
                            if (childAt != null) {
                                inflate = LayoutDialComponentStyleBinding.bind(childAt);
                            } else {
                                inflate = LayoutDialComponentStyleBinding.inflate(dialComponentEditFragment.k0());
                                inflate.tvTitle.setText(dialComponentEditFragment.p0(R.string.ds_dial_component, Integer.valueOf(i13 + 1)));
                                RecyclerView recyclerView = inflate.recyclerView;
                                dialComponentEditFragment.V0();
                                recyclerView.setLayoutManager(new LinearLayoutManager(0));
                                dialComponentEditFragment.e1().layoutContent.addView(inflate.getRoot());
                            }
                            gm.l.e(inflate, "if (addedChild != null) …          }\n            }");
                            RecyclerView.e adapter = inflate.recyclerView.getAdapter();
                            if (adapter instanceof xh.f) {
                                fVar = (xh.f) adapter;
                            } else {
                                fVar = null;
                            }
                            if (fVar == null) {
                                fVar = new xh.f();
                                inflate.recyclerView.setAdapter(fVar);
                            }
                            fVar.f30561e = ((DialComponent) Z.get(i13)).getStyleUrls();
                            fVar.f30560d = ((DialComponent) Z.get(i13)).getStyleCurrent();
                            fVar.f30562f = new xh.a(dialComponentEditFragment, i13);
                            fVar.h();
                        }
                    }
                    return l.f28297a;
                }
            }
            tb.a.f(DialComponentEditFragment.this).o();
            return l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.dial.component.DialComponentEditFragment$onViewCreated$4", f = "DialComponentEditFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends i implements p<l, xl.d<? super l>, Object> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            DialComponentEditFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(l lVar, xl.d<? super l> dVar) {
            return ((d) p(lVar, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new d(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            tb.a.f(DialComponentEditFragment.this).o();
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends m implements fm.l<Button, l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e() {
            super(1);
            DialComponentEditFragment.this = r1;
        }

        @Override // fm.l
        public final l k(Button button) {
            gm.l.f(button, "it");
            DialComponentEditFragment dialComponentEditFragment = DialComponentEditFragment.this;
            mm.h<Object>[] hVarArr = DialComponentEditFragment.f10919p0;
            xh.i iVar = (xh.i) dialComponentEditFragment.f10921n0.getValue();
            int i10 = ((xh.b) DialComponentEditFragment.this.f10922o0.getValue()).f30548a;
            List<DialComponent> components = DialComponentEditFragment.this.e1().componentView.getComponents();
            iVar.getClass();
            k0.a(iVar, new xh.m(components, iVar, i10, null), new xh.n(i10, components));
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends m implements fm.a<Bundle> {

        /* renamed from: b */
        public final /* synthetic */ r f10929b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(r rVar) {
            super(0);
            this.f10929b = rVar;
        }

        @Override // fm.a
        public final Bundle m() {
            Bundle bundle = this.f10929b.f2516f;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(androidx.fragment.app.n.a(android.support.v4.media.d.a("Fragment "), this.f10929b, " has null arguments"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends m implements p<c0<xh.i, i.c>, j, xh.i> {

        /* renamed from: b */
        public final /* synthetic */ mm.b f10930b;

        /* renamed from: c */
        public final /* synthetic */ r f10931c;

        /* renamed from: d */
        public final /* synthetic */ mm.b f10932d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(r rVar, gm.e eVar, gm.e eVar2) {
            super(2);
            this.f10930b = eVar;
            this.f10931c = rVar;
            this.f10932d = eVar2;
        }

        /* JADX WARN: Type inference failed for: r13v9, types: [xh.i, y3.k0] */
        @Override // fm.p
        public final xh.i A(c0<xh.i, i.c> c0Var, j jVar) {
            c0<xh.i, i.c> c0Var2 = c0Var;
            j jVar2 = jVar;
            gm.l.f(c0Var2, "stateFactory");
            gm.l.f(jVar2, "backStackEntry");
            return h1.o(m0.p(this.f10930b), i.c.class, new o(this.f10931c.T0(), h1.c(this.f10931c), this.f10931c, jVar2, jVar2.f16301i.f24512b), m0.p(this.f10932d).getName(), false, c0Var2, 16);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends y {

        /* renamed from: c */
        public final /* synthetic */ mm.b f10933c;

        /* renamed from: d */
        public final /* synthetic */ p f10934d;

        /* renamed from: e */
        public final /* synthetic */ mm.b f10935e;

        public h(gm.e eVar, g gVar, gm.e eVar2) {
            this.f10933c = eVar;
            this.f10934d = gVar;
            this.f10935e = eVar2;
        }

        public final tl.d C(Object obj, mm.h hVar) {
            r rVar = (r) obj;
            gm.l.f(rVar, "thisRef");
            gm.l.f(hVar, "property");
            g1 g1Var = oc.g1.f22980a;
            if (g1Var instanceof z3.e) {
                return ((z3.e) g1Var).a(rVar, hVar, this.f10933c, new com.topstep.fitcloud.pro.ui.device.dial.component.a(this.f10935e), b0.a(i.c.class), R.id.dial_component_nav_graph, this.f10934d);
            }
            throw new IllegalStateException("Navigation ViewModels require that Mavericks.viewModelDelegateFactory have an implementation of NavigationViewModelDelegateFactory.\n \n To setup the default factory configuration, you can use the default factory DefaultNavigationViewModelDelegateFactory.\n DefaultNavigationViewModelDelegateFactory also implements DefaultViewModelDelegateFactory by default.\n \n Mavericks.viewModelDelegateFactory = DefaultNavigationViewModelDelegateFactory()");
        }
    }

    static {
        t tVar = new t(DialComponentEditFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentDialComponentEditBinding;", 0);
        gm.c0 c0Var = b0.f15488a;
        c0Var.getClass();
        t tVar2 = new t(DialComponentEditFragment.class, "viewModel", "getViewModel()Lcom/topstep/fitcloud/pro/ui/device/dial/component/DialComponentViewModel;", 0);
        c0Var.getClass();
        f10919p0 = new mm.h[]{tVar, tVar2};
    }

    public DialComponentEditFragment() {
        super(R.layout.fragment_dial_component_edit);
        this.f10920m0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentDialComponentEditBinding.class, this);
        gm.e a10 = b0.a(xh.i.class);
        this.f10921n0 = new h(a10, new g(this, a10, a10), a10).C(this, f10919p0[1]);
        this.f10922o0 = new i2.g(b0.a(xh.b.class), new f(this));
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        Z((xh.i) this.f10921n0.getValue(), new t() { // from class: com.topstep.fitcloud.pro.ui.device.dial.component.DialComponentEditFragment.a
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((i.c) obj).f30573a;
            }
        }, z0.f31104a, new b(null));
        g0.a.d(this, (xh.i) this.f10921n0.getValue(), new t() { // from class: com.topstep.fitcloud.pro.ui.device.dial.component.DialComponentEditFragment.c
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((i.c) obj).f30574b;
            }
        }, f1(null), null, new d(null), 4);
        p.b.g(e1().btnSave, new e());
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

    public final FragmentDialComponentEditBinding e1() {
        return (FragmentDialComponentEditBinding) this.f10920m0.a(this, f10919p0[0]);
    }

    public final e1 f1(String str) {
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
