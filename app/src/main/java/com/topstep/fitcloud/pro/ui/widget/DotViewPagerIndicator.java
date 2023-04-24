package com.topstep.fitcloud.pro.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.viewpager.widget.ViewPager;
import com.topstep.fitcloudpro.R;
import gm.l;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class DotViewPagerIndicator extends RadioGroup {

    /* renamed from: k */
    public static final /* synthetic */ int f12260k = 0;

    /* renamed from: a */
    public ViewPager f12261a;

    /* renamed from: b */
    public int f12262b;

    /* renamed from: c */
    public int f12263c;

    /* renamed from: d */
    public int f12264d;

    /* renamed from: e */
    public int f12265e;

    /* renamed from: f */
    public final int[] f12266f;

    /* renamed from: g */
    public final int[] f12267g;

    /* renamed from: h */
    public final a f12268h;

    /* renamed from: i */
    public final b f12269i;

    /* renamed from: j */
    public final c f12270j;

    /* loaded from: classes2.dex */
    public class a extends DataSetObserver {
        public a() {
            DotViewPagerIndicator.this = r1;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            DotViewPagerIndicator dotViewPagerIndicator = DotViewPagerIndicator.this;
            int i10 = DotViewPagerIndicator.f12260k;
            dotViewPagerIndicator.b();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            DotViewPagerIndicator dotViewPagerIndicator = DotViewPagerIndicator.this;
            int i10 = DotViewPagerIndicator.f12260k;
            dotViewPagerIndicator.b();
        }
    }

    /* loaded from: classes2.dex */
    public class b implements ViewPager.h {
        public b() {
            DotViewPagerIndicator.this = r1;
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public final void a(ViewPager viewPager, b3.a aVar, b3.a aVar2) {
            DotViewPagerIndicator dotViewPagerIndicator = DotViewPagerIndicator.this;
            if (viewPager != dotViewPagerIndicator.f12261a) {
                return;
            }
            if (aVar != null) {
                try {
                    aVar.f3994a.unregisterObserver(dotViewPagerIndicator.f12268h);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            DotViewPagerIndicator.this.setupAdapter(aVar2);
            DotViewPagerIndicator.this.b();
        }
    }

    /* loaded from: classes2.dex */
    public class c implements ViewPager.i {
        public c() {
            DotViewPagerIndicator.this = r1;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void a(float f10, int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i10) {
            DotViewPagerIndicator.this.check(i10 + 1);
        }
    }

    public DotViewPagerIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12264d = 0;
        this.f12265e = 0;
        this.f12266f = new int[]{16842912};
        this.f12267g = new int[0];
        this.f12268h = new a();
        this.f12269i = new b();
        this.f12270j = new c();
        setGravity(49);
        setOrientation(0);
        int i10 = (int) (getResources().getDisplayMetrics().density * 6.0f);
        this.f12262b = i10;
        this.f12263c = i10;
        Context context2 = getContext();
        l.f(context2, "context");
        TypedArray obtainStyledAttributes = context2.getTheme().obtainStyledAttributes(new int[]{R.attr.colorPrimary});
        l.e(obtainStyledAttributes, "context.theme.obtainStyl…ributes(intArrayOf(attr))");
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        this.f12264d = color;
        this.f12265e = -3355444;
    }

    public void setupAdapter(b3.a aVar) {
        if (aVar != null) {
            try {
                aVar.f3994a.registerObserver(this.f12268h);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void b() {
        ViewPager viewPager = this.f12261a;
        if (viewPager != null && viewPager.getAdapter() != null && this.f12261a.getAdapter().b() > 0) {
            int b10 = this.f12261a.getAdapter().b() - getChildCount();
            for (int i10 = 0; i10 < Math.abs(b10); i10++) {
                if (b10 > 0) {
                    RadioButton radioButton = new RadioButton(getContext());
                    int childCount = getChildCount() + 1;
                    radioButton.setId(childCount);
                    radioButton.setEnabled(false);
                    radioButton.setButtonDrawable((Drawable) null);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(this.f12264d);
                    gradientDrawable.setShape(1);
                    int i11 = this.f12262b;
                    gradientDrawable.setBounds(0, 0, i11, i11);
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setColor(this.f12265e);
                    gradientDrawable2.setShape(1);
                    int i12 = this.f12262b;
                    gradientDrawable2.setBounds(0, 0, i12, i12);
                    StateListDrawable stateListDrawable = new StateListDrawable();
                    stateListDrawable.addState(this.f12266f, gradientDrawable);
                    stateListDrawable.addState(this.f12267g, gradientDrawable2);
                    radioButton.setBackground(stateListDrawable);
                    int i13 = this.f12262b;
                    RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(i13, i13);
                    if (childCount != 0) {
                        layoutParams.leftMargin = this.f12263c;
                    }
                    radioButton.setLayoutParams(layoutParams);
                    addView(radioButton);
                } else {
                    removeView(getChildAt(getChildCount() - 1));
                }
            }
            check(this.f12261a.getCurrentItem() + 1);
            return;
        }
        removeAllViews();
    }

    public final void c(ViewPager viewPager) {
        ViewPager viewPager2 = this.f12261a;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            b bVar = this.f12269i;
            ArrayList arrayList = viewPager2.f3492h0;
            if (arrayList != null) {
                arrayList.remove(bVar);
            }
            ViewPager viewPager3 = this.f12261a;
            c cVar = this.f12270j;
            ArrayList arrayList2 = viewPager3.f3488f0;
            if (arrayList2 != null) {
                arrayList2.remove(cVar);
            }
            b3.a adapter = this.f12261a.getAdapter();
            if (adapter != null) {
                try {
                    adapter.f3994a.unregisterObserver(this.f12268h);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        this.f12261a = viewPager;
        if (viewPager != null) {
            b bVar2 = this.f12269i;
            if (viewPager.f3492h0 == null) {
                viewPager.f3492h0 = new ArrayList();
            }
            viewPager.f3492h0.add(bVar2);
            ViewPager viewPager4 = this.f12261a;
            c cVar2 = this.f12270j;
            if (viewPager4.f3488f0 == null) {
                viewPager4.f3488f0 = new ArrayList();
            }
            viewPager4.f3488f0.add(cVar2);
            setupAdapter(this.f12261a.getAdapter());
        }
        b();
    }
}
