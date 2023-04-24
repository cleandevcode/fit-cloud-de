package d9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        IBinder iBinder = null;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                j8.b.o(parcel, readInt);
            } else {
                iBinder = j8.b.k(parcel, readInt);
            }
        }
        j8.b.f(parcel, p10);
        return new m(iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new m[i10];
    }
}
