package com.huawei.hms.scankit;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.hmsscankit.DetailRect;
import com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.scankit.p.C0675ib;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class t extends IRemoteHmsDecoderDelegate.Stub {

    /* renamed from: a */
    private static volatile t f8174a = new t();

    /* renamed from: b */
    private volatile C0675ib f8175b = null;

    private Bundle a(IObjectWrapper iObjectWrapper) {
        return (iObjectWrapper == null || !(ObjectWrapper.unwrap(iObjectWrapper) instanceof Bundle)) ? new Bundle() : (Bundle) ObjectWrapper.unwrap(iObjectWrapper);
    }

    public static t a() {
        return f8174a;
    }

    private HmsScan[] a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        boolean z10;
        boolean z11;
        int i10;
        if (iObjectWrapper == null) {
            com.huawei.hms.scankit.util.a.b("ScankitRemoteS", "bitmap is null");
            return new HmsScan[0];
        }
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (iObjectWrapper2 == null || !(ObjectWrapper.unwrap(iObjectWrapper2) instanceof Bundle)) {
            z10 = false;
            z11 = false;
            i10 = 0;
        } else {
            z11 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.PHOTO_MODE, false);
            i10 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getInt(DetailRect.FORMAT_FLAG);
            int i11 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getInt(DetailRect.TYPE_TRANS, 0);
            DetailRect.HMSSCAN_SDK_VALUE = i11;
            z10 = i11 >= 2;
            if (z10) {
                i10 = com.huawei.hms.scankit.util.b.b(i10);
            }
        }
        if (unwrap instanceof Bitmap) {
            HmsScan[] a10 = D.a().a((Bitmap) unwrap, i10, z11, this.f8175b);
            return !z10 ? com.huawei.hms.scankit.util.b.a(a10) : a10;
        }
        return new HmsScan[0];
    }

    private HmsScan[] a(DetailRect detailRect, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        boolean z10;
        int i10;
        boolean z11;
        if (iObjectWrapper == null) {
            com.huawei.hms.scankit.util.a.b("ScankitRemoteS", "bytebuffer is null");
            return new HmsScan[0];
        }
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (iObjectWrapper2 == null || !(ObjectWrapper.unwrap(iObjectWrapper2) instanceof Bundle)) {
            z10 = false;
            i10 = 0;
            z11 = false;
        } else {
            int i11 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getInt(DetailRect.FORMAT_FLAG);
            boolean z12 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.PHOTO_MODE, false);
            int i12 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getInt(DetailRect.TYPE_TRANS, 0);
            DetailRect.HMSSCAN_SDK_VALUE = i12;
            z10 = i12 >= 2;
            if (z10) {
                i11 = com.huawei.hms.scankit.util.b.b(i11);
            }
            i10 = i11;
            z11 = z12;
        }
        if (unwrap instanceof ByteBuffer) {
            HmsScan[] a10 = D.a().a((ByteBuffer) unwrap, detailRect == null ? 1000 : detailRect.width, detailRect == null ? 1000 : detailRect.height, i10, z11, this.f8175b);
            return !z10 ? com.huawei.hms.scankit.util.b.a(a10) : a10;
        }
        return new HmsScan[0];
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate
    public HmsScan[] decodeInBitmap(DetailRect detailRect, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Bundle a10 = a(iObjectWrapper2);
        if (this.f8175b == null) {
            try {
                this.f8175b = new C0675ib(a10, "MultiProcessor");
            } catch (RuntimeException | Exception unused) {
                com.huawei.hms.scankit.util.a.b("IRemoteDecoderDelegateImpl", "Ha error");
            }
        }
        return a(iObjectWrapper, iObjectWrapper2);
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate
    public HmsScan[] detectWithByteBuffer(DetailRect detailRect, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Bundle a10 = a(iObjectWrapper2);
        if (this.f8175b == null) {
            try {
                this.f8175b = new C0675ib(a10, "MultiProcessor");
            } catch (RuntimeException | Exception unused) {
                com.huawei.hms.scankit.util.a.b("IRemoteDecoderDelegateImpl", "Ha error");
            }
        }
        return a(detailRect, iObjectWrapper, iObjectWrapper2);
    }
}
