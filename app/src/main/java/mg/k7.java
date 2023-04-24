package mg;

import java.util.UUID;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class k7 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ UUID f21201a;

    /* renamed from: b */
    public final /* synthetic */ h7 f21202b;

    public k7(h7 h7Var, UUID uuid) {
        this.f21202b = h7Var;
        this.f21201a = uuid;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21202b.f21069g.a();
        UUID uuid = this.f21201a;
        gm.l.f(uuid, "uuid");
        String uuid2 = uuid.toString();
        gm.l.e(uuid2, "uuid.toString()");
        a10.p(1, uuid2);
        this.f21202b.f21063a.c();
        try {
            a10.r();
            this.f21202b.f21063a.p();
            return tl.l.f28297a;
        } finally {
            this.f21202b.f21063a.l();
            this.f21202b.f21069g.c(a10);
        }
    }
}
