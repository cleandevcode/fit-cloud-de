package mg;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class r8 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ List f21402a;

    /* renamed from: b */
    public final /* synthetic */ s8 f21403b;

    public r8(s8 s8Var, List list) {
        this.f21403b = s8Var;
        this.f21402a = list;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f21403b.f21418a.c();
        try {
            this.f21403b.f21419b.f(this.f21402a);
            this.f21403b.f21418a.p();
            return tl.l.f28297a;
        } finally {
            this.f21403b.f21418a.l();
        }
    }
}
