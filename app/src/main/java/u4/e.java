package u4;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class e implements d {
    @Override // u4.d
    public final void a(int i10) {
    }

    @Override // u4.d
    public final void b() {
    }

    @Override // u4.d
    public final Bitmap c(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // u4.d
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // u4.d
    public final Bitmap e(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }
}
