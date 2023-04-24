package ij;

import yi.c;

/* loaded from: classes2.dex */
public final class d extends gm.m implements fm.l<Throwable, Throwable> {

    /* renamed from: b */
    public static final d f17050b = new d();

    public d() {
        super(1);
    }

    @Override // fm.l
    public final Throwable k(Throwable th2) {
        String str;
        Throwable cause;
        int i10;
        Throwable th3 = th2;
        gm.l.e(th3, "it");
        if (th3 instanceof gj.a) {
            gj.a aVar = (gj.a) th3;
            int i11 = aVar.f15359a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        c.a aVar2 = yi.c.f31771d;
                        return new yi.c(2, 2, aVar.f15360b, th3.getCause());
                    }
                    c.a aVar3 = yi.c.f31771d;
                    return new yi.c(2, 1, aVar.f15360b, th3.getCause());
                }
                c.a aVar4 = yi.c.f31771d;
                str = aVar.f15360b;
                cause = th3.getCause();
                i10 = 4;
            } else {
                c.a aVar5 = yi.c.f31771d;
                str = aVar.f15360b;
                cause = th3.getCause();
                i10 = 3;
            }
            return new yi.c(1, i10, str, cause);
        }
        c.a aVar6 = yi.c.f31771d;
        return c.a.b(2, th3, 2);
    }
}
