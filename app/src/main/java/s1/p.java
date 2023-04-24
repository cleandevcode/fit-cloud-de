package s1;

import bi.z0;
import java.util.concurrent.atomic.AtomicInteger;
import pm.e0;
import pm.g1;
import rm.j;
import s1.q;

/* loaded from: classes.dex */
public final class p<T> {

    /* renamed from: a */
    public final e0 f26433a;

    /* renamed from: b */
    public final fm.p<T, xl.d<? super tl.l>, Object> f26434b;

    /* renamed from: c */
    public final rm.a f26435c = jh.v.a(Integer.MAX_VALUE, null, 6);

    /* renamed from: d */
    public final AtomicInteger f26436d = new AtomicInteger(0);

    public p(e0 e0Var, r rVar, t tVar) {
        this.f26433a = e0Var;
        this.f26434b = tVar;
        g1 g1Var = (g1) e0Var.E().b(g1.b.f24341a);
        if (g1Var == null) {
            return;
        }
        g1Var.k(new n(rVar, this));
    }

    public final void a(q.a aVar) {
        j.a aVar2;
        Object p10 = this.f26435c.p(aVar);
        boolean z10 = p10 instanceof j.a;
        Throwable th2 = null;
        if (z10) {
            if (z10) {
                aVar2 = (j.a) p10;
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                th2 = aVar2.f25851a;
            }
            if (th2 == null) {
                throw new rm.o("Channel was closed normally");
            }
        } else if (!(p10 instanceof j.b)) {
            if (this.f26436d.getAndIncrement() == 0) {
                z0.g(this.f26433a, null, 0, new o(this, null), 3);
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}
