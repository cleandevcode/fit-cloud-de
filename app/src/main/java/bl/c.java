package bl;

/* loaded from: classes2.dex */
public final class c extends tk.a {

    /* renamed from: a */
    public final Throwable f4449a;

    public c(RuntimeException runtimeException) {
        this.f4449a = runtimeException;
    }

    @Override // tk.a
    public final void g(tk.b bVar) {
        Throwable th2 = this.f4449a;
        bVar.a(xk.c.INSTANCE);
        bVar.onError(th2);
    }
}
