package ta;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import qa.x;
import ta.n;

/* loaded from: classes.dex */
public final class q<T> extends x<T> {

    /* renamed from: a */
    public final qa.h f27912a;

    /* renamed from: b */
    public final x<T> f27913b;

    /* renamed from: c */
    public final Type f27914c;

    public q(qa.h hVar, x<T> xVar, Type type) {
        this.f27912a = hVar;
        this.f27913b = xVar;
        this.f27914c = type;
    }

    @Override // qa.x
    public final T a(ya.a aVar) {
        return this.f27913b.a(aVar);
    }

    @Override // qa.x
    public final void b(ya.b bVar, T t10) {
        x<T> c10;
        x<T> xVar = this.f27913b;
        Type type = this.f27914c;
        if (t10 != null && ((type instanceof Class) || (type instanceof TypeVariable))) {
            type = t10.getClass();
        }
        if (type != this.f27914c) {
            xVar = this.f27912a.c(new xa.a<>(type));
            if (xVar instanceof n.a) {
                x<T> xVar2 = this.f27913b;
                while ((xVar2 instanceof o) && (c10 = ((o) xVar2).c()) != xVar2) {
                    xVar2 = c10;
                }
                if (!(xVar2 instanceof n.a)) {
                    xVar = this.f27913b;
                }
            }
        }
        xVar.b(bVar, t10);
    }
}
