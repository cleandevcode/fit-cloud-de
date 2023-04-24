package fl;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import yk.a;

/* loaded from: classes2.dex */
public final class d<T, U> extends fl.a<T, U> {

    /* renamed from: b */
    public final wk.e<? super T, ? extends tk.l<? extends U>> f14392b;

    /* renamed from: c */
    public final int f14393c;

    /* renamed from: d */
    public final int f14394d;

    /* loaded from: classes2.dex */
    public static final class a<T, R> extends AtomicInteger implements tk.n<T>, uk.c {

        /* renamed from: a */
        public final tk.n<? super R> f14395a;

        /* renamed from: b */
        public final wk.e<? super T, ? extends tk.l<? extends R>> f14396b;

        /* renamed from: c */
        public final int f14397c;

        /* renamed from: d */
        public final kl.b f14398d = new kl.b();

        /* renamed from: e */
        public final C0256a<R> f14399e;

        /* renamed from: f */
        public final boolean f14400f;

        /* renamed from: g */
        public nl.f<T> f14401g;

        /* renamed from: h */
        public uk.c f14402h;

        /* renamed from: i */
        public volatile boolean f14403i;

        /* renamed from: j */
        public volatile boolean f14404j;

        /* renamed from: k */
        public volatile boolean f14405k;

        /* renamed from: l */
        public int f14406l;

        /* renamed from: fl.d$a$a */
        /* loaded from: classes2.dex */
        public static final class C0256a<R> extends AtomicReference<uk.c> implements tk.n<R> {

            /* renamed from: a */
            public final tk.n<? super R> f14407a;

            /* renamed from: b */
            public final a<?, R> f14408b;

            public C0256a(tk.n<? super R> nVar, a<?, R> aVar) {
                this.f14407a = nVar;
                this.f14408b = aVar;
            }

            @Override // tk.n
            public final void a(uk.c cVar) {
                xk.b.e(this, cVar);
            }

            @Override // tk.n
            public final void b(R r10) {
                this.f14407a.b(r10);
            }

            @Override // tk.n
            public final void onComplete() {
                a<?, R> aVar = this.f14408b;
                aVar.f14403i = false;
                aVar.d();
            }

            @Override // tk.n
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f14408b;
                if (aVar.f14398d.c(th2)) {
                    if (!aVar.f14400f) {
                        aVar.f14402h.c();
                    }
                    aVar.f14403i = false;
                    aVar.d();
                }
            }
        }

