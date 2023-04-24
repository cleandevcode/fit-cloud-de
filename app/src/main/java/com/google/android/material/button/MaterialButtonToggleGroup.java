package com.google.android.material.button;

import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import ga.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import k1.h;
import k1.i2;
import k1.o0;
import l1.j;
import z9.r;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k */
    public static final int f6342k = R.style.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: a */
    public final ArrayList f6343a;

    /* renamed from: b */
    public final e f6344b;

    /* renamed from: c */
    public final LinkedHashSet<d> f6345c;

    /* renamed from: d */
    public final a f6346d;

    /* renamed from: e */
    public Integer[] f6347e;

    /* renamed from: f */
    public boolean f6348f;

    /* renamed from: g */
    public boolean f6349g;

    /* renamed from: h */
    public boolean f6350h;

    /* renamed from: i */
    public final int f6351i;

    /* renamed from: j */
    public HashSet f6352j;

    /* loaded from: classes.dex */
    public class a implements Comparator<MaterialButton> {
        public a() {
            MaterialButtonToggleGroup.this = r1;
        }

        @Override // java.util.Comparator
        public final int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int compareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton3)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton4)));
        }
    }

    /* loaded from: classes.dex */
    public class b extends k1.a {
        public b() {
            MaterialButtonToggleGroup.this = r1;
        }

        @Override // k1.a
        public final void d(View view, j jVar) {
            int i10;
            this.f18085a.onInitializeAccessibilityNodeInfo(view, jVar.f18670a);
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            int i11 = MaterialButtonToggleGroup.f6342k;
            materialButtonToggleGroup.getClass();
            if (view instanceof MaterialButton) {
                i10 = 0;
                for (int i12 = 0; i12 < materialButtonToggleGroup.getChildCount(); i12++) {
                    if (materialButtonToggleGroup.getChildAt(i12) == view) {
                        break;
                    }
                    if ((materialButtonToggleGroup.getChildAt(i12) instanceof MaterialButton) && materialButtonToggleGroup.d(i12)) {
                        i10++;
                    }
                }
            }
            i10 = -1;
            jVar.h(j.c.a(0, 1, i10, 1, ((MaterialButton) view).isChecked()));
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: e */
        public static final ga.a f6355e = new ga.a(0.0f);

        /* renamed from: a */
        public ga.c f6356a;

        /* renamed from: b */
        public ga.c f6357b;

        /* renamed from: c */
        public ga.c f6358c;

        /* renamed from: d */
        public ga.c f6359d;

        public c(ga.c cVar, ga.c cVar2, ga.c cVar3, ga.c cVar4) {
            this.f6356a = cVar;
            this.f6357b = cVar3;
            this.f6358c = cVar4;
            this.f6359d = cVar2;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();
    }

    /* loaded from: classes.dex */
    public class e implements MaterialButton.b {
        public e() {
            MaterialButtonToggleGroup.this = r1;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8) {
        /*
            r6 = this;
            int r3 = com.google.android.material.R.attr.materialButtonToggleGroupStyle
            int r4 = com.google.android.material.button.MaterialButtonToggleGroup.f6342k
            android.content.Context r7 = la.a.a(r7, r8, r3, r4)
            r6.<init>(r7, r8, r3)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f6343a = r7
            com.google.android.material.button.MaterialButtonToggleGroup$e r7 = new com.google.android.material.button.MaterialButtonToggleGroup$e
            r7.<init>()
            r6.f6344b = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f6345c = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f6346d = r7
            r7 = 0
            r6.f6348f = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.f6352j = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialButtonToggleGroup
            int[] r5 = new int[r7]
            r1 = r8
            android.content.res.TypedArray r8 = z9.o.d(r0, r1, r2, r3, r4, r5)
            int r0 = com.google.android.material.R.styleable.MaterialButtonToggleGroup_singleSelection
            boolean r0 = r8.getBoolean(r0, r7)
            r6.setSingleSelection(r0)
            int r0 = com.google.android.material.R.styleable.MaterialButtonToggleGroup_checkedButton
            r1 = -1
            int r0 = r8.getResourceId(r0, r1)
            r6.f6351i = r0
            int r0 = com.google.android.material.R.styleable.MaterialButtonToggleGroup_selectionRequired
            boolean r7 = r8.getBoolean(r0, r7)
            r6.f6350h = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            java.util.WeakHashMap<android.view.View, k1.i2> r8 = k1.o0.f18161a
            k1.o0.d.s(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (d(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && d(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            materialButton.setId(o0.e.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f6344b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton c10 = c(i10);
            int min = Math.min(c10.getStrokeWidth(), c(i10 - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams2 = c10.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            }
            if (getOrientation() == 0) {
                h.g(layoutParams, 0);
                h.h(layoutParams, -min);
                layoutParams.topMargin = 0;
            } else {
                layoutParams.bottomMargin = 0;
                layoutParams.topMargin = -min;
                h.h(layoutParams, 0);
            }
            c10.setLayoutParams(layoutParams);
        }
        if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) c(firstVisibleChildIndex).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
                return;
            }
            h.g(layoutParams3, 0);
            h.h(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.isChecked());
        i shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f6343a.add(new c(shapeAppearanceModel.f15121e, shapeAppearanceModel.f15124h, shapeAppearanceModel.f15122f, shapeAppearanceModel.f15123g));
        o0.p(materialButton, new b());
    }

    public final void b(int i10, boolean z10) {
        if (i10 == -1) {
            Log.e("MaterialButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f6352j);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f6349g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else if (z10 || !hashSet.contains(Integer.valueOf(i10))) {
            return;
        } else {
            if (!this.f6350h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        e(hashSet);
    }

    public final MaterialButton c(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    public final boolean d(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f6346d);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(c(i10), Integer.valueOf(i10));
        }
        this.f6347e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e(Set<Integer> set) {
        HashSet hashSet = this.f6352j;
        this.f6352j = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = c(i10).getId();
            boolean contains = set.contains(Integer.valueOf(id2));
            View findViewById = findViewById(id2);
            if (findViewById instanceof MaterialButton) {
                this.f6348f = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f6348f = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                set.contains(Integer.valueOf(id2));
                Iterator<d> it = this.f6345c.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }
        invalidate();
    }

    public final void f() {
        boolean z10;
        c cVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton c10 = c(i10);
            if (c10.getVisibility() != 8) {
                i shapeAppearanceModel = c10.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                i.a aVar = new i.a(shapeAppearanceModel);
                c cVar2 = (c) this.f6343a.get(i10);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i10 == firstVisibleChildIndex) {
                        if (z10) {
                            if (r.c(this)) {
                                ga.a aVar2 = c.f6355e;
                                cVar = new c(aVar2, aVar2, cVar2.f6357b, cVar2.f6358c);
                            } else {
                                ga.c cVar3 = cVar2.f6356a;
                                ga.c cVar4 = cVar2.f6359d;
                                ga.a aVar3 = c.f6355e;
                                cVar = new c(cVar3, cVar4, aVar3, aVar3);
                            }
                        } else {
                            ga.c cVar5 = cVar2.f6356a;
                            ga.a aVar4 = c.f6355e;
                            cVar = new c(cVar5, aVar4, cVar2.f6357b, aVar4);
                        }
                    } else if (i10 == lastVisibleChildIndex) {
                        if (z10) {
                            if (r.c(this)) {
                                ga.c cVar6 = cVar2.f6356a;
                                ga.c cVar7 = cVar2.f6359d;
                                ga.a aVar5 = c.f6355e;
                                cVar = new c(cVar6, cVar7, aVar5, aVar5);
                            } else {
                                ga.a aVar6 = c.f6355e;
                                cVar = new c(aVar6, aVar6, cVar2.f6357b, cVar2.f6358c);
                            }
                        } else {
                            ga.a aVar7 = c.f6355e;
                            cVar = new c(aVar7, cVar2.f6359d, aVar7, cVar2.f6358c);
                        }
                    } else {
                        cVar2 = null;
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    aVar.f15133e = new ga.a(0.0f);
                    aVar.f15134f = new ga.a(0.0f);
                    aVar.f15135g = new ga.a(0.0f);
                    aVar.f15136h = new ga.a(0.0f);
                } else {
                    aVar.f15133e = cVar2.f6356a;
                    aVar.f15136h = cVar2.f6359d;
                    aVar.f15134f = cVar2.f6357b;
                    aVar.f15135g = cVar2.f6358c;
                }
                c10.setShapeAppearanceModel(new i(aVar));
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f6349g || this.f6352j.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f6352j.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = c(i10).getId();
            if (this.f6352j.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f6347e;
        if (numArr == null || i11 >= numArr.length) {
            Log.w("MaterialButtonToggleGroup", "Child order wasn't updated");
            return i11;
        }
        return numArr[i11].intValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f6351i;
        if (i10 != -1) {
            e(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.f6349g) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) j.b.a(1, visibleButtonCount, i10).f18685a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        f();
        a();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f6343a.remove(indexOfChild);
        }
        f();
        a();
    }

    public void setSelectionRequired(boolean z10) {
        this.f6350h = z10;
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }

    public void setSingleSelection(boolean z10) {
        if (this.f6349g != z10) {
            this.f6349g = z10;
            e(new HashSet());
        }
    }
}
