package uf;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a */
    public final int f28707a;

    /* renamed from: b */
    public final int f28708b;

    /* renamed from: c */
    public final int f28709c;

    public b() {
        this(0, 0, 0);
    }

    public b(int i10, int i11, int i12) {
        this.f28707a = i10;
        this.f28708b = i11;
        this.f28709c = i12;
    }

    public final boolean a() {
        return this.f28707a == 0;
    }

    public final boolean b() {
        return this.f28709c == 0;
    }

    public final boolean c() {
        return this.f28708b == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f28707a == bVar.f28707a && this.f28708b == bVar.f28708b && this.f28709c == bVar.f28709c;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f28707a * 31) + this.f28708b) * 31) + this.f28709c;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("UnitConfig(length=");
        a10.append(this.f28707a);
        a10.append(", weight=");
        a10.append(this.f28708b);
        a10.append(", temperature=");
        return a1.b.a(a10, this.f28709c, ')');
    }
}
