package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d9.s;
import j8.a;
import o8.b;

/* loaded from: classes.dex */
public final class LatLng extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new s();

    /* renamed from: a */
    public final double f6153a;

    /* renamed from: b */
    public final double f6154b;

    public LatLng(double d10, double d11) {
        this.f6154b = (d11 < -180.0d || d11 >= 180.0d) ? ((((d11 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d : d11;
        this.f6153a = Math.max(-90.0d, Math.min(90.0d, d10));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LatLng) {
            LatLng latLng = (LatLng) obj;
            return Double.doubleToLongBits(this.f6153a) == Double.doubleToLongBits(latLng.f6153a) && Double.doubleToLongBits(this.f6154b) == Double.doubleToLongBits(latLng.f6154b);
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f6153a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f6154b);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        double d10 = this.f6153a;
        double d11 = this.f6154b;
        return "lat/lng: (" + d10 + "," + d11 + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = b.F(parcel, 20293);
        double d10 = this.f6153a;
        parcel.writeInt(524290);
        parcel.writeDouble(d10);
        double d11 = this.f6154b;
        parcel.writeInt(524291);
        parcel.writeDouble(d11);
        b.J(parcel, F);
    }
}
