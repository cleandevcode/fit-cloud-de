package x8;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.location.LocationRequest;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

@Deprecated
/* loaded from: classes.dex */
public final class x extends j8.a {
    public static final Parcelable.Creator<x> CREATOR = new y();

    /* renamed from: a */
    public LocationRequest f30448a;

    public x(LocationRequest locationRequest, ArrayList arrayList, boolean z10, boolean z11, String str, boolean z12, boolean z13, String str2, long j10) {
        WorkSource workSource;
        LocationRequest.a aVar = new LocationRequest.a(locationRequest);
        boolean z14 = false;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                workSource = null;
            } else {
                WorkSource workSource2 = new WorkSource();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i8.c cVar = (i8.c) it.next();
                    int i10 = cVar.f16605a;
                    String str3 = cVar.f16606b;
                    Method method = n8.b.f22202b;
                    if (method != null) {
                        try {
                            method.invoke(workSource2, Integer.valueOf(i10), str3 == null ? "" : str3);
                        } catch (Exception e10) {
                            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                        }
                    } else {
                        Method method2 = n8.b.f22201a;
                        if (method2 != null) {
                            method2.invoke(workSource2, Integer.valueOf(i10));
                        }
                    }
                }
                workSource = workSource2;
            }
            aVar.f6126n = workSource;
        }
        if (z10) {
            aVar.b(1);
        }
        if (z11) {
            aVar.c(2);
        }
        if (str != null) {
            if (Build.VERSION.SDK_INT < 30) {
                aVar.f6124l = str;
            }
        } else if (str2 != null && Build.VERSION.SDK_INT < 30) {
            aVar.f6124l = str2;
        }
        if (z12) {
            aVar.f6125m = true;
        }
        if (z13) {
            aVar.f6120h = true;
        }
        if (j10 != Long.MAX_VALUE) {
            i8.p.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", (j10 == -1 || j10 >= 0) ? true : true);
            aVar.f6121i = j10;
        }
        this.f30448a = aVar.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return i8.n.a(this.f30448a, ((x) obj).f30448a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30448a.hashCode();
    }

    public final String toString() {
        return this.f30448a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int F = o8.b.F(parcel, 20293);
        o8.b.B(parcel, 1, this.f30448a, i10);
        o8.b.J(parcel, F);
    }
}
