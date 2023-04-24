package ba;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.l2;
import b1.a;
import com.google.android.material.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import ga.i;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;
import k.g;
import k1.i2;
import k1.o0;
import z9.o;

/* loaded from: classes.dex */
public abstract class f extends FrameLayout {

    /* renamed from: a */
    public final ba.c f4118a;

    /* renamed from: b */
    public final ba.d f4119b;

    /* renamed from: c */
    public final e f4120c;

    /* renamed from: d */
    public ColorStateList f4121d;

    /* renamed from: e */
    public g f4122e;

    /* renamed from: f */
    public c f4123f;

    /* loaded from: classes.dex */
    public class a implements f.a {

        /* renamed from: a */
        public final /* synthetic */ f f4124a;

        public a(BottomNavigationView bottomNavigationView) {
            this.f4124a = bottomNavigationView;
        }

        /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
        @Override // androidx.appcompat.view.menu.f.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(androidx.appcompat.view.menu.f r14, android.view.MenuItem r15) {
            /*
                r13 = this;
                ba.f r14 = r13.f4124a
                r14.getClass()
                r14 = 1
                ba.f r0 = r13.f4124a
                ba.f$c r0 = r0.f4123f
                if (r0 == 0) goto L90
                s.i0 r0 = (s.i0) r0
                java.lang.Object r0 = r0.f25998b
                i2.m r0 = (i2.m) r0
                java.lang.String r1 = "$navController"
                gm.l.f(r0, r1)
                java.lang.String r1 = "item"
                gm.l.f(r15, r1)
                r3 = 1
                r4 = 1
                i2.v r1 = r0.g()
                gm.l.c(r1)
                i2.x r1 = r1.f16404b
                gm.l.c(r1)
                int r2 = r15.getItemId()
                i2.v r1 = r1.q(r2, r14)
                boolean r1 = r1 instanceof i2.b.a
                if (r1 == 0) goto L3f
                int r1 = androidx.navigation.ui.R.anim.nav_default_enter_anim
                int r2 = androidx.navigation.ui.R.anim.nav_default_exit_anim
                int r5 = androidx.navigation.ui.R.anim.nav_default_pop_enter_anim
                int r6 = androidx.navigation.ui.R.anim.nav_default_pop_exit_anim
                goto L47
            L3f:
                int r1 = androidx.navigation.ui.R.animator.nav_default_enter_anim
                int r2 = androidx.navigation.ui.R.animator.nav_default_exit_anim
                int r5 = androidx.navigation.ui.R.animator.nav_default_pop_enter_anim
                int r6 = androidx.navigation.ui.R.animator.nav_default_pop_exit_anim
            L47:
                r8 = r1
                r9 = r2
                r10 = r5
                r11 = r6
                int r1 = r15.getOrder()
                r2 = 196608(0x30000, float:2.75506E-40)
                r1 = r1 & r2
                r12 = 0
                if (r1 != 0) goto L65
                int r1 = i2.x.f16417o
                i2.x r1 = r0.i()
                i2.v r1 = i2.x.a.a(r1)
                int r1 = r1.f16410h
                r2 = 1
                r5 = r1
                r7 = 1
                goto L69
            L65:
                r1 = -1
                r2 = 0
                r5 = -1
                r7 = 0
            L69:
                i2.b0 r1 = new i2.b0
                r2 = r1
                r6 = r12
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                int r2 = r15.getItemId()     // Catch: java.lang.IllegalArgumentException -> L8c
                r3 = 0
                r0.l(r2, r3, r1)     // Catch: java.lang.IllegalArgumentException -> L8c
                i2.v r0 = r0.g()     // Catch: java.lang.IllegalArgumentException -> L8c
                if (r0 == 0) goto L8a
                int r15 = r15.getItemId()     // Catch: java.lang.IllegalArgumentException -> L8c
                boolean r15 = p001if.d.e(r0, r15)     // Catch: java.lang.IllegalArgumentException -> L8c
                if (r15 != r14) goto L8a
                r12 = 1
                goto L8d
            L8a:
                r12 = 0
                goto L8d
            L8c:
            L8d:
                if (r12 != 0) goto L90
                goto L91
            L90:
                r14 = 0
            L91:
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: ba.f.a.a(androidx.appcompat.view.menu.f, android.view.MenuItem):boolean");
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f fVar) {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    /* loaded from: classes.dex */
    public static class d extends q1.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c */
        public Bundle f4125c;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel, null);
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
            this.f4125c = parcel.readBundle(classLoader == null ? d.class.getClassLoader() : classLoader);
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // q1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f24504a, i10);
            parcel.writeBundle(this.f4125c);
        }
    }

    public f(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(la.a.a(context, attributeSet, i10, i11), attributeSet, i10);
        ColorStateList c10;
        int i12;
        int i13;
        e eVar = new e();
        this.f4120c = eVar;
        Context context2 = getContext();
        int[] iArr = R.styleable.NavigationBarView;
        int i14 = R.styleable.NavigationBarView_itemTextAppearanceInactive;
        int i15 = R.styleable.NavigationBarView_itemTextAppearanceActive;
        o.a(context2, attributeSet, i10, i11);
        o.b(context2, attributeSet, iArr, i10, i11, i14, i15);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        l2 l2Var = new l2(context2, obtainStyledAttributes);
        ba.c cVar = new ba.c(context2, getClass(), getMaxItemCount());
        this.f4118a = cVar;
        m9.b bVar = new m9.b(context2);
        this.f4119b = bVar;
        eVar.f4113a = bVar;
        eVar.f4115c = 1;
        bVar.setPresenter(eVar);
        cVar.b(eVar, cVar.f932a);
        getContext();
        eVar.f4113a.B = cVar;
        int i16 = R.styleable.NavigationBarView_itemIconTint;
        if (l2Var.l(i16)) {
            c10 = l2Var.b(i16);
        } else {
            c10 = bVar.c();
        }
        bVar.setIconTintList(c10);
        setItemIconSize(l2Var.d(R.styleable.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (l2Var.l(i14)) {
            i12 = 0;
            setItemTextAppearanceInactive(l2Var.i(i14, 0));
        } else {
            i12 = 0;
        }
        if (l2Var.l(i15)) {
            setItemTextAppearanceActive(l2Var.i(i15, i12));
        }
        int i17 = R.styleable.NavigationBarView_itemTextColor;
        if (l2Var.l(i17)) {
            setItemTextColor(l2Var.b(i17));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            ga.f fVar = new ga.f();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                fVar.k(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            fVar.i(context2);
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            o0.d.q(this, fVar);
        }
        int i18 = R.styleable.NavigationBarView_itemPaddingTop;
        if (l2Var.l(i18)) {
            i13 = 0;
            setItemPaddingTop(l2Var.d(i18, 0));
        } else {
            i13 = 0;
        }
        int i19 = R.styleable.NavigationBarView_itemPaddingBottom;
        if (l2Var.l(i19)) {
            setItemPaddingBottom(l2Var.d(i19, i13));
        }
        int i20 = R.styleable.NavigationBarView_elevation;
        if (l2Var.l(i20)) {
            setElevation(l2Var.d(i20, i13));
        }
        a.b.h(getBackground().mutate(), da.d.b(context2, l2Var, R.styleable.NavigationBarView_backgroundTint));
        setLabelVisibilityMode(obtainStyledAttributes.getInteger(R.styleable.NavigationBarView_labelVisibilityMode, -1));
        int i21 = l2Var.i(R.styleable.NavigationBarView_itemBackground, 0);
        if (i21 != 0) {
            bVar.setItemBackgroundRes(i21);
        } else {
            setItemRippleColor(da.d.b(context2, l2Var, R.styleable.NavigationBarView_itemRippleColor));
        }
        int i22 = l2Var.i(R.styleable.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (i22 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(i22, R.styleable.NavigationBarActiveIndicator);
            setItemActiveIndicatorWidth(obtainStyledAttributes2.getDimensionPixelSize(R.styleable.NavigationBarActiveIndicator_android_width, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes2.getDimensionPixelSize(R.styleable.NavigationBarActiveIndicator_android_height, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes2.getDimensionPixelOffset(R.styleable.NavigationBarActiveIndicator_marginHorizontal, 0));
            setItemActiveIndicatorColor(da.d.a(context2, obtainStyledAttributes2, R.styleable.NavigationBarActiveIndicator_android_color));
            setItemActiveIndicatorShapeAppearance(new i(i.a(context2, obtainStyledAttributes2.getResourceId(R.styleable.NavigationBarActiveIndicator_shapeAppearance, 0), 0, new ga.a(0))));
            obtainStyledAttributes2.recycle();
        }
        int i23 = R.styleable.NavigationBarView_menu;
        if (l2Var.l(i23)) {
            int i24 = l2Var.i(i23, 0);
            eVar.f4114b = true;
            getMenuInflater().inflate(i24, cVar);
            eVar.f4114b = false;
            eVar.d(true);
        }
        l2Var.n();
        addView(bVar);
        cVar.f936e = new a((BottomNavigationView) this);
    }

    private MenuInflater getMenuInflater() {
        if (this.f4122e == null) {
            this.f4122e = new g(getContext());
        }
        return this.f4122e;
    }

    public final j9.a a(int i10) {
        ba.d dVar = this.f4119b;
        dVar.getClass();
        ba.d.f(i10);
        j9.a aVar = dVar.f4102q.get(i10);
        ba.a aVar2 = null;
        if (aVar == null) {
            j9.a aVar3 = new j9.a(dVar.getContext(), null);
            dVar.f4102q.put(i10, aVar3);
            aVar = aVar3;
        }
        ba.d.f(i10);
        ba.a[] aVarArr = dVar.f4091f;
        if (aVarArr != null) {
            int length = aVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                ba.a aVar4 = aVarArr[i11];
                if (aVar4.getId() == i10) {
                    aVar2 = aVar4;
                    break;
                }
                i11++;
            }
        }
        if (aVar2 != null) {
            aVar2.setBadge(aVar);
        }
        return aVar;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f4119b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f4119b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f4119b.getItemActiveIndicatorMarginHorizontal();
    }

    public i getItemActiveIndicatorShapeAppearance() {
        return this.f4119b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f4119b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f4119b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f4119b.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f4119b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f4119b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f4119b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f4119b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f4121d;
    }

    public int getItemTextAppearanceActive() {
        return this.f4119b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f4119b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f4119b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f4119b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f4118a;
    }

    public k getMenuView() {
        return this.f4119b;
    }

    public e getPresenter() {
        return this.f4120c;
    }

    public int getSelectedItemId() {
        return this.f4119b.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p.b.y(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.f24504a);
        ba.c cVar = this.f4118a;
        Bundle bundle = dVar.f4125c;
        cVar.getClass();
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !cVar.f952u.isEmpty()) {
            Iterator<WeakReference<j>> it = cVar.f952u.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    cVar.f952u.remove(next);
                } else {
                    int id2 = jVar.getId();
                    if (id2 > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                        jVar.i(parcelable2);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable l10;
        d dVar = new d(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        dVar.f4125c = bundle;
        ba.c cVar = this.f4118a;
        if (!cVar.f952u.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator<WeakReference<j>> it = cVar.f952u.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    cVar.f952u.remove(next);
                } else {
                    int id2 = jVar.getId();
                    if (id2 > 0 && (l10 = jVar.l()) != null) {
                        sparseArray.put(id2, l10);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return dVar;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        p.b.x(this, f10);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f4119b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f4119b.setItemActiveIndicatorEnabled(z10);
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f4119b.setItemActiveIndicatorHeight(i10);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f4119b.setItemActiveIndicatorMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorShapeAppearance(i iVar) {
        this.f4119b.setItemActiveIndicatorShapeAppearance(iVar);
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f4119b.setItemActiveIndicatorWidth(i10);
    }

    public void setItemBackground(Drawable drawable) {
        this.f4119b.setItemBackground(drawable);
        this.f4121d = null;
    }

    public void setItemBackgroundResource(int i10) {
        this.f4119b.setItemBackgroundRes(i10);
        this.f4121d = null;
    }

    public void setItemIconSize(int i10) {
        this.f4119b.setItemIconSize(i10);
    }

    public void setItemIconSizeRes(int i10) {
        setItemIconSize(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f4119b.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i10) {
        this.f4119b.setItemPaddingBottom(i10);
    }

    public void setItemPaddingTop(int i10) {
        this.f4119b.setItemPaddingTop(i10);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.f4121d == colorStateList) {
            if (colorStateList != null || this.f4119b.getItemBackground() == null) {
                return;
            }
            this.f4119b.setItemBackground(null);
            return;
        }
        this.f4121d = colorStateList;
        if (colorStateList == null) {
            this.f4119b.setItemBackground(null);
            return;
        }
        this.f4119b.setItemBackground(new RippleDrawable(ea.b.a(colorStateList), null, null));
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f4119b.setItemTextAppearanceActive(i10);
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f4119b.setItemTextAppearanceInactive(i10);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f4119b.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f4119b.getLabelVisibilityMode() != i10) {
            this.f4119b.setLabelVisibilityMode(i10);
            this.f4120c.d(false);
        }
    }

    public void setOnItemReselectedListener(b bVar) {
    }

    public void setOnItemSelectedListener(c cVar) {
        this.f4123f = cVar;
    }

    public void setSelectedItemId(int i10) {
        MenuItem findItem = this.f4118a.findItem(i10);
        if (findItem == null || this.f4118a.q(findItem, this.f4120c, 0)) {
            return;
        }
        findItem.setChecked(true);
    }
}
