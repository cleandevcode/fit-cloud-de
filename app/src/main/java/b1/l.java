package b1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import b1.a;

/* loaded from: classes.dex */
public class l extends Drawable implements Drawable.Callback, k, j {

    /* renamed from: g */
    public static final PorterDuff.Mode f3981g = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f3982a;

    /* renamed from: b */
    public PorterDuff.Mode f3983b;

    /* renamed from: c */
    public boolean f3984c;

    /* renamed from: d */
    public n f3985d;

    /* renamed from: e */
    public boolean f3986e;

    /* renamed from: f */
    public Drawable f3987f;

    public l(Drawable drawable) {
        this.f3985d = new n(this.f3985d);
        a(drawable);
    }

    @Override // b1.k
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f3987f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3987f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            n nVar = this.f3985d;
            if (nVar != null) {
                nVar.f3990b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // b1.k
    public final Drawable b() {
        return this.f3987f;
    }

    public boolean c() {
        throw null;
    }

    public final boolean d(int[] iArr) {
        if (c()) {
            n nVar = this.f3985d;
            ColorStateList colorStateList = nVar.f3991c;
            PorterDuff.Mode mode = nVar.f3992d;
            if (colorStateList == null || mode == null) {
                this.f3984c = false;
                clearColorFilter();
            } else {
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (!this.f3984c || colorForState != this.f3982a || mode != this.f3983b) {
                    setColorFilter(colorForState, mode);
                    this.f3982a = colorForState;
                    this.f3983b = mode;
                    this.f3984c = true;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f3987f.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        n nVar = this.f3985d;
        return changingConfigurations | (nVar != null ? nVar.getChangingConfigurations() : 0) | this.f3987f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z10;
        n nVar = this.f3985d;
        if (nVar != null) {
            if (nVar.f3990b != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                nVar.f3989a = getChangingConfigurations();
                return this.f3985d;
            }
            return null;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f3987f.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f3987f.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f3987f.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return a.b(this.f3987f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f3987f.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f3987f.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f3987f.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f3987f.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f3987f.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f3987f.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return a.C0049a.d(this.f3987f);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        n nVar;
        ColorStateList colorStateList = (!c() || (nVar = this.f3985d) == null) ? null : nVar.f3991c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f3987f.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f3987f.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.f3986e && super.mutate() == this) {
            this.f3985d = new n(this.f3985d);
            Drawable drawable = this.f3987f;
            if (drawable != null) {
                drawable.mutate();
            }
            n nVar = this.f3985d;
            if (nVar != null) {
                Drawable drawable2 = this.f3987f;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                nVar.f3990b = constantState;
            }
            this.f3986e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3987f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        return a.c(this.f3987f, i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        return this.f3987f.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f3987f.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        a.C0049a.e(this.f3987f, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i10) {
        this.f3987f.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f3987f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        this.f3987f.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z10) {
        this.f3987f.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return d(iArr) || this.f3987f.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f3985d.f3991c = colorStateList;
        d(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f3985d.f3992d = mode;
        d(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f3987f.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public l(n nVar, Resources resources) {
        Drawable.ConstantState constantState;
        this.f3985d = nVar;
        if (nVar == null || (constantState = nVar.f3990b) == null) {
            return;
        }
        a(constantState.newDrawable(resources));
    }
}
