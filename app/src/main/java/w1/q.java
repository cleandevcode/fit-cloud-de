package w1;

import java.util.Map;
import w1.o;
import w1.w;

/* loaded from: classes.dex */
public final class q extends p<w.d> {
    @Override // w1.p
    public final void a(Map.Entry entry) {
        ((w.d) entry.getKey()).getClass();
    }

    @Override // w1.p
    public final w.e b(o oVar, p0 p0Var, int i10) {
        return oVar.f29657a.get(new o.a(i10, p0Var));
    }

    @Override // w1.p
    public final s<w.d> c(Object obj) {
        return ((w.c) obj).extensions;
    }

    @Override // w1.p
    public final s<w.d> d(Object obj) {
        w.c cVar = (w.c) obj;
        s<w.d> sVar = cVar.extensions;
        if (sVar.f29682b) {
            cVar.extensions = sVar.clone();
        }
        return cVar.extensions;
    }

    @Override // w1.p
    public final boolean e(p0 p0Var) {
        return p0Var instanceof w.c;
    }

    @Override // w1.p
    public final void f(Object obj) {
        s<w.d> sVar = ((w.c) obj).extensions;
        if (!sVar.f29682b) {
            sVar.f29681a.h();
            sVar.f29682b = true;
        }
    }

    @Override // w1.p
    public final Object g(Object obj) {
        w.e eVar = (w.e) obj;
        throw null;
    }

    @Override // w1.p
    public final void h(Object obj) {
        w.e eVar = (w.e) obj;
        throw null;
    }

    @Override // w1.p
    public final void i(Object obj) {
        w.e eVar = (w.e) obj;
        throw null;
    }

    @Override // w1.p
    public final void j(Map.Entry entry) {
        ((w.d) entry.getKey()).getClass();
        throw null;
    }
}
