package e0;

import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends OutputStream {

    /* renamed from: a */
    public final ByteBuffer f13286a;

    public b(ByteBuffer byteBuffer) {
        this.f13286a = byteBuffer;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        if (!this.f13286a.hasRemaining()) {
            throw new EOFException("Output ByteBuffer has no bytes remaining.");
        }
        this.f13286a.put((byte) i10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        bArr.getClass();
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 == 0) {
            return;
        }
        if (this.f13286a.remaining() < i11) {
            throw new EOFException("Output ByteBuffer has insufficient bytes remaining.");
        }
        this.f13286a.put(bArr, i10, i11);
    }
}
