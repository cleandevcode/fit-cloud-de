package md;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a */
    public int f20457a;

    /* renamed from: b */
    public byte f20458b;

    /* renamed from: c */
    public byte f20459c;

    /* renamed from: d */
    public int f20460d;

    /* renamed from: e */
    public short f20461e;

    /* renamed from: f */
    public short f20462f;

    /* renamed from: g */
    public boolean f20463g;

    /* renamed from: h */
    public boolean f20464h;

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

    public b(int i10, int i11, byte b10, short s10, byte b11, short s11, boolean z10, boolean z11) {
        this.f20457a = i10;
        this.f20458b = b10;
        this.f20459c = b11;
        this.f20460d = i11;
        this.f20461e = s10;
        this.f20462f = s11;
        this.f20463g = z10;
        this.f20464h = z11;
    }

    public b(Parcel parcel) {
        this.f20463g = false;
        this.f20464h = false;
        this.f20457a = parcel.readInt();
        this.f20458b = parcel.readByte();
        this.f20459c = parcel.readByte();
        this.f20460d = parcel.readInt();
        this.f20461e = (short) parcel.readInt();
        this.f20462f = (short) parcel.readInt();
        this.f20463g = parcel.readByte() != 0;
        this.f20464h = parcel.readByte() != 0;
    }

    public static b a(byte[] bArr) {
        boolean z10;
        if (bArr == null || bArr.length < 9) {
            return null;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        int i10 = wrap.get() & 255;
        int i11 = wrap.getShort() & 65535;
        byte b10 = wrap.get();
        short s10 = wrap.getShort();
        byte b11 = wrap.get();
        short s11 = wrap.getShort();
        boolean z11 = true;
        if (bArr.length < 10) {
            z11 = false;
        } else if ((wrap.get() & 1) == 1) {
            z10 = true;
            return new b(i10, i11, b10, s10, b11, s11, z11, z10);
        }
        z10 = false;
        return new b(i10, i11, b10, s10, b11, s11, z11, z10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String format;
        StringBuilder a10 = android.support.v4.media.d.a("LlAptBrightnessInfo {");
        if (this.f20463g) {
            format = String.format("\n\trwsSyncEnabled=%b", Boolean.valueOf(this.f20464h));
        } else {
            format = String.format("\n\trwsSyncSupported=%b", Boolean.FALSE);
        }
        a10.append(format);
        Locale locale = Locale.US;
        a10.append(String.format(locale, "\n\tMain (L:%d,R:%d)/%d,", Byte.valueOf(this.f20458b), Byte.valueOf(this.f20459c), Integer.valueOf(this.f20457a)));
        return f3.a.a(locale, "\n\tSub (L:%d,R:%d)/%d,", new Object[]{Short.valueOf(this.f20461e), Short.valueOf(this.f20462f), Integer.valueOf(this.f20460d)}, a10, "\n}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20457a);
        parcel.writeByte(this.f20458b);
        parcel.writeByte(this.f20459c);
        parcel.writeInt(this.f20460d);
        parcel.writeInt(this.f20461e);
        parcel.writeInt(this.f20462f);
        parcel.writeByte(this.f20463g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f20464h ? (byte) 1 : (byte) 0);
    }
}
