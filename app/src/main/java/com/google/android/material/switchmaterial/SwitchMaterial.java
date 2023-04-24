package com.google.android.material.switchmaterial;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.R;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import w9.a;

/* loaded from: classes.dex */
public class SwitchMaterial extends SwitchCompat {

    /* renamed from: m0 */
    public static final int f6682m0 = R.style.Widget_MaterialComponents_CompoundButton_Switch;

    /* renamed from: n0 */
    public static final int[][] f6683n0 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: i0 */
    public final a f6684i0;

    /* renamed from: j0 */
    public ColorStateList f6685j0;

    /* renamed from: k0 */
    public ColorStateList f6686k0;

    /* renamed from: l0 */
    public boolean f6687l0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SwitchMaterial(android.content.Context r7, android.util.AttributeSet r8) {
        /*
            r6 = this;
            int r3 = com.google.android.material.R.attr.switchStyle
            int r4 = com.google.android.material.switchmaterial.SwitchMaterial.f6682m0
            android.content.Context r7 = la.a.a(r7, r8, r3, r4)
            r6.<init>(r7, r8, r3)
            android.content.Context r0 = r6.getContext()
            w9.a r7 = new w9.a
            r7.<init>(r0)
            r6.f6684i0 = r7
            int[] r2 = com.google.android.material.R.styleable.SwitchMaterial
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            android.content.res.TypedArray r8 = z9.o.d(r0, r1, r2, r3, r4, r5)
            int r0 = com.google.android.material.R.styleable.SwitchMaterial_useMaterialThemeColors
            boolean r7 = r8.getBoolean(r0, r7)
            r6.f6687l0 = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.switchmaterial.SwitchMaterial.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f6685j0 == null) {
            int b10 = u9.a.b(this, R.attr.colorSurface);
            int b11 = u9.a.b(this, R.attr.colorControlActivated);
            float dimension = getResources().getDimension(R.dimen.mtrl_switch_thumb_elevation);
            if (this.f6684i0.f29763a) {
                float f10 = 0.0f;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                    f10 += o0.i.i((View) parent);
                }
                dimension += f10;
            }
            int a10 = this.f6684i0.a(dimension, b10);
            this.f6685j0 = new ColorStateList(f6683n0, new int[]{u9.a.d(1.0f, b10, b11), a10, u9.a.d(0.38f, b10, b11), a10});
        }
        return this.f6685j0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f6686k0 == null) {
            int[][] iArr = f6683n0;
            int b10 = u9.a.b(this, R.attr.colorSurface);
            int b11 = u9.a.b(this, R.attr.colorControlActivated);
            int b12 = u9.a.b(this, R.attr.colorOnSurface);
            this.f6686k0 = new ColorStateList(iArr, new int[]{u9.a.d(0.54f, b10, b11), u9.a.d(0.32f, b10, b12), u9.a.d(0.12f, b10, b11), u9.a.d(0.12f, b10, b12)});
        }
        return this.f6686k0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6687l0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f6687l0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        ColorStateList colorStateList;
        this.f6687l0 = z10;
        if (z10) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            colorStateList = getMaterialThemeColorsTrackTintList();
        } else {
            colorStateList = null;
            setThumbTintList(null);
        }
        setTrackTintList(colorStateList);
    }
}
