package ha;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f16063a;

    public b(BaseTransientBottomBar baseTransientBottomBar) {
        this.f16063a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f16063a.f();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) this.f16063a.f6636d;
        snackbarContentLayout.f6664a.setAlpha(0.0f);
        long j10 = 180;
        long j11 = 70;
        snackbarContentLayout.f6664a.animate().alpha(1.0f).setDuration(j10).setStartDelay(j11).start();
        if (snackbarContentLayout.f6665b.getVisibility() == 0) {
            snackbarContentLayout.f6665b.setAlpha(0.0f);
            snackbarContentLayout.f6665b.animate().alpha(1.0f).setDuration(j10).setStartDelay(j11).start();
        }
    }
}
