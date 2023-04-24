package mg;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class k implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ List f21178a;

    /* renamed from: b */
    public final /* synthetic */ i0 f21179b;

    public k(i0 i0Var, ArrayList arrayList) {
        this.f21179b = i0Var;
        this.f21178a = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f21179b.f21100a.c();
        try {
            this.f21179b.f21102c.f(this.f21178a);
            this.f21179b.f21100a.p();
            return tl.l.f28297a;
        } finally {
            this.f21179b.f21100a.l();
        }
    }
}
