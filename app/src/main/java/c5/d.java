package c5;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class d extends c<Drawable> {
    public d(Drawable drawable) {
        super(drawable);
    }

    @Override // t4.x
    public final int b() {
        return Math.max(1, this.f4537a.getIntrinsicHeight() * this.f4537a.getIntrinsicWidth() * 4);
    }

    @Override // t4.x
    public final void c() {
    }

    @Override // t4.x
    public final Class<Drawable> d() {
        return this.f4537a.getClass();
    }
}
