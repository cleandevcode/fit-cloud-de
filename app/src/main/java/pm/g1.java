package pm;

import java.util.concurrent.CancellationException;
import xl.f;

/* loaded from: classes2.dex */
public interface g1 extends f.b {
    public static final /* synthetic */ int K = 0;

    /* loaded from: classes2.dex */
    public static final class a {
        public static /* synthetic */ q0 a(g1 g1Var, boolean z10, k1 k1Var, int i10) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return g1Var.I(z10, (i10 & 2) != 0, k1Var);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements f.c<g1> {

        /* renamed from: a */
        public static final /* synthetic */ b f24341a = new b();
    }

    n C(l1 l1Var);

    q0 I(boolean z10, boolean z11, fm.l<? super Throwable, tl.l> lVar);

    Object R(xl.d<? super tl.l> dVar);

    boolean a();

    boolean b0();

    void h(CancellationException cancellationException);

    boolean isCancelled();

    q0 k(fm.l<? super Throwable, tl.l> lVar);

    boolean start();

    CancellationException v();
}
