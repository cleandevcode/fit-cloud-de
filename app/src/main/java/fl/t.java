package fl;

/* loaded from: classes2.dex */
public final class t<T> extends fl.a<T, T> {

    /* renamed from: b */
    public final wk.f<? super T> f14668b;

    /* loaded from: classes2.dex */
    public static final class a<T> extends al.a<T, T> {

        /* renamed from: f */
        public final wk.f<? super T> f14669f;

        public a(tk.n<? super T> nVar, wk.f<? super T> fVar) {
            super(nVar);
            this.f14669f = fVar;
        }

        @Override // tk.n
        public final void b(T t10) {
            if (this.f607e == 0) {
                try {
                    if (this.f14669f.test(t10)) {
                        this.f603a.b(t10);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    h7.a.y(th2);
                    this.f604b.c();
                    onError(th2);
                    return;
                }
            }
            this.f603a.b(null);
        }

        @Override // nl.c
        public final int d(int i10) {
            return e(i10);
        }

        @Override // nl.f
        public final T poll() {
            T poll;
            do {
                poll = this.f605c.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.f14669f.test(poll));
            return poll;
        }
    }

    public t(tk.l<T> lVar, wk.f<? super T> fVar) {
        super(lVar);
        this.f14668b = fVar;
    }

    @Override // tk.i
    public final void z(tk.n<? super T> nVar) {
        this.f14315a.d(new a(nVar, this.f14668b));
    }
}
