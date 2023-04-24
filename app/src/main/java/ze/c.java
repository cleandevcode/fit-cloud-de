package ze;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a */
    public int f32246a;

    /* renamed from: b */
    public int f32247b;

    /* renamed from: c */
    public int f32248c;

    /* renamed from: d */
    public int f32249d;

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

    public c(int i10, int i11, int i12, int i13) {
        this.f32246a = i10;
        this.f32247b = i11;
        this.f32248c = i12;
        this.f32249d = i13;
    }

    public c(Parcel parcel) {
        this.f32246a = 17;
        this.f32247b = 6;
        this.f32248c = 0;
        this.f32249d = 500;
        this.f32246a = parcel.readInt();
        this.f32247b = parcel.readInt();
        this.f32248c = parcel.readInt();
        this.f32249d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return f3.a.a(Locale.US, "\tmaxInterval=%d(0x%04X),minInterval=%d(0x%04X),latency=%d(0x%04X),timeout=%d(0x%04X),\n", new Object[]{Integer.valueOf(this.f32246a), Integer.valueOf(this.f32246a), Integer.valueOf(this.f32247b), Integer.valueOf(this.f32247b), Integer.valueOf(this.f32248c), Integer.valueOf(this.f32248c), Integer.valueOf(this.f32249d), Integer.valueOf(this.f32249d)}, android.support.v4.media.d.a("ConnectionParameters{\n"), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f32246a);
        parcel.writeInt(this.f32247b);
        parcel.writeInt(this.f32248c);
        parcel.writeInt(this.f32249d);
    }
}
