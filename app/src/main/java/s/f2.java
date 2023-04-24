package s;

/* loaded from: classes.dex */
public final class f2 implements d0.c<Void> {

    /* renamed from: a */
    public final /* synthetic */ g2 f25953a;

    public f2(g2 g2Var) {
        this.f25953a = g2Var;
    }

    @Override // d0.c
    public final void onFailure(Throwable th2) {
        y.u0.c("ProcessingCaptureSession", "open session failed ", th2);
        this.f25953a.close();
    }

    @Override // d0.c
    public final /* bridge */ /* synthetic */ void onSuccess(Void r12) {
    }
}
