package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.g;
import androidx.fragment.app.a0;
import b1.k;
import com.google.android.material.R;
import com.google.android.material.chip.a;
import da.e;
import ga.i;
import ga.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import l1.j;
import z9.h;

/* loaded from: classes.dex */
public class Chip extends g implements a.InterfaceC0091a, m, h<Chip> {

    /* renamed from: e */
    public com.google.android.material.chip.a f6364e;

    /* renamed from: f */
    public InsetDrawable f6365f;

    /* renamed from: g */
    public RippleDrawable f6366g;

    /* renamed from: h */
    public View.OnClickListener f6367h;

    /* renamed from: i */
    public CompoundButton.OnCheckedChangeListener f6368i;

    /* renamed from: j */
    public h.a<Chip> f6369j;

    /* renamed from: k */
    public boolean f6370k;

    /* renamed from: l */
    public boolean f6371l;

    /* renamed from: m */
    public boolean f6372m;

    /* renamed from: n */
    public boolean f6373n;

    /* renamed from: o */
    public boolean f6374o;

    /* renamed from: p */
    public int f6375p;

    /* renamed from: q */
    public int f6376q;

    /* renamed from: r */
    public CharSequence f6377r;

    /* renamed from: s */
    public final b f6378s;

    /* renamed from: t */
    public boolean f6379t;

    /* renamed from: u */
    public final Rect f6380u;

    /* renamed from: v */
    public final RectF f6381v;

    /* renamed from: w */
    public final a f6382w;

    /* renamed from: x */
    public static final int f6361x = R.style.Widget_MaterialComponents_Chip_Action;

    /* renamed from: y */
    public static final Rect f6362y = new Rect();

    /* renamed from: z */
    public static final int[] f6363z = {16842913};
    public static final int[] A = {16842911};

    /* loaded from: classes.dex */
    public class a extends a0 {
        public a() {
            Chip.this = r1;
        }

        @Override // androidx.fragment.app.a0
        public final void v(int i10) {
        }

        @Override // androidx.fragment.app.a0
        public final void w(Typeface typeface, boolean z10) {
            CharSequence text;
            Chip chip = Chip.this;
            com.google.android.material.chip.a aVar = chip.f6364e;
            if (aVar.R0) {
                text = aVar.H;
            } else {
                text = chip.getText();
            }
            chip.setText(text);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* loaded from: classes.dex */
    public class b extends r1.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Chip chip) {
            super(chip);
            Chip.this = r1;
        }

        @Override // r1.a
        public final void l(ArrayList arrayList) {
            boolean z10 = false;
            arrayList.add(0);
            Chip chip = Chip.this;
            int i10 = Chip.f6361x;
            if (chip.d()) {
                Chip chip2 = Chip.this;
                com.google.android.material.chip.a aVar = chip2.f6364e;
                if (aVar != null && aVar.W) {
                    z10 = true;
                }
                if (z10 && chip2.f6367h != null) {
                    arrayList.add(1);
                }
            }
        }

