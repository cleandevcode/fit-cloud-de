package x8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        Status status = null;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                j8.b.o(parcel, readInt);
            } else {
                status = (Status) j8.b.b(parcel, readInt, Status.CREATOR);
            }
        }
        j8.b.f(parcel, p10);
        return new k0(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new k0[i10];
    }
}
