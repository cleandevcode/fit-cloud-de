package androidx.core.widget;

import a0.q;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertController;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k1.a0;
import k1.c0;
import k1.d0;
import k1.i2;
import k1.o0;
import k1.z;
import l1.j;
import l1.l;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements c0, z {
    public static final float B = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final a C = new a();
    public static final int[] D = {16843130};
    public c A;

    /* renamed from: a */
    public final float f2201a;

    /* renamed from: b */
    public long f2202b;

    /* renamed from: c */
    public final Rect f2203c;

    /* renamed from: d */
    public OverScroller f2204d;

    /* renamed from: e */
    public EdgeEffect f2205e;

    /* renamed from: f */
    public EdgeEffect f2206f;

    /* renamed from: g */
    public int f2207g;

    /* renamed from: h */
    public boolean f2208h;

    /* renamed from: i */
    public boolean f2209i;

    /* renamed from: j */
    public View f2210j;

    /* renamed from: k */
    public boolean f2211k;

    /* renamed from: l */
    public VelocityTracker f2212l;

    /* renamed from: m */
    public boolean f2213m;

    /* renamed from: n */
    public boolean f2214n;

    /* renamed from: o */
    public int f2215o;

    /* renamed from: p */
    public int f2216p;

    /* renamed from: q */
    public int f2217q;

    /* renamed from: r */
    public int f2218r;

    /* renamed from: s */
    public final int[] f2219s;

    /* renamed from: t */
    public final int[] f2220t;

    /* renamed from: u */
    public int f2221u;

    /* renamed from: v */
    public int f2222v;

    /* renamed from: w */
    public d f2223w;

    /* renamed from: x */
    public final d0 f2224x;

    /* renamed from: y */
    public final a0 f2225y;

    /* renamed from: z */
    public float f2226z;

    /* loaded from: classes.dex */
    public static class a extends k1.a {
        @Override // k1.a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            boolean z10;
            super.c(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            l.c(accessibilityEvent, nestedScrollView.getScrollX());
            l.d(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // k1.a
        public final void d(View view, j jVar) {
            int scrollRange;
            this.f18085a.onInitializeAccessibilityNodeInfo(view, jVar.f18670a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            jVar.g(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                jVar.k(true);
                if (nestedScrollView.getScrollY() > 0) {
                    jVar.b(j.a.f18675g);
                    jVar.b(j.a.f18679k);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    jVar.b(j.a.f18674f);
                    jVar.b(j.a.f18680l);
                }
            }
        }

        @Override // k1.a
        public final boolean g(View view, int i10, Bundle bundle) {
            if (super.g(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 != 8192 && i10 != 16908344) {
                    if (i10 != 16908346) {
                        return false;
                    }
                } else {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.u(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                    return true;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.u(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    /* loaded from: classes.dex */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a */
        public int f2227a;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(Parcel parcel) {
            super(parcel);
            this.f2227a = parcel.readInt();
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("HorizontalScrollView.SavedState{");
            a10.append(Integer.toHexString(System.identityHashCode(this)));
            a10.append(" scrollPosition=");
            return q.b(a10, this.f2227a, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f2227a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NestedScrollView(android.content.Context r7, android.util.AttributeSet r8) {
        /*
            r6 = this;
            int r0 = androidx.core.R.attr.nestedScrollViewStyle
            r6.<init>(r7, r8, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r6.f2203c = r1
            r1 = 1
            r6.f2208h = r1
            r2 = 0
            r6.f2209i = r2
            r3 = 0
            r6.f2210j = r3
            r6.f2211k = r2
            r6.f2214n = r1
            r3 = -1
            r6.f2218r = r3
            r3 = 2
            int[] r4 = new int[r3]
            r6.f2219s = r4
            int[] r3 = new int[r3]
            r6.f2220t = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 < r4) goto L30
            android.widget.EdgeEffect r5 = o1.d.b.a(r7, r8)
            goto L35
        L30:
            android.widget.EdgeEffect r5 = new android.widget.EdgeEffect
            r5.<init>(r7)
        L35:
            r6.f2205e = r5
            if (r3 < r4) goto L3e
            android.widget.EdgeEffect r3 = o1.d.b.a(r7, r8)
            goto L43
        L3e:
            android.widget.EdgeEffect r3 = new android.widget.EdgeEffect
            r3.<init>(r7)
        L43:
            r6.f2206f = r3
            android.content.res.Resources r3 = r7.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            r4 = 1126170624(0x43200000, float:160.0)
            float r3 = r3 * r4
            r4 = 1136724797(0x43c10b3d, float:386.0878)
            float r3 = r3 * r4
            r4 = 1062668861(0x3f570a3d, float:0.84)
            float r3 = r3 * r4
            r6.f2201a = r3
            android.widget.OverScroller r3 = new android.widget.OverScroller
            android.content.Context r4 = r6.getContext()
            r3.<init>(r4)
            r6.f2204d = r3
            r6.setFocusable(r1)
            r3 = 262144(0x40000, float:3.67342E-40)
            r6.setDescendantFocusability(r3)
            r6.setWillNotDraw(r2)
            android.content.Context r3 = r6.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r4 = r3.getScaledTouchSlop()
            r6.f2215o = r4
            int r4 = r3.getScaledMinimumFlingVelocity()
            r6.f2216p = r4
            int r3 = r3.getScaledMaximumFlingVelocity()
            r6.f2217q = r3
            int[] r3 = androidx.core.widget.NestedScrollView.D
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r8, r3, r0, r2)
            boolean r8 = r7.getBoolean(r2, r2)
            r6.setFillViewport(r8)
            r7.recycle()
            k1.d0 r7 = new k1.d0
            r7.<init>()
            r6.f2224x = r7
            k1.a0 r7 = new k1.a0
            r7.<init>(r6)
            r6.f2225y = r7
            r6.setNestedScrollingEnabled(r1)
            androidx.core.widget.NestedScrollView$a r7 = androidx.core.widget.NestedScrollView.C
            k1.o0.p(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2226z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f2226z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f2226z;
    }

    public static boolean i(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && i((View) parent, view2);
    }

    public final boolean a(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && j(findNextFocus, maxScrollAmount, getHeight())) {
            findNextFocus.getDrawingRect(this.f2203c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2203c);
            c(b(this.f2203c));
            findNextFocus.requestFocus(i10);
        } else {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            c(maxScrollAmount);
        }
        if (findFocus != null && findFocus.isFocused() && (!j(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public final int b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i11) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        } else if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    public final void c(int i10) {
        if (i10 != 0) {
            if (this.f2214n) {
                u(0, i10, false);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public final void computeScroll() {
        int round;
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        if (this.f2204d.isFinished()) {
            return;
        }
        this.f2204d.computeScrollOffset();
        int currY = this.f2204d.getCurrY();
        int i10 = currY - this.f2222v;
        int height = getHeight();
        if (i10 > 0 && o1.d.a(this.f2205e) != 0.0f) {
            round = Math.round(o1.d.b(this.f2205e, ((-i10) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
            if (round != i10) {
                edgeEffect = this.f2205e;
                edgeEffect.finish();
            }
            i10 -= round;
        } else if (i10 < 0 && o1.d.a(this.f2206f) != 0.0f) {
            float f10 = height;
            round = Math.round(o1.d.b(this.f2206f, (i10 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
            if (round != i10) {
                edgeEffect = this.f2206f;
                edgeEffect.finish();
            }
            i10 -= round;
        }
        this.f2222v = currY;
        int[] iArr = this.f2220t;
        boolean z10 = false;
        iArr[1] = 0;
        this.f2225y.c(0, i10, iArr, null, 1);
        int i11 = i10 - this.f2220t[1];
        int scrollRange = getScrollRange();
        if (i11 != 0) {
            int scrollY = getScrollY();
            r(i11, getScrollX(), scrollY, scrollRange);
            int scrollY2 = getScrollY() - scrollY;
            int i12 = i11 - scrollY2;
            int[] iArr2 = this.f2220t;
            iArr2[1] = 0;
            this.f2225y.f(0, scrollY2, 0, i12, this.f2219s, 1, iArr2);
            i11 = i12 - this.f2220t[1];
        }
        if (i11 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z10 = true;
            }
            if (z10) {
                if (i11 < 0) {
                    if (this.f2205e.isFinished()) {
                        edgeEffect2 = this.f2205e;
                        edgeEffect2.onAbsorb((int) this.f2204d.getCurrVelocity());
                    }
                } else if (this.f2206f.isFinished()) {
                    edgeEffect2 = this.f2206f;
                    edgeEffect2.onAbsorb((int) this.f2204d.getCurrVelocity());
                }
            }
            this.f2204d.abortAnimation();
            w(1);
        }
        if (!this.f2204d.isFinished()) {
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.d.k(this);
            return;
        }
        w(1);
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public final void d() {
        this.f2211k = false;
        VelocityTracker velocityTracker = this.f2212l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2212l = null;
        }
        w(0);
        this.f2205e.onRelease();
        this.f2206f.onRelease();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || f(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f2225y.a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f2225y.b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f2225y.c(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f2225y.e(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i11 = 0;
        if (!this.f2205e.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i10 = getPaddingLeft() + 0;
            } else {
                i10 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i10, min);
            this.f2205e.setSize(width, height);
            if (this.f2205e.draw(canvas)) {
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                o0.d.k(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f2206f.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (b.a(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i11 = 0 + getPaddingLeft();
            }
            if (b.a(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i11 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f2206f.setSize(width2, height2);
            if (this.f2206f.draw(canvas)) {
                WeakHashMap<View, i2> weakHashMap2 = o0.f18161a;
                o0.d.k(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // k1.c0
    public final void e(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        p(i13, i14, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.f(android.view.KeyEvent):boolean");
    }

    public final void g(int i10) {
        if (getChildCount() > 0) {
            this.f2204d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f2225y.j(2, 1);
            this.f2222v = getScrollY();
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.d.k(this);
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        d0 d0Var = this.f2224x;
        return d0Var.f18110b | d0Var.f18109a;
    }

    public int getScrollRange() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public final boolean h(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f2203c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f2203c.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f2203c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f2203c;
        return s(i10, rect3.top, rect3.bottom);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f2225y.h(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f2225y.f18091d;
    }

    public final boolean j(View view, int i10, int i11) {
        view.getDrawingRect(this.f2203c);
        offsetDescendantRectToMyCoords(view, this.f2203c);
        return this.f2203c.bottom + i10 >= getScrollY() && this.f2203c.top - i10 <= getScrollY() + i11;
    }

    @Override // k1.b0
    public final void k(View view, int i10, int i11, int i12, int i13, int i14) {
        p(i13, i14, null);
    }

    @Override // k1.b0
    public final boolean l(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // k1.b0
    public final void m(View view, View view2, int i10, int i11) {
        this.f2224x.a(i10, i11);
        this.f2225y.j(2, i11);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // k1.b0
    public final void n(View view, int i10) {
        d0 d0Var = this.f2224x;
        if (i10 == 1) {
            d0Var.f18110b = 0;
        } else {
            d0Var.f18109a = 0;
        }
        w(i10);
    }

    @Override // k1.b0
    public final void o(View view, int i10, int i11, int[] iArr, int i12) {
        this.f2225y.c(i10, i11, iArr, null, i12);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2209i = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x002c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 0
            r2 = 8
            if (r0 != r2) goto Lc3
            boolean r0 = r8.f2211k
            if (r0 != 0) goto Lc3
            r0 = 2
            boolean r0 = k1.y.a(r9, r0)
            r2 = 0
            if (r0 == 0) goto L18
            r0 = 9
            goto L22
        L18:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = k1.y.a(r9, r0)
            if (r0 == 0) goto L27
            r0 = 26
        L22:
            float r0 = r9.getAxisValue(r0)
            goto L28
        L27:
            r0 = 0
        L28:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto Lc3
            float r2 = r8.getVerticalScrollFactorCompat()
            float r0 = r0 * r2
            int r0 = (int) r0
            int r2 = r8.getScrollRange()
            int r3 = r8.getScrollY()
            int r0 = r3 - r0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 8194(0x2002, float:1.1482E-41)
            r6 = 1
            if (r0 >= 0) goto L7c
            int r2 = r8.getOverScrollMode()
            if (r2 == 0) goto L55
            if (r2 != r6) goto L53
            int r2 = r8.getScrollRange()
            if (r2 <= 0) goto L53
            goto L55
        L53:
            r2 = 0
            goto L56
        L55:
            r2 = 1
        L56:
            if (r2 == 0) goto L60
            boolean r9 = k1.y.a(r9, r5)
            if (r9 != 0) goto L60
            r9 = 1
            goto L61
        L60:
            r9 = 0
        L61:
            if (r9 == 0) goto L7a
            android.widget.EdgeEffect r9 = r8.f2205e
            float r0 = (float) r0
            float r0 = -r0
            int r2 = r8.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            o1.d.b(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f2205e
            r9.onRelease()
            r8.invalidate()
            r9 = 1
            goto Lb8
        L7a:
            r0 = 0
            goto Lb6
        L7c:
            if (r0 <= r2) goto Lb6
            int r7 = r8.getOverScrollMode()
            if (r7 == 0) goto L8f
            if (r7 != r6) goto L8d
            int r7 = r8.getScrollRange()
            if (r7 <= 0) goto L8d
            goto L8f
        L8d:
            r7 = 0
            goto L90
        L8f:
            r7 = 1
        L90:
            if (r7 == 0) goto L9a
            boolean r9 = k1.y.a(r9, r5)
            if (r9 != 0) goto L9a
            r9 = 1
            goto L9b
        L9a:
            r9 = 0
        L9b:
            if (r9 == 0) goto Lb3
            android.widget.EdgeEffect r9 = r8.f2206f
            int r0 = r0 - r2
            float r0 = (float) r0
            int r1 = r8.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            o1.d.b(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f2206f
            r9.onRelease()
            r8.invalidate()
            r1 = 1
        Lb3:
            r9 = r1
            r1 = r2
            goto Lb8
        Lb6:
            r1 = r0
            r9 = 0
        Lb8:
            if (r1 == r3) goto Lc2
            int r9 = r8.getScrollX()
            super.scrollTo(r9, r1)
            return r6
        Lc2:
            return r9
        Lc3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0107  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = 0;
        this.f2208h = false;
        View view = this.f2210j;
        if (view != null && i(view, this)) {
            View view2 = this.f2210j;
            view2.getDrawingRect(this.f2203c);
            offsetDescendantRectToMyCoords(view2, this.f2203c);
            int b10 = b(this.f2203c);
            if (b10 != 0) {
                scrollBy(0, b10);
            }
        }
        this.f2210j = null;
        if (!this.f2209i) {
            if (this.f2223w != null) {
                scrollTo(getScrollX(), this.f2223w.f2227a);
                this.f2223w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i14 = 0;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i14 && scrollY >= 0) {
                i15 = paddingTop + scrollY > i14 ? i14 - paddingTop : scrollY;
            }
            if (i15 != scrollY) {
                scrollTo(getScrollX(), i15);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2209i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f2213m && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        g((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        o(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        p(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        m(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        View findNextFocusFromRect;
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (rect == null) {
            findNextFocusFromRect = focusFinder.findNextFocus(this, null, i10);
        } else {
            findNextFocusFromRect = focusFinder.findNextFocusFromRect(this, rect, i10);
        }
        if (findNextFocusFromRect == null || (true ^ j(findNextFocusFromRect, 0, getHeight()))) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f2223w = dVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f2227a = getScrollY();
        return dVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        c cVar = this.A;
        if (cVar != null) {
            f.b bVar = (f.b) cVar;
            AlertController.b(this, bVar.f13868a, bVar.f13869b);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !j(findFocus, 0, i13)) {
            return;
        }
        findFocus.getDrawingRect(this.f2203c);
        offsetDescendantRectToMyCoords(findFocus, this.f2203c);
        c(b(this.f2203c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return l(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        n(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x007a, code lost:
        if (r21.f2204d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x029e, code lost:
        if (r21.f2204d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x02a0, code lost:
        r1 = k1.o0.f18161a;
        k1.o0.d.k(r21);
     */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x027a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2225y.f(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    public final void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2218r) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f2207g = (int) motionEvent.getY(i10);
            this.f2218r = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f2212l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean r(int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i14 = i11 + 0;
        int i15 = i12 + i10;
        int i16 = i13 + 0;
        if (i14 > 0 || i14 < 0) {
            z10 = true;
            i14 = 0;
        } else {
            z10 = false;
        }
        if (i15 > i16) {
            i15 = i16;
        } else if (i15 < 0) {
            i15 = 0;
        } else {
            z11 = false;
            if (z11 && !this.f2225y.h(1)) {
                this.f2204d.springBack(i14, i15, 0, 0, 0, getScrollRange());
            }
            onOverScrolled(i14, i15, z10, z11);
            if (z10 && !z11) {
                return false;
            }
        }
        z11 = true;
        if (z11) {
            this.f2204d.springBack(i14, i15, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i14, i15, z10, z11);
        return z10 ? true : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f2208h) {
            view2.getDrawingRect(this.f2203c);
            offsetDescendantRectToMyCoords(view2, this.f2203c);
            int b10 = b(this.f2203c);
            if (b10 != 0) {
                scrollBy(0, b10);
            }
        } else {
            this.f2210j = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        boolean z11;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int b10 = b(rect);
        if (b10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (z10) {
                scrollBy(0, b10);
            } else {
                u(0, b10, false);
            }
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        VelocityTracker velocityTracker;
        if (z10 && (velocityTracker = this.f2212l) != null) {
            velocityTracker.recycle();
            this.f2212l = null;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f2208h = true;
        super.requestLayout();
    }

    public final boolean s(int i10, int i11, int i12) {
        boolean z10;
        int i13;
        boolean z11;
        boolean z12;
        boolean z13;
        int height = getHeight();
        int scrollY = getScrollY();
        int i14 = height + scrollY;
        if (i10 == 33) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z14 = false;
        for (int i15 = 0; i15 < size; i15++) {
            View view2 = focusables.get(i15);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                if (i11 < top && bottom < i12) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (view == null) {
                    view = view2;
                    z14 = z12;
                } else {
                    if ((z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom())) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z14) {
                        if (z12) {
                            if (!z13) {
                            }
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z14 = true;
                    } else {
                        if (!z13) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i11 >= scrollY && i12 <= i14) {
            z11 = false;
        } else {
            if (z10) {
                i13 = i11 - scrollY;
            } else {
                i13 = i12 - i14;
            }
            c(i13);
            z11 = true;
        }
        if (view != findFocus()) {
            view.requestFocus(i10);
        }
        return z11;
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i10 < 0) {
                i10 = 0;
            } else if (width + i10 > width2) {
                i10 = width2 - width;
            }
            if (height >= height2 || i11 < 0) {
                i11 = 0;
            } else if (height + i11 > height2) {
                i11 = height2 - height;
            }
            if (i10 == getScrollX() && i11 == getScrollY()) {
                return;
            }
            super.scrollTo(i10, i11);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f2213m) {
            this.f2213m = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f2225y.i(z10);
    }

    public void setOnScrollChangeListener(c cVar) {
        this.A = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f2214n = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return this.f2225y.j(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float a10 = o1.d.a(edgeEffect) * getHeight();
        double log = Math.log((Math.abs(-i10) * 0.35f) / (this.f2201a * 0.015f));
        double d10 = B;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * log) * ((double) (this.f2201a * 0.015f)))) < a10;
    }

    public final void u(int i10, int i11, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2202b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f2204d;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
            if (z10) {
                this.f2225y.j(2, 1);
            } else {
                w(1);
            }
            this.f2222v = getScrollY();
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.d.k(this);
        } else {
            if (!this.f2204d.isFinished()) {
                this.f2204d.abortAnimation();
                w(1);
            }
            scrollBy(i10, i11);
        }
        this.f2202b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z10;
        if (o1.d.a(this.f2205e) != 0.0f) {
            o1.d.b(this.f2205e, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        if (o1.d.a(this.f2206f) != 0.0f) {
            o1.d.b(this.f2206f, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z10;
    }

    public final void w(int i10) {
        this.f2225y.k(i10);
    }
}
