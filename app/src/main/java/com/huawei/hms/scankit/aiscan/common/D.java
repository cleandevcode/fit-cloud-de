package com.huawei.hms.scankit.aiscan.common;

import com.huawei.hms.scankit.p.C0728w;
import com.huawei.hms.scankit.p._a;
import com.huawei.hms.scankit.util.LoadOpencvJNIUtil;
import java.util.Collection;
import java.util.Map;
import java.util.Vector;

/* loaded from: classes.dex */
public class D {
    public static double a(z zVar, z zVar2) {
        return Math.atan2(zVar2.c() - zVar.c(), zVar2.b() - zVar.b());
    }

    public static byte[] a(C0728w c0728w, Map<EnumC0631d, Object> map, x xVar, int[] iArr, double[] dArr) {
        if (c0728w == null) {
            return null;
        }
        Collection collection = map != null ? (Collection) map.get(EnumC0631d.POSSIBLE_FORMATS) : null;
        if (!(collection == null || collection.contains(BarcodeFormat.QR_CODE) || collection.contains(BarcodeFormat.PDF_417)) || xVar == null || xVar.i() != null) {
            iArr[0] = c0728w.e();
            iArr[1] = c0728w.c();
            return c0728w.d();
        }
        if (collection != null) {
            collection.clear();
            EnumC0631d enumC0631d = EnumC0631d.POSSIBLE_FORMATS;
            map.remove(enumC0631d);
            collection.add(xVar.b());
            map.put(enumC0631d, collection);
        } else if (map != null) {
            EnumC0631d enumC0631d2 = EnumC0631d.POSSIBLE_FORMATS;
            map.remove(enumC0631d2);
            Vector vector = new Vector();
            vector.add(xVar.b());
            map.put(enumC0631d2, vector);
        }
        float f10 = 3.0f / _a.f7794e;
        if (f10 < 1.0f) {
            f10 = 1.0f;
        }
        dArr[5] = f10;
        return a(c0728w, xVar.h(), dArr, iArr);
    }

    private static byte[] a(C0728w c0728w, z[] zVarArr, double[] dArr, int[] iArr) {
        if (zVarArr == null) {
            iArr[0] = c0728w.e();
            iArr[1] = c0728w.c();
            return c0728w.d();
        }
        int e10 = c0728w.e();
        int i10 = e10;
        int c10 = c0728w.c();
        int i11 = 0;
        int i12 = 0;
        for (z zVar : zVarArr) {
            if (zVar != null) {
                if (((int) zVar.b()) < i10) {
                    i10 = (int) zVar.b();
                }
                if (((int) zVar.c()) < c10) {
                    c10 = (int) zVar.c();
                }
                if (((int) zVar.b()) > i11) {
                    i11 = (int) zVar.b();
                }
                if (((int) zVar.c()) > i12) {
                    i12 = (int) zVar.c();
                }
            }
        }
        return a(zVarArr, c0728w, iArr, Math.max(i11 - i10, i12 - c10), dArr);
    }

    private static byte[] a(z[] zVarArr, C0728w c0728w, int[] iArr, float f10, double[] dArr) {
        float b10 = zVarArr[0].b();
        float b11 = zVarArr[1].b();
        float b12 = zVarArr[2].b();
        float c10 = zVarArr[0].c();
        float c11 = zVarArr[1].c();
        float c12 = zVarArr[2].c();
        if (b10 < 0.0f || b11 < 0.0f || b12 < 0.0f || c10 < 0.0f || c11 < 0.0f || c12 < 0.0f || b10 > c0728w.e() || b11 > c0728w.e() || b12 > c0728w.e() || c10 > c0728w.c() || c11 > c0728w.c() || c12 > c0728w.c()) {
            iArr[0] = c0728w.e();
            iArr[1] = c0728w.c();
            throw C0628a.a();
        }
        int i10 = ((int) (c10 + c12)) / 2;
        int i11 = (int) ((((int) (b10 + b12)) / 2) - f10);
        if (i11 < 0) {
            i11 = 0;
        }
        int i12 = (int) (i10 - f10);
        if (i12 < 0) {
            i12 = 0;
        }
        int i13 = ((int) f10) * 2;
        int e10 = i11 + i13 <= c0728w.e() ? i13 : c0728w.e() - i11;
        if (i12 + i13 > c0728w.c()) {
            i13 = c0728w.c() - i12;
        }
        C0728w a10 = c0728w.a(i11, i12, e10, i13);
        double degrees = Math.toDegrees(a(zVarArr[0], zVarArr[1])) + 90.0d + dArr[0];
        dArr[0] = degrees;
        dArr[1] = i11;
        dArr[2] = i12;
        double d10 = e10;
        dArr[3] = d10;
        double d11 = i13;
        dArr[4] = d11;
        double radians = Math.toRadians(degrees);
        int abs = (int) (dArr[5] * ((Math.abs(Math.cos(radians)) * d11) + (Math.abs(Math.sin(radians)) * d10)));
        int abs2 = (int) (((Math.abs(Math.cos(radians)) * d10) + (Math.abs(Math.sin(radians)) * d11)) * dArr[5]);
        iArr[0] = abs2;
        iArr[1] = abs;
        byte[] imageRotate = LoadOpencvJNIUtil.imageRotate(a10.d(), a10.c(), a10.e(), abs, abs2, (float) dArr[0], dArr[5]);
        if (imageRotate != null) {
            return imageRotate;
        }
        iArr[0] = c0728w.e();
        iArr[1] = c0728w.c();
        return c0728w.d();
    }

    public static z[] a(z[] zVarArr, int i10, int i11, double[] dArr) {
        z zVar;
        double d10;
        z zVar2 = null;
        if (zVarArr == null) {
            return null;
        }
        double d11 = dArr[3];
        int i12 = d11 != 0.0d ? (int) d11 : i10;
        double d12 = dArr[4];
        int i13 = d12 != 0.0d ? (int) d12 : i11;
        double d13 = dArr[5];
        z[] zVarArr2 = new z[zVarArr.length];
        int i14 = 0;
        double radians = Math.toRadians(dArr[0]);
        double cos = Math.cos(radians) * d13;
        double sin = Math.sin(radians) * d13;
        double d14 = i13;
        double d15 = i12;
        double abs = (((Math.abs(cos) - cos) * d15) + ((Math.abs(sin) - sin) * d14)) / 2.0d;
        double d16 = -sin;
        double abs2 = (((Math.abs(sin) + sin) * d15) + ((Math.abs(cos) - cos) * d14)) / 2.0d;
        while (i14 < zVarArr.length) {
            if (zVarArr[i14] != null) {
                double c10 = (((abs2 - zVar.c()) * sin) + ((zVar.b() - abs) * cos)) / ((cos * cos) - (sin * d16));
                d10 = d16;
                zVarArr2[i14] = new z((float) (Math.round(c10) + ((int) dArr[1])), (float) (Math.round(sin == 0.0d ? (zVar.c() - abs2) / cos : ((zVar.b() - abs) - (cos * c10)) / sin) + ((int) dArr[2])));
                zVar2 = null;
            } else {
                d10 = d16;
                zVarArr2[i14] = zVar2;
            }
            i14++;
            d16 = d10;
        }
        return zVarArr2;
    }
}
