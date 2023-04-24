package androidx.camera.core;

import a0.h0;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.net.Uri;
import android.os.Build;
import androidx.camera.core.h;
import b0.h;
import i0.a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import no.nordicsemi.android.dfu.DfuBaseService;
import s.c0;
import s.y;
import y.u0;

/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: a */
    public final j f1708a;

    /* renamed from: b */
    public final int f1709b;

    /* renamed from: c */
    public final int f1710c;

    /* renamed from: d */
    public final h.n f1711d;

    /* renamed from: e */
    public final Executor f1712e;

    /* renamed from: f */
    public final a f1713f;

    /* renamed from: g */
    public final Executor f1714g;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public enum b {
        FILE_IO_FAILED,
        ENCODE_FAILED,
        CROP_FAILED,
        UNKNOWN
    }

    public k(j jVar, h.n nVar, int i10, int i11, Executor executor, c0.g gVar, a aVar) {
        this.f1708a = jVar;
        this.f1711d = nVar;
        this.f1709b = i10;
        this.f1710c = i11;
        this.f1713f = aVar;
        this.f1712e = executor;
        this.f1714g = gVar;
    }

    public static void a(File file, OutputStream outputStream) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    fileInputStream.close();
                    return;
                }
                outputStream.write(bArr, 0, read);
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

    public static byte[] c(j jVar, int i10) {
        boolean z10;
        int f10 = jVar.f();
        int c10 = jVar.c();
        int width = jVar.z().width();
        int height = jVar.z().height();
        if (f10 == width && c10 == height) {
            z10 = false;
        } else {
            z10 = true;
        }
        int format = jVar.getFormat();
        if (format == 256) {
            if (!z10) {
                return i0.a.b(jVar);
            }
            Rect z11 = jVar.z();
            if (jVar.getFormat() == 256) {
                byte[] b10 = i0.a.b(jVar);
                try {
                    BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(b10, 0, b10.length, false);
                    Bitmap decodeRegion = newInstance.decodeRegion(z11, new BitmapFactory.Options());
                    newInstance.recycle();
                    if (decodeRegion != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        if (decodeRegion.compress(Bitmap.CompressFormat.JPEG, i10, byteArrayOutputStream)) {
                            decodeRegion.recycle();
                            return byteArrayOutputStream.toByteArray();
                        }
                        throw new a.C0286a("Encode bitmap failed.", 1);
                    }
                    throw new a.C0286a("Decode byte array failed.", 2);
                } catch (IOException unused) {
                    throw new a.C0286a("Decode byte array failed.", 2);
                } catch (IllegalArgumentException e10) {
                    throw new a.C0286a("Decode byte array failed with illegal argument." + e10, 2);
                }
            }
            StringBuilder a10 = android.support.v4.media.d.a("Incorrect image format of the input image proxy: ");
            a10.append(jVar.getFormat());
            throw new IllegalArgumentException(a10.toString());
        }
        Rect rect = null;
        if (format == 35) {
            if (z10) {
                rect = jVar.z();
            }
            if (jVar.getFormat() == 35) {
                byte[] c11 = i0.a.c(jVar);
                int f11 = jVar.f();
                int c12 = jVar.c();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                YuvImage yuvImage = new YuvImage(c11, 17, f11, c12, null);
                if (rect == null) {
                    rect = new Rect(0, 0, f11, c12);
                }
                if (yuvImage.compressToJpeg(rect, i10, byteArrayOutputStream2)) {
                    return byteArrayOutputStream2.toByteArray();
                }
                throw new a.C0286a("YuvImage failed to encode jpeg.", 1);
            }
            StringBuilder a11 = android.support.v4.media.d.a("Incorrect image format of the input image proxy: ");
            a11.append(jVar.getFormat());
            throw new IllegalArgumentException(a11.toString());
        }
        u0.h("ImageSaver", "Unrecognized image format: " + format);
        return null;
    }

    public final boolean b(File file, Uri uri) {
        OutputStream openOutputStream = this.f1711d.f1700b.openOutputStream(uri);
        if (openOutputStream == null) {
            if (openOutputStream != null) {
                openOutputStream.close();
            }
            return false;
        }
        try {
            a(file, openOutputStream);
            openOutputStream.close();
            return true;
        } catch (Throwable th2) {
            try {
                openOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void d(b bVar, String str, Exception exc) {
        try {
            this.f1712e.execute(new y(this, bVar, str, exc, 1));
        } catch (RejectedExecutionException unused) {
            u0.b("ImageSaver", "Application executor rejected executing OnImageSavedCallback.onError callback. Skipping.");
        }
    }

    public final void e(Uri uri) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            ContentValues contentValues = new ContentValues();
            if (i10 >= 29) {
                contentValues.put("is_pending", (Integer) 0);
            }
            this.f1711d.f1700b.update(uri, contentValues, null, null);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        File createTempFile;
        String str;
        b bVar;
        boolean z11;
        b bVar2 = b.FILE_IO_FAILED;
        File file = null;
        try {
            boolean z12 = false;
            if (this.f1711d.f1699a != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                createTempFile = new File(this.f1711d.f1699a.getParent(), "CameraX" + UUID.randomUUID().toString() + ".tmp");
            } else {
                createTempFile = File.createTempFile("CameraX", ".tmp");
            }
            try {
                j jVar = this.f1708a;
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                fileOutputStream.write(c(this.f1708a, this.f1710c));
                h.a aVar = b0.h.f3936b;
                b0.h hVar = new b0.h(new z1.a(createTempFile.toString()));
                b0.h.b(this.f1708a).a(hVar);
                j jVar2 = this.f1708a;
                if (((g0.b) g0.a.f14801a.c(g0.b.class)) != null) {
                    a0.d dVar = h0.f80h;
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11 && jVar2.getFormat() == 256) {
                    z12 = true;
                }
                if (!z12) {
                    hVar.f(this.f1709b);
                }
                if (this.f1711d.f1704f.f1698a) {
                    hVar.c();
                }
                hVar.g();
                fileOutputStream.close();
                if (jVar != null) {
                    jVar.close();
                }
                bVar2 = null;
                e = null;
                str = null;
            } catch (a.C0286a e10) {
                int b10 = c0.b(e10.f16189a);
                if (b10 != 0) {
                    if (b10 != 1) {
                        bVar = b.UNKNOWN;
                        str = "Failed to transcode mImage";
                    } else {
                        bVar = b.CROP_FAILED;
                        str = "Failed to crop mImage";
                    }
                } else {
                    bVar = b.ENCODE_FAILED;
                    str = "Failed to encode mImage";
                }
                b bVar3 = bVar;
                e = e10;
                bVar2 = bVar3;
            } catch (IOException e11) {
                e = e11;
                str = "Failed to write temp file";
            } catch (IllegalArgumentException e12) {
                e = e12;
                str = "Failed to write temp file";
            }
            if (bVar2 != null) {
                d(bVar2, str, e);
                createTempFile.delete();
            } else {
                file = createTempFile;
            }
        } catch (IOException e13) {
            d(bVar2, "Failed to create temp file", e13);
        }
        if (file != null) {
            this.f1714g.execute(new s.s(this, file, 5));
        }
    }
}
