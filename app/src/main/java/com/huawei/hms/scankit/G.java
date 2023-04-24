package com.huawei.hms.scankit;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public class G implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ ViewfinderView f7104a;

    public G(ViewfinderView viewfinderView) {
        this.f7104a = viewfinderView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7104a.f7117m = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f7104a.invalidate();
    }
}
