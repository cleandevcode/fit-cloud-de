package androidx.fragment.app;

import android.transition.Transition;

/* loaded from: classes.dex */
public final class x0 implements Transition.TransitionListener {

    /* renamed from: a */
    public final /* synthetic */ Runnable f2616a;

    public x0(l lVar) {
        this.f2616a = lVar;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.f2616a.run();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
