package qj;

import jh.v;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a */
    public final long f24936a;

    /* renamed from: b */
    public final int f24937b;

    public b(int i10, long j10) {
        this.f24936a = j10;
        this.f24937b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f24936a == bVar.f24936a && this.f24937b == bVar.f24937b;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f24936a;
        return this.f24937b + (((int) (j10 ^ (j10 >>> 32))) * 31);
    }

    public final String toString() {
        StringBuilder c10 = v.c("FcSleepRawItem(timestamp=");
        c10.append(this.f24936a);
        c10.append(", value=");
        return v.b(c10, this.f24937b, ')');
    }
}
