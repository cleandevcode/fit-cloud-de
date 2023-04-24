package h8;

import h8.h;

/* loaded from: classes.dex */
public final class c1 extends x0 {

    /* renamed from: c */
    public final h.a f15920c;

    public c1(h.a aVar, g9.h hVar) {
        super(4, hVar);
        this.f15920c = aVar;
    }

    @Override // h8.d1
    public final /* bridge */ /* synthetic */ void d(s sVar, boolean z10) {
    }

    @Override // h8.i0
    public final boolean f(c0 c0Var) {
        o0 o0Var = (o0) c0Var.f15912f.get(this.f15920c);
        if (o0Var != null && o0Var.f16007a.f15974c) {
            return true;
        }
        return false;
    }

    @Override // h8.i0
    public final f8.c[] g(c0 c0Var) {
        o0 o0Var = (o0) c0Var.f15912f.get(this.f15920c);
        if (o0Var == null) {
            return null;
        }
        return o0Var.f16007a.f15973b;
    }

    @Override // h8.x0
    public final void h(c0 c0Var) {
        o0 o0Var = (o0) c0Var.f15912f.remove(this.f15920c);
        if (o0Var != null) {
            p pVar = o0Var.f16008b;
            ((r0) pVar).f16017a.f15984b.a(c0Var.f15908b, this.f16038b);
            h hVar = o0Var.f16007a.f15972a;
            hVar.f15957b = null;
            hVar.f15958c = null;
            return;
        }
        g9.h hVar2 = this.f16038b;
        Boolean bool = Boolean.FALSE;
        g9.t tVar = hVar2.f15034a;
        synchronized (tVar.f15057a) {
            if (!tVar.f15059c) {
                tVar.f15059c = true;
                tVar.f15061e = bool;
                tVar.f15058b.b(tVar);
            }
        }
    }
}
