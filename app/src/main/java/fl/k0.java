package fl;

import tk.o;

/* loaded from: classes2.dex */
public final class k0<T> extends fl.a<T, T> {

    /* renamed from: b */
    public final tk.o f14525b;

    /* renamed from: c */
    public final boolean f14526c;

    /* renamed from: d */
    public final int f14527d;

    /* loaded from: classes2.dex */
    public static final class a<T> extends al.b<T> implements tk.n<T>, Runnable {

        /* renamed from: a */
        public final tk.n<? super T> f14528a;

        /* renamed from: b */
        public final o.c f14529b;

        /* renamed from: c */
        public final boolean f14530c;

        /* renamed from: d */
        public final int f14531d;

        /* renamed from: e */
        public nl.f<T> f14532e;

        /* renamed from: f */
        public uk.c f14533f;

        /* renamed from: g */
        public Throwable f14534g;

        /* renamed from: h */
        public volatile boolean f14535h;

        /* renamed from: i */
        public volatile boolean f14536i;

        /* renamed from: j */
        public int f14537j;

        /* renamed from: k */
        public boolean f14538k;

        public a(tk.n<? super T> nVar, o.c cVar, boolean z10, int i10) {
            this.f14528a = nVar;
            this.f14529b = cVar;
            this.f14530c = z10;
            this.f14531d = i10;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14533f, cVar)) {
                this.f14533f = cVar;
                if (cVar instanceof nl.b) {
                    nl.b bVar = (nl.b) cVar;
                    int d10 = bVar.d(7);
                    if (d10 == 1) {
                        this.f14537j = d10;
                        this.f14532e = bVar;
                        this.f14535h = true;
                        this.f14528a.a(this);
                        if (getAndIncrement() == 0) {
                            this.f14529b.a(this);
                            return;
                        }
                        return;
                    } else if (d10 == 2) {
                        this.f14537j = d10;
                        this.f14532e = bVar;
                        this.f14528a.a(this);
                        return;
                    }
                }
                this.f14532e = new nl.h(this.f14531d);
                this.f14528a.a(this);
            }
        }

        @Override // tk.n
        public final void b(T t10) {
            if (this.f14535h) {
                return;
            }
            if (this.f14537j != 2) {
                this.f14532e.offer(t10);
            }
            if (getAndIncrement() == 0) {
                this.f14529b.a(this);
            }
        }

        @Override // uk.c
        public final void c() {
            if (this.f14536i) {
                return;
            }
            this.f14536i = true;
            this.f14533f.c();
            this.f14529b.c();
            if (this.f14538k || getAndIncrement() != 0) {
                return;
            }
            this.f14532e.clear();
        }

        @Override // nl.f
        public final void clear() {
            this.f14532e.clear();
        }

        @Override // nl.c
        public final int d(int i10) {
            if ((i10 & 2) != 0) {
                this.f14538k = true;
                return 2;
            }
            return 0;
        }

        public final boolean e(boolean z10, boolean z11, tk.n<? super T> nVar) {
            if (this.f14536i) {
                this.f14532e.clear();
                return true;
            } else if (z10) {
                Throwable th2 = this.f14534g;
                if (this.f14530c) {
                    if (z11) {
                        this.f14536i = true;
                        if (th2 != null) {
                            nVar.onError(th2);
                        } else {
                            nVar.onComplete();
                        }
                        this.f14529b.c();
                        return true;
                    }
                    return false;
                } else if (th2 != null) {
                    this.f14536i = true;
                    this.f14532e.clear();
                    nVar.onError(th2);
                    this.f14529b.c();
                    return true;
                } else if (z11) {
                    this.f14536i = true;
                    nVar.onComplete();
                    this.f14529b.c();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        @Override // nl.f
        public final boolean isEmpty() {
            return this.f14532e.isEmpty();
        }

        @Override // tk.n
        public final void onComplete() {
            if (this.f14535h) {
                return;
            }
            this.f14535h = true;
            if (getAndIncrement() == 0) {
                this.f14529b.a(this);
            }
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            if (this.f14535h) {
                ol.a.a(th2);
                return;
            }
            this.f14534g = th2;
            this.f14535h = true;
            if (getAndIncrement() == 0) {
                this.f14529b.a(this);
            }
        }

        @Override // nl.f
        public final T poll() {
            return this.f14532e.poll();
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            if (this.f14538k) {
                int i10 = 1;
                while (!this.f14536i) {
                    boolean z11 = this.f14535h;
                    Throwable th2 = this.f14534g;
                    if (!this.f14530c && z11 && th2 != null) {
                        this.f14536i = true;
                        this.f14528a.onError(this.f14534g);
                    } else {
                        this.f14528a.b(null);
                        if (z11) {
                            this.f14536i = true;
                            Throwable th3 = this.f14534g;
                            if (th3 != null) {
                                this.f14528a.onError(th3);
                            } else {
                                this.f14528a.onComplete();
                            }
                        } else {
                            i10 = addAndGet(-i10);
                            if (i10 == 0) {
                                return;
                            }
                        }
                    }
                    this.f14529b.c();
                    return;
                }
                return;
            }
            nl.f<T> fVar = this.f14532e;
            tk.n<? super T> nVar = this.f14528a;
            int i11 = 1;
            while (!e(this.f14535h, fVar.isEmpty(), nVar)) {
                while (true) {
                    boolean z12 = this.f14535h;
                    try {
                        Object obj = (T) fVar.poll();
                        if (obj == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!e(z12, z10, nVar)) {
                            if (z10) {
                                i11 = addAndGet(-i11);
                                if (i11 == 0) {
                                    return;
                                }
                            } else {
                                nVar.b(obj);
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th4) {
                        h7.a.y(th4);
                        this.f14536i = true;
                        this.f14533f.c();
                        fVar.clear();
                        nVar.onError(th4);
                        this.f14529b.c();
                        return;
                    }
                }
            }
        }
    }

    public k0(tk.l<T> lVar, tk.o oVar, boolean z10, int i10) {
        super(lVar);
        this.f14525b = oVar;
        this.f14526c = z10;
        this.f14527d = i10;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        tk.o oVar = this.f14525b;
        if (oVar instanceof il.o) {
            this.f14315a.d(nVar);
            return;
        }
        this.f14315a.d(new a(nVar, oVar.b(), this.f14526c, this.f14527d));
    }
}
