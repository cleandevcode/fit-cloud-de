package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import b1.a;
import b1.k;
import da.e;
import ga.f;
import ga.j;
import h9.g;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import z9.l;
import z9.r;

/* loaded from: classes.dex */
public final class a extends f implements Drawable.Callback, l.b {
    public static final int[] U0 = {16842910};
    public static final ShapeDrawable V0 = new ShapeDrawable(new OvalShape());
    public ColorStateList A;
    public int A0;
    public float B;
    public int B0;
    public float C;
    public int C0;
    public ColorStateList D;
    public int D0;
    public float E;
    public int E0;
    public ColorStateList F;
    public boolean F0;
    public int G0;
    public CharSequence H;
    public int H0;
    public ColorFilter I0;
    public PorterDuffColorFilter J0;
    public ColorStateList K0;
    public boolean L;
    public PorterDuff.Mode L0;
    public Drawable M;
    public int[] M0;
    public boolean N0;
    public ColorStateList O0;
    public WeakReference<InterfaceC0091a> P0;
    public ColorStateList Q;
    public TextUtils.TruncateAt Q0;
    public boolean R0;
    public int S0;
    public boolean T0;
    public float U;
    public boolean V;
    public boolean W;
    public Drawable X;
    public RippleDrawable Y;
    public ColorStateList Z;

    /* renamed from: c0 */
    public float f6395c0;

    /* renamed from: d0 */
    public SpannableStringBuilder f6396d0;

    /* renamed from: e0 */
    public boolean f6397e0;

    /* renamed from: f0 */
    public boolean f6398f0;

    /* renamed from: g0 */
    public Drawable f6399g0;

    /* renamed from: h0 */
    public ColorStateList f6400h0;

    /* renamed from: i0 */
    public g f6401i0;

    /* renamed from: j0 */
    public g f6402j0;

    /* renamed from: k0 */
    public float f6403k0;

    /* renamed from: l0 */
    public float f6404l0;

    /* renamed from: m0 */
    public float f6405m0;

    /* renamed from: n0 */
    public float f6406n0;

    /* renamed from: o0 */
    public float f6407o0;

    /* renamed from: p0 */
    public float f6408p0;

    /* renamed from: q0 */
    public float f6409q0;

    /* renamed from: r0 */
    public float f6410r0;

    /* renamed from: s0 */
    public final Context f6411s0;

    /* renamed from: t0 */
    public final Paint f6412t0;

    /* renamed from: u0 */
    public final Paint.FontMetrics f6413u0;

    /* renamed from: v0 */
    public final RectF f6414v0;

    /* renamed from: w0 */
    public final PointF f6415w0;

    /* renamed from: x0 */
    public final Path f6416x0;

    /* renamed from: y0 */
    public final l f6417y0;

    /* renamed from: z */
    public ColorStateList f6418z;

    /* renamed from: z0 */
    public int f6419z0;

