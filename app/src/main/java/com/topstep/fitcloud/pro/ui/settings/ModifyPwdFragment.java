package com.topstep.fitcloud.pro.ui.settings;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import androidx.fragment.app.r;
import androidx.fragment.app.x;
import androidx.lifecycle.u;
import bi.m0;
import com.google.android.material.textfield.TextInputEditText;
import com.topstep.fitcloud.pro.databinding.FragmentModifyPwdBinding;
import com.topstep.fitcloudpro.R;
import d7.d;
import fm.p;
import gm.b0;
import gm.m;
import gm.t;
import ii.j0;
import ii.l0;
import kotlin.Metadata;
import mf.a0;
import oc.g1;
import pm.z1;
import s.h1;
import tl.l;
import y3.c0;
import y3.e1;
import y3.g0;
import y3.k0;
import y3.o;
import yb.y;

@Metadata
/* loaded from: classes2.dex */
public final class ModifyPwdFragment extends lh.i implements g0, d.a {

    /* renamed from: r0 */
    public static final /* synthetic */ mm.h<Object>[] f11858r0;

    /* renamed from: o0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11859o0;

    /* renamed from: p0 */
    public final tl.d f11860p0;

    /* renamed from: q0 */
    public final int f11861q0;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.ModifyPwdFragment$onCreate$2", f = "ModifyPwdFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends zl.i implements p<Throwable, xl.d<? super l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f11863e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xl.d<? super b> dVar) {
            super(2, dVar);
            ModifyPwdFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super l> dVar) {
            return ((b) p(th2, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f11863e = obj;
            return bVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            ModifyPwdFragment modifyPwdFragment = ModifyPwdFragment.this;
            mm.h<Object>[] hVarArr = ModifyPwdFragment.f11858r0;
            qi.p.f(modifyPwdFragment.f1(), (Throwable) this.f11863e);
            return l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.ModifyPwdFragment$onCreate$3", f = "ModifyPwdFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements p<l, xl.d<? super l>, Object> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(2, dVar);
            ModifyPwdFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(l lVar, xl.d<? super l> dVar) {
            return ((c) p(lVar, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new c(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            ModifyPwdFragment modifyPwdFragment = ModifyPwdFragment.this;
            mm.h<Object>[] hVarArr = ModifyPwdFragment.f11858r0;
            d7.e.h(modifyPwdFragment.f1(), R.string.account_modify_pwd_success, true, ModifyPwdFragment.this.f11861q0, 12);
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends m implements fm.l<Button, l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d() {
            super(1);
            ModifyPwdFragment.this = r1;
        }

        @Override // fm.l
        public final l k(Button button) {
            gm.l.f(button, "it");
            ModifyPwdFragment modifyPwdFragment = ModifyPwdFragment.this;
            mm.h<Object>[] hVarArr = ModifyPwdFragment.f11858r0;
            j0 j0Var = (j0) modifyPwdFragment.f11860p0.getValue();
            TextInputEditText textInputEditText = ModifyPwdFragment.this.g1().editOldPwd;
            gm.l.e(textInputEditText, "viewBind.editOldPwd");
            String h10 = qi.h.h(textInputEditText);
            TextInputEditText textInputEditText2 = ModifyPwdFragment.this.g1().editNewPwd;
            gm.l.e(textInputEditText2, "viewBind.editNewPwd");
            String h11 = qi.h.h(textInputEditText2);
            j0Var.getClass();
            gm.l.f(h10, "oldPassword");
            gm.l.f(h11, "newPassword");
            k0.a(j0Var, new ii.k0(j0Var, h10, h11, null), l0.f16963b);
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements TextWatcher {
        public e() {
            ModifyPwdFragment.this = r1;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean z10;
            boolean z11;
            gm.l.f(editable, "s");
            ModifyPwdFragment modifyPwdFragment = ModifyPwdFragment.this;
            mm.h<Object>[] hVarArr = ModifyPwdFragment.f11858r0;
            TextInputEditText textInputEditText = modifyPwdFragment.g1().editOldPwd;
            gm.l.e(textInputEditText, "viewBind.editOldPwd");
            boolean z12 = true;
            if (qi.h.h(textInputEditText).length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            TextInputEditText textInputEditText2 = modifyPwdFragment.g1().editNewPwd;
            gm.l.e(textInputEditText2, "viewBind.editNewPwd");
            int length = qi.h.h(textInputEditText2).length();
            if (6 <= length && length < 17) {
                z11 = true;
            } else {
                z11 = false;
            }
            modifyPwdFragment.g1().btnCommit.setEnabled((z10 && z11) ? false : false);
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
    public static final class f extends m implements fm.l<c0<j0, nh.d<l>>, j0> {

        /* renamed from: b */
        public final /* synthetic */ mm.b f11868b;

        /* renamed from: c */
        public final /* synthetic */ r f11869c;

        /* renamed from: d */
        public final /* synthetic */ mm.b f11870d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(r rVar, gm.e eVar, gm.e eVar2) {
            super(1);
            this.f11868b = eVar;
            this.f11869c = rVar;
            this.f11870d = eVar2;
        }

        /* JADX WARN: Type inference failed for: r8v7, types: [y3.k0, ii.j0] */
        @Override // fm.l
        public final j0 k(c0<j0, nh.d<l>> c0Var) {
            c0<j0, nh.d<l>> c0Var2 = c0Var;
            gm.l.f(c0Var2, "stateFactory");
            return h1.o(m0.p(this.f11868b), nh.d.class, new o(this.f11869c.T0(), h1.c(this.f11869c), this.f11869c), m0.p(this.f11870d).getName(), false, c0Var2, 16);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends y {

        /* renamed from: c */
        public final /* synthetic */ mm.b f11871c;

        /* renamed from: d */
        public final /* synthetic */ fm.l f11872d;

        /* renamed from: e */
        public final /* synthetic */ mm.b f11873e;

        public g(gm.e eVar, f fVar, gm.e eVar2) {
            this.f11871c = eVar;
            this.f11872d = fVar;
            this.f11873e = eVar2;
        }

        public final tl.d C(Object obj, mm.h hVar) {
            r rVar = (r) obj;
            gm.l.f(rVar, "thisRef");
            gm.l.f(hVar, "property");
            return g1.f22980a.b(rVar, hVar, this.f11871c, new h(this.f11873e), b0.a(nh.d.class), false, this.f11872d);
        }
    }

    static {
        t tVar = new t(ModifyPwdFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentModifyPwdBinding;", 0);
        gm.c0 c0Var = b0.f15488a;
        c0Var.getClass();
        t tVar2 = new t(ModifyPwdFragment.class, "viewModel", "getViewModel()Lcom/topstep/fitcloud/pro/ui/settings/ModifyPwdViewModel;", 0);
        c0Var.getClass();
        f11858r0 = new mm.h[]{tVar, tVar2};
    }

    public ModifyPwdFragment() {
        super(R.layout.fragment_modify_pwd);
        this.f11859o0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentModifyPwdBinding.class, this);
        gm.e a10 = b0.a(j0.class);
        this.f11860p0 = new g(a10, new f(this, a10, a10), a10).C(this, f11858r0[1]);
        this.f11861q0 = 1;
    }

    @Override // androidx.fragment.app.r
    public final void B0(Bundle bundle) {
        super.B0(bundle);
        g0.a.c(this, (j0) this.f11860p0.getValue(), new t() { // from class: com.topstep.fitcloud.pro.ui.settings.ModifyPwdFragment.a
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((nh.d) obj).f22382a;
            }
        }, h1(null), new b(null), new c(null));
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
        e eVar = new e();
        g1().editOldPwd.addTextChangedListener(eVar);
        g1().editNewPwd.addTextChangedListener(eVar);
        p.b.g(g1().btnCommit, new d());
    }

    @Override // y3.g0
    public final void X() {
        g0.a.g(this);
    }

    @Override // y3.g0
    public final z1 Y(k0 k0Var, t tVar, y3.i iVar, p pVar, p pVar2) {
        return g0.a.c(this, k0Var, tVar, iVar, pVar, pVar2);
    }

    @Override // y3.g0
    public final z1 Z(xh.i iVar, t tVar, y3.i iVar2, p pVar) {
        return g0.a.e(this, iVar, tVar, iVar2, pVar);
    }

    @Override // y3.g0
    public final u a() {
        return g0.a.b(this);
    }

    @Override // d7.d.a
    public final void g(int i10) {
        if (i10 == this.f11861q0) {
            tb.a.f(this).p();
        }
    }

    public final FragmentModifyPwdBinding g1() {
        return (FragmentModifyPwdBinding) this.f11859o0.a(this, f11858r0[0]);
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
        j0 j0Var = (j0) this.f11860p0.getValue();
        gm.l.f(j0Var, "repository1");
        nh.d dVar = (nh.d) j0Var.f30971c.f31078c.d();
        gm.l.f(dVar, "it");
        qi.p.b(dVar.f22382a, e1());
        l lVar = l.f28297a;
    }
}
