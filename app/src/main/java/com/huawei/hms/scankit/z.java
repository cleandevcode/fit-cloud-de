package com.huawei.hms.scankit;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class z {

    /* renamed from: a */
    private static byte[] f8183a = null;

    /* renamed from: b */
    private static byte[] f8184b = null;

    /* renamed from: c */
    private static float[] f8185c = null;

    /* renamed from: d */
    private static int f8186d = 8136;

    public static float a(byte[] bArr, int i10) {
        return Float.intBitsToFloat((int) ((bArr[i10 + 3] << 24) | (16777215 & ((int) ((65535 & ((int) ((bArr[i10 + 0] & 255) | (bArr[i10 + 1] << 8)))) | (bArr[i10 + 2] << 16))))));
    }

    public static int a() {
        return f8186d;
    }

    public static void a(Context context, String str) {
        String str2;
        com.huawei.hms.scankit.util.a.c("MsModel", "load angle model...." + str);
        if (f8184b != null) {
            return;
        }
        try {
            InputStream open = context.getAssets().open(str);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("3inputStream");
            sb2.append(open);
            com.huawei.hms.scankit.util.a.c("MsModel", sb2.toString());
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            f8184b = bArr;
        } catch (IOException unused) {
            str2 = "loadAngleModel IOException";
            com.huawei.hms.scankit.util.a.b("MsModel", str2);
        } catch (Exception unused2) {
            str2 = "loadAngleModel Exception";
            com.huawei.hms.scankit.util.a.b("MsModel", str2);
        }
    }

    public static void b(Context context, String str) {
        String str2;
        com.huawei.hms.scankit.util.a.c("MsModel", "load model...." + str);
        if (f8183a != null) {
            return;
        }
        try {
            InputStream open = context.getAssets().open(str);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("inputStream");
            sb2.append(open);
            com.huawei.hms.scankit.util.a.c("MsModel", sb2.toString());
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            f8183a = bArr;
        } catch (IOException unused) {
            str2 = "loadModel IOException";
            com.huawei.hms.scankit.util.a.b("MsModel", str2);
        } catch (Exception unused2) {
            str2 = "loadModel Exception";
            com.huawei.hms.scankit.util.a.b("MsModel", str2);
        }
    }

    public static byte[] b() {
        return f8184b;
    }

    public static void c(Context context, String str) {
        String str2;
        com.huawei.hms.scankit.util.a.c("MsModel", "ms anrchos...." + str);
        if (f8185c != null) {
            return;
        }
        try {
            InputStream open = context.getAssets().open(str);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("2inputStream");
            sb2.append(open);
            com.huawei.hms.scankit.util.a.c("MsModel", sb2.toString());
            int available = open.available();
            byte[] bArr = new byte[available];
            open.read(bArr);
            open.close();
            f8185c = new float[available / 4];
            int i10 = 0;
            while (true) {
                float[] fArr = f8185c;
                if (i10 >= fArr.length) {
                    return;
                }
                fArr[i10] = a(bArr, i10 * 4);
                i10++;
            }
        } catch (IOException unused) {
            str2 = "loadMsAnchors IOException";
            com.huawei.hms.scankit.util.a.b("MsModel", str2);
        } catch (Exception unused2) {
            str2 = "loadMsAnchors Exception";
            com.huawei.hms.scankit.util.a.b("MsModel", str2);
        }
    }

    public static byte[] c() {
        return f8183a;
    }

    public static float[] d() {
        return f8185c;
    }
}
