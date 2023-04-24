package v3;

/* loaded from: classes.dex */
public final class b<T> implements w3.a<T>, u3.a<T> {

    /* renamed from: c */
    public static final Object f29034c = new Object();

    /* renamed from: a */
    public volatile w3.a<T> f29035a;

    /* renamed from: b */
    public volatile Object f29036b = f29034c;

    public b(w3.a<T> aVar) {
        this.f29035a = aVar;
    }

    public static <P extends w3.a<T>, T> w3.a<T> a(P p10) {
        p10.getClass();
        if (p10 instanceof b) {
            return p10;
        }
        return new b(p10);
    }

    public static void b(Object obj, Object obj2) {
        if (!(obj != f29034c) || obj == obj2) {
            return;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // w3.a
    public final T get() {
        T t10 = (T) this.f29036b;
        Object obj = f29034c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = this.f29036b;
                if (t10 == obj) {
                    t10 = this.f29035a.get();
                    b(this.f29036b, t10);
                    this.f29036b = t10;
                    this.f29035a = null;
                }
            }
        }
        return t10;
    }
}
