package com.topstep.fitcloud.pro.ui.policy;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import com.topstep.fitcloud.pro.databinding.FragmentAskPolicyBinding;
import com.topstep.fitcloudpro.R;
import d2.a;
import fm.l;
import fm.p;
import gm.b0;
import gm.j;
import gm.m;
import gm.t;
import ih.u;
import ih.v;
import kotlin.Metadata;
import mf.a0;
import pm.e0;

@Metadata
/* loaded from: classes2.dex */
public final class AskPolicyFragment extends hi.f {

    /* renamed from: u0 */
    public static final /* synthetic */ mm.h<Object>[] f11702u0;

    /* renamed from: r0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11703r0;

    /* renamed from: s0 */
    public final t0 f11704s0;

    /* renamed from: t0 */
    public final tl.d f11705t0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            AskPolicyFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            gm.l.f(view, "it");
            v.l(tb.a.f(AskPolicyFragment.this), new hi.b(true));
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(1);
            AskPolicyFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            gm.l.f(view, "it");
            v.l(tb.a.f(AskPolicyFragment.this), new hi.b(false));
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.policy.AskPolicyFragment$onViewCreated$3$1", f = "AskPolicyFragment.kt", l = {62}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f11708e;

        /* renamed from: f */
        public /* synthetic */ Object f11709f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(2, dVar);
            AskPolicyFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((c) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f11709f = obj;
            return cVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            Object f10;
            AskPolicyFragment askPolicyFragment;
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f11708e;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        askPolicyFragment = (AskPolicyFragment) this.f11709f;
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    e0 e0Var = (e0) this.f11709f;
                    AskPolicyFragment askPolicyFragment2 = AskPolicyFragment.this;
                    this.f11709f = askPolicyFragment2;
                    this.f11708e = 1;
                    yg.m mVar = ((AskPolicyViewMode) askPolicyFragment2.f11704s0.getValue()).f11720f;
                    if (mVar != null) {
                        Object p10 = mVar.p(false, this);
                        if (p10 != aVar) {
                            p10 = tl.l.f28297a;
                        }
                        if (p10 == aVar) {
                            return aVar;
                        }
                        askPolicyFragment = askPolicyFragment2;
                    } else {
                        gm.l.l("publicStorage");
                        throw null;
                    }
                }
                askPolicyFragment.T0().finish();
                f10 = tl.l.f28297a;
            } catch (Throwable th2) {
                p000do.a.f13275a.q(th2);
                f10 = a0.f(th2);
            }
            Throwable a10 = tl.g.a(f10);
            if (a10 != null) {
                qi.p.f((d7.e) AskPolicyFragment.this.f11705t0.getValue(), a10);
            }
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.policy.AskPolicyFragment$onViewCreated$4$1", f = "AskPolicyFragment.kt", l = {73}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends zl.i implements p<e0, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public int f11711e;

        /* renamed from: f */
        public /* synthetic */ Object f11712f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xl.d<? super d> dVar) {
            super(2, dVar);
            AskPolicyFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(e0 e0Var, xl.d<? super tl.l> dVar) {
            return ((d) p(e0Var, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f11712f = obj;
            return dVar2;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            Object f10;
            AskPolicyFragment askPolicyFragment;
            yl.a aVar = yl.a.COROUTINE_SUSPENDED;
            int i10 = this.f11711e;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        askPolicyFragment = (AskPolicyFragment) this.f11712f;
                        a0.k(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    a0.k(obj);
                    e0 e0Var = (e0) this.f11712f;
                    AskPolicyFragment askPolicyFragment2 = AskPolicyFragment.this;
                    this.f11712f = askPolicyFragment2;
                    this.f11711e = 1;
                    Object f11 = ((AskPolicyViewMode) askPolicyFragment2.f11704s0.getValue()).f(this);
                    if (f11 == aVar) {
                        return aVar;
                    }
                    askPolicyFragment = askPolicyFragment2;
                    obj = f11;
                }
                j.n((u) obj, askPolicyFragment.T0());
                f10 = tl.l.f28297a;
            } catch (Throwable th2) {
                p000do.a.f13275a.q(th2);
                f10 = a0.f(th2);
            }
            Throwable a10 = tl.g.a(f10);
            if (a10 != null) {
                qi.p.f((d7.e) AskPolicyFragment.this.f11705t0.getValue(), a10);
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f11714b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(r rVar) {
            super(0);
            this.f11714b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f11714b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f11715b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f11715b = eVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f11715b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11716b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(tl.d dVar) {
            super(0);
            this.f11716b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f11716b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f11717b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(tl.d dVar) {
            super(0);
            this.f11717b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f11717b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f11718b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f11719c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(r rVar, tl.d dVar) {
            super(0);
            this.f11718b = rVar;
            this.f11719c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f11719c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f11718b.r();
            }
            gm.l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(AskPolicyFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentAskPolicyBinding;", 0);
        b0.f15488a.getClass();
        f11702u0 = new mm.h[]{tVar};
    }

    public AskPolicyFragment() {
        super(R.layout.fragment_ask_policy);
        this.f11703r0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentAskPolicyBinding.class, this);
        tl.d a10 = fb.e.a(new f(new e(this)));
        this.f11704s0 = ab.b.f(this, b0.a(AskPolicyViewMode.class), new g(a10), new h(a10), new i(this, a10));
        this.f11705t0 = qi.p.d(this);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        String o02 = o0(R.string.app_name);
        gm.l.e(o02, "getString(R.string.app_name)");
        f1().tvDes1.setText(p0(R.string.privacy_policy_des1, o02));
        String p02 = p0(R.string.privacy_policy_des2_clicker1, o02);
        gm.l.e(p02, "getString(R.string.priva…y_des2_clicker1, appName)");
        String p03 = p0(R.string.privacy_policy_des2_clicker2, o02);
        gm.l.e(p03, "getString(R.string.priva…y_des2_clicker2, appName)");
        String p04 = p0(R.string.and_separator_params, p02, p03);
        gm.l.e(p04, "getString(R.string.and_s…yText, userAgreementText)");
        String p05 = p0(R.string.privacy_policy_des2, p04);
        gm.l.e(p05, "getString(R.string.privacy_policy_des2, subText)");
        TextView textView = f1().tvDes2;
        gm.l.e(textView, "viewBind.tvDes2");
        k7.a.b(textView, p05, new String[]{p02, p03}, new l[]{new a(), new b()});
        f1().btnCancel.setOnClickListener(new th.l(5, this));
        f1().btnAgree.setOnClickListener(new uh.a(3, this));
    }

    public final FragmentAskPolicyBinding f1() {
        return (FragmentAskPolicyBinding) this.f11703r0.a(this, f11702u0[0]);
    }
}
