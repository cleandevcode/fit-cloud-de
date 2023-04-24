package ka;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.material.textfield.a f18208a;

    public c(com.google.android.material.textfield.a aVar) {
        this.f18208a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f18208a.f18218c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