        public a(tk.n<? super R> nVar, wk.e<? super T, ? extends tk.l<? extends R>> eVar, int i10, boolean z10) {
            this.f14395a = nVar;
            this.f14396b = eVar;
            this.f14397c = i10;
            this.f14400f = z10;
            this.f14399e = new C0256a<>(nVar, this);
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14402h, cVar)) {
                this.f14402h = cVar;
                if (cVar instanceof nl.b) {
                    nl.b bVar = (nl.b) cVar;
                    int d10 = bVar.d(3);
                    if (d10 == 1) {
                        this.f14406l = d10;
                        this.f14401g = bVar;
                        this.f14404j = true;
                        this.f14395a.a(this);
                        d();
                        return;
                    } else if (d10 == 2) {
                        this.f14406l = d10;
                        this.f14401g = bVar;
                        this.f14395a.a(this);
                        return;
                    }
                }
                this.f14401g = new nl.h(this.f14397c);
                this.f14395a.a(this);
            }
        }

        @Override // tk.n
        public final void b(T t10) {
            if (this.f14406l == 0) {
                this.f14401g.offer(t10);
            }
            d();
        }

        @Override // uk.c
        public final void c() {
            this.f14405k = true;
            this.f14402h.c();
            C0256a<R> c0256a = this.f14399e;
            c0256a.getClass();
            xk.b.a(c0256a);
            this.f14398d.d();
        }

        public final void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            tk.n<? super R> nVar = this.f14395a;
            nl.f<T> fVar = this.f14401g;
            kl.b bVar = this.f14398d;
            while (true) {
                if (!this.f14403i) {
                    if (!this.f14405k) {
                        if (!this.f14400f && bVar.get() != null) {
                            fVar.clear();
                            break;
                        }
                        boolean z10 = this.f14404j;
                        try {
                            T poll = fVar.poll();
                            boolean z11 = poll == null;
                            if (z10 && z11) {
                                break;
                            } else if (!z11) {
                                try {
                                    tk.l<? extends R> apply = this.f14396b.apply(poll);
                                    Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                                    tk.l<? extends R> lVar = apply;
                                    if (lVar instanceof wk.g) {
                                        try {
                                            Object obj = (Object) ((wk.g) lVar).get();
                                            if (obj != 0 && !this.f14405k) {
                                                nVar.b(obj);
                                            }
                                        } catch (Throwable th2) {
                                            h7.a.y(th2);
                                            bVar.c(th2);
                                        }
                                    } else {
                                        this.f14403i = true;
                                        lVar.d(this.f14399e);
                                    }
                                } catch (Throwable th3) {
                                    h7.a.y(th3);
                                    this.f14405k = true;
                                    this.f14402h.c();
                                    fVar.clear();
                                    bVar.c(th3);
                                }
                            }
                        } catch (Throwable th4) {
                            h7.a.y(th4);
                            this.f14405k = true;
                            this.f14402h.c();
                            bVar.c(th4);
                        }
                    } else {
                        fVar.clear();
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f14405k = true;
            bVar.f(nVar);
        }

        @Override // tk.n
        public final void onComplete() {
            this.f14404j = true;
            d();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (this.f14398d.c(th2)) {
                this.f14404j = true;
                d();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T, U> extends AtomicInteger implements tk.n<T>, uk.c {

        /* renamed from: a */
        public final tk.n<? super U> f14409a;

        /* renamed from: b */
        public final wk.e<? super T, ? extends tk.l<? extends U>> f14410b;

        /* renamed from: c */
        public final a<U> f14411c;

        /* renamed from: d */
        public final int f14412d;

        /* renamed from: e */
        public nl.f<T> f14413e;

        /* renamed from: f */
        public uk.c f14414f;

        /* renamed from: g */
        public volatile boolean f14415g;

        /* renamed from: h */
        public volatile boolean f14416h;

        /* renamed from: i */
        public volatile boolean f14417i;

        /* renamed from: j */
        public int f14418j;

        /* loaded from: classes2.dex */
        public static final class a<U> extends AtomicReference<uk.c> implements tk.n<U> {

            /* renamed from: a */
            public final tk.n<? super U> f14419a;

            /* renamed from: b */
            public final b<?, ?> f14420b;

            public a(ml.c cVar, b bVar) {
                this.f14419a = cVar;
                this.f14420b = bVar;
            }

            @Override // tk.n
            public final void a(uk.c cVar) {
                xk.b.e(this, cVar);
            }

            @Override // tk.n
            public final void b(U u10) {
                this.f14419a.b(u10);
            }

            @Override // tk.n
            public final void onComplete() {
                b<?, ?> bVar = this.f14420b;
                bVar.f14415g = false;
                bVar.d();
            }

            @Override // tk.n
            public final void onError(Throwable th2) {
                this.f14420b.c();
                this.f14419a.onError(th2);
            }
        }

        public b(ml.c cVar, wk.e eVar, int i10) {
            this.f14409a = cVar;
            this.f14410b = eVar;
            this.f14412d = i10;
            this.f14411c = new a<>(cVar, this);
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14414f, cVar)) {
                this.f14414f = cVar;
                if (cVar instanceof nl.b) {
                    nl.b bVar = (nl.b) cVar;
                    int d10 = bVar.d(3);
                    if (d10 == 1) {
                        this.f14418j = d10;
                        this.f14413e = bVar;
                        this.f14417i = true;
                        this.f14409a.a(this);
                        d();
                        return;
                    } else if (d10 == 2) {
                        this.f14418j = d10;
                        this.f14413e = bVar;
                        this.f14409a.a(this);
                        return;
                    }
                }
                this.f14413e = new nl.h(this.f14412d);
                this.f14409a.a(this);
            }
        }

        @Override // tk.n
        public final void b(T t10) {
            if (this.f14417i) {
                return;
            }
            if (this.f14418j == 0) {
                this.f14413e.offer(t10);
            }
            d();
        }

        @Override // uk.c
        public final void c() {
            this.f14416h = true;
            a<U> aVar = this.f14411c;
            aVar.getClass();
            xk.b.a(aVar);
            this.f14414f.c();
            if (getAndIncrement() == 0) {
                this.f14413e.clear();
            }
        }

        public final void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f14416h) {
                if (!this.f14415g) {
                    boolean z10 = this.f14417i;
                    try {
                        T poll = this.f14413e.poll();
                        boolean z11 = poll == null;
                        if (z10 && z11) {
                            this.f14416h = true;
                            this.f14409a.onComplete();
                            return;
                        } else if (!z11) {
                            try {
                                tk.l<? extends U> apply = this.f14410b.apply(poll);
                                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                                tk.l<? extends U> lVar = apply;
                                this.f14415g = true;
                                lVar.d(this.f14411c);
                            } catch (Throwable th2) {
                                h7.a.y(th2);
                                c();
                                this.f14413e.clear();
                                this.f14409a.onError(th2);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        h7.a.y(th3);
                        c();
                        this.f14413e.clear();
                        this.f14409a.onError(th3);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f14413e.clear();
        }

        @Override // tk.n
        public final void onComplete() {
            if (this.f14417i) {
                return;
            }
            this.f14417i = true;
            d();
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (this.f14417i) {
                ol.a.a(th2);
                return;
            }
            this.f14417i = true;
            c();
            this.f14409a.onError(th2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i10, tk.i iVar) {
        super(iVar);
        a.f fVar = yk.a.f31786a;
        this.f14392b = fVar;
        this.f14394d = 2;
        this.f14393c = Math.max(8, i10);
    }

    @Override // tk.i
    public final void z(tk.n<? super U> nVar) {
        if (s0.a(this.f14315a, nVar, this.f14392b)) {
            return;
        }
        if (this.f14394d == 1) {
            this.f14315a.d(new b(new ml.c(nVar), this.f14392b, this.f14393c));
        } else {
            this.f14315a.d(new a(nVar, this.f14392b, this.f14393c, this.f14394d == 3));
        }
    }
}
