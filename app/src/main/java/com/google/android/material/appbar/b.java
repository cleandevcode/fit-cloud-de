package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ CoordinatorLayout f6233a;

    /* renamed from: b */
    public final /* synthetic */ AppBarLayout f6234b;

    /* renamed from: c */
    public final /* synthetic */ AppBarLayout.BaseBehavior f6235c;

    public b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f6235c = baseBehavior;
        this.f6233a = coordinatorLayout;
        this.f6234b = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6235c.A(this.f6233a, this.f6234b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
