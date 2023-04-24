package x8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class j0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        d0 d0Var = f0.f30411b;
        List list = g0.f30415e;
        String str = null;
        String str2 = null;
        String str3 = null;
        t tVar = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
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
                    str = j8.b.c(parcel, readInt);
                    break;
                case 4:
                    str2 = j8.b.c(parcel, readInt);
                    break;
                case 5:
                    i12 = j8.b.l(parcel, readInt);
                    break;
                case 6:
                    str3 = j8.b.c(parcel, readInt);
                    break;
                case 7:
                    tVar = (t) j8.b.b(parcel, readInt, t.CREATOR);
                    break;
                case '\b':
                    list = j8.b.e(parcel, readInt, f8.c.CREATOR);
                    break;
                default:
                    j8.b.o(parcel, readInt);
                    break;
            }
        }
        j8.b.f(parcel, p10);
        return new t(i10, i11, str, str2, str3, i12, list, tVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new t[i10];
    }
}
