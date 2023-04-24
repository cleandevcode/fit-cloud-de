package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import android.os.Handler;

/* loaded from: classes.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f6669a;

    public c(BaseTransientBottomBar baseTransientBottomBar, int i10) {
        this.f6669a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Handler handler = BaseTransientBottomBar.f6630n;
        this.f6669a.f6635c.setTranslationY(intValue);
    }
}
