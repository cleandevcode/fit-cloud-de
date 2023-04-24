package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.util.LoadOpencvJNIUtil;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class N {

    /* renamed from: a */
    public List<L> f7611a = new ArrayList();

    /* renamed from: b */
    private int f7612b = 0;

    public void a(boolean z10, byte[] bArr, int i10, int i11, int i12, boolean z11) {
        float[] multiBarcodeDetect = LoadOpencvJNIUtil.multiBarcodeDetect(bArr, i10, i11, i12, z11);
        if (multiBarcodeDetect != null) {
            this.f7612b = multiBarcodeDetect.length / 10;
        } else {
            this.f7612b = 0;
        }
        for (int i13 = 0; i13 < this.f7612b; i13++) {
            int i14 = i13 * 10;
            if (com.huawei.hms.scankit.util.b.a(multiBarcodeDetect, i14)) {
                int i15 = i14 + 1;
                if (com.huawei.hms.scankit.util.b.a(multiBarcodeDetect, i15)) {
                    int i16 = i14 + 2;
                    if (com.huawei.hms.scankit.util.b.a(multiBarcodeDetect, i16)) {
                        int i17 = i14 + 3;
                        if (com.huawei.hms.scankit.util.b.a(multiBarcodeDetect, i17)) {
                            int i18 = i14 + 4;
                            if (com.huawei.hms.scankit.util.b.a(multiBarcodeDetect, i18)) {
                                int i19 = i14 + 5;
                                if (com.huawei.hms.scankit.util.b.a(multiBarcodeDetect, i19)) {
                                    int i20 = i14 + 6;
                                    if (com.huawei.hms.scankit.util.b.a(multiBarcodeDetect, i20)) {
                                        int i21 = i14 + 7;
                                        if (com.huawei.hms.scankit.util.b.a(multiBarcodeDetect, i21)) {
                                            int i22 = i14 + 8;
                                            if (com.huawei.hms.scankit.util.b.a(multiBarcodeDetect, i22)) {
                                                int i23 = i14 + 9;
                                                if (com.huawei.hms.scankit.util.b.a(multiBarcodeDetect, i23)) {
                                                    this.f7611a.add(new L(z10, multiBarcodeDetect[i14], multiBarcodeDetect[i15], multiBarcodeDetect[i16], multiBarcodeDetect[i17], multiBarcodeDetect[i18], multiBarcodeDetect[i19], multiBarcodeDetect[i20], multiBarcodeDetect[i21], multiBarcodeDetect[i22], multiBarcodeDetect[i23]));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
