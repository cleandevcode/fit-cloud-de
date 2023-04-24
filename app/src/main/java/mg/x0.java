package mg;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class x0 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ List f21650a;

    /* renamed from: b */
    public final /* synthetic */ a1 f21651b;

    public x0(a1 a1Var, ArrayList arrayList) {
        this.f21651b = a1Var;
        this.f21650a = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f21651b.f20636a.c();
        try {
            this.f21651b.f20638c.f(this.f21650a);
            this.f21651b.f20636a.p();
            return tl.l.f28297a;
        } finally {
            this.f21651b.f20636a.l();
        }
    }
}
