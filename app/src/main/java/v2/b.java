package v2;

import android.animation.ValueAnimator;
import v2.d;

/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ d.a f28994a;

    /* renamed from: b */
    public final /* synthetic */ d f28995b;

    public b(d dVar, d.a aVar) {
        this.f28995b = dVar;
        this.f28994a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d dVar = this.f28995b;
        d.a aVar = this.f28994a;
        dVar.getClass();
        d.d(floatValue, aVar);
        this.f28995b.a(floatValue, this.f28994a, false);
        this.f28995b.invalidateSelf();
    }
}
