package fl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rc.a0;
import yk.a;

/* loaded from: classes2.dex */
public final class b0<T, K, V> extends fl.a<T, ll.a<K, V>> {

    /* renamed from: b */
    public final wk.e<? super T, ? extends K> f14337b;

    /* renamed from: c */
    public final wk.e<? super T, ? extends V> f14338c;

    /* renamed from: d */
    public final int f14339d;

    /* renamed from: e */
    public final boolean f14340e;

    /* loaded from: classes2.dex */
    public static final class a<T, K, V> extends AtomicInteger implements tk.n<T>, uk.c {

        /* renamed from: i */
        public static final Object f14341i = new Object();

        /* renamed from: a */
        public final tk.n<? super ll.a<K, V>> f14342a;

        /* renamed from: b */
        public final wk.e<? super T, ? extends K> f14343b;

        /* renamed from: c */
        public final wk.e<? super T, ? extends V> f14344c;

        /* renamed from: d */
        public final int f14345d;

        /* renamed from: e */
        public final boolean f14346e;

        /* renamed from: g */
        public uk.c f14348g;

        /* renamed from: h */
        public final AtomicBoolean f14349h = new AtomicBoolean();

        /* renamed from: f */
        public final ConcurrentHashMap f14347f = new ConcurrentHashMap();

