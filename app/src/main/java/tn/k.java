package tn;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

/* loaded from: classes2.dex */
public final class k extends b {
    public k(o oVar) {
        super((byte) 4);
        this.f28412b = oVar.f28412b;
    }

    public k(byte[] bArr) {
        super((byte) 4);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f28412b = dataInputStream.readUnsignedShort();
        dataInputStream.close();
    }

    @Override // tn.u
    public final byte[] p() {
        return j();
    }
}
