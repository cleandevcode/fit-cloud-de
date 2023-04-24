package md;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a */
    public byte f20465a;

    /* renamed from: b */
    public byte f20466b;

    /* renamed from: c */
    public short f20467c;

    /* renamed from: d */
    public short f20468d;

    /* renamed from: e */
    public boolean f20469e;

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

    public c(byte b10, byte b11, short s10, short s11, boolean z10) {
        this.f20465a = b10;
        this.f20466b = b11;
        this.f20467c = s10;
        this.f20468d = s11;
        this.f20469e = z10;
    }

    public c(Parcel parcel) {
        this.f20469e = false;
        this.f20465a = parcel.readByte();
        this.f20466b = parcel.readByte();
        this.f20467c = (short) parcel.readInt();
        this.f20468d = (short) parcel.readInt();
        this.f20469e = parcel.readByte() != 0;
    }

    public static c a(byte[] bArr) {
        if (bArr == null || bArr.length < 6) {
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        boolean z10 = true;
        return new c(wrap.get(), wrap.get(), wrap.getShort(), wrap.getShort(), (bArr.length < 7 || (wrap.get() & 1) != 1) ? false : false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return f3.a.a(Locale.US, "\n\nL=%d(%d), R=%d(%d), rwsSyncEnabled=%b", new Object[]{Byte.valueOf(this.f20465a), Short.valueOf(this.f20467c), Byte.valueOf(this.f20466b), Short.valueOf(this.f20468d), Boolean.valueOf(this.f20469e)}, android.support.v4.media.d.a("LlAptBrightnessStatus{"), "\n}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f20465a);
        parcel.writeByte(this.f20466b);
        parcel.writeInt(this.f20467c);
        parcel.writeInt(this.f20468d);
        parcel.writeByte(this.f20469e ? (byte) 1 : (byte) 0);
    }
}
