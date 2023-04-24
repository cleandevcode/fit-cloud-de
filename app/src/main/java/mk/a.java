package mk;

/* loaded from: classes2.dex */
public final class a<T> implements sl.a<T>, dk.a<T> {

    /* renamed from: c */
    public static final Object f21881c = new Object();

    /* renamed from: a */
    public volatile sl.a<T> f21882a;

    /* renamed from: b */
    public volatile Object f21883b = f21881c;

    public a(sl.a<T> aVar) {
        this.f21882a = aVar;
    }

    public static <P extends sl.a<T>, T> dk.a<T> a(P p10) {
        if (p10 instanceof dk.a) {
            return (dk.a) p10;
        }
        p10.getClass();
        return new a(p10);
    }

    public static <P extends sl.a<T>, T> sl.a<T> b(P p10) {
        return p10 instanceof a ? p10 : new a(p10);
    }

    public static void c(Object obj, Object obj2) {
        if (!(obj != f21881c) || obj == obj2) {
            return;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // sl.a, dk.a
    public final T get() {
        T t10 = (T) this.f21883b;
        Object obj = f21881c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = this.f21883b;
                if (t10 == obj) {
                    t10 = this.f21882a.get();
                    c(this.f21883b, t10);
                    this.f21883b = t10;
                    this.f21882a = null;
                }
            }
        }
        return t10;
    }
}
