package com.huawei.hms.scankit;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.feature.DynamicModuleInitializer;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import java.util.Locale;

/* loaded from: classes.dex */
public class y extends q {
    public ImageView A;
    private ImageView B;
    private TextView C;
    private IObjectWrapper D;

    /* renamed from: z */
    public ViewfinderView f8182z;

    public y(Context context, int i10, IObjectWrapper iObjectWrapper, boolean z10, boolean z11) {
        super(context, i10, null, iObjectWrapper, z10, false, z11);
        this.D = iObjectWrapper;
        this.f8146e = context;
        this.f8145d = i10;
        this.f8159r = z10;
        this.f8157p = new Rect(-1, -1, -1, -1);
        this.f8162u = z11;
    }

    public void m() {
        ImageView imageView = this.B;
        if (imageView != null) {
            imageView.setSelected(false);
        }
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(R.string.scankit_light);
        }
    }

    @Override // com.huawei.hms.scankit.q
    public void c() {
        super.c();
        if (this.f8153l || !this.f8163v) {
            return;
        }
        this.f8165x.setVisibility(0);
    }

    @Override // com.huawei.hms.scankit.q
    public ProviderRemoteView d() {
        return new ProviderRemoteView(DynamicModuleInitializer.getContext() == null ? this.f8146e : DynamicModuleInitializer.getContext(), false);
    }

    @Override // com.huawei.hms.scankit.q
    public void f() {
        ProviderRemoteView d10 = d();
        this.f8147f = d10;
        RelativeLayout relativeLayout = (RelativeLayout) d10.findViewById(R.id.scan_title);
        if (relativeLayout != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(relativeLayout.getLayoutParams().width, relativeLayout.getLayoutParams().height);
            layoutParams.setMargins(0, l(), 0, 0);
            relativeLayout.setLayoutParams(layoutParams);
        }
        this.f8148g = (TextureView) this.f8147f.findViewById(R.id.surfaceView);
        ViewfinderView viewfinderView = (ViewfinderView) this.f8147f.findViewById(R.id.viewfinderView);
        this.f8182z = viewfinderView;
        C0637e c0637e = new C0637e(this.f8146e, this.f8148g, viewfinderView, this.f8157p, this.f8145d, this.D, this.f8159r, "DefaultView", false);
        this.f8149h = c0637e;
        c0637e.b(this.f8162u);
        ImageView imageView = (ImageView) this.f8147f.findViewById(R.id.img_btn);
        this.A = imageView;
        imageView.setOnClickListener(new w(this));
        this.f8165x = (LinearLayout) this.f8147f.findViewById(R.id.flash_light_ll);
        this.B = (ImageView) this.f8147f.findViewById(R.id.ivFlash);
        c();
        this.B.setOnClickListener(new x(this));
        this.C = (TextView) this.f8147f.findViewById(R.id.flash_light_text);
        e();
        j();
        k();
    }

    @Override // com.huawei.hms.scankit.q, com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public IObjectWrapper getView() {
        return ObjectWrapper.wrap(this.f8147f);
    }

    public void j() {
        if ((Locale.getDefault() == null || !("ar".equals(Locale.getDefault().getLanguage()) || "ur".equals(Locale.getDefault().getLanguage()) || "ug".equals(Locale.getDefault().getLanguage()) || "iw".equals(Locale.getDefault().getLanguage()))) && !"fa".equals(Locale.getDefault().getLanguage())) {
            return;
        }
        TextView textView = (TextView) this.f8147f.findViewById(R.id.title_scan);
        ImageView imageView = (ImageView) this.f8147f.findViewById(R.id.back_img_in);
        if (imageView != null) {
            imageView.setRotation(180.0f);
        }
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.addRule(1, R.id.img_btn);
                layoutParams2.rightMargin = 200;
                textView.setLayoutParams(layoutParams);
            }
        }
        k();
    }

    public void k() {
        ViewGroup.LayoutParams layoutParams = this.f8165x.getLayoutParams();
        Context context = this.f8146e;
        if (context == null || context.getResources() == null || this.f8146e.getResources().getDisplayMetrics() == null || this.f8146e.getResources().getDisplayMetrics().widthPixels <= 1990 || this.f8146e.getResources().getDisplayMetrics().widthPixels >= 2300 || this.f8146e.getResources().getDisplayMetrics().heightPixels <= 2190 || this.f8146e.getResources().getDisplayMetrics().heightPixels >= 2600 || !(layoutParams instanceof FrameLayout.LayoutParams)) {
            return;
        }
        ((FrameLayout.LayoutParams) layoutParams).bottomMargin = 150;
        this.f8165x.setLayoutParams(layoutParams);
    }

    public int l() {
        int identifier;
        Context context = this.f8146e;
        if (context == null || context.getResources() == null || (identifier = this.f8146e.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return this.f8146e.getResources().getDimensionPixelSize(identifier);
    }

    @Override // com.huawei.hms.scankit.q, android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // com.huawei.hms.scankit.q, com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.huawei.hms.scankit.q, com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onResume() {
        this.f8149h.e();
        m();
        SensorManager sensorManager = this.f8151j;
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(5), 2);
    }

    @Override // com.huawei.hms.scankit.q, com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void setOnClickListener(IObjectWrapper iObjectWrapper) {
        this.f8152k = (View.OnClickListener) ObjectWrapper.unwrap(iObjectWrapper);
    }

    @Override // com.huawei.hms.scankit.q, com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void turnOffLight() {
    }

    @Override // com.huawei.hms.scankit.q, com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void turnOnLight() {
    }
}
