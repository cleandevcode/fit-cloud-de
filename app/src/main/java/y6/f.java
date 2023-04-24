package y6;

import android.os.Parcel;
import android.os.Parcelable;
import gm.l;

/* loaded from: classes.dex */
public final class f extends y6.a implements Parcelable {
    public static final a CREATOR = new a();

    /* renamed from: c */
    public final long f31190c;

    /* renamed from: d */
    public final int f31191d;

    /* renamed from: e */
    public boolean f31192e;

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<f> {
        public static f a(Parcel parcel) {
            l.f(parcel, "parcel");
            return new f(parcel.readDouble(), parcel.readDouble(), parcel.readLong(), parcel.readInt(), parcel.readByte() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ f createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public f(double d10, double d11, long j10, int i10, boolean z10) {
        super(d10, d11);
        this.f31190c = j10;
        this.f31191d = i10;
        this.f31192e = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "parcel");
        parcel.writeDouble(this.f31164a);
        parcel.writeDouble(this.f31165b);
        parcel.writeLong(this.f31190c);
        parcel.writeInt(this.f31191d);
        parcel.writeByte(this.f31192e ? (byte) 1 : (byte) 0);
    }
}
