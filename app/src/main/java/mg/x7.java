package mg;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class x7 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ List f21671a;

    /* renamed from: b */
    public final /* synthetic */ s8 f21672b;

    public x7(s8 s8Var, ArrayList arrayList) {
        this.f21672b = s8Var;
        this.f21671a = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f21672b.f21418a.c();
        try {
            this.f21672b.f21420c.f(this.f21671a);
            this.f21672b.f21418a.p();
            return tl.l.f28297a;
        } finally {
            this.f21672b.f21418a.l();
        }
    }
}
