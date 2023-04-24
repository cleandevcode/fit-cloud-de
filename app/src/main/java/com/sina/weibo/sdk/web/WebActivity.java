package com.sina.weibo.sdk.web;

import android.app.Activity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.sina.weibo.sdk.web.b.b;

/* loaded from: classes.dex */
public class WebActivity extends Activity implements a {

    /* renamed from: am */
    private LinearLayout f9530am;

    /* renamed from: an */
    private TextView f9531an;

    /* renamed from: ao */
    private TextView f9532ao;
    private WebView ap;
    private ProgressBar aq;
    private b ar;
    private com.sina.weibo.sdk.web.a.b as;
    private String at;

    private static void a(WebView webView, String str) {
        try {
            WebView.class.getDeclaredMethod("removeJavascriptInterface", String.class).invoke(webView, str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static /* synthetic */ void d(WebActivity webActivity) {
        webActivity.f9530am.setVisibility(8);
        webActivity.ap.setVisibility(0);
    }

    public static boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("https://service.weibo.com/share/mobilesdk.php") || str.startsWith("https://open.weibo.cn/oauth2/authorize?");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sina.weibo.sdk.web.WebActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            if (this.as.s()) {
                return true;
            }
            if (this.ap.canGoBack()) {
                this.ap.goBack();
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // com.sina.weibo.sdk.web.a
    public final void p() {
        this.f9530am.setVisibility(0);
        this.ap.setVisibility(8);
    }

    @Override // com.sina.weibo.sdk.web.a
    public final void q() {
        finish();
    }
}
