package pe;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Locale;

/* loaded from: classes.dex */
public final class e extends te.a {
    public e(InputStream inputStream, int i10) {
        super(inputStream, i10);
    }

    @Override // te.a
    public final void a(ByteBuffer byteBuffer) {
        this.f28064u = byteBuffer.getShort();
        this.f28052i = byteBuffer.get();
        this.f28062s = byteBuffer.get();
        byteBuffer.getShort();
        if (this.f28054k) {
            byteBuffer.getShort();
        } else {
            this.f28053j = byteBuffer.getShort() & 65535;
        }
        byteBuffer.getInt();
        ge.b.n(String.format(Locale.US, "icType=0x%02X, secure_version=0x%02x,  imageId=0x%04x, imageVersion=0x%08X, crc16=0x%04x, imageSize=0x%08X(%d)", Byte.valueOf(this.f28052i), Integer.valueOf(this.f28062s), Integer.valueOf(this.f28053j), Integer.valueOf(this.f28055l), Short.valueOf(this.f28064u), Integer.valueOf(this.f28056m), Integer.valueOf(this.f28056m)));
    }
}
