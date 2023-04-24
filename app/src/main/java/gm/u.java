package gm;

import gm.c;
import mm.g;

/* loaded from: classes2.dex */
public abstract class u extends w implements mm.g {
    public u(Class cls, String str, String str2) {
        super(c.a.f15496a, cls, str, str2, 0);
    }

    @Override // fm.p
    public final Object A(Object obj, Object obj2) {
        return ((v) this).b().call();
    }

    @Override // mm.g
    public final g.a b() {
        mm.a a10 = a();
        if (a10 != this) {
            return ((mm.g) ((mm.h) a10)).b();
        }
        throw new em.a();
    }

    @Override // gm.c
    public final mm.a c() {
        b0.f15488a.getClass();
        return this;
    }
}
