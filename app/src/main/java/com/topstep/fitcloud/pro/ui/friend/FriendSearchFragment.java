package com.topstep.fitcloud.pro.ui.friend;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.topstep.fitcloud.pro.databinding.FragmentFriendSearchBinding;
import com.topstep.fitcloud.pro.model.config.UserInfo;
import com.topstep.fitcloud.pro.model.friend.Friend;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportViewModel;
import com.topstep.fitcloud.pro.ui.friend.FriendSearchFragment;
import com.topstep.fitcloudpro.R;
import d2.a;
import ei.i1;
import ei.p0;
import ei.q0;
import ei.s0;
import ei.u0;
import ei.w0;
import fi.f;
import gm.t;
import i2.b0;
import i2.w;
import ih.v;
import java.util.List;
import kotlin.Metadata;
import mf.a0;
import pm.e0;
import pm.z1;
import u6.z;
import v6.a;

@Metadata
/* loaded from: classes2.dex */
public final class FriendSearchFragment extends i1 implements v6.a {

    /* renamed from: w0 */
    public static final /* synthetic */ mm.h<Object>[] f11654w0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11655t0;

    /* renamed from: u0 */
    public final t0 f11656u0;

    /* renamed from: v0 */
    public final fi.f f11657v0;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendSearchFragment$onViewCreated$11", f = "FriendSearchFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11659e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(2, dVar);
            FriendSearchFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((b) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f11659e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            FriendSearchFragment friendSearchFragment = FriendSearchFragment.this;
            mm.h<Object>[] hVarArr = FriendSearchFragment.f11654w0;
            qi.p.f(friendSearchFragment.f1(), (Throwable) this.f11659e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendSearchFragment$onViewCreated$12", f = "FriendSearchFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements fm.p<ei.g, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11661e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(2, dVar);
            FriendSearchFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(ei.g gVar, xl.d<? super tl.l> dVar) {
            return ((c) p(gVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f11661e = obj;
            return cVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            b0 a10;
            i2.m f10;
            w p0Var;
            a0.k(obj);
            ei.g gVar = (ei.g) this.f11661e;
            if (gVar.f13733a != null) {
                b0.a d10 = v.d();
                d10.b(R.id.friendPreSearchFragment, false);
                a10 = d10.a();
                f10 = tb.a.f(FriendSearchFragment.this);
                Friend friend = gVar.f13733a;
                gm.l.f(friend, "friend");
                p0Var = new q0(friend);
            } else {
                if (gVar.f13734b != null) {
                    b0.a d11 = v.d();
                    d11.b(R.id.friendPreSearchFragment, false);
                    a10 = d11.a();
                    f10 = tb.a.f(FriendSearchFragment.this);
                    UserInfo userInfo = gVar.f13734b;
                    gm.l.f(userInfo, "user");
                    p0Var = new p0(userInfo);
                }
                return tl.l.f28297a;
            }
            v.m(f10, p0Var, a10);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendSearchFragment$onViewCreated$1", f = "FriendSearchFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements fm.p<e0, xl.d<? super tl.l>, Object> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            FriendSearchFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((d) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new d(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            FriendSearchFragment friendSearchFragment = FriendSearchFragment.this;
            mm.h<Object>[] hVarArr = FriendSearchFragment.f11654w0;
            friendSearchFragment.j1().editSearch.requestFocus();
            Object systemService = FriendSearchFragment.this.V0().getSystemService("input_method");
            gm.l.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(FriendSearchFragment.this.j1().editSearch, 0);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements f.b {
        public e() {
            FriendSearchFragment.this = r1;
        }

        @Override // fi.f.b
        public final void a(UserInfo userInfo) {
            gm.l.f(userInfo, "item");
            FriendSearchFragment.h1(FriendSearchFragment.this, userInfo);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements TextWatcher {
        public f() {
            FriendSearchFragment.this = r1;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean z10;
            gm.l.f(editable, "s");
            FriendSearchFragment friendSearchFragment = FriendSearchFragment.this;
            mm.h<Object>[] hVarArr = FriendSearchFragment.f11654w0;
            EditText editText = friendSearchFragment.j1().editSearch;
            gm.l.e(editText, "viewBind.editSearch");
            String h10 = qi.h.h(editText);
            if (h10.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                FriendSearchFragment.this.j1().layoutSearchAction.setVisibility(8);
            } else {
                FriendSearchFragment.this.j1().layoutSearchAction.setVisibility(0);
                FriendSearchFragment.this.j1().tvSearchContent.setText(h10);
            }
            FriendSearchFragment.this.j1().layoutSearchResult.setVisibility(8);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            gm.l.f(charSequence, "s");
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            gm.l.f(charSequence, "s");
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends gm.m implements fm.l<LinearLayout, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g() {
            super(1);
            FriendSearchFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(LinearLayout linearLayout) {
            gm.l.f(linearLayout, "it");
            FriendSearchFragment friendSearchFragment = FriendSearchFragment.this;
            mm.h<Object>[] hVarArr = FriendSearchFragment.f11654w0;
            friendSearchFragment.i1();
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendSearchFragment$onViewCreated$6", f = "FriendSearchFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends zl.i implements fm.p<w0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11667e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(xl.d<? super h> dVar) {
            super(2, dVar);
            FriendSearchFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(w0 w0Var, xl.d<? super tl.l> dVar) {
            return ((h) p(w0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            h hVar = new h(dVar);
            hVar.f11667e = obj;
            return hVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            boolean z10;
            a0.k(obj);
            w0 w0Var = (w0) this.f11667e;
            if (!(w0Var.f13796a instanceof u6.l) && !(w0Var.f13797b instanceof u6.l)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                FriendSearchFragment friendSearchFragment = FriendSearchFragment.this;
                mm.h<Object>[] hVarArr = FriendSearchFragment.f11654w0;
                d7.e.g(friendSearchFragment.e1());
            } else {
                FriendSearchFragment friendSearchFragment2 = FriendSearchFragment.this;
                mm.h<Object>[] hVarArr2 = FriendSearchFragment.f11654w0;
                friendSearchFragment2.e1().a();
            }
            u6.a<List<UserInfo>> aVar = w0Var.f13796a;
            if (aVar instanceof u6.a0) {
                List<UserInfo> a10 = aVar.a();
                if (a10 != null && a10.size() > 1) {
                    FriendSearchFragment.this.j1().layoutSearchAction.setVisibility(8);
                    FriendSearchFragment.this.j1().layoutSearchResult.setVisibility(0);
                    FriendSearchFragment.this.f11657v0.f14294d = a10;
                } else {
                    FriendSearchFragment.this.f11657v0.f14294d = null;
                }
                FriendSearchFragment.this.f11657v0.h();
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendSearchFragment$onViewCreated$8", f = "FriendSearchFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11670e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(xl.d<? super j> dVar) {
            super(2, dVar);
            FriendSearchFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((j) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            j jVar = new j(dVar);
            jVar.f11670e = obj;
            return jVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            FriendSearchFragment friendSearchFragment = FriendSearchFragment.this;
            mm.h<Object>[] hVarArr = FriendSearchFragment.f11654w0;
            qi.p.f(friendSearchFragment.f1(), (Throwable) this.f11670e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.friend.FriendSearchFragment$onViewCreated$9", f = "FriendSearchFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends zl.i implements fm.p<List<? extends UserInfo>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11672e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(xl.d<? super k> dVar) {
            super(2, dVar);
            FriendSearchFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(List<? extends UserInfo> list, xl.d<? super tl.l> dVar) {
            return ((k) p(list, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            k kVar = new k(dVar);
            kVar.f11672e = obj;
            return kVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            List list = (List) this.f11672e;
            if (list != null && list.size() == 1) {
                FriendSearchFragment.h1(FriendSearchFragment.this, (UserInfo) list.get(0));
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends gm.m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f11674b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(r rVar) {
            super(0);
            this.f11674b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f11674b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends gm.m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f11675b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(l lVar) {
            super(0);
            this.f11675b = lVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f11675b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends gm.m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11676b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(tl.d dVar) {
            super(0);
            this.f11676b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f11676b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends gm.m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11677b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(tl.d dVar) {
            super(0);
            this.f11677b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f11677b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class p extends gm.m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f11678b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11679c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(r rVar, tl.d dVar) {
            super(0);
            this.f11678b = rVar;
            this.f11679c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f11679c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f11678b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(FriendSearchFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentFriendSearchBinding;", 0);
        gm.b0.f15488a.getClass();
        f11654w0 = new mm.h[]{tVar};
    }

    public FriendSearchFragment() {
        super(R.layout.fragment_friend_search);
        this.f11655t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentFriendSearchBinding.class, this);
        tl.d a10 = fb.e.a(new m(new l(this)));
        this.f11656u0 = ab.b.f(this, gm.b0.a(FriendSearchViewModel.class), new n(a10), new o(a10), new p(this, a10));
        this.f11657v0 = new fi.f();
    }

    public static final void h1(FriendSearchFragment friendSearchFragment, UserInfo userInfo) {
        if (friendSearchFragment.k1().f11681k == userInfo.getUserId()) {
            b0.a d10 = v.d();
            d10.b(R.id.friendPreSearchFragment, false);
            try {
                tb.a.f(friendSearchFragment).l(R.id.toEditUser, new Bundle(), d10.a());
                return;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        FriendSearchViewModel k12 = friendSearchFragment.k1();
        k12.getClass();
        v6.b.f(k12, new s0(k12, userInfo, null), null, ei.t0.f13788b, 3);
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, fm.p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        qi.h.j(this).b(new d(null));
        j1().editSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ei.o0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                FriendSearchFragment friendSearchFragment = FriendSearchFragment.this;
                mm.h<Object>[] hVarArr = FriendSearchFragment.f11654w0;
                gm.l.f(friendSearchFragment, "this$0");
                if (i10 == 3) {
                    friendSearchFragment.i1();
                    return false;
                }
                return false;
            }
        });
        RecyclerView recyclerView = j1().recyclerView;
        V0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        j1().recyclerView.g(new oi.a(V0()));
        j1().recyclerView.setAdapter(this.f11657v0);
        this.f11657v0.f14295e = new e();
        j1().editSearch.addTextChangedListener(new f());
        p.b.g(j1().layoutSearchAction, new g());
        G(k1(), z.f28636a, new h(null));
        a.C0526a.b(this, k1(), new t() { // from class: com.topstep.fitcloud.pro.ui.friend.FriendSearchFragment.i
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((w0) obj).f13796a;
            }
        }, v6.b.i(k1()), new j(null), new k(null));
        a.C0526a.b(this, k1(), new t() { // from class: com.topstep.fitcloud.pro.ui.friend.FriendSearchFragment.a
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((w0) obj).f13797b;
            }
        }, v6.b.i(k1()), new b(null), new c(null));
    }

    @Override // v6.a
    public final u a() {
        return a.C0526a.a(this);
    }

    @Override // v6.a
    public final z1 e(v6.b bVar, t tVar, u6.f fVar, fm.p pVar) {
        return a.C0526a.e(this, bVar, tVar, fVar, pVar);
    }

    public final void i1() {
        EditText editText = j1().editSearch;
        gm.l.e(editText, "viewBind.editSearch");
        String h10 = qi.h.h(editText);
        FriendSearchViewModel k12 = k1();
        k12.getClass();
        gm.l.f(h10, "content");
        v6.b.f(k12, new u0(k12, h10, null), null, ei.v0.f13794b, 3);
    }

    public final FragmentFriendSearchBinding j1() {
        return (FragmentFriendSearchBinding) this.f11655t0.a(this, f11654w0[0]);
    }

    @Override // v6.a
    public final z1 k(EcgHealthReportViewModel ecgHealthReportViewModel, u6.f fVar, EcgHealthReportActivity.i iVar) {
        return a.C0526a.d(this, ecgHealthReportViewModel, EcgHealthReportActivity.g.f10707g, EcgHealthReportActivity.h.f10708g, fVar, iVar);
    }

    public final FriendSearchViewModel k1() {
        return (FriendSearchViewModel) this.f11656u0.getValue();
    }

    @Override // v6.a
    public final z1 n(v6.b bVar, t tVar, u6.f fVar, fm.p pVar, fm.p pVar2) {
        return a.C0526a.b(this, bVar, tVar, fVar, pVar, pVar2);
    }
}
