package f9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int p10 = j8.b.p(parcel);
        String str = null;
        ArrayList<String> arrayList = null;
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
                int n10 = j8.b.n(parcel, readInt);
                int dataPosition = parcel.dataPosition();
                if (n10 == 0) {
                    arrayList = null;
                } else {
                    ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                    parcel.setDataPosition(dataPosition + n10);
                    arrayList = createStringArrayList;
                }
            }
        }
        j8.b.f(parcel, p10);
        return new g(str, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
