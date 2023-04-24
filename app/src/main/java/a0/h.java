package a0;

/* loaded from: classes.dex */
public final class h extends b2 {

    /* renamed from: a */
    public final int f78a;

    /* renamed from: b */
    public final int f79b;

    public h(int i10, int i11) {
        if (i10 == 0) {
            throw new NullPointerException("Null configType");
        }
        this.f78a = i10;
        if (i11 == 0) {
            throw new NullPointerException("Null configSize");
        }
        this.f79b = i11;
    }

    @Override // a0.b2
    public final int a() {
        return this.f79b;
    }

    @Override // a0.b2
    public final int b() {
        return this.f78a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            b2 b2Var = (b2) obj;
            return s.c0.a(this.f78a, b2Var.b()) && s.c0.a(this.f79b, b2Var.a());
        }
        return false;
    }

    public final int hashCode() {
        return ((s.c0.b(this.f78a) ^ 1000003) * 1000003) ^ s.c0.b(this.f79b);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("SurfaceConfig{configType=");
        a10.append(a2.b(this.f78a));
        a10.append(", configSize=");
        a10.append(z1.a(this.f79b));
        a10.append("}");
        return a10.toString();
    }
}
