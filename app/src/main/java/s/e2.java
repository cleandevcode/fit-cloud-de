package s;

import androidx.camera.core.h;
import fl.g;
import java.util.concurrent.PriorityBlockingQueue;
import p000do.a;

/* loaded from: classes.dex */
public final /* synthetic */ class e2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f25948a;

    /* renamed from: b */
    public final /* synthetic */ Object f25949b;

    public /* synthetic */ e2(int i10, Object obj) {
        this.f25948a = i10;
        this.f25949b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f25948a) {
            case 0:
                for (a0.m0 m0Var : ((g2) this.f25949b).f25965e) {
                    m0Var.b();
                }
                return;
            case 1:
                ((h.j) this.f25949b).c();
                return;
            case 2:
                a0.m0 m0Var2 = (a0.m0) this.f25949b;
                int i10 = j0.d.f17232x;
                m0Var2.b();
                m0Var2.a();
                return;
            case 3:
                m2.s sVar = (m2.s) this.f25949b;
                gm.l.f(sVar, "this$0");
                sVar.getClass();
                throw null;
            case 4:
                com.topstep.fitcloud.pro.utils.viewbinding.a aVar = (com.topstep.fitcloud.pro.utils.viewbinding.a) this.f25949b;
                gm.l.f(aVar, "this$0");
                aVar.f12487c = null;
                return;
            default:
                aj.c cVar = (aj.c) this.f25949b;
                gm.l.f(cVar, "this$0");
                while (cVar.f600d) {
                    try {
                        Object take = ((PriorityBlockingQueue) cVar.f599c.f30183b).take();
                        gm.l.e(take, "q.take()");
                        aj.a aVar2 = (aj.a) take;
                        Object obj2 = aVar2.f590a;
                        long currentTimeMillis = System.currentTimeMillis();
                        gm.l.f(obj2, "operation");
                        a.b bVar = p000do.a.f13275a;
                        bVar.t("Fc#Operation");
                        bVar.b("STARTED  %s(%d)", obj2.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(obj2)));
                        bVar.t("Fc#Operation");
                        bVar.h("RUNNING  %s(%d)", obj2.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(obj2)));
                        ej.b bVar2 = new ej.b();
                        aVar2.a(bVar2, cVar.f598b);
                        bVar2.a();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        bVar.t("Fc#Operation");
                        bVar.b("FINISHED  %s(%d) in %d ms", obj2.getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(obj2)), Long.valueOf(currentTimeMillis2 - currentTimeMillis));
                    } catch (InterruptedException e10) {
                        synchronized (cVar) {
                            if (!(!cVar.f600d)) {
                                a.b bVar3 = p000do.a.f13275a;
                                bVar3.t("Fc#OperationQueue");
                                bVar3.r(e10, "Error while processing connection operation queue", new Object[0]);
                            }
                        }
                    }
                }
                synchronized (cVar) {
                    while (!((PriorityBlockingQueue) cVar.f599c.f30183b).isEmpty()) {
                        aj.a aVar3 = (aj.a) ((PriorityBlockingQueue) cVar.f599c.f30183b).poll();
                        if (aVar3 != null && (obj = aVar3.f591b) != null) {
                            lc.g gVar = cVar.f601e;
                            if (gVar != null) {
                                ((g.a) obj).f(gVar);
                            } else {
                                gm.l.l("disconnectionException");
                                throw null;
                            }
                        }
                    }
                }
                a.b bVar4 = p000do.a.f13275a;
                bVar4.t("Fc#OperationQueue");
                bVar4.b("Terminated (%s)", cVar.f597a);
                return;
        }
    }
}
