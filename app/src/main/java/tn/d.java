package tn;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class d extends u {

    /* renamed from: e */
    public String f28384e;

    /* renamed from: f */
    public boolean f28385f;

    /* renamed from: g */
    public pn.o f28386g;

    /* renamed from: h */
    public String f28387h;

    /* renamed from: i */
    public char[] f28388i;

    /* renamed from: j */
    public int f28389j;

    /* renamed from: k */
    public String f28390k;

    /* renamed from: l */
    public int f28391l;

    public d(String str, int i10, int i11, String str2, char[] cArr) {
        super((byte) 1);
        this.f28384e = str;
        this.f28385f = true;
        this.f28389j = i11;
        this.f28387h = str2;
        this.f28388i = cArr;
        this.f28386g = null;
        this.f28390k = null;
        this.f28391l = i10;
    }

    public d(byte[] bArr) {
        super((byte) 1);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        u.h(dataInputStream);
        dataInputStream.readByte();
        dataInputStream.readByte();
        this.f28389j = dataInputStream.readUnsignedShort();
        this.f28384e = u.h(dataInputStream);
        dataInputStream.close();
    }

    @Override // tn.u
    public final String m() {
        return "Con";
    }

    @Override // tn.u
    public final byte n() {
        return (byte) 0;
    }

    @Override // tn.u
    public final byte[] o() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            u.k(dataOutputStream, this.f28384e);
            if (this.f28386g != null) {
                u.k(dataOutputStream, this.f28390k);
                dataOutputStream.writeShort(this.f28386g.f24447b.length);
                dataOutputStream.write(this.f28386g.f24447b);
            }
            String str = this.f28387h;
            if (str != null) {
                u.k(dataOutputStream, str);
                char[] cArr = this.f28388i;
                if (cArr != null) {
                    u.k(dataOutputStream, new String(cArr));
                }
            }
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new pn.n(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0024 A[Catch: IOException -> 0x0058, TryCatch #0 {IOException -> 0x0058, blocks: (B:31:0x0000, B:37:0x0017, B:38:0x001a, B:40:0x0024, B:41:0x0026, B:43:0x002a, B:45:0x0037, B:46:0x003a, B:48:0x003e, B:50:0x0045, B:51:0x0048), top: B:56:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002a A[Catch: IOException -> 0x0058, TryCatch #0 {IOException -> 0x0058, blocks: (B:31:0x0000, B:37:0x0017, B:38:0x001a, B:40:0x0024, B:41:0x0026, B:43:0x002a, B:45:0x0037, B:46:0x003a, B:48:0x003e, B:50:0x0045, B:51:0x0048), top: B:56:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x003e A[Catch: IOException -> 0x0058, TryCatch #0 {IOException -> 0x0058, blocks: (B:31:0x0000, B:37:0x0017, B:38:0x001a, B:40:0x0024, B:41:0x0026, B:43:0x002a, B:45:0x0037, B:46:0x003a, B:48:0x003e, B:50:0x0045, B:51:0x0048), top: B:56:0x0000 }] */
    @Override // tn.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] p() {
        /*
            r6 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L58
            r0.<init>()     // Catch: java.io.IOException -> L58
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch: java.io.IOException -> L58
            r1.<init>(r0)     // Catch: java.io.IOException -> L58
            int r2 = r6.f28391l     // Catch: java.io.IOException -> L58
            r3 = 3
            if (r2 != r3) goto L12
            java.lang.String r2 = "MQIsdp"
            goto L17
        L12:
            r4 = 4
            if (r2 != r4) goto L1a
            java.lang.String r2 = "MQTT"
        L17:
            tn.u.k(r1, r2)     // Catch: java.io.IOException -> L58
        L1a:
            int r2 = r6.f28391l     // Catch: java.io.IOException -> L58
            r1.write(r2)     // Catch: java.io.IOException -> L58
            r2 = 0
            boolean r4 = r6.f28385f     // Catch: java.io.IOException -> L58
            if (r4 == 0) goto L26
            r2 = 2
            byte r2 = (byte) r2     // Catch: java.io.IOException -> L58
        L26:
            pn.o r4 = r6.f28386g     // Catch: java.io.IOException -> L58
            if (r4 == 0) goto L3a
            r2 = r2 | 4
            byte r2 = (byte) r2     // Catch: java.io.IOException -> L58
            int r5 = r4.f24448c     // Catch: java.io.IOException -> L58
            int r3 = r5 << 3
            r2 = r2 | r3
            byte r2 = (byte) r2     // Catch: java.io.IOException -> L58
            boolean r3 = r4.f24449d     // Catch: java.io.IOException -> L58
            if (r3 == 0) goto L3a
            r2 = r2 | 32
            byte r2 = (byte) r2     // Catch: java.io.IOException -> L58
        L3a:
            java.lang.String r3 = r6.f28387h     // Catch: java.io.IOException -> L58
            if (r3 == 0) goto L48
            r2 = r2 | 128(0x80, float:1.8E-43)
            byte r2 = (byte) r2     // Catch: java.io.IOException -> L58
            char[] r3 = r6.f28388i     // Catch: java.io.IOException -> L58
            if (r3 == 0) goto L48
            r2 = r2 | 64
            byte r2 = (byte) r2     // Catch: java.io.IOException -> L58
        L48:
            r1.write(r2)     // Catch: java.io.IOException -> L58
            int r2 = r6.f28389j     // Catch: java.io.IOException -> L58
            r1.writeShort(r2)     // Catch: java.io.IOException -> L58
            r1.flush()     // Catch: java.io.IOException -> L58
            byte[] r0 = r0.toByteArray()     // Catch: java.io.IOException -> L58
            return r0
        L58:
            r0 = move-exception
            pn.n r1 = new pn.n
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tn.d.p():byte[]");
    }

    @Override // tn.u
    public final boolean q() {
        return false;
    }

    @Override // tn.u
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(super.toString()));
        stringBuffer.append(" clientId ");
        stringBuffer.append(this.f28384e);
        stringBuffer.append(" keepAliveInterval ");
        stringBuffer.append(this.f28389j);
        return stringBuffer.toString();
    }
}
