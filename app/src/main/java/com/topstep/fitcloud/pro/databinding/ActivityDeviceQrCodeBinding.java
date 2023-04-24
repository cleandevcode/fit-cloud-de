package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b0.c;
import com.github.kilnn.tool.widget.ScanCodeLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class ActivityDeviceQrCodeBinding implements a {
    public final ImageView btnFlush;
    public final FrameLayout rim;
    private final FrameLayout rootView;
    public final ScanCodeLayout scanCodeLayout;
    public final FrameLayout scanCodeLayoutBottom;
    public final FrameLayout scanCodeLayoutTop;
    public final MaterialToolbar toolbar;
    public final TextView tvTips;

    private ActivityDeviceQrCodeBinding(FrameLayout frameLayout, ImageView imageView, FrameLayout frameLayout2, ScanCodeLayout scanCodeLayout, FrameLayout frameLayout3, FrameLayout frameLayout4, MaterialToolbar materialToolbar, TextView textView) {
        this.rootView = frameLayout;
        this.btnFlush = imageView;
        this.rim = frameLayout2;
        this.scanCodeLayout = scanCodeLayout;
        this.scanCodeLayoutBottom = frameLayout3;
        this.scanCodeLayoutTop = frameLayout4;
        this.toolbar = materialToolbar;
        this.tvTips = textView;
    }

    public static ActivityDeviceQrCodeBinding bind(View view) {
        int i10 = R.id.btn_flush;
        ImageView imageView = (ImageView) c.m(view, R.id.btn_flush);
        if (imageView != null) {
            i10 = R.id.rim;
            FrameLayout frameLayout = (FrameLayout) c.m(view, R.id.rim);
            if (frameLayout != null) {
                i10 = R.id.scan_code_layout;
                ScanCodeLayout scanCodeLayout = (ScanCodeLayout) c.m(view, R.id.scan_code_layout);
                if (scanCodeLayout != null) {
                    i10 = R.id.scan_code_layout_bottom;
                    FrameLayout frameLayout2 = (FrameLayout) c.m(view, R.id.scan_code_layout_bottom);
                    if (frameLayout2 != null) {
                        i10 = R.id.scan_code_layout_top;
                        FrameLayout frameLayout3 = (FrameLayout) c.m(view, R.id.scan_code_layout_top);
                        if (frameLayout3 != null) {
                            i10 = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) c.m(view, R.id.toolbar);
                            if (materialToolbar != null) {
                                i10 = R.id.tv_tips;
                                TextView textView = (TextView) c.m(view, R.id.tv_tips);
                                if (textView != null) {
                                    return new ActivityDeviceQrCodeBinding((FrameLayout) view, imageView, frameLayout, scanCodeLayout, frameLayout2, frameLayout3, materialToolbar, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityDeviceQrCodeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityDeviceQrCodeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.activity_device_qr_code, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // a3.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
