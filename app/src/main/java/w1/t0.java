package w1;

import java.util.Iterator;
import java.util.Map;
import w1.b0;
import w1.s;
import w1.w;

/* loaded from: classes.dex */
public final class t0<T> implements d1<T> {

    /* renamed from: a */
    public final p0 f29708a;

    /* renamed from: b */
    public final j1<?, ?> f29709b;

    /* renamed from: c */
    public final boolean f29710c;

    /* renamed from: d */
    public final p<?> f29711d;

    public t0(j1<?, ?> j1Var, p<?> pVar, p0 p0Var) {
        this.f29709b = j1Var;
        this.f29710c = pVar.e(p0Var);
        this.f29711d = pVar;
        this.f29708a = p0Var;
    }

    @Override // w1.d1
    public final void a(T t10, T t11) {
        j1<?, ?> j1Var = this.f29709b;
        Class<?> cls = e1.f29553a;
        j1Var.o(t10, j1Var.k(j1Var.g(t10), j1Var.g(t11)));
        if (this.f29710c) {
            e1.A(this.f29711d, t10, t11);
        }
    }

    @Override // w1.d1
    public final T b() {
        return (T) this.f29708a.f().i();
    }

    @Override // w1.d1
    public final void c(T t10) {
        this.f29709b.j(t10);
        this.f29711d.f(t10);
    }

    @Override // w1.d1
    public final boolean d(T t10) {
        return this.f29711d.c(t10).j();
    }

    @Override // w1.d1
    public final void e(T t10, c1 c1Var, o oVar) {
        j1 j1Var = this.f29709b;
        p pVar = this.f29711d;
        k1 f10 = j1Var.f(t10);
        s<ET> d10 = pVar.d(t10);
        do {
            try {
                if (c1Var.B() == Integer.MAX_VALUE) {
                    break;
                }
            } finally {
                j1Var.n(t10, f10);
            }
        } while (j(c1Var, oVar, pVar, d10, j1Var, f10));
    }

    @Override // w1.d1
    public final void f(Object obj, l lVar) {
        Object value;
        Iterator<Map.Entry<?, Object>> l10 = this.f29711d.c(obj).l();
        while (l10.hasNext()) {
            Map.Entry<?, Object> next = l10.next();
            s.a aVar = (s.a) next.getKey();
            if (aVar.z() == q1.f29675j) {
                aVar.q();
                aVar.A();
                boolean z10 = next instanceof b0.a;
                aVar.o();
                if (z10) {
                    value = ((b0.a) next).f29539a.getValue().b();
                } else {
                    value = next.getValue();
                }
                lVar.l(0, value);
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        j1<?, ?> j1Var = this.f29709b;
        j1Var.r(j1Var.g(obj), lVar);
    }

    @Override // w1.d1
    public final boolean g(T t10, T t11) {
        if (this.f29709b.g(t10).equals(this.f29709b.g(t11))) {
            if (this.f29710c) {
                return this.f29711d.c(t10).equals(this.f29711d.c(t11));
            }
            return true;
        }
        return false;
    }

    @Override // w1.d1
    public final int h(T t10) {
        j1<?, ?> j1Var = this.f29709b;
        int i10 = j1Var.i(j1Var.g(t10)) + 0;
        if (this.f29710c) {
            s<?> c10 = this.f29711d.c(t10);
            int i11 = 0;
            for (int i12 = 0; i12 < c10.f29681a.e(); i12++) {
                i11 += s.g(c10.f29681a.d(i12));
            }
            for (Map.Entry<?, Object> entry : c10.f29681a.f()) {
                i11 += s.g(entry);
            }
            return i10 + i11;
        }
        return i10;
    }

    @Override // w1.d1
    public final int i(T t10) {
        int hashCode = this.f29709b.g(t10).hashCode();
        return this.f29710c ? (hashCode * 53) + this.f29711d.c(t10).hashCode() : hashCode;
    }

    public final <UT, UB, ET extends s.a<ET>> boolean j(c1 c1Var, o oVar, p<ET> pVar, s<ET> sVar, j1<UT, UB> j1Var, UB ub2) {
        int a10 = c1Var.a();
        if (a10 != 11) {
            if ((a10 & 7) == 2) {
                w.e b10 = pVar.b(oVar, this.f29708a, a10 >>> 3);
                if (b10 != null) {
                    pVar.h(b10);
                    return true;
                }
                return j1Var.l(ub2, c1Var);
            }
            return c1Var.H();
        }
        int i10 = 0;
        w.e eVar = null;
        g gVar = null;
        while (c1Var.B() != Integer.MAX_VALUE) {
            int a11 = c1Var.a();
            if (a11 == 16) {
                i10 = c1Var.n();
                eVar = pVar.b(oVar, this.f29708a, i10);
            } else if (a11 == 26) {
                if (eVar != null) {
                    pVar.h(eVar);
                } else {
                    gVar = c1Var.E();
                }
            } else if (!c1Var.H()) {
                break;
            }
        }
        if (c1Var.a() == 12) {
            if (gVar != null) {
                if (eVar != null) {
                    pVar.i(eVar);
                } else {
                    j1Var.d(ub2, i10, gVar);
                }
            }
            return true;
        }
        throw new z("Protocol message end-group tag did not match expected tag.");
    }
}
