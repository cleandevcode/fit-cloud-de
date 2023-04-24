package b3;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import k1.e0;
import k1.n2;
import k1.o0;

/* loaded from: classes.dex */
public final class b implements e0 {

    /* renamed from: a */
    public final Rect f3995a = new Rect();

    /* renamed from: b */
    public final /* synthetic */ ViewPager f3996b;

    public b(ViewPager viewPager) {
        this.f3996b = viewPager;
    }

    @Override // k1.e0
    public final n2 a(View view, n2 n2Var) {
        n2 k10 = o0.k(view, n2Var);
        if (k10.f18130a.m()) {
            return k10;
        }
        Rect rect = this.f3995a;
        rect.left = k10.c();
        rect.top = k10.e();
        rect.right = k10.d();
        rect.bottom = k10.b();
        int childCount = this.f3996b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            n2 b10 = o0.b(this.f3996b.getChildAt(i10), k10);
            rect.left = Math.min(b10.c(), rect.left);
            rect.top = Math.min(b10.e(), rect.top);
            rect.right = Math.min(b10.d(), rect.right);
            rect.bottom = Math.min(b10.b(), rect.bottom);
        }
        return k10.g(rect.left, rect.top, rect.right, rect.bottom);
    }
}
