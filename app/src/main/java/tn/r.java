package tn;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class r extends u {

    /* renamed from: e */
    public String[] f28406e;

    /* renamed from: f */
    public int[] f28407f;

    /* renamed from: g */
    public int f28408g;

    public r(byte[] bArr) {
        super((byte) 8);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f28412b = dataInputStream.readUnsignedShort();
        boolean z10 = false;
        this.f28408g = 0;
        this.f28406e = new String[10];
        this.f28407f = new int[10];
        while (!z10) {
            try {
                this.f28406e[this.f28408g] = u.h(dataInputStream);
                int[] iArr = this.f28407f;
                int i10 = this.f28408g;
                this.f28408g = i10 + 1;
                iArr[i10] = dataInputStream.readByte();
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
                String[] strArr = this.f28406e;
                if (i10 >= strArr.length) {
                    dataOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                u.k(dataOutputStream, strArr[i10]);
                dataOutputStream.writeByte(this.f28407f[i10]);
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
        for (int i10 = 0; i10 < this.f28408g; i10++) {
            if (i10 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append("\"");
            stringBuffer.append(this.f28406e[i10]);
            stringBuffer.append("\"");
        }
        stringBuffer.append("] qos:[");
        for (int i11 = 0; i11 < this.f28408g; i11++) {
            if (i11 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(this.f28407f[i11]);
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
