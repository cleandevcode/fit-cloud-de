package com.topstep.fitcloud.pro.ui.friend;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.n;
import androidx.fragment.app.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import com.topstep.fitcloud.pro.databinding.FragmentFriendAddBinding;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import com.topstep.fitcloudpro.R;
import d2.a;
import d7.d;
import ei.a1;
import fm.p;
import gm.b0;
import gm.t;
import kotlin.Metadata;
import mf.a0;
import pm.e0;
import pm.z1;
import u6.z;
import v6.a;

@Metadata
/* loaded from: classes2.dex */
public final class FriendAddFragment extends a1 implements v6.a, d.a {

    /* renamed from: y0 */
    public static final /* synthetic */ mm.h<Object>[] f11455y0;

    /* renamed from: t0 */
    public final int f11456t0;

    /* renamed from: u0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11457u0;

    /* renamed from: v0 */
    public final i2.g f11458v0;

    /* renamed from: w0 */
    public final t0 f11459w0;

    /* renamed from: x0 */
    public final a f11460x0;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            FriendAddFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            View view2 = view;
            gm.l.f(view2, "view");
            FriendAddFragment friendAddFragment = FriendAddFragment.this;
            mm.h<Object>[] hVarArr = FriendAddFragment.f11455y0;
            friendAddFragment.h1().itemMark.editMark.setText(((TextView) view2).getText());
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendAddFragment$onViewCreated$1", f = "FriendAddFragment.kt", l = {45}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f11462e;

        /* loaded from: classes2.dex */
        public static final class a<T> implements sm.g {

            /* renamed from: a */
            public final /* synthetic */ FriendAddFragment f11464a;

            public a(FriendAddFragment friendAddFragment) {
                this.f11464a = friendAddFragment;
            }

