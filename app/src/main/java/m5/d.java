package m5;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class d extends InputStream {

    /* renamed from: c */
    public static final ArrayDeque f20364c;

    /* renamed from: a */
    public InputStream f20365a;

    /* renamed from: b */
    public IOException f20366b;

    static {
        char[] cArr = l.f20382a;
        f20364c = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f20365a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f20365a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.f20365a.mark(i10);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f20365a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.f20365a.read();
        } catch (IOException e10) {
            this.f20366b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.f20365a.read(bArr);
        } catch (IOException e10) {
            this.f20366b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f20365a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f20366b = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f20365a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        try {
            return this.f20365a.skip(j10);
        } catch (IOException e10) {
            this.f20366b = e10;
            throw e10;
        }
    }
}
