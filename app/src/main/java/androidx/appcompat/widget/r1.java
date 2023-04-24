package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k1.o0;
import o1.j;

/* loaded from: classes.dex */
public class r1 implements l.f {
    public static Method A;
    public static Method B;

    /* renamed from: z */
    public static Method f1496z;

    /* renamed from: a */
    public Context f1497a;

    /* renamed from: b */
    public ListAdapter f1498b;

    /* renamed from: c */
    public m1 f1499c;

    /* renamed from: f */
    public int f1502f;

    /* renamed from: g */
    public int f1503g;

    /* renamed from: i */
    public boolean f1505i;

    /* renamed from: j */
    public boolean f1506j;

    /* renamed from: k */
    public boolean f1507k;

    /* renamed from: n */
    public d f1510n;

    /* renamed from: o */
    public View f1511o;

    /* renamed from: p */
    public AdapterView.OnItemClickListener f1512p;

    /* renamed from: u */
    public final Handler f1517u;

    /* renamed from: w */
    public Rect f1519w;

    /* renamed from: x */
    public boolean f1520x;

    /* renamed from: y */
    public r f1521y;

    /* renamed from: d */
    public int f1500d = -2;

    /* renamed from: e */
    public int f1501e = -2;

    /* renamed from: h */
    public int f1504h = 1002;

    /* renamed from: l */
    public int f1508l = 0;

    /* renamed from: m */
    public int f1509m = Integer.MAX_VALUE;

    /* renamed from: q */
    public final g f1513q = new g();

    /* renamed from: r */
    public final f f1514r = new f();

    /* renamed from: s */
    public final e f1515s = new e();

    /* renamed from: t */
    public final c f1516t = new c();

    /* renamed from: v */
    public final Rect f1518v = new Rect();

