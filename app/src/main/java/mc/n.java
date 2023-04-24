package mc;

import kc.h0;
import kc.w0;
import mc.b;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a */
    public final nc.b f20444a;

    /* renamed from: b */
    public final w3.a<b.a> f20445b;

    public n(nc.b bVar, w3.a<b.a> aVar) {
        this.f20444a = bVar;
        this.f20445b = aVar;
    }

    public final w0 a(String str) {
        b bVar = this.f20444a.get(str);
        if (bVar != null) {
            return bVar.a();
        }
        synchronized (this.f20444a) {
            b bVar2 = this.f20444a.get(str);
            if (bVar2 != null) {
                return bVar2.a();
            }
            h0 b10 = this.f20445b.get().a(str).b();
            w0 a10 = b10.a();
            this.f20444a.put(str, b10);
            return a10;
        }
    }
}
