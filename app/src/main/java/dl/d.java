package dl;

import fl.p;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import kc.s0;

/* loaded from: classes2.dex */
public final class d<T, R> extends dl.a<T, R> {

    /* renamed from: b */
    public final wk.e<? super T, ? extends tk.h<? extends R>> f13133b;

    /* loaded from: classes2.dex */
    public static final class a<T, R> extends AtomicReference<uk.c> implements tk.g<T>, uk.c {

        /* renamed from: a */
        public final tk.g<? super R> f13134a;

        /* renamed from: b */
        public final wk.e<? super T, ? extends tk.h<? extends R>> f13135b;

        /* renamed from: c */
        public uk.c f13136c;

        /* renamed from: dl.d$a$a */
        /* loaded from: classes2.dex */
        public final class C0227a implements tk.g<R> {
            public C0227a() {
                a.this = r1;
            }

            @Override // tk.g
            public final void a(uk.c cVar) {
                xk.b.h(a.this, cVar);
            }

            @Override // tk.g
            public final void onComplete() {
                a.this.f13134a.onComplete();
            }

            @Override // tk.g
            public final void onError(Throwable th2) {
                a.this.f13134a.onError(th2);
            }

            @Override // tk.g
            public final void onSuccess(R r10) {
                a.this.f13134a.onSuccess(r10);
            }
        }

        public a(tk.g<? super R> gVar, wk.e<? super T, ? extends tk.h<? extends R>> eVar) {
            this.f13134a = gVar;
            this.f13135b = eVar;
        }

        @Override // tk.g
        public final void a(uk.c cVar) {
            if (xk.b.i(this.f13136c, cVar)) {
                this.f13136c = cVar;
                this.f13134a.a(this);
            }
        }

        public final boolean b() {
            return xk.b.d(get());
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this);
            this.f13136c.c();
        }

        @Override // tk.g
        public final void onComplete() {
            this.f13134a.onComplete();
        }

        @Override // tk.g
        public final void onError(Throwable th2) {
            this.f13134a.onError(th2);
        }

        @Override // tk.g
        public final void onSuccess(T t10) {
            try {
                tk.h<? extends R> apply = this.f13135b.apply(t10);
                Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                tk.h<? extends R> hVar = apply;
                if (b()) {
                    return;
                }
                hVar.a(new C0227a());
            } catch (Throwable th2) {
                h7.a.y(th2);
                this.f13134a.onError(th2);
            }
        }
    }

    public d(p pVar, s0 s0Var) {
        super(pVar);
        this.f13133b = s0Var;
    }

    @Override // tk.f
    public final void c(tk.g<? super R> gVar) {
        this.f13126a.a(new a(gVar, this.f13133b));
    }
}
