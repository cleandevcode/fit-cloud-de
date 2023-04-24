package com.github.kilnn.refreshloadlayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import com.topstep.fitcloud.pro.ui.HomePageFragment;
import gm.l;
import java.util.WeakHashMap;
import k1.a0;
import k1.d0;
import k1.i2;
import k1.o0;
import k1.z;
import mm.h;
import s.q0;

/* loaded from: classes.dex */
public class RefreshLoadLayout extends ViewGroup implements z {
    public static final int[] L = {16842766};
    public DecelerateInterpolator A;
    public DecelerateInterpolator B;
    public boolean C;
    public a D;
    public int E;
    public b F;
    public c H;

    /* renamed from: a */
    public View f5836a;

    /* renamed from: b */
    public w6.c f5837b;

    /* renamed from: c */
    public e f5838c;

    /* renamed from: d */
    public boolean f5839d;

    /* renamed from: e */
    public int f5840e;

    /* renamed from: f */
    public float f5841f;

    /* renamed from: g */
    public int f5842g;

    /* renamed from: h */
    public int f5843h;

    /* renamed from: i */
    public float f5844i;

    /* renamed from: j */
    public final d0 f5845j;

    /* renamed from: k */
    public final a0 f5846k;

    /* renamed from: l */
    public final int[] f5847l;

    /* renamed from: m */
    public final int[] f5848m;

    /* renamed from: n */
    public boolean f5849n;

    /* renamed from: o */
    public float f5850o;

    /* renamed from: p */
    public float f5851p;

    /* renamed from: q */
    public boolean f5852q;

    /* renamed from: r */
    public int f5853r;

    /* renamed from: s */
    public boolean f5854s;

    /* renamed from: t */
    public w6.d f5855t;

    /* renamed from: u */
    public int f5856u;

    /* renamed from: v */
    public int f5857v;

    /* renamed from: w */
    public int f5858w;

    /* renamed from: x */
    public int f5859x;

    /* renamed from: y */
    public DecelerateInterpolator f5860y;

