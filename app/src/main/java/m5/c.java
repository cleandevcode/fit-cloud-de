package m5;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class c extends FilterInputStream {

    /* renamed from: a */
    public final long f20362a;

    /* renamed from: b */
    public int f20363b;

    public c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f20362a = j10;
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            this.f20363b += i10;
        } else if (this.f20362a - this.f20363b <= 0) {
        } else {
            StringBuilder a10 = android.support.v4.media.d.a("Failed to read all expected data, expected: ");
            a10.append(this.f20362a);
            a10.append(", but read: ");
            a10.append(this.f20363b);
            throw new IOException(a10.toString());
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f20362a - this.f20363b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) {
        int read;
        read = super.read(bArr, i10, i11);
        a(read);
        return read;
    }
}
