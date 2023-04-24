package xk;

/* loaded from: classes2.dex */
public enum c implements nl.b<Object> {
    INSTANCE,
    NEVER;

    @Override // uk.c
    public final void c() {
    }

    @Override // nl.f
    public final void clear() {
    }

    @Override // nl.c
    public final int d(int i10) {
        return i10 & 2;
    }

    @Override // nl.f
    public final boolean isEmpty() {
        return true;
    }

    @Override // nl.f
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // nl.f
    public final Object poll() {
        return null;
    }
}
