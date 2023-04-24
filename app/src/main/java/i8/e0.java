package i8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = j8.b.l(parcel, readInt);
                    break;
                case 2:
                    i11 = j8.b.l(parcel, readInt);
                    break;
                case 3:
                    i12 = j8.b.l(parcel, readInt);
                    break;
                case 4:
                    j10 = j8.b.m(parcel, readInt);
                    break;
                case 5:
                    j11 = j8.b.m(parcel, readInt);
                    break;
                case 6:
                    str = j8.b.c(parcel, readInt);
                    break;
                case 7:
                    str2 = j8.b.c(parcel, readInt);
                    break;
                case '\b':
                    i13 = j8.b.l(parcel, readInt);
                    break;
                case '\t':
                    i14 = j8.b.l(parcel, readInt);
                    break;
                default:
                    j8.b.o(parcel, readInt);
                    break;
            }
        }
        j8.b.f(parcel, p10);
        return new m(i10, i11, i12, j10, j11, str, str2, i13, i14);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new m[i10];
    }
}
