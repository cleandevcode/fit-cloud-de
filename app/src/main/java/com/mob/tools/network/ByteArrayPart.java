package com.mob.tools.network;

import com.mob.tools.utils.Data;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

@Deprecated
/* loaded from: classes.dex */
public class ByteArrayPart extends HTTPPart {

    /* renamed from: a */
    private BufferedByteArrayOutputStream f9114a;

    @Override // com.mob.tools.network.HTTPPart
    public InputStream a() {
        BufferedByteArrayOutputStream bufferedByteArrayOutputStream = this.f9114a;
        if (bufferedByteArrayOutputStream == null) {
            return new ByteArrayInputStream(new byte[0]);
        }
        byte[] buffer = bufferedByteArrayOutputStream.getBuffer();
        return (buffer == null || this.f9114a.size() <= 0) ? new ByteArrayInputStream(new byte[0]) : new ByteArrayInputStream(buffer, 0, this.f9114a.size());
    }

    public ByteArrayPart append(byte[] bArr) {
        if (this.f9114a == null) {
            this.f9114a = new BufferedByteArrayOutputStream(bArr.length);
        }
        this.f9114a.write(bArr);
        this.f9114a.flush();
        return this;
    }

    @Override // com.mob.tools.network.HTTPPart
    public long b() {
        BufferedByteArrayOutputStream bufferedByteArrayOutputStream = this.f9114a;
        if (bufferedByteArrayOutputStream == null) {
            return 0L;
        }
        return bufferedByteArrayOutputStream.size();
    }

    public String toString() {
        byte[] buffer;
        BufferedByteArrayOutputStream bufferedByteArrayOutputStream = this.f9114a;
        if (bufferedByteArrayOutputStream == null || (buffer = bufferedByteArrayOutputStream.getBuffer()) == null) {
            return null;
        }
        return Data.byteToHex(buffer, 0, this.f9114a.size());
    }
}
