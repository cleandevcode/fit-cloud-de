package x2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ o0.b f30169a;

    /* renamed from: b */
    public final /* synthetic */ androidx.transition.i f30170b;

    public c(androidx.transition.i iVar, o0.b bVar) {
        this.f30170b = iVar;
        this.f30169a = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f30169a.remove(animator);
        this.f30170b.f3428m.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f30170b.f3428m.add(animator);
    }
}
