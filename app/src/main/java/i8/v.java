package i8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        ArrayList arrayList = null;
        int i10 = 0;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    j8.b.o(parcel, readInt);
                } else {
                    arrayList = j8.b.e(parcel, readInt, m.CREATOR);
                }
            } else {
                i10 = j8.b.l(parcel, readInt);
            }
        }
        j8.b.f(parcel, p10);
        return new s(i10, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new s[i10];
    }
}
