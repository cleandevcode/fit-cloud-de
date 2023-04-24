package y;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class g1 extends androidx.camera.core.d {

    /* renamed from: d */
    public final AtomicBoolean f30714d;

    public g1(androidx.camera.core.j jVar) {
        super(jVar);
        this.f30714d = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.d, androidx.camera.core.j, java.lang.AutoCloseable
    public final void close() {
        if (this.f30714d.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
