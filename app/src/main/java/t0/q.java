package t0;

/* loaded from: classes.dex */
public abstract class q implements d {

    /* renamed from: a */
    public int f27509a;

    /* renamed from: b */
    public s0.d f27510b;

    /* renamed from: c */
    public n f27511c;

    /* renamed from: d */
    public int f27512d;

    /* renamed from: e */
    public h f27513e = new h(this);

    /* renamed from: f */
    public int f27514f = 0;

    /* renamed from: g */
    public boolean f27515g = false;

    /* renamed from: h */
    public g f27516h = new g(this);

    /* renamed from: i */
    public g f27517i = new g(this);

    /* renamed from: j */
    public int f27518j = 1;

    public q(s0.d dVar) {
        this.f27510b = dVar;
    }

    public static void b(g gVar, g gVar2, int i10) {
        gVar.f27495l.add(gVar2);
        gVar.f27489f = i10;
        gVar2.f27494k.add(gVar);
    }

    public static g h(s0.c cVar) {
        q qVar;
        q qVar2;
        s0.c cVar2 = cVar.f26299f;
        if (cVar2 == null) {
            return null;
        }
        s0.d dVar = cVar2.f26297d;
        int ordinal = cVar2.f26298e.ordinal();
        if (ordinal == 1) {
            qVar = dVar.f26318d;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                qVar2 = dVar.f26318d;
            } else if (ordinal != 4) {
                if (ordinal != 5) {
                    return null;
                }
                return dVar.f26320e.f27501k;
            } else {
                qVar2 = dVar.f26320e;
            }
            return qVar2.f27517i;
        } else {
            qVar = dVar.f26320e;
        }
        return qVar.f27516h;
    }

    public static g i(s0.c cVar, int i10) {
        s0.c cVar2 = cVar.f26299f;
        if (cVar2 == null) {
            return null;
        }
        s0.d dVar = cVar2.f26297d;
        q qVar = i10 == 0 ? dVar.f26318d : dVar.f26320e;
        int ordinal = cVar2.f26298e.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return qVar.f27516h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return qVar.f27517i;
        }
        return null;
    }

    @Override // t0.d
    public void a(d dVar) {
    }

    public final void c(g gVar, g gVar2, int i10, h hVar) {
        gVar.f27495l.add(gVar2);
        gVar.f27495l.add(this.f27513e);
        gVar.f27491h = i10;
        gVar.f27492i = hVar;
        gVar2.f27494k.add(gVar);
        hVar.f27494k.add(gVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        int max;
        if (i11 == 0) {
            s0.d dVar = this.f27510b;
            int i12 = dVar.f26352w;
            max = Math.max(dVar.f26351v, i10);
            if (i12 > 0) {
                max = Math.min(i12, i10);
            }
            if (max == i10) {
                return i10;
            }
        } else {
            s0.d dVar2 = this.f27510b;
            int i13 = dVar2.f26355z;
            max = Math.max(dVar2.f26354y, i10);
            if (i13 > 0) {
                max = Math.min(i13, i10);
            }
            if (max == i10) {
                return i10;
            }
        }
        return max;
    }

    public long j() {
        h hVar = this.f27513e;
        if (hVar.f27493j) {
            return hVar.f27490g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0051, code lost:
        if (r9.f27509a == 3) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(s0.c r13, s0.c r14, int r15) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.q.l(s0.c, s0.c, int):void");
    }
}
