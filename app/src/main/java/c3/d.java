package c3;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class d implements RecyclerView.o {
    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void b(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void d(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) nVar).width != -1 || ((ViewGroup.MarginLayoutParams) nVar).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
