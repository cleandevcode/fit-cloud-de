package ml;

import kl.e;
import tk.n;

/* loaded from: classes2.dex */
public final class c<T> implements n<T>, uk.c {

    /* renamed from: a */
    public final n<? super T> f21889a;

    /* renamed from: b */
    public uk.c f21890b;

    /* renamed from: c */
    public boolean f21891c;

    /* renamed from: d */
    public kl.a<Object> f21892d;

    /* renamed from: e */
    public volatile boolean f21893e;

    public c(n<? super T> nVar) {
        this.f21889a = nVar;
    }

    @Override // tk.n
    public final void a(uk.c cVar) {
        if (xk.b.i(this.f21890b, cVar)) {
            this.f21890b = cVar;
            this.f21889a.a(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0062, code lost:
        continue;
     */
    @Override // tk.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(T r7) {
        /*
            r6 = this;
            boolean r0 = r6.f21893e
            if (r0 == 0) goto L5
            return
        L5:
            if (r7 != 0) goto L16
            uk.c r7 = r6.f21890b
            r7.c()
            java.lang.String r7 = "onNext called with a null value."
            java.lang.NullPointerException r7 = kl.d.a(r7)
            r6.onError(r7)
            return
        L16:
            monitor-enter(r6)
            boolean r0 = r6.f21893e     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L1d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            return
        L1d:
            boolean r0 = r6.f21891c     // Catch: java.lang.Throwable -> L6d
            if (r0 == 0) goto L31
            kl.a<java.lang.Object> r0 = r6.f21892d     // Catch: java.lang.Throwable -> L6d
            if (r0 != 0) goto L2c
            kl.a r0 = new kl.a     // Catch: java.lang.Throwable -> L6d
            r0.<init>()     // Catch: java.lang.Throwable -> L6d
            r6.f21892d = r0     // Catch: java.lang.Throwable -> L6d
        L2c:
            r0.a(r7)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            return
        L31:
            r0 = 1
            r6.f21891c = r0     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            tk.n<? super T> r1 = r6.f21889a
            r1.b(r7)
        L3a:
            monitor-enter(r6)
            kl.a<java.lang.Object> r7 = r6.f21892d     // Catch: java.lang.Throwable -> L6a
            r1 = 0
            if (r7 != 0) goto L44
            r6.f21891c = r1     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6a
            goto L69
        L44:
            r2 = 0
            r6.f21892d = r2     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6a
            tk.n<? super T> r2 = r6.f21889a
            java.lang.Object[] r7 = r7.f18616a
            r3 = 4
        L4d:
            if (r7 == 0) goto L67
            r4 = 0
        L50:
            if (r4 >= r3) goto L62
            r5 = r7[r4]
            if (r5 != 0) goto L57
            goto L62
        L57:
            boolean r5 = kl.e.c(r2, r5)
            if (r5 == 0) goto L5f
            r1 = 1
            goto L67
        L5f:
            int r4 = r4 + 1
            goto L50
        L62:
            r7 = r7[r3]
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            goto L4d
        L67:
            if (r1 == 0) goto L3a
        L69:
            return
        L6a:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6a
            throw r7
        L6d:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ml.c.b(java.lang.Object):void");
    }

    @Override // uk.c
    public final void c() {
        this.f21893e = true;
        this.f21890b.c();
    }

    @Override // tk.n
    public final void onComplete() {
        if (this.f21893e) {
            return;
        }
        synchronized (this) {
            if (this.f21893e) {
                return;
            }
            if (!this.f21891c) {
                this.f21893e = true;
                this.f21891c = true;
                this.f21889a.onComplete();
                return;
            }
            kl.a<Object> aVar = this.f21892d;
            if (aVar == null) {
                aVar = new kl.a<>();
                this.f21892d = aVar;
            }
            aVar.a(e.f18621a);
        }
    }

    @Override // tk.n
    public final void onError(Throwable th2) {
        if (this.f21893e) {
            ol.a.a(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f21893e) {
                    if (this.f21891c) {
                        this.f21893e = true;
                        kl.a<Object> aVar = this.f21892d;
                        if (aVar == null) {
                            aVar = new kl.a<>();
                            this.f21892d = aVar;
                        }
                        aVar.f18616a[0] = new e.b(th2);
                        return;
                    }
                    this.f21893e = true;
                    this.f21891c = true;
                    z10 = false;
                }
                if (z10) {
                    ol.a.a(th2);
                } else {
                    this.f21889a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
