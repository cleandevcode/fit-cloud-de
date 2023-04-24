package m2;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i<T> extends a0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t tVar) {
        super(tVar);
        gm.l.f(tVar, "database");
    }

    public abstract void d(r2.f fVar, T t10);

    public final void e(T t10) {
        r2.f a10 = a();
        try {
            d(a10, t10);
            a10.F0();
        } finally {
            c(a10);
        }
    }

    public final void f(List list) {
        gm.l.f(list, "entities");
        r2.f a10 = a();
        try {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                d(a10, it.next());
                a10.F0();
            }
        } finally {
            c(a10);
        }
    }

    public final void g(T[] tArr) {
        gm.l.f(tArr, "entities");
        r2.f a10 = a();
        try {
            for (T t10 : tArr) {
                d(a10, t10);
                a10.F0();
            }
        } finally {
            c(a10);
        }
    }
}
