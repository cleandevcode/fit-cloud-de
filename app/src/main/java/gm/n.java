package gm;

import mm.f;

/* loaded from: classes2.dex */
public abstract class n extends p implements mm.d {
    public n(Class cls, String str, String str2) {
        super(cls, str, str2);
    }

    @Override // mm.f
    public final f.a b() {
        mm.a a10 = a();
        if (a10 != this) {
            return ((mm.d) ((mm.h) a10)).b();
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
        return ((o) this).get(obj);
    }
}
