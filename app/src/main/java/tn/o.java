package tn;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class o extends h {

    /* renamed from: e */
    public pn.o f28402e;

    /* renamed from: f */
    public String f28403f;

    /* renamed from: g */
    public byte[] f28404g;

    public o(byte b10, byte[] bArr) {
        super((byte) 3);
        this.f28404g = null;
        p pVar = new p();
        this.f28402e = pVar;
        pVar.a(3 & (b10 >> 1));
        if ((b10 & 1) == 1) {
            pn.o oVar = this.f28402e;
            if (oVar.f24446a) {
                oVar.f24449d = true;
            } else {
                throw new IllegalStateException();
            }
        }
        if ((b10 & 8) == 8) {
            ((p) this.f28402e).f24450e = true;
        }
        a aVar = new a(new ByteArrayInputStream(bArr));
        DataInputStream dataInputStream = new DataInputStream(aVar);
        this.f28403f = u.h(dataInputStream);
        if (this.f28402e.f24448c > 0) {
            this.f28412b = dataInputStream.readUnsignedShort();
        }
        byte[] bArr2 = new byte[bArr.length - aVar.f28381b];
        dataInputStream.readFully(bArr2);
        dataInputStream.close();
        pn.o oVar2 = this.f28402e;
        if (oVar2.f24446a) {
            oVar2.f24447b = bArr2;
            return;
        }
        throw new IllegalStateException();
    }

    public o(String str, pn.o oVar) {
        super((byte) 3);
        this.f28404g = null;
        this.f28403f = str;
        this.f28402e = oVar;
    }

    @Override // tn.h, pn.p
    public final int a() {
        try {
            return o().length;
        } catch (pn.n unused) {
            return 0;
        }
    }

    @Override // tn.u
    public final byte n() {
        pn.o oVar = this.f28402e;
        byte b10 = (byte) (oVar.f24448c << 1);
        if (oVar.f24449d) {
            b10 = (byte) (b10 | 1);
        }
        if (oVar.f24450e || this.f28413c) {
            return (byte) (b10 | 8);
        }
        return b10;
    }

    @Override // tn.u
    public final byte[] o() {
        if (this.f28404g == null) {
            this.f28404g = this.f28402e.f24447b;
        }
        return this.f28404g;
    }

    @Override // tn.u
    public final byte[] p() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            u.k(dataOutputStream, this.f28403f);
            if (this.f28402e.f24448c > 0) {
                dataOutputStream.writeShort(this.f28412b);
            }
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new pn.n(e10);
        }
    }

    @Override // tn.u
    public final boolean q() {
        return true;
    }

    @Override // tn.u
    public final void r(int i10) {
        this.f28412b = i10;
        pn.o oVar = this.f28402e;
        if (oVar instanceof p) {
            ((p) oVar).f24451f = i10;
        }
    }

    @Override // tn.u
    public final String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        byte[] bArr = this.f28402e.f24447b;
        int min = Math.min(bArr.length, 20);
        for (int i10 = 0; i10 < min; i10++) {
            String hexString = Integer.toHexString(bArr[i10]);
            if (hexString.length() == 1) {
                StringBuffer stringBuffer2 = new StringBuffer("0");
                stringBuffer2.append(hexString);
                hexString = stringBuffer2.toString();
            }
            stringBuffer.append(hexString);
        }
        try {
            str = new String(bArr, 0, min, "UTF-8");
        } catch (Exception unused) {
            str = "?";
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append(super.toString());
        stringBuffer3.append(" qos:");
        stringBuffer3.append(this.f28402e.f24448c);
        if (this.f28402e.f24448c > 0) {
            stringBuffer3.append(" msgId:");
            stringBuffer3.append(this.f28412b);
        }
        stringBuffer3.append(" retained:");
        stringBuffer3.append(this.f28402e.f24449d);
        stringBuffer3.append(" dup:");
        stringBuffer3.append(this.f28413c);
        stringBuffer3.append(" topic:\"");
        stringBuffer3.append(this.f28403f);
        stringBuffer3.append("\"");
        stringBuffer3.append(" payload:[hex:");
        stringBuffer3.append(stringBuffer);
        stringBuffer3.append(" utf8:\"");
        stringBuffer3.append(str);
        stringBuffer3.append("\"");
        stringBuffer3.append(" length:");
        stringBuffer3.append(bArr.length);
        stringBuffer3.append("]");
        return stringBuffer3.toString();
    }
}
