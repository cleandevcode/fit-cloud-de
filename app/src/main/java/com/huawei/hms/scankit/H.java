package com.huawei.hms.scankit;

import android.graphics.Rect;
import com.huawei.hms.scankit.p._a;

/* loaded from: classes.dex */
public class H {
    public static float a(int i10, int i11, com.huawei.hms.scankit.aiscan.common.z[] zVarArr) {
        float abs;
        float f10;
        float abs2;
        float f11;
        float f12 = 1.0f;
        if (zVarArr.length < 3) {
            return 1.0f;
        }
        int i12 = 0;
        for (com.huawei.hms.scankit.aiscan.common.z zVar : zVarArr) {
            if (zVar.d()) {
                i12++;
            }
        }
        if (!_a.f7790a || _a.f7791b || i12 >= 2) {
            float b10 = zVarArr[0].b();
            float b11 = zVarArr[1].b();
            float b12 = zVarArr[2].b();
            float c10 = zVarArr[0].c();
            float c11 = zVarArr[1].c();
            float c12 = zVarArr[2].c();
            com.huawei.hms.scankit.aiscan.common.z a10 = a(b10, c10, b11, c11, b12, c12);
            float b13 = a10.b();
            float c13 = a10.c();
            float max = Math.max(Math.max(Math.max(b10, b11), b12), b13);
            float min = Math.min(Math.min(Math.min(b10, b11), b12), b13);
            float max2 = Math.max(Math.max(Math.max(c10, c11), c12), c13);
            float min2 = Math.min(Math.min(Math.min(c10, c11), c12), c13);
            int min3 = (int) (Math.min(i11, i10) * 0.85f);
            int i13 = (i10 - min3) / 2;
            int i14 = (i11 - min3) / 2;
            Rect rect = new Rect(i13, i14, min3 + i13, min3 + i14);
            if (min >= rect.left || min2 >= rect.top || max <= rect.right || max2 <= rect.bottom) {
                float abs3 = Math.abs(min2 - rect.top);
                float abs4 = Math.abs(min - rect.left);
                float abs5 = Math.abs(max - rect.right);
                float abs6 = Math.abs(max2 - rect.bottom);
                float f13 = (rect.left + rect.right) / 2.0f;
                float f14 = (rect.top + rect.bottom) / 2.0f;
                float min4 = Math.min(Math.min(Math.min(abs4, abs5), abs3), abs6);
                if (0.01f > Math.abs(abs4 - min4)) {
                    abs = Math.abs(f13 - rect.left) * 1.0f;
                    f11 = f13 - min;
                } else if (0.01f <= Math.abs(abs5 - min4)) {
                    if (0.01f <= Math.abs(abs3 - min4)) {
                        if (0.01f > Math.abs(abs6 - min4)) {
                            abs = Math.abs(f14 - rect.bottom) * 1.0f;
                            f10 = f14 - max2;
                        }
                        return Math.min(f12, 2.0f) * 0.9f;
                    }
                    abs = Math.abs(f14 - rect.top) * 1.0f;
                    f10 = f14 - min2;
                    abs2 = Math.abs(f10);
                    f12 = abs / abs2;
                    return Math.min(f12, 2.0f) * 0.9f;
                } else {
                    abs = Math.abs(f13 - rect.right) * 1.0f;
                    f11 = f13 - max;
                }
                abs2 = Math.abs(f11);
                f12 = abs / abs2;
                return Math.min(f12, 2.0f) * 0.9f;
            }
            return 1.0f;
        }
        return 1.0f;
    }

    private static com.huawei.hms.scankit.aiscan.common.z a(float f10, float f11, float f12, float f13, float f14, float f15) {
        return new com.huawei.hms.scankit.aiscan.common.z((f10 + f14) - f12, (f11 + f15) - f13);
    }

    public static float b(int i10, int i11, com.huawei.hms.scankit.aiscan.common.z[] zVarArr) {
        float abs;
        float f10;
        float abs2;
        float f11;
        float f12 = 1.0f;
        if (zVarArr.length < 3) {
            return 1.0f;
        }
        float b10 = zVarArr[0].b();
        float b11 = zVarArr[1].b();
        float b12 = zVarArr[2].b();
        float c10 = zVarArr[0].c();
        float c11 = zVarArr[1].c();
        float c12 = zVarArr[2].c();
        float max = Math.max(Math.max(b10, b11), b12);
        float min = Math.min(Math.min(b10, b11), b12);
        float max2 = Math.max(Math.max(c10, c11), c12);
        float min2 = Math.min(Math.min(c10, c11), c12);
        int min3 = (int) (Math.min(i11, i10) * 0.1f);
        Rect rect = new Rect(min3, min3, i10 - min3, i11 - min3);
        if (min >= rect.left || min2 >= rect.top || max <= rect.right || max2 <= rect.bottom) {
            float abs3 = Math.abs(max - rect.right);
            float abs4 = Math.abs(max2 - rect.bottom);
            float abs5 = Math.abs(min2 - rect.top);
            float abs6 = Math.abs(min - rect.left);
            float f13 = (rect.left + rect.right) / 2.0f;
            float f14 = (rect.top + rect.bottom) / 2.0f;
            float min4 = Math.min(Math.min(Math.min(abs6, abs3), abs5), abs4);
            if (0.01f > Math.abs(abs6 - min4)) {
                abs = Math.abs(f13 - rect.left);
                f11 = f13 - min;
            } else if (0.01f <= Math.abs(abs3 - min4)) {
                if (0.01f <= Math.abs(abs5 - min4)) {
                    if (0.01f > Math.abs(abs4 - min4)) {
                        abs = Math.abs(f14 - rect.bottom);
                        f10 = f14 - max2;
                    }
                    return Math.min(f12, 2.0f) * 0.9f;
                }
                abs = Math.abs(f14 - rect.top);
                f10 = f14 - min2;
                abs2 = Math.abs(f10);
                f12 = abs / abs2;
                return Math.min(f12, 2.0f) * 0.9f;
            } else {
                abs = Math.abs(f13 - rect.right);
                f11 = f13 - max;
            }
            abs2 = Math.abs(f11);
            f12 = abs / abs2;
            return Math.min(f12, 2.0f) * 0.9f;
        }
        return 1.0f;
    }
}
