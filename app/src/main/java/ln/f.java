package ln;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes2.dex */
public interface f extends w, WritableByteChannel {
    long B(y yVar);

    f D0(long j10);

    f S(String str);

    f a0(long j10);

    e d();

    @Override // ln.w, java.io.Flushable
    void flush();

    f g0(int i10, int i11, String str);

    f u(h hVar);

    f write(byte[] bArr);

    f write(byte[] bArr, int i10, int i11);

    f writeByte(int i10);

    f writeInt(int i10);

    f writeShort(int i10);
}
