package com.huawei.hms.scankit.aiscan.common;

import java.util.HashMap;

/* loaded from: classes.dex */
public class C {

    /* renamed from: a */
    private static float f7174a = 2.51f;

    /* renamed from: b */
    private static float f7175b = 0.03f;

    /* renamed from: c */
    private static float f7176c = 2.43f;

    /* renamed from: d */
    private static float f7177d = 0.59f;

    /* renamed from: e */
    private static float f7178e = 0.14f;

    /* renamed from: f */
    private static HashMap<Integer, Integer> f7179f = new HashMap<>(255);

    private static int a(int i10, float f10) {
        if (f7179f.containsKey(Integer.valueOf(i10))) {
            return f7179f.get(Integer.valueOf(i10)).intValue();
        }
        float f11 = i10 / f10;
        int i11 = (int) (((((f7174a * f11) + f7175b) * f11) * f10) / ((((f7176c * f11) + f7177d) * f11) + f7178e));
        f7179f.put(Integer.valueOf(i10), Integer.valueOf(i11));
        return i11;
    }

    public static m a(m mVar) {
        int b10 = b(mVar);
        int c10 = mVar.c();
        int a10 = mVar.a();
        byte[] b11 = mVar.b();
        byte[] bArr = new byte[a10 * c10];
        for (int i10 = 0; i10 < a10; i10++) {
            for (int i11 = 0; i11 < c10; i11++) {
                int i12 = (i10 * c10) + i11;
                bArr[i12] = (byte) (a(b11[i12] & 255, b10) & 255);
            }
        }
        f7179f = new HashMap<>(255);
        return new r(bArr, c10, a10, 0, 0, c10, a10, false);
    }

    private static int b(m mVar) {
        byte[] b10 = mVar.b();
        if (b10 == null) {
            return 1;
        }
        long j10 = 0;
        int c10 = mVar.c();
        int a10 = mVar.a();
        for (int i10 = a10 / 4; i10 < (a10 * 3) / 4; i10++) {
            for (int i11 = c10 / 4; i11 < (c10 * 3) / 4; i11++) {
                j10 += b10[(i10 * c10) + i11] & 255;
            }
        }
        return (int) ((j10 / b10.length) * 4);
    }
}
