package tm;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class a extends CancellationException {

    /* renamed from: a */
    public final transient sm.g<?> f28300a;

    public a(sm.g<?> gVar) {
        super("Flow was aborted, no more elements needed");
        this.f28300a = gVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
