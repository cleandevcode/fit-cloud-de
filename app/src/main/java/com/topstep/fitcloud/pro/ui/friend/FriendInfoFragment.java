package com.topstep.fitcloud.pro.ui.friend;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.n;
import androidx.fragment.app.r;
import androidx.fragment.app.x;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.v0;
import androidx.lifecycle.y0;
import bi.m0;
import bi.z0;
import com.topstep.fitcloud.pro.databinding.FragmentFriendInfoBinding;
import com.topstep.fitcloud.pro.model.friend.Friend;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import com.topstep.fitcloudpro.R;
import d2.a;
import ei.a0;
import ei.e1;
import ei.j0;
import ei.w;
import ei.x0;
import ei.y;
import ei.z;
import fm.p;
import gm.b0;
import gm.t;
import java.text.SimpleDateFormat;
import kotlin.Metadata;
import pm.z1;
import v6.a;

@Metadata
/* loaded from: classes2.dex */
public final class FriendInfoFragment extends e1 implements v6.a, j0.a {

    /* renamed from: y0 */
    public static final /* synthetic */ mm.h<Object>[] f11550y0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11551t0;

    /* renamed from: u0 */
    public final i2.g f11552u0;

    /* renamed from: v0 */
    public final SimpleDateFormat f11553v0;

    /* renamed from: w0 */
    public final t0 f11554w0;

