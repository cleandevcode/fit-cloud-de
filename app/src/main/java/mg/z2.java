package mg;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class z2 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ List f21769a;

    /* renamed from: b */
    public final /* synthetic */ a3 f21770b;

    public z2(a3 a3Var, List list) {
        this.f21770b = a3Var;
        this.f21769a = list;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f21770b.f20650a.c();
        try {
            this.f21770b.f20651b.f(this.f21769a);
            this.f21770b.f20650a.p();
            return tl.l.f28297a;
        } finally {
            this.f21770b.f20650a.l();
        }
    }
}
