package fj;

import gm.l;
import ph.p;
import tk.i;

/* loaded from: classes2.dex */
public final class d implements wk.e<i<Throwable>, i<?>> {

    /* renamed from: a */
    public final long f14308a;

    /* renamed from: b */
    public final wk.f<Throwable> f14309b;

    /* renamed from: c */
    public int f14310c;

    public d(long j10, wk.f fVar) {
        this.f14308a = j10;
        this.f14309b = fVar;
    }

    @Override // wk.e
    public final i<?> apply(i<Throwable> iVar) {
        i<Throwable> iVar2 = iVar;
        l.f(iVar2, "attempts");
        i o10 = iVar2.o(new p(4, new c(this)));
        l.e(o10, "override fun apply(attem…        }\n        }\n    }");
        return o10;
    }
}
