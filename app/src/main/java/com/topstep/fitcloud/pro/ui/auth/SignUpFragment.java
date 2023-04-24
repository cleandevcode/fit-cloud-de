package com.topstep.fitcloud.pro.ui.auth;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.fragment.app.r;
import androidx.fragment.app.x;
import androidx.lifecycle.u;
import bi.m0;
import com.google.android.material.textfield.TextInputEditText;
import com.topstep.fitcloud.pro.databinding.FragmentSignUpBinding;
import com.topstep.fitcloud.pro.model.auth.FillUserInfo;
import com.topstep.fitcloudpro.R;
import gm.b0;
import gm.m;
import gm.t;
import ih.v;
import jh.e;
import jh.f0;
import jh.h0;
import jh.i0;
import jh.j0;
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
public final class SignUpFragment extends lh.i implements g0 {

    /* renamed from: v0 */
    public static final /* synthetic */ mm.h<Object>[] f10374v0;

    /* renamed from: o0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10375o0;

    /* renamed from: p0 */
    public final tl.d f10376p0;

    /* renamed from: q0 */
    public final tl.d f10377q0;

    /* renamed from: r0 */
    public boolean f10378r0;

    /* renamed from: s0 */
    public jh.e f10379s0;

    /* renamed from: t0 */
    public final a f10380t0;

