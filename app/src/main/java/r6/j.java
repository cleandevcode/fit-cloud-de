package r6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import r6.d;
import r6.i;
import ul.q;
import ul.s;

/* loaded from: classes.dex */
public final class j extends d<j, a> {
    public static final Parcelable.Creator<j> CREATOR = new b();

    /* renamed from: g */
    public final List<i> f25384g;

    /* loaded from: classes.dex */
    public static final class a extends d.a<j, a> {

        /* renamed from: g */
        public final ArrayList f25385g = new ArrayList();

        public final void a(i iVar) {
            if (iVar != null) {
                this.f25385g.add(new i(new i.a().a(iVar)));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "parcel");
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i10) {
            return new j[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Parcel parcel) {
        super(parcel);
        Iterable iterable;
        gm.l.f(parcel, "parcel");
        Parcelable[] readParcelableArray = parcel.readParcelableArray(g.class.getClassLoader());
        if (readParcelableArray == null) {
            iterable = s.f28879a;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : readParcelableArray) {
                if (parcelable instanceof g) {
                    arrayList.add(parcelable);
                }
            }
            iterable = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof i) {
                arrayList2.add(obj);
            }
        }
        this.f25384g = q.Y(arrayList2);
    }

    @Override // r6.d, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // r6.d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "out");
        super.writeToParcel(parcel, i10);
        List<i> list = this.f25384g;
        gm.l.f(list, "photos");
        Object[] array = list.toArray(new i[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        parcel.writeParcelableArray((i[]) array, i10);
    }

    public j(a aVar) {
        super(aVar);
        this.f25384g = q.Y(aVar.f25385g);
    }
}
