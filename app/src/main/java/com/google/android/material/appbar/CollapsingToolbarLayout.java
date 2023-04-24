package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import i9.i;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k1.i2;
import k1.n2;
import k1.o0;
import t0.e;
import y0.a;

/* loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public static final int D = R.style.Widget_Design_CollapsingToolbar;
    public boolean A;
    public int B;
    public boolean C;

    /* renamed from: a */
    public boolean f6195a;

    /* renamed from: b */
    public int f6196b;

    /* renamed from: c */
    public ViewGroup f6197c;

    /* renamed from: d */
    public View f6198d;

    /* renamed from: e */
    public View f6199e;

    /* renamed from: f */
    public int f6200f;

    /* renamed from: g */
    public int f6201g;

    /* renamed from: h */
    public int f6202h;

    /* renamed from: i */
    public int f6203i;

    /* renamed from: j */
    public final Rect f6204j;

    /* renamed from: k */
    public final z9.d f6205k;

    /* renamed from: l */
    public final w9.a f6206l;

    /* renamed from: m */
    public boolean f6207m;

    /* renamed from: n */
    public boolean f6208n;

    /* renamed from: o */
    public Drawable f6209o;

    /* renamed from: p */
    public Drawable f6210p;

    /* renamed from: q */
    public int f6211q;

    /* renamed from: r */
    public boolean f6212r;

    /* renamed from: s */
    public ValueAnimator f6213s;

    /* renamed from: t */
    public long f6214t;

    /* renamed from: u */
    public int f6215u;

    /* renamed from: v */
    public b f6216v;

    /* renamed from: w */
    public int f6217w;

    /* renamed from: x */
    public int f6218x;

    /* renamed from: y */
    public n2 f6219y;

    /* renamed from: z */
    public int f6220z;

    /* loaded from: classes.dex */
    public static class a extends FrameLayout.LayoutParams {

        /* renamed from: a */
        public int f6221a;

        /* renamed from: b */
        public float f6222b;

        public a() {
            super(-1, -1);
            this.f6221a = 0;
            this.f6222b = 0.5f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6221a = 0;
            this.f6222b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CollapsingToolbarLayout_Layout);
            this.f6221a = obtainStyledAttributes.getInt(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            this.f6222b = obtainStyledAttributes.getFloat(R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f);
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f6221a = 0;
            this.f6222b = 0.5f;
        }
    }

    /* loaded from: classes.dex */
    public class b implements AppBarLayout.f {
        public b() {
            CollapsingToolbarLayout.this = r1;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.a
        public final void a(int i10) {
            int i11;
            int k10;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f6217w = i10;
            n2 n2Var = collapsingToolbarLayout.f6219y;
            if (n2Var != null) {
                i11 = n2Var.e();
            } else {
                i11 = 0;
            }
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i12);
                a aVar = (a) childAt.getLayoutParams();
                i b10 = CollapsingToolbarLayout.b(childAt);
                int i13 = aVar.f6221a;
                if (i13 != 1) {
                    if (i13 == 2) {
                        k10 = Math.round((-i10) * aVar.f6222b);
                    }
                } else {
                    CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
                    collapsingToolbarLayout2.getClass();
                    k10 = b0.c.k(-i10, 0, ((collapsingToolbarLayout2.getHeight() - CollapsingToolbarLayout.b(childAt).f16755b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((a) childAt.getLayoutParams())).bottomMargin);
                }
                b10.b(k10);
            }
            CollapsingToolbarLayout.this.d();
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout3.f6210p != null && i11 > 0) {
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                o0.d.k(collapsingToolbarLayout3);
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            CollapsingToolbarLayout collapsingToolbarLayout4 = CollapsingToolbarLayout.this;
            WeakHashMap<View, i2> weakHashMap2 = o0.f18161a;
            int d10 = (height - o0.d.d(collapsingToolbarLayout4)) - i11;
            int scrimVisibleHeightTrigger = height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger();
            z9.d dVar = CollapsingToolbarLayout.this.f6205k;
            float f10 = d10;
            float min = Math.min(1.0f, scrimVisibleHeightTrigger / f10);
            dVar.f32083e = min;
            dVar.f32085f = e.a(1.0f, min, 0.5f, min);
            CollapsingToolbarLayout collapsingToolbarLayout5 = CollapsingToolbarLayout.this;
            z9.d dVar2 = collapsingToolbarLayout5.f6205k;
            dVar2.f32087g = collapsingToolbarLayout5.f6217w + d10;
            dVar2.q(Math.abs(i10) / f10);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CollapsingToolbarLayout(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static i b(View view) {
        int i10 = R.id.view_offset_helper;
        i iVar = (i) view.getTag(i10);
        if (iVar == null) {
            i iVar2 = new i(view);
            view.setTag(i10, iVar2);
            return iVar2;
        }
        return iVar;
    }

    public final void a() {
        boolean z10;
        if (!this.f6195a) {
            return;
        }
        ViewGroup viewGroup = null;
        this.f6197c = null;
        this.f6198d = null;
        int i10 = this.f6196b;
        if (i10 != -1) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById(i10);
            this.f6197c = viewGroup2;
            if (viewGroup2 != null) {
                ViewParent parent = viewGroup2.getParent();
                View view = viewGroup2;
                while (parent != this && parent != null) {
                    if (parent instanceof View) {
                        view = (View) parent;
                    }
                    parent = parent.getParent();
                    view = view;
                }
                this.f6198d = view;
            }
        }
        if (this.f6197c == null) {
            int childCount = getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i11);
                if (!(childAt instanceof Toolbar) && !(childAt instanceof android.widget.Toolbar)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    viewGroup = (ViewGroup) childAt;
                    break;
                }
                i11++;
            }
            this.f6197c = viewGroup;
        }
        c();
        this.f6195a = false;
    }

    public final void c() {
        View view;
        if (!this.f6207m && (view = this.f6199e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f6199e);
            }
        }
        if (!this.f6207m || this.f6197c == null) {
            return;
        }
        if (this.f6199e == null) {
            this.f6199e = new View(getContext());
        }
        if (this.f6199e.getParent() == null) {
            this.f6197c.addView(this.f6199e, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void d() {
        if (this.f6209o == null && this.f6210p == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f6217w < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.f6197c == null && (drawable = this.f6209o) != null && this.f6211q > 0) {
            drawable.mutate().setAlpha(this.f6211q);
            this.f6209o.draw(canvas);
        }
        if (this.f6207m && this.f6208n) {
            if (this.f6197c != null && this.f6209o != null && this.f6211q > 0) {
                boolean z10 = true;
                if (this.f6218x != 1) {
                    z10 = false;
                }
                if (z10) {
                    z9.d dVar = this.f6205k;
                    if (dVar.f32079c < dVar.f32085f) {
                        int save = canvas.save();
                        canvas.clipRect(this.f6209o.getBounds(), Region.Op.DIFFERENCE);
                        this.f6205k.d(canvas);
                        canvas.restoreToCount(save);
                    }
                }
            }
            this.f6205k.d(canvas);
        }
        if (this.f6210p != null && this.f6211q > 0) {
            n2 n2Var = this.f6219y;
            if (n2Var != null) {
                i10 = n2Var.e();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                this.f6210p.setBounds(0, -this.f6217w, getWidth(), i10 - this.f6217w);
                this.f6210p.mutate().setAlpha(this.f6211q);
                this.f6210p.draw(canvas);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0018, code lost:
        r3 = true;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean drawChild(android.graphics.Canvas r7, android.view.View r8, long r9) {
        /*
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.f6209o
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L4d
            int r3 = r6.f6211q
            if (r3 <= 0) goto L4d
            android.view.View r3 = r6.f6198d
            if (r3 == 0) goto L14
            if (r3 != r6) goto L11
            goto L14
        L11:
            if (r8 != r3) goto L1a
            goto L18
        L14:
            android.view.ViewGroup r3 = r6.f6197c
            if (r8 != r3) goto L1a
        L18:
            r3 = 1
            goto L1b
        L1a:
            r3 = 0
        L1b:
            if (r3 == 0) goto L4d
            int r3 = r6.getWidth()
            int r4 = r6.getHeight()
            int r5 = r6.f6218x
            if (r5 != r1) goto L2b
            r5 = 1
            goto L2c
        L2b:
            r5 = 0
        L2c:
            if (r5 == 0) goto L38
            if (r8 == 0) goto L38
            boolean r5 = r6.f6207m
            if (r5 == 0) goto L38
            int r4 = r8.getBottom()
        L38:
            r0.setBounds(r2, r2, r3, r4)
            android.graphics.drawable.Drawable r0 = r6.f6209o
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r3 = r6.f6211q
            r0.setAlpha(r3)
            android.graphics.drawable.Drawable r0 = r6.f6209o
            r0.draw(r7)
            r0 = 1
            goto L4e
        L4d:
            r0 = 0
        L4e:
            boolean r7 = super.drawChild(r7, r8, r9)
            if (r7 != 0) goto L58
            if (r0 == 0) goto L57
            goto L58
        L57:
            r1 = 0
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f6210p;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f6209o;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        z9.d dVar = this.f6205k;
        if (dVar != null) {
            z10 |= dVar.s(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public final void e(int i10, int i11, int i12, int i13, boolean z10) {
        View view;
        boolean z11;
        boolean z12;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z13;
        int i19;
        int i20;
        if (this.f6207m && (view = this.f6199e) != null) {
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            boolean z14 = false;
            if (o0.g.b(view) && this.f6199e.getVisibility() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f6208n = z11;
            if (z11 || z10) {
                if (o0.e.d(this) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                View view2 = this.f6198d;
                if (view2 == null) {
                    view2 = this.f6197c;
                }
                int height = ((getHeight() - b(view2).f16755b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((a) view2.getLayoutParams())).bottomMargin;
                z9.e.a(this, this.f6199e, this.f6204j);
                ViewGroup viewGroup = this.f6197c;
                if (viewGroup instanceof Toolbar) {
                    Toolbar toolbar = (Toolbar) viewGroup;
                    i15 = toolbar.getTitleMarginStart();
                    i16 = toolbar.getTitleMarginEnd();
                    i17 = toolbar.getTitleMarginTop();
                    i14 = toolbar.getTitleMarginBottom();
                } else if (Build.VERSION.SDK_INT >= 24 && (viewGroup instanceof android.widget.Toolbar)) {
                    android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                    i15 = toolbar2.getTitleMarginStart();
                    i16 = toolbar2.getTitleMarginEnd();
                    i17 = toolbar2.getTitleMarginTop();
                    i14 = toolbar2.getTitleMarginBottom();
                } else {
                    i14 = 0;
                    i15 = 0;
                    i16 = 0;
                    i17 = 0;
                }
                z9.d dVar = this.f6205k;
                Rect rect = this.f6204j;
                int i21 = rect.left;
                if (z12) {
                    i18 = i16;
                } else {
                    i18 = i15;
                }
                int i22 = i21 + i18;
                int i23 = rect.top + height + i17;
                int i24 = rect.right;
                if (!z12) {
                    i15 = i16;
                }
                int i25 = i24 - i15;
                int i26 = (rect.bottom + height) - i14;
                Rect rect2 = dVar.f32091i;
                if (rect2.left == i22 && rect2.top == i23 && rect2.right == i25 && rect2.bottom == i26) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    rect2.set(i22, i23, i25, i26);
                    dVar.S = true;
                    dVar.i();
                }
                z9.d dVar2 = this.f6205k;
                if (z12) {
                    i19 = this.f6202h;
                } else {
                    i19 = this.f6200f;
                }
                int i27 = this.f6204j.top + this.f6201g;
                int i28 = i12 - i10;
                if (z12) {
                    i20 = this.f6200f;
                } else {
                    i20 = this.f6202h;
                }
                int i29 = i28 - i20;
                int i30 = (i13 - i11) - this.f6203i;
                Rect rect3 = dVar2.f32089h;
                if (rect3.left == i19 && rect3.top == i27 && rect3.right == i29 && rect3.bottom == i30) {
                    z14 = true;
                }
                if (!z14) {
                    rect3.set(i19, i27, i29, i30);
                    dVar2.S = true;
                    dVar2.i();
                }
                this.f6205k.j(z10);
            }
        }
    }

    public final void f() {
        CharSequence charSequence;
        if (this.f6197c != null && this.f6207m && TextUtils.isEmpty(this.f6205k.G)) {
            ViewGroup viewGroup = this.f6197c;
            if (viewGroup instanceof Toolbar) {
                charSequence = ((Toolbar) viewGroup).getTitle();
            } else if (viewGroup instanceof android.widget.Toolbar) {
                charSequence = ((android.widget.Toolbar) viewGroup).getTitle();
            } else {
                charSequence = null;
            }
            setTitle(charSequence);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public int getCollapsedTitleGravity() {
        return this.f6205k.f32097l;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.f6205k.f32115x;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public Drawable getContentScrim() {
        return this.f6209o;
    }

    public int getExpandedTitleGravity() {
        return this.f6205k.f32095k;
    }

    public int getExpandedTitleMarginBottom() {
        return this.f6203i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f6202h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f6200f;
    }

    public int getExpandedTitleMarginTop() {
        return this.f6201g;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.f6205k.A;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public int getHyphenationFrequency() {
        return this.f6205k.f32108q0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.f6205k.f32092i0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.f6205k.f32092i0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.f6205k.f32092i0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.f6205k.f32102n0;
    }

    public int getScrimAlpha() {
        return this.f6211q;
    }

    public long getScrimAnimationDuration() {
        return this.f6214t;
    }

    public int getScrimVisibleHeightTrigger() {
        int i10;
        int i11 = this.f6215u;
        if (i11 >= 0) {
            return i11 + this.f6220z + this.B;
        }
        n2 n2Var = this.f6219y;
        if (n2Var != null) {
            i10 = n2Var.e();
        } else {
            i10 = 0;
        }
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        int d10 = o0.d.d(this);
        if (d10 > 0) {
            return Math.min((d10 * 2) + i10, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f6210p;
    }

    public CharSequence getTitle() {
        if (this.f6207m) {
            return this.f6205k.G;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f6218x;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f6205k.V;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            boolean z10 = true;
            if (this.f6218x != 1) {
                z10 = false;
            }
            if (z10) {
                appBarLayout.setLiftOnScroll(false);
            }
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            setFitsSystemWindows(o0.d.b(appBarLayout));
            if (this.f6216v == null) {
                this.f6216v = new b();
            }
            appBarLayout.a(this.f6216v);
            o0.h.c(this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f6205k.h(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        b bVar = this.f6216v;
        if (bVar != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).f6166h) != null) {
            arrayList.remove(bVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        n2 n2Var = this.f6219y;
        if (n2Var != null) {
            int e10 = n2Var.e();
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                if (!o0.d.b(childAt) && childAt.getTop() < e10) {
                    o0.j(childAt, e10);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            i b10 = b(getChildAt(i15));
            b10.f16755b = b10.f16754a.getTop();
            b10.f16756c = b10.f16754a.getLeft();
        }
        e(i10, i11, i12, i13, false);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i16 = 0; i16 < childCount3; i16++) {
            b(getChildAt(i16)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int measuredHeight;
        int i13;
        a();
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        n2 n2Var = this.f6219y;
        if (n2Var != null) {
            i12 = n2Var.e();
        } else {
            i12 = 0;
        }
        if ((mode == 0 || this.A) && i12 > 0) {
            this.f6220z = i12;
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i12, 1073741824));
        }
        if (this.C && this.f6205k.f32102n0 > 1) {
            f();
            e(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            z9.d dVar = this.f6205k;
            int i14 = dVar.f32107q;
            if (i14 > 1) {
                TextPaint textPaint = dVar.U;
                textPaint.setTextSize(dVar.f32099m);
                textPaint.setTypeface(dVar.A);
                textPaint.setLetterSpacing(dVar.f32088g0);
                int i15 = i14 - 1;
                this.B = i15 * Math.round(dVar.U.descent() + (-dVar.U.ascent()));
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.B, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f6197c;
        if (viewGroup != null) {
            View view = this.f6198d;
            if (view != null && view != this) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i13 = view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    i13 = view.getMeasuredHeight();
                }
            } else {
                ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                } else {
                    measuredHeight = viewGroup.getMeasuredHeight();
                }
                i13 = measuredHeight;
            }
            setMinimumHeight(i13);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Drawable drawable = this.f6209o;
        if (drawable != null) {
            ViewGroup viewGroup = this.f6197c;
            boolean z10 = true;
            if (this.f6218x != 1) {
                z10 = false;
            }
            if (z10 && viewGroup != null && this.f6207m) {
                i11 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i10, i11);
        }
    }

    public void setCollapsedTitleGravity(int i10) {
        this.f6205k.m(i10);
    }

    public void setCollapsedTitleTextAppearance(int i10) {
        this.f6205k.k(i10);
    }

    public void setCollapsedTitleTextColor(int i10) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.f6205k.l(colorStateList);
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        z9.d dVar = this.f6205k;
        if (dVar.n(typeface)) {
            dVar.j(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f6209o;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f6209o = drawable3;
            if (drawable3 != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.f6197c;
                boolean z10 = true;
                if (this.f6218x != 1) {
                    z10 = false;
                }
                if (z10 && viewGroup != null && this.f6207m) {
                    height = viewGroup.getBottom();
                }
                drawable3.setBounds(0, 0, width, height);
                this.f6209o.setCallback(this);
                this.f6209o.setAlpha(this.f6211q);
            }
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.d.k(this);
        }
    }

    public void setContentScrimColor(int i10) {
        setContentScrim(new ColorDrawable(i10));
    }

    public void setContentScrimResource(int i10) {
        Context context = getContext();
        Object obj = y0.a.f30807a;
        setContentScrim(a.c.b(context, i10));
    }

    public void setExpandedTitleColor(int i10) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setExpandedTitleGravity(int i10) {
        z9.d dVar = this.f6205k;
        if (dVar.f32095k != i10) {
            dVar.f32095k = i10;
            dVar.j(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i10) {
        this.f6203i = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i10) {
        this.f6202h = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i10) {
        this.f6200f = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i10) {
        this.f6201g = i10;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i10) {
        this.f6205k.o(i10);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        z9.d dVar = this.f6205k;
        if (dVar.f32103o != colorStateList) {
            dVar.f32103o = colorStateList;
            dVar.j(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        z9.d dVar = this.f6205k;
        if (dVar.p(typeface)) {
            dVar.j(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z10) {
        this.C = z10;
    }

    public void setForceApplySystemWindowInsetTop(boolean z10) {
        this.A = z10;
    }

    public void setHyphenationFrequency(int i10) {
        this.f6205k.f32108q0 = i10;
    }

    public void setLineSpacingAdd(float f10) {
        this.f6205k.f32104o0 = f10;
    }

    public void setLineSpacingMultiplier(float f10) {
        this.f6205k.f32106p0 = f10;
    }

    public void setMaxLines(int i10) {
        z9.d dVar = this.f6205k;
        if (i10 != dVar.f32102n0) {
            dVar.f32102n0 = i10;
            Bitmap bitmap = dVar.K;
            if (bitmap != null) {
                bitmap.recycle();
                dVar.K = null;
            }
            dVar.j(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z10) {
        this.f6205k.J = z10;
    }

    public void setScrimAlpha(int i10) {
        ViewGroup viewGroup;
        if (i10 != this.f6211q) {
            if (this.f6209o != null && (viewGroup = this.f6197c) != null) {
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                o0.d.k(viewGroup);
            }
            this.f6211q = i10;
            WeakHashMap<View, i2> weakHashMap2 = o0.f18161a;
            o0.d.k(this);
        }
    }

    public void setScrimAnimationDuration(long j10) {
        this.f6214t = j10;
    }

    public void setScrimVisibleHeightTrigger(int i10) {
        if (this.f6215u != i10) {
            this.f6215u = i10;
            d();
        }
    }

    public void setScrimsShown(boolean z10) {
        boolean z11;
        TimeInterpolator timeInterpolator;
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        int i10 = 0;
        if (o0.g.c(this) && !isInEditMode()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f6212r != z10) {
            int i11 = 255;
            if (z11) {
                if (!z10) {
                    i11 = 0;
                }
                a();
                ValueAnimator valueAnimator = this.f6213s;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f6213s = valueAnimator2;
                    if (i11 > this.f6211q) {
                        timeInterpolator = h9.a.f16045c;
                    } else {
                        timeInterpolator = h9.a.f16046d;
                    }
                    valueAnimator2.setInterpolator(timeInterpolator);
                    this.f6213s.addUpdateListener(new i9.e(this));
                } else if (valueAnimator.isRunning()) {
                    this.f6213s.cancel();
                }
                this.f6213s.setDuration(this.f6214t);
                this.f6213s.setIntValues(this.f6211q, i11);
                this.f6213s.start();
            } else {
                if (z10) {
                    i10 = 255;
                }
                setScrimAlpha(i10);
            }
            this.f6212r = z10;
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.f6210p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f6210p = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f6210p.setState(getDrawableState());
                }
                Drawable drawable4 = this.f6210p;
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                b1.a.c(drawable4, o0.e.d(this));
                Drawable drawable5 = this.f6210p;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable5.setVisible(z10, false);
                this.f6210p.setCallback(this);
                this.f6210p.setAlpha(this.f6211q);
            }
            WeakHashMap<View, i2> weakHashMap2 = o0.f18161a;
            o0.d.k(this);
        }
    }

    public void setStatusBarScrimColor(int i10) {
        setStatusBarScrim(new ColorDrawable(i10));
    }

    public void setStatusBarScrimResource(int i10) {
        Context context = getContext();
        Object obj = y0.a.f30807a;
        setStatusBarScrim(a.c.b(context, i10));
    }

    public void setTitle(CharSequence charSequence) {
        z9.d dVar = this.f6205k;
        if (charSequence == null || !TextUtils.equals(dVar.G, charSequence)) {
            dVar.G = charSequence;
            dVar.H = null;
            Bitmap bitmap = dVar.K;
            if (bitmap != null) {
                bitmap.recycle();
                dVar.K = null;
            }
            dVar.j(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i10) {
        boolean z10;
        this.f6218x = i10;
        boolean z11 = true;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f6205k.f32081d = z10;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f6218x != 1) {
                z11 = false;
            }
            if (z11) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z10 && this.f6209o == null) {
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            w9.a aVar = this.f6206l;
            setContentScrimColor(aVar.a(dimension, aVar.f29766d));
        }
    }

    public void setTitleEnabled(boolean z10) {
        if (z10 != this.f6207m) {
            this.f6207m = z10;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        z9.d dVar = this.f6205k;
        dVar.V = timeInterpolator;
        dVar.j(false);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f6210p;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f6210p.setVisible(z10, false);
        }
        Drawable drawable2 = this.f6209o;
        if (drawable2 == null || drawable2.isVisible() == z10) {
            return;
        }
        this.f6209o.setVisible(z10, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6209o || drawable == this.f6210p;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }
}
