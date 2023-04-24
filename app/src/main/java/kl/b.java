package kl;

import java.util.concurrent.atomic.AtomicReference;
import kl.d;
import tk.n;

/* loaded from: classes2.dex */
public final class b extends AtomicReference<Throwable> {
    public final Throwable a() {
        d.a aVar = d.f18620a;
        Throwable th2 = get();
        d.a aVar2 = d.f18620a;
        return th2 != aVar2 ? getAndSet(aVar2) : th2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x002d, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(java.lang.Throwable r6) {
        /*
            r5 = this;
            kl.d$a r0 = kl.d.f18620a
        L2:
            java.lang.Object r0 = r5.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kl.d$a r1 = kl.d.f18620a
            r2 = 0
            r3 = 1
            if (r0 != r1) goto Lf
            goto L30
        Lf:
            if (r0 != 0) goto L13
            r1 = r6
            goto L1f
        L13:
            vk.a r1 = new vk.a
            r4 = 2
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
            r4[r2] = r0
            r4[r3] = r6
            r1.<init>(r4)
        L1f:
            boolean r4 = r5.compareAndSet(r0, r1)
            if (r4 == 0) goto L27
            r2 = 1
            goto L2d
        L27:
            java.lang.Object r4 = r5.get()
            if (r4 == r0) goto L1f
        L2d:
            if (r2 == 0) goto L2
            r2 = 1
        L30:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kl.b.b(java.lang.Throwable):boolean");
    }

    public final boolean c(Throwable th2) {
        if (b(th2)) {
            return true;
        }
        ol.a.a(th2);
        return false;
    }

    public final void d() {
        Throwable a10 = a();
        if (a10 == null || a10 == d.f18620a) {
            return;
        }
        ol.a.a(a10);
    }

    public final void e(tk.b bVar) {
        Throwable a10 = a();
        if (a10 == null) {
            bVar.onComplete();
        } else if (a10 != d.f18620a) {
            bVar.onError(a10);
        }
    }

    public final void f(n<?> nVar) {
        Throwable a10 = a();
        if (a10 == null) {
            nVar.onComplete();
        } else if (a10 != d.f18620a) {
            nVar.onError(a10);
        }
    }

    public final void g(xn.a<?> aVar) {
        Throwable a10 = a();
        if (a10 == null) {
            aVar.onComplete();
        } else if (a10 != d.f18620a) {
            aVar.onError(a10);
        }
    }
}
