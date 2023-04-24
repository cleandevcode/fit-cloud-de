package ti;

import fl.g;
import java.util.ArrayList;
import java.util.List;
import tl.l;

/* loaded from: classes2.dex */
public final class d extends f<l> {

    /* renamed from: a */
    public final List<bj.b> f28256a;

    public d(ArrayList arrayList) {
        this.f28256a = arrayList;
    }

    @Override // ti.f
    public final void c(g.a aVar, ej.a aVar2, cj.a aVar3) {
        gm.l.f(aVar3, "fcProtocolQueue");
        try {
            for (bj.b bVar : this.f28256a) {
                ((cj.h) aVar3).g(bVar, aVar2);
            }
            ((ej.b) aVar2).b();
            aVar.b();
        } catch (Exception e10) {
            ((ej.b) aVar2).b();
            aVar.f(e10);
        }
    }
}
