package xi;

import gm.l;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import tk.o;

/* loaded from: classes2.dex */
public final class f implements vi.a {

    /* renamed from: a */
    public final ExecutorService f30604a;

    /* renamed from: b */
    public final ExecutorService f30605b;

    /* renamed from: c */
    public final il.d f30606c;

    /* renamed from: d */
    public final ExecutorService f30607d;

    /* renamed from: e */
    public final ExecutorService f30608e;

    /* renamed from: f */
    public final il.d f30609f;

    public f() {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(new fj.a("OperationQueue"));
        l.e(newCachedThreadPool, "newCachedThreadPool(Cust…actory(\"OperationQueue\"))");
        this.f30604a = newCachedThreadPool;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new fj.a("OperationCallback"));
        l.e(newSingleThreadExecutor, "newSingleThreadExecutor(…ory(\"OperationCallback\"))");
        this.f30605b = newSingleThreadExecutor;
        o oVar = pl.a.f24279a;
        this.f30606c = new il.d(newSingleThreadExecutor);
        ExecutorService newCachedThreadPool2 = Executors.newCachedThreadPool(new fj.a("ProtocolReceiveQueue"));
        l.e(newCachedThreadPool2, "newCachedThreadPool(Cust…(\"ProtocolReceiveQueue\"))");
        this.f30607d = newCachedThreadPool2;
        ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor(new fj.a("ProtocolReceiveCallback"));
        l.e(newSingleThreadExecutor2, "newSingleThreadExecutor(…rotocolReceiveCallback\"))");
        this.f30608e = newSingleThreadExecutor2;
        this.f30609f = new il.d(newSingleThreadExecutor2);
    }

    @Override // vi.a
    public final ExecutorService a() {
        return this.f30607d;
    }

    @Override // vi.a
    public final o b() {
        return this.f30606c;
    }

    @Override // vi.a
    public final o c() {
        return this.f30609f;
    }

    @Override // vi.a
    public final ExecutorService d() {
        return this.f30604a;
    }
}
