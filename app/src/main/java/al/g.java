package al;

import tk.n;

/* loaded from: classes2.dex */
public class g<T> extends b<T> {

    /* renamed from: a */
    public final n<? super T> f618a;

    /* renamed from: b */
    public T f619b;

    public g(n<? super T> nVar) {
        this.f618a = nVar;
    }

    @Override // uk.c
    public void c() {
        set(4);
        this.f619b = null;
    }

    @Override // nl.f
    public final void clear() {
        lazySet(32);
        this.f619b = null;
    }

    @Override // nl.c
    public final int d(int i10) {
        if ((i10 & 2) != 0) {
            lazySet(8);
            return 2;
        }
        return 0;
    }

    public final void e(T t10) {
        int i10 = get();
        if ((i10 & 54) != 0) {
            return;
        }
        n<? super T> nVar = this.f618a;
        if (i10 == 8) {
            this.f619b = t10;
            lazySet(16);
            t10 = null;
        } else {
            lazySet(2);
        }
        nVar.b(t10);
        if (get() != 4) {
            nVar.onComplete();
        }
    }

    public final boolean f() {
        return get() == 4;
    }

    @Override // nl.f
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // nl.f
    public final T poll() {
        if (get() == 16) {
            T t10 = this.f619b;
            this.f619b = null;
            lazySet(32);
            return t10;
        }
        return null;
    }
}
