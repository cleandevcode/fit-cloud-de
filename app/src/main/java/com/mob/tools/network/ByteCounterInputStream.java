package com.mob.tools.network;

import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.InputStream;

/* loaded from: classes.dex */
public class ByteCounterInputStream extends InputStream implements PublicMemberKeeper {

    /* renamed from: a */
    private InputStream f9115a;

    /* renamed from: b */
    private long f9116b;

    /* renamed from: c */
    private OnReadListener f9117c;

    public ByteCounterInputStream(InputStream inputStream) {
        this.f9115a = inputStream;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f9115a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f9115a.close();
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f9115a.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f9115a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        int read = this.f9115a.read();
        if (read >= 0) {
            long j10 = this.f9116b + 1;
            this.f9116b = j10;
            OnReadListener onReadListener = this.f9117c;
            if (onReadListener != null) {
                onReadListener.onRead(j10);
            }
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int read = this.f9115a.read(bArr, i10, i11);
        if (read > 0) {
            long j10 = this.f9116b + read;
            this.f9116b = j10;
            OnReadListener onReadListener = this.f9117c;
            if (onReadListener != null) {
                onReadListener.onRead(j10);
            }
        }
        return read;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f9115a.reset();
        this.f9116b = 0L;
    }

    public void setOnInputStreamReadListener(OnReadListener onReadListener) {
        this.f9117c = onReadListener;
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        return this.f9115a.skip(j10);
    }
}