        @Override // r1.a
        public final void o(int i10, j jVar) {
            String str = "";
            if (i10 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription == null) {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i11 = R.string.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        str = text;
                    }
                    objArr[0] = str;
                    closeIconContentDescription = context.getString(i11, objArr).trim();
                }
                jVar.i(closeIconContentDescription);
                jVar.f18670a.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
                jVar.b(j.a.f18673e);
                jVar.f18670a.setEnabled(Chip.this.isEnabled());
                return;
            }
            jVar.i("");
            jVar.f18670a.setBoundsInParent(Chip.f6362y);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:202:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x039e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Chip(android.content.Context r18, android.util.AttributeSet r19) {
        /*
            Method dump skipped, instructions count: 982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private RectF getCloseIconTouchBounds() {
        this.f6381v.setEmpty();
        if (d() && this.f6367h != null) {
            com.google.android.material.chip.a aVar = this.f6364e;
            RectF rectF = this.f6381v;
            Rect bounds = aVar.getBounds();
            rectF.setEmpty();
            if (aVar.W()) {
                float f10 = aVar.f6410r0 + aVar.f6409q0 + aVar.f6395c0 + aVar.f6408p0 + aVar.f6407o0;
                if (b1.a.b(aVar) == 0) {
                    float f11 = bounds.right;
                    rectF.right = f11;
                    rectF.left = f11 - f10;
                } else {
                    float f12 = bounds.left;
                    rectF.left = f12;
                    rectF.right = f12 + f10;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return this.f6381v;
    }

    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f6380u.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f6380u;
    }

    private e getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            return aVar.f6417y0.f32157f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z10) {
        if (this.f6372m != z10) {
            this.f6372m = z10;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z10) {
        if (this.f6371l != z10) {
            this.f6371l = z10;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0091a
    public final void a() {
        c(this.f6376q);
        requestLayout();
        invalidateOutline();
    }

    public final void c(int i10) {
        int i11;
        int i12;
        this.f6376q = i10;
        if (!this.f6374o) {
            InsetDrawable insetDrawable = this.f6365f;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.f6365f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr = ea.b.f13510a;
                    f();
                    return;
                }
                return;
            }
            int[] iArr2 = ea.b.f13510a;
            f();
            return;
        }
        int max = Math.max(0, i10 - ((int) this.f6364e.B));
        int max2 = Math.max(0, i10 - this.f6364e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f6365f;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.f6365f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr3 = ea.b.f13510a;
                    f();
                    return;
                }
                return;
            }
            int[] iArr4 = ea.b.f13510a;
            f();
            return;
        }
        if (max2 > 0) {
            i11 = max2 / 2;
        } else {
            i11 = 0;
        }
        if (max > 0) {
            i12 = max / 2;
        } else {
            i12 = 0;
        }
        if (this.f6365f != null) {
            Rect rect = new Rect();
            this.f6365f.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                int[] iArr5 = ea.b.f13510a;
                f();
                return;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        this.f6365f = new InsetDrawable((Drawable) this.f6364e, i11, i12, i11, i12);
        int[] iArr6 = ea.b.f13510a;
        f();
    }

    public final boolean d() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            Drawable drawable = aVar.X;
            if (drawable != null) {
                if (drawable instanceof k) {
                    drawable = ((k) drawable).b();
                }
            } else {
                drawable = null;
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0070, code lost:
        if (r1 != Integer.MIN_VALUE) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f6379t
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchHoverEvent(r10)
            return r10
        L9:
            com.google.android.material.chip.Chip$b r0 = r9.f6378s
            android.view.accessibility.AccessibilityManager r1 = r0.f25154h
            boolean r1 = r1.isEnabled()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L74
            android.view.accessibility.AccessibilityManager r1 = r0.f25154h
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1e
            goto L74
        L1e:
            int r1 = r10.getAction()
            r4 = 7
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 256(0x100, float:3.59E-43)
            r7 = 128(0x80, float:1.8E-43)
            if (r1 == r4) goto L44
            r4 = 9
            if (r1 == r4) goto L44
            r4 = 10
            if (r1 == r4) goto L34
            goto L74
        L34:
            int r1 = r0.f25159m
            if (r1 == r5) goto L74
            if (r1 != r5) goto L3b
            goto L72
        L3b:
            r0.f25159m = r5
            r0.q(r5, r7)
            r0.q(r1, r6)
            goto L72
        L44:
            float r1 = r10.getX()
            float r4 = r10.getY()
            com.google.android.material.chip.Chip r8 = com.google.android.material.chip.Chip.this
            boolean r8 = r8.d()
            if (r8 == 0) goto L62
            com.google.android.material.chip.Chip r8 = com.google.android.material.chip.Chip.this
            android.graphics.RectF r8 = r8.getCloseIconTouchBounds()
            boolean r1 = r8.contains(r1, r4)
            if (r1 == 0) goto L62
            r1 = 1
            goto L63
        L62:
            r1 = 0
        L63:
            int r4 = r0.f25159m
            if (r4 != r1) goto L68
            goto L70
        L68:
            r0.f25159m = r1
            r0.q(r1, r7)
            r0.q(r4, r6)
        L70:
            if (r1 == r5) goto L74
        L72:
            r0 = 1
            goto L75
        L74:
            r0 = 0
        L75:
            if (r0 != 0) goto L7f
            boolean r10 = super.dispatchHoverEvent(r10)
            if (r10 == 0) goto L7e
            goto L7f
        L7e:
            r2 = 0
        L7f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f6379t) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b bVar = this.f6378s;
        bVar.getClass();
        boolean z10 = false;
        int i10 = 0;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        z10 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i11 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode != 19) {
                                    if (keyCode != 21) {
                                        if (keyCode != 22) {
                                            i11 = 130;
                                        }
                                    } else {
                                        i11 = 17;
                                    }
                                } else {
                                    i11 = 33;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z11 = false;
                                while (i10 < repeatCount && bVar.m(i11, null)) {
                                    i10++;
                                    z11 = true;
                                }
                                z10 = z11;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i12 = bVar.f25158l;
                    if (i12 != Integer.MIN_VALUE) {
                        if (i12 == 0) {
                            Chip.this.performClick();
                        } else if (i12 == 1) {
                            Chip chip = Chip.this;
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f6367h;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f6379t) {
                                chip.f6378s.q(1, 1);
                            }
                        }
                    }
                    z10 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z10 = bVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z10 = bVar.m(1, null);
            }
        }
        if (z10 && this.f6378s.f25158l != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // androidx.appcompat.widget.g, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i10;
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f6364e;
        boolean z10 = false;
        if (aVar != null && com.google.android.material.chip.a.x(aVar.X)) {
            com.google.android.material.chip.a aVar2 = this.f6364e;
            ?? isEnabled = isEnabled();
            int i11 = isEnabled;
            if (this.f6373n) {
                i11 = isEnabled + 1;
            }
            int i12 = i11;
            if (this.f6372m) {
                i12 = i11 + 1;
            }
            int i13 = i12;
            if (this.f6371l) {
                i13 = i12 + 1;
            }
            int i14 = i13;
            if (isChecked()) {
                i14 = i13 + 1;
            }
            int[] iArr = new int[i14];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (this.f6373n) {
                iArr[i10] = 16842908;
                i10++;
            }
            if (this.f6372m) {
                iArr[i10] = 16843623;
                i10++;
            }
            if (this.f6371l) {
                iArr[i10] = 16842919;
                i10++;
            }
            if (isChecked()) {
                iArr[i10] = 16842913;
            }
            if (!Arrays.equals(aVar2.M0, iArr)) {
                aVar2.M0 = iArr;
                if (aVar2.W()) {
                    z10 = aVar2.z(aVar2.getState(), iArr);
                }
            }
        }
        if (z10) {
            invalidate();
        }
    }

    public final void e() {
        boolean z10;
        boolean z11 = true;
        if (d()) {
            com.google.android.material.chip.a aVar = this.f6364e;
            if (aVar != null && aVar.W) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && this.f6367h != null) {
                o0.p(this, this.f6378s);
                this.f6379t = z11;
            }
        }
        o0.p(this, null);
        z11 = false;
        this.f6379t = z11;
    }

    public final void f() {
        this.f6366g = new RippleDrawable(ea.b.c(this.f6364e.F), getBackgroundDrawable(), null);
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar.N0) {
            aVar.N0 = false;
            aVar.O0 = null;
            aVar.onStateChange(aVar.getState());
        }
        RippleDrawable rippleDrawable = this.f6366g;
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        o0.d.q(this, rippleDrawable);
        g();
    }

    public final void g() {
        com.google.android.material.chip.a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f6364e) != null) {
            int u10 = (int) (aVar.u() + aVar.f6410r0 + aVar.f6407o0);
            com.google.android.material.chip.a aVar2 = this.f6364e;
            int t10 = (int) (aVar2.t() + aVar2.f6403k0 + aVar2.f6406n0);
            if (this.f6365f != null) {
                Rect rect = new Rect();
                this.f6365f.getPadding(rect);
                t10 += rect.left;
                u10 += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.e.k(this, t10, paddingTop, u10, paddingBottom);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        boolean z10;
        if (!TextUtils.isEmpty(this.f6377r)) {
            return this.f6377r;
        }
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null && aVar.f6397e0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ViewParent parent = getParent();
            if ((parent instanceof ChipGroup) && ((ChipGroup) parent).f6389h.f32072d) {
                return "android.widget.RadioButton";
            }
            return "android.widget.CompoundButton";
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f6365f;
        return insetDrawable == null ? this.f6364e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            return aVar.f6399g0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            return aVar.f6400h0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            return aVar.A;
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            return Math.max(0.0f, aVar.v());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f6364e;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            return aVar.f6410r0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar == null || (drawable = aVar.M) == null) {
            return null;
        }
        if (drawable instanceof k) {
            drawable = ((k) drawable).b();
        }
        return drawable;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            return aVar.U;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            return aVar.Q;
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            return aVar.B;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            return aVar.f6403k0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            return aVar.D;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            return aVar.E;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar == null || (drawable = aVar.X) == null) {
            return null;
        }
        if (drawable instanceof k) {
            drawable = ((k) drawable).b();
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            return aVar.f6396d0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            return aVar.f6409q0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            return aVar.f6395c0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            return aVar.f6408p0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            return aVar.Z;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            return aVar.Q0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f6379t) {
            b bVar = this.f6378s;
            if (bVar.f25158l == 1 || bVar.f25157k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public h9.g getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            return aVar.f6402j0;
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            return aVar.f6405m0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            return aVar.f6404l0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            return aVar.F;
        }
        return null;
    }

    public i getShapeAppearanceModel() {
        return this.f6364e.f15069a.f15093a;
    }

    public h9.g getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            return aVar.f6401i0;
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            return aVar.f6407o0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            return aVar.f6406n0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        e textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f6382w);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p.b.z(this, this.f6364e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        boolean z10;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f6363z);
        }
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null && aVar.f6397e0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            View.mergeDrawableStates(onCreateDrawableState, A);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (this.f6379t) {
            b bVar = this.f6378s;
            int i11 = bVar.f25158l;
            if (i11 != Integer.MIN_VALUE) {
                bVar.j(i11);
            }
            if (z10) {
                bVar.m(i10, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                contains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(contains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null && aVar.f6397e0) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            int i11 = -1;
            if (chipGroup.f32124c) {
                i10 = 0;
                for (int i12 = 0; i12 < chipGroup.getChildCount(); i12++) {
                    if (chipGroup.getChildAt(i12) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i12)) == this) {
                            break;
                        }
                        i10++;
                    }
                }
            }
            i10 = -1;
            Object tag = getTag(R.id.row_index_key);
            if (tag instanceof Integer) {
                i11 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) j.c.a(i11, 1, i10, 1, isChecked()).f18686a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f6375p != i10) {
            this.f6375p = i10;
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x001e, code lost:
        if (r0 != 3) goto L16;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L49
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L44
            goto L50
        L21:
            boolean r0 = r5.f6371l
            if (r0 == 0) goto L50
            if (r1 != 0) goto L4e
            r5.setCloseIconPressed(r2)
            goto L4e
        L2b:
            boolean r0 = r5.f6371l
            if (r0 == 0) goto L44
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f6367h
            if (r0 == 0) goto L39
            r0.onClick(r5)
        L39:
            boolean r0 = r5.f6379t
            if (r0 == 0) goto L42
            com.google.android.material.chip.Chip$b r0 = r5.f6378s
            r0.q(r3, r3)
        L42:
            r0 = 1
            goto L45
        L44:
            r0 = 0
        L45:
            r5.setCloseIconPressed(r2)
            goto L51
        L49:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r3)
        L4e:
            r0 = 1
            goto L51
        L50:
            r0 = 0
        L51:
            if (r0 != 0) goto L59
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
        L59:
            r2 = 1
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f6377r = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f6366g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.g, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f6366g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.g, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.A(z10);
        }
    }

    public void setCheckableResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.A(aVar.f6411s0.getResources().getBoolean(i10));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar == null) {
            this.f6370k = z10;
        } else if (aVar.f6397e0) {
            super.setChecked(z10);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.B(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z10) {
        setCheckedIconVisible(z10);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.B(g.a.b(aVar.f6411s0, i10));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.C(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.C(g.a.a(aVar.f6411s0, i10));
        }
    }

    public void setCheckedIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.D(aVar.f6411s0.getResources().getBoolean(i10));
        }
    }

    public void setCheckedIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.D(z10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar == null || aVar.A == colorStateList) {
            return;
        }
        aVar.A = colorStateList;
        aVar.onStateChange(aVar.getState());
    }

    public void setChipBackgroundColorResource(int i10) {
        ColorStateList a10;
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null && aVar.A != (a10 = g.a.a(aVar.f6411s0, i10))) {
            aVar.A = a10;
            aVar.onStateChange(aVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.E(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.E(aVar.f6411s0.getResources().getDimension(i10));
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f6364e;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.P0 = new WeakReference<>(null);
            }
            this.f6364e = aVar;
            aVar.R0 = false;
            aVar.P0 = new WeakReference<>(this);
            c(this.f6376q);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar == null || aVar.f6410r0 == f10) {
            return;
        }
        aVar.f6410r0 = f10;
        aVar.invalidateSelf();
        aVar.y();
    }

    public void setChipEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            float dimension = aVar.f6411s0.getResources().getDimension(i10);
            if (aVar.f6410r0 != dimension) {
                aVar.f6410r0 = dimension;
                aVar.invalidateSelf();
                aVar.y();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.F(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z10) {
        setChipIconVisible(z10);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.F(g.a.b(aVar.f6411s0, i10));
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.G(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.G(aVar.f6411s0.getResources().getDimension(i10));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.H(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.H(g.a.a(aVar.f6411s0, i10));
        }
    }

    public void setChipIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.I(aVar.f6411s0.getResources().getBoolean(i10));
        }
    }

    public void setChipIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.I(z10);
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar == null || aVar.B == f10) {
            return;
        }
        aVar.B = f10;
        aVar.invalidateSelf();
        aVar.y();
    }

    public void setChipMinHeightResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            float dimension = aVar.f6411s0.getResources().getDimension(i10);
            if (aVar.B != dimension) {
                aVar.B = dimension;
                aVar.invalidateSelf();
                aVar.y();
            }
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar == null || aVar.f6403k0 == f10) {
            return;
        }
        aVar.f6403k0 = f10;
        aVar.invalidateSelf();
        aVar.y();
    }

    public void setChipStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            float dimension = aVar.f6411s0.getResources().getDimension(i10);
            if (aVar.f6403k0 != dimension) {
                aVar.f6403k0 = dimension;
                aVar.invalidateSelf();
                aVar.y();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.J(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.J(g.a.a(aVar.f6411s0, i10));
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.K(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.K(aVar.f6411s0.getResources().getDimension(i10));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.L(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null && aVar.f6396d0 != charSequence) {
            i1.a c10 = i1.a.c();
            aVar.f6396d0 = c10.d(charSequence, c10.f16203c);
            aVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z10) {
        setCloseIconVisible(z10);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.M(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.M(aVar.f6411s0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.L(g.a.b(aVar.f6411s0, i10));
        }
        e();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.N(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.N(aVar.f6411s0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.O(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.O(aVar.f6411s0.getResources().getDimension(i10));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.P(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.P(g.a.a(aVar.f6411s0, i10));
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    public void setCloseIconVisible(boolean z10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.Q(z10);
        }
        e();
    }

    @Override // androidx.appcompat.widget.g, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.g, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.j(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f6364e == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            com.google.android.material.chip.a aVar = this.f6364e;
            if (aVar != null) {
                aVar.Q0 = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        this.f6374o = z10;
        c(this.f6376q);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(h9.g gVar) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.f6402j0 = gVar;
        }
    }

    public void setHideMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.f6402j0 = h9.g.b(aVar.f6411s0, i10);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.R(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.R(aVar.f6411s0.getResources().getDimension(i10));
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.S(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.S(aVar.f6411s0.getResources().getDimension(i10));
        }
    }

    @Override // z9.h
    public void setInternalOnCheckedChangeListener(h.a<Chip> aVar) {
        this.f6369j = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f6364e == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.S0 = i10;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f6368i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f6367h = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.T(colorStateList);
        }
        if (!this.f6364e.N0) {
            f();
        }
    }

    public void setRippleColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.T(g.a.a(aVar.f6411s0, i10));
            if (!this.f6364e.N0) {
                f();
            }
        }
    }

    @Override // ga.m
    public void setShapeAppearanceModel(i iVar) {
        this.f6364e.setShapeAppearanceModel(iVar);
    }

    public void setShowMotionSpec(h9.g gVar) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.f6401i0 = gVar;
        }
    }

    public void setShowMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.f6401i0 = h9.g.b(aVar.f6411s0, i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z10) {
        if (!z10) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z10);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (aVar.R0) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        super.setText(charSequence2, bufferType);
        com.google.android.material.chip.a aVar2 = this.f6364e;
        if (aVar2 != null && !TextUtils.equals(aVar2.H, charSequence)) {
            aVar2.H = charSequence;
            aVar2.f6417y0.f32155d = true;
            aVar2.invalidateSelf();
            aVar2.y();
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.f6417y0.b(new e(aVar.f6411s0, i10), aVar.f6411s0);
        }
        h();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar == null || aVar.f6407o0 == f10) {
            return;
        }
        aVar.f6407o0 = f10;
        aVar.invalidateSelf();
        aVar.y();
    }

    public void setTextEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            float dimension = aVar.f6411s0.getResources().getDimension(i10);
            if (aVar.f6407o0 != dimension) {
                aVar.f6407o0 = dimension;
                aVar.invalidateSelf();
                aVar.y();
            }
        }
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar == null || aVar.f6406n0 == f10) {
            return;
        }
        aVar.f6406n0 = f10;
        aVar.invalidateSelf();
        aVar.y();
    }

    public void setTextStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            float dimension = aVar.f6411s0.getResources().getDimension(i10);
            if (aVar.f6406n0 != dimension) {
                aVar.f6406n0 = dimension;
                aVar.invalidateSelf();
                aVar.y();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.f6417y0.b(new e(aVar.f6411s0, i10), aVar.f6411s0);
        }
        h();
    }

    public void setTextAppearance(e eVar) {
        com.google.android.material.chip.a aVar = this.f6364e;
        if (aVar != null) {
            aVar.f6417y0.b(eVar, aVar.f6411s0);
        }
        h();
    }
}
