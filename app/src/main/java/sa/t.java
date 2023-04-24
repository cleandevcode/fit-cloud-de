package sa;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class t extends v {

    /* renamed from: b */
    public final /* synthetic */ Method f26806b;

    public t(Method method) {
        this.f26806b = method;
    }

    @Override // sa.v
    public final <T> T b(Class<T> cls) {
        v.a(cls);
        return (T) this.f26806b.invoke(null, cls, Object.class);
    }
}
