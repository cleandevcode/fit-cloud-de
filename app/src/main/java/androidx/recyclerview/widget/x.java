package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class x extends RecyclerView.x {

    /* renamed from: k */
    public PointF f3330k;

    /* renamed from: l */
    public final DisplayMetrics f3331l;

    /* renamed from: n */
    public float f3333n;

    /* renamed from: i */
    public final LinearInterpolator f3328i = new LinearInterpolator();

    /* renamed from: j */
    public final DecelerateInterpolator f3329j = new DecelerateInterpolator();

    /* renamed from: m */
    public boolean f3332m = false;

    /* renamed from: o */
    public int f3334o = 0;

    /* renamed from: p */
    public int f3335p = 0;

    public x(Context context) {
        this.f3331l = context.getResources().getDisplayMetrics();
    }

    public static int e(int i10, int i11, int i12, int i13, int i14) {
        if (i14 != -1) {
            if (i14 != 0) {
                if (i14 == 1) {
                    return i13 - i11;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i15 = i12 - i10;
            if (i15 > 0) {
                return i15;
            }
            int i16 = i13 - i11;
            if (i16 < 0) {
                return i16;
            }
            return 0;
        }
        return i12 - i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x
    public void c(View view, RecyclerView.x.a aVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        PointF pointF = this.f3330k;
        int i14 = -1;
        int i15 = 0;
        if (pointF != null && pointF.x != 0.0f) {
            if (i13 > 0) {
                i10 = 1;
            } else {
                i10 = -1;
            }
        } else {
            i10 = 0;
        }
        RecyclerView.m mVar = this.f3002c;
        if (mVar != null && mVar.f()) {
            RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
            i11 = e((view.getLeft() - RecyclerView.m.C(view)) - ((ViewGroup.MarginLayoutParams) nVar).leftMargin, RecyclerView.m.J(view) + view.getRight() + ((ViewGroup.MarginLayoutParams) nVar).rightMargin, mVar.E(), mVar.f2972n - mVar.F(), i10);
        } else {
            i11 = 0;
        }
        PointF pointF2 = this.f3330k;
        if (pointF2 != null && pointF2.y != 0.0f) {
            if (i12 > 0) {
                i14 = 1;
            }
        } else {
            i14 = 0;
        }
        RecyclerView.m mVar2 = this.f3002c;
        if (mVar2 != null && mVar2.g()) {
            RecyclerView.n nVar2 = (RecyclerView.n) view.getLayoutParams();
            i15 = e((view.getTop() - RecyclerView.m.L(view)) - ((ViewGroup.MarginLayoutParams) nVar2).topMargin, RecyclerView.m.w(view) + view.getBottom() + ((ViewGroup.MarginLayoutParams) nVar2).bottomMargin, mVar2.G(), mVar2.f2973o - mVar2.D(), i14);
        }
        int ceil = (int) Math.ceil(g((int) Math.sqrt((i15 * i15) + (i11 * i11))) / 0.3356d);
        if (ceil > 0) {
            int i16 = -i15;
            DecelerateInterpolator decelerateInterpolator = this.f3329j;
            aVar.f3008a = -i11;
            aVar.f3009b = i16;
            aVar.f3010c = ceil;
            aVar.f3012e = decelerateInterpolator;
            aVar.f3013f = true;
        }
    }

    public float f(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int g(int i10) {
        float abs = Math.abs(i10);
        if (!this.f3332m) {
            this.f3333n = f(this.f3331l);
            this.f3332m = true;
        }
        return (int) Math.ceil(abs * this.f3333n);
    }
}
