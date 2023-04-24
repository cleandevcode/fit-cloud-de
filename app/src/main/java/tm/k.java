package tm;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class k extends CancellationException {
    public k() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
