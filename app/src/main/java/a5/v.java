package a5;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes.dex */
public final class v implements t4.x<BitmapDrawable>, t4.u {

    /* renamed from: a */
    public final Resources f336a;

    /* renamed from: b */
    public final t4.x<Bitmap> f337b;

    public v(Resources resources, t4.x<Bitmap> xVar) {
        b0.c.i(resources);
        this.f336a = resources;
        b0.c.i(xVar);
        this.f337b = xVar;
    }

    @Override // t4.u
    public final void a() {
        t4.x<Bitmap> xVar = this.f337b;
        if (xVar instanceof t4.u) {
            ((t4.u) xVar).a();
        }
    }

    @Override // t4.x
    public final int b() {
        return this.f337b.b();
    }

    @Override // t4.x
    public final void c() {
        this.f337b.c();
    }

    @Override // t4.x
    public final Class<BitmapDrawable> d() {
        return BitmapDrawable.class;
    }

    @Override // t4.x
    public final BitmapDrawable get() {
        return new BitmapDrawable(this.f336a, this.f337b.get());
    }
}
