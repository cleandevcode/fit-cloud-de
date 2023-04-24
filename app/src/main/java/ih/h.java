package ih;

import bi.m0;
import ph.g0;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a */
    public final boolean f16838a;

    /* renamed from: b */
    public final boolean f16839b;

    /* renamed from: c */
    public final boolean f16840c;

    /* renamed from: d */
    public final g0 f16841d;

    /* renamed from: e */
    public final g0 f16842e;

    /* renamed from: f */
    public final g0 f16843f;

    /* renamed from: g */
    public final g0 f16844g;

    /* renamed from: h */
    public final g0 f16845h;

    public h(og.t tVar, kg.g gVar, int i10) {
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        g0 g0Var4;
        byte[] bArr = ((jj.l) tVar.D().f23334a).f17931e.get((byte) 48);
        bArr = (bArr == null || bArr.length != 10) ? null : bArr;
        boolean z10 = false;
        if (bArr != null && bArr[2] > 0) {
            z10 = true;
        }
        this.f16838a = z10;
        this.f16839b = tVar.D().c().g(21);
        this.f16840c = ((uf.b) gVar.a().getValue()).b();
        if (m0.w(i10, 1)) {
            g0Var = new g0();
        } else {
            g0Var = null;
        }
        this.f16841d = g0Var;
        if (m0.w(i10, 2)) {
            g0Var2 = new g0();
        } else {
            g0Var2 = null;
        }
        this.f16842e = g0Var2;
        if (m0.w(i10, 4)) {
            g0Var3 = new g0();
        } else {
            g0Var3 = null;
        }
        this.f16843f = g0Var3;
        if (m0.w(i10, 32)) {
            g0Var4 = new g0();
        } else {
            g0Var4 = null;
        }
        this.f16844g = g0Var4;
        this.f16845h = m0.w(i10, 64) ? new g0() : null;
    }
}