        public a(tk.n<? super ll.a<K, V>> nVar, wk.e<? super T, ? extends K> eVar, wk.e<? super T, ? extends V> eVar2, int i10, boolean z10) {
            this.f14342a = nVar;
            this.f14343b = eVar;
            this.f14344c = eVar2;
            this.f14345d = i10;
            this.f14346e = z10;
            lazySet(1);
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14348g, cVar)) {
                this.f14348g = cVar;
                this.f14342a.a(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // tk.n
        public final void b(T t10) {
            Object obj;
            boolean z10;
            try {
                Object apply = this.f14343b.apply(t10);
                if (apply != null) {
                    obj = apply;
                } else {
                    obj = f14341i;
                }
                b bVar = (b) this.f14347f.get(obj);
                boolean z11 = false;
                if (bVar == null) {
                    if (this.f14349h.get()) {
                        return;
                    }
                    bVar = new b(apply, new c(this.f14345d, this, apply, this.f14346e));
                    this.f14347f.put(obj, bVar);
                    getAndIncrement();
                    z10 = true;
                } else {
                    z10 = false;
                }
                try {
                    V apply2 = this.f14344c.apply(t10);
                    Objects.requireNonNull(apply2, "The value supplied is null");
                    c<T, K> cVar = bVar.f14350b;
                    cVar.f14352b.offer(apply2);
                    cVar.a();
                    if (z10) {
                        this.f14342a.b(bVar);
                        c<T, K> cVar2 = bVar.f14350b;
                        if (cVar2.f14359i.get() == 0 && cVar2.f14359i.compareAndSet(0, 2)) {
                            z11 = true;
                        }
                        if (z11) {
                            if (apply == null) {
                                apply = f14341i;
                            }
                            this.f14347f.remove(apply);
                            if (decrementAndGet() == 0) {
                                this.f14348g.c();
                            }
                            c<T, K> cVar3 = bVar.f14350b;
                            cVar3.f14355e = true;
                            cVar3.a();
                        }
                    }
                } catch (Throwable th2) {
                    h7.a.y(th2);
                    this.f14348g.c();
                    if (z10) {
                        this.f14342a.b(bVar);
                    }
                    onError(th2);
                }
            } catch (Throwable th3) {
                h7.a.y(th3);
                this.f14348g.c();
                onError(th3);
            }
        }

        @Override // uk.c
        public final void c() {
            if (this.f14349h.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.f14348g.c();
            }
        }

        @Override // tk.n
        public final void onComplete() {
            ArrayList arrayList = new ArrayList(this.f14347f.values());
            this.f14347f.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c<T, K> cVar = ((b) it.next()).f14350b;
                cVar.f14355e = true;
                cVar.a();
            }
            this.f14342a.onComplete();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            ArrayList arrayList = new ArrayList(this.f14347f.values());
            this.f14347f.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c<T, K> cVar = ((b) it.next()).f14350b;
                cVar.f14356f = th2;
                cVar.f14355e = true;
                cVar.a();
            }
            this.f14342a.onError(th2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<K, T> extends ll.a<K, T> {

        /* renamed from: b */
        public final c<T, K> f14350b;

        public b(K k10, c<T, K> cVar) {
            super(k10);
            this.f14350b = cVar;
        }

        @Override // tk.i
        public final void z(tk.n<? super T> nVar) {
            this.f14350b.d(nVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<T, K> extends AtomicInteger implements uk.c, tk.l<T> {

        /* renamed from: a */
        public final K f14351a;

        /* renamed from: b */
        public final nl.h<T> f14352b;

        /* renamed from: c */
        public final a<?, K, T> f14353c;

        /* renamed from: d */
        public final boolean f14354d;

        /* renamed from: e */
        public volatile boolean f14355e;

        /* renamed from: f */
        public Throwable f14356f;

        /* renamed from: g */
        public final AtomicBoolean f14357g = new AtomicBoolean();

        /* renamed from: h */
        public final AtomicReference<tk.n<? super T>> f14358h = new AtomicReference<>();

        /* renamed from: i */
        public final AtomicInteger f14359i = new AtomicInteger();

        public c(int i10, a<?, K, T> aVar, K k10, boolean z10) {
            this.f14352b = new nl.h<>(i10);
            this.f14353c = aVar;
            this.f14351a = k10;
            this.f14354d = z10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:79:0x0067, code lost:
            if (r5 != null) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:91:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0089 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r11 = this;
                int r0 = r11.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                nl.h<T> r0 = r11.f14352b
                boolean r1 = r11.f14354d
                java.util.concurrent.atomic.AtomicReference<tk.n<? super T>> r2 = r11.f14358h
                java.lang.Object r2 = r2.get()
                tk.n r2 = (tk.n) r2
                r3 = 1
                r4 = 1
            L15:
                if (r2 == 0) goto L91
            L17:
                boolean r5 = r11.f14355e
                java.lang.Object r6 = r0.poll()
                r7 = 0
                if (r6 != 0) goto L22
                r8 = 1
                goto L23
            L22:
                r8 = 0
            L23:
                java.util.concurrent.atomic.AtomicBoolean r9 = r11.f14357g
                boolean r9 = r9.get()
                r10 = 0
                if (r9 == 0) goto L5a
                nl.h<T> r5 = r11.f14352b
                r5.clear()
                java.util.concurrent.atomic.AtomicReference<tk.n<? super T>> r5 = r11.f14358h
                r5.lazySet(r10)
                java.util.concurrent.atomic.AtomicInteger r5 = r11.f14359i
                int r5 = r5.get()
                r5 = r5 & 2
                if (r5 != 0) goto L86
                fl.b0$a<?, K, T> r5 = r11.f14353c
                K r7 = r11.f14351a
                if (r7 == 0) goto L47
                goto L49
            L47:
                java.lang.Object r7 = fl.b0.a.f14341i
            L49:
                java.util.concurrent.ConcurrentHashMap r9 = r5.f14347f
                r9.remove(r7)
                int r7 = r5.decrementAndGet()
                if (r7 != 0) goto L86
                uk.c r5 = r5.f14348g
                r5.c()
                goto L86
            L5a:
                if (r5 == 0) goto L87
                if (r1 == 0) goto L6a
                if (r8 == 0) goto L87
                java.lang.Throwable r5 = r11.f14356f
                java.util.concurrent.atomic.AtomicReference<tk.n<? super T>> r7 = r11.f14358h
                r7.lazySet(r10)
                if (r5 == 0) goto L83
                goto L78
            L6a:
                java.lang.Throwable r5 = r11.f14356f
                if (r5 == 0) goto L7c
                nl.h<T> r7 = r11.f14352b
                r7.clear()
                java.util.concurrent.atomic.AtomicReference<tk.n<? super T>> r7 = r11.f14358h
                r7.lazySet(r10)
            L78:
                r2.onError(r5)
                goto L86
            L7c:
                if (r8 == 0) goto L87
                java.util.concurrent.atomic.AtomicReference<tk.n<? super T>> r5 = r11.f14358h
                r5.lazySet(r10)
            L83:
                r2.onComplete()
            L86:
                r7 = 1
            L87:
                if (r7 == 0) goto L8a
                return
            L8a:
                if (r8 == 0) goto L8d
                goto L91
            L8d:
                r2.b(r6)
                goto L17
            L91:
                int r4 = -r4
                int r4 = r11.addAndGet(r4)
                if (r4 != 0) goto L99
                return
            L99:
                if (r2 != 0) goto L15
                java.util.concurrent.atomic.AtomicReference<tk.n<? super T>> r2 = r11.f14358h
                java.lang.Object r2 = r2.get()
                tk.n r2 = (tk.n) r2
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: fl.b0.c.a():void");
        }

        @Override // uk.c
        public final void c() {
            if (this.f14357g.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.f14358h.lazySet(null);
                if ((this.f14359i.get() & 2) == 0) {
                    a<?, K, T> aVar = this.f14353c;
                    Object obj = this.f14351a;
                    if (obj == null) {
                        obj = a.f14341i;
                    }
                    aVar.f14347f.remove(obj);
                    if (aVar.decrementAndGet() == 0) {
                        aVar.f14348g.c();
                    }
                }
            }
        }

        @Override // tk.l
        public final void d(tk.n<? super T> nVar) {
            int i10;
            do {
                i10 = this.f14359i.get();
                if ((i10 & 1) != 0) {
                    IllegalStateException illegalStateException = new IllegalStateException("Only one Observer allowed!");
                    nVar.a(xk.c.INSTANCE);
                    nVar.onError(illegalStateException);
                    return;
                }
            } while (!this.f14359i.compareAndSet(i10, i10 | 1));
            nVar.a(this);
            this.f14358h.lazySet(nVar);
            if (this.f14357g.get()) {
                this.f14358h.lazySet(null);
            } else {
                a();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(tk.l lVar, a0.b bVar, int i10) {
        super(lVar);
        a.f fVar = yk.a.f31786a;
        this.f14337b = bVar;
        this.f14338c = fVar;
        this.f14339d = i10;
        this.f14340e = false;
    }

    @Override // tk.i
    public final void z(tk.n<? super ll.a<K, V>> nVar) {
        this.f14315a.d(new a(nVar, this.f14337b, this.f14338c, this.f14339d, this.f14340e));
    }
}
