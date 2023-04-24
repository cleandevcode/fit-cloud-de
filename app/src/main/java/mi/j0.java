package mi;

import android.view.animation.Animation;
import com.topstep.fitcloud.pro.databinding.LayoutSportingRootBinding;

/* loaded from: classes2.dex */
public final class j0 implements Animation.AnimationListener {

    /* renamed from: a */
    public final /* synthetic */ LayoutSportingRootBinding f21832a;

    public j0(LayoutSportingRootBinding layoutSportingRootBinding) {
        this.f21832a = layoutSportingRootBinding;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        gm.l.f(animation, "animation");
        this.f21832a.pauseView.setVisibility(0);
        this.f21832a.resumeView.setVisibility(4);
        this.f21832a.stopView.setVisibility(4);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        gm.l.f(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        gm.l.f(animation, "animation");
    }
}
