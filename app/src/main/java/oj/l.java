package oj;

import jh.v;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a */
    public final int f23597a;

    /* renamed from: b */
    public final int f23598b;

    /* renamed from: c */
    public final int f23599c;

    public l(int i10, int i11, int i12) {
        this.f23597a = i10;
        this.f23598b = i11;
        this.f23599c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return this.f23597a == lVar.f23597a && this.f23598b == lVar.f23598b && this.f23599c == lVar.f23599c;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f23598b;
        return this.f23599c + ((i10 + (this.f23597a * 31)) * 31);
    }

    public final String toString() {
        StringBuilder c10 = v.c("FcSportRealTimeData(sportTimeId=");
        c10.append(this.f23597a);
        c10.append(", step=");
        c10.append(this.f23598b);
        c10.append(", heartRate=");
        return v.b(c10, this.f23599c, ')');
    }
}
