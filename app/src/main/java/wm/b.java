package wm;

import androidx.appcompat.widget.u0;
import bi.z0;
import java.util.concurrent.Executor;
import pm.x0;
import um.y;

/* loaded from: classes2.dex */
public final class b extends x0 implements Executor {

    /* renamed from: c */
    public static final b f30043c = new b();

    /* renamed from: d */
    public static final um.i f30044d;

    static {
        l lVar = l.f30059c;
        int i10 = y.f28943a;
        if (64 >= i10) {
            i10 = 64;
        }
        boolean z10 = false;
        int r10 = z0.r("kotlinx.coroutines.io.parallelism", i10, 0, 0, 12);
        lVar.getClass();
        if (r10 >= 1) {
            z10 = true;
        }
        if (z10) {
            f30044d = new um.i(lVar, r10);
            return;
        }
        throw new IllegalArgumentException(u0.a("Expected positive parallelism level, but got ", r10).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        l0(xl.g.f30632a, runnable);
    }

    @Override // pm.b0
    public final void l0(xl.f fVar, Runnable runnable) {
        f30044d.l0(fVar, runnable);
    }

    @Override // pm.b0
    public final void n0(xl.f fVar, Runnable runnable) {
        f30044d.n0(fVar, runnable);
    }

    @Override // pm.b0
    public final String toString() {
        return "Dispatchers.IO";
    }
}
