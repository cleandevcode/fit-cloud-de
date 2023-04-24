package com.huawei.hms.hmsscankit;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.hmsscankit.api.IRemoteCreator;
import com.huawei.hms.hmsscankit.api.IRemoteHmsDecoderDelegate;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanAnalyzerOptions;
import com.huawei.hms.mlsdk.common.MLFrame;
import com.huawei.hms.scankit.p.C0703pb;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    private static volatile IRemoteHmsDecoderDelegate f7079a;

    public static HmsScan[] a(Context context, MLFrame mLFrame, HmsScanAnalyzerOptions hmsScanAnalyzerOptions) {
        int i10;
        HmsScan[] hmsScanArr = new HmsScan[0];
        if (f7079a == null) {
            IRemoteCreator b10 = j.b(context);
            if (b10 == null) {
                return hmsScanArr;
            }
            try {
                f7079a = b10.newRemoteHmsDecoderDelegate();
            } catch (RemoteException unused) {
                com.huawei.hms.scankit.util.a.b("exception", "RemoteException");
            }
        }
        if (f7079a != null) {
            try {
                DetailRect detailRect = mLFrame.acquireProperty() != null ? new DetailRect(mLFrame.acquireProperty().getWidth(), mLFrame.acquireProperty().getHeight()) : new DetailRect();
                Bundle bundle = new Bundle();
                if (hmsScanAnalyzerOptions != null && (i10 = hmsScanAnalyzerOptions.mode) != 0) {
                    bundle.putInt(DetailRect.FORMAT_FLAG, i10);
                }
                bundle.putInt(DetailRect.TYPE_TRANS, 3);
                bundle.putAll(C0703pb.a(context));
                HmsScan[] decodeInBitmap = mLFrame.readBitmap() != null ? f7079a.decodeInBitmap(detailRect, ObjectWrapper.wrap(mLFrame.readBitmap()), ObjectWrapper.wrap(bundle)) : f7079a.detectWithByteBuffer(detailRect, ObjectWrapper.wrap(mLFrame.acquireGrayByteBuffer()), ObjectWrapper.wrap(bundle));
                if (decodeInBitmap != null) {
                    return decodeInBitmap;
                }
            } catch (RemoteException unused2) {
                com.huawei.hms.scankit.util.a.b("exception", "RemoteException");
            }
        }
        return hmsScanArr;
    }
}
