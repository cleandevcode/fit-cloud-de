package bl;

/* loaded from: classes2.dex */
public final class d extends tk.a {

    /* renamed from: a */
    public final wk.a f4450a;

    public d(wk.a aVar) {
        this.f4450a = aVar;
    }

    @Override // tk.a
    public final void g(tk.b bVar) {
        uk.f fVar = new uk.f(yk.a.f31787b);
        bVar.a(fVar);
        if (fVar.a()) {
            return;
        }
        try {
            this.f4450a.run();
            if (fVar.a()) {
                return;
            }
            bVar.onComplete();
        } catch (Throwable th2) {
            h7.a.y(th2);
            if (fVar.a()) {
                ol.a.a(th2);
            } else {
                bVar.onError(th2);
            }
        }
    }
}
