package ha;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f16064a;

    public c(BaseTransientBottomBar baseTransientBottomBar, int i10) {
        this.f16064a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f16064a.e();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) this.f16064a.f6636d;
        snackbarContentLayout.f6664a.setAlpha(1.0f);
        long j10 = 180;
        long j11 = 0;
        snackbarContentLayout.f6664a.animate().alpha(0.0f).setDuration(j10).setStartDelay(j11).start();
        if (snackbarContentLayout.f6665b.getVisibility() == 0) {
            snackbarContentLayout.f6665b.setAlpha(1.0f);
            snackbarContentLayout.f6665b.animate().alpha(0.0f).setDuration(j10).setStartDelay(j11).start();
        }
    }
}
