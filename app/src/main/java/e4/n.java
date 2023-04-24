package e4;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class n<T> {

    /* renamed from: b */
    public static ConcurrentHashMap f13431b = new ConcurrentHashMap(16, 0.75f, 1);

    /* renamed from: a */
    public final Type f13432a;

    /* loaded from: classes.dex */
    public static class a extends n<List<String>> {
    }

    static {
        new a();
    }

    public n() {
        Type type = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        Type type2 = (Type) f13431b.get(type);
        if (type2 == null) {
            f13431b.putIfAbsent(type, type);
            type2 = (Type) f13431b.get(type);
        }
        this.f13432a = type2;
    }

    public static Type a(n4.k kVar) {
        Type type = (Type) f13431b.get(kVar);
        if (type == null) {
            f13431b.putIfAbsent(kVar, kVar);
            return (Type) f13431b.get(kVar);
        }
        return type;
    }
}
