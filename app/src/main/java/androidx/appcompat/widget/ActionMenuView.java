package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.c;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements f.b, androidx.appcompat.view.menu.k {
    public e A;

    /* renamed from: p */
    public androidx.appcompat.view.menu.f f1075p;

    /* renamed from: q */
    public Context f1076q;

    /* renamed from: r */
    public int f1077r;

    /* renamed from: s */
    public boolean f1078s;

    /* renamed from: t */
    public androidx.appcompat.widget.c f1079t;

    /* renamed from: u */
    public j.a f1080u;

    /* renamed from: v */
    public f.a f1081v;

    /* renamed from: w */
    public boolean f1082w;

    /* renamed from: x */
    public int f1083x;

    /* renamed from: y */
    public int f1084y;

    /* renamed from: z */
    public int f1085z;

    /* loaded from: classes.dex */
    public interface a {
        boolean a();

        boolean b();
    }

    /* loaded from: classes.dex */
    public static class b implements j.a {
        @Override // androidx.appcompat.view.menu.j.a
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends LinearLayoutCompat.a {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f1086a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f1087b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f1088c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f1089d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f1090e;

        /* renamed from: f */
        public boolean f1091f;

        public c() {
            super(-2, -2);
            this.f1086a = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f1086a = cVar.f1086a;
        }
    }

    /* loaded from: classes.dex */
    public class d implements f.a {
        public d() {
            ActionMenuView.this = r1;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x003a A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
        @Override // androidx.appcompat.view.menu.f.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(androidx.appcompat.view.menu.f r5, android.view.MenuItem r6) {
            /*
                r4 = this;
                androidx.appcompat.widget.ActionMenuView r5 = androidx.appcompat.widget.ActionMenuView.this
                androidx.appcompat.widget.ActionMenuView$e r5 = r5.A
                r0 = 0
                r1 = 1
                if (r5 == 0) goto L3b
                androidx.appcompat.widget.Toolbar$a r5 = (androidx.appcompat.widget.Toolbar.a) r5
                androidx.appcompat.widget.Toolbar r2 = androidx.appcompat.widget.Toolbar.this
                k1.j r2 = r2.H
                java.util.concurrent.CopyOnWriteArrayList<k1.x> r2 = r2.f18127b
                java.util.Iterator r2 = r2.iterator()
            L14:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L28
                java.lang.Object r3 = r2.next()
                k1.x r3 = (k1.x) r3
                boolean r3 = r3.a(r6)
                if (r3 == 0) goto L14
                r2 = 1
                goto L29
            L28:
                r2 = 0
            L29:
                if (r2 == 0) goto L2d
            L2b:
                r5 = 1
                goto L38
            L2d:
                androidx.appcompat.widget.Toolbar r5 = androidx.appcompat.widget.Toolbar.this
                androidx.appcompat.widget.Toolbar$f r5 = r5.M
                if (r5 == 0) goto L37
                r5.onMenuItemClick(r6)
                goto L2b
            L37:
                r5 = 0
            L38:
                if (r5 == 0) goto L3b
                r0 = 1
            L3b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.d.a(androidx.appcompat.view.menu.f, android.view.MenuItem):boolean");
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f fVar) {
            f.a aVar = ActionMenuView.this.f1081v;
            if (aVar != null) {
                aVar.b(fVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    public ActionMenuView() {
        throw null;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f1084y = (int) (56.0f * f10);
        this.f1085z = (int) (f10 * 4.0f);
        this.f1076q = context;
        this.f1077r = 0;
    }

    public static c j(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            c cVar = new c();
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
            return cVar;
        }
        c cVar2 = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar2).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar2).gravity = 16;
        }
        return cVar2;
    }

    @Override // androidx.appcompat.view.menu.f.b
    public final boolean a(androidx.appcompat.view.menu.h hVar) {
        return this.f1075p.q(hVar, null, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public final void b(androidx.appcompat.view.menu.f fVar) {
        this.f1075p = fVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public final LinearLayoutCompat.a f() {
        c cVar = new c();
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public final LinearLayoutCompat.a g(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c();
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1075p == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(context);
            this.f1075p = fVar;
            fVar.f936e = new d();
            androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(context);
            this.f1079t = cVar;
            cVar.f1276m = true;
            cVar.f1277n = true;
            j.a aVar = this.f1080u;
            if (aVar == null) {
                aVar = new b();
            }
            cVar.f876e = aVar;
            this.f1075p.b(cVar, this.f1076q);
            androidx.appcompat.widget.c cVar2 = this.f1079t;
            cVar2.f879h = this;
            this.f1075p = cVar2.f874c;
        }
        return this.f1075p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        androidx.appcompat.widget.c cVar = this.f1079t;
        c.d dVar = cVar.f1273j;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (cVar.f1275l) {
            return cVar.f1274k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1077r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.a h(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public final boolean k(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        View childAt = getChildAt(i10 - 1);
        View childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            z10 = false | ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? z10 : z10 | ((a) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.c cVar = this.f1079t;
        if (cVar != null) {
            cVar.d(false);
            if (this.f1079t.j()) {
                this.f1079t.b();
                this.f1079t.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.c cVar = this.f1079t;
        if (cVar != null) {
            cVar.b();
            c.a aVar = cVar.f1284u;
            if (aVar != null && aVar.b()) {
                aVar.f995j.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int i14;
        if (!this.f1082w) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i15 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i16 = i12 - i10;
        int paddingRight = (i16 - getPaddingRight()) - getPaddingLeft();
        boolean a10 = x2.a(this);
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f1086a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i19)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a10) {
                        i14 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i14 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i14 = width - measuredWidth;
                    }
                    int i20 = i15 - (measuredHeight / 2);
                    childAt.layout(i14, i20, width, measuredHeight + i20);
                    paddingRight -= measuredWidth;
                    i17 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    k(i19);
                    i18++;
                }
            }
        }
        if (childCount == 1 && i17 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i21 = (i16 / 2) - (measuredWidth2 / 2);
            int i22 = i15 - (measuredHeight2 / 2);
            childAt2.layout(i21, i22, measuredWidth2 + i21, measuredHeight2 + i22);
            return;
        }
        int i23 = i18 - (i17 ^ 1);
        int max = Math.max(0, i23 > 0 ? paddingRight / i23 : 0);
        if (a10) {
            int width2 = getWidth() - getPaddingRight();
            for (int i24 = 0; i24 < childCount; i24++) {
                View childAt3 = getChildAt(i24);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1086a) {
                    int i25 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i26 = i15 - (measuredHeight3 / 2);
                    childAt3.layout(i25 - measuredWidth3, i26, i25, measuredHeight3 + i26);
                    width2 = i25 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt4 = getChildAt(i27);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1086a) {
                int i28 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i29 = i15 - (measuredHeight4 / 2);
                childAt4.layout(i28, i29, i28 + measuredWidth4, measuredHeight4 + i29);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max + i28;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v32 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        int i15;
        ?? r12;
        boolean z13;
        int i16;
        int i17;
        int i18;
        int i19;
        ActionMenuItemView actionMenuItemView;
        boolean z14;
        int i20;
        boolean z15;
        androidx.appcompat.view.menu.f fVar;
        boolean z16 = this.f1082w;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1082w = z10;
        if (z16 != z10) {
            this.f1083x = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f1082w && (fVar = this.f1075p) != null && size != this.f1083x) {
            this.f1083x = size;
            fVar.p(true);
        }
        int childCount = getChildCount();
        if (this.f1082w && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i10);
            int size3 = View.MeasureSpec.getSize(i11);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
            int i21 = size2 - paddingRight;
            int i22 = this.f1084y;
            int i23 = i21 / i22;
            int i24 = i21 % i22;
            if (i23 == 0) {
                setMeasuredDimension(i21, 0);
                return;
            }
            int i25 = (i24 / i23) + i22;
            int childCount2 = getChildCount();
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            boolean z17 = false;
            long j10 = 0;
            int i30 = 0;
            while (i29 < childCount2) {
                View childAt = getChildAt(i29);
                int i31 = size3;
                if (childAt.getVisibility() == 8) {
                    i18 = mode;
                    i17 = i21;
                    i19 = paddingBottom;
                } else {
                    boolean z18 = childAt instanceof ActionMenuItemView;
                    int i32 = i27 + 1;
                    if (z18) {
                        int i33 = this.f1085z;
                        i15 = i32;
                        r12 = 0;
                        childAt.setPadding(i33, 0, i33, 0);
                    } else {
                        i15 = i32;
                        r12 = 0;
                    }
                    c cVar = (c) childAt.getLayoutParams();
                    cVar.f1091f = r12;
                    cVar.f1088c = r12;
                    cVar.f1087b = r12;
                    cVar.f1089d = r12;
                    ((LinearLayout.LayoutParams) cVar).leftMargin = r12;
                    ((LinearLayout.LayoutParams) cVar).rightMargin = r12;
                    if (z18 && ((ActionMenuItemView) childAt).f()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    cVar.f1090e = z13;
                    if (cVar.f1086a) {
                        i16 = 1;
                    } else {
                        i16 = i23;
                    }
                    i17 = i21;
                    c cVar2 = (c) childAt.getLayoutParams();
                    i18 = mode;
                    i19 = paddingBottom;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z18) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && actionMenuItemView.f()) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (i16 > 0 && (!z14 || i16 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i16 * i25, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i20 = measuredWidth / i25;
                        if (measuredWidth % i25 != 0) {
                            i20++;
                        }
                        if (z14 && i20 < 2) {
                            i20 = 2;
                        }
                    } else {
                        i20 = 0;
                    }
                    if (!cVar2.f1086a && z14) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    cVar2.f1089d = z15;
                    cVar2.f1087b = i20;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i25 * i20, 1073741824), makeMeasureSpec);
                    i28 = Math.max(i28, i20);
                    if (cVar.f1089d) {
                        i30++;
                    }
                    if (cVar.f1086a) {
                        z17 = true;
                    }
                    i23 -= i20;
                    i26 = Math.max(i26, childAt.getMeasuredHeight());
                    if (i20 == 1) {
                        j10 |= 1 << i29;
                    }
                    i27 = i15;
                }
                i29++;
                size3 = i31;
                paddingBottom = i19;
                i21 = i17;
                mode = i18;
            }
            int i34 = mode;
            int i35 = i21;
            int i36 = size3;
            if (z17 && i27 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z19 = false;
            while (i30 > 0 && i23 > 0) {
                int i37 = Integer.MAX_VALUE;
                int i38 = 0;
                long j11 = 0;
                for (int i39 = 0; i39 < childCount2; i39++) {
                    c cVar3 = (c) getChildAt(i39).getLayoutParams();
                    if (cVar3.f1089d) {
                        int i40 = cVar3.f1087b;
                        if (i40 < i37) {
                            j11 = 1 << i39;
                            i37 = i40;
                            i38 = 1;
                        } else if (i40 == i37) {
                            i38++;
                            j11 |= 1 << i39;
                        }
                    }
                }
                j10 |= j11;
                if (i38 > i23) {
                    break;
                }
                int i41 = i37 + 1;
                int i42 = 0;
                while (i42 < childCount2) {
                    View childAt2 = getChildAt(i42);
                    c cVar4 = (c) childAt2.getLayoutParams();
                    int i43 = childMeasureSpec;
                    int i44 = childCount2;
                    long j12 = 1 << i42;
                    if ((j11 & j12) == 0) {
                        if (cVar4.f1087b == i41) {
                            j10 |= j12;
                        }
                    } else {
                        if (z11 && cVar4.f1090e && i23 == 1) {
                            int i45 = this.f1085z;
                            childAt2.setPadding(i45 + i25, 0, i45, 0);
                        }
                        cVar4.f1087b++;
                        cVar4.f1091f = true;
                        i23--;
                    }
                    i42++;
                    childMeasureSpec = i43;
                    childCount2 = i44;
                }
                z19 = true;
            }
            int i46 = childMeasureSpec;
            int i47 = childCount2;
            if (!z17 && i27 == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i23 > 0 && j10 != 0 && (i23 < i27 - 1 || z12 || i28 > 1)) {
                float bitCount = Long.bitCount(j10);
                if (!z12) {
                    if ((j10 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f1090e) {
                        bitCount -= 0.5f;
                    }
                    int i48 = i47 - 1;
                    if ((j10 & (1 << i48)) != 0 && !((c) getChildAt(i48).getLayoutParams()).f1090e) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    i14 = (int) ((i23 * i25) / bitCount);
                } else {
                    i14 = 0;
                }
                boolean z20 = z19;
                i12 = i47;
                for (int i49 = 0; i49 < i12; i49++) {
                    if ((j10 & (1 << i49)) != 0) {
                        View childAt3 = getChildAt(i49);
                        c cVar5 = (c) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            cVar5.f1088c = i14;
                            cVar5.f1091f = true;
                            if (i49 == 0 && !cVar5.f1090e) {
                                ((LinearLayout.LayoutParams) cVar5).leftMargin = (-i14) / 2;
                            }
                        } else if (cVar5.f1086a) {
                            cVar5.f1088c = i14;
                            cVar5.f1091f = true;
                            ((LinearLayout.LayoutParams) cVar5).rightMargin = (-i14) / 2;
                        } else {
                            if (i49 != 0) {
                                ((LinearLayout.LayoutParams) cVar5).leftMargin = i14 / 2;
                            }
                            if (i49 != i12 - 1) {
                                ((LinearLayout.LayoutParams) cVar5).rightMargin = i14 / 2;
                            }
                        }
                        z20 = true;
                    }
                }
                z19 = z20;
            } else {
                i12 = i47;
            }
            if (z19) {
                for (int i50 = 0; i50 < i12; i50++) {
                    View childAt4 = getChildAt(i50);
                    c cVar6 = (c) childAt4.getLayoutParams();
                    if (cVar6.f1091f) {
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar6.f1087b * i25) + cVar6.f1088c, 1073741824), i46);
                    }
                }
            }
            if (i34 != 1073741824) {
                i13 = i26;
            } else {
                i13 = i36;
            }
            setMeasuredDimension(i35, i13);
            return;
        }
        for (int i51 = 0; i51 < childCount; i51++) {
            c cVar7 = (c) getChildAt(i51).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar7).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar7).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f1079t.f1281r = z10;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        androidx.appcompat.widget.c cVar = this.f1079t;
        c.d dVar = cVar.f1273j;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        cVar.f1275l = true;
        cVar.f1274k = drawable;
    }

    public void setOverflowReserved(boolean z10) {
        this.f1078s = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f1077r != i10) {
            this.f1077r = i10;
            if (i10 == 0) {
                this.f1076q = getContext();
            } else {
                this.f1076q = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.c cVar) {
        this.f1079t = cVar;
        cVar.f879h = this;
        this.f1075p = cVar.f874c;
    }
}
