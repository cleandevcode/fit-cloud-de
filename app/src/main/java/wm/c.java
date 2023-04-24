package wm;

/* loaded from: classes2.dex */
public final class c extends f {

    /* renamed from: d */
    public static final c f30045d = new c();

    public c() {
        super(k.f30053b, k.f30054c, k.f30055d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // pm.b0
    public final String toString() {
        return "Dispatchers.Default";
    }
}
