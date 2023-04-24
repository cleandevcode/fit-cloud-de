package g9;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class k implements q {

    /* renamed from: a */
    public final Executor f15037a;

    /* renamed from: b */
    public final a f15038b;

    /* renamed from: c */
    public final t f15039c;

    public k(Executor executor, a aVar, t tVar) {
        this.f15037a = executor;
        this.f15038b = aVar;
        this.f15039c = tVar;
    }

    @Override // g9.q
    public final void a(final t tVar) {
        this.f15037a.execute(new Runnable(this) { // from class: h8.m0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Object f15996b;

            {
                this.f15996b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                g9.t tVar2;
                if (((g9.t) tVar).f15060d) {
                    g9.t tVar3 = ((g9.k) this.f15996b).f15039c;
                    synchronized (tVar3.f15057a) {
                        if (!tVar3.f15059c) {
                            tVar3.f15059c = true;
                            tVar3.f15060d = true;
                            tVar3.f15058b.b(tVar3);
                        }
                    }
                    return;
                }
                try {
                    ((g9.k) this.f15996b).f15038b.a((g9.t) tVar);
                    g9.t tVar4 = ((g9.k) this.f15996b).f15039c;
                    synchronized (tVar4.f15057a) {
                        tVar4.d();
                        tVar4.f15059c = true;
                        tVar4.f15061e = null;
                    }
                    tVar4.f15058b.b(tVar4);
                } catch (g9.g e10) {
                    e = e10;
                    if (e.getCause() instanceof Exception) {
                        tVar2 = ((g9.k) this.f15996b).f15039c;
                        e = (Exception) e.getCause();
                        tVar2.c(e);
                    }
                    tVar2 = ((g9.k) this.f15996b).f15039c;
                    tVar2.c(e);
                } catch (Exception e11) {
                    e = e11;
                    tVar2 = ((g9.k) this.f15996b).f15039c;
                    tVar2.c(e);
                }
            }
        });
    }
}
