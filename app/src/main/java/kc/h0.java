package kc;

import kc.h;
import kc.v0;
import mc.f;

/* loaded from: classes.dex */
public final class h0 implements mc.b {

    /* renamed from: a */
    public final String f18324a;

    /* renamed from: b */
    public final c0 f18325b;

    /* renamed from: c */
    public final h0 f18326c = this;

    /* renamed from: d */
    public v3.d f18327d;

    /* renamed from: e */
    public mc.d f18328e;

    /* renamed from: f */
    public oc.q f18329f;

    /* renamed from: g */
    public w3.a<gc.b<v0.b>> f18330g;

    /* renamed from: h */
    public w3.a f18331h;

    /* renamed from: i */
    public w3.a<oc.k> f18332i;

    /* renamed from: j */
    public mc.g f18333j;

    public h0(c0 c0Var, String str) {
        this.f18325b = c0Var;
        this.f18324a = str;
        v3.d a10 = v3.d.a(str);
        this.f18327d = a10;
        this.f18328e = new mc.d(0, a10, c0Var.f18280m);
        this.f18329f = new oc.q(c0Var.f18283p, new g0(this), c0Var.f18293z);
        w3.a<gc.b<v0.b>> a11 = v3.b.a(f.a.f20426a);
        this.f18330g = a11;
        this.f18331h = v3.b.a(new mc.m(this.f18328e, this.f18329f, a11, c0Var.D));
        this.f18332i = v3.b.a(new mc.e(this.f18330g));
        this.f18333j = new mc.g(h.a.f18323a, 0);
    }

    @Override // mc.b
    public final w0 a() {
        return (w0) this.f18331h.get();
    }
}
