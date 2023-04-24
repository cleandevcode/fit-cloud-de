package a5;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class u implements r4.j<InputStream, Bitmap> {

    /* renamed from: a */
    public final d f335a = new d();

    @Override // r4.j
    public final t4.x<Bitmap> a(InputStream inputStream, int i10, int i11, r4.h hVar) {
        return this.f335a.a(ImageDecoder.createSource(m5.a.b(inputStream)), i10, i11, hVar);
    }

    @Override // r4.j
    public final /* bridge */ /* synthetic */ boolean b(InputStream inputStream, r4.h hVar) {
        return true;
    }
}
