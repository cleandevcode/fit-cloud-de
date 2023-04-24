package ln;

/* loaded from: classes2.dex */
public abstract class j implements y {

    /* renamed from: a */
    public final y f20105a;

    public j(y yVar) {
        gm.l.f(yVar, "delegate");
        this.f20105a = yVar;
    }

    @Override // ln.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20105a.close();
    }

    @Override // ln.y
    public final z e() {
        return this.f20105a.e();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f20105a + ')';
    }
}
