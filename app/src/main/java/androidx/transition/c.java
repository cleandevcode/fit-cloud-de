package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

/* loaded from: classes.dex */
public final class c extends o {

    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final View f3401a;

        /* renamed from: b */
        public boolean f3402b = false;

        public a(View view) {
            this.f3401a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            x2.l.f30185a.d(this.f3401a, 1.0f);
            if (this.f3402b) {
                this.f3401a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            View view = this.f3401a;
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            if (o0.d.h(view) && this.f3401a.getLayerType() == 0) {
                this.f3402b = true;
                this.f3401a.setLayerType(2, null);
            }
        }
    }

    public c() {
    }

    public c(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f3462x = i10;
    }

    public final ObjectAnimator N(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        x2.l.f30185a.d(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, x2.l.f30186b, f11);
        ofFloat.addListener(new a(view));
        a(new b(view));
        return ofFloat;
    }

    @Override // androidx.transition.i
    public final void g(x2.g gVar) {
        L(gVar);
        gVar.f30175a.put("android:fade:transitionAlpha", Float.valueOf(x2.l.f30185a.c(gVar.f30176b)));
    }
}
