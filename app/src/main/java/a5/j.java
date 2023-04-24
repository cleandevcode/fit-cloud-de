package a5;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class j extends f {

    /* renamed from: b */
    public static final byte[] f285b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(r4.f.f25212a);

    @Override // r4.f
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f285b);
    }

    @Override // a5.f
    public final Bitmap c(u4.d dVar, Bitmap bitmap, int i10, int i11) {
        Paint paint = a0.f259a;
        if (bitmap.getWidth() > i10 || bitmap.getHeight() > i11) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return a0.b(dVar, bitmap, i10, i11);
        } else if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            return bitmap;
        } else {
            return bitmap;
        }
    }

    @Override // r4.f
    public final boolean equals(Object obj) {
        return obj instanceof j;
    }

    @Override // r4.f
    public final int hashCode() {
        return -670243078;
    }
}
