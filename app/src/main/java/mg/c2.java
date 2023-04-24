package mg;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class c2 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ List f20730a;

    /* renamed from: b */
    public final /* synthetic */ a3 f20731b;

    public c2(a3 a3Var, ArrayList arrayList) {
        this.f20731b = a3Var;
        this.f20730a = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f20731b.f20650a.c();
        try {
            this.f20731b.f20652c.f(this.f20730a);
            this.f20731b.f20650a.p();
            return tl.l.f28297a;
        } finally {
            this.f20731b.f20650a.l();
        }
    }
}
