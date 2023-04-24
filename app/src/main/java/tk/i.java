package tk;

import a0.q0;
import fl.b1;
import fl.c1;
import fl.d1;
import fl.e0;
import fl.f0;
import fl.g0;
import fl.h0;
import fl.k0;
import fl.s0;
import fl.u;
import fl.v0;
import fl.w0;
import fl.x;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import yk.a;

/* loaded from: classes2.dex */
public abstract class i<T> implements l<T> {
    public static c1 D(long j10, TimeUnit timeUnit) {
        return E(j10, timeUnit, pl.a.f24280b);
    }

    public static c1 E(long j10, TimeUnit timeUnit, o oVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(oVar, "scheduler is null");
        return new c1(Math.max(j10, 0L), timeUnit, oVar);
    }

    public static <T> i<T> e(k<T> kVar) {
        return new fl.g(kVar);
    }

    public static <T> i<T> f(wk.g<? extends l<? extends T>> gVar) {
        return new bl.k(1, gVar);
    }

    public static <T> i<T> m(Throwable th2) {
        Objects.requireNonNull(th2, "throwable is null");
        return new fl.s(new a.g(th2));
    }

    @SafeVarargs
    public static <T> i<T> q(T... tArr) {
        if (tArr.length == 0) {
            return fl.r.f14652a;
        }
        if (tArr.length == 1) {
            return t(tArr[0]);
        }
        return new x(tArr);
    }

    public static e0 r(long j10, long j11, TimeUnit timeUnit, o oVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(oVar, "scheduler is null");
        return new e0(Math.max(0L, j10), Math.max(0L, j11), timeUnit, oVar);
    }

    public static i s(long j10, long j11, TimeUnit timeUnit) {
        il.b bVar = pl.a.f24280b;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 >= 0) {
            if (i10 == 0) {
                return fl.r.f14652a.h(0L, timeUnit, bVar);
            }
            Objects.requireNonNull(timeUnit, "unit is null");
            Objects.requireNonNull(bVar, "scheduler is null");
            return new f0((j10 - 1) + 0, Math.max(0L, 0L), Math.max(0L, j11), timeUnit, bVar);
        }
        throw new IllegalArgumentException(q0.a("count >= 0 required but it was ", j10));
    }

    public static <T> i<T> t(T t10) {
        Objects.requireNonNull(t10, "item is null");
        return new g0(t10);
    }

    public static i v(l lVar, i iVar) {
        Objects.requireNonNull(lVar, "source1 is null");
        Objects.requireNonNull(iVar, "source2 is null");
        return q(lVar, iVar).p(yk.a.f31786a, 2);
    }

    public final i<T> A(o oVar) {
        Objects.requireNonNull(oVar, "scheduler is null");
        return new v0(this, oVar);
    }

    public final <R> i<R> B(wk.e<? super T, ? extends l<? extends R>> eVar) {
        i<R> w0Var;
        int i10 = d.f28269a;
        Objects.requireNonNull(eVar, "mapper is null");
        yk.b.a(i10, "bufferSize");
        if (this instanceof nl.d) {
            Object obj = ((nl.d) this).get();
            if (obj == null) {
                return fl.r.f14652a;
            }
            w0Var = new s0.b<>(eVar, obj);
        } else {
            w0Var = new w0<>(this, eVar, i10);
        }
        return w0Var;
    }

    public final b1 C(long j10, TimeUnit timeUnit) {
        il.b bVar = pl.a.f24280b;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(bVar, "scheduler is null");
        return new b1(this, j10, timeUnit, bVar, null);
    }

    public final i<T> F(o oVar) {
        Objects.requireNonNull(oVar, "scheduler is null");
        return new d1(this, oVar);
    }

    public final <R> i<R> c(m<? super T, ? extends R> mVar) {
        Objects.requireNonNull(mVar, "composer is null");
        i<R> a10 = mVar.a(this);
        Objects.requireNonNull(a10, "source is null");
        return a10;
    }

    @Override // tk.l
    public final void d(n<? super T> nVar) {
        Objects.requireNonNull(nVar, "observer is null");
        try {
            z(nVar);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            h7.a.y(th2);
            ol.a.a(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final i<T> g(long j10, TimeUnit timeUnit, o oVar) {
        return h(j10, timeUnit, oVar);
    }

    public final i h(long j10, TimeUnit timeUnit, o oVar) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(oVar, "scheduler is null");
        return new fl.i(this, j10, timeUnit, oVar);
    }

    public final i<T> i() {
        return new fl.k(this);
    }

    public final i<T> j(wk.a aVar) {
        return new fl.n(this, yk.a.f31789d, aVar);
    }

    public final fl.m k(wk.d dVar, wk.d dVar2, wk.a aVar, wk.a aVar2) {
        return new fl.m(this, dVar, dVar2, aVar, aVar2);
    }

    public final fl.m l(wk.a aVar) {
        return k(yk.a.f31789d, new a.C0601a(aVar), aVar, yk.a.f31788c);
    }

    public final i<T> n(wk.f<? super T> fVar) {
        return new fl.t(this, fVar);
    }

    public final <R> i<R> o(wk.e<? super T, ? extends l<? extends R>> eVar) {
        return p(eVar, Integer.MAX_VALUE);
    }

    public final i p(wk.e eVar, int i10) {
        int i11 = d.f28269a;
        Objects.requireNonNull(eVar, "mapper is null");
        yk.b.a(i10, "maxConcurrency");
        yk.b.a(i11, "bufferSize");
        if (this instanceof nl.d) {
            Object obj = ((nl.d) this).get();
            if (obj == null) {
                return fl.r.f14652a;
            }
            return new s0.b(eVar, obj);
        }
        return new u(this, eVar, i10, i11);
    }

    public final <R> i<R> u(wk.e<? super T, ? extends R> eVar) {
        Objects.requireNonNull(eVar, "mapper is null");
        return new h0(this, eVar);
    }

    public final k0 w(o oVar) {
        int i10 = d.f28269a;
        Objects.requireNonNull(oVar, "scheduler is null");
        yk.b.a(i10, "bufferSize");
        return new k0(this, oVar, false, i10);
    }

    public final i<T> x(T t10) {
        return new fl.d(d.f28269a, q(t(t10), this));
    }

    public final al.j y(wk.d dVar, wk.d dVar2, wk.a aVar) {
        Objects.requireNonNull(dVar, "onNext is null");
        al.j jVar = new al.j(dVar, dVar2, aVar);
        d(jVar);
        return jVar;
    }

    public abstract void z(n<? super T> nVar);
}
