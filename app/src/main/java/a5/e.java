package a5;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class e implements t4.x<Bitmap>, t4.u {

    /* renamed from: a */
    public final Bitmap f270a;

    /* renamed from: b */
    public final u4.d f271b;

    public e(Bitmap bitmap, u4.d dVar) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        this.f270a = bitmap;
        if (dVar == null) {
            throw new NullPointerException("BitmapPool must not be null");
        }
        this.f271b = dVar;
    }

    public static e e(Bitmap bitmap, u4.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, dVar);
    }

    @Override // t4.u
    public final void a() {
        this.f270a.prepareToDraw();
    }

    @Override // t4.x
    public final int b() {
        return m5.l.c(this.f270a);
    }

    @Override // t4.x
    public final void c() {
        this.f271b.d(this.f270a);
    }

    @Override // t4.x
    public final Class<Bitmap> d() {
        return Bitmap.class;
    }

    @Override // t4.x
    public final Bitmap get() {
        return this.f270a;
    }
}
