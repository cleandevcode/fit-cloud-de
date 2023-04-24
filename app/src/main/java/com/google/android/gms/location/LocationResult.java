package com.google.android.gms.location;

import a9.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j8.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o8.b;

/* loaded from: classes.dex */
public final class LocationResult extends a implements ReflectedParcelable {

    /* renamed from: a */
    public final List f6129a;

    /* renamed from: b */
    public static final List f6128b = Collections.emptyList();
    public static final Parcelable.Creator<LocationResult> CREATOR = new r();

    public LocationResult(List list) {
        this.f6129a = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.google.android.gms.location.LocationResult
            r1 = 0
            if (r0 == 0) goto L8c
            com.google.android.gms.location.LocationResult r10 = (com.google.android.gms.location.LocationResult) r10
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L16
            java.util.List r0 = r9.f6129a
            java.util.List r10 = r10.f6129a
            boolean r10 = r0.equals(r10)
            return r10
        L16:
            java.util.List r0 = r9.f6129a
            int r0 = r0.size()
            java.util.List r2 = r10.f6129a
            int r2 = r2.size()
            if (r0 == r2) goto L25
            return r1
        L25:
            java.util.List r0 = r9.f6129a
            java.util.Iterator r0 = r0.iterator()
            java.util.List r10 = r10.f6129a
            java.util.Iterator r10 = r10.iterator()
        L31:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L8a
            java.lang.Object r2 = r0.next()
            android.location.Location r2 = (android.location.Location) r2
            java.lang.Object r3 = r10.next()
            android.location.Location r3 = (android.location.Location) r3
            double r4 = r2.getLatitude()
            double r6 = r3.getLatitude()
            int r4 = java.lang.Double.compare(r4, r6)
            if (r4 == 0) goto L52
            return r1
        L52:
            double r4 = r2.getLongitude()
            double r6 = r3.getLongitude()
            int r4 = java.lang.Double.compare(r4, r6)
            if (r4 == 0) goto L61
            return r1
        L61:
            long r4 = r2.getTime()
            long r6 = r3.getTime()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L6e
            return r1
        L6e:
            long r4 = r2.getElapsedRealtimeNanos()
            long r6 = r3.getElapsedRealtimeNanos()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L7b
            return r1
        L7b:
            java.lang.String r2 = r2.getProvider()
            java.lang.String r3 = r3.getProvider()
            boolean r2 = i8.n.a(r2, r3)
            if (r2 != 0) goto L31
            return r1
        L8a:
            r10 = 1
            return r10
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationResult.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6129a});
    }

    public final String toString() {
        return "LocationResult".concat(String.valueOf(this.f6129a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = b.F(parcel, 20293);
        b.E(parcel, 1, this.f6129a);
        b.J(parcel, F);
    }
}
