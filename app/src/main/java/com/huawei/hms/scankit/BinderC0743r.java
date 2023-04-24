package com.huawei.hms.scankit;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.hmsscankit.DetailRect;
import com.huawei.hms.hmsscankit.WriterException;
import com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate;
import com.huawei.hms.ml.scan.HmsBuildBitmapOption;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.scankit.p.C0675ib;
import com.huawei.hms.scankit.p.C0695nb;
import com.huawei.hms.scankit.p.Ob;

/* renamed from: com.huawei.hms.scankit.r */
/* loaded from: classes.dex */
public class BinderC0743r extends IRemoteDecoderDelegate.Stub {

    /* renamed from: a */
    private static volatile BinderC0743r f8167a = new BinderC0743r();

    /* renamed from: b */
    private volatile C0675ib f8168b = null;

    /* renamed from: c */
    private volatile C0695nb f8169c = null;

    public static BinderC0743r a() {
        return f8167a;
    }

    private HmsScan[] a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        boolean z10;
        int i10;
        boolean z11;
        if (iObjectWrapper == null) {
            com.huawei.hms.scankit.util.a.b("IRemoteDecoder", "bitmap is null");
            return new HmsScan[0];
        }
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (iObjectWrapper2 == null || !(ObjectWrapper.unwrap(iObjectWrapper2) instanceof Bundle)) {
            z10 = false;
            i10 = 0;
            z11 = true;
        } else {
            i10 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getInt(DetailRect.FORMAT_FLAG);
            z11 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getBoolean(DetailRect.PHOTO_MODE, false);
            int i11 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getInt(DetailRect.TYPE_TRANS, 0);
            DetailRect.HMSSCAN_SDK_VALUE = i11;
            z10 = i11 >= 2;
            if (z10) {
                i10 = com.huawei.hms.scankit.util.b.b(i10);
            }
        }
        if (unwrap instanceof Bitmap) {
            HmsScan[] b10 = D.a().b((Bitmap) unwrap, i10, z11, this.f8168b);
            return !z10 ? com.huawei.hms.scankit.util.b.a(b10) : b10;
        }
        return new HmsScan[0];
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
    public IObjectWrapper buildBitmap(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null || !(ObjectWrapper.unwrap(iObjectWrapper) instanceof Bundle)) {
            throw new RemoteException("Bundle is Null");
        }
        Bundle bundle = (Bundle) ObjectWrapper.unwrap(iObjectWrapper);
        String string = bundle.getString(HmsBuildBitmapOption.TYPE_BUILD_BITMAP_CONTENT);
        int i10 = bundle.getInt(HmsBuildBitmapOption.TYPE_BUILD_BITMAP_FOTMAT);
        int i11 = bundle.getInt(HmsBuildBitmapOption.TYPE_BUILD_BITMAP_WIDTH);
        int i12 = bundle.getInt(HmsBuildBitmapOption.TYPE_BUILD_BITMAP_HEIGHT);
        int i13 = bundle.getInt(HmsBuildBitmapOption.TYPE_BUILD_BITMAP_MARGIN, 1);
        int i14 = bundle.getInt(HmsBuildBitmapOption.TYPE_BUILD_BITMAP_COLOR, -1);
        try {
            Bitmap a10 = new Ob().a(string, i10, i11, i12, new HmsBuildBitmapOption.Creator().setBitmapMargin(i13).setBitmapColor(i14).setBitmapBackgroundColor(bundle.getInt(HmsBuildBitmapOption.TYPE_BUILD_BITMAP_BACKCOLOR, -1)).create());
            if (a10 != null) {
                return ObjectWrapper.wrap(a10);
            }
            throw new RemoteException("Bitmap is Null");
        } catch (WriterException e10) {
            throw new RemoteException(e10.getMessage());
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
    public void buildBitmapLog(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null || !(ObjectWrapper.unwrap(iObjectWrapper) instanceof Bundle)) {
            return;
        }
        Bundle bundle = (Bundle) ObjectWrapper.unwrap(iObjectWrapper);
        try {
            if (this.f8169c == null) {
                try {
                    try {
                        this.f8169c = new C0695nb();
                        if (this.f8169c == null) {
                            return;
                        }
                    } catch (Exception e10) {
                        com.huawei.hms.scankit.util.a.b("IRemoteDecoderDelegateImpl", e10.getMessage());
                        if (this.f8169c == null) {
                            return;
                        }
                    }
                } catch (RuntimeException e11) {
                    com.huawei.hms.scankit.util.a.b("IRemoteDecoderDelegateImpl", e11.getMessage());
                    if (this.f8169c == null) {
                        return;
                    }
                }
            }
            this.f8169c.a(bundle);
        } catch (Throwable th2) {
            if (this.f8169c != null) {
                throw th2;
            }
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
    public HmsScan[] decodeWithBitmap(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Bundle bundle = (iObjectWrapper2 == null || !(ObjectWrapper.unwrap(iObjectWrapper2) instanceof Bundle)) ? new Bundle() : (Bundle) ObjectWrapper.unwrap(iObjectWrapper2);
        if (this.f8168b == null) {
            try {
                this.f8168b = new C0675ib(bundle, "Bitmap");
            } catch (RuntimeException | Exception unused) {
                com.huawei.hms.scankit.util.a.b("IRemoteDecoderDelegateImpl", "Ha error");
            }
        }
        return a(iObjectWrapper, iObjectWrapper2);
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate
    public IObjectWrapper queryDeepLinkInfo(IObjectWrapper iObjectWrapper) {
        return null;
    }
}
