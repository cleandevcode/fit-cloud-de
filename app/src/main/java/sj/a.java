package sj;

import jh.v;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public final int f27072a;

    /* renamed from: b */
    public final int f27073b;

    /* renamed from: c */
    public final int f27074c;

    /* renamed from: d */
    public final int f27075d;

    /* renamed from: e */
    public final int f27076e;

    /* renamed from: f */
    public final int f27077f;

    public a(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f27072a = i10;
        this.f27073b = i11;
        this.f27074c = i12;
        this.f27075d = i13;
        this.f27076e = i14;
        this.f27077f = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f27072a == aVar.f27072a && this.f27073b == aVar.f27073b && this.f27074c == aVar.f27074c && this.f27075d == aVar.f27075d && this.f27076e == aVar.f27076e && this.f27077f == aVar.f27077f;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f27073b;
        int i11 = this.f27074c;
        int i12 = this.f27075d;
        int i13 = this.f27076e;
        return this.f27077f + ((i13 + ((i12 + ((i11 + ((i10 + (this.f27072a * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder c10 = v.c("FcDialComponent(styleCurrent=");
        c10.append(this.f27072a);
        c10.append(", styleCount=");
        c10.append(this.f27073b);
        c10.append(", positionX=");
        c10.append(this.f27074c);
        c10.append(", positionY=");
        c10.append(this.f27075d);
        c10.append(", width=");
        c10.append(this.f27076e);
        c10.append(", height=");
        return v.b(c10, this.f27077f, ')');
    }
}
