package ti;

import fl.g;
import fl.q;
import fl.t;
import gm.l;
import java.util.concurrent.TimeUnit;
import tk.m;

/* loaded from: classes2.dex */
public abstract class c<T> extends f<T> {
    @Override // ti.f
    public final void c(g.a aVar, ej.a aVar2, cj.a aVar3) {
        l.f(aVar3, "fcProtocolQueue");
        bj.b f10 = f();
        bj.b d10 = d();
        if (d10 == null) {
            try {
                ((cj.h) aVar3).g(f10, aVar2);
                ((ej.b) aVar2).b();
                aVar.b();
                return;
            } catch (Exception e10) {
                ((ej.b) aVar2).b();
                aVar.f(e10);
                return;
            }
        }
        h hVar = new h(aVar, aVar2);
        tk.i<T> h10 = new q(new t(((cj.h) aVar3).d(), new a(0, new b(d10)))).g(10L, TimeUnit.SECONDS, pl.a.f24280b, null).h();
        l.e(h10, "receive = getReceive()\n …          .toObservable()");
        m<bj.b, T> e11 = e();
        if (e11 != null) {
            h10 = (tk.i<T>) h10.c(e11);
        }
        h10.d(hVar);
        try {
            ((cj.h) aVar3).g(f10, aVar2);
        } catch (Exception e12) {
            hVar.onError(e12);
        }
    }

    public abstract bj.b d();

    public m<bj.b, T> e() {
        return null;
    }

    public abstract bj.b f();
}
