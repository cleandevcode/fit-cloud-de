package mi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.topstep.fitcloud.pro.databinding.LayoutSportingMapContainerBinding;

/* loaded from: classes2.dex */
public final class h0 extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ LayoutSportingMapContainerBinding f21826a;

    public h0(LayoutSportingMapContainerBinding layoutSportingMapContainerBinding) {
        this.f21826a = layoutSportingMapContainerBinding;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        gm.l.f(animator, "animation");
        super.onAnimationEnd(animator);
        this.f21826a.getRoot().setVisibility(8);
    }
}
