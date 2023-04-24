package tj;

import jh.v;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public final int f28265a;

    /* renamed from: b */
    public final int f28266b;

    /* renamed from: c */
    public final byte f28267c;

    /* renamed from: d */
    public final int f28268d;

    public a(byte b10, int i10, int i11, int i12) {
        this.f28265a = i10;
        this.f28266b = i11;
        this.f28267c = b10;
        this.f28268d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f28265a == aVar.f28265a && this.f28266b == aVar.f28266b && this.f28267c == aVar.f28267c && this.f28268d == aVar.f28268d;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f28266b;
        byte b10 = this.f28267c;
        return this.f28268d + ((b10 + ((i10 + (this.f28265a * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder c10 = v.c("FcGameSpace(gameType=");
        c10.append(this.f28265a);
        c10.append(", skinNum=");
        c10.append(this.f28266b);
        c10.append(", binFlag=");
        c10.append((int) this.f28267c);
        c10.append(", spaceSize=");
        return v.b(c10, this.f28268d, ')');
    }
}
