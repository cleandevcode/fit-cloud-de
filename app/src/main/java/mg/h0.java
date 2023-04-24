package mg;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class h0 implements Callable<tl.l> {

    /* renamed from: a */
    public final /* synthetic */ List f21042a;

    /* renamed from: b */
    public final /* synthetic */ i0 f21043b;

    public h0(i0 i0Var, List list) {
        this.f21043b = i0Var;
        this.f21042a = list;
    }

    @Override // java.util.concurrent.Callable
    public final tl.l call() {
        this.f21043b.f21100a.c();
        try {
            this.f21043b.f21101b.f(this.f21042a);
            this.f21043b.f21100a.p();
            return tl.l.f28297a;
        } finally {
            this.f21043b.f21100a.l();
        }
    }
}
