package pe;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a extends te.a {
    public a(InputStream inputStream) {
        super(inputStream, 304);
    }

    @Override // te.a
    public final void a(ByteBuffer byteBuffer) {
        String format;
        if (this.f28051h == 0) {
            this.f28052i = byteBuffer.get();
            this.f28063t = byteBuffer.get();
            this.f28053j = byteBuffer.getShort() & 65535;
            this.f28055l = byteBuffer.getShort() & 65535;
            this.f28064u = byteBuffer.getShort();
            if (this.f28057n <= 0) {
                this.f28056m = byteBuffer.getInt();
            }
            if (!this.f28044a) {
                return;
            }
            format = String.format(Locale.US, "binHeader: icType=0x%02X, otaFlag=0x%02X, imageId=0x%04X, imageVersion=0x%08X, crc16=0x%04X, imageSize(exclude image header)=0x%08X(%d)", Byte.valueOf(this.f28052i), Byte.valueOf(this.f28063t), Integer.valueOf(this.f28053j), Integer.valueOf(this.f28055l), Short.valueOf(this.f28064u), Integer.valueOf(this.f28056m), Integer.valueOf(this.f28056m));
        } else {
            this.f28052i = byteBuffer.get(2);
            this.f28063t = byteBuffer.get();
            if (!this.f28054k) {
                this.f28053j = byteBuffer.getShort(6) & 65535;
            }
            byteBuffer.getShort();
            this.f28064u = byteBuffer.getShort();
            byteBuffer.getInt();
            if (!this.f28044a) {
                return;
            }
            format = !this.f28054k ? String.format(Locale.US, "binHeader: icType=0x%02X, crc16=0x%04X", Byte.valueOf(this.f28052i), Short.valueOf(this.f28064u)) : String.format(Locale.US, "binHeader: icType=0x%02X, imageId=0x%04X, crc16=0x%04X", Byte.valueOf(this.f28052i), Integer.valueOf(this.f28053j), Short.valueOf(this.f28064u));
        }
        ge.b.d(format);
    }
}