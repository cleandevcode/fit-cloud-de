package f9;

import android.os.Parcel;
import android.os.Parcelable;
import i8.j0;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        f8.a aVar = null;
        j0 j0Var = null;
        int i10 = 0;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        j8.b.o(parcel, readInt);
                    } else {
                        j0Var = (j0) j8.b.b(parcel, readInt, j0.CREATOR);
                    }
                } else {
                    aVar = (f8.a) j8.b.b(parcel, readInt, f8.a.CREATOR);
                }
            } else {
                i10 = j8.b.l(parcel, readInt);
            }
        }
        j8.b.f(parcel, p10);
        return new k(i10, aVar, j0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new k[i10];
    }
}
