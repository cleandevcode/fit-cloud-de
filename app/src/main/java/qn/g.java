package qn;

import pn.q;
import pn.t;

/* loaded from: classes2.dex */
public final class g implements pn.a {

    /* renamed from: a */
    public pn.k f25090a;

    /* renamed from: b */
    public pn.h f25091b;

    /* renamed from: c */
    public a f25092c;

    /* renamed from: d */
    public pn.l f25093d;

    /* renamed from: e */
    public t f25094e;

    /* renamed from: f */
    public Object f25095f;

    /* renamed from: g */
    public pn.a f25096g;

    /* renamed from: h */
    public int f25097h;

    /* renamed from: i */
    public pn.j f25098i;

    /* renamed from: j */
    public boolean f25099j;

    public g(pn.h hVar, pn.k kVar, a aVar, pn.l lVar, t tVar, Object obj, pn.a aVar2, boolean z10) {
        this.f25090a = kVar;
        this.f25091b = hVar;
        this.f25092c = aVar;
        this.f25093d = lVar;
        this.f25094e = tVar;
        this.f25095f = obj;
        this.f25096g = aVar2;
        this.f25097h = lVar.f24442e;
        this.f25099j = z10;
    }

    @Override // pn.a
    public final void a(pn.e eVar) {
        if (this.f25097h == 0) {
            this.f25093d.a(0);
        }
        this.f25094e.f24452a.a(eVar.c(), null);
        this.f25094e.f24452a.b();
        this.f25094e.f24452a.f25138j = this.f25091b;
        if (this.f25099j) {
            this.f25092c.getClass();
        }
        pn.a aVar = this.f25096g;
        if (aVar != null) {
            t tVar = this.f25094e;
            tVar.f24452a.f25140l = this.f25095f;
            aVar.a(tVar);
        }
        if (this.f25098i != null) {
            a aVar2 = this.f25092c;
            this.f25098i.d(aVar2.f25000c[aVar2.f24999b].a(), this.f25099j);
        }
    }

    @Override // pn.a
    public final void b(pn.e eVar, Exception exc) {
        int i10;
        pn.n nVar;
        a aVar = this.f25092c;
        int length = aVar.f25000c.length;
        int i11 = aVar.f24999b + 1;
        if (i11 >= length && ((i10 = this.f25097h) != 0 || this.f25093d.f24442e != 4)) {
            if (i10 == 0) {
                this.f25093d.a(0);
            }
            if (exc instanceof pn.n) {
                nVar = (pn.n) exc;
            } else {
                nVar = new pn.n(exc);
            }
            this.f25094e.f24452a.a(null, nVar);
            this.f25094e.f24452a.b();
            t tVar = this.f25094e;
            p pVar = tVar.f24452a;
            pVar.f25138j = this.f25091b;
            pn.a aVar2 = this.f25096g;
            if (aVar2 != null) {
                pVar.f25140l = this.f25095f;
                aVar2.b(tVar, exc);
                return;
            }
            return;
        }
        if (this.f25097h == 0) {
            pn.l lVar = this.f25093d;
            if (lVar.f24442e == 4) {
                lVar.a(3);
            } else {
                lVar.a(4);
                this.f25092c.f24999b = i11;
            }
        } else {
            aVar.f24999b = i11;
        }
        try {
            c();
        } catch (q e10) {
            b(eVar, e10);
        }
    }

    public final void c() {
        t tVar = new t(this.f25091b.f24428a);
        p pVar = tVar.f24452a;
        pVar.f25139k = this;
        pVar.f25140l = this;
        pn.k kVar = this.f25090a;
        pn.h hVar = this.f25091b;
        kVar.c(hVar.f24428a, hVar.f24429b);
        this.f25093d.getClass();
        this.f25090a.clear();
        pn.l lVar = this.f25093d;
        if (lVar.f24442e == 0) {
            lVar.a(4);
        }
        try {
            this.f25092c.b(this.f25093d, tVar);
        } catch (pn.n e10) {
            b(tVar, e10);
        }
    }
}
