package al;

import tk.n;

/* loaded from: classes2.dex */
public abstract class a<T, R> implements n<T>, nl.b<R> {

    /* renamed from: a */
    public final n<? super R> f603a;

    /* renamed from: b */
    public uk.c f604b;

    /* renamed from: c */
    public nl.b<T> f605c;

    /* renamed from: d */
    public boolean f606d;

    /* renamed from: e */
    public int f607e;

    public a(n<? super R> nVar) {
        this.f603a = nVar;
    }

    @Override // tk.n
    public final void a(uk.c cVar) {
        if (xk.b.i(this.f604b, cVar)) {
            this.f604b = cVar;
            if (cVar instanceof nl.b) {
                this.f605c = (nl.b) cVar;
            }
            this.f603a.a(this);
        }
    }

    @Override // uk.c
    public final void c() {
        this.f604b.c();
    }

    @Override // nl.f
    public final void clear() {
        this.f605c.clear();
    }

    public final int e(int i10) {
        nl.b<T> bVar = this.f605c;
        if (bVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int d10 = bVar.d(i10);
        if (d10 != 0) {
            this.f607e = d10;
        }
        return d10;
    }

    @Override // nl.f
    public final boolean isEmpty() {
        return this.f605c.isEmpty();
    }

    @Override // nl.f
    public final boolean offer(R r10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // tk.n
    public final void onComplete() {
        if (this.f606d) {
            return;
        }
        this.f606d = true;
        this.f603a.onComplete();
    }

    @Override // tk.n
    public final void onError(Throwable th2) {
        if (this.f606d) {
            ol.a.a(th2);
            return;
        }
        this.f606d = true;
        this.f603a.onError(th2);
    }
}
