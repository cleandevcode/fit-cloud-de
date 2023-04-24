package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import java.util.WeakHashMap;
import k1.a0;
import k1.b0;
import k1.c0;
import k1.d0;
import k1.i2;
import k1.o0;
import k1.z;
import o1.i;
import v2.d;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements c0, b0, z {
    public static final int[] U = {16842766};
    public v2.e A;
    public v2.f B;
    public v2.g C;
    public v2.g D;
    public boolean E;
    public int F;
    public boolean H;
    public a L;
    public final c M;
    public final d Q;

    /* renamed from: a */
    public View f3356a;

    /* renamed from: b */
    public f f3357b;

    /* renamed from: c */
    public boolean f3358c;

    /* renamed from: d */
    public int f3359d;

    /* renamed from: e */
    public float f3360e;

    /* renamed from: f */
    public float f3361f;

    /* renamed from: g */
    public final d0 f3362g;

    /* renamed from: h */
    public final a0 f3363h;

    /* renamed from: i */
    public final int[] f3364i;

    /* renamed from: j */
    public final int[] f3365j;

    /* renamed from: k */
    public final int[] f3366k;

    /* renamed from: l */
    public boolean f3367l;

    /* renamed from: m */
    public int f3368m;

    /* renamed from: n */
    public int f3369n;

    /* renamed from: o */
    public float f3370o;

    /* renamed from: p */
    public float f3371p;

    /* renamed from: q */
    public boolean f3372q;

    /* renamed from: r */
    public int f3373r;

    /* renamed from: s */
    public final DecelerateInterpolator f3374s;

    /* renamed from: t */
    public v2.a f3375t;

    /* renamed from: u */
    public int f3376u;

    /* renamed from: v */
    public int f3377v;

    /* renamed from: w */
    public int f3378w;

    /* renamed from: x */
    public int f3379x;

    /* renamed from: y */
    public int f3380y;

    /* renamed from: z */
    public v2.d f3381z;

    /* loaded from: classes.dex */
    public class a implements Animation.AnimationListener {
        public a() {
            SwipeRefreshLayout.this = r1;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            f fVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f3358c) {
                swipeRefreshLayout.g();
                return;
            }
            swipeRefreshLayout.f3381z.setAlpha(255);
            SwipeRefreshLayout.this.f3381z.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.E && (fVar = swipeRefreshLayout2.f3357b) != null) {
                fVar.e();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.f3369n = swipeRefreshLayout3.f3375t.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Animation.AnimationListener {
        public b() {
            SwipeRefreshLayout.this = r1;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout.this.getClass();
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            swipeRefreshLayout.getClass();
            v2.f fVar = new v2.f(swipeRefreshLayout);
            swipeRefreshLayout.B = fVar;
            fVar.setDuration(150L);
            v2.a aVar = swipeRefreshLayout.f3375t;
            aVar.f28992a = null;
            aVar.clearAnimation();
            swipeRefreshLayout.f3375t.startAnimation(swipeRefreshLayout.B);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes.dex */
    public class c extends Animation {
        public c() {
            SwipeRefreshLayout.this = r1;
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.getClass();
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int abs = swipeRefreshLayout.f3379x - Math.abs(swipeRefreshLayout.f3378w);
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i10 = swipeRefreshLayout2.f3377v;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i10 + ((int) ((abs - i10) * f10))) - swipeRefreshLayout2.f3375t.getTop());
            v2.d dVar = SwipeRefreshLayout.this.f3381z;
            float f11 = 1.0f - f10;
            d.a aVar = dVar.f29001a;
            if (f11 != aVar.f29022p) {
                aVar.f29022p = f11;
            }
            dVar.invalidateSelf();
        }
    }

    /* loaded from: classes.dex */
    public class d extends Animation {
        public d() {
            SwipeRefreshLayout.this = r1;
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.f(f10);
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean a();
    }

    /* loaded from: classes.dex */
    public interface f {
        void e();
    }

    /* loaded from: classes.dex */
    public static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: a */
        public final boolean f3386a;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcel parcel) {
            super(parcel);
            this.f3386a = parcel.readByte() != 0;
        }

        public g(Parcelable parcelable, boolean z10) {
            super(parcelable);
            this.f3386a = z10;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f3386a ? (byte) 1 : (byte) 0);
        }
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3358c = false;
        this.f3360e = -1.0f;
        this.f3364i = new int[2];
        this.f3365j = new int[2];
        this.f3366k = new int[2];
        this.f3373r = -1;
        this.f3376u = -1;
        this.L = new a();
        this.M = new c();
        this.Q = new d();
        this.f3359d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f3368m = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f3374s = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.F = (int) (displayMetrics.density * 40.0f);
        this.f3375t = new v2.a(getContext());
        v2.d dVar = new v2.d(getContext());
        this.f3381z = dVar;
        dVar.c(7.5f, 2.5f, 10.0f, 5.0f);
        dVar.invalidateSelf();
        this.f3375t.setImageDrawable(this.f3381z);
        this.f3375t.setVisibility(8);
        addView(this.f3375t);
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.f3379x = i10;
        this.f3360e = i10;
        this.f3362g = new d0();
        this.f3363h = new a0(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.F;
        this.f3369n = i11;
        this.f3378w = i11;
        f(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, U);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i10) {
        this.f3375t.getBackground().setAlpha(i10);
        this.f3381z.setAlpha(i10);
    }

    public final boolean a() {
        View view = this.f3356a;
        if (view instanceof ListView) {
            return i.a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.f3356a == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f3375t)) {
                    this.f3356a = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f10) {
        if (f10 > this.f3360e) {
            h(true, true);
            return;
        }
        this.f3358c = false;
        v2.d dVar = this.f3381z;
        d.a aVar = dVar.f29001a;
        aVar.f29011e = 0.0f;
        aVar.f29012f = 0.0f;
        dVar.invalidateSelf();
        b bVar = new b();
        this.f3377v = this.f3369n;
        this.Q.reset();
        this.Q.setDuration(200L);
        this.Q.setInterpolator(this.f3374s);
        v2.a aVar2 = this.f3375t;
        aVar2.f28992a = bVar;
        aVar2.clearAnimation();
        this.f3375t.startAnimation(this.Q);
        v2.d dVar2 = this.f3381z;
        d.a aVar3 = dVar2.f29001a;
        if (aVar3.f29020n) {
            aVar3.f29020n = false;
        }
        dVar2.invalidateSelf();
    }

    public final void d(float f10) {
        v2.d dVar = this.f3381z;
        d.a aVar = dVar.f29001a;
        boolean z10 = true;
        if (!aVar.f29020n) {
            aVar.f29020n = true;
        }
        dVar.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f10 / this.f3360e));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f10) - this.f3360e;
        int i10 = this.f3380y;
        if (i10 <= 0) {
            i10 = this.f3379x;
        }
        float f11 = i10;
        double max2 = Math.max(0.0f, Math.min(abs, f11 * 2.0f) / f11) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i11 = this.f3378w + ((int) ((f11 * min) + (f11 * pow * 2.0f)));
        if (this.f3375t.getVisibility() != 0) {
            this.f3375t.setVisibility(0);
        }
        this.f3375t.setScaleX(1.0f);
        this.f3375t.setScaleY(1.0f);
        if (f10 < this.f3360e) {
            if (this.f3381z.f29001a.f29026t > 76) {
                v2.g gVar = this.C;
                if (!((gVar == null || !gVar.hasStarted() || gVar.hasEnded()) ? false : false)) {
                    v2.g gVar2 = new v2.g(this, this.f3381z.f29001a.f29026t, 76);
                    gVar2.setDuration(300L);
                    v2.a aVar2 = this.f3375t;
                    aVar2.f28992a = null;
                    aVar2.clearAnimation();
                    this.f3375t.startAnimation(gVar2);
                    this.C = gVar2;
                }
            }
        } else if (this.f3381z.f29001a.f29026t < 255) {
            v2.g gVar3 = this.D;
            if (!((gVar3 == null || !gVar3.hasStarted() || gVar3.hasEnded()) ? false : false)) {
                v2.g gVar4 = new v2.g(this, this.f3381z.f29001a.f29026t, 255);
                gVar4.setDuration(300L);
                v2.a aVar3 = this.f3375t;
                aVar3.f28992a = null;
                aVar3.clearAnimation();
                this.f3375t.startAnimation(gVar4);
                this.D = gVar4;
            }
        }
        v2.d dVar2 = this.f3381z;
        float min2 = Math.min(0.8f, max * 0.8f);
        d.a aVar4 = dVar2.f29001a;
        aVar4.f29011e = 0.0f;
        aVar4.f29012f = min2;
        dVar2.invalidateSelf();
        v2.d dVar3 = this.f3381z;
        float min3 = Math.min(1.0f, max);
        d.a aVar5 = dVar3.f29001a;
        if (min3 != aVar5.f29022p) {
            aVar5.f29022p = min3;
        }
        dVar3.invalidateSelf();
        v2.d dVar4 = this.f3381z;
        dVar4.f29001a.f29013g = ((pow * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f;
        dVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i11 - this.f3369n);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f3363h.a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f3363h.b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f3363h.c(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f3363h.e(i10, i11, i12, i13, iArr);
    }

    @Override // k1.c0
    public final void e(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        int i15;
        if (i14 != 0) {
            return;
        }
        int i16 = iArr[1];
        int[] iArr2 = this.f3365j;
        if (i14 == 0) {
            this.f3363h.d(i10, i11, i12, i13, iArr2, i14, iArr);
        }
        int i17 = i13 - (iArr[1] - i16);
        if (i17 == 0) {
            i15 = i13 + this.f3365j[1];
        } else {
            i15 = i17;
        }
        if (i15 < 0 && !a()) {
            float abs = this.f3361f + Math.abs(i15);
            this.f3361f = abs;
            d(abs);
            iArr[1] = iArr[1] + i17;
        }
    }

    public final void f(float f10) {
        int i10 = this.f3377v;
        setTargetOffsetTopAndBottom((i10 + ((int) ((this.f3378w - i10) * f10))) - this.f3375t.getTop());
    }

    public final void g() {
        this.f3375t.clearAnimation();
        this.f3381z.stop();
        this.f3375t.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.f3378w - this.f3369n);
        this.f3369n = this.f3375t.getTop();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f3376u;
        return i12 < 0 ? i11 : i11 == i10 + (-1) ? i12 : i11 >= i12 ? i11 + 1 : i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        d0 d0Var = this.f3362g;
        return d0Var.f18110b | d0Var.f18109a;
    }

    public int getProgressCircleDiameter() {
        return this.F;
    }

    public int getProgressViewEndOffset() {
        return this.f3379x;
    }

    public int getProgressViewStartOffset() {
        return this.f3378w;
    }

    public final void h(boolean z10, boolean z11) {
        if (this.f3358c != z10) {
            this.E = z11;
            b();
            this.f3358c = z10;
            if (z10) {
                int i10 = this.f3369n;
                a aVar = this.L;
                this.f3377v = i10;
                this.M.reset();
                this.M.setDuration(200L);
                this.M.setInterpolator(this.f3374s);
                if (aVar != null) {
                    this.f3375t.f28992a = aVar;
                }
                this.f3375t.clearAnimation();
                this.f3375t.startAnimation(this.M);
                return;
            }
            a aVar2 = this.L;
            v2.f fVar = new v2.f(this);
            this.B = fVar;
            fVar.setDuration(150L);
            v2.a aVar3 = this.f3375t;
            aVar3.f28992a = aVar2;
            aVar3.clearAnimation();
            this.f3375t.startAnimation(this.B);
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f3363h.h(0);
    }

    public final void i(float f10) {
        float f11 = this.f3371p;
        int i10 = this.f3359d;
        if (f10 - f11 <= i10 || this.f3372q) {
            return;
        }
        this.f3370o = f11 + i10;
        this.f3372q = true;
        this.f3381z.setAlpha(76);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f3363h.f18091d;
    }

    @Override // k1.b0
    public final void k(View view, int i10, int i11, int i12, int i13, int i14) {
        e(view, i10, i11, i12, i13, i14, this.f3366k);
    }

    @Override // k1.b0
    public final boolean l(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            return onStartNestedScroll(view, view2, i10);
        }
        return false;
    }

    @Override // k1.b0
    public final void m(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // k1.b0
    public final void n(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // k1.b0
    public final void o(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b();
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 0;
        if (!isEnabled() || a() || this.f3358c || this.f3367l) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.f3373r) {
                                if (actionIndex == 0) {
                                    i10 = 1;
                                }
                                this.f3373r = motionEvent.getPointerId(i10);
                            }
                        }
                    }
                } else {
                    int i11 = this.f3373r;
                    if (i11 == -1) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i11);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    i(motionEvent.getY(findPointerIndex));
                }
            }
            this.f3372q = false;
            this.f3373r = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f3378w - this.f3375t.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f3373r = pointerId;
            this.f3372q = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f3371p = motionEvent.getY(findPointerIndex2);
        }
        return this.f3372q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f3356a == null) {
            b();
        }
        View view = this.f3356a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f3375t.getMeasuredWidth();
        int measuredHeight2 = this.f3375t.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.f3369n;
        this.f3375t.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f3356a == null) {
            b();
        }
        View view = this.f3356a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f3375t.measure(View.MeasureSpec.makeMeasureSpec(this.F, 1073741824), View.MeasureSpec.makeMeasureSpec(this.F, 1073741824));
        this.f3376u = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.f3375t) {
                this.f3376u = i12;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f3361f;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = (int) f10;
                    this.f3361f = 0.0f;
                } else {
                    this.f3361f = f10 - f11;
                    iArr[1] = i11;
                }
                d(this.f3361f);
            }
        }
        int[] iArr2 = this.f3364i;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        e(view, i10, i11, i12, i13, 0, this.f3366k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f3362g.a(i10, 0);
        startNestedScroll(i10 & 2);
        this.f3361f = 0.0f;
        this.f3367l = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        setRefreshing(gVar.f3386a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new g(super.onSaveInstanceState(), this.f3358c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.f3358c || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f3362g.f18109a = 0;
        this.f3367l = false;
        float f10 = this.f3361f;
        if (f10 > 0.0f) {
            c(f10);
            this.f3361f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 0;
        if (!isEnabled() || a() || this.f3358c || this.f3367l) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        return false;
                    }
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.f3373r) {
                                if (actionIndex == 0) {
                                    i10 = 1;
                                }
                                this.f3373r = motionEvent.getPointerId(i10);
                            }
                        }
                    } else {
                        int actionIndex2 = motionEvent.getActionIndex();
                        if (actionIndex2 < 0) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                            return false;
                        }
                        this.f3373r = motionEvent.getPointerId(actionIndex2);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f3373r);
                    if (findPointerIndex < 0) {
                        Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    float y10 = motionEvent.getY(findPointerIndex);
                    i(y10);
                    if (this.f3372q) {
                        float f10 = (y10 - this.f3370o) * 0.5f;
                        if (f10 <= 0.0f) {
                            return false;
                        }
                        getParent().requestDisallowInterceptTouchEvent(true);
                        d(f10);
                    }
                }
            } else {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f3373r);
                if (findPointerIndex2 < 0) {
                    Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f3372q) {
                    this.f3372q = false;
                    c((motionEvent.getY(findPointerIndex2) - this.f3370o) * 0.5f);
                }
                this.f3373r = -1;
                return false;
            }
        } else {
            this.f3373r = motionEvent.getPointerId(0);
            this.f3372q = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        ViewParent parent;
        View view = this.f3356a;
        if (view != null) {
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            if (!o0.i.p(view)) {
                if (!this.H && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(z10);
                    return;
                }
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void setAnimationProgress(float f10) {
        this.f3375t.setScaleX(f10);
        this.f3375t.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        v2.d dVar = this.f3381z;
        d.a aVar = dVar.f29001a;
        aVar.f29015i = iArr;
        aVar.a(0);
        dVar.f29001a.a(0);
        dVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = y0.a.b(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f3360e = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (z10) {
            return;
        }
        g();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z10) {
        this.H = z10;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f3363h.i(z10);
    }

    public void setOnChildScrollUpCallback(e eVar) {
    }

    public void setOnRefreshListener(f fVar) {
        this.f3357b = fVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.f3375t.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(y0.a.b(getContext(), i10));
    }

    public void setRefreshing(boolean z10) {
        if (z10 && this.f3358c != z10) {
            this.f3358c = z10;
            setTargetOffsetTopAndBottom((this.f3379x + this.f3378w) - this.f3369n);
            this.E = false;
            a aVar = this.L;
            this.f3375t.setVisibility(0);
            this.f3381z.setAlpha(255);
            v2.e eVar = new v2.e(this);
            this.A = eVar;
            eVar.setDuration(this.f3368m);
            if (aVar != null) {
                this.f3375t.f28992a = aVar;
            }
            this.f3375t.clearAnimation();
            this.f3375t.startAnimation(this.A);
            return;
        }
        h(z10, false);
    }

    public void setSize(int i10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        if (i10 != 0 && i10 != 1) {
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i10 == 0) {
            f10 = 56.0f;
        } else {
            f10 = 40.0f;
        }
        this.F = (int) (displayMetrics.density * f10);
        this.f3375t.setImageDrawable(null);
        v2.d dVar = this.f3381z;
        if (i10 == 0) {
            f11 = 11.0f;
            f12 = 3.0f;
            f13 = 12.0f;
            f14 = 6.0f;
        } else {
            f11 = 7.5f;
            f12 = 2.5f;
            f13 = 10.0f;
            f14 = 5.0f;
        }
        dVar.c(f11, f12, f13, f14);
        dVar.invalidateSelf();
        this.f3375t.setImageDrawable(this.f3381z);
    }

    public void setSlingshotDistance(int i10) {
        this.f3380y = i10;
    }

    public void setTargetOffsetTopAndBottom(int i10) {
        this.f3375t.bringToFront();
        o0.j(this.f3375t, i10);
        this.f3369n = this.f3375t.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return this.f3363h.j(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f3363h.k(0);
    }
}
