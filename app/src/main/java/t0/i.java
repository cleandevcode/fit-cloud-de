package t0;

import java.util.HashSet;
import java.util.Iterator;
import s0.c;
import t0.b;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    public static b.a f27497a = new b.a();

    public static boolean a(s0.d dVar) {
        s0.e eVar;
        boolean z10;
        boolean z11;
        int[] iArr = dVar.V;
        int i10 = iArr[0];
        int i11 = iArr[1];
        s0.d dVar2 = dVar.W;
        if (dVar2 != null) {
            eVar = (s0.e) dVar2;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            int i12 = eVar.V[0];
        }
        if (eVar != null) {
            int i13 = eVar.V[1];
        }
        if (i10 != 1 && !dVar.B() && i10 != 2 && ((i10 != 3 || dVar.f26348s != 0 || dVar.Z != 0.0f || !dVar.u(0)) && (i10 != 3 || dVar.f26348s != 1 || !dVar.v(0, dVar.r())))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i11 != 1 && !dVar.C() && i11 != 2 && ((i11 != 3 || dVar.f26349t != 0 || dVar.Z != 0.0f || !dVar.u(1)) && (i11 != 3 || dVar.f26349t != 1 || !dVar.v(1, dVar.l())))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (dVar.Z > 0.0f && (z10 || z11)) {
            return true;
        }
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }

    public static void b(int i10, s0.d dVar, b.InterfaceC0491b interfaceC0491b, boolean z10) {
        boolean z11;
        s0.c cVar;
        s0.c cVar2;
        boolean z12;
        s0.c cVar3;
        s0.c cVar4;
        if (dVar.f26338n) {
            return;
        }
        if (!(dVar instanceof s0.e) && dVar.A() && a(dVar)) {
            s0.e.V(dVar, interfaceC0491b, new b.a());
        }
        s0.c j10 = dVar.j(c.a.LEFT);
        s0.c j11 = dVar.j(c.a.RIGHT);
        int d10 = j10.d();
        int d11 = j11.d();
        HashSet<s0.c> hashSet = j10.f26294a;
        if (hashSet != null && j10.f26296c) {
            Iterator<s0.c> it = hashSet.iterator();
            while (it.hasNext()) {
                s0.c next = it.next();
                s0.d dVar2 = next.f26297d;
                int i11 = i10 + 1;
                boolean a10 = a(dVar2);
                if (dVar2.A() && a10) {
                    s0.e.V(dVar2, interfaceC0491b, new b.a());
                }
                s0.c cVar5 = dVar2.K;
                if ((next == cVar5 && (cVar4 = dVar2.M.f26299f) != null && cVar4.f26296c) || (next == dVar2.M && (cVar3 = cVar5.f26299f) != null && cVar3.f26296c)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i12 = dVar2.V[0];
                if (i12 == 3 && !a10) {
                    if (i12 == 3 && dVar2.f26352w >= 0 && dVar2.f26351v >= 0 && (dVar2.f26331j0 == 8 || (dVar2.f26348s == 0 && dVar2.Z == 0.0f))) {
                        if (!dVar2.y() && !dVar2.H && z12 && !dVar2.y()) {
                            d(i11, dVar, interfaceC0491b, dVar2, z10);
                        }
                    }
                } else if (!dVar2.A()) {
                    s0.c cVar6 = dVar2.K;
                    if (next == cVar6 && dVar2.M.f26299f == null) {
                        int e10 = cVar6.e() + d10;
                        dVar2.J(e10, dVar2.r() + e10);
                    } else {
                        s0.c cVar7 = dVar2.M;
                        if (next == cVar7 && cVar6.f26299f == null) {
                            int e11 = d10 - cVar7.e();
                            dVar2.J(e11 - dVar2.r(), e11);
                        } else if (z12 && !dVar2.y()) {
                            c(i11, dVar2, interfaceC0491b, z10);
                        }
                    }
                    b(i11, dVar2, interfaceC0491b, z10);
                }
            }
        }
        if (dVar instanceof s0.g) {
            return;
        }
        HashSet<s0.c> hashSet2 = j11.f26294a;
        if (hashSet2 != null && j11.f26296c) {
            Iterator<s0.c> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                s0.c next2 = it2.next();
                s0.d dVar3 = next2.f26297d;
                int i13 = i10 + 1;
                boolean a11 = a(dVar3);
                if (dVar3.A() && a11) {
                    s0.e.V(dVar3, interfaceC0491b, new b.a());
                }
                s0.c cVar8 = dVar3.K;
                if ((next2 == cVar8 && (cVar2 = dVar3.M.f26299f) != null && cVar2.f26296c) || (next2 == dVar3.M && (cVar = cVar8.f26299f) != null && cVar.f26296c)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i14 = dVar3.V[0];
                if (i14 == 3 && !a11) {
                    if (i14 == 3 && dVar3.f26352w >= 0 && dVar3.f26351v >= 0) {
                        if (dVar3.f26331j0 != 8) {
                            if (dVar3.f26348s == 0) {
                                if (dVar3.Z == 0.0f) {
                                }
                            }
                        }
                        if (!dVar3.y() && !dVar3.H && z11 && !dVar3.y()) {
                            d(i13, dVar, interfaceC0491b, dVar3, z10);
                        }
                    }
                } else if (!dVar3.A()) {
                    s0.c cVar9 = dVar3.K;
                    if (next2 == cVar9 && dVar3.M.f26299f == null) {
                        int e12 = cVar9.e() + d11;
                        dVar3.J(e12, dVar3.r() + e12);
                    } else {
                        s0.c cVar10 = dVar3.M;
                        if (next2 == cVar10 && cVar9.f26299f == null) {
                            int e13 = d11 - cVar10.e();
                            dVar3.J(e13 - dVar3.r(), e13);
                        } else if (z11 && !dVar3.y()) {
                            c(i13, dVar3, interfaceC0491b, z10);
                        }
                    }
                    b(i13, dVar3, interfaceC0491b, z10);
                }
            }
        }
        dVar.f26338n = true;
    }

    public static void c(int i10, s0.d dVar, b.InterfaceC0491b interfaceC0491b, boolean z10) {
        float f10;
        float f11 = dVar.f26325g0;
        int d10 = dVar.K.f26299f.d();
        int d11 = dVar.M.f26299f.d();
        int e10 = dVar.K.e() + d10;
        int e11 = d11 - dVar.M.e();
        if (d10 == d11) {
            f11 = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int r10 = dVar.r();
        int i11 = (d11 - d10) - r10;
        if (d10 > d11) {
            i11 = (d10 - d11) - r10;
        }
        if (i11 > 0) {
            f10 = (f11 * i11) + 0.5f;
        } else {
            f10 = f11 * i11;
        }
        int i12 = ((int) f10) + d10;
        int i13 = i12 + r10;
        if (d10 > d11) {
            i13 = i12 - r10;
        }
        dVar.J(i12, i13);
        b(i10 + 1, dVar, interfaceC0491b, z10);
    }

    public static void d(int i10, s0.d dVar, b.InterfaceC0491b interfaceC0491b, s0.d dVar2, boolean z10) {
        float f10 = dVar2.f26325g0;
        int e10 = dVar2.K.e() + dVar2.K.f26299f.d();
        int d10 = dVar2.M.f26299f.d() - dVar2.M.e();
        if (d10 >= e10) {
            int r10 = dVar2.r();
            if (dVar2.f26331j0 != 8) {
                int i11 = dVar2.f26348s;
                if (i11 == 2) {
                    if (!(dVar instanceof s0.e)) {
                        dVar = dVar.W;
                    }
                    r10 = (int) (dVar2.f26325g0 * 0.5f * dVar.r());
                } else if (i11 == 0) {
                    r10 = d10 - e10;
                }
                r10 = Math.max(dVar2.f26351v, r10);
                int i12 = dVar2.f26352w;
                if (i12 > 0) {
                    r10 = Math.min(i12, r10);
                }
            }
            int i13 = e10 + ((int) ((f10 * ((d10 - e10) - r10)) + 0.5f));
            dVar2.J(i13, r10 + i13);
            b(i10 + 1, dVar2, interfaceC0491b, z10);
        }
    }

    public static void e(int i10, s0.d dVar, b.InterfaceC0491b interfaceC0491b) {
        float f10;
        float f11 = dVar.f26327h0;
        int d10 = dVar.L.f26299f.d();
        int d11 = dVar.N.f26299f.d();
        int e10 = dVar.L.e() + d10;
        int e11 = d11 - dVar.N.e();
        if (d10 == d11) {
            f11 = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int l10 = dVar.l();
        int i11 = (d11 - d10) - l10;
        if (d10 > d11) {
            i11 = (d10 - d11) - l10;
        }
        if (i11 > 0) {
            f10 = (f11 * i11) + 0.5f;
        } else {
            f10 = f11 * i11;
        }
        int i12 = (int) f10;
        int i13 = d10 + i12;
        int i14 = i13 + l10;
        if (d10 > d11) {
            i13 = d10 - i12;
            i14 = i13 - l10;
        }
        dVar.K(i13, i14);
        g(i10 + 1, dVar, interfaceC0491b);
    }

    public static void f(int i10, s0.d dVar, b.InterfaceC0491b interfaceC0491b, s0.d dVar2) {
        float f10 = dVar2.f26327h0;
        int e10 = dVar2.L.e() + dVar2.L.f26299f.d();
        int d10 = dVar2.N.f26299f.d() - dVar2.N.e();
        if (d10 >= e10) {
            int l10 = dVar2.l();
            if (dVar2.f26331j0 != 8) {
                int i11 = dVar2.f26349t;
                if (i11 == 2) {
                    if (!(dVar instanceof s0.e)) {
                        dVar = dVar.W;
                    }
                    l10 = (int) (f10 * 0.5f * dVar.l());
                } else if (i11 == 0) {
                    l10 = d10 - e10;
                }
                l10 = Math.max(dVar2.f26354y, l10);
                int i12 = dVar2.f26355z;
                if (i12 > 0) {
                    l10 = Math.min(i12, l10);
                }
            }
            int i13 = e10 + ((int) ((f10 * ((d10 - e10) - l10)) + 0.5f));
            dVar2.K(i13, l10 + i13);
            g(i10 + 1, dVar2, interfaceC0491b);
        }
    }

    public static void g(int i10, s0.d dVar, b.InterfaceC0491b interfaceC0491b) {
        boolean z10;
        s0.c cVar;
        s0.c cVar2;
        boolean z11;
        s0.c cVar3;
        s0.c cVar4;
        if (dVar.f26340o) {
            return;
        }
        if (!(dVar instanceof s0.e) && dVar.A() && a(dVar)) {
            s0.e.V(dVar, interfaceC0491b, new b.a());
        }
        s0.c j10 = dVar.j(c.a.TOP);
        s0.c j11 = dVar.j(c.a.BOTTOM);
        int d10 = j10.d();
        int d11 = j11.d();
        HashSet<s0.c> hashSet = j10.f26294a;
        if (hashSet != null && j10.f26296c) {
            Iterator<s0.c> it = hashSet.iterator();
            while (it.hasNext()) {
                s0.c next = it.next();
                s0.d dVar2 = next.f26297d;
                int i11 = i10 + 1;
                boolean a10 = a(dVar2);
                if (dVar2.A() && a10) {
                    s0.e.V(dVar2, interfaceC0491b, new b.a());
                }
                s0.c cVar5 = dVar2.L;
                if ((next == cVar5 && (cVar4 = dVar2.N.f26299f) != null && cVar4.f26296c) || (next == dVar2.N && (cVar3 = cVar5.f26299f) != null && cVar3.f26296c)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i12 = dVar2.V[1];
                if (i12 == 3 && !a10) {
                    if (i12 == 3 && dVar2.f26355z >= 0 && dVar2.f26354y >= 0 && (dVar2.f26331j0 == 8 || (dVar2.f26349t == 0 && dVar2.Z == 0.0f))) {
                        if (!dVar2.z() && !dVar2.H && z11 && !dVar2.z()) {
                            f(i11, dVar, interfaceC0491b, dVar2);
                        }
                    }
                } else if (!dVar2.A()) {
                    s0.c cVar6 = dVar2.L;
                    if (next == cVar6 && dVar2.N.f26299f == null) {
                        int e10 = cVar6.e() + d10;
                        dVar2.K(e10, dVar2.l() + e10);
                    } else {
                        s0.c cVar7 = dVar2.N;
                        if (next == cVar7 && cVar6.f26299f == null) {
                            int e11 = d10 - cVar7.e();
                            dVar2.K(e11 - dVar2.l(), e11);
                        } else if (z11 && !dVar2.z()) {
                            e(i11, dVar2, interfaceC0491b);
                        }
                    }
                    g(i11, dVar2, interfaceC0491b);
                }
            }
        }
        if (dVar instanceof s0.g) {
            return;
        }
        HashSet<s0.c> hashSet2 = j11.f26294a;
        if (hashSet2 != null && j11.f26296c) {
            Iterator<s0.c> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                s0.c next2 = it2.next();
                s0.d dVar3 = next2.f26297d;
                int i13 = i10 + 1;
                boolean a11 = a(dVar3);
                if (dVar3.A() && a11) {
                    s0.e.V(dVar3, interfaceC0491b, new b.a());
                }
                s0.c cVar8 = dVar3.L;
                if ((next2 == cVar8 && (cVar2 = dVar3.N.f26299f) != null && cVar2.f26296c) || (next2 == dVar3.N && (cVar = cVar8.f26299f) != null && cVar.f26296c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i14 = dVar3.V[1];
                if (i14 == 3 && !a11) {
                    if (i14 == 3 && dVar3.f26355z >= 0 && dVar3.f26354y >= 0 && (dVar3.f26331j0 == 8 || (dVar3.f26349t == 0 && dVar3.Z == 0.0f))) {
                        if (!dVar3.z() && !dVar3.H && z10 && !dVar3.z()) {
                            f(i13, dVar, interfaceC0491b, dVar3);
                        }
                    }
                } else if (!dVar3.A()) {
                    s0.c cVar9 = dVar3.L;
                    if (next2 == cVar9 && dVar3.N.f26299f == null) {
                        int e12 = cVar9.e() + d11;
                        dVar3.K(e12, dVar3.l() + e12);
                    } else {
                        s0.c cVar10 = dVar3.N;
                        if (next2 == cVar10 && cVar9.f26299f == null) {
                            int e13 = d11 - cVar10.e();
                            dVar3.K(e13 - dVar3.l(), e13);
                        } else if (z10 && !dVar3.z()) {
                            e(i13, dVar3, interfaceC0491b);
                        }
                    }
                    g(i13, dVar3, interfaceC0491b);
                }
            }
        }
        s0.c j12 = dVar.j(c.a.BASELINE);
        if (j12.f26294a != null && j12.f26296c) {
            int d12 = j12.d();
            Iterator<s0.c> it3 = j12.f26294a.iterator();
            while (it3.hasNext()) {
                s0.c next3 = it3.next();
                s0.d dVar4 = next3.f26297d;
                int i15 = i10 + 1;
                boolean a12 = a(dVar4);
                if (dVar4.A() && a12) {
                    s0.e.V(dVar4, interfaceC0491b, new b.a());
                }
                if (dVar4.V[1] != 3 || a12) {
                    if (!dVar4.A() && next3 == dVar4.O) {
                        int e14 = next3.e() + d12;
                        if (dVar4.F) {
                            int i16 = e14 - dVar4.f26319d0;
                            int i17 = dVar4.Y + i16;
                            dVar4.f26317c0 = i16;
                            dVar4.L.l(i16);
                            dVar4.N.l(i17);
                            dVar4.O.l(e14);
                            dVar4.f26336m = true;
                        }
                        g(i15, dVar4, interfaceC0491b);
                    }
                }
            }
        }
        dVar.f26340o = true;
    }
}
