package m2;

import java.io.File;

/* loaded from: classes.dex */
public final class z implements r2.c, h {

    /* renamed from: a */
    public g f20327a;

    /* renamed from: b */
    public boolean f20328b;

    @Override // r2.c
    public final synchronized r2.b T() {
        if (!this.f20328b) {
            h(true);
            this.f20328b = true;
        }
        throw null;
    }

    @Override // m2.h
    public final r2.c a() {
        return null;
    }

    public final void b(File file) {
        throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
    }

    @Override // r2.c, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        throw null;
    }

    @Override // r2.c
    public final String getDatabaseName() {
        throw null;
    }

    public final void h(boolean z10) {
        if (getDatabaseName() == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw null;
    }

    @Override // r2.c
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        throw null;
    }
}
