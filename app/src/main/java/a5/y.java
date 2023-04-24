package a5;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes.dex */
public final class y implements r4.j<Uri, Bitmap> {

    /* renamed from: a */
    public final c5.e f345a;

    /* renamed from: b */
    public final u4.d f346b;

    public y(c5.e eVar, u4.d dVar) {
        this.f345a = eVar;
        this.f346b = dVar;
    }

    @Override // r4.j
    public final t4.x<Bitmap> a(Uri uri, int i10, int i11, r4.h hVar) {
        t4.x c10 = this.f345a.c(uri, hVar);
        if (c10 == null) {
            return null;
        }
        return o.a(this.f346b, (Drawable) ((c5.c) c10).get(), i10, i11);
    }

    @Override // r4.j
    public final boolean b(Uri uri, r4.h hVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
