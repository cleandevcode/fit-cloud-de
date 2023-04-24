package tl;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class b<T> implements d<T>, Serializable {

    /* renamed from: a */
    public final T f28285a;

    public b(T t10) {
        this.f28285a = t10;
    }

    @Override // tl.d
    public final T getValue() {
        return this.f28285a;
    }

    public final String toString() {
        return String.valueOf(this.f28285a);
    }
}
