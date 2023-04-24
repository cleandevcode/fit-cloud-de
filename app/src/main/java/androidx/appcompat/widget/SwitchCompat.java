package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.appcompat.R;
import androidx.emoji2.text.f;
import b1.a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import k1.o0;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: g0 */
    public static final a f1179g0 = new a();

    /* renamed from: h0 */
    public static final int[] f1180h0 = {16842912};
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int H;
    public boolean L;
    public final TextPaint M;
    public ColorStateList Q;
    public StaticLayout U;
    public StaticLayout V;
    public j.a W;

    /* renamed from: a */
    public Drawable f1181a;

    /* renamed from: b */
    public ColorStateList f1182b;

    /* renamed from: c */
    public PorterDuff.Mode f1183c;

    /* renamed from: c0 */
    public ObjectAnimator f1184c0;

    /* renamed from: d */
    public boolean f1185d;

    /* renamed from: d0 */
    public n f1186d0;

    /* renamed from: e */
    public boolean f1187e;

    /* renamed from: e0 */
    public c f1188e0;

    /* renamed from: f */
    public Drawable f1189f;

    /* renamed from: f0 */
    public final Rect f1190f0;

    /* renamed from: g */
    public ColorStateList f1191g;

    /* renamed from: h */
    public PorterDuff.Mode f1192h;

    /* renamed from: i */
    public boolean f1193i;

    /* renamed from: j */
    public boolean f1194j;

    /* renamed from: k */
    public int f1195k;

    /* renamed from: l */
    public int f1196l;

    /* renamed from: m */
    public int f1197m;

    /* renamed from: n */
    public boolean f1198n;

    /* renamed from: o */
    public CharSequence f1199o;

    /* renamed from: p */
    public CharSequence f1200p;

    /* renamed from: q */
    public CharSequence f1201q;

    /* renamed from: r */
    public CharSequence f1202r;

    /* renamed from: s */
    public boolean f1203s;

    /* renamed from: t */
    public int f1204t;

    /* renamed from: u */
    public int f1205u;

    /* renamed from: v */
    public float f1206v;

    /* renamed from: w */
    public float f1207w;

    /* renamed from: x */
    public VelocityTracker f1208x;

    /* renamed from: y */
    public int f1209y;

    /* renamed from: z */
    public float f1210z;

    /* loaded from: classes.dex */
    public class a extends Property<SwitchCompat, Float> {
        public a() {
            super(Float.class, "thumbPos");
        }

        @Override // android.util.Property
        public final Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f1210z);
        }

        @Override // android.util.Property
        public final void set(SwitchCompat switchCompat, Float f10) {
            switchCompat.setThumbPosition(f10.floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(ObjectAnimator objectAnimator, boolean z10) {
            objectAnimator.setAutoCancel(z10);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends f.e {

        /* renamed from: a */
        public final WeakReference f1211a;

        public c(SwitchCompat switchCompat) {
            this.f1211a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.f.e
        public final void a() {
            SwitchCompat switchCompat = (SwitchCompat) this.f1211a.get();
            if (switchCompat != null) {
                switchCompat.d();
            }
        }

        @Override // androidx.emoji2.text.f.e
        public final void b() {
            SwitchCompat switchCompat = (SwitchCompat) this.f1211a.get();
            if (switchCompat != null) {
                switchCompat.d();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Typeface typeface;
        Typeface create;
        int i11;
        int resourceId;
        this.f1182b = null;
        this.f1183c = null;
        this.f1185d = false;
        this.f1187e = false;
        this.f1191g = null;
        this.f1192h = null;
        this.f1193i = false;
        this.f1194j = false;
        this.f1208x = VelocityTracker.obtain();
        this.L = true;
        this.f1190f0 = new Rect();
        g2.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.M = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = R.styleable.SwitchCompat;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        l2 l2Var = new l2(context, obtainStyledAttributes);
        k1.o0.o(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        Drawable e10 = l2Var.e(R.styleable.SwitchCompat_android_thumb);
        this.f1181a = e10;
        if (e10 != null) {
            e10.setCallback(this);
        }
        Drawable e11 = l2Var.e(R.styleable.SwitchCompat_track);
        this.f1189f = e11;
        if (e11 != null) {
            e11.setCallback(this);
        }
        setTextOnInternal(l2Var.k(R.styleable.SwitchCompat_android_textOn));
        setTextOffInternal(l2Var.k(R.styleable.SwitchCompat_android_textOff));
        this.f1203s = l2Var.a(R.styleable.SwitchCompat_showText, true);
        this.f1195k = l2Var.d(R.styleable.SwitchCompat_thumbTextPadding, 0);
        this.f1196l = l2Var.d(R.styleable.SwitchCompat_switchMinWidth, 0);
        this.f1197m = l2Var.d(R.styleable.SwitchCompat_switchPadding, 0);
        this.f1198n = l2Var.a(R.styleable.SwitchCompat_splitTrack, false);
        ColorStateList b10 = l2Var.b(R.styleable.SwitchCompat_thumbTint);
        if (b10 != null) {
            this.f1182b = b10;
            this.f1185d = true;
        }
        PorterDuff.Mode d10 = k1.d(l2Var.h(R.styleable.SwitchCompat_thumbTintMode, -1), null);
        if (this.f1183c != d10) {
            this.f1183c = d10;
            this.f1187e = true;
        }
        if (this.f1185d || this.f1187e) {
            a();
        }
        ColorStateList b11 = l2Var.b(R.styleable.SwitchCompat_trackTint);
        if (b11 != null) {
            this.f1191g = b11;
            this.f1193i = true;
        }
        PorterDuff.Mode d11 = k1.d(l2Var.h(R.styleable.SwitchCompat_trackTintMode, -1), null);
        if (this.f1192h != d11) {
            this.f1192h = d11;
            this.f1194j = true;
        }
        if (this.f1193i || this.f1194j) {
            b();
        }
        int i12 = l2Var.i(R.styleable.SwitchCompat_switchTextAppearance, 0);
        if (i12 != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i12, R.styleable.TextAppearance);
            int i13 = R.styleable.TextAppearance_android_textColor;
            ColorStateList colorStateList = (!obtainStyledAttributes2.hasValue(i13) || (resourceId = obtainStyledAttributes2.getResourceId(i13, 0)) == 0 || (colorStateList = g.a.a(context, resourceId)) == null) ? obtainStyledAttributes2.getColorStateList(i13) : colorStateList;
            this.Q = colorStateList == null ? getTextColors() : colorStateList;
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, 0);
            if (dimensionPixelSize != 0) {
                float f10 = dimensionPixelSize;
                if (f10 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f10);
                    requestLayout();
                }
            }
            int i14 = obtainStyledAttributes2.getInt(R.styleable.TextAppearance_android_typeface, -1);
            int i15 = obtainStyledAttributes2.getInt(R.styleable.TextAppearance_android_textStyle, -1);
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        typeface = null;
                    } else {
                        typeface = Typeface.MONOSPACE;
                    }
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.SANS_SERIF;
            }
            if (i15 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(i15);
                } else {
                    create = Typeface.create(typeface, i15);
                }
                setSwitchTypeface(create);
                if (create != null) {
                    i11 = create.getStyle();
                } else {
                    i11 = 0;
                }
                int i16 = i15 & (~i11);
                textPaint.setFakeBoldText((i16 & 1) != 0);
                textPaint.setTextSkewX((i16 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            this.W = obtainStyledAttributes2.getBoolean(R.styleable.TextAppearance_textAllCaps, false) ? new j.a(getContext()) : null;
            setTextOnInternal(this.f1199o);
            setTextOffInternal(this.f1201q);
            obtainStyledAttributes2.recycle();
        }
        new v0(this).f(attributeSet, i10);
        l2Var.n();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1205u = viewConfiguration.getScaledTouchSlop();
        this.f1209y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private n getEmojiTextViewHelper() {
        if (this.f1186d0 == null) {
            this.f1186d0 = new n(this);
        }
        return this.f1186d0;
    }

    private boolean getTargetCheckedState() {
        return this.f1210z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((x2.a(this) ? 1.0f - this.f1210z : this.f1210z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1189f;
        if (drawable != null) {
            Rect rect = this.f1190f0;
            drawable.getPadding(rect);
            Drawable drawable2 = this.f1181a;
            Rect c10 = drawable2 != null ? k1.c(drawable2) : k1.f1398c;
            return ((((this.A - this.C) - rect.left) - rect.right) - c10.left) - c10.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1201q = charSequence;
        n emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod e10 = emojiTextViewHelper.f1442b.f30822a.e(this.W);
        if (e10 != null) {
            charSequence = e10.getTransformation(charSequence, this);
        }
        this.f1202r = charSequence;
        this.V = null;
        if (this.f1203s) {
            e();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1199o = charSequence;
        n emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod e10 = emojiTextViewHelper.f1442b.f30822a.e(this.W);
        if (e10 != null) {
            charSequence = e10.getTransformation(charSequence, this);
        }
        this.f1200p = charSequence;
        this.U = null;
        if (this.f1203s) {
            e();
        }
    }

    public final void a() {
        Drawable drawable = this.f1181a;
        if (drawable != null) {
            if (this.f1185d || this.f1187e) {
                Drawable mutate = b1.a.g(drawable).mutate();
                this.f1181a = mutate;
                if (this.f1185d) {
                    a.b.h(mutate, this.f1182b);
                }
                if (this.f1187e) {
                    a.b.i(this.f1181a, this.f1183c);
                }
                if (this.f1181a.isStateful()) {
                    this.f1181a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f1189f;
        if (drawable != null) {
            if (this.f1193i || this.f1194j) {
                Drawable mutate = b1.a.g(drawable).mutate();
                this.f1189f = mutate;
                if (this.f1193i) {
                    a.b.h(mutate, this.f1191g);
                }
                if (this.f1194j) {
                    a.b.i(this.f1189f, this.f1192h);
                }
                if (this.f1189f.isStateful()) {
                    this.f1189f.setState(getDrawableState());
                }
            }
        }
    }

    public final StaticLayout c(CharSequence charSequence) {
        TextPaint textPaint = this.M;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public final void d() {
        setTextOnInternal(this.f1199o);
        setTextOffInternal(this.f1201q);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        int i10;
        int i11;
        Rect rect2 = this.f1190f0;
        int i12 = this.D;
        int i13 = this.E;
        int i14 = this.F;
        int i15 = this.H;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f1181a;
        if (drawable != null) {
            rect = k1.c(drawable);
        } else {
            rect = k1.f1398c;
        }
        Drawable drawable2 = this.f1189f;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i16 = rect2.left;
            thumbOffset += i16;
            if (rect != null) {
                int i17 = rect.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rect.top;
                int i19 = rect2.top;
                if (i18 > i19) {
                    i10 = (i18 - i19) + i13;
                } else {
                    i10 = i13;
                }
                int i20 = rect.right;
                int i21 = rect2.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rect.bottom;
                int i23 = rect2.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                    this.f1189f.setBounds(i12, i10, i14, i11);
                }
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f1189f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f1181a;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i24 = thumbOffset - rect2.left;
            int i25 = thumbOffset + this.C + rect2.right;
            this.f1181a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                a.b.f(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f1181a;
        if (drawable != null) {
            a.b.e(drawable, f10, f11);
        }
        Drawable drawable2 = this.f1189f;
        if (drawable2 != null) {
            a.b.e(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1181a;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1189f;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public final void e() {
        boolean z10;
        if (this.f1188e0 == null && this.f1186d0.f1442b.f30822a.b()) {
            if (androidx.emoji2.text.f.f2236j != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                androidx.emoji2.text.f a10 = androidx.emoji2.text.f.a();
                int b10 = a10.b();
                if (b10 == 3 || b10 == 0) {
                    c cVar = new c(this);
                    this.f1188e0 = cVar;
                    a10.g(cVar);
                }
            }
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (x2.a(this)) {
            int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.A;
            return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1197m : compoundPaddingLeft;
        }
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (x2.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1197m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return o1.p.f(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f1203s;
    }

    public boolean getSplitTrack() {
        return this.f1198n;
    }

    public int getSwitchMinWidth() {
        return this.f1196l;
    }

    public int getSwitchPadding() {
        return this.f1197m;
    }

    public CharSequence getTextOff() {
        return this.f1201q;
    }

    public CharSequence getTextOn() {
        return this.f1199o;
    }

    public Drawable getThumbDrawable() {
        return this.f1181a;
    }

    public final float getThumbPosition() {
        return this.f1210z;
    }

    public int getThumbTextPadding() {
        return this.f1195k;
    }

    public ColorStateList getThumbTintList() {
        return this.f1182b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1183c;
    }

    public Drawable getTrackDrawable() {
        return this.f1189f;
    }

    public ColorStateList getTrackTintList() {
        return this.f1191g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1192h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1181a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1189f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1184c0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f1184c0.end();
        this.f1184c0 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1180h0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f1190f0;
        Drawable drawable = this.f1189f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.E;
        int i11 = this.H;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f1181a;
        if (drawable != null) {
            if (!this.f1198n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect c10 = k1.c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += c10.left;
                rect.right -= c10.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.U : this.V;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.Q;
            if (colorStateList != null) {
                this.M.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.M.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i12 + i13) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f1199o : this.f1201q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int width;
        int i15;
        int i16;
        int i17;
        super.onLayout(z10, i10, i11, i12, i13);
        int i18 = 0;
        if (this.f1181a != null) {
            Rect rect = this.f1190f0;
            Drawable drawable = this.f1189f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect c10 = k1.c(this.f1181a);
            i14 = Math.max(0, c10.left - rect.left);
            i18 = Math.max(0, c10.right - rect.right);
        } else {
            i14 = 0;
        }
        if (x2.a(this)) {
            i15 = getPaddingLeft() + i14;
            width = ((this.A + i15) - i14) - i18;
        } else {
            width = (getWidth() - getPaddingRight()) - i18;
            i15 = (width - this.A) + i14 + i18;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int i19 = this.B;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i19 / 2);
            i16 = i19 + height;
            i17 = height;
        } else if (gravity != 80) {
            i17 = getPaddingTop();
            i16 = this.B + i17;
        } else {
            i16 = getHeight() - getPaddingBottom();
            i17 = i16 - this.B;
        }
        this.D = i15;
        this.E = i17;
        this.H = i16;
        this.F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        if (this.f1203s) {
            if (this.U == null) {
                this.U = c(this.f1200p);
            }
            if (this.V == null) {
                this.V = c(this.f1202r);
            }
        }
        Rect rect = this.f1190f0;
        Drawable drawable = this.f1181a;
        int i14 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i12 = (this.f1181a.getIntrinsicWidth() - rect.left) - rect.right;
            i13 = this.f1181a.getIntrinsicHeight();
        } else {
            i12 = 0;
            i13 = 0;
        }
        this.C = Math.max(this.f1203s ? (this.f1195k * 2) + Math.max(this.U.getWidth(), this.V.getWidth()) : 0, i12);
        Drawable drawable2 = this.f1189f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i14 = this.f1189f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i15 = rect.left;
        int i16 = rect.right;
        Drawable drawable3 = this.f1181a;
        if (drawable3 != null) {
            Rect c10 = k1.c(drawable3);
            i15 = Math.max(i15, c10.left);
            i16 = Math.max(i16, c10.right);
        }
        int max = this.L ? Math.max(this.f1196l, (this.C * 2) + i15 + i16) : this.f1196l;
        int max2 = Math.max(i14, i13);
        this.A = max;
        this.B = max2;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1199o : this.f1201q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0014, code lost:
        if (r0 != 3) goto L7;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.f1199o;
                if (obj == null) {
                    obj = getResources().getString(R.string.abc_capital_on);
                }
                WeakHashMap<View, k1.i2> weakHashMap = k1.o0.f18161a;
                new k1.m0(androidx.core.R.id.tag_state_description, CharSequence.class).e(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj2 = this.f1201q;
            if (obj2 == null) {
                obj2 = getResources().getString(R.string.abc_capital_off);
            }
            WeakHashMap<View, k1.i2> weakHashMap2 = k1.o0.f18161a;
            new k1.m0(androidx.core.R.id.tag_state_description, CharSequence.class).e(this, obj2);
        }
        float f10 = 1.0f;
        if (getWindowToken() != null) {
            WeakHashMap<View, k1.i2> weakHashMap3 = k1.o0.f18161a;
            if (o0.g.c(this)) {
                if (!isChecked) {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1179g0, f10);
                this.f1184c0 = ofFloat;
                ofFloat.setDuration(250L);
                b.a(this.f1184c0, true);
                this.f1184c0.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f1184c0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!isChecked) {
            f10 = 0.0f;
        }
        setThumbPosition(f10);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(o1.p.g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
        setTextOnInternal(this.f1199o);
        setTextOffInternal(this.f1201q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z10) {
        this.L = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f1203s != z10) {
            this.f1203s = z10;
            requestLayout();
            if (z10) {
                e();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f1198n = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f1196l = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f1197m = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.M.getTypeface() == null || this.M.getTypeface().equals(typeface)) && (this.M.getTypeface() != null || typeface == null)) {
            return;
        }
        this.M.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f1201q;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_off);
            }
            WeakHashMap<View, k1.i2> weakHashMap = k1.o0.f18161a;
            new k1.m0(androidx.core.R.id.tag_state_description, CharSequence.class).e(this, obj);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f1199o;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_on);
            }
            WeakHashMap<View, k1.i2> weakHashMap = k1.o0.f18161a;
            new k1.m0(androidx.core.R.id.tag_state_description, CharSequence.class).e(this, obj);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1181a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1181a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.f1210z = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(g.a.b(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f1195k = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1182b = colorStateList;
        this.f1185d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1183c = mode;
        this.f1187e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1189f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1189f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(g.a.b(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1191g = colorStateList;
        this.f1193i = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1192h = mode;
        this.f1194j = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1181a || drawable == this.f1189f;
    }
}
