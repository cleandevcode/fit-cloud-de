package nd;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: a */
    public byte f22324a;

    /* renamed from: b */
    public byte f22325b;

    /* renamed from: c */
    public byte f22326c;

    /* renamed from: d */
    public byte f22327d;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i10) {
            return new g[i10];
        }
    }

    public g() {
    }

    public g(Parcel parcel) {
        this.f22324a = parcel.readByte();
        this.f22325b = parcel.readByte();
        this.f22326c = parcel.readByte();
        this.f22327d = parcel.readByte();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format("bud=0x%02X,call=0x%02X,clickType=0x%02X,mmiIndex=0x%02X\n", Byte.valueOf(this.f22324a), Byte.valueOf(this.f22325b), Byte.valueOf(this.f22326c), Byte.valueOf(this.f22327d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f22324a);
        parcel.writeByte(this.f22325b);
        parcel.writeByte(this.f22326c);
        parcel.writeByte(this.f22327d);
    }
}
