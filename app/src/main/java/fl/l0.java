package fl;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class l0<T> extends gc.d {

    /* renamed from: a */
    public final tk.l<T> f14545a;

    /* renamed from: b */
    public final AtomicReference<b<T>> f14546b = new AtomicReference<>();

    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicReference<b<T>> implements uk.c {

        /* renamed from: a */
        public final tk.n<? super T> f14547a;

        public a(tk.n<? super T> nVar, b<T> bVar) {
            this.f14547a = nVar;
            lazySet(bVar);
        }

        public final boolean a() {
            return get() == null;
        }

        @Override // uk.c
        public final void c() {
            b<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.e(this);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> extends AtomicReference<a<T>[]> implements tk.n<T>, uk.c {

        /* renamed from: e */
        public static final a[] f14548e = new a[0];

        /* renamed from: f */
        public static final a[] f14549f = new a[0];

        /* renamed from: b */
        public final AtomicReference<b<T>> f14551b;

        /* renamed from: d */
        public Throwable f14553d;

        /* renamed from: a */
        public final AtomicBoolean f14550a = new AtomicBoolean();

        /* renamed from: c */
        public final AtomicReference<uk.c> f14552c = new AtomicReference<>();

        public b(AtomicReference<b<T>> atomicReference) {
            this.f14551b = atomicReference;
            lazySet(f14548e);
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            xk.b.h(this.f14552c, cVar);
        }

        @Override // tk.n
        public final void b(T t10) {
            for (a<T> aVar : get()) {
                aVar.f14547a.b(t10);
            }
        }

        @Override // uk.c
        public final void c() {
            getAndSet(f14549f);
            AtomicReference<b<T>> atomicReference = this.f14551b;
            while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
            }
            xk.b.a(this.f14552c);
        }

        public final boolean d() {
            return get() == f14549f;
        }

        public final void e(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = -1;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    } else if (aVarArr[i11] == aVar) {
                        i10 = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                aVarArr2 = f14548e;
                if (length != 1) {
                    aVarArr2 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, i10);
                    System.arraycopy(aVarArr, i10 + 1, aVarArr2, i10, (length - i10) - 1);
                }
            } while (!compareAndSet(aVarArr, aVarArr2));
        }

        @Override // tk.n
        public final void onComplete() {
            this.f14552c.lazySet(xk.b.f30613a);
            for (a<T> aVar : getAndSet(f14549f)) {
                aVar.f14547a.onComplete();
            }
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            uk.c cVar = this.f14552c.get();
            xk.b bVar = xk.b.f30613a;
            if (cVar == bVar) {
                ol.a.a(th2);
                return;
            }
            this.f14553d = th2;
            this.f14552c.lazySet(bVar);
            for (a<T> aVar : getAndSet(f14549f)) {
                aVar.f14547a.onError(th2);
            }
        }
    }

    public l0(tk.i iVar) {
        this.f14545a = iVar;
    }

    @Override // gc.d
    public final void G(wk.d<? super uk.c> dVar) {
        b<T> bVar;
        boolean z10;
        boolean z11;
        while (true) {
            bVar = this.f14546b.get();
            z10 = false;
            if (bVar != null && !bVar.d()) {
                break;
            }
            b<T> bVar2 = new b<>(this.f14546b);
            AtomicReference<b<T>> atomicReference = this.f14546b;
            while (true) {
                if (!atomicReference.compareAndSet(bVar, bVar2)) {
                    if (atomicReference.get() != bVar) {
                        z11 = false;
                        continue;
                        break;
                    }
                } else {
                    z11 = true;
                    continue;
                    break;
                }
            }
            if (z11) {
                bVar = bVar2;
                break;
            }
        }
        if (!bVar.f14550a.get() && bVar.f14550a.compareAndSet(false, true)) {
            z10 = true;
        }
        try {
            dVar.accept(bVar);
            if (z10) {
                this.f14545a.d(bVar);
            }
        } catch (Throwable th2) {
            h7.a.y(th2);
            throw kl.d.d(th2);
        }
    }

    @Override // gc.d
    public final void I() {
        b<T> bVar = this.f14546b.get();
        if (bVar == null || !bVar.d()) {
            return;
        }
        AtomicReference<b<T>> atomicReference = this.f14546b;
        while (!atomicReference.compareAndSet(bVar, null) && atomicReference.get() == bVar) {
        }
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        b<T> bVar;
        boolean z10;
        boolean z11;
        while (true) {
            bVar = this.f14546b.get();
            z10 = false;
            if (bVar != null) {
                break;
            }
            b<T> bVar2 = new b<>(this.f14546b);
            AtomicReference<b<T>> atomicReference = this.f14546b;
            while (true) {
                if (atomicReference.compareAndSet(bVar, bVar2)) {
                    z11 = true;
                    continue;
                    break;
                } else if (atomicReference.get() != bVar) {
                    z11 = false;
                    continue;
                    break;
                }
            }
            if (z11) {
                bVar = bVar2;
                break;
            }
        }
        a<T> aVar = new a<>(nVar, bVar);
        nVar.a(aVar);
        while (true) {
            a<T>[] aVarArr = bVar.get();
            if (aVarArr != b.f14549f) {
                int length = aVarArr.length;
                a[] aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
                if (bVar.compareAndSet(aVarArr, aVarArr2)) {
                    z10 = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z10) {
            if (aVar.a()) {
                bVar.e(aVar);
                return;
            }
            return;
        }
        Throwable th2 = bVar.f14553d;
        if (th2 != null) {
            nVar.onError(th2);
        } else {
            nVar.onComplete();
        }
    }
}
