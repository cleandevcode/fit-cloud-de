package xk;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class e extends AtomicReference<uk.c> implements uk.c {
    public e() {
    }

    public e(e eVar) {
        lazySet(eVar);
    }

    public final boolean a() {
        return b.d(get());
    }

    @Override // uk.c
    public final void c() {
        b.a(this);
    }
}
