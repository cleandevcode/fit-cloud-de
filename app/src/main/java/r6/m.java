package r6;

import android.os.Parcel;
import android.os.Parcelable;
import r6.d;
import r6.i;
import r6.l;

/* loaded from: classes.dex */
public final class m extends d<m, a> {
    public static final Parcelable.Creator<m> CREATOR = new b();

    /* renamed from: g */
    public final String f25393g;

    /* renamed from: h */
    public final String f25394h;

    /* renamed from: i */
    public final i f25395i;

    /* renamed from: j */
    public final l f25396j;

    /* loaded from: classes.dex */
    public static final class a extends d.a<m, a> {

        /* renamed from: g */
        public String f25397g;

        /* renamed from: h */
        public String f25398h;

        /* renamed from: i */
        public l f25399i;
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "parcel");
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i10) {
            return new m[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Parcel parcel) {
        super(parcel);
        gm.l.f(parcel, "parcel");
        this.f25393g = parcel.readString();
        this.f25394h = parcel.readString();
        i.a a10 = new i.a().a((i) parcel.readParcelable(i.class.getClassLoader()));
        this.f25395i = (a10.f25381c == null && a10.f25380b == null) ? null : new i(a10);
        l.a aVar = new l.a();
        l lVar = (l) parcel.readParcelable(l.class.getClassLoader());
        if (lVar != null) {
            aVar.f25392b = lVar.f25390b;
        }
        this.f25396j = new l(aVar);
    }

    @Override // r6.d, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // r6.d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "out");
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f25393g);
        parcel.writeString(this.f25394h);
        parcel.writeParcelable(this.f25395i, 0);
        parcel.writeParcelable(this.f25396j, 0);
    }

    public m(a aVar) {
        super(aVar);
        this.f25393g = aVar.f25397g;
        this.f25394h = aVar.f25398h;
        this.f25395i = null;
        this.f25396j = aVar.f25399i;
    }
}