    /* loaded from: classes.dex */
    public static class a {
        public static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            int maxAvailableHeight;
            maxAvailableHeight = popupWindow.getMaxAvailableHeight(view, i10, z10);
            return maxAvailableHeight;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
            r1.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m1 m1Var = r1.this.f1499c;
            if (m1Var != null) {
                m1Var.setListSelectionHidden(true);
                m1Var.requestLayout();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends DataSetObserver {
        public d() {
            r1.this = r1;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            if (r1.this.a()) {
                r1.this.b();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            r1.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class e implements AbsListView.OnScrollListener {
        public e() {
            r1.this = r1;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i10) {
            boolean z10 = true;
            if (i10 == 1) {
                if (r1.this.f1521y.getInputMethodMode() != 2) {
                    z10 = false;
                }
                if (!z10 && r1.this.f1521y.getContentView() != null) {
                    r1 r1Var = r1.this;
                    r1Var.f1517u.removeCallbacks(r1Var.f1513q);
                    r1.this.f1513q.run();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnTouchListener {
        public f() {
            r1.this = r1;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            r rVar;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (rVar = r1.this.f1521y) != null && rVar.isShowing() && x10 >= 0 && x10 < r1.this.f1521y.getWidth() && y10 >= 0 && y10 < r1.this.f1521y.getHeight()) {
                r1 r1Var = r1.this;
                r1Var.f1517u.postDelayed(r1Var.f1513q, 250L);
                return false;
            } else if (action == 1) {
                r1 r1Var2 = r1.this;
                r1Var2.f1517u.removeCallbacks(r1Var2.f1513q);
                return false;
            } else {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {
        public g() {
            r1.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m1 m1Var = r1.this.f1499c;
            if (m1Var != null) {
                WeakHashMap<View, k1.i2> weakHashMap = k1.o0.f18161a;
                if (o0.g.b(m1Var) && r1.this.f1499c.getCount() > r1.this.f1499c.getChildCount()) {
                    int childCount = r1.this.f1499c.getChildCount();
                    r1 r1Var = r1.this;
                    if (childCount <= r1Var.f1509m) {
                        r1Var.f1521y.setInputMethodMode(2);
                        r1.this.b();
                    }
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f1496z = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                A = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public r1(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1497a = context;
        this.f1517u = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ListPopupWindow, i10, i11);
        this.f1502f = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f1503g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1505i = true;
        }
        obtainStyledAttributes.recycle();
        r rVar = new r(context, attributeSet, i10, i11);
        this.f1521y = rVar;
        rVar.setInputMethodMode(1);
    }

    @Override // l.f
    public final boolean a() {
        return this.f1521y.isShowing();
    }

    @Override // l.f
    public final void b() {
        int i10;
        boolean z10;
        int a10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        m1 m1Var;
        int i14;
        int i15;
        int i16;
        if (this.f1499c == null) {
            m1 q10 = q(this.f1497a, !this.f1520x);
            this.f1499c = q10;
            q10.setAdapter(this.f1498b);
            this.f1499c.setOnItemClickListener(this.f1512p);
            this.f1499c.setFocusable(true);
            this.f1499c.setFocusableInTouchMode(true);
            this.f1499c.setOnItemSelectedListener(new p1(this));
            this.f1499c.setOnScrollListener(this.f1515s);
            this.f1521y.setContentView(this.f1499c);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f1521y.getContentView();
        }
        Drawable background = this.f1521y.getBackground();
        int i17 = 0;
        if (background != null) {
            background.getPadding(this.f1518v);
            Rect rect = this.f1518v;
            int i18 = rect.top;
            i10 = rect.bottom + i18;
            if (!this.f1505i) {
                this.f1503g = -i18;
            }
        } else {
            this.f1518v.setEmpty();
            i10 = 0;
        }
        if (this.f1521y.getInputMethodMode() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        View view = this.f1511o;
        int i19 = this.f1503g;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = A;
            if (method != null) {
                try {
                    a10 = ((Integer) method.invoke(this.f1521y, view, Integer.valueOf(i19), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a10 = this.f1521y.getMaxAvailableHeight(view, i19);
        } else {
            a10 = a.a(this.f1521y, view, i19, z10);
        }
        if (this.f1500d == -1) {
            i13 = a10 + i10;
        } else {
            int i20 = this.f1501e;
            if (i20 != -2) {
                i11 = 1073741824;
                if (i20 == -1) {
                    int i21 = this.f1497a.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.f1518v;
                    i20 = i21 - (rect2.left + rect2.right);
                }
            } else {
                int i22 = this.f1497a.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.f1518v;
                i20 = i22 - (rect3.left + rect3.right);
                i11 = Integer.MIN_VALUE;
            }
            int a11 = this.f1499c.a(View.MeasureSpec.makeMeasureSpec(i20, i11), a10 + 0);
            if (a11 > 0) {
                i12 = this.f1499c.getPaddingBottom() + this.f1499c.getPaddingTop() + i10 + 0;
            } else {
                i12 = 0;
            }
            i13 = a11 + i12;
        }
        if (this.f1521y.getInputMethodMode() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        o1.j.b(this.f1521y, this.f1504h);
        if (this.f1521y.isShowing()) {
            View view2 = this.f1511o;
            WeakHashMap<View, k1.i2> weakHashMap = k1.o0.f18161a;
            if (!o0.g.b(view2)) {
                return;
            }
            int i23 = this.f1501e;
            if (i23 == -1) {
                i23 = -1;
            } else if (i23 == -2) {
                i23 = this.f1511o.getWidth();
            }
            int i24 = this.f1500d;
            if (i24 == -1) {
                if (!z11) {
                    i13 = -1;
                }
                if (z11) {
                    r rVar = this.f1521y;
                    if (this.f1501e == -1) {
                        i16 = -1;
                    } else {
                        i16 = 0;
                    }
                    rVar.setWidth(i16);
                    this.f1521y.setHeight(0);
                } else {
                    r rVar2 = this.f1521y;
                    if (this.f1501e == -1) {
                        i17 = -1;
                    }
                    rVar2.setWidth(i17);
                    this.f1521y.setHeight(-1);
                }
            } else if (i24 != -2) {
                i13 = i24;
            }
            this.f1521y.setOutsideTouchable(true);
            r rVar3 = this.f1521y;
            View view3 = this.f1511o;
            int i25 = this.f1502f;
            int i26 = this.f1503g;
            if (i23 < 0) {
                i14 = -1;
            } else {
                i14 = i23;
            }
            if (i13 < 0) {
                i15 = -1;
            } else {
                i15 = i13;
            }
            rVar3.update(view3, i25, i26, i14, i15);
            return;
        }
        int i27 = this.f1501e;
        if (i27 == -1) {
            i27 = -1;
        } else if (i27 == -2) {
            i27 = this.f1511o.getWidth();
        }
        int i28 = this.f1500d;
        if (i28 == -1) {
            i13 = -1;
        } else if (i28 != -2) {
            i13 = i28;
        }
        this.f1521y.setWidth(i27);
        this.f1521y.setHeight(i13);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f1496z;
            if (method2 != null) {
                try {
                    method2.invoke(this.f1521y, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            b.b(this.f1521y, true);
        }
        this.f1521y.setOutsideTouchable(true);
        this.f1521y.setTouchInterceptor(this.f1514r);
        if (this.f1507k) {
            o1.j.a(this.f1521y, this.f1506j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = B;
            if (method3 != null) {
                try {
                    method3.invoke(this.f1521y, this.f1519w);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            b.a(this.f1521y, this.f1519w);
        }
        j.a.a(this.f1521y, this.f1511o, this.f1502f, this.f1503g, this.f1508l);
        this.f1499c.setSelection(-1);
        if ((!this.f1520x || this.f1499c.isInTouchMode()) && (m1Var = this.f1499c) != null) {
            m1Var.setListSelectionHidden(true);
            m1Var.requestLayout();
        }
        if (!this.f1520x) {
            this.f1517u.post(this.f1516t);
        }
    }

    public final int c() {
        return this.f1502f;
    }

    @Override // l.f
    public final void dismiss() {
        this.f1521y.dismiss();
        this.f1521y.setContentView(null);
        this.f1499c = null;
        this.f1517u.removeCallbacks(this.f1513q);
    }

    public final void e(int i10) {
        this.f1502f = i10;
    }

    public final Drawable h() {
        return this.f1521y.getBackground();
    }

    @Override // l.f
    public final m1 j() {
        return this.f1499c;
    }

    public final void k(Drawable drawable) {
        this.f1521y.setBackgroundDrawable(drawable);
    }

    public final void l(int i10) {
        this.f1503g = i10;
        this.f1505i = true;
    }

    public final int o() {
        if (this.f1505i) {
            return this.f1503g;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        d dVar = this.f1510n;
        if (dVar == null) {
            this.f1510n = new d();
        } else {
            ListAdapter listAdapter2 = this.f1498b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.f1498b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1510n);
        }
        m1 m1Var = this.f1499c;
        if (m1Var != null) {
            m1Var.setAdapter(this.f1498b);
        }
    }

    public m1 q(Context context, boolean z10) {
        return new m1(context, z10);
    }

    public final void r(int i10) {
        Drawable background = this.f1521y.getBackground();
        if (background == null) {
            this.f1501e = i10;
            return;
        }
        background.getPadding(this.f1518v);
        Rect rect = this.f1518v;
        this.f1501e = rect.left + rect.right + i10;
    }
}
