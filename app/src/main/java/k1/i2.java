package k1;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: a */
    public final WeakReference<View> f18125a;

    /* loaded from: classes.dex */
    public static class a {
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public i2(View view) {
        this.f18125a = new WeakReference<>(view);
    }

    public final void a(float f10) {
        View view = this.f18125a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
    }

    public final void b() {
        View view = this.f18125a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j10) {
        View view = this.f18125a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
    }

    public final void d(j2 j2Var) {
        View view = this.f18125a.get();
        if (view != null) {
            if (j2Var != null) {
                view.animate().setListener(new h2(j2Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f10) {
        View view = this.f18125a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
    }
}
