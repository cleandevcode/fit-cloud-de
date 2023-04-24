package tk;

import gl.v;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import yk.a;

/* loaded from: classes2.dex */
public abstract class p<T> implements t<T> {
    public static gl.k d(RuntimeException runtimeException) {
        return new gl.k(new a.g(runtimeException));
    }

    public static gl.o e(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new gl.o(obj);
    }

    @Override // tk.t
    public final void c(r<? super T> rVar) {
        Objects.requireNonNull(rVar, "observer is null");
        try {
            f(rVar);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            h7.a.y(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public abstract void f(r<? super T> rVar);

    public final gl.t g(long j10, TimeUnit timeUnit, o oVar, p pVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(oVar, "scheduler is null");
        return new gl.t(this, j10, timeUnit, oVar, pVar);
    }

    public final i<T> h() {
        return this instanceof zk.a ? ((zk.a) this).b() : new v(this);
    }
}
