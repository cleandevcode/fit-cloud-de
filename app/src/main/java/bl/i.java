package bl;

import fl.d0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import ph.p;

/* loaded from: classes2.dex */
public final class i extends tk.a {

    /* renamed from: a */
    public final tk.c f4472a;

    /* renamed from: b */
    public final wk.e<? super Throwable, ? extends tk.c> f4473b;

    /* loaded from: classes2.dex */
    public static final class a extends AtomicReference<uk.c> implements tk.b, uk.c {

        /* renamed from: a */
        public final tk.b f4474a;

        /* renamed from: b */
        public final wk.e<? super Throwable, ? extends tk.c> f4475b;

        /* renamed from: c */
        public boolean f4476c;

        public a(tk.b bVar, wk.e<? super Throwable, ? extends tk.c> eVar) {
            this.f4474a = bVar;
            this.f4475b = eVar;
        }

        @Override // tk.b, tk.g
        public final void a(uk.c cVar) {
            xk.b.e(this, cVar);
        }

        @Override // uk.c
        public final void c() {
            xk.b.a(this);
        }

        @Override // tk.b, tk.g
        public final void onComplete() {
            this.f4474a.onComplete();
        }

        @Override // tk.b, tk.g
        public final void onError(Throwable th2) {
            if (this.f4476c) {
                this.f4474a.onError(th2);
                return;
            }
            this.f4476c = true;
            try {
                tk.c apply = this.f4475b.apply(th2);
                Objects.requireNonNull(apply, "The errorMapper returned a null CompletableSource");
                apply.a(this);
            } catch (Throwable th3) {
                h7.a.y(th3);
                this.f4474a.onError(new vk.a(th2, th3));
            }
        }
    }

    public i(d0 d0Var, p pVar) {
        this.f4472a = d0Var;
        this.f4473b = pVar;
    }

    @Override // tk.a
    public final void g(tk.b bVar) {
        a aVar = new a(bVar, this.f4473b);
        bVar.a(aVar);
        this.f4472a.a(aVar);
    }
}
