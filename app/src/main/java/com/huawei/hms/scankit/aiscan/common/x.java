package com.huawei.hms.scankit.aiscan.common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.scankit.p.L;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new w();

    /* renamed from: a */
    private final String f7314a;

    /* renamed from: b */
    private final byte[] f7315b;

    /* renamed from: c */
    private final int f7316c;

    /* renamed from: d */
    private z[] f7317d;

    /* renamed from: e */
    private BarcodeFormat f7318e;

    /* renamed from: f */
    private final long f7319f;

    /* renamed from: g */
    private boolean f7320g;

    /* renamed from: h */
    private final boolean f7321h;

    /* renamed from: i */
    private final float f7322i;

    /* renamed from: j */
    private int f7323j;

    /* renamed from: k */
    private List<Rect> f7324k;

    /* renamed from: l */
    private boolean f7325l;

    /* renamed from: m */
    private int f7326m;

    /* renamed from: n */
    private List<Rect> f7327n;

    public x(float f10) {
        this.f7320g = false;
        this.f7322i = f10;
        this.f7314a = null;
        this.f7315b = new byte[0];
        this.f7316c = 0;
        this.f7317d = new z[0];
        this.f7318e = BarcodeFormat.NONE;
        this.f7319f = 0L;
        this.f7321h = false;
        this.f7323j = 0;
        this.f7325l = false;
        this.f7326m = 0;
        this.f7324k = new ArrayList();
        this.f7327n = new ArrayList();
    }

    public x(Parcel parcel) {
        this.f7320g = false;
        this.f7314a = parcel.readString();
        this.f7315b = parcel.createByteArray();
        this.f7316c = parcel.readInt();
        this.f7317d = (z[]) parcel.createTypedArray(z.CREATOR);
        this.f7318e = (BarcodeFormat) parcel.readParcelable(x.class.getClassLoader());
        this.f7319f = parcel.readLong();
        this.f7320g = parcel.readInt() == 1;
        this.f7321h = parcel.readInt() == 1;
        this.f7322i = parcel.readFloat();
        this.f7323j = parcel.readInt();
        if (this.f7324k == null) {
            this.f7324k = new ArrayList();
        }
        parcel.readList(this.f7324k, x.class.getClassLoader());
    }

    public x(String str, byte[] bArr, int i10, z[] zVarArr, BarcodeFormat barcodeFormat, long j10) {
        this.f7320g = false;
        this.f7314a = str;
        this.f7315b = bArr;
        this.f7316c = i10;
        this.f7317d = zVarArr;
        this.f7318e = barcodeFormat;
        this.f7319f = j10;
        this.f7322i = 1.0f;
        this.f7321h = false;
    }

    public x(String str, byte[] bArr, z[] zVarArr, BarcodeFormat barcodeFormat) {
        this(str, bArr, zVarArr, barcodeFormat, System.currentTimeMillis());
    }

    public x(String str, byte[] bArr, z[] zVarArr, BarcodeFormat barcodeFormat, long j10) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, zVarArr, barcodeFormat, j10);
    }

    public void a() {
        this.f7317d = new z[0];
    }

    public void a(float f10) {
        int i10;
        if (f10 >= 20.0f) {
            if (f10 < 50.0f) {
                i10 = 2;
            } else if (f10 < 90.0f) {
                i10 = 1;
            } else if (f10 >= 140.0f) {
                if (f10 < 190.0f) {
                    i10 = -1;
                } else if (f10 > 255.0f) {
                    return;
                } else {
                    i10 = -2;
                }
            }
            this.f7323j = i10;
            return;
        }
        this.f7323j = 0;
    }

    public void a(int i10) {
        this.f7326m = i10;
    }

    public void a(L l10) {
        int d10 = (int) l10.d();
        int e10 = (int) l10.e();
        this.f7324k.add(new Rect(d10, e10, ((int) l10.f()) + d10, ((int) l10.c()) + e10));
    }

    public void a(boolean z10) {
        this.f7325l = z10;
    }

    public void a(z[] zVarArr) {
        z[] zVarArr2 = this.f7317d;
        if (zVarArr2 == null) {
            this.f7317d = zVarArr;
        } else if (zVarArr == null || zVarArr.length <= 0) {
        } else {
            z[] zVarArr3 = new z[zVarArr2.length + zVarArr.length];
            System.arraycopy(zVarArr2, 0, zVarArr3, 0, zVarArr2.length);
            System.arraycopy(zVarArr, 0, zVarArr3, zVarArr2.length, zVarArr.length);
            this.f7317d = zVarArr3;
        }
    }

    public BarcodeFormat b() {
        return this.f7318e;
    }

    public void b(float f10) {
        int i10;
        if (f10 < 50.0f) {
            i10 = 2;
        } else if (f10 < 90.0f) {
            i10 = 1;
        } else if (f10 < 140.0f) {
            i10 = 0;
        } else if (f10 < 190.0f) {
            i10 = -1;
        } else if (f10 > 255.0f) {
            return;
        } else {
            i10 = -2;
        }
        this.f7326m = i10;
    }

    public void b(L l10) {
        int d10 = (int) l10.d();
        int e10 = (int) l10.e();
        this.f7327n.add(new Rect(d10, e10, ((int) l10.f()) + d10, ((int) l10.c()) + e10));
    }

    public void b(boolean z10) {
        this.f7320g = z10;
    }

    public void b(z[] zVarArr) {
        this.f7317d = zVarArr;
    }

    public List<Rect> c() {
        return this.f7324k;
    }

    public int d() {
        return this.f7323j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<Rect> e() {
        return this.f7327n;
    }

    public int f() {
        return this.f7326m;
    }

    public byte[] g() {
        return this.f7315b;
    }

    public z[] h() {
        return this.f7317d;
    }

    public String i() {
        return this.f7314a;
    }

    public float j() {
        return this.f7322i;
    }

    public boolean k() {
        return this.f7325l;
    }

    public String toString() {
        return this.f7314a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7314a);
        parcel.writeByteArray(this.f7315b);
        parcel.writeInt(this.f7316c);
        parcel.writeTypedArray(this.f7317d, i10);
        parcel.writeParcelable(this.f7318e, i10);
        parcel.writeLong(this.f7319f);
        parcel.writeInt(this.f7320g ? 1 : 0);
        parcel.writeInt(this.f7321h ? 1 : 0);
        parcel.writeFloat(this.f7322i);
        parcel.writeInt(this.f7323j);
        parcel.writeList(this.f7324k);
    }
}
