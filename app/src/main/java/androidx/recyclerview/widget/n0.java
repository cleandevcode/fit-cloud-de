package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m0;

/* loaded from: classes.dex */
public abstract class n0<T2> extends m0.a<T2> {

    /* renamed from: a */
    public final RecyclerView.e f3150a;

    public n0(RecyclerView.e eVar) {
        this.f3150a = eVar;
    }

    @Override // androidx.recyclerview.widget.y
    public final void a(int i10, int i11) {
        this.f3150a.k(i10, i11);
    }

    @Override // androidx.recyclerview.widget.y
    public final void b(int i10, int i11) {
        this.f3150a.l(i10, i11);
    }

    @Override // androidx.recyclerview.widget.y
    public final void c(int i10, int i11) {
        this.f3150a.i(i10, i11);
    }

    @Override // androidx.recyclerview.widget.m0.a, androidx.recyclerview.widget.y
    public final void d(int i10, int i11, Object obj) {
        this.f3150a.j(i10, i11, obj);
    }
}
