package pm;

import java.util.concurrent.CancellationException;
import pm.g1;

/* loaded from: classes2.dex */
public final class r1 extends xl.a implements g1 {

    /* renamed from: b */
    public static final r1 f24386b = new r1();

    public r1() {
        super(g1.b.f24341a);
    }

    @Override // pm.g1
    public final n C(l1 l1Var) {
        return s1.f24388a;
    }

    @Override // pm.g1
    public final q0 I(boolean z10, boolean z11, fm.l<? super Throwable, tl.l> lVar) {
        return s1.f24388a;
    }

    @Override // pm.g1
    public final Object R(xl.d<? super tl.l> dVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // pm.g1
    public final boolean a() {
        return true;
    }

    @Override // pm.g1
    public final boolean b0() {
        throw null;
    }

    @Override // pm.g1
    public final void h(CancellationException cancellationException) {
    }

    @Override // pm.g1
    public final boolean isCancelled() {
        return false;
    }

    @Override // pm.g1
    public final q0 k(fm.l<? super Throwable, tl.l> lVar) {
        return s1.f24388a;
    }

    @Override // pm.g1
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // pm.g1
    public final CancellationException v() {
        throw new IllegalStateException("This job is always active");
    }
}