    /* renamed from: x0 */
    public final t0 f11555x0;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendInfoFragment$onViewCreated$2", f = "FriendInfoFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements p<a0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11556e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(2, dVar);
            FriendInfoFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(a0 a0Var, xl.d<? super tl.l> dVar) {
            return ((a) p(a0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f11556e = obj;
            return aVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            boolean z10;
            mf.a0.k(obj);
            a0 a0Var = (a0) this.f11556e;
            String str = ((FriendViewModel) FriendInfoFragment.this.f11555x0.getValue()).f11683k.get(Long.valueOf(FriendInfoFragment.this.h1().f13795a.getUserId()));
            if (str == null) {
                str = FriendInfoFragment.this.h1().f13795a.getDisplayName();
            } else {
                if (str.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    str = FriendInfoFragment.this.h1().f13795a.getNickName();
                }
            }
            FriendInfoFragment.this.i1().toolbar.setTitle(str);
            FriendInfoFragment.this.i1().tvNickName.setText(str);
            qi.p.a(a0Var.f13684a, FriendInfoFragment.this.e1());
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendInfoFragment$onViewCreated$4", f = "FriendInfoFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11559e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(2, dVar);
            FriendInfoFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((c) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f11559e = obj;
            return cVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            FriendInfoFragment friendInfoFragment = FriendInfoFragment.this;
            mm.h<Object>[] hVarArr = FriendInfoFragment.f11550y0;
            qi.p.f(friendInfoFragment.f1(), (Throwable) this.f11559e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendInfoFragment$onViewCreated$5", f = "FriendInfoFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements p<tl.l, xl.d<? super tl.l>, Object> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            FriendInfoFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(tl.l lVar, xl.d<? super tl.l> dVar) {
            return ((d) p(lVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new d(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            FriendViewModel friendViewModel = (FriendViewModel) FriendInfoFragment.this.f11555x0.getValue();
            long userId = FriendInfoFragment.this.h1().f13795a.getUserId();
            friendViewModel.getClass();
            z0.g(rm.l.h(friendViewModel), null, 0, new x0(friendViewModel, userId, null), 3);
            tb.a.f(FriendInfoFragment.this).q(R.id.friendListFragment, false);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends gm.m implements fm.a<i2.j> {

        /* renamed from: b */
        public final /* synthetic */ r f11562b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(r rVar) {
            super(0);
            this.f11562b = rVar;
        }

        @Override // fm.a
        public final i2.j m() {
            return tb.a.f(this.f11562b).f(R.id.friend_nav_graph);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends gm.m implements fm.a<androidx.lifecycle.x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11563b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(tl.i iVar) {
            super(0);
            this.f11563b = iVar;
        }

        @Override // fm.a
        public final androidx.lifecycle.x0 m() {
            i2.j jVar = (i2.j) this.f11563b.getValue();
            gm.l.e(jVar, "backStackEntry");
            androidx.lifecycle.x0 z10 = jVar.z();
            gm.l.e(z10, "backStackEntry.viewModelStore");
            return z10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f11564b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11565c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(r rVar, tl.i iVar) {
            super(0);
            this.f11564b = rVar;
            this.f11565c = iVar;
        }

        @Override // fm.a
        public final v0.b m() {
            x T0 = this.f11564b.T0();
            i2.j jVar = (i2.j) this.f11565c.getValue();
            gm.l.e(jVar, "backStackEntry");
            return p.b.i(T0, jVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends gm.m implements fm.a<Bundle> {

        /* renamed from: b */
        public final /* synthetic */ r f11566b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(r rVar) {
            super(0);
            this.f11566b = rVar;
        }

        @Override // fm.a
        public final Bundle m() {
            Bundle bundle = this.f11566b.f2516f;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(n.a(android.support.v4.media.d.a("Fragment "), this.f11566b, " has null arguments"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends gm.m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f11567b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(r rVar) {
            super(0);
            this.f11567b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f11567b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends gm.m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f11568b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f11568b = iVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f11568b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends gm.m implements fm.a<androidx.lifecycle.x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11569b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(tl.d dVar) {
            super(0);
            this.f11569b = dVar;
        }

        @Override // fm.a
        public final androidx.lifecycle.x0 m() {
            return ih.b.a(this.f11569b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11570b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(tl.d dVar) {
            super(0);
            this.f11570b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f11570b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f11571b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11572c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(r rVar, tl.d dVar) {
            super(0);
            this.f11571b = rVar;
            this.f11572c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f11572c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f11571b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(FriendInfoFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentFriendInfoBinding;", 0);
        b0.f15488a.getClass();
        f11550y0 = new mm.h[]{tVar};
    }

    public FriendInfoFragment() {
        super(R.layout.fragment_friend_info);
        this.f11551t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentFriendInfoBinding.class, this);
        this.f11552u0 = new i2.g(b0.a(w.class), new h(this));
        this.f11553v0 = m0.m();
        tl.d a10 = fb.e.a(new j(new i(this)));
        this.f11554w0 = ab.b.f(this, b0.a(FriendInfoViewModel.class), new k(a10), new l(a10), new m(this, a10));
        tl.i iVar = new tl.i(new e(this));
        this.f11555x0 = ab.b.e(this, b0.a(FriendViewModel.class), new f(iVar), new g(this, iVar));
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    @Override // ei.j0.a
    public final void J() {
        FriendInfoViewModel j12 = j1();
        long userId = h1().f13795a.getUserId();
        j12.getClass();
        v6.b.f(j12, new y(j12, userId, null), null, z.f13815b, 3);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        Friend friend = h1().f13795a;
        Context V0 = V0();
        String avatar = friend.getAvatar();
        ImageView imageView = i1().imgAvatar;
        gm.l.e(imageView, "viewBind.imgAvatar");
        com.bumptech.glide.n<Drawable> x10 = com.bumptech.glide.b.c(V0).b(V0).k(avatar).x(i5.g.w(R.drawable.ic_user_avatar));
        x10.getClass();
        ((com.bumptech.glide.n) x10.r(a5.m.f293b, new a5.k())).A(imageView);
        i1().tvId.setText(friend.getIdentityId());
        i1().itemBirthday.getTextView().setText(this.f11553v0.format(hh.b.c(friend.getBirthday())));
        i1().itemSex.getTextView().setText(n6.a0.s(V0(), friend.getSex()));
        i1().itemHeight.getTextView().setText(n6.a0.r(V0(), friend.getHeight(), ((uf.b) j1().f11574k.a().getValue()).a()));
        i1().itemWeight.getTextView().setText(n6.a0.t(V0(), friend.getWeight(), ((uf.b) j1().f11574k.a().getValue()).c()));
        i1().toolbar.setOnMenuItemClickListener(new s5.b(this, friend, 4));
        G(j1(), u6.z.f28636a, new a(null));
        a.C0526a.b(this, j1(), new t() { // from class: com.topstep.fitcloud.pro.ui.friend.FriendInfoFragment.b
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((a0) obj).f13684a;
            }
        }, v6.b.i(j1()), new c(null), new d(null));
    }

    @Override // v6.a
    public final u a() {
        return a.C0526a.a(this);
    }

    @Override // v6.a
    public final z1 e(v6.b bVar, t tVar, u6.f fVar, p pVar) {
        return a.C0526a.e(this, bVar, tVar, fVar, pVar);
    }

    public final w h1() {
        return (w) this.f11552u0.getValue();
    }

    public final FragmentFriendInfoBinding i1() {
        return (FragmentFriendInfoBinding) this.f11551t0.a(this, f11550y0[0]);
    }

    public final FriendInfoViewModel j1() {
        return (FriendInfoViewModel) this.f11554w0.getValue();
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
