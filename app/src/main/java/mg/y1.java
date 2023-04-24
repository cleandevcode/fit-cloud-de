package mg;

import java.util.UUID;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class y1 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ UUID f21687a;

    /* renamed from: b */
    public final /* synthetic */ w1 f21688b;

    public y1(w1 w1Var, UUID uuid) {
        this.f21688b = w1Var;
        this.f21687a = uuid;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        r2.f a10 = this.f21688b.f21574d.a();
        UUID uuid = this.f21687a;
        gm.l.f(uuid, "uuid");
        String uuid2 = uuid.toString();
        gm.l.e(uuid2, "uuid.toString()");
        a10.p(1, uuid2);
        this.f21688b.f21571a.c();
        try {
            a10.r();
            this.f21688b.f21571a.p();
            return tl.l.f28297a;
        } finally {
            this.f21688b.f21571a.l();
            this.f21688b.f21574d.c(a10);
        }
    }
}
