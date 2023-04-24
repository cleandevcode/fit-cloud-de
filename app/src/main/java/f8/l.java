package f8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        long j10 = -1;
        int i10 = 0;
        String str = null;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        j8.b.o(parcel, readInt);
                    } else {
                        j10 = j8.b.m(parcel, readInt);
                    }
                } else {
                    i10 = j8.b.l(parcel, readInt);
                }
            } else {
                str = j8.b.c(parcel, readInt);
            }
        }
        j8.b.f(parcel, p10);
        return new c(i10, j10, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
