package h2;

import java.io.RandomAccessFile;
import java.util.zip.ZipException;

/* loaded from: classes.dex */
public final class e {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public long f15752a;

        /* renamed from: b */
        public long f15753b;
    }

    public static a a(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length() - 22;
        long j10 = 0;
        if (length >= 0) {
            long j11 = length - 65536;
            if (j11 >= 0) {
                j10 = j11;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    a aVar = new a();
                    aVar.f15753b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    aVar.f15752a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                    return aVar;
                }
                length--;
            } while (length >= j10);
            throw new ZipException("End Of Central Directory signature not found");
        }
        StringBuilder a10 = android.support.v4.media.d.a("File too short to be a zip file: ");
        a10.append(randomAccessFile.length());
        throw new ZipException(a10.toString());
    }
}
