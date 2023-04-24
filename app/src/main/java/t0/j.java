package t0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j {
    public static p a(s0.d dVar, int i10, ArrayList<p> arrayList, p pVar) {
        int i11;
        s0.c cVar;
        int i12;
        if (i10 == 0) {
            i11 = dVar.f26345q0;
        } else {
            i11 = dVar.f26347r0;
        }
        int i13 = 0;
        if (i11 != -1 && (pVar == null || i11 != pVar.f27505b)) {
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    break;
                }
                p pVar2 = arrayList.get(i14);
                if (pVar2.f27505b == i11) {
                    if (pVar != null) {
                        pVar.d(i10, pVar2);
                        arrayList.remove(pVar);
                    }
                    pVar = pVar2;
                } else {
                    i14++;
                }
            }
        } else if (i11 != -1) {
            return pVar;
        }
        if (pVar == null) {
            if (dVar instanceof s0.i) {
                s0.i iVar = (s0.i) dVar;
                int i15 = 0;
                while (true) {
                    if (i15 < iVar.f26392t0) {
                        s0.d dVar2 = iVar.f26391s0[i15];
                        if ((i10 == 0 && (i12 = dVar2.f26345q0) != -1) || (i10 == 1 && (i12 = dVar2.f26347r0) != -1)) {
                            break;
                        }
                        i15++;
                    } else {
                        i12 = -1;
                        break;
                    }
                }
                if (i12 != -1) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList.size()) {
                            break;
                        }
                        p pVar3 = arrayList.get(i16);
                        if (pVar3.f27505b == i12) {
                            pVar = pVar3;
                            break;
                        }
                        i16++;
                    }
                }
            }
            if (pVar == null) {
                pVar = new p(i10);
            }
            arrayList.add(pVar);
        }
        if (pVar.a(dVar)) {
            if (dVar instanceof s0.g) {
                s0.g gVar = (s0.g) dVar;
                s0.c cVar2 = gVar.f26388v0;
                if (gVar.f26389w0 == 0) {
                    i13 = 1;
                }
                cVar2.c(i13, pVar, arrayList);
            }
            if (i10 == 0) {
                dVar.f26345q0 = pVar.f27505b;
                dVar.K.c(i10, pVar, arrayList);
                cVar = dVar.M;
            } else {
                dVar.f26347r0 = pVar.f27505b;
                dVar.L.c(i10, pVar, arrayList);
                dVar.O.c(i10, pVar, arrayList);
                cVar = dVar.N;
            }
            cVar.c(i10, pVar, arrayList);
            dVar.R.c(i10, pVar, arrayList);
        }
        return pVar;
    }

    public static boolean b(int i10, int i11, int i12, int i13) {
        return (i12 == 1 || i12 == 2 || (i12 == 4 && i10 != 2)) || (i13 == 1 || i13 == 2 || (i13 == 4 && i11 != 2));
    }
}
