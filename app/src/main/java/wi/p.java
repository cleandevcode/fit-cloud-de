package wi;

import kc.w0;
import p000do.a;

/* loaded from: classes2.dex */
public final class p extends gm.m implements fm.l<Throwable, w0> {

    /* renamed from: b */
    public final /* synthetic */ k f29945b;

    /* renamed from: c */
    public final /* synthetic */ w0 f29946c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(k kVar, w0 w0Var) {
        super(1);
        this.f29945b = kVar;
        this.f29946c = w0Var;
    }

    @Override // fm.l
    public final w0 k(Throwable th2) {
        Throwable th3 = th2;
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#BaseConnectorImpl");
        bVar.r(th3, "rxFoundConnect error", new Object[0]);
        if (th3 instanceof lc.n) {
            lc.n nVar = (lc.n) th3;
            this.f29945b.getClass();
        }
        if (!(th3.getCause() instanceof lc.a)) {
            return this.f29946c;
        }
        throw th3;
    }
}
