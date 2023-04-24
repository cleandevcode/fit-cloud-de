package cn.sharesdk.framework.utils;

import android.webkit.WebView;

/* loaded from: classes.dex */
public class m {
    public static void a(WebView webView, boolean z10) {
        if (webView == null) {
            return;
        }
        try {
            webView.getSettings().setAllowFileAccess(z10);
            webView.getSettings().setSavePassword(z10);
            webView.getSettings().setAllowFileAccessFromFileURLs(z10);
            webView.getSettings().setAllowUniversalAccessFromFileURLs(z10);
        } catch (Throwable unused) {
        }
    }
}
