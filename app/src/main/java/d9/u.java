package d9;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class u implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        int i10 = 0;
        Float f10 = null;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 2) {
                if (c10 != 3) {
                    j8.b.o(parcel, readInt);
                } else {
                    f10 = j8.b.j(parcel, readInt);
                }
            } else {
                i10 = j8.b.l(parcel, readInt);
            }
        }
        j8.b.f(parcel, p10);
        return new g(i10, f10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
