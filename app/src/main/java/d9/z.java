package d9;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        n nVar = null;
        double d10 = 0.0d;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 2) {
                if (c10 != 3) {
                    j8.b.o(parcel, readInt);
                } else {
                    j8.b.r(parcel, readInt, 8);
                    d10 = parcel.readDouble();
                }
            } else {
                nVar = (n) j8.b.b(parcel, readInt, n.CREATOR);
            }
        }
        j8.b.f(parcel, p10);
        return new o(nVar, d10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new o[i10];
    }
}
