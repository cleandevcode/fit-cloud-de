package d9;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        m mVar = null;
        float f10 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 2) {
                if (c10 != 3) {
                    if (c10 != 4) {
                        if (c10 != 5) {
                            if (c10 != 6) {
                                j8.b.o(parcel, readInt);
                            } else {
                                mVar = (m) j8.b.b(parcel, readInt, m.CREATOR);
                            }
                        } else {
                            z10 = j8.b.g(parcel, readInt);
                        }
                    } else {
                        i11 = j8.b.l(parcel, readInt);
                    }
                } else {
                    i10 = j8.b.l(parcel, readInt);
                }
            } else {
                f10 = j8.b.i(parcel, readInt);
            }
        }
        j8.b.f(parcel, p10);
        return new n(f10, i10, i11, z10, mVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new n[i10];
    }
}
