package d0;

import d0.i;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import p0.c;
import s.h1;
import s.m1;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public static final a f12580a = new a();

    /* loaded from: classes.dex */
    public class a implements o.a<Object, Object> {
        @Override // o.a
        public final Object apply(Object obj) {
            return obj;
        }
    }

    /* loaded from: classes.dex */
    public static final class b<V> implements Runnable {

        /* renamed from: a */
        public final Future<V> f12581a;

        /* renamed from: b */
        public final c<? super V> f12582b;

        public b(Future<V> future, c<? super V> cVar) {
            this.f12581a = future;
            this.f12582b = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f12582b.onSuccess(f.c(this.f12581a));
            } catch (Error e10) {
                e = e10;
                this.f12582b.onFailure(e);
            } catch (RuntimeException e11) {
                e = e11;
                this.f12582b.onFailure(e);
            } catch (ExecutionException e12) {
                Throwable cause = e12.getCause();
                if (cause == null) {
                    this.f12582b.onFailure(e12);
                } else {
                    this.f12582b.onFailure(cause);
                }
            }
        }

        public final String toString() {
            return b.class.getSimpleName() + "," + this.f12582b;
        }
    }

    public static <V> void a(na.a<V> aVar, c<? super V> cVar, Executor executor) {
        cVar.getClass();
        aVar.a(new b(aVar, cVar), executor);
    }

    public static m b(ArrayList arrayList) {
        return new m(new ArrayList(arrayList), true, o8.b.i());
    }

    public static <V> V c(Future<V> future) {
        boolean isDone = future.isDone();
        h1.k("Future was expected to be done, " + future, isDone);
        return (V) d(future);
    }

    public static <V> V d(Future<V> future) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    public static i.c e(Object obj) {
        return obj == null ? i.c.f12587b : new i.c(obj);
    }

    public static <V> na.a<V> f(na.a<V> aVar) {
        aVar.getClass();
        if (aVar.isDone()) {
            return aVar;
        }
        return p0.c.a(new m1(2, aVar));
    }

    public static void g(boolean z10, na.a aVar, c.a aVar2, c0.a aVar3) {
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        a(aVar, new g(aVar2), aVar3);
        if (z10) {
            h hVar = new h(aVar);
            c0.a i10 = o8.b.i();
            p0.d<Void> dVar = aVar2.f23755c;
            if (dVar != null) {
                dVar.a(hVar, i10);
            }
        }
    }

    public static d0.b h(na.a aVar, o.a aVar2, Executor executor) {
        d0.b bVar = new d0.b(new e(aVar2), aVar);
        aVar.a(bVar, executor);
        return bVar;
    }
}
