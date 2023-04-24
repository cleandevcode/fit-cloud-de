package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.e;

/* loaded from: classes.dex */
public final class g0 implements e.b {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f3112a;

    public g0(RecyclerView recyclerView) {
        this.f3112a = recyclerView;
    }

    public final int a() {
        return this.f3112a.getChildCount();
    }

    public final void b(int i10) {
        View childAt = this.f3112a.getChildAt(i10);
        if (childAt != null) {
            this.f3112a.o(childAt);
            childAt.clearAnimation();
        }
        this.f3112a.removeViewAt(i10);
    }
}
