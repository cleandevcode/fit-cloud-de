package com.topstep.fitcloud.pro.ui.device.sport.push;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi.m0;
import bi.z0;
import com.github.kilnn.tool.widget.preference.PreferenceRelativeLayout;
import com.topstep.fitcloud.pro.databinding.FragmentSportPushBinding;
import com.topstep.fitcloud.pro.model.sport.push.SportPacket;
import com.topstep.fitcloudpro.R;
import di.j;
import di.l;
import di.m;
import gm.b0;
import gm.t;
import kotlin.Metadata;
import mf.a0;
import oc.g1;
import og.x0;
import pm.e0;
import pm.r;
import pm.z1;
import s.h1;
import ul.q;
import y3.c0;
import y3.c1;
import y3.d1;
import y3.e1;
import y3.g0;
import y3.k0;
import y3.o;
import y3.p;
import y3.v;
import yb.y;
import zl.i;

@Metadata
/* loaded from: classes2.dex */
public final class SportPushFragment extends di.b implements g0 {

    /* renamed from: y0 */
    public static final /* synthetic */ mm.h<Object>[] f11415y0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11416t0;

    /* renamed from: u0 */
    public final tl.d f11417u0;

    /* renamed from: v0 */
    public final l f11418v0;

    /* renamed from: w0 */
    public final j f11419w0;

