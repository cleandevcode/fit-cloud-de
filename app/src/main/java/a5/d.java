package a5;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;

/* loaded from: classes.dex */
public final class d implements r4.j<ImageDecoder.Source, Bitmap> {

    /* renamed from: a */
    public final u4.e f269a = new u4.e();

    @Override // r4.j
    public final /* bridge */ /* synthetic */ boolean b(ImageDecoder.Source source, r4.h hVar) {
        return true;
    }

    @Override // r4.j
    /* renamed from: c */
    public final e a(ImageDecoder.Source source, int i10, int i11, r4.h hVar) {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new z4.a(i10, i11, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            StringBuilder a10 = android.support.v4.media.d.a("Decoded [");
            a10.append(decodeBitmap.getWidth());
            a10.append("x");
            a10.append(decodeBitmap.getHeight());
            a10.append("] for [");
            a10.append(i10);
            a10.append("x");
            a10.append(i11);
            a10.append("]");
            Log.v("BitmapImageDecoder", a10.toString());
        }
        return new e(decodeBitmap, this.f269a);
    }
}
