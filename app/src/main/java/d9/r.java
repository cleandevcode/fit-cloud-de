package d9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 2) {
                if (c10 != 3) {
                    j8.b.o(parcel, readInt);
                } else {
                    latLng2 = (LatLng) j8.b.b(parcel, readInt, LatLng.CREATOR);
                }
            } else {
                latLng = (LatLng) j8.b.b(parcel, readInt, LatLng.CREATOR);
            }
        }
        j8.b.f(parcel, p10);
        return new LatLngBounds(latLng, latLng2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LatLngBounds[i10];
    }
}
