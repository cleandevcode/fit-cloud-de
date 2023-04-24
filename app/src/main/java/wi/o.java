package wi;

import kc.w0;
import p000do.a;

/* loaded from: classes2.dex */
public final class o extends gm.m implements fm.l<uc.e, w0> {

    /* renamed from: b */
    public final /* synthetic */ k f29944b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(k kVar) {
        super(1);
        this.f29944b = kVar;
    }

    @Override // fm.l
    public final w0 k(uc.e eVar) {
        w0 w0Var = eVar.f28668a;
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#BaseConnectorImpl");
        bVar.h("rxFoundConnect found device %s", w0Var.c());
        this.f29944b.f29896d.c(w0Var);
        return w0Var;
    }
}
