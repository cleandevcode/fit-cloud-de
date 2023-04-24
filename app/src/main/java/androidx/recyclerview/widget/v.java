package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.t;

/* loaded from: classes.dex */
public final class v implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ t.f f3318a;

    public v(t.f fVar) {
        this.f3318a = fVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3318a.f3315m = valueAnimator.getAnimatedFraction();
    }
}
