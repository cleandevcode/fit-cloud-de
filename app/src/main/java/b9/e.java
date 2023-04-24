package b9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        CameraPosition cameraPosition = null;
        Float f10 = null;
        Float f11 = null;
        LatLngBounds latLngBounds = null;
        Integer num = null;
        String str = null;
        byte b10 = -1;
        byte b11 = -1;
        int i10 = 0;
        byte b12 = -1;
        byte b13 = -1;
        byte b14 = -1;
        byte b15 = -1;
        byte b16 = -1;
        byte b17 = -1;
        byte b18 = -1;
        byte b19 = -1;
        byte b20 = -1;
        byte b21 = -1;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    b10 = j8.b.h(parcel, readInt);
                    break;
                case 3:
                    b11 = j8.b.h(parcel, readInt);
                    break;
                case 4:
                    i10 = j8.b.l(parcel, readInt);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) j8.b.b(parcel, readInt, CameraPosition.CREATOR);
                    break;
                case 6:
                    b12 = j8.b.h(parcel, readInt);
                    break;
                case 7:
                    b13 = j8.b.h(parcel, readInt);
                    break;
                case '\b':
                    b14 = j8.b.h(parcel, readInt);
                    break;
                case '\t':
                    b15 = j8.b.h(parcel, readInt);
                    break;
                case '\n':
                    b16 = j8.b.h(parcel, readInt);
                    break;
                case 11:
                    b17 = j8.b.h(parcel, readInt);
                    break;
                case '\f':
                    b18 = j8.b.h(parcel, readInt);
                    break;
                case '\r':
                default:
                    j8.b.o(parcel, readInt);
                    break;
                case 14:
                    b19 = j8.b.h(parcel, readInt);
                    break;
                case 15:
                    b20 = j8.b.h(parcel, readInt);
                    break;
                case 16:
                    f10 = j8.b.j(parcel, readInt);
                    break;
                case 17:
                    f11 = j8.b.j(parcel, readInt);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) j8.b.b(parcel, readInt, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b21 = j8.b.h(parcel, readInt);
                    break;
                case 20:
                    int n10 = j8.b.n(parcel, readInt);
                    if (n10 == 0) {
                        num = null;
                        break;
                    } else {
                        j8.b.q(parcel, n10);
                        num = Integer.valueOf(parcel.readInt());
                        break;
                    }
                case 21:
                    str = j8.b.c(parcel, readInt);
                    break;
            }
        }
        j8.b.f(parcel, p10);
        return new GoogleMapOptions(b10, b11, i10, cameraPosition, b12, b13, b14, b15, b16, b17, b18, b19, b20, f10, f11, latLngBounds, b21, num, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleMapOptions[i10];
    }
}
