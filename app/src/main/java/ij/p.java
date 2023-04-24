package ij;

import yi.c;

/* loaded from: classes2.dex */
public final class p extends gm.m implements fm.l<Throwable, Throwable> {

    /* renamed from: b */
    public static final p f17069b = new p();

    public p() {
        super(1);
    }

    @Override // fm.l
    public final Throwable k(Throwable th2) {
        int i10;
        int i11;
        Throwable th3;
        c.a aVar;
        Throwable th4 = th2;
        if (th4 instanceof lc.f) {
            aVar = yi.c.f31771d;
            th3 = null;
            i10 = 3;
            i11 = 6;
        } else if (th4 instanceof yi.c) {
            return th4;
        } else {
            i10 = 1;
            i11 = 2;
            th3 = th4;
            aVar = yi.c.f31771d;
        }
        return c.a.c(aVar, i10, th3, i11);
    }
}
