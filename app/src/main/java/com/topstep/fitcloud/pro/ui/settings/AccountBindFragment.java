package com.topstep.fitcloud.pro.ui.settings;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.n;
import androidx.fragment.app.r;
import androidx.fragment.app.x;
import androidx.lifecycle.u;
import bi.m0;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.topstep.fitcloud.pro.databinding.FragmentResetPwdBinding;
import com.topstep.fitcloudpro.R;
import d7.d;
import gm.b0;
import gm.t;
import jh.e;
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
import y3.o;
import yb.y;

@Metadata
/* loaded from: classes2.dex */
public final class AccountBindFragment extends lh.i implements g0, d.a {

    /* renamed from: w0 */
    public static final /* synthetic */ mm.h<Object>[] f11736w0;

    /* renamed from: o0 */
    public final i2.g f11737o0;

    /* renamed from: p0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11738p0;

    /* renamed from: q0 */
    public final tl.d f11739q0;

    /* renamed from: r0 */
    public jh.e f11740r0;

    /* renamed from: s0 */
    public final tl.d f11741s0;

    /* renamed from: t0 */
    public final int f11742t0;

    /* renamed from: u0 */
    public final a f11743u0;

    /* renamed from: v0 */
    public final m f11744v0;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            AccountBindFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            View view2 = view;
            gm.l.f(view2, "view");
            AccountBindFragment accountBindFragment = AccountBindFragment.this;
            mm.h<Object>[] hVarArr = AccountBindFragment.f11736w0;
            if (gm.l.a(view2, accountBindFragment.g1().btnAuthCode)) {
                TextInputEditText textInputEditText = AccountBindFragment.this.g1().editUsername;
                gm.l.e(textInputEditText, "viewBind.editUsername");
                ((jh.c) AccountBindFragment.this.f11739q0.getValue()).c(qi.h.h(textInputEditText), false);
            } else if (gm.l.a(view2, AccountBindFragment.this.g1().btnCommit)) {
                ii.c cVar = (ii.c) AccountBindFragment.this.f11741s0.getValue();
                TextInputEditText textInputEditText2 = AccountBindFragment.this.g1().editUsername;
                gm.l.e(textInputEditText2, "viewBind.editUsername");
                String h10 = qi.h.h(textInputEditText2);
                TextInputEditText textInputEditText3 = AccountBindFragment.this.g1().editPwd;
                gm.l.e(textInputEditText3, "viewBind.editPwd");
                String h11 = qi.h.h(textInputEditText3);
                TextInputEditText textInputEditText4 = AccountBindFragment.this.g1().editAuthCode;
                gm.l.e(textInputEditText4, "viewBind.editAuthCode");
                String h12 = qi.h.h(textInputEditText4);
                cVar.getClass();
                gm.l.f(h10, "username");
                gm.l.f(h11, "password");
                gm.l.f(h12, "authCode");
                k0.a(cVar, new ii.d(cVar, h10, h11, h12, null), ii.e.f16915b);
            } else if (gm.l.a(view2, AccountBindFragment.this.g1().imgAuthCodeHelp)) {
                new kh.a().h1(AccountBindFragment.this.h0(), null);
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends gm.m implements fm.l<jh.b, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(1);
            AccountBindFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(jh.b bVar) {
            boolean z10;
            jh.b bVar2 = bVar;
            gm.l.f(bVar2, "it");
            y3.b<tl.l> bVar3 = bVar2.f17739b;
            AccountBindFragment accountBindFragment = AccountBindFragment.this;
            mm.h<Object>[] hVarArr = AccountBindFragment.f11736w0;
            p.b(bVar3, accountBindFragment.e1());
            if (bVar2.f17740c > 0) {
                AccountBindFragment.this.g1().btnAuthCode.setEnabled(false);
                AccountBindFragment.this.g1().btnAuthCode.setText(AccountBindFragment.this.p0(R.string.unit_second_short_param, Integer.valueOf(bVar2.f17740c)));
            } else {
                Button button = AccountBindFragment.this.g1().btnAuthCode;
                jh.e eVar = AccountBindFragment.this.f11740r0;
                if (eVar != null) {
                    button.setEnabled(eVar.f17781i);
                    AccountBindFragment.this.g1().btnAuthCode.setText(R.string.account_request_auth_code);
                } else {
                    gm.l.l("watcher");
                    throw null;
                }
            }
            String str = bVar2.f17738a;
            if (str != null && str.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                AccountBindFragment.this.g1().tvAuthCodeTips.setText((CharSequence) null);
            } else {
                String p02 = AccountBindFragment.this.p0(R.string.account_auth_code_tips2, bVar2.f17738a);
                gm.l.e(p02, "getString(R.string.accou…ernameWhoRequestAuthCode)");
                TextView textView = AccountBindFragment.this.g1().tvAuthCodeTips;
                gm.l.e(textView, "viewBind.tvAuthCodeTips");
                k7.a.a(textView, p02, bVar2.f17738a, com.topstep.fitcloud.pro.ui.settings.a.f11945b);
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.AccountBindFragment$onCreate$2", f = "AccountBindFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11748e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            AccountBindFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((d) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f11748e = obj;
            return dVar2;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            AccountBindFragment accountBindFragment = AccountBindFragment.this;
            mm.h<Object>[] hVarArr = AccountBindFragment.f11736w0;
            p.f(accountBindFragment.f1(), (Throwable) this.f11748e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.AccountBindFragment$onCreate$4", f = "AccountBindFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11751e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(2, dVar);
            AccountBindFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((f) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            f fVar = new f(dVar);
            fVar.f11751e = obj;
            return fVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            AccountBindFragment accountBindFragment = AccountBindFragment.this;
            mm.h<Object>[] hVarArr = AccountBindFragment.f11736w0;
            p.f(accountBindFragment.f1(), (Throwable) this.f11751e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.AccountBindFragment$onCreate$5", f = "AccountBindFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends zl.i implements fm.p<tl.l, xl.d<? super tl.l>, Object> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(xl.d<? super g> dVar) {
            super(2, dVar);
            AccountBindFragment.this = r1;
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
            AccountBindFragment accountBindFragment = AccountBindFragment.this;
            mm.h<Object>[] hVarArr = AccountBindFragment.f11736w0;
            d7.e.h(accountBindFragment.f1(), R.string.tip_commit_success, true, AccountBindFragment.this.f11742t0, 12);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends gm.m implements fm.l<c0<jh.c, jh.b>, jh.c> {

        /* renamed from: b */
        public final /* synthetic */ mm.b f11754b;

        /* renamed from: c */
        public final /* synthetic */ r f11755c;

        /* renamed from: d */
        public final /* synthetic */ mm.b f11756d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(r rVar, gm.e eVar, gm.e eVar2) {
            super(1);
            this.f11754b = eVar;
            this.f11755c = rVar;
            this.f11756d = eVar2;
        }

        /* JADX WARN: Type inference failed for: r8v7, types: [jh.c, y3.k0] */
        @Override // fm.l
        public final jh.c k(c0<jh.c, jh.b> c0Var) {
            c0<jh.c, jh.b> c0Var2 = c0Var;
            gm.l.f(c0Var2, "stateFactory");
            return h1.o(m0.p(this.f11754b), jh.b.class, new o(this.f11755c.T0(), h1.c(this.f11755c), this.f11755c), m0.p(this.f11756d).getName(), false, c0Var2, 16);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends y {

        /* renamed from: c */
        public final /* synthetic */ mm.b f11757c;

        /* renamed from: d */
        public final /* synthetic */ fm.l f11758d;

        /* renamed from: e */
        public final /* synthetic */ mm.b f11759e;

        public i(gm.e eVar, h hVar, gm.e eVar2) {
            this.f11757c = eVar;
            this.f11758d = hVar;
            this.f11759e = eVar2;
        }

        public final tl.d C(Object obj, mm.h hVar) {
            r rVar = (r) obj;
            gm.l.f(rVar, "thisRef");
            gm.l.f(hVar, "property");
            return g1.f22980a.b(rVar, hVar, this.f11757c, new com.topstep.fitcloud.pro.ui.settings.b(this.f11759e), b0.a(jh.b.class), false, this.f11758d);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends gm.m implements fm.l<c0<ii.c, nh.d<tl.l>>, ii.c> {

        /* renamed from: b */
        public final /* synthetic */ mm.b f11760b;

        /* renamed from: c */
        public final /* synthetic */ r f11761c;

        /* renamed from: d */
        public final /* synthetic */ mm.b f11762d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(r rVar, gm.e eVar, gm.e eVar2) {
            super(1);
            this.f11760b = eVar;
            this.f11761c = rVar;
            this.f11762d = eVar2;
        }

        /* JADX WARN: Type inference failed for: r8v7, types: [ii.c, y3.k0] */
        @Override // fm.l
        public final ii.c k(c0<ii.c, nh.d<tl.l>> c0Var) {
            c0<ii.c, nh.d<tl.l>> c0Var2 = c0Var;
            gm.l.f(c0Var2, "stateFactory");
            return h1.o(m0.p(this.f11760b), nh.d.class, new o(this.f11761c.T0(), h1.c(this.f11761c), this.f11761c), m0.p(this.f11762d).getName(), false, c0Var2, 16);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends y {

        /* renamed from: c */
        public final /* synthetic */ mm.b f11763c;

        /* renamed from: d */
        public final /* synthetic */ fm.l f11764d;

        /* renamed from: e */
        public final /* synthetic */ mm.b f11765e;

        public k(gm.e eVar, j jVar, gm.e eVar2) {
            this.f11763c = eVar;
            this.f11764d = jVar;
            this.f11765e = eVar2;
        }

        public final tl.d C(Object obj, mm.h hVar) {
            r rVar = (r) obj;
            gm.l.f(rVar, "thisRef");
            gm.l.f(hVar, "property");
            return g1.f22980a.b(rVar, hVar, this.f11763c, new com.topstep.fitcloud.pro.ui.settings.c(this.f11765e), b0.a(nh.d.class), false, this.f11764d);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends gm.m implements fm.a<Bundle> {

        /* renamed from: b */
        public final /* synthetic */ r f11766b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(r rVar) {
            super(0);
            this.f11766b = rVar;
        }

        @Override // fm.a
        public final Bundle m() {
            Bundle bundle = this.f11766b.f2516f;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(n.a(android.support.v4.media.d.a("Fragment "), this.f11766b, " has null arguments"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class m implements e.a {
        public m() {
            AccountBindFragment.this = r1;
        }

        @Override // jh.e.a
        public final void a(boolean z10, boolean z11) {
            boolean z12;
            AccountBindFragment accountBindFragment = AccountBindFragment.this;
            mm.h<Object>[] hVarArr = AccountBindFragment.f11736w0;
            jh.c cVar = (jh.c) accountBindFragment.f11739q0.getValue();
            AccountBindFragment accountBindFragment2 = AccountBindFragment.this;
            gm.l.f(cVar, "repository1");
            jh.b bVar = (jh.b) cVar.f30971c.f31078c.d();
            gm.l.f(bVar, "it");
            mm.h<Object>[] hVarArr2 = AccountBindFragment.f11736w0;
            Button button = accountBindFragment2.g1().btnAuthCode;
            if (z10 && bVar.f17740c <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            button.setEnabled(z12);
            tl.l lVar = tl.l.f28297a;
            AccountBindFragment.this.g1().btnCommit.setEnabled(z11);
        }
    }

    static {
        t tVar = new t(AccountBindFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentResetPwdBinding;", 0);
        gm.c0 c0Var = b0.f15488a;
        c0Var.getClass();
        t tVar2 = new t(AccountBindFragment.class, "authCodeViewModel", "getAuthCodeViewModel()Lcom/topstep/fitcloud/pro/ui/auth/AuthCodeViewModel;", 0);
        c0Var.getClass();
        t tVar3 = new t(AccountBindFragment.class, "viewModel", "getViewModel()Lcom/topstep/fitcloud/pro/ui/settings/AccountBindViewModel;", 0);
        c0Var.getClass();
        f11736w0 = new mm.h[]{tVar, tVar2, tVar3};
    }

    public AccountBindFragment() {
        super(R.layout.fragment_reset_pwd);
        this.f11737o0 = new i2.g(b0.a(ii.b.class), new l(this));
        this.f11738p0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentResetPwdBinding.class, this);
        gm.e a10 = b0.a(jh.c.class);
        i iVar = new i(a10, new h(this, a10, a10), a10);
        mm.h<Object>[] hVarArr = f11736w0;
        this.f11739q0 = iVar.C(this, hVarArr[1]);
        gm.e a11 = b0.a(ii.c.class);
        this.f11741s0 = new k(a11, new j(this, a11, a11), a11).C(this, hVarArr[2]);
        this.f11742t0 = 1;
        this.f11743u0 = new a();
        this.f11744v0 = new m();
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        g0.a.d(this, (jh.c) this.f11739q0.getValue(), new t() { // from class: com.topstep.fitcloud.pro.ui.settings.AccountBindFragment.c
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((jh.b) obj).f17739b;
            }
        }, h1(null), new d(null), null, 8);
        g0.a.c(this, (ii.c) this.f11741s0.getValue(), new t() { // from class: com.topstep.fitcloud.pro.ui.settings.AccountBindFragment.e
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((nh.d) obj).f22382a;
            }
        }, h1(null), new f(null), new g(null));
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
        TextInputEditText textInputEditText;
        int i10;
        int i11;
        gm.l.f(view, "view");
        super.O0(view, bundle);
        g1().toolbar.setTitle(((ii.b) this.f11737o0.getValue()).f16892a.getTitleResId());
        TextInputEditText textInputEditText2 = null;
        g1().tvAuthCodeTips.setText((CharSequence) null);
        boolean isPhone = ((ii.b) this.f11737o0.getValue()).f16892a.isPhone();
        TextInputLayout textInputLayout = g1().inputUsername;
        if (isPhone) {
            textInputLayout.setHint(R.string.account_phone_number);
            textInputEditText = g1().editUsername;
            i10 = 3;
        } else {
            textInputLayout.setHint(R.string.account_email);
            textInputEditText = g1().editUsername;
            i10 = 1;
        }
        textInputEditText.setInputType(i10);
        TextInputLayout textInputLayout2 = g1().inputPwd;
        gm.l.e(textInputLayout2, "viewBind.inputPwd");
        if (((ii.b) this.f11737o0.getValue()).f16893b) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textInputLayout2.setVisibility(i11);
        TextInputEditText textInputEditText3 = g1().editUsername;
        gm.l.e(textInputEditText3, "viewBind.editUsername");
        if (((ii.b) this.f11737o0.getValue()).f16893b) {
            textInputEditText2 = g1().editPwd;
        }
        this.f11740r0 = new jh.e(textInputEditText3, textInputEditText2, g1().editAuthCode, isPhone, !isPhone, true, this.f11744v0);
        p.b.g(g1().btnAuthCode, this.f11743u0);
        p.b.g(g1().btnCommit, this.f11743u0);
        p.b.g(g1().imgAuthCodeHelp, this.f11743u0);
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
        if (i10 == this.f11742t0) {
            tb.a.f(this).p();
        }
    }

    public final FragmentResetPwdBinding g1() {
        return (FragmentResetPwdBinding) this.f11738p0.a(this, f11736w0[0]);
    }

    public final e1 h1(String str) {
        return g0.a.h(this, str);
    }

    @Override // y3.g0
    public final String i() {
        return g0.a.a(this).f30958d;
    }

    @Override // y3.g0
    public final void invalidate() {
        gm.j.p((jh.c) this.f11739q0.getValue(), new b());
        ii.c cVar = (ii.c) this.f11741s0.getValue();
        gm.l.f(cVar, "repository1");
        nh.d dVar = (nh.d) cVar.f30971c.f31078c.d();
        gm.l.f(dVar, "it");
        p.b(dVar.f22382a, e1());
        tl.l lVar = tl.l.f28297a;
    }
}
