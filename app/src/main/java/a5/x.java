package a5;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class x extends FilterInputStream {

    /* renamed from: a */
    public volatile byte[] f339a;

    /* renamed from: b */
    public int f340b;

    /* renamed from: c */
    public int f341c;

    /* renamed from: d */
    public int f342d;

    /* renamed from: e */
    public int f343e;

    /* renamed from: f */
    public final u4.b f344f;

    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    public x(InputStream inputStream, u4.b bVar) {
        super(inputStream);
        this.f342d = -1;
        this.f344f = bVar;
        this.f339a = (byte[]) bVar.c(65536, byte[].class);
    }

    public static void h() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) {
        int i10 = this.f342d;
        if (i10 != -1) {
            int i11 = this.f343e - i10;
            int i12 = this.f341c;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f340b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f344f.c(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f339a = bArr2;
                    this.f344f.put(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f343e - this.f342d;
                this.f343e = i13;
                this.f342d = 0;
                this.f340b = 0;
                int read = inputStream.read(bArr, i13, bArr.length - i13);
                int i14 = this.f343e;
                if (read > 0) {
                    i14 += read;
                }
                this.f340b = i14;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f342d = -1;
            this.f343e = 0;
            this.f340b = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f339a == null || inputStream == null) {
            h();
            throw null;
        }
        return (this.f340b - this.f343e) + inputStream.available();
    }

    public final synchronized void b() {
        if (this.f339a != null) {
            this.f344f.put(this.f339a);
            this.f339a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f339a != null) {
            this.f344f.put(this.f339a);
            this.f339a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        this.f341c = Math.max(this.f341c, i10);
        this.f342d = this.f343e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f339a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            h();
            throw null;
        } else if (this.f343e < this.f340b || a(inputStream, bArr) != -1) {
            if (bArr != this.f339a && (bArr = this.f339a) == null) {
                h();
                throw null;
            }
            int i10 = this.f340b;
            int i11 = this.f343e;
            if (i10 - i11 > 0) {
                this.f343e = i11 + 1;
                return bArr[i11] & 255;
            }
            return -1;
        } else {
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr2 = this.f339a;
        if (bArr2 == null) {
            h();
            throw null;
        } else if (i11 == 0) {
            return 0;
        } else {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream == null) {
                h();
                throw null;
            }
            int i14 = this.f343e;
            int i15 = this.f340b;
            if (i14 < i15) {
                int i16 = i15 - i14;
                if (i16 >= i11) {
                    i16 = i11;
                }
                System.arraycopy(bArr2, i14, bArr, i10, i16);
                this.f343e += i16;
                if (i16 == i11 || inputStream.available() == 0) {
                    return i16;
                }
                i10 += i16;
                i12 = i11 - i16;
            } else {
                i12 = i11;
            }
            while (true) {
                if (this.f342d == -1 && i12 >= bArr2.length) {
                    i13 = inputStream.read(bArr, i10, i12);
                    if (i13 == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                } else if (a(inputStream, bArr2) == -1) {
                    return i12 != i11 ? i11 - i12 : -1;
                } else {
                    if (bArr2 != this.f339a && (bArr2 = this.f339a) == null) {
                        h();
                        throw null;
                    }
                    int i17 = this.f340b;
                    int i18 = this.f343e;
                    i13 = i17 - i18;
                    if (i13 >= i12) {
                        i13 = i12;
                    }
                    System.arraycopy(bArr2, i18, bArr, i10, i13);
                    this.f343e += i13;
                }
                i12 -= i13;
                if (i12 == 0) {
                    return i11;
                }
                if (inputStream.available() == 0) {
                    return i11 - i12;
                }
                i10 += i13;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f339a == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f342d;
        if (-1 == i10) {
            throw new a("Mark has been invalidated, pos: " + this.f343e + " markLimit: " + this.f341c);
        }
        this.f343e = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j10) {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f339a;
        if (bArr == null) {
            h();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            h();
            throw null;
        }
        int i10 = this.f340b;
        int i11 = this.f343e;
        if (i10 - i11 >= j10) {
            this.f343e = (int) (i11 + j10);
            return j10;
        }
        long j11 = i10 - i11;
        this.f343e = i10;
        if (this.f342d == -1 || j10 > this.f341c) {
            long skip = inputStream.skip(j10 - j11);
            if (skip > 0) {
                this.f342d = -1;
            }
            return j11 + skip;
        } else if (a(inputStream, bArr) == -1) {
            return j11;
        } else {
            int i12 = this.f340b;
            int i13 = this.f343e;
            if (i12 - i13 >= j10 - j11) {
                this.f343e = (int) ((i13 + j10) - j11);
                return j10;
            }
            long j12 = (j11 + i12) - i13;
            this.f343e = i12;
            return j12;
        }
    }
}
