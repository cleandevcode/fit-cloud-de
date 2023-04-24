package qi;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import mf.a0;

/* loaded from: classes2.dex */
public final class b extends j5.c<Bitmap> {

    /* renamed from: d */
    public final /* synthetic */ pm.i<Bitmap> f24843d;

    public b(pm.j jVar) {
        this.f24843d = jVar;
    }

    @Override // j5.h
    public final void c(Object obj) {
        this.f24843d.l((Bitmap) obj);
    }

    @Override // j5.c, j5.h
    public final void e(Drawable drawable) {
        this.f24843d.l(a0.f(new IOException()));
    }

    @Override // j5.h
    public final void h(Drawable drawable) {
    }
}
