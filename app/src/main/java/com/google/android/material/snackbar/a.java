package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f6667a;

    public a(BaseTransientBottomBar baseTransientBottomBar) {
        this.f6667a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6667a.f6635c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
