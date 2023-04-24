package tn;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

/* loaded from: classes2.dex */
public final class m extends b {
    public m(o oVar) {
        super((byte) 5);
        this.f28412b = oVar.f28412b;
    }

    public m(byte[] bArr) {
        super((byte) 5);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f28412b = dataInputStream.readUnsignedShort();
        dataInputStream.close();
    }

    @Override // tn.u
    public final byte[] p() {
        return j();
    }
}
