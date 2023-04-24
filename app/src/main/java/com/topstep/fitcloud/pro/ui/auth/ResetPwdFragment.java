package com.topstep.fitcloud.pro.ui.auth;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.r;
import androidx.fragment.app.x;
import bi.m0;
import com.google.android.material.textfield.TextInputEditText;
import com.topstep.fitcloud.pro.databinding.FragmentResetPwdBinding;
import com.topstep.fitcloudpro.R;
import d7.d;
import gm.b0;
import gm.m;
import jh.e;
import jh.s;
import jh.t;
import jh.u;
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
public final class ResetPwdFragment extends lh.i implements g0, d.a {

    /* renamed from: v0 */
    public static final /* synthetic */ mm.h<Object>[] f10323v0;

    /* renamed from: o0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10324o0;

    /* renamed from: p0 */
    public final tl.d f10325p0;

    /* renamed from: q0 */
    public jh.e f10326q0;

    /* renamed from: r0 */
    public final tl.d f10327r0;

    /* renamed from: s0 */
    public final int f10328s0;

    /* renamed from: t0 */
    public final a f10329t0;

    /* renamed from: u0 */
    public final l f10330u0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements fm.l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            ResetPwdFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            View view2 = view;
            gm.l.f(view2, "view");
            ResetPwdFragment resetPwdFragment = ResetPwdFragment.this;
            mm.h<Object>[] hVarArr = ResetPwdFragment.f10323v0;
            if (gm.l.a(view2, resetPwdFragment.g1().btnAuthCode)) {
                TextInputEditText textInputEditText = ResetPwdFragment.this.g1().editUsername;
                gm.l.e(textInputEditText, "viewBind.editUsername");
                ((jh.c) ResetPwdFragment.this.f10325p0.getValue()).c(qi.h.h(textInputEditText), true);
            } else if (gm.l.a(view2, ResetPwdFragment.this.g1().btnCommit)) {
                s sVar = (s) ResetPwdFragment.this.f10327r0.getValue();
                TextInputEditText textInputEditText2 = ResetPwdFragment.this.g1().editUsername;
                gm.l.e(textInputEditText2, "viewBind.editUsername");
                String h10 = qi.h.h(textInputEditText2);
                TextInputEditText textInputEditText3 = ResetPwdFragment.this.g1().editPwd;
                gm.l.e(textInputEditText3, "viewBind.editPwd");
                String h11 = qi.h.h(textInputEditText3);
                TextInputEditText textInputEditText4 = ResetPwdFragment.this.g1().editAuthCode;
                gm.l.e(textInputEditText4, "viewBind.editAuthCode");
                String h12 = qi.h.h(textInputEditText4);
                sVar.getClass();
                gm.l.f(h10, "username");
                gm.l.f(h11, "password");
                gm.l.f(h12, "authCode");
                k0.a(sVar, new t(sVar, h10, h11, h12, null), u.f17827b);
            } else if (gm.l.a(view2, ResetPwdFragment.this.g1().imgAuthCodeHelp)) {
                new kh.a().h1(ResetPwdFragment.this.h0(), null);
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements fm.l<jh.b, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(1);
            ResetPwdFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(jh.b bVar) {
            boolean z10;
            jh.b bVar2 = bVar;
            gm.l.f(bVar2, "it");
            y3.b<tl.l> bVar3 = bVar2.f17739b;
            ResetPwdFragment resetPwdFragment = ResetPwdFragment.this;
            mm.h<Object>[] hVarArr = ResetPwdFragment.f10323v0;
            p.b(bVar3, resetPwdFragment.e1());
            if (bVar2.f17740c > 0) {
                ResetPwdFragment.this.g1().btnAuthCode.setEnabled(false);
                ResetPwdFragment.this.g1().btnAuthCode.setText(ResetPwdFragment.this.p0(R.string.unit_second_short_param, Integer.valueOf(bVar2.f17740c)));
            } else {
                Button button = ResetPwdFragment.this.g1().btnAuthCode;
                jh.e eVar = ResetPwdFragment.this.f10326q0;
                if (eVar != null) {
                    button.setEnabled(eVar.f17781i);
                    ResetPwdFragment.this.g1().btnAuthCode.setText(R.string.account_request_auth_code);
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
                ResetPwdFragment.this.g1().tvAuthCodeTips.setText(R.string.account_auth_code_tips1);
            } else {
                String p02 = ResetPwdFragment.this.p0(R.string.account_auth_code_tips2, bVar2.f17738a);
                gm.l.e(p02, "getString(R.string.accou…ernameWhoRequestAuthCode)");
                TextView textView = ResetPwdFragment.this.g1().tvAuthCodeTips;
                gm.l.e(textView, "viewBind.tvAuthCodeTips");
                k7.a.a(textView, p02, bVar2.f17738a, com.topstep.fitcloud.pro.ui.auth.b.f10406b);
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.auth.ResetPwdFragment$onCreate$2", f = "ResetPwdFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10334e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            ResetPwdFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((d) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f10334e = obj;
            return dVar2;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            ResetPwdFragment resetPwdFragment = ResetPwdFragment.this;
            mm.h<Object>[] hVarArr = ResetPwdFragment.f10323v0;
            p.f(resetPwdFragment.f1(), (Throwable) this.f10334e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.auth.ResetPwdFragment$onCreate$4", f = "ResetPwdFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10337e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(2, dVar);
            ResetPwdFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((f) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            f fVar = new f(dVar);
            fVar.f10337e = obj;
            return fVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            ResetPwdFragment resetPwdFragment = ResetPwdFragment.this;
            mm.h<Object>[] hVarArr = ResetPwdFragment.f10323v0;
            p.f(resetPwdFragment.f1(), (Throwable) this.f10337e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.auth.ResetPwdFragment$onCreate$5", f = "ResetPwdFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends zl.i implements fm.p<tl.l, xl.d<? super tl.l>, Object> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(xl.d<? super g> dVar) {
            super(2, dVar);
            ResetPwdFragment.this = r1;
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
            ResetPwdFragment resetPwdFragment = ResetPwdFragment.this;
            mm.h<Object>[] hVarArr = ResetPwdFragment.f10323v0;
            d7.e.h(resetPwdFragment.f1(), R.string.account_modify_pwd_success, true, ResetPwdFragment.this.f10328s0, 12);
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends m implements fm.l<c0<jh.c, jh.b>, jh.c> {

        /* renamed from: b */
        public final /* synthetic */ mm.b f10340b;

        /* renamed from: c */
        public final /* synthetic */ r f10341c;

        /* renamed from: d */
        public final /* synthetic */ mm.b f10342d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(r rVar, gm.e eVar, gm.e eVar2) {
            super(1);
            this.f10340b = eVar;
            this.f10341c = rVar;
            this.f10342d = eVar2;
        }

        /* JADX WARN: Type inference failed for: r8v7, types: [jh.c, y3.k0] */
        @Override // fm.l
        public final jh.c k(c0<jh.c, jh.b> c0Var) {
            c0<jh.c, jh.b> c0Var2 = c0Var;
            gm.l.f(c0Var2, "stateFactory");
            return h1.o(m0.p(this.f10340b), jh.b.class, new o(this.f10341c.T0(), h1.c(this.f10341c), this.f10341c), m0.p(this.f10342d).getName(), false, c0Var2, 16);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends y {

        /* renamed from: c */
        public final /* synthetic */ mm.b f10343c;

        /* renamed from: d */
        public final /* synthetic */ fm.l f10344d;

        /* renamed from: e */
        public final /* synthetic */ mm.b f10345e;

        public i(gm.e eVar, h hVar, gm.e eVar2) {
            this.f10343c = eVar;
            this.f10344d = hVar;
            this.f10345e = eVar2;
        }

        public final tl.d C(Object obj, mm.h hVar) {
            r rVar = (r) obj;
            gm.l.f(rVar, "thisRef");
            gm.l.f(hVar, "property");
            return g1.f22980a.b(rVar, hVar, this.f10343c, new com.topstep.fitcloud.pro.ui.auth.c(this.f10345e), b0.a(jh.b.class), false, this.f10344d);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends m implements fm.l<c0<s, nh.d<tl.l>>, s> {

        /* renamed from: b */
        public final /* synthetic */ mm.b f10346b;

        /* renamed from: c */
        public final /* synthetic */ r f10347c;

        /* renamed from: d */
        public final /* synthetic */ mm.b f10348d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(r rVar, gm.e eVar, gm.e eVar2) {
            super(1);
            this.f10346b = eVar;
            this.f10347c = rVar;
            this.f10348d = eVar2;
        }

        /* JADX WARN: Type inference failed for: r8v7, types: [jh.s, y3.k0] */
        @Override // fm.l
        public final s k(c0<s, nh.d<tl.l>> c0Var) {
            c0<s, nh.d<tl.l>> c0Var2 = c0Var;
            gm.l.f(c0Var2, "stateFactory");
            return h1.o(m0.p(this.f10346b), nh.d.class, new o(this.f10347c.T0(), h1.c(this.f10347c), this.f10347c), m0.p(this.f10348d).getName(), false, c0Var2, 16);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends y {

        /* renamed from: c */
        public final /* synthetic */ mm.b f10349c;

        /* renamed from: d */
        public final /* synthetic */ fm.l f10350d;

        /* renamed from: e */
        public final /* synthetic */ mm.b f10351e;

        public k(gm.e eVar, j jVar, gm.e eVar2) {
            this.f10349c = eVar;
            this.f10350d = jVar;
            this.f10351e = eVar2;
        }

        public final tl.d C(Object obj, mm.h hVar) {
            r rVar = (r) obj;
            gm.l.f(rVar, "thisRef");
            gm.l.f(hVar, "property");
            return g1.f22980a.b(rVar, hVar, this.f10349c, new com.topstep.fitcloud.pro.ui.auth.d(this.f10351e), b0.a(nh.d.class), false, this.f10350d);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l implements e.a {
        public l() {
            ResetPwdFragment.this = r1;
        }

        @Override // jh.e.a
        public final void a(boolean z10, boolean z11) {
            boolean z12;
            ResetPwdFragment resetPwdFragment = ResetPwdFragment.this;
            mm.h<Object>[] hVarArr = ResetPwdFragment.f10323v0;
            jh.c cVar = (jh.c) resetPwdFragment.f10325p0.getValue();
            ResetPwdFragment resetPwdFragment2 = ResetPwdFragment.this;
            gm.l.f(cVar, "repository1");
            jh.b bVar = (jh.b) cVar.f30971c.f31078c.d();
            gm.l.f(bVar, "it");
            mm.h<Object>[] hVarArr2 = ResetPwdFragment.f10323v0;
            Button button = resetPwdFragment2.g1().btnAuthCode;
            if (z10 && bVar.f17740c <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            button.setEnabled(z12);
            tl.l lVar = tl.l.f28297a;
            ResetPwdFragment.this.g1().btnCommit.setEnabled(z11);
        }
    }

    static {
        gm.t tVar = new gm.t(ResetPwdFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentResetPwdBinding;", 0);
        gm.c0 c0Var = b0.f15488a;
        c0Var.getClass();
        gm.t tVar2 = new gm.t(ResetPwdFragment.class, "authCodeViewModel", "getAuthCodeViewModel()Lcom/topstep/fitcloud/pro/ui/auth/AuthCodeViewModel;", 0);
        c0Var.getClass();
        gm.t tVar3 = new gm.t(ResetPwdFragment.class, "viewModel", "getViewModel()Lcom/topstep/fitcloud/pro/ui/auth/ResetPwdViewModel;", 0);
        c0Var.getClass();
        f10323v0 = new mm.h[]{tVar, tVar2, tVar3};
    }

    public ResetPwdFragment() {
        super(R.layout.fragment_reset_pwd);
        this.f10324o0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentResetPwdBinding.class, this);
        gm.e a10 = b0.a(jh.c.class);
        i iVar = new i(a10, new h(this, a10, a10), a10);
        mm.h<Object>[] hVarArr = f10323v0;
        this.f10325p0 = iVar.C(this, hVarArr[1]);
        gm.e a11 = b0.a(s.class);
        this.f10327r0 = new k(a11, new j(this, a11, a11), a11).C(this, hVarArr[2]);
        this.f10328s0 = 1;
        this.f10329t0 = new a();
        this.f10330u0 = new l();
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        g0.a.d(this, (jh.c) this.f10325p0.getValue(), new gm.t() { // from class: com.topstep.fitcloud.pro.ui.auth.ResetPwdFragment.c
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((jh.b) obj).f17739b;
            }
        }, h1(null), new d(null), null, 8);
        g0.a.c(this, (s) this.f10327r0.getValue(), new gm.t() { // from class: com.topstep.fitcloud.pro.ui.auth.ResetPwdFragment.e
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
        gm.l.f(view, "view");
        super.O0(view, bundle);
        TextInputEditText textInputEditText = g1().editUsername;
        gm.l.e(textInputEditText, "viewBind.editUsername");
        this.f10326q0 = new jh.e(textInputEditText, g1().editPwd, g1().editAuthCode, true, true, true, this.f10330u0);
        p.b.g(g1().btnAuthCode, this.f10329t0);
        p.b.g(g1().btnCommit, this.f10329t0);
        p.b.g(g1().imgAuthCodeHelp, this.f10329t0);
    }

    @Override // y3.g0
    public final void X() {
        g0.a.g(this);
    }

    @Override // y3.g0
    public final z1 Y(k0 k0Var, gm.t tVar, y3.i iVar, fm.p pVar, fm.p pVar2) {
        return g0.a.c(this, k0Var, tVar, iVar, pVar, pVar2);
    }

    @Override // y3.g0
    public final z1 Z(xh.i iVar, gm.t tVar, y3.i iVar2, fm.p pVar) {
        return g0.a.e(this, iVar, tVar, iVar2, pVar);
    }

    @Override // y3.g0
    public final androidx.lifecycle.u a() {
        return g0.a.b(this);
    }

    @Override // d7.d.a
    public final void g(int i10) {
        if (i10 == this.f10328s0) {
            tb.a.f(this).p();
        }
    }

    public final FragmentResetPwdBinding g1() {
        return (FragmentResetPwdBinding) this.f10324o0.a(this, f10323v0[0]);
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
        gm.j.p((jh.c) this.f10325p0.getValue(), new b());
        s sVar = (s) this.f10327r0.getValue();
        gm.l.f(sVar, "repository1");
        nh.d dVar = (nh.d) sVar.f30971c.f31078c.d();
        gm.l.f(dVar, "it");
        p.b(dVar.f22382a, e1());
        tl.l lVar = tl.l.f28297a;
    }
}
