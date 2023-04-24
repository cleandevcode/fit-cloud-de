package uc;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;
import rc.r;

/* loaded from: classes.dex */
public final class c implements Parcelable, r {

    /* renamed from: a */
    public final String f28656a;

    /* renamed from: b */
    public final String f28657b;

    /* renamed from: c */
    public final ParcelUuid f28658c;

    /* renamed from: d */
    public final ParcelUuid f28659d;

    /* renamed from: e */
    public final ParcelUuid f28660e;

    /* renamed from: f */
    public final ParcelUuid f28661f;

    /* renamed from: g */
    public final ParcelUuid f28662g;

    /* renamed from: h */
    public final byte[] f28663h;

    /* renamed from: i */
    public final byte[] f28664i;

    /* renamed from: j */
    public final int f28665j;

    /* renamed from: k */
    public final byte[] f28666k;

    /* renamed from: l */
    public final byte[] f28667l;

    /* renamed from: m */
    public static final c f28655m = new c(null, null, null, null, null, null, null, null, null, -1, null, null);
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<c> {
        /* JADX WARN: Removed duplicated region for block: B:124:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x011f  */
        @Override // android.os.Parcelable.Creator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final uc.c createFromParcel(android.os.Parcel r18) {
            /*
                Method dump skipped, instructions count: 299
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: uc.c.a.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(String str, String str2, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, ParcelUuid parcelUuid4, ParcelUuid parcelUuid5, byte[] bArr, byte[] bArr2, int i10, byte[] bArr3, byte[] bArr4) {
        this.f28656a = str;
        this.f28658c = parcelUuid;
        this.f28659d = parcelUuid2;
        this.f28660e = parcelUuid3;
        this.f28661f = parcelUuid4;
        this.f28657b = str2;
        this.f28662g = parcelUuid5;
        this.f28663h = bArr;
        this.f28664i = bArr2;
        this.f28665j = i10;
        this.f28666k = bArr3;
        this.f28667l = bArr4;
    }

    public static boolean a(byte[] bArr, byte[] bArr2) {
        return bArr == bArr2 || !(bArr == null || bArr2 == null || !Arrays.equals(bArr, bArr2));
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr3 == null || bArr3.length < bArr.length) {
            return false;
        }
        if (bArr2 == null) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                if (bArr3[i10] != bArr[i10]) {
                    return false;
                }
            }
            return true;
        }
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte b10 = bArr2[i11];
            if ((bArr3[i11] & b10) != (b10 & bArr[i11])) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(UUID uuid, UUID uuid2, UUID uuid3) {
        if (uuid2 == null) {
            return uuid.equals(uuid3);
        }
        if ((uuid.getLeastSignificantBits() & uuid2.getLeastSignificantBits()) != (uuid3.getLeastSignificantBits() & uuid2.getLeastSignificantBits())) {
            return false;
        }
        return (uuid.getMostSignificantBits() & uuid2.getMostSignificantBits()) == (uuid2.getMostSignificantBits() & uuid3.getMostSignificantBits());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return b(this.f28656a, cVar.f28656a) && b(this.f28657b, cVar.f28657b) && this.f28665j == cVar.f28665j && a(this.f28666k, cVar.f28666k) && a(this.f28667l, cVar.f28667l) && b(this.f28662g, cVar.f28662g) && a(this.f28663h, cVar.f28663h) && a(this.f28664i, cVar.f28664i) && b(this.f28658c, cVar.f28658c) && b(this.f28659d, cVar.f28659d) && b(this.f28660e, cVar.f28660e) && b(this.f28661f, cVar.f28661f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28656a, this.f28657b, Integer.valueOf(this.f28665j), Integer.valueOf(Arrays.hashCode(this.f28666k)), Integer.valueOf(Arrays.hashCode(this.f28667l)), this.f28662g, Integer.valueOf(Arrays.hashCode(this.f28663h)), Integer.valueOf(Arrays.hashCode(this.f28664i)), this.f28658c, this.f28659d, this.f28660e, this.f28661f});
    }

    public final String toString() {
        String d10;
        String d11;
        String d12;
        String d13;
        StringBuilder a10 = android.support.v4.media.d.a("BluetoothLeScanFilter [mDeviceName=");
        a10.append(this.f28656a);
        a10.append(", ");
        a10.append(pc.b.c(this.f28657b));
        a10.append(", mUuid=");
        ParcelUuid parcelUuid = this.f28658c;
        String str = null;
        if (parcelUuid == null) {
            d10 = null;
        } else {
            d10 = pc.b.d(parcelUuid.getUuid());
        }
        a10.append(d10);
        a10.append(", mUuidMask=");
        ParcelUuid parcelUuid2 = this.f28659d;
        if (parcelUuid2 == null) {
            d11 = null;
        } else {
            d11 = pc.b.d(parcelUuid2.getUuid());
        }
        a10.append(d11);
        a10.append(", mSolicitedUuid=");
        ParcelUuid parcelUuid3 = this.f28660e;
        if (parcelUuid3 == null) {
            d12 = null;
        } else {
            d12 = pc.b.d(parcelUuid3.getUuid());
        }
        a10.append(d12);
        a10.append(", mSolicitedUuidMask=");
        ParcelUuid parcelUuid4 = this.f28661f;
        if (parcelUuid4 == null) {
            d13 = null;
        } else {
            d13 = pc.b.d(parcelUuid4.getUuid());
        }
        a10.append(d13);
        a10.append(", mServiceDataUuid=");
        ParcelUuid parcelUuid5 = this.f28662g;
        if (parcelUuid5 != null) {
            str = pc.b.d(parcelUuid5.getUuid());
        }
        a10.append(str);
        a10.append(", mServiceData=");
        a10.append(Arrays.toString(this.f28663h));
        a10.append(", mServiceDataMask=");
        a10.append(Arrays.toString(this.f28664i));
        a10.append(", mManufacturerId=");
        a10.append(this.f28665j);
        a10.append(", mManufacturerData=");
        a10.append(Arrays.toString(this.f28666k));
        a10.append(", mManufacturerDataMask=");
        a10.append(Arrays.toString(this.f28667l));
        a10.append("]");
        return a10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f28656a == null ? 0 : 1);
        String str = this.f28656a;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeInt(this.f28657b == null ? 0 : 1);
        String str2 = this.f28657b;
        if (str2 != null) {
            parcel.writeString(str2);
        }
        parcel.writeInt(this.f28658c == null ? 0 : 1);
        ParcelUuid parcelUuid = this.f28658c;
        if (parcelUuid != null) {
            parcel.writeParcelable(parcelUuid, i10);
            parcel.writeInt(this.f28659d == null ? 0 : 1);
            ParcelUuid parcelUuid2 = this.f28659d;
            if (parcelUuid2 != null) {
                parcel.writeParcelable(parcelUuid2, i10);
            }
        }
        parcel.writeInt(this.f28660e == null ? 0 : 1);
        ParcelUuid parcelUuid3 = this.f28660e;
        if (parcelUuid3 != null) {
            parcel.writeParcelable(parcelUuid3, i10);
            parcel.writeInt(this.f28661f == null ? 0 : 1);
            ParcelUuid parcelUuid4 = this.f28661f;
            if (parcelUuid4 != null) {
                parcel.writeParcelable(parcelUuid4, i10);
            }
        }
        parcel.writeInt(this.f28662g == null ? 0 : 1);
        ParcelUuid parcelUuid5 = this.f28662g;
        if (parcelUuid5 != null) {
            parcel.writeParcelable(parcelUuid5, i10);
            parcel.writeInt(this.f28663h == null ? 0 : 1);
            byte[] bArr = this.f28663h;
            if (bArr != null) {
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(this.f28663h);
                parcel.writeInt(this.f28664i == null ? 0 : 1);
                byte[] bArr2 = this.f28664i;
                if (bArr2 != null) {
                    parcel.writeInt(bArr2.length);
                    parcel.writeByteArray(this.f28664i);
                }
            }
        }
        parcel.writeInt(this.f28665j);
        parcel.writeInt(this.f28666k == null ? 0 : 1);
        byte[] bArr3 = this.f28666k;
        if (bArr3 != null) {
            parcel.writeInt(bArr3.length);
            parcel.writeByteArray(this.f28666k);
            parcel.writeInt(this.f28667l != null ? 1 : 0);
            byte[] bArr4 = this.f28667l;
            if (bArr4 != null) {
                parcel.writeInt(bArr4.length);
                parcel.writeByteArray(this.f28667l);
            }
        }
    }
}
