package ze;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* loaded from: classes.dex */
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: a */
    public long f32341a;

    /* renamed from: b */
    public long f32342b;

    /* renamed from: c */
    public long f32343c;

    /* renamed from: d */
    public float f32344d;

    /* renamed from: e */
    public float f32345e;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i10) {
            return new l[i10];
        }
    }

    public l(long j10, long j11) {
        this.f32341a = j10;
        this.f32342b = j11;
        this.f32343c = 0L;
        this.f32344d = 0.0f;
        this.f32345e = 0.0f;
    }

    public l(Parcel parcel) {
        this.f32341a = parcel.readLong();
        this.f32342b = parcel.readLong();
        this.f32343c = parcel.readLong();
        this.f32344d = parcel.readFloat();
        this.f32345e = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format(Locale.US, "packetSize=%d, deltaTime=%d ms, speed=%f, realSpeed=%f", Long.valueOf(this.f32341a), Long.valueOf(this.f32343c), Float.valueOf(this.f32344d), Float.valueOf(this.f32345e));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f32341a);
        parcel.writeLong(this.f32342b);
        parcel.writeLong(this.f32343c);
        parcel.writeFloat(this.f32344d);
        parcel.writeFloat(this.f32345e);
    }
}
