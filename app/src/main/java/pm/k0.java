package pm;

/* loaded from: classes2.dex */
public final class k0 extends RuntimeException {

    /* renamed from: a */
    public final xl.f f24357a;

    public k0(xl.f fVar) {
        this.f24357a = fVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f24357a.toString();
    }
}
