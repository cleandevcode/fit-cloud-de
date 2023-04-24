package com.huawei.hms.scankit.aiscan.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.scankit.p._a;

/* loaded from: classes.dex */
public class z implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR = new y();

    /* renamed from: a */
    private final float f7328a;

    /* renamed from: b */
    private final float f7329b;

    /* renamed from: c */
    private int f7330c;

    /* renamed from: d */
    private boolean f7331d;

    public z(float f10, float f11) {
        this.f7330c = 0;
        this.f7331d = false;
        this.f7328a = f10;
        this.f7329b = f11;
    }

    public z(float f10, float f11, int i10) {
        this.f7331d = false;
        this.f7328a = f10;
        this.f7329b = f11;
        this.f7330c = i10;
    }

    public z(float f10, float f11, boolean z10) {
        this.f7330c = 0;
        this.f7328a = f10;
        this.f7329b = f11;
        this.f7331d = z10;
    }

    public z(Parcel parcel) {
        this.f7330c = 0;
        this.f7331d = false;
        this.f7328a = parcel.readFloat();
        this.f7329b = parcel.readFloat();
    }

    public static float a(z zVar, z zVar2) {
        return n.a(zVar.f7328a, zVar.f7329b, zVar2.f7328a, zVar2.f7329b);
    }

    private static float a(z zVar, z zVar2, z zVar3) {
        float f10 = zVar2.f7328a;
        float f11 = zVar2.f7329b;
        return ((zVar.f7329b - f11) * (zVar3.f7328a - f10)) - ((zVar.f7328a - f10) * (zVar3.f7329b - f11));
    }

    public static void a(z[] zVarArr) {
        float a10 = a(zVarArr[0], zVarArr[1]);
        float a11 = a(zVarArr[1], zVarArr[2]);
        float a12 = a(zVarArr[0], zVarArr[2]);
        int[] a13 = a(a11, a10, a12);
        int i10 = a13[0];
        int i11 = a13[1];
        int i12 = a13[2];
        z zVar = zVarArr[i10];
        z zVar2 = zVarArr[i11];
        z zVar3 = zVarArr[i12];
        float[] fArr = {a11, a12, a10};
        if (_a.f7795f % 2 == 0) {
            int i13 = ((fArr[i11] / fArr[i10]) > 1.1d ? 1 : ((fArr[i11] / fArr[i10]) == 1.1d ? 0 : -1));
        }
        if (a(zVar2, zVar, zVar3) < 0.0f) {
            zVar2 = zVar3;
            zVar3 = zVar2;
        }
        zVarArr[0] = zVar2;
        zVarArr[1] = zVar;
        zVarArr[2] = zVar3;
    }

    private static int[] a(float f10, float f11, float f12) {
        int i10;
        int i11;
        int i12;
        int i13 = (f10 > f11 ? 1 : (f10 == f11 ? 0 : -1));
        if (i13 < 0 || f10 < f12) {
            if (f12 >= f10 && f12 >= f11) {
                i10 = 1;
                if (i13 > 0) {
                    i11 = 0;
                    i12 = 2;
                } else {
                    i11 = 2;
                }
            } else if (f10 > f10) {
                i10 = 2;
                i11 = 0;
                i12 = 1;
            } else {
                i10 = 2;
                i11 = 1;
            }
            i12 = 0;
        } else if (f11 > f12) {
            i10 = 0;
            i11 = 2;
            i12 = 1;
        } else {
            i10 = 0;
            i11 = 1;
            i12 = 2;
        }
        return new int[]{i10, i11, i12};
    }

    public int a() {
        return this.f7330c;
    }

    public final float b() {
        return this.f7328a;
    }

    public final float c() {
        return this.f7329b;
    }

    public boolean d() {
        return this.f7331d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            return ((double) Math.abs(this.f7328a - zVar.f7328a)) < 1.0E-4d && ((double) Math.abs(this.f7329b - zVar.f7329b)) < 1.0E-4d;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f7329b) + (Float.floatToIntBits(this.f7328a) * 31);
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("(");
        a10.append(this.f7328a);
        a10.append(',');
        a10.append(this.f7329b);
        a10.append(')');
        return a10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f7328a);
        parcel.writeFloat(this.f7329b);
    }
}
