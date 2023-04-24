package com.huawei.hms.scankit.drawable;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ ScanDrawable f7368a;

    public b(ScanDrawable scanDrawable) {
        this.f7368a = scanDrawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2;
        Rect rect;
        Rect rect2;
        Interpolator interpolator;
        Interpolator interpolator2;
        Interpolator interpolator3;
        valueAnimator2 = this.f7368a.f7340f;
        float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
        ScanDrawable scanDrawable = this.f7368a;
        rect = scanDrawable.f7349o;
        int i10 = rect.top;
        rect2 = this.f7368a.f7349o;
        interpolator = ScanDrawable.f7336b;
        scanDrawable.f7355u = i10 + ((int) (interpolator.getInterpolation(floatValue) * rect2.height()));
        if (floatValue < 0.389f) {
            ScanDrawable scanDrawable2 = this.f7368a;
            interpolator3 = ScanDrawable.f7337c;
            scanDrawable2.f7354t = interpolator3.getInterpolation(floatValue / 0.389f);
        } else {
            ScanDrawable scanDrawable3 = this.f7368a;
            interpolator2 = ScanDrawable.f7338d;
            scanDrawable3.f7354t = 1.0f - interpolator2.getInterpolation((floatValue - 0.389f) / 0.611f);
        }
        this.f7368a.invalidateSelf();
    }
}
