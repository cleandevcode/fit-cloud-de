package jj;

/* loaded from: classes2.dex */
public final class l0 extends gm.m implements fm.l<Throwable, tl.l> {

    /* renamed from: b */
    public final /* synthetic */ d0 f17939b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(d0 d0Var) {
        super(1);
        this.f17939b = d0Var;
    }

    @Override // fm.l
    public final tl.l k(Throwable th2) {
        int i10;
        Throwable th3 = th2;
        if (th3 instanceof lc.f) {
            i10 = -1;
        } else {
            if (th3 instanceof yi.h) {
                int i11 = ((yi.h) th3).f31776a;
                if (i11 != 1) {
                    if (i11 == 2) {
                        i10 = -3;
                    }
                } else {
                    i10 = -2;
                }
            }
            i10 = -128;
        }
        this.f17939b.f17884d = false;
        this.f17939b.f17885e.b(Integer.valueOf(i10));
        return tl.l.f28297a;
    }
}
