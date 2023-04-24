package com.topstep.fitcloud.sdk.v2.utils.dial;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import sj.e;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: com.topstep.fitcloud.sdk.v2.utils.dial.a$a */
    /* loaded from: classes2.dex */
    public enum EnumC0212a {
        TOP,
        LEFT,
        RIGHT,
        BOTTOM;

        public static EnumC0212a a(int i10) {
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? TOP : BOTTOM : RIGHT : LEFT;
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        CENTER,
        CENTER_CROP,
        AUTO_CROP
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12518a;

        static {
            int[] iArr = new int[EnumC0212a.values().length];
            f12518a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12518a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12518a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12518a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static void a(Bitmap bitmap, float f10, float f11, b bVar, Matrix matrix) {
        b bVar2 = b.CENTER_CROP;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        matrix.reset();
        float f12 = f10 / 2.0f;
        float f13 = f11 / 2.0f;
        matrix.setTranslate(f12 - (bitmap.getWidth() / 2.0f), f13 - (bitmap.getHeight() / 2.0f));
        if (bVar == b.AUTO_CROP && (f10 > bitmap.getWidth() || f11 > bitmap.getHeight())) {
            bVar = bVar2;
        }
        if (bVar == bVar2) {
            float max = Math.max(f10 / bitmap.getWidth(), f11 / bitmap.getHeight());
            matrix.postScale(max, max, f12, f13);
        }
    }

    public static void b(Bitmap bitmap, int i10, float f10, float f11, EnumC0212a enumC0212a, Matrix matrix) {
        float width;
        float f12;
        float height;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        matrix.reset();
        float f13 = f10 / i10;
        float f14 = f10 * 0.1f;
        float f15 = 0.1f * f11;
        matrix.setScale(f13, f13);
        int i11 = c.f12518a[enumC0212a.ordinal()];
        if (i11 == 1) {
            matrix.postTranslate((f10 / 2.0f) - ((f13 * bitmap.getWidth()) / 2.0f), f15);
        } else if (i11 == 2) {
            matrix.postTranslate(f14, (f11 / 2.0f) - ((f13 * bitmap.getHeight()) / 2.0f));
        } else {
            if (i11 != 3) {
                width = (f10 / 2.0f) - ((bitmap.getWidth() * f13) / 2.0f);
                f12 = f11 - f15;
                height = f13 * bitmap.getHeight();
            } else {
                width = (f10 - f14) - (bitmap.getWidth() * f13);
                f12 = f11 / 2.0f;
                height = (f13 * bitmap.getHeight()) / 2.0f;
            }
            matrix.postTranslate(width, f12 - height);
        }
    }

    public static void c(Canvas canvas, e eVar, Paint paint, Matrix matrix, Bitmap bitmap) {
        RectF rectF = new RectF(0.0f, 0.0f, eVar.f27096b, eVar.f27097c);
        int saveLayer = canvas.saveLayer(rectF, paint, 31);
        boolean z10 = true;
        if (eVar.f27095a != 1) {
            z10 = false;
        }
        if (z10) {
            float f10 = eVar.f27096b / 2.0f;
            canvas.drawCircle(f10, f10, f10, paint);
        } else {
            float f11 = eVar.f27098d;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, matrix, paint);
        canvas.restoreToCount(saveLayer);
        paint.setXfermode(null);
    }
}
