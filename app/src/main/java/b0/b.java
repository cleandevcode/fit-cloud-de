package b0;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class b extends FilterOutputStream {

    /* renamed from: a */
    public final OutputStream f3929a;

    /* renamed from: b */
    public ByteOrder f3930b;

    public b(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.f3929a = outputStream;
        this.f3930b = byteOrder;
    }

    public final void a(int i10) {
        OutputStream outputStream;
        int i11;
        ByteOrder byteOrder = this.f3930b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f3929a.write((i10 >>> 0) & 255);
            this.f3929a.write((i10 >>> 8) & 255);
            this.f3929a.write((i10 >>> 16) & 255);
            outputStream = this.f3929a;
            i11 = i10 >>> 24;
        } else if (byteOrder != ByteOrder.BIG_ENDIAN) {
            return;
        } else {
            this.f3929a.write((i10 >>> 24) & 255);
            this.f3929a.write((i10 >>> 16) & 255);
            this.f3929a.write((i10 >>> 8) & 255);
            outputStream = this.f3929a;
            i11 = i10 >>> 0;
        }
        outputStream.write(i11 & 255);
    }

    public final void b(short s10) {
        OutputStream outputStream;
        int i10;
        ByteOrder byteOrder = this.f3930b;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.f3929a.write((s10 >>> 0) & 255);
            outputStream = this.f3929a;
            i10 = s10 >>> 8;
        } else if (byteOrder != ByteOrder.BIG_ENDIAN) {
            return;
        } else {
            this.f3929a.write((s10 >>> 8) & 255);
            outputStream = this.f3929a;
            i10 = s10 >>> 0;
        }
        outputStream.write(i10 & 255);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f3929a.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        this.f3929a.write(bArr, i10, i11);
    }
}
