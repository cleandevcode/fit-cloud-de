package w1;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a */
    public final k f29637a;

    public l(k kVar) {
        Charset charset = y.f29729a;
        if (kVar == null) {
            throw new NullPointerException("output");
        }
        this.f29637a = kVar;
        kVar.f29623a = this;
    }

    public final void a(int i10, boolean z10) {
        this.f29637a.k0(i10, z10);
    }

    public final void b(int i10, g gVar) {
        this.f29637a.m0(i10, gVar);
    }

    public final void c(double d10, int i10) {
        k kVar = this.f29637a;
        kVar.getClass();
        kVar.q0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void d(int i10, int i11) {
        this.f29637a.s0(i10, i11);
    }

    public final void e(int i10, int i11) {
        this.f29637a.o0(i10, i11);
    }

    public final void f(int i10, long j10) {
        this.f29637a.q0(i10, j10);
    }

    public final void g(float f10, int i10) {
        k kVar = this.f29637a;
        kVar.getClass();
        kVar.o0(i10, Float.floatToRawIntBits(f10));
    }

    public final void h(int i10, d1 d1Var, Object obj) {
        k kVar = this.f29637a;
        kVar.A0(i10, 3);
        d1Var.f((p0) obj, kVar.f29623a);
        kVar.A0(i10, 4);
    }

    public final void i(int i10, int i11) {
        this.f29637a.s0(i10, i11);
    }

    public final void j(int i10, long j10) {
        this.f29637a.D0(i10, j10);
    }

    public final void k(int i10, d1 d1Var, Object obj) {
        this.f29637a.u0(i10, (p0) obj, d1Var);
    }

    public final void l(int i10, Object obj) {
        if (obj instanceof g) {
            this.f29637a.x0(i10, (g) obj);
        } else {
            this.f29637a.w0(i10, (p0) obj);
        }
    }

    public final void m(int i10, int i11) {
        this.f29637a.o0(i10, i11);
    }

    public final void n(int i10, long j10) {
        this.f29637a.q0(i10, j10);
    }

    public final void o(int i10, int i11) {
        this.f29637a.B0(i10, (i11 >> 31) ^ (i11 << 1));
    }

    public final void p(int i10, long j10) {
        this.f29637a.D0(i10, (j10 >> 63) ^ (j10 << 1));
    }

    public final void q(int i10, int i11) {
        this.f29637a.B0(i10, i11);
    }

    public final void r(int i10, long j10) {
        this.f29637a.D0(i10, j10);
    }
}
