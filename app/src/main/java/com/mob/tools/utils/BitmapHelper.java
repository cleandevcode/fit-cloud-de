package com.mob.tools.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.opengl.GLES10;
import android.text.TextUtils;
import android.view.View;
import com.huawei.hms.framework.common.ContainerUtils;
import com.mob.commons.n;
import com.mob.tools.MobLog;
import com.mob.tools.network.HttpConnection;
import com.mob.tools.network.HttpResponseCallback;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public class BitmapHelper implements PublicMemberKeeper {

    /* renamed from: a */
    private static int f9181a;

    /* renamed from: b */
    private static int f9182b;

    static {
        int[] iArr = new int[1];
        GLES10.glGetIntegerv(3379, iArr, 0);
        int max = Math.max(iArr[0], 2048);
        f9181a = max;
        f9182b = max;
    }

    private static Bitmap a(Bitmap bitmap, int i10, boolean z10) {
        Bitmap bitmap2;
        int i11;
        int i12;
        int[] iArr;
        int[] iArr2;
        int i13 = i10;
        Bitmap copy = z10 ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        if (i13 < 1) {
            return null;
        }
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i14 = width * height;
        int[] iArr3 = new int[i14];
        copy.getPixels(iArr3, 0, width, 0, 0, width, height);
        int i15 = width - 1;
        int i16 = height - 1;
        int i17 = i13 + i13 + 1;
        int[] iArr4 = new int[i14];
        int[] iArr5 = new int[i14];
        int[] iArr6 = new int[i14];
        int[] iArr7 = new int[Math.max(width, height)];
        int i18 = (i17 + 1) >> 1;
        int i19 = i18 * i18;
        int i20 = i19 * DfuBaseService.ERROR_REMOTE_TYPE_LEGACY;
        int[] iArr8 = new int[i20];
        for (int i21 = 0; i21 < i20; i21++) {
            iArr8[i21] = i21 / i19;
        }
        int[][] iArr9 = (int[][]) Array.newInstance(Integer.TYPE, i17, 3);
        int i22 = i13 + 1;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        while (true) {
            bitmap2 = copy;
            if (i23 >= height) {
                break;
            }
            int i26 = height;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            int i32 = 0;
            int i33 = 0;
            int i34 = 0;
            int i35 = -i13;
            int i36 = 0;
            while (true) {
                i12 = i16;
                iArr = iArr7;
                if (i35 > i13) {
                    break;
                }
                int i37 = iArr3[Math.min(i15, Math.max(i35, 0)) + i24];
                int[] iArr10 = iArr9[i35 + i13];
                iArr10[0] = (i37 & 16711680) >> 16;
                iArr10[1] = (i37 & 65280) >> 8;
                iArr10[2] = i37 & 255;
                int abs = i22 - Math.abs(i35);
                int i38 = iArr10[0];
                i36 += i38 * abs;
                int i39 = iArr10[1];
                i27 = (i39 * abs) + i27;
                int i40 = iArr10[2];
                i28 = (abs * i40) + i28;
                if (i35 > 0) {
                    i32 += i38;
                    i33 += i39;
                    i34 += i40;
                } else {
                    i29 += i38;
                    i30 += i39;
                    i31 += i40;
                }
                i35++;
                i16 = i12;
                iArr7 = iArr;
            }
            int i41 = i13;
            int i42 = i36;
            int i43 = 0;
            while (i43 < width) {
                iArr4[i24] = iArr8[i42];
                iArr5[i24] = iArr8[i27];
                iArr6[i24] = iArr8[i28];
                int i44 = i42 - i29;
                int i45 = i27 - i30;
                int i46 = i28 - i31;
                int[] iArr11 = iArr9[((i41 - i13) + i17) % i17];
                int i47 = i29 - iArr11[0];
                int i48 = i30 - iArr11[1];
                int i49 = i31 - iArr11[2];
                if (i23 == 0) {
                    iArr2 = iArr8;
                    iArr[i43] = Math.min(i43 + i13 + 1, i15);
                } else {
                    iArr2 = iArr8;
                }
                int i50 = iArr3[i25 + iArr[i43]];
                int i51 = (i50 & 16711680) >> 16;
                iArr11[0] = i51;
                int i52 = (i50 & 65280) >> 8;
                iArr11[1] = i52;
                int i53 = i50 & 255;
                iArr11[2] = i53;
                int i54 = i32 + i51;
                int i55 = i33 + i52;
                int i56 = i34 + i53;
                i42 = i44 + i54;
                i27 = i45 + i55;
                i28 = i46 + i56;
                i41 = (i41 + 1) % i17;
                int[] iArr12 = iArr9[i41 % i17];
                int i57 = iArr12[0];
                i29 = i47 + i57;
                int i58 = iArr12[1];
                i30 = i48 + i58;
                int i59 = iArr12[2];
                i31 = i49 + i59;
                i32 = i54 - i57;
                i33 = i55 - i58;
                i34 = i56 - i59;
                i24++;
                i43++;
                iArr8 = iArr2;
            }
            i25 += width;
            i23++;
            copy = bitmap2;
            height = i26;
            i16 = i12;
            iArr7 = iArr;
        }
        int i60 = i16;
        int[] iArr13 = iArr7;
        int i61 = height;
        int[] iArr14 = iArr8;
        int i62 = 0;
        while (i62 < width) {
            int i63 = -i13;
            int i64 = i17;
            int[] iArr15 = iArr3;
            int i65 = 0;
            int i66 = 0;
            int i67 = 0;
            int i68 = 0;
            int i69 = 0;
            int i70 = 0;
            int i71 = 0;
            int i72 = i63;
            int i73 = i63 * width;
            int i74 = 0;
            int i75 = 0;
            while (true) {
                i11 = width;
                if (i72 > i13) {
                    break;
                }
                int max = Math.max(0, i73) + i62;
                int[] iArr16 = iArr9[i72 + i13];
                iArr16[0] = iArr4[max];
                iArr16[1] = iArr5[max];
                iArr16[2] = iArr6[max];
                int abs2 = i22 - Math.abs(i72);
                i74 = (iArr4[max] * abs2) + i74;
                i75 = (iArr5[max] * abs2) + i75;
                i65 = (iArr6[max] * abs2) + i65;
                if (i72 > 0) {
                    i69 += iArr16[0];
                    i70 += iArr16[1];
                    i71 += iArr16[2];
                } else {
                    i66 += iArr16[0];
                    i67 += iArr16[1];
                    i68 += iArr16[2];
                }
                int i76 = i60;
                if (i72 < i76) {
                    i73 += i11;
                }
                i72++;
                i60 = i76;
                width = i11;
            }
            int i77 = i60;
            int i78 = i13;
            int i79 = i62;
            int i80 = i75;
            int i81 = i61;
            int i82 = i74;
            int i83 = 0;
            while (i83 < i81) {
                iArr15[i79] = (iArr15[i79] & (-16777216)) | (iArr14[i82] << 16) | (iArr14[i80] << 8) | iArr14[i65];
                int i84 = i82 - i66;
                int i85 = i80 - i67;
                int i86 = i65 - i68;
                int[] iArr17 = iArr9[((i78 - i13) + i64) % i64];
                int i87 = i66 - iArr17[0];
                int i88 = i67 - iArr17[1];
                int i89 = i68 - iArr17[2];
                if (i62 == 0) {
                    iArr13[i83] = Math.min(i83 + i22, i77) * i11;
                }
                int i90 = iArr13[i83] + i62;
                int i91 = iArr4[i90];
                iArr17[0] = i91;
                int i92 = iArr5[i90];
                iArr17[1] = i92;
                int i93 = iArr6[i90];
                iArr17[2] = i93;
                int i94 = i69 + i91;
                int i95 = i70 + i92;
                int i96 = i71 + i93;
                i82 = i84 + i94;
                i80 = i85 + i95;
                i65 = i86 + i96;
                i78 = (i78 + 1) % i64;
                int[] iArr18 = iArr9[i78];
                int i97 = iArr18[0];
                i66 = i87 + i97;
                int i98 = iArr18[1];
                i67 = i88 + i98;
                int i99 = iArr18[2];
                i68 = i89 + i99;
                i69 = i94 - i97;
                i70 = i95 - i98;
                i71 = i96 - i99;
                i79 += i11;
                i83++;
                i13 = i10;
            }
            i62++;
            i13 = i10;
            i60 = i77;
            i61 = i81;
            i17 = i64;
            iArr3 = iArr15;
            width = i11;
        }
        int i100 = width;
        bitmap2.setPixels(iArr3, 0, i100, 0, 0, i100, i61);
        return bitmap2;
    }

    private static String a(byte[] bArr) {
        byte[] bArr2 = {-1, -40, -1, -31};
        if (a(bArr, new byte[]{-1, -40, -1, -32}) || a(bArr, bArr2)) {
            return "jpg";
        }
        if (a(bArr, new byte[]{-119, 80, 78, 71})) {
            return "png";
        }
        if (a(bArr, "GIF".getBytes())) {
            return "gif";
        }
        if (a(bArr, "BM".getBytes())) {
            return "bmp";
        }
        return (a(bArr, new byte[]{73, 73, 42}) || a(bArr, new byte[]{77, 77, 42})) ? "tif" : "";
    }

    private static boolean a(Bitmap bitmap) {
        return bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0;
    }

    private static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static String b(HttpConnection httpConnection, String str) {
        String str2;
        List<String> list;
        String trim;
        int lastIndexOf;
        StringBuilder a10;
        String substring;
        List<String> list2;
        String[] split;
        Map<String, List<String>> headerFields = httpConnection.getHeaderFields();
        String str3 = null;
        if (headerFields != null && (list2 = headerFields.get("Content-Disposition")) != null && list2.size() > 0) {
            str2 = null;
            for (String str4 : list2.get(0).split(";")) {
                if (str4.trim().startsWith("filename")) {
                    String[] split2 = str4.split(ContainerUtils.KEY_VALUE_DELIMITER);
                    if (split2.length >= 2) {
                        str2 = split2[1];
                        if (!TextUtils.isEmpty(str2) && str2.startsWith("\"") && str2.endsWith("\"")) {
                            str2 = str2.substring(1, str2.length() - 1);
                        }
                    }
                }
            }
        } else {
            str2 = null;
        }
        if (str2 == null) {
            String MD5 = Data.MD5(str);
            if (headerFields != null && (list = headerFields.get("Content-Type")) != null && list.size() > 0) {
                String str5 = list.get(0);
                if (str5 == null) {
                    trim = "";
                } else {
                    trim = str5.trim();
                }
                if (trim.startsWith("image/")) {
                    substring = trim.substring(6);
                    a10 = p.a.a(MD5, ".");
                    if ("jpeg".equals(substring)) {
                        substring = "jpg";
                    }
                } else {
                    int lastIndexOf2 = str.lastIndexOf(47);
                    if (lastIndexOf2 > 0) {
                        str3 = str.substring(lastIndexOf2 + 1);
                    }
                    if (str3 != null && str3.length() > 0 && (lastIndexOf = str3.lastIndexOf(46)) > 0 && str3.length() - lastIndexOf < 10) {
                        a10 = android.support.v4.media.d.a(MD5);
                        substring = str3.substring(lastIndexOf);
                    } else {
                        return MD5;
                    }
                }
                a10.append(substring);
                return a10.toString();
            }
            return MD5;
        }
        return str2;
    }

    public static Bitmap blur(Bitmap bitmap, int i10, int i11) {
        float f10 = i11;
        Bitmap createBitmap = Bitmap.createBitmap((int) ((bitmap.getWidth() / f10) + 0.5f), (int) ((bitmap.getHeight() / f10) + 0.5f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f11 = 1.0f / f10;
        canvas.scale(f11, f11);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        a(createBitmap, (int) ((i10 / f10) + 0.5f), true);
        return createBitmap;
    }

    public static Bitmap captureView(View view, int i10, int i11) {
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public static Bitmap compressByQuality(Bitmap bitmap, int i10) {
        return compressByQuality(bitmap, i10, false);
    }

    public static Bitmap compressByQuality(Bitmap bitmap, int i10, boolean z10) {
        if (a(bitmap)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i10, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z10 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
    }

    public static Bitmap compressByQuality(Bitmap bitmap, long j10) {
        return compressByQuality(bitmap, j10, false);
    }

    public static Bitmap compressByQuality(Bitmap bitmap, long j10, boolean z10) {
        if (a(bitmap) || j10 <= 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 100;
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        if (byteArrayOutputStream.size() > j10) {
            byteArrayOutputStream.reset();
            bitmap.compress(Bitmap.CompressFormat.JPEG, 0, byteArrayOutputStream);
            if (byteArrayOutputStream.size() < j10) {
                int i11 = 0;
                int i12 = 0;
                while (i11 < i10) {
                    i12 = (i11 + i10) / 2;
                    byteArrayOutputStream.reset();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i12, byteArrayOutputStream);
                    int i13 = (byteArrayOutputStream.size() > j10 ? 1 : (byteArrayOutputStream.size() == j10 ? 0 : -1));
                    if (i13 == 0) {
                        break;
                    } else if (i13 > 0) {
                        i10 = i12 - 1;
                    } else {
                        i11 = i12 + 1;
                    }
                }
                if (i10 == i12 - 1) {
                    byteArrayOutputStream.reset();
                    bitmap.compress(Bitmap.CompressFormat.JPEG, i11, byteArrayOutputStream);
                }
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z10 && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
    }

    public static Bitmap cropBitmap(Bitmap bitmap, int i10, int i11, int i12, int i13) {
        int width = (bitmap.getWidth() - i10) - i12;
        int height = (bitmap.getHeight() - i11) - i13;
        if (width == bitmap.getWidth() && height == bitmap.getHeight()) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, -i10, -i11, new Paint());
        return createBitmap;
    }

    public static String downloadBitmap(Context context, final String str) {
        final String cachePath = ResHelper.getCachePath(context, "images");
        File file = new File(cachePath, Data.MD5(str));
        if (file.exists()) {
            return file.getAbsolutePath();
        }
        final HashMap hashMap = new HashMap();
        new NetworkHelper().rawGet(str, new HttpResponseCallback() { // from class: com.mob.tools.utils.BitmapHelper.1
            @Override // com.mob.tools.network.HttpResponseCallback
            public void onResponse(HttpConnection httpConnection) {
                Bitmap.CompressFormat compressFormat;
                int i10;
                int responseCode = httpConnection.getResponseCode();
                if (responseCode != 200) {
                    StringBuilder sb2 = new StringBuilder();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpConnection.getErrorStream(), Charset.forName("utf-8")));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (sb2.length() > 0) {
                            sb2.append('\n');
                        }
                        sb2.append(readLine);
                    }
                    bufferedReader.close();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(n.b("005h,cgcgdbcg"), sb2.toString());
                    hashMap2.put(n.b("006>ef1cWce+cWcbef"), Integer.valueOf(responseCode));
                    throw new Throwable(HashonHelper.fromHashMap(hashMap2));
                }
                String b10 = BitmapHelper.b(httpConnection, str);
                File file2 = new File(cachePath, b10);
                if (!file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                if (file2.exists()) {
                    file2.delete();
                }
                try {
                    Bitmap bitmap = BitmapHelper.getBitmap(new FilterInputStream(httpConnection.getInputStream()) { // from class: com.mob.tools.utils.BitmapHelper.1.1
                        @Override // java.io.FilterInputStream, java.io.InputStream
                        public long skip(long j10) {
                            long j11 = 0;
                            while (j11 < j10) {
                                long skip = ((FilterInputStream) this).in.skip(j10 - j11);
                                if (skip == 0) {
                                    break;
                                }
                                j11 += skip;
                            }
                            return j11;
                        }
                    }, 1);
                    if (bitmap == null || bitmap.isRecycled()) {
                        return;
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    if (b10.toLowerCase().endsWith(".gif") || b10.toLowerCase().endsWith(".png")) {
                        compressFormat = Bitmap.CompressFormat.PNG;
                        i10 = 100;
                    } else {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                        i10 = 80;
                    }
                    bitmap.compress(compressFormat, i10, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    hashMap.put("bitmap", file2.getAbsolutePath());
                } catch (Throwable th2) {
                    if (file2.exists()) {
                        file2.delete();
                    }
                    throw th2;
                }
            }
        }, (NetworkHelper.NetworkTimeOut) null);
        return (String) hashMap.get("bitmap");
    }

    public static int[] fixRect(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[2];
        int i10 = iArr[0];
        int i11 = iArr[1];
        float f10 = i10 / i11;
        int i12 = iArr2[0];
        int i13 = iArr2[1];
        if (f10 > i12 / i13) {
            iArr3[0] = i12;
            iArr3[1] = (int) (((i11 * iArr2[0]) / iArr[0]) + 0.5f);
        } else {
            iArr3[1] = i13;
            iArr3[0] = (int) (((i10 * iArr2[1]) / iArr[1]) + 0.5f);
        }
        return iArr3;
    }

    public static int[] fixRect_2(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[2];
        int i10 = iArr[0];
        int i11 = iArr[1];
        float f10 = i10 / i11;
        int i12 = iArr2[0];
        int i13 = iArr2[1];
        if (f10 > i12 / i13) {
            iArr3[1] = i13;
            iArr3[0] = (int) (((i10 * iArr2[1]) / iArr[1]) + 0.5f);
        } else {
            iArr3[0] = i12;
            iArr3[1] = (int) (((i11 * iArr2[0]) / iArr[0]) + 0.5f);
        }
        return iArr3;
    }

    public static Bitmap getBitmap(Context context, String str) {
        return getBitmap(downloadBitmap(context, str));
    }

    public static Bitmap getBitmap(File file, int i10) {
        if (file == null || !file.exists()) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        Bitmap bitmap = getBitmap(fileInputStream, i10);
        fileInputStream.close();
        return bitmap;
    }

    public static Bitmap getBitmap(InputStream inputStream, int i10) {
        if (inputStream == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i10;
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static Bitmap getBitmap(String str) {
        return getBitmap(str, 1);
    }

    public static Bitmap getBitmap(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return getBitmap(new File(str), i10);
    }

    public static Bitmap getBitmapByCompressQuality(String str, int i10, int i11, int i12, long j10) {
        Bitmap bitmapByCompressSize = getBitmapByCompressSize(str, i10, i11);
        i12 = (i12 < 10 || i12 > 100) ? 100 : 100;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap.CompressFormat bmpFormat = getBmpFormat(str);
        bitmapByCompressSize.compress(bmpFormat, i12, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (j10 < 10240) {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            try {
                byteArrayOutputStream.close();
            } catch (Throwable unused) {
            }
            return decodeByteArray;
        }
        while (byteArray.length > j10 && i12 >= 11) {
            byteArrayOutputStream.reset();
            i12 -= 6;
            bitmapByCompressSize.compress(bmpFormat, i12, byteArrayOutputStream);
            byteArray = byteArrayOutputStream.toByteArray();
        }
        if (i12 != 100) {
            bitmapByCompressSize = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        }
        try {
            byteArrayOutputStream.close();
        } catch (Throwable unused2) {
        }
        return bitmapByCompressSize;
    }

    public static Bitmap getBitmapByCompressSize(String str, int i10, int i11) {
        int i12;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i13 = options.outWidth;
        int i14 = options.outHeight;
        if (i10 <= 1 || i11 <= 1) {
            i12 = 1;
        } else {
            float f10 = 1.0f;
            float min = (Math.min(i13, i14) * 1.0f) / Math.min(i10, i11);
            float max = (Math.max(i13, i14) * 1.0f) / Math.max(i10, i11);
            float f11 = i13 / i14;
            if (f11 <= 2.0f && f11 >= 0.5d) {
                float min2 = Math.min(min, max);
                while (true) {
                    float f12 = f10 * 2.0f;
                    if (f12 > min2) {
                        break;
                    }
                    f10 = f12;
                }
            } else {
                while (true) {
                    float f13 = f10 * 2.0f;
                    if (f13 > min) {
                        break;
                    }
                    f10 = f13;
                }
            }
            i12 = (int) f10;
        }
        int i15 = i12 >= 1 ? i12 : 1;
        while (true) {
            if (i13 / i15 <= f9181a && i14 / i15 <= f9182b) {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inPreferredConfig = Bitmap.Config.RGB_565;
                options2.inSampleSize = i15;
                return BitmapFactory.decodeFile(str, options2);
            }
            i15++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0044, code lost:
        if (r4.endsWith("gif") == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap.CompressFormat getBmpFormat(java.lang.String r4) {
        /*
            java.lang.String r0 = r4.toLowerCase()
            java.lang.String r1 = "png"
            boolean r2 = r0.endsWith(r1)
            if (r2 != 0) goto L4a
            java.lang.String r2 = "gif"
            boolean r3 = r0.endsWith(r2)
            if (r3 == 0) goto L15
            goto L4a
        L15:
            java.lang.String r3 = "jpg"
            boolean r3 = r0.endsWith(r3)
            if (r3 != 0) goto L47
            java.lang.String r3 = "jpeg"
            boolean r3 = r0.endsWith(r3)
            if (r3 != 0) goto L47
            java.lang.String r3 = "bmp"
            boolean r3 = r0.endsWith(r3)
            if (r3 != 0) goto L47
            java.lang.String r3 = "tif"
            boolean r0 = r0.endsWith(r3)
            if (r0 == 0) goto L36
            goto L47
        L36:
            java.lang.String r4 = getMime(r4)
            boolean r0 = r4.endsWith(r1)
            if (r0 != 0) goto L4a
            boolean r4 = r4.endsWith(r2)
            if (r4 == 0) goto L47
            goto L4a
        L47:
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG
            goto L4c
        L4a:
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG
        L4c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.tools.utils.BitmapHelper.getBmpFormat(java.lang.String):android.graphics.Bitmap$CompressFormat");
    }

    public static Bitmap.CompressFormat getBmpFormat(byte[] bArr) {
        String a10 = a(bArr);
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        return a10 != null ? (a10.endsWith("png") || a10.endsWith("gif")) ? Bitmap.CompressFormat.PNG : compressFormat : compressFormat;
    }

    public static String getMime(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[8];
            fileInputStream.read(bArr);
            fileInputStream.close();
            return a(bArr);
        } catch (Exception e10) {
            MobLog.getInstance().w(e10);
            return "";
        }
    }

    public static boolean isBlackBitmap(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return true;
        }
        int height = bitmap.getHeight() * bitmap.getWidth();
        int[] iArr = new int[height];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= height) {
                break;
            } else if ((iArr[i10] & 16777215) != 0) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        return !z10;
    }

    public static int mixAlpha(int i10, int i11) {
        int i12 = i10 >>> 24;
        int i13 = 255 - i12;
        return ((((((16711680 & i11) >>> 16) * i13) + (((i10 & 16711680) >>> 16) * i12)) / 255) << 16) | (-16777216) | ((((((65280 & i11) >>> 8) * i13) + (((i10 & 65280) >>> 8) * i12)) / 255) << 8) | (((i13 * (i11 & 255)) + (i12 * (i10 & 255))) / 255);
    }

    public static Bitmap roundBitmap(Bitmap bitmap, int i10, int i11, float f10, float f11, float f12, float f13) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Rect rect = new Rect(0, 0, width, height);
        Bitmap createBitmap = (width == i10 && height == i11) ? Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect2 = new Rect(0, 0, i10, i11);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        float[] fArr = {f10, f10, f11, f11, f12, f12, f13, f13};
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, new RectF(0.0f, 0.0f, 0.0f, 0.0f), fArr));
        shapeDrawable.setBounds(rect2);
        shapeDrawable.draw(canvas);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect2, paint);
        return createBitmap;
    }

    public static boolean save(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, boolean z10) {
        boolean z11;
        BufferedOutputStream bufferedOutputStream;
        if (a(bitmap) || !FileUtils.createFileByDeleteOldFile(file)) {
            return false;
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            z11 = bitmap.compress(compressFormat, 100, bufferedOutputStream);
            if (z10) {
                try {
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedOutputStream2 = bufferedOutputStream;
                    try {
                        MobLog.getInstance().d(th);
                        FileUtils.closeIO(bufferedOutputStream2);
                        return z11;
                    } catch (Throwable th4) {
                        FileUtils.closeIO(bufferedOutputStream2);
                        throw th4;
                    }
                }
            }
            FileUtils.closeIO(bufferedOutputStream);
        } catch (Throwable th5) {
            th = th5;
            bufferedOutputStream2 = bufferedOutputStream;
            z11 = false;
            MobLog.getInstance().d(th);
            FileUtils.closeIO(bufferedOutputStream2);
            return z11;
        }
        return z11;
    }

    public static boolean save(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        return save(bitmap, FileUtils.getFileByPath(str), compressFormat, false);
    }

    public static String saveBitmap(Context context, Bitmap bitmap) {
        return saveBitmap(context, bitmap, Bitmap.CompressFormat.JPEG, 80);
    }

    public static String saveBitmap(Context context, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i10) {
        String cachePath = ResHelper.getCachePath(context, "images");
        String str = compressFormat == Bitmap.CompressFormat.PNG ? ".png" : ".jpg";
        File file = new File(cachePath, String.valueOf(System.currentTimeMillis()) + str);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        bitmap.compress(compressFormat, i10, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        return file.getAbsolutePath();
    }

    public static String saveBitmapByCompress(String str, int i10, int i11, int i12) {
        Bitmap bitmapByCompressSize = getBitmapByCompressSize(str, i10, i11);
        if (i12 > 100) {
            i12 = 100;
        } else if (i12 < 10) {
            i12 = 10;
        }
        Bitmap.CompressFormat bmpFormat = getBmpFormat(str);
        String str2 = bmpFormat == Bitmap.CompressFormat.PNG ? ".png" : ".jpg";
        String parent = new File(str).getParent();
        File file = new File(parent, String.valueOf(System.currentTimeMillis()) + str2);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        bitmapByCompressSize.compress(bmpFormat, i12, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        return file.getAbsolutePath();
    }

    public static String saveViewToImage(View view) {
        if (view == null) {
            return null;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        return saveViewToImage(view, width, height);
    }

    public static String saveViewToImage(View view, int i10, int i11) {
        Bitmap captureView = captureView(view, i10, i11);
        if (captureView == null || captureView.isRecycled()) {
            return null;
        }
        String cachePath = ResHelper.getCachePath(view.getContext(), "screenshot");
        File file = new File(cachePath, String.valueOf(System.currentTimeMillis()) + ".jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        captureView.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        return file.getAbsolutePath();
    }

    public static Bitmap scaleBitmapByHeight(Context context, int i10, int i11) {
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i10);
        boolean z10 = i11 != decodeResource.getHeight();
        Bitmap scaleBitmapByHeight = scaleBitmapByHeight(decodeResource, i11);
        if (z10) {
            decodeResource.recycle();
        }
        return scaleBitmapByHeight;
    }

    public static Bitmap scaleBitmapByHeight(Bitmap bitmap, int i10) {
        return Bitmap.createScaledBitmap(bitmap, (bitmap.getWidth() * i10) / bitmap.getHeight(), i10, true);
    }
}
