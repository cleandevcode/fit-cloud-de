package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;

/* loaded from: classes.dex */
public final class n extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ p.a f3146a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f3147b;

    /* renamed from: c */
    public final /* synthetic */ View f3148c;

    /* renamed from: d */
    public final /* synthetic */ p f3149d;

    public n(p pVar, p.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3149d = pVar;
        this.f3146a = aVar;
        this.f3147b = viewPropertyAnimator;
        this.f3148c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3147b.setListener(null);
        this.f3148c.setAlpha(1.0f);
        this.f3148c.setTranslationX(0.0f);
        this.f3148c.setTranslationY(0.0f);
        this.f3149d.c(this.f3146a.f3168a);
        this.f3149d.f3167r.remove(this.f3146a.f3168a);
        this.f3149d.j();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        p pVar = this.f3149d;
        RecyclerView.b0 b0Var = this.f3146a.f3168a;
        pVar.getClass();
    }
}
