package oi;

import android.animation.ValueAnimator;
import com.topstep.fitcloud.pro.ui.widget.LongPressTurnAroundLayout;

/* loaded from: classes2.dex */
public final class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ LongPressTurnAroundLayout f23565a;

    public d(LongPressTurnAroundLayout longPressTurnAroundLayout) {
        this.f23565a = longPressTurnAroundLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f23565a.f12377h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f23565a.invalidate();
    }
}
