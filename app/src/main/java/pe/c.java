package pe;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c extends te.a {
    public c(InputStream inputStream, int i10) {
        super(inputStream, i10);
    }

    @Override // te.a
    public final void a(ByteBuffer byteBuffer) {
        String format;
        this.f28052i = (byte) 3;
        if (this.f28051h == 0) {
            this.f28061r = byteBuffer.getShort() & 65535;
            this.f28053j = byteBuffer.getShort() & 65535;
            this.f28055l = byteBuffer.getShort() & 65535;
            this.f28064u = byteBuffer.getShort();
            this.f28056m = byteBuffer.getShort() & 65535;
            byte[] bArr = this.f28050g;
            this.f28063t = bArr[10];
            byte b10 = bArr[11];
            if (!this.f28044a) {
                return;
            }
            format = String.format(Locale.US, "flashAddr=0x%04X, imageId=0x%04X, imageVersion=0x%08X(%d), crc16=0x%04X, imageSize=0x%04X(%d), otaFlag=0x%02X", Integer.valueOf(this.f28061r), Integer.valueOf(this.f28053j), Integer.valueOf(this.f28055l), Integer.valueOf(this.f28055l), Short.valueOf(this.f28064u), Integer.valueOf(this.f28056m), Integer.valueOf(this.f28056m), Byte.valueOf(this.f28063t));
        } else {
            byteBuffer.getShort();
            if (this.f28054k) {
                byteBuffer.getShort();
            } else {
                this.f28053j = byteBuffer.getShort() & 65535;
            }
            byteBuffer.getShort();
            this.f28064u = byteBuffer.getShort();
            byteBuffer.getShort();
            byte[] bArr2 = this.f28050g;
            this.f28063t = bArr2[10];
            byte b11 = bArr2[11];
            if (!this.f28045b) {
                return;
            }
            format = String.format(Locale.US, "crc16=0x%04X,  otaFlag=0x%02X", Short.valueOf(this.f28064u), Byte.valueOf(this.f28063t));
        }
        ge.b.n(format);
    }

    @Override // te.a
    public final int s() {
        return (this.f28056m * 4) - this.f28069z;
    }
}
