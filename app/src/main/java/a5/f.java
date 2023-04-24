package a5;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public abstract class f implements r4.l<Bitmap> {
    @Override // r4.l
    public final t4.x b(com.bumptech.glide.h hVar, t4.x xVar, int i10, int i11) {
        if (m5.l.i(i10, i11)) {
            u4.d dVar = com.bumptech.glide.b.b(hVar).f5660a;
            Bitmap bitmap = (Bitmap) xVar.get();
            if (i10 == Integer.MIN_VALUE) {
                i10 = bitmap.getWidth();
            }
            if (i11 == Integer.MIN_VALUE) {
                i11 = bitmap.getHeight();
            }
            Bitmap c10 = c(dVar, bitmap, i10, i11);
            if (!bitmap.equals(c10)) {
                return e.e(c10, dVar);
            }
            return xVar;
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap c(u4.d dVar, Bitmap bitmap, int i10, int i11);
}
