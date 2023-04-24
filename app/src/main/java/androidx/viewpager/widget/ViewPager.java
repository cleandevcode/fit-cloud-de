package androidx.viewpager.widget;

import a0.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import no.nordicsemi.android.dfu.DfuBaseService;
import y0.a;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* renamed from: k0 */
    public static final int[] f3476k0 = {16842931};

    /* renamed from: l0 */
    public static final a f3477l0 = new a();

    /* renamed from: m0 */
    public static final b f3478m0 = new b();
    public int A;
    public float B;
    public float C;
    public float D;
    public float E;
    public int F;
    public VelocityTracker H;
    public int L;
    public int M;
    public int Q;
    public int U;
    public EdgeEffect V;
    public EdgeEffect W;

    /* renamed from: a */
    public int f3479a;

    /* renamed from: b */
    public final ArrayList<e> f3480b;

    /* renamed from: c */
    public final e f3481c;

    /* renamed from: c0 */
    public boolean f3482c0;

    /* renamed from: d */
    public final Rect f3483d;

    /* renamed from: d0 */
    public boolean f3484d0;

    /* renamed from: e */
    public b3.a f3485e;

    /* renamed from: e0 */
    public int f3486e0;

    /* renamed from: f */
    public int f3487f;

    /* renamed from: f0 */
    public ArrayList f3488f0;

    /* renamed from: g */
    public int f3489g;

    /* renamed from: g0 */
    public i f3490g0;

    /* renamed from: h */
    public Parcelable f3491h;

    /* renamed from: h0 */
    public ArrayList f3492h0;

    /* renamed from: i */
    public Scroller f3493i;

    /* renamed from: i0 */
    public final c f3494i0;

    /* renamed from: j */
    public boolean f3495j;

    /* renamed from: j0 */
    public int f3496j0;

    /* renamed from: k */
    public j f3497k;

    /* renamed from: l */
    public int f3498l;

    /* renamed from: m */
    public Drawable f3499m;

    /* renamed from: n */
    public int f3500n;

    /* renamed from: o */
    public int f3501o;

    /* renamed from: p */
    public float f3502p;

    /* renamed from: q */
    public float f3503q;

    /* renamed from: r */
    public int f3504r;

    /* renamed from: s */
    public boolean f3505s;

    /* renamed from: t */
    public boolean f3506t;

    /* renamed from: u */
    public boolean f3507u;

    /* renamed from: v */
    public int f3508v;

    /* renamed from: w */
    public boolean f3509w;

    /* renamed from: x */
    public boolean f3510x;

    /* renamed from: y */
    public int f3511y;

    /* renamed from: z */
    public int f3512z;

    /* loaded from: classes.dex */
    public static class a implements Comparator<e> {
        @Override // java.util.Comparator
        public final int compare(e eVar, e eVar2) {
            return eVar.f3515b - eVar2.f3515b;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
            ViewPager.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.p();
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface d {
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public Object f3514a;

        /* renamed from: b */
        public int f3515b;

        /* renamed from: c */
        public boolean f3516c;

        /* renamed from: d */
        public float f3517d;

        /* renamed from: e */
        public float f3518e;
    }

    /* loaded from: classes.dex */
    public static class f extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f3519a;

        /* renamed from: b */
        public int f3520b;

        /* renamed from: c */
        public float f3521c;

        /* renamed from: d */
        public boolean f3522d;

        public f() {
            super(-1, -1);
            this.f3521c = 0.0f;
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3521c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f3476k0);
            this.f3520b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public class g extends k1.a {
        public g() {
            ViewPager.this = r1;
        }

        @Override // k1.a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            b3.a aVar;
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            b3.a aVar2 = ViewPager.this.f3485e;
            boolean z10 = true;
            accessibilityEvent.setScrollable((aVar2 == null || aVar2.b() <= 1) ? false : false);
            if (accessibilityEvent.getEventType() == 4096 && (aVar = ViewPager.this.f3485e) != null) {
                accessibilityEvent.setItemCount(aVar.b());
                accessibilityEvent.setFromIndex(ViewPager.this.f3487f);
                accessibilityEvent.setToIndex(ViewPager.this.f3487f);
            }
        }

        @Override // k1.a
        public final void d(View view, l1.j jVar) {
            boolean z10;
            this.f18085a.onInitializeAccessibilityNodeInfo(view, jVar.f18670a);
            jVar.g(ViewPager.class.getName());
            b3.a aVar = ViewPager.this.f3485e;
            if (aVar != null && aVar.b() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            jVar.k(z10);
            if (ViewPager.this.canScrollHorizontally(1)) {
                jVar.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                jVar.a(DfuBaseService.ERROR_REMOTE_MASK);
            }
        }

        @Override // k1.a
        public final boolean g(View view, int i10, Bundle bundle) {
            ViewPager viewPager;
            int i11;
            if (super.g(view, i10, bundle)) {
                return true;
            }
            if (i10 != 4096) {
                if (i10 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i11 = viewPager.f3487f - 1;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                viewPager = ViewPager.this;
                i11 = viewPager.f3487f + 1;
            }
            viewPager.setCurrentItem(i11);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        void a(ViewPager viewPager, b3.a aVar, b3.a aVar2);
    }

    /* loaded from: classes.dex */
    public interface i {
        void a(float f10, int i10);

        void b(int i10);

        void c(int i10);
    }

    /* loaded from: classes.dex */
    public class j extends DataSetObserver {
        public j() {
            ViewPager.this = r1;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ViewPager.this.e();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ViewPager.this.e();
        }
    }

    /* loaded from: classes.dex */
    public static class k extends q1.a {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: c */
        public int f3525c;

        /* renamed from: d */
        public Parcelable f3526d;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<k> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new k(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new k[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final k createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new k(parcel, classLoader);
            }
        }

        public k(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? k.class.getClassLoader() : classLoader;
            this.f3525c = parcel.readInt();
            this.f3526d = parcel.readParcelable(classLoader);
        }

        public k(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder a10 = android.support.v4.media.d.a("FragmentPager.SavedState{");
            a10.append(Integer.toHexString(System.identityHashCode(this)));
            a10.append(" position=");
            return q.b(a10, this.f3525c, "}");
        }

        @Override // q1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f24504a, i10);
            parcel.writeInt(this.f3525c);
            parcel.writeParcelable(this.f3526d, i10);
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3480b = new ArrayList<>();
        this.f3481c = new e();
        this.f3483d = new Rect();
        this.f3489g = -1;
        this.f3491h = null;
        this.f3502p = -3.4028235E38f;
        this.f3503q = Float.MAX_VALUE;
        this.f3508v = 1;
        this.F = -1;
        this.f3482c0 = true;
        this.f3494i0 = new c();
        this.f3496j0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f3493i = new Scroller(context2, f3478m0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.A = viewConfiguration.getScaledPagingTouchSlop();
        this.L = (int) (400.0f * f10);
        this.M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.V = new EdgeEffect(context2);
        this.W = new EdgeEffect(context2);
        this.Q = (int) (25.0f * f10);
        this.U = (int) (2.0f * f10);
        this.f3511y = (int) (f10 * 16.0f);
        o0.p(this, new g());
        if (o0.d.c(this) == 0) {
            o0.d.s(this, 1);
        }
        o0.i.u(this, new b3.b(this));
    }

    public static boolean c(int i10, int i11, int i12, View view, boolean z10) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && c(i10, i14 - childAt.getLeft(), i13 - childAt.getTop(), childAt, true)) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f3506t != z10) {
            this.f3506t = z10;
        }
    }

    public final e a(int i10, int i11) {
        e eVar = new e();
        eVar.f3515b = i10;
        eVar.f3514a = this.f3485e.c(this, i10);
        this.f3485e.getClass();
        eVar.f3517d = 1.0f;
        if (i11 < 0 || i11 >= this.f3480b.size()) {
            this.f3480b.add(eVar);
        } else {
            this.f3480b.add(i11, eVar);
        }
        return eVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        e h10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (h10 = h(childAt)) != null && h10.f3515b == this.f3487f) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        e h10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (h10 = h(childAt)) != null && h10.f3515b == this.f3487f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        boolean z10;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        f fVar = (f) layoutParams;
        boolean z11 = fVar.f3519a;
        if (view.getClass().getAnnotation(d.class) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        fVar.f3519a = z12;
        if (this.f3505s) {
            if (!z12) {
                fVar.f3522d = true;
                addViewInLayout(view, i10, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i10, layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x008b, code lost:
        if (r0 > 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00c0, code lost:
        if (r0 <= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00c2, code lost:
        r6.f3507u = false;
        u(r0 - 1, 0, true, false);
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 0
            r2 = 1
            if (r0 != r6) goto L9
            goto L62
        L9:
            if (r0 == 0) goto L63
            android.view.ViewParent r3 = r0.getParent()
        Lf:
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L1c
            if (r3 != r6) goto L17
            r3 = 1
            goto L1d
        L17:
            android.view.ViewParent r3 = r3.getParent()
            goto Lf
        L1c:
            r3 = 0
        L1d:
            if (r3 != 0) goto L63
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            android.view.ViewParent r0 = r0.getParent()
        L33:
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L4c
            java.lang.String r4 = " => "
            r3.append(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            android.view.ViewParent r0 = r0.getParent()
            goto L33
        L4c:
            java.lang.String r0 = "arrowScroll tried to find focus based on non-child current focused view "
            java.lang.StringBuilder r0 = android.support.v4.media.d.a(r0)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "ViewPager"
            android.util.Log.e(r3, r0)
        L62:
            r0 = 0
        L63:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto Laf
            if (r3 == r0) goto Laf
            if (r7 != r5) goto L8e
            android.graphics.Rect r4 = r6.f3483d
            android.graphics.Rect r4 = r6.g(r3, r4)
            int r4 = r4.left
            android.graphics.Rect r5 = r6.f3483d
            android.graphics.Rect r5 = r6.g(r0, r5)
            int r5 = r5.left
            if (r0 == 0) goto La9
            if (r4 < r5) goto La9
            int r0 = r6.f3487f
            if (r0 <= 0) goto Lc9
            goto Lc2
        L8e:
            if (r7 != r4) goto Lc9
            android.graphics.Rect r1 = r6.f3483d
            android.graphics.Rect r1 = r6.g(r3, r1)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f3483d
            android.graphics.Rect r2 = r6.g(r0, r2)
            int r2 = r2.left
            if (r0 == 0) goto La9
            if (r1 > r2) goto La9
            boolean r0 = r6.m()
            goto Lad
        La9:
            boolean r0 = r3.requestFocus()
        Lad:
            r1 = r0
            goto Lc9
        Laf:
            if (r7 == r5) goto Lbe
            if (r7 != r2) goto Lb4
            goto Lbe
        Lb4:
            if (r7 == r4) goto Lb9
            r0 = 2
            if (r7 != r0) goto Lc9
        Lb9:
            boolean r1 = r6.m()
            goto Lc9
        Lbe:
            int r0 = r6.f3487f
            if (r0 <= 0) goto Lc9
        Lc2:
            int r0 = r0 - r2
            r6.f3507u = r1
            r6.u(r0, r1, r2, r1)
            r1 = 1
        Lc9:
            if (r1 == 0) goto Ld2
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Ld2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.b(int):boolean");
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        if (this.f3485e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i10 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f3502p)) : i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.f3503q));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.f3495j = true;
        if (!this.f3493i.isFinished() && this.f3493i.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f3493i.getCurrX();
            int currY = this.f3493i.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!n(currX)) {
                    this.f3493i.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.d.k(this);
            return;
        }
        d(true);
    }

    public final void d(boolean z10) {
        boolean z11;
        if (this.f3496j0 == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f3493i.isFinished()) {
                this.f3493i.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f3493i.getCurrX();
                int currY = this.f3493i.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        n(currX);
                    }
                }
            }
        }
        this.f3507u = false;
        for (int i10 = 0; i10 < this.f3480b.size(); i10++) {
            e eVar = this.f3480b.get(i10);
            if (eVar.f3516c) {
                eVar.f3516c = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                c cVar = this.f3494i0;
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                o0.d.m(this, cVar);
                return;
            }
            this.f3494i0.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0061 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L62
            int r0 = r6.getAction()
            if (r0 != 0) goto L5d
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L44
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L5d
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.b(r4)
            goto L5e
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L5d
            boolean r6 = r5.b(r1)
            goto L5e
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.m()
            goto L5e
        L41:
            r6 = 66
            goto L58
        L44:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L56
            int r6 = r5.f3487f
            if (r6 <= 0) goto L5d
            int r6 = r6 - r1
            r5.f3507u = r2
            r5.u(r6, r2, r1, r2)
            r6 = 1
            goto L5e
        L56:
            r6 = 17
        L58:
            boolean r6 = r5.b(r6)
            goto L5e
        L5d:
            r6 = 0
        L5e:
            if (r6 == 0) goto L61
            goto L62
        L61:
            r1 = 0
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        e h10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (h10 = h(childAt)) != null && h10.f3515b == this.f3487f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        b3.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z10 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f3485e) != null && aVar.b() > 1)) {
            if (!this.V.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.f3502p * width);
                this.V.setSize(height, width);
                z10 = false | this.V.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.W.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f3503q + 1.0f)) * width2);
                this.W.setSize(height2, width2);
                z10 |= this.W.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.V.finish();
            this.W.finish();
        }
        if (z10) {
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.d.k(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3499m;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e() {
        boolean z10;
        int b10 = this.f3485e.b();
        this.f3479a = b10;
        if (this.f3480b.size() < (this.f3508v * 2) + 1 && this.f3480b.size() < b10) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.f3487f;
        for (int i11 = 0; i11 < this.f3480b.size(); i11++) {
            b3.a aVar = this.f3485e;
            Object obj = this.f3480b.get(i11).f3514a;
            aVar.getClass();
        }
        Collections.sort(this.f3480b, f3477l0);
        if (z10) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                f fVar = (f) getChildAt(i12).getLayoutParams();
                if (!fVar.f3519a) {
                    fVar.f3521c = 0.0f;
                }
            }
            u(i10, 0, false, true);
            requestLayout();
        }
    }

    public final void f(int i10) {
        i iVar = this.f3490g0;
        if (iVar != null) {
            iVar.c(i10);
        }
        ArrayList arrayList = this.f3488f0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                i iVar2 = (i) this.f3488f0.get(i11);
                if (iVar2 != null) {
                    iVar2.c(i10);
                }
            }
        }
    }

    public final Rect g(View view, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        while (true) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || parent == this) {
                break;
            }
            view = (ViewGroup) parent;
            rect.left = view.getLeft() + rect.left;
            rect.right = view.getRight() + rect.right;
            rect.top = view.getTop() + rect.top;
            rect.bottom = view.getBottom() + rect.bottom;
        }
        return rect;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public b3.a getAdapter() {
        return this.f3485e;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f3487f;
    }

    public int getOffscreenPageLimit() {
        return this.f3508v;
    }

    public int getPageMargin() {
        return this.f3498l;
    }

    public final e h(View view) {
        for (int i10 = 0; i10 < this.f3480b.size(); i10++) {
            e eVar = this.f3480b.get(i10);
            if (this.f3485e.d(view, eVar.f3514a)) {
                return eVar;
            }
        }
        return null;
    }

    public final e i() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.f3498l / clientWidth : 0.0f;
        e eVar = null;
        float f12 = 0.0f;
        int i11 = -1;
        int i12 = 0;
        boolean z10 = true;
        while (i12 < this.f3480b.size()) {
            e eVar2 = this.f3480b.get(i12);
            if (!z10 && eVar2.f3515b != (i10 = i11 + 1)) {
                eVar2 = this.f3481c;
                eVar2.f3518e = f10 + f12 + f11;
                eVar2.f3515b = i10;
                this.f3485e.getClass();
                eVar2.f3517d = 1.0f;
                i12--;
            }
            f10 = eVar2.f3518e;
            float f13 = eVar2.f3517d + f10 + f11;
            if (!z10 && scrollX < f10) {
                return eVar;
            }
            if (scrollX < f13 || i12 == this.f3480b.size() - 1) {
                return eVar2;
            }
            i11 = eVar2.f3515b;
            f12 = eVar2.f3517d;
            i12++;
            eVar = eVar2;
            z10 = false;
        }
        return eVar;
    }

    public final e j(int i10) {
        for (int i11 = 0; i11 < this.f3480b.size(); i11++) {
            e eVar = this.f3480b.get(i11);
            if (eVar.f3515b == i10) {
                return eVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(float r12, int r13, int r14) {
        /*
            r11 = this;
            int r14 = r11.f3486e0
            r0 = 0
            r1 = 1
            if (r14 <= 0) goto L6b
            int r14 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = 0
        L1b:
            if (r6 >= r5) goto L6b
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r8 = (androidx.viewpager.widget.ViewPager.f) r8
            boolean r9 = r8.f3519a
            if (r9 != 0) goto L2c
            goto L68
        L2c:
            int r8 = r8.f3520b
            r8 = r8 & 7
            if (r8 == r1) goto L4d
            r9 = 3
            if (r8 == r9) goto L47
            r9 = 5
            if (r8 == r9) goto L3a
            r8 = r2
            goto L5c
        L3a:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
            goto L59
        L47:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L5c
        L4d:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
        L59:
            r10 = r8
            r8 = r2
            r2 = r10
        L5c:
            int r2 = r2 + r14
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L67
            r7.offsetLeftAndRight(r2)
        L67:
            r2 = r8
        L68:
            int r6 = r6 + 1
            goto L1b
        L6b:
            androidx.viewpager.widget.ViewPager$i r14 = r11.f3490g0
            if (r14 == 0) goto L72
            r14.a(r12, r13)
        L72:
            java.util.ArrayList r14 = r11.f3488f0
            if (r14 == 0) goto L8c
            int r14 = r14.size()
        L7a:
            if (r0 >= r14) goto L8c
            java.util.ArrayList r2 = r11.f3488f0
            java.lang.Object r2 = r2.get(r0)
            androidx.viewpager.widget.ViewPager$i r2 = (androidx.viewpager.widget.ViewPager.i) r2
            if (r2 == 0) goto L89
            r2.a(r12, r13)
        L89:
            int r0 = r0 + 1
            goto L7a
        L8c:
            r11.f3484d0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.k(float, int, int):void");
    }

    public final void l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.F) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.B = motionEvent.getX(i10);
            this.F = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.H;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean m() {
        b3.a aVar = this.f3485e;
        if (aVar == null || this.f3487f >= aVar.b() - 1) {
            return false;
        }
        this.f3507u = false;
        u(this.f3487f + 1, 0, true, false);
        return true;
    }

    public final boolean n(int i10) {
        if (this.f3480b.size() == 0) {
            if (this.f3482c0) {
                return false;
            }
            this.f3484d0 = false;
            k(0.0f, 0, 0);
            if (this.f3484d0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        e i11 = i();
        int clientWidth = getClientWidth();
        int i12 = this.f3498l;
        int i13 = clientWidth + i12;
        float f10 = clientWidth;
        int i14 = i11.f3515b;
        float f11 = ((i10 / f10) - i11.f3518e) / (i11.f3517d + (i12 / f10));
        this.f3484d0 = false;
        k(f11, i14, (int) (i13 * f11));
        if (this.f3484d0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean o(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.B - f10;
        this.B = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.f3502p * clientWidth;
        float f13 = this.f3503q * clientWidth;
        boolean z12 = false;
        e eVar = this.f3480b.get(0);
        ArrayList<e> arrayList = this.f3480b;
        e eVar2 = arrayList.get(arrayList.size() - 1);
        if (eVar.f3515b != 0) {
            f12 = eVar.f3518e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (eVar2.f3515b != this.f3485e.b() - 1) {
            f13 = eVar2.f3518e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.V.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.W.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.B = (scrollX - i10) + this.B;
        scrollTo(i10, getScrollY());
        n(i10);
        return z12;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3482c0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f3494i0);
        Scroller scroller = this.f3493i;
        if (scroller != null && !scroller.isFinished()) {
            this.f3493i.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i10;
        float f10;
        float f11;
        super.onDraw(canvas);
        if (this.f3498l <= 0 || this.f3499m == null || this.f3480b.size() <= 0 || this.f3485e == null) {
            return;
        }
        int scrollX = getScrollX();
        float width2 = getWidth();
        float f12 = this.f3498l / width2;
        int i11 = 0;
        e eVar = this.f3480b.get(0);
        float f13 = eVar.f3518e;
        int size = this.f3480b.size();
        int i12 = eVar.f3515b;
        int i13 = this.f3480b.get(size - 1).f3515b;
        while (i12 < i13) {
            while (true) {
                i10 = eVar.f3515b;
                if (i12 <= i10 || i11 >= size) {
                    break;
                }
                i11++;
                eVar = this.f3480b.get(i11);
            }
            if (i12 == i10) {
                float f14 = eVar.f3518e;
                float f15 = eVar.f3517d;
                f10 = (f14 + f15) * width2;
                f13 = f14 + f15 + f12;
            } else {
                this.f3485e.getClass();
                f10 = (f13 + 1.0f) * width2;
                f13 = 1.0f + f12 + f13;
            }
            if (this.f3498l + f10 > scrollX) {
                f11 = f12;
                this.f3499m.setBounds(Math.round(f10), this.f3500n, Math.round(this.f3498l + f10), this.f3501o);
                this.f3499m.draw(canvas);
            } else {
                f11 = f12;
            }
            if (f10 > scrollX + width) {
                return;
            }
            i12++;
            f12 = f11;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f10;
        boolean z10;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.f3509w) {
                    return true;
                }
                if (this.f3510x) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        l(motionEvent);
                    }
                } else {
                    int i10 = this.F;
                    if (i10 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        float x10 = motionEvent.getX(findPointerIndex);
                        float f11 = x10 - this.B;
                        float abs = Math.abs(f11);
                        float y10 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y10 - this.E);
                        int i11 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                        if (i11 != 0) {
                            float f12 = this.B;
                            if ((f12 < this.f3512z && i11 > 0) || (f12 > getWidth() - this.f3512z && f11 < 0.0f)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10 && c((int) f11, (int) x10, (int) y10, this, false)) {
                                this.B = x10;
                                this.C = y10;
                                this.f3510x = true;
                                return false;
                            }
                        }
                        float f13 = this.A;
                        if (abs > f13 && abs * 0.5f > abs2) {
                            this.f3509w = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            float f14 = this.D;
                            float f15 = this.A;
                            if (i11 > 0) {
                                f10 = f14 + f15;
                            } else {
                                f10 = f14 - f15;
                            }
                            this.B = f10;
                            this.C = y10;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > f13) {
                            this.f3510x = true;
                        }
                        if (this.f3509w && o(x10)) {
                            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                            o0.d.k(this);
                        }
                    }
                }
            } else {
                float x11 = motionEvent.getX();
                this.D = x11;
                this.B = x11;
                float y11 = motionEvent.getY();
                this.E = y11;
                this.C = y11;
                this.F = motionEvent.getPointerId(0);
                this.f3510x = false;
                this.f3495j = true;
                this.f3493i.computeScrollOffset();
                if (this.f3496j0 == 2 && Math.abs(this.f3493i.getFinalX() - this.f3493i.getCurrX()) > this.U) {
                    this.f3493i.abortAnimation();
                    this.f3507u = false;
                    p();
                    this.f3509w = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                } else {
                    d(false);
                    this.f3509w = false;
                }
            }
            if (this.H == null) {
                this.H = VelocityTracker.obtain();
            }
            this.H.addMovement(motionEvent);
            return this.f3509w;
        }
        s();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00a8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        e h10;
        int childCount = getChildCount();
        int i13 = -1;
        if ((i10 & 2) != 0) {
            i13 = childCount;
            i11 = 0;
            i12 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
        }
        while (i11 != i13) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (h10 = h(childAt)) != null && h10.f3515b == this.f3487f && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.f24504a);
        if (this.f3485e != null) {
            u(kVar.f3525c, 0, false, true);
            return;
        }
        this.f3489g = kVar.f3525c;
        this.f3491h = kVar.f3526d;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k kVar = new k(super.onSaveInstanceState());
        kVar.f3525c = this.f3487f;
        b3.a aVar = this.f3485e;
        if (aVar != null) {
            aVar.getClass();
            kVar.f3526d = null;
        }
        return kVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f3498l;
            r(i10, i12, i14, i14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x019c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        q(this.f3487f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:279:0x0056, code lost:
        if (r5 == r6) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x00b6, code lost:
        if (r6 >= 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x00c4, code lost:
        if (r6 >= 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x00d2, code lost:
        if (r6 >= 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x00d4, code lost:
        r7 = r14.f3480b.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x00dd, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0132, code lost:
        if (r10 < r14.f3480b.size()) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0146, code lost:
        if (r10 < r14.f3480b.size()) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0158, code lost:
        if (r10 < r14.f3480b.size()) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x015a, code lost:
        r7 = r14.f3480b.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0163, code lost:
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:448:0x02f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(int r15) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.q(int):void");
    }

    public final void r(int i10, int i11, int i12, int i13) {
        int min;
        if (i11 <= 0 || this.f3480b.isEmpty()) {
            e j10 = j(this.f3487f);
            min = (int) ((j10 != null ? Math.min(j10.f3518e, this.f3503q) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
            if (min == getScrollX()) {
                return;
            }
            d(false);
        } else if (!this.f3493i.isFinished()) {
            this.f3493i.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12));
        }
        scrollTo(min, getScrollY());
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f3505s) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final boolean s() {
        this.F = -1;
        this.f3509w = false;
        this.f3510x = false;
        VelocityTracker velocityTracker = this.H;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.H = null;
        }
        this.V.onRelease();
        this.W.onRelease();
        if (!this.V.isFinished() && !this.W.isFinished()) {
            return false;
        }
        return true;
    }

    public void setAdapter(b3.a aVar) {
        b3.a aVar2 = this.f3485e;
        if (aVar2 != null) {
            synchronized (aVar2) {
            }
            this.f3485e.getClass();
            for (int i10 = 0; i10 < this.f3480b.size(); i10++) {
                e eVar = this.f3480b.get(i10);
                b3.a aVar3 = this.f3485e;
                int i11 = eVar.f3515b;
                aVar3.a(this, eVar.f3514a);
            }
            this.f3485e.getClass();
            this.f3480b.clear();
            int i12 = 0;
            while (i12 < getChildCount()) {
                if (!((f) getChildAt(i12).getLayoutParams()).f3519a) {
                    removeViewAt(i12);
                    i12--;
                }
                i12++;
            }
            this.f3487f = 0;
            scrollTo(0, 0);
        }
        b3.a aVar4 = this.f3485e;
        this.f3485e = aVar;
        this.f3479a = 0;
        if (aVar != null) {
            if (this.f3497k == null) {
                this.f3497k = new j();
            }
            synchronized (this.f3485e) {
            }
            this.f3507u = false;
            boolean z10 = this.f3482c0;
            this.f3482c0 = true;
            this.f3479a = this.f3485e.b();
            if (this.f3489g >= 0) {
                this.f3485e.getClass();
                u(this.f3489g, 0, false, true);
                this.f3489g = -1;
                this.f3491h = null;
            } else if (!z10) {
                p();
            } else {
                requestLayout();
            }
        }
        ArrayList arrayList = this.f3492h0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.f3492h0.size();
            for (int i13 = 0; i13 < size; i13++) {
                ((h) this.f3492h0.get(i13)).a(this, aVar4, aVar);
            }
        }
    }

    public void setCurrentItem(int i10) {
        this.f3507u = false;
        u(i10, 0, !this.f3482c0, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.f3508v) {
            this.f3508v = i10;
            p();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(i iVar) {
        this.f3490g0 = iVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f3498l;
        this.f3498l = i10;
        int width = getWidth();
        r(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(int i10) {
        Context context = getContext();
        Object obj = y0.a.f30807a;
        setPageMarginDrawable(a.c.b(context, i10));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f3499m = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.f3496j0 == i10) {
            return;
        }
        this.f3496j0 = i10;
        i iVar = this.f3490g0;
        if (iVar != null) {
            iVar.b(i10);
        }
        ArrayList arrayList = this.f3488f0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                i iVar2 = (i) this.f3488f0.get(i11);
                if (iVar2 != null) {
                    iVar2.b(i10);
                }
            }
        }
    }

    public final void t(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        boolean z12;
        int scrollX;
        int abs;
        e j10 = j(i10);
        if (j10 != null) {
            i12 = (int) (Math.max(this.f3502p, Math.min(j10.f3518e, this.f3503q)) * getClientWidth());
        } else {
            i12 = 0;
        }
        if (z10) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.f3493i;
                if (scroller != null && !scroller.isFinished()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (this.f3495j) {
                        scrollX = this.f3493i.getCurrX();
                    } else {
                        scrollX = this.f3493i.getStartX();
                    }
                    this.f3493i.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    scrollX = getScrollX();
                }
                int i13 = scrollX;
                int scrollY = getScrollY();
                int i14 = i12 - i13;
                int i15 = 0 - scrollY;
                if (i14 == 0 && i15 == 0) {
                    d(false);
                    p();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    int i16 = clientWidth / 2;
                    float f10 = clientWidth;
                    float f11 = i16;
                    float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i14) * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
                    int abs2 = Math.abs(i11);
                    if (abs2 > 0) {
                        abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                    } else {
                        this.f3485e.getClass();
                        abs = (int) (((Math.abs(i14) / ((f10 * 1.0f) + this.f3498l)) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(abs, 600);
                    this.f3495j = false;
                    this.f3493i.startScroll(i13, scrollY, i14, i15, min);
                    WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                    o0.d.k(this);
                }
            }
            if (z11) {
                f(i10);
                return;
            }
            return;
        }
        if (z11) {
            f(i10);
        }
        d(false);
        scrollTo(i12, 0);
        n(i12);
    }

    public final void u(int i10, int i11, boolean z10, boolean z11) {
        b3.a aVar = this.f3485e;
        if (aVar == null || aVar.b() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z11 || this.f3487f != i10 || this.f3480b.size() == 0) {
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.f3485e.b()) {
                i10 = this.f3485e.b() - 1;
            }
            int i12 = this.f3508v;
            int i13 = this.f3487f;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < this.f3480b.size(); i14++) {
                    this.f3480b.get(i14).f3516c = true;
                }
            }
            boolean z12 = this.f3487f != i10;
            if (!this.f3482c0) {
                q(i10);
                t(i10, i11, z10, z12);
                return;
            }
            this.f3487f = i10;
            if (z12) {
                f(i10);
            }
            requestLayout();
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3499m;
    }
}
