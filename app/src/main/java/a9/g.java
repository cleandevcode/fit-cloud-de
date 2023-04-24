package a9;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import x8.t;

/* loaded from: classes.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        WorkSource workSource = new WorkSource();
        String str = null;
        t tVar = null;
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        int i10 = 0;
        int i11 = 102;
        boolean z10 = false;
        int i12 = 0;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j10 = j8.b.m(parcel, readInt);
                    break;
                case 2:
                    i10 = j8.b.l(parcel, readInt);
                    break;
                case 3:
                    i11 = j8.b.l(parcel, readInt);
                    break;
                case 4:
                    j11 = j8.b.m(parcel, readInt);
                    break;
                case 5:
                    z10 = j8.b.g(parcel, readInt);
                    break;
                case 6:
                    workSource = (WorkSource) j8.b.b(parcel, readInt, WorkSource.CREATOR);
                    break;
                case 7:
                    i12 = j8.b.l(parcel, readInt);
                    break;
                case '\b':
                    str = j8.b.c(parcel, readInt);
                    break;
                case '\t':
                    tVar = (t) j8.b.b(parcel, readInt, t.CREATOR);
                    break;
                default:
                    j8.b.o(parcel, readInt);
                    break;
            }
        }
        j8.b.f(parcel, p10);
        return new a(j10, i10, i11, j11, z10, i12, str, workSource, tVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
