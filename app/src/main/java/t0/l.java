package t0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class l extends q {
    public l(s0.d dVar) {
        super(dVar);
    }

    @Override // t0.q, t0.d
    public final void a(d dVar) {
        s0.a aVar = (s0.a) this.f27510b;
        int i10 = aVar.f26273u0;
        Iterator it = this.f27516h.f27495l.iterator();
        int i11 = 0;
        int i12 = -1;
        while (it.hasNext()) {
            int i13 = ((g) it.next()).f27490g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (i10 != 0 && i10 != 2) {
            this.f27516h.d(i11 + aVar.f26275w0);
        } else {
            this.f27516h.d(i12 + aVar.f26275w0);
        }
    }

    @Override // t0.q
    public final void d() {
        q qVar;
        s0.d dVar = this.f27510b;
        if (dVar instanceof s0.a) {
            g gVar = this.f27516h;
            gVar.f27485b = true;
            s0.a aVar = (s0.a) dVar;
            int i10 = aVar.f26273u0;
            boolean z10 = aVar.f26274v0;
            int i11 = 0;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            gVar.f27488e = 7;
                            while (i11 < aVar.f26392t0) {
                                s0.d dVar2 = aVar.f26391s0[i11];
                                if (z10 || dVar2.f26331j0 != 8) {
                                    g gVar2 = dVar2.f26320e.f27517i;
                                    gVar2.f27494k.add(this.f27516h);
                                    this.f27516h.f27495l.add(gVar2);
                                }
                                i11++;
                            }
                        } else {
                            return;
                        }
                    } else {
                        gVar.f27488e = 6;
                        while (i11 < aVar.f26392t0) {
                            s0.d dVar3 = aVar.f26391s0[i11];
                            if (z10 || dVar3.f26331j0 != 8) {
                                g gVar3 = dVar3.f26320e.f27516h;
                                gVar3.f27494k.add(this.f27516h);
                                this.f27516h.f27495l.add(gVar3);
                            }
                            i11++;
                        }
                    }
                    m(this.f27510b.f26320e.f27516h);
                    qVar = this.f27510b.f26320e;
                    m(qVar.f27517i);
                }
                gVar.f27488e = 5;
                while (i11 < aVar.f26392t0) {
                    s0.d dVar4 = aVar.f26391s0[i11];
                    if (z10 || dVar4.f26331j0 != 8) {
                        g gVar4 = dVar4.f26318d.f27517i;
                        gVar4.f27494k.add(this.f27516h);
                        this.f27516h.f27495l.add(gVar4);
                    }
                    i11++;
                }
            } else {
                gVar.f27488e = 4;
                while (i11 < aVar.f26392t0) {
                    s0.d dVar5 = aVar.f26391s0[i11];
                    if (z10 || dVar5.f26331j0 != 8) {
                        g gVar5 = dVar5.f26318d.f27516h;
                        gVar5.f27494k.add(this.f27516h);
                        this.f27516h.f27495l.add(gVar5);
                    }
                    i11++;
                }
            }
            m(this.f27510b.f26318d.f27516h);
            qVar = this.f27510b.f26318d;
            m(qVar.f27517i);
        }
    }

    @Override // t0.q
    public final void e() {
        s0.d dVar = this.f27510b;
        if (dVar instanceof s0.a) {
            int i10 = ((s0.a) dVar).f26273u0;
            if (i10 != 0 && i10 != 1) {
                dVar.f26317c0 = this.f27516h.f27490g;
            } else {
                dVar.f26315b0 = this.f27516h.f27490g;
            }
        }
    }

    @Override // t0.q
    public final void f() {
        this.f27511c = null;
        this.f27516h.c();
    }

    @Override // t0.q
    public final boolean k() {
        return false;
    }

    public final void m(g gVar) {
        this.f27516h.f27494k.add(gVar);
        gVar.f27495l.add(this.f27516h);
    }
}
