package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f6758a;

    /* renamed from: b */
    public final /* synthetic */ View f6759b;

    /* renamed from: c */
    public final /* synthetic */ TabLayout.f f6760c;

    public b(TabLayout.f fVar, View view, View view2) {
        this.f6760c = fVar;
        this.f6758a = view;
        this.f6759b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6760c.c(this.f6758a, this.f6759b, valueAnimator.getAnimatedFraction());
    }
}
