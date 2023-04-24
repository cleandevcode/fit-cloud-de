package tn;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

/* loaded from: classes2.dex */
public final class s extends b {
    public s(byte[] bArr) {
        super((byte) 11);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f28412b = dataInputStream.readUnsignedShort();
        dataInputStream.close();
    }

    @Override // tn.u
    public final byte[] p() {
        return new byte[0];
    }
}
