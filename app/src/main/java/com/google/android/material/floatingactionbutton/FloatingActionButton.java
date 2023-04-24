package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.k;
import androidx.appcompat.widget.p;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.kilnn.tool.widget.bottomsheet.BottomSheetLayout;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.d;
import ga.f;
import ga.i;
import ga.m;
import h9.g;
import h9.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import o0.h;
import z9.e;
import z9.t;

/* loaded from: classes.dex */
public class FloatingActionButton extends t implements x9.a, m, CoordinatorLayout.b {

    /* renamed from: r */
    public static final int f6544r = R.style.Widget_Design_FloatingActionButton;

    /* renamed from: b */
    public ColorStateList f6545b;

    /* renamed from: c */
    public PorterDuff.Mode f6546c;

    /* renamed from: d */
    public ColorStateList f6547d;

    /* renamed from: e */
    public PorterDuff.Mode f6548e;

    /* renamed from: f */
    public ColorStateList f6549f;

    /* renamed from: g */
    public int f6550g;

    /* renamed from: h */
    public int f6551h;

    /* renamed from: i */
    public int f6552i;

    /* renamed from: j */
    public int f6553j;

    /* renamed from: k */
    public int f6554k;

    /* renamed from: l */
    public boolean f6555l;

    /* renamed from: m */
    public final Rect f6556m;

    /* renamed from: n */
    public final Rect f6557n;

    /* renamed from: o */
    public final p f6558o;

    /* renamed from: p */
    public final s.d f6559p;

    /* renamed from: q */
    public y9.d f6560q;

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a */
        public Rect f6561a;

        /* renamed from: b */
        public boolean f6562b;

