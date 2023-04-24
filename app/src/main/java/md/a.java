package md;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0371a();

    /* renamed from: a */
    public byte f20452a;

    /* renamed from: b */
    public byte f20453b;

    /* renamed from: c */
    public int f20454c;

    /* renamed from: d */
    public int f20455d;

    /* renamed from: e */
    public byte[] f20456e;

    /* renamed from: md.a$a */
    /* loaded from: classes.dex */
    public class C0371a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(byte b10, byte b11, int i10, int i11, byte[] bArr) {
        this.f20452a = b10;
        this.f20453b = b11;
        this.f20455d = i11;
        this.f20456e = bArr;
        if (((byte) (i10 & 255)) != -1) {
            this.f20454c = i10;
        } else if (bArr == null || bArr.length <= 0) {
            return;
        }
        a();
    }

    public static a b(byte[] bArr) {
        byte[] bArr2 = null;
        if (bArr.length < 4) {
            return null;
        }
        byte b10 = bArr[0];
        byte b11 = bArr[1];
        int i10 = bArr[2] & 255;
        int i11 = bArr[3] & 255;
        int length = bArr.length - 4;
        if (length > 0) {
            bArr2 = new byte[length];
            System.arraycopy(bArr, 4, bArr2, 0, length);
        }
        return new a(b10, b11, i10, i11, bArr2);
    }

    public final void a() {
        byte[] bArr = this.f20456e;
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        while (true) {
            byte[] bArr2 = this.f20456e;
            if (i10 >= bArr2.length) {
                break;
            }
            byte b10 = bArr2[i10];
            if (b10 != -1) {
                if (b10 == -2) {
                    i11++;
                } else {
                    if (i12 < 0) {
                        i12 = i11;
                    }
                    i13 = i11;
                    i11++;
                }
            }
            i10++;
        }
        int i14 = this.f20454c;
        if (i14 < i12 || i14 > i13) {
            this.f20454c = i12;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder a10 = android.support.v4.media.d.a("type=");
        a10.append((int) this.f20452a);
        sb2.append(a10.toString());
        sb2.append(", status=" + ((int) this.f20453b));
        sb2.append(", activeGroupIndex=" + this.f20454c);
        sb2.append(", groupNum=" + this.f20455d);
        sb2.append(", groupScenario=" + he.a.a(this.f20456e));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f20452a);
        parcel.writeByte(this.f20453b);
        parcel.writeInt(this.f20454c);
        parcel.writeInt(this.f20455d);
        parcel.writeByteArray(this.f20456e);
    }

    public a(Parcel parcel) {
        this.f20452a = parcel.readByte();
        this.f20453b = parcel.readByte();
        this.f20454c = parcel.readInt();
        this.f20455d = parcel.readInt();
        this.f20456e = parcel.createByteArray();
    }
}
