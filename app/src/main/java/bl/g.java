package bl;

import yk.a;

/* loaded from: classes2.dex */
public final class g extends tk.a {

    /* renamed from: a */
    public final tk.c f4458a;

    /* renamed from: b */
    public final wk.f<? super Throwable> f4459b;

    /* loaded from: classes2.dex */
    public final class a implements tk.b {

        /* renamed from: a */
        public final tk.b f4460a;

        public a(tk.b bVar) {
            g.this = r1;
            this.f4460a = bVar;
        }

        @Override // tk.b, tk.g
        public final void a(uk.c cVar) {
            this.f4460a.a(cVar);
        }

        @Override // tk.b, tk.g
        public final void onComplete() {
            this.f4460a.onComplete();
        }

        @Override // tk.b, tk.g
        public final void onError(Throwable th2) {
            try {
                if (g.this.f4459b.test(th2)) {
                    this.f4460a.onComplete();
                } else {
                    this.f4460a.onError(th2);
                }
            } catch (Throwable th3) {
                h7.a.y(th3);
                this.f4460a.onError(new vk.a(th2, th3));
            }
        }
    }

    public g(tk.c cVar) {
        a.i iVar = yk.a.f31791f;
        this.f4458a = cVar;
        this.f4459b = iVar;
    }

    @Override // tk.a
    public final void g(tk.b bVar) {
        this.f4458a.a(new a(bVar));
    }
}
