package m5;

import java.io.FilterInputStream;

/* loaded from: classes.dex */
public final class j extends FilterInputStream {

    /* renamed from: a */
    public int f20378a;

    public j(d dVar) {
        super(dVar);
        this.f20378a = Integer.MIN_VALUE;
    }

    public final long a(long j10) {
        int i10 = this.f20378a;
        if (i10 == 0) {
            return -1L;
        }
        return (i10 == Integer.MIN_VALUE || j10 <= ((long) i10)) ? j10 : i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i10 = this.f20378a;
        return i10 == Integer.MIN_VALUE ? super.available() : Math.min(i10, super.available());
    }

    public final void b(long j10) {
        int i10 = this.f20378a;
        if (i10 == Integer.MIN_VALUE || j10 == -1) {
            return;
        }
        this.f20378a = (int) (i10 - j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        super.mark(i10);
        this.f20378a = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (a(1L) == -1) {
            return -1;
        }
        int read = super.read();
        b(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int a10 = (int) a(i11);
        if (a10 == -1) {
            return -1;
        }
        int read = super.read(bArr, i10, a10);
        b(read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f20378a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        long a10 = a(j10);
        if (a10 == -1) {
            return 0L;
        }
        long skip = super.skip(a10);
        b(skip);
        return skip;
    }
}
