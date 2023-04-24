package cn.sharesdk.framework.authorize;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cn.sharesdk.framework.TitleLayout;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.framework.utils.m;
import com.mob.tools.utils.ResHelper;

/* loaded from: classes.dex */
public class RegisterView extends ResizeLayout {

    /* renamed from: a */
    private TitleLayout f5187a;

    /* renamed from: b */
    private RelativeLayout f5188b;

    /* renamed from: c */
    private WebView f5189c;

    /* renamed from: d */
    private TextView f5190d;

    public RegisterView(Context context) {
        super(context);
        a(context);
    }

    public RegisterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    private void a(Context context) {
        setBackgroundColor(-1);
        setOrientation(1);
        final int b10 = b(context);
        this.f5187a = new TitleLayout(context);
        try {
            int bitmapRes = ResHelper.getBitmapRes(context, "ssdk_auth_title_back");
            if (bitmapRes > 0) {
                this.f5187a.setBackgroundResource(bitmapRes);
            }
        } catch (Throwable th2) {
            SSDKLog.b().a(th2);
        }
        this.f5187a.getBtnRight().setVisibility(8);
        int stringRes = ResHelper.getStringRes(getContext(), "ssdk_weibo_oauth_regiseter");
        if (stringRes > 0) {
            this.f5187a.getTvTitle().setText(stringRes);
        }
        addView(this.f5187a);
        ImageView imageView = new ImageView(context);
        int bitmapRes2 = ResHelper.getBitmapRes(context, "ssdk_logo");
        if (bitmapRes2 > 0) {
            imageView.setImageResource(bitmapRes2);
        }
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setPadding(0, 0, ResHelper.dipToPx(context, 10), 0);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: cn.sharesdk.framework.authorize.RegisterView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    int stringRes2 = ResHelper.getStringRes(view.getContext(), "ssdk_website");
                    String string = stringRes2 > 0 ? view.getResources().getString(stringRes2) : null;
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string)));
                } catch (Throwable th3) {
                    SSDKLog.b().a(th3);
                }
            }
        });
        this.f5187a.addView(imageView);
        this.f5188b = new RelativeLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        this.f5188b.setLayoutParams(layoutParams);
        addView(this.f5188b);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f5188b.addView(linearLayout);
        TextView textView = new TextView(context);
        this.f5190d = textView;
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, 5));
        this.f5190d.setBackgroundColor(-12929302);
        linearLayout.addView(this.f5190d);
        this.f5190d.setVisibility(8);
        WebView webView = new WebView(context);
        this.f5189c = webView;
        m.a(webView, false);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.weight = 1.0f;
        this.f5189c.setLayoutParams(layoutParams2);
        this.f5189c.setWebChromeClient(new WebChromeClient() { // from class: cn.sharesdk.framework.authorize.RegisterView.2
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView2, int i10) {
                TextView textView2;
                int i11;
                super.onProgressChanged(webView2, i10);
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) RegisterView.this.f5190d.getLayoutParams();
                layoutParams3.width = (b10 * i10) / 100;
                RegisterView.this.f5190d.setLayoutParams(layoutParams3);
                if (i10 <= 0 || i10 >= 100) {
                    textView2 = RegisterView.this.f5190d;
                    i11 = 8;
                } else {
                    textView2 = RegisterView.this.f5190d;
                    i11 = 0;
                }
                textView2.setVisibility(i11);
            }
        });
        linearLayout.addView(this.f5189c);
        this.f5189c.requestFocus();
    }

    private int b(Context context) {
        WindowManager windowManager;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if ((context instanceof Activity) && (windowManager = ((Activity) context).getWindowManager()) != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.widthPixels;
        }
        return 0;
    }

    public View a() {
        return this.f5187a.getBtnBack();
    }

    public void a(boolean z10) {
        this.f5187a.setVisibility(z10 ? 8 : 0);
    }

    public WebView b() {
        return this.f5189c;
    }

    public TitleLayout c() {
        return this.f5187a;
    }

    public RelativeLayout d() {
        return this.f5188b;
    }
}
