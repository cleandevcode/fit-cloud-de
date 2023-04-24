package s;

import a0.h0;
import d6.g0;
import fl.g;
import gm.l;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;
import p0.c;
import p000do.a;
import s.k0;
import x2.i;

/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements c.InterfaceC0425c, g0.a, tk.k {

    /* renamed from: a */
    public final /* synthetic */ int f26055a;

    /* renamed from: b */
    public final /* synthetic */ Object f26056b;

    /* renamed from: c */
    public final /* synthetic */ Object f26057c;

    public /* synthetic */ l0(Object obj, Object obj2, int i10) {
        this.f26055a = i10;
        this.f26056b = obj;
        this.f26057c = obj2;
    }

    @Override // tk.k
    public final void a(g.a aVar) {
        final zi.b bVar = (zi.b) this.f26056b;
        final aj.c cVar = (aj.c) this.f26057c;
        gm.l.f(bVar, "$operation");
        gm.l.f(cVar, "this$0");
        final aj.a aVar2 = new aj.a(bVar, aVar);
        aVar.e(new wk.c() { // from class: aj.b
            @Override // wk.c
            public final void cancel() {
                boolean z10;
                c cVar2 = c.this;
                a aVar3 = aVar2;
                zi.b bVar2 = bVar;
                l.f(cVar2, "this$0");
                l.f(aVar3, "$entry");
                l.f(bVar2, "$operation");
                i iVar = cVar2.f599c;
                iVar.getClass();
                Iterator it = ((PriorityBlockingQueue) iVar.f30183b).iterator();
                while (true) {
                    if (it.hasNext()) {
                        a aVar4 = (a) it.next();
                        if (aVar4 == aVar3) {
                            z10 = ((PriorityBlockingQueue) iVar.f30183b).remove(aVar4);
                            break;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    a.b bVar3 = p000do.a.f13275a;
                    bVar3.t("Fc#Operation");
                    bVar3.b("REMOVED  %s(%d)", bVar2.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(bVar2)));
                }
            }
        });
        a.b bVar2 = p000do.a.f13275a;
        bVar2.t("Fc#Operation");
        bVar2.b("QUEUED  %s(%d)", bVar.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(bVar)));
        x2.i iVar = cVar.f599c;
        iVar.getClass();
        ((PriorityBlockingQueue) iVar.f30183b).add(aVar2);
    }

    @Override // p0.c.InterfaceC0425c
    public final String g(c.a aVar) {
        switch (this.f26055a) {
            case 0:
                ((k0.c) this.f26056b).getClass();
                ((h0.a) this.f26057c).b(new p0(aVar));
                return "submitStillCapture";
            default:
                ((AtomicReference) this.f26056b).set(aVar);
                return ((String) this.f26057c) + "-status";
        }
    }
}
