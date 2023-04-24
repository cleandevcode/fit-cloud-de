package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.material.circularreveal.c f6941a;

    /* renamed from: b */
    public final /* synthetic */ Drawable f6942b;

    public b(com.google.android.material.circularreveal.c cVar, Drawable drawable) {
        this.f6941a = cVar;
        this.f6942b = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f6941a.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f6941a.setCircularRevealOverlayDrawable(this.f6942b);
    }
}
