package nd;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0391a();

    /* renamed from: a */
    public byte f22225a;

    /* renamed from: b */
    public byte f22226b;

    /* renamed from: c */
    public int f22227c;

    /* renamed from: d */
    public int f22228d;

    /* renamed from: e */
    public byte[] f22229e;

    /* renamed from: nd.a$a */
    /* loaded from: classes.dex */
    public class C0391a implements Parcelable.Creator<a> {
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
        this.f22225a = b10;
        this.f22226b = b11;
        this.f22228d = i11;
        this.f22229e = bArr;
        d(i10);
    }

    public a(Parcel parcel) {
        this.f22225a = parcel.readByte();
        this.f22226b = parcel.readByte();
        this.f22227c = parcel.readInt();
        this.f22228d = parcel.readInt();
        this.f22229e = parcel.createByteArray();
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
        byte[] bArr = this.f22229e;
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        while (true) {
            byte[] bArr2 = this.f22229e;
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
        int i14 = this.f22227c;
        if (i14 < i12 || i14 > i13) {
            this.f22227c = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0011, code lost:
        if (r0.length > 0) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r5) {
        /*
            r4 = this;
            r0 = r5 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r1 = -1
            if (r0 == r1) goto Lc
            r4.f22227c = r5
        L8:
            r4.a()
            goto L14
        Lc:
            byte[] r0 = r4.f22229e
            if (r0 == 0) goto L14
            int r0 = r0.length
            if (r0 <= 0) goto L14
            goto L8
        L14:
            java.util.Locale r0 = java.util.Locale.US
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r4.f22227c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2 = 1
            r1[r2] = r5
            java.lang.String r5 = "activeGroupIndex=%d, groupIndex=%d"
            java.lang.String r5 = java.lang.String.format(r0, r5, r1)
            ge.b.n(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.a.d(int):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("AncGroup{");
        StringBuilder a11 = android.support.v4.media.d.a("\n\ttype=");
        a11.append((int) this.f22225a);
        a10.append(a11.toString());
        a10.append(", status=" + ((int) this.f22226b));
        a10.append(", activeGroupIndex=" + this.f22227c);
        a10.append("\n\tgroupNum=" + this.f22228d);
        a10.append(", groupScenario=" + he.a.a(this.f22229e));
        a10.append("\n}");
        return a10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.f22225a);
        parcel.writeByte(this.f22226b);
        parcel.writeInt(this.f22227c);
        parcel.writeInt(this.f22228d);
        parcel.writeByteArray(this.f22229e);
    }
}
