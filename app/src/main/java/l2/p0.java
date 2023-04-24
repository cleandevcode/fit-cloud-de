package l2;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.b0;
import l2.n0;
import ri.b;

/* loaded from: classes.dex */
public abstract class p0<VH extends RecyclerView.b0> extends RecyclerView.e<VH> {

    /* renamed from: d */
    public n0 f19182d = new n0.c(false);

    public abstract b.a A(RecyclerView recyclerView, n0 n0Var);

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        return y(this.f19182d) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int g(int i10) {
        gm.l.f(this.f19182d, "loadState");
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(VH vh2, int i10) {
        z(vh2, this.f19182d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.b0 o(RecyclerView recyclerView, int i10) {
        gm.l.f(recyclerView, "parent");
        return A(recyclerView, this.f19182d);
    }

    public abstract boolean y(n0 n0Var);

    public abstract void z(VH vh2, n0 n0Var);
}
