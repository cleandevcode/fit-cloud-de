package um;

import pm.g0;

/* loaded from: classes2.dex */
public abstract class s {
    public abstract d<?> a();

    public final boolean b(s sVar) {
        d<?> a10;
        d<?> a11 = a();
        return (a11 == null || (a10 = sVar.a()) == null || a11.g() >= a10.g()) ? false : true;
    }

    public abstract Object c(Object obj);

    public String toString() {
        return getClass().getSimpleName() + '@' + g0.j(this);
    }
}
