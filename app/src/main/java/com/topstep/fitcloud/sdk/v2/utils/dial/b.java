package com.topstep.fitcloud.sdk.v2.utils.dial;

import a0.m;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.appcompat.widget.u0;
import com.topstep.fitcloud.sdk.v2.utils.dial.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000do.a;

/* loaded from: classes2.dex */
public final class b {
    public static long a(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static void b(File file, File file2) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    fileInputStream.close();
                    return;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static void c(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length();
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#DialWriter");
        bVar.p("check_crc16 fileSize:%d", Long.valueOf(length));
        int i10 = (int) (length - 512);
        byte[] bArr = new byte[i10];
        randomAccessFile.seek(512L);
        randomAccessFile.readFully(bArr, 0, i10);
        for (int i11 = 372; i11 < 404; i11++) {
            bArr[i11] = -1;
        }
        int i12 = (int) ((length + 16) - 1536);
        int f10 = f(f(0, 12, 740, bArr), 1008, i12, bArr);
        if (f10 == 0) {
            bArr[372] = 0;
            f10 = f(f(0, 12, 740, bArr), 1008, i12, bArr);
        }
        randomAccessFile.seek(518L);
        randomAccessFile.write(new byte[]{(byte) (f10 & 255), (byte) ((f10 >> 8) & 255)});
    }

    public static void d(RandomAccessFile randomAccessFile, int i10, Bitmap bitmap, boolean z10) {
        String str;
        long j10;
        int i11;
        int i12;
        Bitmap createBitmap;
        Canvas canvas;
        float f10;
        float f11;
        int i13;
        float f12;
        float f13;
        int i14;
        int i15;
        int i16;
        int i17 = i10;
        Bitmap bitmap2 = bitmap;
        if (i17 == 1) {
            str = "Background";
        } else {
            str = "Preview";
        }
        byte[] bArr = new byte[4];
        randomAccessFile.seek(1912L);
        randomAccessFile.read(bArr);
        long a10 = a(0, bArr) + 1536;
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#DialWriter");
        bVar.b("modifyBitmap[%s] bmpAddrOffset:%d", str, Long.valueOf(a10));
        if (i17 == 1) {
            j10 = 1830;
        } else {
            j10 = 1880;
        }
        randomAccessFile.seek(j10);
        randomAccessFile.read(bArr);
        int g10 = g(0, bArr);
        bVar.t("Fc#DialWriter");
        bVar.b("modifyBitmap[%s] bmpNum:%d", str, Integer.valueOf(g10));
        long j11 = (g10 * 8) + 1920;
        randomAccessFile.seek(j11);
        randomAccessFile.read(bArr);
        int g11 = g(0, bArr);
        int g12 = g(2, bArr);
        bVar.t("Fc#DialWriter");
        bVar.b("modifyBitmap[%s] need size[%d,%d]", str, Integer.valueOf(g11), Integer.valueOf(g12));
        if (bitmap2 != null && !bitmap.isRecycled()) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            bVar.t("Fc#DialWriter");
            bVar.b("modifyBitmap[%s] bitmap size[%d,%d]", str, Integer.valueOf(width), Integer.valueOf(height));
            if (g11 == width && g12 == height) {
                i14 = g12;
                i13 = g11;
            } else if (!z10) {
                if (i17 == 1) {
                    i15 = 3;
                } else {
                    i15 = 5;
                }
                throw new a(i15);
            } else {
                try {
                    createBitmap = Bitmap.createBitmap(g11, g12, Bitmap.Config.RGB_565);
                    canvas = new Canvas(createBitmap);
                    f10 = g11;
                    f11 = width;
                    i13 = g11;
                    f12 = g12;
                    f13 = height;
                    i14 = g12;
                } catch (Exception e10) {
                    e = e10;
                }
                try {
                    float max = Math.max(f10 / f11, f12 / f13);
                    canvas.scale(max, max);
                    canvas.translate((f10 - (f11 * max)) / 2.0f, (f12 - (max * f13)) / 2.0f);
                    Paint paint = new Paint();
                    paint.setFilterBitmap(true);
                    canvas.drawBitmap(bitmap2, new Matrix(), paint);
                    bitmap2 = createBitmap;
                } catch (Exception e11) {
                    e = e11;
                    i17 = i10;
                    a.b bVar2 = p000do.a.f13275a;
                    bVar2.t("Fc#DialWriter");
                    bVar2.r(e, "Scale Bitmap[%s] failed", str);
                    if (i17 == 1) {
                        i12 = 2;
                    } else {
                        i12 = 4;
                    }
                    throw new a(i12);
                }
            }
            randomAccessFile.seek(j11 + 4);
            randomAccessFile.read(bArr);
            long a11 = a(0, bArr) + a10;
            bVar.t("Fc#DialWriter");
            bVar.b("modifyBitmap[%s] bmpOffset:%s", str, Long.valueOf(a11));
            int i18 = i13;
            int[] iArr = new int[i18];
            byte[] bArr2 = new byte[i18 * 2];
            int i19 = i14;
            int i20 = 0;
            while (i20 < i19) {
                int i21 = i20;
                try {
                    bitmap2.getPixels(iArr, 0, i18, 0, i21, i18, 1);
                    for (int i22 = 0; i22 < i18; i22++) {
                        int i23 = iArr[i22];
                        int i24 = i22 * 2;
                        bArr2[i24] = (byte) ((((i23 >> 19) & 31) << 3) | ((i23 >> 13) & 7));
                        bArr2[i24 + 1] = (byte) ((((i23 >> 10) & 7) << 5) | ((i23 >> 3) & 31));
                    }
                    randomAccessFile.seek((i21 * 4) + a11);
                    randomAccessFile.read(bArr);
                    randomAccessFile.seek(a(0, bArr) + a10 + 4);
                    randomAccessFile.write(bArr2);
                    i20 = i21 + 1;
                    bitmap2 = bitmap2;
                    i18 = i18;
                } catch (Exception e12) {
                    a.b bVar3 = p000do.a.f13275a;
                    bVar3.t("Fc#DialWriter");
                    bVar3.r(e12, "Get Bitmap Pixels [%s] failed", str);
                    if (i10 == 1) {
                        i16 = 2;
                    } else {
                        i16 = 4;
                    }
                    throw new a(i16);
                }
            }
            return;
        }
        if (i17 == 1) {
            i11 = 2;
        } else {
            i11 = 4;
        }
        throw new a(i11);
    }

