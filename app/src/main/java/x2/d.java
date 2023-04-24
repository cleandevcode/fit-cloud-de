package x2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ androidx.transition.i f30171a;

    public d(androidx.transition.i iVar) {
        this.f30171a = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f30171a.o();
        animator.removeListener(this);
    }
}
