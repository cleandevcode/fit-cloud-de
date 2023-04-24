package com.topstep.fitcloud.pro.ui.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.topstep.fitcloud.pro.ui.widget.SwipeItemLayout;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import oi.h;

/* loaded from: classes2.dex */
public class SwipeItemLayout extends ViewGroup {

    /* renamed from: i */
    public static final h f12446i = new Interpolator() { // from class: oi.h
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            h hVar = SwipeItemLayout.f12446i;
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };

    /* renamed from: a */
    public a f12447a;

    /* renamed from: b */
    public ViewGroup f12448b;

    /* renamed from: c */
    public ViewGroup f12449c;

    /* renamed from: d */
    public final c f12450d;

    /* renamed from: e */
    public int f12451e;

    /* renamed from: f */
    public int f12452f;

    /* renamed from: g */
    public boolean f12453g;

    /* renamed from: h */
    public boolean f12454h;

    /* loaded from: classes2.dex */
    public enum a {
        RESET,
        DRAG,
        FLING,
        TAP
    }

    /* loaded from: classes2.dex */
    public static class b implements RecyclerView.q {

        /* renamed from: a */
        public SwipeItemLayout f12460a;

        /* renamed from: b */
        public float f12461b;

        /* renamed from: c */
        public float f12462c;

        /* renamed from: d */
        public VelocityTracker f12463d;

        /* renamed from: e */
        public int f12464e;

        /* renamed from: f */
        public final int f12465f;

        /* renamed from: g */
        public final int f12466g;

        /* renamed from: h */
        public boolean f12467h;

        /* renamed from: i */
        public boolean f12468i;

        public b(Context context) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f12465f = viewConfiguration.getScaledTouchSlop();
            this.f12466g = viewConfiguration.getScaledMaximumFlingVelocity();
            this.f12464e = -1;
            this.f12467h = false;
            this.f12468i = false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void a(MotionEvent motionEvent) {
            float y10;
            a aVar = a.DRAG;
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (this.f12463d == null) {
                this.f12463d = VelocityTracker.obtain();
            }
            this.f12463d.addMovement(motionEvent);
            if (actionMasked == 1) {
                SwipeItemLayout swipeItemLayout = this.f12460a;
                if (swipeItemLayout != null && swipeItemLayout.getTouchMode() == aVar) {
                    VelocityTracker velocityTracker = this.f12463d;
                    velocityTracker.computeCurrentVelocity(1000, this.f12466g);
                    this.f12460a.d((int) velocityTracker.getXVelocity(this.f12464e));
                }
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f12464e);
                if (findPointerIndex == -1) {
                    return;
                }
                float x10 = motionEvent.getX(findPointerIndex);
                float y11 = (int) motionEvent.getY(findPointerIndex);
                int i10 = (int) (x10 - this.f12461b);
                SwipeItemLayout swipeItemLayout2 = this.f12460a;
                if (swipeItemLayout2 == null || swipeItemLayout2.getTouchMode() != aVar) {
                    return;
                }
                this.f12461b = x10;
                this.f12462c = y11;
                this.f12460a.f(i10);
                return;
            } else if (actionMasked != 3) {
                if (actionMasked == 5) {
                    this.f12464e = motionEvent.getPointerId(actionIndex);
                    this.f12461b = motionEvent.getX(actionIndex);
                    y10 = motionEvent.getY(actionIndex);
                } else if (actionMasked != 6 || motionEvent.getPointerId(actionIndex) != this.f12464e) {
                    return;
                } else {
                    int i11 = actionIndex != 0 ? 0 : 1;
                    this.f12464e = motionEvent.getPointerId(i11);
                    this.f12461b = motionEvent.getX(i11);
                    y10 = motionEvent.getY(i11);
                }
                this.f12462c = y10;
                return;
            } else {
                SwipeItemLayout swipeItemLayout3 = this.f12460a;
                if (swipeItemLayout3 != null) {
                    swipeItemLayout3.e();
                }
            }
            b();
        }

