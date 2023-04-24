package mg;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class c5 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ List f20758a;

    /* renamed from: b */
    public final /* synthetic */ a6 f20759b;

    public c5(a6 a6Var, ArrayList arrayList) {
        this.f20759b = a6Var;
        this.f20758a = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f20759b.f20665a.c();
        try {
            this.f20759b.f20667c.f(this.f20758a);
            this.f20759b.f20665a.p();
            return tl.l.f28297a;
        } finally {
            this.f20759b.f20665a.l();
        }
    }
}
