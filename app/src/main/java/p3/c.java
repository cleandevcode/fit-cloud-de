package p3;

import androidx.work.impl.WorkDatabase;
import f3.p;
import f3.s;
import java.util.LinkedList;

/* loaded from: classes.dex */
public abstract class c implements Runnable {

    /* renamed from: a */
    public final g3.b f23802a = new g3.b();

    public static void a(g3.l lVar, String str) {
        boolean z10;
        WorkDatabase workDatabase = lVar.f14895c;
        o3.q w10 = workDatabase.w();
        o3.b r10 = workDatabase.r();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (true) {
            z10 = true;
            if (linkedList.isEmpty()) {
                break;
            }
            String str2 = (String) linkedList.remove();
            o3.r rVar = (o3.r) w10;
            s f10 = rVar.f(str2);
            if (f10 != s.SUCCEEDED && f10 != s.FAILED) {
                rVar.o(s.CANCELLED, str2);
            }
            linkedList.addAll(((o3.c) r10).a(str2));
        }
        g3.c cVar = lVar.f14898f;
        synchronized (cVar.f14872k) {
            f3.m.c().a(g3.c.f14861l, String.format("Processor cancelling %s", str), new Throwable[0]);
            cVar.f14870i.add(str);
            g3.o oVar = (g3.o) cVar.f14867f.remove(str);
            if (oVar == null) {
                z10 = false;
            }
            if (oVar == null) {
                oVar = (g3.o) cVar.f14868g.remove(str);
            }
            g3.c.b(str, oVar);
            if (z10) {
                cVar.g();
            }
        }
        for (g3.d dVar : lVar.f14897e) {
            dVar.d(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
            this.f23802a.a(f3.p.f14102a);
        } catch (Throwable th2) {
            this.f23802a.a(new p.a.C0249a(th2));
        }
    }
}
