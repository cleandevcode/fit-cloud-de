package com.google.android.material.snackbar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f6672a;

    public f(BaseTransientBottomBar baseTransientBottomBar) {
        this.f6672a = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BaseTransientBottomBar.e eVar = this.f6672a.f6635c;
        if (eVar == null) {
            return;
        }
        if (eVar.getParent() != null) {
            this.f6672a.f6635c.setVisibility(0);
        }
        if (this.f6672a.f6635c.getAnimationMode() == 1) {
            BaseTransientBottomBar baseTransientBottomBar = this.f6672a;
            baseTransientBottomBar.getClass();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(h9.a.f16043a);
            ofFloat.addUpdateListener(new a(baseTransientBottomBar));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
            ofFloat2.setInterpolator(h9.a.f16046d);
            ofFloat2.addUpdateListener(new b(baseTransientBottomBar));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.setDuration(150L);
            animatorSet.addListener(new ha.g(baseTransientBottomBar));
            animatorSet.start();
            return;
        }
        BaseTransientBottomBar baseTransientBottomBar2 = this.f6672a;
        int height = baseTransientBottomBar2.f6635c.getHeight();
        ViewGroup.LayoutParams layoutParams = baseTransientBottomBar2.f6635c.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        baseTransientBottomBar2.f6635c.setTranslationY(height);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(height, 0);
        valueAnimator.setInterpolator(h9.a.f16044b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new ha.b(baseTransientBottomBar2));
        valueAnimator.addUpdateListener(new c(baseTransientBottomBar2, height));
        valueAnimator.start();
    }
}
