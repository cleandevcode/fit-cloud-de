package gc;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import tk.n;

/* loaded from: classes.dex */
public final class c<T> extends d {

    /* renamed from: b */
    public static final a[] f15212b = new a[0];

    /* renamed from: a */
    public final AtomicReference<a<T>[]> f15213a = new AtomicReference<>(f15212b);

    /* loaded from: classes.dex */
    public static final class a<T> extends AtomicBoolean implements uk.c {

        /* renamed from: a */
        public final n<? super T> f15214a;

        /* renamed from: b */
        public final c<T> f15215b;

        public a(n<? super T> nVar, c<T> cVar) {
            this.f15214a = nVar;
            this.f15215b = cVar;
        }

        @Override // uk.c
        public final void c() {
            if (compareAndSet(false, true)) {
                this.f15215b.J(this);
            }
        }
    }

    @Override // gc.d
    public final boolean H() {
        return this.f15213a.get().length != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0044, code lost:
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(gc.c.a<T> r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<gc.c$a<T>[]> r0 = r7.f15213a
            java.lang.Object r0 = r0.get()
            gc.c$a[] r0 = (gc.c.a[]) r0
            gc.c$a[] r1 = gc.c.f15212b
            if (r0 != r1) goto Ld
            return
        Ld:
            int r1 = r0.length
            r2 = -1
            r3 = 0
            r4 = 0
        L11:
            if (r4 >= r1) goto L1c
            r5 = r0[r4]
            if (r5 != r8) goto L19
            r2 = r4
            goto L1c
        L19:
            int r4 = r4 + 1
            goto L11
        L1c:
            if (r2 >= 0) goto L1f
            return
        L1f:
            r4 = 1
            if (r1 != r4) goto L25
            gc.c$a[] r1 = gc.c.f15212b
            goto L34
        L25:
            int r5 = r1 + (-1)
            gc.c$a[] r5 = new gc.c.a[r5]
            java.lang.System.arraycopy(r0, r3, r5, r3, r2)
            int r6 = r2 + 1
            int r1 = r1 - r2
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r6, r5, r2, r1)
            r1 = r5
        L34:
            java.util.concurrent.atomic.AtomicReference<gc.c$a<T>[]> r2 = r7.f15213a
        L36:
            boolean r5 = r2.compareAndSet(r0, r1)
            if (r5 == 0) goto L3e
            r3 = 1
            goto L44
        L3e:
            java.lang.Object r5 = r2.get()
            if (r5 == r0) goto L36
        L44:
            if (r3 == 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gc.c.J(gc.c$a):void");
    }

    @Override // gc.d, wk.d
    public final void accept(T t10) {
        a<T>[] aVarArr;
        if (t10 != null) {
            for (a<T> aVar : this.f15213a.get()) {
                if (!aVar.get()) {
                    aVar.f15214a.b(t10);
                }
            }
            return;
        }
        throw new NullPointerException("value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x002b, code lost:
        continue;
     */
    @Override // tk.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(tk.n<? super T> r6) {
        /*
            r5 = this;
            gc.c$a r0 = new gc.c$a
            r0.<init>(r6, r5)
            r6.a(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference<gc.c$a<T>[]> r6 = r5.f15213a
            java.lang.Object r6 = r6.get()
            gc.c$a[] r6 = (gc.c.a[]) r6
            int r1 = r6.length
            int r2 = r1 + 1
            gc.c$a[] r2 = new gc.c.a[r2]
            r3 = 0
            java.lang.System.arraycopy(r6, r3, r2, r3, r1)
            r2[r1] = r0
            java.util.concurrent.atomic.AtomicReference<gc.c$a<T>[]> r1 = r5.f15213a
        L1d:
            boolean r4 = r1.compareAndSet(r6, r2)
            if (r4 == 0) goto L25
            r3 = 1
            goto L2b
        L25:
            java.lang.Object r4 = r1.get()
            if (r4 == r6) goto L1d
        L2b:
            if (r3 == 0) goto L8
            boolean r6 = r0.get()
            if (r6 == 0) goto L36
            r5.J(r0)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gc.c.z(tk.n):void");
    }
}
