package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import b1.a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c extends androidx.appcompat.view.menu.a {

    /* renamed from: j */
    public d f1273j;

    /* renamed from: k */
    public Drawable f1274k;

    /* renamed from: l */
    public boolean f1275l;

    /* renamed from: m */
    public boolean f1276m;

    /* renamed from: n */
    public boolean f1277n;

    /* renamed from: o */
    public int f1278o;

    /* renamed from: p */
    public int f1279p;

    /* renamed from: q */
    public int f1280q;

    /* renamed from: r */
    public boolean f1281r;

    /* renamed from: s */
    public final SparseBooleanArray f1282s;

    /* renamed from: t */
    public e f1283t;

    /* renamed from: u */
    public a f1284u;

    /* renamed from: v */
    public RunnableC0020c f1285v;

    /* renamed from: w */
    public b f1286w;

    /* renamed from: x */
    public final f f1287x;

    /* renamed from: y */
    public int f1288y;

    /* loaded from: classes.dex */
    public class a extends androidx.appcompat.view.menu.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, R.attr.actionOverflowMenuStyle);
            boolean z10;
            c.this = r7;
            if ((mVar.A.f982x & 32) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                View view2 = r7.f1273j;
                this.f991f = view2 == null ? (View) r7.f879h : view2;
            }
            f fVar = r7.f1287x;
            this.f994i = fVar;
            l.d dVar = this.f995j;
            if (dVar != null) {
                dVar.f(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            c cVar = c.this;
            cVar.f1284u = null;
            cVar.f1288y = 0;
            super.c();
        }
    }

    /* loaded from: classes.dex */
    public class b extends ActionMenuItemView.b {
        public b() {
            c.this = r1;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c */
    /* loaded from: classes.dex */
    public class RunnableC0020c implements Runnable {

        /* renamed from: a */
        public e f1291a;

        public RunnableC0020c(e eVar) {
            c.this = r1;
            this.f1291a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f.a aVar;
            androidx.appcompat.view.menu.f fVar = c.this.f874c;
            if (fVar != null && (aVar = fVar.f936e) != null) {
                aVar.b(fVar);
            }
            View view = (View) c.this.f879h;
            if (view != null && view.getWindowToken() != null) {
                e eVar = this.f1291a;
                boolean z10 = true;
                if (!eVar.b()) {
                    if (eVar.f991f == null) {
                        z10 = false;
                    } else {
                        eVar.d(0, 0, false, false);
                    }
                }
                if (z10) {
                    c.this.f1283t = this.f1291a;
                }
            }
            c.this.f1285v = null;
        }
    }

    /* loaded from: classes.dex */
    public class d extends AppCompatImageView implements ActionMenuView.a {

        /* loaded from: classes.dex */
        public class a extends o1 {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view) {
                super(view);
                d.this = r1;
            }

            @Override // androidx.appcompat.widget.o1
            public final l.f b() {
                e eVar = c.this.f1283t;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // androidx.appcompat.widget.o1
            public final boolean c() {
                c.this.n();
                return true;
            }

            @Override // androidx.appcompat.widget.o1
            public final boolean d() {
                c cVar = c.this;
                if (cVar.f1285v != null) {
                    return false;
                }
                cVar.b();
                return true;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            c.this = r2;
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            q2.a(this, getContentDescription());
            setOnTouchListener(new a(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean b() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.n();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                a.b.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* loaded from: classes.dex */
    public class e extends androidx.appcompat.view.menu.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, androidx.appcompat.view.menu.f fVar, d dVar) {
            super(context, fVar, dVar, true, R.attr.actionOverflowMenuStyle);
            c.this = r7;
            this.f992g = 8388613;
            f fVar2 = r7.f1287x;
            this.f994i = fVar2;
            l.d dVar2 = this.f995j;
            if (dVar2 != null) {
                dVar2.f(fVar2);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            androidx.appcompat.view.menu.f fVar = c.this.f874c;
            if (fVar != null) {
                fVar.c(true);
            }
            c.this.f1283t = null;
            super.c();
        }
    }

    /* loaded from: classes.dex */
    public class f implements j.a {
        public f() {
            c.this = r1;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            if (fVar instanceof androidx.appcompat.view.menu.m) {
                fVar.k().c(false);
            }
            j.a aVar = c.this.f876e;
            if (aVar != null) {
                aVar.c(fVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(androidx.appcompat.view.menu.f fVar) {
            c cVar = c.this;
            if (fVar == cVar.f874c) {
                return false;
            }
            cVar.f1288y = ((androidx.appcompat.view.menu.m) fVar).A.f959a;
            j.a aVar = cVar.f876e;
            if (aVar == null) {
                return false;
            }
            return aVar.d(fVar);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: a */
        public int f1297a;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public final g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g() {
        }

        public g(Parcel parcel) {
            this.f1297a = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f1297a);
        }
    }

    public c(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
        this.f1282s = new SparseBooleanArray();
        this.f1287x = new f();
    }

    public final View a(androidx.appcompat.view.menu.h hVar, View view, ViewGroup viewGroup) {
        k.a aVar;
        View actionView = hVar.getActionView();
        int i10 = 0;
        if (actionView == null || hVar.e()) {
            if (view instanceof k.a) {
                aVar = (k.a) view;
            } else {
                aVar = (k.a) this.f875d.inflate(this.f878g, viewGroup, false);
            }
            aVar.d(hVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f879h);
            if (this.f1286w == null) {
                this.f1286w = new b();
            }
            actionMenuItemView.setPopupCallback(this.f1286w);
            actionView = (View) aVar;
        }
        if (hVar.C) {
            i10 = 8;
        }
        actionView.setVisibility(i10);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    public final boolean b() {
        androidx.appcompat.view.menu.k kVar;
        RunnableC0020c runnableC0020c = this.f1285v;
        if (runnableC0020c != null && (kVar = this.f879h) != null) {
            ((View) kVar).removeCallbacks(runnableC0020c);
            this.f1285v = null;
            return true;
        }
        e eVar = this.f1283t;
        if (eVar != null) {
            if (eVar.b()) {
                eVar.f995j.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
        b();
        a aVar = this.f1284u;
        if (aVar != null && aVar.b()) {
            aVar.f995j.dismiss();
        }
        j.a aVar2 = this.f876e;
        if (aVar2 != null) {
            aVar2.c(fVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        androidx.appcompat.view.menu.h hVar;
        ViewGroup viewGroup = (ViewGroup) this.f879h;
        boolean z13 = false;
        ArrayList<androidx.appcompat.view.menu.h> arrayList = null;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.f fVar = this.f874c;
            if (fVar != null) {
                fVar.i();
                ArrayList<androidx.appcompat.view.menu.h> l10 = this.f874c.l();
                int size = l10.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    androidx.appcompat.view.menu.h hVar2 = l10.get(i11);
                    if ((hVar2.f982x & 32) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt instanceof k.a) {
                            hVar = ((k.a) childAt).getItemData();
                        } else {
                            hVar = null;
                        }
                        View a10 = a(hVar2, childAt, viewGroup);
                        if (hVar2 != hVar) {
                            a10.setPressed(false);
                            a10.jumpDrawablesToCurrentState();
                        }
                        if (a10 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a10.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a10);
                            }
                            ((ViewGroup) this.f879h).addView(a10, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.f1273j) {
                    z11 = false;
                } else {
                    viewGroup.removeViewAt(i10);
                    z11 = true;
                }
                if (!z11) {
                    i10++;
                }
            }
        }
        ((View) this.f879h).requestLayout();
        androidx.appcompat.view.menu.f fVar2 = this.f874c;
        if (fVar2 != null) {
            fVar2.i();
            ArrayList<androidx.appcompat.view.menu.h> arrayList2 = fVar2.f940i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                k1.b bVar = arrayList2.get(i12).A;
            }
        }
        androidx.appcompat.view.menu.f fVar3 = this.f874c;
        if (fVar3 != null) {
            fVar3.i();
            arrayList = fVar3.f941j;
        }
        if (this.f1276m && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z13 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z13 = true;
            }
        }
        d dVar = this.f1273j;
        if (z13) {
            if (dVar == null) {
                this.f1273j = new d(this.f872a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f1273j.getParent();
            if (viewGroup3 != this.f879h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f1273j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f879h;
                d dVar2 = this.f1273j;
                actionMenuView.getClass();
                ActionMenuView.c cVar = new ActionMenuView.c();
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
                cVar.f1086a = true;
                actionMenuView.addView(dVar2, cVar);
            }
        } else if (dVar != null) {
            ViewParent parent = dVar.getParent();
            androidx.appcompat.view.menu.k kVar = this.f879h;
            if (parent == kVar) {
                ((ViewGroup) kVar).removeView(this.f1273j);
            }
        }
        ((ActionMenuView) this.f879h).setOverflowReserved(this.f1276m);
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        ArrayList<androidx.appcompat.view.menu.h> arrayList;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        c cVar = this;
        androidx.appcompat.view.menu.f fVar = cVar.f874c;
        if (fVar != null) {
            arrayList = fVar.l();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i12 = cVar.f1280q;
        int i13 = cVar.f1279p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f879h;
        int i14 = 0;
        boolean z18 = false;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i11 = 2;
            z10 = true;
            if (i14 >= i10) {
                break;
            }
            androidx.appcompat.view.menu.h hVar = arrayList.get(i14);
            int i17 = hVar.f983y;
            if ((i17 & 2) == 2) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16) {
                i15++;
            } else {
                if ((i17 & 1) == 1) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z17) {
                    i16++;
                } else {
                    z18 = true;
                }
            }
            if (cVar.f1281r && hVar.C) {
                i12 = 0;
            }
            i14++;
        }
        if (cVar.f1276m && (z18 || i16 + i15 > i12)) {
            i12--;
        }
        int i18 = i12 - i15;
        SparseBooleanArray sparseBooleanArray = cVar.f1282s;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i20 = 0;
        while (i19 < i10) {
            androidx.appcompat.view.menu.h hVar2 = arrayList.get(i19);
            int i21 = hVar2.f983y;
            if ((i21 & 2) == i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                View a10 = cVar.a(hVar2, null, viewGroup);
                a10.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a10.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                int i22 = hVar2.f960b;
                if (i22 != 0) {
                    sparseBooleanArray.put(i22, z10);
                }
                hVar2.f(z10);
            } else {
                if ((i21 & 1) == z10) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    int i23 = hVar2.f960b;
                    boolean z19 = sparseBooleanArray.get(i23);
                    if ((i18 > 0 || z19) && i13 > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        View a11 = cVar.a(hVar2, null, viewGroup);
                        a11.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = a11.getMeasuredWidth();
                        i13 -= measuredWidth2;
                        if (i20 == 0) {
                            i20 = measuredWidth2;
                        }
                        if (i13 + i20 > 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z13 &= z15;
                    }
                    if (z13 && i23 != 0) {
                        sparseBooleanArray.put(i23, true);
                    } else if (z19) {
                        sparseBooleanArray.put(i23, false);
                        for (int i24 = 0; i24 < i19; i24++) {
                            androidx.appcompat.view.menu.h hVar3 = arrayList.get(i24);
                            if (hVar3.f960b == i23) {
                                if ((hVar3.f982x & 32) == 32) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z14) {
                                    i18++;
                                }
                                hVar3.f(false);
                            }
                        }
                    }
                    if (z13) {
                        i18--;
                    }
                    hVar2.f(z13);
                } else {
                    hVar2.f(false);
                    i19++;
                    i11 = 2;
                    cVar = this;
                    z10 = true;
                }
            }
            i19++;
            i11 = 2;
            cVar = this;
            z10 = true;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(Context context, androidx.appcompat.view.menu.f fVar) {
        this.f873b = context;
        LayoutInflater.from(context);
        this.f874c = fVar;
        Resources resources = context.getResources();
        if (!this.f1277n) {
            this.f1276m = true;
        }
        int i10 = 2;
        this.f1278o = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i11 <= 600 && ((i11 <= 960 || i12 <= 720) && (i11 <= 720 || i12 <= 960))) {
            if (i11 < 500 && ((i11 <= 640 || i12 <= 480) && (i11 <= 480 || i12 <= 640))) {
                if (i11 >= 360) {
                    i10 = 3;
                }
            } else {
                i10 = 4;
            }
        } else {
            i10 = 5;
        }
        this.f1280q = i10;
        int i13 = this.f1278o;
        if (this.f1276m) {
            if (this.f1273j == null) {
                d dVar = new d(this.f872a);
                this.f1273j = dVar;
                if (this.f1275l) {
                    dVar.setImageDrawable(this.f1274k);
                    this.f1274k = null;
                    this.f1275l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1273j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i13 -= this.f1273j.getMeasuredWidth();
        } else {
            this.f1273j = null;
        }
        this.f1279p = i13;
        float f10 = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(Parcelable parcelable) {
        int i10;
        MenuItem findItem;
        if ((parcelable instanceof g) && (i10 = ((g) parcelable).f1297a) > 0 && (findItem = this.f874c.findItem(i10)) != null) {
            k((androidx.appcompat.view.menu.m) findItem.getSubMenu());
        }
    }

    public final boolean j() {
        e eVar = this.f1283t;
        return eVar != null && eVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0090  */
    @Override // androidx.appcompat.view.menu.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(androidx.appcompat.view.menu.m r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = r9
        L9:
            androidx.appcompat.view.menu.f r2 = r0.f1022z
            androidx.appcompat.view.menu.f r3 = r8.f874c
            if (r2 == r3) goto L13
            r0 = r2
            androidx.appcompat.view.menu.m r0 = (androidx.appcompat.view.menu.m) r0
            goto L9
        L13:
            androidx.appcompat.view.menu.h r0 = r0.A
            androidx.appcompat.view.menu.k r2 = r8.f879h
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 0
            if (r2 != 0) goto L1d
            goto L3a
        L1d:
            int r4 = r2.getChildCount()
            r5 = 0
        L22:
            if (r5 >= r4) goto L3a
            android.view.View r6 = r2.getChildAt(r5)
            boolean r7 = r6 instanceof androidx.appcompat.view.menu.k.a
            if (r7 == 0) goto L37
            r7 = r6
            androidx.appcompat.view.menu.k$a r7 = (androidx.appcompat.view.menu.k.a) r7
            androidx.appcompat.view.menu.h r7 = r7.getItemData()
            if (r7 != r0) goto L37
            r3 = r6
            goto L3a
        L37:
            int r5 = r5 + 1
            goto L22
        L3a:
            if (r3 != 0) goto L3d
            return r1
        L3d:
            androidx.appcompat.view.menu.h r0 = r9.A
            int r0 = r0.f959a
            r8.f1288y = r0
            int r0 = r9.size()
            r2 = 0
        L48:
            r4 = 1
            if (r2 >= r0) goto L60
            android.view.MenuItem r5 = r9.getItem(r2)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L5d
            android.graphics.drawable.Drawable r5 = r5.getIcon()
            if (r5 == 0) goto L5d
            r0 = 1
            goto L61
        L5d:
            int r2 = r2 + 1
            goto L48
        L60:
            r0 = 0
        L61:
            androidx.appcompat.widget.c$a r2 = new androidx.appcompat.widget.c$a
            android.content.Context r5 = r8.f873b
            r2.<init>(r5, r9, r3)
            r8.f1284u = r2
            r2.f993h = r0
            l.d r2 = r2.f995j
            if (r2 == 0) goto L73
            r2.q(r0)
        L73:
            androidx.appcompat.widget.c$a r0 = r8.f1284u
            boolean r2 = r0.b()
            if (r2 == 0) goto L7d
        L7b:
            r1 = 1
            goto L86
        L7d:
            android.view.View r2 = r0.f991f
            if (r2 != 0) goto L82
            goto L86
        L82:
            r0.d(r1, r1, r1, r1)
            goto L7b
        L86:
            if (r1 == 0) goto L90
            androidx.appcompat.view.menu.j$a r0 = r8.f876e
            if (r0 == 0) goto L8f
            r0.d(r9)
        L8f:
            return r4
        L90:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c.k(androidx.appcompat.view.menu.m):boolean");
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        g gVar = new g();
        gVar.f1297a = this.f1288y;
        return gVar;
    }

    public final boolean n() {
        androidx.appcompat.view.menu.f fVar;
        if (this.f1276m && !j() && (fVar = this.f874c) != null && this.f879h != null && this.f1285v == null) {
            fVar.i();
            if (!fVar.f941j.isEmpty()) {
                RunnableC0020c runnableC0020c = new RunnableC0020c(new e(this.f873b, this.f874c, this.f1273j));
                this.f1285v = runnableC0020c;
                ((View) this.f879h).post(runnableC0020c);
                return true;
            }
            return false;
        }
        return false;
    }
}
