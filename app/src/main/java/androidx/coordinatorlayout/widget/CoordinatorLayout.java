package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import k1.b0;
import k1.c0;
import k1.d0;
import k1.e0;
import k1.i2;
import k1.n2;
import k1.o0;
import y0.a;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements b0, c0 {

    /* renamed from: t */
    public static final String f2133t;

    /* renamed from: u */
    public static final Class<?>[] f2134u;

    /* renamed from: v */
    public static final ThreadLocal<Map<String, Constructor<c>>> f2135v;

    /* renamed from: w */
    public static final i f2136w;

    /* renamed from: x */
    public static final j1.f f2137x;

    /* renamed from: a */
    public final ArrayList f2138a;

    /* renamed from: b */
    public final w0.a<View> f2139b;

    /* renamed from: c */
    public final ArrayList f2140c;

    /* renamed from: d */
    public final ArrayList f2141d;

    /* renamed from: e */
    public final int[] f2142e;

    /* renamed from: f */
    public final int[] f2143f;

    /* renamed from: g */
    public boolean f2144g;

    /* renamed from: h */
    public boolean f2145h;

    /* renamed from: i */
    public int[] f2146i;

    /* renamed from: j */
    public View f2147j;

    /* renamed from: k */
    public View f2148k;

    /* renamed from: l */
    public g f2149l;

    /* renamed from: m */
    public boolean f2150m;

    /* renamed from: n */
    public n2 f2151n;

    /* renamed from: o */
    public boolean f2152o;

    /* renamed from: p */
    public Drawable f2153p;

    /* renamed from: q */
    public ViewGroup.OnHierarchyChangeListener f2154q;

    /* renamed from: r */
    public a f2155r;

    /* renamed from: s */
    public final d0 f2156s;

    /* loaded from: classes.dex */
    public class a implements e0 {
        public a() {
            CoordinatorLayout.this = r1;
        }

        @Override // k1.e0
        public final n2 a(View view, n2 n2Var) {
            boolean z10;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!j1.b.a(coordinatorLayout.f2151n, n2Var)) {
                coordinatorLayout.f2151n = n2Var;
                boolean z11 = true;
                if (n2Var.e() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                coordinatorLayout.f2152o = z10;
                coordinatorLayout.setWillNotDraw((z10 || coordinatorLayout.getBackground() != null) ? false : false);
                if (!n2Var.f18130a.m()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = coordinatorLayout.getChildAt(i10);
                        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                        if (o0.d.b(childAt) && ((f) childAt.getLayoutParams()).f2159a != null && n2Var.f18130a.m()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return n2Var;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        c getBehavior();
    }

    /* loaded from: classes.dex */
    public static abstract class c<V extends View> {
        public c() {
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public boolean a(View view, Rect rect) {
            return false;
        }

        public boolean b(View view, View view2) {
            return false;
        }

        public void c(f fVar) {
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public void e(CoordinatorLayout coordinatorLayout, View view) {
        }

        public void f() {
        }

        public boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
            return false;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            return false;
        }

        public boolean j(View view) {
            return false;
        }

        public void k(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        }

        public void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
            iArr[0] = iArr[0] + i11;
            iArr[1] = iArr[1] + i12;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v10, Rect rect, boolean z10) {
            return false;
        }

        public void n(View view, Parcelable parcelable) {
        }

        public Parcelable o(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
            return false;
        }

        public void q(CoordinatorLayout coordinatorLayout, V v10, View view, int i10) {
        }

        public boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface d {
        Class<? extends c> value();
    }

    /* loaded from: classes.dex */
    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
            CoordinatorLayout.this = r1;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2154q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.r(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2154q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public c f2159a;

        /* renamed from: b */
        public boolean f2160b;

        /* renamed from: c */
        public int f2161c;

        /* renamed from: d */
        public int f2162d;

        /* renamed from: e */
        public int f2163e;

        /* renamed from: f */
        public int f2164f;

        /* renamed from: g */
        public int f2165g;

        /* renamed from: h */
        public int f2166h;

        /* renamed from: i */
        public int f2167i;

        /* renamed from: j */
        public int f2168j;

        /* renamed from: k */
        public View f2169k;

        /* renamed from: l */
        public View f2170l;

        /* renamed from: m */
        public boolean f2171m;

        /* renamed from: n */
        public boolean f2172n;

        /* renamed from: o */
        public boolean f2173o;

        /* renamed from: p */
        public boolean f2174p;

        /* renamed from: q */
        public final Rect f2175q;

        public f() {
            super(-2, -2);
            this.f2160b = false;
            this.f2161c = 0;
            this.f2162d = 0;
            this.f2163e = -1;
            this.f2164f = -1;
            this.f2165g = 0;
            this.f2166h = 0;
            this.f2175q = new Rect();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            c newInstance;
            this.f2160b = false;
            this.f2161c = 0;
            this.f2162d = 0;
            this.f2163e = -1;
            this.f2164f = -1;
            this.f2165g = 0;
            this.f2166h = 0;
            this.f2175q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CoordinatorLayout_Layout);
            this.f2161c = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f2164f = obtainStyledAttributes.getResourceId(R.styleable.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f2162d = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f2163e = obtainStyledAttributes.getInteger(R.styleable.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f2165g = obtainStyledAttributes.getInt(R.styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f2166h = obtainStyledAttributes.getInt(R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            int i10 = R.styleable.CoordinatorLayout_Layout_layout_behavior;
            boolean hasValue = obtainStyledAttributes.hasValue(i10);
            this.f2160b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(i10);
                String str = CoordinatorLayout.f2133t;
                if (TextUtils.isEmpty(string)) {
                    newInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.f2133t;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.f2135v;
                        Map<String, Constructor<c>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<c> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f2134u);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        newInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e10) {
                        throw new RuntimeException(a.b.b("Could not inflate Behavior subclass ", string), e10);
                    }
                }
                this.f2159a = newInstance;
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f2159a;
            if (cVar != null) {
                cVar.c(this);
            }
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2160b = false;
            this.f2161c = 0;
            this.f2162d = 0;
            this.f2163e = -1;
            this.f2164f = -1;
            this.f2165g = 0;
            this.f2166h = 0;
            this.f2175q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2160b = false;
            this.f2161c = 0;
            this.f2162d = 0;
            this.f2163e = -1;
            this.f2164f = -1;
            this.f2165g = 0;
            this.f2166h = 0;
            this.f2175q = new Rect();
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f2160b = false;
            this.f2161c = 0;
            this.f2162d = 0;
            this.f2163e = -1;
            this.f2164f = -1;
            this.f2165g = 0;
            this.f2166h = 0;
            this.f2175q = new Rect();
        }

        public final boolean a(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return false;
                }
                return this.f2173o;
            }
            return this.f2172n;
        }

        public final void b(c cVar) {
            c cVar2 = this.f2159a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.f();
                }
                this.f2159a = cVar;
                this.f2160b = true;
                if (cVar != null) {
                    cVar.c(this);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
            CoordinatorLayout.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.r(0);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends q1.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c */
        public SparseArray<Parcelable> f2177c;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new h[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f2177c = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f2177c.append(iArr[i10], readParcelableArray[i10]);
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // q1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int i11;
            parcel.writeParcelable(this.f24504a, i10);
            SparseArray<Parcelable> sparseArray = this.f2177c;
            if (sparseArray != null) {
                i11 = sparseArray.size();
            } else {
                i11 = 0;
            }
            parcel.writeInt(i11);
            int[] iArr = new int[i11];
            Parcelable[] parcelableArr = new Parcelable[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                iArr[i12] = this.f2177c.keyAt(i12);
                parcelableArr[i12] = this.f2177c.valueAt(i12);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }
    }

    /* loaded from: classes.dex */
    public static class i implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            float m10 = o0.i.m(view);
            float m11 = o0.i.m(view2);
            if (m10 > m11) {
                return -1;
            }
            if (m10 < m11) {
                return 1;
            }
            return 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f2133t = r02 != null ? r02.getName() : null;
        f2136w = new i();
        f2134u = new Class[]{Context.class, AttributeSet.class};
        f2135v = new ThreadLocal<>();
        f2137x = new j1.f(12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CoordinatorLayout(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            int r5 = androidx.coordinatorlayout.R.attr.coordinatorLayoutStyle
            r9.<init>(r10, r11, r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.f2138a = r0
            w0.a r0 = new w0.a
            r0.<init>()
            r9.f2139b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.f2140c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.f2141d = r0
            r0 = 2
            int[] r1 = new int[r0]
            r9.f2142e = r1
            int[] r0 = new int[r0]
            r9.f2143f = r0
            k1.d0 r0 = new k1.d0
            r0.<init>()
            r9.f2156s = r0
            int[] r2 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout
            r7 = 0
            if (r5 != 0) goto L3d
            int r0 = androidx.coordinatorlayout.R.style.Widget_Support_CoordinatorLayout
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r11, r2, r7, r0)
            goto L41
        L3d:
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r11, r2, r5, r7)
        L41:
            r8 = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L5d
            if (r5 != 0) goto L55
            r5 = 0
            int r6 = androidx.coordinatorlayout.R.style.Widget_Support_CoordinatorLayout
            r0 = r9
            r1 = r10
            r3 = r11
            r4 = r8
            r0.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6)
            goto L5d
        L55:
            r6 = 0
            r0 = r9
            r1 = r10
            r3 = r11
            r4 = r8
            r0.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6)
        L5d:
            int r0 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_keylines
            int r0 = r8.getResourceId(r0, r7)
            if (r0 == 0) goto L87
            android.content.res.Resources r1 = r10.getResources()
            int[] r0 = r1.getIntArray(r0)
            r9.f2146i = r0
            android.util.DisplayMetrics r0 = r1.getDisplayMetrics()
            float r0 = r0.density
            int[] r1 = r9.f2146i
            int r1 = r1.length
        L78:
            if (r7 >= r1) goto L87
            int[] r2 = r9.f2146i
            r3 = r2[r7]
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = (int) r3
            r2[r7] = r3
            int r7 = r7 + 1
            goto L78
        L87:
            int r0 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_statusBarBackground
            android.graphics.drawable.Drawable r0 = r8.getDrawable(r0)
            r9.f2153p = r0
            r8.recycle()
            r9.z()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$e
            r0.<init>()
            super.setOnHierarchyChangeListener(r0)
            java.util.WeakHashMap<android.view.View, k1.i2> r0 = k1.o0.f18161a
            int r0 = k1.o0.d.c(r9)
            if (r0 != 0) goto La9
            r0 = 1
            k1.o0.d.s(r9, r0)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static Rect a() {
        Rect rect = (Rect) f2137x.acquire();
        return rect == null ? new Rect() : rect;
    }

    public static void i(int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int width;
        int height;
        int i13 = fVar.f2161c;
        if (i13 == 0) {
            i13 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
        int i14 = fVar.f2162d;
        if ((i14 & 7) == 0) {
            i14 |= 8388611;
        }
        if ((i14 & 112) == 0) {
            i14 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int i17 = absoluteGravity2 & 7;
        int i18 = absoluteGravity2 & 112;
        if (i17 != 1) {
            if (i17 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i18 != 16) {
            if (i18 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i15 != 1) {
            if (i15 != 5) {
                width -= i11;
            }
        } else {
            width -= i11 / 2;
        }
        if (i16 != 16) {
            if (i16 != 80) {
                height -= i12;
            }
        } else {
            height -= i12 / 2;
        }
        rect2.set(width, height, i11 + width, i12 + height);
    }

    public static f p(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f2160b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.b(behavior);
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.b(dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e10) {
                        StringBuilder a10 = android.support.v4.media.d.a("Default behavior class ");
                        a10.append(dVar.value().getName());
                        a10.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", a10.toString(), e10);
                    }
                }
            }
            fVar.f2160b = true;
        }
        return fVar;
    }

    public static void x(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f2167i;
        if (i11 != i10) {
            o0.i(view, i10 - i11);
            fVar.f2167i = i10;
        }
    }

    public static void y(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f2168j;
        if (i11 != i10) {
            o0.j(view, i10 - i11);
            fVar.f2168j = i10;
        }
    }

    public final void b(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    public final void c(View view) {
        ArrayList<View> orDefault = this.f2139b.f29519b.getOrDefault(view, null);
        if (orDefault != null && !orDefault.isEmpty()) {
            for (int i10 = 0; i10 < orDefault.size(); i10++) {
                View view2 = orDefault.get(i10);
                c cVar = ((f) view2.getLayoutParams()).f2159a;
                if (cVar != null) {
                    cVar.d(this, view2, view);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public final void d(View view, Rect rect, boolean z10) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            h(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        c cVar = ((f) view.getLayoutParams()).f2159a;
        if (cVar != null) {
            cVar.getClass();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2153p;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // k1.c0
    public final void e(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c cVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i14) && (cVar = fVar.f2159a) != null) {
                    int[] iArr2 = this.f2142e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.l(this, childAt, i11, i12, i13, iArr2);
                    int[] iArr3 = this.f2142e;
                    if (i12 > 0) {
                        min = Math.max(i15, iArr3[0]);
                    } else {
                        min = Math.min(i15, iArr3[0]);
                    }
                    i15 = min;
                    int[] iArr4 = this.f2142e;
                    if (i13 > 0) {
                        min2 = Math.max(i16, iArr4[1]);
                    } else {
                        min2 = Math.min(i16, iArr4[1]);
                    }
                    i16 = min2;
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i15;
        iArr[1] = iArr[1] + i16;
        if (z10) {
            r(1);
        }
    }

    public final ArrayList f(View view) {
        w0.a<View> aVar = this.f2139b;
        int i10 = aVar.f29519b.f22552c;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList<View> m10 = aVar.f29519b.m(i11);
            if (m10 != null && m10.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(aVar.f29519b.i(i11));
            }
        }
        this.f2141d.clear();
        if (arrayList != null) {
            this.f2141d.addAll(arrayList);
        }
        return this.f2141d;
    }

    public final ArrayList g(View view) {
        ArrayList<View> orDefault = this.f2139b.f29519b.getOrDefault(view, null);
        this.f2141d.clear();
        if (orDefault != null) {
            this.f2141d.addAll(orDefault);
        }
        return this.f2141d;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        v();
        return Collections.unmodifiableList(this.f2138a);
    }

    public final n2 getLastWindowInsets() {
        return this.f2151n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        d0 d0Var = this.f2156s;
        return d0Var.f18110b | d0Var.f18109a;
    }

    public Drawable getStatusBarBackground() {
        return this.f2153p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = w0.b.f29522a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = w0.b.f29522a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        w0.b.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = w0.b.f29523b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int j(int i10) {
        StringBuilder sb2;
        int[] iArr = this.f2146i;
        if (iArr == null) {
            sb2 = new StringBuilder();
            sb2.append("No keylines defined for ");
            sb2.append(this);
            sb2.append(" - attempted index lookup ");
            sb2.append(i10);
        } else if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        } else {
            sb2 = new StringBuilder();
            sb2.append("Keyline index ");
            sb2.append(i10);
            sb2.append(" out of range for ");
            sb2.append(this);
        }
        Log.e("CoordinatorLayout", sb2.toString());
        return 0;
    }

    @Override // k1.b0
    public final void k(View view, int i10, int i11, int i12, int i13, int i14) {
        e(view, i10, i11, i12, i13, 0, this.f2143f);
    }

    @Override // k1.b0
    public final boolean l(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.f2159a;
                if (cVar != null) {
                    boolean p10 = cVar.p(this, childAt, view, view2, i10, i11);
                    z10 |= p10;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            fVar.f2173o = p10;
                        }
                    } else {
                        fVar.f2172n = p10;
                    }
                } else if (i11 != 0) {
                    if (i11 == 1) {
                        fVar.f2173o = false;
                    }
                } else {
                    fVar.f2172n = false;
                }
            }
        }
        return z10;
    }

    @Override // k1.b0
    public final void m(View view, View view2, int i10, int i11) {
        this.f2156s.a(i10, i11);
        this.f2148k = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ((f) getChildAt(i12).getLayoutParams()).getClass();
        }
    }

    @Override // k1.b0
    public final void n(View view, int i10) {
        d0 d0Var = this.f2156s;
        if (i10 == 1) {
            d0Var.f18110b = 0;
        } else {
            d0Var.f18109a = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i10)) {
                c cVar = fVar.f2159a;
                if (cVar != null) {
                    cVar.q(this, childAt, view, i10);
                }
                if (i10 != 0) {
                    if (i10 == 1) {
                        fVar.f2173o = false;
                    }
                } else {
                    fVar.f2172n = false;
                }
                fVar.f2174p = false;
            }
        }
        this.f2148k = null;
    }

    @Override // k1.b0
    public final void o(View view, int i10, int i11, int[] iArr, int i12) {
        c cVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i12) && (cVar = fVar.f2159a) != null) {
                    int[] iArr2 = this.f2142e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.k(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f2142e;
                    if (i10 > 0) {
                        min = Math.max(i13, iArr3[0]);
                    } else {
                        min = Math.min(i13, iArr3[0]);
                    }
                    i13 = min;
                    int[] iArr4 = this.f2142e;
                    if (i11 > 0) {
                        min2 = Math.max(i14, iArr4[1]);
                    } else {
                        min2 = Math.min(i14, iArr4[1]);
                    }
                    i14 = min2;
                    z10 = true;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
        if (z10) {
            r(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w(false);
        if (this.f2150m) {
            if (this.f2149l == null) {
                this.f2149l = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2149l);
        }
        if (this.f2151n == null) {
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            if (o0.d.b(this)) {
                o0.h.c(this);
            }
        }
        this.f2145h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w(false);
        if (this.f2150m && this.f2149l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2149l);
        }
        View view = this.f2148k;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f2145h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f2152o || this.f2153p == null) {
            return;
        }
        n2 n2Var = this.f2151n;
        int e10 = n2Var != null ? n2Var.e() : 0;
        if (e10 > 0) {
            this.f2153p.setBounds(0, 0, getWidth(), e10);
            this.f2153p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            w(true);
        }
        boolean u10 = u(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            w(true);
        }
        return u10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c cVar;
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        int d10 = o0.e.d(this);
        int size = this.f2138a.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) this.f2138a.get(i14);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f2159a) == null || !cVar.h(this, view, d10))) {
                s(view, d10);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x018c, code lost:
        if (r0.i(r30, r19, r24, r20, r25) == false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:174:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x018f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0)) {
                    c cVar = fVar.f2159a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        c cVar;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f2159a) != null) {
                    z10 |= cVar.j(view);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        o(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        k(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        m(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f24504a);
        SparseArray<Parcelable> sparseArray = hVar.f2177c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVar = p(childAt).f2159a;
            if (id2 != -1 && cVar != null && (parcelable2 = sparseArray.get(id2)) != null) {
                cVar.n(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable o10;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).f2159a;
            if (id2 != -1 && cVar != null && (o10 = cVar.o(childAt)) != null) {
                sparseArray.append(id2, o10);
            }
        }
        hVar.f2177c = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return l(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        n(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f2147j
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.u(r1, r4)
            if (r3 == 0) goto L29
            goto L16
        L15:
            r3 = 0
        L16:
            android.view.View r6 = r0.f2147j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f2159a
            if (r6 == 0) goto L29
            android.view.View r7 = r0.f2147j
            boolean r6 = r6.r(r0, r7, r1)
            goto L2a
        L29:
            r6 = 0
        L2a:
            android.view.View r7 = r0.f2147j
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.w(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean q(View view, int i10, int i11) {
        Rect a10 = a();
        h(view, a10);
        try {
            return a10.contains(i10, i11);
        } finally {
            a10.setEmpty();
            f2137x.release(a10);
        }
    }

    public final void r(int i10) {
        int i11;
        Rect rect;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        int width;
        int i13;
        int i14;
        int i15;
        int height;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Rect rect2;
        int i21;
        boolean z13;
        c cVar;
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        int d10 = o0.e.d(this);
        int size = this.f2138a.size();
        Rect a10 = a();
        Rect a11 = a();
        Rect a12 = a();
        int i22 = i10;
        int i23 = 0;
        while (i23 < size) {
            View view = (View) this.f2138a.get(i23);
            f fVar = (f) view.getLayoutParams();
            if (i22 == 0 && view.getVisibility() == 8) {
                i12 = size;
                rect = a12;
                i11 = i23;
            } else {
                int i24 = 0;
                while (i24 < i23) {
                    if (fVar.f2170l == ((View) this.f2138a.get(i24))) {
                        f fVar2 = (f) view.getLayoutParams();
                        if (fVar2.f2169k != null) {
                            Rect a13 = a();
                            Rect a14 = a();
                            Rect a15 = a();
                            h(fVar2.f2169k, a13);
                            d(view, a14, false);
                            int measuredWidth = view.getMeasuredWidth();
                            i20 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            i21 = i23;
                            rect2 = a12;
                            i19 = i24;
                            i(d10, a13, a15, fVar2, measuredWidth, measuredHeight);
                            if (a15.left == a14.left && a15.top == a14.top) {
                                z13 = false;
                            } else {
                                z13 = true;
                            }
                            b(fVar2, a15, measuredWidth, measuredHeight);
                            int i25 = a15.left - a14.left;
                            int i26 = a15.top - a14.top;
                            if (i25 != 0) {
                                o0.i(view, i25);
                            }
                            if (i26 != 0) {
                                o0.j(view, i26);
                            }
                            if (z13 && (cVar = fVar2.f2159a) != null) {
                                cVar.d(this, view, fVar2.f2169k);
                            }
                            a13.setEmpty();
                            j1.f fVar3 = f2137x;
                            fVar3.release(a13);
                            a14.setEmpty();
                            fVar3.release(a14);
                            a15.setEmpty();
                            fVar3.release(a15);
                            i24 = i19 + 1;
                            size = i20;
                            i23 = i21;
                            a12 = rect2;
                        }
                    }
                    i19 = i24;
                    i20 = size;
                    rect2 = a12;
                    i21 = i23;
                    i24 = i19 + 1;
                    size = i20;
                    i23 = i21;
                    a12 = rect2;
                }
                int i27 = size;
                Rect rect3 = a12;
                i11 = i23;
                d(view, a11, true);
                if (fVar.f2165g != 0 && !a11.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar.f2165g, d10);
                    int i28 = absoluteGravity & 112;
                    if (i28 != 48) {
                        if (i28 == 80) {
                            a10.bottom = Math.max(a10.bottom, getHeight() - a11.top);
                        }
                    } else {
                        a10.top = Math.max(a10.top, a11.bottom);
                    }
                    int i29 = absoluteGravity & 7;
                    if (i29 != 3) {
                        if (i29 == 5) {
                            a10.right = Math.max(a10.right, getWidth() - a11.left);
                        }
                    } else {
                        a10.left = Math.max(a10.left, a11.right);
                    }
                }
                if (fVar.f2166h != 0 && view.getVisibility() == 0) {
                    WeakHashMap<View, i2> weakHashMap2 = o0.f18161a;
                    if (o0.g.c(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                        f fVar4 = (f) view.getLayoutParams();
                        c cVar2 = fVar4.f2159a;
                        Rect a16 = a();
                        Rect a17 = a();
                        a17.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (cVar2 != null && cVar2.a(view, a16)) {
                            if (!a17.contains(a16)) {
                                StringBuilder a18 = android.support.v4.media.d.a("Rect should be within the child's bounds. Rect:");
                                a18.append(a16.toShortString());
                                a18.append(" | Bounds:");
                                a18.append(a17.toShortString());
                                throw new IllegalArgumentException(a18.toString());
                            }
                        } else {
                            a16.set(a17);
                        }
                        a17.setEmpty();
                        j1.f fVar5 = f2137x;
                        fVar5.release(a17);
                        if (!a16.isEmpty()) {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar4.f2166h, d10);
                            if ((absoluteGravity2 & 48) == 48 && (i17 = (a16.top - ((ViewGroup.MarginLayoutParams) fVar4).topMargin) - fVar4.f2168j) < (i18 = a10.top)) {
                                y(view, i18 - i17);
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a16.bottom) - ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin) + fVar4.f2168j) < (i16 = a10.bottom)) {
                                y(view, height - i16);
                                z11 = true;
                            }
                            if (!z11) {
                                y(view, 0);
                            }
                            if ((absoluteGravity2 & 3) == 3 && (i14 = (a16.left - ((ViewGroup.MarginLayoutParams) fVar4).leftMargin) - fVar4.f2167i) < (i15 = a10.left)) {
                                x(view, i15 - i14);
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - a16.right) - ((ViewGroup.MarginLayoutParams) fVar4).rightMargin) + fVar4.f2167i) < (i13 = a10.right)) {
                                x(view, width - i13);
                                z12 = true;
                            }
                            if (!z12) {
                                x(view, 0);
                            }
                        }
                        a16.setEmpty();
                        fVar5.release(a16);
                    }
                }
                if (i10 != 2) {
                    rect = rect3;
                    rect.set(((f) view.getLayoutParams()).f2175q);
                    if (rect.equals(a11)) {
                        i12 = i27;
                        i22 = i10;
                    } else {
                        ((f) view.getLayoutParams()).f2175q.set(a11);
                    }
                } else {
                    rect = rect3;
                }
                i12 = i27;
                for (int i30 = i11 + 1; i30 < i12; i30++) {
                    View view2 = (View) this.f2138a.get(i30);
                    f fVar6 = (f) view2.getLayoutParams();
                    c cVar3 = fVar6.f2159a;
                    if (cVar3 != null && cVar3.b(view2, view)) {
                        if (i10 == 0 && fVar6.f2174p) {
                            fVar6.f2174p = false;
                        } else {
                            if (i10 != 2) {
                                z10 = cVar3.d(this, view2, view);
                            } else {
                                cVar3.e(this, view);
                                z10 = true;
                            }
                            if (i10 == 1) {
                                fVar6.f2174p = z10;
                            }
                        }
                    }
                }
                i22 = i10;
            }
            i23 = i11 + 1;
            size = i12;
            a12 = rect;
        }
        Rect rect4 = a12;
        a10.setEmpty();
        j1.f fVar7 = f2137x;
        fVar7.release(a10);
        a11.setEmpty();
        fVar7.release(a11);
        rect4.setEmpty();
        fVar7.release(rect4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c cVar = ((f) view.getLayoutParams()).f2159a;
        if (cVar != null && cVar.m(this, view, rect, z10)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f2144g) {
            return;
        }
        w(false);
        this.f2144g = true;
    }

    public final void s(View view, int i10) {
        boolean z10;
        Rect a10;
        Rect a11;
        j1.f fVar;
        f fVar2 = (f) view.getLayoutParams();
        View view2 = fVar2.f2169k;
        int i11 = 0;
        if (view2 == null && fVar2.f2164f != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (view2 != null) {
                a10 = a();
                a11 = a();
                try {
                    h(view2, a10);
                    f fVar3 = (f) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    i(i10, a10, a11, fVar3, measuredWidth, measuredHeight);
                    b(fVar3, a11, measuredWidth, measuredHeight);
                    view.layout(a11.left, a11.top, a11.right, a11.bottom);
                    return;
                } finally {
                    a10.setEmpty();
                    fVar = f2137x;
                    fVar.release(a10);
                    a11.setEmpty();
                    fVar.release(a11);
                }
            }
            int i12 = fVar2.f2163e;
            if (i12 >= 0) {
                f fVar4 = (f) view.getLayoutParams();
                int i13 = fVar4.f2161c;
                if (i13 == 0) {
                    i13 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
                int i14 = absoluteGravity & 7;
                int i15 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i10 == 1) {
                    i12 = width - i12;
                }
                int j10 = j(i12) - measuredWidth2;
                if (i14 != 1) {
                    if (i14 == 5) {
                        j10 += measuredWidth2;
                    }
                } else {
                    j10 += measuredWidth2 / 2;
                }
                if (i15 != 16) {
                    if (i15 == 80) {
                        i11 = measuredHeight2 + 0;
                    }
                } else {
                    i11 = 0 + (measuredHeight2 / 2);
                }
                int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar4).leftMargin, Math.min(j10, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) fVar4).rightMargin));
                int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar4).topMargin, Math.min(i11, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            f fVar5 = (f) view.getLayoutParams();
            a10 = a();
            a10.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar5).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar5).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar5).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar5).bottomMargin);
            if (this.f2151n != null) {
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                if (o0.d.b(this) && !o0.d.b(view)) {
                    a10.left = this.f2151n.c() + a10.left;
                    a10.top = this.f2151n.e() + a10.top;
                    a10.right -= this.f2151n.d();
                    a10.bottom -= this.f2151n.b();
                }
            }
            a11 = a();
            int i16 = fVar5.f2161c;
            if ((i16 & 7) == 0) {
                i16 |= 8388611;
            }
            if ((i16 & 112) == 0) {
                i16 |= 48;
            }
            k1.f.b(i16, view.getMeasuredWidth(), view.getMeasuredHeight(), a10, a11, i10);
            view.layout(a11.left, a11.top, a11.right, a11.bottom);
            return;
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        z();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2154q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.f2153p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f2153p = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f2153p.setState(getDrawableState());
                }
                Drawable drawable4 = this.f2153p;
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                b1.a.c(drawable4, o0.e.d(this));
                Drawable drawable5 = this.f2153p;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable5.setVisible(z10, false);
                this.f2153p.setCallback(this);
            }
            WeakHashMap<View, i2> weakHashMap2 = o0.f18161a;
            o0.d.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            Context context = getContext();
            Object obj = y0.a.f30807a;
            drawable = a.c.b(context, i10);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f2153p;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f2153p.setVisible(z10, false);
    }

    public final void t(View view, int i10, int i11, int i12) {
        measureChildWithMargins(view, i10, i11, i12, 0);
    }

    public final boolean u(MotionEvent motionEvent, int i10) {
        boolean z10;
        int i11;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f2140c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            if (isChildrenDrawingOrderEnabled) {
                i11 = getChildDrawingOrder(childCount, i12);
            } else {
                i11 = i12;
            }
            arrayList.add(getChildAt(i11));
        }
        i iVar = f2136w;
        if (iVar != null) {
            Collections.sort(arrayList, iVar);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z11 = false;
        boolean z12 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view = (View) arrayList.get(i13);
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.f2159a;
            if ((z11 || z12) && actionMasked != 0) {
                if (cVar != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i10 != 0) {
                        if (i10 == 1) {
                            cVar.r(this, view, motionEvent2);
                        }
                    } else {
                        cVar.g(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z11 && cVar != null) {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            z11 = cVar.r(this, view, motionEvent);
                        }
                    } else {
                        z11 = cVar.g(this, view, motionEvent);
                    }
                    if (z11) {
                        this.f2147j = view;
                    }
                }
                if (fVar.f2159a == null) {
                    fVar.f2171m = false;
                }
                boolean z13 = fVar.f2171m;
                if (z13) {
                    z10 = true;
                } else {
                    z10 = z13 | false;
                    fVar.f2171m = z10;
                }
                if (z10 && !z13) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z10 && !z12) {
                    break;
                }
            }
        }
        arrayList.clear();
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0073, code lost:
        if (r5 != false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0167 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v() {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.v():void");
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2153p;
    }

    public final void w(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c cVar = ((f) childAt.getLayoutParams()).f2159a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    cVar.g(this, childAt, obtain);
                } else {
                    cVar.r(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).f2171m = false;
        }
        this.f2147j = null;
        this.f2144g = false;
    }

    public final void z() {
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        if (o0.d.b(this)) {
            if (this.f2155r == null) {
                this.f2155r = new a();
            }
            o0.i.u(this, this.f2155r);
            setSystemUiVisibility(1280);
            return;
        }
        o0.i.u(this, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }
}
