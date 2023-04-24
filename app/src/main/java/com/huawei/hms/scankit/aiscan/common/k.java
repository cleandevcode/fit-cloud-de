package com.huawei.hms.scankit.aiscan.common;

import com.huawei.hms.scankit.p.C0728w;
import com.huawei.hms.scankit.util.LoadOpencvJNIUtil;

/* loaded from: classes.dex */
public class k {
    public static int a(int i10, int i11, int i12) {
        return i10 >= i11 ? i11 : i10 <= i12 ? i12 : i10;
    }

    public static C0728w a(C0728w c0728w) {
        int e10 = c0728w.e();
        int c10 = c0728w.c();
        byte[] d10 = c0728w.d();
        byte[] bArr = new byte[e10 * c10];
        for (int i10 = 0; i10 < c10; i10++) {
            for (int i11 = 0; i11 < e10; i11++) {
                bArr[(((i11 * c10) + c10) - i10) - 1] = d10[(i10 * e10) + i11];
            }
        }
        return new C0728w(new com.huawei.hms.scankit.p.B(new r(bArr, c10, e10, 0, 0, c10, e10, false)));
    }

    public static C0728w a(C0728w c0728w, float f10) {
        int i10;
        int i11;
        if (f10 == 1.0f) {
            return c0728w;
        }
        int c10 = c0728w.c();
        int e10 = c0728w.e();
        int i12 = (int) (e10 / f10);
        int i13 = (int) (c10 / f10);
        byte[] d10 = c0728w.d();
        int i14 = i12 * i13;
        byte[] bArr = new byte[i14];
        int i15 = 0;
        int i16 = 0;
        while (i16 < i14) {
            double a10 = a(i16 % i12, i12 - 1, i15) * f10;
            double a11 = a(i16 / i12, i13 - 1, i15) * f10;
            double floor = Math.floor(a10);
            int i17 = i16;
            double floor2 = Math.floor(a11);
            double d11 = a10 - floor;
            double d12 = a11 - floor2;
            int i18 = i14;
            int a12 = a((int) floor, e10 - 1, 0);
            int a13 = a((int) floor2, c10 - 1, 0);
            int i19 = a13 * e10;
            int i20 = c10;
            double d13 = 1.0d - d11;
            double d14 = 1.0d - d12;
            int i21 = a12 + 1;
            byte[] bArr2 = bArr;
            double d15 = ((d10[a(i21, i10, 0) + i19] & 255) * d11 * d14) + ((d10[i19 + a12] & 255) * d13 * d14);
            int i22 = a13 + 1;
            bArr2[i17] = (byte) (((int) (((d10[a(i21, i10, 0) + (a(i22, i11, 0) * e10)] & 255) * d11 * d12) + ((d10[(a(i22, i11, 0) * e10) + a12] & 255) * d13 * d12) + d15)) & 255);
            i16 = i17 + 1;
            i14 = i18;
            i12 = i12;
            c10 = i20;
            i13 = i13;
            bArr = bArr2;
            i15 = 0;
        }
        return new C0728w(new com.huawei.hms.scankit.p.B(new r(bArr, i12, i13, 0, 0, i12, i13, false)));
    }

    public static C0728w a(boolean z10, C0728w c0728w, float f10) {
        if (f10 == 1.0f) {
            return c0728w;
        }
        int c10 = c0728w.c();
        int e10 = c0728w.e();
        int i10 = (int) (e10 / f10);
        int i11 = (int) (c10 / f10);
        return new C0728w(new com.huawei.hms.scankit.p.B(new r(LoadOpencvJNIUtil.imageResize(c0728w.d(), c10, e10, i11, i10), i10, i11, 0, 0, i10, i11, false)));
    }
}
