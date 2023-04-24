package t0;

import s.c0;

/* loaded from: classes.dex */
public final class o extends q {

    /* renamed from: k */
    public g f27501k;

    /* renamed from: l */
    public a f27502l;

    public o(s0.d dVar) {
        super(dVar);
        g gVar = new g(this);
        this.f27501k = gVar;
        this.f27502l = null;
        this.f27516h.f27488e = 6;
        this.f27517i.f27488e = 7;
        gVar.f27488e = 8;
        this.f27514f = 1;
    }

    @Override // t0.q, t0.d
    public final void a(d dVar) {
        float f10;
        int i10;
        if (c0.b(this.f27518j) != 3) {
            h hVar = this.f27513e;
            if (hVar.f27486c && !hVar.f27493j && this.f27512d == 3) {
                s0.d dVar2 = this.f27510b;
                int i11 = dVar2.f26349t;
                if (i11 != 2) {
                    if (i11 == 3) {
                        h hVar2 = dVar2.f26318d.f27513e;
                        if (hVar2.f27493j) {
                            int i12 = dVar2.f26313a0;
                            if (i12 != -1) {
                                if (i12 != 0) {
                                    if (i12 != 1) {
                                        i10 = 0;
                                    }
                                } else {
                                    f10 = hVar2.f27490g * dVar2.Z;
                                    i10 = (int) (f10 + 0.5f);
                                }
                            }
                            f10 = hVar2.f27490g / dVar2.Z;
                            i10 = (int) (f10 + 0.5f);
                        }
                    }
                } else {
                    s0.d dVar3 = dVar2.W;
                    if (dVar3 != null) {
                        h hVar3 = dVar3.f26320e.f27513e;
                        if (hVar3.f27493j) {
                            f10 = hVar3.f27490g * dVar2.A;
                            i10 = (int) (f10 + 0.5f);
                        }
                    }
                }
                hVar.d(i10);
            }
            g gVar = this.f27516h;
            if (gVar.f27486c) {
                g gVar2 = this.f27517i;
                if (gVar2.f27486c) {
                    if (gVar.f27493j && gVar2.f27493j && this.f27513e.f27493j) {
                        return;
                    }
                    if (!this.f27513e.f27493j && this.f27512d == 3) {
                        s0.d dVar4 = this.f27510b;
                        if (dVar4.f26348s == 0 && !dVar4.z()) {
                            int i13 = ((g) this.f27516h.f27495l.get(0)).f27490g;
                            g gVar3 = this.f27516h;
                            int i14 = i13 + gVar3.f27489f;
                            int i15 = ((g) this.f27517i.f27495l.get(0)).f27490g + this.f27517i.f27489f;
                            gVar3.d(i14);
                            this.f27517i.d(i15);
                            this.f27513e.d(i15 - i14);
                            return;
                        }
                    }
                    if (!this.f27513e.f27493j && this.f27512d == 3 && this.f27509a == 1 && this.f27516h.f27495l.size() > 0 && this.f27517i.f27495l.size() > 0) {
                        int i16 = (((g) this.f27517i.f27495l.get(0)).f27490g + this.f27517i.f27489f) - (((g) this.f27516h.f27495l.get(0)).f27490g + this.f27516h.f27489f);
                        h hVar4 = this.f27513e;
                        int i17 = hVar4.f27496m;
                        if (i16 < i17) {
                            hVar4.d(i16);
                        } else {
                            hVar4.d(i17);
                        }
                    }
                    if (this.f27513e.f27493j && this.f27516h.f27495l.size() > 0 && this.f27517i.f27495l.size() > 0) {
                        g gVar4 = (g) this.f27516h.f27495l.get(0);
                        g gVar5 = (g) this.f27517i.f27495l.get(0);
                        int i18 = gVar4.f27490g;
                        g gVar6 = this.f27516h;
                        int i19 = gVar6.f27489f + i18;
                        int i20 = gVar5.f27490g;
                        int i21 = this.f27517i.f27489f + i20;
                        float f11 = this.f27510b.f26327h0;
                        if (gVar4 == gVar5) {
                            f11 = 0.5f;
                        } else {
                            i18 = i19;
                            i20 = i21;
                        }
                        gVar6.d((int) ((((i20 - i18) - this.f27513e.f27490g) * f11) + i18 + 0.5f));
                        this.f27517i.d(this.f27516h.f27490g + this.f27513e.f27490g);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        s0.d dVar5 = this.f27510b;
        l(dVar5.L, dVar5.N, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:283:0x02b5, code lost:
        if (r10.f27510b.F != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x02f8, code lost:
        if (r0.f27512d == 3) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0326, code lost:
        if (r10.f27510b.F != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0328, code lost:
        r0 = r10.f27501k;
        r1 = r10.f27516h;
        r3 = r10.f27502l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0390, code lost:
        if (r0.f27512d == 3) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0392, code lost:
        r0.f27513e.f27494k.add(r10.f27513e);
        r10.f27513e.f27495l.add(r10.f27510b.f26318d.f27513e);
        r10.f27513e.f27484a = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:328:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:341:? A[RETURN, SYNTHETIC] */
    @Override // t0.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 955
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.o.d():void");
    }

    @Override // t0.q
    public final void e() {
        g gVar = this.f27516h;
        if (gVar.f27493j) {
            this.f27510b.f26317c0 = gVar.f27490g;
        }
    }

    @Override // t0.q
    public final void f() {
        this.f27511c = null;
        this.f27516h.c();
        this.f27517i.c();
        this.f27501k.c();
        this.f27513e.c();
        this.f27515g = false;
    }

    @Override // t0.q
    public final boolean k() {
        return this.f27512d != 3 || this.f27510b.f26349t == 0;
    }

    public final void m() {
        this.f27515g = false;
        this.f27516h.c();
        this.f27516h.f27493j = false;
        this.f27517i.c();
        this.f27517i.f27493j = false;
        this.f27501k.c();
        this.f27501k.f27493j = false;
        this.f27513e.f27493j = false;
    }

    public final String toString() {
        StringBuilder a10 = android.support.v4.media.d.a("VerticalRun ");
        a10.append(this.f27510b.f26333k0);
        return a10.toString();
    }
}
