package fl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kl.e;

/* loaded from: classes2.dex */
public final class p0<T> extends gc.d {

    /* renamed from: e */
    public static final j f14610e = new j();

    /* renamed from: a */
    public final tk.l<T> f14611a;

    /* renamed from: b */
    public final AtomicReference<g<T>> f14612b;

    /* renamed from: c */
    public final b<T> f14613c;

    /* renamed from: d */
    public final tk.l<T> f14614d;

    /* loaded from: classes2.dex */
    public static abstract class a<T> extends AtomicReference<d> implements e<T> {

        /* renamed from: a */
        public d f14615a;

        /* renamed from: b */
        public int f14616b;

        /* renamed from: c */
        public final boolean f14617c;

        public a(boolean z10) {
            this.f14617c = z10;
            d dVar = new d(null);
            this.f14615a = dVar;
            set(dVar);
        }

        @Override // fl.p0.e
        public final void b(c<T> cVar) {
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            int i10 = 1;
            do {
                d dVar = (d) cVar.f14620c;
                if (dVar == null) {
                    dVar = get();
                    cVar.f14620c = dVar;
                }
                while (!cVar.f14621d) {
                    d dVar2 = dVar.get();
                    if (dVar2 != null) {
                        if (kl.e.a(cVar.f14619b, dVar2.f14622a)) {
                            cVar.f14620c = null;
                            return;
                        }
                        dVar = dVar2;
                    } else {
                        cVar.f14620c = dVar;
                        i10 = cVar.addAndGet(-i10);
                    }
                }
                cVar.f14620c = null;
                return;
            } while (i10 != 0);
        }

        @Override // fl.p0.e
        public final void e() {
            d dVar = new d(kl.e.f18621a);
            this.f14615a.set(dVar);
            this.f14615a = dVar;
            this.f14616b++;
            d dVar2 = get();
            if (dVar2.f14622a != null) {
                d dVar3 = new d(null);
                dVar3.lazySet(dVar2.get());
                set(dVar3);
            }
        }

        @Override // fl.p0.e
        public final void f(T t10) {
            d dVar = new d(t10);
            this.f14615a.set(dVar);
            this.f14615a = dVar;
            this.f14616b++;
            i iVar = (i) this;
            if (iVar.f14616b > iVar.f14634d) {
                d dVar2 = iVar.get().get();
                iVar.f14616b--;
                if (iVar.f14617c) {
                    d dVar3 = new d(null);
                    dVar3.lazySet(dVar2.get());
                    dVar2 = dVar3;
                }
                iVar.set(dVar2);
            }
        }

