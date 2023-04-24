package a9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationAvailability;

/* loaded from: classes.dex */
public final class p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        long j10 = 0;
        e[] eVarArr = null;
        int i10 = 1000;
        int i11 = 1;
        int i12 = 1;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i11 = j8.b.l(parcel, readInt);
                    break;
                case 2:
                    i12 = j8.b.l(parcel, readInt);
                    break;
                case 3:
                    j10 = j8.b.m(parcel, readInt);
                    break;
                case 4:
                    i10 = j8.b.l(parcel, readInt);
                    break;
                case 5:
                    eVarArr = (e[]) j8.b.d(parcel, readInt, e.CREATOR);
                    break;
                case 6:
                    j8.b.g(parcel, readInt);
                    break;
                default:
                    j8.b.o(parcel, readInt);
                    break;
            }
        }
        j8.b.f(parcel, p10);
        return new LocationAvailability(i10, i11, i12, j10, eVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationAvailability[i10];
    }
}
