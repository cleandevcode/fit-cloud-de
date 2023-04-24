package qd;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR;

    /* renamed from: a */
    public int f24802a;

    /* renamed from: b */
    public int f24803b;

    /* renamed from: c */
    public int f24804c;

    /* renamed from: d */
    public int f24805d;

    /* renamed from: e */
    public int f24806e;

    /* renamed from: f */
    public int f24807f;

    /* renamed from: g */
    public boolean f24808g;

    /* renamed from: h */
    public boolean f24809h;

    /* renamed from: i */
    public int f24810i;

    /* renamed from: j */
    public int f24811j;

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

    static {
        new c();
        CREATOR = new a();
    }

    public c() {
        this.f24808g = false;
        this.f24809h = false;
    }

    public c(int i10, int i11, byte b10, int i12, int i13, byte b11, boolean z10, boolean z11) {
        int i14;
        this.f24802a = i10;
        this.f24803b = i11;
        this.f24805d = i12;
        this.f24806e = i13;
        this.f24808g = z10;
        this.f24809h = z11;
        if (z10 && z11) {
            i14 = b10 != -1 ? b10 & 255 : b11 & 255;
            this.f24804c = i14;
        } else {
            b10 = b10 == -1 ? (byte) 0 : b10;
            b11 = b11 == -1 ? (byte) 0 : b11;
            this.f24804c = b10 & 255;
            i14 = b11 & 255;
        }
        this.f24807f = i14;
        this.f24811j = Math.min(i11, i13);
        this.f24810i = Math.max(i10, i12);
    }

    public c(Parcel parcel) {
        this.f24808g = false;
        this.f24809h = false;
        this.f24802a = parcel.readInt();
        this.f24803b = parcel.readInt();
        this.f24804c = parcel.readInt();
        this.f24805d = parcel.readInt();
        this.f24806e = parcel.readInt();
        this.f24807f = parcel.readInt();
        this.f24808g = parcel.readByte() != 0;
        this.f24809h = parcel.readByte() != 0;
        this.f24810i = parcel.readInt();
        this.f24811j = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder a10 = d.a("VpVolumeInfo {");
        a10.append(String.format("\n\trwsSyncSupported=%b", Boolean.valueOf(this.f24808g)));
        if (this.f24808g) {
            a10.append(String.format(Locale.US, "\n\t\trwsSyncEnabled=%b, min=%d, max=%d", Boolean.valueOf(this.f24809h), Integer.valueOf(this.f24810i), Integer.valueOf(this.f24811j)));
        }
        Locale locale = Locale.US;
        a10.append(String.format(locale, "\n\tLCH: min=%d, max=%d, cur=%d", Integer.valueOf(this.f24802a), Integer.valueOf(this.f24803b), Integer.valueOf(this.f24804c)));
        return f3.a.a(locale, "\n\tRCH: min=%d, max=%d, cur=%d", new Object[]{Integer.valueOf(this.f24805d), Integer.valueOf(this.f24806e), Integer.valueOf(this.f24807f)}, a10, "\n}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f24802a);
        parcel.writeInt(this.f24803b);
        parcel.writeInt(this.f24804c);
        parcel.writeInt(this.f24805d);
        parcel.writeInt(this.f24806e);
        parcel.writeInt(this.f24807f);
        parcel.writeByte(this.f24808g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f24809h ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f24810i);
        parcel.writeInt(this.f24811j);
    }
}
