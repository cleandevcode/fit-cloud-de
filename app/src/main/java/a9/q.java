package a9;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import x8.t;

/* loaded from: classes.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        WorkSource workSource = new WorkSource();
        String str = null;
        t tVar = null;
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        long j12 = 3600000;
        long j13 = 600000;
        long j14 = 0;
        long j15 = -1;
        int i10 = 102;
        int i11 = Integer.MAX_VALUE;
        float f10 = 0.0f;
        boolean z10 = false;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = j8.b.l(parcel, readInt);
                    break;
                case 2:
                    j12 = j8.b.m(parcel, readInt);
                    break;
                case 3:
                    j13 = j8.b.m(parcel, readInt);
                    break;
                case 4:
                default:
                    j8.b.o(parcel, readInt);
                    break;
                case 5:
                    j10 = j8.b.m(parcel, readInt);
                    break;
                case 6:
                    i11 = j8.b.l(parcel, readInt);
                    break;
                case 7:
                    f10 = j8.b.i(parcel, readInt);
                    break;
                case '\b':
                    j14 = j8.b.m(parcel, readInt);
                    break;
                case '\t':
                    z10 = j8.b.g(parcel, readInt);
                    break;
                case '\n':
                    j11 = j8.b.m(parcel, readInt);
                    break;
                case 11:
                    j15 = j8.b.m(parcel, readInt);
                    break;
                case '\f':
                    i12 = j8.b.l(parcel, readInt);
                    break;
                case '\r':
                    i13 = j8.b.l(parcel, readInt);
                    break;
                case 14:
                    str = j8.b.c(parcel, readInt);
                    break;
                case 15:
                    z11 = j8.b.g(parcel, readInt);
                    break;
                case 16:
                    workSource = (WorkSource) j8.b.b(parcel, readInt, WorkSource.CREATOR);
                    break;
                case 17:
                    tVar = (t) j8.b.b(parcel, readInt, t.CREATOR);
                    break;
            }
        }
        j8.b.f(parcel, p10);
        return new LocationRequest(i10, j12, j13, j14, j10, j11, i11, f10, z10, j15, i12, i13, str, z11, workSource, tVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
