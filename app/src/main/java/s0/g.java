package s0;

import s0.c;

/* loaded from: classes.dex */
public final class g extends d {

    /* renamed from: s0 */
    public float f26385s0 = -1.0f;

    /* renamed from: t0 */
    public int f26386t0 = -1;

    /* renamed from: u0 */
    public int f26387u0 = -1;

    /* renamed from: v0 */
    public c f26388v0 = this.L;

    /* renamed from: w0 */
    public int f26389w0 = 0;

    /* renamed from: x0 */
    public boolean f26390x0;

    public g() {
        this.T.clear();
        this.T.add(this.f26388v0);
        int length = this.S.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.S[i10] = this.f26388v0;
        }
    }

    @Override // s0.d
    public final boolean B() {
        return this.f26390x0;
    }

    @Override // s0.d
    public final boolean C() {
        return this.f26390x0;
    }

    @Override // s0.d
    public final void Q(q0.c cVar, boolean z10) {
        if (this.W == null) {
            return;
        }
        c cVar2 = this.f26388v0;
        cVar.getClass();
        int o10 = q0.c.o(cVar2);
        if (this.f26389w0 == 1) {
            this.f26315b0 = o10;
            this.f26317c0 = 0;
            L(this.W.l());
            O(0);
            return;
        }
        this.f26315b0 = 0;
        this.f26317c0 = o10;
        O(this.W.r());
        L(0);
    }

    public final void R(int i10) {
        if (this.f26389w0 == i10) {
            return;
        }
        this.f26389w0 = i10;
        this.T.clear();
        this.f26388v0 = this.f26389w0 == 1 ? this.K : this.L;
        this.T.add(this.f26388v0);
        int length = this.S.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.S[i11] = this.f26388v0;
        }
    }

    @Override // s0.d
    public final void c(q0.c cVar, boolean z10) {
        boolean z11;
        q0.e l10;
        q0.e eVar;
        q0.e eVar2;
        e eVar3 = (e) this.W;
        if (eVar3 == null) {
            return;
        }
        Object j10 = eVar3.j(c.a.LEFT);
        Object j11 = eVar3.j(c.a.RIGHT);
        d dVar = this.W;
        boolean z12 = true;
        if (dVar != null && dVar.V[0] == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f26389w0 == 0) {
            j10 = eVar3.j(c.a.TOP);
            j11 = eVar3.j(c.a.BOTTOM);
            d dVar2 = this.W;
            z11 = (dVar2 == null || dVar2.V[1] != 2) ? false : false;
        }
        if (this.f26390x0) {
            c cVar2 = this.f26388v0;
            if (cVar2.f26296c) {
                q0.e l11 = cVar.l(cVar2);
                cVar.d(l11, this.f26388v0.d());
                if (this.f26386t0 != -1) {
                    if (z11) {
                        eVar2 = cVar.l(j11);
                        cVar.f(eVar2, l11, 0, 5);
                    }
                    this.f26390x0 = false;
                    return;
                }
                if (this.f26387u0 != -1 && z11) {
                    q0.e l12 = cVar.l(j11);
                    cVar.f(l11, cVar.l(j10), 0, 5);
                    eVar2 = l12;
                    cVar.f(eVar2, l11, 0, 5);
                }
                this.f26390x0 = false;
                return;
            }
        }
        if (this.f26386t0 != -1) {
            l10 = cVar.l(this.f26388v0);
            cVar.e(l10, cVar.l(j10), this.f26386t0, 8);
            if (z11) {
                eVar = cVar.l(j11);
            } else {
                return;
            }
        } else if (this.f26387u0 != -1) {
            l10 = cVar.l(this.f26388v0);
            q0.e l13 = cVar.l(j11);
            cVar.e(l10, l13, -this.f26387u0, 8);
            if (z11) {
                cVar.f(l10, cVar.l(j10), 0, 5);
                eVar = l13;
            } else {
                return;
            }
        } else if (this.f26385s0 != -1.0f) {
            q0.e l14 = cVar.l(this.f26388v0);
            q0.e l15 = cVar.l(j11);
            float f10 = this.f26385s0;
            q0.b m10 = cVar.m();
            m10.f24466d.i(l14, -1.0f);
            m10.f24466d.i(l15, f10);
            cVar.c(m10);
            return;
        } else {
            return;
        }
        cVar.f(eVar, l10, 0, 5);
    }

    @Override // s0.d
    public final boolean d() {
        return true;
    }

    @Override // s0.d
    public final c j(c.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.f26389w0 == 0) {
                return this.f26388v0;
            }
            return null;
        }
        if (this.f26389w0 == 1) {
            return this.f26388v0;
        }
        return null;
    }
}
