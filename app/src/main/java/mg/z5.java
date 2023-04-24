package mg;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class z5 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ List f21781a;

    /* renamed from: b */
    public final /* synthetic */ a6 f21782b;

    public z5(a6 a6Var, List list) {
        this.f21782b = a6Var;
        this.f21781a = list;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f21782b.f20665a.c();
        try {
            this.f21782b.f20666b.f(this.f21781a);
            this.f21782b.f20665a.p();
            return tl.l.f28297a;
        } finally {
            this.f21782b.f20665a.l();
        }
    }
}
