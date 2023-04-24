package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.widget.ActionMenuView;
import androidx.fragment.app.j0;
import f.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import k1.j;
import k1.o0;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements k1.i {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList<View> D;
    public final ArrayList<View> E;
    public final int[] F;
    public final k1.j H;
    public ArrayList<MenuItem> L;
    public f M;
    public final a Q;
    public o2 U;
    public androidx.appcompat.widget.c V;
    public d W;

    /* renamed from: a */
    public ActionMenuView f1212a;

    /* renamed from: b */
    public d1 f1213b;

    /* renamed from: c */
    public d1 f1214c;

    /* renamed from: c0 */
    public boolean f1215c0;

    /* renamed from: d */
    public o f1216d;

    /* renamed from: d0 */
    public final b f1217d0;

    /* renamed from: e */
    public AppCompatImageView f1218e;

    /* renamed from: f */
    public Drawable f1219f;

    /* renamed from: g */
    public CharSequence f1220g;

    /* renamed from: h */
    public o f1221h;

    /* renamed from: i */
    public View f1222i;

    /* renamed from: j */
    public Context f1223j;

    /* renamed from: k */
    public int f1224k;

    /* renamed from: l */
    public int f1225l;

    /* renamed from: m */
    public int f1226m;

    /* renamed from: n */
    public int f1227n;

    /* renamed from: o */
    public int f1228o;

    /* renamed from: p */
    public int f1229p;

    /* renamed from: q */
    public int f1230q;

    /* renamed from: r */
    public int f1231r;

    /* renamed from: s */
    public int f1232s;

    /* renamed from: t */
    public b2 f1233t;

    /* renamed from: u */
    public int f1234u;

    /* renamed from: v */
    public int f1235v;

    /* renamed from: w */
    public int f1236w;

    /* renamed from: x */
    public CharSequence f1237x;

    /* renamed from: y */
    public CharSequence f1238y;

    /* renamed from: z */
    public ColorStateList f1239z;

    /* loaded from: classes.dex */
    public class a implements ActionMenuView.e {
        public a() {
            Toolbar.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            Toolbar.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.appcompat.widget.c cVar;
            ActionMenuView actionMenuView = Toolbar.this.f1212a;
            if (actionMenuView != null && (cVar = actionMenuView.f1079t) != null) {
                cVar.n();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
            Toolbar.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            androidx.appcompat.view.menu.h hVar;
            d dVar = Toolbar.this.W;
            if (dVar == null) {
                hVar = null;
            } else {
                hVar = dVar.f1244b;
            }
            if (hVar != null) {
                hVar.collapseActionView();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements androidx.appcompat.view.menu.j {

        /* renamed from: a */
        public androidx.appcompat.view.menu.f f1243a;

        /* renamed from: b */
        public androidx.appcompat.view.menu.h f1244b;

        public d() {
            Toolbar.this = r1;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.j
        public final void d(boolean z10) {
            if (this.f1244b != null) {
                androidx.appcompat.view.menu.f fVar = this.f1243a;
                boolean z11 = false;
                if (fVar != null) {
                    int size = fVar.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        } else if (this.f1243a.getItem(i10) == this.f1244b) {
                            z11 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (z11) {
                    return;
                }
                g(this.f1244b);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean e() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean g(androidx.appcompat.view.menu.h hVar) {
            View view = Toolbar.this.f1222i;
            if (view instanceof k.b) {
                ((k.b) view).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1222i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1221h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1222i = null;
            int size = toolbar3.E.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar3.addView(toolbar3.E.get(size));
                } else {
                    toolbar3.E.clear();
                    this.f1244b = null;
                    Toolbar.this.requestLayout();
                    hVar.C = false;
                    hVar.f972n.p(false);
                    return true;
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public final int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void h(Context context, androidx.appcompat.view.menu.f fVar) {
            androidx.appcompat.view.menu.h hVar;
            androidx.appcompat.view.menu.f fVar2 = this.f1243a;
            if (fVar2 != null && (hVar = this.f1244b) != null) {
                fVar2.d(hVar);
            }
            this.f1243a = fVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public final void i(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean k(androidx.appcompat.view.menu.m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public final Parcelable l() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.j
        public final boolean m(androidx.appcompat.view.menu.h hVar) {
            Toolbar.this.c();
            ViewParent parent = Toolbar.this.f1221h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1221h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1221h);
            }
            Toolbar.this.f1222i = hVar.getActionView();
            this.f1244b = hVar;
            ViewParent parent2 = Toolbar.this.f1222i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1222i);
                }
                Toolbar.this.getClass();
                e eVar = new e();
                Toolbar toolbar4 = Toolbar.this;
                eVar.f13867a = 8388611 | (toolbar4.f1227n & 112);
                eVar.f1246b = 2;
                toolbar4.f1222i.setLayoutParams(eVar);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1222i);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (((e) childAt.getLayoutParams()).f1246b != 2 && childAt != toolbar6.f1212a) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.E.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            hVar.C = true;
            hVar.f972n.p(false);
            View view = Toolbar.this.f1222i;
            if (view instanceof k.b) {
                ((k.b) view).onActionViewExpanded();
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends a.C0245a {

        /* renamed from: b */
        public int f1246b;

        public e() {
            this.f1246b = 0;
            this.f13867a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1246b = 0;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1246b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1246b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(e eVar) {
            super((a.C0245a) eVar);
            this.f1246b = 0;
            this.f1246b = eVar.f1246b;
        }

        public e(a.C0245a c0245a) {
            super(c0245a);
            this.f1246b = 0;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void onMenuItemClick(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public static class g extends q1.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c */
        public int f1247c;

        /* renamed from: d */
        public boolean f1248d;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new g[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1247c = parcel.readInt();
            this.f1248d = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // q1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f24504a, i10);
            parcel.writeInt(this.f1247c);
            parcel.writeInt(this.f1248d ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1236w = 8388627;
        this.D = new ArrayList<>();
        this.E = new ArrayList<>();
        this.F = new int[2];
        this.H = new k1.j(new m2(0, this));
        this.L = new ArrayList<>();
        this.Q = new a();
        this.f1217d0 = new b();
        Context context2 = getContext();
        int[] iArr = R.styleable.Toolbar;
        l2 m10 = l2.m(context2, attributeSet, iArr, i10);
        k1.o0.o(this, context, iArr, attributeSet, m10.f1415b, i10);
        this.f1225l = m10.i(R.styleable.Toolbar_titleTextAppearance, 0);
        this.f1226m = m10.i(R.styleable.Toolbar_subtitleTextAppearance, 0);
        this.f1236w = m10.f1415b.getInteger(R.styleable.Toolbar_android_gravity, this.f1236w);
        this.f1227n = m10.f1415b.getInteger(R.styleable.Toolbar_buttonGravity, 48);
        int c10 = m10.c(R.styleable.Toolbar_titleMargin, 0);
        int i11 = R.styleable.Toolbar_titleMargins;
        c10 = m10.l(i11) ? m10.c(i11, c10) : c10;
        this.f1232s = c10;
        this.f1231r = c10;
        this.f1230q = c10;
        this.f1229p = c10;
        int c11 = m10.c(R.styleable.Toolbar_titleMarginStart, -1);
        if (c11 >= 0) {
            this.f1229p = c11;
        }
        int c12 = m10.c(R.styleable.Toolbar_titleMarginEnd, -1);
        if (c12 >= 0) {
            this.f1230q = c12;
        }
        int c13 = m10.c(R.styleable.Toolbar_titleMarginTop, -1);
        if (c13 >= 0) {
            this.f1231r = c13;
        }
        int c14 = m10.c(R.styleable.Toolbar_titleMarginBottom, -1);
        if (c14 >= 0) {
            this.f1232s = c14;
        }
        this.f1228o = m10.d(R.styleable.Toolbar_maxButtonHeight, -1);
        int c15 = m10.c(R.styleable.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int c16 = m10.c(R.styleable.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int d10 = m10.d(R.styleable.Toolbar_contentInsetLeft, 0);
        int d11 = m10.d(R.styleable.Toolbar_contentInsetRight, 0);
        if (this.f1233t == null) {
            this.f1233t = new b2();
        }
        b2 b2Var = this.f1233t;
        b2Var.f1272h = false;
        if (d10 != Integer.MIN_VALUE) {
            b2Var.f1269e = d10;
            b2Var.f1265a = d10;
        }
        if (d11 != Integer.MIN_VALUE) {
            b2Var.f1270f = d11;
            b2Var.f1266b = d11;
        }
        if (c15 != Integer.MIN_VALUE || c16 != Integer.MIN_VALUE) {
            b2Var.a(c15, c16);
        }
        this.f1234u = m10.c(R.styleable.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f1235v = m10.c(R.styleable.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f1219f = m10.e(R.styleable.Toolbar_collapseIcon);
        this.f1220g = m10.k(R.styleable.Toolbar_collapseContentDescription);
        CharSequence k10 = m10.k(R.styleable.Toolbar_title);
        if (!TextUtils.isEmpty(k10)) {
            setTitle(k10);
        }
        CharSequence k11 = m10.k(R.styleable.Toolbar_subtitle);
        if (!TextUtils.isEmpty(k11)) {
            setSubtitle(k11);
        }
        this.f1223j = getContext();
        setPopupTheme(m10.i(R.styleable.Toolbar_popupTheme, 0));
        Drawable e10 = m10.e(R.styleable.Toolbar_navigationIcon);
        if (e10 != null) {
            setNavigationIcon(e10);
        }
        CharSequence k12 = m10.k(R.styleable.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(k12)) {
            setNavigationContentDescription(k12);
        }
        Drawable e11 = m10.e(R.styleable.Toolbar_logo);
        if (e11 != null) {
            setLogo(e11);
        }
        CharSequence k13 = m10.k(R.styleable.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(k13)) {
            setLogoDescription(k13);
        }
        int i12 = R.styleable.Toolbar_titleTextColor;
        if (m10.l(i12)) {
            setTitleTextColor(m10.b(i12));
        }
        int i13 = R.styleable.Toolbar_subtitleTextColor;
        if (m10.l(i13)) {
            setSubtitleTextColor(m10.b(i13));
        }
        int i14 = R.styleable.Toolbar_menu;
        if (m10.l(i14)) {
            k(m10.i(i14, 0));
        }
        m10.n();
    }

    public static e g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0245a ? new e((a.C0245a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new k.g(getContext());
    }

    public static int i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return k1.h.b(marginLayoutParams) + k1.h.c(marginLayoutParams);
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // k1.i
    public final void A(j0.c cVar) {
        k1.j jVar = this.H;
        jVar.f18127b.remove(cVar);
        if (((j.a) jVar.f18128c.remove(cVar)) == null) {
            jVar.f18126a.run();
            return;
        }
        throw null;
    }

    public final void a(int i10, ArrayList arrayList) {
        boolean z10;
        WeakHashMap<View, k1.i2> weakHashMap = k1.o0.f18161a;
        if (o0.e.d(this) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, o0.e.d(this));
        arrayList.clear();
        if (z10) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f1246b == 0 && r(childAt)) {
                    int i12 = eVar.f13867a;
                    WeakHashMap<View, k1.i2> weakHashMap2 = k1.o0.f18161a;
                    int d10 = o0.e.d(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i12, d10) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = d10 == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f1246b == 0 && r(childAt2)) {
                int i14 = eVar2.f13867a;
                WeakHashMap<View, k1.i2> weakHashMap3 = k1.o0.f18161a;
                int d11 = o0.e.d(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i14, d11) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = d11 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z10) {
        e eVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVar = new e();
        } else if (!checkLayoutParams(layoutParams)) {
            eVar = g(layoutParams);
        } else {
            eVar = (e) layoutParams;
        }
        eVar.f1246b = 1;
        if (z10 && this.f1222i != null) {
            view.setLayoutParams(eVar);
            this.E.add(view);
            return;
        }
        addView(view, eVar);
    }

    public final void c() {
        if (this.f1221h == null) {
            o oVar = new o(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f1221h = oVar;
            oVar.setImageDrawable(this.f1219f);
            this.f1221h.setContentDescription(this.f1220g);
            e eVar = new e();
            eVar.f13867a = 8388611 | (this.f1227n & 112);
            eVar.f1246b = 2;
            this.f1221h.setLayoutParams(eVar);
            this.f1221h.setOnClickListener(new c());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public final void d() {
        e();
        ActionMenuView actionMenuView = this.f1212a;
        if (actionMenuView.f1075p == null) {
            androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) actionMenuView.getMenu();
            if (this.W == null) {
                this.W = new d();
            }
            this.f1212a.setExpandedActionViewsExclusive(true);
            fVar.b(this.W, this.f1223j);
        }
    }

    public final void e() {
        if (this.f1212a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1212a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1224k);
            this.f1212a.setOnMenuItemClickListener(this.Q);
            ActionMenuView actionMenuView2 = this.f1212a;
            actionMenuView2.f1080u = null;
            actionMenuView2.f1081v = null;
            e eVar = new e();
            eVar.f13867a = 8388613 | (this.f1227n & 112);
            this.f1212a.setLayoutParams(eVar);
            b(this.f1212a, false);
        }
    }

    public final void f() {
        if (this.f1216d == null) {
            this.f1216d = new o(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            e eVar = new e();
            eVar.f13867a = 8388611 | (this.f1227n & 112);
            this.f1216d.setLayoutParams(eVar);
        }
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
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return g(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        o oVar = this.f1221h;
        if (oVar != null) {
            return oVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        o oVar = this.f1221h;
        if (oVar != null) {
            return oVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        b2 b2Var = this.f1233t;
        if (b2Var != null) {
            if (b2Var.f1271g) {
                return b2Var.f1265a;
            }
            return b2Var.f1266b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f1235v;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        b2 b2Var = this.f1233t;
        if (b2Var != null) {
            return b2Var.f1265a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        b2 b2Var = this.f1233t;
        if (b2Var != null) {
            return b2Var.f1266b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        b2 b2Var = this.f1233t;
        if (b2Var != null) {
            if (b2Var.f1271g) {
                return b2Var.f1266b;
            }
            return b2Var.f1265a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f1234u;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        boolean z10;
        androidx.appcompat.view.menu.f fVar;
        ActionMenuView actionMenuView = this.f1212a;
        if (actionMenuView != null && (fVar = actionMenuView.f1075p) != null && fVar.hasVisibleItems()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return Math.max(getContentInsetEnd(), Math.max(this.f1235v, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, k1.i2> weakHashMap = k1.o0.f18161a;
        if (o0.e.d(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, k1.i2> weakHashMap = k1.o0.f18161a;
        if (o0.e.d(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1234u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.f1218e;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.f1218e;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        d();
        return this.f1212a.getMenu();
    }

    public View getNavButtonView() {
        return this.f1216d;
    }

    public CharSequence getNavigationContentDescription() {
        o oVar = this.f1216d;
        if (oVar != null) {
            return oVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        o oVar = this.f1216d;
        if (oVar != null) {
            return oVar.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.V;
    }

    public Drawable getOverflowIcon() {
        d();
        return this.f1212a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1223j;
    }

    public int getPopupTheme() {
        return this.f1224k;
    }

    public CharSequence getSubtitle() {
        return this.f1238y;
    }

    public final TextView getSubtitleTextView() {
        return this.f1214c;
    }

    public CharSequence getTitle() {
        return this.f1237x;
    }

    public int getTitleMarginBottom() {
        return this.f1232s;
    }

    public int getTitleMarginEnd() {
        return this.f1230q;
    }

    public int getTitleMarginStart() {
        return this.f1229p;
    }

    public int getTitleMarginTop() {
        return this.f1231r;
    }

    public final TextView getTitleTextView() {
        return this.f1213b;
    }

    public j1 getWrapper() {
        if (this.U == null) {
            this.U = new o2(this);
        }
        return this.U;
    }

    public final int h(View view, int i10) {
        int i11;
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i10 > 0) {
            i11 = (measuredHeight - i10) / 2;
        } else {
            i11 = 0;
        }
        int i12 = eVar.f13867a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.f1236w & 112;
        }
        if (i12 != 48) {
            if (i12 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i13 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i14 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                if (i13 < i14) {
                    i13 = i14;
                } else {
                    int i15 = (((height - paddingBottom) - measuredHeight) - i13) - paddingTop;
                    int i16 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    if (i15 < i16) {
                        i13 = Math.max(0, i13 - (i16 - i15));
                    }
                }
                return paddingTop + i13;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i11;
        }
        return getPaddingTop() - i11;
    }

    public final void k(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public final void l() {
        Iterator<MenuItem> it = this.L.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        k1.j jVar = this.H;
        MenuInflater menuInflater = getMenuInflater();
        Iterator<k1.x> it2 = jVar.f18127b.iterator();
        while (it2.hasNext()) {
            it2.next().c(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.L = currentMenuItems2;
        Iterator<k1.x> it3 = this.H.f18127b.iterator();
        while (it3.hasNext()) {
            it3.next().d(menu);
        }
    }

    public final boolean m(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    public final int n(View view, int i10, int i11, int[] iArr) {
        e eVar = (e) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int h10 = h(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, h10, max + measuredWidth, view.getMeasuredHeight() + h10);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin + max;
    }

    public final int o(View view, int i10, int i11, int[] iArr) {
        e eVar = (e) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int h10 = h(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, h10, max, view.getMeasuredHeight() + h10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1217d0);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x028a A[LOOP:0: B:237:0x0288->B:238:0x028a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02ac A[LOOP:1: B:240:0x02aa->B:241:0x02ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02d1 A[LOOP:2: B:243:0x02cf->B:244:0x02d1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0323 A[LOOP:3: B:252:0x0321->B:253:0x0323, LOOP_END] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0284  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        androidx.appcompat.view.menu.f fVar;
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f24504a);
        ActionMenuView actionMenuView = this.f1212a;
        if (actionMenuView != null) {
            fVar = actionMenuView.f1075p;
        } else {
            fVar = null;
        }
        int i10 = gVar.f1247c;
        if (i10 != 0 && this.W != null && fVar != null && (findItem = fVar.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (gVar.f1248d) {
            removeCallbacks(this.f1217d0);
            post(this.f1217d0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x002f, code lost:
        if (r1 != Integer.MIN_VALUE) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x003d, code lost:
        if (r1 != Integer.MIN_VALUE) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            androidx.appcompat.widget.b2 r0 = r2.f1233t
            if (r0 != 0) goto Le
            androidx.appcompat.widget.b2 r0 = new androidx.appcompat.widget.b2
            r0.<init>()
            r2.f1233t = r0
        Le:
            androidx.appcompat.widget.b2 r0 = r2.f1233t
            r1 = 1
            if (r3 != r1) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            boolean r3 = r0.f1271g
            if (r1 != r3) goto L1a
            goto L48
        L1a:
            r0.f1271g = r1
            boolean r3 = r0.f1272h
            if (r3 == 0) goto L40
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L32
            int r1 = r0.f1268d
            if (r1 == r3) goto L29
            goto L2b
        L29:
            int r1 = r0.f1269e
        L2b:
            r0.f1265a = r1
            int r1 = r0.f1267c
            if (r1 == r3) goto L44
            goto L46
        L32:
            int r1 = r0.f1267c
            if (r1 == r3) goto L37
            goto L39
        L37:
            int r1 = r0.f1269e
        L39:
            r0.f1265a = r1
            int r1 = r0.f1268d
            if (r1 == r3) goto L44
            goto L46
        L40:
            int r3 = r0.f1269e
            r0.f1265a = r3
        L44:
            int r1 = r0.f1270f
        L46:
            r0.f1266b = r1
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z10;
        androidx.appcompat.view.menu.h hVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.W;
        if (dVar != null && (hVar = dVar.f1244b) != null) {
            gVar.f1247c = hVar.f959a;
        }
        ActionMenuView actionMenuView = this.f1212a;
        boolean z11 = false;
        if (actionMenuView != null) {
            androidx.appcompat.widget.c cVar = actionMenuView.f1079t;
            if (cVar != null && cVar.j()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        gVar.f1248d = z11;
        return gVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    public final int p(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void q(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        o oVar = this.f1221h;
        if (oVar != null) {
            oVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(g.a.b(getContext(), i10));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f1221h.setImageDrawable(drawable);
            return;
        }
        o oVar = this.f1221h;
        if (oVar != null) {
            oVar.setImageDrawable(this.f1219f);
        }
    }

    public void setCollapsible(boolean z10) {
        this.f1215c0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1235v) {
            this.f1235v = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1234u) {
            this.f1234u = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(g.a.b(getContext(), i10));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1218e == null) {
                this.f1218e = new AppCompatImageView(getContext(), null);
            }
            if (!m(this.f1218e)) {
                b(this.f1218e, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f1218e;
            if (appCompatImageView != null && m(appCompatImageView)) {
                removeView(this.f1218e);
                this.E.remove(this.f1218e);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f1218e;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1218e == null) {
            this.f1218e = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.f1218e;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        o oVar = this.f1216d;
        if (oVar != null) {
            oVar.setContentDescription(charSequence);
            q2.a(this.f1216d, charSequence);
        }
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(g.a.b(getContext(), i10));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f1216d)) {
                b(this.f1216d, true);
            }
        } else {
            o oVar = this.f1216d;
            if (oVar != null && m(oVar)) {
                removeView(this.f1216d);
                this.E.remove(this.f1216d);
            }
        }
        o oVar2 = this.f1216d;
        if (oVar2 != null) {
            oVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f1216d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.M = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        d();
        this.f1212a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f1224k != i10) {
            this.f1224k = i10;
            if (i10 == 0) {
                this.f1223j = getContext();
            } else {
                this.f1223j = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1214c == null) {
                Context context = getContext();
                d1 d1Var = new d1(context, null);
                this.f1214c = d1Var;
                d1Var.setSingleLine();
                this.f1214c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1226m;
                if (i10 != 0) {
                    this.f1214c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f1214c.setTextColor(colorStateList);
                }
            }
            if (!m(this.f1214c)) {
                b(this.f1214c, true);
            }
        } else {
            d1 d1Var2 = this.f1214c;
            if (d1Var2 != null && m(d1Var2)) {
                removeView(this.f1214c);
                this.E.remove(this.f1214c);
            }
        }
        d1 d1Var3 = this.f1214c;
        if (d1Var3 != null) {
            d1Var3.setText(charSequence);
        }
        this.f1238y = charSequence;
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        d1 d1Var = this.f1214c;
        if (d1Var != null) {
            d1Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1213b == null) {
                Context context = getContext();
                d1 d1Var = new d1(context, null);
                this.f1213b = d1Var;
                d1Var.setSingleLine();
                this.f1213b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1225l;
                if (i10 != 0) {
                    this.f1213b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1239z;
                if (colorStateList != null) {
                    this.f1213b.setTextColor(colorStateList);
                }
            }
            if (!m(this.f1213b)) {
                b(this.f1213b, true);
            }
        } else {
            d1 d1Var2 = this.f1213b;
            if (d1Var2 != null && m(d1Var2)) {
                removeView(this.f1213b);
                this.E.remove(this.f1213b);
            }
        }
        d1 d1Var3 = this.f1213b;
        if (d1Var3 != null) {
            d1Var3.setText(charSequence);
        }
        this.f1237x = charSequence;
    }

    public void setTitleMarginBottom(int i10) {
        this.f1232s = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f1230q = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f1229p = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f1231r = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1239z = colorStateList;
        d1 d1Var = this.f1213b;
        if (d1Var != null) {
            d1Var.setTextColor(colorStateList);
        }
    }

    @Override // k1.i
    public final void t(j0.c cVar) {
        k1.j jVar = this.H;
        jVar.f18127b.add(cVar);
        jVar.f18126a.run();
    }
}
