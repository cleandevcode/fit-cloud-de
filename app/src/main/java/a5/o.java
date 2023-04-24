package a5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a */
    public static final a f311a = new a();

    /* loaded from: classes.dex */
    public class a extends u4.e {
        @Override // u4.e, u4.d
        public final void d(Bitmap bitmap) {
        }
    }

    public static e a(u4.d dVar, Drawable drawable, int i10, int i11) {
        StringBuilder sb2;
        String str;
        Drawable current = drawable.getCurrent();
        boolean z10 = false;
        Bitmap bitmap = null;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i10 == Integer.MIN_VALUE && current.getIntrinsicWidth() <= 0) {
                if (Log.isLoggable("DrawableToBitmap", 5)) {
                    sb2 = new StringBuilder();
                    sb2.append("Unable to draw ");
                    sb2.append(current);
                    str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width";
                    sb2.append(str);
                    Log.w("DrawableToBitmap", sb2.toString());
                }
                z10 = true;
            } else {
                if (i11 == Integer.MIN_VALUE && current.getIntrinsicHeight() <= 0) {
                    if (Log.isLoggable("DrawableToBitmap", 5)) {
                        sb2 = new StringBuilder();
                        sb2.append("Unable to draw ");
                        sb2.append(current);
                        str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height";
                        sb2.append(str);
                        Log.w("DrawableToBitmap", sb2.toString());
                    }
                } else {
                    if (current.getIntrinsicWidth() > 0) {
                        i10 = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i11 = current.getIntrinsicHeight();
                    }
                    Lock lock = a0.f262d;
                    lock.lock();
                    Bitmap e10 = dVar.e(i10, i11, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(e10);
                        current.setBounds(0, 0, i10, i11);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = e10;
                    } catch (Throwable th2) {
                        lock.unlock();
                        throw th2;
                    }
                }
                z10 = true;
            }
        }
        if (!z10) {
            dVar = f311a;
        }
        return e.e(bitmap, dVar);
    }
}
