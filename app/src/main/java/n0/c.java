package n0;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class c extends Drawable {

    /* renamed from: a */
    public float f21909a;

    /* renamed from: c */
    public final RectF f21911c;

    /* renamed from: d */
    public final Rect f21912d;

    /* renamed from: e */
    public float f21913e;

    /* renamed from: h */
    public ColorStateList f21916h;

    /* renamed from: i */
    public PorterDuffColorFilter f21917i;

    /* renamed from: j */
    public ColorStateList f21918j;

    /* renamed from: f */
    public boolean f21914f = false;

    /* renamed from: g */
    public boolean f21915g = true;

    /* renamed from: k */
    public PorterDuff.Mode f21919k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public final Paint f21910b = new Paint(5);

    public c(float f10, ColorStateList colorStateList) {
        this.f21909a = f10;
        b(colorStateList);
        this.f21911c = new RectF();
        this.f21912d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f21916h = colorStateList;
        this.f21910b.setColor(colorStateList.getColorForState(getState(), this.f21916h.getDefaultColor()));
    }

    public final void c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f21911c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f21912d.set(rect);
        if (this.f21914f) {
            float a10 = d.a(this.f21913e, this.f21909a, this.f21915g);
            float f10 = this.f21913e;
            float f11 = this.f21909a;
            if (this.f21915g) {
                f10 = (float) (((1.0d - d.f21920a) * f11) + f10);
            }
            this.f21912d.inset((int) Math.ceil(f10), (int) Math.ceil(a10));
            this.f21911c.set(this.f21912d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f21910b;
        if (this.f21917i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f21917i);
            z10 = true;
        }
        RectF rectF = this.f21911c;
        float f10 = this.f21909a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f21912d, this.f21909a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f21918j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f21916h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f21916h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f21910b.getColor();
        if (z10) {
            this.f21910b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f21918j;
        if (colorStateList2 == null || (mode = this.f21919k) == null) {
            return z10;
        }
        this.f21917i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f21910b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f21910b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f21918j = colorStateList;
        this.f21917i = a(colorStateList, this.f21919k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f21919k = mode;
        this.f21917i = a(this.f21918j, mode);
        invalidateSelf();
    }
}