            @Override // sm.g
            public final Object n(Object obj, xl.d dVar) {
                FriendAddFragment friendAddFragment = this.f11464a;
                mm.h<Object>[] hVarArr = FriendAddFragment.f11455y0;
                friendAddFragment.h1().editMsg.setText(this.f11464a.p0(R.string.friends_default_msg, (String) obj));
                return tl.l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(2, dVar);
            FriendAddFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((b) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new b(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            Object obj2 = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f11462e;
            if (i10 != 0) {
                if (i10 == 1) {
                    a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                a0.k(obj);
                FriendAddFragment friendAddFragment = FriendAddFragment.this;
                mm.h<Object>[] hVarArr = FriendAddFragment.f11455y0;
                FriendAddViewModel i12 = friendAddFragment.i1();
                sm.f<uf.d> y10 = i12.f11480k.y(i12.f11481l);
                a aVar = new a(FriendAddFragment.this);
                this.f11462e = 1;
                Object a10 = y10.a(new ei.d(aVar), this);
                if (a10 != obj2) {
                    a10 = tl.l.f28297a;
                }
                if (a10 == obj2) {
                    return obj2;
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends gm.m implements fm.l<Button, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(1);
            FriendAddFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Button button) {
            gm.l.f(button, "it");
            FriendAddFragment friendAddFragment = FriendAddFragment.this;
            mm.h<Object>[] hVarArr = FriendAddFragment.f11455y0;
            FriendAddViewModel i12 = friendAddFragment.i1();
            long userId = ((ei.b) FriendAddFragment.this.f11458v0.getValue()).f13690a.getUserId();
            EditText editText = FriendAddFragment.this.h1().itemMark.editMark;
            gm.l.e(editText, "viewBind.itemMark.editMark");
            String h10 = qi.h.h(editText);
            EditText editText2 = FriendAddFragment.this.h1().editMsg;
            gm.l.e(editText2, "viewBind.editMsg");
            String h11 = qi.h.h(editText2);
            i12.getClass();
            v6.b.f(i12, new ei.e(i12, userId, h10, h11, null), null, ei.f.f13726b, 3);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendAddFragment$onViewCreated$3", f = "FriendAddFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements p<ei.a<tl.l>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11466e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            FriendAddFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(ei.a<tl.l> aVar, xl.d<? super tl.l> dVar) {
            return ((d) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f11466e = obj;
            return dVar2;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            u6.a<T> aVar = ((ei.a) this.f11466e).f13683a;
            FriendAddFragment friendAddFragment = FriendAddFragment.this;
            mm.h<Object>[] hVarArr = FriendAddFragment.f11455y0;
            qi.p.a(aVar, friendAddFragment.e1());
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendAddFragment$onViewCreated$5", f = "FriendAddFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends zl.i implements p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11469e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(2, dVar);
            FriendAddFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((f) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            f fVar = new f(dVar);
            fVar.f11469e = obj;
            return fVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            FriendAddFragment friendAddFragment = FriendAddFragment.this;
            mm.h<Object>[] hVarArr = FriendAddFragment.f11455y0;
            qi.p.f(friendAddFragment.f1(), (Throwable) this.f11469e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendAddFragment$onViewCreated$6", f = "FriendAddFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends zl.i implements p<tl.l, xl.d<? super tl.l>, Object> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(xl.d<? super g> dVar) {
            super(2, dVar);
            FriendAddFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(tl.l lVar, xl.d<? super tl.l> dVar) {
            return ((g) p(lVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new g(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            FriendAddFragment friendAddFragment = FriendAddFragment.this;
            mm.h<Object>[] hVarArr = FriendAddFragment.f11455y0;
            d7.e.h(friendAddFragment.f1(), R.string.friends_send_success, true, FriendAddFragment.this.f11456t0, 12);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends gm.m implements fm.a<Bundle> {

        /* renamed from: b */
        public final /* synthetic */ r f11472b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(r rVar) {
            super(0);
            this.f11472b = rVar;
        }

        @Override // fm.a
        public final Bundle m() {
            Bundle bundle = this.f11472b.f2516f;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(n.a(android.support.v4.media.d.a("Fragment "), this.f11472b, " has null arguments"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends gm.m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f11473b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(r rVar) {
            super(0);
            this.f11473b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f11473b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends gm.m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f11474b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f11474b = iVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f11474b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11475b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(tl.d dVar) {
            super(0);
            this.f11475b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f11475b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11476b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(tl.d dVar) {
            super(0);
            this.f11476b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f11476b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f11477b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11478c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(r rVar, tl.d dVar) {
            super(0);
            this.f11477b = rVar;
            this.f11478c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f11478c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f11477b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(FriendAddFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentFriendAddBinding;", 0);
        b0.f15488a.getClass();
        f11455y0 = new mm.h[]{tVar};
    }

    public FriendAddFragment() {
        super(R.layout.fragment_friend_add);
        this.f11456t0 = 1;
        this.f11457u0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentFriendAddBinding.class, this);
        this.f11458v0 = new i2.g(b0.a(ei.b.class), new h(this));
        tl.d a10 = fb.e.a(new j(new i(this)));
        this.f11459w0 = ab.b.f(this, b0.a(FriendAddViewModel.class), new k(a10), new l(a10), new m(this, a10));
        this.f11460x0 = new a();
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        Context V0 = V0();
        String avatar = ((ei.b) this.f11458v0.getValue()).f13690a.getAvatar();
        ImageView imageView = h1().itemInfo.imgAvatar;
        gm.l.e(imageView, "viewBind.itemInfo.imgAvatar");
        com.bumptech.glide.n<Drawable> x10 = com.bumptech.glide.b.c(V0).b(V0).k(avatar).x(i5.g.w(R.drawable.ic_user_avatar));
        x10.getClass();
        ((com.bumptech.glide.n) x10.r(a5.m.f293b, new a5.k())).A(imageView);
        h1().itemInfo.tvNickName.setText(((ei.b) this.f11458v0.getValue()).f13690a.getNickName());
        h1().itemInfo.tvTime.setText(qi.h.g(this, ((ei.b) this.f11458v0.getValue()).f13690a.getIdentityId()));
        qi.h.k(qi.h.i(this), new b(null));
        p.b.g(h1().btnAdd, new c());
        p.b.g(h1().itemMark.tvMark1, this.f11460x0);
        p.b.g(h1().itemMark.tvMark2, this.f11460x0);
        p.b.g(h1().itemMark.tvMark3, this.f11460x0);
        p.b.g(h1().itemMark.tvMark4, this.f11460x0);
        p.b.g(h1().itemMark.tvMark5, this.f11460x0);
        p.b.g(h1().itemMark.tvMark6, this.f11460x0);
        p.b.g(h1().itemMark.tvMark7, this.f11460x0);
        p.b.g(h1().itemMark.tvMark8, this.f11460x0);
        G(i1(), z.f28636a, new d(null));
        a.C0526a.b(this, i1(), new t() { // from class: com.topstep.fitcloud.pro.ui.friend.FriendAddFragment.e
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((ei.a) obj).f13683a;
            }
        }, v6.b.i(i1()), new f(null), new g(null));
    }

    @Override // v6.a
    public final u a() {
        return a.C0526a.a(this);
    }

    @Override // v6.a
    public final z1 e(v6.b bVar, t tVar, u6.f fVar, p pVar) {
        return a.C0526a.e(this, bVar, tVar, fVar, pVar);
    }

    @Override // d7.d.a
    public final void g(int i10) {
        if (i10 == this.f11456t0) {
            tb.a.f(this).p();
        }
    }

    public final FragmentFriendAddBinding h1() {
        return (FragmentFriendAddBinding) this.f11457u0.a(this, f11455y0[0]);
    }

    public final FriendAddViewModel i1() {
        return (FriendAddViewModel) this.f11459w0.getValue();
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
