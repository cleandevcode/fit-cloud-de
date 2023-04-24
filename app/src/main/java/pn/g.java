package pn;

import pn.h;

/* loaded from: classes2.dex */
public final class g implements a {

    /* renamed from: a */
    public final /* synthetic */ h f24423a;

    public g(h hVar) {
        this.f24423a = hVar;
    }

    @Override // pn.a
    public final void a(e eVar) {
        h.f24425k.g(h.f24424j, "attemptReconnect", "501", new Object[]{eVar.b().a()});
        h hVar = this.f24423a;
        hVar.f24430c.getClass();
        hVar.h();
    }

    @Override // pn.a
    public final void b(e eVar, Exception exc) {
        un.b bVar = h.f24425k;
        String str = h.f24424j;
        bVar.g(str, "attemptReconnect", "502", new Object[]{eVar.b().a()});
        int i10 = h.f24426l;
        if (i10 < 128000) {
            h.f24426l = i10 * 2;
        }
        h hVar = this.f24423a;
        bVar.g(str, "rescheduleReconnectCycle", "505", new Object[]{hVar.f24428a, new Long(h.f24426l)});
        hVar.f24435h.schedule(new h.a(), h.f24426l);
    }
}
