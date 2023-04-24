package gm;

/* loaded from: classes2.dex */
public final class q implements d {

    /* renamed from: a */
    public final Class<?> f15505a;

    public q(Class cls) {
        l.f(cls, "jClass");
        this.f15505a = cls;
    }

    @Override // gm.d
    public final Class<?> b() {
        return this.f15505a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof q) && l.a(this.f15505a, ((q) obj).f15505a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15505a.hashCode();
    }

    public final String toString() {
        return this.f15505a.toString() + " (Kotlin reflection is not available)";
    }
}
