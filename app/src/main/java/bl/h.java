package bl;

import yk.a;

/* loaded from: classes2.dex */
public final class h extends tk.a {

    /* renamed from: a */
    public final tk.c f4462a;

    /* renamed from: b */
    public final wk.d<? super uk.c> f4463b;

    /* renamed from: c */
    public final wk.d<? super Throwable> f4464c;

    /* renamed from: d */
    public final wk.a f4465d;

    /* renamed from: e */
    public final wk.a f4466e;

    /* renamed from: f */
    public final wk.a f4467f;

    /* renamed from: g */
    public final wk.a f4468g;

    /* loaded from: classes2.dex */
    public final class a implements tk.b, uk.c {

        /* renamed from: a */
        public final tk.b f4469a;

        /* renamed from: b */
        public uk.c f4470b;

        public a(tk.b bVar) {
            h.this = r1;
            this.f4469a = bVar;
        }

        @Override // tk.b, tk.g
        public final void a(uk.c cVar) {
            try {
                h.this.f4463b.accept(cVar);
                if (xk.b.i(this.f4470b, cVar)) {
                    this.f4470b = cVar;
                    this.f4469a.a(this);
                }
            } catch (Throwable th2) {
                h7.a.y(th2);
                cVar.c();
                this.f4470b = xk.b.f30613a;
                tk.b bVar = this.f4469a;
                bVar.a(xk.c.INSTANCE);
                bVar.onError(th2);
            }
        }

        @Override // uk.c
        public final void c() {
            try {
                h.this.f4468g.run();
            } catch (Throwable th2) {
                h7.a.y(th2);
                ol.a.a(th2);
            }
            this.f4470b.c();
        }

        @Override // tk.b, tk.g
        public final void onComplete() {
            if (this.f4470b == xk.b.f30613a) {
                return;
            }
            try {
                h.this.f4465d.run();
                h.this.f4466e.run();
                this.f4469a.onComplete();
                try {
                    h.this.f4467f.run();
                } catch (Throwable th2) {
                    h7.a.y(th2);
                    ol.a.a(th2);
                }
            } catch (Throwable th3) {
                h7.a.y(th3);
                this.f4469a.onError(th3);
            }
        }

        @Override // tk.b, tk.g
        public final void onError(Throwable th2) {
            if (this.f4470b == xk.b.f30613a) {
                ol.a.a(th2);
                return;
            }
            try {
                h.this.f4464c.accept(th2);
                h.this.f4466e.run();
            } catch (Throwable th3) {
                h7.a.y(th3);
                th2 = new vk.a(th2, th3);
            }
            this.f4469a.onError(th2);
            try {
                h.this.f4467f.run();
            } catch (Throwable th4) {
                h7.a.y(th4);
                ol.a.a(th4);
            }
        }
    }

    public h(tk.c cVar, wk.d dVar, wk.d dVar2, wk.a aVar, wk.a aVar2) {
        a.c cVar2 = yk.a.f31788c;
        this.f4462a = cVar;
        this.f4463b = dVar;
        this.f4464c = dVar2;
        this.f4465d = aVar;
        this.f4466e = cVar2;
        this.f4467f = cVar2;
        this.f4468g = aVar2;
    }

    @Override // tk.a
    public final void g(tk.b bVar) {
        this.f4462a.a(new a(bVar));
    }
}
