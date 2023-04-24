package tn;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class t extends u {

    /* renamed from: e */
    public String[] f28409e;

    public t(byte[] bArr) {
        super((byte) 10);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f28412b = dataInputStream.readUnsignedShort();
        this.f28409e = new String[10];
        boolean z10 = false;
        while (!z10) {
            try {
                this.f28409e[0] = u.h(dataInputStream);
            } catch (Exception unused) {
                z10 = true;
            }
        }
        dataInputStream.close();
    }

    @Override // tn.u
    public final byte n() {
        return (byte) ((this.f28413c ? 8 : 0) | 2);
    }

    @Override // tn.u
    public final byte[] o() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            int i10 = 0;
            while (true) {
                String[] strArr = this.f28409e;
                if (i10 >= strArr.length) {
                    dataOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                u.k(dataOutputStream, strArr[i10]);
                i10++;
            }
        } catch (IOException e10) {
            throw new pn.n(e10);
        }
    }

    @Override // tn.u
    public final byte[] p() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeShort(this.f28412b);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new pn.n(e10);
        }
    }

    @Override // tn.u
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append(" names:[");
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