        public final void b() {
            this.f12467h = false;
            this.f12464e = -1;
            VelocityTracker velocityTracker = this.f12463d;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f12463d = null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:221:0x0198  */
        /* JADX WARN: Removed duplicated region for block: B:222:0x019e  */
        @Override // androidx.recyclerview.widget.RecyclerView.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean c(androidx.recyclerview.widget.RecyclerView r12, android.view.MotionEvent r13) {
            /*
                Method dump skipped, instructions count: 431
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.topstep.fitcloud.pro.ui.widget.SwipeItemLayout.b.c(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void e(boolean z10) {
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: a */
        public final Scroller f12469a;

        /* renamed from: c */
        public final int f12471c;

        /* renamed from: b */
        public boolean f12470b = false;

        /* renamed from: d */
        public boolean f12472d = false;

        public c(Context context) {
            SwipeItemLayout.this = r2;
            this.f12469a = new Scroller(context, SwipeItemLayout.f12446i);
            this.f12471c = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        }

        public final void a() {
            if (this.f12470b) {
                return;
            }
            this.f12470b = true;
            if (this.f12469a.isFinished()) {
                return;
            }
            this.f12469a.abortAnimation();
            SwipeItemLayout.this.removeCallbacks(this);
        }

        public final void b(int i10, int i11) {
            if (i10 != i11) {
                SwipeItemLayout.this.setTouchMode(a.FLING);
                this.f12470b = false;
                this.f12472d = i11 < i10;
                this.f12469a.startScroll(i10, 0, i11 - i10, 0, 400);
                SwipeItemLayout swipeItemLayout = SwipeItemLayout.this;
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                o0.d.m(swipeItemLayout, this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10;
            a aVar = a.RESET;
            if (!this.f12470b) {
                boolean computeScrollOffset = this.f12469a.computeScrollOffset();
                int currX = this.f12469a.getCurrX();
                SwipeItemLayout swipeItemLayout = SwipeItemLayout.this;
                boolean f10 = swipeItemLayout.f(currX - swipeItemLayout.f12451e);
                if (computeScrollOffset && !f10) {
                    SwipeItemLayout swipeItemLayout2 = SwipeItemLayout.this;
                    WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                    o0.d.m(swipeItemLayout2, this);
                    return;
                }
                if (f10) {
                    SwipeItemLayout.this.removeCallbacks(this);
                    if (!this.f12469a.isFinished()) {
                        this.f12469a.abortAnimation();
                    }
                    SwipeItemLayout.this.setTouchMode(aVar);
                }
                if (!computeScrollOffset) {
                    SwipeItemLayout.this.setTouchMode(aVar);
                    int i11 = SwipeItemLayout.this.f12451e;
                    if (i11 != 0) {
                        int abs = Math.abs(i11);
                        SwipeItemLayout swipeItemLayout3 = SwipeItemLayout.this;
                        int i12 = swipeItemLayout3.f12452f;
                        if (abs > i12 / 2) {
                            i10 = -i12;
                        } else {
                            i10 = 0;
                        }
                        swipeItemLayout3.f12451e = i10;
                        WeakHashMap<View, i2> weakHashMap2 = o0.f18161a;
                        o0.d.m(swipeItemLayout3, this);
                    }
                }
            }
        }
    }

    public SwipeItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12447a = a.RESET;
        this.f12451e = 0;
        this.f12454h = false;
        this.f12450d = new c(context);
    }

    public static View c(ViewGroup viewGroup, int i10, int i11) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void a() {
        if (this.f12451e != 0) {
            a aVar = this.f12447a;
            a aVar2 = a.FLING;
            if (aVar == aVar2 && !this.f12450d.f12472d) {
                return;
            }
            if (aVar == aVar2) {
                this.f12450d.a();
            }
            this.f12450d.b(this.f12451e, 0);
        }
    }

    public final boolean b() {
        if (getChildCount() != 2) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof ViewGroup) {
            this.f12448b = (ViewGroup) childAt;
            View childAt2 = getChildAt(1);
            if (childAt2 instanceof ViewGroup) {
                this.f12449c = (ViewGroup) childAt2;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof ViewGroup.MarginLayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public final void d(int i10) {
        int i11;
        c cVar = this.f12450d;
        int i12 = this.f12451e;
        int i13 = cVar.f12471c;
        int i14 = 0;
        if (i10 <= i13 || i12 == 0) {
            if (i10 < (-i13) && i12 != (i11 = -SwipeItemLayout.this.f12452f)) {
                cVar.b(i12, i11);
                return;
            }
            int i15 = -SwipeItemLayout.this.f12452f;
            if (i12 <= i15 / 2) {
                i14 = i15;
            }
        }
        cVar.b(i12, i14);
    }

    public final void e() {
        int i10 = this.f12451e;
        int i11 = -this.f12452f;
        if (i10 < i11 / 2) {
            if (i10 != i11) {
                a aVar = this.f12447a;
                a aVar2 = a.FLING;
                if (aVar != aVar2 || !this.f12450d.f12472d) {
                    if (aVar == aVar2) {
                        this.f12450d.a();
                    }
                    this.f12450d.b(this.f12451e, -this.f12452f);
                    return;
                }
                return;
            }
            return;
        }
        a();
    }

    public final boolean f(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f12451e + i10;
        if ((i10 > 0 && i11 > 0) || (i10 < 0 && i11 < (-this.f12452f))) {
            i11 = Math.max(Math.min(i11, 0), -this.f12452f);
            z10 = true;
        }
        int i12 = i11 - this.f12451e;
        o0.i(this.f12448b, i12);
        o0.i(this.f12449c, i12);
        this.f12451e = i11;
        return z10;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? layoutParams : new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public a getTouchMode() {
        return this.f12447a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f12451e;
        if (i10 != 0 && this.f12454h) {
            int i11 = -i10;
            o0.i(this.f12448b, i11);
            o0.i(this.f12449c, i11);
        }
        this.f12451e = 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f12451e;
        if (i10 != 0 && this.f12454h) {
            int i11 = -i10;
            o0.i(this.f12448b, i11);
            o0.i(this.f12449c, i11);
        }
        this.f12451e = 0;
        removeCallbacks(this.f12450d);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View c10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            return actionMasked == 1 && (c10 = c(this, (int) motionEvent.getX(), (int) motionEvent.getY())) != null && c10 == this.f12448b && this.f12447a == a.TAP && this.f12451e != 0;
        }
        View c11 = c(this, (int) motionEvent.getX(), (int) motionEvent.getY());
        return (c11 == null || c11 != this.f12448b || this.f12451e == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (b()) {
            this.f12453g = true;
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = getPaddingRight();
            int paddingBottom = getPaddingBottom();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f12448b.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f12449c.getLayoutParams();
            int width = getWidth() - (paddingRight + marginLayoutParams.rightMargin);
            int height = getHeight() - (marginLayoutParams.bottomMargin + paddingBottom);
            this.f12448b.layout(paddingLeft + marginLayoutParams.leftMargin, marginLayoutParams.topMargin + paddingTop, width, height);
            int i14 = marginLayoutParams2.leftMargin;
            int i15 = width + i14;
            int i16 = paddingTop + marginLayoutParams2.topMargin;
            int i17 = i14 + i15 + marginLayoutParams2.rightMargin;
            this.f12449c.layout(i15, i16, this.f12449c.getMeasuredWidth() + i17, getHeight() - (marginLayoutParams2.bottomMargin + paddingBottom));
            int width2 = this.f12449c.getWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
            this.f12452f = width2;
            int i18 = -width2;
            if (this.f12451e >= i18 / 2) {
                i18 = 0;
            }
            this.f12451e = i18;
            o0.i(this.f12448b, i18);
            o0.i(this.f12449c, i18);
            this.f12453g = false;
            this.f12454h = true;
            return;
        }
        throw new RuntimeException("SwipeItemLayout的子视图不符合规定");
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!b()) {
            throw new RuntimeException("SwipeItemLayout的子视图不符合规定");
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f12448b.getLayoutParams();
        int i12 = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        int i13 = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        measureChildWithMargins(this.f12448b, i10, i12 + paddingRight, i11, i13 + paddingBottom);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, this.f12448b.getMeasuredWidth() + i12 + paddingRight);
        } else if (mode == 0) {
            size = this.f12448b.getMeasuredWidth() + i12 + paddingRight;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, this.f12448b.getMeasuredHeight() + i13 + paddingBottom);
        } else if (mode2 == 0) {
            size2 = this.f12448b.getMeasuredHeight() + i13 + paddingBottom;
        }
        setMeasuredDimension(size, size2);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f12449c.getLayoutParams();
        this.f12449c.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - (marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin)) - paddingBottom, 1073741824));
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View c10;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            View c11 = c(this, (int) motionEvent.getX(), (int) motionEvent.getY());
            return (c11 == null || c11 != this.f12448b || this.f12451e == 0) ? false : true;
        } else if (actionMasked == 1 && (c10 = c(this, (int) motionEvent.getX(), (int) motionEvent.getY())) != null && c10 == this.f12448b && this.f12447a == a.TAP && this.f12451e != 0) {
            a();
            return true;
        } else {
            return false;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (getVisibility() != 0) {
            this.f12451e = 0;
            invalidate();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f12453g) {
            return;
        }
        super.requestLayout();
    }

    public void setTouchMode(a aVar) {
        if (this.f12447a.ordinal() == 2) {
            this.f12450d.a();
        }
        this.f12447a = aVar;
    }
}
