package sn;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class e extends ByteArrayOutputStream {

    /* renamed from: a */
    public final /* synthetic */ f f27374a;

    public e(f fVar) {
        this.f27374a = fVar;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        ByteBuffer wrap;
        synchronized (this) {
            wrap = ByteBuffer.wrap(toByteArray());
            reset();
        }
        f.c(this.f27374a).write(new c((byte) 2, wrap.array()).a());
        f.c(this.f27374a).flush();
    }
}
