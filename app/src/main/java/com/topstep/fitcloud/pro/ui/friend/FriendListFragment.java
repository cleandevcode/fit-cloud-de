package com.topstep.fitcloud.pro.ui.friend;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.r;
import androidx.fragment.app.x;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.topstep.fitcloud.pro.databinding.FragmentFriendListBinding;
import com.topstep.fitcloud.pro.model.friend.Friend;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import com.topstep.fitcloudpro.R;
import ei.b0;
import ei.f1;
import ei.z0;
import fi.a;
import fm.p;
import gm.l;
import gm.m;
import gm.t;
import i2.j;
import ih.v;
import java.util.List;
import kotlin.Metadata;
import mf.a0;
import pm.e0;
import pm.z1;
import s.q0;
import s.r0;
import u6.z;
import v6.a;
import y0.a;

@Metadata
/* loaded from: classes2.dex */
public final class FriendListFragment extends f1 implements v6.a {

    /* renamed from: z0 */
    public static final /* synthetic */ mm.h<Object>[] f11575z0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11576t0;

    /* renamed from: u0 */
    public final t0 f11577u0;

    /* renamed from: v0 */
    public final fi.a f11578v0;

    /* renamed from: w0 */
    public xg.a f11579w0;

    /* renamed from: x0 */
    public Drawable f11580x0;

    /* renamed from: y0 */
    public BitmapDrawable f11581y0;

    /* loaded from: classes2.dex */
    public static final class a implements a.b {
        public a() {
            FriendListFragment.this = r1;
        }

