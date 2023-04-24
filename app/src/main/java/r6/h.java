package r6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import ul.s;

/* loaded from: classes.dex */
public final class h extends d<h, Object> {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: g */
    public final List<g<?, ?>> f25374g;

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "source");
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i10) {
            return new h[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Parcel parcel) {
        super(parcel);
        List list;
        gm.l.f(parcel, "source");
        Parcelable[] readParcelableArray = parcel.readParcelableArray(g.class.getClassLoader());
        if (readParcelableArray == null) {
            list = null;
        } else {
            List arrayList = new ArrayList();
            for (Parcelable parcelable : readParcelableArray) {
                g gVar = (g) parcelable;
                if (gVar != null) {
                    arrayList.add(gVar);
                }
            }
            list = arrayList;
        }
        this.f25374g = list == null ? s.f28879a : list;
    }

    @Override // r6.d, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // r6.d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "out");
        super.writeToParcel(parcel, i10);
        Object[] array = this.f25374g.toArray(new g[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        parcel.writeParcelableArray((Parcelable[]) array, i10);
    }
}
