package x8;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        x xVar = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder3 = null;
        String str = null;
        int i10 = 1;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = j8.b.l(parcel, readInt);
                    break;
                case 2:
                    xVar = (x) j8.b.b(parcel, readInt, x.CREATOR);
                    break;
                case 3:
                    iBinder = j8.b.k(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) j8.b.b(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = j8.b.k(parcel, readInt);
                    break;
                case 6:
                    iBinder3 = j8.b.k(parcel, readInt);
                    break;
                case 7:
                default:
                    j8.b.o(parcel, readInt);
                    break;
                case '\b':
                    str = j8.b.c(parcel, readInt);
                    break;
            }
        }
        j8.b.f(parcel, p10);
        return new z(i10, xVar, iBinder, iBinder2, pendingIntent, iBinder3, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new z[i10];
    }
}
