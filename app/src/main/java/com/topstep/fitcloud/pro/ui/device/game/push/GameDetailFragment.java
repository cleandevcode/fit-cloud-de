package com.topstep.fitcloud.pro.ui.device.game.push;

import ai.k;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.n;
import androidx.fragment.app.r;
import androidx.fragment.app.x;
import androidx.lifecycle.t0;
import androidx.lifecycle.v;
import androidx.lifecycle.v0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi.z0;
import com.github.kilnn.tool.widget.preference.PreferenceRelativeLayout;
import com.topstep.fitcloud.pro.databinding.FragmentGameDetailBinding;
import com.topstep.fitcloud.pro.model.game.push.GamePacket;
import com.topstep.fitcloud.pro.model.game.push.GameSkin;
import com.topstep.fitcloud.pro.model.game.push.GameSpaceSkin;
import com.topstep.fitcloudpro.R;
import fm.p;
import gm.b0;
import gm.l;
import gm.m;
import gm.t;
import i2.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import lh.i;
import mf.a0;
import mm.h;
import nh.c;
import og.x0;
import pm.e0;
import s.h1;
import y3.c1;
import y3.d1;
import y3.j;

@Metadata
/* loaded from: classes2.dex */
public final class GameDetailFragment extends i {

    /* renamed from: t0 */
    public static final /* synthetic */ h<Object>[] f11034t0;

    /* renamed from: o0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11035o0;

    /* renamed from: p0 */
    public final g f11036p0;

    /* renamed from: q0 */
    public final t0 f11037q0;

    /* renamed from: r0 */
    public k f11038r0;

    /* renamed from: s0 */
    public GamePacket f11039s0;

    /* loaded from: classes2.dex */
    public static final class a implements k.b {
        public a() {
            GameDetailFragment.this = r1;
        }

