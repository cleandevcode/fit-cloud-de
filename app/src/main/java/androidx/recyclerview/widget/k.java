package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.b0 f3124a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f3125b;

    /* renamed from: c */
    public final /* synthetic */ View f3126c;

    /* renamed from: d */
    public final /* synthetic */ p f3127d;

    public k(View view, ViewPropertyAnimator viewPropertyAnimator, p pVar, RecyclerView.b0 b0Var) {
        this.f3127d = pVar;
        this.f3124a = b0Var;
        this.f3125b = viewPropertyAnimator;
        this.f3126c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3125b.setListener(null);
        this.f3126c.setAlpha(1.0f);
        this.f3127d.c(this.f3124a);
        this.f3127d.f3166q.remove(this.f3124a);
        this.f3127d.j();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3127d.getClass();
    }
}
