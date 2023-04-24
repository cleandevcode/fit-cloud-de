package k1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class h0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final View f18119a;

    /* renamed from: b */
    public ViewTreeObserver f18120b;

    /* renamed from: c */
    public final Runnable f18121c;

    public h0(ViewGroup viewGroup, Runnable runnable) {
        this.f18119a = viewGroup;
        this.f18120b = viewGroup.getViewTreeObserver();
        this.f18121c = runnable;
    }

    public static void a(ViewGroup viewGroup, Runnable runnable) {
        if (viewGroup == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        h0 h0Var = new h0(viewGroup, runnable);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(h0Var);
        viewGroup.addOnAttachStateChangeListener(h0Var);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver;
        if (this.f18120b.isAlive()) {
            viewTreeObserver = this.f18120b;
        } else {
            viewTreeObserver = this.f18119a.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        this.f18119a.removeOnAttachStateChangeListener(this);
        this.f18121c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f18120b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        (this.f18120b.isAlive() ? this.f18120b : this.f18119a.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f18119a.removeOnAttachStateChangeListener(this);
    }
}
