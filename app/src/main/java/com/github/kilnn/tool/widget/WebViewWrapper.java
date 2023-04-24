package com.github.kilnn.tool.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.github.kilnn.tool.R;
import gm.l;
import kotlin.Metadata;

@Metadata
/* loaded from: classes.dex */
public final class WebViewWrapper extends FrameLayout {

    /* renamed from: a */
    public WebView f5927a;

    /* renamed from: b */
    public String f5928b;

    /* loaded from: classes.dex */
    public static final class a extends WebView {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(android.content.Context r5) {
            /*
                r4 = this;
                r0 = 0
                r1 = 0
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 21
                if (r2 == r3) goto Lc
                r3 = 22
                if (r2 != r3) goto L1a
            Lc:
                android.content.res.Configuration r2 = new android.content.res.Configuration
                r2.<init>()
                android.content.Context r5 = r5.createConfigurationContext(r2)
                java.lang.String r2 = "context.createConfigurat…nContext(Configuration())"
                gm.l.e(r5, r2)
            L1a:
                r4.<init>(r5, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.kilnn.tool.widget.WebViewWrapper.a.<init>(android.content.Context):void");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WebViewWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.f(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.WebViewWrapper, 0, 0);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr…Wrapper, defStyleAttr, 0)");
        this.f5928b = obtainStyledAttributes.getString(R.styleable.WebViewWrapper_text_error_des);
        obtainStyledAttributes.recycle();
        try {
            this.f5927a = new WebView(getContext());
        } catch (Exception e10) {
            e10.printStackTrace();
            if (e10 instanceof Resources.NotFoundException) {
                try {
                    Context context2 = getContext();
                    l.e(context2, "getContext()");
                    this.f5927a = new a(context2);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        WebView webView = this.f5927a;
        WebView webView2 = webView;
        if (webView == null) {
            TextView textView = new TextView(getContext());
            textView.setText(this.f5928b);
            webView2 = textView;
        }
        addView(webView2);
    }

    public final WebView getWebView() {
        return this.f5927a;
    }
}
