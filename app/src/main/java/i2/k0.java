package i2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import sm.g1;
import sm.t0;

/* loaded from: classes.dex */
public abstract class k0 {

    /* renamed from: a */
    public final ReentrantLock f16314a = new ReentrantLock(true);

    /* renamed from: b */
    public final g1 f16315b;

    /* renamed from: c */
    public final g1 f16316c;

    /* renamed from: d */
    public boolean f16317d;

    /* renamed from: e */
    public final t0 f16318e;

    /* renamed from: f */
    public final t0 f16319f;

    public k0() {
        g1 c10 = bi.r.c(ul.s.f28879a);
        this.f16315b = c10;
        g1 c11 = bi.r.c(ul.u.f28881a);
        this.f16316c = c11;
        this.f16318e = bi.r.f(c10);
        this.f16319f = bi.r.f(c11);
    }

    public abstract j a(v vVar, Bundle bundle);

    public final void b(j jVar) {
        g1 g1Var = this.f16315b;
        Iterable iterable = (Iterable) g1Var.getValue();
        Object N = ul.q.N((List) this.f16315b.getValue());
        gm.l.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList(ul.l.B(iterable, 10));
        boolean z10 = false;
        for (Object obj : iterable) {
            boolean z11 = true;
            if (!z10 && gm.l.a(obj, N)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj);
            }
        }
        g1Var.setValue(ul.q.R(arrayList, jVar));
    }

    public void c(j jVar, boolean z10) {
        gm.l.f(jVar, "popUpTo");
        ReentrantLock reentrantLock = this.f16314a;
        reentrantLock.lock();
        try {
            g1 g1Var = this.f16315b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) g1Var.getValue()) {
                if (!(!gm.l.a((j) obj, jVar))) {
                    break;
                }
                arrayList.add(obj);
            }
            g1Var.setValue(arrayList);
            tl.l lVar = tl.l.f28297a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void d(j jVar) {
        gm.l.f(jVar, "backStackEntry");
        ReentrantLock reentrantLock = this.f16314a;
        reentrantLock.lock();
        try {
            g1 g1Var = this.f16315b;
            g1Var.setValue(ul.q.R((Collection) g1Var.getValue(), jVar));
            tl.l lVar = tl.l.f28297a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
