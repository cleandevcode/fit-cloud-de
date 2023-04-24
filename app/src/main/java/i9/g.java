package i9;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k1.i2;
import k1.n2;
import k1.o0;

/* loaded from: classes.dex */
public abstract class g extends h<View> {

    /* renamed from: c */
    public final Rect f16748c;

    /* renamed from: d */
    public final Rect f16749d;

    /* renamed from: e */
    public int f16750e;

    /* renamed from: f */
    public int f16751f;

    public g() {
        this.f16748c = new Rect();
        this.f16749d = new Rect();
        this.f16750e = 0;
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16748c = new Rect();
        this.f16749d = new Rect();
        this.f16750e = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        AppBarLayout u10;
        int i13;
        n2 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 == -1 || i14 == -2) && (u10 = u(coordinatorLayout.f(view))) != null) {
            int size = View.MeasureSpec.getSize(i12);
            if (size > 0) {
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                if (o0.d.b(u10) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.b() + lastWindowInsets.e();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int w10 = (w(u10) + size) - u10.getMeasuredHeight();
            if (i14 == -1) {
                i13 = 1073741824;
            } else {
                i13 = Integer.MIN_VALUE;
            }
            coordinatorLayout.t(view, i10, i11, View.MeasureSpec.makeMeasureSpec(w10, i13));
            return true;
        }
        return false;
    }

    @Override // i9.h
    public final void t(CoordinatorLayout coordinatorLayout, View view, int i10) {
        int i11;
        AppBarLayout u10 = u(coordinatorLayout.f(view));
        int i12 = 0;
        if (u10 != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f16748c;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, u10.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((u10.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            n2 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap<View, i2> weakHashMap = o0.f18161a;
                if (o0.d.b(coordinatorLayout) && !o0.d.b(view)) {
                    rect.left = lastWindowInsets.c() + rect.left;
                    rect.right -= lastWindowInsets.d();
                }
            }
            Rect rect2 = this.f16749d;
            int i13 = fVar.f2161c;
            if (i13 == 0) {
                i11 = 8388659;
            } else {
                i11 = i13;
            }
            k1.f.b(i11, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
            if (this.f16751f != 0) {
                float v10 = v(u10);
                int i14 = this.f16751f;
                i12 = b0.c.k((int) (v10 * i14), 0, i14);
            }
            view.layout(rect2.left, rect2.top - i12, rect2.right, rect2.bottom - i12);
            i12 = rect2.top - u10.getBottom();
        } else {
            coordinatorLayout.s(view, i10);
        }
        this.f16750e = i12;
    }

    public abstract AppBarLayout u(ArrayList arrayList);

    public float v(View view) {
        return 1.0f;
    }

    public int w(View view) {
        return view.getMeasuredHeight();
    }
}