    /* renamed from: com.google.android.material.chip.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0091a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, Chip.f6361x);
        this.C = -1.0f;
        this.f6412t0 = new Paint(1);
        this.f6413u0 = new Paint.FontMetrics();
        this.f6414v0 = new RectF();
        this.f6415w0 = new PointF();
        this.f6416x0 = new Path();
        this.H0 = 255;
        this.L0 = PorterDuff.Mode.SRC_IN;
        this.P0 = new WeakReference<>(null);
        i(context);
        this.f6411s0 = context;
        l lVar = new l(this);
        this.f6417y0 = lVar;
        this.H = "";
        lVar.f32152a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = U0;
        setState(iArr);
        if (!Arrays.equals(this.M0, iArr)) {
            this.M0 = iArr;
            if (W()) {
                z(getState(), iArr);
            }
        }
        this.R0 = true;
        int[] iArr2 = ea.b.f13510a;
        V0.setTint(-1);
    }

    public static void X(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean w(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean x(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(boolean z10) {
        if (this.f6397e0 != z10) {
            this.f6397e0 = z10;
            float t10 = t();
            if (!z10 && this.F0) {
                this.F0 = false;
            }
            float t11 = t();
            invalidateSelf();
            if (t10 != t11) {
                y();
            }
        }
    }

    public final void B(Drawable drawable) {
        if (this.f6399g0 != drawable) {
            float t10 = t();
            this.f6399g0 = drawable;
            float t11 = t();
            X(this.f6399g0);
            r(this.f6399g0);
            invalidateSelf();
            if (t10 != t11) {
                y();
            }
        }
    }

    public final void C(ColorStateList colorStateList) {
        boolean z10;
        if (this.f6400h0 != colorStateList) {
            this.f6400h0 = colorStateList;
            if (this.f6398f0 && this.f6399g0 != null && this.f6397e0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                a.b.h(this.f6399g0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void D(boolean z10) {
        if (this.f6398f0 != z10) {
            boolean U = U();
            this.f6398f0 = z10;
            boolean U2 = U();
            if (U != U2) {
                if (U2) {
                    r(this.f6399g0);
                } else {
                    X(this.f6399g0);
                }
                invalidateSelf();
                y();
            }
        }
    }

    @Deprecated
    public final void E(float f10) {
        if (this.C != f10) {
            this.C = f10;
            setShapeAppearanceModel(this.f15069a.f15093a.d(f10));
        }
    }

    public final void F(Drawable drawable) {
        Drawable drawable2 = this.M;
        Drawable drawable3 = null;
        if (drawable2 != null) {
            if (drawable2 instanceof k) {
                drawable2 = ((k) drawable2).b();
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float t10 = t();
            if (drawable != null) {
                drawable3 = b1.a.g(drawable).mutate();
            }
            this.M = drawable3;
            float t11 = t();
            X(drawable2);
            if (V()) {
                r(this.M);
            }
            invalidateSelf();
            if (t10 != t11) {
                y();
            }
        }
    }

    public final void G(float f10) {
        if (this.U != f10) {
            float t10 = t();
            this.U = f10;
            float t11 = t();
            invalidateSelf();
            if (t10 != t11) {
                y();
            }
        }
    }

    public final void H(ColorStateList colorStateList) {
        this.V = true;
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            if (V()) {
                a.b.h(this.M, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void I(boolean z10) {
        if (this.L != z10) {
            boolean V = V();
            this.L = z10;
            boolean V2 = V();
            if (V != V2) {
                if (V2) {
                    r(this.M);
                } else {
                    X(this.M);
                }
                invalidateSelf();
                y();
            }
        }
    }

    public final void J(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            if (this.T0) {
                f.b bVar = this.f15069a;
                if (bVar.f15096d != colorStateList) {
                    bVar.f15096d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void K(float f10) {
        if (this.E != f10) {
            this.E = f10;
            this.f6412t0.setStrokeWidth(f10);
            if (this.T0) {
                this.f15069a.f15103k = f10;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void L(Drawable drawable) {
        Drawable drawable2 = this.X;
        Drawable drawable3 = null;
        if (drawable2 != null) {
            if (drawable2 instanceof k) {
                drawable2 = ((k) drawable2).b();
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float u10 = u();
            if (drawable != null) {
                drawable3 = b1.a.g(drawable).mutate();
            }
            this.X = drawable3;
            int[] iArr = ea.b.f13510a;
            this.Y = new RippleDrawable(ea.b.c(this.F), this.X, V0);
            float u11 = u();
            X(drawable2);
            if (W()) {
                r(this.X);
            }
            invalidateSelf();
            if (u10 != u11) {
                y();
            }
        }
    }

    public final void M(float f10) {
        if (this.f6409q0 != f10) {
            this.f6409q0 = f10;
            invalidateSelf();
            if (W()) {
                y();
            }
        }
    }

    public final void N(float f10) {
        if (this.f6395c0 != f10) {
            this.f6395c0 = f10;
            invalidateSelf();
            if (W()) {
                y();
            }
        }
    }

    public final void O(float f10) {
        if (this.f6408p0 != f10) {
            this.f6408p0 = f10;
            invalidateSelf();
            if (W()) {
                y();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.Z != colorStateList) {
            this.Z = colorStateList;
            if (W()) {
                a.b.h(this.X, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Q(boolean z10) {
        if (this.W != z10) {
            boolean W = W();
            this.W = z10;
            boolean W2 = W();
            if (W != W2) {
                if (W2) {
                    r(this.X);
                } else {
                    X(this.X);
                }
                invalidateSelf();
                y();
            }
        }
    }

    public final void R(float f10) {
        if (this.f6405m0 != f10) {
            float t10 = t();
            this.f6405m0 = f10;
            float t11 = t();
            invalidateSelf();
            if (t10 != t11) {
                y();
            }
        }
    }

    public final void S(float f10) {
        if (this.f6404l0 != f10) {
            float t10 = t();
            this.f6404l0 = f10;
            float t11 = t();
            invalidateSelf();
            if (t10 != t11) {
                y();
            }
        }
    }

    public final void T(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.F != colorStateList) {
            this.F = colorStateList;
            if (this.N0) {
                colorStateList2 = ea.b.c(colorStateList);
            } else {
                colorStateList2 = null;
            }
            this.O0 = colorStateList2;
            onStateChange(getState());
        }
    }

    public final boolean U() {
        return this.f6398f0 && this.f6399g0 != null && this.F0;
    }

    public final boolean V() {
        return this.L && this.M != null;
    }

    public final boolean W() {
        return this.W && this.X != null;
    }

    @Override // z9.l.b
    public final void a() {
        y();
        invalidateSelf();
    }

    @Override // ga.f, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        int i16;
        float f10;
        int saveLayerAlpha;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i10 = this.H0) != 0) {
            if (i10 < 255) {
                float f11 = bounds.left;
                float f12 = bounds.top;
                float f13 = bounds.right;
                float f14 = bounds.bottom;
                if (Build.VERSION.SDK_INT > 21) {
                    saveLayerAlpha = canvas.saveLayerAlpha(f11, f12, f13, f14, i10);
                } else {
                    saveLayerAlpha = canvas.saveLayerAlpha(f11, f12, f13, f14, i10, 31);
                }
                i11 = saveLayerAlpha;
            } else {
                i11 = 0;
            }
            if (!this.T0) {
                this.f6412t0.setColor(this.f6419z0);
                this.f6412t0.setStyle(Paint.Style.FILL);
                this.f6414v0.set(bounds);
                canvas.drawRoundRect(this.f6414v0, v(), v(), this.f6412t0);
            }
            if (!this.T0) {
                this.f6412t0.setColor(this.A0);
                this.f6412t0.setStyle(Paint.Style.FILL);
                Paint paint = this.f6412t0;
                ColorFilter colorFilter = this.I0;
                if (colorFilter == null) {
                    colorFilter = this.J0;
                }
                paint.setColorFilter(colorFilter);
                this.f6414v0.set(bounds);
                canvas.drawRoundRect(this.f6414v0, v(), v(), this.f6412t0);
            }
            if (this.T0) {
                super.draw(canvas);
            }
            if (this.E > 0.0f && !this.T0) {
                this.f6412t0.setColor(this.C0);
                this.f6412t0.setStyle(Paint.Style.STROKE);
                if (!this.T0) {
                    Paint paint2 = this.f6412t0;
                    ColorFilter colorFilter2 = this.I0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.J0;
                    }
                    paint2.setColorFilter(colorFilter2);
                }
                RectF rectF = this.f6414v0;
                float f15 = this.E / 2.0f;
                rectF.set(bounds.left + f15, bounds.top + f15, bounds.right - f15, bounds.bottom - f15);
                float f16 = this.C - (this.E / 2.0f);
                canvas.drawRoundRect(this.f6414v0, f16, f16, this.f6412t0);
            }
            this.f6412t0.setColor(this.D0);
            this.f6412t0.setStyle(Paint.Style.FILL);
            this.f6414v0.set(bounds);
            if (!this.T0) {
                canvas.drawRoundRect(this.f6414v0, v(), v(), this.f6412t0);
                i12 = 0;
            } else {
                RectF rectF2 = new RectF(bounds);
                Path path = this.f6416x0;
                j jVar = this.f15086r;
                f.b bVar = this.f15069a;
                jVar.a(bVar.f15093a, bVar.f15102j, rectF2, this.f15085q, path);
                i12 = 0;
                f(canvas, this.f6412t0, this.f6416x0, this.f15069a.f15093a, h());
            }
            if (V()) {
                s(bounds, this.f6414v0);
                RectF rectF3 = this.f6414v0;
                float f17 = rectF3.left;
                float f18 = rectF3.top;
                canvas.translate(f17, f18);
                this.M.setBounds(i12, i12, (int) this.f6414v0.width(), (int) this.f6414v0.height());
                this.M.draw(canvas);
                canvas.translate(-f17, -f18);
            }
            if (U()) {
                s(bounds, this.f6414v0);
                RectF rectF4 = this.f6414v0;
                float f19 = rectF4.left;
                float f20 = rectF4.top;
                canvas.translate(f19, f20);
                this.f6399g0.setBounds(i12, i12, (int) this.f6414v0.width(), (int) this.f6414v0.height());
                this.f6399g0.draw(canvas);
                canvas.translate(-f19, -f20);
            }
            if (this.R0 && this.H != null) {
                PointF pointF = this.f6415w0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.H != null) {
                    float t10 = t() + this.f6403k0 + this.f6406n0;
                    if (b1.a.b(this) == 0) {
                        pointF.x = bounds.left + t10;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = bounds.right - t10;
                        align = Paint.Align.RIGHT;
                    }
                    this.f6417y0.f32152a.getFontMetrics(this.f6413u0);
                    Paint.FontMetrics fontMetrics = this.f6413u0;
                    pointF.y = bounds.centerY() - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                RectF rectF5 = this.f6414v0;
                rectF5.setEmpty();
                if (this.H != null) {
                    float t11 = t() + this.f6403k0 + this.f6406n0;
                    float u10 = u() + this.f6410r0 + this.f6407o0;
                    if (b1.a.b(this) == 0) {
                        rectF5.left = bounds.left + t11;
                        f10 = bounds.right - u10;
                    } else {
                        rectF5.left = bounds.left + u10;
                        f10 = bounds.right - t11;
                    }
                    rectF5.right = f10;
                    rectF5.top = bounds.top;
                    rectF5.bottom = bounds.bottom;
                }
                l lVar = this.f6417y0;
                if (lVar.f32157f != null) {
                    lVar.f32152a.drawableState = getState();
                    l lVar2 = this.f6417y0;
                    lVar2.f32157f.e(this.f6411s0, lVar2.f32152a, lVar2.f32153b);
                }
                this.f6417y0.f32152a.setTextAlign(align);
                if (Math.round(this.f6417y0.a(this.H.toString())) > Math.round(this.f6414v0.width())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i16 = canvas.save();
                    canvas.clipRect(this.f6414v0);
                } else {
                    i16 = 0;
                }
                CharSequence charSequence = this.H;
                if (z10 && this.Q0 != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.f6417y0.f32152a, this.f6414v0.width(), this.Q0);
                }
                CharSequence charSequence2 = charSequence;
                int length = charSequence2.length();
                PointF pointF2 = this.f6415w0;
                i15 = 0;
                i14 = 255;
                i13 = i11;
                canvas.drawText(charSequence2, 0, length, pointF2.x, pointF2.y, this.f6417y0.f32152a);
                if (z10) {
                    canvas.restoreToCount(i16);
                }
            } else {
                i13 = i11;
                i14 = 255;
                i15 = 0;
            }
            if (W()) {
                RectF rectF6 = this.f6414v0;
                rectF6.setEmpty();
                if (W()) {
                    float f21 = this.f6410r0 + this.f6409q0;
                    if (b1.a.b(this) == 0) {
                        float f22 = bounds.right - f21;
                        rectF6.right = f22;
                        rectF6.left = f22 - this.f6395c0;
                    } else {
                        float f23 = bounds.left + f21;
                        rectF6.left = f23;
                        rectF6.right = f23 + this.f6395c0;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f24 = this.f6395c0;
                    float f25 = exactCenterY - (f24 / 2.0f);
                    rectF6.top = f25;
                    rectF6.bottom = f25 + f24;
                }
                RectF rectF7 = this.f6414v0;
                float f26 = rectF7.left;
                float f27 = rectF7.top;
                canvas.translate(f26, f27);
                this.X.setBounds(i15, i15, (int) this.f6414v0.width(), (int) this.f6414v0.height());
                int[] iArr = ea.b.f13510a;
                this.Y.setBounds(this.X.getBounds());
                this.Y.jumpToCurrentState();
                this.Y.draw(canvas);
                canvas.translate(-f26, -f27);
            }
            if (this.H0 < i14) {
                canvas.restoreToCount(i13);
            }
        }
    }

    @Override // ga.f, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.H0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.I0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(u() + this.f6417y0.a(this.H.toString()) + t() + this.f6403k0 + this.f6406n0 + this.f6407o0 + this.f6410r0), this.S0);
    }

    @Override // ga.f, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // ga.f, android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(Outline outline) {
        if (this.T0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.C);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.B, this.C);
        }
        outline.setAlpha(this.H0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // ga.f, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        boolean z10;
        boolean z11;
        ColorStateList colorStateList;
        if (w(this.f6418z) || w(this.A) || w(this.D)) {
            return true;
        }
        if (this.N0 && w(this.O0)) {
            return true;
        }
        e eVar = this.f6417y0.f32157f;
        if (eVar != null && (colorStateList = eVar.f12934j) != null && colorStateList.isStateful()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        if (this.f6398f0 && this.f6399g0 != null && this.f6397e0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 || x(this.M) || x(this.f6399g0) || w(this.K0)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (V()) {
            onLayoutDirectionChanged |= b1.a.c(this.M, i10);
        }
        if (U()) {
            onLayoutDirectionChanged |= b1.a.c(this.f6399g0, i10);
        }
        if (W()) {
            onLayoutDirectionChanged |= b1.a.c(this.X, i10);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (V()) {
            onLevelChange |= this.M.setLevel(i10);
        }
        if (U()) {
            onLevelChange |= this.f6399g0.setLevel(i10);
        }
        if (W()) {
            onLevelChange |= this.X.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // ga.f, android.graphics.drawable.Drawable, z9.l.b
    public final boolean onStateChange(int[] iArr) {
        if (this.T0) {
            super.onStateChange(iArr);
        }
        return z(iArr, this.M0);
    }

    public final void r(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        b1.a.c(drawable, b1.a.b(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.X) {
            if (drawable.isStateful()) {
                drawable.setState(this.M0);
            }
            a.b.h(drawable, this.Z);
            return;
        }
        Drawable drawable2 = this.M;
        if (drawable == drawable2 && this.V) {
            a.b.h(drawable2, this.Q);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void s(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        float f10;
        rectF.setEmpty();
        if (V() || U()) {
            float f11 = this.f6403k0 + this.f6404l0;
            if (this.F0) {
                drawable = this.f6399g0;
            } else {
                drawable = this.M;
            }
            float f12 = this.U;
            if (f12 <= 0.0f && drawable != null) {
                f12 = drawable.getIntrinsicWidth();
            }
            if (b1.a.b(this) == 0) {
                float f13 = rect.left + f11;
                rectF.left = f13;
                rectF.right = f13 + f12;
            } else {
                float f14 = rect.right - f11;
                rectF.right = f14;
                rectF.left = f14 - f12;
            }
            if (this.F0) {
                drawable2 = this.f6399g0;
            } else {
                drawable2 = this.M;
            }
            float f15 = this.U;
            if (f15 <= 0.0f && drawable2 != null) {
                f15 = (float) Math.ceil(r.b(this.f6411s0, 24));
                if (drawable2.getIntrinsicHeight() <= f15) {
                    f10 = drawable2.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f10 / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f10;
                }
            }
            f10 = f15;
            float exactCenterY2 = rect.exactCenterY() - (f10 / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f10;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // ga.f, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.H0 != i10) {
            this.H0 = i10;
            invalidateSelf();
        }
    }

    @Override // ga.f, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.I0 != colorFilter) {
            this.I0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // ga.f, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.K0 != colorStateList) {
            this.K0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // ga.f, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.L0 != mode) {
            this.L0 = mode;
            ColorStateList colorStateList = this.K0;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.J0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (V()) {
            visible |= this.M.setVisible(z10, z11);
        }
        if (U()) {
            visible |= this.f6399g0.setVisible(z10, z11);
        }
        if (W()) {
            visible |= this.X.setVisible(z10, z11);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final float t() {
        Drawable drawable;
        if (!V() && !U()) {
            return 0.0f;
        }
        float f10 = this.f6404l0;
        if (this.F0) {
            drawable = this.f6399g0;
        } else {
            drawable = this.M;
        }
        float f11 = this.U;
        if (f11 <= 0.0f && drawable != null) {
            f11 = drawable.getIntrinsicWidth();
        }
        return f11 + f10 + this.f6405m0;
    }

    public final float u() {
        if (W()) {
            return this.f6408p0 + this.f6395c0 + this.f6409q0;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v() {
        if (this.T0) {
            return this.f15069a.f15093a.f15121e.a(h());
        }
        return this.C;
    }

    public final void y() {
        InterfaceC0091a interfaceC0091a = this.P0.get();
        if (interfaceC0091a != null) {
            interfaceC0091a.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean z(int[] r9, int[] r10) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.z(int[], int[]):boolean");
    }
}
