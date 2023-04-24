package ze;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: a */
    public int f32335a;

    /* renamed from: b */
    public int f32336b;

    /* renamed from: c */
    public int f32337c;

    /* renamed from: d */
    public int f32338d;

    /* renamed from: e */
    public int f32339e;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i10) {
            return new i[i10];
        }
    }

    public i(int i10, int i11, int i12, int i13) {
        this.f32335a = i10;
        this.f32337c = i11;
        this.f32338d = i12;
        this.f32339e = i13;
    }

    public i(int i10, int i11, int i12, int i13, int i14) {
        this.f32335a = 255;
        this.f32337c = i10;
        this.f32338d = i11;
        this.f32339e = i12;
        this.f32336b = i13;
    }

    public i(Parcel parcel) {
        this.f32338d = -1;
        this.f32339e = 0;
        this.f32335a = parcel.readInt();
        this.f32336b = parcel.readInt();
        this.f32337c = parcel.readInt();
        this.f32338d = parcel.readInt();
        this.f32339e = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Locale locale = Locale.US;
        sb2.append(String.format(locale, "bitNumber=%d, imageId=0x%04X", Integer.valueOf(this.f32335a), Integer.valueOf(this.f32336b)));
        sb2.append(String.format(",indication=0x%02X", Integer.valueOf(this.f32337c)));
        sb2.append(String.format(locale, ", version=0x%08X(%d), sectionSize=0x%08X(%d)", Integer.valueOf(this.f32338d), Integer.valueOf(this.f32338d), Integer.valueOf(this.f32339e), Integer.valueOf(this.f32339e)));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f32335a);
        parcel.writeInt(this.f32336b);
        parcel.writeInt(this.f32337c);
        parcel.writeInt(this.f32338d);
        parcel.writeInt(this.f32339e);
    }
}
