package a5;

import a5.t;
import android.graphics.Bitmap;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements r4.j<ByteBuffer, Bitmap> {

    /* renamed from: a */
    public final n f281a;

    public g(n nVar) {
        this.f281a = nVar;
    }

    @Override // r4.j
    public final t4.x<Bitmap> a(ByteBuffer byteBuffer, int i10, int i11, r4.h hVar) {
        n nVar = this.f281a;
        List<ImageHeaderParser> list = nVar.f309d;
        return nVar.a(new t.a(nVar.f308c, byteBuffer, list), i10, i11, hVar, n.f304k);
    }

    @Override // r4.j
    public final boolean b(ByteBuffer byteBuffer, r4.h hVar) {
        this.f281a.getClass();
        return true;
    }
}