    /* renamed from: z */
    public DecelerateInterpolator f5861z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            RefreshLoadLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RefreshLoadLayout refreshLoadLayout = RefreshLoadLayout.this;
            refreshLoadLayout.f5839d = false;
            refreshLoadLayout.e(4);
            RefreshLoadLayout.this.C = false;
        }
    }

    /* loaded from: classes.dex */
    public class b extends Animation {
        public b() {
            RefreshLoadLayout.this = r1;
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f10, Transformation transformation) {
            if (f10 == 0.0f) {
                return;
            }
            RefreshLoadLayout refreshLoadLayout = RefreshLoadLayout.this;
            refreshLoadLayout.f5837b.j(refreshLoadLayout.E, f10);
            RefreshLoadLayout refreshLoadLayout2 = RefreshLoadLayout.this;
            w6.d dVar = refreshLoadLayout2.f5855t;
            if (dVar != null) {
                ((w6.a) dVar).j(refreshLoadLayout2.E, f10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements Animation.AnimationListener {
        public c() {
            RefreshLoadLayout.this = r1;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            RefreshLoadLayout.this.f5837b.e();
            RefreshLoadLayout refreshLoadLayout = RefreshLoadLayout.this;
            w6.d dVar = refreshLoadLayout.f5855t;
            int i10 = refreshLoadLayout.E;
            boolean z10 = false;
            refreshLoadLayout.f5854s = false;
            if (refreshLoadLayout.f5839d) {
                e eVar = refreshLoadLayout.f5838c;
                if (eVar != null) {
                    if (i10 == 2) {
                        z10 = true;
                    }
                    HomePageFragment homePageFragment = (HomePageFragment) ((q0) eVar).f26134b;
                    h<Object>[] hVarArr = HomePageFragment.G0;
                    l.f(homePageFragment, "this$0");
                    if (z10) {
                        homePageFragment.i1().r(true);
                    }
                }
                refreshLoadLayout.f5837b.g();
                w6.d dVar2 = refreshLoadLayout.f5855t;
                if (dVar2 != null) {
                    ((oi.c) dVar2).g();
                    return;
                }
                return;
            }
            refreshLoadLayout.f();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            RefreshLoadLayout.this.f5837b.b();
            RefreshLoadLayout refreshLoadLayout = RefreshLoadLayout.this;
            w6.d dVar = refreshLoadLayout.f5855t;
            if (dVar != null) {
                w6.a aVar = (w6.a) dVar;
                aVar.f29754d = aVar.f29753c;
            }
            refreshLoadLayout.f5854s = true;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean a();
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    public RefreshLoadLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5839d = false;
        this.f5847l = new int[2];
        this.f5848m = new int[2];
        this.f5853r = -1;
        this.D = new a();
        this.E = 0;
        this.F = new b();
        this.H = new c();
        this.f5840e = ViewConfiguration.get(context).getScaledTouchSlop();
        setWillNotDraw(false);
        int i10 = (int) (getResources().getDisplayMetrics().density * 64.0f);
        this.f5842g = i10;
        this.f5841f = i10;
        this.f5845j = new d0();
        this.f5846k = new a0(this);
        setNestedScrollingEnabled(true);
        int integer = getResources().getInteger(17694721);
        this.f5859x = integer;
        this.f5858w = integer;
        this.f5857v = integer;
        this.f5856u = integer;
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(2.0f);
        this.B = decelerateInterpolator;
        this.A = decelerateInterpolator;
        this.f5861z = decelerateInterpolator;
        this.f5860y = decelerateInterpolator;
        w6.b bVar = new w6.b();
        this.f5837b = bVar;
        bVar.f29755a = this;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private int getSlingshotDistance() {
        w6.d dVar = this.f5855t;
        return (dVar == null || this.f5843h <= dVar.getContentHeight()) ? this.f5842g : (this.f5843h - this.f5855t.getContentHeight()) / 2;
    }

    public final boolean a() {
        View view = this.f5836a;
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        return view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.f5836a == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f5855t)) {
                    this.f5836a = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f10) {
        if (f10 > this.f5841f) {
            h(true, false);
            return;
        }
        this.f5839d = false;
        this.f5837b.d();
        w6.d dVar = this.f5855t;
        if (dVar != null) {
            dVar.getClass();
        }
        e(1);
    }

    @SuppressLint({"NewApi"})
    public final void d(float f10) {
        float f11 = f10 / this.f5841f;
        float min = Math.min(1.0f, Math.abs(f11));
        float abs = Math.abs(f10) - this.f5841f;
        float slingshotDistance = getSlingshotDistance();
        double max = Math.max(0.0f, Math.min(abs, slingshotDistance * 2.0f) / slingshotDistance) / 4.0f;
        int min2 = (int) Math.min((int) ((slingshotDistance * min) + (((float) (max - Math.pow(max, 2.0d))) * 2.0f * slingshotDistance * 2.0f)), f10);
        if (this.f5855t.getVisibility() != 0) {
            this.f5855t.setVisibility(0);
        }
        this.f5837b.h(min2);
        this.f5837b.f(f11);
        w6.d dVar = this.f5855t;
        if (dVar != null) {
            ((w6.a) dVar).h(min2);
            ((oi.c) this.f5855t).f(f11);
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f5846k.a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f5846k.b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f5846k.c(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f5846k.e(i10, i11, i12, i13, iArr);
    }

    public final void e(int i10) {
        int i11;
        DecelerateInterpolator decelerateInterpolator = null;
        this.F.setAnimationListener(null);
        this.F.reset();
        this.F.cancel();
        this.E = i10;
        b bVar = this.F;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        i11 = 0;
                    } else {
                        i11 = this.f5859x;
                    }
                } else {
                    i11 = this.f5858w;
                }
            } else {
                i11 = this.f5857v;
            }
        } else {
            i11 = this.f5856u;
        }
        bVar.setDuration(i11);
        b bVar2 = this.F;
        int i12 = this.E;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 == 4) {
                        decelerateInterpolator = this.B;
                    }
                } else {
                    decelerateInterpolator = this.A;
                }
            } else {
                decelerateInterpolator = this.f5861z;
            }
        } else {
            decelerateInterpolator = this.f5860y;
        }
        bVar2.setInterpolator(decelerateInterpolator);
        this.F.setAnimationListener(this.H);
        clearAnimation();
        if (i10 != 0 && this.f5855t.getVisibility() != 0) {
            this.f5855t.setVisibility(0);
        }
        startAnimation(this.F);
    }

    public final void f() {
        this.F.setAnimationListener(null);
        this.F.reset();
        this.F.cancel();
        clearAnimation();
        this.f5837b.reset();
        w6.d dVar = this.f5855t;
        if (dVar != null) {
            dVar.setVisibility(8);
            ((w6.a) this.f5855t).reset();
        }
    }

    public final void g(boolean z10) {
        super.setEnabled(z10);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        d0 d0Var = this.f5845j;
        return d0Var.f18110b | d0Var.f18109a;
    }

    public int getRefreshSlingshotDistance() {
        return this.f5842g;
    }

    public float getRefreshTriggerDistance() {
        return this.f5841f;
    }

    public w6.d getRefreshView() {
        return this.f5855t;
    }

    public View getTargetView() {
        b();
        return this.f5836a;
    }

    public final void h(boolean z10, boolean z11) {
        if (z10 && this.f5839d && this.C) {
            removeCallbacks(this.D);
            this.D.run();
        }
        if (this.f5839d == z10) {
            return;
        }
        this.f5839d = z10;
        e(z10 ? z11 ? 3 : 2 : 4);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f5846k.h(0);
    }

    public final void i(int i10, boolean z10) {
        if (this.f5839d) {
            this.f5837b.a(z10);
            w6.d dVar = this.f5855t;
            if (dVar != null) {
                ((oi.c) dVar).a(z10);
            }
            if (i10 == 0) {
                this.f5839d = false;
                e(4);
                return;
            }
            this.C = true;
            postDelayed(this.D, i10);
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f5846k.f18091d;
    }

    @SuppressLint({"NewApi"})
    public final void j(float f10) {
        float f11 = this.f5851p;
        int i10 = this.f5840e;
        if (f10 - f11 <= i10 || this.f5852q) {
            return;
        }
        this.f5850o = f11 + i10;
        this.f5852q = true;
        this.f5837b.k();
        w6.d dVar = this.f5855t;
        if (dVar != null) {
            ((oi.c) dVar).k();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b();
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 0;
        if (!isEnabled() || this.f5854s || a() || this.f5839d || this.f5849n) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == this.f5853r) {
                                if (actionIndex == 0) {
                                    i10 = 1;
                                }
                                this.f5853r = motionEvent.getPointerId(i10);
                            }
                        }
                    }
                } else {
                    int i11 = this.f5853r;
                    if (i11 == -1) {
                        Log.e("RefreshLoadLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i11);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    j(motionEvent.getY(findPointerIndex));
                }
            }
            this.f5852q = false;
            this.f5853r = -1;
        } else {
            this.f5837b.h(0);
            ((w6.a) this.f5855t).h(0);
            int pointerId = motionEvent.getPointerId(0);
            this.f5853r = pointerId;
            this.f5852q = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f5851p = motionEvent.getY(findPointerIndex2);
        }
        return this.f5852q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (getChildCount() == 0) {
            return;
        }
        this.f5837b.c();
        w6.d dVar = this.f5855t;
        if (dVar != null) {
            ((w6.a) dVar).c();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f5837b.i();
        w6.d dVar = this.f5855t;
        if (dVar != null) {
            dVar.i();
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
            float f10 = this.f5844i;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = i11 - ((int) f10);
                    this.f5844i = 0.0f;
                } else {
                    this.f5844i = f10 - f11;
                    iArr[1] = i11;
                }
                d(this.f5844i);
            }
        }
        int[] iArr2 = this.f5847l;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        dispatchNestedScroll(i10, i11, i12, i13, this.f5848m);
        int i14 = i13 + this.f5848m[1];
        if (i14 >= 0 || a()) {
            return;
        }
        float abs = this.f5844i + Math.abs(i14);
        this.f5844i = abs;
        d(abs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f5845j.a(i10, 0);
        startNestedScroll(i10 & 2);
        this.f5844i = 0.0f;
        this.f5849n = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.f5854s || this.f5839d || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f5845j.f18109a = 0;
        this.f5849n = false;
        float f10 = this.f5844i;
        if (f10 > 0.0f) {
            c(f10);
            this.f5844i = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 0;
        if (!isEnabled() || this.f5854s || a() || this.f5839d || this.f5849n) {
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
                            if (motionEvent.getPointerId(actionIndex) == this.f5853r) {
                                if (actionIndex == 0) {
                                    i10 = 1;
                                }
                                this.f5853r = motionEvent.getPointerId(i10);
                            }
                        }
                    } else {
                        int actionIndex2 = motionEvent.getActionIndex();
                        if (actionIndex2 < 0) {
                            Log.e("RefreshLoadLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                            return false;
                        }
                        this.f5853r = motionEvent.getPointerId(actionIndex2);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f5853r);
                    if (findPointerIndex < 0) {
                        Log.e("RefreshLoadLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    float y10 = motionEvent.getY(findPointerIndex);
                    j(y10);
                    if (this.f5852q) {
                        float f10 = (y10 - this.f5850o) * 0.5f;
                        if (f10 <= 0.0f) {
                            return false;
                        }
                        d(f10);
                    }
                }
            } else {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f5853r);
                if (findPointerIndex2 < 0) {
                    Log.e("RefreshLoadLayout", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f5852q) {
                    this.f5852q = false;
                    c((motionEvent.getY(findPointerIndex2) - this.f5850o) * 0.5f);
                }
                this.f5853r = -1;
                return false;
            }
        } else {
            this.f5853r = motionEvent.getPointerId(0);
            this.f5852q = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        View view = this.f5836a;
        if (view != null) {
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            if (!o0.i.p(view)) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void setDragLimitDistance(int i10) {
        this.f5843h = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (z10) {
            return;
        }
        f();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f5846k.i(z10);
    }

    public void setOnChildScrollUpCallback(d dVar) {
    }

    public void setOnRefreshListener(e eVar) {
        this.f5838c = eVar;
    }

    public void setRefreshSlingshotDistance(int i10) {
        this.f5842g = i10;
    }

    public void setRefreshTriggerDistance(float f10) {
        this.f5841f = f10;
    }

    public void setRefreshView(w6.d dVar) {
        if (this.f5855t != null) {
            f();
            removeView(this.f5855t);
        }
        this.f5855t = dVar;
        dVar.getClass();
        dVar.setVisibility(8);
        w6.d dVar2 = this.f5855t;
        ((w6.a) dVar2).f29751a = this;
        addView(dVar2);
    }

    public void setRefreshing(boolean z10) {
        h(z10, true);
    }

    public void setTargetViewDelegate(w6.c cVar) {
        f();
        this.f5837b = cVar;
        invalidate();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return this.f5846k.j(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f5846k.k(0);
    }
}
