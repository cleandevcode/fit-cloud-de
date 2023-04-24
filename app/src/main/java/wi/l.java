package wi;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kc.w0;
import p000do.a;
import wi.k;

/* loaded from: classes2.dex */
public final class l extends gm.m implements fm.l<Throwable, tk.l<? extends Long>> {

    /* renamed from: b */
    public final /* synthetic */ k f29938b;

    /* renamed from: c */
    public final /* synthetic */ int f29939c;

    /* renamed from: d */
    public final /* synthetic */ w0 f29940d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i10, w0 w0Var, k kVar) {
        super(1);
        this.f29938b = kVar;
        this.f29939c = i10;
        this.f29940d = w0Var;
    }

    @Override // fm.l
    public final tk.l<? extends Long> k(Throwable th2) {
        boolean z10;
        tk.l<? extends Long> m10;
        e eVar;
        Throwable th3 = th2;
        a.b bVar = p000do.a.f13275a;
        bVar.t("Fc#BaseConnectorImpl");
        bVar.r(th3, "connectRetry (Thread:%s)", Thread.currentThread().getName());
        if (this.f29938b.f29896d.i() && !(th3 instanceof yi.b)) {
            z10 = true;
        } else {
            z10 = false;
        }
        k kVar = this.f29938b;
        int i10 = this.f29939c;
        w0 w0Var = this.f29940d;
        synchronized (kVar) {
            if (i10 == kVar.f29918z) {
                b bVar2 = kVar.A;
                if (bVar2 != null) {
                    AtomicInteger atomicInteger = k.E;
                    bVar2.a(k.a.a(w0Var, th3));
                }
                kVar.A = null;
                int andIncrement = kVar.f29913u.getAndIncrement();
                bVar.t("Fc#BaseConnectorImpl");
                bVar.p("retryNumber:%d", Integer.valueOf(andIncrement));
                ql.d<c> dVar = kVar.f29909q;
                gm.l.e(th3, "throwable");
                dVar.b(new c(th3));
                if (z10) {
                    int i11 = 5000;
                    if (!kVar.f29895c.a()) {
                        kVar.f29893a.getClass();
                        if (andIncrement > 25) {
                            kVar.D = true;
                        }
                        i11 = 5000 + (andIncrement * andIncrement * 1000);
                        if (300000 <= i11) {
                            i11 = 300000;
                        }
                    }
                    long j10 = i11;
                    kVar.f29914v.set(System.currentTimeMillis() + j10);
                    kVar.a(d.PRE_CONNECTING);
                    m10 = tk.i.D(j10, TimeUnit.MILLISECONDS);
                } else {
                    kVar.f29914v.set(0L);
                    if (th3 instanceof yi.b) {
                        if (((yi.b) th3).f31770a == 1) {
                            eVar = e.AUTH_LOGIN_FAILED;
                        } else {
                            eVar = e.AUTH_BIND_FAILED;
                        }
                    } else if ((th3 instanceof lc.f) && (th3.getCause() instanceof lc.a)) {
                        eVar = e.BT_DISABLED;
                    } else {
                        eVar = e.ERROR_UNKNOWN;
                    }
                    kVar.f29916x = eVar;
                    bVar.t("Fc#BaseConnectorImpl");
                    bVar.p("retry abort _disconnectReason:%s", kVar.f29916x);
                    kVar.a(d.DISCONNECTED);
                }
            } else {
                bVar.t("Fc#BaseConnectorImpl");
                bVar.p("connectRetry connectId except:%d , but:%d", Integer.valueOf(i10), Integer.valueOf(kVar.f29918z));
            }
            m10 = tk.i.m(th3);
        }
        return m10;
    }
}
