package sn;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class h extends ByteArrayOutputStream {

    /* renamed from: a */
    public final /* synthetic */ i f27392a;

    public h(i iVar) {
        this.f27392a = iVar;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        ByteBuffer wrap;
        synchronized (this) {
            wrap = ByteBuffer.wrap(toByteArray());
            reset();
        }
        i.d(this.f27392a).write(new c((byte) 2, wrap.array()).a());
        i.d(this.f27392a).flush();
    }
}
