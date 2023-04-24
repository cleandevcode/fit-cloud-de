package androidx.lifecycle;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class d implements Closeable, pm.e0 {

    /* renamed from: a */
    public final xl.f f2702a;

    public d(xl.f fVar) {
        gm.l.f(fVar, "context");
        this.f2702a = fVar;
    }

    @Override // pm.e0
    public final xl.f E() {
        return this.f2702a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        bi.m0.f(this.f2702a, null);
    }
}
