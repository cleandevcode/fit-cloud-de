package g8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        String str = null;
        int i10 = 0;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    j8.b.o(parcel, readInt);
                } else {
                    str = j8.b.c(parcel, readInt);
                }
            } else {
                i10 = j8.b.l(parcel, readInt);
            }
        }
        j8.b.f(parcel, p10);
        return new Scope(i10, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Scope[i10];
    }
}
