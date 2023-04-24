package com.topstep.fitcloud.pro.ui.friend;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.r;
import androidx.fragment.app.x;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import bi.z0;
import com.topstep.fitcloud.pro.databinding.FragmentFriendRenameBinding;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import com.topstep.fitcloudpro.R;
import d2.a;
import ei.h1;
import ei.k0;
import ei.m0;
import ei.n0;
import ei.y0;
import fm.p;
import gm.b0;
import gm.t;
import kotlin.Metadata;
import mf.a0;
import pm.z1;
import u6.z;
import v6.a;

@Metadata
/* loaded from: classes2.dex */
public final class FriendRenameFragment extends h1 implements v6.a {

    /* renamed from: y0 */
    public static final /* synthetic */ mm.h<Object>[] f11627y0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11628t0;

    /* renamed from: u0 */
    public final t0 f11629u0;

    /* renamed from: v0 */
    public final t0 f11630v0;

    /* renamed from: w0 */
    public final i2.g f11631w0;

    /* renamed from: x0 */
    public final a f11632x0;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            FriendRenameFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            View view2 = view;
            gm.l.f(view2, "view");
            FriendRenameFragment friendRenameFragment = FriendRenameFragment.this;
            mm.h<Object>[] hVarArr = FriendRenameFragment.f11627y0;
            friendRenameFragment.h1().itemMark.editMark.setText(((TextView) view2).getText());
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.l<Button, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(1);
            FriendRenameFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(Button button) {
            gm.l.f(button, "it");
            FriendRenameFragment friendRenameFragment = FriendRenameFragment.this;
            mm.h<Object>[] hVarArr = FriendRenameFragment.f11627y0;
            FriendRenameViewModel friendRenameViewModel = (FriendRenameViewModel) friendRenameFragment.f11629u0.getValue();
            long j10 = ((k0) FriendRenameFragment.this.f11631w0.getValue()).f13760a;
            EditText editText = FriendRenameFragment.this.h1().itemMark.editMark;
            gm.l.e(editText, "viewBind.itemMark.editMark");
            String h10 = qi.h.h(editText);
            friendRenameViewModel.getClass();
            gm.l.f(h10, "mark");
            v6.b.f(friendRenameViewModel, new m0(friendRenameViewModel, j10, h10, null), null, n0.f13772b, 3);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendRenameFragment$onViewCreated$2", f = "FriendRenameFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements p<ei.a<String>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11635e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(2, dVar);
            FriendRenameFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(ei.a<String> aVar, xl.d<? super tl.l> dVar) {
            return ((c) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f11635e = obj;
            return cVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            u6.a<T> aVar = ((ei.a) this.f11635e).f13683a;
            FriendRenameFragment friendRenameFragment = FriendRenameFragment.this;
            mm.h<Object>[] hVarArr = FriendRenameFragment.f11627y0;
            qi.p.a(aVar, friendRenameFragment.e1());
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendRenameFragment$onViewCreated$4", f = "FriendRenameFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends zl.i implements p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11638e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(2, dVar);
            FriendRenameFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((e) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f11638e = obj;
            return eVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            FriendRenameFragment friendRenameFragment = FriendRenameFragment.this;
            mm.h<Object>[] hVarArr = FriendRenameFragment.f11627y0;
            qi.p.f(friendRenameFragment.f1(), (Throwable) this.f11638e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendRenameFragment$onViewCreated$5", f = "FriendRenameFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends zl.i implements p<String, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11640e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(2, dVar);
            FriendRenameFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(String str, xl.d<? super tl.l> dVar) {
            return ((f) p(str, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            f fVar = new f(dVar);
            fVar.f11640e = obj;
            return fVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            String str = (String) this.f11640e;
            FriendViewModel friendViewModel = (FriendViewModel) FriendRenameFragment.this.f11630v0.getValue();
            long j10 = ((k0) FriendRenameFragment.this.f11631w0.getValue()).f13760a;
            friendViewModel.getClass();
            gm.l.f(str, "mark");
            friendViewModel.f11683k.put(Long.valueOf(j10), str);
            z0.g(rm.l.h(friendViewModel), null, 0, new y0(friendViewModel, j10, str, null), 3);
            tb.a.f(FriendRenameFragment.this).p();
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends gm.m implements fm.a<i2.j> {

        /* renamed from: b */
        public final /* synthetic */ r f11642b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(r rVar) {
            super(0);
            this.f11642b = rVar;
        }

        @Override // fm.a
        public final i2.j m() {
            return tb.a.f(this.f11642b).f(R.id.friend_nav_graph);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11643b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(tl.i iVar) {
            super(0);
            this.f11643b = iVar;
        }

        @Override // fm.a
        public final x0 m() {
            i2.j jVar = (i2.j) this.f11643b.getValue();
            gm.l.e(jVar, "backStackEntry");
            x0 z10 = jVar.z();
            gm.l.e(z10, "backStackEntry.viewModelStore");
            return z10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f11644b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11645c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(r rVar, tl.i iVar) {
            super(0);
            this.f11644b = rVar;
            this.f11645c = iVar;
        }

        @Override // fm.a
        public final v0.b m() {
            x T0 = this.f11644b.T0();
            i2.j jVar = (i2.j) this.f11645c.getValue();
            gm.l.e(jVar, "backStackEntry");
            return p.b.i(T0, jVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends gm.m implements fm.a<Bundle> {

        /* renamed from: b */
        public final /* synthetic */ r f11646b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(r rVar) {
            super(0);
            this.f11646b = rVar;
        }

        @Override // fm.a
        public final Bundle m() {
            Bundle bundle = this.f11646b.f2516f;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(androidx.fragment.app.n.a(android.support.v4.media.d.a("Fragment "), this.f11646b, " has null arguments"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends gm.m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f11647b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(r rVar) {
            super(0);
            this.f11647b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f11647b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends gm.m implements fm.a<androidx.lifecycle.y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f11648b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f11648b = kVar;
        }

        @Override // fm.a
        public final androidx.lifecycle.y0 m() {
            return (androidx.lifecycle.y0) this.f11648b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11649b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(tl.d dVar) {
            super(0);
            this.f11649b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f11649b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11650b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(tl.d dVar) {
            super(0);
            this.f11650b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            androidx.lifecycle.y0 b10 = ab.b.b(this.f11650b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f11651b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11652c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(r rVar, tl.d dVar) {
            super(0);
            this.f11651b = rVar;
            this.f11652c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            androidx.lifecycle.y0 b10 = ab.b.b(this.f11652c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f11651b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(FriendRenameFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentFriendRenameBinding;", 0);
        b0.f15488a.getClass();
        f11627y0 = new mm.h[]{tVar};
    }

    public FriendRenameFragment() {
        super(R.layout.fragment_friend_rename);
        this.f11628t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentFriendRenameBinding.class, this);
        tl.d a10 = fb.e.a(new l(new k(this)));
        this.f11629u0 = ab.b.f(this, b0.a(FriendRenameViewModel.class), new m(a10), new n(a10), new o(this, a10));
        tl.i iVar = new tl.i(new g(this));
        this.f11630v0 = ab.b.e(this, b0.a(FriendViewModel.class), new h(iVar), new i(this, iVar));
        this.f11631w0 = new i2.g(b0.a(k0.class), new j(this));
        this.f11632x0 = new a();
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        p.b.g(h1().btnSave, new b());
        p.b.g(h1().itemMark.tvMark1, this.f11632x0);
        p.b.g(h1().itemMark.tvMark2, this.f11632x0);
        p.b.g(h1().itemMark.tvMark3, this.f11632x0);
        p.b.g(h1().itemMark.tvMark4, this.f11632x0);
        p.b.g(h1().itemMark.tvMark5, this.f11632x0);
        p.b.g(h1().itemMark.tvMark6, this.f11632x0);
        p.b.g(h1().itemMark.tvMark7, this.f11632x0);
        p.b.g(h1().itemMark.tvMark8, this.f11632x0);
        G((FriendRenameViewModel) this.f11629u0.getValue(), z.f28636a, new c(null));
        a.C0526a.b(this, (FriendRenameViewModel) this.f11629u0.getValue(), new t() { // from class: com.topstep.fitcloud.pro.ui.friend.FriendRenameFragment.d
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((ei.a) obj).f13683a;
            }
        }, v6.b.i((FriendRenameViewModel) this.f11629u0.getValue()), new e(null), new f(null));
    }

    @Override // v6.a
    public final u a() {
        return a.C0526a.a(this);
    }

    @Override // v6.a
    public final z1 e(v6.b bVar, t tVar, u6.f fVar, p pVar) {
        return a.C0526a.e(this, bVar, tVar, fVar, pVar);
    }

    public final FragmentFriendRenameBinding h1() {
        return (FragmentFriendRenameBinding) this.f11628t0.a(this, f11627y0[0]);
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
