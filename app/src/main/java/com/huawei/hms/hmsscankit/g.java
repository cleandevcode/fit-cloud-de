package com.huawei.hms.hmsscankit;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.hms.hmsscankit.api.IRemoteCreator;
import com.huawei.hms.hmsscankit.api.IRemoteDecoderDelegate;
import com.huawei.hms.ml.scan.HmsBuildBitmapOption;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanAnalyzerOptions;
import com.huawei.hms.scankit.p.C0695nb;
import com.huawei.hms.scankit.p.C0703pb;
import java.util.UUID;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a */
    private static volatile C0695nb f7085a;

    /* renamed from: b */
    private static volatile IRemoteDecoderDelegate f7086b;

    public static Bundle a(String str, int i10, int i11, int i12, HmsBuildBitmapOption hmsBuildBitmapOption) {
        Bundle bundle = new Bundle();
        bundle.putInt("contentLength", str == null ? -1 : str.length());
        bundle.putInt("scanType", i10);
        bundle.putInt("reqWidth", i11);
        bundle.putInt("reqHeight", i12);
        bundle.putString("buildBitmapOption", hmsBuildBitmapOption == null ? "null" : hmsBuildBitmapOption.toString());
        bundle.putString(WiseOpenHianalyticsData.UNION_API_NAME, "BuildBitmap");
        bundle.putLong(WiseOpenHianalyticsData.UNION_CALLTIME, System.currentTimeMillis());
        bundle.putString("transId", UUID.randomUUID().toString());
        return bundle;
    }

    public static void a(int i10, Bitmap bitmap, Bundle bundle) {
        if (bundle != null) {
            bundle.putInt(WiseOpenHianalyticsData.UNION_RESULT, i10);
            bundle.putInt("outputWidth", bitmap == null ? -1 : bitmap.getWidth());
            bundle.putInt("outputHeight", bitmap != null ? bitmap.getHeight() : -1);
            long j10 = bundle.getLong(WiseOpenHianalyticsData.UNION_CALLTIME);
            bundle.putLong(WiseOpenHianalyticsData.UNION_COSTTIME, System.currentTimeMillis() - j10);
            bundle.putString(WiseOpenHianalyticsData.UNION_CALLTIME, new f("yyyyMMddHHmmss.SSS").format(Long.valueOf(j10)));
            a(bundle);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(android.os.Bundle r3) {
        /*
            java.lang.String r0 = "RemoteDecoder"
            android.content.Context r1 = com.huawei.hms.feature.DynamicModuleInitializer.getContext()
            if (r1 != 0) goto L4b
            lb.a r1 = lb.a.f19423b     // Catch: java.lang.NoClassDefFoundError -> L10 java.lang.Exception -> L12 java.lang.IllegalAccessException -> L14 java.lang.reflect.InvocationTargetException -> L16 java.lang.NoSuchMethodException -> L18 java.lang.ClassNotFoundException -> L1a
            android.content.Context r1 = r1.f19424a     // Catch: java.lang.NoClassDefFoundError -> L10 java.lang.Exception -> L12 java.lang.IllegalAccessException -> L14 java.lang.reflect.InvocationTargetException -> L16 java.lang.NoSuchMethodException -> L18 java.lang.ClassNotFoundException -> L1a
            com.huawei.hms.hmsscankit.j.a(r1)     // Catch: java.lang.NoClassDefFoundError -> L10 java.lang.Exception -> L12 java.lang.IllegalAccessException -> L14 java.lang.reflect.InvocationTargetException -> L16 java.lang.NoSuchMethodException -> L18 java.lang.ClassNotFoundException -> L1a
            goto L4b
        L10:
            r3 = move-exception
            goto L1c
        L12:
            r1 = move-exception
            goto L26
        L14:
            r1 = move-exception
            goto L2d
        L16:
            r1 = move-exception
            goto L34
        L18:
            r1 = move-exception
            goto L3b
        L1a:
            r1 = move-exception
            goto L42
        L1c:
            java.lang.String r3 = r3.getMessage()
            java.lang.String r0 = "NoClassDefFoundError"
            com.huawei.hms.scankit.util.a.b(r0, r3)
            return
        L26:
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = "Exception"
            goto L48
        L2d:
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = "IllegalAccessException"
            goto L48
        L34:
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = "InvocationTargetException"
            goto L48
        L3b:
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = "NoSuchMethodException"
            goto L48
        L42:
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = "ClassNotFoundException"
        L48:
            com.huawei.hms.scankit.util.a.b(r2, r1)
        L4b:
            com.huawei.hms.scankit.p.nb r1 = com.huawei.hms.hmsscankit.g.f7085a
            if (r1 != 0) goto L7d
            com.huawei.hms.scankit.p.nb r1 = new com.huawei.hms.scankit.p.nb     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d java.lang.RuntimeException -> L6a
            r1.<init>()     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d java.lang.RuntimeException -> L6a
            com.huawei.hms.hmsscankit.g.f7085a = r1     // Catch: java.lang.Throwable -> L5b java.lang.Exception -> L5d java.lang.RuntimeException -> L6a
            com.huawei.hms.scankit.p.nb r0 = com.huawei.hms.hmsscankit.g.f7085a
            if (r0 != 0) goto L7d
            return
        L5b:
            r3 = move-exception
            goto L77
        L5d:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L5b
            com.huawei.hms.scankit.util.a.b(r0, r1)     // Catch: java.lang.Throwable -> L5b
            com.huawei.hms.scankit.p.nb r0 = com.huawei.hms.hmsscankit.g.f7085a
            if (r0 != 0) goto L7d
            return
        L6a:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L5b
            com.huawei.hms.scankit.util.a.b(r0, r1)     // Catch: java.lang.Throwable -> L5b
            com.huawei.hms.scankit.p.nb r0 = com.huawei.hms.hmsscankit.g.f7085a
            if (r0 != 0) goto L7d
            return
        L77:
            com.huawei.hms.scankit.p.nb r0 = com.huawei.hms.hmsscankit.g.f7085a
            if (r0 != 0) goto L7c
            return
        L7c:
            throw r3
        L7d:
            com.huawei.hms.scankit.p.nb r0 = com.huawei.hms.hmsscankit.g.f7085a
            r0.a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hmsscankit.g.a(android.os.Bundle):void");
    }

    public static HmsScan[] a(Context context, Bitmap bitmap, HmsScanAnalyzerOptions hmsScanAnalyzerOptions) {
        HmsScan[] hmsScanArr = new HmsScan[0];
        if (f7086b == null) {
            IRemoteCreator b10 = j.b(context);
            if (b10 == null) {
                return hmsScanArr;
            }
            try {
                f7086b = b10.newRemoteDecoderDelegate();
            } catch (RemoteException unused) {
                com.huawei.hms.scankit.util.a.b("RemoteDecoder", "RemoteException");
            }
        }
        if (f7086b != null) {
            try {
                Bundle bundle = new Bundle();
                if (hmsScanAnalyzerOptions != null) {
                    bundle.putInt(DetailRect.FORMAT_FLAG, hmsScanAnalyzerOptions.mode);
                    bundle.putBoolean(DetailRect.PHOTO_MODE, hmsScanAnalyzerOptions.photoMode);
                }
                bundle.putInt(DetailRect.TYPE_TRANS, 3);
                bundle.putAll(C0703pb.a(context));
                HmsScan[] decodeWithBitmap = f7086b.decodeWithBitmap(ObjectWrapper.wrap(bitmap), ObjectWrapper.wrap(bundle));
                return decodeWithBitmap != null ? decodeWithBitmap : hmsScanArr;
            } catch (RemoteException unused2) {
                com.huawei.hms.scankit.util.a.b("RemoteDecoder", "RemoteException");
                return hmsScanArr;
            }
        }
        return hmsScanArr;
    }
}
