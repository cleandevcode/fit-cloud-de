package tn;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

/* loaded from: classes2.dex */
public final class n extends h {
    public n(m mVar) {
        super((byte) 6);
        this.f28412b = mVar.f28412b;
    }

    public n(byte[] bArr) {
        super((byte) 6);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f28412b = dataInputStream.readUnsignedShort();
        dataInputStream.close();
    }

    @Override // tn.u
    public final byte n() {
        return (byte) ((this.f28413c ? 8 : 0) | 2);
    }

    @Override // tn.u
    public final byte[] p() {
        return j();
    }

    @Override // tn.u
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(super.toString()));
        stringBuffer.append(" msgId ");
        stringBuffer.append(this.f28412b);
        return stringBuffer.toString();
    }
}
