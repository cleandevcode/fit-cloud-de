package c5;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import t4.u;
import t4.x;

/* loaded from: classes.dex */
public abstract class c<T extends Drawable> implements x<T>, u {

    /* renamed from: a */
    public final T f4537a;

    public c(T t10) {
        b0.c.i(t10);
        this.f4537a = t10;
    }

    @Override // t4.u
    public void a() {
        Bitmap bitmap;
        T t10 = this.f4537a;
        if (t10 instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) t10).getBitmap();
        } else if (t10 instanceof e5.c) {
            bitmap = ((e5.c) t10).f13443a.f13453a.f13466l;
        } else {
            return;
        }
        bitmap.prepareToDraw();
    }

    @Override // t4.x
    public final Object get() {
        Drawable.ConstantState constantState = this.f4537a.getConstantState();
        return constantState == null ? this.f4537a : constantState.newDrawable();
    }
}
