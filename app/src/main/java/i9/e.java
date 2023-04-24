package i9;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* loaded from: classes.dex */
public final class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ CollapsingToolbarLayout f16737a;

    public e(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f16737a = collapsingToolbarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f16737a.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