        @Override // ai.k.b
        public final void a(GameSkin gameSkin) {
            zf.a aVar;
            l.f(gameSkin, "skin");
            GameDetailFragment gameDetailFragment = GameDetailFragment.this;
            h<Object>[] hVarArr = GameDetailFragment.f11034t0;
            if (x0.b(gameDetailFragment.h1().f11059h)) {
                GameDetailFragment gameDetailFragment2 = GameDetailFragment.this;
                GamePacket gamePacket = gameDetailFragment2.f11039s0;
                if (gamePacket != null && (aVar = (zf.a) gameDetailFragment2.h1().e().f22382a.a()) != null) {
                    GameDetailFragment gameDetailFragment3 = GameDetailFragment.this;
                    int i10 = ai.b.H0;
                    String str = gamePacket.f9687b;
                    ArrayList<GameSpaceSkin> arrayList = aVar.f32348c;
                    l.f(str, "name");
                    l.f(arrayList, "spaces");
                    ai.b bVar = new ai.b();
                    Bundle bundle = new Bundle();
                    bundle.putString("name", str);
                    bundle.putParcelable("skin", gameSkin);
                    bundle.putParcelableArrayList("spaces", arrayList);
                    bVar.Z0(bundle);
                    bVar.h1(gameDetailFragment3.h0(), null);
                    return;
                }
                return;
            }
            d7.e.f(GameDetailFragment.this.f1(), R.string.device_state_disconnected);
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.device.game.push.GameDetailFragment$onViewCreated$3", f = "GameDetailFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11041e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.game.push.GameDetailFragment$onViewCreated$3$1", f = "GameDetailFragment.kt", l = {70}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11043e;

            /* renamed from: f */
            public final /* synthetic */ GameDetailFragment f11044f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.game.push.GameDetailFragment$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C0169a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ GameDetailFragment f11045a;

                public C0169a(GameDetailFragment gameDetailFragment) {
                    this.f11045a = gameDetailFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    boolean z10;
                    T t10;
                    String sb2;
                    boolean z11;
                    y3.b<T> bVar = ((nh.d) obj).f22382a;
                    if (l.a(bVar, d1.f30940b)) {
                        z10 = true;
                    } else {
                        z10 = bVar instanceof y3.p;
                    }
                    if (z10) {
                        GameDetailFragment gameDetailFragment = this.f11045a;
                        h<Object>[] hVarArr = GameDetailFragment.f11034t0;
                        gameDetailFragment.g1().loadingView.c();
                    } else if (bVar instanceof j) {
                        GameDetailFragment gameDetailFragment2 = this.f11045a;
                        h<Object>[] hVarArr2 = GameDetailFragment.f11034t0;
                        gameDetailFragment2.g1().loadingView.a(R.string.tip_load_error);
                    } else if (bVar instanceof c1) {
                        List<GamePacket> list = ((zf.a) ((c1) bVar).f30937b).f32346a;
                        GameDetailFragment gameDetailFragment3 = this.f11045a;
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                t10 = it.next();
                                if (((GamePacket) t10).f9686a == ((ai.a) gameDetailFragment3.f11036p0.getValue()).f520a) {
                                    z11 = true;
                                    continue;
                                } else {
                                    z11 = false;
                                    continue;
                                }
                                if (z11) {
                                    break;
                                }
                            } else {
                                t10 = null;
                                break;
                            }
                        }
                        GamePacket gamePacket = (GamePacket) t10;
                        GameDetailFragment gameDetailFragment4 = this.f11045a;
                        if (gamePacket == null) {
                            tb.a.f(gameDetailFragment4).o();
                        } else {
                            gameDetailFragment4.f11039s0 = gamePacket;
                            ImageView imageView = gameDetailFragment4.g1().imgGame;
                            l.e(imageView, "viewBind.imgGame");
                            a.f.g(imageView, gamePacket.f9690e, 12);
                            gameDetailFragment4.g1().tvName.setText(gamePacket.f9687b);
                            TextView textView = gameDetailFragment4.g1().tvDownloadCount;
                            Object[] objArr = new Object[1];
                            int i10 = gamePacket.f9689d;
                            if (i10 < 1000) {
                                sb2 = String.valueOf(i10);
                            } else if (i10 < 10000) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(((i10 / 100) * 100) / 1000.0f);
                                sb3.append('k');
                                sb2 = sb3.toString();
                            } else {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(((i10 / 1000) * 1000) / 10000.0f);
                                sb4.append('w');
                                sb2 = sb4.toString();
                            }
                            objArr[0] = sb2;
                            textView.setText(gameDetailFragment4.p0(R.string.ds_download_count, objArr));
                            k kVar = gameDetailFragment4.f11038r0;
                            if (kVar != null) {
                                kVar.f569e = gamePacket.f9691f;
                                kVar.h();
                                gameDetailFragment4.g1().tvDescription.setText(gamePacket.f9688c);
                                gameDetailFragment4.g1().loadingView.setVisibility(8);
                            } else {
                                l.l("adapter");
                                throw null;
                            }
                        }
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(GameDetailFragment gameDetailFragment, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f11044f = gameDetailFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((a) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f11044f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11043e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    GameDetailFragment gameDetailFragment = this.f11044f;
                    h<Object>[] hVarArr = GameDetailFragment.f11034t0;
                    sm.t0 t0Var = gameDetailFragment.h1().f22394e;
                    C0169a c0169a = new C0169a(this.f11044f);
                    this.f11043e = 1;
                    if (t0Var.a(c0169a, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.game.push.GameDetailFragment$onViewCreated$3$2", f = "GameDetailFragment.kt", l = {94}, m = "invokeSuspend")
        /* renamed from: com.topstep.fitcloud.pro.ui.device.game.push.GameDetailFragment$b$b */
        /* loaded from: classes2.dex */
        public static final class C0170b extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11046e;

            /* renamed from: f */
            public final /* synthetic */ GameDetailFragment f11047f;

            /* renamed from: com.topstep.fitcloud.pro.ui.device.game.push.GameDetailFragment$b$b$a */
            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ GameDetailFragment f11048a;

                public a(GameDetailFragment gameDetailFragment) {
                    this.f11048a = gameDetailFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    nh.c cVar = (nh.c) obj;
                    if (cVar instanceof c.a) {
                        GameDetailFragment gameDetailFragment = this.f11048a;
                        h<Object>[] hVarArr = GameDetailFragment.f11034t0;
                        qi.p.f(gameDetailFragment.f1(), ((c.a) cVar).f22380a);
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0170b(GameDetailFragment gameDetailFragment, xl.d<? super C0170b> dVar) {
                super(2, dVar);
                this.f11047f = gameDetailFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((C0170b) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new C0170b(this.f11047f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11046e;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    GameDetailFragment gameDetailFragment = this.f11047f;
                    h<Object>[] hVarArr = GameDetailFragment.f11034t0;
                    sm.c cVar = gameDetailFragment.h1().f22396g;
                    a aVar2 = new a(this.f11047f);
                    this.f11046e = 1;
                    if (cVar.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return tl.l.f28297a;
            }
        }

        @zl.e(c = "com.topstep.fitcloud.pro.ui.device.game.push.GameDetailFragment$onViewCreated$3$3", f = "GameDetailFragment.kt", l = {105}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class c extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11049e;

            /* renamed from: f */
            public final /* synthetic */ GameDetailFragment f11050f;

            /* loaded from: classes2.dex */
            public static final class a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ GameDetailFragment f11051a;

                public a(GameDetailFragment gameDetailFragment) {
                    this.f11051a = gameDetailFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    int i10;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    GameDetailFragment gameDetailFragment = this.f11051a;
                    h<Object>[] hVarArr = GameDetailFragment.f11034t0;
                    PreferenceRelativeLayout preferenceRelativeLayout = gameDetailFragment.g1().layoutLocationService;
                    l.e(preferenceRelativeLayout, "viewBind.layoutLocationService");
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
            public c(GameDetailFragment gameDetailFragment, xl.d<? super c> dVar) {
                super(2, dVar);
                this.f11050f = gameDetailFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                return ((c) p(e0Var, dVar)).t(tl.l.f28297a);
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new c(this.f11050f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11049e;
                if (i10 == 0) {
                    a0.k(obj);
                    sm.b e10 = qi.h.e(this.f11050f.V0());
                    a aVar2 = new a(this.f11050f);
                    this.f11049e = 1;
                    if (e10.a(aVar2, this) == aVar) {
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
        public b(xl.d<? super b> dVar) {
            super(2, dVar);
            GameDetailFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f11041e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            e0 e0Var = (e0) this.f11041e;
            z0.g(e0Var, null, 0, new a(GameDetailFragment.this, null), 3);
            z0.g(e0Var, null, 0, new C0170b(GameDetailFragment.this, null), 3);
            if (Build.VERSION.SDK_INT < 31) {
                z0.g(e0Var, null, 0, new c(GameDetailFragment.this, null), 3);
            } else {
                GameDetailFragment gameDetailFragment = GameDetailFragment.this;
                h<Object>[] hVarArr = GameDetailFragment.f11034t0;
                PreferenceRelativeLayout preferenceRelativeLayout = gameDetailFragment.g1().layoutLocationService;
                l.e(preferenceRelativeLayout, "viewBind.layoutLocationService");
                preferenceRelativeLayout.setVisibility(8);
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends m implements fm.a<i2.j> {

        /* renamed from: b */
        public final /* synthetic */ r f11052b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r rVar) {
            super(0);
            this.f11052b = rVar;
        }

        @Override // fm.a
        public final i2.j m() {
            return tb.a.f(this.f11052b).f(R.id.game_push_nav_graph);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends m implements fm.a<androidx.lifecycle.x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11053b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(tl.i iVar) {
            super(0);
            this.f11053b = iVar;
        }

        @Override // fm.a
        public final androidx.lifecycle.x0 m() {
            i2.j jVar = (i2.j) this.f11053b.getValue();
            l.e(jVar, "backStackEntry");
            androidx.lifecycle.x0 z10 = jVar.z();
            l.e(z10, "backStackEntry.viewModelStore");
            return z10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f11054b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11055c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(r rVar, tl.i iVar) {
            super(0);
            this.f11054b = rVar;
            this.f11055c = iVar;
        }

        @Override // fm.a
        public final v0.b m() {
            x T0 = this.f11054b.T0();
            i2.j jVar = (i2.j) this.f11055c.getValue();
            l.e(jVar, "backStackEntry");
            return p.b.i(T0, jVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends m implements fm.a<Bundle> {

        /* renamed from: b */
        public final /* synthetic */ r f11056b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(r rVar) {
            super(0);
            this.f11056b = rVar;
        }

        @Override // fm.a
        public final Bundle m() {
            Bundle bundle = this.f11056b.f2516f;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(n.a(android.support.v4.media.d.a("Fragment "), this.f11056b, " has null arguments"));
        }
    }

    static {
        t tVar = new t(GameDetailFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentGameDetailBinding;", 0);
        b0.f15488a.getClass();
        f11034t0 = new h[]{tVar};
    }

    public GameDetailFragment() {
        super(R.layout.fragment_game_detail);
        this.f11035o0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentGameDetailBinding.class, this);
        this.f11036p0 = new g(b0.a(ai.a.class), new f(this));
        tl.i iVar = new tl.i(new c(this));
        this.f11037q0 = ab.b.e(this, b0.a(GamePushViewModel.class), new d(iVar), new e(this, iVar));
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        this.f11038r0 = new k();
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        l.f(view, "view");
        super.O0(view, bundle);
        int p10 = h1.p(V0(), 4);
        RecyclerView recyclerView = g1().recyclerView;
        V0();
        recyclerView.setLayoutManager(new GridLayoutManager(p10));
        g1().recyclerView.g(new oi.b(p10, g7.a.a(V0(), 8.0f)));
        k kVar = this.f11038r0;
        if (kVar != null) {
            kVar.f568d = new a();
            RecyclerView recyclerView2 = g1().recyclerView;
            k kVar2 = this.f11038r0;
            if (kVar2 != null) {
                recyclerView2.setAdapter(kVar2);
                g1().loadingView.setListener(new jc.f(7, this));
                v vVar = this.Z;
                l.e(vVar, "lifecycle");
                qi.h.k(vVar, new b(null));
                return;
            }
            l.l("adapter");
            throw null;
        }
        l.l("adapter");
        throw null;
    }

    public final FragmentGameDetailBinding g1() {
        return (FragmentGameDetailBinding) this.f11035o0.a(this, f11034t0[0]);
    }

    public final GamePushViewModel h1() {
        return (GamePushViewModel) this.f11037q0.getValue();
    }
}
