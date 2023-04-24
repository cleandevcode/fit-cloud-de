package ql;

import kl.a;
import kl.e;
import tk.n;

/* loaded from: classes2.dex */
public final class c<T> extends d<T> implements a.InterfaceC0322a<Object> {

    /* renamed from: a */
    public final d<T> f24970a;

    /* renamed from: b */
    public boolean f24971b;

    /* renamed from: c */
    public kl.a<Object> f24972c;

    /* renamed from: d */
    public volatile boolean f24973d;

    public c(d<T> dVar) {
        this.f24970a = dVar;
    }

    @Override // tk.n
    public final void a(uk.c cVar) {
        kl.a<Object> aVar;
        boolean z10 = true;
        if (!this.f24973d) {
            synchronized (this) {
                if (!this.f24973d) {
                    if (this.f24971b) {
                        kl.a<Object> aVar2 = this.f24972c;
                        if (aVar2 == null) {
                            aVar2 = new kl.a<>();
                            this.f24972c = aVar2;
                        }
                        aVar2.a(new e.a(cVar));
                        return;
                    }
                    this.f24971b = true;
                    z10 = false;
                }
            }
        }
        if (z10) {
            cVar.c();
            return;
        }
        this.f24970a.a(cVar);
        while (true) {
            synchronized (this) {
                aVar = this.f24972c;
                if (aVar == null) {
                    this.f24971b = false;
                    return;
                }
                this.f24972c = null;
            }
            aVar.b(this);
        }
    }

    @Override // tk.n
    public final void b(T t10) {
        kl.a<Object> aVar;
        if (this.f24973d) {
            return;
        }
        synchronized (this) {
            if (this.f24973d) {
                return;
            }
            if (this.f24971b) {
                kl.a<Object> aVar2 = this.f24972c;
                if (aVar2 == null) {
                    aVar2 = new kl.a<>();
                    this.f24972c = aVar2;
                }
                aVar2.a(t10);
                return;
            }
            this.f24971b = true;
            this.f24970a.b(t10);
            while (true) {
                synchronized (this) {
                    aVar = this.f24972c;
                    if (aVar == null) {
                        this.f24971b = false;
                        return;
                    }
                    this.f24972c = null;
                }
                aVar.b(this);
            }
        }
    }

    @Override // tk.n
    public final void onComplete() {
        if (this.f24973d) {
            return;
        }
        synchronized (this) {
            if (this.f24973d) {
                return;
            }
            this.f24973d = true;
            if (!this.f24971b) {
                this.f24971b = true;
                this.f24970a.onComplete();
                return;
            }
            kl.a<Object> aVar = this.f24972c;
            if (aVar == null) {
                aVar = new kl.a<>();
                this.f24972c = aVar;
            }
            aVar.a(kl.e.f18621a);
        }
    }

    @Override // tk.n
    public final void onError(Throwable th2) {
        if (this.f24973d) {
            ol.a.a(th2);
            return;
        }
        synchronized (this) {
            try {
                boolean z10 = true;
                if (!this.f24973d) {
                    this.f24973d = true;
                    if (this.f24971b) {
                        kl.a<Object> aVar = this.f24972c;
                        if (aVar == null) {
                            aVar = new kl.a<>();
                            this.f24972c = aVar;
                        }
                        aVar.f18616a[0] = new e.b(th2);
                        return;
                    }
                    this.f24971b = true;
                    z10 = false;
                }
                if (z10) {
                    ol.a.a(th2);
                } else {
                    this.f24970a.onError(th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // kl.a.InterfaceC0322a, wk.f
    public final boolean test(Object obj) {
        return kl.e.c(this.f24970a, obj);
    }

    @Override // tk.i
    public final void z(n<? super T> nVar) {
        this.f24970a.d(nVar);
    }
}
