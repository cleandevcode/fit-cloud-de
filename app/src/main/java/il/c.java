package il;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class c implements Future<Object> {

    /* renamed from: a */
    public final uk.c f17122a;

    public c(uk.c cVar) {
        this.f17122a = cVar;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        this.f17122a.c();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return false;
    }
}
