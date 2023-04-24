package com.huawei.hms.scankit;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate;

/* loaded from: classes.dex */
public class s extends IRemoteFrameDecoderDelegate.Stub {

    /* renamed from: a */
    private static volatile s f8170a = new s();

    /* renamed from: b */
    public Point f8171b;

    /* renamed from: c */
    public int f8172c = 0;

    /* renamed from: d */
    public Rect f8173d;

    private s() {
    }

    private com.huawei.hms.scankit.aiscan.common.r a(byte[] bArr, int i10, int i11, int i12) {
        if (i12 == 0) {
            byte[] bArr2 = new byte[bArr.length];
            for (int i13 = 0; i13 < i11; i13++) {
                for (int i14 = 0; i14 < i10; i14++) {
                    bArr2[(((i14 * i11) + i11) - i13) - 1] = bArr[(i13 * i10) + i14];
                }
            }
            return a(bArr2, i11, i10);
        } else if (i12 == 2) {
            byte[] bArr3 = new byte[bArr.length];
            for (int i15 = 0; i15 < i11; i15++) {
                for (int i16 = 0; i16 < i10; i16++) {
                    bArr3[(((i10 - 1) - i16) * i11) + i15] = bArr[(i15 * i10) + i16];
                }
            }
            return a(bArr3, i11, i10);
        } else if (i12 != 3) {
            return a(bArr, i10, i11);
        } else {
            byte[] bArr4 = new byte[bArr.length];
            for (int i17 = 0; i17 < i11; i17++) {
                for (int i18 = 0; i18 < i10; i18++) {
                    bArr4[(((((i11 - 1) - i17) * i10) + i10) - 1) - i18] = bArr[(i17 * i10) + i18];
                }
            }
            return a(bArr4, i10, i11);
        }
    }

    public static s a() {
        return f8170a;
    }

    public synchronized Rect a(int i10, int i11) {
        int min;
        int i12;
        int i13;
        min = Math.min(i10, i11);
        i12 = (i10 - min) / 2;
        i13 = (i11 - min) / 2;
        return new Rect(i12, i13, i12 + min, min + i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.huawei.hms.scankit.aiscan.common.r a(byte[] r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.s.a(byte[], int, int):com.huawei.hms.scankit.aiscan.common.r");
    }

    public synchronized Rect b(int i10, int i11) {
        Rect rect = new Rect(a(i10, i11));
        Point point = new Point(i10, i11);
        Point point2 = this.f8171b;
        if (point2 == null) {
            return null;
        }
        int i12 = point2.x;
        int i13 = point2.y;
        if (i12 < i13) {
            int i14 = rect.left;
            int i15 = point.y;
            rect.left = (i14 * i15) / i12;
            rect.right = (rect.right * i15) / i12;
            int i16 = rect.top;
            int i17 = point.x;
            rect.top = (i16 * i17) / i13;
            rect.bottom = (rect.bottom * i17) / i13;
        } else {
            int i18 = rect.top;
            int i19 = point.y;
            rect.top = (i18 * i19) / i13;
            rect.bottom = (rect.bottom * i19) / i13;
            int i20 = rect.left;
            int i21 = point.x;
            rect.left = (i20 * i21) / i12;
            rect.right = (rect.right * i21) / i12;
        }
        return rect;
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate
    public com.huawei.hms.scankit.aiscan.common.x[] decode(byte[] bArr, int i10, int i11, int i12, int i13, IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper != null && (ObjectWrapper.unwrap(iObjectWrapper) instanceof Bundle)) {
            Bundle bundle = (Bundle) ObjectWrapper.unwrap(iObjectWrapper);
            this.f8171b = (Point) bundle.getParcelable("Screen");
            this.f8173d = (Rect) bundle.getParcelable("Rect");
        }
        if (this.f8173d == null) {
            this.f8173d = new Rect(-1, -1, -1, -1);
        }
        if (this.f8171b == null) {
            this.f8171b = new Point(1080, 1920);
        }
        com.huawei.hms.scankit.aiscan.common.r a10 = a(bArr, i10, i11, i12);
        byte[] b10 = a10.b();
        E e10 = new E(a10.c(), a10.a(), i13);
        int i14 = this.f8172c;
        this.f8172c = i14 + 1;
        return k.b(b10, e10.a(i14));
    }
}