        @Override // fl.p0.e
        public final void i(Throwable th2) {
            d dVar = new d(new e.b(th2));
            this.f14615a.set(dVar);
            this.f14615a = dVar;
            this.f14616b++;
            d dVar2 = get();
            if (dVar2.f14622a != null) {
                d dVar3 = new d(null);
                dVar3.lazySet(dVar2.get());
                set(dVar3);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface b<T> {
        e<T> call();
    }

    /* loaded from: classes2.dex */
    public static final class c<T> extends AtomicInteger implements uk.c {

        /* renamed from: a */
        public final g<T> f14618a;

        /* renamed from: b */
        public final tk.n<? super T> f14619b;

        /* renamed from: c */
        public Serializable f14620c;

        /* renamed from: d */
        public volatile boolean f14621d;

        public c(g<T> gVar, tk.n<? super T> nVar) {
            this.f14618a = gVar;
            this.f14619b = nVar;
        }

        @Override // uk.c
        public final void c() {
            if (this.f14621d) {
                return;
            }
            this.f14621d = true;
            this.f14618a.e(this);
            this.f14620c = null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends AtomicReference<d> {

        /* renamed from: a */
        public final Object f14622a;

        public d(Object obj) {
            this.f14622a = obj;
        }
    }

    /* loaded from: classes2.dex */
    public interface e<T> {
        void b(c<T> cVar);

        void e();

        void f(T t10);

        void i(Throwable th2);
    }

    /* loaded from: classes2.dex */
    public static final class f<T> implements b<T> {

        /* renamed from: a */
        public final int f14623a = 1;

        /* renamed from: b */
        public final boolean f14624b = false;

        @Override // fl.p0.b
        public final e<T> call() {
            return new i(this.f14623a, this.f14624b);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g<T> extends AtomicReference<uk.c> implements tk.n<T>, uk.c {

        /* renamed from: f */
        public static final c[] f14625f = new c[0];

        /* renamed from: g */
        public static final c[] f14626g = new c[0];

        /* renamed from: a */
        public final e<T> f14627a;

        /* renamed from: b */
        public boolean f14628b;

        /* renamed from: c */
        public final AtomicReference<c[]> f14629c = new AtomicReference<>(f14625f);

        /* renamed from: d */
        public final AtomicBoolean f14630d = new AtomicBoolean();

        /* renamed from: e */
        public final AtomicReference<g<T>> f14631e;

        public g(e<T> eVar, AtomicReference<g<T>> atomicReference) {
            this.f14627a = eVar;
            this.f14631e = atomicReference;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.h(this, cVar)) {
                for (c<T> cVar2 : this.f14629c.get()) {
                    this.f14627a.b(cVar2);
                }
            }
        }

        @Override // tk.n
        public final void b(T t10) {
            if (this.f14628b) {
                return;
            }
            this.f14627a.f(t10);
            for (c<T> cVar : this.f14629c.get()) {
                this.f14627a.b(cVar);
            }
        }

        @Override // uk.c
        public final void c() {
            this.f14629c.set(f14626g);
            AtomicReference<g<T>> atomicReference = this.f14631e;
            while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
            }
            xk.b.a(this);
        }

        public final boolean d() {
            return this.f14629c.get() == f14626g;
        }

        /* JADX WARN: Code restructure failed: missing block: B:62:0x0046, code lost:
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void e(fl.p0.c<T> r8) {
            /*
                r7 = this;
            L0:
                java.util.concurrent.atomic.AtomicReference<fl.p0$c[]> r0 = r7.f14629c
                java.lang.Object r0 = r0.get()
                fl.p0$c[] r0 = (fl.p0.c[]) r0
                int r1 = r0.length
                if (r1 != 0) goto Lc
                return
            Lc:
                r2 = -1
                r3 = 0
                r4 = 0
            Lf:
                if (r4 >= r1) goto L1e
                r5 = r0[r4]
                boolean r5 = r5.equals(r8)
                if (r5 == 0) goto L1b
                r2 = r4
                goto L1e
            L1b:
                int r4 = r4 + 1
                goto Lf
            L1e:
                if (r2 >= 0) goto L21
                return
            L21:
                r4 = 1
                if (r1 != r4) goto L27
                fl.p0$c[] r1 = fl.p0.g.f14625f
                goto L36
            L27:
                int r5 = r1 + (-1)
                fl.p0$c[] r5 = new fl.p0.c[r5]
                java.lang.System.arraycopy(r0, r3, r5, r3, r2)
                int r6 = r2 + 1
                int r1 = r1 - r2
                int r1 = r1 - r4
                java.lang.System.arraycopy(r0, r6, r5, r2, r1)
                r1 = r5
            L36:
                java.util.concurrent.atomic.AtomicReference<fl.p0$c[]> r2 = r7.f14629c
            L38:
                boolean r5 = r2.compareAndSet(r0, r1)
                if (r5 == 0) goto L40
                r3 = 1
                goto L46
            L40:
                java.lang.Object r5 = r2.get()
                if (r5 == r0) goto L38
            L46:
                if (r3 == 0) goto L0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: fl.p0.g.e(fl.p0$c):void");
        }

        @Override // tk.n
        public final void onComplete() {
            if (this.f14628b) {
                return;
            }
            this.f14628b = true;
            this.f14627a.e();
            for (c<T> cVar : this.f14629c.getAndSet(f14626g)) {
                this.f14627a.b(cVar);
            }
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (!this.f14628b) {
                this.f14628b = true;
                this.f14627a.i(th2);
                for (c<T> cVar : this.f14629c.getAndSet(f14626g)) {
                    this.f14627a.b(cVar);
                }
                return;
            }
            ol.a.a(th2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h<T> implements tk.l<T> {

        /* renamed from: a */
        public final AtomicReference<g<T>> f14632a;

        /* renamed from: b */
        public final b<T> f14633b;

        public h(AtomicReference<g<T>> atomicReference, b<T> bVar) {
            this.f14632a = atomicReference;
            this.f14633b = bVar;
        }

        @Override // tk.l
        public final void d(tk.n<? super T> nVar) {
            g<T> gVar;
            boolean z10;
            boolean z11;
            while (true) {
                gVar = this.f14632a.get();
                if (gVar != null) {
                    break;
                }
                g<T> gVar2 = new g<>(this.f14633b.call(), this.f14632a);
                AtomicReference<g<T>> atomicReference = this.f14632a;
                while (true) {
                    if (atomicReference.compareAndSet(null, gVar2)) {
                        z11 = true;
                        continue;
                        break;
                    } else if (atomicReference.get() != null) {
                        z11 = false;
                        continue;
                        break;
                    }
                }
                if (z11) {
                    gVar = gVar2;
                    break;
                }
            }
            c<T> cVar = new c<>(gVar, nVar);
            nVar.a(cVar);
            do {
                c[] cVarArr = gVar.f14629c.get();
                if (cVarArr != g.f14626g) {
                    int length = cVarArr.length;
                    c[] cVarArr2 = new c[length + 1];
                    System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                    cVarArr2[length] = cVar;
                    AtomicReference<c[]> atomicReference2 = gVar.f14629c;
                    while (true) {
                        if (atomicReference2.compareAndSet(cVarArr, cVarArr2)) {
                            z10 = true;
                            continue;
                            break;
                        } else if (atomicReference2.get() != cVarArr) {
                            z10 = false;
                            continue;
                            break;
                        }
                    }
                } else {
                    break;
                }
            } while (!z10);
            if (cVar.f14621d) {
                gVar.e(cVar);
            } else {
                gVar.f14627a.b(cVar);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class i<T> extends a<T> {

        /* renamed from: d */
        public final int f14634d;

        public i(int i10, boolean z10) {
            super(z10);
            this.f14634d = i10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j implements b<Object> {
        @Override // fl.p0.b
        public final e<Object> call() {
            return new k();
        }
    }

    /* loaded from: classes2.dex */
    public static final class k<T> extends ArrayList<Object> implements e<T> {

        /* renamed from: a */
        public volatile int f14635a;

        public k() {
            super(16);
        }

        @Override // fl.p0.e
        public final void b(c<T> cVar) {
            int i10;
            if (cVar.getAndIncrement() != 0) {
                return;
            }
            tk.n<? super T> nVar = cVar.f14619b;
            int i11 = 1;
            while (!cVar.f14621d) {
                int i12 = this.f14635a;
                Integer num = (Integer) cVar.f14620c;
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = 0;
                }
                while (i10 < i12) {
                    if (kl.e.a(nVar, get(i10)) || cVar.f14621d) {
                        return;
                    }
                    i10++;
                }
                cVar.f14620c = Integer.valueOf(i10);
                i11 = cVar.addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
            }
        }

        @Override // fl.p0.e
        public final void e() {
            add(kl.e.f18621a);
            this.f14635a++;
        }

        @Override // fl.p0.e
        public final void f(T t10) {
            add(t10);
            this.f14635a++;
        }

        @Override // fl.p0.e
        public final void i(Throwable th2) {
            add(new e.b(th2));
            this.f14635a++;
        }
    }

    public p0(h hVar, tk.i iVar, AtomicReference atomicReference, b bVar) {
        this.f14614d = hVar;
        this.f14611a = iVar;
        this.f14612b = atomicReference;
        this.f14613c = bVar;
    }

    @Override // gc.d
    public final void G(wk.d<? super uk.c> dVar) {
        g<T> gVar;
        boolean z10;
        while (true) {
            gVar = this.f14612b.get();
            if (gVar != null && !gVar.d()) {
                break;
            }
            g<T> gVar2 = new g<>(this.f14613c.call(), this.f14612b);
            AtomicReference<g<T>> atomicReference = this.f14612b;
            while (true) {
                if (!atomicReference.compareAndSet(gVar, gVar2)) {
                    if (atomicReference.get() != gVar) {
                        z10 = false;
                        continue;
                        break;
                    }
                } else {
                    z10 = true;
                    continue;
                    break;
                }
            }
            if (z10) {
                gVar = gVar2;
                break;
            }
        }
        boolean z11 = !gVar.f14630d.get() && gVar.f14630d.compareAndSet(false, true);
        try {
            dVar.accept(gVar);
            if (z11) {
                this.f14611a.d(gVar);
            }
        } catch (Throwable th2) {
            h7.a.y(th2);
            if (z11) {
                gVar.f14630d.compareAndSet(true, false);
            }
            h7.a.y(th2);
            throw kl.d.d(th2);
        }
    }

    @Override // gc.d
    public final void I() {
        g<T> gVar = this.f14612b.get();
        if (gVar == null || !gVar.d()) {
            return;
        }
        AtomicReference<g<T>> atomicReference = this.f14612b;
        while (!atomicReference.compareAndSet(gVar, null) && atomicReference.get() == gVar) {
        }
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        this.f14614d.d(nVar);
    }
}
