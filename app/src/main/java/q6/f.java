package q6;

import android.os.Parcel;
import android.os.Parcelable;
import gm.l;

/* loaded from: classes.dex */
public final class f extends r6.d<f, Object> {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: g */
    public final String f24615g;

    /* renamed from: h */
    public final String f24616h;

    /* renamed from: i */
    public final String f24617i;

    /* renamed from: j */
    public final String f24618j;

    /* renamed from: k */
    public final String f24619k;

    /* renamed from: l */
    public final String f24620l;

    /* renamed from: m */
    public final String f24621m;

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
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
        l.f(parcel, "parcel");
        this.f24615g = parcel.readString();
        this.f24616h = parcel.readString();
        this.f24617i = parcel.readString();
        this.f24618j = parcel.readString();
        this.f24619k = parcel.readString();
        this.f24620l = parcel.readString();
        this.f24621m = parcel.readString();
    }

    @Override // r6.d, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // r6.d, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "out");
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f24615g);
        parcel.writeString(this.f24616h);
        parcel.writeString(this.f24617i);
        parcel.writeString(this.f24618j);
        parcel.writeString(this.f24619k);
        parcel.writeString(this.f24620l);
        parcel.writeString(this.f24621m);
    }
}