        @Override // fi.a.b
        public final void a(Friend friend) {
            l.f(friend, "item");
            v.l(tb.a.f(FriendListFragment.this), new b0(friend));
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements fm.l<Button, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(1);
            FriendListFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Button button) {
            l.f(button, "it");
            v.l(tb.a.f(FriendListFragment.this), new i2.a(R.id.toPreSearch));
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendListFragment$onViewCreated$6", f = "FriendListFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements p<z0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11584e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(2, dVar);
            FriendListFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(z0 z0Var, xl.d<? super tl.l> dVar) {
            return ((c) p(z0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f11584e = obj;
            return cVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            View view;
            a0.k(obj);
            u6.a<List<Friend>> aVar = ((z0) this.f11584e).f13816a;
            if (aVar instanceof u6.l) {
                FriendListFragment friendListFragment = FriendListFragment.this;
                mm.h<Object>[] hVarArr = FriendListFragment.f11575z0;
                friendListFragment.i1().loadingView.c();
                FriendListFragment.this.i1().recyclerView.setVisibility(8);
                FriendListFragment.this.i1().emptyView.setVisibility(8);
            } else if (aVar instanceof u6.g) {
                FriendListFragment friendListFragment2 = FriendListFragment.this;
                mm.h<Object>[] hVarArr2 = FriendListFragment.f11575z0;
                friendListFragment2.i1().loadingView.a(R.string.tip_load_error);
            } else if (aVar instanceof u6.a0) {
                List<Friend> a10 = aVar.a();
                FriendListFragment friendListFragment3 = FriendListFragment.this;
                mm.h<Object>[] hVarArr3 = FriendListFragment.f11575z0;
                friendListFragment3.i1().loadingView.setVisibility(8);
                if (a10 != null && !a10.isEmpty()) {
                    view = FriendListFragment.this.i1().recyclerView;
                } else {
                    view = FriendListFragment.this.i1().emptyView;
                }
                view.setVisibility(0);
                fi.a aVar2 = FriendListFragment.this.f11578v0;
                aVar2.f14278e = a10;
                aVar2.h();
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendListFragment$onViewCreated$8", f = "FriendListFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends zl.i implements p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11587e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(2, dVar);
            FriendListFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((e) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f11587e = obj;
            return eVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            FriendListFragment friendListFragment = FriendListFragment.this;
            mm.h<Object>[] hVarArr = FriendListFragment.f11575z0;
            qi.p.f(friendListFragment.f1(), (Throwable) this.f11587e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendListFragment$onViewCreated$9", f = "FriendListFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11589e;

        @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendListFragment$onViewCreated$9$1", f = "FriendListFragment.kt", l = {114}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

            /* renamed from: e */
            public int f11591e;

            /* renamed from: f */
            public final /* synthetic */ FriendListFragment f11592f;

            /* renamed from: com.topstep.fitcloud.pro.ui.friend.FriendListFragment$f$a$a */
            /* loaded from: classes2.dex */
            public static final class C0197a<T> implements sm.g {

                /* renamed from: a */
                public final /* synthetic */ FriendListFragment f11593a;

                public C0197a(FriendListFragment friendListFragment) {
                    this.f11593a = friendListFragment;
                }

                @Override // sm.g
                public final Object n(Object obj, xl.d dVar) {
                    ag.a aVar = (ag.a) obj;
                    FriendListFragment friendListFragment = this.f11593a;
                    mm.h<Object>[] hVarArr = FriendListFragment.f11575z0;
                    MenuItem findItem = friendListFragment.i1().toolbar.getMenu().findItem(R.id.menu_friend_msg);
                    if (aVar != null && aVar.f464c) {
                        FriendListFragment friendListFragment2 = this.f11593a;
                        BitmapDrawable bitmapDrawable = friendListFragment2.f11581y0;
                        if (bitmapDrawable == null) {
                            Drawable h12 = friendListFragment2.h1();
                            if (h12 == null) {
                                bitmapDrawable = null;
                            } else {
                                Bitmap createBitmap = Bitmap.createBitmap(h12.getIntrinsicWidth(), h12.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                                TypedArray obtainStyledAttributes = friendListFragment2.V0().getTheme().obtainStyledAttributes(new int[]{R.attr.colorWarning});
                                l.e(obtainStyledAttributes, "context.theme.obtainStyl…ributes(intArrayOf(attr))");
                                int color = obtainStyledAttributes.getColor(0, 0);
                                obtainStyledAttributes.recycle();
                                l.e(createBitmap, "bitmap");
                                Canvas canvas = new Canvas(createBitmap);
                                h12.draw(canvas);
                                Paint paint = new Paint(5);
                                paint.setColor(color);
                                canvas.drawCircle(h12.getIntrinsicWidth() - 10.0f, 10.0f, 10.0f, paint);
                                bitmapDrawable = new BitmapDrawable(friendListFragment2.n0(), createBitmap);
                            }
                            if (bitmapDrawable != null) {
                                friendListFragment2.f11581y0 = bitmapDrawable;
                            } else {
                                bitmapDrawable = null;
                            }
                        }
                        findItem.setIcon(bitmapDrawable);
                    } else {
                        findItem.setIcon(this.f11593a.h1());
                    }
                    return tl.l.f28297a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(FriendListFragment friendListFragment, xl.d<? super a> dVar) {
                super(2, dVar);
                this.f11592f = friendListFragment;
            }

            @Override // fm.p
            public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
                ((a) p(e0Var, dVar)).t(tl.l.f28297a);
                return yl.a.COROUTINE_SUSPENDED;
            }

            @Override // zl.a
            public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
                return new a(this.f11592f, dVar);
            }

            @Override // zl.a
            public final Object t(Object obj) {
                yl.a aVar = yl.a.COROUTINE_SUSPENDED;
                int i10 = this.f11591e;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.k(obj);
                } else {
                    a0.k(obj);
                    xg.a aVar2 = this.f11592f.f11579w0;
                    if (aVar2 != null) {
                        sm.t0 a10 = aVar2.a();
                        C0197a c0197a = new C0197a(this.f11592f);
                        this.f11591e = 1;
                        if (a10.a(c0197a, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        l.l("noticeRepository");
                        throw null;
                    }
                }
                throw new u2.b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(2, dVar);
            FriendListFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((f) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            f fVar = new f(dVar);
            fVar.f11589e = obj;
            return fVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            bi.z0.g((e0) this.f11589e, null, 0, new a(FriendListFragment.this, null), 3);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends m implements fm.a<j> {

        /* renamed from: b */
        public final /* synthetic */ r f11594b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(r rVar) {
            super(0);
            this.f11594b = rVar;
        }

        @Override // fm.a
        public final j m() {
            return tb.a.f(this.f11594b).f(R.id.friend_nav_graph);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11595b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(tl.i iVar) {
            super(0);
            this.f11595b = iVar;
        }

        @Override // fm.a
        public final x0 m() {
            j jVar = (j) this.f11595b.getValue();
            l.e(jVar, "backStackEntry");
            x0 z10 = jVar.z();
            l.e(z10, "backStackEntry.viewModelStore");
            return z10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f11596b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11597c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(r rVar, tl.i iVar) {
            super(0);
            this.f11596b = rVar;
            this.f11597c = iVar;
        }

        @Override // fm.a
        public final v0.b m() {
            x T0 = this.f11596b.T0();
            j jVar = (j) this.f11597c.getValue();
            l.e(jVar, "backStackEntry");
            return p.b.i(T0, jVar);
        }
    }

    static {
        t tVar = new t(FriendListFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentFriendListBinding;", 0);
        gm.b0.f15488a.getClass();
        f11575z0 = new mm.h[]{tVar};
    }

    public FriendListFragment() {
        super(R.layout.fragment_friend_list);
        this.f11576t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentFriendListBinding.class, this);
        tl.i iVar = new tl.i(new g(this));
        this.f11577u0 = ab.b.e(this, gm.b0.a(FriendViewModel.class), new h(iVar), new i(this, iVar));
        this.f11578v0 = new fi.a();
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        l.f(view, "view");
        super.O0(view, bundle);
        i1().toolbar.setNavigationOnClickListener(new uh.e(3, this));
        i1().toolbar.setOnMenuItemClickListener(new q0(15, this));
        RecyclerView recyclerView = i1().recyclerView;
        V0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        i1().recyclerView.g(new oi.a(V0()));
        i1().recyclerView.setAdapter(this.f11578v0);
        this.f11578v0.f14279f = new a();
        i1().loadingView.setListener(new r0(16, this));
        p.b.g(i1().btnAdd, new b());
        G((FriendViewModel) this.f11577u0.getValue(), z.f28636a, new c(null));
        n((FriendViewModel) this.f11577u0.getValue(), new t() { // from class: com.topstep.fitcloud.pro.ui.friend.FriendListFragment.d
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((z0) obj).f13816a;
            }
        }, v6.b.i((FriendViewModel) this.f11577u0.getValue()), new e(null), null);
        qi.h.k(qi.h.i(this), new f(null));
    }

    @Override // v6.a
    public final u a() {
        return a.C0526a.a(this);
    }

    @Override // v6.a
    public final z1 e(v6.b bVar, t tVar, u6.f fVar, p pVar) {
        return a.C0526a.e(this, bVar, tVar, fVar, pVar);
    }

    public final Drawable h1() {
        Drawable drawable;
        Drawable drawable2 = this.f11580x0;
        if (drawable2 == null) {
            Context context = i1().toolbar.getContext();
            Object obj = y0.a.f30807a;
            Drawable b10 = a.c.b(context, R.drawable.ic_friends_msg1);
            if (b10 == null) {
                drawable = null;
            } else {
                l.e(context, "context");
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.colorControlNormal});
                l.e(obtainStyledAttributes, "context.theme.obtainStyl…ributes(intArrayOf(attr))");
                int color = obtainStyledAttributes.getColor(0, 0);
                obtainStyledAttributes.recycle();
                b10.setTint(color);
                b10.setBounds(0, 0, b10.getIntrinsicWidth(), b10.getIntrinsicHeight());
                drawable = b10;
            }
            if (drawable == null) {
                return null;
            }
            this.f11580x0 = drawable;
            return drawable;
        }
        return drawable2;
    }

    public final FragmentFriendListBinding i1() {
        return (FragmentFriendListBinding) this.f11576t0.a(this, f11575z0[0]);
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
