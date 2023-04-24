package t0;

import java.util.ArrayList;
import s0.c;

/* loaded from: classes.dex */
public final class m extends q {

    /* renamed from: k */
    public static int[] f27498k = new int[2];

    public m(s0.d dVar) {
        super(dVar);
        this.f27516h.f27488e = 4;
        this.f27517i.f27488e = 5;
        this.f27514f = 0;
    }

    public static void m(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else if (i14 != 1) {
                return;
            } else {
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:294:0x0253, code lost:
        if (r15 != 1) goto L127;
     */
    @Override // t0.q, t0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(t0.d r21) {
        /*
            Method dump skipped, instructions count: 969
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.m.a(t0.d):void");
    }

    @Override // t0.q
    public final void d() {
        s0.d dVar;
        s0.d dVar2;
        int i10;
        s0.d dVar3;
        g gVar;
        s0.c cVar;
        ArrayList arrayList;
        d dVar4;
        g gVar2;
        g gVar3;
        g gVar4;
        int i11;
        s0.d dVar5;
        int i12;
        s0.d dVar6 = this.f27510b;
        if (dVar6.f26312a) {
            this.f27513e.d(dVar6.r());
        }
        h hVar = this.f27513e;
        if (!hVar.f27493j) {
            s0.d dVar7 = this.f27510b;
            int i13 = dVar7.V[0];
            this.f27512d = i13;
            if (i13 != 3) {
                if (i13 == 4 && (dVar5 = dVar7.W) != null && ((i12 = dVar5.V[0]) == 1 || i12 == 4)) {
                    int r10 = (dVar5.r() - this.f27510b.K.e()) - this.f27510b.M.e();
                    q.b(this.f27516h, dVar5.f26318d.f27516h, this.f27510b.K.e());
                    q.b(this.f27517i, dVar5.f26318d.f27517i, -this.f27510b.M.e());
                    this.f27513e.d(r10);
                    return;
                } else if (i13 == 1) {
                    hVar.d(dVar7.r());
                }
            }
        } else if (this.f27512d == 4 && (dVar2 = (dVar = this.f27510b).W) != null && ((i10 = dVar2.V[0]) == 1 || i10 == 4)) {
            q.b(this.f27516h, dVar2.f26318d.f27516h, dVar.K.e());
            q.b(this.f27517i, dVar2.f26318d.f27517i, -this.f27510b.M.e());
            return;
        }
        h hVar2 = this.f27513e;
        if (hVar2.f27493j) {
            s0.d dVar8 = this.f27510b;
            if (dVar8.f26312a) {
                s0.c[] cVarArr = dVar8.S;
                s0.c cVar2 = cVarArr[0];
                s0.c cVar3 = cVar2.f26299f;
                if (cVar3 != null && cVarArr[1].f26299f != null) {
                    if (dVar8.y()) {
                        this.f27516h.f27489f = this.f27510b.S[0].e();
                        gVar = this.f27517i;
                        cVar = this.f27510b.S[1];
                        gVar.f27489f = -cVar.e();
                        return;
                    }
                    g h10 = q.h(this.f27510b.S[0]);
                    if (h10 != null) {
                        q.b(this.f27516h, h10, this.f27510b.S[0].e());
                    }
                    g h11 = q.h(this.f27510b.S[1]);
                    if (h11 != null) {
                        q.b(this.f27517i, h11, -this.f27510b.S[1].e());
                    }
                    this.f27516h.f27485b = true;
                    this.f27517i.f27485b = true;
                    return;
                }
                if (cVar3 != null) {
                    g h12 = q.h(cVar2);
                    if (h12 != null) {
                        q.b(this.f27516h, h12, this.f27510b.S[0].e());
                    } else {
                        return;
                    }
                } else {
                    s0.c cVar4 = cVarArr[1];
                    if (cVar4.f26299f != null) {
                        g h13 = q.h(cVar4);
                        if (h13 != null) {
                            q.b(this.f27517i, h13, -this.f27510b.S[1].e());
                            gVar3 = this.f27516h;
                            gVar4 = this.f27517i;
                            i11 = -this.f27513e.f27490g;
                            q.b(gVar3, gVar4, i11);
                            return;
                        }
                        return;
                    } else if (!(dVar8 instanceof s0.h) && dVar8.W != null && dVar8.j(c.a.CENTER).f26299f == null) {
                        s0.d dVar9 = this.f27510b;
                        q.b(this.f27516h, dVar9.W.f26318d.f27516h, dVar9.s());
                    } else {
                        return;
                    }
                }
                gVar3 = this.f27517i;
                gVar4 = this.f27516h;
                i11 = this.f27513e.f27490g;
                q.b(gVar3, gVar4, i11);
                return;
            }
        }
        if (this.f27512d == 3) {
            s0.d dVar10 = this.f27510b;
            int i14 = dVar10.f26348s;
            if (i14 != 2) {
                if (i14 == 3) {
                    if (dVar10.f26349t == 3) {
                        this.f27516h.f27484a = this;
                        this.f27517i.f27484a = this;
                        o oVar = dVar10.f26320e;
                        oVar.f27516h.f27484a = this;
                        oVar.f27517i.f27484a = this;
                        hVar2.f27484a = this;
                        if (dVar10.z()) {
                            this.f27513e.f27495l.add(this.f27510b.f26320e.f27513e);
                            this.f27510b.f26320e.f27513e.f27494k.add(this.f27513e);
                            o oVar2 = this.f27510b.f26320e;
                            oVar2.f27513e.f27484a = this;
                            this.f27513e.f27495l.add(oVar2.f27516h);
                            this.f27513e.f27495l.add(this.f27510b.f26320e.f27517i);
                            this.f27510b.f26320e.f27516h.f27494k.add(this.f27513e);
                            arrayList = this.f27510b.f26320e.f27517i.f27494k;
                            dVar4 = this.f27513e;
                            arrayList.add(dVar4);
                        } else if (this.f27510b.y()) {
                            this.f27510b.f26320e.f27513e.f27495l.add(this.f27513e);
                            arrayList = this.f27513e.f27494k;
                            dVar4 = this.f27510b.f26320e.f27513e;
                            arrayList.add(dVar4);
                        } else {
                            gVar2 = this.f27510b.f26320e.f27513e;
                        }
                    } else {
                        h hVar3 = dVar10.f26320e.f27513e;
                        hVar2.f27495l.add(hVar3);
                        hVar3.f27494k.add(this.f27513e);
                        this.f27510b.f26320e.f27516h.f27494k.add(this.f27513e);
                        this.f27510b.f26320e.f27517i.f27494k.add(this.f27513e);
                        h hVar4 = this.f27513e;
                        hVar4.f27485b = true;
                        hVar4.f27494k.add(this.f27516h);
                        this.f27513e.f27494k.add(this.f27517i);
                        this.f27516h.f27495l.add(this.f27513e);
                        gVar2 = this.f27517i;
                    }
                    arrayList = gVar2.f27495l;
                    dVar4 = this.f27513e;
                    arrayList.add(dVar4);
                }
            } else {
                s0.d dVar11 = dVar10.W;
                if (dVar11 != null) {
                    h hVar5 = dVar11.f26320e.f27513e;
                    hVar2.f27495l.add(hVar5);
                    hVar5.f27494k.add(this.f27513e);
                    h hVar6 = this.f27513e;
                    hVar6.f27485b = true;
                    hVar6.f27494k.add(this.f27516h);
                    arrayList = this.f27513e.f27494k;
                    dVar4 = this.f27517i;
                    arrayList.add(dVar4);
                }
            }
            gVar.f27489f = -cVar.e();
            return;
        }
        s0.d dVar12 = this.f27510b;
        s0.c[] cVarArr2 = dVar12.S;
        s0.c cVar5 = cVarArr2[0];
        s0.c cVar6 = cVar5.f26299f;
        if (cVar6 != null && cVarArr2[1].f26299f != null) {
            if (dVar12.y()) {
                this.f27516h.f27489f = this.f27510b.S[0].e();
                gVar = this.f27517i;
                cVar = this.f27510b.S[1];
                gVar.f27489f = -cVar.e();
                return;
            }
            g h14 = q.h(this.f27510b.S[0]);
            g h15 = q.h(this.f27510b.S[1]);
            if (h14 != null) {
                h14.b(this);
            }
            if (h15 != null) {
                h15.b(this);
            }
            this.f27518j = 4;
            return;
        }
        if (cVar6 != null) {
            g h16 = q.h(cVar5);
            if (h16 != null) {
                q.b(this.f27516h, h16, this.f27510b.S[0].e());
            } else {
                return;
            }
        } else {
            s0.c cVar7 = cVarArr2[1];
            if (cVar7.f26299f != null) {
                g h17 = q.h(cVar7);
                if (h17 != null) {
                    q.b(this.f27517i, h17, -this.f27510b.S[1].e());
                    c(this.f27516h, this.f27517i, -1, this.f27513e);
                    return;
                }
                return;
            } else if (!(dVar12 instanceof s0.h) && (dVar3 = dVar12.W) != null) {
                q.b(this.f27516h, dVar3.f26318d.f27516h, dVar12.s());
            } else {
                return;
            }
        }
        c(this.f27517i, this.f27516h, 1, this.f27513e);
    }

    @Override // t0.q
    public final void e() {
        g gVar = this.f27516h;
        if (gVar.f27493j) {
            this.f27510b.f26315b0 = gVar.f27490g;
        }
    }

    @Override // t0.q
    public final void f() {
        this.f27511c = null;
        this.f27516h.c();
        this.f27517i.c();
        this.f27513e.c();
        this.f27515g = false;
    }

    @Override // t0.q
    public final boolean k() {
        return this.f27512d != 3 || this.f27510b.f26348s == 0;
    }

    public final void n() {
        this.f27515g = false;
        this.f27516h.c();
        this.f27516h.f27493j = false;
        this.f27517i.c();
        this.f27517i.f27493j = false;
        this.f27513e.f27493j = false;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("HorizontalRun ");
        a10.append(this.f27510b.f26333k0);
        return a10.toString();
    }
}
