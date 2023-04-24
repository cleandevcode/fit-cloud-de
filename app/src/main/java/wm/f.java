package wm;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import pm.x0;

/* loaded from: classes2.dex */
public class f extends x0 {

    /* renamed from: c */
    public a f30047c;

    public f(int i10, int i11, long j10) {
        this.f30047c = new a(i10, i11, j10, "DefaultDispatcher");
    }

    @Override // pm.b0
    public final void l0(xl.f fVar, Runnable runnable) {
        a aVar = this.f30047c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = a.f30024h;
        aVar.b(runnable, k.f30057f, false);
    }

    @Override // pm.b0
    public final void n0(xl.f fVar, Runnable runnable) {
        a aVar = this.f30047c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = a.f30024h;
        aVar.b(runnable, k.f30057f, true);
    }
}
