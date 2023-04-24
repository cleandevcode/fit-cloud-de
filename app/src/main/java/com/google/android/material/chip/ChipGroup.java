package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.R;
import java.util.List;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;
import l1.j;
import z9.f;
import z9.h;

/* loaded from: classes.dex */
public class ChipGroup extends f {

    /* renamed from: k */
    public static final int f6385k = R.style.Widget_MaterialComponents_ChipGroup;

    /* renamed from: e */
    public int f6386e;

    /* renamed from: f */
    public int f6387f;

    /* renamed from: g */
    public d f6388g;

    /* renamed from: h */
    public final z9.b<Chip> f6389h;

    /* renamed from: i */
    public final int f6390i;

    /* renamed from: j */
    public final e f6391j;

    /* loaded from: classes.dex */
    public class a implements d {
        public a(c cVar) {
            ChipGroup.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public b() {
            super(-2, -2);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public class e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a */
        public ViewGroup.OnHierarchyChangeListener f6393a;

        public e() {
            ChipGroup.this = r1;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                    view2.setId(o0.e.a());
                }
                z9.b<Chip> bVar = ChipGroup.this.f6389h;
                Chip chip = (Chip) view2;
                bVar.f32069a.put(Integer.valueOf(chip.getId()), chip);
                if (chip.isChecked()) {
                    bVar.a(chip);
                }
                chip.setInternalOnCheckedChangeListener(new z9.a(bVar));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f6393a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                z9.b<Chip> bVar = chipGroup.f6389h;
                Chip chip = (Chip) view2;
                bVar.getClass();
                chip.setInternalOnCheckedChangeListener(null);
                bVar.f32069a.remove(Integer.valueOf(chip.getId()));
                bVar.f32070b.remove(Integer.valueOf(chip.getId()));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f6393a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ChipGroup(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r8 = this;
            int r3 = com.google.android.material.R.attr.chipGroupStyle
            int r4 = com.google.android.material.chip.ChipGroup.f6385k
            android.content.Context r9 = la.a.a(r9, r10, r3, r4)
            r8.<init>(r9, r10, r3)
            z9.b r9 = new z9.b
            r9.<init>()
            r8.f6389h = r9
            com.google.android.material.chip.ChipGroup$e r6 = new com.google.android.material.chip.ChipGroup$e
            r6.<init>()
            r8.f6391j = r6
            android.content.Context r0 = r8.getContext()
            int[] r2 = com.google.android.material.R.styleable.ChipGroup
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r10
            android.content.res.TypedArray r10 = z9.o.d(r0, r1, r2, r3, r4, r5)
            int r0 = com.google.android.material.R.styleable.ChipGroup_chipSpacing
            int r0 = r10.getDimensionPixelOffset(r0, r7)
            int r1 = com.google.android.material.R.styleable.ChipGroup_chipSpacingHorizontal
            int r1 = r10.getDimensionPixelOffset(r1, r0)
            r8.setChipSpacingHorizontal(r1)
            int r1 = com.google.android.material.R.styleable.ChipGroup_chipSpacingVertical
            int r0 = r10.getDimensionPixelOffset(r1, r0)
            r8.setChipSpacingVertical(r0)
            int r0 = com.google.android.material.R.styleable.ChipGroup_singleLine
            boolean r0 = r10.getBoolean(r0, r7)
            r8.setSingleLine(r0)
            int r0 = com.google.android.material.R.styleable.ChipGroup_singleSelection
            boolean r0 = r10.getBoolean(r0, r7)
            r8.setSingleSelection(r0)
            int r0 = com.google.android.material.R.styleable.ChipGroup_selectionRequired
            boolean r0 = r10.getBoolean(r0, r7)
            r8.setSelectionRequired(r0)
            int r0 = com.google.android.material.R.styleable.ChipGroup_checkedChip
            r1 = -1
            int r0 = r10.getResourceId(r0, r1)
            r8.f6390i = r0
            r10.recycle()
            com.google.android.material.chip.b r10 = new com.google.android.material.chip.b
            r10.<init>(r8)
            r9.f32071c = r10
            super.setOnHierarchyChangeListener(r6)
            java.util.WeakHashMap<android.view.View, k1.i2> r9 = k1.o0.f18161a
            r9 = 1
            k1.o0.d.s(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private int getChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) instanceof Chip) {
                i10++;
            }
        }
        return i10;
    }

    @Override // z9.f
    public final boolean a() {
        return this.f32124c;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getCheckedChipId() {
        return this.f6389h.c();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f6389h.b(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f6386e;
    }

    public int getChipSpacingVertical() {
        return this.f6387f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f6390i;
        if (i10 != -1) {
            z9.b<Chip> bVar = this.f6389h;
            h<Chip> hVar = (h) bVar.f32069a.get(Integer.valueOf(i10));
            if (hVar != null && bVar.a(hVar)) {
                bVar.d();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f32124c) {
            i10 = getChipCount();
        } else {
            i10 = -1;
        }
        int rowCount = getRowCount();
        if (this.f6389h.f32072d) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) j.b.a(rowCount, i10, i11).f18685a);
    }

    public void setChipSpacing(int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(int i10) {
        if (this.f6386e != i10) {
            this.f6386e = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(int i10) {
        if (this.f6387f != i10) {
            this.f6387f = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(c cVar) {
        if (cVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new a(cVar));
        }
    }

    public void setOnCheckedStateChangeListener(d dVar) {
        this.f6388g = dVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f6391j.f6393a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.f6389h.f32073e = z10;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    @Override // z9.f
    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }

    public void setSingleSelection(boolean z10) {
        z9.b<Chip> bVar = this.f6389h;
        if (bVar.f32072d != z10) {
            bVar.f32072d = z10;
            boolean z11 = !bVar.f32070b.isEmpty();
            for (h<Chip> hVar : bVar.f32069a.values()) {
                bVar.e(hVar, false);
            }
            if (z11) {
                bVar.d();
            }
        }
    }
}
