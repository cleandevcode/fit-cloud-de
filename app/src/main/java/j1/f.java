package j1;

/* loaded from: classes.dex */
public final class f<T> extends e {

    /* renamed from: c */
    public final Object f17261c;

    public f(int i10) {
        super(i10, 0);
        this.f17261c = new Object();
    }

    @Override // j1.e, j1.d
    public final T acquire() {
        T t10;
        synchronized (this.f17261c) {
            t10 = (T) super.acquire();
        }
        return t10;
    }

    @Override // j1.e, j1.d
    public final boolean release(T t10) {
        boolean release;
        synchronized (this.f17261c) {
            release = super.release(t10);
        }
        return release;
    }
}
