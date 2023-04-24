package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d9.p;
import i8.n;
import j8.a;
import java.util.Arrays;
import o8.b;

/* loaded from: classes.dex */
public final class CameraPosition extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new p();

    /* renamed from: a */
    public final LatLng f6149a;

    /* renamed from: b */
    public final float f6150b;

    /* renamed from: c */
    public final float f6151c;

    /* renamed from: d */
    public final float f6152d;

    public CameraPosition(LatLng latLng, float f10, float f11, float f12) {
        if (latLng == null) {
            throw new NullPointerException("camera target must not be null.");
        }
        i8.p.b(f11 >= 0.0f && f11 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f11));
        this.f6149a = latLng;
        this.f6150b = f10;
        this.f6151c = f11 + 0.0f;
        this.f6152d = (((double) f12) <= 0.0d ? (f12 % 360.0f) + 360.0f : f12) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CameraPosition) {
            CameraPosition cameraPosition = (CameraPosition) obj;
            return this.f6149a.equals(cameraPosition.f6149a) && Float.floatToIntBits(this.f6150b) == Float.floatToIntBits(cameraPosition.f6150b) && Float.floatToIntBits(this.f6151c) == Float.floatToIntBits(cameraPosition.f6151c) && Float.floatToIntBits(this.f6152d) == Float.floatToIntBits(cameraPosition.f6152d);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6149a, Float.valueOf(this.f6150b), Float.valueOf(this.f6151c), Float.valueOf(this.f6152d)});
    }

    public final String toString() {
        n.a aVar = new n.a(this);
        aVar.a(this.f6149a, "target");
        aVar.a(Float.valueOf(this.f6150b), "zoom");
        aVar.a(Float.valueOf(this.f6151c), "tilt");
        aVar.a(Float.valueOf(this.f6152d), "bearing");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = b.F(parcel, 20293);
        b.B(parcel, 2, this.f6149a, i10);
        b.w(parcel, 3, this.f6150b);
        b.w(parcel, 4, this.f6151c);
        b.w(parcel, 5, this.f6152d);
        b.J(parcel, F);
    }
}
