package z9;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.material.R;

/* loaded from: classes.dex */
public class g extends LinearLayoutCompat {

    /* renamed from: p */
    public Drawable f32126p;

    /* renamed from: q */
    public final Rect f32127q;

    /* renamed from: r */
    public final Rect f32128r;

    /* renamed from: s */
    public int f32129s;

    /* renamed from: t */
    public boolean f32130t;

    /* renamed from: u */
    public boolean f32131u;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public g(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, 0);
        this.f32127q = new Rect();
        this.f32128r = new Rect();
        this.f32129s = 119;
        this.f32130t = true;
        this.f32131u = false;
        TypedArray d10 = o.d(context, attributeSet, R.styleable.ForegroundLinearLayout, 0, 0, new int[0]);
        this.f32129s = d10.getInt(R.styleable.ForegroundLinearLayout_android_foregroundGravity, this.f32129s);
        Drawable drawable = d10.getDrawable(R.styleable.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f32130t = d10.getBoolean(R.styleable.ForegroundLinearLayout_foregroundInsidePadding, true);
        d10.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f32126p;
        if (drawable != null) {
            if (this.f32131u) {
                this.f32131u = false;
                Rect rect = this.f32127q;
                Rect rect2 = this.f32128r;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f32130t) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f32129s, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f32126p;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f32126p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f32126p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f32126p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f32129s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f32126p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f32131u = z10 | this.f32131u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f32131u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f32126p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f32126p);
            }
            this.f32126p = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f32129s == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f32129s != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f32129s = i10;
            if (i10 == 119 && this.f32126p != null) {
                this.f32126p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f32126p;
    }
}
