package y;

import android.view.Surface;

/* loaded from: classes.dex */
public final class a1 implements d0.c<Surface> {

    /* renamed from: a */
    public final /* synthetic */ b1 f30651a;

    public a1(b1 b1Var) {
        this.f30651a = b1Var;
    }

    @Override // d0.c
    public final void onFailure(Throwable th2) {
        u0.c("ProcessingSurfaceTextur", "Failed to extract Listenable<Surface>.", th2);
    }

    @Override // d0.c
    public final void onSuccess(Surface surface) {
        Surface surface2 = surface;
        synchronized (this.f30651a.f30659m) {
            this.f30651a.f30664r.a(1, surface2);
        }
    }
}
