package a5;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class g0 extends MediaDataSource {

    /* renamed from: a */
    public final /* synthetic */ ByteBuffer f282a;

    public g0(ByteBuffer byteBuffer) {
        this.f282a = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final long getSize() {
        return this.f282a.limit();
    }

    public final int readAt(long j10, byte[] bArr, int i10, int i11) {
        if (j10 >= this.f282a.limit()) {
            return -1;
        }
        this.f282a.position((int) j10);
        int min = Math.min(i11, this.f282a.remaining());
        this.f282a.get(bArr, i10, min);
        return min;
    }
}
