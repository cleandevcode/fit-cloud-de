package bd;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0057a();

    /* renamed from: a */
    public int f4138a;

    /* renamed from: b */
    public int f4139b;

    /* renamed from: c */
    public int f4140c;

    /* renamed from: d */
    public int f4141d;

    /* renamed from: e */
    public int f4142e;

    /* renamed from: f */
    public int f4143f;

    /* renamed from: g */
    public boolean f4144g;

    /* renamed from: h */
    public boolean f4145h;

    /* renamed from: bd.a$a */
    /* loaded from: classes.dex */
    public class C0057a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11) {
        this.f4138a = i10;
        this.f4139b = i12;
        this.f4140c = i14;
        this.f4141d = i11;
        this.f4142e = i13;
        this.f4143f = i15;
        this.f4144g = z10;
        this.f4145h = z11;
    }

    public a(Parcel parcel) {
        this.f4138a = parcel.readInt();
        this.f4139b = parcel.readInt();
        this.f4140c = parcel.readInt();
        this.f4141d = parcel.readInt();
        this.f4142e = parcel.readInt();
        this.f4143f = parcel.readInt();
        this.f4144g = parcel.readByte() != 0;
        this.f4145h = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String format;
        StringBuilder a10 = d.a("AptVolumeInfo {");
        boolean z10 = this.f4144g;
        Locale locale = Locale.US;
        if (z10) {
            format = String.format(locale, "\n\trwsSyncSupported=%b", Boolean.valueOf(z10));
        } else {
            format = String.format(locale, "\n\trwsSyncSupported=%b, enabled:%b", Boolean.valueOf(z10), Boolean.valueOf(this.f4145h));
        }
        a10.append(format);
        Locale locale2 = Locale.US;
        a10.append(String.format(locale2, "\n\tLevel (L:%d,R:%d)/%d,", Integer.valueOf(this.f4139b), Integer.valueOf(this.f4140c), Integer.valueOf(this.f4138a)));
        return f3.a.a(locale2, "\n\tStep (L:%d,R:%d)/%d,", new Object[]{Integer.valueOf(this.f4142e), Integer.valueOf(this.f4143f), Integer.valueOf(this.f4141d)}, a10, "\n}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4138a);
        parcel.writeInt(this.f4139b);
        parcel.writeInt(this.f4140c);
        parcel.writeInt(this.f4141d);
        parcel.writeInt(this.f4142e);
        parcel.writeInt(this.f4143f);
        parcel.writeByte(this.f4144g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4145h ? (byte) 1 : (byte) 0);
    }
}
