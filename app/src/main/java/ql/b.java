package ql;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import tk.n;

/* loaded from: classes2.dex */
public final class b<T> extends d<T> {

    /* renamed from: c */
    public static final a[] f24964c = new a[0];

    /* renamed from: d */
    public static final a[] f24965d = new a[0];

    /* renamed from: a */
    public final AtomicReference<a<T>[]> f24966a = new AtomicReference<>(f24965d);

    /* renamed from: b */
    public Throwable f24967b;

    /* loaded from: classes2.dex */
    public static final class a<T> extends AtomicBoolean implements uk.c {

        /* renamed from: a */
        public final n<? super T> f24968a;

        /* renamed from: b */
        public final b<T> f24969b;

        public a(n<? super T> nVar, b<T> bVar) {
            this.f24968a = nVar;
            this.f24969b = bVar;
        }

        @Override // uk.c
        public final void c() {
            if (compareAndSet(false, true)) {
                this.f24969b.H(this);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0048, code lost:
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(ql.b.a<T> r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<ql.b$a<T>[]> r0 = r7.f24966a
            java.lang.Object r0 = r0.get()
            ql.b$a[] r0 = (ql.b.a[]) r0
            ql.b$a[] r1 = ql.b.f24964c
            if (r0 == r1) goto L4a
            ql.b$a[] r1 = ql.b.f24965d
            if (r0 != r1) goto L11
            goto L4a
        L11:
            int r1 = r0.length
            r2 = -1
            r3 = 0
            r4 = 0
        L15:
            if (r4 >= r1) goto L20
            r5 = r0[r4]
            if (r5 != r8) goto L1d
            r2 = r4
            goto L20
        L1d:
            int r4 = r4 + 1
            goto L15
        L20:
            if (r2 >= 0) goto L23
            return
        L23:
            r4 = 1
            if (r1 != r4) goto L29
            ql.b$a[] r1 = ql.b.f24965d
            goto L38
        L29:
            int r5 = r1 + (-1)
            ql.b$a[] r5 = new ql.b.a[r5]
            java.lang.System.arraycopy(r0, r3, r5, r3, r2)
            int r6 = r2 + 1
            int r1 = r1 - r2
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r6, r5, r2, r1)
            r1 = r5
        L38:
            java.util.concurrent.atomic.AtomicReference<ql.b$a<T>[]> r2 = r7.f24966a
        L3a:
            boolean r5 = r2.compareAndSet(r0, r1)
            if (r5 == 0) goto L42
            r3 = 1
            goto L48
        L42:
            java.lang.Object r5 = r2.get()
            if (r5 == r0) goto L3a
        L48:
            if (r3 == 0) goto L0
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ql.b.H(ql.b$a):void");
    }

    @Override // tk.n
    public final void a(uk.c cVar) {
        if (this.f24966a.get() == f24964c) {
            cVar.c();
        }
    }

    @Override // tk.n
    public final void b(T t10) {
        a<T>[] aVarArr;
        kl.d.b(t10, "onNext called with a null value.");
        for (a<T> aVar : this.f24966a.get()) {
            if (!aVar.get()) {
                aVar.f24968a.b(t10);
            }
        }
    }

    @Override // tk.n
    public final void onComplete() {
        a<T>[] andSet;
        a<T>[] aVarArr = this.f24966a.get();
        a<T>[] aVarArr2 = f24964c;
        if (aVarArr == aVarArr2) {
            return;
        }
        for (a<T> aVar : this.f24966a.getAndSet(aVarArr2)) {
            if (!aVar.get()) {
                aVar.f24968a.onComplete();
            }
        }
    }

    @Override // tk.n
    public final void onError(Throwable th2) {
        a<T>[] andSet;
        kl.d.b(th2, "onError called with a null Throwable.");
        a<T>[] aVarArr = this.f24966a.get();
        a<T>[] aVarArr2 = f24964c;
        if (aVarArr == aVarArr2) {
            ol.a.a(th2);
            return;
        }
        this.f24967b = th2;
        for (a<T> aVar : this.f24966a.getAndSet(aVarArr2)) {
            if (aVar.get()) {
                ol.a.a(th2);
            } else {
                aVar.f24968a.onError(th2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0031, code lost:
        continue;
     */
    @Override // tk.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(tk.n<? super T> r8) {
        /*
            r7 = this;
            ql.b$a r0 = new ql.b$a
            r0.<init>(r8, r7)
            r8.a(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference<ql.b$a<T>[]> r1 = r7.f24966a
            java.lang.Object r1 = r1.get()
            ql.b$a[] r1 = (ql.b.a[]) r1
            ql.b$a[] r2 = ql.b.f24964c
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L17
            goto L34
        L17:
            int r2 = r1.length
            int r5 = r2 + 1
            ql.b$a[] r5 = new ql.b.a[r5]
            java.lang.System.arraycopy(r1, r3, r5, r3, r2)
            r5[r2] = r0
            java.util.concurrent.atomic.AtomicReference<ql.b$a<T>[]> r2 = r7.f24966a
        L23:
            boolean r6 = r2.compareAndSet(r1, r5)
            if (r6 == 0) goto L2b
            r3 = 1
            goto L31
        L2b:
            java.lang.Object r6 = r2.get()
            if (r6 == r1) goto L23
        L31:
            if (r3 == 0) goto L8
            r3 = 1
        L34:
            if (r3 == 0) goto L40
            boolean r8 = r0.get()
            if (r8 == 0) goto L4b
            r7.H(r0)
            goto L4b
        L40:
            java.lang.Throwable r0 = r7.f24967b
            if (r0 == 0) goto L48
            r8.onError(r0)
            goto L4b
        L48:
            r8.onComplete()
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ql.b.z(tk.n):void");
    }
}
