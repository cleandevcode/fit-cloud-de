package s0;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import t0.b;
import t0.q;

/* loaded from: classes.dex */
public final class e extends l {
    public int A0;

    /* renamed from: v0 */
    public int f26358v0;

    /* renamed from: z0 */
    public int f26362z0;

    /* renamed from: t0 */
    public t0.b f26356t0 = new t0.b(this);

    /* renamed from: u0 */
    public t0.f f26357u0 = new t0.f(this);

    /* renamed from: w0 */
    public b.InterfaceC0491b f26359w0 = null;

    /* renamed from: x0 */
    public boolean f26360x0 = false;

    /* renamed from: y0 */
    public q0.c f26361y0 = new q0.c();
    public int B0 = 0;
    public int C0 = 0;
    public b[] D0 = new b[4];
    public b[] E0 = new b[4];
    public int F0 = 257;
    public boolean G0 = false;
    public boolean H0 = false;
    public WeakReference<c> I0 = null;
    public WeakReference<c> J0 = null;
    public WeakReference<c> K0 = null;
    public WeakReference<c> L0 = null;
    public HashSet<d> M0 = new HashSet<>();
    public b.a N0 = new b.a();

    public static void V(d dVar, b.InterfaceC0491b interfaceC0491b, b.a aVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        int i12;
        if (interfaceC0491b == null) {
            return;
        }
        if (dVar.f26331j0 != 8 && !(dVar instanceof g) && !(dVar instanceof a)) {
            int[] iArr = dVar.V;
            aVar.f27464a = iArr[0];
            boolean z14 = true;
            aVar.f27465b = iArr[1];
            aVar.f27466c = dVar.r();
            aVar.f27467d = dVar.l();
            aVar.f27472i = false;
            aVar.f27473j = 0;
            if (aVar.f27464a == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (aVar.f27465b == 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && dVar.Z > 0.0f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 && dVar.Z > 0.0f) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z10 && dVar.u(0) && dVar.f26348s == 0 && !z12) {
                aVar.f27464a = 2;
                if (z11 && dVar.f26349t == 0) {
                    aVar.f27464a = 1;
                }
                z10 = false;
            }
            if (z11 && dVar.u(1) && dVar.f26349t == 0 && !z13) {
                aVar.f27465b = 2;
                if (z10 && dVar.f26348s == 0) {
                    aVar.f27465b = 1;
                }
                z11 = false;
            }
            if (dVar.B()) {
                aVar.f27464a = 1;
                z10 = false;
            }
            if (dVar.C()) {
                aVar.f27465b = 1;
                z11 = false;
            }
            if (z12) {
                if (dVar.f26350u[0] == 4) {
                    aVar.f27464a = 1;
                } else if (!z11) {
                    if (aVar.f27465b == 1) {
                        i12 = aVar.f27467d;
                    } else {
                        aVar.f27464a = 2;
                        ((ConstraintLayout.b) interfaceC0491b).b(dVar, aVar);
                        i12 = aVar.f27469f;
                    }
                    aVar.f27464a = 1;
                    aVar.f27466c = (int) (dVar.Z * i12);
                }
            }
            if (z13) {
                if (dVar.f26350u[1] == 4) {
                    aVar.f27465b = 1;
                } else if (!z10) {
                    if (aVar.f27464a == 1) {
                        i10 = aVar.f27466c;
                    } else {
                        aVar.f27465b = 2;
                        ((ConstraintLayout.b) interfaceC0491b).b(dVar, aVar);
                        i10 = aVar.f27468e;
                    }
                    aVar.f27465b = 1;
                    if (dVar.f26313a0 == -1) {
                        i11 = (int) (i10 / dVar.Z);
                    } else {
                        i11 = (int) (dVar.Z * i10);
                    }
                    aVar.f27467d = i11;
                }
            }
            ((ConstraintLayout.b) interfaceC0491b).b(dVar, aVar);
            dVar.O(aVar.f27468e);
            dVar.L(aVar.f27469f);
            dVar.F = aVar.f27471h;
            int i13 = aVar.f27470g;
            dVar.f26319d0 = i13;
            if (i13 <= 0) {
                z14 = false;
            }
            dVar.F = z14;
            aVar.f27473j = 0;
            return;
        }
        aVar.f27468e = 0;
        aVar.f27469f = 0;
    }

    @Override // s0.l, s0.d
    public final void D() {
        this.f26361y0.u();
        this.f26362z0 = 0;
        this.A0 = 0;
        super.D();
    }

