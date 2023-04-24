package com.topstep.fitcloud.pro.model.data;

import a1.b;
import android.support.v4.media.d;
import kotlin.Metadata;
import mf.u;

@Metadata
@u(generateAdapter = true)
/* loaded from: classes2.dex */
public final class SportLatLng {

    /* renamed from: a */
    public final double f9618a;

    /* renamed from: b */
    public final double f9619b;

    /* renamed from: c */
    public final long f9620c;

    /* renamed from: d */
    public final int f9621d;

    /* renamed from: e */
    public final int f9622e;

    public SportLatLng(double d10, double d11, long j10, int i10, int i11) {
        this.f9618a = d10;
        this.f9619b = d11;
        this.f9620c = j10;
        this.f9621d = i10;
        this.f9622e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SportLatLng) {
            SportLatLng sportLatLng = (SportLatLng) obj;
            return Double.compare(this.f9618a, sportLatLng.f9618a) == 0 && Double.compare(this.f9619b, sportLatLng.f9619b) == 0 && this.f9620c == sportLatLng.f9620c && this.f9621d == sportLatLng.f9621d && this.f9622e == sportLatLng.f9622e;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f9618a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f9619b);
        long j10 = this.f9620c;
        return (((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f9621d) * 31) + this.f9622e;
    }

    public final String toString() {
        StringBuilder a10 = d.a("SportLatLng(lat=");
        a10.append(this.f9618a);
        a10.append(", lng=");
        a10.append(this.f9619b);
        a10.append(", timestamp=");
        a10.append(this.f9620c);
        a10.append(", duration=");
        a10.append(this.f9621d);
        a10.append(", isRestart=");
        return b.a(a10, this.f9622e, ')');
    }
}
