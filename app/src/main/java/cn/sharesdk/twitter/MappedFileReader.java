package cn.sharesdk.twitter;

import android.util.Base64;
import java.io.FileInputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public class MappedFileReader {
    private byte[] array;
    private int arraySize;
    private FileInputStream fileIn;
    private long fileLength;
    private MappedByteBuffer mappedBuf;

    public MappedFileReader(String str, int i10) {
        FileInputStream fileInputStream = new FileInputStream(str);
        this.fileIn = fileInputStream;
        FileChannel channel = fileInputStream.getChannel();
        long size = channel.size();
        this.fileLength = size;
        this.mappedBuf = channel.map(FileChannel.MapMode.READ_ONLY, 0L, size);
        this.arraySize = i10;
    }

    public static String byteToBase64(byte[] bArr) {
        return Base64.encodeToString(bArr, 0);
    }

    public void close() {
        this.fileIn.close();
    }

    public byte[] getArray() {
        return this.array;
    }

    public long getFileLength() {
        return this.fileLength;
    }

    public int read() {
        int limit = this.mappedBuf.limit();
        int position = this.mappedBuf.position();
        if (position == limit) {
            return -1;
        }
        int i10 = limit - position;
        int i11 = this.arraySize;
        if (i10 > i11) {
            byte[] bArr = new byte[i11];
            this.array = bArr;
            this.mappedBuf.get(bArr);
            return this.arraySize;
        }
        byte[] bArr2 = new byte[i10];
        this.array = bArr2;
        this.mappedBuf.get(bArr2);
        return i10;
    }
}
