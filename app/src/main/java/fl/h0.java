package fl;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class h0<T, U> extends fl.a<T, U> {

    /* renamed from: b */
    public final wk.e<? super T, ? extends U> f14486b;

    /* loaded from: classes2.dex */
    public static final class a<T, U> extends al.a<T, U> {

        /* renamed from: f */
        public final wk.e<? super T, ? extends U> f14487f;

        public a(tk.n<? super U> nVar, wk.e<? super T, ? extends U> eVar) {
            super(nVar);
            this.f14487f = eVar;
        }

        @Override // tk.n
        public final void b(T t10) {
            if (this.f606d) {
                return;
            }
            if (this.f607e != 0) {
                this.f603a.b(null);
                return;
            }
            try {
                U apply = this.f14487f.apply(t10);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                this.f603a.b(apply);
            } catch (Throwable th2) {
                h7.a.y(th2);
                this.f604b.c();
                onError(th2);
            }
        }

        @Override // nl.c
        public final int d(int i10) {
            return e(i10);
        }

        @Override // nl.f
        public final U poll() {
            T poll = this.f605c.poll();
            if (poll != null) {
                U apply = this.f14487f.apply(poll);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                return apply;
            }
            return null;
        }
    }

    public h0(tk.l<T> lVar, wk.e<? super T, ? extends U> eVar) {
        super(lVar);
        this.f14486b = eVar;
    }

    @Override // tk.i
    public final void z(tk.n<? super U> nVar) {
        this.f14315a.d(new a(nVar, this.f14486b));
    }
}
