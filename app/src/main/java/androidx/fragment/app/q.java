package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class q extends androidx.activity.result.c<Object> {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f2500a;

    public q(AtomicReference atomicReference) {
        this.f2500a = atomicReference;
    }

    @Override // androidx.activity.result.c
    public final void b(Object obj) {
        androidx.activity.result.c cVar = (androidx.activity.result.c) this.f2500a.get();
        if (cVar == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        cVar.b(obj);
    }

    @Override // androidx.activity.result.c
    public final void c() {
        androidx.activity.result.c cVar = (androidx.activity.result.c) this.f2500a.getAndSet(null);
        if (cVar != null) {
            cVar.c();
        }
    }
}
