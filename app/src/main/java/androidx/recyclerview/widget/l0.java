package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class l0 extends RecyclerView.p {

    /* renamed from: a */
    public RecyclerView f3133a;

    /* renamed from: b */
    public final a f3134b = new a();

    /* loaded from: classes.dex */
    public class a extends RecyclerView.r {

        /* renamed from: a */
        public boolean f3135a = false;

        public a() {
            l0.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void a(int i10, RecyclerView recyclerView) {
            if (i10 == 0 && this.f3135a) {
                this.f3135a = false;
                l0.this.d();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f3135a = true;
        }
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3133a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            a aVar = this.f3134b;
            ArrayList arrayList = recyclerView2.f2908v0;
            if (arrayList != null) {
                arrayList.remove(aVar);
            }
            this.f3133a.setOnFlingListener(null);
        }
        this.f3133a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() == null) {
                this.f3133a.h(this.f3134b);
                this.f3133a.setOnFlingListener(this);
                new Scroller(this.f3133a.getContext(), new DecelerateInterpolator());
                d();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    public abstract int[] b(RecyclerView.m mVar, View view);

    public abstract View c(RecyclerView.m mVar);

    public final void d() {
        RecyclerView.m layoutManager;
        View c10;
        RecyclerView recyclerView = this.f3133a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (c10 = c(layoutManager)) == null) {
            return;
        }
        int[] b10 = b(layoutManager, c10);
        int i10 = b10[0];
        if (i10 == 0 && b10[1] == 0) {
            return;
        }
        this.f3133a.e0(i10, b10[1], false);
    }
}
