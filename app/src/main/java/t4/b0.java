package t4;

import com.bumptech.glide.load.data.d;
import t4.h;
import x4.n;

/* loaded from: classes.dex */
public final class b0 implements d.a<Object> {

    /* renamed from: a */
    public final /* synthetic */ n.a f27568a;

    /* renamed from: b */
    public final /* synthetic */ c0 f27569b;

    public b0(c0 c0Var, n.a aVar) {
        this.f27569b = c0Var;
        this.f27568a = aVar;
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void c(Exception exc) {
        boolean z10;
        c0 c0Var = this.f27569b;
        n.a<?> aVar = this.f27568a;
        n.a<?> aVar2 = c0Var.f27583f;
        if (aVar2 != null && aVar2 == aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c0 c0Var2 = this.f27569b;
            n.a aVar3 = this.f27568a;
            h.a aVar4 = c0Var2.f27579b;
            r4.f fVar = c0Var2.f27584g;
            com.bumptech.glide.load.data.d<Data> dVar = aVar3.f30237c;
            aVar4.d(fVar, exc, dVar, dVar.d());
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public final void f(Object obj) {
        boolean z10;
        c0 c0Var = this.f27569b;
        n.a<?> aVar = this.f27568a;
        n.a<?> aVar2 = c0Var.f27583f;
        if (aVar2 != null && aVar2 == aVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c0 c0Var2 = this.f27569b;
            n.a aVar3 = this.f27568a;
            n nVar = c0Var2.f27578a.f27614p;
            if (obj != null && nVar.c(aVar3.f30237c.d())) {
                c0Var2.f27582e = obj;
                c0Var2.f27579b.c();
                return;
            }
            h.a aVar4 = c0Var2.f27579b;
            r4.f fVar = aVar3.f30235a;
            com.bumptech.glide.load.data.d<Data> dVar = aVar3.f30237c;
            aVar4.a(fVar, obj, dVar, dVar.d(), c0Var2.f27584g);
        }
    }
}
