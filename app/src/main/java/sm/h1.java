package sm;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class h1 extends tm.c<g1<?>> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f27202a = AtomicReferenceFieldUpdater.newUpdater(h1.class, Object.class, "_state");
    public volatile /* synthetic */ Object _state = null;

    @Override // tm.c
    public final boolean a(tm.b bVar) {
        g1 g1Var = (g1) bVar;
        if (this._state != null) {
            return false;
        }
        this._state = bi.r.f4343d;
        return true;
    }

    @Override // tm.c
    public final xl.d[] b(tm.b bVar) {
        g1 g1Var = (g1) bVar;
        this._state = null;
        return ie.b.f16773c;
    }
}
