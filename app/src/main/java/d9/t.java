package d9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes.dex */
public final class t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        float f12 = 0.0f;
        float f13 = 0.5f;
        float f14 = 0.0f;
        float f15 = 1.0f;
        float f16 = 0.0f;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    latLng = (LatLng) j8.b.b(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    str = j8.b.c(parcel, readInt);
                    break;
                case 4:
                    str2 = j8.b.c(parcel, readInt);
                    break;
                case 5:
                    iBinder = j8.b.k(parcel, readInt);
                    break;
                case 6:
                    f10 = j8.b.i(parcel, readInt);
                    break;
                case 7:
                    f11 = j8.b.i(parcel, readInt);
                    break;
                case '\b':
                    z10 = j8.b.g(parcel, readInt);
                    break;
                case '\t':
                    z11 = j8.b.g(parcel, readInt);
                    break;
                case '\n':
                    z12 = j8.b.g(parcel, readInt);
                    break;
                case 11:
                    f12 = j8.b.i(parcel, readInt);
                    break;
                case '\f':
                    f13 = j8.b.i(parcel, readInt);
                    break;
                case '\r':
                    f14 = j8.b.i(parcel, readInt);
                    break;
                case 14:
                    f15 = j8.b.i(parcel, readInt);
                    break;
                case 15:
                    f16 = j8.b.i(parcel, readInt);
                    break;
                default:
                    j8.b.o(parcel, readInt);
                    break;
            }
        }
        j8.b.f(parcel, p10);
        return new f(latLng, str, str2, iBinder, f10, f11, z10, z11, z12, f12, f13, f14, f15, f16);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new f[i10];
    }
}
