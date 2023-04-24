package pm;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class h1 extends CancellationException {

    /* renamed from: a */
    public final transient g1 f24345a;

    public h1(String str, Throwable th2, g1 g1Var) {
        super(str);
        this.f24345a = g1Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof h1) {
                h1 h1Var = (h1) obj;
                if (!gm.l.a(h1Var.getMessage(), getMessage()) || !gm.l.a(h1Var.f24345a, this.f24345a) || !gm.l.a(h1Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        gm.l.c(message);
        int hashCode = (this.f24345a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f24345a;
    }
}
