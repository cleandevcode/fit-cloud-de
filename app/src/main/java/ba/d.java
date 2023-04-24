package ba;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import com.google.android.material.R;
import ga.i;
import java.util.HashSet;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import l1.j;
import z9.m;

/* loaded from: classes.dex */
public abstract class d extends ViewGroup implements k {
    public static final int[] C = {16842912};
    public static final int[] D = {-16842910};
    public e A;
    public androidx.appcompat.view.menu.f B;

    /* renamed from: a */
    public final x2.a f4086a;

    /* renamed from: b */
    public final a f4087b;

    /* renamed from: c */
    public final j1.f f4088c;

    /* renamed from: d */
    public final SparseArray<View.OnTouchListener> f4089d;

    /* renamed from: e */
    public int f4090e;

    /* renamed from: f */
    public ba.a[] f4091f;

    /* renamed from: g */
    public int f4092g;

    /* renamed from: h */
    public int f4093h;

    /* renamed from: i */
    public ColorStateList f4094i;

    /* renamed from: j */
    public int f4095j;

    /* renamed from: k */
    public ColorStateList f4096k;

    /* renamed from: l */
    public final ColorStateList f4097l;

    /* renamed from: m */
    public int f4098m;

    /* renamed from: n */
    public int f4099n;

    /* renamed from: o */
    public Drawable f4100o;

    /* renamed from: p */
    public int f4101p;

    /* renamed from: q */
    public final SparseArray<j9.a> f4102q;

    /* renamed from: r */
    public int f4103r;

    /* renamed from: s */
    public int f4104s;

    /* renamed from: t */
    public boolean f4105t;

    /* renamed from: u */
    public int f4106u;

    /* renamed from: v */
    public int f4107v;

    /* renamed from: w */
    public int f4108w;

    /* renamed from: x */
    public i f4109x;

    /* renamed from: y */
    public boolean f4110y;

    /* renamed from: z */
    public ColorStateList f4111z;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ d f4112a;

