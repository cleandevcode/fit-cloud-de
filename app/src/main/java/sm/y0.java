package sm;

/* loaded from: classes2.dex */
public final class y0 extends tm.c<w0<?>> {

    /* renamed from: a */
    public long f27353a = -1;

    /* renamed from: b */
    public pm.j f27354b;

    @Override // tm.c
    public final boolean a(tm.b bVar) {
        w0 w0Var = (w0) bVar;
        if (this.f27353a >= 0) {
            return false;
        }
        long j10 = w0Var.f27325i;
        if (j10 < w0Var.f27326j) {
            w0Var.f27326j = j10;
        }
        this.f27353a = j10;
        return true;
    }

    @Override // tm.c
    public final xl.d[] b(tm.b bVar) {
        long j10 = this.f27353a;
        this.f27353a = -1L;
        this.f27354b = null;
        return ((w0) bVar).w(j10);
    }
}
