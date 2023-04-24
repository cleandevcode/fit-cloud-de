package a5;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class r extends f {

    /* renamed from: b */
    public static final byte[] f314b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(r4.f.f25212a);

    @Override // r4.f
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f314b);
    }

    @Override // a5.f
    public final Bitmap c(u4.d dVar, Bitmap bitmap, int i10, int i11) {
        return a0.b(dVar, bitmap, i10, i11);
    }

    @Override // r4.f
    public final boolean equals(Object obj) {
        return obj instanceof r;
    }

    @Override // r4.f
    public final int hashCode() {
        return 1572326941;
    }
}
