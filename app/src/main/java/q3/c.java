package q3;

import q3.a;

/* loaded from: classes.dex */
public final class c<V> extends a<V> {
    public final boolean i(V v10) {
        if (v10 == null) {
            v10 = (V) a.f24517g;
        }
        if (a.f24516f.b(this, null, v10)) {
            a.c(this);
            return true;
        }
        return false;
    }

    public final boolean j(Throwable th2) {
        th2.getClass();
        if (a.f24516f.b(this, null, new a.c(th2))) {
            a.c(this);
            return true;
        }
        return false;
    }

    public final boolean k(na.a<? extends V> aVar) {
        a.c cVar;
        aVar.getClass();
        Object obj = this.f24518a;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!a.f24516f.b(this, null, a.f(aVar))) {
                    return false;
                }
                a.c(this);
            } else {
                a.f fVar = new a.f(this, aVar);
                if (a.f24516f.b(this, null, fVar)) {
                    try {
                        aVar.a(fVar, b.f24541a);
                    } catch (Throwable th2) {
                        try {
                            cVar = new a.c(th2);
                        } catch (Throwable unused) {
                            cVar = a.c.f24525b;
                        }
                        a.f24516f.b(this, fVar, cVar);
                    }
                } else {
                    obj = this.f24518a;
                }
            }
            return true;
        }
        if (!(obj instanceof a.b)) {
            return false;
        }
        aVar.cancel(((a.b) obj).f24523a);
        return false;
    }
}
