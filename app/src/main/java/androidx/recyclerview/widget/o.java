package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;

/* loaded from: classes.dex */
public final class o extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ p.a f3151a;

    /* renamed from: b */
    public final /* synthetic */ ViewPropertyAnimator f3152b;

    /* renamed from: c */
    public final /* synthetic */ View f3153c;

    /* renamed from: d */
    public final /* synthetic */ p f3154d;

    public o(p pVar, p.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f3154d = pVar;
        this.f3151a = aVar;
        this.f3152b = viewPropertyAnimator;
        this.f3153c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3152b.setListener(null);
        this.f3153c.setAlpha(1.0f);
        this.f3153c.setTranslationX(0.0f);
        this.f3153c.setTranslationY(0.0f);
        this.f3154d.c(this.f3151a.f3169b);
        this.f3154d.f3167r.remove(this.f3151a.f3169b);
        this.f3154d.j();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        p pVar = this.f3154d;
        RecyclerView.b0 b0Var = this.f3151a.f3169b;
        pVar.getClass();
    }
}