    /* renamed from: u0 */
    public final l f10381u0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements fm.l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            SignUpFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            View view2 = view;
            gm.l.f(view2, "view");
            SignUpFragment signUpFragment = SignUpFragment.this;
            mm.h<Object>[] hVarArr = SignUpFragment.f10374v0;
            if (gm.l.a(view2, signUpFragment.g1().btnToggle)) {
                SignUpFragment signUpFragment2 = SignUpFragment.this;
                signUpFragment2.f10378r0 = !signUpFragment2.f10378r0;
                signUpFragment2.i1();
            } else if (gm.l.a(view2, SignUpFragment.this.g1().btnAuthCode)) {
                TextInputEditText textInputEditText = SignUpFragment.this.g1().editUsername;
                gm.l.e(textInputEditText, "viewBind.editUsername");
                ((jh.c) SignUpFragment.this.f10376p0.getValue()).c(qi.h.h(textInputEditText), false);
            } else {
                String str = null;
                if (gm.l.a(view2, SignUpFragment.this.g1().btnSignUp)) {
                    h0 h0Var = (h0) SignUpFragment.this.f10377q0.getValue();
                    TextInputEditText textInputEditText2 = SignUpFragment.this.g1().editUsername;
                    gm.l.e(textInputEditText2, "viewBind.editUsername");
                    String h10 = qi.h.h(textInputEditText2);
                    TextInputEditText textInputEditText3 = SignUpFragment.this.g1().editPwd;
                    gm.l.e(textInputEditText3, "viewBind.editPwd");
                    String h11 = qi.h.h(textInputEditText3);
                    SignUpFragment signUpFragment3 = SignUpFragment.this;
                    if (signUpFragment3.f10378r0) {
                        TextInputEditText textInputEditText4 = signUpFragment3.g1().editAuthCode;
                        gm.l.e(textInputEditText4, "viewBind.editAuthCode");
                        str = qi.h.h(textInputEditText4);
                    }
                    h0Var.getClass();
                    gm.l.f(h10, "username");
                    gm.l.f(h11, "password");
                    k0.a(h0Var, new i0(h0Var, h10, h11, str, null), j0.f17807b);
                } else if (gm.l.a(view2, SignUpFragment.this.g1().imgAuthCodeHelp)) {
                    new kh.a().h1(SignUpFragment.this.h0(), null);
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements fm.l<jh.b, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(1);
            SignUpFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(jh.b bVar) {
            jh.b bVar2 = bVar;
            gm.l.f(bVar2, "it");
            y3.b<tl.l> bVar3 = bVar2.f17739b;
            SignUpFragment signUpFragment = SignUpFragment.this;
            mm.h<Object>[] hVarArr = SignUpFragment.f10374v0;
            p.b(bVar3, signUpFragment.e1());
            boolean z10 = false;
            if (bVar2.f17740c > 0) {
                SignUpFragment.this.g1().btnAuthCode.setEnabled(false);
                SignUpFragment.this.g1().btnAuthCode.setText(SignUpFragment.this.p0(R.string.unit_second_short_param, Integer.valueOf(bVar2.f17740c)));
            } else {
                Button button = SignUpFragment.this.g1().btnAuthCode;
                jh.e eVar = SignUpFragment.this.f10379s0;
                if (eVar != null) {
                    z10 = eVar.f17781i;
                }
                button.setEnabled(z10);
                SignUpFragment.this.g1().btnAuthCode.setText(R.string.account_request_auth_code);
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.auth.SignUpFragment$onCreate$2", f = "SignUpFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10385e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            SignUpFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((d) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f10385e = obj;
            return dVar2;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            SignUpFragment signUpFragment = SignUpFragment.this;
            mm.h<Object>[] hVarArr = SignUpFragment.f10374v0;
            p.f(signUpFragment.f1(), (Throwable) this.f10385e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.auth.SignUpFragment$onCreate$4", f = "SignUpFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10388e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(2, dVar);
            SignUpFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((f) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            f fVar = new f(dVar);
            fVar.f10388e = obj;
            return fVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            SignUpFragment signUpFragment = SignUpFragment.this;
            mm.h<Object>[] hVarArr = SignUpFragment.f10374v0;
            p.f(signUpFragment.f1(), (Throwable) this.f10388e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.auth.SignUpFragment$onCreate$5", f = "SignUpFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends zl.i implements fm.p<FillUserInfo, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10390e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(xl.d<? super g> dVar) {
            super(2, dVar);
            SignUpFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(FillUserInfo fillUserInfo, xl.d<? super tl.l> dVar) {
            return ((g) p(fillUserInfo, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            g gVar = new g(dVar);
            gVar.f10390e = obj;
            return gVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            FillUserInfo fillUserInfo = (FillUserInfo) this.f10390e;
            i2.m f10 = tb.a.f(SignUpFragment.this);
            gm.l.f(fillUserInfo, "parcelArgs");
            v.l(f10, new f0(fillUserInfo));
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends m implements fm.l<c0<jh.c, jh.b>, jh.c> {

        /* renamed from: b */
        public final /* synthetic */ mm.b f10392b;

        /* renamed from: c */
        public final /* synthetic */ r f10393c;

        /* renamed from: d */
        public final /* synthetic */ mm.b f10394d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(r rVar, gm.e eVar, gm.e eVar2) {
            super(1);
            this.f10392b = eVar;
            this.f10393c = rVar;
            this.f10394d = eVar2;
        }

        /* JADX WARN: Type inference failed for: r8v7, types: [jh.c, y3.k0] */
        @Override // fm.l
        public final jh.c k(c0<jh.c, jh.b> c0Var) {
            c0<jh.c, jh.b> c0Var2 = c0Var;
            gm.l.f(c0Var2, "stateFactory");
            return h1.o(m0.p(this.f10392b), jh.b.class, new o(this.f10393c.T0(), h1.c(this.f10393c), this.f10393c), m0.p(this.f10394d).getName(), false, c0Var2, 16);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends y {

        /* renamed from: c */
        public final /* synthetic */ mm.b f10395c;

        /* renamed from: d */
        public final /* synthetic */ fm.l f10396d;

        /* renamed from: e */
        public final /* synthetic */ mm.b f10397e;

        public i(gm.e eVar, h hVar, gm.e eVar2) {
            this.f10395c = eVar;
            this.f10396d = hVar;
            this.f10397e = eVar2;
        }

        public final tl.d C(Object obj, mm.h hVar) {
            r rVar = (r) obj;
            gm.l.f(rVar, "thisRef");
            gm.l.f(hVar, "property");
            return g1.f22980a.b(rVar, hVar, this.f10395c, new com.topstep.fitcloud.pro.ui.auth.f(this.f10397e), b0.a(jh.b.class), false, this.f10396d);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends m implements fm.l<c0<h0, jh.g0>, h0> {

        /* renamed from: b */
        public final /* synthetic */ mm.b f10398b;

        /* renamed from: c */
        public final /* synthetic */ r f10399c;

        /* renamed from: d */
        public final /* synthetic */ mm.b f10400d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(r rVar, gm.e eVar, gm.e eVar2) {
            super(1);
            this.f10398b = eVar;
            this.f10399c = rVar;
            this.f10400d = eVar2;
        }

        /* JADX WARN: Type inference failed for: r8v7, types: [y3.k0, jh.h0] */
        @Override // fm.l
        public final h0 k(c0<h0, jh.g0> c0Var) {
            c0<h0, jh.g0> c0Var2 = c0Var;
            gm.l.f(c0Var2, "stateFactory");
            return h1.o(m0.p(this.f10398b), jh.g0.class, new o(this.f10399c.T0(), h1.c(this.f10399c), this.f10399c), m0.p(this.f10400d).getName(), false, c0Var2, 16);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends y {

        /* renamed from: c */
        public final /* synthetic */ mm.b f10401c;

        /* renamed from: d */
        public final /* synthetic */ fm.l f10402d;

        /* renamed from: e */
        public final /* synthetic */ mm.b f10403e;

        public k(gm.e eVar, j jVar, gm.e eVar2) {
            this.f10401c = eVar;
            this.f10402d = jVar;
            this.f10403e = eVar2;
        }

        public final tl.d C(Object obj, mm.h hVar) {
            r rVar = (r) obj;
            gm.l.f(rVar, "thisRef");
            gm.l.f(hVar, "property");
            return g1.f22980a.b(rVar, hVar, this.f10401c, new com.topstep.fitcloud.pro.ui.auth.g(this.f10403e), b0.a(jh.g0.class), false, this.f10402d);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l implements e.a {
        public l() {
            SignUpFragment.this = r1;
        }

        @Override // jh.e.a
        public final void a(boolean z10, boolean z11) {
            boolean z12;
            SignUpFragment signUpFragment = SignUpFragment.this;
            mm.h<Object>[] hVarArr = SignUpFragment.f10374v0;
            jh.c cVar = (jh.c) signUpFragment.f10376p0.getValue();
            SignUpFragment signUpFragment2 = SignUpFragment.this;
            gm.l.f(cVar, "repository1");
            jh.b bVar = (jh.b) cVar.f30971c.f31078c.d();
            gm.l.f(bVar, "it");
            mm.h<Object>[] hVarArr2 = SignUpFragment.f10374v0;
            Button button = signUpFragment2.g1().btnAuthCode;
            if (z10 && bVar.f17740c <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            button.setEnabled(z12);
            tl.l lVar = tl.l.f28297a;
            SignUpFragment.this.g1().btnSignUp.setEnabled(z11);
        }
    }

    static {
        t tVar = new t(SignUpFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentSignUpBinding;", 0);
        gm.c0 c0Var = b0.f15488a;
        c0Var.getClass();
        t tVar2 = new t(SignUpFragment.class, "authCodeViewModel", "getAuthCodeViewModel()Lcom/topstep/fitcloud/pro/ui/auth/AuthCodeViewModel;", 0);
        c0Var.getClass();
        t tVar3 = new t(SignUpFragment.class, "viewModel", "getViewModel()Lcom/topstep/fitcloud/pro/ui/auth/SignUpViewModel;", 0);
        c0Var.getClass();
        f10374v0 = new mm.h[]{tVar, tVar2, tVar3};
    }

    public SignUpFragment() {
        super(R.layout.fragment_sign_up);
        this.f10375o0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentSignUpBinding.class, this);
        gm.e a10 = b0.a(jh.c.class);
        i iVar = new i(a10, new h(this, a10, a10), a10);
        mm.h<Object>[] hVarArr = f10374v0;
        this.f10376p0 = iVar.C(this, hVarArr[1]);
        gm.e a11 = b0.a(h0.class);
        this.f10377q0 = new k(a11, new j(this, a11, a11), a11).C(this, hVarArr[2]);
        this.f10378r0 = true;
        this.f10380t0 = new a();
        this.f10381u0 = new l();
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        g0.a.d(this, (jh.c) this.f10376p0.getValue(), new t() { // from class: com.topstep.fitcloud.pro.ui.auth.SignUpFragment.c
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((jh.b) obj).f17739b;
            }
        }, h1(null), new d(null), null, 8);
        g0.a.c(this, (h0) this.f10377q0.getValue(), new t() { // from class: com.topstep.fitcloud.pro.ui.auth.SignUpFragment.e
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((jh.g0) obj).f17787a;
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
        if (h7.a.n(V0())) {
            p.b.g(g1().btnToggle, this.f10380t0);
        } else {
            this.f10378r0 = false;
            Button button = g1().btnToggle;
            gm.l.e(button, "viewBind.btnToggle");
            button.setVisibility(8);
        }
        i1();
        p.b.g(g1().btnAuthCode, this.f10380t0);
        p.b.g(g1().btnSignUp, this.f10380t0);
        p.b.g(g1().imgAuthCodeHelp, this.f10380t0);
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

    public final FragmentSignUpBinding g1() {
        return (FragmentSignUpBinding) this.f10375o0.a(this, f10374v0[0]);
    }

    public final e1 h1(String str) {
        return g0.a.h(this, str);
    }

    @Override // y3.g0
    public final String i() {
        return g0.a.a(this).f30958d;
    }

    public final void i1() {
        jh.e eVar = this.f10379s0;
        if (eVar != null) {
            eVar.f17773a.removeTextChangedListener(eVar.f17780h);
            EditText editText = eVar.f17774b;
            if (editText != null) {
                editText.removeTextChangedListener(eVar.f17780h);
            }
            EditText editText2 = eVar.f17775c;
            if (editText2 != null) {
                editText2.removeTextChangedListener(eVar.f17780h);
            }
        }
        if (this.f10378r0) {
            g1().inputUsername.setHint(R.string.account_phone_number);
            g1().editUsername.setInputType(3);
            FrameLayout frameLayout = g1().layoutAuthCode;
            gm.l.e(frameLayout, "viewBind.layoutAuthCode");
            frameLayout.setVisibility(0);
            TextInputEditText textInputEditText = g1().editUsername;
            gm.l.e(textInputEditText, "viewBind.editUsername");
            this.f10379s0 = new jh.e(textInputEditText, g1().editPwd, g1().editAuthCode, true, false, true, this.f10381u0);
            g1().btnToggle.setText(R.string.account_email);
            return;
        }
        g1().inputUsername.setHint(R.string.account_email);
        g1().editUsername.setInputType(1);
        FrameLayout frameLayout2 = g1().layoutAuthCode;
        gm.l.e(frameLayout2, "viewBind.layoutAuthCode");
        frameLayout2.setVisibility(8);
        TextInputEditText textInputEditText2 = g1().editUsername;
        gm.l.e(textInputEditText2, "viewBind.editUsername");
        this.f10379s0 = new jh.e(textInputEditText2, g1().editPwd, null, false, true, true, this.f10381u0);
        g1().btnToggle.setText(R.string.account_phone_number);
    }

    @Override // y3.g0
    public final void invalidate() {
        h0 h0Var = (h0) this.f10377q0.getValue();
        gm.l.f(h0Var, "repository1");
        jh.g0 g0Var = (jh.g0) h0Var.f30971c.f31078c.d();
        gm.l.f(g0Var, "it");
        p.b(g0Var.f17787a, e1());
        tl.l lVar = tl.l.f28297a;
        gm.j.p((jh.c) this.f10376p0.getValue(), new b());
    }
}
