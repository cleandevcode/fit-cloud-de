package com.bumptech.glide.load.data;

import androidx.appcompat.widget.u0;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class g extends FilterInputStream {

    /* renamed from: c */
    public static final byte[] f5712c = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: d */
    public static final int f5713d = 31;

    /* renamed from: a */
    public final byte f5714a;

    /* renamed from: b */
    public int f5715b;

    public g(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 >= -1 && i10 <= 8) {
            this.f5714a = (byte) i10;
            return;
        }
        throw new IllegalArgumentException(u0.a("Cannot add invalid orientation: ", i10));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i10;
        int i11 = this.f5715b;
        int read = (i11 < 2 || i11 > (i10 = f5713d)) ? super.read() : i11 == i10 ? this.f5714a : f5712c[i11 - 2] & 255;
        if (read != -1) {
            this.f5715b++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = this.f5715b;
        int i14 = f5713d;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f5714a;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int min = Math.min(i14 - i13, i11);
            System.arraycopy(f5712c, this.f5715b - 2, bArr, i10, min);
            i12 = min;
        }
        if (i12 > 0) {
            this.f5715b += i12;
        }
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        long skip = super.skip(j10);
        if (skip > 0) {
            this.f5715b = (int) (this.f5715b + skip);
        }
        return skip;
    }
}
