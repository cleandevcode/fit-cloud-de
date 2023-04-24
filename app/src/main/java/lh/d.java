package lh;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a */
    public final int f20002a;

    /* renamed from: b */
    public final int f20003b;

    /* renamed from: c */
    public final int f20004c;

    /* renamed from: d */
    public final int f20005d;

    public d(int i10, int i11, int i12, int i13) {
        this.f20002a = i10;
        this.f20003b = i11;
        this.f20004c = i12;
        this.f20005d = i13;
    }

    public final int a() {
        return this.f20002a;
    }

    public final int b() {
        return this.f20003b;
    }

    public final int c() {
        return this.f20004c;
    }

    public final int d() {
        return this.f20005d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return this.f20002a == dVar.f20002a && this.f20003b == dVar.f20003b && this.f20004c == dVar.f20004c && this.f20005d == dVar.f20005d;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f20002a * 31) + this.f20003b) * 31) + this.f20004c) * 31) + this.f20005d;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("CropParam(aspectX=");
        a10.append(this.f20002a);
        a10.append(", aspectY=");
        a10.append(this.f20003b);
        a10.append(", outputX=");
        a10.append(this.f20004c);
        a10.append(", outputY=");
        return a1.b.a(a10, this.f20005d, ')');
    }
}
