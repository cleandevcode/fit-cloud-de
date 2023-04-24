package com.github.kilnn.tool.widget.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b1.a;
import com.github.kilnn.tool.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import ga.f;
import h9.j;
import j7.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

/* loaded from: classes.dex */
public class BottomSheetLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: j */
    public static final int f5929j = R.style.Widget_ToolKit_BottomSheetLayout;

    /* renamed from: a */
    public final int f5930a;

    /* renamed from: b */
    public final f f5931b;

    /* renamed from: c */
    public Animator f5932c;

    /* renamed from: d */
    public int f5933d;

    /* renamed from: e */
    public int f5934e;

    /* renamed from: f */
    public boolean f5935f;

    /* renamed from: g */
    public final Behavior f5936g;

    /* renamed from: h */
    public a f5937h;

    /* renamed from: i */
    public WeakReference<View> f5938i;

    /* loaded from: classes.dex */
    public static class Behavior extends BottomSheetBehavior<BottomSheetLayout> {

        /* renamed from: c0 */
        public final Rect f5939c0;

        /* renamed from: d0 */
        public WeakReference<BottomSheetLayout> f5940d0;

        /* renamed from: e0 */
        public final a f5941e0;

        /* loaded from: classes.dex */
        public class a implements View.OnLayoutChangeListener {
            public a() {
                Behavior.this = r1;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                BottomSheetLayout bottomSheetLayout = Behavior.this.f5940d0.get();
                if (bottomSheetLayout != null && (view instanceof FloatingActionButton)) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    Rect rect = Behavior.this.f5939c0;
                    rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                    floatingActionButton.l(rect);
                    bottomSheetLayout.g(Behavior.this.f5939c0.height());
                    bottomSheetLayout.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f15121e.a(new RectF(Behavior.this.f5939c0)));
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f5941e0 = new a();
            this.f5939c0 = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5941e0 = new a();
            this.f5939c0 = new Rect();
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            BottomSheetLayout bottomSheetLayout = (BottomSheetLayout) view;
            this.f5940d0 = new WeakReference<>(bottomSheetLayout);
            int i11 = BottomSheetLayout.f5929j;
            View d10 = bottomSheetLayout.d();
            if (d10 != null) {
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                if (!o0.g.c(d10)) {
                    ((CoordinatorLayout.f) d10.getLayoutParams()).f2162d = 49;
                    if (d10 instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) d10;
                        floatingActionButton.addOnLayoutChangeListener(this.f5941e0);
                        floatingActionButton.e(new j7.c(bottomSheetLayout));
                        floatingActionButton.f(bottomSheetLayout.f5937h);
                    }
                    bottomSheetLayout.f();
                }
            }
            coordinatorLayout.s(bottomSheetLayout, i10);
            super.h(coordinatorLayout, bottomSheetLayout, i10);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class a implements j<FloatingActionButton> {
        public a() {
            BottomSheetLayout.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public class b extends BottomSheetBehavior.c {
        public b() {
            BottomSheetLayout.this = r1;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void a(View view, float f10) {
            FloatingActionButton c10;
            BottomSheetLayout bottomSheetLayout = BottomSheetLayout.this;
            if (bottomSheetLayout.f5935f && (c10 = bottomSheetLayout.c()) != null) {
                c10.setScaleX(1.0f - Math.abs(f10));
                c10.setScaleY(1.0f - Math.abs(f10));
            }
            View view2 = null;
            WeakReference<View> weakReference = BottomSheetLayout.this.f5938i;
            if (weakReference != null) {
                view2 = weakReference.get();
            }
            if (view2 != null) {
                view2.setRotation(f10 * 180.0f);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void b(View view, int i10) {
        }
    }

    /* loaded from: classes.dex */
    public static class c extends q1.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: c */
        public int f5945c;

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
            this.f5945c = parcel.readInt();
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // q1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f24504a, i10);
            parcel.writeInt(this.f5945c);
        }
    }

    public BottomSheetLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BottomSheetLayout(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r0 = com.github.kilnn.tool.widget.bottomsheet.BottomSheetLayout.f5929j
            android.content.Context r9 = la.a.a(r9, r10, r11, r0)
            r8.<init>(r9, r10, r11)
            ga.f r9 = new ga.f
            r9.<init>()
            r8.f5931b = r9
            com.github.kilnn.tool.widget.bottomsheet.BottomSheetLayout$a r1 = new com.github.kilnn.tool.widget.bottomsheet.BottomSheetLayout$a
            r1.<init>()
            r8.f5937h = r1
            android.content.Context r1 = r8.getContext()
            int[] r2 = com.github.kilnn.tool.R.styleable.BottomSheetLayout
            android.content.res.TypedArray r11 = r1.obtainStyledAttributes(r10, r2, r11, r0)
            int r0 = com.github.kilnn.tool.R.styleable.BottomSheetLayout_backgroundTint
            boolean r2 = r11.hasValue(r0)
            r3 = 0
            if (r2 == 0) goto L37
            int r2 = r11.getResourceId(r0, r3)
            if (r2 == 0) goto L37
            android.content.res.ColorStateList r2 = g.a.a(r1, r2)
            if (r2 == 0) goto L37
            goto L3b
        L37:
            android.content.res.ColorStateList r2 = r11.getColorStateList(r0)
        L3b:
            int r0 = com.github.kilnn.tool.R.styleable.BottomSheetLayout_elevation
            int r0 = r11.getDimensionPixelSize(r0, r3)
            int r4 = com.github.kilnn.tool.R.styleable.BottomSheetLayout_fabCradleMargin
            int r4 = r11.getDimensionPixelOffset(r4, r3)
            float r4 = (float) r4
            int r5 = com.github.kilnn.tool.R.styleable.BottomSheetLayout_fabCradleRoundedCornerRadius
            int r5 = r11.getDimensionPixelOffset(r5, r3)
            float r5 = (float) r5
            int r6 = com.github.kilnn.tool.R.styleable.BottomSheetLayout_fabCradleVerticalOffset
            int r6 = r11.getDimensionPixelOffset(r6, r3)
            float r6 = (float) r6
            int r7 = com.github.kilnn.tool.R.styleable.BottomSheetLayout_fabAlignMode
            int r7 = r11.getInt(r7, r3)
            r8.f5933d = r7
            int r7 = com.github.kilnn.tool.R.styleable.BottomSheetLayout_fabAnimMode
            int r7 = r11.getInt(r7, r3)
            r8.f5934e = r7
            int r7 = com.github.kilnn.tool.R.styleable.BottomSheetLayout_hideOnExpand
            boolean r3 = r11.getBoolean(r7, r3)
            r8.f5935f = r3
            r11.recycle()
            r11 = 1114636288(0x42700000, float:60.0)
            int r11 = g7.a.a(r1, r11)
            r8.f5930a = r11
            j7.d r11 = new j7.d
            r11.<init>(r4, r5, r6)
            ga.i$a r3 = new ga.i$a
            r3.<init>()
            r3.f15137i = r11
            ga.i r11 = new ga.i
            r11.<init>(r3)
            r9.setShapeAppearanceModel(r11)
            r9.n()
            android.graphics.Paint$Style r11 = android.graphics.Paint.Style.FILL
            r9.m(r11)
            r9.i(r1)
            float r11 = (float) r0
            r8.setElevation(r11)
            b1.a.b.h(r9, r2)
            java.util.WeakHashMap<android.view.View, k1.i2> r11 = k1.o0.f18161a
            k1.o0.d.q(r8, r9)
            com.github.kilnn.tool.widget.bottomsheet.BottomSheetLayout$Behavior r9 = new com.github.kilnn.tool.widget.bottomsheet.BottomSheetLayout$Behavior
            r9.<init>(r1, r10)
            r8.f5936g = r9
            com.github.kilnn.tool.widget.bottomsheet.BottomSheetLayout$b r10 = new com.github.kilnn.tool.widget.bottomsheet.BottomSheetLayout$b
            r10.<init>()
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$c> r11 = r9.T
            boolean r11 = r11.contains(r10)
            if (r11 != 0) goto Lbd
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$c> r9 = r9.T
            r9.add(r10)
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.kilnn.tool.widget.bottomsheet.BottomSheetLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public float getFabTranslationX() {
        return e(this.f5933d);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().f17519d;
    }

    public d getTopEdgeTreatment() {
        return (d) this.f5931b.f15069a.f15093a.f15125i;
    }

    public final FloatingActionButton c() {
        View d10 = d();
        if (d10 instanceof FloatingActionButton) {
            return (FloatingActionButton) d10;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View d() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.ArrayList r0 = r0.g(r4)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L2c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L18
        L2c:
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.kilnn.tool.widget.bottomsheet.BottomSheetLayout.d():android.view.View");
    }

    public final float e(int i10) {
        boolean z10;
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        int i11 = 1;
        if (o0.e.d(this) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 1) {
            float measuredWidth = (getMeasuredWidth() / 2.0f) - this.f5930a;
            if (z10) {
                i11 = -1;
            }
            return measuredWidth * i11;
        }
        return 0.0f;
    }

    public final void f() {
        boolean z10;
        float f10;
        getTopEdgeTreatment().f17520e = getFabTranslationX();
        View d10 = d();
        f fVar = this.f5931b;
        FloatingActionButton c10 = c();
        if (c10 != null && c10.k()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        fVar.l(f10);
        if (d10 != null) {
            d10.setTranslationY(getFabTranslationY());
            d10.setTranslationX(getFabTranslationX());
        }
    }

    public final void g(int i10) {
        float f10 = i10;
        if (f10 != getTopEdgeTreatment().f17518c) {
            getTopEdgeTreatment().f17518c = f10;
            this.f5931b.invalidateSelf();
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.f5931b.f15069a.f15098f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        return this.f5936g;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f17519d;
    }

    public int getFabAlignmentMode() {
        return this.f5933d;
    }

    public int getFabAnimationMode() {
        return this.f5934e;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f17517b;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f17516a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p.b.z(this, this.f5931b);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View view;
        Toolbar toolbar;
        View view2;
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            Animator animator = this.f5932c;
            if (animator != null) {
                animator.cancel();
            }
            f();
        }
        int i14 = 0;
        while (true) {
            view = null;
            if (i14 < getChildCount()) {
                View childAt = getChildAt(i14);
                if (childAt instanceof Toolbar) {
                    toolbar = (Toolbar) childAt;
                    break;
                }
                i14++;
            } else {
                toolbar = null;
                break;
            }
        }
        if (toolbar != null && toolbar.getNavigationIcon() != null) {
            toolbar.setNavigationContentDescription("indicator");
            for (int i15 = 0; i15 < toolbar.getChildCount(); i15++) {
                view2 = toolbar.getChildAt(i15);
                if ((view2 instanceof ImageButton) && "indicator".contentEquals(view2.getContentDescription())) {
                    break;
                }
            }
        }
        view2 = null;
        if (view2 != null) {
            WeakReference<View> weakReference = this.f5938i;
            if (weakReference != null) {
                view = weakReference.get();
            }
            if (view2 != view) {
                this.f5938i = new WeakReference<>(view2);
                return;
            }
            return;
        }
        this.f5938i = null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f24504a);
        this.f5933d = cVar.f5945c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f5945c = this.f5933d;
        return cVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        a.b.h(this.f5931b, colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            d topEdgeTreatment = getTopEdgeTreatment();
            if (f10 >= 0.0f) {
                topEdgeTreatment.f17519d = f10;
                this.f5931b.invalidateSelf();
                f();
                return;
            }
            topEdgeTreatment.getClass();
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        this.f5931b.j(f10);
    }

    public void setFabAlignmentMode(int i10) {
        if (this.f5933d != i10) {
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            if (o0.g.c(this)) {
                Animator animator = this.f5932c;
                if (animator != null) {
                    animator.cancel();
                }
                ArrayList arrayList = new ArrayList();
                if (this.f5934e == 1) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c(), "translationX", e(i10));
                    ofFloat.setDuration(300L);
                    arrayList.add(ofFloat);
                } else {
                    FloatingActionButton c10 = c();
                    if (c10 != null && !c10.j()) {
                        c10.i(new j7.b(this, i10), true);
                    }
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                this.f5932c = animatorSet;
                animatorSet.addListener(new j7.a(this));
                this.f5932c.start();
            }
        }
        this.f5933d = i10;
    }

    public void setFabAnimationMode(int i10) {
        this.f5934e = i10;
    }

    public void setFabCornerSize(float f10) {
        if (f10 != getTopEdgeTreatment().f17521f) {
            getTopEdgeTreatment().f17521f = f10;
            this.f5931b.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().f17517b = f10;
            this.f5931b.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f17516a = f10;
            this.f5931b.invalidateSelf();
        }
    }

    public void setHideOnExpend(boolean z10) {
        this.f5935f = z10;
    }
}
