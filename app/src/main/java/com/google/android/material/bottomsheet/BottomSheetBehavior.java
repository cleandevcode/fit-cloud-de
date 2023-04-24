package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.u0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import ga.f;
import ga.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import k1.a;
import k1.i2;
import k1.o0;
import l1.j;
import r1.c;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: b0 */
    public static final int f6283b0 = R.style.Widget_Design_BottomSheet_Modal;
    public int A;
    public int B;
    public int C;
    public float D;
    public int E;
    public float F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public r1.c K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public WeakReference<V> R;
    public WeakReference<View> S;
    public final ArrayList<c> T;
    public VelocityTracker U;
    public int V;
    public int W;
    public boolean X;
    public HashMap Y;
    public int Z;

    /* renamed from: a */
    public int f6284a;

    /* renamed from: a0 */
    public final b f6285a0;

    /* renamed from: b */
    public boolean f6286b;

    /* renamed from: c */
    public float f6287c;

    /* renamed from: d */
    public int f6288d;

    /* renamed from: e */
    public boolean f6289e;

    /* renamed from: f */
    public int f6290f;

    /* renamed from: g */
    public int f6291g;

    /* renamed from: h */
    public f f6292h;

    /* renamed from: i */
    public ColorStateList f6293i;

    /* renamed from: j */
    public int f6294j;

    /* renamed from: k */
    public int f6295k;

    /* renamed from: l */
    public int f6296l;

    /* renamed from: m */
    public boolean f6297m;

    /* renamed from: n */
    public boolean f6298n;

    /* renamed from: o */
    public boolean f6299o;

    /* renamed from: p */
    public boolean f6300p;

    /* renamed from: q */
    public boolean f6301q;

    /* renamed from: r */
    public boolean f6302r;

    /* renamed from: s */
    public boolean f6303s;

    /* renamed from: t */
    public boolean f6304t;

    /* renamed from: u */
    public int f6305u;

    /* renamed from: v */
    public int f6306v;

    /* renamed from: w */
    public i f6307w;

    /* renamed from: x */
    public boolean f6308x;

    /* renamed from: y */
    public final BottomSheetBehavior<V>.e f6309y;

    /* renamed from: z */
    public ValueAnimator f6310z;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f6311a;

        /* renamed from: b */
        public final /* synthetic */ int f6312b;

        public a(View view, int i10) {
            BottomSheetBehavior.this = r1;
            this.f6311a = view;
            this.f6312b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            View view = this.f6311a;
            int i10 = this.f6312b;
            int i11 = BottomSheetBehavior.f6283b0;
            bottomSheetBehavior.F(view, i10, false);
        }
    }

    /* loaded from: classes.dex */
    public class b extends c.AbstractC0457c {
        public b() {
            BottomSheetBehavior.this = r1;
        }

        @Override // r1.c.AbstractC0457c
        public final int a(View view, int i10) {
            return view.getLeft();
        }

        @Override // r1.c.AbstractC0457c
        public final int b(View view, int i10) {
            int x10 = BottomSheetBehavior.this.x();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return b0.c.k(i10, x10, bottomSheetBehavior.G ? bottomSheetBehavior.Q : bottomSheetBehavior.E);
        }

        @Override // r1.c.AbstractC0457c
        public final int d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.G ? bottomSheetBehavior.Q : bottomSheetBehavior.E;
        }

        @Override // r1.c.AbstractC0457c
        public final void f(int i10) {
            if (i10 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.I) {
                    bottomSheetBehavior.D(1);
                }
            }
        }

        @Override // r1.c.AbstractC0457c
        public final void g(View view, int i10, int i11) {
            BottomSheetBehavior.this.u(i11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:102:0x00cd, code lost:
            if (java.lang.Math.abs(r6 - r7.B) < java.lang.Math.abs(r6 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.E)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x00dc, code lost:
            if (r6 < java.lang.Math.abs(r6 - r7.E)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:110:0x00ef, code lost:
            if (java.lang.Math.abs(r6 - r1) < java.lang.Math.abs(r6 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.E)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x001e, code lost:
            if (r6 > com.google.android.material.bottomsheet.BottomSheetBehavior.this.C) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x007d, code lost:
            if (java.lang.Math.abs(r5.getTop() - com.google.android.material.bottomsheet.BottomSheetBehavior.this.x()) < java.lang.Math.abs(r5.getTop() - com.google.android.material.bottomsheet.BottomSheetBehavior.this.C)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x00af, code lost:
            if (java.lang.Math.abs(r6 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.C) < java.lang.Math.abs(r6 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.E)) goto L38;
         */
        @Override // r1.c.AbstractC0457c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void h(android.view.View r5, float r6, float r7) {
            /*
                Method dump skipped, instructions count: 258
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.b.h(android.view.View, float, float):void");
        }

        @Override // r1.c.AbstractC0457c
        public final boolean i(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.J;
            if (i11 == 1 || bottomSheetBehavior.X) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.V == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.S;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.R;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract void a(View view, float f10);

        public abstract void b(View view, int i10);
    }

    /* loaded from: classes.dex */
    public static class d extends q1.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c */
        public final int f6315c;

        /* renamed from: d */
        public int f6316d;

        /* renamed from: e */
        public boolean f6317e;

        /* renamed from: f */
        public boolean f6318f;

        /* renamed from: g */
        public boolean f6319g;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new d[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6315c = parcel.readInt();
            this.f6316d = parcel.readInt();
            this.f6317e = parcel.readInt() == 1;
            this.f6318f = parcel.readInt() == 1;
            this.f6319g = parcel.readInt() == 1;
        }

        public d(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
            super(absSavedState);
            this.f6315c = bottomSheetBehavior.J;
            this.f6316d = bottomSheetBehavior.f6288d;
            this.f6317e = bottomSheetBehavior.f6286b;
            this.f6318f = bottomSheetBehavior.G;
            this.f6319g = bottomSheetBehavior.H;
        }

        @Override // q1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f24504a, i10);
            parcel.writeInt(this.f6315c);
            parcel.writeInt(this.f6316d);
            parcel.writeInt(this.f6317e ? 1 : 0);
            parcel.writeInt(this.f6318f ? 1 : 0);
            parcel.writeInt(this.f6319g ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public class e {

        /* renamed from: a */
        public int f6320a;

        /* renamed from: b */
        public boolean f6321b;

        /* renamed from: c */
        public final a f6322c = new a();

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
                e.this = r1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                eVar.f6321b = false;
                r1.c cVar = BottomSheetBehavior.this.K;
                if (cVar != null && cVar.g()) {
                    e eVar2 = e.this;
                    eVar2.a(eVar2.f6320a);
                    return;
                }
                e eVar3 = e.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.J == 2) {
                    bottomSheetBehavior.D(eVar3.f6320a);
                }
            }
        }

        public e() {
            BottomSheetBehavior.this = r1;
        }

        public final void a(int i10) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.R;
            if (weakReference != null && weakReference.get() != null) {
                this.f6320a = i10;
                if (!this.f6321b) {
                    a aVar = this.f6322c;
                    WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                    o0.d.m(BottomSheetBehavior.this.R.get(), aVar);
                    this.f6321b = true;
                }
            }
        }
    }

    public BottomSheetBehavior() {
        this.f6284a = 0;
        this.f6286b = true;
        this.f6294j = -1;
        this.f6295k = -1;
        this.f6309y = new e();
        this.D = 0.5f;
        this.F = -1.0f;
        this.I = true;
        this.J = 4;
        this.T = new ArrayList<>();
        this.Z = -1;
        this.f6285a0 = new b();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelOffset;
        int i10;
        int i11;
        this.f6284a = 0;
        this.f6286b = true;
        this.f6294j = -1;
        this.f6295k = -1;
        this.f6309y = new e();
        this.D = 0.5f;
        this.F = -1.0f;
        this.I = true;
        this.J = 4;
        this.T = new ArrayList<>();
        this.Z = -1;
        this.f6285a0 = new b();
        this.f6291g = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        int i12 = R.styleable.BottomSheetBehavior_Layout_backgroundTint;
        if (obtainStyledAttributes.hasValue(i12)) {
            this.f6293i = da.d.a(context, obtainStyledAttributes, i12);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.BottomSheetBehavior_Layout_shapeAppearance)) {
            int i13 = R.attr.bottomSheetStyle;
            int i14 = f6283b0;
            ga.a aVar = new ga.a(0);
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.MaterialShape, i13, i14);
            int resourceId = obtainStyledAttributes2.getResourceId(R.styleable.MaterialShape_shapeAppearance, 0);
            int resourceId2 = obtainStyledAttributes2.getResourceId(R.styleable.MaterialShape_shapeAppearanceOverlay, 0);
            obtainStyledAttributes2.recycle();
            this.f6307w = new i(i.a(context, resourceId, resourceId2, aVar));
        }
        if (this.f6307w != null) {
            f fVar = new f(this.f6307w);
            this.f6292h = fVar;
            fVar.i(context);
            ColorStateList colorStateList = this.f6293i;
            if (colorStateList != null) {
                this.f6292h.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f6292h.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f6310z = ofFloat;
        ofFloat.setDuration(500L);
        this.f6310z.addUpdateListener(new n9.a(this));
        this.F = obtainStyledAttributes.getDimension(R.styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i15 = R.styleable.BottomSheetBehavior_Layout_android_maxWidth;
        if (obtainStyledAttributes.hasValue(i15)) {
            this.f6294j = obtainStyledAttributes.getDimensionPixelSize(i15, -1);
        }
        int i16 = R.styleable.BottomSheetBehavior_Layout_android_maxHeight;
        if (obtainStyledAttributes.hasValue(i16)) {
            this.f6295k = obtainStyledAttributes.getDimensionPixelSize(i16, -1);
        }
        int i17 = R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i17);
        if (peekValue != null && (i11 = peekValue.data) == -1) {
            B(i11);
        } else {
            B(obtainStyledAttributes.getDimensionPixelSize(i17, -1));
        }
        boolean z10 = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false);
        if (this.G != z10) {
            this.G = z10;
            if (!z10 && this.J == 5) {
                C(4);
            }
            G();
        }
        this.f6297m = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        boolean z11 = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true);
        if (this.f6286b != z11) {
            this.f6286b = z11;
            if (this.R != null) {
                s();
            }
            if (this.f6286b && this.J == 6) {
                i10 = 3;
            } else {
                i10 = this.J;
            }
            D(i10);
            G();
        }
        this.H = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.I = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.f6284a = obtainStyledAttributes.getInt(R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        float f10 = obtainStyledAttributes.getFloat(R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f);
        if (f10 > 0.0f && f10 < 1.0f) {
            this.D = f10;
            if (this.R != null) {
                this.C = (int) ((1.0f - f10) * this.Q);
            }
            int i18 = R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset;
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(i18);
            if (peekValue2 != null && peekValue2.type == 16) {
                dimensionPixelOffset = peekValue2.data;
            } else {
                dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(i18, 0);
            }
            A(dimensionPixelOffset);
            this.f6298n = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
            this.f6299o = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
            this.f6300p = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
            this.f6301q = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
            this.f6302r = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
            this.f6303s = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
            this.f6304t = obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
            obtainStyledAttributes.recycle();
            this.f6287c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    public static View v(View view) {
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        if (o0.i.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View v10 = v(viewGroup.getChildAt(i10));
                if (v10 != null) {
                    return v10;
                }
            }
            return null;
        }
        return null;
    }

    public static int w(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i12 = Math.min(size, i12);
            }
            return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
    }

    public final void A(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.A = i10;
    }

    public final void B(int i10) {
        boolean z10 = false;
        if (i10 == -1) {
            if (!this.f6289e) {
                this.f6289e = true;
                z10 = true;
            }
        } else if (this.f6289e || this.f6288d != i10) {
            this.f6289e = false;
            this.f6288d = Math.max(0, i10);
            z10 = true;
        }
        if (z10) {
            J();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0062, code lost:
        if (k1.o0.g.b(r4) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(int r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 == r0) goto L74
            r1 = 2
            if (r4 != r1) goto L8
            goto L74
        L8:
            boolean r1 = r3.G
            if (r1 != 0) goto L26
            r1 = 5
            if (r4 != r1) goto L26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot set state: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "BottomSheetBehavior"
            android.util.Log.w(r0, r4)
            return
        L26:
            r1 = 6
            if (r4 != r1) goto L37
            boolean r1 = r3.f6286b
            if (r1 == 0) goto L37
            int r1 = r3.y(r4)
            int r2 = r3.B
            if (r1 > r2) goto L37
            r1 = 3
            goto L38
        L37:
            r1 = r4
        L38:
            java.lang.ref.WeakReference<V extends android.view.View> r2 = r3.R
            if (r2 == 0) goto L70
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L43
            goto L70
        L43:
            java.lang.ref.WeakReference<V extends android.view.View> r4 = r3.R
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            com.google.android.material.bottomsheet.BottomSheetBehavior$a r2 = new com.google.android.material.bottomsheet.BottomSheetBehavior$a
            r2.<init>(r4, r1)
            android.view.ViewParent r1 = r4.getParent()
            if (r1 == 0) goto L65
            boolean r1 = r1.isLayoutRequested()
            if (r1 == 0) goto L65
            java.util.WeakHashMap<android.view.View, k1.i2> r1 = k1.o0.f18161a
            boolean r1 = k1.o0.g.b(r4)
            if (r1 == 0) goto L65
            goto L66
        L65:
            r0 = 0
        L66:
            if (r0 == 0) goto L6c
            r4.post(r2)
            goto L73
        L6c:
            r2.run()
            goto L73
        L70:
            r3.D(r4)
        L73:
            return
        L74:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "STATE_"
            java.lang.StringBuilder r2 = android.support.v4.media.d.a(r2)
            if (r4 != r0) goto L81
            java.lang.String r4 = "DRAGGING"
            goto L83
        L81:
            java.lang.String r4 = "SETTLING"
        L83:
            java.lang.String r0 = " should not be set externally."
            java.lang.String r4 = androidx.activity.e.b(r2, r4, r0)
            r1.<init>(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(int):void");
    }

    public final void D(int i10) {
        V v10;
        if (this.J == i10) {
            return;
        }
        this.J = i10;
        WeakReference<V> weakReference = this.R;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            I(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            I(false);
        }
        H(i10);
        for (int i11 = 0; i11 < this.T.size(); i11++) {
            this.T.get(i11).b(v10, i10);
        }
        G();
    }

    public final boolean E(View view, float f10) {
        if (this.H) {
            return true;
        }
        if (view.getTop() < this.E) {
            return false;
        }
        return Math.abs(((f10 * 0.1f) + ((float) view.getTop())) - ((float) this.E)) / ((float) t()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0013, code lost:
        if (r1.q(r4.getLeft(), r0) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0030, code lost:
        if (r4 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0032, code lost:
        r2 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(android.view.View r4, int r5, boolean r6) {
        /*
            r3 = this;
            int r0 = r3.y(r5)
            r1.c r1 = r3.K
            r2 = 0
            if (r1 == 0) goto L33
            if (r6 == 0) goto L16
            int r4 = r4.getLeft()
            boolean r4 = r1.q(r4, r0)
            if (r4 == 0) goto L33
            goto L32
        L16:
            int r6 = r4.getLeft()
            r1.f25183r = r4
            r4 = -1
            r1.f25168c = r4
            boolean r4 = r1.i(r6, r0, r2, r2)
            if (r4 != 0) goto L30
            int r6 = r1.f25166a
            if (r6 != 0) goto L30
            android.view.View r6 = r1.f25183r
            if (r6 == 0) goto L30
            r6 = 0
            r1.f25183r = r6
        L30:
            if (r4 == 0) goto L33
        L32:
            r2 = 1
        L33:
            if (r2 == 0) goto L42
            r4 = 2
            r3.D(r4)
            r3.H(r5)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$e r4 = r3.f6309y
            r4.a(r5)
            goto L45
        L42:
            r3.D(r5)
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.F(android.view.View, int, boolean):void");
    }

    public final void G() {
        V v10;
        j.a aVar;
        int i10;
        boolean z10;
        k1.a aVar2;
        WeakReference<V> weakReference = this.R;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        o0.m(v10, 524288);
        o0.h(v10, 0);
        o0.m(v10, 262144);
        o0.h(v10, 0);
        o0.m(v10, 1048576);
        o0.h(v10, 0);
        int i11 = this.Z;
        if (i11 != -1) {
            o0.m(v10, i11);
            o0.h(v10, 0);
        }
        int i12 = 6;
        if (!this.f6286b && this.J != 6) {
            String string = v10.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            n9.c cVar = new n9.c(this, 6);
            ArrayList e10 = o0.e(v10);
            int i13 = 0;
            while (true) {
                if (i13 < e10.size()) {
                    if (TextUtils.equals(string, ((j.a) e10.get(i13)).b())) {
                        i10 = ((j.a) e10.get(i13)).a();
                        break;
                    }
                    i13++;
                } else {
                    int i14 = -1;
                    int i15 = 0;
                    while (true) {
                        int[] iArr = o0.f18165e;
                        if (i15 >= iArr.length || i14 != -1) {
                            break;
                        }
                        int i16 = iArr[i15];
                        boolean z11 = true;
                        for (int i17 = 0; i17 < e10.size(); i17++) {
                            if (((j.a) e10.get(i17)).a() != i16) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            z11 &= z10;
                        }
                        if (z11) {
                            i14 = i16;
                        }
                        i15++;
                    }
                    i10 = i14;
                }
            }
            if (i10 != -1) {
                j.a aVar3 = new j.a(null, i10, string, cVar, null);
                View.AccessibilityDelegate d10 = o0.d(v10);
                if (d10 == null) {
                    aVar2 = null;
                } else if (d10 instanceof a.C0313a) {
                    aVar2 = ((a.C0313a) d10).f18087a;
                } else {
                    aVar2 = new k1.a(d10);
                }
                if (aVar2 == null) {
                    aVar2 = new k1.a();
                }
                o0.p(v10, aVar2);
                o0.m(v10, aVar3.a());
                o0.e(v10).add(aVar3);
                o0.h(v10, 0);
            }
            this.Z = i10;
        }
        if (this.G && this.J != 5) {
            z(v10, j.a.f18678j, 5);
        }
        int i18 = this.J;
        if (i18 != 3) {
            if (i18 != 4) {
                if (i18 == 6) {
                    z(v10, j.a.f18677i, 4);
                    z(v10, j.a.f18676h, 3);
                    return;
                }
                return;
            }
            if (this.f6286b) {
                i12 = 3;
            }
            aVar = j.a.f18676h;
        } else {
            if (this.f6286b) {
                i12 = 4;
            }
            aVar = j.a.f18677i;
        }
        z(v10, aVar, i12);
    }

    public final void H(int i10) {
        ValueAnimator valueAnimator;
        if (i10 == 2) {
            return;
        }
        boolean z10 = i10 == 3;
        if (this.f6308x != z10) {
            this.f6308x = z10;
            if (this.f6292h == null || (valueAnimator = this.f6310z) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f6310z.reverse();
                return;
            }
            float f10 = z10 ? 0.0f : 1.0f;
            this.f6310z.setFloatValues(1.0f - f10, f10);
            this.f6310z.start();
        }
    }

    public final void I(boolean z10) {
        WeakReference<V> weakReference = this.R;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.Y != null) {
                    return;
                }
                this.Y = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.R.get() && z10) {
                    this.Y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z10) {
                return;
            }
            this.Y = null;
        }
    }

    public final void J() {
        V v10;
        if (this.R != null) {
            s();
            if (this.J != 4 || (v10 = this.R.get()) == null) {
                return;
            }
            v10.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(CoordinatorLayout.f fVar) {
        this.R = null;
        this.K = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void f() {
        this.R = null;
        this.K = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10;
        View view;
        r1.c cVar;
        if (v10.isShown() && this.I) {
            int actionMasked = motionEvent.getActionMasked();
            View view2 = null;
            if (actionMasked == 0) {
                this.V = -1;
                VelocityTracker velocityTracker = this.U;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.U = null;
                }
            }
            if (this.U == null) {
                this.U = VelocityTracker.obtain();
            }
            this.U.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.X = false;
                    this.V = -1;
                    if (this.L) {
                        this.L = false;
                        return false;
                    }
                }
            } else {
                int x10 = (int) motionEvent.getX();
                this.W = (int) motionEvent.getY();
                if (this.J != 2) {
                    WeakReference<View> weakReference = this.S;
                    if (weakReference != null) {
                        view = weakReference.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.q(view, x10, this.W)) {
                        this.V = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.X = true;
                    }
                }
                if (this.V == -1 && !coordinatorLayout.q(v10, x10, this.W)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.L = z10;
            }
            if (!this.L && (cVar = this.K) != null && cVar.r(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.S;
            if (weakReference2 != null) {
                view2 = weakReference2.get();
            }
            if (actionMasked != 2 || view2 == null || this.L || this.J == 1 || coordinatorLayout.q(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.K == null || Math.abs(this.W - motionEvent.getY()) <= this.K.f25167b) {
                return false;
            }
            return true;
        }
        this.L = true;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x0137 A[LOOP:0: B:167:0x012f->B:169:0x0137, LOOP_END] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r8, V r9, int r10) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.h(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f6294j, marginLayoutParams.width), w(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, this.f6295k, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean j(View view) {
        WeakReference<View> weakReference = this.S;
        return (weakReference == null || view != weakReference.get() || this.J == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void k(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        int i13;
        if (i12 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.S;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v10.getTop();
        int i14 = top - i11;
        if (i11 > 0) {
            if (i14 < x()) {
                int x10 = top - x();
                iArr[1] = x10;
                o0.j(v10, -x10);
                i13 = 3;
                D(i13);
            } else if (!this.I) {
                return;
            } else {
                iArr[1] = i11;
                o0.j(v10, -i11);
                D(1);
            }
        } else if (i11 < 0 && !view.canScrollVertically(-1)) {
            int i15 = this.E;
            if (i14 > i15 && !this.G) {
                int i16 = top - i15;
                iArr[1] = i16;
                o0.j(v10, -i16);
                i13 = 4;
                D(i13);
            } else if (!this.I) {
                return;
            } else {
                iArr[1] = i11;
                o0.j(v10, -i11);
                D(1);
            }
        }
        u(v10.getTop());
        this.M = i11;
        this.N = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void n(View view, Parcelable parcelable) {
        d dVar = (d) parcelable;
        int i10 = this.f6284a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f6288d = dVar.f6316d;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f6286b = dVar.f6317e;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.G = dVar.f6318f;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.H = dVar.f6319g;
            }
        }
        int i11 = dVar.f6315c;
        if (i11 != 1 && i11 != 2) {
            this.J = i11;
        } else {
            this.J = 4;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable o(View view) {
        return new d(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean p(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        this.M = 0;
        this.N = false;
        return (i10 & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x008e, code lost:
        if (java.lang.Math.abs(r2 - r4) < java.lang.Math.abs(r2 - r1.E)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00a9, code lost:
        if (java.lang.Math.abs(r2 - r1.C) < java.lang.Math.abs(r2 - r1.E)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x002f, code lost:
        if (r3.getTop() <= r1.C) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x006f, code lost:
        if (java.lang.Math.abs(r2 - r1.B) < java.lang.Math.abs(r2 - r1.E)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x007e, code lost:
        if (r2 < java.lang.Math.abs(r2 - r1.E)) goto L19;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.View r4, int r5) {
        /*
            r1 = this;
            int r2 = r3.getTop()
            int r5 = r1.x()
            r0 = 3
            if (r2 != r5) goto Lf
            r1.D(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r2 = r1.S
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r2.get()
            if (r4 != r2) goto Lb4
            boolean r2 = r1.N
            if (r2 != 0) goto L1f
            goto Lb4
        L1f:
            int r2 = r1.M
            if (r2 <= 0) goto L33
            boolean r2 = r1.f6286b
            if (r2 == 0) goto L29
            goto Lae
        L29:
            int r2 = r3.getTop()
            int r4 = r1.C
            if (r2 <= r4) goto Lae
            goto Lab
        L33:
            boolean r2 = r1.G
            if (r2 == 0) goto L54
            android.view.VelocityTracker r2 = r1.U
            if (r2 != 0) goto L3d
            r2 = 0
            goto L4c
        L3d:
            r4 = 1000(0x3e8, float:1.401E-42)
            float r5 = r1.f6287c
            r2.computeCurrentVelocity(r4, r5)
            android.view.VelocityTracker r2 = r1.U
            int r4 = r1.V
            float r2 = r2.getYVelocity(r4)
        L4c:
            boolean r2 = r1.E(r3, r2)
            if (r2 == 0) goto L54
            r0 = 5
            goto Lae
        L54:
            int r2 = r1.M
            if (r2 != 0) goto L91
            int r2 = r3.getTop()
            boolean r4 = r1.f6286b
            if (r4 == 0) goto L72
            int r4 = r1.B
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.E
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
            goto Lae
        L72:
            int r4 = r1.C
            if (r2 >= r4) goto L81
            int r4 = r1.E
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            if (r2 >= r4) goto Lab
            goto Lae
        L81:
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.E
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
            goto Lab
        L91:
            boolean r2 = r1.f6286b
            if (r2 == 0) goto L96
            goto Lad
        L96:
            int r2 = r3.getTop()
            int r4 = r1.C
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.E
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
        Lab:
            r0 = 6
            goto Lae
        Lad:
            r0 = 4
        Lae:
            r2 = 0
            r1.F(r3, r0, r2)
            r1.N = r2
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = false;
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.J;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        r1.c cVar = this.K;
        if (cVar != null && (this.I || i10 == 1)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            cVar.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.V = -1;
            VelocityTracker velocityTracker = this.U;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.U = null;
            }
        }
        if (this.U == null) {
            this.U = VelocityTracker.obtain();
        }
        this.U.addMovement(motionEvent);
        if (this.K != null && (this.I || this.J == 1)) {
            z11 = true;
        }
        if (z11 && actionMasked == 2 && !this.L) {
            float abs = Math.abs(this.W - motionEvent.getY());
            r1.c cVar2 = this.K;
            if (abs > cVar2.f25167b) {
                cVar2.b(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.L;
    }

    public final void s() {
        int t10 = t();
        if (this.f6286b) {
            this.E = Math.max(this.Q - t10, this.B);
        } else {
            this.E = this.Q - t10;
        }
    }

    public final int t() {
        int i10;
        return this.f6289e ? Math.min(Math.max(this.f6290f, this.Q - ((this.P * 9) / 16)), this.O) + this.f6305u : (this.f6297m || this.f6298n || (i10 = this.f6296l) <= 0) ? this.f6288d + this.f6305u : Math.max(this.f6288d, i10 + this.f6291g);
    }

    public final void u(int i10) {
        float f10;
        float f11;
        V v10 = this.R.get();
        if (v10 == null || this.T.isEmpty()) {
            return;
        }
        int i11 = this.E;
        if (i10 > i11 || i11 == x()) {
            int i12 = this.E;
            f10 = i12 - i10;
            f11 = this.Q - i12;
        } else {
            int i13 = this.E;
            f10 = i13 - i10;
            f11 = i13 - x();
        }
        float f12 = f10 / f11;
        for (int i14 = 0; i14 < this.T.size(); i14++) {
            this.T.get(i14).a(v10, f12);
        }
    }

    public final int x() {
        if (this.f6286b) {
            return this.B;
        }
        return Math.max(this.A, this.f6301q ? 0 : this.f6306v);
    }

    public final int y(int i10) {
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 == 6) {
                        return this.C;
                    }
                    throw new IllegalArgumentException(u0.a("Invalid state to get top offset: ", i10));
                }
                return this.Q;
            }
            return this.E;
        }
        return x();
    }

    public final void z(V v10, j.a aVar, int i10) {
        o0.n(v10, aVar, new n9.c(this, i10));
    }
}
