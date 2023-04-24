package fl;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class w0<T, R> extends fl.a<T, R> {

    /* renamed from: b */
    public final wk.e<? super T, ? extends tk.l<? extends R>> f14732b;

    /* renamed from: c */
    public final int f14733c;

    /* renamed from: d */
    public final boolean f14734d;

    /* loaded from: classes2.dex */
    public static final class a<T, R> extends AtomicReference<uk.c> implements tk.n<R> {

        /* renamed from: a */
        public final b<T, R> f14735a;

        /* renamed from: b */
        public final long f14736b;

        /* renamed from: c */
        public final int f14737c;

        /* renamed from: d */
        public volatile nl.f<R> f14738d;

        /* renamed from: e */
        public volatile boolean f14739e;

        public a(b<T, R> bVar, long j10, int i10) {
            this.f14735a = bVar;
            this.f14736b = j10;
            this.f14737c = i10;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.h(this, cVar)) {
                if (cVar instanceof nl.b) {
                    nl.b bVar = (nl.b) cVar;
                    int d10 = bVar.d(7);
                    if (d10 == 1) {
                        this.f14738d = bVar;
                        this.f14739e = true;
                        this.f14735a.d();
                        return;
                    } else if (d10 == 2) {
                        this.f14738d = bVar;
                        return;
                    }
                }
                this.f14738d = new nl.h(this.f14737c);
            }
        }

        @Override // tk.n
        public final void b(R r10) {
            if (this.f14736b == this.f14735a.f14750j) {
                if (r10 != null) {
                    this.f14738d.offer(r10);
                }
                this.f14735a.d();
            }
        }

        @Override // tk.n
        public final void onComplete() {
            if (this.f14736b == this.f14735a.f14750j) {
                this.f14739e = true;
                this.f14735a.d();
            }
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            b<T, R> bVar = this.f14735a;
            bVar.getClass();
            if (this.f14736b != bVar.f14750j || !bVar.f14745e.b(th2)) {
                ol.a.a(th2);
                return;
            }
            if (!bVar.f14744d) {
                bVar.f14748h.c();
                bVar.f14746f = true;
            }
            this.f14739e = true;
            bVar.d();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T, R> extends AtomicInteger implements tk.n<T>, uk.c {

        /* renamed from: k */
        public static final a<Object, Object> f14740k;

        /* renamed from: a */
        public final tk.n<? super R> f14741a;

        /* renamed from: b */
        public final wk.e<? super T, ? extends tk.l<? extends R>> f14742b;

        /* renamed from: c */
        public final int f14743c;

        /* renamed from: d */
        public final boolean f14744d;

        /* renamed from: f */
        public volatile boolean f14746f;

        /* renamed from: g */
        public volatile boolean f14747g;

        /* renamed from: h */
        public uk.c f14748h;

        /* renamed from: j */
        public volatile long f14750j;

        /* renamed from: i */
        public final AtomicReference<a<T, R>> f14749i = new AtomicReference<>();

        /* renamed from: e */
        public final kl.b f14745e = new kl.b();

        static {
            a<Object, Object> aVar = new a<>(null, -1L, 1);
            f14740k = aVar;
            xk.b.a(aVar);
        }

        public b(tk.n<? super R> nVar, wk.e<? super T, ? extends tk.l<? extends R>> eVar, int i10, boolean z10) {
            this.f14741a = nVar;
            this.f14742b = eVar;
            this.f14743c = i10;
            this.f14744d = z10;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f14748h, cVar)) {
                this.f14748h = cVar;
                this.f14741a.a(this);
            }
        }

        @Override // tk.n
        public final void b(T t10) {
            boolean z10;
            long j10 = this.f14750j + 1;
            this.f14750j = j10;
            a<T, R> aVar = this.f14749i.get();
            if (aVar != null) {
                xk.b.a(aVar);
            }
            try {
                tk.l<? extends R> apply = this.f14742b.apply(t10);
                Objects.requireNonNull(apply, "The ObservableSource returned is null");
                tk.l<? extends R> lVar = apply;
                a<T, R> aVar2 = new a<>(this, j10, this.f14743c);
                do {
                    a<T, R> aVar3 = this.f14749i.get();
                    if (aVar3 != f14740k) {
                        AtomicReference<a<T, R>> atomicReference = this.f14749i;
                        while (true) {
                            if (atomicReference.compareAndSet(aVar3, aVar2)) {
                                z10 = true;
                                continue;
                                break;
                            } else if (atomicReference.get() != aVar3) {
                                z10 = false;
                                continue;
                                break;
                            }
                        }
                    } else {
                        return;
                    }
                } while (!z10);
                lVar.d(aVar2);
            } catch (Throwable th2) {
                h7.a.y(th2);
                this.f14748h.c();
                onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // uk.c
        public final void c() {
            if (!this.f14747g) {
                this.f14747g = true;
                this.f14748h.c();
                a aVar = (a) this.f14749i.getAndSet(f14740k);
                if (aVar != null) {
                    xk.b.a(aVar);
                }
                this.f14745e.d();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:187:0x00d2 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:194:0x000f A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d() {
            /*
                Method dump skipped, instructions count: 218
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: fl.w0.b.d():void");
        }

        @Override // tk.n
        public final void onComplete() {
            if (this.f14746f) {
                return;
            }
            this.f14746f = true;
            d();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // tk.n
        public final void onError(Throwable th2) {
            a aVar;
            if (!this.f14746f && this.f14745e.b(th2)) {
                if (!this.f14744d && (aVar = (a) this.f14749i.getAndSet(f14740k)) != null) {
                    xk.b.a(aVar);
                }
                this.f14746f = true;
                d();
                return;
            }
            ol.a.a(th2);
        }
    }

    public w0(tk.i iVar, wk.e eVar, int i10) {
        super(iVar);
        this.f14732b = eVar;
        this.f14733c = i10;
        this.f14734d = false;
    }

    @Override // tk.i
    public final void z(tk.n<? super R> nVar) {
        if (s0.a(this.f14315a, nVar, this.f14732b)) {
            return;
        }
        this.f14315a.d(new b(nVar, this.f14732b, this.f14733c, this.f14734d));
    }
}
