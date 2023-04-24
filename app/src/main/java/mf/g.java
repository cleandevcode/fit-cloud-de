package mf;

import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class g extends yb.y {

    /* renamed from: c */
    public final /* synthetic */ Constructor f20567c;

    /* renamed from: d */
    public final /* synthetic */ Class f20568d;

    public g(Constructor constructor, Class cls) {
        this.f20567c = constructor;
        this.f20568d = cls;
    }

    public final String toString() {
        return this.f20568d.getName();
    }

    @Override // yb.y
    public final Object y() {
        return this.f20567c.newInstance(null);
    }
}
