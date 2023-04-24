package androidx.camera.core;

import p0.c;

/* loaded from: classes.dex */
public final class i implements d0.c<Void> {

    /* renamed from: a */
    public final /* synthetic */ c.a f1706a;

    /* renamed from: b */
    public final /* synthetic */ h f1707b;

    public i(h hVar, c.a aVar) {
        this.f1707b = hVar;
        this.f1706a = aVar;
    }

    @Override // d0.c
    public final void onFailure(Throwable th2) {
        this.f1707b.M();
        this.f1706a.b(th2);
    }

    @Override // d0.c
    public final void onSuccess(Void r12) {
        this.f1707b.M();
    }
}
