package t0;

/* loaded from: classes.dex */
public final class k extends q {
    public k(s0.d dVar) {
        super(dVar);
        dVar.f26318d.f();
        dVar.f26320e.f();
        this.f27514f = ((s0.g) dVar).f26389w0;
    }

    @Override // t0.q, t0.d
    public final void a(d dVar) {
        g gVar = this.f27516h;
        if (!gVar.f27486c || gVar.f27493j) {
            return;
        }
        this.f27516h.d((int) ((((g) gVar.f27495l.get(0)).f27490g * ((s0.g) this.f27510b).f26385s0) + 0.5f));
    }

    @Override // t0.q
    public final void d() {
        q qVar;
        s0.d dVar = this.f27510b;
        s0.g gVar = (s0.g) dVar;
        int i10 = gVar.f26386t0;
        int i11 = gVar.f26387u0;
        if (gVar.f26389w0 == 1) {
            g gVar2 = this.f27516h;
            if (i10 != -1) {
                gVar2.f27495l.add(dVar.W.f26318d.f27516h);
                this.f27510b.W.f26318d.f27516h.f27494k.add(this.f27516h);
                this.f27516h.f27489f = i10;
            } else if (i11 != -1) {
                gVar2.f27495l.add(dVar.W.f26318d.f27517i);
                this.f27510b.W.f26318d.f27517i.f27494k.add(this.f27516h);
                this.f27516h.f27489f = -i11;
            } else {
                gVar2.f27485b = true;
                gVar2.f27495l.add(dVar.W.f26318d.f27517i);
                this.f27510b.W.f26318d.f27517i.f27494k.add(this.f27516h);
            }
            m(this.f27510b.f26318d.f27516h);
            qVar = this.f27510b.f26318d;
        } else {
            g gVar3 = this.f27516h;
            if (i10 != -1) {
                gVar3.f27495l.add(dVar.W.f26320e.f27516h);
                this.f27510b.W.f26320e.f27516h.f27494k.add(this.f27516h);
                this.f27516h.f27489f = i10;
            } else if (i11 != -1) {
                gVar3.f27495l.add(dVar.W.f26320e.f27517i);
                this.f27510b.W.f26320e.f27517i.f27494k.add(this.f27516h);
                this.f27516h.f27489f = -i11;
            } else {
                gVar3.f27485b = true;
                gVar3.f27495l.add(dVar.W.f26320e.f27517i);
                this.f27510b.W.f26320e.f27517i.f27494k.add(this.f27516h);
            }
            m(this.f27510b.f26320e.f27516h);
            qVar = this.f27510b.f26320e;
        }
        m(qVar.f27517i);
    }

    @Override // t0.q
    public final void e() {
        s0.d dVar = this.f27510b;
        if (((s0.g) dVar).f26389w0 == 1) {
            dVar.f26315b0 = this.f27516h.f27490g;
        } else {
            dVar.f26317c0 = this.f27516h.f27490g;
        }
    }

    @Override // t0.q
    public final void f() {
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
