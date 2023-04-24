package com.topstep.fitcloud.pro.ui.auth;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.lifecycle.u;
import bi.m0;
import bi.z0;
import cn.sharesdk.facebook.Facebook;
import cn.sharesdk.sina.weibo.SinaWeibo;
import cn.sharesdk.tencent.qq.QQ;
import cn.sharesdk.wechat.friends.Wechat;
import com.google.android.material.textfield.TextInputEditText;
import com.topstep.fitcloud.pro.databinding.FragmentSignInBinding;
import com.topstep.fitcloud.pro.model.auth.FillUserInfo;
import com.topstep.fitcloud.pro.ui.MainActivity;
import com.topstep.fitcloudpro.R;
import fm.l;
import gm.j;
import gm.m;
import gm.t;
import ih.v;
import jh.a0;
import jh.b0;
import jh.c0;
import jh.d0;
import jh.e;
import jh.e0;
import jh.o;
import jh.r;
import jh.w;
import jh.x;
import jh.y;
import jh.z;
import kotlin.Metadata;
import oc.g1;
import pm.z1;
import qi.p;
import s.h1;
import tl.g;
import y3.e1;
import y3.g0;
import y3.k0;

@Metadata
/* loaded from: classes2.dex */
public final class SignInFragment extends lh.i implements g0 {

    /* renamed from: s0 */
    public static final /* synthetic */ mm.h<Object>[] f10353s0;

    /* renamed from: o0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10354o0;

    /* renamed from: p0 */
    public final tl.d f10355p0;

    /* renamed from: q0 */
    public final i f10356q0;

