package d9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p8.b;

/* loaded from: classes.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        a aVar = null;
        int i10 = 0;
        IBinder iBinder = null;
        Float f10 = null;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 2) {
                if (c10 != 3) {
                    if (c10 != 4) {
                        j8.b.o(parcel, readInt);
                    } else {
                        f10 = j8.b.j(parcel, readInt);
                    }
                } else {
                    iBinder = j8.b.k(parcel, readInt);
                }
            } else {
                i10 = j8.b.l(parcel, readInt);
            }
        }
        j8.b.f(parcel, p10);
        if (iBinder != null) {
            aVar = new a(b.a.a0(iBinder));
        }
        return new c(i10, aVar, f10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
