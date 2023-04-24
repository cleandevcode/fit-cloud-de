package a0;

import java.util.Set;

/* loaded from: classes.dex */
public interface l0 {

    /* loaded from: classes.dex */
    public static abstract class a<T> {
        public static d a(String str, Class cls) {
            return new d(str, cls, null);
        }

        public abstract String b();

        public abstract Object c();

        public abstract Class<T> d();
    }

    /* loaded from: classes.dex */
    public enum b {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    b a(a<?> aVar);

    <ValueT> ValueT c(a<ValueT> aVar);

    Set<a<?>> d();

    <ValueT> ValueT e(a<ValueT> aVar, ValueT valuet);

    void m(x.d dVar);

    <ValueT> ValueT p(a<ValueT> aVar, b bVar);

    Set<b> u(a<?> aVar);

    boolean z(a<?> aVar);
}
