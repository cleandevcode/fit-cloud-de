package a5;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class p implements r4.l<Drawable> {

    /* renamed from: b */
    public final r4.l<Bitmap> f312b;

    /* renamed from: c */
    public final boolean f313c;

    public p(r4.l<Bitmap> lVar, boolean z10) {
        this.f312b = lVar;
        this.f313c = z10;
    }

    @Override // r4.f
    public final void a(MessageDigest messageDigest) {
        this.f312b.a(messageDigest);
    }

    @Override // r4.l
    public final t4.x b(com.bumptech.glide.h hVar, t4.x xVar, int i10, int i11) {
        u4.d dVar = com.bumptech.glide.b.b(hVar).f5660a;
        Drawable drawable = (Drawable) xVar.get();
        e a10 = o.a(dVar, drawable, i10, i11);
        if (a10 == null) {
            if (!this.f313c) {
                return xVar;
            }
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        t4.x b10 = this.f312b.b(hVar, a10, i10, i11);
        if (b10.equals(a10)) {
            b10.c();
            return xVar;
        }
        return new v(hVar.getResources(), b10);
    }

    @Override // r4.f
    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f312b.equals(((p) obj).f312b);
        }
        return false;
    }

    @Override // r4.f
    public final int hashCode() {
        return this.f312b.hashCode();
    }
}
