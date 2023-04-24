package a9;

import android.os.Parcel;
import android.os.Parcelable;
import x8.t;

/* loaded from: classes.dex */
public final class o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        String str = null;
        t tVar = null;
        long j10 = Long.MAX_VALUE;
        int i10 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            if (c10 != 5) {
                                j8.b.o(parcel, readInt);
                            } else {
                                tVar = (t) j8.b.b(parcel, readInt, t.CREATOR);
                            }
                        } else {
                            str = j8.b.c(parcel, readInt);
                        }
                    } else {
                        z10 = j8.b.g(parcel, readInt);
                    }
                } else {
                    i10 = j8.b.l(parcel, readInt);
                }
            } else {
                j10 = j8.b.m(parcel, readInt);
            }
        }
        j8.b.f(parcel, p10);
        return new b(j10, i10, z10, str, tVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
