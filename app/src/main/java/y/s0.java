package y;

import a0.d2;
import android.graphics.Matrix;
import b0.j;

/* loaded from: classes.dex */
public abstract class s0 implements o0 {
    public static f e(d2 d2Var, long j10, int i10, Matrix matrix) {
        return new f(d2Var, j10, i10, matrix);
    }

    @Override // y.o0
    public final void a(j.a aVar) {
        aVar.d(c());
    }

    @Override // y.o0
    public abstract d2 b();

    @Override // y.o0
    public abstract int c();

    @Override // y.o0
    public abstract long d();

    public abstract Matrix f();
}
