package fl;

/* loaded from: classes2.dex */
public final class z<T> implements tk.b, nl.c, xn.b, nl.b<Object> {

    /* renamed from: a */
    public final tk.n<? super T> f14769a;

    /* renamed from: b */
    public uk.c f14770b;

    public z(tk.n<? super T> nVar) {
        this.f14769a = nVar;
    }

    @Override // tk.b, tk.g
    public final void a(uk.c cVar) {
        if (xk.b.i(this.f14770b, cVar)) {
            this.f14770b = cVar;
            this.f14769a.a(this);
        }
    }

    @Override // uk.c
    public final void c() {
        this.f14770b.c();
        this.f14770b = xk.b.f30613a;
    }

    @Override // xn.b
    public final /* bridge */ /* synthetic */ void cancel() {
    }

    @Override // nl.f
    public final /* bridge */ /* synthetic */ void clear() {
    }

    @Override // nl.c
    public final int d(int i10) {
        return i10 & 2;
    }

    @Override // xn.b
    public final /* bridge */ /* synthetic */ void g(long j10) {
    }

    @Override // nl.f
    public final /* bridge */ /* synthetic */ boolean isEmpty() {
        return true;
    }

    @Override // nl.f
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // tk.b, tk.g
    public final void onComplete() {
        this.f14770b = xk.b.f30613a;
        this.f14769a.onComplete();
    }

    @Override // tk.b, tk.g
    public final void onError(Throwable th2) {
        this.f14770b = xk.b.f30613a;
        this.f14769a.onError(th2);
    }

    @Override // nl.f
    public final /* bridge */ /* synthetic */ Object poll() {
        return null;
    }
}
