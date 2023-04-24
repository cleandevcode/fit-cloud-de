package com.huawei.hms.hmsscankit;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.huawei.hms.ml.scan.HmsBuildBitmapOption;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanAnalyzerOptions;
import com.huawei.hms.mlsdk.common.MLFrame;
import com.huawei.hms.scankit.p.Ob;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public class ScanUtil {
    public static final int CAMERA_ININT_ERROR = -1000;
    public static final String CONTEXT_METHOD = "initializeModule";
    public static final String CONTEXT_PATH = "com.huawei.hms.feature.DynamicModuleInitializer";
    public static final String CREATOR_PATH = "com.huawei.hms.scankit.Creator";
    public static final int ERROR_NO_CAMERA_PERMISSION = 1;
    public static final int ERROR_NO_READ_PERMISSION = 2;
    private static final int MAX_BITMAP_SIZE = 52428800;
    public static final String MODULE_SCANKIT = "huawei_module_scankit";
    public static final String MODULE_SCANKIT_LOCAL = "huawei_module_scankit_local";
    public static final String RESULT = "SCAN_RESULT";
    public static final int SUCCESS = 0;

    public static Bitmap buildBitmap(String str, int i10, int i11, int i12, HmsBuildBitmapOption hmsBuildBitmapOption) {
        return new Ob().a(str, i10, i11, i12, hmsBuildBitmapOption);
    }

    public static Bitmap compressBitmap(Context context, String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        dealBitmapFactoryOption(context, options);
        return BitmapFactory.decodeFile(str, options);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x005a, code lost:
        if (r5 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x005c, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0060, code lost:
        com.huawei.hms.scankit.util.a.b("exception", "Exception");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x006a, code lost:
        if (r5 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0073, code lost:
        if (r5 == null) goto L18;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0089: MOVE  (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:86:0x0089 */
    /* JADX WARN: Removed duplicated region for block: B:94:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap compressBitmapForAndroid29(android.content.Context r11, java.lang.String r12) {
        /*
            java.lang.String r0 = "_id"
            java.lang.String r1 = "Exception"
            java.lang.String r2 = "exception"
            r3 = 1
            r4 = 0
            android.content.ContentResolver r5 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L66 java.lang.NullPointerException -> L6d
            android.net.Uri r6 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L66 java.lang.NullPointerException -> L6d
            java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L66 java.lang.NullPointerException -> L6d
            java.lang.String r8 = "_data=?"
            java.lang.String[] r9 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L66 java.lang.NullPointerException -> L6d
            r10 = 0
            r9[r10] = r12     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L66 java.lang.NullPointerException -> L6d
            r10 = 0
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L66 java.lang.NullPointerException -> L6d
            if (r5 == 0) goto L3a
            boolean r6 = r5.moveToFirst()     // Catch: java.lang.Exception -> L67 java.lang.NullPointerException -> L6e java.lang.Throwable -> L88
            if (r6 == 0) goto L3a
            int r12 = r5.getColumnIndex(r0)     // Catch: java.lang.Exception -> L67 java.lang.NullPointerException -> L6e java.lang.Throwable -> L88
            int r12 = r5.getInt(r12)     // Catch: java.lang.Exception -> L67 java.lang.NullPointerException -> L6e java.lang.Throwable -> L88
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch: java.lang.Exception -> L67 java.lang.NullPointerException -> L6e java.lang.Throwable -> L88
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Exception -> L67 java.lang.NullPointerException -> L6e java.lang.Throwable -> L88
            android.net.Uri r12 = android.net.Uri.withAppendedPath(r0, r12)     // Catch: java.lang.Exception -> L67 java.lang.NullPointerException -> L6e java.lang.Throwable -> L88
        L38:
            r4 = r12
            goto L5a
        L3a:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L67 java.lang.NullPointerException -> L6e java.lang.Throwable -> L88
            r0.<init>(r12)     // Catch: java.lang.Exception -> L67 java.lang.NullPointerException -> L6e java.lang.Throwable -> L88
            boolean r0 = r0.exists()     // Catch: java.lang.Exception -> L67 java.lang.NullPointerException -> L6e java.lang.Throwable -> L88
            if (r0 == 0) goto L5a
            android.content.ContentValues r0 = new android.content.ContentValues     // Catch: java.lang.Exception -> L67 java.lang.NullPointerException -> L6e java.lang.Throwable -> L88
            r0.<init>()     // Catch: java.lang.Exception -> L67 java.lang.NullPointerException -> L6e java.lang.Throwable -> L88
            java.lang.String r6 = "_data"
            r0.put(r6, r12)     // Catch: java.lang.Exception -> L67 java.lang.NullPointerException -> L6e java.lang.Throwable -> L88
            android.content.ContentResolver r12 = r11.getContentResolver()     // Catch: java.lang.Exception -> L67 java.lang.NullPointerException -> L6e java.lang.Throwable -> L88
            android.net.Uri r6 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch: java.lang.Exception -> L67 java.lang.NullPointerException -> L6e java.lang.Throwable -> L88
            android.net.Uri r12 = r12.insert(r6, r0)     // Catch: java.lang.Exception -> L67 java.lang.NullPointerException -> L6e java.lang.Throwable -> L88
            goto L38
        L5a:
            if (r5 == 0) goto L76
        L5c:
            r5.close()     // Catch: java.lang.Exception -> L60
            goto L76
        L60:
            com.huawei.hms.scankit.util.a.b(r2, r1)
            goto L76
        L64:
            r11 = move-exception
            goto L8a
        L66:
            r5 = r4
        L67:
            com.huawei.hms.scankit.util.a.b(r2, r1)     // Catch: java.lang.Throwable -> L88
            if (r5 == 0) goto L76
        L6c:
            goto L5c
        L6d:
            r5 = r4
        L6e:
            java.lang.String r12 = "NullPointerException"
            com.huawei.hms.scankit.util.a.b(r2, r12)     // Catch: java.lang.Throwable -> L88
            if (r5 == 0) goto L76
            goto L6c
        L76:
            android.graphics.BitmapFactory$Options r12 = new android.graphics.BitmapFactory$Options
            r12.<init>()
            r12.inJustDecodeBounds = r3
            getBitmapFromUri(r11, r4, r12)
            dealBitmapFactoryOption(r11, r12)
            android.graphics.Bitmap r11 = getBitmapFromUri(r11, r4, r12)
            return r11
        L88:
            r11 = move-exception
            r4 = r5
        L8a:
            if (r4 == 0) goto L93
            r4.close()     // Catch: java.lang.Exception -> L90
            goto L93
        L90:
            com.huawei.hms.scankit.util.a.b(r2, r1)
        L93:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hmsscankit.ScanUtil.compressBitmapForAndroid29(android.content.Context, java.lang.String):android.graphics.Bitmap");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void dealBitmapFactoryOption(android.content.Context r10, android.graphics.BitmapFactory.Options r11) {
        /*
            java.lang.String r0 = "exception"
            int r1 = r11.outWidth
            int r2 = r11.outHeight
            if (r1 == 0) goto L62
            if (r2 != 0) goto Lb
            goto L62
        Lb:
            if (r1 <= r2) goto Le
            r1 = r2
        Le:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            r4 = 0
            r5 = 1
            if (r2 < r3) goto L43
            java.lang.String r2 = "activity"
            java.lang.Object r10 = r10.getSystemService(r2)     // Catch: java.lang.Exception -> L3b java.lang.NullPointerException -> L3e
            android.app.ActivityManager r10 = (android.app.ActivityManager) r10     // Catch: java.lang.Exception -> L3b java.lang.NullPointerException -> L3e
            android.app.ActivityManager$MemoryInfo r2 = new android.app.ActivityManager$MemoryInfo     // Catch: java.lang.Exception -> L3b java.lang.NullPointerException -> L3e
            r2.<init>()     // Catch: java.lang.Exception -> L3b java.lang.NullPointerException -> L3e
            r10.getMemoryInfo(r2)     // Catch: java.lang.Exception -> L3b java.lang.NullPointerException -> L3e
            r6 = 4652218415073722368(0x4090000000000000, double:1024.0)
            r8 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r6 = java.lang.Math.pow(r6, r8)     // Catch: java.lang.Exception -> L3b java.lang.NullPointerException -> L3e
            long r2 = r2.totalMem     // Catch: java.lang.Exception -> L3b java.lang.NullPointerException -> L3e
            double r2 = (double) r2
            double r2 = r2 / r6
            r6 = 4617878467915022336(0x4016000000000000, double:5.5)
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 >= 0) goto L39
            goto L43
        L39:
            r10 = 0
            goto L44
        L3b:
            java.lang.String r10 = "Exception"
            goto L40
        L3e:
            java.lang.String r10 = "NullPointerException"
        L40:
            com.huawei.hms.scankit.util.a.b(r0, r10)
        L43:
            r10 = 1
        L44:
            if (r10 == 0) goto L49
            r10 = 1200(0x4b0, float:1.682E-42)
            goto L4b
        L49:
            r10 = 3000(0xbb8, float:4.204E-42)
        L4b:
            if (r1 <= r10) goto L55
            float r0 = (float) r1
            float r10 = (float) r10
            float r0 = r0 / r10
            int r10 = java.lang.Math.round(r0)
            goto L56
        L55:
            r10 = 1
        L56:
            r11.inSampleSize = r10
            r11.inJustDecodeBounds = r4
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
            r11.inPreferredConfig = r10
            r11.inPurgeable = r5
            r11.inInputShareable = r5
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hmsscankit.ScanUtil.dealBitmapFactoryOption(android.content.Context, android.graphics.BitmapFactory$Options):void");
    }

    public static HmsScan[] decodeWithBitmap(Context context, Bitmap bitmap, HmsScanAnalyzerOptions hmsScanAnalyzerOptions) {
        if (bitmap != null) {
            if (bitmap.getHeight() * bitmap.getWidth() <= MAX_BITMAP_SIZE) {
                return g.a(context, bitmap, hmsScanAnalyzerOptions);
            }
        }
        if (bitmap != null) {
            StringBuilder a10 = android.support.v4.media.d.a("input image is too large:");
            a10.append(bitmap.getWidth());
            com.huawei.hms.scankit.util.a.d("ScanUtil", a10.toString());
        }
        return new HmsScan[0];
    }

    public static HmsScan[] detectForHmsDector(Context context, MLFrame mLFrame, HmsScanAnalyzerOptions hmsScanAnalyzerOptions) {
        return b.a(context, mLFrame, hmsScanAnalyzerOptions);
    }

    private static Bitmap getBitmapFromUri(Context context, Uri uri, BitmapFactory.Options options) {
        String str;
        if (uri == null) {
            com.huawei.hms.scankit.util.a.a("ScanBitmap", "uri == null");
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor(), null, options);
            openFileDescriptor.close();
            return decodeFileDescriptor;
        } catch (FileNotFoundException unused) {
            str = "FileNotFoundException";
            com.huawei.hms.scankit.util.a.b("exception", str);
            return null;
        } catch (IOException unused2) {
            str = "IOException";
            com.huawei.hms.scankit.util.a.b("exception", str);
            return null;
        } catch (Exception unused3) {
            str = "Exception";
            com.huawei.hms.scankit.util.a.b("exception", str);
            return null;
        }
    }

    public static boolean isScanAvailable(Context context) {
        return true;
    }

    public static boolean selfPermissionGranted(Context context, int i10, String str) {
        int checkSelfPermission;
        if (Build.VERSION.SDK_INT >= 23) {
            if (i10 >= 23) {
                if (com.huawei.hms.scankit.util.b.a(str) == null) {
                    return true;
                }
                checkSelfPermission = context.checkSelfPermission(str);
                if (checkSelfPermission == 0) {
                    return true;
                }
            } else if (com.huawei.hms.scankit.util.b.a(context, str) == 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int startScan(android.app.Activity r4, int r5, com.huawei.hms.ml.scan.HmsScanAnalyzerOptions r6) {
        /*
            java.lang.String r0 = "exception"
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: java.lang.RuntimeException -> L15 android.content.pm.PackageManager.NameNotFoundException -> L18
            java.lang.String r2 = r4.getPackageName()     // Catch: java.lang.RuntimeException -> L15 android.content.pm.PackageManager.NameNotFoundException -> L18
            r3 = 16384(0x4000, float:2.2959E-41)
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch: java.lang.RuntimeException -> L15 android.content.pm.PackageManager.NameNotFoundException -> L18
            android.content.pm.ApplicationInfo r1 = r1.applicationInfo     // Catch: java.lang.RuntimeException -> L15 android.content.pm.PackageManager.NameNotFoundException -> L18
            int r0 = r1.targetSdkVersion     // Catch: java.lang.RuntimeException -> L15 android.content.pm.PackageManager.NameNotFoundException -> L18
            goto L1f
        L15:
            java.lang.String r1 = "RuntimeException"
            goto L1a
        L18:
            java.lang.String r1 = "NameNotFoundException"
        L1a:
            com.huawei.hms.scankit.util.a.b(r0, r1)
            r0 = 28
        L1f:
            java.lang.String r1 = "android.permission.CAMERA"
            boolean r0 = selfPermissionGranted(r4, r0, r1)
            if (r0 == 0) goto L3c
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.huawei.hms.hmsscankit.ScanKitActivity> r1 = com.huawei.hms.hmsscankit.ScanKitActivity.class
            r0.<init>(r4, r1)
            if (r6 == 0) goto L37
            int r6 = r6.mode
            java.lang.String r1 = "ScanFormatValue"
            r0.putExtra(r1, r6)
        L37:
            r4.startActivityForResult(r0, r5)
            r4 = 0
            return r4
        L3c:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hmsscankit.ScanUtil.startScan(android.app.Activity, int, com.huawei.hms.ml.scan.HmsScanAnalyzerOptions):int");
    }
}
