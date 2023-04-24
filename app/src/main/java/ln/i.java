package ln;

/* loaded from: classes2.dex */
public abstract class i implements w {

    /* renamed from: a */
    public final w f20104a;

    public i(w wVar) {
        gm.l.f(wVar, "delegate");
        this.f20104a = wVar;
    }

    @Override // ln.w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20104a.close();
    }

    @Override // ln.w
    public final z e() {
        return this.f20104a.e();
    }

    @Override // ln.w, java.io.Flushable
    public void flush() {
        this.f20104a.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f20104a + ')';
    }
}
