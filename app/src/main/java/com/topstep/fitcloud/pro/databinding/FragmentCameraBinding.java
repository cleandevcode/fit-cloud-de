package com.topstep.fitcloud.pro.databinding;

import a3.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.camera.view.PreviewView;
import b0.c;
import com.topstep.fitcloud.pro.ui.widget.CountDownView;
import com.topstep.fitcloudpro.R;

/* loaded from: classes2.dex */
public final class FragmentCameraBinding implements a {
    public final ImageButton btnShutter;
    public final CountDownView countDownView;
    public final ImageView imgFacing;
    public final ImageView imgFile;
    public final ImageView imgFlash;
    private final FrameLayout rootView;
    public final PreviewView viewFinder;

    private FragmentCameraBinding(FrameLayout frameLayout, ImageButton imageButton, CountDownView countDownView, ImageView imageView, ImageView imageView2, ImageView imageView3, PreviewView previewView) {
        this.rootView = frameLayout;
        this.btnShutter = imageButton;
        this.countDownView = countDownView;
        this.imgFacing = imageView;
        this.imgFile = imageView2;
        this.imgFlash = imageView3;
        this.viewFinder = previewView;
    }

    public static FragmentCameraBinding bind(View view) {
        int i10 = R.id.btn_shutter;
        ImageButton imageButton = (ImageButton) c.m(view, R.id.btn_shutter);
        if (imageButton != null) {
            i10 = R.id.count_down_view;
            CountDownView countDownView = (CountDownView) c.m(view, R.id.count_down_view);
            if (countDownView != null) {
                i10 = R.id.img_facing;
                ImageView imageView = (ImageView) c.m(view, R.id.img_facing);
                if (imageView != null) {
                    i10 = R.id.img_file;
                    ImageView imageView2 = (ImageView) c.m(view, R.id.img_file);
                    if (imageView2 != null) {
                        i10 = R.id.img_flash;
                        ImageView imageView3 = (ImageView) c.m(view, R.id.img_flash);
                        if (imageView3 != null) {
                            i10 = R.id.view_finder;
                            PreviewView previewView = (PreviewView) c.m(view, R.id.view_finder);
                            if (previewView != null) {
                                return new FragmentCameraBinding((FrameLayout) view, imageButton, countDownView, imageView, imageView2, imageView3, previewView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentCameraBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCameraBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.fragment_camera, viewGroup, false);
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
