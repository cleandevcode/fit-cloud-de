package com.topstep.fitcloud.pro.ui.settings;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.r;
import androidx.fragment.app.x;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.topstep.fitcloud.pro.databinding.FragmentEditIdentityIdBinding;
import com.topstep.fitcloudpro.R;
import d2.a;
import d7.d;
import fm.p;
import gm.b0;
import gm.m;
import gm.t;
import ii.a0;
import ii.i0;
import java.util.regex.Pattern;
import kotlin.Metadata;
import pm.e0;
import tl.l;

@Metadata
/* loaded from: classes2.dex */
public final class EditIdentityIdFragment extends a0<l> implements d.a {

    /* renamed from: x0 */
    public static final /* synthetic */ mm.h<Object>[] f11806x0;

    /* renamed from: u0 */
    public final int f11807u0;

    /* renamed from: v0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11808v0;

    /* renamed from: w0 */
    public final t0 f11809w0;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.EditIdentityIdFragment$onViewCreated$1", f = "EditIdentityIdFragment.kt", l = {36}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public EditText f11810e;

        /* renamed from: f */
        public int f11811f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(2, dVar);
            EditIdentityIdFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            return ((a) p(e0Var, dVar)).t(l.f28297a);
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new a(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            EditText editText;
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f11811f;
            if (i10 != 0) {
                if (i10 == 1) {
                    editText = this.f11810e;
                    mf.a0.k(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                mf.a0.k(obj);
                EditIdentityIdFragment editIdentityIdFragment = EditIdentityIdFragment.this;
                mm.h<Object>[] hVarArr = EditIdentityIdFragment.f11806x0;
                EditText editText2 = editIdentityIdFragment.j1().editIdentityId;
                EditIdentityIdViewModel editIdentityIdViewModel = (EditIdentityIdViewModel) EditIdentityIdFragment.this.f11809w0.getValue();
                this.f11810e = editText2;
                this.f11811f = 1;
                Object p10 = editIdentityIdViewModel.f11821i.p(editIdentityIdViewModel.f11820h, this);
                if (p10 == aVar) {
                    return aVar;
                }
                editText = editText2;
                obj = p10;
            }
            editText.setText((CharSequence) obj);
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements fm.l<Button, l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(1);
            EditIdentityIdFragment.this = r1;
        }

        @Override // fm.l
        public final l k(Button button) {
            boolean z10;
            gm.l.f(button, "it");
            EditIdentityIdFragment editIdentityIdFragment = EditIdentityIdFragment.this;
            mm.h<Object>[] hVarArr = EditIdentityIdFragment.f11806x0;
            EditText editText = editIdentityIdFragment.j1().editIdentityId;
            gm.l.e(editText, "viewBind.editIdentityId");
            String h10 = qi.h.h(editText);
            if (h10.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z10 = Pattern.compile("^[a-zA-Z0-9_\\-]{6,20}$").matcher(h10).matches();
            }
            if (z10) {
                int i10 = i0.C0;
                i0 i0Var = new i0();
                Bundle bundle = new Bundle();
                bundle.putString("id", h10);
                i0Var.Z0(bundle);
                i0Var.h1(EditIdentityIdFragment.this.h0(), null);
            } else {
                EditIdentityIdFragment.this.j1().inputIdentityId.setError(EditIdentityIdFragment.this.o0(R.string.user_info_id_tips3));
            }
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f11814b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r rVar) {
            super(0);
            this.f11814b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f11814b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f11815b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f11815b = cVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f11815b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11816b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(tl.d dVar) {
            super(0);
            this.f11816b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f11816b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11817b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(tl.d dVar) {
            super(0);
            this.f11817b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f11817b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f11818b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11819c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(r rVar, tl.d dVar) {
            super(0);
            this.f11818b = rVar;
            this.f11819c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f11819c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f11818b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(EditIdentityIdFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentEditIdentityIdBinding;", 0);
        b0.f15488a.getClass();
        f11806x0 = new mm.h[]{tVar};
    }

    public EditIdentityIdFragment() {
        super(R.layout.fragment_edit_identity_id);
        this.f11807u0 = 1;
        this.f11808v0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentEditIdentityIdBinding.class, this);
        tl.d a10 = fb.e.a(new d(new c(this)));
        this.f11809w0 = ab.b.f(this, b0.a(EditIdentityIdViewModel.class), new e(a10), new f(a10), new g(this, a10));
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

    @Override // nh.a, lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        qi.h.j(this).e(new a(null));
        p.b.g(j1().btnSave, new b());
    }

    @Override // d7.d.a
    public final void g(int i10) {
        if (i10 == this.f11807u0) {
            tb.a.f(this).p();
        }
    }

    @Override // nh.a
    public final nh.e g1() {
        return (EditIdentityIdViewModel) this.f11809w0.getValue();
    }

    @Override // nh.a
    public final void h1(Object obj) {
        gm.l.f((l) obj, WiseOpenHianalyticsData.UNION_RESULT);
        d7.e.h(f1(), R.string.tip_save_success, true, this.f11807u0, 12);
    }

    public final FragmentEditIdentityIdBinding j1() {
        return (FragmentEditIdentityIdBinding) this.f11808v0.a(this, f11806x0[0]);
    }
}