        public BaseBehavior() {
            this.f6562b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FloatingActionButton_Behavior_Layout);
            this.f6562b = obtainStyledAttributes.getBoolean(R.styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean a(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f6556m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void c(CoordinatorLayout.f fVar) {
            if (fVar.f2166h == 0) {
                fVar.f2166h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z10;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f) {
                    z10 = ((CoordinatorLayout.f) layoutParams).f2159a instanceof BottomSheetBehavior;
                } else {
                    z10 = false;
                }
                if (z10) {
                    u(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            int i11;
            boolean z10;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList f10 = coordinatorLayout.f(floatingActionButton);
            int size = f10.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                View view2 = (View) f10.get(i13);
                if (view2 instanceof AppBarLayout) {
                    if (t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f) {
                        z10 = ((CoordinatorLayout.f) layoutParams).f2159a instanceof BottomSheetBehavior;
                    } else {
                        z10 = false;
                    }
                    if (z10 && u(view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.s(floatingActionButton, i10);
            Rect rect = floatingActionButton.f6556m;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) {
                    i11 = rect.right;
                } else if (floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin) {
                    i11 = -rect.left;
                } else {
                    i11 = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                    i12 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                    i12 = -rect.top;
                }
                if (i12 != 0) {
                    o0.j(floatingActionButton, i12);
                }
                if (i11 != 0) {
                    o0.i(floatingActionButton, i11);
                    return true;
                }
                return true;
            }
            return true;
        }

        public final boolean s(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (!this.f6562b || fVar.f2164f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            return true;
        }

        public final boolean t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (s(appBarLayout, floatingActionButton)) {
                if (this.f6561a == null) {
                    this.f6561a = new Rect();
                }
                Rect rect = this.f6561a;
                e.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    floatingActionButton.i(null, false);
                    return true;
                }
                floatingActionButton.o(null, false);
                return true;
            }
            return false;
        }

        public final boolean u(View view, FloatingActionButton floatingActionButton) {
            if (s(view, floatingActionButton)) {
                if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                    floatingActionButton.i(null, false);
                    return true;
                }
                floatingActionButton.o(null, false);
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b() {
        }
    }

    /* loaded from: classes.dex */
    public class b implements fa.b {
        public b() {
            FloatingActionButton.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public class c<T extends FloatingActionButton> implements d.f {

        /* renamed from: a */
        public final j<T> f6564a;

        public c(BottomSheetLayout.a aVar) {
            FloatingActionButton.this = r1;
            this.f6564a = aVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.f
        public final void a() {
            j7.d topEdgeTreatment;
            j7.d topEdgeTreatment2;
            j7.d topEdgeTreatment3;
            j7.d topEdgeTreatment4;
            j<T> jVar = this.f6564a;
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            BottomSheetLayout.a aVar = (BottomSheetLayout.a) jVar;
            aVar.getClass();
            float translationX = floatingActionButton.getTranslationX();
            topEdgeTreatment = BottomSheetLayout.this.getTopEdgeTreatment();
            if (topEdgeTreatment.f17520e != translationX) {
                topEdgeTreatment4 = BottomSheetLayout.this.getTopEdgeTreatment();
                topEdgeTreatment4.f17520e = translationX;
                BottomSheetLayout.this.f5931b.invalidateSelf();
            }
            float f10 = 0.0f;
            float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
            topEdgeTreatment2 = BottomSheetLayout.this.getTopEdgeTreatment();
            if (topEdgeTreatment2.f17519d != max) {
                topEdgeTreatment3 = BottomSheetLayout.this.getTopEdgeTreatment();
                if (max >= 0.0f) {
                    topEdgeTreatment3.f17519d = max;
                    BottomSheetLayout.this.f5931b.invalidateSelf();
                } else {
                    topEdgeTreatment3.getClass();
                    throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
                }
            }
            f fVar = BottomSheetLayout.this.f5931b;
            if (floatingActionButton.getVisibility() == 0) {
                f10 = floatingActionButton.getScaleY();
            }
            fVar.l(f10);
        }

        @Override // com.google.android.material.floatingactionbutton.d.f
        public final void b() {
            float f10;
            j<T> jVar = this.f6564a;
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            BottomSheetLayout.a aVar = (BottomSheetLayout.a) jVar;
            aVar.getClass();
            f fVar = BottomSheetLayout.this.f5931b;
            if (floatingActionButton.getVisibility() == 0) {
                f10 = floatingActionButton.getScaleY();
            } else {
                f10 = 0.0f;
            }
            fVar.l(f10);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof c) && ((c) obj).f6564a.equals(this.f6564a);
        }

        public final int hashCode() {
            return this.f6564a.hashCode();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FloatingActionButton(android.content.Context r14, android.util.AttributeSet r15) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private d getImpl() {
        if (this.f6560q == null) {
            this.f6560q = new y9.d(this, new b());
        }
        return this.f6560q;
    }

    public static int n(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return size;
                }
                throw new IllegalArgumentException();
            }
            return i10;
        }
        return Math.min(i10, size);
    }

    @Override // x9.a
    public final boolean a() {
        return this.f6559p.f25928a;
    }

    public final void d() {
        d impl = getImpl();
        if (impl.f6594t == null) {
            impl.f6594t = new ArrayList<>();
        }
        impl.f6594t.add(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().j(getDrawableState());
    }

    public final void e(AnimatorListenerAdapter animatorListenerAdapter) {
        d impl = getImpl();
        if (impl.f6593s == null) {
            impl.f6593s = new ArrayList<>();
        }
        impl.f6593s.add(animatorListenerAdapter);
    }

    public final void f(BottomSheetLayout.a aVar) {
        d impl = getImpl();
        c cVar = new c(aVar);
        if (impl.f6595u == null) {
            impl.f6595u = new ArrayList<>();
        }
        impl.f6595u.add(cVar);
    }

    public final int g(int i10) {
        int i11 = this.f6552i;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 != -1) {
            return resources.getDimensionPixelSize(i10 != 1 ? R.dimen.design_fab_size_normal : R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? g(1) : g(0);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f6545b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f6546c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f6583i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f6584j;
    }

    public Drawable getContentBackground() {
        return getImpl().f6579e;
    }

    public int getCustomSize() {
        return this.f6552i;
    }

    public int getExpandedComponentIdHint() {
        return this.f6559p.f25929b;
    }

    public g getHideMotionSpec() {
        return getImpl().f6588n;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f6549f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f6549f;
    }

    public i getShapeAppearanceModel() {
        i iVar = getImpl().f6575a;
        iVar.getClass();
        return iVar;
    }

    public g getShowMotionSpec() {
        return getImpl().f6587m;
    }

    public int getSize() {
        return this.f6551h;
    }

    public int getSizeDimension() {
        return g(this.f6551h);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f6547d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f6548e;
    }

    public boolean getUseCompatPadding() {
        return this.f6555l;
    }

    public final void h() {
        i(null, true);
    }

    public final void i(a aVar, boolean z10) {
        com.google.android.material.floatingactionbutton.a aVar2;
        boolean z11;
        int i10;
        AnimatorSet c10;
        d impl = getImpl();
        if (aVar == null) {
            aVar2 = null;
        } else {
            aVar2 = new com.google.android.material.floatingactionbutton.a(this, aVar);
        }
        boolean z12 = false;
        if (impl.f6596v.getVisibility() != 0 ? impl.f6592r != 2 : impl.f6592r == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            Animator animator = impl.f6586l;
            if (animator != null) {
                animator.cancel();
            }
            FloatingActionButton floatingActionButton = impl.f6596v;
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            if (o0.g.c(floatingActionButton) && !impl.f6596v.isInEditMode()) {
                z12 = true;
            }
            if (z12) {
                g gVar = impl.f6588n;
                if (gVar != null) {
                    c10 = impl.b(gVar, 0.0f, 0.0f, 0.0f);
                } else {
                    c10 = impl.c(0.0f, 0.4f, 0.4f);
                }
                c10.addListener(new com.google.android.material.floatingactionbutton.b(impl, z10, aVar2));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f6594t;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        c10.addListener(it.next());
                    }
                }
                c10.start();
                return;
            }
            FloatingActionButton floatingActionButton2 = impl.f6596v;
            if (z10) {
                i10 = 8;
            } else {
                i10 = 4;
            }
            floatingActionButton2.b(i10, z10);
            if (aVar2 != null) {
                aVar2.f6566a.a(aVar2.f6567b);
            }
        }
    }

    public final boolean j() {
        d impl = getImpl();
        int visibility = impl.f6596v.getVisibility();
        int i10 = impl.f6592r;
        if (visibility == 0) {
            if (i10 != 1) {
                return false;
            }
        } else if (i10 == 2) {
            return false;
        }
        return true;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().h();
    }

    public final boolean k() {
        d impl = getImpl();
        int visibility = impl.f6596v.getVisibility();
        int i10 = impl.f6592r;
        if (visibility != 0) {
            if (i10 != 2) {
                return false;
            }
        } else if (i10 == 1) {
            return false;
        }
        return true;
    }

    public final void l(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f6556m;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void m() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f6547d;
        if (colorStateList == null) {
            b1.a.a(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f6548e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(k.c(colorForState, mode));
    }

    public final void o(a aVar, boolean z10) {
        com.google.android.material.floatingactionbutton.a aVar2;
        boolean z11;
        boolean z12;
        AnimatorSet c10;
        float f10;
        float f11;
        d impl = getImpl();
        if (aVar == null) {
            aVar2 = null;
        } else {
            aVar2 = new com.google.android.material.floatingactionbutton.a(this, aVar);
        }
        boolean z13 = true;
        if (impl.f6596v.getVisibility() == 0 ? impl.f6592r != 1 : impl.f6592r == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            Animator animator = impl.f6586l;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.f6587m == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            FloatingActionButton floatingActionButton = impl.f6596v;
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            if ((!o0.g.c(floatingActionButton) || impl.f6596v.isInEditMode()) ? false : false) {
                if (impl.f6596v.getVisibility() != 0) {
                    float f12 = 0.0f;
                    impl.f6596v.setAlpha(0.0f);
                    FloatingActionButton floatingActionButton2 = impl.f6596v;
                    if (z12) {
                        f10 = 0.4f;
                    } else {
                        f10 = 0.0f;
                    }
                    floatingActionButton2.setScaleY(f10);
                    FloatingActionButton floatingActionButton3 = impl.f6596v;
                    if (z12) {
                        f11 = 0.4f;
                    } else {
                        f11 = 0.0f;
                    }
                    floatingActionButton3.setScaleX(f11);
                    if (z12) {
                        f12 = 0.4f;
                    }
                    impl.f6590p = f12;
                    Matrix matrix = impl.A;
                    impl.a(f12, matrix);
                    impl.f6596v.setImageMatrix(matrix);
                }
                g gVar = impl.f6587m;
                if (gVar != null) {
                    c10 = impl.b(gVar, 1.0f, 1.0f, 1.0f);
                } else {
                    c10 = impl.c(1.0f, 1.0f, 1.0f);
                }
                c10.addListener(new com.google.android.material.floatingactionbutton.c(impl, z10, aVar2));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f6593s;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        c10.addListener(it.next());
                    }
                }
                c10.start();
                return;
            }
            impl.f6596v.b(0, z10);
            impl.f6596v.setAlpha(1.0f);
            impl.f6596v.setScaleY(1.0f);
            impl.f6596v.setScaleX(1.0f);
            impl.f6590p = 1.0f;
            Matrix matrix2 = impl.A;
            impl.a(1.0f, matrix2);
            impl.f6596v.setImageMatrix(matrix2);
            if (aVar2 != null) {
                aVar2.f6566a.b();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d impl = getImpl();
        f fVar = impl.f6576b;
        if (fVar != null) {
            p.b.z(impl.f6596v, fVar);
        }
        if (!(impl instanceof y9.d)) {
            ViewTreeObserver viewTreeObserver = impl.f6596v.getViewTreeObserver();
            if (impl.B == null) {
                impl.B = new y9.c(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.B);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f6596v.getViewTreeObserver();
        y9.c cVar = impl.B;
        if (cVar != null) {
            viewTreeObserver.removeOnPreDrawListener(cVar);
            impl.B = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f6553j = (sizeDimension - this.f6554k) / 2;
        getImpl().q();
        int min = Math.min(n(sizeDimension, i10), n(sizeDimension, i11));
        Rect rect = this.f6556m;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ia.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ia.a aVar = (ia.a) parcelable;
        super.onRestoreInstanceState(aVar.f24504a);
        s.d dVar = this.f6559p;
        Bundle orDefault = aVar.f16759c.getOrDefault("expandableWidgetHelper", null);
        orDefault.getClass();
        Bundle bundle = orDefault;
        dVar.getClass();
        dVar.f25928a = bundle.getBoolean("expanded", false);
        dVar.f25929b = bundle.getInt("expandedComponentIdHint", 0);
        if (dVar.f25928a) {
            ViewParent parent = ((View) dVar.f25930c).getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).c((View) dVar.f25930c);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ia.a aVar = new ia.a(onSaveInstanceState);
        h<String, Bundle> hVar = aVar.f16759c;
        s.d dVar = this.f6559p;
        dVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", dVar.f25928a);
        bundle.putInt("expandedComponentIdHint", dVar.f25929b);
        hVar.put("expandableWidgetHelper", bundle);
        return aVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (motionEvent.getAction() == 0) {
            Rect rect = this.f6557n;
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            if (o0.g.c(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                l(rect);
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !this.f6557n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f6545b != colorStateList) {
            this.f6545b = colorStateList;
            d impl = getImpl();
            f fVar = impl.f6576b;
            if (fVar != null) {
                fVar.setTintList(colorStateList);
            }
            y9.a aVar = impl.f6578d;
            if (aVar != null) {
                if (colorStateList != null) {
                    aVar.f31240m = colorStateList.getColorForState(aVar.getState(), aVar.f31240m);
                }
                aVar.f31243p = colorStateList;
                aVar.f31241n = true;
                aVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f6546c != mode) {
            this.f6546c = mode;
            f fVar = getImpl().f6576b;
            if (fVar != null) {
                fVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f10) {
        d impl = getImpl();
        if (impl.f6582h != f10) {
            impl.f6582h = f10;
            impl.k(f10, impl.f6583i, impl.f6584j);
        }
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        d impl = getImpl();
        if (impl.f6583i != f10) {
            impl.f6583i = f10;
            impl.k(impl.f6582h, f10, impl.f6584j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        d impl = getImpl();
        if (impl.f6584j != f10) {
            impl.f6584j = f10;
            impl.k(impl.f6582h, impl.f6583i, f10);
        }
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i10 != this.f6552i) {
            this.f6552i = i10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        f fVar = getImpl().f6576b;
        if (fVar != null) {
            fVar.j(f10);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().f6580f) {
            getImpl().f6580f = z10;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        this.f6559p.f25929b = i10;
    }

    public void setHideMotionSpec(g gVar) {
        getImpl().f6588n = gVar;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(g.b(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            d impl = getImpl();
            float f10 = impl.f6590p;
            impl.f6590p = f10;
            Matrix matrix = impl.A;
            impl.a(f10, matrix);
            impl.f6596v.setImageMatrix(matrix);
            if (this.f6547d != null) {
                m();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f6558o.c(i10);
        m();
    }

    public void setMaxImageSize(int i10) {
        this.f6554k = i10;
        d impl = getImpl();
        if (impl.f6591q != i10) {
            impl.f6591q = i10;
            float f10 = impl.f6590p;
            impl.f6590p = f10;
            Matrix matrix = impl.A;
            impl.a(f10, matrix);
            impl.f6596v.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f6549f != colorStateList) {
            this.f6549f = colorStateList;
            getImpl().m(this.f6549f);
        }
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        ArrayList<d.f> arrayList = getImpl().f6595u;
        if (arrayList != null) {
            Iterator<d.f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        ArrayList<d.f> arrayList = getImpl().f6595u;
        if (arrayList != null) {
            Iterator<d.f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z10) {
        d impl = getImpl();
        impl.f6581g = z10;
        impl.q();
    }

    @Override // ga.m
    public void setShapeAppearanceModel(i iVar) {
        getImpl().n(iVar);
    }

    public void setShowMotionSpec(g gVar) {
        getImpl().f6587m = gVar;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(g.b(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f6552i = 0;
        if (i10 != this.f6551h) {
            this.f6551h = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f6547d != colorStateList) {
            this.f6547d = colorStateList;
            m();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f6548e != mode) {
            this.f6548e = mode;
            m();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().l();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f6555l != z10) {
            this.f6555l = z10;
            getImpl().i();
        }
    }

    @Override // z9.t, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }
}
