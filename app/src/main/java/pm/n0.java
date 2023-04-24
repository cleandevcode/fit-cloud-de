package pm;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class n0 implements Executor {

    /* renamed from: a */
    public final b0 f24372a;

    public n0(wm.b bVar) {
        this.f24372a = bVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f24372a.l0(xl.g.f30632a, runnable);
    }

    public final String toString() {
        return this.f24372a.toString();
    }
}
