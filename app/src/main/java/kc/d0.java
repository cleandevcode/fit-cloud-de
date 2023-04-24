package kc;

import oc.c;

/* loaded from: classes.dex */
public final class d0 implements c.a {

    /* renamed from: a */
    public final c0 f18295a;

    /* renamed from: b */
    public final h0 f18296b;

    /* renamed from: c */
    public Boolean f18297c;

    /* renamed from: d */
    public Boolean f18298d;

    /* renamed from: e */
    public z0 f18299e;

    public d0(c0 c0Var, h0 h0Var) {
        this.f18295a = c0Var;
        this.f18296b = h0Var;
    }

    @Override // oc.c.a
    public final d0 a(boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        valueOf.getClass();
        this.f18297c = valueOf;
        return this;
    }

    public final e0 b() {
        b0.c.h(this.f18297c, Boolean.class);
        b0.c.h(this.f18298d, Boolean.class);
        b0.c.h(this.f18299e, z0.class);
        return new e0(this.f18295a, this.f18296b, this.f18297c, this.f18298d, this.f18299e);
    }

    public final d0 c(boolean z10) {
        Boolean valueOf = Boolean.valueOf(z10);
        valueOf.getClass();
        this.f18298d = valueOf;
        return this;
    }
}
