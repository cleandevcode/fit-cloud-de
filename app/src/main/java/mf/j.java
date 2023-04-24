package mf;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class j extends yb.y {

    /* renamed from: c */
    public final /* synthetic */ Method f20593c;

    /* renamed from: d */
    public final /* synthetic */ Class f20594d;

    public j(Class cls, Method method) {
        this.f20593c = method;
        this.f20594d = cls;
    }

    public final String toString() {
        return this.f20594d.getName();
    }

    @Override // yb.y
    public final Object y() {
        return this.f20593c.invoke(null, this.f20594d, Object.class);
    }
}
