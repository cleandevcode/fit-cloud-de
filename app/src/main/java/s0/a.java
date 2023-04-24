package s0;

import s0.c;

/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: u0 */
    public int f26273u0 = 0;

    /* renamed from: v0 */
    public boolean f26274v0 = true;

    /* renamed from: w0 */
    public int f26275w0 = 0;

    /* renamed from: x0 */
    public boolean f26276x0 = false;

    @Override // s0.d
    public final boolean B() {
        return this.f26276x0;
    }

    @Override // s0.d
    public final boolean C() {
        return this.f26276x0;
    }

    public final boolean S() {
        int i10;
        c j10;
        c j11;
        c j12;
        int i11;
        int i12;
        c.a aVar = c.a.BOTTOM;
        c.a aVar2 = c.a.TOP;
        c.a aVar3 = c.a.RIGHT;
        c.a aVar4 = c.a.LEFT;
        int i13 = 0;
        boolean z10 = true;
        while (true) {
            i10 = this.f26392t0;
            if (i13 >= i10) {
                break;
            }
            d dVar = this.f26391s0[i13];
            if ((this.f26274v0 || dVar.d()) && ((((i11 = this.f26273u0) == 0 || i11 == 1) && !dVar.B()) || (((i12 = this.f26273u0) == 2 || i12 == 3) && !dVar.C()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int i14 = 0;
        boolean z11 = false;
        for (int i15 = 0; i15 < this.f26392t0; i15++) {
            d dVar2 = this.f26391s0[i15];
            if (this.f26274v0 || dVar2.d()) {
                if (!z11) {
                    int i16 = this.f26273u0;
                    if (i16 == 0) {
                        j12 = dVar2.j(aVar4);
                    } else if (i16 == 1) {
                        j12 = dVar2.j(aVar3);
                    } else if (i16 == 2) {
                        j12 = dVar2.j(aVar2);
                    } else {
                        if (i16 == 3) {
                            j12 = dVar2.j(aVar);
                        }
                        z11 = true;
                    }
                    i14 = j12.d();
                    z11 = true;
                }
                int i17 = this.f26273u0;
                if (i17 == 0) {
                    j11 = dVar2.j(aVar4);
                } else {
                    if (i17 == 1) {
                        j10 = dVar2.j(aVar3);
                    } else if (i17 == 2) {
                        j11 = dVar2.j(aVar2);
                    } else if (i17 == 3) {
                        j10 = dVar2.j(aVar);
                    }
                    i14 = Math.max(i14, j10.d());
                }
                i14 = Math.min(i14, j11.d());
            }
        }
        int i18 = i14 + this.f26275w0;
        int i19 = this.f26273u0;
        if (i19 == 0 || i19 == 1) {
            J(i18, i18);
        } else {
            K(i18, i18);
        }
        this.f26276x0 = true;
        return true;
    }

    public final int T() {
        int i10 = this.f26273u0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    @Override // s0.d
    public final void c(q0.c cVar, boolean z10) {
        c[] cVarArr;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        q0.e eVar;
        c cVar2;
        int i10;
        int i11;
        int i12;
        q0.e eVar2;
        int i13;
        c[] cVarArr2 = this.S;
        cVarArr2[0] = this.K;
        cVarArr2[2] = this.L;
        cVarArr2[1] = this.M;
        cVarArr2[3] = this.N;
        int i14 = 0;
        while (true) {
            cVarArr = this.S;
            if (i14 >= cVarArr.length) {
                break;
            }
            c cVar3 = cVarArr[i14];
            cVar3.f26302i = cVar.l(cVar3);
            i14++;
        }
        int i15 = this.f26273u0;
        if (i15 >= 0 && i15 < 4) {
            c cVar4 = cVarArr[i15];
            if (!this.f26276x0) {
                S();
            }
            if (this.f26276x0) {
                this.f26276x0 = false;
                int i16 = this.f26273u0;
                if (i16 != 0 && i16 != 1) {
                    if (i16 == 2 || i16 == 3) {
                        cVar.d(this.L.f26302i, this.f26317c0);
                        eVar2 = this.N.f26302i;
                        i13 = this.f26317c0;
                    } else {
                        return;
                    }
                } else {
                    cVar.d(this.K.f26302i, this.f26315b0);
                    eVar2 = this.M.f26302i;
                    i13 = this.f26315b0;
                }
                cVar.d(eVar2, i13);
                return;
            }
            for (int i17 = 0; i17 < this.f26392t0; i17++) {
                d dVar = this.f26391s0[i17];
                if ((this.f26274v0 || dVar.d()) && ((((i12 = this.f26273u0) == 0 || i12 == 1) && dVar.V[0] == 3 && dVar.K.f26299f != null && dVar.M.f26299f != null) || ((i12 == 2 || i12 == 3) && dVar.V[1] == 3 && dVar.L.f26299f != null && dVar.N.f26299f != null))) {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
            if (!this.K.g() && !this.M.g()) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!this.L.g() && !this.N.g()) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (!z11 && (((i11 = this.f26273u0) == 0 && z12) || ((i11 == 2 && z13) || ((i11 == 1 && z12) || (i11 == 3 && z13))))) {
                z14 = true;
            } else {
                z14 = false;
            }
            int i18 = 5;
            if (!z14) {
                i18 = 4;
            }
            for (int i19 = 0; i19 < this.f26392t0; i19++) {
                d dVar2 = this.f26391s0[i19];
                if (this.f26274v0 || dVar2.d()) {
                    q0.e l10 = cVar.l(dVar2.S[this.f26273u0]);
                    c[] cVarArr3 = dVar2.S;
                    int i20 = this.f26273u0;
                    c cVar5 = cVarArr3[i20];
                    cVar5.f26302i = l10;
                    c cVar6 = cVar5.f26299f;
                    if (cVar6 != null && cVar6.f26297d == this) {
                        i10 = cVar5.f26300g + 0;
                    } else {
                        i10 = 0;
                    }
                    if (i20 != 0 && i20 != 2) {
                        q0.b m10 = cVar.m();
                        q0.e n10 = cVar.n();
                        n10.f24494d = 0;
                        m10.c(cVar4.f26302i, l10, n10, this.f26275w0 + i10);
                        cVar.c(m10);
                    } else {
                        q0.b m11 = cVar.m();
                        q0.e n11 = cVar.n();
                        n11.f24494d = 0;
                        m11.d(cVar4.f26302i, l10, n11, this.f26275w0 - i10);
                        cVar.c(m11);
                    }
                    cVar.e(cVar4.f26302i, l10, this.f26275w0 + i10, i18);
                }
            }
            int i21 = this.f26273u0;
            if (i21 == 0) {
                cVar.e(this.M.f26302i, this.K.f26302i, 0, 8);
                cVar.e(this.K.f26302i, this.W.M.f26302i, 0, 4);
                eVar = this.K.f26302i;
                cVar2 = this.W.K;
            } else if (i21 == 1) {
                cVar.e(this.K.f26302i, this.M.f26302i, 0, 8);
                cVar.e(this.K.f26302i, this.W.K.f26302i, 0, 4);
                eVar = this.K.f26302i;
                cVar2 = this.W.M;
            } else if (i21 == 2) {
                cVar.e(this.N.f26302i, this.L.f26302i, 0, 8);
                cVar.e(this.L.f26302i, this.W.N.f26302i, 0, 4);
                eVar = this.L.f26302i;
                cVar2 = this.W.L;
            } else if (i21 == 3) {
                cVar.e(this.L.f26302i, this.N.f26302i, 0, 8);
                cVar.e(this.L.f26302i, this.W.L.f26302i, 0, 4);
                eVar = this.L.f26302i;
                cVar2 = this.W.N;
            } else {
                return;
            }
            cVar.e(eVar, cVar2.f26302i, 0, 0);
        }
    }

    @Override // s0.d
    public final boolean d() {
        return true;
    }

    @Override // s0.d
    public final String toString() {
        String b10 = androidx.activity.e.b(android.support.v4.media.d.a("[Barrier] "), this.f26333k0, " {");
        for (int i10 = 0; i10 < this.f26392t0; i10++) {
            d dVar = this.f26391s0[i10];
            if (i10 > 0) {
                b10 = a.b.b(b10, ", ");
            }
            StringBuilder a10 = android.support.v4.media.d.a(b10);
            a10.append(dVar.f26333k0);
            b10 = a10.toString();
        }
        return a.b.b(b10, "}");
    }
}
