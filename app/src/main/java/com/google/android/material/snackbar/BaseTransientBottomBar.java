package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b1.a;
import com.google.android.material.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.g;
import ha.h;
import java.util.List;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import z9.o;
import z9.r;

/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a */
    public final ViewGroup f6633a;

    /* renamed from: b */
    public final Context f6634b;

    /* renamed from: c */
    public final e f6635c;

    /* renamed from: d */
    public final h f6636d;

    /* renamed from: e */
    public int f6637e;

    /* renamed from: g */
    public int f6639g;

    /* renamed from: h */
    public int f6640h;

    /* renamed from: i */
    public int f6641i;

    /* renamed from: j */
    public int f6642j;

    /* renamed from: k */
    public boolean f6643k;

    /* renamed from: l */
    public final AccessibilityManager f6644l;

    /* renamed from: o */
    public static final int[] f6631o = {R.attr.snackbarStyle};

    /* renamed from: p */
    public static final String f6632p = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: n */
    public static final Handler f6630n = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: f */
    public final b f6638f = new b();

    /* renamed from: m */
    public c f6645m = new c();

    /* loaded from: classes.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: i */
        public final d f6646i = new d(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            d dVar = this.f6646i;
            dVar.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    g b10 = g.b();
                    c cVar = dVar.f6649a;
                    synchronized (b10.f6674a) {
                        if (b10.c(cVar)) {
                            g.c cVar2 = b10.f6676c;
                            if (cVar2.f6681c) {
                                cVar2.f6681c = false;
                                b10.d(cVar2);
                            }
                        }
                    }
                }
            } else if (coordinatorLayout.q(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                g b11 = g.b();
                c cVar3 = dVar.f6649a;
                synchronized (b11.f6674a) {
                    if (b11.c(cVar3)) {
                        g.c cVar4 = b11.f6676c;
                        if (!cVar4.f6681c) {
                            cVar4.f6681c = true;
                            b11.f6675b.removeCallbacksAndMessages(cVar4);
                        }
                    }
                }
            }
            return super.g(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean s(View view) {
            this.f6646i.getClass();
            return view instanceof e;
        }
    }

    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            boolean z10;
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
            int i10 = message.what;
            if (i10 != 0) {
                if (i10 != 1) {
                    return false;
                }
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                int i11 = message.arg1;
                AccessibilityManager accessibilityManager = baseTransientBottomBar.f6644l;
                if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && baseTransientBottomBar.f6635c.getVisibility() == 0) {
                    if (baseTransientBottomBar.f6635c.getAnimationMode() == 1) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        ofFloat.setInterpolator(h9.a.f16043a);
                        ofFloat.addUpdateListener(new com.google.android.material.snackbar.a(baseTransientBottomBar));
                        ofFloat.setDuration(75L);
                        ofFloat.addListener(new ha.a(baseTransientBottomBar, i11));
                        ofFloat.start();
                    } else {
                        ValueAnimator valueAnimator = new ValueAnimator();
                        int[] iArr = new int[2];
                        iArr[0] = 0;
                        int height = baseTransientBottomBar.f6635c.getHeight();
                        ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.f6635c.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        }
                        iArr[1] = height;
                        valueAnimator.setIntValues(iArr);
                        valueAnimator.setInterpolator(h9.a.f16044b);
                        valueAnimator.setDuration(250L);
                        valueAnimator.addListener(new ha.c(baseTransientBottomBar, i11));
                        valueAnimator.addUpdateListener(new com.google.android.material.snackbar.d(baseTransientBottomBar));
                        valueAnimator.start();
                    }
                } else {
                    baseTransientBottomBar.e();
                }
                return true;
            }
            BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
            if (baseTransientBottomBar2.f6635c.getParent() == null) {
                ViewGroup.LayoutParams layoutParams2 = baseTransientBottomBar2.f6635c.getLayoutParams();
                if (layoutParams2 instanceof CoordinatorLayout.f) {
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams2;
                    Behavior behavior = new Behavior();
                    d dVar = behavior.f6646i;
                    dVar.getClass();
                    dVar.f6649a = baseTransientBottomBar2.f6645m;
                    behavior.f6248b = new com.google.android.material.snackbar.e(baseTransientBottomBar2);
                    fVar.b(behavior);
                    fVar.f2165g = 80;
                }
                e eVar = baseTransientBottomBar2.f6635c;
                ViewGroup viewGroup = baseTransientBottomBar2.f6633a;
                eVar.f6660j = true;
                viewGroup.addView(eVar);
                eVar.f6660j = false;
                baseTransientBottomBar2.h();
                baseTransientBottomBar2.f6635c.setVisibility(4);
            }
            e eVar2 = baseTransientBottomBar2.f6635c;
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            if (o0.g.c(eVar2)) {
                baseTransientBottomBar2.g();
            } else {
                baseTransientBottomBar2.f6643k = true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            BaseTransientBottomBar.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f6635c != null && (context = baseTransientBottomBar.f6634b) != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
                int i10 = displayMetrics.heightPixels;
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                int[] iArr = new int[2];
                baseTransientBottomBar2.f6635c.getLocationOnScreen(iArr);
                int height = (i10 - (baseTransientBottomBar2.f6635c.getHeight() + iArr[1])) + ((int) BaseTransientBottomBar.this.f6635c.getTranslationY());
                BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
                if (height >= baseTransientBottomBar3.f6642j) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = baseTransientBottomBar3.f6635c.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.f6632p, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i11 = marginLayoutParams.bottomMargin;
                BaseTransientBottomBar baseTransientBottomBar4 = BaseTransientBottomBar.this;
                marginLayoutParams.bottomMargin = (baseTransientBottomBar4.f6642j - height) + i11;
                baseTransientBottomBar4.f6635c.requestLayout();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements g.b {
        public c() {
            BaseTransientBottomBar.this = r1;
        }

        @Override // com.google.android.material.snackbar.g.b
        public final void b() {
            Handler handler = BaseTransientBottomBar.f6630n;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.g.b
        public final void c(int i10) {
            Handler handler = BaseTransientBottomBar.f6630n;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, BaseTransientBottomBar.this));
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public c f6649a;

        public d(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.getClass();
            swipeDismissBehavior.f6252f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            swipeDismissBehavior.f6253g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            swipeDismissBehavior.f6250d = 0;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends FrameLayout {

        /* renamed from: k */
        public static final a f6650k = new a();

        /* renamed from: a */
        public BaseTransientBottomBar<?> f6651a;

        /* renamed from: b */
        public int f6652b;

        /* renamed from: c */
        public final float f6653c;

        /* renamed from: d */
        public final float f6654d;

        /* renamed from: e */
        public final int f6655e;

        /* renamed from: f */
        public final int f6656f;

        /* renamed from: g */
        public ColorStateList f6657g;

        /* renamed from: h */
        public PorterDuff.Mode f6658h;

        /* renamed from: i */
        public Rect f6659i;

        /* renamed from: j */
        public boolean f6660j;

        /* loaded from: classes.dex */
        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public e(Context context, AttributeSet attributeSet) {
            super(la.a.a(context, attributeSet, 0, 0), attributeSet);
            Drawable g10;
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.SnackbarLayout);
            int i10 = R.styleable.SnackbarLayout_elevation;
            if (obtainStyledAttributes.hasValue(i10)) {
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                o0.i.s(this, obtainStyledAttributes.getDimensionPixelSize(i10, 0));
            }
            this.f6652b = obtainStyledAttributes.getInt(R.styleable.SnackbarLayout_animationMode, 0);
            this.f6653c = obtainStyledAttributes.getFloat(R.styleable.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(da.d.a(context2, obtainStyledAttributes, R.styleable.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(r.d(obtainStyledAttributes.getInt(R.styleable.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f6654d = obtainStyledAttributes.getFloat(R.styleable.SnackbarLayout_actionTextColorAlpha, 1.0f);
            this.f6655e = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_android_maxWidth, -1);
            this.f6656f = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_maxActionInlineWidth, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f6650k);
            setFocusable(true);
            if (getBackground() == null) {
                float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(u9.a.d(getBackgroundOverlayColorAlpha(), u9.a.b(this, R.attr.colorSurface), u9.a.b(this, R.attr.colorOnSurface)));
                if (this.f6657g != null) {
                    g10 = b1.a.g(gradientDrawable);
                    a.b.h(g10, this.f6657g);
                } else {
                    g10 = b1.a.g(gradientDrawable);
                }
                WeakHashMap<View, i2> weakHashMap2 = o0.f18161a;
                o0.d.q(this, g10);
            }
        }

        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f6651a = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f6654d;
        }

        public int getAnimationMode() {
            return this.f6652b;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f6653c;
        }

        public int getMaxInlineActionWidth() {
            return this.f6656f;
        }

        public int getMaxWidth() {
            return this.f6655e;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f6651a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.d();
            }
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.h.c(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f6651a;
            if (baseTransientBottomBar != null && baseTransientBottomBar.c()) {
                BaseTransientBottomBar.f6630n.post(new ha.f(baseTransientBottomBar));
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f6651a;
            if (baseTransientBottomBar != null && baseTransientBottomBar.f6643k) {
                baseTransientBottomBar.g();
                baseTransientBottomBar.f6643k = false;
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f6655e > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f6655e;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        public void setAnimationMode(int i10) {
            this.f6652b = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f6657g != null) {
                drawable = b1.a.g(drawable.mutate());
                a.b.h(drawable, this.f6657g);
                a.b.i(drawable, this.f6658h);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f6657g = colorStateList;
            if (getBackground() != null) {
                Drawable g10 = b1.a.g(getBackground().mutate());
                a.b.h(g10, colorStateList);
                a.b.i(g10, this.f6658h);
                if (g10 != getBackground()) {
                    super.setBackgroundDrawable(g10);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f6658h = mode;
            if (getBackground() != null) {
                Drawable g10 = b1.a.g(getBackground().mutate());
                a.b.i(g10, mode);
                if (g10 != getBackground()) {
                    super.setBackgroundDrawable(g10);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.f6660j && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f6659i = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                BaseTransientBottomBar<?> baseTransientBottomBar = this.f6651a;
                if (baseTransientBottomBar != null) {
                    Handler handler = BaseTransientBottomBar.f6630n;
                    baseTransientBottomBar.h();
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f6650k);
            super.setOnClickListener(onClickListener);
        }
    }

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        boolean z10;
        int i10;
        if (snackbarContentLayout != null) {
            if (snackbarContentLayout2 != null) {
                this.f6633a = viewGroup;
                this.f6636d = snackbarContentLayout2;
                this.f6634b = context;
                o.c(context, o.f32160a, "Theme.AppCompat");
                LayoutInflater from = LayoutInflater.from(context);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f6631o);
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                obtainStyledAttributes.recycle();
                if (resourceId != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    i10 = R.layout.mtrl_layout_snackbar;
                } else {
                    i10 = R.layout.design_layout_snackbar;
                }
                e eVar = (e) from.inflate(i10, viewGroup, false);
                this.f6635c = eVar;
                eVar.setBaseTransientBottomBar(this);
                float actionTextColorAlpha = eVar.getActionTextColorAlpha();
                if (actionTextColorAlpha != 1.0f) {
                    snackbarContentLayout.f6665b.setTextColor(u9.a.d(actionTextColorAlpha, u9.a.b(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.f6665b.getCurrentTextColor()));
                }
                snackbarContentLayout.setMaxInlineActionWidth(eVar.getMaxInlineActionWidth());
                eVar.addView(snackbarContentLayout);
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                o0.g.f(eVar, 1);
                o0.d.s(eVar, 1);
                eVar.setFitsSystemWindows(true);
                o0.i.u(eVar, new ha.d(this));
                o0.p(eVar, new ha.e(this));
                this.f6644l = (AccessibilityManager) context.getSystemService("accessibility");
                return;
            }
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null content");
    }

    public void a() {
        b(3);
    }

    public final void b(int i10) {
        g.c cVar;
        boolean z10;
        g b10 = g.b();
        c cVar2 = this.f6645m;
        synchronized (b10.f6674a) {
            if (b10.c(cVar2)) {
                cVar = b10.f6676c;
            } else {
                g.c cVar3 = b10.f6677d;
                boolean z11 = false;
                if (cVar3 != null) {
                    if (cVar2 != null && cVar3.f6679a.get() == cVar2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        z11 = true;
                    }
                }
                if (z11) {
                    cVar = b10.f6677d;
                }
            }
            b10.a(cVar, i10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0027, code lost:
        if (r0 == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            r6 = this;
            com.google.android.material.snackbar.g r0 = com.google.android.material.snackbar.g.b()
            com.google.android.material.snackbar.BaseTransientBottomBar$c r1 = r6.f6645m
            java.lang.Object r2 = r0.f6674a
            monitor-enter(r2)
            boolean r3 = r0.c(r1)     // Catch: java.lang.Throwable -> L2e
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L29
            com.google.android.material.snackbar.g$c r0 = r0.f6677d     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L26
            if (r1 == 0) goto L21
            java.lang.ref.WeakReference<com.google.android.material.snackbar.g$b> r0 = r0.f6679a     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L2e
            if (r0 != r1) goto L21
            r0 = 1
            goto L22
        L21:
            r0 = 0
        L22:
            if (r0 == 0) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            if (r0 == 0) goto L2a
        L29:
            r4 = 1
        L2a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            return r4
        L2c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            throw r0
        L2e:
            r0 = move-exception
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.c():boolean");
    }

    public final void d() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f6635c.getRootWindowInsets()) == null) {
            return;
        }
        this.f6642j = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        h();
    }

    public final void e() {
        g b10 = g.b();
        c cVar = this.f6645m;
        synchronized (b10.f6674a) {
            try {
                if (b10.c(cVar)) {
                    b10.f6676c = null;
                    g.c cVar2 = b10.f6677d;
                    if (cVar2 != null && cVar2 != null) {
                        b10.f6676c = cVar2;
                        b10.f6677d = null;
                        g.b bVar = cVar2.f6679a.get();
                        if (bVar != null) {
                            bVar.b();
                        } else {
                            b10.f6676c = null;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ViewParent parent = this.f6635c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f6635c);
        }
    }

    public final void f() {
        g b10 = g.b();
        c cVar = this.f6645m;
        synchronized (b10.f6674a) {
            if (b10.c(cVar)) {
                b10.d(b10.f6676c);
            }
        }
    }

    public final void g() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f6644l;
        boolean z10 = true;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z10 = false;
        }
        if (z10) {
            this.f6635c.post(new f(this));
            return;
        }
        if (this.f6635c.getParent() != null) {
            this.f6635c.setVisibility(0);
        }
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x005b, code lost:
        if (r0 != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r5 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$e r0 = r5.f6635c
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L70
            com.google.android.material.snackbar.BaseTransientBottomBar$e r1 = r5.f6635c
            android.graphics.Rect r2 = r1.f6659i
            if (r2 != 0) goto L11
            goto L70
        L11:
            android.view.ViewParent r1 = r1.getParent()
            if (r1 != 0) goto L18
            return
        L18:
            int r1 = r5.f6639g
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            com.google.android.material.snackbar.BaseTransientBottomBar$e r2 = r5.f6635c
            android.graphics.Rect r3 = r2.f6659i
            int r4 = r3.bottom
            int r4 = r4 + r1
            r0.bottomMargin = r4
            int r1 = r3.left
            int r4 = r5.f6640h
            int r1 = r1 + r4
            r0.leftMargin = r1
            int r1 = r3.right
            int r4 = r5.f6641i
            int r1 = r1 + r4
            r0.rightMargin = r1
            int r1 = r3.top
            r0.topMargin = r1
            r2.requestLayout()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L6f
            int r0 = r5.f6642j
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L5e
            com.google.android.material.snackbar.BaseTransientBottomBar$e r0 = r5.f6635c
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r3 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.f
            if (r3 == 0) goto L5a
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r0.f2159a
            boolean r0 = r0 instanceof com.google.android.material.behavior.SwipeDismissBehavior
            if (r0 == 0) goto L5a
            r0 = 1
            goto L5b
        L5a:
            r0 = 0
        L5b:
            if (r0 == 0) goto L5e
            goto L5f
        L5e:
            r1 = 0
        L5f:
            if (r1 == 0) goto L6f
            com.google.android.material.snackbar.BaseTransientBottomBar$e r0 = r5.f6635c
            com.google.android.material.snackbar.BaseTransientBottomBar$b r1 = r5.f6638f
            r0.removeCallbacks(r1)
            com.google.android.material.snackbar.BaseTransientBottomBar$e r0 = r5.f6635c
            com.google.android.material.snackbar.BaseTransientBottomBar$b r1 = r5.f6638f
            r0.post(r1)
        L6f:
            return
        L70:
            java.lang.String r0 = com.google.android.material.snackbar.BaseTransientBottomBar.f6632p
            java.lang.String r1 = "Unable to update margins because layout params are not MarginLayoutParams"
            android.util.Log.w(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.h():void");
    }
}
