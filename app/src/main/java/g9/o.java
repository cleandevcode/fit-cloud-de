package g9;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ t f15048a;

    /* renamed from: b */
    public final /* synthetic */ p f15049b;

    public o(p pVar, t tVar) {
        this.f15049b = pVar;
        this.f15048a = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f15049b.f15051b) {
            e eVar = this.f15049b.f15052c;
            if (eVar != null) {
                eVar.onSuccess(this.f15048a.a());
            }
        }
    }
}
