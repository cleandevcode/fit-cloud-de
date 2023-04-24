package com.topstep.fitcloud.pro.ui.data.ecg;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.fragment.app.r;
import androidx.lifecycle.t0;
import androidx.lifecycle.u;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import com.topstep.fitcloud.pro.databinding.FragmentEcgDetailReportBinding;
import com.topstep.fitcloud.pro.ui.data.ecg.EcgHealthReportActivity;
import com.topstep.fitcloudpro.R;
import d2.a;
import fm.p;
import gm.b0;
import gm.l;
import gm.m;
import gm.t;
import kotlin.Metadata;
import mf.a0;
import pm.z1;
import rh.j0;
import s.m1;
import u6.z;
import v6.a;

@Metadata
/* loaded from: classes2.dex */
public final class EcgDetailReportFragment extends j0 implements v6.a {

    /* renamed from: v0 */
    public static final /* synthetic */ mm.h<Object>[] f10638v0;

    /* renamed from: t0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10639t0;

    /* renamed from: u0 */
    public final t0 f10640u0;

    /* loaded from: classes2.dex */
    public static final class a extends WebChromeClient {
        public a() {
            EcgDetailReportFragment.this = r1;
        }

        @Override // android.webkit.WebChromeClient
        public final void onHideCustomView() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i10) {
            l.f(webView, "view");
            if (i10 == 100) {
                EcgDetailReportFragment ecgDetailReportFragment = EcgDetailReportFragment.this;
                mm.h<Object>[] hVarArr = EcgDetailReportFragment.f10638v0;
                ecgDetailReportFragment.h1().progressBar.setVisibility(8);
                return;
            }
            EcgDetailReportFragment ecgDetailReportFragment2 = EcgDetailReportFragment.this;
            mm.h<Object>[] hVarArr2 = EcgDetailReportFragment.f10638v0;
            ecgDetailReportFragment2.h1().progressBar.setVisibility(0);
            EcgDetailReportFragment.this.h1().progressBar.setProgress(i10);
        }

