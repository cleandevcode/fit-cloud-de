package mf;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class i extends yb.y {

    /* renamed from: c */
    public final /* synthetic */ Method f20589c;

    /* renamed from: d */
    public final /* synthetic */ Class f20590d;

    /* renamed from: e */
    public final /* synthetic */ int f20591e;

    public i(Method method, Class cls, int i10) {
        this.f20589c = method;
        this.f20590d = cls;
        this.f20591e = i10;
    }

    public final String toString() {
        return this.f20590d.getName();
    }

    @Override // yb.y
    public final Object y() {
        return this.f20589c.invoke(null, this.f20590d, Integer.valueOf(this.f20591e));
    }
}
