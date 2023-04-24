package g3;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ na.a f14902a;

    /* renamed from: b */
    public final /* synthetic */ q3.c f14903b;

    /* renamed from: c */
    public final /* synthetic */ o f14904c;

    public m(o oVar, q3.c cVar, q3.c cVar2) {
        this.f14904c = oVar;
        this.f14902a = cVar;
        this.f14903b = cVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f14902a.get();
            f3.m.c().a(o.f14908s, String.format("Starting work for %s", this.f14904c.f14912d.f22627c), new Throwable[0]);
            o oVar = this.f14904c;
            oVar.f14925q = oVar.f14913e.d();
            this.f14903b.k(this.f14904c.f14925q);
        } catch (Throwable th2) {
            this.f14903b.j(th2);
        }
    }
}
