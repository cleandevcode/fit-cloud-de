package wi;

import p000do.a;
import wi.b;

/* loaded from: classes2.dex */
public final class u extends gm.m implements fm.l<tk.i<byte[]>, b> {

    /* renamed from: b */
    public final /* synthetic */ b.a f29954b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(b.a aVar) {
        super(1);
        this.f29954b = aVar;
    }

    @Override // fm.l
    public final b k(tk.i<byte[]> iVar) {
        tk.i<byte[]> iVar2 = iVar;
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#BaseConnectorImpl");
        bVar.h("rxPrepare create connection (Thread:%s)", Thread.currentThread().getName());
        b.a aVar = this.f29954b;
        gm.l.e(iVar2, "it");
        aVar.getClass();
        aVar.f29867g = iVar2;
        b.a aVar2 = this.f29954b;
        aVar2.getClass();
        return new x(aVar2);
    }
}
