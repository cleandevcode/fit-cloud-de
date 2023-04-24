package v3;

/* loaded from: classes.dex */
public final class d<T> implements c<T>, u3.a<T> {

    /* renamed from: a */
    public final T f29037a;

    public d(T t10) {
        this.f29037a = t10;
    }

    public static d a(Object obj) {
        if (obj != null) {
            return new d(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // w3.a
    public final T get() {
        return this.f29037a;
    }
}
