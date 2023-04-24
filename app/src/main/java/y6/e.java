package y6;

import android.os.Parcel;
import android.os.Parcelable;
import gm.l;

/* loaded from: classes.dex */
public final class e implements Parcelable {
    public static final a CREATOR = new a();

    /* renamed from: a */
    public final int f31181a;

    /* renamed from: b */
    public final boolean f31182b;

    /* renamed from: c */
    public final int f31183c;

    /* renamed from: d */
    public final float f31184d;

    /* renamed from: e */
    public final float f31185e;

    /* renamed from: f */
    public final int f31186f;

    /* renamed from: g */
    public final float f31187g;

    /* renamed from: h */
    public final Integer f31188h;

    /* renamed from: i */
    public final float f31189i;

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<e> {
        public static e a(Parcel parcel) {
            l.f(parcel, "parcel");
            int readInt = parcel.readInt();
            boolean z10 = parcel.readByte() != 0;
            int readInt2 = parcel.readInt();
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            int readInt3 = parcel.readInt();
            float readFloat3 = parcel.readFloat();
            Object readValue = parcel.readValue(Integer.TYPE.getClassLoader());
            return new e(readInt, z10, readInt2, readFloat, readFloat2, readInt3, readFloat3, readValue instanceof Integer ? (Integer) readValue : null, parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ e createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(int i10, boolean z10, int i11, float f10, float f11, int i12, float f12, Integer num, float f13) {
        this.f31181a = i10;
        this.f31182b = z10;
        this.f31183c = i11;
        this.f31184d = f10;
        this.f31185e = f11;
        this.f31186f = i12;
        this.f31187g = f12;
        this.f31188h = num;
        this.f31189i = f13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        l.f(parcel, "parcel");
        parcel.writeInt(this.f31181a);
        parcel.writeByte(this.f31182b ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f31183c);
        parcel.writeFloat(this.f31184d);
        parcel.writeFloat(this.f31185e);
        parcel.writeInt(this.f31186f);
        parcel.writeFloat(this.f31187g);
        parcel.writeValue(this.f31188h);
        parcel.writeFloat(this.f31189i);
    }
}
