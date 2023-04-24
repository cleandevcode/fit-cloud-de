package d9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes.dex */
public final class p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        float f10 = 0.0f;
        LatLng latLng = null;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 2) {
                if (c10 != 3) {
                    if (c10 != 4) {
                        if (c10 != 5) {
                            j8.b.o(parcel, readInt);
                        } else {
                            f12 = j8.b.i(parcel, readInt);
                        }
                    } else {
                        f11 = j8.b.i(parcel, readInt);
                    }
                } else {
                    f10 = j8.b.i(parcel, readInt);
                }
            } else {
                latLng = (LatLng) j8.b.b(parcel, readInt, LatLng.CREATOR);
            }
        }
        j8.b.f(parcel, p10);
        return new CameraPosition(latLng, f10, f11, f12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new CameraPosition[i10];
    }
}
