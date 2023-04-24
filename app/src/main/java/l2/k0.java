package l2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import l2.l2;
import y3.k0;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a */
    public boolean f19041a;

    /* renamed from: b */
    public final fm.l f19042b;

    /* renamed from: c */
    public final Object f19043c;

    /* renamed from: d */
    public final Object f19044d;

    /* renamed from: e */
    public final Object f19045e;

    public /* synthetic */ k0() {
        this.f19042b = l2.c.f19083b;
        this.f19043c = null;
        this.f19044d = new ReentrantLock();
        this.f19045e = new ArrayList();
    }

    public /* synthetic */ k0(boolean z10, y3.d0 d0Var, pm.e0 e0Var, xl.f fVar, k0.b.a aVar) {
        gm.l.f(d0Var, "stateStore");
        gm.l.f(e0Var, "coroutineScope");
        gm.l.f(fVar, "subscriptionCoroutineContextOverride");
        this.f19041a = z10;
        this.f19043c = d0Var;
        this.f19044d = e0Var;
        this.f19045e = fVar;
        this.f19042b = aVar;
    }

    public final void a() {
        if (this.f19041a) {
            return;
        }
        ReentrantLock reentrantLock = (ReentrantLock) this.f19044d;
        reentrantLock.lock();
        try {
            if (this.f19041a) {
                return;
            }
            this.f19041a = true;
            List<Object> Y = ul.q.Y((List) this.f19045e);
            ((List) this.f19045e).clear();
            tl.l lVar = tl.l.f28297a;
            reentrantLock.unlock();
            fm.l lVar2 = this.f19042b;
            for (Object obj : Y) {
                lVar2.k(obj);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
