package x8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        LocationRequest locationRequest = null;
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        long j10 = Long.MAX_VALUE;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 5) {
                    switch (c10) {
                        case '\b':
                            z10 = j8.b.g(parcel, readInt);
                            continue;
                        case '\t':
                            z11 = j8.b.g(parcel, readInt);
                            continue;
                        case '\n':
                            str = j8.b.c(parcel, readInt);
                            continue;
                        case 11:
                            z12 = j8.b.g(parcel, readInt);
                            continue;
                        case '\f':
                            z13 = j8.b.g(parcel, readInt);
                            continue;
                        case '\r':
                            str2 = j8.b.c(parcel, readInt);
                            continue;
                        case 14:
                            j10 = j8.b.m(parcel, readInt);
                            continue;
                        default:
                            j8.b.o(parcel, readInt);
                            continue;
                    }
                } else {
                    arrayList = j8.b.e(parcel, readInt, i8.c.CREATOR);
                }
            } else {
                locationRequest = (LocationRequest) j8.b.b(parcel, readInt, LocationRequest.CREATOR);
            }
        }
        j8.b.f(parcel, p10);
        return new x(locationRequest, arrayList, z10, z11, str, z12, z13, str2, j10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new x[i10];
    }
}
