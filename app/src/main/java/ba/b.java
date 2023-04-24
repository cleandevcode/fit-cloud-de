package ba;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ float f4083a;

    /* renamed from: b */
    public final /* synthetic */ a f4084b;

    public b(a aVar, float f10) {
        this.f4084b = aVar;
        this.f4083a = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4084b.b(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f4083a);
    }
}
