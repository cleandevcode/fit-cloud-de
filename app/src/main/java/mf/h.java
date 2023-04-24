package mf;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class h extends yb.y {

    /* renamed from: c */
    public final /* synthetic */ Method f20572c;

    /* renamed from: d */
    public final /* synthetic */ Object f20573d;

    /* renamed from: e */
    public final /* synthetic */ Class f20574e;

    public h(Method method, Object obj, Class cls) {
        this.f20572c = method;
        this.f20573d = obj;
        this.f20574e = cls;
    }

    public final String toString() {
        return this.f20574e.getName();
    }

    @Override // yb.y
    public final Object y() {
        return this.f20572c.invoke(this.f20573d, this.f20574e);
    }
}
