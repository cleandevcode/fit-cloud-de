package com.topstep.fitcloud.pro.ui.settings;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import androidx.fragment.app.x;
import androidx.lifecycle.u;
import bi.m0;
import cn.sharesdk.facebook.Facebook;
import cn.sharesdk.sina.weibo.SinaWeibo;
import cn.sharesdk.tencent.qq.QQ;
import cn.sharesdk.wechat.friends.Wechat;
import com.google.android.material.textfield.TextInputEditText;
import com.topstep.fitcloud.pro.databinding.FragmentAccountDeleteBinding;
import com.topstep.fitcloud.pro.ui.auth.AuthActivity;
import com.topstep.fitcloudpro.R;
import d7.d;
import eh.a;
import eh.j;
import fm.l;
import gm.b0;
import gm.m;
import gm.t;
import ii.f;
import java.util.concurrent.CancellationException;
import jh.n;
import jh.o;
import jh.r;
import kotlin.Metadata;
import mf.a0;
import oc.g1;
import pm.z1;
import qi.p;
import s.h1;
import y3.c0;
import y3.e1;
import y3.g0;
import y3.k0;
import yb.y;

@Metadata
/* loaded from: classes2.dex */
public final class AccountDeleteFragment extends lh.i implements g0, d.a {

    /* renamed from: s0 */
    public static final /* synthetic */ mm.h<Object>[] f11769s0;

    /* renamed from: o0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11770o0;

    /* renamed from: p0 */
    public final tl.d f11771p0;

    /* renamed from: q0 */
    public final int f11772q0;

