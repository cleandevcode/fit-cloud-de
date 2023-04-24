package tn;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

/* loaded from: classes2.dex */
public final class q extends b {

    /* renamed from: e */
    public int[] f28405e;

    public q(byte[] bArr) {
        super((byte) 9);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f28412b = dataInputStream.readUnsignedShort();
        this.f28405e = new int[bArr.length - 2];
        int i10 = 0;
        for (int read = dataInputStream.read(); read != -1; read = dataInputStream.read()) {
            this.f28405e[i10] = read;
            i10++;
        }
        dataInputStream.close();
    }

    @Override // tn.u
    public final byte[] p() {
        return new byte[0];
    }

    @Override // tn.b, tn.u
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append(" granted Qos");
        for (int i10 = 0; i10 < this.f28405e.length; i10++) {
            stringBuffer.append(" ");
            stringBuffer.append(this.f28405e[i10]);
        }
        return stringBuffer.toString();
    }
}
