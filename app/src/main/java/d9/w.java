package d9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        ArrayList arrayList = null;
        c cVar = null;
        c cVar2 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        float f10 = 0.0f;
        int i10 = 0;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i11 = 0;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    arrayList = j8.b.e(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    f10 = j8.b.i(parcel, readInt);
                    break;
                case 4:
                    i10 = j8.b.l(parcel, readInt);
                    break;
                case 5:
                    f11 = j8.b.i(parcel, readInt);
                    break;
                case 6:
                    z10 = j8.b.g(parcel, readInt);
                    break;
                case 7:
                    z11 = j8.b.g(parcel, readInt);
                    break;
                case '\b':
                    z12 = j8.b.g(parcel, readInt);
                    break;
                case '\t':
                    cVar = (c) j8.b.b(parcel, readInt, c.CREATOR);
                    break;
                case '\n':
                    cVar2 = (c) j8.b.b(parcel, readInt, c.CREATOR);
                    break;
                case 11:
                    i11 = j8.b.l(parcel, readInt);
                    break;
                case '\f':
                    arrayList2 = j8.b.e(parcel, readInt, g.CREATOR);
                    break;
                case '\r':
                    arrayList3 = j8.b.e(parcel, readInt, o.CREATOR);
                    break;
                default:
                    j8.b.o(parcel, readInt);
                    break;
            }
        }
        j8.b.f(parcel, p10);
        return new i(arrayList, f10, i10, f11, z10, z11, z12, cVar, cVar2, i11, arrayList2, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new i[i10];
    }
}
