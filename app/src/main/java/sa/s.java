package sa;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class s extends v {

    /* renamed from: b */
    public final /* synthetic */ Method f26804b;

    /* renamed from: c */
    public final /* synthetic */ int f26805c;

    public s(Method method, int i10) {
        this.f26804b = method;
        this.f26805c = i10;
    }

    @Override // sa.v
    public final <T> T b(Class<T> cls) {
        v.a(cls);
        return (T) this.f26804b.invoke(null, cls, Integer.valueOf(this.f26805c));
    }
}
