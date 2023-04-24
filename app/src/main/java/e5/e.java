package e5;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import r4.l;
import t4.x;

/* loaded from: classes.dex */
public final class e implements l<c> {

    /* renamed from: b */
    public final l<Bitmap> f13454b;

    public e(l<Bitmap> lVar) {
        b0.c.i(lVar);
        this.f13454b = lVar;
    }

    @Override // r4.f
    public final void a(MessageDigest messageDigest) {
        this.f13454b.a(messageDigest);
    }

    @Override // r4.l
    public final x b(com.bumptech.glide.h hVar, x xVar, int i10, int i11) {
        c cVar = (c) xVar.get();
        a5.e eVar = new a5.e(cVar.f13443a.f13453a.f13466l, com.bumptech.glide.b.b(hVar).f5660a);
        x b10 = this.f13454b.b(hVar, eVar, i10, i11);
        if (!eVar.equals(b10)) {
            eVar.c();
        }
        l<Bitmap> lVar = this.f13454b;
        cVar.f13443a.f13453a.c(lVar, (Bitmap) b10.get());
        return xVar;
    }

    @Override // r4.f
    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f13454b.equals(((e) obj).f13454b);
        }
        return false;
    }

    @Override // r4.f
    public final int hashCode() {
        return this.f13454b.hashCode();
    }
}
