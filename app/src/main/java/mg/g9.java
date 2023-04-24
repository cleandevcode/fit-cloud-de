package mg;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class g9 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ List f21034a;

    /* renamed from: b */
    public final /* synthetic */ e9 f21035b;

    public g9(e9 e9Var, ArrayList arrayList) {
        this.f21035b = e9Var;
        this.f21034a = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f21035b.f20969b.c();
        try {
            this.f21035b.f20970c.f(this.f21034a);
            this.f21035b.f20969b.p();
            return tl.l.f28297a;
        } finally {
            this.f21035b.f20969b.l();
        }
    }
}
