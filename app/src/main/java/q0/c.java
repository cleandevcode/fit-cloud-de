package q0;

import a0.x1;
import java.util.Arrays;
import p.g;
import q0.b;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: p */
    public static boolean f24468p = false;

    /* renamed from: q */
    public static int f24469q = 1000;

    /* renamed from: c */
    public d f24472c;

    /* renamed from: f */
    public b[] f24475f;

    /* renamed from: l */
    public final g f24481l;

    /* renamed from: o */
    public b f24484o;

    /* renamed from: a */
    public boolean f24470a = false;

    /* renamed from: b */
    public int f24471b = 0;

    /* renamed from: d */
    public int f24473d = 32;

    /* renamed from: e */
    public int f24474e = 32;

    /* renamed from: g */
    public boolean f24476g = false;

    /* renamed from: h */
    public boolean[] f24477h = new boolean[32];

    /* renamed from: i */
    public int f24478i = 1;

    /* renamed from: j */
    public int f24479j = 0;

    /* renamed from: k */
    public int f24480k = 32;

    /* renamed from: m */
    public e[] f24482m = new e[f24469q];

    /* renamed from: n */
    public int f24483n = 0;

    /* loaded from: classes.dex */
    public interface a {
        e a(boolean[] zArr);
    }

    public c() {
        this.f24475f = null;
        this.f24475f = new b[32];
        t();
        g gVar = new g();
        this.f24481l = gVar;
        this.f24472c = new d(gVar);
        this.f24484o = new b(gVar);
    }

    public static int o(s0.c cVar) {
        e eVar = cVar.f26302i;
        if (eVar != null) {
            return (int) (eVar.f24495e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final e a(int i10) {
        x1 x1Var = (x1) this.f24481l.f23728c;
        int i11 = x1Var.f208a;
        e eVar = null;
        if (i11 > 0) {
            int i12 = i11 - 1;
            ?? r32 = (Object[]) x1Var.f209b;
            ?? r42 = r32[i12];
            r32[i12] = 0;
            x1Var.f208a = i12;
            eVar = r42;
        }
        e eVar2 = eVar;
        if (eVar2 == null) {
            eVar2 = new e(i10);
        } else {
            eVar2.d();
        }
        eVar2.f24499i = i10;
        int i13 = this.f24483n;
        int i14 = f24469q;
        if (i13 >= i14) {
            int i15 = i14 * 2;
            f24469q = i15;
            this.f24482m = (e[]) Arrays.copyOf(this.f24482m, i15);
        }
        e[] eVarArr = this.f24482m;
        int i16 = this.f24483n;
        this.f24483n = i16 + 1;
        eVarArr[i16] = eVar2;
        return eVar2;
    }

    public final void b(e eVar, e eVar2, int i10, float f10, e eVar3, e eVar4, int i11, int i12) {
        int i13;
        float f11;
        b m10 = m();
        if (eVar2 == eVar3) {
            m10.f24466d.i(eVar, 1.0f);
            m10.f24466d.i(eVar4, 1.0f);
            m10.f24466d.i(eVar2, -2.0f);
        } else {
            if (f10 == 0.5f) {
                m10.f24466d.i(eVar, 1.0f);
                m10.f24466d.i(eVar2, -1.0f);
                m10.f24466d.i(eVar3, -1.0f);
                m10.f24466d.i(eVar4, 1.0f);
                if (i10 > 0 || i11 > 0) {
                    i13 = (-i10) + i11;
                    f11 = i13;
                }
            } else if (f10 <= 0.0f) {
                m10.f24466d.i(eVar, -1.0f);
                m10.f24466d.i(eVar2, 1.0f);
                f11 = i10;
            } else if (f10 >= 1.0f) {
                m10.f24466d.i(eVar4, -1.0f);
                m10.f24466d.i(eVar3, 1.0f);
                i13 = -i11;
                f11 = i13;
            } else {
                float f12 = 1.0f - f10;
                m10.f24466d.i(eVar, f12 * 1.0f);
                m10.f24466d.i(eVar2, f12 * (-1.0f));
                m10.f24466d.i(eVar3, (-1.0f) * f10);
                m10.f24466d.i(eVar4, 1.0f * f10);
                if (i10 > 0 || i11 > 0) {
                    m10.f24464b = (i11 * f10) + ((-i10) * f12);
                }
            }
            m10.f24464b = f11;
        }
        if (i12 != 8) {
            m10.b(this, i12);
        }
        c(m10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:212:0x00c0, code lost:
        if (r4.f24502l <= 1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x00c9, code lost:
        if (r4.f24502l <= 1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x00cb, code lost:
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x00cd, code lost:
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x00ea, code lost:
        if (r4.f24502l <= 1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x00f3, code lost:
        if (r4.f24502l <= 1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x00f5, code lost:
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x00f7, code lost:
        r14 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:291:0x01c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(q0.b r17) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.c.c(q0.b):void");
    }

    public final void d(e eVar, int i10) {
        b m10;
        b.a aVar;
        float f10;
        int i11 = eVar.f24493c;
        if (i11 == -1) {
            eVar.e(this, i10);
            for (int i12 = 0; i12 < this.f24471b + 1; i12++) {
                e eVar2 = ((e[]) this.f24481l.f23729d)[i12];
            }
            return;
        }
        if (i11 != -1) {
            b bVar = this.f24475f[i11];
            if (!bVar.f24467e) {
                if (bVar.f24466d.b() == 0) {
                    bVar.f24467e = true;
                } else {
                    m10 = m();
                    if (i10 < 0) {
                        m10.f24464b = i10 * (-1);
                        aVar = m10.f24466d;
                        f10 = 1.0f;
                    } else {
                        m10.f24464b = i10;
                        aVar = m10.f24466d;
                        f10 = -1.0f;
                    }
                    aVar.i(eVar, f10);
                }
            }
            bVar.f24464b = i10;
            return;
        }
        m10 = m();
        m10.f24463a = eVar;
        float f11 = i10;
        eVar.f24495e = f11;
        m10.f24464b = f11;
        m10.f24467e = true;
        c(m10);
    }

    public final void e(e eVar, e eVar2, int i10, int i11) {
        if (i11 == 8 && eVar2.f24496f && eVar.f24493c == -1) {
            eVar.e(this, eVar2.f24495e + i10);
            return;
        }
        b m10 = m();
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            m10.f24464b = i10;
        }
        if (!z10) {
            m10.f24466d.i(eVar, -1.0f);
            m10.f24466d.i(eVar2, 1.0f);
        } else {
            m10.f24466d.i(eVar, 1.0f);
            m10.f24466d.i(eVar2, -1.0f);
        }
        if (i11 != 8) {
            m10.b(this, i11);
        }
        c(m10);
    }

    public final void f(e eVar, e eVar2, int i10, int i11) {
        b m10 = m();
        e n10 = n();
        n10.f24494d = 0;
        m10.c(eVar, eVar2, n10, i10);
        if (i11 != 8) {
            m10.f24466d.i(k(i11), (int) (m10.f24466d.j(n10) * (-1.0f)));
        }
        c(m10);
    }

    public final void g(e eVar, e eVar2, int i10, int i11) {
        b m10 = m();
        e n10 = n();
        n10.f24494d = 0;
        m10.d(eVar, eVar2, n10, i10);
        if (i11 != 8) {
            m10.f24466d.i(k(i11), (int) (m10.f24466d.j(n10) * (-1.0f)));
        }
        c(m10);
    }

    public final void h(e eVar, e eVar2, e eVar3, e eVar4, float f10) {
        b m10 = m();
        m10.f24466d.i(eVar, -1.0f);
        m10.f24466d.i(eVar2, 1.0f);
        m10.f24466d.i(eVar3, f10);
        m10.f24466d.i(eVar4, -f10);
        c(m10);
    }

    public final void i(b bVar) {
        int i10;
        if (bVar.f24467e) {
            bVar.f24463a.e(this, bVar.f24464b);
        } else {
            b[] bVarArr = this.f24475f;
            int i11 = this.f24479j;
            bVarArr[i11] = bVar;
            e eVar = bVar.f24463a;
            eVar.f24493c = i11;
            this.f24479j = i11 + 1;
            eVar.f(this, bVar);
        }
        if (this.f24470a) {
            int i12 = 0;
            while (i12 < this.f24479j) {
                if (this.f24475f[i12] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f24475f[i12];
                if (bVar2 != null && bVar2.f24467e) {
                    bVar2.f24463a.e(this, bVar2.f24464b);
                    ((x1) this.f24481l.f23727b).c(bVar2);
                    this.f24475f[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f24479j;
                        if (i13 >= i10) {
                            break;
                        }
                        b[] bVarArr2 = this.f24475f;
                        int i15 = i13 - 1;
                        b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        e eVar2 = bVar3.f24463a;
                        if (eVar2.f24493c == i13) {
                            eVar2.f24493c = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f24475f[i14] = null;
                    }
                    this.f24479j = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f24470a = false;
        }
    }

    public final void j() {
        for (int i10 = 0; i10 < this.f24479j; i10++) {
            b bVar = this.f24475f[i10];
            bVar.f24463a.f24495e = bVar.f24464b;
        }
    }

    public final e k(int i10) {
        if (this.f24478i + 1 >= this.f24474e) {
            p();
        }
        e a10 = a(4);
        int i11 = this.f24471b + 1;
        this.f24471b = i11;
        this.f24478i++;
        a10.f24492b = i11;
        a10.f24494d = i10;
        ((e[]) this.f24481l.f23729d)[i11] = a10;
        d dVar = this.f24472c;
        dVar.f24488i.f24489a = a10;
        Arrays.fill(a10.f24498h, 0.0f);
        a10.f24498h[a10.f24494d] = 1.0f;
        dVar.j(a10);
        return a10;
    }

    public final e l(Object obj) {
        e eVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f24478i + 1 >= this.f24474e) {
            p();
        }
        if (obj instanceof s0.c) {
            s0.c cVar = (s0.c) obj;
            eVar = cVar.f26302i;
            if (eVar == null) {
                cVar.k();
                eVar = cVar.f26302i;
            }
            int i10 = eVar.f24492b;
            if (i10 == -1 || i10 > this.f24471b || ((e[]) this.f24481l.f23729d)[i10] == null) {
                if (i10 != -1) {
                    eVar.d();
                }
                int i11 = this.f24471b + 1;
                this.f24471b = i11;
                this.f24478i++;
                eVar.f24492b = i11;
                eVar.f24499i = 1;
                ((e[]) this.f24481l.f23729d)[i11] = eVar;
            }
        }
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final b m() {
        b bVar;
        g gVar = this.f24481l;
        x1 x1Var = (x1) gVar.f23727b;
        int i10 = x1Var.f208a;
        if (i10 > 0) {
            int i11 = i10 - 1;
            ?? r42 = (Object[]) x1Var.f209b;
            ?? r52 = r42[i11];
            r42[i11] = 0;
            x1Var.f208a = i11;
            bVar = r52;
        } else {
            bVar = null;
        }
        b bVar2 = bVar;
        if (bVar2 == null) {
            return new b(gVar);
        }
        bVar2.f24463a = null;
        bVar2.f24466d.clear();
        bVar2.f24464b = 0.0f;
        bVar2.f24467e = false;
        return bVar2;
    }

    public final e n() {
        if (this.f24478i + 1 >= this.f24474e) {
            p();
        }
        e a10 = a(3);
        int i10 = this.f24471b + 1;
        this.f24471b = i10;
        this.f24478i++;
        a10.f24492b = i10;
        ((e[]) this.f24481l.f23729d)[i10] = a10;
        return a10;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [q0.e[], java.lang.Cloneable] */
    public final void p() {
        int i10 = this.f24473d * 2;
        this.f24473d = i10;
        this.f24475f = (b[]) Arrays.copyOf(this.f24475f, i10);
        g gVar = this.f24481l;
        gVar.f23729d = (e[]) Arrays.copyOf((e[]) gVar.f23729d, this.f24473d);
        int i11 = this.f24473d;
        this.f24477h = new boolean[i11];
        this.f24474e = i11;
        this.f24480k = i11;
    }

    public final void q() {
        if (this.f24472c.e()) {
            j();
            return;
        }
        if (this.f24476g) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= this.f24479j) {
                    z10 = true;
                    break;
                } else if (!this.f24475f[i10].f24467e) {
                    break;
                } else {
                    i10++;
                }
            }
            if (z10) {
                j();
                return;
            }
        }
        r(this.f24472c);
    }

    public final void r(d dVar) {
        float f10;
        int i10;
        boolean z10;
        int i11 = 0;
        while (true) {
            f10 = 0.0f;
            i10 = 1;
            if (i11 < this.f24479j) {
                b bVar = this.f24475f[i11];
                if (bVar.f24463a.f24499i != 1 && bVar.f24464b < 0.0f) {
                    z10 = true;
                    break;
                }
                i11++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            boolean z11 = false;
            int i12 = 0;
            while (!z11) {
                i12 += i10;
                float f11 = Float.MAX_VALUE;
                int i13 = 0;
                int i14 = -1;
                int i15 = -1;
                int i16 = 0;
                while (i13 < this.f24479j) {
                    b bVar2 = this.f24475f[i13];
                    if (bVar2.f24463a.f24499i != i10 && !bVar2.f24467e && bVar2.f24464b < f10) {
                        int b10 = bVar2.f24466d.b();
                        int i17 = 0;
                        while (i17 < b10) {
                            e e10 = bVar2.f24466d.e(i17);
                            float j10 = bVar2.f24466d.j(e10);
                            if (j10 > f10) {
                                for (int i18 = 0; i18 < 9; i18++) {
                                    float f12 = e10.f24497g[i18] / j10;
                                    if ((f12 < f11 && i18 == i16) || i18 > i16) {
                                        i15 = e10.f24492b;
                                        i16 = i18;
                                        f11 = f12;
                                        i14 = i13;
                                    }
                                }
                            }
                            i17++;
                            f10 = 0.0f;
                        }
                    }
                    i13++;
                    f10 = 0.0f;
                    i10 = 1;
                }
                if (i14 != -1) {
                    b bVar3 = this.f24475f[i14];
                    bVar3.f24463a.f24493c = -1;
                    bVar3.g(((e[]) this.f24481l.f23729d)[i15]);
                    e eVar = bVar3.f24463a;
                    eVar.f24493c = i14;
                    eVar.f(this, bVar3);
                } else {
                    z11 = true;
                }
                if (i12 > this.f24478i / 2) {
                    z11 = true;
                }
                f10 = 0.0f;
                i10 = 1;
            }
        }
        s(dVar);
        j();
    }

    public final void s(b bVar) {
        for (int i10 = 0; i10 < this.f24478i; i10++) {
            this.f24477h[i10] = false;
        }
        boolean z10 = false;
        int i11 = 0;
        while (!z10) {
            i11++;
            if (i11 >= this.f24478i * 2) {
                return;
            }
            e eVar = bVar.f24463a;
            if (eVar != null) {
                this.f24477h[eVar.f24492b] = true;
            }
            e a10 = bVar.a(this.f24477h);
            if (a10 != null) {
                boolean[] zArr = this.f24477h;
                int i12 = a10.f24492b;
                if (zArr[i12]) {
                    return;
                }
                zArr[i12] = true;
            }
            if (a10 != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f24479j; i14++) {
                    b bVar2 = this.f24475f[i14];
                    if (bVar2.f24463a.f24499i != 1 && !bVar2.f24467e && bVar2.f24466d.h(a10)) {
                        float j10 = bVar2.f24466d.j(a10);
                        if (j10 < 0.0f) {
                            float f11 = (-bVar2.f24464b) / j10;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    b bVar3 = this.f24475f[i13];
                    bVar3.f24463a.f24493c = -1;
                    bVar3.g(a10);
                    e eVar2 = bVar3.f24463a;
                    eVar2.f24493c = i13;
                    eVar2.f(this, bVar3);
                }
            } else {
                z10 = true;
            }
        }
    }

    public final void t() {
        for (int i10 = 0; i10 < this.f24479j; i10++) {
            b bVar = this.f24475f[i10];
            if (bVar != null) {
                ((x1) this.f24481l.f23727b).c(bVar);
            }
            this.f24475f[i10] = null;
        }
    }

    public final void u() {
        g gVar;
        int i10 = 0;
        while (true) {
            gVar = this.f24481l;
            e[] eVarArr = (e[]) gVar.f23729d;
            if (i10 >= eVarArr.length) {
                break;
            }
            e eVar = eVarArr[i10];
            if (eVar != null) {
                eVar.d();
            }
            i10++;
        }
        x1 x1Var = (x1) gVar.f23728c;
        e[] eVarArr2 = this.f24482m;
        int i11 = this.f24483n;
        x1Var.getClass();
        if (i11 > eVarArr2.length) {
            i11 = eVarArr2.length;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            e eVar2 = eVarArr2[i12];
            int i13 = x1Var.f208a;
            Object[] objArr = (Object[]) x1Var.f209b;
            if (i13 < objArr.length) {
                objArr[i13] = eVar2;
                x1Var.f208a = i13 + 1;
            }
        }
        this.f24483n = 0;
        Arrays.fill((e[]) this.f24481l.f23729d, (Object) null);
        this.f24471b = 0;
        d dVar = this.f24472c;
        dVar.f24487h = 0;
        dVar.f24464b = 0.0f;
        this.f24478i = 1;
        for (int i14 = 0; i14 < this.f24479j; i14++) {
            b bVar = this.f24475f[i14];
        }
        t();
        this.f24479j = 0;
        this.f24484o = new b(this.f24481l);
    }
}
