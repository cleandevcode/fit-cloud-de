package tk;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import yk.a;

/* loaded from: classes2.dex */
public abstract class a implements c {
    public static bl.j h(long j10, TimeUnit timeUnit) {
        il.b bVar = pl.a.f24280b;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(bVar, "scheduler is null");
        return new bl.j(j10, timeUnit, bVar);
    }

    @Override // tk.c
    public final void a(b bVar) {
        Objects.requireNonNull(bVar, "observer is null");
        try {
            g(bVar);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            h7.a.y(th2);
            ol.a.a(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final <T> i<T> c(l<T> lVar) {
        Objects.requireNonNull(lVar, "next is null");
        return new el.a(this, lVar);
    }

    public final bl.h d(wk.a aVar) {
        a.d dVar = yk.a.f31789d;
        return e(dVar, dVar, aVar, yk.a.f31788c);
    }

    public final bl.h e(wk.d dVar, wk.d dVar2, wk.a aVar, wk.a aVar2) {
        return new bl.h(this, dVar, dVar2, aVar, aVar2);
    }

    public final al.i f() {
        al.i iVar = new al.i();
        a(iVar);
        return iVar;
    }

    public abstract void g(b bVar);
}