    /* renamed from: r0 */
    public final a f11773r0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            AccountDeleteFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            ii.j h12;
            String str;
            View view2 = view;
            gm.l.f(view2, "view");
            AccountDeleteFragment accountDeleteFragment = AccountDeleteFragment.this;
            mm.h<Object>[] hVarArr = AccountDeleteFragment.f11769s0;
            if (gm.l.a(view2, accountDeleteFragment.g1().btnSignIn)) {
                f.a aVar = ii.f.C0;
                TextInputEditText textInputEditText = AccountDeleteFragment.this.g1().editPwd;
                gm.l.e(textInputEditText, "viewBind.editPwd");
                String h10 = qi.h.h(textInputEditText);
                aVar.getClass();
                gm.l.f(h10, "password");
                ii.f fVar = new ii.f();
                Bundle bundle = new Bundle();
                bundle.putParcelable("parcelArgs", new a.C0241a(h10, null, null, true));
                fVar.Z0(bundle);
                fVar.h1(AccountDeleteFragment.this.h0(), null);
            } else {
                if (gm.l.a(view2, AccountDeleteFragment.this.g1().imgWechat)) {
                    h12 = AccountDeleteFragment.this.h1();
                    str = Wechat.NAME;
                } else if (gm.l.a(view2, AccountDeleteFragment.this.g1().imgQq)) {
                    h12 = AccountDeleteFragment.this.h1();
                    str = QQ.NAME;
                } else if (gm.l.a(view2, AccountDeleteFragment.this.g1().imgSina)) {
                    h12 = AccountDeleteFragment.this.h1();
                    str = SinaWeibo.NAME;
                } else if (gm.l.a(view2, AccountDeleteFragment.this.g1().imgFacebook)) {
                    h12 = AccountDeleteFragment.this.h1();
                    str = Facebook.NAME;
                }
                gm.l.e(str, "NAME");
                h12.getClass();
                k0.a(h12, new ii.k(h12, str, null), ii.l.f16962b);
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements l<ii.i, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(1);
            AccountDeleteFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(ii.i iVar) {
            ii.i iVar2 = iVar;
            gm.l.f(iVar2, "it");
            y3.b<tl.l> bVar = iVar2.f16939b;
            AccountDeleteFragment accountDeleteFragment = AccountDeleteFragment.this;
            mm.h<Object>[] hVarArr = AccountDeleteFragment.f11769s0;
            p.b(bVar, accountDeleteFragment.e1());
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.AccountDeleteFragment$onCreate$2", f = "AccountDeleteFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11777e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            AccountDeleteFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((d) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f11777e = obj;
            return dVar2;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            AccountDeleteFragment accountDeleteFragment = AccountDeleteFragment.this;
            mm.h<Object>[] hVarArr = AccountDeleteFragment.f11769s0;
            p.f(accountDeleteFragment.f1(), (Throwable) this.f11777e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.AccountDeleteFragment$onCreate$3", f = "AccountDeleteFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends zl.i implements fm.p<tl.l, xl.d<? super tl.l>, Object> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(2, dVar);
            AccountDeleteFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(tl.l lVar, xl.d<? super tl.l> dVar) {
            return ((e) p(lVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new e(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            AccountDeleteFragment accountDeleteFragment = AccountDeleteFragment.this;
            mm.h<Object>[] hVarArr = AccountDeleteFragment.f11769s0;
            d7.e.h(accountDeleteFragment.f1(), R.string.account_delete_success, true, AccountDeleteFragment.this.f11772q0, 12);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.AccountDeleteFragment$onCreate$5", f = "AccountDeleteFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11781e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(xl.d<? super g> dVar) {
            super(2, dVar);
            AccountDeleteFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((g) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            g gVar = new g(dVar);
            gVar.f11781e = obj;
            return gVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            d7.e f12;
            int i10;
            a0.k(obj);
            Throwable th2 = (Throwable) this.f11781e;
            if (th2 instanceof r) {
                AccountDeleteFragment accountDeleteFragment = AccountDeleteFragment.this;
                mm.h<Object>[] hVarArr = AccountDeleteFragment.f11769s0;
                f12 = accountDeleteFragment.f1();
                i10 = R.string.account_no_app;
            } else if (th2 instanceof o) {
                AccountDeleteFragment accountDeleteFragment2 = AccountDeleteFragment.this;
                mm.h<Object>[] hVarArr2 = AccountDeleteFragment.f11769s0;
                f12 = accountDeleteFragment2.f1();
                i10 = R.string.account_auth_error;
            } else {
                if (!(th2 instanceof n) && !(th2 instanceof CancellationException)) {
                    AccountDeleteFragment accountDeleteFragment3 = AccountDeleteFragment.this;
                    mm.h<Object>[] hVarArr3 = AccountDeleteFragment.f11769s0;
                    p.f(accountDeleteFragment3.f1(), th2);
                }
                return tl.l.f28297a;
            }
            d7.e.d(f12, i10, null, 0, 30);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.AccountDeleteFragment$onCreate$6", f = "AccountDeleteFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends zl.i implements fm.p<j.a, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11783e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(xl.d<? super h> dVar) {
            super(2, dVar);
            AccountDeleteFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(j.a aVar, xl.d<? super tl.l> dVar) {
            return ((h) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            h hVar = new h(dVar);
            hVar.f11783e = obj;
            return hVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            j.a aVar = (j.a) this.f11783e;
            f.a aVar2 = ii.f.C0;
            String str = aVar.f13666a;
            String str2 = aVar.f13667b;
            aVar2.getClass();
            gm.l.f(str, "openAppId");
            gm.l.f(str2, "openAppName");
            ii.f fVar = new ii.f();
            Bundle bundle = new Bundle();
            bundle.putParcelable("parcelArgs", new a.C0241a(null, str, str2, false));
            fVar.Z0(bundle);
            fVar.h1(AccountDeleteFragment.this.h0(), null);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i implements TextWatcher {
        public i() {
            AccountDeleteFragment.this = r1;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean z10;
            AccountDeleteFragment accountDeleteFragment = AccountDeleteFragment.this;
            mm.h<Object>[] hVarArr = AccountDeleteFragment.f11769s0;
            Button button = accountDeleteFragment.g1().btnSignIn;
            TextInputEditText textInputEditText = AccountDeleteFragment.this.g1().editPwd;
            gm.l.e(textInputEditText, "viewBind.editPwd");
            if (qi.h.h(textInputEditText).length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            button.setEnabled(z10);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends m implements l<c0<ii.j, ii.i>, ii.j> {

        /* renamed from: b */
        public final /* synthetic */ mm.b f11786b;

        /* renamed from: c */
        public final /* synthetic */ androidx.fragment.app.r f11787c;

        /* renamed from: d */
        public final /* synthetic */ mm.b f11788d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(androidx.fragment.app.r rVar, gm.e eVar, gm.e eVar2) {
            super(1);
            this.f11786b = eVar;
            this.f11787c = rVar;
            this.f11788d = eVar2;
        }

        /* JADX WARN: Type inference failed for: r8v7, types: [y3.k0, ii.j] */
        @Override // fm.l
        public final ii.j k(c0<ii.j, ii.i> c0Var) {
            c0<ii.j, ii.i> c0Var2 = c0Var;
            gm.l.f(c0Var2, "stateFactory");
            return h1.o(m0.p(this.f11786b), ii.i.class, new y3.o(this.f11787c.T0(), h1.c(this.f11787c), this.f11787c), m0.p(this.f11788d).getName(), false, c0Var2, 16);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends y {

        /* renamed from: c */
        public final /* synthetic */ mm.b f11789c;

        /* renamed from: d */
        public final /* synthetic */ l f11790d;

        /* renamed from: e */
        public final /* synthetic */ mm.b f11791e;

        public k(gm.e eVar, j jVar, gm.e eVar2) {
            this.f11789c = eVar;
            this.f11790d = jVar;
            this.f11791e = eVar2;
        }

        public final tl.d C(Object obj, mm.h hVar) {
            androidx.fragment.app.r rVar = (androidx.fragment.app.r) obj;
            gm.l.f(rVar, "thisRef");
            gm.l.f(hVar, "property");
            return g1.f22980a.b(rVar, hVar, this.f11789c, new com.topstep.fitcloud.pro.ui.settings.d(this.f11791e), b0.a(ii.i.class), false, this.f11790d);
        }
    }

    static {
        t tVar = new t(AccountDeleteFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentAccountDeleteBinding;", 0);
        gm.c0 c0Var = b0.f15488a;
        c0Var.getClass();
        t tVar2 = new t(AccountDeleteFragment.class, "viewModel", "getViewModel()Lcom/topstep/fitcloud/pro/ui/settings/AccountDeleteViewModel;", 0);
        c0Var.getClass();
        f11769s0 = new mm.h[]{tVar, tVar2};
    }

    public AccountDeleteFragment() {
        super(R.layout.fragment_account_delete);
        this.f11770o0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentAccountDeleteBinding.class, this);
        gm.e a10 = b0.a(ii.j.class);
        this.f11771p0 = new k(a10, new j(this, a10, a10), a10).C(this, f11769s0[1]);
        this.f11772q0 = 1;
        this.f11773r0 = new a();
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        g0.a.c(this, h1(), new t() { // from class: com.topstep.fitcloud.pro.ui.settings.AccountDeleteFragment.c
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((ii.i) obj).f16939b;
            }
        }, i1(null), new d(null), new e(null));
        g0.a.c(this, h1(), new t() { // from class: com.topstep.fitcloud.pro.ui.settings.AccountDeleteFragment.f
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((ii.i) obj).f16938a;
            }
        }, i1(null), new g(null), new h(null));
    }

    @Override // androidx.fragment.app.r
    public final void N0() {
        this.E = true;
        x T0 = T0();
        Object systemService = T0.getSystemService("input_method");
        if (systemService != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            View currentFocus = T0.getCurrentFocus();
            if (currentFocus != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        TextInputEditText textInputEditText = g1().editPwd;
        gm.l.e(textInputEditText, "viewBind.editPwd");
        textInputEditText.addTextChangedListener(new i());
        p.b.g(g1().btnSignIn, this.f11773r0);
        p.b.g(g1().imgWechat, this.f11773r0);
        p.b.g(g1().imgQq, this.f11773r0);
        p.b.g(g1().imgSina, this.f11773r0);
        p.b.g(g1().imgFacebook, this.f11773r0);
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

    @Override // d7.d.a
    public final void g(int i10) {
        if (i10 == this.f11772q0) {
            int i11 = AuthActivity.f10303x;
            AuthActivity.a.a(V0());
            T0().finish();
        }
    }

    public final FragmentAccountDeleteBinding g1() {
        return (FragmentAccountDeleteBinding) this.f11770o0.a(this, f11769s0[0]);
    }

    public final ii.j h1() {
        return (ii.j) this.f11771p0.getValue();
    }

    @Override // y3.g0
    public final String i() {
        return g0.a.a(this).f30958d;
    }

    public final e1 i1(String str) {
        return g0.a.h(this, str);
    }

    @Override // y3.g0
    public final void invalidate() {
        gm.j.p(h1(), new b());
    }
}
