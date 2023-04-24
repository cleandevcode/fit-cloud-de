package ce;

import android.bluetooth.BluetoothAdapter;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0071a();

    /* renamed from: a */
    public final String f4616a;

    /* renamed from: b */
    public final String f4617b;

    /* renamed from: c */
    public final int f4618c;

    /* renamed from: d */
    public final byte[] f4619d;

    /* renamed from: e */
    public final ParcelUuid f4620e;

    /* renamed from: f */
    public final ParcelUuid f4621f;

    /* renamed from: g */
    public final ParcelUuid f4622g;

    /* renamed from: h */
    public final ParcelUuid f4623h;

    /* renamed from: i */
    public final ParcelUuid f4624i;

    /* renamed from: j */
    public final byte[] f4625j;

    /* renamed from: k */
    public final byte[] f4626k;

    /* renamed from: l */
    public final int f4627l;

    /* renamed from: m */
    public final byte[] f4628m;

    /* renamed from: n */
    public final byte[] f4629n;

    /* renamed from: ce.a$a */
    /* loaded from: classes.dex */
    public class C0071a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            String str;
            b bVar = new b();
            if (parcel.readInt() == 1) {
                bVar.f4630a = parcel.readString();
            }
            if (parcel.readInt() == 1) {
                str = parcel.readString();
            } else {
                str = null;
            }
            if (parcel.readInt() == 1) {
                ParcelUuid parcelUuid = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                bVar.f4634e = parcelUuid;
                bVar.f4635f = null;
                if (parcel.readInt() == 1) {
                    ParcelUuid parcelUuid2 = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                    if (bVar.f4635f != null && bVar.f4634e == null) {
                        throw new IllegalArgumentException("uuid is null while uuidMask is not null!");
                    }
                    bVar.f4634e = parcelUuid;
                    bVar.f4635f = parcelUuid2;
                }
            }
            if (parcel.readInt() == 1) {
                ParcelUuid parcelUuid3 = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                bVar.f4636g = parcelUuid3;
                if (parcelUuid3 == null) {
                    bVar.f4637h = null;
                }
                if (parcel.readInt() == 1) {
                    ParcelUuid parcelUuid4 = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                    if (parcelUuid4 != null && parcelUuid3 == null) {
                        throw new IllegalArgumentException("SolicitationUuid is null while SolicitationUuidMask is not null!");
                    }
                    bVar.f4636g = parcelUuid3;
                    bVar.f4637h = parcelUuid4;
                }
            }
            if (parcel.readInt() == 1) {
                ParcelUuid parcelUuid5 = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                if (parcel.readInt() == 1) {
                    byte[] bArr = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr);
                    if (parcel.readInt() == 0) {
                        if (parcelUuid5 != null) {
                            bVar.f4638i = parcelUuid5;
                            bVar.f4639j = bArr;
                            bVar.f4640k = null;
                        } else {
                            throw new IllegalArgumentException("serviceDataUuid is null");
                        }
                    } else {
                        byte[] bArr2 = new byte[parcel.readInt()];
                        parcel.readByteArray(bArr2);
                        if (parcelUuid5 != null) {
                            byte[] bArr3 = bVar.f4640k;
                            if (bArr3 != null) {
                                byte[] bArr4 = bVar.f4639j;
                                if (bArr4 != null) {
                                    if (bArr4.length != bArr3.length) {
                                        throw new IllegalArgumentException("size mismatch for service data and service data mask");
                                    }
                                } else {
                                    throw new IllegalArgumentException("serviceData is null while serviceDataMask is not null");
                                }
                            }
                            bVar.f4638i = parcelUuid5;
                            bVar.f4639j = bArr;
                            bVar.f4640k = bArr2;
                        } else {
                            throw new IllegalArgumentException("serviceDataUuid is null");
                        }
                    }
                }
            }
            int readInt = parcel.readInt();
            if (parcel.readInt() == 1) {
                byte[] bArr5 = new byte[parcel.readInt()];
                parcel.readByteArray(bArr5);
                if (parcel.readInt() == 0) {
                    if (readInt >= 0) {
                        bVar.f4641l = readInt;
                        bVar.f4642m = bArr5;
                        bVar.f4643n = null;
                    } else {
                        throw new IllegalArgumentException("invalid manufacture id");
                    }
                } else {
                    byte[] bArr6 = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr6);
                    if (readInt >= 0) {
                        byte[] bArr7 = bVar.f4643n;
                        if (bArr7 != null) {
                            byte[] bArr8 = bVar.f4642m;
                            if (bArr8 != null) {
                                if (bArr8.length != bArr7.length) {
                                    throw new IllegalArgumentException("size mismatch for manufacturerData and manufacturerDataMask");
                                }
                            } else {
                                throw new IllegalArgumentException("manufacturerData is null while manufacturerDataMask is not null");
                            }
                        }
                        bVar.f4641l = readInt;
                        bVar.f4642m = bArr5;
                        bVar.f4643n = bArr6;
                    } else {
                        throw new IllegalArgumentException("invalid manufacture id");
                    }
                }
            }
            if (str != null) {
                int readInt2 = parcel.readInt();
                if (parcel.readInt() == 1) {
                    byte[] bArr9 = new byte[16];
                    parcel.readByteArray(bArr9);
                    bVar.a(str, readInt2, bArr9);
                } else {
                    bVar.a(str, readInt2, null);
                }
            }
            return bVar.b();
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public String f4630a;

        /* renamed from: b */
        public String f4631b;

        /* renamed from: d */
        public byte[] f4633d;

        /* renamed from: e */
        public ParcelUuid f4634e;

        /* renamed from: f */
        public ParcelUuid f4635f;

        /* renamed from: g */
        public ParcelUuid f4636g;

        /* renamed from: h */
        public ParcelUuid f4637h;

        /* renamed from: i */
        public ParcelUuid f4638i;

        /* renamed from: j */
        public byte[] f4639j;

        /* renamed from: k */
        public byte[] f4640k;

        /* renamed from: m */
        public byte[] f4642m;

        /* renamed from: n */
        public byte[] f4643n;

        /* renamed from: c */
        public int f4632c = 0;

        /* renamed from: l */
        public int f4641l = -1;

        public final void a(String str, int i10, byte[] bArr) {
            boolean z10;
            if (BluetoothAdapter.checkBluetoothAddress(str)) {
                if (i10 >= 0) {
                    boolean z11 = true;
                    if (i10 <= 1) {
                        if (i10 == 1 && bArr != null) {
                            if (str != null && str.length() != 0) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (!z10) {
                                Objects.requireNonNull(str);
                                if (!((BluetoothAdapter.checkBluetoothAddress(str) && (Integer.parseInt(str.split(":")[0], 16) & 192) == 192) ? false : false)) {
                                    throw new IllegalArgumentException("Invalid combination: IRK requires either a PUBLIC or RANDOM (STATIC) Address");
                                }
                            }
                        }
                        this.f4631b = str;
                        this.f4632c = i10;
                        this.f4633d = bArr;
                        return;
                    }
                }
                throw new IllegalArgumentException("'addressType' is invalid!");
            }
            throw new IllegalArgumentException("invalid device address " + str);
        }

        public final a b() {
            return new a(this.f4630a, this.f4631b, this.f4634e, this.f4635f, this.f4636g, this.f4637h, this.f4638i, this.f4639j, this.f4640k, this.f4641l, this.f4642m, this.f4643n, this.f4632c, this.f4633d);
        }
    }

    public a(String str, String str2, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, ParcelUuid parcelUuid4, ParcelUuid parcelUuid5, byte[] bArr, byte[] bArr2, int i10, byte[] bArr3, byte[] bArr4, int i11, byte[] bArr5) {
        this.f4616a = str;
        this.f4620e = parcelUuid;
        this.f4621f = parcelUuid2;
        this.f4622g = parcelUuid3;
        this.f4623h = parcelUuid4;
        this.f4617b = str2;
        this.f4624i = parcelUuid5;
        this.f4625j = bArr;
        this.f4626k = bArr2;
        this.f4627l = i10;
        this.f4628m = bArr3;
        this.f4629n = bArr4;
        this.f4618c = i11;
        this.f4619d = bArr5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.f4616a, aVar.f4616a) && Objects.equals(this.f4617b, aVar.f4617b) && this.f4627l == aVar.f4627l && Objects.deepEquals(this.f4628m, aVar.f4628m) && Objects.deepEquals(this.f4629n, aVar.f4629n) && Objects.equals(this.f4624i, aVar.f4624i) && Objects.deepEquals(this.f4625j, aVar.f4625j) && Objects.deepEquals(this.f4626k, aVar.f4626k) && Objects.equals(this.f4620e, aVar.f4620e) && Objects.equals(this.f4621f, aVar.f4621f) && Objects.equals(this.f4622g, aVar.f4622g) && Objects.equals(this.f4623h, aVar.f4623h);
    }

    public final int hashCode() {
        return Objects.hash(this.f4616a, this.f4617b, Integer.valueOf(this.f4627l), Integer.valueOf(Arrays.hashCode(this.f4628m)), Integer.valueOf(Arrays.hashCode(this.f4629n)), this.f4624i, Integer.valueOf(Arrays.hashCode(this.f4625j)), Integer.valueOf(Arrays.hashCode(this.f4626k)), this.f4620e, this.f4621f, this.f4622g, this.f4623h);
    }

    public final String toString() {
        return "BluetoothLeScanFilter [mDeviceName=" + this.f4616a + ", mDeviceAddress=" + p.b.m(this.f4617b) + ", mUuid=" + this.f4620e + ", mUuidMask=" + this.f4621f + ", mServiceSolicitationUuid=" + this.f4622g + ", mServiceSolicitationUuidMask=" + this.f4623h + ", mServiceDataUuid=" + Objects.toString(this.f4624i) + ", mServiceData=" + Arrays.toString(this.f4625j) + ", mServiceDataMask=" + Arrays.toString(this.f4626k) + ", mManufacturerId=" + this.f4627l + ", mManufacturerData=" + Arrays.toString(this.f4628m) + ", mManufacturerDataMask=" + Arrays.toString(this.f4629n) + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4616a == null ? 0 : 1);
        String str = this.f4616a;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeInt(this.f4617b == null ? 0 : 1);
        String str2 = this.f4617b;
        if (str2 != null) {
            parcel.writeString(str2);
        }
        parcel.writeInt(this.f4620e == null ? 0 : 1);
        ParcelUuid parcelUuid = this.f4620e;
        if (parcelUuid != null) {
            parcel.writeParcelable(parcelUuid, i10);
            parcel.writeInt(this.f4621f == null ? 0 : 1);
            ParcelUuid parcelUuid2 = this.f4621f;
            if (parcelUuid2 != null) {
                parcel.writeParcelable(parcelUuid2, i10);
            }
        }
        parcel.writeInt(this.f4622g == null ? 0 : 1);
        ParcelUuid parcelUuid3 = this.f4622g;
        if (parcelUuid3 != null) {
            parcel.writeParcelable(parcelUuid3, i10);
            parcel.writeInt(this.f4623h == null ? 0 : 1);
            ParcelUuid parcelUuid4 = this.f4623h;
            if (parcelUuid4 != null) {
                parcel.writeParcelable(parcelUuid4, i10);
            }
        }
        parcel.writeInt(this.f4624i == null ? 0 : 1);
        ParcelUuid parcelUuid5 = this.f4624i;
        if (parcelUuid5 != null) {
            parcel.writeParcelable(parcelUuid5, i10);
            parcel.writeInt(this.f4625j == null ? 0 : 1);
            byte[] bArr = this.f4625j;
            if (bArr != null) {
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(this.f4625j);
                parcel.writeInt(this.f4626k == null ? 0 : 1);
                byte[] bArr2 = this.f4626k;
                if (bArr2 != null) {
                    parcel.writeInt(bArr2.length);
                    parcel.writeByteArray(this.f4626k);
                }
            }
        }
        parcel.writeInt(this.f4627l);
        parcel.writeInt(this.f4628m == null ? 0 : 1);
        byte[] bArr3 = this.f4628m;
        if (bArr3 != null) {
            parcel.writeInt(bArr3.length);
            parcel.writeByteArray(this.f4628m);
            parcel.writeInt(this.f4629n == null ? 0 : 1);
            byte[] bArr4 = this.f4629n;
            if (bArr4 != null) {
                parcel.writeInt(bArr4.length);
                parcel.writeByteArray(this.f4629n);
            }
        }
        if (this.f4617b != null) {
            parcel.writeInt(this.f4618c);
            parcel.writeInt(this.f4619d != null ? 1 : 0);
            byte[] bArr5 = this.f4619d;
            if (bArr5 != null) {
                parcel.writeByteArray(bArr5);
            }
        }
    }
}
