package mk;

/* loaded from: classes2.dex */
public final class b<T> implements sl.a<T> {

    /* renamed from: c */
    public static final Object f21884c = new Object();

    /* renamed from: a */
    public volatile sl.a<T> f21885a;

    /* renamed from: b */
    public volatile Object f21886b = f21884c;

    public b(sl.a<T> aVar) {
        this.f21885a = aVar;
    }

    public static <P extends sl.a<T>, T> sl.a<T> a(P p10) {
        return ((p10 instanceof b) || (p10 instanceof a)) ? p10 : new b(p10);
    }

    @Override // sl.a, dk.a
    public final T get() {
        T t10 = (T) this.f21886b;
        if (t10 == f21884c) {
            sl.a<T> aVar = this.f21885a;
            if (aVar == null) {
                return (T) this.f21886b;
            }
            T t11 = aVar.get();
            this.f21886b = t11;
            this.f21885a = null;
            return t11;
        }
        return t10;
    }
}
