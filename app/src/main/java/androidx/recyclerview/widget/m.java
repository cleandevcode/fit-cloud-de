package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class m extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView.b0 f3137a;

    /* renamed from: b */
    public final /* synthetic */ int f3138b;

    /* renamed from: c */
    public final /* synthetic */ View f3139c;

    /* renamed from: d */
    public final /* synthetic */ int f3140d;

    /* renamed from: e */
    public final /* synthetic */ ViewPropertyAnimator f3141e;

    /* renamed from: f */
    public final /* synthetic */ p f3142f;

    public m(p pVar, RecyclerView.b0 b0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3142f = pVar;
        this.f3137a = b0Var;
        this.f3138b = i10;
        this.f3139c = view;
        this.f3140d = i11;
        this.f3141e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.f3138b != 0) {
            this.f3139c.setTranslationX(0.0f);
        }
        if (this.f3140d != 0) {
            this.f3139c.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3141e.setListener(null);
        this.f3142f.c(this.f3137a);
        this.f3142f.f3165p.remove(this.f3137a);
        this.f3142f.j();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3142f.getClass();
    }
}
