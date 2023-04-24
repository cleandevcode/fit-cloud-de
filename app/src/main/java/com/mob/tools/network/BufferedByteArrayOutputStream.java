package com.mob.tools.network;

import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

@Deprecated
/* loaded from: classes.dex */
public class BufferedByteArrayOutputStream extends ByteArrayOutputStream implements PublicMemberKeeper {
    public BufferedByteArrayOutputStream() {
    }

    public BufferedByteArrayOutputStream(int i10) {
        super(i10);
    }

    public byte[] getBuffer() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public int getBufferSize() {
        return ((ByteArrayOutputStream) this).buf.length;
    }

    public boolean switchBuffer(byte[] bArr) {
        if (bArr == null || bArr.length != ((ByteArrayOutputStream) this).buf.length) {
            return false;
        }
        ((ByteArrayOutputStream) this).buf = bArr;
        return true;
    }

    public void write(ByteBuffer byteBuffer) {
        write(byteBuffer, byteBuffer.limit());
    }

    public void write(ByteBuffer byteBuffer, int i10) {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        int length = bArr.length;
        int i11 = ((ByteArrayOutputStream) this).count;
        if (length - i11 >= i10) {
            byteBuffer.get(bArr, i11, i10);
            ((ByteArrayOutputStream) this).count += i10;
            return;
        }
        byte[] bArr2 = new byte[i10];
        byteBuffer.get(bArr2);
        write(bArr2);
    }
}
