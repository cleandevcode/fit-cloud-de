package f5;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import r4.h;
import t4.x;

/* loaded from: classes.dex */
public final class a implements c<Bitmap, byte[]> {

    /* renamed from: a */
    public final Bitmap.CompressFormat f14120a = Bitmap.CompressFormat.JPEG;

    /* renamed from: b */
    public final int f14121b = 100;

    @Override // f5.c
    public final x<byte[]> c(x<Bitmap> xVar, h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        xVar.get().compress(this.f14120a, this.f14121b, byteArrayOutputStream);
        xVar.c();
        return new b5.b(byteArrayOutputStream.toByteArray());
    }
}
