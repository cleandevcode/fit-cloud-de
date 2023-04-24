package g9;

/* loaded from: classes.dex */
public final class h<TResult> {

    /* renamed from: a */
    public final t f15034a = new t();

    public h() {
    }

    public h(w.e eVar) {
        eVar.d(new x2.i(5, this));
    }

    public final void a(TResult tresult) {
        t tVar = this.f15034a;
        synchronized (tVar.f15057a) {
            tVar.d();
            tVar.f15059c = true;
            tVar.f15061e = tresult;
        }
        tVar.f15058b.b(tVar);
    }

    public final void b(Exception exc) {
        t tVar = this.f15034a;
        tVar.getClass();
        if (exc != null) {
            synchronized (tVar.f15057a) {
                if (!tVar.f15059c) {
                    tVar.f15059c = true;
                    tVar.f15062f = exc;
                    tVar.f15058b.b(tVar);
                    return;
                }
                return;
            }
        }
        throw new NullPointerException("Exception must not be null");
    }
}
