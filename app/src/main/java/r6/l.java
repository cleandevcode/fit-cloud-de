package r6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import r6.g;

/* loaded from: classes.dex */
public final class l extends g<l, a> {
    public static final Parcelable.Creator<l> CREATOR = new b();

    /* renamed from: b */
    public final Uri f25390b;

    /* renamed from: c */
    public final g.b f25391c;

    /* loaded from: classes.dex */
    public static final class a extends g.a<l, a> {

        /* renamed from: b */
        public Uri f25392b;
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "source");
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i10) {
            return new l[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Parcel parcel) {
        super(parcel);
        gm.l.f(parcel, "parcel");
        this.f25391c = g.b.VIDEO;
        this.f25390b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    public l(a aVar) {
        super(aVar);
        this.f25391c = g.b.VIDEO;
        this.f25390b = aVar.f25392b;
    }

    @Override // r6.g
    public final g.b a() {
        return this.f25391c;
    }

    @Override // r6.g, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // r6.g, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "out");
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f25390b, 0);
    }
}
