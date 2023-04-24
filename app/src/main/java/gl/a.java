package gl;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class a<T> extends tk.p<T> implements tk.r<T> {

    /* renamed from: f */
    public static final C0274a[] f15376f = new C0274a[0];

    /* renamed from: g */
    public static final C0274a[] f15377g = new C0274a[0];

    /* renamed from: a */
    public final tk.t<? extends T> f15378a;

    /* renamed from: b */
    public final AtomicInteger f15379b = new AtomicInteger();

    /* renamed from: c */
    public final AtomicReference<C0274a<T>[]> f15380c = new AtomicReference<>(f15376f);

    /* renamed from: d */
    public T f15381d;

    /* renamed from: e */
    public Throwable f15382e;

    /* renamed from: gl.a$a */
    /* loaded from: classes2.dex */
    public static final class C0274a<T> extends AtomicBoolean implements uk.c {

        /* renamed from: a */
        public final tk.r<? super T> f15383a;

        /* renamed from: b */
        public final a<T> f15384b;

        public C0274a(tk.r<? super T> rVar, a<T> aVar) {
            this.f15383a = rVar;
            this.f15384b = aVar;
        }

        @Override // uk.c
        public final void c() {
            if (compareAndSet(false, true)) {
                this.f15384b.i(this);
            }
        }
    }

    public a(h hVar) {
        this.f15378a = hVar;
    }

    @Override // tk.r, tk.b, tk.g
    public final void a(uk.c cVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0031, code lost:
        continue;
     */
    @Override // tk.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(tk.r<? super T> r8) {
        /*
            r7 = this;
            gl.a$a r0 = new gl.a$a
            r0.<init>(r8, r7)
            r8.a(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference<gl.a$a<T>[]> r1 = r7.f15380c
            java.lang.Object r1 = r1.get()
            gl.a$a[] r1 = (gl.a.C0274a[]) r1
            gl.a$a[] r2 = gl.a.f15377g
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L17
            goto L34
        L17:
            int r2 = r1.length
            int r5 = r2 + 1
            gl.a$a[] r5 = new gl.a.C0274a[r5]
            java.lang.System.arraycopy(r1, r3, r5, r3, r2)
            r5[r2] = r0
            java.util.concurrent.atomic.AtomicReference<gl.a$a<T>[]> r2 = r7.f15380c
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
            if (r3 == 0) goto L4d
            boolean r8 = r0.get()
            if (r8 == 0) goto L3f
            r7.i(r0)
        L3f:
            java.util.concurrent.atomic.AtomicInteger r8 = r7.f15379b
            int r8 = r8.getAndIncrement()
            if (r8 != 0) goto L4c
            tk.t<? extends T> r8 = r7.f15378a
            r8.c(r7)
        L4c:
            return
        L4d:
            java.lang.Throwable r0 = r7.f15382e
            if (r0 == 0) goto L55
            r8.onError(r0)
            goto L5a
        L55:
            T r0 = r7.f15381d
            r8.onSuccess(r0)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.a.f(tk.r):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0042, code lost:
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(gl.a.C0274a<T> r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<gl.a$a<T>[]> r0 = r7.f15380c
            java.lang.Object r0 = r0.get()
            gl.a$a[] r0 = (gl.a.C0274a[]) r0
            int r1 = r0.length
            if (r1 != 0) goto Lc
            return
        Lc:
            r2 = -1
            r3 = 0
            r4 = 0
        Lf:
            if (r4 >= r1) goto L1a
            r5 = r0[r4]
            if (r5 != r8) goto L17
            r2 = r4
            goto L1a
        L17:
            int r4 = r4 + 1
            goto Lf
        L1a:
            if (r2 >= 0) goto L1d
            return
        L1d:
            r4 = 1
            if (r1 != r4) goto L23
            gl.a$a[] r1 = gl.a.f15376f
            goto L32
        L23:
            int r5 = r1 + (-1)
            gl.a$a[] r5 = new gl.a.C0274a[r5]
            java.lang.System.arraycopy(r0, r3, r5, r3, r2)
            int r6 = r2 + 1
            int r1 = r1 - r2
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r6, r5, r2, r1)
            r1 = r5
        L32:
            java.util.concurrent.atomic.AtomicReference<gl.a$a<T>[]> r2 = r7.f15380c
        L34:
            boolean r5 = r2.compareAndSet(r0, r1)
            if (r5 == 0) goto L3c
            r3 = 1
            goto L42
        L3c:
            java.lang.Object r5 = r2.get()
            if (r5 == r0) goto L34
        L42:
            if (r3 == 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.a.i(gl.a$a):void");
    }

    @Override // tk.r, tk.b, tk.g
    public final void onError(Throwable th2) {
        C0274a<T>[] andSet;
        this.f15382e = th2;
        for (C0274a<T> c0274a : this.f15380c.getAndSet(f15377g)) {
            if (!c0274a.get()) {
                c0274a.f15383a.onError(th2);
            }
        }
    }

    @Override // tk.r, tk.g
    public final void onSuccess(T t10) {
        C0274a<T>[] andSet;
        this.f15381d = t10;
        for (C0274a<T> c0274a : this.f15380c.getAndSet(f15377g)) {
            if (!c0274a.get()) {
                c0274a.f15383a.onSuccess(t10);
            }
        }
    }
}
