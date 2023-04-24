package ka;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.material.textfield.a f18207a;

    public b(com.google.android.material.textfield.a aVar) {
        this.f18207a = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f18207a.f18216a.setEndIconVisible(false);
    }
}
