package uj;

import jh.v;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public final int f28837a;

    /* renamed from: b */
    public final boolean f28838b;

    /* renamed from: c */
    public final byte f28839c;

    public a(int i10, boolean z10, byte b10) {
        this.f28837a = i10;
        this.f28838b = z10;
        this.f28839c = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f28837a == aVar.f28837a && this.f28838b == aVar.f28838b && this.f28839c == aVar.f28839c;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i10 = this.f28837a * 31;
        boolean z10 = this.f28838b;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        return this.f28839c + ((i10 + i11) * 31);
    }

    public final String toString() {
        StringBuilder c10 = v.c("FcSportSpace(sportUiType=");
        c10.append(this.f28837a);
        c10.append(", isPushable=");
        c10.append(this.f28838b);
        c10.append(", binFlag=");
        return v.b(c10, this.f28839c, ')');
    }
}