        @Override // android.webkit.WebChromeClient
        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            l.f(view, "view");
            l.f(customViewCallback, "callback");
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgDetailReportFragment$onViewCreated$4", f = "EcgDetailReportFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends zl.i implements p<Throwable, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10643e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(xl.d<? super c> dVar) {
            super(2, dVar);
            EcgDetailReportFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(Throwable th2, xl.d<? super tl.l> dVar) {
            return ((c) p(th2, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f10643e = obj;
            return cVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            a0.k(obj);
            EcgDetailReportFragment ecgDetailReportFragment = EcgDetailReportFragment.this;
            mm.h<Object>[] hVarArr = EcgDetailReportFragment.f10638v0;
            qi.p.f(ecgDetailReportFragment.f1(), (Throwable) this.f10643e);
            return tl.l.f28297a;
        }
    }

    @zl.e(c = "com.topstep.fitcloud.pro.ui.data.ecg.EcgDetailReportFragment$onViewCreated$6", f = "EcgDetailReportFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends zl.i implements p<u6.a<? extends String>, xl.d<? super tl.l>, Object> {

        /* renamed from: e */
        public /* synthetic */ Object f10646e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(xl.d<? super e> dVar) {
            super(2, dVar);
            EcgDetailReportFragment.this = r1;
        }

        @Override // fm.p
        public final Object A(u6.a<? extends String> aVar, xl.d<? super tl.l> dVar) {
            return ((e) p(aVar, dVar)).t(tl.l.f28297a);
        }

        @Override // zl.a
        public final xl.d<tl.l> p(Object obj, xl.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f10646e = obj;
            return eVar;
        }

        @Override // zl.a
        public final Object t(Object obj) {
            boolean z10;
            a0.k(obj);
            u6.a aVar = (u6.a) this.f10646e;
            if (aVar instanceof u6.l) {
                EcgDetailReportFragment ecgDetailReportFragment = EcgDetailReportFragment.this;
                mm.h<Object>[] hVarArr = EcgDetailReportFragment.f10638v0;
                ecgDetailReportFragment.h1().loadingView.c();
            } else if (aVar instanceof u6.g) {
                EcgDetailReportFragment ecgDetailReportFragment2 = EcgDetailReportFragment.this;
                mm.h<Object>[] hVarArr2 = EcgDetailReportFragment.f10638v0;
                ecgDetailReportFragment2.h1().loadingView.a(R.string.tip_load_error);
            } else if (aVar instanceof u6.a0) {
                String str = (String) aVar.a();
                if (str != null && str.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    EcgDetailReportFragment ecgDetailReportFragment3 = EcgDetailReportFragment.this;
                    mm.h<Object>[] hVarArr3 = EcgDetailReportFragment.f10638v0;
                    ecgDetailReportFragment3.h1().loadingView.b(R.string.tip_current_no_data);
                } else {
                    EcgDetailReportFragment ecgDetailReportFragment4 = EcgDetailReportFragment.this;
                    mm.h<Object>[] hVarArr4 = EcgDetailReportFragment.f10638v0;
                    ecgDetailReportFragment4.h1().loadingView.setVisibility(8);
                    WebView webView = EcgDetailReportFragment.this.h1().webViewWrapper.getWebView();
                    if (webView != null) {
                        webView.loadUrl(str);
                    }
                }
            }
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends m implements fm.a<r> {

        /* renamed from: b */
        public final /* synthetic */ r f10648b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(r rVar) {
            super(0);
            this.f10648b = rVar;
        }

        @Override // fm.a
        public final r m() {
            return this.f10648b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends m implements fm.a<y0> {

        /* renamed from: b */
        public final /* synthetic */ fm.a f10649b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f10649b = fVar;
        }

        @Override // fm.a
        public final y0 m() {
            return (y0) this.f10649b.m();
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends m implements fm.a<x0> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f10650b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(tl.d dVar) {
            super(0);
            this.f10650b = dVar;
        }

        @Override // fm.a
        public final x0 m() {
            return ih.b.a(this.f10650b, "owner.viewModelStore");
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends m implements fm.a<d2.a> {

        /* renamed from: b */
        public final /* synthetic */ tl.d f10651b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(tl.d dVar) {
            super(0);
            this.f10651b = dVar;
        }

        @Override // fm.a
        public final d2.a m() {
            y0 b10 = ab.b.b(this.f10651b);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            d2.c s10 = iVar != null ? iVar.s() : null;
            return s10 == null ? a.C0214a.f12612b : s10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends m implements fm.a<v0.b> {

        /* renamed from: b */
        public final /* synthetic */ r f10652b;

        /* renamed from: c */
        public final /* synthetic */ tl.d f10653c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(r rVar, tl.d dVar) {
            super(0);
            this.f10652b = rVar;
            this.f10653c = dVar;
        }

        @Override // fm.a
        public final v0.b m() {
            v0.b r10;
            y0 b10 = ab.b.b(this.f10653c);
            androidx.lifecycle.i iVar = b10 instanceof androidx.lifecycle.i ? (androidx.lifecycle.i) b10 : null;
            if (iVar == null || (r10 = iVar.r()) == null) {
                r10 = this.f10652b.r();
            }
            l.e(r10, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return r10;
        }
    }

    static {
        t tVar = new t(EcgDetailReportFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentEcgDetailReportBinding;", 0);
        b0.f15488a.getClass();
        f10638v0 = new mm.h[]{tVar};
    }

    public EcgDetailReportFragment() {
        super(R.layout.fragment_ecg_detail_report);
        this.f10639t0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentEcgDetailReportBinding.class, this);
        tl.d a10 = fb.e.a(new g(new f(this)));
        this.f10640u0 = ab.b.f(this, b0.a(EcgDetailReportViewModel.class), new h(a10), new i(a10), new j(this, a10));
    }

    @Override // v6.a
    public final z1 G(v6.b bVar, u6.f fVar, p pVar) {
        return a.C0526a.f(this, bVar, fVar, pVar);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        l.f(view, "view");
        super.O0(view, bundle);
        WebView webView = h1().webViewWrapper.getWebView();
        if (webView != null) {
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebChromeClient(new a());
        }
        h1().loadingView.setListener(new m1(8, this));
        n((EcgDetailReportViewModel) this.f10640u0.getValue(), new t() { // from class: com.topstep.fitcloud.pro.ui.data.ecg.EcgDetailReportFragment.b
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((rh.g) obj).f25691a;
            }
        }, v6.b.i((EcgDetailReportViewModel) this.f10640u0.getValue()), new c(null), null);
        e((EcgDetailReportViewModel) this.f10640u0.getValue(), new t() { // from class: com.topstep.fitcloud.pro.ui.data.ecg.EcgDetailReportFragment.d
            @Override // gm.t, mm.f
            public final Object get(Object obj) {
                return ((rh.g) obj).f25691a;
            }
        }, z.f28636a, new e(null));
    }

    @Override // v6.a
    public final u a() {
        return a.C0526a.a(this);
    }

    @Override // v6.a
    public final z1 e(v6.b bVar, t tVar, u6.f fVar, p pVar) {
        return a.C0526a.e(this, bVar, tVar, fVar, pVar);
    }

    public final FragmentEcgDetailReportBinding h1() {
        return (FragmentEcgDetailReportBinding) this.f10639t0.a(this, f10638v0[0]);
    }

    @Override // v6.a
    public final z1 k(EcgHealthReportViewModel ecgHealthReportViewModel, u6.f fVar, EcgHealthReportActivity.i iVar) {
        return a.C0526a.d(this, ecgHealthReportViewModel, EcgHealthReportActivity.g.f10707g, EcgHealthReportActivity.h.f10708g, fVar, iVar);
    }

    @Override // v6.a
    public final z1 n(v6.b bVar, t tVar, u6.f fVar, p pVar, p pVar2) {
        return a.C0526a.b(this, bVar, tVar, fVar, pVar, pVar2);
    }
}
