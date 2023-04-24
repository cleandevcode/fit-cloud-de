package oj;

import jh.v;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a */
    public final int f23600a;

    /* renamed from: b */
    public final int f23601b;

    public m(int i10, int i11) {
        this.f23600a = i10;
        this.f23601b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return this.f23600a == mVar.f23600a && this.f23601b == mVar.f23601b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f23601b + (this.f23600a * 31);
    }

    public final String toString() {
        StringBuilder c10 = v.c("FcSportRealTimeStatus(sportTimeId=");
        c10.append(this.f23600a);
        c10.append(", sportStatus=");
        return v.b(c10, this.f23601b, ')');
    }
}
