package a5;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class h implements r4.j<ByteBuffer, Bitmap> {

    /* renamed from: a */
    public final d f283a = new d();

    @Override // r4.j
    public final t4.x<Bitmap> a(ByteBuffer byteBuffer, int i10, int i11, r4.h hVar) {
        return this.f283a.a(ImageDecoder.createSource(byteBuffer), i10, i11, hVar);
    }

    @Override // r4.j
    public final /* bridge */ /* synthetic */ boolean b(ByteBuffer byteBuffer, r4.h hVar) {
        return true;
    }
}
