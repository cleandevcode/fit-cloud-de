package ln;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes2.dex */
public interface w extends Closeable, Flushable {
    void c0(e eVar, long j10);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    z e();

    void flush();
}
