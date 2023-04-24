package com.google.android.gms.location;

import a9.e;
import a9.p;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j8.a;
import java.util.Arrays;
import o8.b;

/* loaded from: classes.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR;

    /* renamed from: a */
    public final int f6093a;

    /* renamed from: b */
    public final int f6094b;

    /* renamed from: c */
    public final long f6095c;

    /* renamed from: d */
    public int f6096d;

    /* renamed from: e */
    public final e[] f6097e;

    static {
        new LocationAvailability(0, 1, 1, 0L, null);
        new LocationAvailability(1000, 1, 1, 0L, null);
        CREATOR = new p();
    }

    public LocationAvailability(int i10, int i11, int i12, long j10, e[] eVarArr) {
        this.f6096d = i10 < 1000 ? 0 : 1000;
        this.f6093a = i11;
        this.f6094b = i12;
        this.f6095c = j10;
        this.f6097e = eVarArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f6093a == locationAvailability.f6093a && this.f6094b == locationAvailability.f6094b && this.f6095c == locationAvailability.f6095c && this.f6096d == locationAvailability.f6096d && Arrays.equals(this.f6097e, locationAvailability.f6097e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6096d)});
    }

    public final String toString() {
        boolean z10;
        if (this.f6096d < 1000) {
            z10 = true;
        } else {
            z10 = false;
        }
        return "LocationAvailability[" + z10 + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = b.F(parcel, 20293);
        boolean z10 = true;
        b.z(parcel, 1, this.f6093a);
        b.z(parcel, 2, this.f6094b);
        b.A(parcel, 3, this.f6095c);
        b.z(parcel, 4, this.f6096d);
        b.D(parcel, 5, this.f6097e, i10);
        if (this.f6096d >= 1000) {
            z10 = false;
        }
        b.t(parcel, 6, z10);
        b.J(parcel, F);
    }
}
