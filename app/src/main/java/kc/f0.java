package kc;

import mc.b;

/* loaded from: classes.dex */
public final class f0 implements b.a {

    /* renamed from: a */
    public final c0 f18319a;

    /* renamed from: b */
    public String f18320b;

    public f0(c0 c0Var) {
        this.f18319a = c0Var;
    }

    @Override // mc.b.a
    public final f0 a(String str) {
        str.getClass();
        this.f18320b = str;
        return this;
    }

    public final h0 b() {
        b0.c.h(this.f18320b, String.class);
        return new h0(this.f18319a, this.f18320b);
    }
}
