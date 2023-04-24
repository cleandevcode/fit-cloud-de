package aj;

import gm.l;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import lc.g;
import s.e2;
import s.l0;
import tk.o;
import x2.i;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a */
    public final String f597a;

    /* renamed from: b */
    public final o f598b;

    /* renamed from: c */
    public final i f599c;

    /* renamed from: d */
    public volatile boolean f600d;

    /* renamed from: e */
    public g f601e;

    /* renamed from: f */
    public final Future<?> f602f;

    public c(String str, ExecutorService executorService, o oVar) {
        l.f(str, "deviceMacAddress");
        l.f(executorService, "operationQueueExecutor");
        l.f(oVar, "operationCallbackScheduler");
        this.f597a = str;
        this.f598b = oVar;
        this.f599c = new i(8, 0);
        this.f600d = true;
        Future<?> submit = executorService.submit(new e2(5, this));
        l.e(submit, "operationQueueExecutor.s…, deviceMacAddress)\n    }");
        this.f602f = submit;
    }

    public final synchronized <T> tk.i<T> a(zi.b<T> bVar) {
        tk.i<T> gVar;
        l.f(bVar, "operation");
        if (!this.f600d) {
            g gVar2 = this.f601e;
            if (gVar2 != null) {
                gVar = tk.i.m(gVar2);
            } else {
                l.l("disconnectionException");
                throw null;
            }
        } else {
            gVar = new fl.g<>(new l0(bVar, this, 3));
        }
        return gVar;
    }
}
