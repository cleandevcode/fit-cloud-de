package i8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        IBinder iBinder = null;
        f8.a aVar = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
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
                                z11 = j8.b.g(parcel, readInt);
                            }
                        } else {
                            z10 = j8.b.g(parcel, readInt);
                        }
                    } else {
                        aVar = (f8.a) j8.b.b(parcel, readInt, f8.a.CREATOR);
                    }
                } else {
                    iBinder = j8.b.k(parcel, readInt);
                }
            } else {
                i10 = j8.b.l(parcel, readInt);
            }
        }
        j8.b.f(parcel, p10);
        return new j0(i10, iBinder, aVar, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new j0[i10];
    }
}
