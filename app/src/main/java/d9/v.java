package d9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        float f10 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i12 = 0;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    arrayList2 = j8.b.e(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    ClassLoader classLoader = v.class.getClassLoader();
                    int n10 = j8.b.n(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (n10 != 0) {
                        parcel.readList(arrayList, classLoader);
                        parcel.setDataPosition(dataPosition + n10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    f10 = j8.b.i(parcel, readInt);
                    break;
                case 5:
                    i10 = j8.b.l(parcel, readInt);
                    break;
                case 6:
                    i11 = j8.b.l(parcel, readInt);
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
                    i12 = j8.b.l(parcel, readInt);
                    break;
                case '\f':
                    arrayList3 = j8.b.e(parcel, readInt, g.CREATOR);
                    break;
                default:
                    j8.b.o(parcel, readInt);
                    break;
            }
        }
        j8.b.f(parcel, p10);
        return new h(arrayList2, arrayList, f10, i10, i11, f11, z10, z11, z12, i12, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
