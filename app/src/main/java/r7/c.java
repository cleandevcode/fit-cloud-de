package r7;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.lang.ref.WeakReference;
import t7.l;
import w7.d;
import z7.f;

/* loaded from: classes.dex */
public final class c extends a<l> implements d {
    public c(Context context) {
        super(context);
    }

    public l getLineData() {
        return (l) this.f25422b;
    }

    @Override // r7.a, r7.b
    public final void k() {
        super.k();
        this.f25436p = new f(this, this.f25439s, this.f25438r);
    }

    @Override // r7.b, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        z7.d dVar = this.f25436p;
        if (dVar != null && (dVar instanceof f)) {
            f fVar = (f) dVar;
            Canvas canvas = fVar.f32042k;
            if (canvas != null) {
                canvas.setBitmap(null);
                fVar.f32042k = null;
            }
            WeakReference<Bitmap> weakReference = fVar.f32041j;
            if (weakReference != null) {
                Bitmap bitmap = weakReference.get();
                if (bitmap != null) {
                    bitmap.recycle();
                }
                fVar.f32041j.clear();
                fVar.f32041j = null;
            }
        }
        super.onDetachedFromWindow();
    }
}
