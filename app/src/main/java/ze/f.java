package ze;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a */
    public boolean f32315a;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public f(Parcel parcel) {
        this.f32315a = parcel.readByte() != 0;
    }

    public f(boolean z10) {
        this.f32315a = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("Dev{");
        a10.append(String.format("\n\tgattCharacteristicCacheValueEnabled=%b", Boolean.valueOf(this.f32315a)));
        a10.append("\n}");
        return a10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f32315a ? (byte) 1 : (byte) 0);
    }
}