    @Override // s0.d
    public final void P(boolean z10, boolean z11) {
        super.P(z10, z11);
        int size = this.f26400s0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f26400s0.get(i10).P(z10, z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1002:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:1013:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:1018:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:1021:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:1026:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:1033:0x065c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:1038:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:1045:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:1051:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:1095:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:1108:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:1119:0x0809 A[LOOP:14: B:1118:0x0807->B:1119:0x0809, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:1131:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:1132:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:1135:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:1136:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:1138:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:1150:0x08db  */
    /* JADX WARN: Removed duplicated region for block: B:1153:0x08e1  */
    /* JADX WARN: Removed duplicated region for block: B:1157:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:1217:0x08e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:985:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:999:0x05e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean] */
    @Override // s0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R() {
        /*
            Method dump skipped, instructions count: 2302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.e.R():void");
    }

    public final void S(int i10, d dVar) {
        if (i10 == 0) {
            int i11 = this.B0 + 1;
            b[] bVarArr = this.E0;
            if (i11 >= bVarArr.length) {
                this.E0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.E0;
            int i12 = this.B0;
            bVarArr2[i12] = new b(dVar, 0, this.f26360x0);
            this.B0 = i12 + 1;
        } else if (i10 == 1) {
            int i13 = this.C0 + 1;
            b[] bVarArr3 = this.D0;
            if (i13 >= bVarArr3.length) {
                this.D0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.D0;
            int i14 = this.C0;
            bVarArr4[i14] = new b(dVar, 1, this.f26360x0);
            this.C0 = i14 + 1;
        }
    }

    public final void T(q0.c cVar) {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean W = W(64);
        c(cVar, W);
        int size = this.f26400s0.size();
        boolean z14 = false;
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = this.f26400s0.get(i11);
            boolean[] zArr = dVar.U;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof a) {
                z14 = true;
            }
        }
        if (z14) {
            for (int i12 = 0; i12 < size; i12++) {
                d dVar2 = this.f26400s0.get(i12);
                if (dVar2 instanceof a) {
                    a aVar = (a) dVar2;
                    for (int i13 = 0; i13 < aVar.f26392t0; i13++) {
                        d dVar3 = aVar.f26391s0[i13];
                        if (aVar.f26274v0 || dVar3.d()) {
                            int i14 = aVar.f26273u0;
                            if (i14 != 0 && i14 != 1) {
                                if (i14 == 2 || i14 == 3) {
                                    dVar3.U[1] = true;
                                }
                            } else {
                                dVar3.U[0] = true;
                            }
                        }
                    }
                }
            }
        }
        this.M0.clear();
        for (int i15 = 0; i15 < size; i15++) {
            d dVar4 = this.f26400s0.get(i15);
            dVar4.getClass();
            if (!(dVar4 instanceof k) && !(dVar4 instanceof g)) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (z13) {
                if (dVar4 instanceof k) {
                    this.M0.add(dVar4);
                } else {
                    dVar4.c(cVar, W);
                }
            }
        }
        while (this.M0.size() > 0) {
            int size2 = this.M0.size();
            Iterator<d> it = this.M0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k kVar = (k) it.next();
                HashSet<d> hashSet = this.M0;
                int i16 = 0;
                while (true) {
                    if (i16 < kVar.f26392t0) {
                        if (hashSet.contains(kVar.f26391s0[i16])) {
                            z12 = true;
                            continue;
                            break;
                        }
                        i16++;
                    } else {
                        z12 = false;
                        continue;
                        break;
                    }
                }
                if (z12) {
                    kVar.c(cVar, W);
                    this.M0.remove(kVar);
                    break;
                }
            }
            if (size2 == this.M0.size()) {
                Iterator<d> it2 = this.M0.iterator();
                while (it2.hasNext()) {
                    it2.next().c(cVar, W);
                }
                this.M0.clear();
            }
        }
        if (q0.c.f24468p) {
            HashSet<d> hashSet2 = new HashSet<>();
            for (int i17 = 0; i17 < size; i17++) {
                d dVar5 = this.f26400s0.get(i17);
                dVar5.getClass();
                if (!(dVar5 instanceof k) && !(dVar5 instanceof g)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    hashSet2.add(dVar5);
                }
            }
            if (this.V[0] == 2) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            b(this, cVar, hashSet2, i10, false);
            Iterator<d> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                d next = it3.next();
                j.c(this, cVar, next);
                next.c(cVar, W);
            }
        } else {
            for (int i18 = 0; i18 < size; i18++) {
                d dVar6 = this.f26400s0.get(i18);
                if (dVar6 instanceof e) {
                    int[] iArr = dVar6.V;
                    int i19 = iArr[0];
                    int i20 = iArr[1];
                    if (i19 == 2) {
                        dVar6.M(1);
                    }
                    if (i20 == 2) {
                        dVar6.N(1);
                    }
                    dVar6.c(cVar, W);
                    if (i19 == 2) {
                        dVar6.M(i19);
                    }
                    if (i20 == 2) {
                        dVar6.N(i20);
                    }
                } else {
                    j.c(this, cVar, dVar6);
                    if (!(dVar6 instanceof k) && !(dVar6 instanceof g)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        dVar6.c(cVar, W);
                    }
                }
            }
        }
        if (this.B0 > 0) {
            hh.d.a(this, cVar, null, 0);
        }
        if (this.C0 > 0) {
            hh.d.a(this, cVar, null, 1);
        }
    }

    public final boolean U(int i10, boolean z10) {
        int i11;
        t0.h hVar;
        boolean z11;
        t0.h hVar2;
        int l10;
        t0.f fVar = this.f26357u0;
        boolean z12 = true;
        boolean z13 = z10 & true;
        int k10 = fVar.f27476a.k(0);
        int k11 = fVar.f27476a.k(1);
        int s10 = fVar.f27476a.s();
        int t10 = fVar.f27476a.t();
        if (z13 && (k10 == 2 || k11 == 2)) {
            Iterator<q> it = fVar.f27480e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                q next = it.next();
                if (next.f27514f == i10 && !next.k()) {
                    z13 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z13 && k10 == 2) {
                    fVar.f27476a.M(1);
                    e eVar = fVar.f27476a;
                    eVar.O(fVar.d(eVar, 0));
                    e eVar2 = fVar.f27476a;
                    hVar2 = eVar2.f26318d.f27513e;
                    l10 = eVar2.r();
                    hVar2.d(l10);
                }
            } else if (z13 && k11 == 2) {
                fVar.f27476a.N(1);
                e eVar3 = fVar.f27476a;
                eVar3.L(fVar.d(eVar3, 1));
                e eVar4 = fVar.f27476a;
                hVar2 = eVar4.f26320e.f27513e;
                l10 = eVar4.l();
                hVar2.d(l10);
            }
        }
        e eVar5 = fVar.f27476a;
        int[] iArr = eVar5.V;
        if (i10 == 0) {
            int i12 = iArr[0];
            if (i12 == 1 || i12 == 4) {
                int r10 = eVar5.r() + s10;
                fVar.f27476a.f26318d.f27517i.d(r10);
                hVar = fVar.f27476a.f26318d.f27513e;
                i11 = r10 - s10;
                hVar.d(i11);
                z11 = true;
            }
            z11 = false;
        } else {
            int i13 = iArr[1];
            if (i13 == 1 || i13 == 4) {
                int l11 = eVar5.l() + t10;
                fVar.f27476a.f26320e.f27517i.d(l11);
                i11 = l11 - t10;
                hVar = fVar.f27476a.f26320e.f27513e;
                hVar.d(i11);
                z11 = true;
            }
            z11 = false;
        }
        fVar.g();
        Iterator<q> it2 = fVar.f27480e.iterator();
        while (it2.hasNext()) {
            q next2 = it2.next();
            if (next2.f27514f == i10 && (next2.f27510b != fVar.f27476a || next2.f27515g)) {
                next2.e();
            }
        }
        Iterator<q> it3 = fVar.f27480e.iterator();
        while (it3.hasNext()) {
            q next3 = it3.next();
            if (next3.f27514f == i10 && (z11 || next3.f27510b != fVar.f27476a)) {
                if (!next3.f27516h.f27493j || !next3.f27517i.f27493j || (!(next3 instanceof t0.c) && !next3.f27513e.f27493j)) {
                    z12 = false;
                    break;
                }
            }
        }
        fVar.f27476a.M(k10);
        fVar.f27476a.N(k11);
        return z12;
    }

    public final boolean W(int i10) {
        return (this.F0 & i10) == i10;
    }

    @Override // s0.d
    public final void o(StringBuilder sb2) {
        sb2.append(this.f26332k + ":{\n");
        sb2.append("  actualWidth:" + this.X);
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.Y);
        sb2.append("\n");
        Iterator<d> it = this.f26400s0.iterator();
        while (it.hasNext()) {
            it.next().o(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
