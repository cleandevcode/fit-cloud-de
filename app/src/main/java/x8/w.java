package x8;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        int i10 = 0;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = j8.b.l(parcel, readInt);
                    break;
                case 2:
                    iBinder = j8.b.k(parcel, readInt);
                    break;
                case 3:
                    iBinder2 = j8.b.k(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) j8.b.b(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 5:
                    str = j8.b.c(parcel, readInt);
                    break;
                case 6:
                    str2 = j8.b.c(parcel, readInt);
                    break;
                default:
                    j8.b.o(parcel, readInt);
                    break;
            }
        }
        j8.b.f(parcel, p10);
        return new v(i10, iBinder, iBinder2, pendingIntent, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new v[i10];
    }
}
