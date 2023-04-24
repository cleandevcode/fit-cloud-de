package a5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public final class k extends f {

    /* renamed from: b */
    public static final byte[] f286b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(r4.f.f25212a);

    @Override // r4.f
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f286b);
    }

    @Override // a5.f
    public final Bitmap c(u4.d dVar, Bitmap bitmap, int i10, int i11) {
        Bitmap e10;
        Paint paint = a0.f259a;
        int min = Math.min(i10, i11);
        float f10 = min;
        float f11 = f10 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float max = Math.max(f10 / width, f10 / height);
        float f12 = width * max;
        float f13 = max * height;
        float f14 = (f10 - f12) / 2.0f;
        float f15 = (f10 - f13) / 2.0f;
        RectF rectF = new RectF(f14, f15, f12 + f14, f13 + f15);
        Bitmap.Config c10 = a0.c(bitmap);
        if (c10.equals(bitmap.getConfig())) {
            e10 = bitmap;
        } else {
            e10 = dVar.e(bitmap.getWidth(), bitmap.getHeight(), c10);
            new Canvas(e10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Bitmap e11 = dVar.e(min, min, a0.c(bitmap));
        e11.setHasAlpha(true);
        Lock lock = a0.f262d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(e11);
            canvas.drawCircle(f11, f11, f11, a0.f260b);
            canvas.drawBitmap(e10, (Rect) null, rectF, a0.f261c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!e10.equals(bitmap)) {
                dVar.d(e10);
            }
            return e11;
        } catch (Throwable th2) {
            a0.f262d.unlock();
            throw th2;
        }
    }

    @Override // r4.f
    public final boolean equals(Object obj) {
        return obj instanceof k;
    }

    @Override // r4.f
    public final int hashCode() {
        return 1101716364;
    }
}
