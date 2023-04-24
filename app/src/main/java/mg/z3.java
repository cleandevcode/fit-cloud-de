package mg;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class z3 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ List f21771a;

    /* renamed from: b */
    public final /* synthetic */ x4 f21772b;

    public z3(x4 x4Var, ArrayList arrayList) {
        this.f21772b = x4Var;
        this.f21771a = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f21772b.f21662a.c();
        try {
            this.f21772b.f21664c.f(this.f21771a);
            this.f21772b.f21662a.p();
            return tl.l.f28297a;
        } finally {
            this.f21772b.f21662a.l();
        }
    }
}
