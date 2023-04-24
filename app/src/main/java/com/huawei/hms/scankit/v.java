package com.huawei.hms.scankit;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.feature.DynamicModuleInitializer;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.scankit.drawable.ScanDrawable;
import java.util.Locale;

/* loaded from: classes.dex */
public class v extends y {
    private ScanDrawable E;
    private ImageView F;
    private ImageView G;

    public v(Context context, int i10, IObjectWrapper iObjectWrapper, boolean z10, boolean z11) {
        super(context, i10, iObjectWrapper, z10, z11);
    }

    @Override // com.huawei.hms.scankit.y, com.huawei.hms.scankit.q
    public ProviderRemoteView d() {
        return new ProviderRemoteView(DynamicModuleInitializer.getContext() == null ? this.f8146e : DynamicModuleInitializer.getContext(), false, false);
    }

    @Override // com.huawei.hms.scankit.y, com.huawei.hms.scankit.q
    public void f() {
        RelativeLayout.LayoutParams layoutParams;
        ImageView imageView;
        super.f();
        this.F = (ImageView) this.f8147f.findViewById(R.id.ivScan);
        this.G = (ImageView) this.f8147f.findViewById(R.id.back_img_in);
        ImageView imageView2 = this.F;
        if (imageView2 != null) {
            ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
            layoutParams2.width = com.huawei.hms.scankit.util.c.a(this.f8146e).x > com.huawei.hms.scankit.util.c.a(this.f8146e, 520) ? com.huawei.hms.scankit.util.c.a(this.f8146e).x / 2 : com.huawei.hms.scankit.util.c.a(this.f8146e).x;
            this.F.setLayoutParams(layoutParams2);
            ScanDrawable scanDrawable = new ScanDrawable(this.f8146e.getResources());
            this.E = scanDrawable;
            this.F.setImageDrawable(scanDrawable);
        }
        ImageView imageView3 = this.G;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new u(this));
        }
        int i10 = 12;
        if (!com.huawei.hms.scankit.util.b.c((Activity) this.f8146e)) {
            TextView textView = (TextView) this.f8147f.findViewById(R.id.title_scan);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) textView.getLayoutParams();
            layoutParams3.setMargins(0, 0, 0, 0);
            layoutParams3.addRule(12);
            textView.setLayoutParams(layoutParams3);
        }
        if (com.huawei.hms.scankit.util.b.d(this.f8146e)) {
            TextView textView2 = (TextView) this.f8147f.findViewById(R.id.title_scan);
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) textView2.getLayoutParams();
            if (com.huawei.hms.scankit.util.b.b((Activity) this.f8146e)) {
                layoutParams4.setMargins(0, com.huawei.hms.scankit.util.c.a(this.f8146e, 48), 0, 0);
                i10 = 10;
            } else {
                layoutParams4.setMargins(0, 0, 0, 0);
            }
            layoutParams4.addRule(i10);
            textView2.setLayoutParams(layoutParams4);
            textView2.bringToFront();
        }
        if (com.huawei.hms.scankit.util.b.c((Activity) this.f8146e) || !com.huawei.hms.scankit.util.b.a(this.f8146e)) {
            return;
        }
        if ((Locale.getDefault() == null || !("ar".equals(Locale.getDefault().getLanguage()) || "ur".equals(Locale.getDefault().getLanguage()) || "ug".equals(Locale.getDefault().getLanguage()) || "iw".equals(Locale.getDefault().getLanguage()))) && !"fa".equals(Locale.getDefault().getLanguage())) {
            ImageView imageView4 = this.A;
            if (imageView4 == null) {
                return;
            }
            layoutParams = (RelativeLayout.LayoutParams) imageView4.getLayoutParams();
            layoutParams.setMarginEnd(com.huawei.hms.scankit.util.c.a(this.f8146e, 40));
            imageView = this.A;
        } else {
            ImageView imageView5 = this.G;
            if (imageView5 == null) {
                return;
            }
            layoutParams = (RelativeLayout.LayoutParams) imageView5.getLayoutParams();
            layoutParams.setMarginStart(com.huawei.hms.scankit.util.c.a(this.f8146e, 40));
            imageView = this.G;
        }
        imageView.setLayoutParams(layoutParams);
    }

    @Override // com.huawei.hms.scankit.y
    public void j() {
        if ((Locale.getDefault() == null || !("ar".equals(Locale.getDefault().getLanguage()) || "ur".equals(Locale.getDefault().getLanguage()) || "ug".equals(Locale.getDefault().getLanguage()) || "iw".equals(Locale.getDefault().getLanguage()))) && !"fa".equals(Locale.getDefault().getLanguage())) {
            return;
        }
        ImageView imageView = (ImageView) this.f8147f.findViewById(R.id.back_img_in);
        this.G = imageView;
        if (imageView != null) {
            imageView.setRotation(180.0f);
        }
        k();
    }

    @Override // com.huawei.hms.scankit.q, com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onStart() {
        super.onStart();
        ScanDrawable scanDrawable = this.E;
        if (scanDrawable == null || scanDrawable.isRunning()) {
            return;
        }
        this.E.start();
    }

    @Override // com.huawei.hms.scankit.q, com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onStop() {
        super.onStop();
        ScanDrawable scanDrawable = this.E;
        if (scanDrawable != null && scanDrawable.isRunning()) {
            this.E.stop();
        }
    }
}
