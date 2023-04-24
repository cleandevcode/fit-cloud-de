package cn.sharesdk.sina.weibo.sdk.a;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cn.sharesdk.framework.utils.m;
import cn.sharesdk.sina.weibo.sdk.LoadingBar;
import com.mob.tools.utils.ResHelper;
import hj.o;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private TextView f5389a;

    /* renamed from: b */
    private TextView f5390b;

    /* renamed from: c */
    private WebView f5391c;

    /* renamed from: d */
    private LoadingBar f5392d;

    /* renamed from: e */
    private LinearLayout f5393e;

    /* renamed from: f */
    private TextView f5394f;

    /* renamed from: g */
    private Button f5395g;

    /* renamed from: h */
    private Context f5396h;

    public a(Context context) {
        this.f5396h = context;
    }

    private void e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.MANUFACTURER);
        sb2.append("-");
        sb2.append(Build.MODEL);
        sb2.append("_");
        o.a(sb2, Build.VERSION.RELEASE, "_", "weibosdk", "_");
        sb2.append("0031405000");
        sb2.append("_android");
        this.f5391c.getSettings().setJavaScriptEnabled(true);
        m.a(this.f5391c, false);
        this.f5391c.getSettings().setSavePassword(false);
        this.f5391c.getSettings().setUserAgentString(sb2.toString());
        this.f5391c.requestFocus();
        this.f5391c.setScrollBarStyle(0);
        this.f5391c.setWebChromeClient(new WebChromeClient() { // from class: cn.sharesdk.sina.weibo.sdk.a.a.2
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i10) {
                LoadingBar loadingBar;
                int i11;
                super.onProgressChanged(webView, i10);
                a.this.f5392d.a(i10);
                if (i10 == 100) {
                    loadingBar = a.this.f5392d;
                    i11 = 4;
                } else {
                    loadingBar = a.this.f5392d;
                    i11 = 0;
                }
                loadingBar.setVisibility(i11);
            }
        });
    }

    public Button a() {
        return this.f5395g;
    }

    public RelativeLayout a(int i10) {
        RelativeLayout relativeLayout = new RelativeLayout(this.f5396h);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.setBackgroundColor(-1);
        RelativeLayout relativeLayout2 = new RelativeLayout(this.f5396h);
        relativeLayout2.setId(ResHelper.getIdRes(this.f5396h, "ssdk_sina_web_title_id"));
        relativeLayout2.setBackgroundColor(-131587);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, ResHelper.dipToPx(this.f5396h, 55));
        layoutParams.addRule(10);
        relativeLayout.addView(relativeLayout2, layoutParams);
        TextView textView = new TextView(this.f5396h);
        this.f5389a = textView;
        textView.setTextSize(1, 17.0f);
        this.f5389a.setTextColor(cn.sharesdk.sina.weibo.sdk.a.a(-32256, 1728020992));
        int stringRes = ResHelper.getStringRes(this.f5396h, "ssdk_sina_web_close");
        if (stringRes > 0) {
            this.f5389a.setText(stringRes);
        }
        int dipToPx = ResHelper.dipToPx(this.f5396h, 10);
        this.f5389a.setPadding(dipToPx, 0, dipToPx, 0);
        this.f5389a.setOnTouchListener(new View.OnTouchListener() { // from class: cn.sharesdk.sina.weibo.sdk.a.a.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int i11;
                if (motionEvent.getAction() == 0) {
                    i11 = -1;
                } else if (motionEvent.getAction() != 1) {
                    return false;
                } else {
                    i11 = -131587;
                }
                view.setBackgroundColor(i11);
                return false;
            }
        });
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(15);
        relativeLayout2.addView(this.f5389a, layoutParams2);
        TextView textView2 = new TextView(this.f5396h);
        this.f5390b = textView2;
        textView2.setTextColor(-11382190);
        this.f5390b.setTextSize(1, 18.0f);
        if (i10 > 0) {
            this.f5390b.setText(i10);
        }
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(13);
        relativeLayout2.addView(this.f5390b, layoutParams3);
        this.f5391c = new WebView(this.f5396h);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams4.addRule(3, relativeLayout2.getId());
        relativeLayout.addView(this.f5391c, layoutParams4);
        this.f5392d = new LoadingBar(this.f5396h);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, ResHelper.dipToPx(this.f5396h, 3));
        layoutParams5.addRule(3, relativeLayout2.getId());
        relativeLayout.addView(this.f5392d, layoutParams5);
        View view = new View(this.f5396h);
        int bitmapRes = ResHelper.getBitmapRes(this.f5396h, "ssdk_weibo_common_shadow_top");
        if (bitmapRes > 0) {
            view.setBackgroundResource(bitmapRes);
        }
        relativeLayout.addView(view, layoutParams5);
        LinearLayout linearLayout = new LinearLayout(this.f5396h);
        this.f5393e = linearLayout;
        linearLayout.setVisibility(8);
        this.f5393e.setGravity(17);
        this.f5393e.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(13);
        relativeLayout.addView(this.f5393e, layoutParams6);
        ImageView imageView = new ImageView(this.f5396h);
        int bitmapRes2 = ResHelper.getBitmapRes(this.f5396h, "ssdk_weibo_empty_failed");
        if (bitmapRes2 > 0) {
            imageView.setImageResource(bitmapRes2);
        }
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams7.bottomMargin = ResHelper.dipToPx(this.f5396h, 8);
        this.f5393e.addView(imageView, layoutParams7);
        this.f5394f = new TextView(this.f5396h);
        int stringRes2 = ResHelper.getStringRes(this.f5396h, "ssdk_sina_web_net_error");
        if (stringRes2 > 0) {
            this.f5394f.setText(stringRes2);
        }
        this.f5394f.setTextColor(-4342339);
        this.f5394f.setTextSize(1, 14.0f);
        this.f5393e.addView(this.f5394f, new LinearLayout.LayoutParams(-2, -2));
        Button button = new Button(this.f5396h);
        this.f5395g = button;
        button.setTextColor(-8882056);
        this.f5395g.setGravity(17);
        this.f5395g.setTextSize(1, 16.0f);
        int stringRes3 = ResHelper.getStringRes(this.f5396h, "ssdk_sina_web_refresh");
        if (stringRes3 > 0) {
            this.f5395g.setText(stringRes3);
        }
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(ResHelper.dipToPx(this.f5396h, 142), ResHelper.dipToPx(this.f5396h, 46));
        layoutParams8.topMargin = dipToPx;
        this.f5393e.addView(this.f5395g, layoutParams8);
        e();
        return relativeLayout;
    }

    public TextView b() {
        return this.f5389a;
    }

    public WebView c() {
        return this.f5391c;
    }

    public LinearLayout d() {
        return this.f5393e;
    }
}
