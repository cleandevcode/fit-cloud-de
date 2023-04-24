package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.google.android.material.R;
import ga.i;
import java.util.WeakHashMap;
import k1.i2;
import k1.o0;

/* loaded from: classes.dex */
public class d extends ConstraintLayout {

    /* renamed from: q */
    public final a f6911q;

    /* renamed from: r */
    public int f6912r;

    /* renamed from: s */
    public ga.f f6913s;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            d.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.this.i();
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        ga.f fVar = new ga.f();
        this.f6913s = fVar;
        ga.g gVar = new ga.g(0.5f);
        i iVar = fVar.f15069a.f15093a;
        iVar.getClass();
        i.a aVar = new i.a(iVar);
        aVar.f15133e = gVar;
        aVar.f15134f = gVar;
        aVar.f15135g = gVar;
        aVar.f15136h = gVar;
        fVar.setShapeAppearanceModel(new i(aVar));
        this.f6913s.k(ColorStateList.valueOf(-1));
        ga.f fVar2 = this.f6913s;
        WeakHashMap<View, i2> weakHashMap = o0.f18161a;
        o0.d.q(this, fVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RadialViewGroup, i10, 0);
        this.f6912r = obtainStyledAttributes.getDimensionPixelSize(R.styleable.RadialViewGroup_materialCircleRadius, 0);
        this.f6911q = new a();
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, i2> weakHashMap = o0.f18161a;
            view.setId(o0.e.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f6911q);
            handler.post(this.f6911q);
        }
    }

    public final void i() {
        int childCount = getChildCount();
        int i10 = 1;
        for (int i11 = 0; i11 < childCount; i11++) {
            if ("skip".equals(getChildAt(i11).getTag())) {
                i10++;
            }
        }
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.b(this);
        float f10 = 0.0f;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            int id2 = childAt.getId();
            int i13 = R.id.circle_center;
            if (id2 != i13 && !"skip".equals(childAt.getTag())) {
                int id3 = childAt.getId();
                int i14 = this.f6912r;
                if (!dVar.f2028c.containsKey(Integer.valueOf(id3))) {
                    dVar.f2028c.put(Integer.valueOf(id3), new d.a());
                }
                d.b bVar = dVar.f2028c.get(Integer.valueOf(id3)).f2032d;
                bVar.f2088z = i13;
                bVar.A = i14;
                bVar.B = f10;
                f10 = (360.0f / (childCount - i10)) + f10;
            }
        }
        dVar.a(this);
        setConstraintSet(null);
        requestLayout();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        i();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f6911q);
            handler.post(this.f6911q);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i10) {
        this.f6913s.k(ColorStateList.valueOf(i10));
    }
}
