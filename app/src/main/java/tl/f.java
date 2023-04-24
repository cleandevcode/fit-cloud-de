package tl;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class f<A, B> implements Serializable {

    /* renamed from: a */
    public final A f28286a;

    /* renamed from: b */
    public final B f28287b;

    public f(A a10, B b10) {
        this.f28286a = a10;
        this.f28287b = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return gm.l.a(this.f28286a, fVar.f28286a) && gm.l.a(this.f28287b, fVar.f28287b);
        }
        return false;
    }

    public final int hashCode() {
        A a10 = this.f28286a;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f28287b;
        return hashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public final String toString() {
        return '(' + this.f28286a + ", " + this.f28287b + ')';
    }
}
