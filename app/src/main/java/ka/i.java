package ka;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.material.textfield.b f18213a;

    public i(com.google.android.material.textfield.b bVar) {
        this.f18213a = bVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f18213a.f18218c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
