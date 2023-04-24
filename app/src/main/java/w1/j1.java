package w1;

import w1.z;

/* loaded from: classes.dex */
public abstract class j1<T, B> {
    public abstract void a(int i10, int i11, Object obj);

    public abstract void b(B b10, int i10, long j10);

    public abstract void c(Object obj, Object obj2, int i10);

    public abstract void d(B b10, int i10, g gVar);

    public abstract void e(B b10, int i10, long j10);

    public abstract k1 f(Object obj);

    public abstract k1 g(Object obj);

    public abstract int h(T t10);

    public abstract int i(T t10);

    public abstract void j(Object obj);

    public abstract k1 k(Object obj, Object obj2);

    public final boolean l(B b10, c1 c1Var) {
        int a10 = c1Var.a();
        int i10 = a10 >>> 3;
        int i11 = a10 & 7;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                a(i10, c1Var.j(), b10);
                                return true;
                            }
                            int i12 = z.f29731a;
                            throw new z.a();
                        }
                        return false;
                    }
                    k1 m10 = m();
                    int i13 = 4 | (i10 << 3);
                    while (c1Var.B() != Integer.MAX_VALUE && l(m10, c1Var)) {
                    }
                    if (i13 == c1Var.a()) {
                        c(b10, q(m10), i10);
                        return true;
                    }
                    throw new z("Protocol message end-group tag did not match expected tag.");
                }
                d(b10, i10, c1Var.E());
                return true;
            }
            b(b10, i10, c1Var.e());
            return true;
        }
        e(b10, i10, c1Var.L());
        return true;
    }

    public abstract k1 m();

    public abstract void n(Object obj, B b10);

    public abstract void o(Object obj, T t10);

    public abstract void p();

    public abstract k1 q(Object obj);

    public abstract void r(Object obj, l lVar);

    public abstract void s(Object obj, l lVar);
}
