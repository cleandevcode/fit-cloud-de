package el;

import gl.v;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import nl.f;
import ph.p;
import tk.i;
import tk.l;
import tk.n;
import tk.r;
import tk.t;
import wk.g;

/* loaded from: classes2.dex */
public final class d<T, R> extends i<R> {

    /* renamed from: a */
    public final l<T> f13834a;

    /* renamed from: b */
    public final wk.e<? super T, ? extends t<? extends R>> f13835b;

    /* renamed from: c */
    public final int f13836c = 1;

    /* renamed from: d */
    public final int f13837d = 2;

    /* loaded from: classes2.dex */
    public static final class a<T, R> extends b<T> {

        /* renamed from: h */
        public final n<? super R> f13838h;

        /* renamed from: i */
        public final wk.e<? super T, ? extends t<? extends R>> f13839i;

        /* renamed from: j */
        public final C0244a<R> f13840j;

        /* renamed from: k */
        public R f13841k;

        /* renamed from: l */
        public volatile int f13842l;

        /* renamed from: el.d$a$a */
        /* loaded from: classes2.dex */
        public static final class C0244a<R> extends AtomicReference<uk.c> implements r<R> {

            /* renamed from: a */
            public final a<?, R> f13843a;

            public C0244a(a<?, R> aVar) {
                this.f13843a = aVar;
            }

            @Override // tk.r, tk.b, tk.g
            public final void a(uk.c cVar) {
                xk.b.e(this, cVar);
            }

            @Override // tk.r, tk.b, tk.g
            public final void onError(Throwable th2) {
                a<?, R> aVar = this.f13843a;
                if (aVar.f13823a.c(th2)) {
                    if (aVar.f13825c != 3) {
                        aVar.f13827e.c();
                    }
                    aVar.f13842l = 0;
                    aVar.d();
                }
            }

            @Override // tk.r, tk.g
            public final void onSuccess(R r10) {
                a<?, R> aVar = this.f13843a;
                aVar.f13841k = r10;
                aVar.f13842l = 2;
                aVar.d();
            }
        }

        public a(n nVar, wk.e eVar, int i10, int i11) {
            super(i10, i11);
            this.f13838h = nVar;
            this.f13839i = eVar;
            this.f13840j = new C0244a<>(this);
        }

        @Override // el.b
        public final void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            n<? super R> nVar = this.f13838h;
            int i10 = this.f13825c;
            f<T> fVar = this.f13826d;
            kl.b bVar = this.f13823a;
            int i11 = 1;
            while (true) {
                if (!this.f13829g) {
                    int i12 = this.f13842l;
                    if (bVar.get() == null || (i10 != 1 && (i10 != 2 || i12 != 0))) {
                        if (i12 == 0) {
                            boolean z10 = this.f13828f;
                            try {
                                T poll = fVar.poll();
                                boolean z11 = poll == null;
                                if (z10 && z11) {
                                    bVar.f(nVar);
                                    return;
                                } else if (!z11) {
                                    try {
                                        t<? extends R> apply = this.f13839i.apply(poll);
                                        Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                                        t<? extends R> tVar = apply;
                                        this.f13842l = 1;
                                        tVar.c(this.f13840j);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        h7.a.y(th);
                                        this.f13827e.c();
                                        fVar.clear();
                                        bVar.c(th);
                                        bVar.f(nVar);
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                h7.a.y(th);
                                this.f13829g = true;
                                this.f13827e.c();
                            }
                        } else if (i12 == 2) {
                            this.f13841k = null;
                            nVar.b((R) this.f13841k);
                            this.f13842l = 0;
                        }
                    }
                    bVar.f(nVar);
                }
                fVar.clear();
                this.f13841k = null;
                i11 = addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
            }
            fVar.clear();
            this.f13841k = null;
            bVar.f(nVar);
        }
    }

    public d(i iVar, p pVar) {
        this.f13834a = iVar;
        this.f13835b = pVar;
    }

    @Override // tk.i
    public final void z(n<? super R> nVar) {
        boolean z10;
        l<T> lVar = this.f13834a;
        wk.e<? super T, ? extends t<? extends R>> eVar = this.f13835b;
        xk.c cVar = xk.c.INSTANCE;
        if (lVar instanceof g) {
            t<? extends R> tVar = null;
            z10 = true;
            try {
                Object obj = (Object) ((g) lVar).get();
                if (obj != 0) {
                    t<? extends R> apply = eVar.apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                    tVar = apply;
                }
                if (tVar == null) {
                    nVar.a(cVar);
                    nVar.onComplete();
                } else {
                    tVar.c(new v.a(nVar));
                }
            } catch (Throwable th2) {
                h7.a.y(th2);
                nVar.a(cVar);
                nVar.onError(th2);
            }
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f13834a.d(new a(nVar, this.f13835b, this.f13837d, this.f13836c));
        }
    }
}
