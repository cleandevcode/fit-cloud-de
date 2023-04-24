package s8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < p10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            j8.b.o(parcel, readInt);
                        } else {
                            str3 = j8.b.c(parcel, readInt);
                        }
                    } else {
                        str2 = j8.b.c(parcel, readInt);
                    }
                } else {
                    arrayList = j8.b.e(parcel, readInt, a.CREATOR);
                }
            } else {
                str = j8.b.c(parcel, readInt);
            }
        }
        j8.b.f(parcel, p10);
        return new DataType(str, str2, str3, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new DataType[i10];
    }
}
