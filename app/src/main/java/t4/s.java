package t4;

/* loaded from: classes.dex */
public final class s<Z> implements x<Z> {

    /* renamed from: a */
    public final boolean f27726a;

    /* renamed from: b */
    public final boolean f27727b;

    /* renamed from: c */
    public final x<Z> f27728c;

    /* renamed from: d */
    public final a f27729d;

    /* renamed from: e */
    public final r4.f f27730e;

    /* renamed from: f */
    public int f27731f;

    /* renamed from: g */
    public boolean f27732g;

    /* loaded from: classes.dex */
    public interface a {
        void a(r4.f fVar, s<?> sVar);
    }

    public s(x<Z> xVar, boolean z10, boolean z11, r4.f fVar, a aVar) {
        b0.c.i(xVar);
        this.f27728c = xVar;
        this.f27726a = z10;
        this.f27727b = z11;
        this.f27730e = fVar;
        b0.c.i(aVar);
        this.f27729d = aVar;
    }

    public final synchronized void a() {
        if (this.f27732g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f27731f++;
    }

    @Override // t4.x
    public final int b() {
        return this.f27728c.b();
    }

    @Override // t4.x
    public final synchronized void c() {
        if (this.f27731f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f27732g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f27732g = true;
        if (this.f27727b) {
            this.f27728c.c();
        }
    }

    @Override // t4.x
    public final Class<Z> d() {
        return this.f27728c.d();
    }

    public final void e() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f27731f;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f27731f = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f27729d.a(this.f27730e, this);
        }
    }

    @Override // t4.x
    public final Z get() {
        return this.f27728c.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f27726a + ", listener=" + this.f27729d + ", key=" + this.f27730e + ", acquired=" + this.f27731f + ", isRecycled=" + this.f27732g + ", resource=" + this.f27728c + '}';
    }
}
