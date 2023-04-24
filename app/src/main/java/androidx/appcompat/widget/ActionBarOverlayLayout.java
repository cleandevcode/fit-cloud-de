package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.appcompat.R;
import f.j;
import java.util.WeakHashMap;
import k1.n2;
import k1.o0;
import no.nordicsemi.android.dfu.DfuBaseService;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements i1, k1.b0, k1.c0 {
    public static final int[] B = {R.attr.actionBarSize, 16842841};
    public final k1.d0 A;

    /* renamed from: a */
    public int f1046a;

    /* renamed from: b */
    public int f1047b;

    /* renamed from: c */
    public ContentFrameLayout f1048c;

    /* renamed from: d */
    public ActionBarContainer f1049d;

    /* renamed from: e */
    public j1 f1050e;

    /* renamed from: f */
    public Drawable f1051f;

    /* renamed from: g */
    public boolean f1052g;

    /* renamed from: h */
    public boolean f1053h;

    /* renamed from: i */
    public boolean f1054i;

    /* renamed from: j */
    public boolean f1055j;

    /* renamed from: k */
    public boolean f1056k;

    /* renamed from: l */
    public int f1057l;

    /* renamed from: m */
    public int f1058m;

    /* renamed from: n */
    public final Rect f1059n;

    /* renamed from: o */
    public final Rect f1060o;

    /* renamed from: p */
    public final Rect f1061p;

    /* renamed from: q */
    public k1.n2 f1062q;

    /* renamed from: r */
    public k1.n2 f1063r;

    /* renamed from: s */
    public k1.n2 f1064s;

    /* renamed from: t */
    public k1.n2 f1065t;

    /* renamed from: u */
    public d f1066u;

    /* renamed from: v */
    public OverScroller f1067v;

    /* renamed from: w */
    public ViewPropertyAnimator f1068w;

    /* renamed from: x */
    public final a f1069x;

    /* renamed from: y */
    public final b f1070y;

    /* renamed from: z */
    public final c f1071z;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
            ActionBarOverlayLayout.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1068w = null;
            actionBarOverlayLayout.f1056k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1068w = null;
            actionBarOverlayLayout.f1056k = false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            ActionBarOverlayLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1068w = actionBarOverlayLayout.f1049d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f1069x);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
            ActionBarOverlayLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1068w = actionBarOverlayLayout.f1049d.animate().translationY(-ActionBarOverlayLayout.this.f1049d.getHeight()).setListener(ActionBarOverlayLayout.this.f1069x);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e() {
            super(-1, -1);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1047b = 0;
        this.f1059n = new Rect();
        this.f1060o = new Rect();
        this.f1061p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        k1.n2 n2Var = k1.n2.f18129b;
        this.f1062q = n2Var;
        this.f1063r = n2Var;
        this.f1064s = n2Var;
        this.f1065t = n2Var;
        this.f1069x = new a();
        this.f1070y = new b();
        this.f1071z = new c();
        r(context);
        this.A = new k1.d0();
    }

    public static boolean p(FrameLayout frameLayout, Rect rect, boolean z10) {
        boolean z11;
        e eVar = (e) frameLayout.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i13;
            z11 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i15;
            z11 = true;
        }
        if (z10) {
            int i16 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i17;
                return true;
            }
        }
        return z11;
    }

    @Override // androidx.appcompat.widget.i1
    public final boolean a() {
        s();
        return this.f1050e.a();
    }

    @Override // androidx.appcompat.widget.i1
    public final void b() {
        s();
        this.f1050e.b();
    }

    @Override // androidx.appcompat.widget.i1
    public final void c(androidx.appcompat.view.menu.f fVar, j.b bVar) {
        s();
        this.f1050e.c(fVar, bVar);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.i1
    public final boolean d() {
        s();
        return this.f1050e.d();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        if (this.f1051f == null || this.f1052g) {
            return;
        }
        if (this.f1049d.getVisibility() == 0) {
            i10 = (int) (this.f1049d.getTranslationY() + this.f1049d.getBottom() + 0.5f);
        } else {
            i10 = 0;
        }
        this.f1051f.setBounds(0, i10, getWidth(), this.f1051f.getIntrinsicHeight() + i10);
        this.f1051f.draw(canvas);
    }

    @Override // k1.c0
    public final void e(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        k(view, i10, i11, i12, i13, i14);
    }

    @Override // androidx.appcompat.widget.i1
    public final boolean f() {
        s();
        return this.f1050e.f();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.i1
    public final boolean g() {
        s();
        return this.f1050e.g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1049d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        k1.d0 d0Var = this.A;
        return d0Var.f18110b | d0Var.f18109a;
    }

    public CharSequence getTitle() {
        s();
        return this.f1050e.getTitle();
    }

    @Override // androidx.appcompat.widget.i1
    public final boolean h() {
        s();
        return this.f1050e.h();
    }

    @Override // androidx.appcompat.widget.i1
    public final void i(int i10) {
        s();
        if (i10 == 2) {
            this.f1050e.s();
        } else if (i10 == 5) {
            this.f1050e.t();
        } else if (i10 != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.i1
    public final void j() {
        s();
        this.f1050e.i();
    }

    @Override // k1.b0
    public final void k(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // k1.b0
    public final boolean l(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
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

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        k1.n2 i10 = k1.n2.i(windowInsets, this);
        boolean p10 = p(this.f1049d, new Rect(i10.c(), i10.e(), i10.d(), i10.b()), false);
        Rect rect = this.f1059n;
        WeakHashMap<View, k1.i2> weakHashMap = k1.o0.f18161a;
        o0.i.b(this, i10, rect);
        Rect rect2 = this.f1059n;
        k1.n2 l10 = i10.f18130a.l(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.f1062q = l10;
        boolean z10 = true;
        if (!this.f1063r.equals(l10)) {
            this.f1063r = this.f1062q;
            p10 = true;
        }
        if (!this.f1060o.equals(this.f1059n)) {
            this.f1060o.set(this.f1059n);
        } else {
            z10 = p10;
        }
        if (z10) {
            requestLayout();
        }
        return i10.f18130a.a().f18130a.c().f18130a.b().h();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        WeakHashMap<View, k1.i2> weakHashMap = k1.o0.f18161a;
        o0.h.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int measuredHeight;
        n2.e bVar;
        k1.n2 b10;
        s();
        measureChildWithMargins(this.f1049d, i10, 0, i11, 0);
        e eVar = (e) this.f1049d.getLayoutParams();
        int max = Math.max(0, this.f1049d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f1049d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1049d.getMeasuredState());
        WeakHashMap<View, k1.i2> weakHashMap = k1.o0.f18161a;
        if ((o0.d.g(this) & DfuBaseService.ERROR_REMOTE_TYPE_LEGACY) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            measuredHeight = this.f1046a;
            if (this.f1054i && this.f1049d.getTabContainer() != null) {
                measuredHeight += this.f1046a;
            }
        } else {
            measuredHeight = this.f1049d.getVisibility() != 8 ? this.f1049d.getMeasuredHeight() : 0;
        }
        this.f1061p.set(this.f1059n);
        k1.n2 n2Var = this.f1062q;
        this.f1064s = n2Var;
        if (!this.f1053h && !z10) {
            Rect rect = this.f1061p;
            rect.top += measuredHeight;
            rect.bottom += 0;
            b10 = n2Var.f18130a.l(0, measuredHeight, 0, 0);
        } else {
            a1.c b11 = a1.c.b(n2Var.c(), this.f1064s.e() + measuredHeight, this.f1064s.d(), this.f1064s.b() + 0);
            k1.n2 n2Var2 = this.f1064s;
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 30) {
                bVar = new n2.d(n2Var2);
            } else if (i12 >= 29) {
                bVar = new n2.c(n2Var2);
            } else {
                bVar = new n2.b(n2Var2);
            }
            bVar.g(b11);
            b10 = bVar.b();
        }
        this.f1064s = b10;
        p(this.f1048c, this.f1061p, true);
        if (!this.f1065t.equals(this.f1064s)) {
            k1.n2 n2Var3 = this.f1064s;
            this.f1065t = n2Var3;
            k1.o0.b(this.f1048c, n2Var3);
        }
        measureChildWithMargins(this.f1048c, i10, 0, i11, 0);
        e eVar2 = (e) this.f1048c.getLayoutParams();
        int max3 = Math.max(max, this.f1048c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f1048c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1048c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        boolean z11 = false;
        if (!this.f1055j || !z10) {
            return false;
        }
        this.f1067v.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1067v.getFinalY() > this.f1049d.getHeight()) {
            z11 = true;
        }
        if (z11) {
            q();
            this.f1071z.run();
        } else {
            q();
            this.f1070y.run();
        }
        this.f1056k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f1057l + i11;
        this.f1057l = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        f.w wVar;
        k.h hVar;
        this.A.a(i10, 0);
        this.f1057l = getActionBarHideOffset();
        q();
        d dVar = this.f1066u;
        if (dVar != null && (hVar = (wVar = (f.w) dVar).f14013t) != null) {
            hVar.a();
            wVar.f14013t = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f1049d.getVisibility() != 0) {
            return false;
        }
        return this.f1055j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.f1055j && !this.f1056k) {
            if (this.f1057l <= this.f1049d.getHeight()) {
                q();
                postDelayed(this.f1070y, 600L);
                return;
            }
            q();
            postDelayed(this.f1071z, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        boolean z10;
        boolean z11;
        super.onWindowSystemUiVisibilityChanged(i10);
        s();
        int i11 = this.f1058m ^ i10;
        this.f1058m = i10;
        if ((i10 & 4) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & DfuBaseService.ERROR_REMOTE_TYPE_LEGACY) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        d dVar = this.f1066u;
        if (dVar != null) {
            ((f.w) dVar).f14009p = !z11;
            if (!z10 && z11) {
                f.w wVar = (f.w) dVar;
                if (!wVar.f14010q) {
                    wVar.f14010q = true;
                    wVar.g(true);
                }
            } else {
                f.w wVar2 = (f.w) dVar;
                if (wVar2.f14010q) {
                    wVar2.f14010q = false;
                    wVar2.g(true);
                }
            }
        }
        if ((i11 & DfuBaseService.ERROR_REMOTE_TYPE_LEGACY) != 0 && this.f1066u != null) {
            WeakHashMap<View, k1.i2> weakHashMap = k1.o0.f18161a;
            o0.h.c(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f1047b = i10;
        d dVar = this.f1066u;
        if (dVar != null) {
            ((f.w) dVar).f14008o = i10;
        }
    }

    public final void q() {
        removeCallbacks(this.f1070y);
        removeCallbacks(this.f1071z);
        ViewPropertyAnimator viewPropertyAnimator = this.f1068w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(B);
        this.f1046a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1051f = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1052g = context.getApplicationInfo().targetSdkVersion < 19;
        this.f1067v = new OverScroller(context);
    }

    public final void s() {
        j1 wrapper;
        if (this.f1048c == null) {
            this.f1048c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1049d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof j1) {
                wrapper = (j1) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder a10 = android.support.v4.media.d.a("Can't make a decor toolbar out of ");
                a10.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(a10.toString());
            }
            this.f1050e = wrapper;
        }
    }

    public void setActionBarHideOffset(int i10) {
        q();
        this.f1049d.setTranslationY(-Math.max(0, Math.min(i10, this.f1049d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f1066u = dVar;
        if (getWindowToken() != null) {
            ((f.w) this.f1066u).f14008o = this.f1047b;
            int i10 = this.f1058m;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                WeakHashMap<View, k1.i2> weakHashMap = k1.o0.f18161a;
                o0.h.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f1054i = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f1055j) {
            this.f1055j = z10;
            if (z10) {
                return;
            }
            q();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        s();
        this.f1050e.setIcon(i10);
    }

    public void setIcon(Drawable drawable) {
        s();
        this.f1050e.setIcon(drawable);
    }

    public void setLogo(int i10) {
        s();
        this.f1050e.n(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f1053h = z10;
        this.f1052g = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // androidx.appcompat.widget.i1
    public void setWindowCallback(Window.Callback callback) {
        s();
        this.f1050e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.i1
    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.f1050e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