    public static void e(RandomAccessFile randomAccessFile, a.EnumC0212a enumC0212a) {
        long j10;
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#DialWriter");
        bVar.b("modifyStylePosition to %s", enumC0212a.toString());
        randomAccessFile.seek(1572L);
        randomAccessFile.write(new byte[]{0, 0, 0, 0});
        if (enumC0212a == a.EnumC0212a.BOTTOM) {
            return;
        }
        byte[] bArr = new byte[4];
        randomAccessFile.seek(1612L);
        randomAccessFile.read(bArr);
        int g10 = g(0, bArr);
        int g11 = g(2, bArr);
        bVar.t("Fc#DialWriter");
        bVar.b("modifyStylePosition old[%d,%d]", Integer.valueOf(g10), Integer.valueOf(g11));
        if (enumC0212a == a.EnumC0212a.TOP) {
            j10 = 1732;
        } else if (enumC0212a == a.EnumC0212a.LEFT) {
            j10 = 1736;
        } else {
            j10 = 1740;
        }
        randomAccessFile.seek(j10);
        randomAccessFile.read(bArr);
        int g12 = g(0, bArr);
        int g13 = g(2, bArr);
        bVar.t("Fc#DialWriter");
        bVar.b("modifyStylePosition new[%d,%d]", Integer.valueOf(g12), Integer.valueOf(g13));
        int i10 = g12 - g10;
        int i11 = g13 - g11;
        randomAccessFile.seek(1612L);
        randomAccessFile.write(bArr);
        long[] jArr = {1616, 1628, 1652};
        for (int i12 = 0; i12 < 3; i12++) {
            long j11 = jArr[i12];
            randomAccessFile.seek(j11);
            randomAccessFile.read(bArr);
            int g14 = g(0, bArr) + i10;
            int g15 = g(2, bArr) + i11;
            bArr[0] = (byte) (g14 & 255);
            bArr[1] = (byte) ((g14 >> 8) & 255);
            bArr[2] = (byte) (g15 & 255);
            bArr[3] = (byte) ((g15 >> 8) & 255);
            randomAccessFile.seek(j11);
            randomAccessFile.write(bArr);
        }
    }

    public static int f(int i10, int i11, int i12, byte[] bArr) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = m.f121a[(i10 ^ bArr[i11 + i13]) & 255] ^ (i10 >> 8);
        }
        return i10;
    }

    public static int g(int i10, byte[] bArr) {
        return ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
    }

    /* loaded from: classes2.dex */
    public static class a extends Exception {
        public a(int i10) {
            super(u0.a("Error code:", i10));
        }

        public a(int i10, Exception exc) {
            super(u0.a("Error code:", i10), exc);
        }
    }
}
