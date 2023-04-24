package wi;

import kc.v0;
import kc.y0;
import p000do.a;
import wi.b;

/* loaded from: classes2.dex */
public final class r extends gm.m implements fm.l<Integer, tk.t<? extends y0>> {

    /* renamed from: b */
    public final /* synthetic */ b.a f29948b;

    /* renamed from: c */
    public final /* synthetic */ v0 f29949c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(b.a aVar, v0 v0Var) {
        super(1);
        this.f29948b = aVar;
        this.f29949c = v0Var;
    }

    @Override // fm.l
    public final tk.t<? extends y0> k(Integer num) {
        Integer num2 = num;
        b.a aVar = this.f29948b;
        gm.l.e(num2, "it");
        aVar.f29865e = num2.intValue();
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#BaseConnectorImpl");
        bVar.h("rxPrepare maxBatchSize:%d (Thread:%s)", Integer.valueOf(this.f29948b.f29865e), Thread.currentThread().getName());
        return this.f29949c.b();
    }
}
