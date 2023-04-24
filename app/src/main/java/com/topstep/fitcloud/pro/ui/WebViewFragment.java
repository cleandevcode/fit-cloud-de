package com.topstep.fitcloud.pro.ui;

import android.os.Bundle;
import android.support.v4.media.d;
import android.view.View;
import android.webkit.WebView;
import androidx.fragment.app.n;
import androidx.fragment.app.r;
import com.topstep.fitcloud.pro.databinding.FragmentWebViewBinding;
import com.topstep.fitcloudpro.R;
import gm.b0;
import gm.l;
import gm.m;
import gm.t;
import i2.g;
import ih.d0;
import kotlin.Metadata;
import lh.c;
import mm.h;

@Metadata
/* loaded from: classes2.dex */
public final class WebViewFragment extends c {

    /* renamed from: o0 */
    public static final /* synthetic */ h<Object>[] f10295o0;

    /* renamed from: m0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f10296m0;

    /* renamed from: n0 */
    public final g f10297n0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements fm.a<Bundle> {

        /* renamed from: b */
        public final /* synthetic */ r f10298b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r rVar) {
            super(0);
            this.f10298b = rVar;
        }

        @Override // fm.a
        public final Bundle m() {
            Bundle bundle = this.f10298b.f2516f;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(n.a(d.a("Fragment "), this.f10298b, " has null arguments"));
        }
    }

    static {
        t tVar = new t(WebViewFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentWebViewBinding;", 0);
        b0.f15488a.getClass();
        f10295o0 = new h[]{tVar};
    }

    public WebViewFragment() {
        super(R.layout.fragment_web_view);
        this.f10296m0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentWebViewBinding.class, this);
        this.f10297n0 = new g(b0.a(d0.class), new a(this));
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        l.f(view, "view");
        super.O0(view, bundle);
        com.topstep.fitcloud.pro.utils.viewbinding.a aVar = this.f10296m0;
        h<?>[] hVarArr = f10295o0;
        ((FragmentWebViewBinding) aVar.a(this, hVarArr[0])).toolbar.setTitle(((d0) this.f10297n0.getValue()).f16829a);
        WebView webView = ((FragmentWebViewBinding) this.f10296m0.a(this, hVarArr[0])).webViewWrapper.getWebView();
        if (webView != null) {
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl(((d0) this.f10297n0.getValue()).f16830b);
        }
    }
}
