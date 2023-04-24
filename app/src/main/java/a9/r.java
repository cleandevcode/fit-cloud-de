package a9;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationResult;
import java.util.List;

/* loaded from: classes.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        List list = LocationResult.f6128b;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                j8.b.o(parcel, readInt);
            } else {
                list = j8.b.e(parcel, readInt, Location.CREATOR);
            }
        }
        j8.b.f(parcel, p10);
        return new LocationResult(list);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationResult[i10];
    }
}
