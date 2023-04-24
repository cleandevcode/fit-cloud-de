package el;

import java.util.concurrent.atomic.AtomicReference;
import tk.i;
import tk.l;
import tk.n;

/* loaded from: classes2.dex */
public final class a<R> extends i<R> {

    /* renamed from: a */
    public final tk.c f13819a;

    /* renamed from: b */
    public final l<? extends R> f13820b;

    /* renamed from: el.a$a */
    /* loaded from: classes2.dex */
    public static final class C0243a<R> extends AtomicReference<uk.c> implements n<R>, tk.b, uk.c {

        /* renamed from: a */
        public final n<? super R> f13821a;

        /* renamed from: b */
        public l<? extends R> f13822b;

        public C0243a(n<? super R> nVar, l<? extends R> lVar) {
            this.f13822b = lVar;
            this.f13821a = nVar;
        }

        @Override // tk.n
        public final void a(uk.c cVar) {
            xk.b.e(this, cVar);
        }

        @Override // tk.n
        public final void b(R r10) {
            this.f13821a.b(r10);
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this);
        }

        @Override // tk.n
        public final void onComplete() {
            l<? extends R> lVar = this.f13822b;
            if (lVar == null) {
                this.f13821a.onComplete();
                return;
            }
            this.f13822b = null;
            lVar.d(this);
        }

        @Override // tk.n
        public final void onError(Throwable th2) {
            this.f13821a.onError(th2);
        }
    }

    public a(tk.c cVar, l<? extends R> lVar) {
        this.f13819a = cVar;
        this.f13820b = lVar;
    }

    @Override // tk.i
    public final void z(n<? super R> nVar) {
        C0243a c0243a = new C0243a(nVar, this.f13820b);
        nVar.a(c0243a);
        this.f13819a.a(c0243a);
    }
}
