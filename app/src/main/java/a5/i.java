package a5;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class i extends f {

    /* renamed from: b */
    public static final byte[] f284b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(r4.f.f25212a);

    @Override // r4.f
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f284b);
    }

    @Override // a5.f
    public final Bitmap c(u4.d dVar, Bitmap bitmap, int i10, int i11) {
        float width;
        float height;
        Bitmap.Config config;
        Paint paint = a0.f259a;
        if (bitmap.getWidth() != i10 || bitmap.getHeight() != i11) {
            Matrix matrix = new Matrix();
            float f10 = 0.0f;
            if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
                width = i11 / bitmap.getHeight();
                f10 = (i10 - (bitmap.getWidth() * width)) * 0.5f;
                height = 0.0f;
            } else {
                width = i10 / bitmap.getWidth();
                height = (i11 - (bitmap.getHeight() * width)) * 0.5f;
            }
            matrix.setScale(width, width);
            matrix.postTranslate((int) (f10 + 0.5f), (int) (height + 0.5f));
            if (bitmap.getConfig() != null) {
                config = bitmap.getConfig();
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap e10 = dVar.e(i10, i11, config);
            e10.setHasAlpha(bitmap.hasAlpha());
            a0.a(bitmap, e10, matrix);
            return e10;
        }
        return bitmap;
    }

    @Override // r4.f
    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // r4.f
    public final int hashCode() {
        return -599754482;
    }
}
