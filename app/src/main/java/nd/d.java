package nd;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a */
    public byte f22278a;

    /* renamed from: b */
    public byte f22279b;

    /* renamed from: c */
    public byte f22280c;

    /* renamed from: d */
    public byte f22281d;

    /* renamed from: e */
    public byte f22282e;

    /* renamed from: f */
    public int f22283f;

    /* renamed from: g */
    public byte f22284g;

    /* renamed from: h */
    public byte f22285h;

    /* renamed from: i */
    public int f22286i;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public d() {
        this.f22278a = (byte) 0;
        this.f22279b = (byte) 0;
        this.f22280c = (byte) 0;
        this.f22281d = (byte) 0;
        this.f22282e = (byte) 0;
        this.f22283f = 0;
        this.f22284g = (byte) 0;
        this.f22285h = (byte) 0;
        this.f22286i = 0;
    }

    public d(Parcel parcel) {
        this.f22278a = (byte) 0;
        this.f22279b = (byte) 0;
        this.f22280c = (byte) 0;
        this.f22281d = (byte) 0;
        this.f22282e = (byte) 0;
        this.f22283f = 0;
        this.f22284g = (byte) 0;
        this.f22285h = (byte) 0;
        this.f22286i = 0;
        this.f22278a = parcel.readByte();
        this.f22279b = parcel.readByte();
        this.f22280c = parcel.readByte();
        this.f22281d = parcel.readByte();
        this.f22282e = parcel.readByte();
        this.f22283f = parcel.readInt();
        this.f22284g = parcel.readByte();
        this.f22285h = parcel.readByte();
        this.f22286i = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f22278a);
        parcel.writeByte(this.f22279b);
        parcel.writeByte(this.f22280c);
        parcel.writeByte(this.f22281d);
        parcel.writeByte(this.f22282e);
        parcel.writeInt(this.f22283f);
        parcel.writeByte(this.f22284g);
        parcel.writeByte(this.f22285h);
        parcel.writeInt(this.f22286i);
    }
}
