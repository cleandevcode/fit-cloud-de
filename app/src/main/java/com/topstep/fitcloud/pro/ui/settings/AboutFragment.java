package com.topstep.fitcloud.pro.ui.settings;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.topstep.fitcloud.pro.databinding.FragmentAboutBinding;
import com.topstep.fitcloudpro.R;
import fm.l;
import gm.b0;
import gm.m;
import gm.t;
import ih.v;
import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public final class AboutFragment extends lh.c {

    /* renamed from: n0 */
    public static final /* synthetic */ mm.h<Object>[] f11732n0;

    /* renamed from: m0 */
    public final com.topstep.fitcloud.pro.utils.viewbinding.a f11733m0;

    /* loaded from: classes2.dex */
    public static final class a extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(1);
            AboutFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            gm.l.f(view, "it");
            v.l(tb.a.f(AboutFragment.this), new ii.a(true));
            return tl.l.f28297a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends m implements l<View, tl.l> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(1);
            AboutFragment.this = r1;
        }

        @Override // fm.l
        public final tl.l k(View view) {
            gm.l.f(view, "it");
            v.l(tb.a.f(AboutFragment.this), new ii.a(false));
            return tl.l.f28297a;
        }
    }

    static {
        t tVar = new t(AboutFragment.class, "viewBind", "getViewBind()Lcom/topstep/fitcloud/pro/databinding/FragmentAboutBinding;", 0);
        b0.f15488a.getClass();
        f11732n0 = new mm.h[]{tVar};
    }

    public AboutFragment() {
        super(R.layout.fragment_about);
        this.f11733m0 = new com.topstep.fitcloud.pro.utils.viewbinding.a(FragmentAboutBinding.class, this);
    }

    @Override // lh.c, androidx.fragment.app.r
    @SuppressLint({"SetTextI18n"})
    public final void O0(View view, Bundle bundle) {
        gm.l.f(view, "view");
        super.O0(view, bundle);
        com.topstep.fitcloud.pro.utils.viewbinding.a aVar = this.f11733m0;
        mm.h<?>[] hVarArr = f11732n0;
        ((FragmentAboutBinding) aVar.a(this, hVarArr[0])).tvVersion.setText("v2.0.7");
        String o02 = o0(R.string.app_name);
        gm.l.e(o02, "getString(R.string.app_name)");
        String p02 = p0(R.string.privacy_policy_des2_clicker1, o02);
        gm.l.e(p02, "getString(R.string.priva…y_des2_clicker1, appName)");
        String p03 = p0(R.string.privacy_policy_des2_clicker2, o02);
        gm.l.e(p03, "getString(R.string.priva…y_des2_clicker2, appName)");
        String p04 = p0(R.string.and_separator_params, p02, p03);
        gm.l.e(p04, "getString(R.string.and_s…yText, userAgreementText)");
        TextView textView = ((FragmentAboutBinding) this.f11733m0.a(this, hVarArr[0])).tvPrivacyPolicy;
        gm.l.e(textView, "viewBind.tvPrivacyPolicy");
        k7.a.b(textView, p04, new String[]{p02, p03}, new l[]{new a(), new b()});
    }
}
