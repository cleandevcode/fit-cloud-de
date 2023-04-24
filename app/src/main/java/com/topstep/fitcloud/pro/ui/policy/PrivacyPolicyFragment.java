package com.topstep.fitcloud.pro.ui.policy;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.fragment.app.n;
import androidx.fragment.app.r;
import cn.sharesdk.framework.InnerShareParams;
import com.topstep.fitcloud.pro.databinding.FragmentPrivacyPolicyBinding;
import com.topstep.fitcloudpro.R;
import gm.b0;
import gm.l;
import gm.t;
import hi.g;
import hi.i;
import jh.w;
import kotlin.Metadata;
import mm.h;
import qi.p;
import s.n2;
import tl.d;
import yg.m;

@Metadata
/* loaded from: classes2.dex */
public final class PrivacyPolicyFragment extends g {

    /* renamed from: w0 */
    public static final /* synthetic */ h<Object>[] f11725w0;

    /* renamed from: r0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11726r0;

    /* renamed from: s0 */
    public final i2.g f11727s0;

    /* renamed from: t0 */
    public final d f11728t0;

    /* renamed from: u0 */
    public String f11729u0;

    /* renamed from: v0 */
    public m f11730v0;

    /* loaded from: classes2.dex */
    public static final class a extends gm.m implements fm.a<Bundle> {

        /* renamed from: b */
        public final /* synthetic */ r f11731b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r rVar) {
            super(0);
            this.f11731b = rVar;
        }

        @Override // fm.a
        public final Bundle m() {
            Bundle bundle = this.f11731b.f2516f;
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException(n.a(android.support.v4.media.d.a("Fragment "), this.f11731b, " has null arguments"));
        }
    }

    static {
        t tVar = new t(PrivacyPolicyFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentPrivacyPolicyBinding;", 0);
        b0.f15488a.getClass();
        f11725w0 = new h[]{tVar};
    }

    public PrivacyPolicyFragment() {
        super(R.layout.fragment_privacy_policy);
        this.f11726r0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentPrivacyPolicyBinding.class, this);
        this.f11727s0 = new i2.g(b0.a(i.class), new a(this));
        this.f11728t0 = p.d(this);
    }

    @Override // lh.c, androidx.fragment.app.r
    public final void O0(View view, Bundle bundle) {
        String str;
        l.f(view, "view");
        super.O0(view, bundle);
        String str2 = "cn";
        if (((i) this.f11727s0.getValue()).f16116a) {
            if (!h7.a.n(V0())) {
                str2 = "en";
            }
            str = "https://fitcloud.hetangsmart.com/oss/static/fitcloudpro/privacy-policy/index_" + str2 + ".html";
        } else {
            if (!h7.a.n(V0())) {
                str2 = "en";
            }
            str = "https://fitcloud.hetangsmart.com/oss/static/fitcloudpro/user-agreement/index_" + str2 + ".html";
        }
        this.f11729u0 = str;
        com.topstep.fitcloud.pro.utils.viewbinding.a aVar = this.f11726r0;
        h<?>[] hVarArr = f11725w0;
        WebView webView = ((FragmentPrivacyPolicyBinding) aVar.a(this, hVarArr[0])).webViewWrapper.getWebView();
        if (webView != null) {
            String str3 = this.f11729u0;
            if (str3 != null) {
                webView.loadUrl(str3);
            } else {
                l.l(InnerShareParams.URL);
                throw null;
            }
        }
        ((FragmentPrivacyPolicyBinding) this.f11726r0.a(this, hVarArr[0])).btnCancel.setOnClickListener(new w(6, this));
        ((FragmentPrivacyPolicyBinding) this.f11726r0.a(this, hVarArr[0])).toolbar.setOnMenuItemClickListener(new n2(11, this));
    }
}
