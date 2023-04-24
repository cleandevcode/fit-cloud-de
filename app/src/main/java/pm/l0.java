package pm;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class l0<T> extends um.v<T> {

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24360d = AtomicIntegerFieldUpdater.newUpdater(l0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    public l0(xl.d dVar, xl.f fVar) {
        super(dVar, fVar);
        this._decision = 0;
    }

    @Override // um.v, pm.l1
    public final void A(Object obj) {
        x0(obj);
    }

    public final Object B0() {
        boolean z10;
        while (true) {
            int i10 = this._decision;
            z10 = false;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
            } else if (f24360d.compareAndSet(this, 0, 1)) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return yl.a.COROUTINE_SUSPENDED;
        }
        Object a10 = n1.a(d0());
        if (!(a10 instanceof u)) {
            return a10;
        }
        throw ((u) a10).f24396a;
    }

    @Override // um.v, pm.a
    public final void x0(Object obj) {
        boolean z10;
        while (true) {
            int i10 = this._decision;
            z10 = false;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
            } else if (f24360d.compareAndSet(this, 0, 2)) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return;
        }
        um.h.a(mf.a0.i(this.f28940c), jh.v.e(obj), null);
    }
}
