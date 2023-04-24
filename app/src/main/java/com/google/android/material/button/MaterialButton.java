package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.f;
import b1.a;
import com.google.android.material.R;
import ga.i;
import ga.m;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import o1.p;

/* loaded from: classes.dex */
public class MaterialButton extends f implements Checkable, m {

    /* renamed from: q */
    public static final int[] f6325q = {16842911};

    /* renamed from: r */
    public static final int[] f6326r = {16842912};

    /* renamed from: s */
    public static final int f6327s = R.style.Widget_MaterialComponents_Button;

    /* renamed from: d */
    public final o9.a f6328d;

    /* renamed from: e */
    public final LinkedHashSet<a> f6329e;

    /* renamed from: f */
    public b f6330f;

    /* renamed from: g */
    public PorterDuff.Mode f6331g;

    /* renamed from: h */
    public ColorStateList f6332h;

    /* renamed from: i */
    public Drawable f6333i;

    /* renamed from: j */
    public int f6334j;

    /* renamed from: k */
    public int f6335k;

    /* renamed from: l */
    public int f6336l;

    /* renamed from: m */
    public int f6337m;

    /* renamed from: n */
    public boolean f6338n;

    /* renamed from: o */
    public boolean f6339o;

    /* renamed from: p */
    public int f6340p;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static class c extends q1.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: c */
        public boolean f6341c;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new c[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            this.f6341c = parcel.readInt() == 1;
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // q1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f24504a, i10);
            parcel.writeInt(this.f6341c ? 1 : 0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButton(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private String getA11yClassName() {
        boolean z10;
        Class cls;
        o9.a aVar = this.f6328d;
        if (aVar != null && aVar.f22911q) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    public final boolean a() {
        o9.a aVar = this.f6328d;
        return (aVar == null || aVar.f22909o) ? false : true;
    }

    public final void b() {
        boolean z10;
        boolean z11;
        int i10 = this.f6340p;
        boolean z12 = false;
        if (i10 != 1 && i10 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            p.b.e(this, this.f6333i, null, null, null);
            return;
        }
        if (i10 != 3 && i10 != 4) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            p.b.e(this, null, null, this.f6333i, null);
            return;
        }
        if ((i10 == 16 || i10 == 32) ? true : true) {
            p.b.e(this, null, this.f6333i, null, null);
        }
    }

    public final void c(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        Drawable drawable = this.f6333i;
        boolean z14 = true;
        if (drawable != null) {
            Drawable mutate = b1.a.g(drawable).mutate();
            this.f6333i = mutate;
            a.b.h(mutate, this.f6332h);
            PorterDuff.Mode mode = this.f6331g;
            if (mode != null) {
                a.b.i(this.f6333i, mode);
            }
            int i10 = this.f6334j;
            if (i10 == 0) {
                i10 = this.f6333i.getIntrinsicWidth();
            }
            int i11 = this.f6334j;
            if (i11 == 0) {
                i11 = this.f6333i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f6333i;
            int i12 = this.f6335k;
            int i13 = this.f6336l;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
            this.f6333i.setVisible(true, z10);
        }
        if (z10) {
            b();
            return;
        }
        Drawable[] a10 = p.b.a(this);
        Drawable drawable3 = a10[0];
        Drawable drawable4 = a10[1];
        Drawable drawable5 = a10[2];
        int i14 = this.f6340p;
        if (i14 != 1 && i14 != 2) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11 || drawable3 == this.f6333i) {
            if (i14 != 3 && i14 != 4) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!z12 || drawable5 == this.f6333i) {
                if (i14 != 16 && i14 != 32) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (!z13 || drawable4 == this.f6333i) {
                    z14 = false;
                }
            }
        }
        if (z14) {
            b();
        }
    }

    public final void d(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f6333i != null && getLayout() != null) {
            int i12 = this.f6340p;
            boolean z13 = true;
            if (i12 != 1 && i12 != 2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                if (i12 != 3 && i12 != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!z12) {
                    if (i12 != 16 && i12 != 32) {
                        z13 = false;
                    }
                    if (z13) {
                        this.f6335k = 0;
                        if (i12 == 16) {
                            this.f6336l = 0;
                            c(false);
                        }
                        int i13 = this.f6334j;
                        if (i13 == 0) {
                            i13 = this.f6333i.getIntrinsicHeight();
                        }
                        int textHeight = (((((i11 - getTextHeight()) - getPaddingTop()) - i13) - this.f6337m) - getPaddingBottom()) / 2;
                        if (this.f6336l != textHeight) {
                            this.f6336l = textHeight;
                            c(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            this.f6336l = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i14 = this.f6340p;
            if (i14 != 1 && i14 != 3 && ((i14 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i14 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i15 = this.f6334j;
                if (i15 == 0) {
                    i15 = this.f6333i.getIntrinsicWidth();
                }
                int textWidth = i10 - getTextWidth();
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                int e10 = (((textWidth - o0.e.e(this)) - i15) - this.f6337m) - o0.e.f(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    e10 /= 2;
                }
                if (o0.e.d(this) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.f6340p != 4) {
                    z13 = false;
                }
                if (z11 != z13) {
                    e10 = -e10;
                }
                if (this.f6335k != e10) {
                    this.f6335k = e10;
                    c(false);
                    return;
                }
                return;
            }
            this.f6335k = 0;
            c(false);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f6328d.f22901g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f6333i;
    }

    public int getIconGravity() {
        return this.f6340p;
    }

    public int getIconPadding() {
        return this.f6337m;
    }

    public int getIconSize() {
        return this.f6334j;
    }

    public ColorStateList getIconTint() {
        return this.f6332h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f6331g;
    }

    public int getInsetBottom() {
        return this.f6328d.f22900f;
    }

    public int getInsetTop() {
        return this.f6328d.f22899e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f6328d.f22906l;
        }
        return null;
    }

    public i getShapeAppearanceModel() {
        if (a()) {
            return this.f6328d.f22896b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f6328d.f22905k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f6328d.f22902h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.f
    public ColorStateList getSupportBackgroundTintList() {
        if (a()) {
            return this.f6328d.f22904j;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.f
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (a()) {
            return this.f6328d.f22903i;
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f6338n;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            p.b.z(this, this.f6328d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        boolean z10;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        o9.a aVar = this.f6328d;
        if (aVar != null && aVar.f22911q) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            View.mergeDrawableStates(onCreateDrawableState, f6325q);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f6326r);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        o9.a aVar = this.f6328d;
        if (aVar != null && aVar.f22911q) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.f, android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        o9.a aVar;
        super.onLayout(z10, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f6328d) != null) {
            int i14 = i13 - i11;
            int i15 = i12 - i10;
            Drawable drawable = aVar.f22907m;
            if (drawable != null) {
                drawable.setBounds(aVar.f22897c, aVar.f22899e, i15 - aVar.f22898d, i14 - aVar.f22900f);
            }
        }
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f24504a);
        setChecked(cVar.f6341c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f6341c = this.f6338n;
        return cVar;
    }

    @Override // androidx.appcompat.widget.f, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f6333i != null) {
            if (this.f6333i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (a()) {
            o9.a aVar = this.f6328d;
            if (aVar.b(false) != null) {
                aVar.b(false).setTint(i10);
                return;
            }
            return;
        }
        super.setBackgroundColor(i10);
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (a()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                o9.a aVar = this.f6328d;
                aVar.f22909o = true;
                aVar.f22895a.setSupportBackgroundTintList(aVar.f22904j);
                aVar.f22895a.setSupportBackgroundTintMode(aVar.f22903i);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (a()) {
            this.f6328d.f22911q = z10;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        boolean z11;
        o9.a aVar = this.f6328d;
        if (aVar != null && aVar.f22911q) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && isEnabled() && this.f6338n != z10) {
            this.f6338n = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z12 = this.f6338n;
                if (!materialButtonToggleGroup.f6348f) {
                    materialButtonToggleGroup.b(getId(), z12);
                }
            }
            if (this.f6339o) {
                return;
            }
            this.f6339o = true;
            Iterator<a> it = this.f6329e.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.f6339o = false;
        }
    }

    public void setCornerRadius(int i10) {
        if (a()) {
            o9.a aVar = this.f6328d;
            if (!aVar.f22910p || aVar.f22901g != i10) {
                aVar.f22901g = i10;
                aVar.f22910p = true;
                aVar.c(aVar.f22896b.d(i10));
            }
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (a()) {
            this.f6328d.b(false).j(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f6333i != drawable) {
            this.f6333i = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f6340p != i10) {
            this.f6340p = i10;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f6337m != i10) {
            this.f6337m = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f6334j != i10) {
            this.f6334j = i10;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f6332h != colorStateList) {
            this.f6332h = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f6331g != mode) {
            this.f6331g = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(g.a.a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        o9.a aVar = this.f6328d;
        aVar.d(aVar.f22899e, i10);
    }

    public void setInsetTop(int i10) {
        o9.a aVar = this.f6328d;
        aVar.d(i10, aVar.f22900f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f6330f = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.f6330f;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            o9.a aVar = this.f6328d;
            if (aVar.f22906l != colorStateList) {
                aVar.f22906l = colorStateList;
                boolean z10 = o9.a.f22893t;
                if (z10 && (aVar.f22895a.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) aVar.f22895a.getBackground()).setColor(ea.b.c(colorStateList));
                } else if (!z10 && (aVar.f22895a.getBackground() instanceof ea.a)) {
                    ((ea.a) aVar.f22895a.getBackground()).setTintList(ea.b.c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i10) {
        if (a()) {
            setRippleColor(g.a.a(getContext(), i10));
        }
    }

    @Override // ga.m
    public void setShapeAppearanceModel(i iVar) {
        if (!a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f6328d.c(iVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (a()) {
            o9.a aVar = this.f6328d;
            aVar.f22908n = z10;
            aVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            o9.a aVar = this.f6328d;
            if (aVar.f22905k != colorStateList) {
                aVar.f22905k = colorStateList;
                aVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i10) {
        if (a()) {
            setStrokeColor(g.a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (a()) {
            o9.a aVar = this.f6328d;
            if (aVar.f22902h != i10) {
                aVar.f22902h = i10;
                aVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.f
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (a()) {
            o9.a aVar = this.f6328d;
            if (aVar.f22904j != colorStateList) {
                aVar.f22904j = colorStateList;
                if (aVar.b(false) != null) {
                    a.b.h(aVar.b(false), aVar.f22904j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // androidx.appcompat.widget.f
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (a()) {
            o9.a aVar = this.f6328d;
            if (aVar.f22903i != mode) {
                aVar.f22903i = mode;
                if (aVar.b(false) != null && aVar.f22903i != null) {
                    a.b.i(aVar.b(false), aVar.f22903i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f6338n);
    }
}
