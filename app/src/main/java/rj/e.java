package rj;

import jh.v;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a */
    public final int f25772a;

    /* renamed from: b */
    public final int f25773b;

    /* renamed from: c */
    public final int f25774c;

    public e(int i10, int i11, int i12) {
        this.f25772a = i10;
        this.f25773b = i11;
        this.f25774c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f25772a == eVar.f25772a && this.f25773b == eVar.f25773b && this.f25774c == eVar.f25774c;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f25773b;
        return this.f25774c + ((i10 + (this.f25772a * 31)) * 31);
    }

    public final String toString() {
        StringBuilder c10 = v.c("FcUiInfo(uiNum=");
        c10.append(this.f25772a);
        c10.append(", uiSerial=");
        c10.append(this.f25773b);
        c10.append(", styleIndex=");
        return v.b(c10, this.f25774c, ')');
    }
}
