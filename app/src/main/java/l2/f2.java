package l2;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.b0;

/* loaded from: classes.dex */
public abstract class f2<T, VH extends RecyclerView.b0> extends RecyclerView.e<VH> {

    /* renamed from: d */
    public boolean f18884d;

    /* renamed from: e */
    public final g<T> f18885e;

    /* renamed from: f */
    public final sm.j0 f18886f;

    public f2(mi.x xVar) {
        wm.c cVar = pm.o0.f24381a;
        pm.p1 p1Var = um.q.f28935a;
        wm.c cVar2 = pm.o0.f24381a;
        gm.l.f(p1Var, "mainDispatcher");
        gm.l.f(cVar2, "workerDispatcher");
        mi.w wVar = (mi.w) this;
        g<T> gVar = new g<>(xVar, new androidx.recyclerview.widget.b(wVar), p1Var, cVar2);
        this.f18885e = gVar;
        super.w(3);
        u(new c2(wVar));
        z(new d2(wVar));
        this.f18886f = gVar.f18894h;
    }

    public static final void y(f2 f2Var) {
        if (f2Var.f2949c == 3 && !f2Var.f18884d) {
            f2Var.f18884d = true;
            super.w(1);
        }
    }

    public final T A(int i10) {
        g<T> gVar = this.f18885e;
        gVar.getClass();
        try {
            gVar.f18891e = true;
            e eVar = gVar.f18892f;
            eVar.f19026h = true;
            eVar.f19027i = i10;
            h3 h3Var = eVar.f19022d;
            if (h3Var != null) {
                h3Var.b(eVar.f19021c.a(i10));
            }
            return eVar.f19021c.h(i10);
        } finally {
            gVar.f18891e = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int e() {
        return this.f18885e.f18892f.f19021c.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final long f(int i10) {
        return -1L;
    }

    public final void z(fm.l<? super u, tl.l> lVar) {
        u uVar;
        g<T> gVar = this.f18885e;
        gVar.getClass();
        e eVar = gVar.f18892f;
        eVar.getClass();
        v0 v0Var = eVar.f19023e;
        v0Var.getClass();
        v0Var.f19317b.add(lVar);
        if (!v0Var.f19316a) {
            uVar = null;
        } else {
            uVar = new u(v0Var.f19318c, v0Var.f19319d, v0Var.f19320e, v0Var.f19321f, v0Var.f19322g);
        }
        if (uVar != null) {
            lVar.k(uVar);
        }
    }
}
