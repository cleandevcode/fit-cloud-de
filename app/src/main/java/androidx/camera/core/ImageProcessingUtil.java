package androidx.camera.core;

import android.util.Log;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.a;
import androidx.camera.core.d;
import java.nio.ByteBuffer;
import java.util.Locale;
import y.g1;
import y.u0;

/* loaded from: classes.dex */
public final class ImageProcessingUtil {

    /* renamed from: a */
    public static int f1611a;

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static void a(j jVar) {
        String str;
        if (!c(jVar)) {
            str = "Unsupported format for YUV to RGB";
        } else {
            int f10 = jVar.f();
            int c10 = jVar.c();
            int c11 = ((a.C0021a) jVar.l()[0]).c();
            int c12 = ((a.C0021a) jVar.l()[1]).c();
            char c13 = 2;
            int c14 = ((a.C0021a) jVar.l()[2]).c();
            int b10 = ((a.C0021a) jVar.l()[0]).b();
            int b11 = ((a.C0021a) jVar.l()[1]).b();
            if (nativeShiftPixel(((a.C0021a) jVar.l()[0]).a(), c11, ((a.C0021a) jVar.l()[1]).a(), c12, ((a.C0021a) jVar.l()[2]).a(), c14, b10, b11, f10, c10, b10, b11, b11) != 0) {
                c13 = 3;
            }
            if (c13 == 3) {
                str = "One pixel shift for YUV failure";
            } else {
                return;
            }
        }
        u0.b("ImageProcessingUtil", str);
    }

    public static g1 b(final j jVar, o oVar, ByteBuffer byteBuffer, int i10, boolean z10) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        char c10;
        String str;
        String str2;
        if (!c(jVar)) {
            str2 = "Unsupported format for YUV to RGB";
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (i10 != 0 && i10 != 90 && i10 != 180 && i10 != 270) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                str2 = "Unsupported rotation degrees for rotate RGB";
            } else {
                Surface surface = oVar.getSurface();
                int f10 = jVar.f();
                int c11 = jVar.c();
                int c12 = ((a.C0021a) jVar.l()[0]).c();
                int c13 = ((a.C0021a) jVar.l()[1]).c();
                int c14 = ((a.C0021a) jVar.l()[2]).c();
                int b10 = ((a.C0021a) jVar.l()[0]).b();
                int b11 = ((a.C0021a) jVar.l()[1]).b();
                if (z10) {
                    i11 = b10;
                } else {
                    i11 = 0;
                }
                if (z10) {
                    i12 = b11;
                } else {
                    i12 = 0;
                }
                if (z10) {
                    i13 = b11;
                } else {
                    i13 = 0;
                }
                if (nativeConvertAndroid420ToABGR(((a.C0021a) jVar.l()[0]).a(), c12, ((a.C0021a) jVar.l()[1]).a(), c13, ((a.C0021a) jVar.l()[2]).a(), c14, b10, b11, surface, byteBuffer, f10, c11, i11, i12, i13, i10) != 0) {
                    c10 = 3;
                } else {
                    c10 = 2;
                }
                if (c10 == 3) {
                    str2 = "YUV to RGB conversion failure";
                    str = "ImageProcessingUtil";
                } else {
                    if (!Log.isLoggable("MH", 3)) {
                        str = "ImageProcessingUtil";
                    } else {
                        str = "ImageProcessingUtil";
                        u0.a(str, String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(f1611a)));
                        f1611a++;
                    }
                    final j g10 = oVar.g();
                    if (g10 == null) {
                        str2 = "YUV to RGB acquireLatestImage failure";
                    } else {
                        g1 g1Var = new g1(g10);
                        g1Var.a(new d.a() { // from class: y.p0
                            @Override // androidx.camera.core.d.a
                            public final void a(androidx.camera.core.j jVar2) {
                                androidx.camera.core.j jVar3 = androidx.camera.core.j.this;
                                androidx.camera.core.j jVar4 = jVar;
                                int i14 = ImageProcessingUtil.f1611a;
                                if (jVar3 == null || jVar4 == null) {
                                    return;
                                }
                                jVar4.close();
                            }
                        });
                        return g1Var;
                    }
                }
                u0.b(str, str2);
                return null;
            }
        }
        str = "ImageProcessingUtil";
        u0.b(str, str2);
        return null;
    }

    public static boolean c(j jVar) {
        return jVar.getFormat() == 35 && jVar.l().length == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static y.g1 d(final androidx.camera.core.j r25, androidx.camera.core.o r26, android.media.ImageWriter r27, java.nio.ByteBuffer r28, java.nio.ByteBuffer r29, java.nio.ByteBuffer r30, int r31) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageProcessingUtil.d(androidx.camera.core.j, androidx.camera.core.o, android.media.ImageWriter, java.nio.ByteBuffer, java.nio.ByteBuffer, java.nio.ByteBuffer, int):y.g1");
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, Surface surface, ByteBuffer byteBuffer4, int i15, int i16, int i17, int i18, int i19, int i20);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, ByteBuffer byteBuffer4, int i14, int i15, ByteBuffer byteBuffer5, int i16, int i17, ByteBuffer byteBuffer6, int i18, int i19, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i20, int i21, int i22);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19);
}
