package s0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f extends k {

    /* renamed from: c1 */
    public d[] f26365c1;
    public int F0 = -1;
    public int G0 = -1;
    public int H0 = -1;
    public int I0 = -1;
    public int J0 = -1;
    public int K0 = -1;
    public float L0 = 0.5f;
    public float M0 = 0.5f;
    public float N0 = 0.5f;
    public float O0 = 0.5f;
    public float P0 = 0.5f;
    public float Q0 = 0.5f;
    public int R0 = 0;
    public int S0 = 0;
    public int T0 = 2;
    public int U0 = 2;
    public int V0 = 0;
    public int W0 = -1;
    public int X0 = 0;
    public ArrayList<a> Y0 = new ArrayList<>();
    public d[] Z0 = null;

    /* renamed from: a1 */
    public d[] f26363a1 = null;

    /* renamed from: b1 */
    public int[] f26364b1 = null;

    /* renamed from: d1 */
    public int f26366d1 = 0;

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        public int f26367a;

        /* renamed from: d */
        public c f26370d;

        /* renamed from: e */
        public c f26371e;

        /* renamed from: f */
        public c f26372f;

        /* renamed from: g */
        public c f26373g;

        /* renamed from: h */
        public int f26374h;

        /* renamed from: i */
        public int f26375i;

        /* renamed from: j */
        public int f26376j;

        /* renamed from: k */
        public int f26377k;

        /* renamed from: q */
        public int f26383q;

        /* renamed from: b */
        public d f26368b = null;

        /* renamed from: c */
        public int f26369c = 0;

        /* renamed from: l */
        public int f26378l = 0;

        /* renamed from: m */
        public int f26379m = 0;

        /* renamed from: n */
        public int f26380n = 0;

        /* renamed from: o */
        public int f26381o = 0;

        /* renamed from: p */
        public int f26382p = 0;

        public a(int i10, c cVar, c cVar2, c cVar3, c cVar4, int i11) {
            f.this = r2;
            this.f26374h = 0;
            this.f26375i = 0;
            this.f26376j = 0;
            this.f26377k = 0;
            this.f26383q = 0;
            this.f26367a = i10;
            this.f26370d = cVar;
            this.f26371e = cVar2;
            this.f26372f = cVar3;
            this.f26373g = cVar4;
            this.f26374h = r2.f26398y0;
            this.f26375i = r2.f26394u0;
            this.f26376j = r2.f26399z0;
            this.f26377k = r2.f26395v0;
            this.f26383q = i11;
        }

        public final void a(d dVar) {
            int i10 = 0;
            if (this.f26367a == 0) {
                int V = f.this.V(this.f26383q, dVar);
                if (dVar.V[0] == 3) {
                    this.f26382p++;
                    V = 0;
                }
                f fVar = f.this;
                int i11 = fVar.R0;
                if (dVar.f26331j0 != 8) {
                    i10 = i11;
                }
                this.f26378l = V + i10 + this.f26378l;
                int U = fVar.U(this.f26383q, dVar);
                if (this.f26368b == null || this.f26369c < U) {
                    this.f26368b = dVar;
                    this.f26369c = U;
                    this.f26379m = U;
                }
            } else {
                int V2 = f.this.V(this.f26383q, dVar);
                int U2 = f.this.U(this.f26383q, dVar);
                if (dVar.V[1] == 3) {
                    this.f26382p++;
                    U2 = 0;
                }
                int i12 = f.this.S0;
                if (dVar.f26331j0 != 8) {
                    i10 = i12;
                }
                this.f26379m = U2 + i10 + this.f26379m;
                if (this.f26368b == null || this.f26369c < V2) {
                    this.f26368b = dVar;
                    this.f26369c = V2;
                    this.f26378l = V2;
                }
            }
            this.f26381o++;
        }

        /* JADX WARN: Removed duplicated region for block: B:390:0x01f2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(int r17, boolean r18, boolean r19) {
            /*
                Method dump skipped, instructions count: 730
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: s0.f.a.b(int, boolean, boolean):void");
        }

        public final int c() {
            if (this.f26367a == 1) {
                return this.f26379m - f.this.S0;
            }
            return this.f26379m;
        }

        public final int d() {
            if (this.f26367a == 0) {
                return this.f26378l - f.this.R0;
            }
            return this.f26378l;
        }

        public final void e(int i10) {
            int r10;
            int i11;
            int i12;
            int i13 = this.f26382p;
            if (i13 == 0) {
                return;
            }
            int i14 = this.f26381o;
            int i15 = i10 / i13;
            for (int i16 = 0; i16 < i14; i16++) {
                int i17 = this.f26380n + i16;
                f fVar = f.this;
                if (i17 >= fVar.f26366d1) {
                    break;
                }
                d dVar = fVar.f26365c1[i17];
                int i18 = 1;
                if (this.f26367a == 0) {
                    if (dVar != null) {
                        int[] iArr = dVar.V;
                        if (iArr[0] == 3 && dVar.f26348s == 0) {
                            i12 = iArr[1];
                            i11 = dVar.l();
                            r10 = i15;
                            fVar.T(dVar, i18, r10, i12, i11);
                        }
                    }
                } else {
                    if (dVar != null) {
                        int[] iArr2 = dVar.V;
                        if (iArr2[1] == 3 && dVar.f26349t == 0) {
                            int i19 = iArr2[0];
                            r10 = dVar.r();
                            i11 = i15;
                            i18 = i19;
                            i12 = 1;
                            fVar.T(dVar, i18, r10, i12, i11);
                        }
                    }
                }
            }
            this.f26378l = 0;
            this.f26379m = 0;
            this.f26368b = null;
            this.f26369c = 0;
            int i20 = this.f26381o;
            for (int i21 = 0; i21 < i20; i21++) {
                int i22 = this.f26380n + i21;
                f fVar2 = f.this;
                if (i22 < fVar2.f26366d1) {
                    d dVar2 = fVar2.f26365c1[i22];
                    if (this.f26367a == 0) {
                        int r11 = dVar2.r();
                        f fVar3 = f.this;
                        int i23 = fVar3.R0;
                        if (dVar2.f26331j0 == 8) {
                            i23 = 0;
                        }
                        this.f26378l = r11 + i23 + this.f26378l;
                        int U = fVar3.U(this.f26383q, dVar2);
                        if (this.f26368b == null || this.f26369c < U) {
                            this.f26368b = dVar2;
                            this.f26369c = U;
                            this.f26379m = U;
                        }
                    } else {
                        int V = fVar2.V(this.f26383q, dVar2);
                        int U2 = f.this.U(this.f26383q, dVar2);
                        int i24 = f.this.S0;
                        if (dVar2.f26331j0 == 8) {
                            i24 = 0;
                        }
                        this.f26379m = U2 + i24 + this.f26379m;
                        if (this.f26368b == null || this.f26369c < V) {
                            this.f26368b = dVar2;
                            this.f26369c = V;
                            this.f26378l = V;
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public final void f(int i10, c cVar, c cVar2, c cVar3, c cVar4, int i11, int i12, int i13, int i14, int i15) {
            this.f26367a = i10;
            this.f26370d = cVar;
            this.f26371e = cVar2;
            this.f26372f = cVar3;
            this.f26373g = cVar4;
            this.f26374h = i11;
            this.f26375i = i12;
            this.f26376j = i13;
            this.f26377k = i14;
            this.f26383q = i15;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:535:0x00ae, code lost:
        if (r33.G0 == (-1)) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x00b9, code lost:
        if (r33.G0 == (-1)) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x00bb, code lost:
        r33.G0 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:704:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:882:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:883:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:889:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:890:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:898:0x080d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:771:0x04e7 -> B:772:0x04f6). Please submit an issue!!! */
    @Override // s0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(int r34, int r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 2065
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.f.S(int, int, int, int):void");
    }

    public final int U(int i10, d dVar) {
        if (dVar == null) {
            return 0;
        }
        if (dVar.V[1] == 3) {
            int i11 = dVar.f26349t;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (dVar.A * i10);
                if (i12 != dVar.l()) {
                    dVar.f26324g = true;
                    T(dVar, dVar.V[0], dVar.r(), 1, i12);
                }
                return i12;
            } else if (i11 == 1) {
                return dVar.l();
            } else {
                if (i11 == 3) {
                    return (int) ((dVar.r() * dVar.Z) + 0.5f);
                }
            }
        }
        return dVar.l();
    }

    public final int V(int i10, d dVar) {
        if (dVar == null) {
            return 0;
        }
        if (dVar.V[0] == 3) {
            int i11 = dVar.f26348s;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (dVar.f26353x * i10);
                if (i12 != dVar.r()) {
                    dVar.f26324g = true;
                    T(dVar, 1, i12, dVar.V[1], dVar.l());
                }
                return i12;
            } else if (i11 == 1) {
                return dVar.r();
            } else {
                if (i11 == 3) {
                    return (int) ((dVar.l() * dVar.Z) + 0.5f);
                }
            }
        }
        return dVar.r();
    }

    @Override // s0.d
    public final void c(q0.c cVar, boolean z10) {
        boolean z11;
        boolean z12;
        d dVar;
        float f10;
        int i10;
        boolean z13;
        super.c(cVar, z10);
        d dVar2 = this.W;
        if (dVar2 != null && ((e) dVar2).f26360x0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = this.V0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        int size = this.Y0.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            a aVar = this.Y0.get(i12);
                            if (i12 == size - 1) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            aVar.b(i12, z11, z13);
                        }
                    }
                } else if (this.f26364b1 != null && this.f26363a1 != null && this.Z0 != null) {
                    for (int i13 = 0; i13 < this.f26366d1; i13++) {
                        this.f26365c1[i13].E();
                    }
                    int[] iArr = this.f26364b1;
                    int i14 = iArr[0];
                    int i15 = iArr[1];
                    d dVar3 = null;
                    float f11 = this.L0;
                    int i16 = 0;
                    while (i16 < i14) {
                        if (z11) {
                            i10 = (i14 - i16) - 1;
                            f10 = 1.0f - this.L0;
                        } else {
                            f10 = f11;
                            i10 = i16;
                        }
                        d dVar4 = this.f26363a1[i10];
                        if (dVar4 != null && dVar4.f26331j0 != 8) {
                            if (i16 == 0) {
                                dVar4.g(dVar4.K, this.K, this.f26398y0);
                                dVar4.f26335l0 = this.F0;
                                dVar4.f26325g0 = f10;
                            }
                            if (i16 == i14 - 1) {
                                dVar4.g(dVar4.M, this.M, this.f26399z0);
                            }
                            if (i16 > 0 && dVar3 != null) {
                                dVar4.g(dVar4.K, dVar3.M, this.R0);
                                dVar3.g(dVar3.M, dVar4.K, 0);
                            }
                            dVar3 = dVar4;
                        }
                        i16++;
                        f11 = f10;
                    }
                    for (int i17 = 0; i17 < i15; i17++) {
                        d dVar5 = this.Z0[i17];
                        if (dVar5 != null && dVar5.f26331j0 != 8) {
                            if (i17 == 0) {
                                dVar5.g(dVar5.L, this.L, this.f26394u0);
                                dVar5.f26337m0 = this.G0;
                                dVar5.f26327h0 = this.M0;
                            }
                            if (i17 == i15 - 1) {
                                dVar5.g(dVar5.N, this.N, this.f26395v0);
                            }
                            if (i17 > 0 && dVar3 != null) {
                                dVar5.g(dVar5.L, dVar3.N, this.S0);
                                dVar3.g(dVar3.N, dVar5.L, 0);
                            }
                            dVar3 = dVar5;
                        }
                    }
                    for (int i18 = 0; i18 < i14; i18++) {
                        for (int i19 = 0; i19 < i15; i19++) {
                            int i20 = (i19 * i14) + i18;
                            if (this.X0 == 1) {
                                i20 = (i18 * i15) + i19;
                            }
                            d[] dVarArr = this.f26365c1;
                            if (i20 < dVarArr.length && (dVar = dVarArr[i20]) != null && dVar.f26331j0 != 8) {
                                d dVar6 = this.f26363a1[i18];
                                d dVar7 = this.Z0[i19];
                                if (dVar != dVar6) {
                                    dVar.g(dVar.K, dVar6.K, 0);
                                    dVar.g(dVar.M, dVar6.M, 0);
                                }
                                if (dVar != dVar7) {
                                    dVar.g(dVar.L, dVar7.L, 0);
                                    dVar.g(dVar.N, dVar7.N, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size2 = this.Y0.size();
                for (int i21 = 0; i21 < size2; i21++) {
                    a aVar2 = this.Y0.get(i21);
                    if (i21 == size2 - 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    aVar2.b(i21, z11, z12);
                }
            }
        } else if (this.Y0.size() > 0) {
            this.Y0.get(0).b(0, z11, true);
        }
        this.A0 = false;
    }
}
