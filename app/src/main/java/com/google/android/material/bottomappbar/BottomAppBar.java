package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b1.a;
import com.google.android.material.R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import l9.c;
import l9.d;
import l9.e;
import l9.f;
import z9.r;

/* loaded from: classes.dex */
public final class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: n0 */
    public static final /* synthetic */ int f6262n0 = 0;

    /* renamed from: e0 */
    public Integer f6263e0;

    /* renamed from: f0 */
    public Animator f6264f0;

    /* renamed from: g0 */
    public Animator f6265g0;

    /* renamed from: h0 */
    public int f6266h0;

    /* renamed from: i0 */
    public int f6267i0;

    /* renamed from: j0 */
    public boolean f6268j0;

    /* renamed from: k0 */
    public int f6269k0;

    /* renamed from: l0 */
    public boolean f6270l0;

    /* renamed from: m0 */
    public Behavior f6271m0;

    /* loaded from: classes.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e */
        public final Rect f6272e;

        /* renamed from: f */
        public WeakReference<BottomAppBar> f6273f;

        /* renamed from: g */
        public int f6274g;

        /* renamed from: h */
        public final a f6275h;

        /* loaded from: classes.dex */
        public class a implements View.OnLayoutChangeListener {
            public a() {
                Behavior.this = r1;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                BottomAppBar bottomAppBar = Behavior.this.f6273f.get();
                if (bottomAppBar != null && (view instanceof FloatingActionButton)) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    Rect rect = Behavior.this.f6272e;
                    rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                    floatingActionButton.l(rect);
                    int height = Behavior.this.f6272e.height();
                    bottomAppBar.B(height);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f15121e.a(new RectF(Behavior.this.f6272e)));
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                    if (Behavior.this.f6274g == 0) {
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                        if (r.c(floatingActionButton)) {
                            ((ViewGroup.MarginLayoutParams) fVar).leftMargin += 0;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) fVar).rightMargin += 0;
                            return;
                        }
                    }
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f6275h = new a();
            this.f6272e = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6275h = new a();
            this.f6272e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f6273f = new WeakReference<>(bottomAppBar);
            int i11 = BottomAppBar.f6262n0;
            View w10 = bottomAppBar.w();
            if (w10 != null) {
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                if (!o0.g.c(w10)) {
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) w10.getLayoutParams();
                    fVar.f2162d = 49;
                    this.f6274g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                    if (w10 instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) w10;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.addOnLayoutChangeListener(this.f6275h);
                        floatingActionButton.d();
                        floatingActionButton.e(new e(bottomAppBar));
                        floatingActionButton.f(null);
                    }
                    bottomAppBar.z();
                    throw null;
                }
            }
            coordinatorLayout.s(bottomAppBar, i10);
            super.h(coordinatorLayout, bottomAppBar, i10);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            return bottomAppBar.getHideOnScroll() && super.p(coordinatorLayout, bottomAppBar, view2, view3, i10, i11);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ ActionMenuView f6277a;

        /* renamed from: b */
        public final /* synthetic */ int f6278b;

        /* renamed from: c */
        public final /* synthetic */ boolean f6279c;

        public a(ActionMenuView actionMenuView, int i10, boolean z10) {
            BottomAppBar.this = r1;
            this.f6277a = actionMenuView;
            this.f6278b = i10;
            this.f6279c = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionMenuView actionMenuView = this.f6277a;
            actionMenuView.setTranslationX(BottomAppBar.this.x(actionMenuView, this.f6278b, this.f6279c));
        }
    }

    /* loaded from: classes.dex */
    public static class b extends q1.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c */
        public int f6281c;

        /* renamed from: d */
        public boolean f6282d;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new b[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6281c = parcel.readInt();
            this.f6282d = parcel.readInt() != 0;
        }

        public b(Toolbar.g gVar) {
            super(gVar);
        }

        @Override // q1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f24504a, i10);
            parcel.writeInt(this.f6281c);
            parcel.writeInt(this.f6282d ? 1 : 0);
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public int getBottomInset() {
        return 0;
    }

    private float getFabTranslationX() {
        return y(this.f6266h0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().f19419d;
    }

    public int getLeftInset() {
        return 0;
    }

    public int getRightInset() {
        return 0;
    }

    private f getTopEdgeTreatment() {
        throw null;
    }

    public final void B(int i10) {
        float f10 = i10;
        if (f10 == getTopEdgeTreatment().f19418c) {
            return;
        }
        getTopEdgeTreatment().f19418c = f10;
        throw null;
    }

    public final void C(ActionMenuView actionMenuView, int i10, boolean z10, boolean z11) {
        a aVar = new a(actionMenuView, i10, z10);
        if (z11) {
            actionMenuView.post(aVar);
        } else {
            aVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.f6271m0 == null) {
            this.f6271m0 = new Behavior();
        }
        return this.f6271m0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f19419d;
    }

    public int getFabAlignmentMode() {
        return this.f6266h0;
    }

    public int getFabAnimationMode() {
        return this.f6267i0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f19417b;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f19416a;
    }

    public boolean getHideOnScroll() {
        return this.f6268j0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p.b.z(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        super.onLayout(z10, i10, i11, i12, i13);
        FloatingActionButton floatingActionButton = null;
        if (z10) {
            Animator animator = this.f6265g0;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.f6264f0;
            if (animator2 != null) {
                animator2.cancel();
            }
            z();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f6265g0 == null) {
            actionMenuView.setAlpha(1.0f);
            View w10 = w();
            if (w10 instanceof FloatingActionButton) {
                floatingActionButton = (FloatingActionButton) w10;
            }
            if (floatingActionButton != null && floatingActionButton.k()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                C(actionMenuView, 0, false, false);
            } else {
                C(actionMenuView, this.f6266h0, this.f6270l0, false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f24504a);
        this.f6266h0 = bVar.f6281c;
        this.f6270l0 = bVar.f6282d;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b((Toolbar.g) super.onSaveInstanceState());
        bVar.f6281c = this.f6266h0;
        bVar.f6282d = this.f6270l0;
        return bVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        a.b.h(null, colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            f topEdgeTreatment = getTopEdgeTreatment();
            if (f10 >= 0.0f) {
                topEdgeTreatment.f19419d = f10;
                throw null;
            } else {
                topEdgeTreatment.getClass();
                throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        throw null;
    }

    public void setFabAlignmentMode(int i10) {
        FloatingActionButton floatingActionButton;
        boolean z10;
        int i11;
        this.f6269k0 = 0;
        boolean z11 = this.f6270l0;
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        FloatingActionButton floatingActionButton2 = null;
        if (!o0.g.c(this)) {
            int i12 = this.f6269k0;
            if (i12 != 0) {
                this.f6269k0 = 0;
                getMenu().clear();
                k(i12);
            }
        } else {
            Animator animator = this.f6265g0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            View w10 = w();
            if (w10 instanceof FloatingActionButton) {
                floatingActionButton = (FloatingActionButton) w10;
            } else {
                floatingActionButton = null;
            }
            if (floatingActionButton != null && floatingActionButton.k()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                z11 = false;
                i11 = 0;
            } else {
                i11 = i10;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                if (Math.abs(actionMenuView.getTranslationX() - x(actionMenuView, i11, z11)) > 1.0f) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    ofFloat2.addListener(new d(this, actionMenuView, i11, z11));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(150L);
                    animatorSet.playSequentially(ofFloat2, ofFloat);
                    arrayList.add(animatorSet);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(ofFloat);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.f6265g0 = animatorSet2;
            animatorSet2.addListener(new c(this));
            this.f6265g0.start();
        }
        if (this.f6266h0 != i10 && o0.g.c(this)) {
            Animator animator2 = this.f6264f0;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.f6267i0 == 1) {
                View w11 = w();
                if (w11 instanceof FloatingActionButton) {
                    floatingActionButton2 = (FloatingActionButton) w11;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(floatingActionButton2, "translationX", y(i10));
                ofFloat3.setDuration(300L);
                arrayList2.add(ofFloat3);
            } else {
                View w12 = w();
                if (w12 instanceof FloatingActionButton) {
                    floatingActionButton2 = (FloatingActionButton) w12;
                }
                if (floatingActionButton2 != null && !floatingActionButton2.j()) {
                    floatingActionButton2.i(new l9.b(this, i10), true);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            this.f6264f0 = animatorSet3;
            animatorSet3.addListener(new l9.a(this));
            this.f6264f0.start();
        }
        this.f6266h0 = i10;
    }

    public void setFabAnimationMode(int i10) {
        this.f6267i0 = i10;
    }

    public void setFabCornerSize(float f10) {
        if (f10 == getTopEdgeTreatment().f19420e) {
            return;
        }
        getTopEdgeTreatment().f19420e = f10;
        throw null;
    }

    public void setFabCradleMargin(float f10) {
        if (f10 == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().f19417b = f10;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().f19416a = f10;
        throw null;
    }

    public void setHideOnScroll(boolean z10) {
        this.f6268j0 = z10;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f6263e0 != null) {
            drawable = b1.a.g(drawable.mutate());
            a.b.g(drawable, this.f6263e0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f6263e0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View w() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.w():android.view.View");
    }

    public final int x(ActionMenuView actionMenuView, int i10, boolean z10) {
        if (i10 == 1 && z10) {
            boolean c10 = r.c(this);
            int measuredWidth = c10 ? getMeasuredWidth() : 0;
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).f13867a & 8388615) == 8388611) {
                    measuredWidth = c10 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
                }
            }
            return measuredWidth - ((c10 ? actionMenuView.getRight() : actionMenuView.getLeft()) + 0);
        }
        return 0;
    }

    public final float y(int i10) {
        boolean c10 = r.c(this);
        if (i10 == 1) {
            return ((getMeasuredWidth() / 2) + 0) * (c10 ? -1 : 1);
        }
        return 0.0f;
    }

    public final void z() {
        FloatingActionButton floatingActionButton;
        f topEdgeTreatment = getTopEdgeTreatment();
        getFabTranslationX();
        topEdgeTreatment.getClass();
        w();
        if (this.f6270l0) {
            View w10 = w();
            if (w10 instanceof FloatingActionButton) {
                floatingActionButton = (FloatingActionButton) w10;
            } else {
                floatingActionButton = null;
            }
            if (floatingActionButton != null) {
                floatingActionButton.k();
            }
        }
        throw null;
    }
}
