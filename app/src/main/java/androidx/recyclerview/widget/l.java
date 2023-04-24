package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class l extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.b0 f3129a;

    /* renamed from: b */
    public final /* synthetic */ View f3130b;

    /* renamed from: c */
    public final /* synthetic */ ViewPropertyAnimator f3131c;

    /* renamed from: d */
    public final /* synthetic */ p f3132d;

    public l(View view, ViewPropertyAnimator viewPropertyAnimator, p pVar, RecyclerView.b0 b0Var) {
        this.f3132d = pVar;
        this.f3129a = b0Var;
        this.f3130b = view;
        this.f3131c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3130b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3131c.setListener(null);
        this.f3132d.c(this.f3129a);
        this.f3132d.f3164o.remove(this.f3129a);
        this.f3132d.j();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3132d.getClass();
    }
}
