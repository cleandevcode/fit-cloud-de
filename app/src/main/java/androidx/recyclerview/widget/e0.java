package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class e0 extends x {

    /* renamed from: q */
    public final /* synthetic */ f0 f3097q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, Context context) {
        super(context);
        this.f3097q = f0Var;
    }

    @Override // androidx.recyclerview.widget.x, androidx.recyclerview.widget.RecyclerView.x
    public final void c(View view, RecyclerView.x.a aVar) {
        f0 f0Var = this.f3097q;
        int[] b10 = f0Var.b(f0Var.f3133a.getLayoutManager(), view);
        int i10 = b10[0];
        int i11 = b10[1];
        int ceil = (int) Math.ceil(g(Math.max(Math.abs(i10), Math.abs(i11))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f3329j;
            aVar.f3008a = i10;
            aVar.f3009b = i11;
            aVar.f3010c = ceil;
            aVar.f3012e = decelerateInterpolator;
            aVar.f3013f = true;
        }
    }

    @Override // androidx.recyclerview.widget.x
    public final float f(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.x
    public final int g(int i10) {
        return Math.min(100, super.g(i10));
    }
}
