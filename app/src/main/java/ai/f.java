package ai;

import ai.d;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.r;
import androidx.fragment.app.x;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi.z0;
import com.topstep.fitcloud.pro.databinding.FragmentGamePacketListBinding;
import com.topstep.fitcloud.pro.model.game.push.GamePacket;
import com.topstep.fitcloud.pro.ui.device.game.push.GamePushViewModel;
import com.topstep.fitcloud.pro.ui.widget.LoadingView;
import com.topstep.fitcloudpro.R;
import fm.p;
import gm.b0;
import gm.t;
import ih.v;
import java.util.List;
import kotlin.Metadata;
import mf.a0;
import nh.c;
import pm.e0;
import s.h1;
import s.r0;
import y3.c1;
import y3.d1;

@Metadata
/* loaded from: classes2.dex */
public final class f extends lh.i {

    /* renamed from: s0 */
    public static final a f542s0;

    /* renamed from: t0 */
    public static final /* synthetic */ mm.h<Object>[] f543t0;

    /* renamed from: o0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f544o0;

    /* renamed from: p0 */
    public final tl.i f545p0;

    /* renamed from: q0 */
    public final t0 f546q0;

    /* renamed from: r0 */
    public ai.d f547r0;

    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.a<Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(0);
            f.this = r1;
        }

        @Override // fm.a
        public final Boolean m() {
            return Boolean.valueOf(f.this.U0().getBoolean("is_local"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements d.b {
        public c() {
            f.this = r1;
        }

        @Override // ai.d.b
        public final void a(GamePacket gamePacket) {
            gm.l.f(gamePacket, "packet");
            v.l(tb.a.f(f.this.W0()), new ai.g(gamePacket.f9686a));
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.game.push.GamePacketListFragment$onViewCreated$3", f = "GamePacketListFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f550e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.game.push.GamePacketListFragment$onViewCreated$3$1", f = "GamePacketListFragment.kt", l = {64}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f552e;

            /* renamed from: f */
            public final /* synthetic */ f f553f;

            /* renamed from: ai.f$d$a$a */
            /* loaded from: classes2.dex */
            public static final class C0010a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ f f554a;

                public C0010a(f fVar) {
                    this.f554a = fVar;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    boolean z10;
                    ai.d dVar2;
                    List<GamePacket> list;
                    LoadingView loadingView;
                    int i10;
                    y3.b<T> bVar = ((nh.d) obj).f22382a;
                    if (gm.l.a(bVar, d1.f30940b)) {
                        z10 = true;
                    } else {
                        z10 = bVar instanceof y3.p;
                    }
                    if (z10) {
                        f fVar = this.f554a;
                        a aVar = f.f542s0;
                        fVar.g1().loadingView.c();
                        ai.d dVar3 = this.f554a.f547r0;
                        if (dVar3 != null) {
                            dVar3.f537e = null;
                            dVar3.h();
                        } else {
                            gm.l.l("adapter");
                            throw null;
                        }
                    } else {
                        if (bVar instanceof y3.j) {
                            f fVar2 = this.f554a;
                            a aVar2 = f.f542s0;
                            loadingView = fVar2.g1().loadingView;
                            i10 = R.string.tip_load_error;
                        } else if (bVar instanceof c1) {
                            zf.a aVar3 = (zf.a) ((c1) bVar).f30937b;
                            if (((Boolean) this.f554a.f545p0.getValue()).booleanValue()) {
                                this.f554a.g1().tvTips.setVisibility(0);
                                dVar2 = this.f554a.f547r0;
                                if (dVar2 != null) {
                                    list = aVar3.f32347b;
                                } else {
                                    gm.l.l("adapter");
                                    throw null;
                                }
                            } else {
                                this.f554a.g1().tvTips.setVisibility(8);
                                dVar2 = this.f554a.f547r0;
                                if (dVar2 != null) {
                                    list = aVar3.f32346a;
                                } else {
                                    gm.l.l("adapter");
                                    throw null;
                                }
                            }
                            dVar2.f537e = list;
                            ai.d dVar4 = this.f554a.f547r0;
                            if (dVar4 != null) {
                                dVar4.h();
                                ai.d dVar5 = this.f554a.f547r0;
                                if (dVar5 != null) {
                                    if (dVar5.e() <= 0) {
                                        loadingView = this.f554a.g1().loadingView;
                                        i10 = R.string.tip_current_no_data;
                                    } else {
                                        this.f554a.g1().loadingView.setVisibility(8);
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
            public a(f fVar, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f553f = fVar;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f553f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f552e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    f fVar = this.f553f;
                    a aVar2 = f.f542s0;
                    sm.t0 t0Var = ((GamePushViewModel) fVar.f546q0.getValue()).f22394e;
                    C0010a c0010a = new C0010a(this.f553f);
                    this.f552e = 1;
                    if (t0Var.a(c0010a, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.game.push.GamePacketListFragment$onViewCreated$3$2", f = "GamePacketListFragment.kt", l = {94}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f555e;

            /* renamed from: f */
            public final /* synthetic */ f f556f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ f f557a;

                public a(f fVar) {
                    this.f557a = fVar;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    nh.c cVar = (nh.c) obj;
                    if (cVar instanceof c.a) {
                        f fVar = this.f557a;
                        a aVar = f.f542s0;
                        qi.p.f(fVar.f1(), ((c.a) cVar).f22380a);
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(f fVar, xl.d<? super b> dVar) {
                super(2, dVar);
                this.f556f = fVar;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new b(this.f556f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f555e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    f fVar = this.f556f;
                    a aVar2 = f.f542s0;
                    sm.c cVar = ((GamePushViewModel) fVar.f546q0.getValue()).f22396g;
                    a aVar3 = new a(this.f556f);
                    this.f555e = 1;
                    if (cVar.a(aVar3, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            f.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((d) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f550e = obj;
            return dVar2;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f550e;
            z0.g(e0Var, null, 0, new a(f.this, null), 3);
            z0.g(e0Var, null, 0, new b(f.this, null), 3);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends gm.m implements fm.a<i2.j> {

        /* renamed from: b */
        public final /* synthetic */ r f558b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(r rVar) {
            super(0);
            this.f558b = rVar;
        }

        @Override // fm.a
        public final i2.j m() {
            return tb.a.f(this.f558b).f(R.id.game_push_nav_graph);
        }
    }

    /* renamed from: ai.f$f */
    /* loaded from: classes2.dex */
    public static final class C0011f extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f559b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0011f(tl.i iVar) {
            super(0);
            this.f559b = iVar;
        }

        @Override // fm.a
        public final x0 m() {
            i2.j jVar = (i2.j) this.f559b.getValue();
            gm.l.e(jVar, "backStackEntry");
            x0 z10 = jVar.z();
            gm.l.e(z10, "backStackEntry.viewModelStore");
            return z10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f560b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f561c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(r rVar, tl.i iVar) {
            super(0);
            this.f560b = rVar;
            this.f561c = iVar;
        }

        @Override // fm.a
        public final v0.b m() {
            x T0 = this.f560b.T0();
            i2.j jVar = (i2.j) this.f561c.getValue();
            gm.l.e(jVar, "backStackEntry");
            return p.b.i(T0, jVar);
        }
    }

    static {
        t tVar = new t(f.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentGamePacketListBinding;", 0);
        b0.f15488a.getClass();
        f543t0 = new mm.h[]{tVar};
        f542s0 = new a();
    }

    public f() {
        super(R.layout.fragment_game_packet_list);
        this.f544o0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentGamePacketListBinding.class, this);
        this.f545p0 = new tl.i(new b());
        tl.i iVar = new tl.i(new e(this));
        this.f546q0 = ab.b.e(this, b0.a(GamePushViewModel.class), new C0011f(iVar), new g(this, iVar));
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        this.f547r0 = new ai.d();
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        int p10 = h1.p(V0(), 4);
        RecyclerView recyclerView = g1().recyclerView;
        V0();
        recyclerView.setLayoutManager(new GridLayoutManager(p10));
        g1().recyclerView.g(new oi.b(p10, g7.a.a(V0(), 8.0f)));
        ai.d dVar = this.f547r0;
        if (dVar != null) {
            dVar.f536d = new c();
            RecyclerView recyclerView2 = g1().recyclerView;
            ai.d dVar2 = this.f547r0;
            if (dVar2 != null) {
                recyclerView2.setAdapter(dVar2);
                g1().loadingView.setListener(new r0(14, this));
                qi.h.k(qi.h.i(this), new d(null));
                return;
            }
            gm.l.l("adapter");
            throw null;
        }
        gm.l.l("adapter");
        throw null;
    }

    public final FragmentGamePacketListBinding g1() {
        return (FragmentGamePacketListBinding) this.f544o0.a(this, f543t0[0]);
    }
}
