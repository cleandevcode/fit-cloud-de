package gm;

import gm.c;
import mm.f;

/* loaded from: classes2.dex */
public abstract class s extends w implements mm.f {
    public s(Class cls, String str, String str2, int i10) {
        super(c.a.f15496a, cls, str, str2, i10);
    }

    @Override // mm.f
    public final f.a b() {
        mm.a a10 = a();
        if (a10 != this) {
            return ((mm.f) ((mm.h) a10)).b();
        }
        throw new em.a();
    }

    @Override // gm.c
    public final mm.a c() {
        b0.f15488a.getClass();
        return this;
    }

    @Override // fm.l
    public final Object k(Object obj) {
        return get(obj);
    }
}
