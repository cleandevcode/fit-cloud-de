package bd;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a */
    public int f4146a;

    /* renamed from: b */
    public int f4147b;

    /* renamed from: c */
    public int f4148c;

    /* renamed from: d */
    public int f4149d;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(int i10, int i11, int i12, int i13) {
        this.f4146a = i10;
        this.f4147b = i11;
        this.f4148c = i12;
        this.f4149d = i13;
    }

    public b(Parcel parcel) {
        this.f4146a = parcel.readInt();
        this.f4147b = parcel.readInt();
        this.f4148c = parcel.readInt();
        this.f4149d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format(Locale.US, "Volume:  L=%d(%d), R=%d(%d)", Integer.valueOf(this.f4146a), Integer.valueOf(this.f4147b), Integer.valueOf(this.f4148c), Integer.valueOf(this.f4149d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4146a);
        parcel.writeInt(this.f4147b);
        parcel.writeInt(this.f4148c);
        parcel.writeInt(this.f4149d);
    }
}
