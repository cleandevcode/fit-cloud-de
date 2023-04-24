package m5;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final AtomicReference<byte[]> f20355a = new AtomicReference<>();

    /* renamed from: m5.a$a */
    /* loaded from: classes.dex */
    public static class C0370a extends InputStream {

        /* renamed from: a */
        public final ByteBuffer f20356a;

        /* renamed from: b */
        public int f20357b = -1;

        public C0370a(ByteBuffer byteBuffer) {
            this.f20356a = byteBuffer;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f20356a.remaining();
        }

        @Override // java.io.InputStream
        public final synchronized void mark(int i10) {
            this.f20357b = this.f20356a.position();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() {
            if (this.f20356a.hasRemaining()) {
                return this.f20356a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) {
            if (this.f20356a.hasRemaining()) {
                int min = Math.min(i11, available());
                this.f20356a.get(bArr, i10, min);
                return min;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            int i10 = this.f20357b;
            if (i10 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f20356a.position(i10);
        }

        @Override // java.io.InputStream
        public final long skip(long j10) {
            if (this.f20356a.hasRemaining()) {
                long min = Math.min(j10, available());
                ByteBuffer byteBuffer = this.f20356a;
                byteBuffer.position((int) (byteBuffer.position() + min));
                return min;
            }
            return -1L;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f20358a;

        /* renamed from: b */
        public final int f20359b;

        /* renamed from: c */
        public final byte[] f20360c;

        public b(byte[] bArr, int i10, int i11) {
            this.f20360c = bArr;
            this.f20358a = i10;
            this.f20359b = i11;
        }
    }

    public static MappedByteBuffer a(File file) {
        RandomAccessFile randomAccessFile;
        Throwable th2;
        FileChannel fileChannel;
        FileChannel fileChannel2 = null;
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                if (length != 0) {
                    randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        fileChannel = randomAccessFile.getChannel();
                    } catch (Throwable th3) {
                        th2 = th3;
                        fileChannel = null;
                    }
                    try {
                        MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                        try {
                            fileChannel.close();
                        } catch (IOException unused) {
                        }
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused2) {
                        }
                        return load;
                    } catch (Throwable th4) {
                        th2 = th4;
                        Throwable th5 = th2;
                        fileChannel2 = fileChannel;
                        th = th5;
                        if (fileChannel2 != null) {
                            try {
                                fileChannel2.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                }
                throw new IOException("File unsuitable for memory mapping");
            }
            throw new IOException("File too large to map into memory");
        } catch (Throwable th6) {
            th = th6;
            randomAccessFile = null;
        }
    }

    public static ByteBuffer b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(DfuBaseService.ERROR_CONNECTION_MASK);
        byte[] andSet = f20355a.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[DfuBaseService.ERROR_CONNECTION_MASK];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read < 0) {
                f20355a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return c(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(andSet, 0, read);
        }
    }

    public static ByteBuffer c(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    public static void d(ByteBuffer byteBuffer, File file) {
        RandomAccessFile randomAccessFile;
        ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(0);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
        try {
            fileChannel = randomAccessFile.getChannel();
            fileChannel.write(byteBuffer);
            fileChannel.force(false);
            fileChannel.close();
            randomAccessFile.close();
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
        } catch (Throwable th3) {
            th = th3;
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused3) {
                }
            }
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }
}