    /* renamed from: x0 */
    public final m f11420x0;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.l<nh.d<bg.a>, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            SportPushFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(nh.d<bg.a> dVar) {
            boolean z10;
            nh.d<bg.a> dVar2 = dVar;
            gm.l.f(dVar2, "it");
            y3.b<bg.a> bVar = dVar2.f22382a;
            if (gm.l.a(bVar, d1.f30940b)) {
                z10 = true;
            } else {
                z10 = bVar instanceof p;
            }
            if (z10) {
                SportPushFragment sportPushFragment = SportPushFragment.this;
                mm.h<Object>[] hVarArr = SportPushFragment.f11415y0;
                sportPushFragment.h1().loadingView.c();
            } else if (bVar instanceof y3.j) {
                SportPushFragment sportPushFragment2 = SportPushFragment.this;
                mm.h<Object>[] hVarArr2 = SportPushFragment.f11415y0;
                sportPushFragment2.h1().loadingView.a(R.string.tip_load_error);
            } else if (bVar instanceof c1) {
                j jVar = SportPushFragment.this.f11419w0;
                jVar.f13074g = 0;
                jVar.h();
                SportPushFragment sportPushFragment3 = SportPushFragment.this;
                m mVar = sportPushFragment3.f11420x0;
                mVar.f13082f = ((bg.a) ((c1) bVar).f30937b).f4183a;
                j jVar2 = sportPushFragment3.f11419w0;
                mVar.y(jVar2.f13072e[jVar2.f13074g]);
                SportPushFragment.this.f11420x0.h();
                if (SportPushFragment.this.f11420x0.e() <= 0) {
                    SportPushFragment.this.h1().loadingView.b(R.string.tip_current_no_data);
                } else {
                    SportPushFragment.this.h1().loadingView.setVisibility(8);
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements j.b {
        public b() {
            SportPushFragment.this = r1;
        }

        @Override // di.j.b
        public final void a(int i10) {
            SportPushFragment.this.f11420x0.y(i10);
            SportPushFragment.this.f11420x0.h();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements m.b {

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.sport.push.SportPushFragment$onViewCreated$2$onItemSelect$1", f = "SportPushFragment.kt", l = {57}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i implements fm.p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11424e;

            /* renamed from: f */
            public final /* synthetic */ SportPushFragment f11425f;

            /* renamed from: g */
            public final /* synthetic */ SportPacket f11426g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SportPushFragment sportPushFragment, SportPacket sportPacket, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f11425f = sportPushFragment;
                this.f11426g = sportPacket;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f11425f, this.f11426g, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                Byte b10;
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11424e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    SportPushFragment sportPushFragment = this.f11425f;
                    mm.h<Object>[] hVarArr = SportPushFragment.f11415y0;
                    di.g i12 = sportPushFragment.i1();
                    this.f11424e = 1;
                    k0<S>.b bVar = i12.f30971c;
                    bVar.getClass();
                    r a10 = m0.a();
                    bVar.f31078c.b(new v(a10));
                    obj = a10.x0(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                bg.a aVar2 = (bg.a) ((nh.d) obj).f22382a.a();
                if (aVar2 != null) {
                    SportPushFragment sportPushFragment2 = this.f11425f;
                    SportPacket sportPacket = this.f11426g;
                    uj.a aVar3 = (uj.a) q.O(aVar2.f4184b);
                    if (aVar3 != null) {
                        b10 = Byte.valueOf(aVar3.f28839c);
                    } else {
                        b10 = null;
                    }
                    if (b10 == null) {
                        mm.h<Object>[] hVarArr2 = SportPushFragment.f11415y0;
                        d7.e.f(sportPushFragment2.f1(), R.string.ds_sport_push_error_position);
                    } else {
                        int i11 = di.c.M0;
                        l lVar = sportPushFragment2.f11418v0;
                        Context V0 = sportPushFragment2.V0();
                        lVar.getClass();
                        String a11 = l.a(V0, sportPacket);
                        byte byteValue = b10.byteValue();
                        gm.l.f(a11, "name");
                        di.c cVar = new di.c();
                        Bundle bundle = new Bundle();
                        bundle.putString("name", a11);
                        bundle.putParcelable("packet", sportPacket);
                        bundle.putByte("bin_flag", byteValue);
                        cVar.Z0(bundle);
                        cVar.h1(sportPushFragment2.h0(), null);
                    }
                }
                return tl.l.f28297a;
            }
        }

        public c() {
            SportPushFragment.this = r1;
        }

        @Override // di.m.b
        public final void a(SportPacket sportPacket) {
            gm.l.f(sportPacket, "packet");
            SportPushFragment sportPushFragment = SportPushFragment.this;
            mm.h<Object>[] hVarArr = SportPushFragment.f11415y0;
            if (x0.b(sportPushFragment.i1().f13062f)) {
                qi.h.j(SportPushFragment.this).e(new a(SportPushFragment.this, sportPacket, null));
            } else {
                d7.e.f(SportPushFragment.this.f1(), R.string.device_state_disconnected);
            }
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.sport.push.SportPushFragment$onViewCreated$5", f = "SportPushFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11428e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(2, dVar);
            SportPushFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((e) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f11428e = obj;
            return eVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            SportPushFragment sportPushFragment = SportPushFragment.this;
            mm.h<Object>[] hVarArr = SportPushFragment.f11415y0;
            qi.p.f(sportPushFragment.f1(), (Throwable) this.f11428e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.sport.push.SportPushFragment$onViewCreated$6", f = "SportPushFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends i implements fm.p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11430e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.sport.push.SportPushFragment$onViewCreated$6$1", f = "SportPushFragment.kt", l = {91}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends i implements fm.p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11432e;

            /* renamed from: f */
            public final /* synthetic */ SportPushFragment f11433f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.sport.push.SportPushFragment$f$a$a */
            /* loaded from: classes2.dex */
            public static final class C0195a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ SportPushFragment f11434a;

                public C0195a(SportPushFragment sportPushFragment) {
                    this.f11434a = sportPushFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    int i10;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    SportPushFragment sportPushFragment = this.f11434a;
                    mm.h<Object>[] hVarArr = SportPushFragment.f11415y0;
                    PreferenceRelativeLayout preferenceRelativeLayout = sportPushFragment.h1().layoutLocationService;
                    gm.l.e(preferenceRelativeLayout, "viewBind.layoutLocationService");
                    if (!booleanValue) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    preferenceRelativeLayout.setVisibility(i10);
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SportPushFragment sportPushFragment, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f11433f = sportPushFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f11433f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11432e;
                if (i10 == 0) {
                    a0.k(obj);
                    sm.b e10 = qi.h.e(this.f11433f.V0());
                    C0195a c0195a = new C0195a(this.f11433f);
                    this.f11432e = 1;
                    if (e10.a(c0195a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(2, dVar);
            SportPushFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((f) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            f fVar = new f(dVar);
            fVar.f11430e = obj;
            return fVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            z0.g((e0) this.f11430e, null, 0, new a(SportPushFragment.this, null), 3);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends gm.m implements fm.l<c0<di.g, nh.d<bg.a>>, di.g> {

        /* renamed from: b */
        public final /* synthetic */ mm.b f11435b;

        /* renamed from: c */
        public final /* synthetic */ androidx.fragment.app.r f11436c;

        /* renamed from: d */
        public final /* synthetic */ mm.b f11437d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(androidx.fragment.app.r rVar, gm.e eVar, gm.e eVar2) {
            super(1);
            this.f11435b = eVar;
            this.f11436c = rVar;
            this.f11437d = eVar2;
        }

        /* JADX WARN: Type inference failed for: r8v7, types: [di.g, y3.k0] */
        @Override // fm.l
        public final di.g k(c0<di.g, nh.d<bg.a>> c0Var) {
            c0<di.g, nh.d<bg.a>> c0Var2 = c0Var;
            gm.l.f(c0Var2, "stateFactory");
            return h1.o(m0.p(this.f11435b), nh.d.class, new o(this.f11436c.T0(), h1.c(this.f11436c), this.f11436c), m0.p(this.f11437d).getName(), false, c0Var2, 16);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends y {

        /* renamed from: c */
        public final /* synthetic */ mm.b f11438c;

        /* renamed from: d */
        public final /* synthetic */ fm.l f11439d;

        /* renamed from: e */
        public final /* synthetic */ mm.b f11440e;

        public h(gm.e eVar, g gVar, gm.e eVar2) {
            this.f11438c = eVar;
            this.f11439d = gVar;
            this.f11440e = eVar2;
        }

        public final tl.d C(Object obj, mm.h hVar) {
            androidx.fragment.app.r rVar = (androidx.fragment.app.r) obj;
            gm.l.f(rVar, "thisRef");
            gm.l.f(hVar, "property");
            return g1.f22980a.b(rVar, hVar, this.f11438c, new com.topstep.fitcloud.pro.ui.device.sport.push.a(this.f11440e), b0.a(nh.d.class), false, this.f11439d);
        }
    }

    static {
        t tVar = new t(SportPushFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentSportPushBinding;", 0);
        gm.c0 c0Var = b0.f15488a;
        c0Var.getClass();
        t tVar2 = new t(SportPushFragment.class, "viewModel", "getViewModel()Lcom/topstep/fitcloud/pro/ui/device/sport/push/SportPushViewModel;", 0);
        c0Var.getClass();
        f11415y0 = new mm.h[]{tVar, tVar2};
    }

    public SportPushFragment() {
        super(R.layout.fragment_sport_push);
        this.f11416t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentSportPushBinding.class, this);
        gm.e a10 = b0.a(di.g.class);
        this.f11417u0 = new h(a10, new g(this, a10, a10), a10).C(this, f11415y0[1]);
        l lVar = new l();
        this.f11418v0 = lVar;
        this.f11419w0 = new j(lVar);
        this.f11420x0 = new m(lVar);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        RecyclerView recyclerView = h1().recyclerViewCategory;
        V0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        h1().recyclerViewCategory.setAdapter(this.f11419w0);
        this.f11419w0.f13073f = new b();
        int p10 = h1.p(V0(), 3);
        RecyclerView recyclerView2 = h1().recyclerViewItem;
        V0();
        recyclerView2.setLayoutManager(new GridLayoutManager(p10));
        h1().recyclerViewItem.g(new oi.b(p10, g7.a.a(V0(), 8.0f)));
        h1().recyclerViewItem.setAdapter(this.f11420x0);
        this.f11420x0.f13081e = new c();
        h1().loadingView.setListener(new jc.f(9, this));
        g0.a.d(this, i1(), new t() { // from class: com.topstep.fitcloud.pro.ui.device.sport.push.SportPushFragment.d
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((nh.d) obj).f22382a;
            }
        }, j1(null), new e(null), null, 8);
        if (Build.VERSION.SDK_INT < 31) {
            qi.h.k(qi.h.i(this), new f(null));
            return;
        }
        PreferenceRelativeLayout preferenceRelativeLayout = h1().layoutLocationService;
        gm.l.e(preferenceRelativeLayout, "viewBind.layoutLocationService");
        preferenceRelativeLayout.setVisibility(8);
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

    public final FragmentSportPushBinding h1() {
        return (FragmentSportPushBinding) this.f11416t0.a(this, f11415y0[0]);
    }

    @Override // y3.g0
    public final String i() {
        return g0.a.a(this).f30958d;
    }

    public final di.g i1() {
        return (di.g) this.f11417u0.getValue();
    }

    @Override // y3.g0
    public final void invalidate() {
        gm.j.p(i1(), new a());
    }

    public final e1 j1(String str) {
        return g0.a.h(this, str);
    }
}
