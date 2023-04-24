package wi;

import java.util.Objects;
import kc.v0;
import kc.w0;
import p000do.a;
import wi.b;

/* loaded from: classes2.dex */
public final class m extends gm.m implements fm.l<v0, tk.l<? extends b>> {

    /* renamed from: b */
    public final /* synthetic */ k f29941b;

    /* renamed from: c */
    public final /* synthetic */ w0 f29942c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, w0 w0Var) {
        super(1);
        this.f29941b = kVar;
        this.f29942c = w0Var;
    }

    @Override // fm.l
    public final tk.l<? extends b> k(v0 v0Var) {
        tk.t e10;
        v0 v0Var2 = v0Var;
        k kVar = this.f29941b;
        gm.l.e(v0Var2, "it");
        String c10 = this.f29942c.c();
        gm.l.e(c10, "rxBleDevice.macAddress");
        kVar.getClass();
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#BaseConnectorImpl");
        bVar.h("rxPrepare (Thread:%s)", Thread.currentThread().getName());
        vi.a aVar = kVar.f29897e;
        ql.b<bj.b> bVar2 = kVar.f29911s;
        gm.l.e(bVar2, "receiveProtocolPacketSubject");
        b.a aVar2 = new b.a(v0Var2, c10, aVar, bVar2);
        int i10 = kVar.f29901i;
        if (i10 != 20) {
            fl.q d10 = v0Var2.d(i10 + 3);
            h hVar = new h(0, v.f29955b);
            d10.getClass();
            gl.p pVar = new gl.p(d10, hVar);
            Objects.requireNonNull(20, "item is null");
            e10 = new gl.r(pVar, null, 20);
        } else {
            e10 = tk.p.e(20);
        }
        return new el.e(new gl.l(new gl.l(e10, new i(0, new r(aVar2, v0Var2))), new ph.p(2, new s(kVar))), new j(0, new t(aVar2, kVar, v0Var2))).u(new f(2, new u(aVar2)));
    }
}
