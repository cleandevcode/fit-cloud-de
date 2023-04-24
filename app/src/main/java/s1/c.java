package s1;

/* loaded from: classes.dex */
public final class c<T> extends b0<T> {

    /* renamed from: a */
    public final T f26404a;

    /* renamed from: b */
    public final int f26405b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(int i10, Object obj) {
        this.f26404a = obj;
        this.f26405b = i10;
    }

    public final void a() {
        T t10 = this.f26404a;
        if (!((t10 != null ? t10.hashCode() : 0) == this.f26405b)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }
}
