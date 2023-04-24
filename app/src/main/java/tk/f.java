package tk;

import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class f<T> implements h<T> {
    @Override // tk.h
    public final void a(g<? super T> gVar) {
        Objects.requireNonNull(gVar, "observer is null");
        try {
            c(gVar);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            h7.a.y(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public abstract void c(g<? super T> gVar);
}