        public a(m9.b bVar) {
            this.f4112a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            h itemData = ((ba.a) view).getItemData();
            d dVar = this.f4112a;
            if (!dVar.B.q(itemData, dVar.A, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public d(Context context) {
        super(context);
        this.f4088c = new j1.f(5);
        this.f4089d = new SparseArray<>(5);
        this.f4092g = 0;
        this.f4093h = 0;
        this.f4102q = new SparseArray<>(5);
        this.f4103r = -1;
        this.f4104s = -1;
        this.f4110y = false;
        this.f4097l = c();
        if (isInEditMode()) {
            this.f4086a = null;
        } else {
            x2.a aVar = new x2.a();
            this.f4086a = aVar;
            aVar.O(0);
            Context context2 = getContext();
            int i10 = R.attr.motionDurationLong1;
            int integer = getResources().getInteger(R.integer.material_motion_duration_long_1);
            TypedValue a10 = da.b.a(context2, i10);
            if (a10 != null && a10.type == 16) {
                integer = a10.data;
            }
            aVar.D(integer);
            aVar.F(aa.a.c(getContext(), R.attr.motionEasingStandard, h9.a.f16044b));
            aVar.L(new m());
        }
        this.f4087b = new a((m9.b) this);
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        o0.d.s(this, 1);
    }

    public static void f(int i10) {
        if (i10 != -1) {
            return;
        }
        throw new IllegalArgumentException(i10 + " is not a valid view id");
    }

    private ba.a getNewItem() {
        ba.a aVar = (ba.a) this.f4088c.acquire();
        return aVar == null ? e(getContext()) : aVar;
    }

    private void setBadgeIfNeeded(ba.a aVar) {
        j9.a aVar2;
        int id2 = aVar.getId();
        if ((id2 != -1) && (aVar2 = this.f4102q.get(id2)) != null) {
            aVar.setBadge(aVar2);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void a() {
        boolean z10;
        boolean z11;
        removeAllViews();
        ba.a[] aVarArr = this.f4091f;
        if (aVarArr != null) {
            for (ba.a aVar : aVarArr) {
                if (aVar != null) {
                    this.f4088c.release(aVar);
                    ImageView imageView = aVar.f4064k;
                    if (aVar.B != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        if (imageView != null) {
                            aVar.setClipChildren(true);
                            aVar.setClipToPadding(true);
                            j9.a aVar2 = aVar.B;
                            if (aVar2 != null) {
                                if (aVar2.d() != null) {
                                    aVar2.d().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(aVar2);
                                }
                            }
                        }
                        aVar.B = null;
                    }
                    aVar.f4069p = null;
                    aVar.f4075v = 0.0f;
                    aVar.f4054a = false;
                }
            }
        }
        if (this.B.size() == 0) {
            this.f4092g = 0;
            this.f4093h = 0;
            this.f4091f = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.B.size(); i10++) {
            hashSet.add(Integer.valueOf(this.B.getItem(i10).getItemId()));
        }
        for (int i11 = 0; i11 < this.f4102q.size(); i11++) {
            int keyAt = this.f4102q.keyAt(i11);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f4102q.delete(keyAt);
            }
        }
        this.f4091f = new ba.a[this.B.size()];
        int i12 = this.f4090e;
        int size = this.B.l().size();
        if (i12 != -1 ? i12 == 0 : size > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i13 = 0; i13 < this.B.size(); i13++) {
            this.A.f4114b = true;
            this.B.getItem(i13).setCheckable(true);
            this.A.f4114b = false;
            ba.a newItem = getNewItem();
            this.f4091f[i13] = newItem;
            newItem.setIconTintList(this.f4094i);
            newItem.setIconSize(this.f4095j);
            newItem.setTextColor(this.f4097l);
            newItem.setTextAppearanceInactive(this.f4098m);
            newItem.setTextAppearanceActive(this.f4099n);
            newItem.setTextColor(this.f4096k);
            int i14 = this.f4103r;
            if (i14 != -1) {
                newItem.setItemPaddingTop(i14);
            }
            int i15 = this.f4104s;
            if (i15 != -1) {
                newItem.setItemPaddingBottom(i15);
            }
            newItem.setActiveIndicatorWidth(this.f4106u);
            newItem.setActiveIndicatorHeight(this.f4107v);
            newItem.setActiveIndicatorMarginHorizontal(this.f4108w);
            newItem.setActiveIndicatorDrawable(d());
            newItem.setActiveIndicatorResizeable(this.f4110y);
            newItem.setActiveIndicatorEnabled(this.f4105t);
            Drawable drawable = this.f4100o;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f4101p);
            }
            newItem.setShifting(z10);
            newItem.setLabelVisibilityMode(this.f4090e);
            h hVar = (h) this.B.getItem(i13);
            newItem.d(hVar);
            newItem.setItemPosition(i13);
            int i16 = hVar.f959a;
            newItem.setOnTouchListener(this.f4089d.get(i16));
            newItem.setOnClickListener(this.f4087b);
            int i17 = this.f4092g;
            if (i17 != 0 && i16 == i17) {
                this.f4093h = i13;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.B.size() - 1, this.f4093h);
        this.f4093h = min;
        this.B.getItem(min).setChecked(true);
    }

    @Override // androidx.appcompat.view.menu.k
    public final void b(androidx.appcompat.view.menu.f fVar) {
        this.B = fVar;
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(16842808, typedValue, true)) {
            ColorStateList a10 = g.a.a(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue, true)) {
                int i10 = typedValue.data;
                int defaultColor = a10.getDefaultColor();
                int[] iArr = D;
                return new ColorStateList(new int[][]{iArr, C, ViewGroup.EMPTY_STATE_SET}, new int[]{a10.getColorForState(iArr, defaultColor), i10, defaultColor});
            }
            return null;
        }
        return null;
    }

    public final ga.f d() {
        if (this.f4109x == null || this.f4111z == null) {
            return null;
        }
        ga.f fVar = new ga.f(this.f4109x);
        fVar.k(this.f4111z);
        return fVar;
    }

    public abstract m9.a e(Context context);

    public SparseArray<j9.a> getBadgeDrawables() {
        return this.f4102q;
    }

    public ColorStateList getIconTintList() {
        return this.f4094i;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f4111z;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f4105t;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f4107v;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f4108w;
    }

    public i getItemActiveIndicatorShapeAppearance() {
        return this.f4109x;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f4106u;
    }

    public Drawable getItemBackground() {
        ba.a[] aVarArr = this.f4091f;
        return (aVarArr == null || aVarArr.length <= 0) ? this.f4100o : aVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f4101p;
    }

    public int getItemIconSize() {
        return this.f4095j;
    }

    public int getItemPaddingBottom() {
        return this.f4104s;
    }

    public int getItemPaddingTop() {
        return this.f4103r;
    }

    public int getItemTextAppearanceActive() {
        return this.f4099n;
    }

    public int getItemTextAppearanceInactive() {
        return this.f4098m;
    }

    public ColorStateList getItemTextColor() {
        return this.f4096k;
    }

    public int getLabelVisibilityMode() {
        return this.f4090e;
    }

    public androidx.appcompat.view.menu.f getMenu() {
        return this.B;
    }

    public int getSelectedItemId() {
        return this.f4092g;
    }

    public int getSelectedItemPosition() {
        return this.f4093h;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) j.b.a(1, this.B.l().size(), 1).f18685a);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f4094i = colorStateList;
        ba.a[] aVarArr = this.f4091f;
        if (aVarArr != null) {
            for (ba.a aVar : aVarArr) {
                aVar.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f4111z = colorStateList;
        ba.a[] aVarArr = this.f4091f;
        if (aVarArr != null) {
            for (ba.a aVar : aVarArr) {
                aVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f4105t = z10;
        ba.a[] aVarArr = this.f4091f;
        if (aVarArr != null) {
            for (ba.a aVar : aVarArr) {
                aVar.setActiveIndicatorEnabled(z10);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f4107v = i10;
        ba.a[] aVarArr = this.f4091f;
        if (aVarArr != null) {
            for (ba.a aVar : aVarArr) {
                aVar.setActiveIndicatorHeight(i10);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f4108w = i10;
        ba.a[] aVarArr = this.f4091f;
        if (aVarArr != null) {
            for (ba.a aVar : aVarArr) {
                aVar.setActiveIndicatorMarginHorizontal(i10);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z10) {
        this.f4110y = z10;
        ba.a[] aVarArr = this.f4091f;
        if (aVarArr != null) {
            for (ba.a aVar : aVarArr) {
                aVar.setActiveIndicatorResizeable(z10);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(i iVar) {
        this.f4109x = iVar;
        ba.a[] aVarArr = this.f4091f;
        if (aVarArr != null) {
            for (ba.a aVar : aVarArr) {
                aVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f4106u = i10;
        ba.a[] aVarArr = this.f4091f;
        if (aVarArr != null) {
            for (ba.a aVar : aVarArr) {
                aVar.setActiveIndicatorWidth(i10);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f4100o = drawable;
        ba.a[] aVarArr = this.f4091f;
        if (aVarArr != null) {
            for (ba.a aVar : aVarArr) {
                aVar.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i10) {
        this.f4101p = i10;
        ba.a[] aVarArr = this.f4091f;
        if (aVarArr != null) {
            for (ba.a aVar : aVarArr) {
                aVar.setItemBackground(i10);
            }
        }
    }

    public void setItemIconSize(int i10) {
        this.f4095j = i10;
        ba.a[] aVarArr = this.f4091f;
        if (aVarArr != null) {
            for (ba.a aVar : aVarArr) {
                aVar.setIconSize(i10);
            }
        }
    }

    public void setItemPaddingBottom(int i10) {
        this.f4104s = i10;
        ba.a[] aVarArr = this.f4091f;
        if (aVarArr != null) {
            for (ba.a aVar : aVarArr) {
                aVar.setItemPaddingBottom(i10);
            }
        }
    }

    public void setItemPaddingTop(int i10) {
        this.f4103r = i10;
        ba.a[] aVarArr = this.f4091f;
        if (aVarArr != null) {
            for (ba.a aVar : aVarArr) {
                aVar.setItemPaddingTop(i10);
            }
        }
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f4099n = i10;
        ba.a[] aVarArr = this.f4091f;
        if (aVarArr != null) {
            for (ba.a aVar : aVarArr) {
                aVar.setTextAppearanceActive(i10);
                ColorStateList colorStateList = this.f4096k;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f4098m = i10;
        ba.a[] aVarArr = this.f4091f;
        if (aVarArr != null) {
            for (ba.a aVar : aVarArr) {
                aVar.setTextAppearanceInactive(i10);
                ColorStateList colorStateList = this.f4096k;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f4096k = colorStateList;
        ba.a[] aVarArr = this.f4091f;
        if (aVarArr != null) {
            for (ba.a aVar : aVarArr) {
                aVar.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i10) {
        this.f4090e = i10;
    }

    public void setPresenter(e eVar) {
        this.A = eVar;
    }
}
