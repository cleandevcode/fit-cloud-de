package com.google.android.material.bottomnavigation;

import android.view.View;
import ba.f;

/* loaded from: classes.dex */
public class BottomNavigationView extends f {

    @Deprecated
    /* loaded from: classes.dex */
    public interface a extends f.b {
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface b extends f.c {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BottomNavigationView(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r10 = this;
            int r6 = com.google.android.material.R.attr.bottomNavigationStyle
            int r7 = com.google.android.material.R.style.Widget_Design_BottomNavigationView
            r10.<init>(r11, r12, r6, r7)
            android.content.Context r11 = r10.getContext()
            int[] r8 = com.google.android.material.R.styleable.BottomNavigationView
            r9 = 0
            int[] r5 = new int[r9]
            z9.o.a(r11, r12, r6, r7)
            r0 = r11
            r1 = r12
            r2 = r8
            r3 = r6
            r4 = r7
            z9.o.b(r0, r1, r2, r3, r4, r5)
            android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r12, r8, r6, r7)
            int r12 = com.google.android.material.R.styleable.BottomNavigationView_itemHorizontalTranslationEnabled
            r0 = 1
            boolean r12 = r11.getBoolean(r12, r0)
            r10.setItemHorizontalTranslationEnabled(r12)
            int r12 = com.google.android.material.R.styleable.BottomNavigationView_android_minHeight
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L38
            int r12 = r11.getDimensionPixelSize(r12, r9)
            r10.setMinimumHeight(r12)
        L38:
            r11.recycle()
            m9.c r11 = new m9.c
            r11.<init>()
            z9.r.a(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomnavigation.BottomNavigationView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // ba.f
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i11) != 1073741824 && suggestedMinimumHeight > 0) {
            int paddingTop = getPaddingTop();
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), getPaddingBottom() + paddingTop + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        m9.b bVar = (m9.b) getMenuView();
        if (bVar.M != z10) {
            bVar.setItemHorizontalTranslationEnabled(z10);
            getPresenter().d(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(a aVar) {
        setOnItemReselectedListener(aVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(b bVar) {
        setOnItemSelectedListener(bVar);
    }
}
