package com.huawei.hms.scankit.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.huawei.hms.scankit.p.Yc;

/* loaded from: classes.dex */
public class d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ScanDrawable f7370a;

    public d(ScanDrawable scanDrawable) {
        this.f7370a = scanDrawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        ValueAnimator valueAnimator;
        boolean z10;
        boolean z11;
        ScanDrawable scanDrawable;
        float a10;
        super.onAnimationRepeat(animator);
        valueAnimator = this.f7370a.f7340f;
        float abs = Math.abs(((Float) valueAnimator.getAnimatedValue()).floatValue() - 0.5f);
        ScanDrawable scanDrawable2 = this.f7370a;
        z10 = scanDrawable2.f7358x;
        scanDrawable2.f7358x = !z10;
        z11 = this.f7370a.f7358x;
        if (z11) {
            if (abs > 0.35f) {
                scanDrawable = this.f7370a;
                a10 = 0.0f;
            } else {
                scanDrawable = this.f7370a;
                a10 = Yc.a(0.5f);
            }
            scanDrawable.f7352r = a10;
        }
    }
}
