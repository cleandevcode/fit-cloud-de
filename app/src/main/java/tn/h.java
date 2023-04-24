package tn;

/* loaded from: classes2.dex */
public abstract class h extends u implements pn.p {
    public h(byte b10) {
        super(b10);
    }

    @Override // pn.p
    public int a() {
        return 0;
    }

    @Override // pn.p
    public final byte[] b() {
        try {
            return l();
        } catch (pn.n e10) {
            throw new pn.q(e10.f24445b);
        }
    }

    @Override // pn.p
    public final int c() {
        return 0;
    }

    @Override // pn.p
    public final byte[] d() {
        try {
            return o();
        } catch (pn.n e10) {
            throw new pn.q(e10.f24445b);
        }
    }

    @Override // pn.p
    public final int e() {
        return 0;
    }

    @Override // pn.p
    public final int f() {
        return b().length;
    }
}
