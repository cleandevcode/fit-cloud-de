package zh;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import s.h1;

/* loaded from: classes2.dex */
public final class h extends RecyclerView.e<a> {

    /* renamed from: d */
    public final f f32453d;

    /* renamed from: e */
    public final f f32454e;

    /* renamed from: f */
    public final f f32455f;

    /* renamed from: g */
    public boolean f32456g = false;

    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.b0 {

        /* renamed from: u */
        public final RecyclerView f32457u;

        public a(RecyclerView recyclerView) {
            super(recyclerView);
            this.f32457u = recyclerView;
        }
    }

    public h(f fVar, f fVar2, f fVar3) {
        this.f32453d = fVar;
        this.f32454e = fVar2;
        this.f32455f = fVar3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        return this.f32456g ? 2 : 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i10) {
        RecyclerView recyclerView;
        f fVar;
        a aVar2 = aVar;
        if (this.f32456g) {
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalArgumentException();
                }
                recyclerView = aVar2.f32457u;
                fVar = this.f32455f;
            }
            recyclerView = aVar2.f32457u;
            fVar = this.f32453d;
        } else {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalArgumentException();
                    }
                    recyclerView = aVar2.f32457u;
                    fVar = this.f32455f;
                } else {
                    recyclerView = aVar2.f32457u;
                    fVar = this.f32454e;
                }
            }
            recyclerView = aVar2.f32457u;
            fVar = this.f32453d;
        }
        recyclerView.setAdapter(fVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        gm.l.f(recyclerView, "parent");
        RecyclerView recyclerView2 = new RecyclerView(recyclerView.getContext(), null);
        Context context = recyclerView.getContext();
        gm.l.e(context, "parent.context");
        int p10 = h1.p(context, 3);
        recyclerView2.getContext();
        recyclerView2.setLayoutManager(new GridLayoutManager(p10));
        recyclerView2.g(new oi.b(p10, g7.a.a(recyclerView.getContext(), 16.0f)));
        recyclerView2.setLayoutParams(new RecyclerView.n(-1, -1));
        return new a(recyclerView2);
    }
}
