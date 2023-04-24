package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;

/* loaded from: classes.dex */
public final class e extends ViewGroup {

    /* renamed from: a */
    public d f2118a;

    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.a {
        public float A0;
        public float B0;
        public float C0;
        public float D0;

        /* renamed from: r0 */
        public float f2119r0;

        /* renamed from: s0 */
        public boolean f2120s0;

        /* renamed from: t0 */
        public float f2121t0;

        /* renamed from: u0 */
        public float f2122u0;

        /* renamed from: v0 */
        public float f2123v0;

        /* renamed from: w0 */
        public float f2124w0;

        /* renamed from: x0 */
        public float f2125x0;

        /* renamed from: y0 */
        public float f2126y0;

        /* renamed from: z0 */
        public float f2127z0;

        public a() {
            this.f2119r0 = 1.0f;
            this.f2120s0 = false;
            this.f2121t0 = 0.0f;
            this.f2122u0 = 0.0f;
            this.f2123v0 = 0.0f;
            this.f2124w0 = 0.0f;
            this.f2125x0 = 1.0f;
            this.f2126y0 = 1.0f;
            this.f2127z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2119r0 = 1.0f;
            this.f2120s0 = false;
            this.f2121t0 = 0.0f;
            this.f2122u0 = 0.0f;
            this.f2123v0 = 0.0f;
            this.f2124w0 = 0.0f;
            this.f2125x0 = 1.0f;
            this.f2126y0 = 1.0f;
            this.f2127z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ConstraintSet_android_alpha) {
                    this.f2119r0 = obtainStyledAttributes.getFloat(index, this.f2119r0);
                } else if (index == R.styleable.ConstraintSet_android_elevation) {
                    this.f2121t0 = obtainStyledAttributes.getFloat(index, this.f2121t0);
                    this.f2120s0 = true;
                } else if (index == R.styleable.ConstraintSet_android_rotationX) {
                    this.f2123v0 = obtainStyledAttributes.getFloat(index, this.f2123v0);
                } else if (index == R.styleable.ConstraintSet_android_rotationY) {
                    this.f2124w0 = obtainStyledAttributes.getFloat(index, this.f2124w0);
                } else if (index == R.styleable.ConstraintSet_android_rotation) {
                    this.f2122u0 = obtainStyledAttributes.getFloat(index, this.f2122u0);
                } else if (index == R.styleable.ConstraintSet_android_scaleX) {
                    this.f2125x0 = obtainStyledAttributes.getFloat(index, this.f2125x0);
                } else if (index == R.styleable.ConstraintSet_android_scaleY) {
                    this.f2126y0 = obtainStyledAttributes.getFloat(index, this.f2126y0);
                } else if (index == R.styleable.ConstraintSet_android_transformPivotX) {
                    this.f2127z0 = obtainStyledAttributes.getFloat(index, this.f2127z0);
                } else if (index == R.styleable.ConstraintSet_android_transformPivotY) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == R.styleable.ConstraintSet_android_translationX) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == R.styleable.ConstraintSet_android_translationY) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == R.styleable.ConstraintSet_android_translationZ) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    public d getConstraintSet() {
        if (this.f2118a == null) {
            this.f2118a = new d();
        }
        d dVar = this.f2118a;
        dVar.getClass();
        int childCount = getChildCount();
        dVar.f2028c.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            a aVar = (a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (dVar.f2027b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!dVar.f2028c.containsKey(Integer.valueOf(id2))) {
                dVar.f2028c.put(Integer.valueOf(id2), new d.a());
            }
            d.a aVar2 = dVar.f2028c.get(Integer.valueOf(id2));
            if (aVar2 != null) {
                if (childAt instanceof b) {
                    b bVar = (b) childAt;
                    aVar2.c(id2, aVar);
                    if (bVar instanceof Barrier) {
                        d.b bVar2 = aVar2.f2032d;
                        bVar2.f2063h0 = 1;
                        Barrier barrier = (Barrier) bVar;
                        bVar2.f2059f0 = barrier.getType();
                        aVar2.f2032d.f2065i0 = barrier.getReferencedIds();
                        aVar2.f2032d.f2061g0 = barrier.getMargin();
                    }
                }
                aVar2.c(id2, aVar);
            }
        }
        return this.f2118a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
