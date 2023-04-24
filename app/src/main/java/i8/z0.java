package i8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class z0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int n10;
        int dataPosition;
        int p10 = j8.b.p(parcel);
        r rVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 0;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    rVar = (r) j8.b.b(parcel, readInt, r.CREATOR);
                    continue;
                case 2:
                    z10 = j8.b.g(parcel, readInt);
                    continue;
                case 3:
                    z11 = j8.b.g(parcel, readInt);
                    continue;
                case 4:
                    n10 = j8.b.n(parcel, readInt);
                    dataPosition = parcel.dataPosition();
                    if (n10 == 0) {
                        iArr = null;
                        continue;
                    } else {
                        iArr = parcel.createIntArray();
                        break;
                    }
                case 5:
                    i10 = j8.b.l(parcel, readInt);
                    continue;
                case 6:
                    n10 = j8.b.n(parcel, readInt);
                    dataPosition = parcel.dataPosition();
                    if (n10 == 0) {
                        iArr2 = null;
                        continue;
                    } else {
                        iArr2 = parcel.createIntArray();
                        break;
                    }
                default:
                    j8.b.o(parcel, readInt);
                    continue;
            }
            parcel.setDataPosition(dataPosition + n10);
        }
        j8.b.f(parcel, p10);
        return new e(rVar, z10, z11, iArr, i10, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
