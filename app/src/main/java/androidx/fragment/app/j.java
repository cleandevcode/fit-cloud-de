package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ z0 f2390a;

    /* renamed from: b */
    public final /* synthetic */ View f2391b;

    /* renamed from: c */
    public final /* synthetic */ Rect f2392c;

    public j(z0 z0Var, View view, Rect rect) {
        this.f2390a = z0Var;
        this.f2391b = view;
        this.f2392c = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z0 z0Var = this.f2390a;
        View view = this.f2391b;
        Rect rect = this.f2392c;
        z0Var.getClass();
        z0.g(view, rect);
    }
}
