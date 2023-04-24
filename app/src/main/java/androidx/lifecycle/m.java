package androidx.lifecycle;

import androidx.lifecycle.k;
import pm.g1;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    public final k f2744a;

    /* renamed from: b */
    public final k.c f2745b;

    /* renamed from: c */
    public final e f2746c;

    /* renamed from: d */
    public final l f2747d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.t, androidx.lifecycle.l] */
    public m(k kVar, k.c cVar, e eVar, final g1 g1Var) {
        gm.l.f(kVar, "lifecycle");
        gm.l.f(cVar, "minState");
        gm.l.f(eVar, "dispatchQueue");
        this.f2744a = kVar;
        this.f2745b = cVar;
        this.f2746c = eVar;
        ?? r32 = new s() { // from class: androidx.lifecycle.l
            @Override // androidx.lifecycle.s
            public final void d(u uVar, k.b bVar) {
                m mVar = m.this;
                g1 g1Var2 = g1Var;
                gm.l.f(mVar, "this$0");
                gm.l.f(g1Var2, "$parentJob");
                if (uVar.a0().f2790c == k.c.DESTROYED) {
                    g1Var2.h(null);
                    mVar.a();
                    return;
                }
                int compareTo = uVar.a0().f2790c.compareTo(mVar.f2745b);
                e eVar2 = mVar.f2746c;
                if (compareTo < 0) {
                    eVar2.f2704a = true;
                } else if (eVar2.f2704a) {
                    if (!eVar2.f2705b) {
                        eVar2.f2704a = false;
                        eVar2.a();
                        return;
                    }
                    throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
                }
            }
        };
        this.f2747d = r32;
        if (kVar.b() == k.c.DESTROYED) {
            g1Var.h(null);
            a();
            return;
        }
        kVar.a(r32);
    }

    public final void a() {
        this.f2744a.c(this.f2747d);
        e eVar = this.f2746c;
        eVar.f2705b = true;
        eVar.a();
    }
}
