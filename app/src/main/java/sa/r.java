package sa;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class r extends v {

    /* renamed from: b */
    public final /* synthetic */ Method f26802b;

    /* renamed from: c */
    public final /* synthetic */ Object f26803c;

    public r(Object obj, Method method) {
        this.f26802b = method;
        this.f26803c = obj;
    }

    @Override // sa.v
    public final <T> T b(Class<T> cls) {
        v.a(cls);
        return (T) this.f26802b.invoke(this.f26803c, cls);
    }
}
