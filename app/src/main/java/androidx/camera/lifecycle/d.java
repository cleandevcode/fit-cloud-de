package androidx.camera.lifecycle;

import p0.c;
import y.u;

/* loaded from: classes.dex */
public final class d implements d0.c<Void> {

    /* renamed from: a */
    public final /* synthetic */ c.a f1839a;

    /* renamed from: b */
    public final /* synthetic */ u f1840b;

    public d(u uVar, c.a aVar) {
        this.f1839a = aVar;
        this.f1840b = uVar;
    }

    @Override // d0.c
    public final void onFailure(Throwable th2) {
        this.f1839a.b(th2);
    }

    @Override // d0.c
    public final void onSuccess(Void r22) {
        this.f1839a.a(this.f1840b);
    }
}
