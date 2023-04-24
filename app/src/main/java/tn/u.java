package tn;

import bi.m0;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes2.dex */
public abstract class u {

    /* renamed from: d */
    public static final String[] f28410d = {"reserved", "CONNECT", "CONNACK", "PUBLISH", "PUBACK", "PUBREC", "PUBREL", "PUBCOMP", "SUBSCRIBE", "SUBACK", "UNSUBSCRIBE", "UNSUBACK", "PINGREQ", "PINGRESP", "DISCONNECT"};

    /* renamed from: a */
    public byte f28411a;

    /* renamed from: c */
    public boolean f28413c = false;

    /* renamed from: b */
    public int f28412b = 0;

    public u(byte b10) {
        this.f28411a = b10;
    }

    public static u g(InputStream inputStream) {
        byte readByte;
        try {
            a aVar = new a(inputStream);
            DataInputStream dataInputStream = new DataInputStream(aVar);
            int readUnsignedByte = dataInputStream.readUnsignedByte();
            byte b10 = (byte) (readUnsignedByte >> 4);
            byte b11 = (byte) (readUnsignedByte & 15);
            long j10 = 0;
            int i10 = 1;
            do {
                j10 += (readByte & Byte.MAX_VALUE) * i10;
                i10 *= 128;
            } while ((dataInputStream.readByte() & 128) != 0);
            long j11 = aVar.f28381b;
            long j12 = (j10 + j11) - j11;
            byte[] bArr = new byte[0];
            if (j12 > 0) {
                int i11 = (int) j12;
                bArr = new byte[i11];
                dataInputStream.readFully(bArr, 0, i11);
            }
            if (b10 == 1) {
                return new d(bArr);
            }
            if (b10 == 3) {
                return new o(b11, bArr);
            }
            if (b10 == 4) {
                return new k(bArr);
            }
            if (b10 == 7) {
                return new l(bArr);
            }
            if (b10 == 2) {
                return new c(bArr);
            }
            if (b10 == 12) {
                return new i(0);
            }
            if (b10 == 13) {
                return new j();
            }
            if (b10 == 8) {
                return new r(bArr);
            }
            if (b10 == 9) {
                return new q(bArr);
            }
            if (b10 == 10) {
                return new t(bArr);
            }
            if (b10 == 11) {
                return new s(bArr);
            }
            if (b10 == 6) {
                return new n(bArr);
            }
            if (b10 == 5) {
                return new m(bArr);
            }
            if (b10 == 14) {
                return new e(0);
            }
            throw m0.h(6);
        } catch (IOException e10) {
            throw new pn.n(e10);
        }
    }

    public static String h(DataInputStream dataInputStream) {
        try {
            byte[] bArr = new byte[dataInputStream.readUnsignedShort()];
            dataInputStream.readFully(bArr);
            return new String(bArr, "UTF-8");
        } catch (IOException e10) {
            throw new pn.n(e10);
        }
    }

    public static byte[] i(long j10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        do {
            byte b10 = (byte) (j10 % 128);
            j10 /= 128;
            int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i11 > 0) {
                b10 = (byte) (b10 | 128);
            }
            byteArrayOutputStream.write(b10);
            i10++;
            if (i11 <= 0) {
                break;
            }
        } while (i10 < 4);
        return byteArrayOutputStream.toByteArray();
    }

    public static void k(DataOutputStream dataOutputStream, String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            dataOutputStream.write((byte) ((bytes.length >>> 8) & 255));
            dataOutputStream.write((byte) ((bytes.length >>> 0) & 255));
            dataOutputStream.write(bytes);
        } catch (UnsupportedEncodingException e10) {
            throw new pn.n(e10);
        } catch (IOException e11) {
            throw new pn.n(e11);
        }
    }

    public final byte[] j() {
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

    public final byte[] l() {
        try {
            int n10 = ((this.f28411a & 15) << 4) ^ (n() & 15);
            byte[] p10 = p();
            int length = p10.length + o().length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeByte(n10);
            dataOutputStream.write(i(length));
            dataOutputStream.write(p10);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new pn.n(e10);
        }
    }

    public String m() {
        return new Integer(this.f28412b).toString();
    }

    public abstract byte n();

    public byte[] o() {
        return new byte[0];
    }

    public abstract byte[] p();

    public boolean q() {
        return !(this instanceof c);
    }

    public void r(int i10) {
        this.f28412b = i10;
    }

    public String toString() {
        return f28410d[this.f28411a];
    }
}
