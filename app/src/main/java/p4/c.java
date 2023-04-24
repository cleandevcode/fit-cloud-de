package p4;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class c implements Closeable {

    /* renamed from: a */
    public final InputStream f23878a;

    /* renamed from: b */
    public final Charset f23879b;

    /* renamed from: c */
    public byte[] f23880c;

    /* renamed from: d */
    public int f23881d;

    /* renamed from: e */
    public int f23882e;

    /* loaded from: classes.dex */
    public class a extends ByteArrayOutputStream {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(i10);
            c.this = r1;
        }

        @Override // java.io.ByteArrayOutputStream
        public final String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, c.this.f23879b.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public c(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(d.f23884a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f23878a = fileInputStream;
        this.f23879b = charset;
        this.f23880c = new byte[DfuBaseService.ERROR_REMOTE_MASK];
    }

    public final String a() {
        int i10;
        synchronized (this.f23878a) {
            byte[] bArr = this.f23880c;
            if (bArr != null) {
                if (this.f23881d >= this.f23882e) {
                    int read = this.f23878a.read(bArr, 0, bArr.length);
                    if (read != -1) {
                        this.f23881d = 0;
                        this.f23882e = read;
                    } else {
                        throw new EOFException();
                    }
                }
                for (int i11 = this.f23881d; i11 != this.f23882e; i11++) {
                    byte[] bArr2 = this.f23880c;
                    if (bArr2[i11] == 10) {
                        int i12 = this.f23881d;
                        if (i11 != i12) {
                            i10 = i11 - 1;
                            if (bArr2[i10] == 13) {
                                String str = new String(bArr2, i12, i10 - i12, this.f23879b.name());
                                this.f23881d = i11 + 1;
                                return str;
                            }
                        }
                        i10 = i11;
                        String str2 = new String(bArr2, i12, i10 - i12, this.f23879b.name());
                        this.f23881d = i11 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f23882e - this.f23881d) + 80);
                while (true) {
                    byte[] bArr3 = this.f23880c;
                    int i13 = this.f23881d;
                    aVar.write(bArr3, i13, this.f23882e - i13);
                    this.f23882e = -1;
                    InputStream inputStream = this.f23878a;
                    byte[] bArr4 = this.f23880c;
                    int read2 = inputStream.read(bArr4, 0, bArr4.length);
                    if (read2 != -1) {
                        this.f23881d = 0;
                        this.f23882e = read2;
                        for (int i14 = 0; i14 != this.f23882e; i14++) {
                            byte[] bArr5 = this.f23880c;
                            if (bArr5[i14] == 10) {
                                int i15 = this.f23881d;
                                if (i14 != i15) {
                                    aVar.write(bArr5, i15, i14 - i15);
                                }
                                this.f23881d = i14 + 1;
                                return aVar.toString();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            } else {
                throw new IOException("LineReader is closed");
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f23878a) {
            if (this.f23880c != null) {
                this.f23880c = null;
                this.f23878a.close();
            }
        }
    }
}
