package a9;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        long j10 = -1;
        long j11 = -1;
        int i10 = 1;
        int i11 = 1;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            j8.b.o(parcel, readInt);
                        } else {
                            j11 = j8.b.m(parcel, readInt);
                        }
                    } else {
                        j10 = j8.b.m(parcel, readInt);
                    }
                } else {
                    i11 = j8.b.l(parcel, readInt);
                }
            } else {
                i10 = j8.b.l(parcel, readInt);
            }
        }
        j8.b.f(parcel, p10);
        return new e(i10, i11, j10, j11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