    /* renamed from: r0 */
    public final a f10357r0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            SignInFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            z h12;
            String str;
            i2.m f10;
            i2.a aVar;
            View view2 = view;
            gm.l.f(view2, "view");
            SignInFragment signInFragment = SignInFragment.this;
            mm.h<Object>[] hVarArr = SignInFragment.f10353s0;
            if (gm.l.a(view2, signInFragment.g1().btnSkip)) {
                z h13 = SignInFragment.this.h1();
                z1 z1Var = h13.f17841l;
                if (z1Var != null) {
                    z1Var.h(null);
                }
                h13.f17841l = k0.a(h13, new a0(h13, null), b0.f17741b);
            } else {
                if (gm.l.a(view2, SignInFragment.this.g1().btnResetPwd)) {
                    f10 = tb.a.f(SignInFragment.this);
                    aVar = new i2.a(R.id.toResetPwd);
                } else if (gm.l.a(view2, SignInFragment.this.g1().btnSignIn)) {
                    z h14 = SignInFragment.this.h1();
                    TextInputEditText textInputEditText = SignInFragment.this.g1().editUsername;
                    gm.l.e(textInputEditText, "viewBind.editUsername");
                    String h10 = qi.h.h(textInputEditText);
                    TextInputEditText textInputEditText2 = SignInFragment.this.g1().editPwd;
                    gm.l.e(textInputEditText2, "viewBind.editPwd");
                    String h11 = qi.h.h(textInputEditText2);
                    h14.getClass();
                    gm.l.f(h10, "username");
                    gm.l.f(h11, "password");
                    z1 z1Var2 = h14.f17841l;
                    if (z1Var2 != null) {
                        z1Var2.h(null);
                    }
                    h14.f17841l = k0.a(h14, new d0(h14, h10, h11, null), e0.f17782b);
                } else if (gm.l.a(view2, SignInFragment.this.g1().btnSignUp)) {
                    f10 = tb.a.f(SignInFragment.this);
                    aVar = new i2.a(R.id.toSignUp);
                } else {
                    if (gm.l.a(view2, SignInFragment.this.g1().imgWechat)) {
                        h12 = SignInFragment.this.h1();
                        str = Wechat.NAME;
                    } else if (gm.l.a(view2, SignInFragment.this.g1().imgQq)) {
                        h12 = SignInFragment.this.h1();
                        str = QQ.NAME;
                    } else if (gm.l.a(view2, SignInFragment.this.g1().imgSina)) {
                        h12 = SignInFragment.this.h1();
                        str = SinaWeibo.NAME;
                    } else if (gm.l.a(view2, SignInFragment.this.g1().imgFacebook)) {
                        h12 = SignInFragment.this.h1();
                        str = Facebook.NAME;
                    }
                    gm.l.e(str, "NAME");
                    z1 z1Var3 = h12.f17841l;
                    if (z1Var3 != null) {
                        z1Var3.h(null);
                    }
                    h12.f17841l = z0.g(h12.f30970b, null, 0, new c0(h12, str, null), 3);
                }
                v.l(f10, aVar);
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements l<y, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(1);
            SignInFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(y yVar) {
            y yVar2 = yVar;
            gm.l.f(yVar2, "it");
            y3.b<FillUserInfo> bVar = yVar2.f17833a;
            SignInFragment signInFragment = SignInFragment.this;
            mm.h<Object>[] hVarArr = SignInFragment.f10353s0;
            p.b(bVar, signInFragment.e1());
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.auth.SignInFragment$onCreate$2", f = "SignInFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements fm.p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10361e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            SignInFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((d) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f10361e = obj;
            return dVar2;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            d7.e f12;
            int i10;
            mf.a0.k(obj);
            Throwable th2 = (Throwable) this.f10361e;
            if (th2 instanceof r) {
                SignInFragment signInFragment = SignInFragment.this;
                mm.h<Object>[] hVarArr = SignInFragment.f10353s0;
                f12 = signInFragment.f1();
                i10 = R.string.account_no_app;
            } else if (th2 instanceof o) {
                SignInFragment signInFragment2 = SignInFragment.this;
                mm.h<Object>[] hVarArr2 = SignInFragment.f10353s0;
                f12 = signInFragment2.f1();
                i10 = R.string.account_auth_error;
            } else {
                SignInFragment signInFragment3 = SignInFragment.this;
                mm.h<Object>[] hVarArr3 = SignInFragment.f10353s0;
                p.f(signInFragment3.f1(), th2);
                return tl.l.f28297a;
            }
            d7.e.d(f12, i10, null, 0, 30);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.auth.SignInFragment$onCreate$3", f = "SignInFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends zl.i implements fm.p<FillUserInfo, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10363e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(2, dVar);
            SignInFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(FillUserInfo fillUserInfo, xl.d<? super tl.l> dVar) {
            return ((e) p(fillUserInfo, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f10363e = obj;
            return eVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            mf.a0.k(obj);
            FillUserInfo fillUserInfo = (FillUserInfo) this.f10363e;
            if (fillUserInfo == null) {
                int i10 = MainActivity.E;
                MainActivity.a.a(SignInFragment.this.V0());
                SignInFragment.this.T0().finish();
            } else {
                v.l(tb.a.f(SignInFragment.this), new x(fillUserInfo));
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.auth.SignInFragment$onViewCreated$1", f = "SignInFragment.kt", l = {76}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends zl.i implements fm.p<pm.e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f10365e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(xl.d<? super f> dVar) {
            super(2, dVar);
            SignInFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(pm.e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((f) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            return new f(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f10365e;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        mf.a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    mf.a0.k(obj);
                    SignInFragment signInFragment = SignInFragment.this;
                    mm.h<Object>[] hVarArr = SignInFragment.f10353s0;
                    z h12 = signInFragment.h1();
                    this.f10365e = 1;
                    dk.a<eh.d> aVar2 = h12.f17836g;
                    if (aVar2 != null) {
                        obj = aVar2.get().b(tl.l.f28297a, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        gm.l.l("getLastUserNameUseCase");
                        throw null;
                    }
                }
                SignInFragment signInFragment2 = SignInFragment.this;
                mm.h<Object>[] hVarArr2 = SignInFragment.f10353s0;
                signInFragment2.g1().editUsername.setText((String) obj);
            } catch (Exception unused) {
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends m implements l<y3.c0<z, y>, z> {

        /* renamed from: b */
        public final /* synthetic */ mm.b f10367b;

        /* renamed from: c */
        public final /* synthetic */ androidx.fragment.app.r f10368c;

        /* renamed from: d */
        public final /* synthetic */ mm.b f10369d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(androidx.fragment.app.r rVar, gm.e eVar, gm.e eVar2) {
            super(1);
            this.f10367b = eVar;
            this.f10368c = rVar;
            this.f10369d = eVar2;
        }

        /* JADX WARN: Type inference failed for: r8v7, types: [y3.k0, jh.z] */
        @Override // fm.l
        public final z k(y3.c0<z, y> c0Var) {
            y3.c0<z, y> c0Var2 = c0Var;
            gm.l.f(c0Var2, "stateFactory");
            return h1.o(m0.p(this.f10367b), y.class, new y3.o(this.f10368c.T0(), h1.c(this.f10368c), this.f10368c), m0.p(this.f10369d).getName(), false, c0Var2, 16);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends yb.y {

        /* renamed from: c */
        public final /* synthetic */ mm.b f10370c;

        /* renamed from: d */
        public final /* synthetic */ l f10371d;

        /* renamed from: e */
        public final /* synthetic */ mm.b f10372e;

        public h(gm.e eVar, g gVar, gm.e eVar2) {
            this.f10370c = eVar;
            this.f10371d = gVar;
            this.f10372e = eVar2;
        }

        public final tl.d C(Object obj, mm.h hVar) {
            androidx.fragment.app.r rVar = (androidx.fragment.app.r) obj;
            gm.l.f(rVar, "thisRef");
            gm.l.f(hVar, "property");
            return g1.f22980a.b(rVar, hVar, this.f10370c, new com.topstep.fitcloud.pro.ui.auth.e(this.f10372e), gm.b0.a(y.class), false, this.f10371d);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i implements e.a {
        public i() {
            SignInFragment.this = r1;
        }

        @Override // jh.e.a
        public final void a(boolean z10, boolean z11) {
            SignInFragment signInFragment = SignInFragment.this;
            mm.h<Object>[] hVarArr = SignInFragment.f10353s0;
            signInFragment.g1().btnSignIn.setEnabled(z11);
        }
    }

    static {
        t tVar = new t(SignInFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentSignInBinding;", 0);
        gm.c0 c0Var = gm.b0.f15488a;
        c0Var.getClass();
        t tVar2 = new t(SignInFragment.class, "viewModel", "getViewModel()Lcom/topstep/fitcloud/pro/ui/auth/SignInViewModel;", 0);
        c0Var.getClass();
        f10353s0 = new mm.h[]{tVar, tVar2};
    }

    public SignInFragment() {
        super(R.layout.fragment_sign_in);
        this.f10354o0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentSignInBinding.class, this);
        gm.e a10 = gm.b0.a(z.class);
        this.f10355p0 = new h(a10, new g(this, a10, a10), a10).C(this, f10353s0[1]);
        this.f10356q0 = new i();
        this.f10357r0 = new a();
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        g0.a.c(this, h1(), new t() { // from class: com.topstep.fitcloud.pro.ui.auth.SignInFragment.c
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((y) obj).f17833a;
            }
        }, i1(null), new d(null), new e(null));
    }

    @Override // androidx.fragment.app.r
    public final void N0() {
        this.E = true;
        androidx.fragment.app.x T0 = T0();
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
        Object f10;
        boolean z10;
        boolean z11;
        boolean z12;
        jg.a aVar;
        gm.l.f(view, "view");
        super.O0(view, bundle);
        if (bundle == null) {
            qi.h.j(this).e(new f(null));
        }
        z h12 = h1();
        h12.getClass();
        try {
            aVar = h12.f17835f;
        } catch (Throwable th2) {
            p000do.a.f13275a.q(th2);
            f10 = mf.a0.f(th2);
        }
        if (aVar != null) {
            f10 = aVar.a();
            if (f10 instanceof g.a) {
                f10 = null;
            }
            boolean z13 = true;
            int i10 = 0;
            if (f10 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                g1().toolbar.setNavigationOnClickListener(new w(0, this));
                Button button = g1().btnSkip;
                gm.l.e(button, "viewBind.btnSkip");
                button.setVisibility(8);
            } else {
                g1().toolbar.setNavigationIcon((Drawable) null);
                p.b.g(g1().btnSkip, this.f10357r0);
            }
            TextInputEditText textInputEditText = g1().editUsername;
            gm.l.e(textInputEditText, "viewBind.editUsername");
            new jh.e(textInputEditText, g1().editPwd, null, true, true, false, this.f10356q0);
            p.b.g(g1().btnResetPwd, this.f10357r0);
            p.b.g(g1().btnSignIn, this.f10357r0);
            p.b.g(g1().btnSignUp, this.f10357r0);
            g1().btnSignUp.getPaint().setFlags(8);
            if (h7.a.n(V0()) && !om.l.c0("fitcloudproGoogle", "google", true)) {
                LinearLayout linearLayout = g1().layoutQuickZh;
                gm.l.e(linearLayout, "viewBind.layoutQuickZh");
                linearLayout.setVisibility(0);
                g1().layoutQuickEn.setVisibility(8);
            } else {
                g1().layoutQuickZh.setVisibility(8);
                LinearLayout linearLayout2 = g1().layoutQuickEn;
                gm.l.e(linearLayout2, "viewBind.layoutQuickEn");
                linearLayout2.setVisibility(0);
            }
            LinearLayout linearLayout3 = g1().layoutQuickSignIn;
            gm.l.e(linearLayout3, "viewBind.layoutQuickSignIn");
            LinearLayout linearLayout4 = g1().layoutQuickZh;
            gm.l.e(linearLayout4, "viewBind.layoutQuickZh");
            if (linearLayout4.getVisibility() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                LinearLayout linearLayout5 = g1().layoutQuickEn;
                gm.l.e(linearLayout5, "viewBind.layoutQuickEn");
                if (linearLayout5.getVisibility() == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    z13 = false;
                }
            }
            if (!z13) {
                i10 = 8;
            }
            linearLayout3.setVisibility(i10);
            p.b.g(g1().imgWechat, this.f10357r0);
            p.b.g(g1().imgQq, this.f10357r0);
            p.b.g(g1().imgSina, this.f10357r0);
            p.b.g(g1().imgFacebook, this.f10357r0);
            return;
        }
        gm.l.l("authManager");
        throw null;
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

    public final FragmentSignInBinding g1() {
        return (FragmentSignInBinding) this.f10354o0.a(this, f10353s0[0]);
    }

    public final z h1() {
        return (z) this.f10355p0.getValue();
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
        j.p(h1(), new b());
    }
}
