package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;
import androidx.viewpager2.R;
import androidx.viewpager2.widget.c;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import l1.j;
import l1.n;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: a */
    public final Rect f3556a;

    /* renamed from: b */
    public final Rect f3557b;

    /* renamed from: c */
    public androidx.viewpager2.widget.a f3558c;

    /* renamed from: d */
    public int f3559d;

    /* renamed from: e */
    public boolean f3560e;

    /* renamed from: f */
    public a f3561f;

    /* renamed from: g */
    public d f3562g;

    /* renamed from: h */
    public int f3563h;

    /* renamed from: i */
    public Parcelable f3564i;

    /* renamed from: j */
    public i f3565j;

    /* renamed from: k */
    public h f3566k;

    /* renamed from: l */
    public androidx.viewpager2.widget.c f3567l;

    /* renamed from: m */
    public androidx.viewpager2.widget.a f3568m;

    /* renamed from: n */
    public c3.c f3569n;

    /* renamed from: o */
    public androidx.viewpager2.widget.b f3570o;

    /* renamed from: p */
    public RecyclerView.j f3571p;

    /* renamed from: q */
    public boolean f3572q;

    /* renamed from: r */
    public boolean f3573r;

    /* renamed from: s */
    public int f3574s;

    /* renamed from: t */
    public f f3575t;

    /* loaded from: classes.dex */
    public class a extends c {
        public a() {
            ViewPager2.this = r1;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.c, androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f3560e = true;
            viewPager2.f3567l.f3602l = true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class b {
    }

    /* loaded from: classes.dex */
    public static abstract class c extends RecyclerView.g {
        @Override // androidx.recyclerview.widget.RecyclerView.g
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void b(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void c(int i10, int i11, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void d(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void e(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void f(int i10, int i11) {
            a();
        }
    }

    /* loaded from: classes.dex */
    public class d extends LinearLayoutManager {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d() {
            super(1);
            ViewPager2.this = r1;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void E0(RecyclerView.y yVar, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.E0(yVar, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final void W(RecyclerView.t tVar, RecyclerView.y yVar, l1.j jVar) {
            super.W(tVar, yVar, jVar);
            ViewPager2.this.f3575t.getClass();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final boolean j0(RecyclerView.t tVar, RecyclerView.y yVar, int i10, Bundle bundle) {
            ViewPager2.this.f3575t.getClass();
            return super.j0(tVar, yVar, i10, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public final boolean o0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public void a(int i10) {
        }

        public void b(float f10, int i10, int i11) {
        }

        public void c(int i10) {
        }
    }

    /* loaded from: classes.dex */
    public class f extends b {

        /* renamed from: a */
        public final a f3577a = new a();

        /* renamed from: b */
        public final b f3578b = new b();

        /* renamed from: c */
        public androidx.viewpager2.widget.f f3579c;

        /* loaded from: classes.dex */
        public class a implements n {
            public a() {
                f.this = r1;
            }

            @Override // l1.n
            public final boolean a(View view) {
                f fVar = f.this;
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.f3573r) {
                    viewPager2.b(currentItem, true);
                }
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class b implements n {
            public b() {
                f.this = r1;
            }

            @Override // l1.n
            public final boolean a(View view) {
                f fVar = f.this;
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.f3573r) {
                    viewPager2.b(currentItem, true);
                }
                return true;
            }
        }

        public f() {
            ViewPager2.this = r1;
        }

        public final void a(RecyclerView recyclerView) {
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.d.s(recyclerView, 2);
            this.f3579c = new androidx.viewpager2.widget.f(this);
            if (o0.d.c(ViewPager2.this) == 0) {
                o0.d.s(ViewPager2.this, 1);
            }
        }

        public final void b() {
            int e10;
            int i10;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i11 = 16908360;
            o0.m(viewPager2, 16908360);
            boolean z10 = false;
            o0.h(viewPager2, 0);
            o0.m(viewPager2, 16908361);
            o0.h(viewPager2, 0);
            o0.m(viewPager2, 16908358);
            o0.h(viewPager2, 0);
            o0.m(viewPager2, 16908359);
            o0.h(viewPager2, 0);
            if (ViewPager2.this.getAdapter() == null || (e10 = ViewPager2.this.getAdapter().e()) == 0) {
                return;
            }
            ViewPager2 viewPager22 = ViewPager2.this;
            if (!viewPager22.f3573r) {
                return;
            }
            if (viewPager22.getOrientation() == 0) {
                if (ViewPager2.this.f3562g.B() == 1) {
                    z10 = true;
                }
                if (z10) {
                    i10 = 16908360;
                } else {
                    i10 = 16908361;
                }
                if (z10) {
                    i11 = 16908361;
                }
                if (ViewPager2.this.f3559d < e10 - 1) {
                    o0.n(viewPager2, new j.a(i10), this.f3577a);
                }
                if (ViewPager2.this.f3559d > 0) {
                    o0.n(viewPager2, new j.a(i11), this.f3578b);
                    return;
                }
                return;
            }
            if (ViewPager2.this.f3559d < e10 - 1) {
                o0.n(viewPager2, new j.a(16908359), this.f3577a);
            }
            if (ViewPager2.this.f3559d > 0) {
                o0.n(viewPager2, new j.a(16908358), this.f3578b);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void a();
    }

    /* loaded from: classes.dex */
    public class h extends f0 {
        public h() {
            ViewPager2.this = r1;
        }

        @Override // androidx.recyclerview.widget.f0, androidx.recyclerview.widget.l0
        public final View c(RecyclerView.m mVar) {
            if (ViewPager2.this.f3569n.f4530a.f3603m) {
                return null;
            }
            return super.c(mVar);
        }
    }

    /* loaded from: classes.dex */
    public class i extends RecyclerView {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Context context) {
            super(context, null);
            ViewPager2.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.f3575t.getClass();
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f3559d);
            accessibilityEvent.setToIndex(ViewPager2.this.f3559d);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (ViewPager2.this.f3573r && super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (ViewPager2.this.f3573r && super.onTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class j extends View.BaseSavedState {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* renamed from: a */
        public int f3584a;

        /* renamed from: b */
        public int f3585b;

        /* renamed from: c */
        public Parcelable f3586c;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<j> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return Build.VERSION.SDK_INT >= 24 ? new j(parcel, null) : new j(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new j[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final j createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new j(parcel, classLoader) : new j(parcel);
            }
        }

        public j(Parcel parcel) {
            super(parcel);
            this.f3584a = parcel.readInt();
            this.f3585b = parcel.readInt();
            this.f3586c = parcel.readParcelable(null);
        }

        public j(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f3584a);
            parcel.writeInt(this.f3585b);
            parcel.writeParcelable(this.f3586c, i10);
        }

        public j(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3584a = parcel.readInt();
            this.f3585b = parcel.readInt();
            this.f3586c = parcel.readParcelable(classLoader);
        }
    }

    /* loaded from: classes.dex */
    public static class k implements Runnable {

        /* renamed from: a */
        public final int f3587a;

        /* renamed from: b */
        public final RecyclerView f3588b;

        public k(int i10, RecyclerView recyclerView) {
            this.f3587a = i10;
            this.f3588b = recyclerView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f3588b.f0(this.f3587a);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3556a = new Rect();
        this.f3557b = new Rect();
        this.f3558c = new androidx.viewpager2.widget.a();
        this.f3560e = false;
        this.f3561f = new a();
        this.f3563h = -1;
        this.f3571p = null;
        this.f3572q = false;
        this.f3573r = true;
        this.f3574s = -1;
        this.f3575t = new f();
        i iVar = new i(context);
        this.f3565j = iVar;
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        iVar.setId(o0.e.a());
        this.f3565j.setDescendantFocusability(131072);
        d dVar = new d();
        this.f3562g = dVar;
        this.f3565j.setLayoutManager(dVar);
        this.f3565j.setScrollingTouchSlop(1);
        int[] iArr = R.styleable.ViewPager2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(R.styleable.ViewPager2_android_orientation, 0));
            obtainStyledAttributes.recycle();
            this.f3565j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            i iVar2 = this.f3565j;
            c3.d dVar2 = new c3.d();
            if (iVar2.C == null) {
                iVar2.C = new ArrayList();
            }
            iVar2.C.add(dVar2);
            androidx.viewpager2.widget.c cVar = new androidx.viewpager2.widget.c(this);
            this.f3567l = cVar;
            this.f3569n = new c3.c(cVar);
            h hVar = new h();
            this.f3566k = hVar;
            hVar.a(this.f3565j);
            this.f3565j.h(this.f3567l);
            androidx.viewpager2.widget.a aVar = new androidx.viewpager2.widget.a();
            this.f3568m = aVar;
            this.f3567l.f3591a = aVar;
            androidx.viewpager2.widget.d dVar3 = new androidx.viewpager2.widget.d(this);
            androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this);
            this.f3568m.f3589a.add(dVar3);
            this.f3568m.f3589a.add(eVar);
            this.f3575t.a(this.f3565j);
            androidx.viewpager2.widget.a aVar2 = this.f3568m;
            aVar2.f3589a.add(this.f3558c);
            androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(this.f3562g);
            this.f3570o = bVar;
            this.f3568m.f3589a.add(bVar);
            i iVar3 = this.f3565j;
            attachViewToParent(iVar3, 0, iVar3.getLayoutParams());
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void a() {
        RecyclerView.e adapter;
        if (this.f3563h == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.f3564i;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.g) {
                ((androidx.viewpager2.adapter.g) adapter).b(parcelable);
            }
            this.f3564i = null;
        }
        int max = Math.max(0, Math.min(this.f3563h, adapter.e() - 1));
        this.f3559d = max;
        this.f3563h = -1;
        this.f3565j.d0(max);
        this.f3575t.b();
    }

    public final void b(int i10, boolean z10) {
        boolean z11;
        int i11;
        int i12;
        boolean z12;
        RecyclerView.e adapter = getAdapter();
        boolean z13 = false;
        if (adapter == null) {
            if (this.f3563h != -1) {
                this.f3563h = Math.max(i10, 0);
            }
        } else if (adapter.e() <= 0) {
        } else {
            int min = Math.min(Math.max(i10, 0), adapter.e() - 1);
            int i13 = this.f3559d;
            if (min == i13) {
                if (this.f3567l.f3596f == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    return;
                }
            }
            if (min == i13 && z10) {
                return;
            }
            double d10 = i13;
            this.f3559d = min;
            this.f3575t.b();
            androidx.viewpager2.widget.c cVar = this.f3567l;
            if (cVar.f3596f == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                cVar.f();
                c.a aVar = cVar.f3597g;
                d10 = aVar.f3604a + aVar.f3605b;
            }
            androidx.viewpager2.widget.c cVar2 = this.f3567l;
            if (z10) {
                i11 = 2;
            } else {
                i11 = 3;
            }
            cVar2.f3595e = i11;
            cVar2.f3603m = false;
            if (cVar2.f3599i != min) {
                z13 = true;
            }
            cVar2.f3599i = min;
            cVar2.d(2);
            if (z13) {
                cVar2.c(min);
            }
            if (!z10) {
                this.f3565j.d0(min);
                return;
            }
            double d11 = min;
            if (Math.abs(d11 - d10) > 3.0d) {
                i iVar = this.f3565j;
                if (d11 > d10) {
                    i12 = min - 3;
                } else {
                    i12 = min + 3;
                }
                iVar.d0(i12);
                i iVar2 = this.f3565j;
                iVar2.post(new k(min, iVar2));
                return;
            }
            this.f3565j.f0(min);
        }
    }

    public final void c() {
        h hVar = this.f3566k;
        if (hVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View c10 = hVar.c(this.f3562g);
        if (c10 == null) {
            return;
        }
        this.f3562g.getClass();
        int H = RecyclerView.m.H(c10);
        if (H != this.f3559d && getScrollState() == 0) {
            this.f3568m.c(H);
        }
        this.f3560e = false;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.f3565j.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.f3565j.canScrollVertically(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof j) {
            int i10 = ((j) parcelable).f3584a;
            sparseArray.put(this.f3565j.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.f3575t.getClass();
        this.f3575t.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.e getAdapter() {
        return this.f3565j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f3559d;
    }

    public int getItemDecorationCount() {
        return this.f3565j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f3574s;
    }

    public int getOrientation() {
        return this.f3562g.f2832p;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        i iVar = this.f3565j;
        if (getOrientation() == 0) {
            height = iVar.getWidth() - iVar.getPaddingLeft();
            paddingBottom = iVar.getPaddingRight();
        } else {
            height = iVar.getHeight() - iVar.getPaddingTop();
            paddingBottom = iVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f3567l.f3596f;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r6) {
        /*
            r5 = this;
            super.onInitializeAccessibilityNodeInfo(r6)
            androidx.viewpager2.widget.ViewPager2$f r0 = r5.f3575t
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2f
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            int r1 = r1.getOrientation()
            if (r1 != r3) goto L22
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            int r1 = r1.e()
            goto L30
        L22:
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            int r1 = r1.e()
            r4 = r1
            r1 = 0
            goto L31
        L2f:
            r1 = 0
        L30:
            r4 = 0
        L31:
            l1.j$b r1 = l1.j.b.a(r1, r4, r2)
            java.lang.Object r1 = r1.f18685a
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r1 = (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) r1
            r6.setCollectionInfo(r1)
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
            if (r1 != 0) goto L45
            goto L6a
        L45:
            int r1 = r1.e()
            if (r1 == 0) goto L6a
            androidx.viewpager2.widget.ViewPager2 r2 = androidx.viewpager2.widget.ViewPager2.this
            boolean r4 = r2.f3573r
            if (r4 != 0) goto L52
            goto L6a
        L52:
            int r2 = r2.f3559d
            if (r2 <= 0) goto L5b
            r2 = 8192(0x2000, float:1.148E-41)
            r6.addAction(r2)
        L5b:
            androidx.viewpager2.widget.ViewPager2 r0 = androidx.viewpager2.widget.ViewPager2.this
            int r0 = r0.f3559d
            int r1 = r1 - r3
            if (r0 >= r1) goto L67
            r0 = 4096(0x1000, float:5.74E-42)
            r6.addAction(r0)
        L67:
            r6.setScrollable(r3)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.ViewPager2.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f3565j.getMeasuredWidth();
        int measuredHeight = this.f3565j.getMeasuredHeight();
        this.f3556a.left = getPaddingLeft();
        this.f3556a.right = (i12 - i10) - getPaddingRight();
        this.f3556a.top = getPaddingTop();
        this.f3556a.bottom = (i13 - i11) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f3556a, this.f3557b);
        i iVar = this.f3565j;
        Rect rect = this.f3557b;
        iVar.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f3560e) {
            c();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        measureChild(this.f3565j, i10, i11);
        int measuredWidth = this.f3565j.getMeasuredWidth();
        int measuredHeight = this.f3565j.getMeasuredHeight();
        int measuredState = this.f3565j.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingTop = getPaddingTop();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(getPaddingBottom() + paddingTop + measuredHeight, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        this.f3563h = jVar.f3585b;
        this.f3564i = jVar.f3586c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.f3584a = this.f3565j.getId();
        int i10 = this.f3563h;
        if (i10 == -1) {
            i10 = this.f3559d;
        }
        jVar.f3585b = i10;
        Parcelable parcelable = this.f3564i;
        if (parcelable == null) {
            RecyclerView.e adapter = this.f3565j.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.g) {
                parcelable = ((androidx.viewpager2.adapter.g) adapter).a();
            }
            return jVar;
        }
        jVar.f3586c = parcelable;
        return jVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        boolean z10;
        int currentItem;
        this.f3575t.getClass();
        boolean z11 = false;
        if (i10 != 8192 && i10 != 4096) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            f fVar = this.f3575t;
            fVar.getClass();
            if ((i10 == 8192 || i10 == 4096) ? true : true) {
                if (i10 == 8192) {
                    currentItem = ViewPager2.this.getCurrentItem() - 1;
                } else {
                    currentItem = ViewPager2.this.getCurrentItem() + 1;
                }
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.f3573r) {
                    viewPager2.b(currentItem, true);
                }
                return true;
            }
            throw new IllegalStateException();
        }
        return super.performAccessibilityAction(i10, bundle);
    }

    public void setAdapter(RecyclerView.e eVar) {
        RecyclerView.e adapter = this.f3565j.getAdapter();
        f fVar = this.f3575t;
        if (adapter != null) {
            adapter.x(fVar.f3579c);
        } else {
            fVar.getClass();
        }
        if (adapter != null) {
            adapter.x(this.f3561f);
        }
        this.f3565j.setAdapter(eVar);
        this.f3559d = 0;
        a();
        f fVar2 = this.f3575t;
        fVar2.b();
        if (eVar != null) {
            eVar.u(fVar2.f3579c);
        }
        if (eVar != null) {
            eVar.u(this.f3561f);
        }
    }

    public void setCurrentItem(int i10) {
        if (!this.f3569n.f4530a.f3603m) {
            b(i10, true);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f3575t.b();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f3574s = i10;
        this.f3565j.requestLayout();
    }

    public void setOrientation(int i10) {
        this.f3562g.f1(i10);
        this.f3575t.b();
    }

    public void setPageTransformer(g gVar) {
        boolean z10 = this.f3572q;
        if (gVar != null) {
            if (!z10) {
                this.f3571p = this.f3565j.getItemAnimator();
                this.f3572q = true;
            }
            this.f3565j.setItemAnimator(null);
        } else if (z10) {
            this.f3565j.setItemAnimator(this.f3571p);
            this.f3571p = null;
            this.f3572q = false;
        }
        androidx.viewpager2.widget.b bVar = this.f3570o;
        bVar.getClass();
        if (gVar == null) {
            return;
        }
        bVar.getClass();
        if (gVar != null) {
            androidx.viewpager2.widget.c cVar = this.f3567l;
            cVar.f();
            c.a aVar = cVar.f3597g;
            double d10 = aVar.f3604a + aVar.f3605b;
            int i10 = (int) d10;
            float f10 = (float) (d10 - i10);
            this.f3570o.b(f10, i10, Math.round(getPageSize() * f10));
        }
    }

    public void setUserInputEnabled(boolean z10) {
        this.f3573r = z10;
        this.f3575t.b();
    }
}
