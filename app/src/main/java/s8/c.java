package s8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        String str = null;
        Boolean bool = null;
        int i10 = 0;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            boolean z10 = true;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        j8.b.o(parcel, readInt);
                    } else {
                        int n10 = j8.b.n(parcel, readInt);
                        if (n10 == 0) {
                            bool = null;
                        } else {
                            j8.b.q(parcel, n10);
                            if (parcel.readInt() == 0) {
                                z10 = false;
                            }
                            bool = Boolean.valueOf(z10);
                        }
                    }
                } else {
                    i10 = j8.b.l(parcel, readInt);
                }
            } else {
                str = j8.b.c(parcel, readInt);
            }
        }
        j8.b.f(parcel, p10);
        return new a(str, i10, bool);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
