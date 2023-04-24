package f5;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import r4.h;
import t4.x;

/* loaded from: classes.dex */
public final class b implements c<Drawable, byte[]> {

    /* renamed from: a */
    public final u4.d f14122a;

    /* renamed from: b */
    public final c<Bitmap, byte[]> f14123b;

    /* renamed from: c */
    public final c<e5.c, byte[]> f14124c;

    public b(u4.d dVar, a aVar, h7.a aVar2) {
        this.f14122a = dVar;
        this.f14123b = aVar;
        this.f14124c = aVar2;
    }

    @Override // f5.c
    public final x<byte[]> c(x<Drawable> xVar, h hVar) {
        Drawable drawable = xVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f14123b.c(a5.e.e(((BitmapDrawable) drawable).getBitmap(), this.f14122a), hVar);
        }
        if (drawable instanceof e5.c) {
            return this.f14124c.c(xVar, hVar);
        }
        return null;
    }
}
