package mg;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ka implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ List f21205a;

    /* renamed from: b */
    public final /* synthetic */ la f21206b;

    public ka(la laVar, List list) {
        this.f21206b = laVar;
        this.f21205a = list;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f21206b.f21260a.c();
        try {
            this.f21206b.f21261b.f(this.f21205a);
            this.f21206b.f21260a.p();
            return tl.l.f28297a;
        } finally {
            this.f21206b.f21260a.l();
        }
    }
}
