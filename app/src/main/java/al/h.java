package al;

import tk.n;

/* loaded from: classes2.dex */
public final class h<T> implements n<T>, uk.c {

    /* renamed from: a */
    public final n<? super T> f620a;

    /* renamed from: b */
    public final wk.d<? super uk.c> f621b;

    /* renamed from: c */
    public final wk.a f622c;

    /* renamed from: d */
    public uk.c f623d;

    public h(n<? super T> nVar, wk.d<? super uk.c> dVar, wk.a aVar) {
        this.f620a = nVar;
        this.f621b = dVar;
        this.f622c = aVar;
    }

    @Override // tk.n
    public final void a(uk.c cVar) {
        try {
            this.f621b.accept(cVar);
            if (xk.b.i(this.f623d, cVar)) {
                this.f623d = cVar;
                this.f620a.a(this);
            }
        } catch (Throwable th2) {
            h7.a.y(th2);
            cVar.c();
            this.f623d = xk.b.f30613a;
            n<? super T> nVar = this.f620a;
            nVar.a(xk.c.INSTANCE);
            nVar.onError(th2);
        }
    }

    @Override // tk.n
    public final void b(T t10) {
        this.f620a.b(t10);
    }

    @Override // uk.c
    public final void c() {
        uk.c cVar = this.f623d;
        xk.b bVar = xk.b.f30613a;
        if (cVar != bVar) {
            this.f623d = bVar;
            try {
                this.f622c.run();
            } catch (Throwable th2) {
                h7.a.y(th2);
                ol.a.a(th2);
            }
            cVar.c();
        }
    }

    @Override // tk.n
    public final void onComplete() {
        uk.c cVar = this.f623d;
        xk.b bVar = xk.b.f30613a;
        if (cVar != bVar) {
            this.f623d = bVar;
            this.f620a.onComplete();
        }
    }

    @Override // tk.n
    public final void onError(Throwable th2) {
        uk.c cVar = this.f623d;
        xk.b bVar = xk.b.f30613a;
        if (cVar == bVar) {
            ol.a.a(th2);
            return;
        }
        this.f623d = bVar;
        this.f620a.onError(th2);
    }
}
