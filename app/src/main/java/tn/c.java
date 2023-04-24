package tn;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

/* loaded from: classes2.dex */
public final class c extends b {

    /* renamed from: e */
    public int f28382e;

    /* renamed from: f */
    public boolean f28383f;

    public c(byte[] bArr) {
        super((byte) 2);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f28383f = (dataInputStream.readUnsignedByte() & 1) == 1;
        this.f28382e = dataInputStream.readUnsignedByte();
        dataInputStream.close();
    }

    @Override // tn.u
    public final String m() {
        return "Con";
    }

    @Override // tn.u
    public final byte[] p() {
        return new byte[0];
    }

    @Override // tn.b, tn.u
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(super.toString()));
        stringBuffer.append(" session present:");
        stringBuffer.append(this.f28383f);
        stringBuffer.append(" return code: ");
        stringBuffer.append(this.f28382e);
        return stringBuffer.toString();
    }
}
