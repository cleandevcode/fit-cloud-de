package ka;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.material.textfield.a f18209a;

    public d(com.google.android.material.textfield.a aVar) {
        this.f18209a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f18209a.f18218c.setScaleX(floatValue);
        this.f18209a.f18218c.setScaleY(floatValue);
    }
}
