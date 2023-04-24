package k1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class h2 extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ j2 f18122a;

    /* renamed from: b */
    public final /* synthetic */ View f18123b;

    public h2(j2 j2Var, View view) {
        this.f18122a = j2Var;
        this.f18123b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f18122a.a(this.f18123b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f18122a.e();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f18122a.c();
    }
}
