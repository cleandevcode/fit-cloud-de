package i8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class y0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        Bundle bundle = null;
        f8.c[] cVarArr = null;
        e eVar = null;
        int i10 = 0;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            j8.b.o(parcel, readInt);
                        } else {
                            eVar = (e) j8.b.b(parcel, readInt, e.CREATOR);
                        }
                    } else {
                        i10 = j8.b.l(parcel, readInt);
                    }
                } else {
                    cVarArr = (f8.c[]) j8.b.d(parcel, readInt, f8.c.CREATOR);
                }
            } else {
                bundle = j8.b.a(parcel, readInt);
            }
        }
        j8.b.f(parcel, p10);
        return new x0(bundle, cVarArr, i10, eVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new x0[i10];
    }
}
