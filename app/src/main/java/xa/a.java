package xa;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a */
    public final Class<? super T> f30456a;

    /* renamed from: b */
    public final Type f30457b;

    /* renamed from: c */
    public final int f30458c;

    public a() {
        Type genericSuperclass = a.class.getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == a.class) {
                Type a10 = sa.a.a(parameterizedType.getActualTypeArguments()[0]);
                this.f30457b = a10;
                this.f30456a = (Class<? super T>) sa.a.f(a10);
                this.f30458c = a10.hashCode();
                return;
            }
        } else if (genericSuperclass == a.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public a(Type type) {
        Objects.requireNonNull(type);
        Type a10 = sa.a.a(type);
        this.f30457b = a10;
        this.f30456a = (Class<? super T>) sa.a.f(a10);
        this.f30458c = a10.hashCode();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && sa.a.d(this.f30457b, ((a) obj).f30457b);
    }

    public final int hashCode() {
        return this.f30458c;
    }

    public final String toString() {
        return sa.a.i(this.f30457b);
    }
}
