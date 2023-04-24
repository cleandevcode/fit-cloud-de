package com.huawei.hms.scankit;

import android.graphics.Bitmap;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.scankit.p.C0675ib;
import com.huawei.hms.scankit.p.Fb;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class D {

    /* renamed from: a */
    private static volatile D f7092a;

    public static D a() {
        if (f7092a == null) {
            synchronized (D.class) {
                if (f7092a == null) {
                    f7092a = new D();
                }
            }
        }
        return f7092a;
    }

    public HmsScan[] a(Bitmap bitmap, int i10, boolean z10, C0675ib c0675ib) {
        C0675ib.a aVar;
        if (c0675ib != null) {
            c0675ib.a("multi");
            aVar = c0675ib.a(z10, bitmap.getWidth() * bitmap.getHeight());
            if (bitmap.getHeight() < 30 || bitmap.getWidth() < 30) {
                aVar.a(-1005);
            }
        } else {
            aVar = null;
        }
        HmsScan[] a10 = Fb.a(k.a(bitmap, new E(i10, z10)));
        if (c0675ib != null) {
            c0675ib.a(a10, aVar);
        }
        return a10;
    }

    public HmsScan[] a(ByteBuffer byteBuffer, int i10, int i11, int i12, boolean z10, C0675ib c0675ib) {
        C0675ib.a aVar;
        int i13;
        if (c0675ib != null) {
            c0675ib.a("multi");
            int i14 = i11 * i10;
            aVar = c0675ib.a(z10, i14);
            if (i10 >= 30 && i11 >= 30) {
                i13 = byteBuffer.array().length < i14 ? -1008 : -1007;
            }
            aVar.a(i13);
        } else {
            aVar = null;
        }
        HmsScan[] a10 = Fb.a(k.a(byteBuffer, new E(i10, i11, i12, true, z10)));
        if (c0675ib != null) {
            c0675ib.a(a10, aVar);
        }
        return a10;
    }

    public HmsScan[] b(Bitmap bitmap, int i10, boolean z10, C0675ib c0675ib) {
        C0675ib.a aVar;
        if (c0675ib != null) {
            c0675ib.a("single");
            aVar = c0675ib.a(z10, bitmap.getWidth() * bitmap.getHeight());
            if (bitmap.getHeight() < 30 || bitmap.getWidth() < 30) {
                aVar.a(-1005);
            }
        } else {
            aVar = null;
        }
        HmsScan[] a10 = Fb.a(k.b(bitmap, new E(i10, z10)));
        if (c0675ib != null) {
            c0675ib.a(a10, aVar);
        }
        return a10;
    }
}
