package d9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes.dex */
public final class s implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        double d10 = 0.0d;
        double d11 = 0.0d;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 2) {
                if (c10 != 3) {
                    j8.b.o(parcel, readInt);
                } else {
                    j8.b.r(parcel, readInt, 8);
                    d11 = parcel.readDouble();
                }
            } else {
                j8.b.r(parcel, readInt, 8);
                d10 = parcel.readDouble();
            }
        }
        j8.b.f(parcel, p10);
        return new LatLng(d10, d11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LatLng[i10];
    }
}
