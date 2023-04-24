package uf;

import gm.l;
import i2.t;
import t0.e;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a */
    public final long f28710a;

    /* renamed from: b */
    public final int f28711b;

    /* renamed from: c */
    public final String f28712c;

    /* renamed from: d */
    public final float f28713d;

    /* renamed from: e */
    public final float f28714e;

    public c(long j10, int i10, String str, float f10, float f11) {
        l.f(str, "birthday");
        this.f28710a = j10;
        this.f28711b = i10;
        this.f28712c = str;
        this.f28713d = f10;
        this.f28714e = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f28710a == cVar.f28710a && this.f28711b == cVar.f28711b && l.a(this.f28712c, cVar.f28712c) && Float.compare(this.f28713d, cVar.f28713d) == 0 && Float.compare(this.f28714e, cVar.f28714e) == 0;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f28710a;
        return Float.floatToIntBits(this.f28714e) + e.b(this.f28713d, t.a(this.f28712c, ((((int) (j10 ^ (j10 >>> 32))) * 31) + this.f28711b) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("UserComputableInfo(userId=");
        a10.append(this.f28710a);
        a10.append(", sex=");
        a10.append(this.f28711b);
        a10.append(", birthday=");
        a10.append(this.f28712c);
        a10.append(", height=");
        a10.append(this.f28713d);
        a10.append(", weight=");
        a10.append(this.f28714e);
        a10.append(')');
        return a10.toString();
    }
}
