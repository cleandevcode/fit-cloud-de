package com.huawei.hms.scankit.util;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.framework.common.SystemPropUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.hmsscankit.ScanUtil;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanBase;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    private static String f8178a;

    /* renamed from: b */
    private static String f8179b;

    public static int a(int i10) {
        if (i10 <= 0 || i10 >= 8192) {
            return 0;
        }
        if (((i10 - 1) & i10) == 0) {
            return i10;
        }
        int i11 = HmsScanBase.AZTEC_SCAN_TYPE;
        int b10 = (i10 & i11) != 0 ? 0 | b(i11) : 0;
        int i12 = HmsScanBase.CODABAR_SCAN_TYPE;
        if ((i10 & i12) != 0) {
            b10 |= b(i12);
        }
        int i13 = HmsScanBase.CODE39_SCAN_TYPE;
        if ((i10 & i13) != 0) {
            b10 |= b(i13);
        }
        int i14 = HmsScanBase.CODE93_SCAN_TYPE;
        if ((i10 & i14) != 0) {
            b10 |= b(i14);
        }
        int i15 = HmsScanBase.CODE128_SCAN_TYPE;
        if ((i10 & i15) != 0) {
            b10 |= b(i15);
        }
        int i16 = HmsScanBase.DATAMATRIX_SCAN_TYPE;
        if ((i10 & i16) != 0) {
            b10 |= b(i16);
        }
        int i17 = HmsScanBase.EAN8_SCAN_TYPE;
        if ((i10 & i17) != 0) {
            b10 |= b(i17);
        }
        int i18 = HmsScanBase.EAN13_SCAN_TYPE;
        if ((i10 & i18) != 0) {
            b10 |= b(i18);
        }
        int i19 = HmsScanBase.QRCODE_SCAN_TYPE;
        if ((i10 & i19) != 0) {
            b10 |= b(i19);
        }
        int i20 = HmsScanBase.ITF14_SCAN_TYPE;
        if ((i10 & i20) != 0) {
            b10 |= b(i20);
        }
        int i21 = HmsScanBase.PDF417_SCAN_TYPE;
        if ((i10 & i21) != 0) {
            b10 |= b(i21);
        }
        int i22 = HmsScanBase.UPCCODE_A_SCAN_TYPE;
        if ((i10 & i22) != 0) {
            b10 |= b(i22);
        }
        int i23 = HmsScanBase.UPCCODE_E_SCAN_TYPE;
        return (i10 & i23) != 0 ? b10 | b(i23) : b10;
    }

    public static int a(Activity activity) {
        try {
            Class<?> cls = Class.forName("com.huawei.android.app.ActivityManagerEx");
            Method declaredMethod = cls.getDeclaredMethod("getActivityWindowMode", Activity.class);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(cls, activity);
            if (invoke == null) {
                return -1;
            }
            return Integer.valueOf(String.valueOf(invoke)).intValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | NumberFormatException | InvocationTargetException unused) {
            return -1;
        }
    }

    public static int a(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == -1 ? -1 : 0;
    }

    public static ResolveInfo a(Intent intent, String str, Activity activity) {
        intent.setPackage(str);
        List<ResolveInfo> queryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities.isEmpty()) {
            return null;
        }
        return queryIntentActivities.get(0);
    }

    public static Bitmap a(Context context, Intent intent) {
        Bitmap a10;
        Bitmap compressBitmap;
        if (b(context)) {
            Uri data = intent.getData();
            if (data == null || (a10 = a(context, data)) == null) {
                return null;
            }
            return a10;
        }
        String b10 = b(context, intent);
        if (TextUtils.isEmpty(b10)) {
            return null;
        }
        if (Build.VERSION.SDK_INT <= 28 || context.getApplicationInfo() == null || context.getApplicationInfo().targetSdkVersion <= 28) {
            a.a("ScanBitmap", "compressBitmap below android 29");
            compressBitmap = ScanUtil.compressBitmap(context, b10);
        } else {
            a.a("ScanBitmap", "compressBitmap above android 29");
            compressBitmap = ScanUtil.compressBitmapForAndroid29(context, b10);
        }
        if (compressBitmap == null) {
            a.a("ScanBitmap", "compressBitmap above android 29");
            return ScanUtil.compressBitmapForAndroid29(context, b10);
        }
        return compressBitmap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0036, code lost:
        if (r6 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0038, code lost:
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x003c, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x004c, code lost:
        if (r6 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x004f, code lost:
        r5.printStackTrace();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap a(android.content.Context r5, android.net.Uri r6) {
        /*
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inJustDecodeBounds = r1
            android.content.Context r1 = r5.getApplicationContext()
            android.content.ContentResolver r1 = r1.getContentResolver()
            r2 = 0
            java.io.InputStream r6 = r1.openInputStream(r6)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L4a
            if (r6 == 0) goto L36
            byte[] r1 = a(r6)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L34
            int r3 = r1.length     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L34
            r4 = 0
            android.graphics.BitmapFactory.decodeByteArray(r1, r4, r3, r0)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L34
            a(r5, r0)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L34
            int r5 = r1.length     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L34
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeByteArray(r1, r4, r5, r0)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L34
            r6.close()     // Catch: java.io.IOException -> L2c
            goto L30
        L2c:
            r6 = move-exception
            r6.printStackTrace()
        L30:
            return r5
        L31:
            r5 = move-exception
            r2 = r6
            goto L3f
        L34:
            goto L4c
        L36:
            if (r6 == 0) goto L52
        L38:
            r6.close()     // Catch: java.io.IOException -> L3c
            goto L52
        L3c:
            r5 = move-exception
            goto L4f
        L3e:
            r5 = move-exception
        L3f:
            if (r2 == 0) goto L49
            r2.close()     // Catch: java.io.IOException -> L45
            goto L49
        L45:
            r6 = move-exception
            r6.printStackTrace()
        L49:
            throw r5
        L4a:
            r6 = r2
        L4c:
            if (r6 == 0) goto L52
            goto L38
        L4f:
            r5.printStackTrace()
        L52:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.util.b.a(android.content.Context, android.net.Uri):android.graphics.Bitmap");
    }

    public static Bitmap a(Bitmap bitmap, float f10) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setRotate(f10, width / 2, height / 2);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        if (!createBitmap.equals(bitmap) && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static Bitmap a(Bitmap bitmap, float f10, float f11) {
        if (f10 <= 0.0f || f11 <= 0.0f) {
            return null;
        }
        float f12 = 1.0f / f10;
        float f13 = 1.0f / f11;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i10 = (int) (width * f10);
        int i11 = (int) (height * f11);
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int[] iArr2 = new int[i10 * i11];
        for (int i12 = 0; i12 < i11; i12++) {
            for (int i13 = 0; i13 < i10; i13++) {
                iArr2[(i12 * i10) + i13] = iArr[(((int) (i12 * f13)) * width) + ((int) (i13 * f12))];
            }
        }
        Log.d(">>>", "dstPixels:" + i10 + " x " + i11);
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr2, 0, i10, 0, 0, i10, i11);
        return createBitmap;
    }

    public static Bitmap a(Bitmap bitmap, int i10) {
        float f10;
        if (i10 == 0) {
            f10 = 90.0f;
        } else if (i10 == 2) {
            f10 = 270.0f;
        } else if (i10 != 3) {
            return bitmap;
        } else {
            f10 = 180.0f;
        }
        return a(bitmap, f10);
    }

    public static Bitmap a(Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return null;
        }
        return a(bitmap, i10 / bitmap.getWidth(), i11 / bitmap.getHeight());
    }

    private static String a(Context context, Uri uri, String str) {
        String str2;
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, str, null, null);
            if (query != null) {
                r8 = query.moveToFirst() ? query.getString(query.getColumnIndex("_data")) : null;
                query.close();
            }
            return r8;
        } catch (IllegalStateException unused) {
            str2 = "IllegalStateException in getImagePath";
            a.b("ScankitUtils", str2);
            return null;
        } catch (Exception unused2) {
            str2 = "Exception in getImagePath";
            a.b("ScankitUtils", str2);
            return null;
        }
    }

    public static String a(String str) {
        String permissionToOp;
        if (Build.VERSION.SDK_INT >= 23) {
            permissionToOp = AppOpsManager.permissionToOp(str);
            return permissionToOp;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(android.content.Context r10, android.graphics.BitmapFactory.Options r11) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.util.b.a(android.content.Context, android.graphics.BitmapFactory$Options):void");
    }

    public static boolean a(Context context) {
        String str;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        boolean z10 = identifier > 0 ? resources.getBoolean(identifier) : false;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Method method = cls.getMethod("get", String.class);
            Object[] objArr = new Object[1];
            objArr[0] = "qemu.hw.mainkeys";
            str = (String) method.invoke(cls, objArr);
        } catch (Exception unused) {
            a.c("Uuils", "checkDeviceHasNavigationBar Exception");
        }
        if ("1".equals(str)) {
            return false;
        }
        if ("0".equals(str)) {
            return true;
        }
        return z10;
    }

    public static boolean a(byte[] bArr, int i10) {
        return i10 >= 0 && i10 < bArr.length;
    }

    public static boolean a(float[] fArr, int i10) {
        return i10 >= 0 && i10 < fArr.length;
    }

    public static boolean a(int[] iArr, int i10) {
        return i10 >= 0 && i10 < iArr.length;
    }

    public static boolean a(String[] strArr, int i10) {
        return i10 >= 0 && i10 < strArr.length;
    }

    public static boolean a(byte[][] bArr, int i10) {
        return i10 >= 0 && i10 < bArr.length;
    }

    public static boolean a(int[][] iArr, int i10) {
        return i10 >= 0 && i10 < iArr.length;
    }

    public static byte[] a(InputStream inputStream) {
        byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static HmsScan[] a(HmsScan[] hmsScanArr) {
        if (hmsScanArr != null && hmsScanArr.length != 0) {
            for (HmsScan hmsScan : hmsScanArr) {
                if (hmsScan != null) {
                    hmsScan.scanType = b(hmsScan.scanType);
                }
            }
        }
        return hmsScanArr;
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == HmsScanBase.QRCODE_SCAN_TYPE) {
            return DfuBaseService.ERROR_REMOTE_TYPE_LEGACY;
        }
        if (i10 == HmsScanBase.AZTEC_SCAN_TYPE) {
            return 4096;
        }
        if (i10 == HmsScanBase.DATAMATRIX_SCAN_TYPE) {
            return 16;
        }
        if (i10 == HmsScanBase.PDF417_SCAN_TYPE) {
            return 2048;
        }
        if (i10 == HmsScanBase.CODE39_SCAN_TYPE) {
            return 2;
        }
        if (i10 == HmsScanBase.CODE93_SCAN_TYPE) {
            return 4;
        }
        if (i10 == HmsScanBase.CODE128_SCAN_TYPE) {
            return 1;
        }
        if (i10 == HmsScanBase.EAN13_SCAN_TYPE) {
            return 32;
        }
        if (i10 == HmsScanBase.EAN8_SCAN_TYPE) {
            return 64;
        }
        if (i10 == HmsScanBase.ITF14_SCAN_TYPE) {
            return 128;
        }
        if (i10 == HmsScanBase.UPCCODE_A_SCAN_TYPE) {
            return DfuBaseService.ERROR_REMOTE_TYPE_SECURE;
        }
        if (i10 == HmsScanBase.UPCCODE_E_SCAN_TYPE) {
            return DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (i10 == HmsScanBase.CODABAR_SCAN_TYPE) {
            return 8;
        }
        return i10;
    }

    private static String b(Context context, Intent intent) {
        Uri data = new Intent(intent).getData();
        if (DocumentsContract.isDocumentUri(context, data)) {
            String documentId = DocumentsContract.getDocumentId(data);
            if ("com.android.providers.media.documents".equals(data.getAuthority())) {
                return a(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, a.b.b("_id=", documentId.split(":")[1]));
            } else if (!"com.android.providers.downloads.documents".equals(data.getAuthority())) {
                return null;
            } else {
                try {
                    return a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(documentId)), (String) null);
                } catch (NumberFormatException unused) {
                    a.b("ScankitUtils", "NumberFormatException in withAppendedId");
                    return null;
                } catch (Exception unused2) {
                    a.b("ScankitUtils", "Exception in withAppendedId");
                    return null;
                }
            }
        } else if (!"content".equalsIgnoreCase(data.getScheme())) {
            return null;
        } else {
            return a(context, data, (String) null);
        }
    }

    public static boolean b(Activity activity) {
        return a(activity) == 102;
    }

    public static boolean b(Context context) {
        String str;
        if (TextUtils.isEmpty(f8178a)) {
            try {
                f8178a = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("scanExt", "unSet");
            } catch (PackageManager.NameNotFoundException unused) {
                str = "checkPermission NameNotFoundException";
                Log.e("scanerror", str);
                return "readUri".equals(f8178a);
            } catch (Exception unused2) {
                str = "checkPermission Exception";
                Log.e("scanerror", str);
                return "readUri".equals(f8178a);
            }
        }
        return "readUri".equals(f8178a);
    }

    public static boolean c(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        return rotation == 0 || rotation == 2;
    }

    public static boolean c(Context context) {
        if (b(context) && TextUtils.isEmpty(f8179b)) {
            f8179b = context.getSharedPreferences("scanExt", 0).getString("scanExt", "unSet");
        }
        return "forbid".equals(f8179b);
    }

    public static boolean d(Context context) {
        boolean isInMultiWindowMode;
        if (Build.VERSION.SDK_INT >= 24 && (context instanceof Activity)) {
            isInMultiWindowMode = ((Activity) context).isInMultiWindowMode();
            if (isInMultiWindowMode) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Context context) {
        try {
            return "CN".equalsIgnoreCase(SystemPropUtils.getProperty("get", "ro.hw.country", "android.os.SystemProperties", GrsBaseInfo.CountryCodeSource.UNKNOWN));
        } catch (RuntimeException | Exception unused) {
            return false;
        }
    }
}
