package g8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        f8.a aVar = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            if (c10 != 1000) {
                                j8.b.o(parcel, readInt);
                            } else {
                                i10 = j8.b.l(parcel, readInt);
                            }
                        } else {
                            aVar = (f8.a) j8.b.b(parcel, readInt, f8.a.CREATOR);
                        }
                    } else {
                        pendingIntent = (PendingIntent) j8.b.b(parcel, readInt, PendingIntent.CREATOR);
                    }
                } else {
                    str = j8.b.c(parcel, readInt);
                }
            } else {
                i11 = j8.b.l(parcel, readInt);
            }
        }
        j8.b.f(parcel, p10);
        return new Status(i10, i11, str, pendingIntent, aVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
