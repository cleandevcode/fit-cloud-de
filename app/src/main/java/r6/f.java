package r6;

import android.os.Parcel;
import android.os.Parcelable;
import r6.d;

/* loaded from: classes.dex */
public final class f extends d<f, a> {
    public static final Parcelable.Creator<f> CREATOR = new b();

    /* renamed from: g */
    public final String f25367g;

    /* loaded from: classes.dex */
    public static final class a extends d.a<f, a> {

        /* renamed from: g */
        public String f25368g;
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            gm.l.f(parcel, "source");
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i10) {
            return new f[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Parcel parcel) {
        super(parcel);
        gm.l.f(parcel, "source");
        this.f25367g = parcel.readString();
    }

    public f(a aVar) {
        super(aVar);
        this.f25367g = aVar.f25368g;
    }

    @Override // r6.d, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // r6.d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        gm.l.f(parcel, "out");
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f25367g);
    }
}
