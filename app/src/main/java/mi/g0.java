package mi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.topstep.fitcloud.pro.databinding.LayoutSportingMapContainerBinding;

/* loaded from: classes2.dex */
public final class g0 extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ LayoutSportingMapContainerBinding f21820a;

    public g0(LayoutSportingMapContainerBinding layoutSportingMapContainerBinding) {
        this.f21820a = layoutSportingMapContainerBinding;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        gm.l.f(animator, "animation");
        super.onAnimationStart(animator);
        this.f21820a.getRoot().setVisibility(0);
    }
}
