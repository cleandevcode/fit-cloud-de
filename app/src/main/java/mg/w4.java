package mg;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class w4 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ List f21610a;

    /* renamed from: b */
    public final /* synthetic */ x4 f21611b;

    public w4(x4 x4Var, List list) {
        this.f21611b = x4Var;
        this.f21610a = list;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f21611b.f21662a.c();
        try {
            this.f21611b.f21663b.f(this.f21610a);
            this.f21611b.f21662a.p();
            return tl.l.f28297a;
        } finally {
            this.f21611b.f21662a.l();
        }
    }
}
