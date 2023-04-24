package ca;

import android.content.res.ColorStateList;
import androidx.appcompat.widget.l0;
import com.google.android.material.R;
import o1.c;

/* loaded from: classes.dex */
public final class a extends l0 {

    /* renamed from: g */
    public static final int f4591g = R.style.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: h */
    public static final int[][] f4592h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: e */
    public ColorStateList f4593e;

    /* renamed from: f */
    public boolean f4594f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r3 = com.google.android.material.R.attr.radioButtonStyle
            int r4 = ca.a.f4591g
            android.content.Context r8 = la.a.a(r8, r9, r3, r4)
            r7.<init>(r8, r9, r3)
            android.content.Context r8 = r7.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialRadioButton
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            android.content.res.TypedArray r9 = z9.o.d(r0, r1, r2, r3, r4, r5)
            int r0 = com.google.android.material.R.styleable.MaterialRadioButton_buttonTint
            boolean r1 = r9.hasValue(r0)
            if (r1 == 0) goto L29
            android.content.res.ColorStateList r8 = da.d.a(r8, r9, r0)
            o1.c.a.c(r7, r8)
        L29:
            int r8 = com.google.android.material.R.styleable.MaterialRadioButton_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f4594f = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.a.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4593e == null) {
            int b10 = u9.a.b(this, R.attr.colorControlActivated);
            int b11 = u9.a.b(this, R.attr.colorOnSurface);
            int b12 = u9.a.b(this, R.attr.colorSurface);
            this.f4593e = new ColorStateList(f4592h, new int[]{u9.a.d(1.0f, b12, b10), u9.a.d(0.54f, b12, b11), u9.a.d(0.38f, b12, b11), u9.a.d(0.38f, b12, b11)});
        }
        return this.f4593e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f4594f && c.a.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f4594f = z10;
        c.a.c(this, z10 ? getMaterialThemeColorsTintList() : null);
    }
}
