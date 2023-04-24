package nd;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a */
    public byte f22270a;

    /* renamed from: b */
    public byte f22271b;

    /* renamed from: c */
    public byte f22272c;

    /* renamed from: d */
    public int f22273d;

    /* renamed from: e */
    public byte f22274e;

    /* renamed from: f */
    public int f22275f;

    /* renamed from: g */
    public boolean f22276g;

    /* renamed from: h */
    public int f22277h;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c() {
        this.f22270a = (byte) 0;
        this.f22271b = (byte) 1;
        this.f22272c = (byte) 0;
        this.f22274e = (byte) 0;
        this.f22276g = false;
    }

    public c(byte b10, byte b11, byte b12, byte b13, int i10, int i11, int i12, boolean z10) {
        this.f22270a = b10;
        this.f22271b = b11;
        this.f22272c = b12;
        this.f22273d = i10;
        this.f22274e = b13;
        this.f22275f = i11;
        this.f22276g = z10;
        this.f22277h = i12;
    }

    public c(Parcel parcel) {
        this.f22270a = (byte) 0;
        this.f22271b = (byte) 1;
        this.f22272c = (byte) 0;
        this.f22274e = (byte) 0;
        this.f22276g = false;
        this.f22270a = parcel.readByte();
        this.f22271b = parcel.readByte();
        this.f22272c = parcel.readByte();
        this.f22273d = parcel.readInt();
        this.f22274e = parcel.readByte();
        this.f22275f = parcel.readInt();
        this.f22276g = parcel.readByte() != 0;
        this.f22277h = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f22270a);
        parcel.writeByte(this.f22271b);
        parcel.writeByte(this.f22272c);
        parcel.writeInt(this.f22273d);
        parcel.writeByte(this.f22274e);
        parcel.writeInt(this.f22275f);
        parcel.writeByte(this.f22276g ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f22277h);
    }
}
