package uk;

/* loaded from: classes2.dex */
public final class a extends e<wk.a> {
    public a(sc.c cVar) {
        super(cVar);
    }

    @Override // uk.e
    public final void b(wk.a aVar) {
        try {
            aVar.run();
        } catch (Throwable th2) {
            throw kl.d.d(th2);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("ActionDisposable(disposed=");
        a10.append(a());
        a10.append(", ");
        a10.append(get());
        a10.append(")");
        return a10.toString();
    }
}
