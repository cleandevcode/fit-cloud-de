package com.topstep.fitcloud.pro.ui.settings;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import com.github.kilnn.tool.widget.item.PreferenceItem;
import com.github.kilnn.tool.widget.preference.PreferenceTextView;
import com.topstep.fitcloud.pro.databinding.FragmentAccountManageBinding;
import com.topstep.fitcloud.pro.model.config.UserInfo;
import com.topstep.fitcloudpro.R;
import d2.a;
import fm.p;
import gm.b0;
import gm.m;
import gm.t;
import ih.v;
import ii.h;
import ii.z;
import kotlin.Metadata;
import mf.a0;
import pm.e0;
import sm.s0;
import tl.l;

@Metadata
/* loaded from: classes2.dex */
public final class AccountManageFragment extends z implements h.a {

    /* renamed from: t0 */
    public static final /* synthetic */ mm.h<Object>[] f11792t0;

    /* renamed from: r0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11793r0;

    /* renamed from: s0 */
    public final t0 f11794s0;

    @zl.e(c = "com.topstep.fitcloud.pro.ui.settings.AccountManageFragment$onViewCreated$1", f = "AccountManageFragment.kt", l = {41}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends zl.i implements p<e0, xl.d<? super l>, Object> {

        /* renamed from: e */
        public int f11795e;

        /* renamed from: com.topstep.fitcloud.pro.ui.settings.AccountManageFragment$a$a */
        /* loaded from: classes2.dex */
        public static final class C0198a<T> implements sm.g {

            /* renamed from: a */
            public final /* synthetic */ AccountManageFragment f11797a;

            public C0198a(AccountManageFragment accountManageFragment) {
                this.f11797a = accountManageFragment;
            }

            @Override // sm.g
            public final Object n(Object obj, xl.d dVar) {
                int i10;
                UserInfo userInfo = (UserInfo) obj;
                AccountManageFragment accountManageFragment = this.f11797a;
                mm.h<Object>[] hVarArr = AccountManageFragment.f11792t0;
                accountManageFragment.f1().itemPhone.getTextView().setText(userInfo.getPhone());
                p.b.g(this.f11797a.f1().itemPhone, new com.topstep.fitcloud.pro.ui.settings.e(this.f11797a, userInfo));
                this.f11797a.f1().itemEmail.getTextView().setText(userInfo.getEmail());
                p.b.g(this.f11797a.f1().itemEmail, new com.topstep.fitcloud.pro.ui.settings.f(this.f11797a, userInfo));
                PreferenceTextView preferenceTextView = this.f11797a.f1().itemModifyPwd;
                gm.l.e(preferenceTextView, "viewBind.itemModifyPwd");
                if (userInfo.getHasPassword()) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                preferenceTextView.setVisibility(i10);
                p.b.g(this.f11797a.f1().itemModifyPwd, new com.topstep.fitcloud.pro.ui.settings.g(this.f11797a));
                return l.f28297a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xl.d<? super a> dVar) {
            super(2, dVar);
            AccountManageFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super l> dVar) {
            ((a) p(e0Var, dVar)).t(l.f28297a);
            return yl.a.COROUTINE_SUSPENDED;
        }

        @Override // zl.a
        public final xl.d<l> p(Object obj, xl.d<?> dVar) {
            return new a(dVar);
        }

        @Override // zl.a
        public final Object t(Object obj) {
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f11795e;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.k(obj);
            } else {
                a0.k(obj);
                s0 s0Var = ((AccountManageViewMode) AccountManageFragment.this.f11794s0.getValue()).f11805d;
                C0198a c0198a = new C0198a(AccountManageFragment.this);
                this.f11795e = 1;
                if (s0Var.a(c0198a, this) == aVar) {
                    return aVar;
                }
            }
            throw new u2.b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements fm.l<PreferenceTextView, l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(1);
            AccountManageFragment.this = r1;
        }

        @Override // fm.l
        public final l k(PreferenceTextView preferenceTextView) {
            gm.l.f(preferenceTextView, "it");
            new ii.h().h1(AccountManageFragment.this.h0(), null);
            return l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f11799b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r rVar) {
            super(0);
            this.f11799b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f11799b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f11800b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f11800b = cVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f11800b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11801b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(tl.d dVar) {
            super(0);
            this.f11801b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f11801b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11802b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(tl.d dVar) {
            super(0);
            this.f11802b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f11802b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f11803b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11804c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(r rVar, tl.d dVar) {
            super(0);
            this.f11803b = rVar;
            this.f11804c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f11804c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f11803b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(AccountManageFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentAccountManageBinding;", 0);
        b0.f15488a.getClass();
        f11792t0 = new mm.h[]{tVar};
    }

    public AccountManageFragment() {
        super(R.layout.fragment_account_manage);
        this.f11793r0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentAccountManageBinding.class, this);
        tl.d a10 = fb.e.a(new d(new c(this)));
        this.f11794s0 = ab.b.f(this, b0.a(AccountManageViewMode.class), new e(a10), new f(a10), new g(this, a10));
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        PreferenceItem preferenceItem = f1().itemPhone;
        gm.l.e(preferenceItem, "viewBind.itemPhone");
        preferenceItem.setVisibility(h7.a.n(V0()) ? 0 : 8);
        qi.h.k(qi.h.i(this), new a(null));
        p.b.g(f1().itemAccountDelete, new b());
    }

    @Override // ii.h.a
    public final void R() {
        v.l(tb.a.f(this), new i2.a(R.id.toAccountDelete));
    }

    public final FragmentAccountManageBinding f1() {
        return (FragmentAccountManageBinding) this.f11793r0.a(this, f11792t0[0]);
    }
}
