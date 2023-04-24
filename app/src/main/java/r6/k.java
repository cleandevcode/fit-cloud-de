package r6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import ul.q;

/* loaded from: classes.dex */
public final class k extends d<k, Object> {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: g */
    public final g<?, ?> f25386g;

    /* renamed from: h */
    public final i f25387h;

    /* renamed from: i */
    public final List<String> f25388i;

    /* renamed from: j */
    public final String f25389j;

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "parcel");
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i10) {
            return new k[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Parcel parcel) {
        super(parcel);
        List<String> Y;
        gm.l.f(parcel, "parcel");
        this.f25386g = (g) parcel.readParcelable(g.class.getClassLoader());
        this.f25387h = (i) parcel.readParcelable(i.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            Y = null;
        } else {
            Y = q.Y(arrayList);
        }
        this.f25388i = Y;
        this.f25389j = parcel.readString();
    }

    @Override // r6.d, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // r6.d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List<String> Y;
        gm.l.f(parcel, "out");
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f25386g, 0);
        parcel.writeParcelable(this.f25387h, 0);
        List<String> list = this.f25388i;
        if (list == null) {
            Y = null;
        } else {
            Y = q.Y(list);
        }
        parcel.writeStringList(Y);
        parcel.writeString(this.f25389j);
    }
}
