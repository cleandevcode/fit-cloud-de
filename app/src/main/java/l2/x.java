package l2;

/* loaded from: classes.dex */
public final class x<K> {

    /* renamed from: a */
    public final K f19346a;

    /* JADX WARN: Multi-variable type inference failed */
    public x(r0 r0Var, Object obj) {
        this.f19346a = obj;
        if (r0Var != r0.REFRESH && obj == 0) {
            throw new IllegalArgumentException("Key must be non-null for prepend/append");
        }
    }
}
