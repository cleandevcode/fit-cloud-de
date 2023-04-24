package androidx.camera.core;

import androidx.camera.core.s;
import p0.c;
import s.h1;

/* loaded from: classes.dex */
public final class p implements d0.c<Void> {

    /* renamed from: a */
    public final /* synthetic */ c.a f1781a;

    /* renamed from: b */
    public final /* synthetic */ na.a f1782b;

    public p(c.a aVar, na.a aVar2) {
        this.f1781a = aVar;
        this.f1782b = aVar2;
    }

    @Override // d0.c
    public final void onFailure(Throwable th2) {
        boolean a10;
        if (th2 instanceof s.b) {
            a10 = this.f1782b.cancel(false);
        } else {
            a10 = this.f1781a.a(null);
        }
        h1.k(null, a10);
    }

    @Override // d0.c
    public final void onSuccess(Void r22) {
        h1.k(null, this.f1781a.a(null));
    }
}
