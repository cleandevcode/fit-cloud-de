package fl;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class b<T> extends tk.i<T> {

    /* renamed from: a */
    public final tk.l<? extends T>[] f14328a = null;

    /* renamed from: b */
    public final Iterable<? extends tk.l<? extends T>> f14329b;

    /* loaded from: classes2.dex */
    public static final class a<T> implements uk.c {

        /* renamed from: a */
        public final tk.n<? super T> f14330a;

        /* renamed from: b */
        public final C0255b<T>[] f14331b;

        /* renamed from: c */
        public final AtomicInteger f14332c = new AtomicInteger();

        public a(tk.n<? super T> nVar, int i10) {
            this.f14330a = nVar;
            this.f14331b = new C0255b[i10];
        }

        public final boolean a(int i10) {
            int i11 = 0;
            if (this.f14332c.get() == 0 && this.f14332c.compareAndSet(0, i10)) {
                C0255b<T>[] c0255bArr = this.f14331b;
                int length = c0255bArr.length;
                while (i11 < length) {
                    int i12 = i11 + 1;
                    if (i12 != i10) {
                        C0255b<T> c0255b = c0255bArr[i11];
                        c0255b.getClass();
                        xk.b.a(c0255b);
                    }
                    i11 = i12;
                }
                return true;
            }
            return false;
        }

        @Override // uk.c
        public final void c() {
            C0255b<T>[] c0255bArr;
            if (this.f14332c.get() != -1) {
                this.f14332c.lazySet(-1);
                for (C0255b<T> c0255b : this.f14331b) {
                    c0255b.getClass();
                    xk.b.a(c0255b);
                }
            }
        }
    }

    /* renamed from: fl.b$b */
    /* loaded from: classes2.dex */
    public static final class C0255b<T> extends AtomicReference<uk.c> implements tk.n<T> {

        /* renamed from: a */
        public final a<T> f14333a;

        /* renamed from: b */
        public final int f14334b;

        /* renamed from: c */
        public final tk.n<? super T> f14335c;

        /* renamed from: d */
        public boolean f14336d;

        public C0255b(a<T> aVar, int i10, tk.n<? super T> nVar) {
            this.f14333a = aVar;
            this.f14334b = i10;
            this.f14335c = nVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            xk.b.h(this, cVar);
        }

        @Override // tk.n
        public final void b(T t10) {
            if (!this.f14336d) {
                if (!this.f14333a.a(this.f14334b)) {
                    get().c();
                    return;
                }
                this.f14336d = true;
            }
            this.f14335c.b(t10);
        }

        @Override // tk.n
        public final void onComplete() {
            if (!this.f14336d) {
                if (!this.f14333a.a(this.f14334b)) {
                    return;
                }
                this.f14336d = true;
            }
            this.f14335c.onComplete();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (!this.f14336d) {
                if (!this.f14333a.a(this.f14334b)) {
                    ol.a.a(th2);
                    return;
                }
                this.f14336d = true;
            }
            this.f14335c.onError(th2);
        }
    }

    public b(List list) {
        this.f14329b = list;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        int length;
        xk.c cVar = xk.c.INSTANCE;
        tk.l<? extends T>[] lVarArr = this.f14328a;
        if (lVarArr == null) {
            lVarArr = new tk.l[8];
            try {
                length = 0;
                for (tk.l<? extends T> lVar : this.f14329b) {
                    if (lVar == null) {
                        NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                        nVar.a(cVar);
                        nVar.onError(nullPointerException);
                        return;
                    }
                    if (length == lVarArr.length) {
                        tk.l<? extends T>[] lVarArr2 = new tk.l[(length >> 2) + length];
                        System.arraycopy(lVarArr, 0, lVarArr2, 0, length);
                        lVarArr = lVarArr2;
                    }
                    int i10 = length + 1;
                    lVarArr[length] = lVar;
                    length = i10;
                }
            } catch (Throwable th2) {
                h7.a.y(th2);
                nVar.a(cVar);
                nVar.onError(th2);
                return;
            }
        } else {
            length = lVarArr.length;
        }
        if (length == 0) {
            nVar.a(cVar);
            nVar.onComplete();
        } else if (length == 1) {
            lVarArr[0].d(nVar);
        } else {
            a aVar = new a(nVar, length);
            C0255b<T>[] c0255bArr = aVar.f14331b;
            int length2 = c0255bArr.length;
            int i11 = 0;
            while (i11 < length2) {
                int i12 = i11 + 1;
                c0255bArr[i11] = new C0255b<>(aVar, i12, aVar.f14330a);
                i11 = i12;
            }
            aVar.f14332c.lazySet(0);
            aVar.f14330a.a(aVar);
            for (int i13 = 0; i13 < length2 && aVar.f14332c.get() == 0; i13++) {
                lVarArr[i13].d(c0255bArr[i13]);
            }
        }
    }
}
