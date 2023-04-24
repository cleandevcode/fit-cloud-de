package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d9.r;
import i8.n;
import i8.p;
import j8.a;
import java.util.Arrays;
import o8.b;

/* loaded from: classes.dex */
public final class LatLngBounds extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new r();

    /* renamed from: a */
    public final LatLng f6155a;

    /* renamed from: b */
    public final LatLng f6156b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        if (latLng == null) {
            throw new NullPointerException("southwest must not be null.");
        }
        if (latLng2 == null) {
            throw new NullPointerException("northeast must not be null.");
        }
        double d10 = latLng2.f6153a;
        double d11 = latLng.f6153a;
        p.b(d10 >= d11, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d11), Double.valueOf(latLng2.f6153a));
        this.f6155a = latLng;
        this.f6156b = latLng2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LatLngBounds) {
            LatLngBounds latLngBounds = (LatLngBounds) obj;
            return this.f6155a.equals(latLngBounds.f6155a) && this.f6156b.equals(latLngBounds.f6156b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6155a, this.f6156b});
    }

    public final String toString() {
        n.a aVar = new n.a(this);
        aVar.a(this.f6155a, "southwest");
        aVar.a(this.f6156b, "northeast");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = b.F(parcel, 20293);
        b.B(parcel, 2, this.f6155a, i10);
        b.B(parcel, 3, this.f6156b, i10);
        b.J(parcel, F);
    }
}
