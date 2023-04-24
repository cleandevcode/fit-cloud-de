package q9;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.appcompat.widget.g;
import b1.a;
import com.google.android.material.R;
import o1.c;
import z9.r;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: h */
    public static final int f24642h = R.style.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: i */
    public static final int[][] f24643i = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e */
    public ColorStateList f24644e;

    /* renamed from: f */
    public boolean f24645f;

    /* renamed from: g */
    public boolean f24646g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r3 = com.google.android.material.R.attr.checkboxStyle
            int r4 = q9.a.f24642h
            android.content.Context r8 = la.a.a(r8, r9, r3, r4)
            r7.<init>(r8, r9, r3)
            android.content.Context r8 = r7.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialCheckBox
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            android.content.res.TypedArray r9 = z9.o.d(r0, r1, r2, r3, r4, r5)
            int r0 = com.google.android.material.R.styleable.MaterialCheckBox_buttonTint
            boolean r1 = r9.hasValue(r0)
            if (r1 == 0) goto L29
            android.content.res.ColorStateList r8 = da.d.a(r8, r9, r0)
            o1.c.a.c(r7, r8)
        L29:
            int r8 = com.google.android.material.R.styleable.MaterialCheckBox_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f24645f = r8
            int r8 = com.google.android.material.R.styleable.MaterialCheckBox_centerIfNoTextEnabled
            r0 = 1
            boolean r8 = r9.getBoolean(r8, r0)
            r7.f24646g = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q9.a.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f24644e == null) {
            int[][] iArr = f24643i;
            int b10 = u9.a.b(this, R.attr.colorControlActivated);
            int b11 = u9.a.b(this, R.attr.colorSurface);
            int b12 = u9.a.b(this, R.attr.colorOnSurface);
            this.f24644e = new ColorStateList(iArr, new int[]{u9.a.d(1.0f, b11, b10), u9.a.d(0.54f, b11, b12), u9.a.d(0.38f, b11, b12), u9.a.d(0.38f, b11, b12)});
        }
        return this.f24644e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24645f && c.a.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a10;
        int i10;
        if (this.f24646g && TextUtils.isEmpty(getText()) && (a10 = c.a(this)) != null) {
            if (r.c(this)) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            int width = ((getWidth() - a10.getIntrinsicWidth()) / 2) * i10;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = a10.getBounds();
                a.b.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f24646g = z10;
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f24645f = z10;
        c.a.c(this, z10 ? getMaterialThemeColorsTintList() : null);
    }
}
