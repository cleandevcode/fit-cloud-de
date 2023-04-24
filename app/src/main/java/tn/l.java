package tn;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

/* loaded from: classes2.dex */
public final class l extends b {
    public l(int i10) {
        super((byte) 7);
        this.f28412b = i10;
    }

    public l(o oVar) {
        super((byte) 7);
        this.f28412b = oVar.f28412b;
    }

    public l(byte[] bArr) {
        super((byte) 7);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f28412b = dataInputStream.readUnsignedShort();
        dataInputStream.close();
    }

    @Override // tn.u
    public final byte[] p() {
        return j();
    }
}
