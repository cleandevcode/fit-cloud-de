package kc;

import kc.h;
import oc.b;
import oc.b1;
import oc.c1;
import oc.d;
import oc.e;
import oc.j1;
import oc.p0;

/* loaded from: classes.dex */
public final class e0 implements oc.c {

    /* renamed from: a */
    public final Boolean f18301a;

    /* renamed from: b */
    public final c0 f18302b;

    /* renamed from: c */
    public final h0 f18303c;

    /* renamed from: d */
    public w3.a<oc.a> f18304d = v3.b.a(b.a.f22927a);

    /* renamed from: e */
    public w3.a f18305e;

    /* renamed from: f */
    public w3.a<c1> f18306f;

    /* renamed from: g */
    public w3.a<sc.e> f18307g;

    /* renamed from: h */
    public oc.f f18308h;

    /* renamed from: i */
    public oc.e0 f18309i;

    /* renamed from: j */
    public qc.b0 f18310j;

    /* renamed from: k */
    public w3.a f18311k;

    /* renamed from: l */
    public w3.a f18312l;

    /* renamed from: m */
    public w3.a f18313m;

    /* renamed from: n */
    public w3.a f18314n;

    /* renamed from: o */
    public v3.a f18315o;

    /* renamed from: p */
    public oc.j0 f18316p;

    /* renamed from: q */
    public w3.a f18317q;

    public e0(c0 c0Var, h0 h0Var, Boolean bool, Boolean bool2, z0 z0Var) {
        this.f18302b = c0Var;
        this.f18303c = h0Var;
        this.f18301a = bool;
        w3.a a10 = v3.b.a(new oc.y(h0Var.f18327d, c0Var.f18280m, c0Var.f18284q));
        this.f18305e = a10;
        this.f18306f = v3.b.a(new oc.j0(c0Var.f18293z, this.f18304d, a10, p0.a.f23023a, 1));
        this.f18307g = v3.b.a(new sc.g(h0Var.f18327d, this.f18305e, c0Var.A, c0Var.f18282o, 0));
        this.f18308h = new oc.f(this.f18304d, 0);
        this.f18309i = new oc.e0(1);
        oc.i iVar = new oc.i(0, h.a.f18323a, v3.d.a(z0Var));
        w3.a<c1> aVar = this.f18306f;
        oc.f fVar = this.f18308h;
        qc.b0 b0Var = new qc.b0(aVar, fVar, this.f18309i, iVar, c0Var.f18282o, new qc.d0(aVar, fVar, iVar));
        this.f18310j = b0Var;
        this.f18311k = v3.b.a(new j1(this.f18307g, fVar, b0Var));
        w3.a a11 = v3.b.a(new oc.i(1, this.f18307g, this.f18310j));
        this.f18312l = a11;
        this.f18313m = v3.b.a(new oc.y0(this.f18308h, this.f18306f, a11));
        this.f18314n = v3.b.a(new oc.u(1, this.f18306f, e.a.f22966a));
        v3.a aVar2 = new v3.a();
        this.f18315o = aVar2;
        this.f18316p = new oc.j0(this.f18307g, v3.b.a(new oc.l0(0, aVar2, d.a.f22961a)), this.f18315o, this.f18310j, 0);
        v3.d a12 = v3.d.a(bool2);
        oc.e0 e0Var = new oc.e0(0);
        oc.b0 b0Var2 = new oc.b0(new oc.h(a12, new oc.h0(e0Var, 0), new oc.b0(e0Var, 1)), 0);
        v3.a aVar3 = this.f18315o;
        w3.a<T> a13 = v3.b.a(new b1(this.f18307g, this.f18306f, this.f18308h, this.f18311k, this.f18313m, this.f18314n, this.f18312l, this.f18310j, this.f18316p, c0Var.f18282o, b0Var2));
        if (aVar3.f29033a == null) {
            aVar3.f29033a = a13;
            this.f18317q = v3.b.a(new oc.u(0, c0Var.f18283p, new qc.w(this.f18306f, this.f18304d, h0Var.f18327d, c0Var.f18278k, c0Var.f18282o, h0Var.f18333j, h0Var.f18332i)));
            return;
        }
        throw new IllegalStateException();
    }
}
